package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;

/* JADX INFO: loaded from: classes9.dex */
public final class ReflectAnnotationSource implements SourceElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Annotation f86990a;

    public ReflectAnnotationSource(Annotation annotation) {
        s.k(annotation, "annotation");
        this.f86990a = annotation;
    }

    public final Annotation getAnnotation() {
        return this.f86990a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        s.j(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }
}
