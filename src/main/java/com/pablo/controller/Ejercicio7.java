package com.pablo.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Ejercicio7
 */
public class Ejercicio7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio7() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		Integer edad = Integer.parseInt(request.getParameter("edad"));
		String categoria = null;
		
		if(edad < 12) {
			categoria = "Infante";
		}
		if(edad >= 12 && edad <= 17) {
			categoria = "Adolescente";
		}
		if(edad >= 18 && edad <= 60) {
			categoria = "Adulto";
		}
		if(edad > 60) {
			categoria = "Anciano";
		}
		
		out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<meta charset=\"UTF-8\">");
        out.print("<title>Ejercicio 7</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Categorización de edades</h1>");
		out.print("<p> Tu categoria es: " + categoria + "</p>");
        out.print("</body>");
        out.print("</html>");
		
        out.close();
	}

}
