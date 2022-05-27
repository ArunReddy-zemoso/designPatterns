package proxyDesign.protection;

public class FileProxy implements IFile{
    private File file;
    private User user;

    public FileProxy(User user){
        this.user = user;
    }

    @Override
    public void readWrite() {
        if(user.getDesignation().equalsIgnoreCase("Admin")){
            file = new File();
            System.out.println(this.getClass()+": FIle proxy makes to main file");
            file.readWrite();
        }
        else{
            System.out.println(this.getClass()+": dont have access");
        }
    }
}
