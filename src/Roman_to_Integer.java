import java.util.ArrayList;
import java.util.HashMap;

public class Roman_to_Integer {

    public int rom_to_Int(String s ) {
        HashMap<String, Integer> Romans = new HashMap<String, Integer>();
        Romans.put("I", 1);
        Romans.put("V", 5);
        Romans.put("X", 10);
        Romans.put("L", 50);
        Romans.put("C", 100);
        Romans.put("D", 500);
        Romans.put("M", 1000);
        int total =0;
        ArrayList<Integer> x = new ArrayList();
        char[] s1 = s.toCharArray();





        for (int i = 0; i < s1.length; i++) {


          if( String.valueOf(s1[i]).equals("I")
                  && String.valueOf(s1[i+1]).equals("X"))
          {

              x.add(Romans.get(String.valueOf(s1[i+1]))-1);

              i++;
          }else{

              x.add(Romans.get(String.valueOf(s1[i])));
          }


        }
for(int i =0;i<x.size();i++){

    total = total + x.get(i);

}

        System.out.println(total);
        return total;
    }

    public static void main(String[] args) {
        Roman_to_Integer rti = new Roman_to_Integer();
        rti.rom_to_Int("III");
    }
}
