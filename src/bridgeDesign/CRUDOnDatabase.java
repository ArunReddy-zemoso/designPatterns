package bridgeDesign;

public class CRUDOnDatabase implements CRUD{

    @Override
    public void create() {
        System.out.println("creating on database");
    }

    @Override
    public void read() {
        System.out.println("reading on database");
    }

    @Override
    public void update() {
        System.out.println("updating on database");
    }

    @Override
    public void delete() {
        System.out.println("deleting on database");
    }
}
