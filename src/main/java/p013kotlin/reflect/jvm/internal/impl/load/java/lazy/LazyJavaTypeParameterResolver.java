package p013kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Map;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class LazyJavaTypeParameterResolver implements TypeParameterResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f87241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeclarationDescriptor f87242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f87243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<JavaTypeParameter, Integer> f87244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MemoizedFunctionToNullable<JavaTypeParameter, LazyJavaTypeParameterDescriptor> f87245e;

    public LazyJavaTypeParameterResolver(LazyJavaResolverContext c11, DeclarationDescriptor containingDeclaration, JavaTypeParameterListOwner typeParameterOwner, int i11) {
        s.k(c11, "c");
        s.k(containingDeclaration, "containingDeclaration");
        s.k(typeParameterOwner, "typeParameterOwner");
        this.f87241a = c11;
        this.f87242b = containingDeclaration;
        this.f87243c = i11;
        this.f87244d = CollectionsKt.mapToIndex(typeParameterOwner.getTypeParameters());
        this.f87245e = c11.getStorageManager().createMemoizedFunctionWithNullableValues(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyJavaTypeParameterDescriptor b(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver, JavaTypeParameter typeParameter) {
        s.k(typeParameter, "typeParameter");
        Integer num = lazyJavaTypeParameterResolver.f87244d.get(typeParameter);
        if (num == null) {
            return null;
        }
        return new LazyJavaTypeParameterDescriptor(ContextKt.copyWithNewDefaultTypeQualifiers(ContextKt.child(lazyJavaTypeParameterResolver.f87241a, lazyJavaTypeParameterResolver), lazyJavaTypeParameterResolver.f87242b.getAnnotations()), typeParameter, lazyJavaTypeParameterResolver.f87243c + num.intValue(), lazyJavaTypeParameterResolver.f87242b);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    public TypeParameterDescriptor resolveTypeParameter(JavaTypeParameter javaTypeParameter) {
        s.k(javaTypeParameter, "javaTypeParameter");
        LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor = (LazyJavaTypeParameterDescriptor) this.f87245e.invoke(javaTypeParameter);
        return lazyJavaTypeParameterDescriptor != null ? lazyJavaTypeParameterDescriptor : this.f87241a.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
    }
}
