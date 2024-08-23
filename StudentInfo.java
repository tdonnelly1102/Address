public class StudentInfo {
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;

    public StudentInfo(String n, String a, String c, String s, String zc){
        name = n;
        address = a;
        city = c;
        state = s;
        zipCode = zc;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

    public String getZipCode(){
        return zipCode;
    }
}
