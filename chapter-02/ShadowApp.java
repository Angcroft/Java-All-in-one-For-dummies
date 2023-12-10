public class ShadowApp {
    static int x;
    public static void main(String[] args) {
        //  Declaración inicial de x
        x = 5;
        System.out.println("x =" + x);
        int x;
        //  Aquí se vuelve a declarar x, esta vez con una asignación distinta
        x = 10;
        System.out.println("x = " + x);
        //  Se llama la variable de la clase, En este caso se vuelve al valor asignado
        //  originalmente.
        System.out.println("ShadowApp. = " + ShadowApp.x);

        //  ADVERTENCIA: Este tipo de código se denomina "Shadowing", el cual hace inaccesible
        //  un valor de variable por un scope que se encuentra "más dentro". Evitar a toda costa
        //  al ser la causa principal de errores cuando se maneja mal en un archivo.
    }
}
