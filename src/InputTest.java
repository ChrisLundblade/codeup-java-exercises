import util.Input;
public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        String userInput = input.getString();
        System.out.println(userInput);
        System.out.println(input.yesNo());
        System.out.println(input.getInt(2,27));
        System.out.println(input.getInt());
        System.out.println(input.getDouble(5,35));
        System.out.println(input.getDouble());

    }
}
