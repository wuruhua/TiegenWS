package com.cmu.tiegen.controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmu.tiegen.server.AddBookMark;
import com.cmu.tiegen.util.InstanceFactory;
import com.cmu.tiegen.entity.BookMark;
import com.cmu.tiegen.entity.Service;
import com.cmu.tiegen.entity.User;


public class ViewBookMarkCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	 // use instance factory to get the only instance of servicebizimp class
		private AddBookMark servicebiz = InstanceFactory.getInstance()
				.createInstance(AddBookMark.class);
		
    public ViewBookMarkCtl() {
        super();
 
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // User user = (User) request.getAttribute("user");
		 ObjectInputStream in = new ObjectInputStream(request.getInputStream());
		 User user = null;
       try{
    	 user = (User)in.readObject();
    	 in.close();
		 ArrayList<Service> result = servicebiz.loadBookMark(user);
		 response.setContentType("application/octet-stream");
		 ObjectOutputStream out = new ObjectOutputStream(response.getOutputStream());
		 out.writeObject(result);
		 out.close();
		} catch (Exception e) {
			throw new IOException(e);
		}
       /*
    	 * we need to figure out how backend talk to front end and forward some 
    	 * message here to front end
    	*/
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
	}

}
