package com.sanchoo.servlet;

import com.sanchoo.entity.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/add")
public class AddingCar extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        Fuel fuel = Fuel.valueOf(req.getParameter("fuel"));
        int volume = Integer.valueOf(req.getParameter("engine-volume"));
        Engine engine = Engine.of(fuel, volume);

        TransmissionType transmType = TransmissionType.valueOf(req.getParameter("transmission"));
        int stageNumber = Integer.valueOf(req.getParameter("trans-stages"));
        Transmission transmission = Transmission.of(transmType, stageNumber);

        String brand = req.getParameter("brand");
        String model = req.getParameter("model");
        BodyCar bodyCar = BodyCar.valueOf(req.getParameter("body-type"));
        Car car = Car.of(brand, model, bodyCar);
        car.setEngine(engine);
        car.setTransmission(transmission);

        MotorShow.getInstance().addCar(car);
        List<Car> list = MotorShow.getInstance().getCarList();
        req.setAttribute("list", list);

        req.getRequestDispatcher("pages/table.jsp").forward(req, res);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        super.doGet(req, res);
    }
}
