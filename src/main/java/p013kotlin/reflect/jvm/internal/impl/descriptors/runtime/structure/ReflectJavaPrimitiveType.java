package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import p013kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: loaded from: classes9.dex */
public final class ReflectJavaPrimitiveType extends ReflectJavaType implements JavaPrimitiveType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f87043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection<JavaAnnotation> f87044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f87045c;

    public ReflectJavaPrimitiveType(Class<?> reflectType) {
        s.k(reflectType, "reflectType");
        this.f87043a = reflectType;
        this.f87044b = v.m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Class<?> getReflectType() {
        return this.f87043a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection<JavaAnnotation> getAnnotations() {
        return this.f87044b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType
    public PrimitiveType getType() {
        if (s.f(getReflectType(), Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.get(getReflectType().getName()).getPrimitiveType();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return this.f87045c;
    }
}
