package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassDescriptor f87415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RawSubstitution f87416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SimpleType f87417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JavaTypeAttributes f87418d;

    public b(ClassDescriptor classDescriptor, RawSubstitution rawSubstitution, SimpleType simpleType, JavaTypeAttributes javaTypeAttributes) {
        this.f87415a = classDescriptor;
        this.f87416b = rawSubstitution;
        this.f87417c = simpleType;
        this.f87418d = javaTypeAttributes;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return RawSubstitution.c(this.f87415a, this.f87416b, this.f87417c, this.f87418d, (KotlinTypeRefiner) obj);
    }
}
