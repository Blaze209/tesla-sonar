package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import p013kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import p013kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;

/* JADX INFO: loaded from: classes9.dex */
public final class RuntimeSourceElementFactory implements JavaSourceElementFactory {
    public static final RuntimeSourceElementFactory INSTANCE = new RuntimeSourceElementFactory();

    public static final class RuntimeSourceElement implements JavaSourceElement {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReflectJavaElement f86999a;

        public RuntimeSourceElement(ReflectJavaElement javaElement) {
            s.k(javaElement, "javaElement");
            this.f86999a = javaElement;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        public SourceFile getContainingFile() {
            SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
            s.j(NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return NO_SOURCE_FILE;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement
        public ReflectJavaElement getJavaElement() {
            return this.f86999a;
        }

        public String toString() {
            return RuntimeSourceElement.class.getName() + ": " + getJavaElement();
        }
    }

    private RuntimeSourceElementFactory() {
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory
    public JavaSourceElement source(JavaElement javaElement) {
        s.k(javaElement, "javaElement");
        return new RuntimeSourceElement((ReflectJavaElement) javaElement);
    }
}
