package p013kotlin.reflect.jvm.internal.impl.load.java.lazy;

import ho0.l;
import java.util.Iterator;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;

/* JADX INFO: loaded from: classes9.dex */
public final class LazyJavaAnnotations implements Annotations {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f87230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JavaAnnotationOwner f87231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f87232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> f87233d;

    public LazyJavaAnnotations(LazyJavaResolverContext c11, JavaAnnotationOwner annotationOwner, boolean z11) {
        s.k(c11, "c");
        s.k(annotationOwner, "annotationOwner");
        this.f87230a = c11;
        this.f87231b = annotationOwner;
        this.f87232c = z11;
        this.f87233d = c11.getComponents().getStorageManager().createMemoizedFunctionWithNullableValues(new c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotationDescriptor d(LazyJavaAnnotations lazyJavaAnnotations, JavaAnnotation annotation) {
        s.k(annotation, "annotation");
        return JavaAnnotationMapper.INSTANCE.mapOrResolveJavaAnnotation(annotation, lazyJavaAnnotations.f87230a, lazyJavaAnnotations.f87232c);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo496findAnnotation(FqName fqName) {
        AnnotationDescriptor annotationDescriptorInvoke;
        s.k(fqName, "fqName");
        JavaAnnotation javaAnnotationFindAnnotation = this.f87231b.findAnnotation(fqName);
        return (javaAnnotationFindAnnotation == null || (annotationDescriptorInvoke = this.f87233d.invoke(javaAnnotationFindAnnotation)) == null) ? JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(fqName, this.f87231b, this.f87230a) : annotationDescriptorInvoke;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return this.f87231b.getAnnotations().isEmpty() && !this.f87231b.isDeprecatedInJavaDoc();
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return l.J(l.Y(l.U(v.e0(this.f87231b.getAnnotations()), this.f87233d), JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(StandardNames.FqNames.deprecated, this.f87231b, this.f87230a))).iterator();
    }

    public /* synthetic */ LazyJavaAnnotations(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner javaAnnotationOwner, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotationOwner, (i11 & 4) != 0 ? false : z11);
    }
}
