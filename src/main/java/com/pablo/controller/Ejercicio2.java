package com.pablo.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Ejercicio2
 */
public class Ejercicio2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		Integer numero1 = Integer.parseInt(request.getParameter("numero1"));
		Integer numero2 = Integer.parseInt(request.getParameter("numero2"));
		
		Integer resultado = numero1 + numero2;
		
		out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<meta charset=\"UTF-8\">");
        out.print("<title>Ejercicio 2</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Suma de dos numeros</h1>");
		out.print("<p>La suma de " + numero1 + " + " + numero2 + " es igual a: " + resultado + "</p>");
        out.print("</body>");
        out.print("</html>");
		
        out.close();
		
	}

}
