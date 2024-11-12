package com.reboundcinco.controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Formulario
 */
@WebServlet("/Formulario")
public class Formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formulario() {
        super();
    }

	/**
	 * @param request Una peticion GET simple para el nombre
	 * @param response El HTML resultante
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		String ruta = request.getContextPath() + request.getServletPath();

		String nombre = request.getParameter("nombre");
		
		PrintWriter salida = response.getWriter();
		salida.println("<form action='"+ruta+"' method='GET'>");
		salida.println("<input type=\"text\" name=\"nombre\" placeholder=\"Tu nombre va a aqui\">");
		salida.println("<button type=\"submit\">Enviar</button>");
		salida.println("</form>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
