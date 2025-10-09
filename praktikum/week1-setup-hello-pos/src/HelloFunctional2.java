import java.util.function.BiConsumer;
public class HelloFunctional2 {
    public static void main(String[] args) {
        BiConsumer<String, String> sayHello = (name, nim) ->
            System.err.println("Hello World, I am "+ name + "-"+nim);
        sayHello.accept("Nur Dini Handayani","240202876");
    }
}