/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.controller;

import cl.duoc.entities.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Juan Colonia
 */
@WebServlet(name = "UsuarioServlet", urlPatterns = {"/UsuarioServlet"})
public class UsuarioServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
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
        String username  = request.getParameter("txtUsuario");
        String pass = request.getParameter("txtPassword");
        String msg = null;
        if(username == null || username.isEmpty()){            
            msg = "Ingrese Username <br>";
        }
        if(pass == null || pass.isEmpty()){
            msg += "Ingrese Password";
        }        
        ServletContext context = request.getServletContext();
        RequestDispatcher ri;
        if(msg != null){
            request.setAttribute("msg", msg);
            ri = context.getRequestDispatcher("/login.jsp");
        }else{
            Usuario user = new Usuario();
            user.setRut(username);
            user.setContrasenia(pass);
            //user.setUltimoIngreso(Calendar.getInstance().getTime());
            
            HttpSession sesion = request.getSession();
            sesion.setAttribute("user", user);            
            ri = context.getRequestDispatcher("/ServicioServlet");
            
            /*
            int contadorVisitas = 0;
            if(getServletContext().getAttribute("visitantes") == null){
                getServletContext().setAttribute("visitantes", 0);
            }
            contadorVisitas = (int)getServletContext().getAttribute("visitantes");
            contadorVisitas += 1;
            getServletContext().setAttribute("visitantes", contadorVisitas);
            
            int usuariosConectados = 0;
            if(getServletContext().getAttribute("conectados") == null){
                getServletContext().setAttribute("conectados", usuariosConectados);
            }
            usuariosConectados = (int)getServletContext().getAttribute("conectados");
            usuariosConectados += 1;
            getServletContext().setAttribute("conectados", usuariosConectados);
            */
            
        }
        ri.forward(request, response);
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
