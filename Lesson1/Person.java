package Lesson1;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public String info(){
        String info ="";
        info += "FirstName: " + firstName + "\n";
        info += "LastName: " + lastName + "\n";
        info += "MiddleName: " + middleName + "\n";
        info += "Country: " + country + "\n";
        info += "Address: " + address + "\n";
        info += "Phone: " + phone + "\n";
        info += "Age: " + age + "\n";
        info += "Gender: " + gender + "\n";

        return info;
    }

    public static class PersonBuilder{
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        public PersonBuilder(){
        }

        public PersonBuilder firstName(String value){
            firstName = value;
            return this;
        }

        public PersonBuilder lastName(String value){
            lastName = value;
            return this;
        }

        public PersonBuilder country(String value){
            country = value;
            return this;
        }

        public PersonBuilder middleName(String value){
            middleName = value;
            return this;
        }

        public PersonBuilder address(String value){
            address = value;
            return this;
        }

        public PersonBuilder phone(String value){
            phone = value;
            return this;
        }

        public PersonBuilder gender(String value){
            gender = value;
            return this;
        }

        public PersonBuilder age(int value){
            age = value;
            return this;
        }

        public Person build(){
            Person personBuilder = new Person();
            personBuilder.firstName = firstName;
            personBuilder.lastName = lastName;
            personBuilder.middleName = middleName;
            personBuilder.country = country;
            personBuilder.address = address;
            personBuilder.phone = phone;
            personBuilder.age = age;
            personBuilder.gender = gender;

            return personBuilder;
        }
    }
}
