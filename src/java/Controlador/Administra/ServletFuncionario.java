/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Administra;

import Modelo.Administrador.Funcionario.Funcionario;
import Modelo.Administrador.Funcionario.GSFuncionario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
@WebServlet(name = "ServletFuncionario", urlPatterns = {"/ServletFuncionario"})
public class ServletFuncionario extends HttpServlet {

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
            
            if(request.getParameter("botonfunci")!=null){
            this.Ingresar(request, response);
        }
        
        else if(request.getParameter("botmodfun")!=null){
            this.Modificar(request, response);
        }
        
        else if(request.getParameter("botelifun")!=null){
            this.Eliminar(request, response);
        }
        
    }
        
    protected void Ingresar(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

        String cedula_fun,telefono_fun,nombre_fun,correo_fun,clave_fun;
        int rol_fun;
        
        cedula_fun=request.getParameter("cedula");
        telefono_fun=request.getParameter("telefono");
        nombre_fun=request.getParameter("nombre");
        correo_fun=request.getParameter("correo");
        rol_fun=Integer.parseInt(request.getParameter("rol"));
        
        GSFuncionario IGSL = new GSFuncionario(cedula_fun, telefono_fun, nombre_fun, correo_fun, rol_fun);
        Funcionario IDL = new Funcionario();
        
        IDL.Insertar(IGSL);
    
        request.getRequestDispatcher("Administrador/Funcionario/Ingresar_Funcionario.jsp").forward(request, response);
        
    }
    
    protected void Modificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String cedula_fun,telefono_fun,nombre_fun,correo_fun,clave_fun;
        int s,rol_fun;
        
        cedula_fun= request.getParameter("cedula");
        telefono_fun= request.getParameter("telefono");
        nombre_fun= request.getParameter("nombre");
        correo_fun= request.getParameter("correo");
        rol_fun= Integer.parseInt(request.getParameter("rol"));
        
        GSFuncionario lgs = new GSFuncionario(cedula_fun, telefono_fun, nombre_fun, correo_fun, rol_fun);
        Funcionario al = new Funcionario();
        s = al.Actualizar(lgs);
        
        if (s>0) {
            JOptionPane.showMessageDialog(null, "Datos Actualizados");
        }
        else{
            JOptionPane.showMessageDialog(null, "Datos no fueron Actualizados");
        }
        request.getRequestDispatcher("Administrador/Funcionario/Modificar_Eliminar_Funcionario.jsp").forward(request, response);
    }
    
    protected void Eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String cedula_fun;
        int x;
        
        cedula_fun= request.getParameter("cedula");
        
        GSFuncionario igs = new GSFuncionario(cedula_fun);
        Funcionario el = new Funcionario();
        x = el.Eliminar(igs);
        
        if (x>0) {
            JOptionPane.showMessageDialog(null, "Datos Borrados");
        }
        else{
            JOptionPane.showMessageDialog(null, "Datos no fueron Borrados");
        }
        request.getRequestDispatcher("Administrador/Funcionario/Modificar_Eliminar_Funcionario.jsp").forward(request, response);
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
