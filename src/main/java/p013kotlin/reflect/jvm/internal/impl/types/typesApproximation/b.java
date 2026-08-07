package p013kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* JADX INFO: loaded from: classes9.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeParameterDescriptor f89043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KotlinType f89044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final KotlinType f89045c;

    public b(TypeParameterDescriptor typeParameter, KotlinType inProjection, KotlinType outProjection) {
        s.k(typeParameter, "typeParameter");
        s.k(inProjection, "inProjection");
        s.k(outProjection, "outProjection");
        this.f89043a = typeParameter;
        this.f89044b = inProjection;
        this.f89045c = outProjection;
    }

    public final KotlinType a() {
        return this.f89044b;
    }

    public final KotlinType b() {
        return this.f89045c;
    }

    public final TypeParameterDescriptor c() {
        return this.f89043a;
    }

    public final boolean d() {
        return KotlinTypeChecker.DEFAULT.isSubtypeOf(this.f89044b, this.f89045c);
    }
}
