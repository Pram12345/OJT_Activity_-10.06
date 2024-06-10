import java.util.ArrayList;

public class ArrayList1{



    public static void main(String[] args) {
        ArrayList<String> Name = new ArrayList<>();

        Name.add("Aman");
        Name.add("Mukesh");
        Name.add("Pravesh");
        Name.add("Sanjay"); 
          //System.out.println(Name);

        //add index value
       // Name.add(1,"kunjesh");


        //replace index value
       // Name.set(0,"Aman Pal");

        //one value print
       // System.out.println(Name.get(3));

//  one value remoove
        Name.remove(0);

        System.out.println(Name);


        // all value remoove 
        Name.clear();
        System.out.println(Name);


      //All value print
        for(String st : Name){
            System.out.println(st);
        }


        ArrayList<Integer> Num = new ArrayList<>();

        Num.add(1);
        Num.add(2);
        Num.add(3);
        Num.add(4);
        //System.out.println(Num);

        for(Integer i : Num){
            System.out.println(i);
        }



        



    }

}