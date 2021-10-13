package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person);
        person.getAnimal().animalPlus();
        person.getAnimal().animalMinus();

        Person person1 = context.getBean("myPerson1", Person.class);
        System.out.println(person1);
        person1.getAnimal().animalMinus();
        person1.getAnimal().animalPlus();


//        System.out.println(person.getName());
//        System.out.println(person.getAge());
//        System.out.println(person.getAnimal());
//        Animal animal = context.getBean("myAnimal", Animal.class);
//        animal.animalMinus();
//        animal.animalPlus();
//        Dog dog = context.getBean("myAnimal", Dog.class);
//        System.out.println(dog);
//
        context.close();
    }
}
