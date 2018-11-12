public class Test1 {

    public static void main(String[] args) {
        String a="a.b";
        System.out.println(a.replace(".",""));
    }

    static void change(String a) {
    }


    static void changeBuiffer1(StringBuffer buffer) {
        buffer.append(" world");
        StringBuffer buffer2 = new StringBuffer();
        buffer2.append("sss");
        buffer = buffer2;
    }
}
