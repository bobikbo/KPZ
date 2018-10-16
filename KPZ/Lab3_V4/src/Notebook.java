import java.lang.String;

public class Notebook {
    public String surname = "", name = "", lastName = "", address = "", phone = "", additionalInformation = "";

    public Notebook(String surname, String name, String lastName, String address, String phone, String additionalInformation){
        this.surname = surname;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.additionalInformation = additionalInformation;
    }

    public Notebook(String surname, String name){
        this.surname = surname;
    }

    public String toString(){
        String result = this.surname + " " + this.name + " " + this.lastName + ", " + this.address + ", " + this.phone + ", " + this.additionalInformation;
        return result;
    }
}
