package proxyDesign.protection;

public class File implements IFile{

    @Override
    public void readWrite() {
        System.out.println(this.getClass()+" : performing read and write operations");
    }
}
