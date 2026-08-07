package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes9.dex */
class n0 implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f87375a = new n0();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        return LazyJavaStaticClassScope.g0((ClassDescriptor) obj);
    }
}
