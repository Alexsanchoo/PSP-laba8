package com.sanchoo.servlet;

import com.sanchoo.entity.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@WebServlet("/edit")
public class EditCar extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        List<Car> list = MotorShow.getInstance().getCarList();
        req.setAttribute("list", list);

        req.getRequestDispatcher("pages/edit.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String idStr = req.getParameter("id-car");
        if(idStr != null) {
            UUID id = UUID.fromString(idStr);
            Car car = MotorShow.getInstance().getCar(id);

            Fuel fuel = Fuel.valueOf(req.getParameter("fuel"));
            int volume = Integer.valueOf(req.getParameter("engine-volume"));
            Engine engine = Engine.of(fuel, volume);

            TransmissionType transmType = TransmissionType.valueOf(req.getParameter("transmission"));
            int stageNumber = Integer.valueOf(req.getParameter("trans-stages"));
            Transmission transmission = Transmission.of(transmType, stageNumber);

            int price = (int) (Double.valueOf(req.getParameter("price")) * 100.0);

            car.setTransmission(transmission);
            car.setEngine(engine);
            car.setPrice(price);
        }

        List<Car> list = MotorShow.getInstance().getCarList();
        req.setAttribute("list", list);

        req.getRequestDispatcher("pages/table.jsp").forward(req, res);
    }
}
