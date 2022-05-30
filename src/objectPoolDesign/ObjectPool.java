package objectPoolDesign;

import java.util.ArrayList;
import java.util.List;

public class ObjectPool {
    private static List<Server> unlockedObjects = new ArrayList<Server>();
    private static List<Server> lockedObjects = new ArrayList<Server>();
    public static int counter = 0;
    private static int maxSize=3;

    private static ObjectPool instance = null;

    public static ObjectPool getInstance(){
        if(instance ==  null){
            instance = new ObjectPool();
            System.out.println("Initializing objectpool and server objects...............");
            for(int i=0;i<maxSize;i++){
                unlockedObjects.add(new Server());
            }
        }
        return instance;
    }

    public Server acquireReusable(){
        Server obj=null;
        if(unlockedObjects.size()>0){
            obj = unlockedObjects.get(0);
            lockedObjects.add(obj);
            unlockedObjects.remove(0);
            counter++;
        }
        else{
            System.out.println("all objects are being used");
        }
        return obj;
    }

    public void releaseReusable(Server obj){
            unlockedObjects.add(obj);
            counter--;
            lockedObjects.remove(obj);
    }
}
