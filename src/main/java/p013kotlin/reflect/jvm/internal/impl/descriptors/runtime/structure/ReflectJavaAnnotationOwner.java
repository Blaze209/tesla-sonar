package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.AnnotatedElement;
import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public interface ReflectJavaAnnotationOwner extends JavaAnnotationOwner {
    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    ReflectJavaAnnotation findAnnotation(FqName fqName);

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    List<ReflectJavaAnnotation> getAnnotations();

    AnnotatedElement getElement();
}
