package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes9.dex */
class l implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f86686a = new l();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        return JvmBuiltInsCustomizer.z((CallableMemberDescriptor) obj);
    }
}
