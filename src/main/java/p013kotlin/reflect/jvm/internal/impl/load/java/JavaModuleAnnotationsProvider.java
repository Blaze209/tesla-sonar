package p013kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes9.dex */
public interface JavaModuleAnnotationsProvider {
    List<JavaAnnotation> getAnnotationsForModuleOwnerOfClass(ClassId classId);
}
