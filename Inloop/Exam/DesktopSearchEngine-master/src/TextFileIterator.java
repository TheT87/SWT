import java.util.Iterator;
import java.util.Objects;

public class TextFileIterator implements Iterator<String> {

    // == attributes ==
    String content = "We wish you good luck in this exam!\nWe hope you are well pre-\npared."; // this is testing content!

    // == constructor ==
    public TextFileIterator(Resource res){
        Objects.requireNonNull(res);
    }

    @Override
    public boolean hasNext() {
        return content.;
    }

    @Override
    public String next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("You are not allowed to remove objects");
    }

    public String getAsString(Resource res){
        Objects.requireNonNull(res);

        // NOTE: The content is simulated. Otherwise get from .txt file
        content.replace("-\n", "");
        System.out.println(content);

        // TODO: research for string formatter. We need to cut the string

        return content;
    }
}
