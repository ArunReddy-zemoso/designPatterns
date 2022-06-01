package commandDesign;
//concrete command
public class SaveFile implements Command{
    private FileDocument file;

    public SaveFile(FileDocument file){
        this.file = file;
    }

    public void execute(){
        file.save();
    }
}
