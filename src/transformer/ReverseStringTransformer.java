package transformer;

public class ReverseStringTransformer extends StringTransformer{
    public ReverseStringTransformer(String str){
        super(str);
    }
    public String transform(){
        String reversedStr = "";
        for (int i = this.str.length(); i > 0; i--){
            reversedStr += Character.toString(this.str.charAt(i-1));
        }

        return reversedStr;
    }
}
