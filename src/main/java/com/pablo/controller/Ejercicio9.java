package com.pablo.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Ejercicio9
 */
public class Ejercicio9 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio9() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		Integer numero = Integer.parseInt(request.getParameter("numero"));
		Integer resultado = 0;
		for(int i = 1; i <= numero; i++) {
			resultado += i;
		}
		
		out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<meta charset=\"UTF-8\">");
        out.print("<title>Ejercicio 9</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Suma acumulativa</h1>");
		out.print("La suma de todos los numeros desde 1 hasta " + numero + " es igual a " +  resultado);
        out.print("</body>");
        out.print("</html>");
		
        out.close();
	}

}
