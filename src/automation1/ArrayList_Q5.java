package automation1;

import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();          //Generic array list , we can pass any type of data type or value.
        list.add("shama");
        list.add(null);
        list.add(true);
        list.add(10.5);


        ArrayList<String> list1 = new ArrayList<>();   // now we only can pass strings value.
        list1.add("selenium");
        list1.add("java");
        list1.add("scrum");
        list1.add("postman");
        list1.add("jira");
       for(String str:list1){
           System.out.println(str);
       }
    }
}
