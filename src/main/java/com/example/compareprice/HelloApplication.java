package com.example.compareprice;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class HelloApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                int[] price = new int[15];
                for (int i = 0; i < 15; i++) {
                    price[i] = (int) (Math.random() * 90000 + 10000);
                }
            }
        };

        timer.schedule(task,0,10000L);

        ComputerEquipment companyAcpu = new ComputerEquipment(price[0], "CPU", "A회사");
        ComputerEquipment companyAgpu = new ComputerEquipment(price[1], "GPU", "A회사");
        ComputerEquipment companyAssd = new ComputerEquipment(price[2], "SSD", "A회사");
        ComputerEquipment companyAmonitor = new ComputerEquipment(price[3], "MONITOR", "A회사");
        ComputerEquipment companyAcooler = new ComputerEquipment(price[4], "COOLER", "A회사");

        ComputerEquipment companyBcpu = new ComputerEquipment(price[5], "CPU", "B회사");
        ComputerEquipment companyBgpu = new ComputerEquipment(price[6], "GPU", "B회사");
        ComputerEquipment companyBssd = new ComputerEquipment(price[7], "SSD", "B회사");
        ComputerEquipment companyBmonitor = new ComputerEquipment(price[8], "MONITOR", "B회사");
        ComputerEquipment companyBcooler = new ComputerEquipment(price[9], "COOLER", "B회사");

        ComputerEquipment companyCcpu = new ComputerEquipment(price[10], "CPU", "C회사");
        ComputerEquipment companyCgpu = new ComputerEquipment(price[11], "GPU", "C회사");
        ComputerEquipment companyCssd = new ComputerEquipment(price[12], "SSD", "C회사");
        ComputerEquipment companyCmonitor = new ComputerEquipment(price[13], "MONITOR", "C회사");
        ComputerEquipment companyCcooler = new ComputerEquipment(price[14], "COOLER", "C회사");

        while (true) {
            System.out.println("<------------ 컴퓨터 부품 가격 비교하기 -------------->");
            System.out.println("1. cpu  |   2. gpu  |  3.  ssd  |  4.  monitor  |  5.  cooler ");
            System.out.println("--------------------------------------------------");
            System.out.print("선택하기 :");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("CPU 선택");
                    System.out.println("회사 : " + companyAcpu.getCompanyName() + "가격 : " + companyAcpu.getPrice());
                    System.out.println("회사 : " + companyBcpu.getCompanyName() + "가격 : " + companyBcpu.getPrice());
                    System.out.println("회사 : " + companyCcpu.getCompanyName() + "가격 : " + companyCcpu.getPrice());
                    System.out.println("최저가 : " + Math.min(companyAcpu.getPrice(), Math.min(companyBcpu.getPrice(), companyCcpu.getPrice())));
                    break;
                case 2:
                    System.out.println("GPU 선택");
                    System.out.println("회사 : " + companyAgpu.getCompanyName() + "가격 : " + companyAgpu.getPrice());
                    System.out.println("회사 : " + companyBgpu.getCompanyName() + "가격 : " + companyBgpu.getPrice());
                    System.out.println("회사 : " + companyCgpu.getCompanyName() + "가격 : " + companyCgpu.getPrice());
                    System.out.println("최저가 : " + Math.min(companyAgpu.getPrice(), Math.min(companyBgpu.getPrice(), companyCgpu.getPrice())));
                    break;
                case 3:
                    System.out.println("SSD 선택");
                    System.out.println("회사 : " + companyAssd.getCompanyName() + "가격 : " + companyAssd.getPrice());
                    System.out.println("회사 : " + companyBssd.getCompanyName() + "가격 : " + companyBssd.getPrice());
                    System.out.println("회사 : " + companyCssd.getCompanyName() + "가격 : " + companyCssd.getPrice());
                    System.out.println("최저가 : " + Math.min(companyAssd.getPrice(), Math.min(companyBssd.getPrice(), companyCssd.getPrice())));
                    break;
                case 4:
                    System.out.println("MONITOR 선택");
                    System.out.println("회사 : " + companyAmonitor.getCompanyName() + "가격 : " + companyAmonitor.getPrice());
                    System.out.println("회사 : " + companyBmonitor.getCompanyName() + "가격 : " + companyBmonitor.getPrice());
                    System.out.println("회사 : " + companyCmonitor.getCompanyName() + "가격 : " + companyCmonitor.getPrice());
                    System.out.println("최저가 : " + Math.min(companyAmonitor.getPrice(), Math.min(companyBmonitor.getPrice(), companyCmonitor.getPrice())));
                    break;
                case 5:
                    System.out.println("COOLER 선택");
                    System.out.println("회사 : " + companyAcooler.getCompanyName() + "가격 : " + companyAcooler.getPrice());
                    System.out.println("회사 : " + companyBcooler.getCompanyName() + "가격 : " + companyBcooler.getPrice());
                    System.out.println("회사 : " + companyCcooler.getCompanyName() + "가격 : " + companyCcooler.getPrice());
                    System.out.println("최저가 : " + Math.min(companyAcooler.getPrice(), Math.min(companyBcooler.getPrice(), companyCcooler.getPrice())));
                    break;
            }
        }
    }
    }