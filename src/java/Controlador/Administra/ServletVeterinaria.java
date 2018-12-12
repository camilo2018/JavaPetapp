/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Administra;

import Modelo.Administrador.Funcionario.Funcionario;
import Modelo.Administrador.Funcionario.GSFuncionario;
import Modelo.Administrador.Veterinaria.GSVeterinaria;
import Modelo.Administrador.Veterinaria.Veterinaria;
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
@WebServlet(name = "ServletVeterinaria", urlPatterns = {"/ServletVeterinaria"})
public class ServletVeterinaria extends HttpServlet {

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
        
        
        if(request.getParameter("botonvete")!=null){
            this.Ingresar(request, response);
        }
        
        else if(request.getParameter("botmodvet")!=null){
            this.Modificar(request, response);
        }
        
        else if(request.getParameter("botelivet")!=null){
            this.Eliminar(request, response);
        }
        
    }
        
    protected void Ingresar(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

        String nit_vet,telefono_vet,nombre_vet,direccion_vet,clave_vet;
        int rol_vet;
        
        nit_vet=request.getParameter("nit");
        telefono_vet=request.getParameter("telefono");
        nombre_vet=request.getParameter("nombre");
        direccion_vet=request.getParameter("direccion");
        rol_vet=Integer.parseInt(request.getParameter("rol"));
        
        GSVeterinaria IGSL = new GSVeterinaria(nit_vet, telefono_vet, nombre_vet, direccion_vet, rol_vet);
        Veterinaria IDL = new Veterinaria();
        
        IDL.Insertar(IGSL);
    
        request.getRequestDispatcher("Administrador/Veterinaria/Ingresar_Veterinaria.jsp").forward(request, response);
        
    }
    
    protected void Modificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String nit_vet,telefono_vet,nombre_vet,direccion_vet;
        int s;
        
        nit_vet=request.getParameter("nit");
        telefono_vet=request.getParameter("telefono");
        nombre_vet=request.getParameter("nombre");
        direccion_vet=request.getParameter("direccion");
        
        GSVeterinaria lgs = new GSVeterinaria(nit_vet, telefono_vet, nombre_vet, direccion_vet);
        Veterinaria al = new Veterinaria();
        s = al.Actualizar(lgs);
        
        if (s>0) {
            JOptionPane.showMessageDialog(null, "Datos Actualizados");
        }
        else{
            JOptionPane.showMessageDialog(null, "Datos no fueron Actualizados");
        }
        request.getRequestDispatcher("Administrador/Veterinaria/Modificar_Eliminar_Veterinaria.jsp").forward(request, response);
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
