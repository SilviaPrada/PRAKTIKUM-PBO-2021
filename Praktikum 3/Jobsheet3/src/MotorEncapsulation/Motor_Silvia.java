package MotorEncapsulation;

public class Motor_Silvia {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if (kontakOn == true && kecepatan > 100){
            System.out.println("Tidak bisa menambah kecepatan karena kecepatan melampaui batas \n");
        }
        else if (kontakOn == true){
            kecepatan += 5;
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    public void kurangiKecepatan(){
        if (kontakOn == true){
            kecepatan -= 5;
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    public void printStatus(){
        if (kontakOn == true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        if (kecepatan <= 100){
            System.out.println("Kecepatan " + kecepatan + "\n");
        }else{
            System.out.println("Kecepatan 100 \n");
        }
    }
}
