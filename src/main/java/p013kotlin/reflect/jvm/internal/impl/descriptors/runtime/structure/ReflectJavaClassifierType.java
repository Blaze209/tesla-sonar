package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public final class ReflectJavaClassifierType extends ReflectJavaType implements JavaClassifierType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f87035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JavaClassifier f87036b;

    public ReflectJavaClassifierType(Type reflectType) {
        JavaClassifier reflectJavaClass;
        s.k(reflectType, "reflectType");
        this.f87035a = reflectType;
        Type reflectType2 = getReflectType();
        if (reflectType2 instanceof Class) {
            reflectJavaClass = new ReflectJavaClass((Class) reflectType2);
        } else if (reflectType2 instanceof TypeVariable) {
            reflectJavaClass = new ReflectJavaTypeParameter((TypeVariable) reflectType2);
        } else {
            if (!(reflectType2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + reflectType2.getClass() + "): " + reflectType2);
            }
            Type rawType = ((ParameterizedType) reflectType2).getRawType();
            s.i(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            reflectJavaClass = new ReflectJavaClass((Class) rawType);
        }
        this.f87036b = reflectJavaClass;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType, p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public JavaAnnotation findAnnotation(FqName fqName) {
        s.k(fqName, "fqName");
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection<JavaAnnotation> getAnnotations() {
        return v.m();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public JavaClassifier getClassifier() {
        return this.f87036b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public String getClassifierQualifiedName() {
        throw new UnsupportedOperationException("Type not found: " + getReflectType());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public String getPresentableText() {
        return getReflectType().toString();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public Type getReflectType() {
        return this.f87035a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public List<JavaType> getTypeArguments() {
        List<Type> parameterizedTypeArguments = ReflectClassUtilKt.getParameterizedTypeArguments(getReflectType());
        ReflectJavaType.Factory factory = ReflectJavaType.Factory;
        ArrayList arrayList = new ArrayList(v.y(parameterizedTypeArguments, 10));
        Iterator<T> it = parameterizedTypeArguments.iterator();
        while (it.hasNext()) {
            arrayList.add(factory.create((Type) it.next()));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public boolean isRaw() {
        Type reflectType = getReflectType();
        if (reflectType instanceof Class) {
            TypeVariable[] typeParameters = ((Class) reflectType).getTypeParameters();
            s.j(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }
}
