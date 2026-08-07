package p013kotlin.reflect.jvm.internal.impl.load.java.lazy;

import p013kotlin.Lazy;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes9.dex */
public final class LazyJavaResolverContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JavaResolverComponents f87236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeParameterResolver f87237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy<JavaTypeQualifiersByElementType> f87238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f87239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JavaTypeResolver f87240e;

    public LazyJavaResolverContext(JavaResolverComponents components, TypeParameterResolver typeParameterResolver, Lazy<JavaTypeQualifiersByElementType> delegateForDefaultTypeQualifiers) {
        s.k(components, "components");
        s.k(typeParameterResolver, "typeParameterResolver");
        s.k(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f87236a = components;
        this.f87237b = typeParameterResolver;
        this.f87238c = delegateForDefaultTypeQualifiers;
        this.f87239d = delegateForDefaultTypeQualifiers;
        this.f87240e = new JavaTypeResolver(this, typeParameterResolver);
    }

    public final JavaResolverComponents getComponents() {
        return this.f87236a;
    }

    public final JavaTypeQualifiersByElementType getDefaultTypeQualifiers() {
        return (JavaTypeQualifiersByElementType) this.f87239d.getValue();
    }

    public final Lazy<JavaTypeQualifiersByElementType> getDelegateForDefaultTypeQualifiers$descriptors_jvm() {
        return this.f87238c;
    }

    public final ModuleDescriptor getModule() {
        return this.f87236a.getModule();
    }

    public final StorageManager getStorageManager() {
        return this.f87236a.getStorageManager();
    }

    public final TypeParameterResolver getTypeParameterResolver() {
        return this.f87237b;
    }

    public final JavaTypeResolver getTypeResolver() {
        return this.f87240e;
    }
}
