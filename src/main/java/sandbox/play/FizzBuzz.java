package sandbox.play;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FizzBuzz {

    private String fizzword;
    private String buzzword;

    private Integer number;
    private String result;

    public FizzBuzz() {
        this.fizzword = "Fizz";
        this.buzzword = "Buzz";
    }

    public FizzBuzz(String fizzword, String buzzword) {
        this.fizzword = fizzword;
        this.buzzword = buzzword;
    }

    public FizzBuzz translate(Integer number) {
        this.number = number;
        this.result = "";

        if (this.number % 3 == 0) {
            this.result += this.fizzword;
        }

        if (this.number % 5 == 0) {
            this.result += this.buzzword;
        }

        if (this.result == "") {
            //this.result = String.format("%s", this.number);
            this.result = this.number.toString();
        }

        return this;
    }

    @JsonProperty
    public Integer getNumber() {
        return this.number;
    }

    @JsonProperty
    public String getResult() {
        return this.result;
    }

}
