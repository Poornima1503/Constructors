package learnProgramming;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Animal {

    public Animal()
    {
        System.out.println("I am not a default constructor");
    }
    public Animal(String name)
    {
        System.out.println("my Animal name is " +name);
    }
    void printName()
    {
        System.out.println("name of the animal ");
    }
    void Animal(String name, String name2)
    {
        System.out.println("confuse method");
    }
}




