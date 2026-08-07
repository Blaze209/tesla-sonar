package p013kotlin.reflect.jvm.internal.impl.descriptors;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Visibility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f86721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f86722b;

    protected Visibility(String name, boolean z11) {
        s.k(name, "name");
        this.f86721a = name;
        this.f86722b = z11;
    }

    public Integer compareTo(Visibility visibility) {
        s.k(visibility, "visibility");
        return Visibilities.INSTANCE.compareLocal$compiler_common(this, visibility);
    }

    public String getInternalDisplayName() {
        return this.f86721a;
    }

    public final boolean isPublicAPI() {
        return this.f86722b;
    }

    public Visibility normalize() {
        return this;
    }

    public final String toString() {
        return getInternalDisplayName();
    }
}
