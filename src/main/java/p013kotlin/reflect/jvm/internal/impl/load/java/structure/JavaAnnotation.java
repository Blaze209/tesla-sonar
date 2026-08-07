package p013kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes9.dex */
public interface JavaAnnotation extends JavaElement {
    Collection<JavaAnnotationArgument> getArguments();

    ClassId getClassId();

    boolean isFreshlySupportedTypeUseAnnotation();

    boolean isIdeExternalAnnotation();

    JavaClass resolve();
}
