package commandDesign;
//concrete command
public class OpenFile implements Command{
    private FileDocument file;

    public OpenFile(FileDocument file){
        this.file = file;
    }

    public void execute(){
        file.open();
    }
}
