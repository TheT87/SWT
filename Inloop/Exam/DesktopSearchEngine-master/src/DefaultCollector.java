import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DefaultCollector implements KeywordCollector {

    @Override
    public Set<String> getKeywords(Resource res) {
        Objects.requireNonNull(res);
        Set<String> keywords = new HashSet<>();
        keywords.add(res.getName());
        return keywords;
    }
}
