package TugasPraktikum;

public class EncapTest_Silvia {
    public static void main(String[] args){
        EncapDemo_Silvia encap = new EncapDemo_Silvia();
        EncapDemo_Silvia encap1 = new EncapDemo_Silvia();
        
        encap.setName("James");
        encap.setAge(35);
        
        encap1.setName("Selvi");
        encap1.setAge(15);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge()+ "\n");
        
        System.out.println("Name : " + encap1.getName());
        System.out.println("Age : " + encap1.getAge());
    }
}
