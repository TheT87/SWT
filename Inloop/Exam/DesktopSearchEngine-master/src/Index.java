import java.util.*;

public class Index {

    // == attributes ==
    private Map<String, List<Resource>> index = new HashMap<>();

    // == constructor ==
    public Index(){};

    // == public methods ==
    public void add(Resource res){
        Objects.requireNonNull(res);
        if (index.containsKey(res)){
            return;
        }


        List<Resource> resources = index.getOrDefault(res.getName(), new LinkedList<>());

        resources.add(res);
        index.put(res.getType().getDescription(), resources);

    }

    public List<Resource> get(String keyword){
        return getResources(keyword);
    }

    public List<Resource> getResources(String keyword){
        Objects.requireNonNull(keyword);
        return index.getOrDefault(keyword, Collections.emptyList());
    }
}
