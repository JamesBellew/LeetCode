public class Palindrom {

    public boolean isPalindrome(int x){
        boolean flag;
       String a = Integer.toString(x);
      String reversed = "";

      if(a.length()==0){
          flag = true;
      }
      else{
          for(int i =a.length()-1;i>=0;i--){
              reversed += a.charAt(i);
          }
          if(reversed.equals(a)){
              flag = true;
          }else {
              flag = false;
          }
      }
        System.out.println(flag);
        return flag;
    }
    public static void main(String[] args) {
 Palindrom p  = new Palindrom();

        p.isPalindrome(121);

    }
}
