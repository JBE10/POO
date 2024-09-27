package back;
import java.util.*;
public class FechasVerificar {
    private int dia;
    private int mes;
    private int year;

    private boolean bisiesto=false;
    private boolean FechaValida=true;
    public FechasVerificar(int dia,int mes,int year){
        if (dia>0 && dia<=31){
            this.dia=dia;
        }
        if (mes>0 && mes<=12){
            this.mes = mes;
        }
        if(year>0){
            this.year = year;
        }
    }
    public FechasVerificar(){
        dia=0;
        mes=0;
        year=0;
    }

    public void setDia(int dia) {

        if (dia>0 && dia<=31){
            this.dia=dia;
        }
    }

    public void setMes(int mes) {

        if (mes>0 && mes<=12){
            this.mes=mes;
        }
    }

    public void setYear(int year) {
        if(year>0){
            this.year = year;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getYear() {
        return year;
    }

    public boolean isBisiesto() {
        if (year%4==0){
            bisiesto=true;
        } else if (year%100==0 && year%400==0) {

            bisiesto=false;
        }
        return bisiesto;
    }
    public boolean isFechaValida() {
        boolean FechaValida = true;


        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia < 1 || dia > 31) {
                FechaValida = false;
            }
        }

        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia < 1 || dia > 30) {
                FechaValida = false;
            }
        }

        else if (mes == 2) {
            if (isBisiesto()) {
                if (dia < 1 || dia > 29) {
                    FechaValida = false;
                }
            } else {
                if (dia < 1 || dia > 28) {
                    FechaValida = false;
                }
            }
        }
        else {
            FechaValida = false;
        }

        return FechaValida;
    }

}
