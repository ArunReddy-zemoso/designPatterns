package commandDesign;
//Invoker
public class FileOperations {
    private final Command open;
    private final Command save;
    private final Command close;

    public FileOperations(Command open, Command save, Command close) {
        this.open = open;
        this.save = save;
        this.close = close;
    }

    public void open() {
        open.execute();
    }

    public void save(){
        save.execute();
    }

    public void close(){
        close.execute();
    }
}
