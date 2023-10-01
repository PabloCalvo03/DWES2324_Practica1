package com.pablo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ejercicio1
 */
public class Ejercicio1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Ejercicio1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		

		out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<meta charset=\"UTF-8\">");
        out.print("<title>Ejercicio 1</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Saludo personalizado</h1>");
		out.print("<p>¡Hola " + nombre + " " + apellido + "!</p>");
        out.print("</body>");
        out.print("</html>");
        
        out.close();

	}

}
