package objectPoolDesign;

public class client {
    public static void main(String[] args) {
        ObjectPool objectPool = ObjectPool.getInstance();

        Server server1 = objectPool.acquireReusable();
        if(server1 != null) {
            server1.doTask();
            System.out.println("server 1, counter = "+objectPool.counter);
        }

        Server server2 = objectPool.acquireReusable();
        if(server2 != null) {
            server2.doTask();
            System.out.println("server 2, counter =  "+objectPool.counter);
        }

        Server server3 = objectPool.acquireReusable();
        if(server3 != null) {
            server3.doTask();
            System.out.println("server 3, counter =  "+objectPool.counter);
        }

        Server server4 = objectPool.acquireReusable();
        if(server4 != null) {
            server4.doTask();
            System.out.println("server 4, counter =  "+objectPool.counter);
        }

        objectPool.releaseReusable(server2);

        Server server5 = objectPool.acquireReusable();
        if(server5 != null) {
            server5.doTask();
            System.out.println("server 5, counter =  "+objectPool.counter);
        }

        Server server6 = objectPool.acquireReusable();
        if(server6 != null) {
            server6.doTask();
            System.out.println("server 6, counter =  "+objectPool.counter);
        }
    }


}
