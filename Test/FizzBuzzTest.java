
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    FizzBuzz prueba = new FizzBuzz();

    /*@Before
    public static void setUp() throws Exception {
        FizzBuzz prueba = new FizzBuzz();
    }*/

    @Test
    public void given_1_should_return_1(){
        assertEquals("1",prueba.muestra(1));
    }

    @Test
    public void given_2_should_return_2(){
        assertEquals("2",prueba.muestra(2));
    }

    @Test
    public void given_3_should_return_fizz(){
        assertEquals("fizz",prueba.muestra(3));
    }

    @Test
    public void given_5_should_return_buzz(){
        assertEquals("buzz",prueba.muestra(5));
    }

    @Test
    public void given_6_should_return_fizz(){
        assertEquals("fizz",prueba.muestra(3));
    }

    @Test
    public void given_15_should_return_fizzbuzz(){
        assertEquals("fizzbuzz",prueba.muestra(15));
    }

    @Test
    public void given_45_should_return_fizzbuzz(){
        assertEquals("fizzbuzz",prueba.muestra(45));
    }


}
