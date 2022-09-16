/**
 * Main entrypoint
 * @author Pedro Fernandes 60694
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Having a look at repositories...");
        Repository repo = new GenericProject("BestProject", "hello.txt");
        System.out.printf("%s : %s\n", repo.getName(), repo.blobs());
    }
}
