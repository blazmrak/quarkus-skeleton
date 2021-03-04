package io.github.blazmrak;

import io.quarkus.test.junit.QuarkusTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        GreetingResource greetingResource = new GreetingResource();
        Assertions.assertThat(greetingResource.hello()).isEqualTo("Hello, World!");
    }
}