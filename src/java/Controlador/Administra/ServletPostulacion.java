/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Administra;

import Modelo.Administrador.Postulacion.GSPostulacionAdmin;
import Modelo.Administrador.Postulacion.Postulacion;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author SENA
 */
@WebServlet(name = "ServletPostulacion", urlPatterns = {"/ServletPostulacion"})
public class ServletPostulacion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        if (request.getParameter("ingpost")!=null) {
            this.IngresarPostulacion(request, response);
        }
    }

      protected void IngresarPostulacion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
       
       String tel,dir,fij,ced;
        int coda;
        tel=request.getParameter("telefono");
        dir=request.getParameter("direccion");
        fij=request.getParameter("fijo");
        ced=request.getParameter("cedula");
        coda=Integer.parseInt(request.getParameter("coda"));
         Part foto=request.getPart("IMG");
          String nomfoto=foto.getSubmittedFileName();
          String nombre=ced+"_"+nomfoto;
          
          String Url="C:\\Users\\crist_000\\Documents\\GitHub\\PettApp\\PettApp\\web\\Administrador\\CertificadosLaborales\\"+nombre;
          
          String Url2="CertificadosLaborales/"+nombre;
          
          InputStream file=foto.getInputStream();
          File f=new File(Url);
          FileOutputStream sal=new FileOutputStream(f);
          int num=file.read();
          while(num!= -1){
              sal.write(num);
              num=file.read();
          }
        GSPostulacionAdmin con=new GSPostulacionAdmin(tel,dir,fij,Url2,ced,coda);
        Postulacion in=new Postulacion();
        in.Ingresar_postulacion(con);
        request.getRequestDispatcher("Administrador/Postulacion/IngresarPostulacionAdmin.jsp").forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
