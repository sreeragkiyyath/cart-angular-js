/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angularcart.info;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Students
 */
public class InfoServlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    int s = 1;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
       
            
            JSONArray array = new JSONArray();

            //   first obj
            JSONObject jSONObject = new JSONObject();
            JSONArray imgArr = new JSONArray();
            imgArr.add("images/tv-1.jpeg");
            imgArr.add("images/tv-2.jpeg");
            imgArr.add("images/tv-3.jpeg");
            imgArr.add("images/tv-4.jpeg");
            jSONObject.put("item", "TV");
            jSONObject.put("id", "1");
            jSONObject.put("brand", "SAMSUNG 55.88cm (22) Full HD LED TV  (UA22F5100AR, 2 x HDMI, 2 x USB)");
            jSONObject.put("price", "11,990");
            jSONObject.put("images", imgArr);
            array.add(jSONObject);
            /***********************************/
            //    second object
            jSONObject = new JSONObject();
            imgArr = new JSONArray();
            imgArr.add("images/iphone-1.jpg");
            imgArr.add("images/iphone-2.jpg");
            imgArr.add("images/iphone-3.jpg");
            imgArr.add("images/iphone-4.jpg");

            jSONObject.put("id", "2");
            jSONObject.put("item", "MOBILE");
            jSONObject.put("brand", "Apple iPhone 7 (Silver, 32GB)");
            jSONObject.put("price", "59,150");
            jSONObject.put("images", imgArr);
            array.add(jSONObject);

            //     third object

            jSONObject = new JSONObject();
            jSONObject.put("item", "LAPTOP");
            jSONObject.put("id", "3");
            jSONObject.put("brand", "TOSHIBA");
            jSONObject.put("price", "232222.1212231");
            array.add(jSONObject);

            //      fourth object     


            jSONObject = new JSONObject();
            jSONObject.put("item", "windows 10 os ");
            jSONObject.put("id", "4");
            jSONObject.put("brand", "Microsoft");
            jSONObject.put("price", "732222.1212231");
            array.add(jSONObject);

            //System.out.println(array);
            out.print(array);  // pass object......
        } finally {
            out.close();
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
