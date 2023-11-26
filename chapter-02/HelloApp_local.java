public class HelloApp_local {
    public static void main(String[] args)
    {
        //  Variable local, los otros métodos de la
        //  clase (de tenerlos) no sabe que existe,
        //  ya que se encuentra sólo en el scope del método
        //  en el que se encuentra
        String helloMessage;
        helloMessage = "Hello, World!";
        System.out.println(helloMessage);
    }
}
