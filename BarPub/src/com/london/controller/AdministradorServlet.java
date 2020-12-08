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

import com.london.dao.AdministradorDAO;
import com.london.dao.ClienteDAO;
import com.london.dao.EmpleadoDAO;
import com.london.entity.Administrador;
import com.london.entity.Cliente;
import com.london.entity.Empleado;

@WebServlet("/AdministradorServlet")
public class AdministradorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AdministradorDAO admDao;
	private EmpleadoDAO empDao;

	public AdministradorServlet() {
		super();
	}
	
	
	public void init() {
		admDao = new AdministradorDAO();
		empDao =  new EmpleadoDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		System.out.println(action);

		try {
			switch (action) {

			case "/login":
				login(request, response);
				break;

			default:
				list(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	/* LISTA DE CLIENTES */
	private void list(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Administrador> list = admDao.list();
		request.setAttribute("list", list);
		// redirige a la lista de clientes
		RequestDispatcher dispatcher = request.getRequestDispatcher("principal.jsp");
		dispatcher.forward(request, response);
	}

	
	private void login(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Administrador> list = admDao.list();

		RequestDispatcher dispatcher = null;
		
		String email = request.getParameter("email");
		String clave = request.getParameter("clave");
		boolean existe = false;
		
		for (Administrador a : list) {
			Empleado e = empDao.find(a.getIdEmpleado());
			if (e.getEmail().equals(email) && a.getClave().equals(clave)  ) {
				existe = true;
			}
		}
		
		if (existe) {
			dispatcher = request.getRequestDispatcher("indexAdm.jsp");
		} else {
			dispatcher = request.getRequestDispatcher("loginA.jsp");
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
