package com.google.android.play.core.splitinstall.internal;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f43198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Field f43199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f43200c;

    b(Object obj, Field field, Class cls) {
        this.f43198a = obj;
        this.f43199b = field;
        this.f43200c = cls;
    }

    public final Object a() {
        try {
            return this.f43200c.cast(this.f43199b.get(this.f43198a));
        } catch (Exception e11) {
            throw new zzbl(String.format("Failed to get value of field %s of type %s on object of type %s", this.f43199b.getName(), this.f43198a.getClass().getName(), this.f43200c.getName()), e11);
        }
    }

    protected final Field b() {
        return this.f43199b;
    }

    public final void c(Object obj) {
        try {
            this.f43199b.set(this.f43198a, obj);
        } catch (Exception e11) {
            throw new zzbl(String.format("Failed to set value of field %s of type %s on object of type %s", this.f43199b.getName(), this.f43198a.getClass().getName(), this.f43200c.getName()), e11);
        }
    }
}
