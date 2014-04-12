package com.ciandt.hackathon.resources;

import com.ciandt.hackathon.entity.Table;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by rjfonseca on 12/04/14.
 */
@SuppressWarnings("serial")
@Singleton
public class TableServlet extends HttpServlet {

    @Inject
    private Logger logger;

    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        logger.info("Table page");

        //read user context
        UserService userService = UserServiceFactory.getUserService();
        User user = userService.getCurrentUser();
        Table table = (Table) req.getSession().getAttribute("table");
        if (table != null) {
            req.setAttribute("userAuthenticated", "true");
            req.setAttribute("nickname", table.getNumber().toString());
            req.getRequestDispatcher("/table.jsp").forward(req, resp);

        } else {
            req.setAttribute("userAuthenticated", "false");
            resp.sendRedirect("/signtable");
        }
    }
}
