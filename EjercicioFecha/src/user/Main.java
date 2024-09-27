package user;
import back.FechasVerificar;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        FechasVerificar nueva=new FechasVerificar();
        int dia;
        int mes;
        int year;
        System.out.print("Ingrese el dia: ");
        dia= scan.nextInt();
        System.out.print("Ingrese el mes: ");
        mes= scan.nextInt();
        System.out.print("Ingrese el año: ");
        year= scan.nextInt();
        nueva.setDia(dia);
        nueva.setMes(mes);
        nueva.setYear(year);
        System.out.println(nueva.isBisiesto());
        System.out.println(nueva.isFechaValida());
        System.out.print(nueva.getDia()+"/");
        System.out.print(nueva.getMes()+"/");
        System.out.print(nueva.getYear());



    }
}