package sandbox.play;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class FizzBuzzConfiguration extends Configuration {

    @JsonProperty
    private String fizzword;

    @JsonProperty
    private String buzzword;


    public String getFizzWord() {
        return fizzword;
    }

    public String getBuzzWord() {
        return buzzword;
    }
    
}
