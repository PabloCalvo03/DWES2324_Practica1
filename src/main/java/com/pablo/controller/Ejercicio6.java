package com.pablo.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Ejercicio6
 */
public class Ejercicio6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio6() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();

		Integer numero = Integer.parseInt(request.getParameter("numero"));
		String diaSemana = null;
		
		switch(numero) {
			case 1 -> diaSemana = "Lunes";
			case 2 -> diaSemana = "Martes";
			case 3 -> diaSemana = "Miercoles";
			case 4 -> diaSemana = "Jueves";
			case 5 -> diaSemana = "Viernes";
			case 6 -> diaSemana = "Sabado";
			case 7 -> diaSemana = "Domingo";
		}
		
		out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<meta charset=\"UTF-8\">");
        out.print("<title>Ejercicio 6</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Día de la semana</h1>");
		out.print(diaSemana != null ? ("<p>El dia que le corresponde al numero " + numero + " es el: " + diaSemana + "</p>") : "<p>Has introducido un numero no valido</p>");
        out.print("</body>");
        out.print("</html>");
		
        out.close();
		
		
	}

	

}
