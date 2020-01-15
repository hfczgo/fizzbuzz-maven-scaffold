

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {

    @ParameterizedTest(name = "expected{1} given {0}")
    @CsvSource({
          "3,fizz",
          "5,buzz",
          "15,fizzbuzz",
    })
    void test(int num,String expected){
        Assertions.assertEquals(FizzBuzz.print(num),expected);
    }
}
