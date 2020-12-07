package com.london.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.london.dao.ClienteDAO;
import com.london.entity.Cliente;

@WebServlet("/ClienteServlet")
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ClienteDAO clienteDao;

	public ClienteServlet() {
		super();
	}

	public void init() {
		clienteDao = new ClienteDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		System.out.println(action);

		try {
			switch (action) {

			case "/insert":
				// METODO QUE INSERTA LAS VARIABLES DEL FORMULARIO A LA BD
				insert(request, response);
				break;

			case "/login":
				login2(request, response);
				break;

			default:
				list(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	// METODO QUE INSERTA LAS VARIABLES DEL FORMULARIO A LA BD
	private void insert(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ParseException, ServletException {

		String direccion = request.getParameter("direccion");
		String telefono = request.getParameter("telefono");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String cedula = request.getParameter("cedula");
		String clave = request.getParameter("clave");
		String email = request.getParameter("email");

		Cliente cliente = new Cliente(direccion, telefono, nombre, apellido, cedula, clave, email);
		clienteDao.insert(cliente);

		// redirige al index
		RequestDispatcher dispatcher = request.getRequestDispatcher("indexC.jsp");
		dispatcher.forward(request, response);
	}

	/* LISTA DE CLIENTES */
	private void list(HttpServletRequest request, HttpServletResponse response)	throws SQLException, IOException, ServletException {
		
		List<Cliente> list = clienteDao.list();
		request.setAttribute("list", list);
		// redirige a la lista de clientes
		RequestDispatcher dispatcher = request.getRequestDispatcher("principal.jsp");
		dispatcher.forward(request, response);
	}

	private void login2(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		
		List<Cliente> listCliente = clienteDao.list();
		
		String email = request.getParameter("email");
		String clave = request.getParameter("clave");
		boolean existe = false;
		
		for (Cliente iterator : listCliente) {
			if (iterator.getEmail() != null) {
				if (iterator.getEmail().equals(email) && iterator.getClave().equals(clave)) {
					existe = true;
				}
			} else {
				System.out.print("Email o clave nulas");
			}
		}

		RequestDispatcher dispatcher = null;
		
		if (existe) {
			dispatcher = request.getRequestDispatcher("indexC.jsp");
		} else {
			dispatcher = request.getRequestDispatcher("loginC.jsp");
			String mensaje = "No está registrado";
			request.setAttribute("mensaje", mensaje);
		}
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
