package transformer;

import java.util.Locale;

public class UpperCaseStringTransformer extends StringTransformer{
    public String transform(){
        return this.str.toUpperCase(Locale.ROOT);
    }

    public UpperCaseStringTransformer(String inputStr){
        super(inputStr);
    }
}
