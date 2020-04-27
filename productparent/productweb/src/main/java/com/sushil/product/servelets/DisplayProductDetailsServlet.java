package com.sushil.product.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.sushil.product.bo.ProductBO;
import com.sushil.product.dto.Product;

/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());

		ProductBO bo = (ProductBO) context.getBean("productbo");

		Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));

		PrintWriter out = response.getWriter();

		// out.append("Served at: ").append(request.getContextPath());
		out.print("Product Details \n");
		out.print("Product ID: " + product.getId() +"\r\n");
		out.print("Product Name: " + product.getName()+"\r\n");
		out.print("Product Desc: " + product.getDescription()+"\r\n");
		out.print("Product Price: " + product.getPrice()+"\n");
	}

}
