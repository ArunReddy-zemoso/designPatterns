package bridgeDesign;

public class CRUDOnFile implements CRUD{

    @Override
    public void create() {
        System.out.println("creating on File");
    }

    @Override
    public void read() {
        System.out.println("reading on File");
    }

    @Override
    public void update() {
        System.out.println("updating on File");
    }

    @Override
    public void delete() {
        System.out.println("deleting on File");
    }
}
