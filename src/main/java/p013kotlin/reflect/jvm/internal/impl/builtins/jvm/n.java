package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes9.dex */
class n implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JvmBuiltInsCustomizer f86688a;

    public n(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f86688a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        return JvmBuiltInsCustomizer.v(this.f86688a, (ClassDescriptor) obj);
    }
}
