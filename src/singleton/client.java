package singleton;

public class client {
    public static void main(String[] args) {
        server serverObj1=server.getServer_object();
        serverObj1.compute(2);
        server serverObj2=server.getServer_object();
        serverObj2.compute(3);
        System.out.println(serverObj1.hashCode());
        System.out.println(serverObj2.hashCode());
    }
}
