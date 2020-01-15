
public class FizzBuzz {
    public static String print(int num) {
        String result = "";
        if (num % 3 == 0) {
            result += "fizz";
        }
        if (num % 5 == 0) {
            result += "buzz";
        }
        if (result.isEmpty()) {
            result = String.valueOf(num);
        }
        return result;
    }
}
