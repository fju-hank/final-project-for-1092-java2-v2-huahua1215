package com.fju;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class LoginReg extends User {
    static void reg(){
        System.out.println("歡迎註冊!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入用戶名:");
        name=scanner.next();
        System.out.println("請設定密碼:");
        password=scanner.next();
        System.out.println("註冊成功!");


    }
    static int login(){
        int m=0;
        System.out.println("歡迎登入!");
        System.out.println("請輸入你的用戶名:");
        Scanner scanner = new Scanner(System.in);
        String n=scanner.next();
        System.out.println("請輸入密碼:");
        String p =scanner.next();
        if(name.equals(n)&&password.equals(p)){
            m=1;
        }
        switch (m){
            case 0:
                System.out.println("登入失敗!");
                System.out.println("是否重新登入(Y/N)?請輸入Y或N:");
                String yn = scanner.next();
                if (yn=="Y")
                    login();
                    break;
            case 1:
                System.out.println("登入成功!");
                break;
        }
        return m;
    }
}
