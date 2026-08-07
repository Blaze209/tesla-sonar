package p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes9.dex */
class c implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f88484a;

    public c(boolean z11) {
        this.f88484a = z11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        return DescriptorUtilsKt.g(this.f88484a, (CallableMemberDescriptor) obj);
    }
}
