
package com.sysops.ayoubbellahcene;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class helloworldTest {
    @Test
    public void should_return_hello_world(){
        helloworld helloWorld = new helloworld();
        String result = helloWorld.helloWorld();

        assertThat(result).isEqualTo("Hello World");
    }
}