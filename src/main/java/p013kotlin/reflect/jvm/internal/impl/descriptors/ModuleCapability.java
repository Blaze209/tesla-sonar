package p013kotlin.reflect.jvm.internal.impl.descriptors;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class ModuleCapability<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f86698a;

    public ModuleCapability(String name) {
        s.k(name, "name");
        this.f86698a = name;
    }

    public String toString() {
        return this.f86698a;
    }
}
