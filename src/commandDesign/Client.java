package commandDesign;

public class Client {
    public static void main(String[] args) {
        FileDocument file = new FileDocument();
        Command open = new OpenFile(file);
        Command close = new CloseFile(file);
        Command save = new SaveFile(file);

        FileOperations operations = new FileOperations(open, save, close);

        operations.open();
        operations.save();
        operations.close();
    }
}
