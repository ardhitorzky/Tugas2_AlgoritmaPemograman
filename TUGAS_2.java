import java.util.Scanner;

public class TUGAS_2 {
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Masukkan Golongan A/B/C: ");
    char Golongan=input.next().toUpperCase().charAt(0);

    System.out.println("Masukkan Jam Lembur: ");
    int JamLembur=input.nextInt();

    double GajiPokok=0;
    double GajiLembur;

    //input gaji pokok berdasarkan golongan
    if(Golongan== 'A'){
        GajiPokok=5000000;
    }else if(Golongan== 'B'){
        GajiPokok=6500000;
    }else if(Golongan== 'c'){
        GajiPokok=9500000;
    }
    
    //input gaji lembur berdasarkan jam lembur
    if (JamLembur==1){
        GajiLembur=GajiPokok * 0.30;

    }else if (JamLembur==2){
        GajiLembur=GajiPokok * 0.32;
        
    }else if (JamLembur==3){
        GajiLembur=GajiPokok * 0.34;
        
    }else if (JamLembur==4){
        GajiLembur=GajiPokok * 0.36;
        
    }else {// Jam Lembur diatas 5 jam
        GajiLembur=GajiPokok * 0.38;
        
    }
    //Menghitung jumlah penghasilan
    double JumlahPenghasilan= GajiPokok+GajiLembur;

    //Output jumlah penghasilan
    System.out.println("Jumlah Penghasilan Rp."+JumlahPenghasilan);
    input.close();
}
}