package transformer;

public class TransformerTest {
    public static void main(String[] args) {
        UpperCaseStringTransformer myTransformer = new UpperCaseStringTransformer("jeff");

        ReverseStringTransformer transformer2 = new ReverseStringTransformer("not a palindrome");

        StringTransformer[] strArray = {myTransformer, transformer2};
        for (StringTransformer t : strArray){
            System.out.println(t.transform());
        }
    }
}
