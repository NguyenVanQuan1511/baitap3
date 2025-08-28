package vn.edu.hcmuaf.fit.demo2;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/emailList")
public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Lấy dữ liệu từ form, nếu null thì set chuỗi rỗng để tránh lỗi
        String firstName = request.getParameter("firstName");
        if (firstName == null) firstName = "";

        String lastName = request.getParameter("lastName");
        if (lastName == null) lastName = "";

        String email = request.getParameter("email");
        if (email == null) email = "";

        String dob = request.getParameter("dob");
        if (dob == null) dob = "";

        String hearAbout = request.getParameter("hearAbout");
        if (hearAbout == null) hearAbout = "Not specified";

        String receiveNews = request.getParameter("receiveNews");
        if (receiveNews == null) receiveNews = "No";

        String receiveEmail = request.getParameter("receiveEmail");
        if (receiveEmail == null) receiveEmail = "No";

        String contactMethod = request.getParameter("contactMethod");
        if (contactMethod == null) contactMethod = "Not specified";

        // Đưa dữ liệu sang JSP
        request.setAttribute("firstName", firstName);
        request.setAttribute("lastName", lastName);
        request.setAttribute("email", email);
        request.setAttribute("dob", dob);
        request.setAttribute("hearAbout", hearAbout);
        request.setAttribute("receiveNews", receiveNews);
        request.setAttribute("receiveEmail", receiveEmail);
        request.setAttribute("contactMethod", contactMethod);

        // Forward sang thanks.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("thanks.jsp");
        dispatcher.forward(request, response);
    }
}
