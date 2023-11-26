public class HelloApp3 
{
    //  La diferencia de una static variable y una
    //  instance variable es que static variable es el valor que es la
    //  misma que las otras instancias de la clase.
    static String helloMessage;

    public static void main(String[] args)
    {
        helloMessage = "Hello, World!";
        System.out.println(helloMessage);
    }
}
