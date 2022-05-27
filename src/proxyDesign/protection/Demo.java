package proxyDesign.protection;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("Arun","admin");
        FileProxy fileProxy1 = new FileProxy(user1);
        fileProxy1.readWrite();

        User user2 = new User("kumar","student");
        FileProxy fileProxy2 = new FileProxy(user2);
        fileProxy2.readWrite();
    }
}
