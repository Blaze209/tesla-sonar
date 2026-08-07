package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;

/* JADX INFO: loaded from: classes9.dex */
public final class KotlinJvmBinaryPackageSourceElement implements SourceElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaPackageFragment f87592a;

    public KotlinJvmBinaryPackageSourceElement(LazyJavaPackageFragment packageFragment) {
        s.k(packageFragment, "packageFragment");
        this.f87592a = packageFragment;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        s.j(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public String toString() {
        return this.f87592a + ": " + this.f87592a.getBinaryClasses$descriptors_jvm().keySet();
    }
}
