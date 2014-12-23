package sandbox.play;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class FizzBuzzApplication extends Application<FizzBuzzConfiguration> {

    public static void main(String[] args) throws Exception {
        new FizzBuzzApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<FizzBuzzConfiguration> fizzbuzzConfigurationBootstrap) {
    }

    @Override
    public void run(FizzBuzzConfiguration config, Environment environment) {
        //FizzBuzzResource fizzbuzzResource = new FizzBuzzResource();
        FizzBuzzResource fizzbuzzResource = new FizzBuzzResource(config.getFizzWord(), config.getBuzzWord());
        environment.jersey().register(fizzbuzzResource);
    }

}
