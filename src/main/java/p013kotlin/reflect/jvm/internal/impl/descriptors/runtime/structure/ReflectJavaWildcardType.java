package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;

/* JADX INFO: loaded from: classes9.dex */
public final class ReflectJavaWildcardType extends ReflectJavaType implements JavaWildcardType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WildcardType f87052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection<JavaAnnotation> f87053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f87054c;

    public ReflectJavaWildcardType(WildcardType reflectType) {
        s.k(reflectType, "reflectType");
        this.f87052a = reflectType;
        this.f87053b = v.m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public WildcardType getReflectType() {
        return this.f87052a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection<JavaAnnotation> getAnnotations() {
        return this.f87053b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return this.f87054c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public boolean isExtends() {
        Type[] upperBounds = getReflectType().getUpperBounds();
        s.j(upperBounds, "getUpperBounds(...)");
        return !s.f(n.l0(upperBounds), Object.class);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public ReflectJavaType getBound() {
        Type[] upperBounds = getReflectType().getUpperBounds();
        Type[] lowerBounds = getReflectType().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + getReflectType());
        }
        if (lowerBounds.length == 1) {
            ReflectJavaType.Factory factory = ReflectJavaType.Factory;
            s.h(lowerBounds);
            Object objE1 = n.e1(lowerBounds);
            s.j(objE1, "single(...)");
            return factory.create((Type) objE1);
        }
        if (upperBounds.length == 1) {
            s.h(upperBounds);
            Type type = (Type) n.e1(upperBounds);
            if (!s.f(type, Object.class)) {
                ReflectJavaType.Factory factory2 = ReflectJavaType.Factory;
                s.h(type);
                return factory2.create(type);
            }
        }
        return null;
    }
}
