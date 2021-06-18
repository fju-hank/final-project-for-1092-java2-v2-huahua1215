package com.fju;

public class BookTickets extends Seat {
    public static void main(String[] args) {
        BookTickets b=new BookTickets();
        b.interFace();
    }


        Seat[] seat = new Seat[4];


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
            seat[2].color = "黃";
            seat[2].seatnumber = 50;
            seat[2].price = 300;

            seat[3] = new Seat();
            seat[3].color = "藍";
            seat[3].seatnumber = 30;
            seat[3].price = 200;
        }

        void interFace ()// 訂票介面
        {
            System.out.println("\t\t\t∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞");
            System.out.println("\t\t\t 訂 票 系 統");
            System.out.println("\t\t\t∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞");
            System.out
                    .println("------------------------------------------------------------------------------");
            System.out.println("位置區位\t\t剩餘位置數\t\t價錢");
            System.out.println(seat[0].color + "\t\t" + seat[0].seatnumber + "\t\t" + seat[0].price);
            System.out.println(seat[1].color + "\t\t" + seat[1].seatnumber + "\t\t" + seat[1].price);
            System.out.println(seat[2].color + "\t\t" + seat[2].seatnumber + "\t\t" + seat[2].price);
            System.out.println(seat[3].color + "\t\t" + seat[3].seatnumber + "\t\t" + seat[3].price);

        }
    }


