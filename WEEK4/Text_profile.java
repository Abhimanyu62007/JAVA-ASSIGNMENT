public class Text_profile {
    String name;
    String email;
    String city;

    Text_profile(String name, String email, String city) {
        this.name = name;
        this.email = email;
        this.city = city;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        Text_profile profile = new Text_profile(
            "Abhimanyu",
            "abhimanyu@gmail.com",
            "Delhi"
        );

        profile.display();
    }
}