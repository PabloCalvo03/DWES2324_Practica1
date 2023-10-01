package com.pablo.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Ejercicio4
 */
public class Ejercicio4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		Float kilometros = Float.parseFloat(request.getParameter("kilometros"));
		Float velocidad = Float.parseFloat(request.getParameter("velocidad"));
		
		Float tiempo = kilometros / velocidad;
		
		out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<meta charset=\"UTF-8\">");
        out.print("<title>Ejercicio 4</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Cálculo del tiempo de viaje</h1>");
		out.print("<p>El viaje sera de " + tiempo + (tiempo == 1.0 ? " hora</p>" : " horas</p>"));
        out.print("</body>");
        out.print("</html>");
		
        out.close();
	}

}
