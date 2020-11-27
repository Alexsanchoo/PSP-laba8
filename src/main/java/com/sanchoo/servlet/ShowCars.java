package com.sanchoo.servlet;

import com.sanchoo.entity.Car;
import com.sanchoo.entity.MotorShow;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/show")
public class ShowCars extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<Car> list = MotorShow.getInstance().getCarList();
        req.setAttribute("list", list);

        req.getRequestDispatcher("pages/table.jsp").forward(req, res);
    }
}
