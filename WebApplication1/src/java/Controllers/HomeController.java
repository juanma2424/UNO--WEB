/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value = "/home")
    public ModelAndView home(){
      return new ModelAndView();
    }
    
   @RequestMapping(value = "/home/*") 
   private void error (HttpServletResponse res){
    try {
        res.sendRedirect("http://localhost:8080/WebApplication1/error");
    } catch (IOException ex) {
        System.out.println(ex);
    }
    } 
}
 