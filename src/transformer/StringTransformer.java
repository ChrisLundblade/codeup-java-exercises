package transformer;

public abstract class StringTransformer {
    protected String str;

    protected StringTransformer(String inputString){
        this.str = inputString;
    }
    public String getStr(){
        return this.str;
    }
    public void setStr(String inputString){
        this.str = inputString;
    }

    protected abstract String transform();
}
