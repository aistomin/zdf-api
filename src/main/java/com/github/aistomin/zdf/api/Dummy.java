package com.github.aistomin.zdf.api;

/**
 * Created by aistomin on 19.03.21.
 * <p>
 * Dummy class. Will be removed soon.
 */
public final class Dummy {

    /**
     * Dummy field.
     */
    private final String field;

    /**
     * Ctor.
     *
     * @param param Dummy param.
     */
    public Dummy(final String param) {
        this.field = param;
    }

    /**
     * Get dummy value.
     *
     * @return Dummy value.
     */
    public String ownField() {
        return this.field;
    }
}
