package p013kotlin.reflect.jvm.internal.impl.types;

import jn0.m;
import jn0.p;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes9.dex */
public final class StarProjectionImpl extends TypeProjectionBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeParameterDescriptor f88901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f88902b;

    public StarProjectionImpl(TypeParameterDescriptor typeParameter) {
        s.k(typeParameter, "typeParameter");
        this.f88901a = typeParameter;
        this.f88902b = m.a(p.PUBLICATION, new u(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType a(StarProjectionImpl starProjectionImpl) {
        return StarProjectionImplKt.starProjectionType(starProjectionImpl.f88901a);
    }

    private final KotlinType c() {
        return (KotlinType) this.f88902b.getValue();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public Variance getProjectionKind() {
        return Variance.OUT_VARIANCE;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public KotlinType getType() {
        return c();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public boolean isStarProjection() {
        return true;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public TypeProjection refine(KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
