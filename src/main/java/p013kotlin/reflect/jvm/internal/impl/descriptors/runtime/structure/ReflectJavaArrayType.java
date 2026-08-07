package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;

/* JADX INFO: loaded from: classes9.dex */
public final class ReflectJavaArrayType extends ReflectJavaType implements JavaArrayType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f87024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReflectJavaType f87025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection<JavaAnnotation> f87026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f87027d;

    public ReflectJavaArrayType(Type reflectType) {
        ReflectJavaType reflectJavaTypeCreate;
        s.k(reflectType, "reflectType");
        this.f87024a = reflectType;
        Type reflectType2 = getReflectType();
        if (!(reflectType2 instanceof GenericArrayType)) {
            if (reflectType2 instanceof Class) {
                Class cls = (Class) reflectType2;
                if (cls.isArray()) {
                    ReflectJavaType.Factory factory = ReflectJavaType.Factory;
                    Class<?> componentType = cls.getComponentType();
                    s.j(componentType, "getComponentType(...)");
                    reflectJavaTypeCreate = factory.create(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + getReflectType().getClass() + "): " + getReflectType());
        }
        ReflectJavaType.Factory factory2 = ReflectJavaType.Factory;
        Type genericComponentType = ((GenericArrayType) reflectType2).getGenericComponentType();
        s.j(genericComponentType, "getGenericComponentType(...)");
        reflectJavaTypeCreate = factory2.create(genericComponentType);
        this.f87025b = reflectJavaTypeCreate;
        this.f87026c = v.m();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection<JavaAnnotation> getAnnotations() {
        return this.f87026c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    protected Type getReflectType() {
        return this.f87024a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return this.f87027d;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
    public ReflectJavaType getComponentType() {
        return this.f87025b;
    }
}
