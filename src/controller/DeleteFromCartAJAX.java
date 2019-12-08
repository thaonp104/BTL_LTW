/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.CakeInfor;

/**
 *
 * @author Duck
 */

@WebServlet("/delete_from_cart")
public class DeleteFromCartAJAX extends HttpServlet {
   
    public DeleteFromCartAJAX(){
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ID_Cake = request.getParameter("idCake");
        int id = Integer.parseInt(ID_Cake);
        
        HttpSession session = request.getSession();
        ArrayList<CakeInfor> cart = (ArrayList<CakeInfor>) session.getAttribute("cart");
        for(int i = 0; i < cart.size(); i++){
            if(cart.get(i).getIDCake() == id){
                cart.remove(i);
            }
            response.getWriter().write("Delete success !");
        }
        
        response.getWriter().write("Can't find this cake in cart !");
    }
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        doGet(request, response);
    }
}
