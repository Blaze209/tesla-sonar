package p013kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: loaded from: classes9.dex */
public final class TypeParameterErasureOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f88927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f88928b;

    public TypeParameterErasureOptions(boolean z11, boolean z12) {
        this.f88927a = z11;
        this.f88928b = z12;
    }

    public final boolean getIntersectUpperBounds() {
        return this.f88928b;
    }

    public final boolean getLeaveNonTypeParameterTypes() {
        return this.f88927a;
    }
}
