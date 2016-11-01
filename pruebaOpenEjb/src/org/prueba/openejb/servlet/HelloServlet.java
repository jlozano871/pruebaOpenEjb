package org.prueba.openejb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.prueba.openejb.ejb.SimpleStatelessEJBLocal;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@EJB
	private SimpleStatelessEJBLocal simpleEJB;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pr = response.getWriter();
		pr.append("HOLA SERVLET <br>");
		pr.append(simpleEJB.getMensaje() + "<br>");

	}


//	protected SimpleStateless getSimpleEJB(){
//		try {
//
//			final Properties p = new Properties();
//			p.put(Context.INITIAL_CONTEXT_FACTORY, "org.apache.openejb.core.LocalInitialContextFactory");
//			InitialContext ctx = new InitialContext(p);
//			Object object = ctx.lookup("java:module/SimpleStateless");   
//			simpleEJB = (SimpleStateless) object;
//			return simpleEJB;
//
//		} catch (NamingException e) {
//			e.printStackTrace();
//		}  
//		return null;  
//	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}



	//	/**
	//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	//	 */
	//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//		// TODO Auto-generated method stub
	//		response.getWriter().append("Served at: ").append(request.getContextPath());
	//	}
	//
	//	/**
	//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	//	 */
	//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//		// TODO Auto-generated method stub
	//		doGet(request, response);
	//	}

}
