/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

   
    private String delimiter = "/";
    private HttpSession misession;
    // manejador de peticiones 
    //req resive el server
    //res envia info al server

    @RequestMapping(method = RequestMethod.GET)
    public void procesar(HttpServletRequest req, HttpServletResponse res) {
        String url = req.getRequestURI();
        String[] dataUrl = url.split(delimiter);
        misession = req.getSession(true);
        misession.setAttribute("user", "");
        try {
            if (dataUrl.length == 2) {

                res.sendRedirect("home");

            } else {
              res.sendRedirect("http://localhost:8080/WebApplication1/error");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
     }
    }
