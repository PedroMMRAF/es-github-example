public class GenericProject implements Repository {
    private final String name;
    private final String blobs;

    public GenericProject(String name, String blobs) {
        this.name = name;
        this.blobs = blobs;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String blobs() {
        return this.blobs;
    }
}
