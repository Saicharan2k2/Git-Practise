import java.util.Arrays;
class Anagram
{
    public static void main(String[] args) {
        String s1="A Gentle man";
        String s2="Elegant man";
        s2=s2.replace(" ","").toLowerCase();
        s1=s1.replace(" ","").toLowerCase();
        char[] c1=s2.toCharArray();
        char[] c2=s1.toCharArray();
        Arrays.sort(c1);    //Arrays sort 
        Arrays.sort(c2);    //Arrays sort
        if(Arrays.equals(c1,c2))
        {
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
