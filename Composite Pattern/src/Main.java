import composite.File;
import composite.Folder;

public class Main {
    public static void main(String[] args) {
        Folder folder=new Folder("/");
        folder.addChild(new File("Test.java"));
        folder.addChild(new File("Config.xml"));
        Folder entities=(Folder) folder.addChild(new Folder("entities"));
        Folder repo=(Folder) folder.addChild(new Folder("repositories"));
        entities.addChild(new File("Product.java"));
        entities.addChild(new File("Category.xml"));
        repo.addChild(new File("ProductRepository.java"));
        repo.addChild(new File("CategoryRepository.xml"));
        repo.addChild(new Folder("subRepo"));
        folder.print();

    }
}