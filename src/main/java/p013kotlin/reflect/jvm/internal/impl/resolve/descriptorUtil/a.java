package p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes9.dex */
class a implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f88482a = new a();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        return DescriptorUtilsKt.f((ValueParameterDescriptor) obj);
    }
}
