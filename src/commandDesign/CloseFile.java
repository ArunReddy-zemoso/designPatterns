package commandDesign;
//concrete command
public class CloseFile implements Command{
    private FileDocument file;

    public CloseFile(FileDocument file){
        this.file = file;
    }

    public void execute(){
        file.close();
    }
}
