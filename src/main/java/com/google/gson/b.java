package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f44816a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f44816a = field;
    }

    public String toString() {
        return this.f44816a.toString();
    }
}
