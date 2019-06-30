import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PlainTextCollector implements KeywordCollector {

    // TODO: implement calculation of set here
    private Set<String> keywords = new HashSet<>();

    @Override
    public Set<String> getKeywords(Resource res) {
        Objects.requireNonNull(res);

        TextFileIterator itr = new TextFileIterator(res);
        while (itr.hasNext()){
            keywords.add(itr.getAsString(res));
        }

        return keywords; // TODO: <<< check this out
    }
}
