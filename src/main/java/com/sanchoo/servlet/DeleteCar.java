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
import java.util.UUID;

@WebServlet("/delete")
public class DeleteCar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        super.doGet(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String idStr = req.getParameter("id-car");
        if(idStr != null) {
            UUID id = UUID.fromString(idStr);
            MotorShow.getInstance().deleteCar(id);
        }

        List<Car> list = MotorShow.getInstance().getCarList();
        req.setAttribute("list", list);

        req.getRequestDispatcher("pages/table.jsp").forward(req, res);
    }
}
