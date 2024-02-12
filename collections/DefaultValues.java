package collections;

/**
 * DefaultValues
 */
public class DefaultValues {

    public static void main(String[] args) {
        String s1="hello1";
        String s2="hello";
        String s3=s1;
        String s4= new String("hello");

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}