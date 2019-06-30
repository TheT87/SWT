import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DesktopSearch {

    // == attributes ==
    private Map<String, ResourceType> types = new HashMap<>();
    private Index index = new Index();

    // == constructor ==
    public DesktopSearch(){};

    // == public methods ==
    public void registerType(String extension, ResourceType type){
        Objects.requireNonNull(extension);
        Objects.requireNonNull(type);

        types.put(extension, type);
    }

    public ResourceType getType(String extension){
        return types.get(extension);
    }

    public void unregisterType(String extension){
        Objects.requireNonNull(extension);

        types.remove(extension);
    }

    public void registerResource(Resource res){
        Objects.requireNonNull(res);
        index.add(res);
    }

    public List<Resource> processRequest(String request){
        return index.getResources(request);
    }
}
