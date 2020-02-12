public class PasswordGenerator {
    private String prefix;
    private static int counter = 0;
    private int endLength;
    private double endLength2;
    private int endLength3;
    private String fullPass;
    public PasswordGenerator(int length, String pre){
        prefix = pre;
        endLength = length;

    }
    public PasswordGenerator(int length){
        prefix = "A";
        endLength = length;
    }
    public String pwGen(){
        endLength2 = Math.pow(10.0, endLength);
        endLength3 = (int) ((Math.random() * endLength2));
        fullPass = prefix + "." + endLength3;
        counter++;
        return fullPass;
    }
    public static int pwCount(){
        return counter;
    }
    public static void main(String[] args){
        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());
        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw1.pwCount());
    }
}
/* Output
0
chs.6290
chs.5036
2
2
A.10077
3
3
 */