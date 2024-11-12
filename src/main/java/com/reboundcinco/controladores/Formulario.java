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
		// RIP LINEA: TRAE LA RUTA PROPIA FORMATEADA SIN IMPORTAR QUE
		// String ruta = request.getContextPath() + request.getServletPath();
		
		PrintWriter salida = response.getWriter();
		salida.println("<head>");
		salida.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\">");
		salida.println("</head>");
		salida.println("<form class='d-flex p-5 flex-row w-50 gap-3' action='/rebound_m5s1_erick_rivera/RespuestaFormulario' method='GET'>");
		salida.println("<input class='form-control col-8' type=\"text\" name=\"nombre\" placeholder=\"Tu nombre va a aqui\">");
		salida.println("<button class='btn btn-primary col-4' type=\"submit\">Enviar</button>");
		salida.println("</form>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
