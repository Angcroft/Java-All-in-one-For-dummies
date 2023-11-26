//  This application displays a hello message on
//  the console by creating an instance of the
//  Greeter class and then calling the Greeter
//  object's sayHello method
public class HelloApp2
{
    public static void main(String[] args)
    {
        //  Se escribe el nombre de la clase dos veces
        //  porque se provee primero un tipo de variablo, que se
        //  usa para mantener los objetos que se crean a partir de esta.
        //  La segunda vez es lo típico, cuando se crea el objeto de la clase.
        Greeter myGreeterObject = new Greeter();
        //  Java funciona de una manera distinta a otros lenguajes (como Python),
        //  Adentrándose en clases "nested" y sus instancias de otras clases más
        //  grandes.
        myGreeterObject.sayHello();
;    }
}
