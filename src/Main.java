public class Main {

    public static void main(String[] args){
        PersonBuilder builder = new PersonBuilder();
        builder.setFirstName("Paolo");
        builder.setLastName("Rossi");
        builder.setAge(25);
        builder.setAddress("Via Roma 50");
        Person persona1 = builder.build();

        Person persona2 = new PersonBuilder().build();
        persona2.setFirstName("Marco");
        persona2.setLastName("Bianchi");
        persona2.setAge(25);
        persona2.setAddress("Via della Repubblica 25");


        System.out.println("persona1:"  + persona1 );
        System.out.println("persona2:"  + persona2 );
    }

}
