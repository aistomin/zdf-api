package com.github.aistomin.zdf.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by aistomin on 19.03.21.
 * <p>
 * Test for {@link Dummy}.
 */
public final class DummyTest {

    /**
     * Dummy test.
     */
    @Test
    void ownField() {
        final String test = "Test value";
        Assertions.assertEquals(test, new Dummy(test).ownField());
    }
}
