package com.katkam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

// import org.springframework.web.servlet.mvc.AbstractController;
// import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nitin Reddy
 */
@Controller
public class WorkController {
    @RequestMapping("/work/list.do")
    public ModelAndView list() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dijon","root", "");
        
        Statement st = conn.createStatement();
        st.executeQuery("SELECT * FROM work");
        ResultSet rs = st.getResultSet();
        
        ArrayList<String> lsStr = new ArrayList<String>();
        while (rs.next()) {
            String sDesc = rs.getString("shortdesc");
            lsStr.add(sDesc);
        }
        
        conn.close();
        
        ModelAndView m = new ModelAndView("list");
        m.addObject("lst", lsStr);
        return m;
    }
    @RequestMapping("/work/edit.do")
    public ModelAndView edit() {
        return null;
    }
}
