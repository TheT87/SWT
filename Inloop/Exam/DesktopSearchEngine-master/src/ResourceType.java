import java.util.Objects;
import java.util.stream.Collectors;

public class ResourceType {

    // private KeywordCollector collector = new ;

    // == attributes ==
    private String description;
    private KeywordCollector collector;

    // == constructor ==
    ResourceType(String desc, KeywordCollector collector){
        Objects.requireNonNull(desc);
        Objects.requireNonNull(collector);

        if (desc.isEmpty()){
            throw new IllegalArgumentException("The desc must not be empty!");
        }

        this.description = desc;
        this.collector = collector;
    }

    // == public methods ==
    public String getDescription() {
        return description;
    }

    public KeywordCollector getCollector() {
        return collector;
    }

    // done...
}
