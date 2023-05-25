public class Person {
    private String name;
    private String surname;
    private String phonenumber;
    public Person(String name,String surname,String phonenumber){
        this.name=name;
        this.surname=surname;
        this.phonenumber=phonenumber;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getSurname(){
        return surname;
    }
    public void setPhonenumber(String phonenumber){
        this.phonenumber=phonenumber;
    }
    public String getPhonenumber(){
        return phonenumber;
    }
}







