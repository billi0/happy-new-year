package automation2;

public class ForLoop_Q4 {
    public void printMyName(String name, int homeManyTime){
        for (int i = 1; i <= homeManyTime ; i++) {
            System.out.println(name);
        }

    }

    public static void main(String[] args) {
        automation1.ForLoop_Q4 obj = new automation1.ForLoop_Q4();
        obj.printMyName("shama",10);
    }
}
