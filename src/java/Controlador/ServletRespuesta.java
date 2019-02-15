/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Preguntas.GSRespuestaFin;
import Modelo.Preguntas.Respuestas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author Edwin Abril
 */
@WebServlet(name = "ServletRespuesta", urlPatterns = {"/ServletRespuesta"})
public class ServletRespuesta extends HttpServlet {
    private String c;
    private int r;
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
        
        if (request.getParameter("readop")!=null) {
            this.Enviar(request, response);
        }
       
       
    }

  protected void Enviar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
       
        String ced;
        ced=request.getParameter("cedu");
        GSRespuestaFin in = new GSRespuestaFin(ced);
        JOptionPane.showMessageDialog(null, in);
        Respuestas log = new Respuestas();
        ArrayList<GSRespuestaFin> arreglo = new ArrayList<>();
        
        arreglo = log.envio(in);
        
        
        if(arreglo.size()>0){
            
            for (int i = 0; i < arreglo.size() ; i++) {
                in=arreglo.get(i);
                c=in.getCed();
                r=in.getRe1();
                
            
            }
            
        if((c.equals(ced))){
            JOptionPane.showMessageDialog(null, "Formulario");
            HttpSession htt=request.getSession();
            int cod=Integer.parseInt(request.getParameter("code"));
            int res=r;
            String ce=c;
            Integer dato= new Integer(res);
            htt.setAttribute("res1", dato);
            String dato2= new String(ce);
            htt.setAttribute("ced1", dato2);
            Integer dato3= new Integer(cod);
            htt.setAttribute("ani1", dato3);
            response.sendRedirect("Ciudadano/Postulacion/IngresarPostulacion.jsp");    
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Preguntas");
            HttpSession htt=request.getSession();
            int cod=Integer.parseInt(request.getParameter("code"));
            String dato2= new String(ced);
            htt.setAttribute("ced1", dato2);
            Integer dato3= new Integer(cod);
            htt.setAttribute("ani1", dato3);
            response.sendRedirect("Ciudadano/Preguntas/Pagina1.jsp");
        }
        }
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
