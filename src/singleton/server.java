package singleton;

public class server {
    static server server_object=null;
    int server_status=1;
    private server(){

    }

    public static synchronized server getServer_object() {
        if(server_object==null)
            server_object=new server();
        return server_object;
    }
    public void compute(int data){
        System.out.println("computing data");
    }
}
