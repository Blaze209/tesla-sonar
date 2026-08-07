package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.h;

/* JADX INFO: loaded from: classes8.dex */
public final class JsonAdapterBinding<T> {
    private final Class<T> clazz;
    private final h<T> jsonAdapter;

    public JsonAdapterBinding(Class<T> cls, h<T> hVar) {
        this.clazz = cls;
        this.jsonAdapter = hVar;
    }

    public final Class<T> getClazz() {
        return this.clazz;
    }

    public final h<T> getJsonAdapter() {
        return this.jsonAdapter;
    }
}
