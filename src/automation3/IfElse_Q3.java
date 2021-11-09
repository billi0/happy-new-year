package automation3;

public class IfElse_Q3 {
    public  boolean isTeen(int age){
        if(age <= 18){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        automation1.IfElse_Q3 obj = new automation1.IfElse_Q3();
        obj.isTeen(18);
    }

}
