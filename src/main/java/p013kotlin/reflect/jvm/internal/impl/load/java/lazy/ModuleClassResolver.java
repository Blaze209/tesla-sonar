package p013kotlin.reflect.jvm.internal.impl.load.java.lazy;

import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;

/* JADX INFO: loaded from: classes9.dex */
public interface ModuleClassResolver {
    ClassDescriptor resolveClass(JavaClass javaClass);
}
