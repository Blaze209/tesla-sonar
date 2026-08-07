package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes9.dex */
class a implements wn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JavaTypeResolver f87410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeParameterDescriptor f87411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JavaTypeAttributes f87412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TypeConstructor f87413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JavaClassifierType f87414e;

    public a(JavaTypeResolver javaTypeResolver, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor, JavaClassifierType javaClassifierType) {
        this.f87410a = javaTypeResolver;
        this.f87411b = typeParameterDescriptor;
        this.f87412c = javaTypeAttributes;
        this.f87413d = typeConstructor;
        this.f87414e = javaClassifierType;
    }

    @Override // wn0.a
    public Object invoke() {
        return JavaTypeResolver.e(this.f87410a, this.f87411b, this.f87412c, this.f87413d, this.f87414e);
    }
}
