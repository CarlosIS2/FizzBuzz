public class FizzBuzz {

    public static String muestra(int numero){
        return numero % 15 == 0 ? "fizzbuzz" :
                numero % 5 == 0 ? "buzz" :
                        numero % 3 == 0 ? "fizz" :
                                String.valueOf(numero);
    }
}
