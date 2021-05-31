package com.company;

import br.com.poolSchedule.dao.PoolScheduleDAO;
import br.com.poolSchedule.model.PoolSchedule;

import javax.swing.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        PoolSchedule poolSchedule = new PoolSchedule();



//        poolSchedule.setName("Thalles Rodrigues");
//        poolSchedule.setBlock(3);
//        poolSchedule.setAp(32);
//        poolSchedule.setCreated_at(new Date());
//
//        PoolScheduleDAO poolScheduleDAO = new PoolScheduleDAO();
//
////        poolScheduleDAO.save(poolSchedule);
//
//        PoolSchedule ps1 = new PoolSchedule();
//        poolSchedule.setName("Manoel Martins");
//        poolSchedule.setBlock(2);
//        poolSchedule.setAp(26);
//        poolSchedule.setCreated_at(new Date());
//        poolSchedule.setId(1);
//
////        poolScheduleDAO.update(poolSchedule);
//        poolScheduleDAO.deleteByID(2);
//        for (PoolSchedule ps: poolScheduleDAO.getPoolSchedule()) {
//            System.out.println("Piscina agenda: " + ps.getName());
//        }
    }
}
