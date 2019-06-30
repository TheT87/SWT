import java.util.Objects;

public class Resource {

    // == attributes ==
    private String name;
    private String path;
    private ResourceType rt;

    // == constructor ==
    public Resource(String name, String path, ResourceType rt){
        Objects.requireNonNull(name);
        Objects.requireNonNull(path);
        Objects.requireNonNull(rt);

        if (name.isEmpty() || path.isEmpty()){
            throw new IllegalArgumentException("Arguments must not be empty!");
        }


        this.name = name;
        this.path = path;
        this.rt = rt;
    }

    // == public methods ==
    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public ResourceType getType() {
        return rt;
    }

    // done so far.
}
