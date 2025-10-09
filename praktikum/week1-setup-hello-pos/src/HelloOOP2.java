class Greeter {
    private String name;
    private String nim;

    public Greeter(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    public void sayHello() {
        System.out.println("Hello World, I am " + name + " - " + nim);
    }
}

public class HelloOOP2 {
    public static void main(String[] args) {
        Greeter dini = new Greeter("NUR DINI HANDAYANI", "240202876");
        dini.sayHello();
    }
}
