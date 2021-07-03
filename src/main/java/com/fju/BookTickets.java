package com.fju;

import java.util.Scanner;

public class BookTickets  {



        Seat[] seat = new Seat[3];


        void SeatInformation () {
            seat[0] = new Seat();
            seat[0].color = "紅";
            seat[0].seatnumber = 20;
            seat[0].price = 500;

            seat[1] = new Seat();
            seat[1].color = "橘";
            seat[1].seatnumber = 40;
            seat[1].price = 400;

            seat[2] = new Seat();
            seat[2].color = "藍";
            seat[2].seatnumber = 30;
            seat[2].price = 300;


        }

        void interFace ()// 訂票介面
        {

            System.out.println("\t\t\t 訂 票 系 統");

            System.out.println("------------------------------------------------------------------------------");
            System.out.println("位置區位\t\t剩餘位置數\t\t價錢");
            System.out.println(seat[0].color + "\t\t" + seat[0].seatnumber + "\t\t" + seat[0].price);
            System.out.println(seat[1].color + "\t\t" + seat[1].seatnumber + "\t\t" + seat[1].price);
            System.out.println(seat[2].color + "\t\t" + seat[2].seatnumber + "\t\t" + seat[2].price);

        }
        void login(){
            System.out.println("已經有帳號了嗎?請輸入1登入!");
            System.out.println("還沒有沒有帳號嗎?請輸入2註冊!");
            Scanner scanner = new Scanner(System.in);
            int scan= scanner.nextInt();
            switch(scan){
                case 1:
                    if (LoginReg.login()==0)
                        login();
                    break;
                case 2:
                    LoginReg.reg();
                    login();
                    break;
                default:
                    System.out.println("輸入錯誤!請重新開始!");
                    login();



            }

        }
        void booking() {
            boolean b = true;
            int n = 1;
            int sum = 0;
            int A = 0;
            int B[] = {-1, -1, -1};
            do {
                System.out.println("歡迎訂票!");
                System.out.println("請輸入你要訂的區域(紅/橘/藍)");
                Scanner scanner = new Scanner(System.in);
                String s = scanner.next();
                for (int i = 0; i < seat.length; i++) {
                    if (seat[i].color.equals(s)) {
                        B[A] = i;
                        sum += seat[B[A]].price;
                        break;
                    }
                }
                if (B[A] == -1) {
                    System.out.println("輸入錯誤!");
                } else {
                    System.out.println("訂票成功!");
                    System.out.println("位置區域\t\t剩餘位置\t\t票價");
                    System.out.println(seat[B[A]].color + "\t\t\t" + (seat[B[A]].seatnumber
                            - n) + "\t\t\t" + seat[B[A]].price);
                    A++;
                    n++;
                }
                System.out.println("你是否要繼續訂票?(Y/N)");
                String yn = scanner.next();
                if (yn.equals("N")) {
                    b = false;
                }
                if (A >= seat.length) {
                    System.out.println("已經超過單次可以訂的票數(3張)");
                    b = false;
                }

            }
            while(b);
            int paper=0;
            for ( A=0;A< seat.length;A++){
                if(B[A]!= -1){
                    paper++;
                }
            }
            System.out.println("你一共訂了:"+paper+"張票"+"，總共"+sum+"元");


        }
        void doing(){
            SeatInformation();
            interFace();
            login();
            booking();
        }
    }


