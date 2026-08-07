package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class e0 implements d0 {
    e0() {
    }

    static <E> y.f<E> d(Object obj, long j11) {
        return (y.f) n1.z(obj, j11);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public <E> void a(Object obj, Object obj2, long j11) {
        y.f fVarD = d(obj, j11);
        y.f fVarD2 = d(obj2, j11);
        int size = fVarD.size();
        int size2 = fVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!fVarD.isModifiable()) {
                fVarD = fVarD.mutableCopyWithCapacity(size2 + size);
            }
            fVarD.addAll(fVarD2);
        }
        if (size > 0) {
            fVarD2 = fVarD;
        }
        n1.O(obj, j11, fVarD2);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public void b(Object obj, long j11) {
        d(obj, j11).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public <L> List<L> c(Object obj, long j11) {
        y.f fVarD = d(obj, j11);
        if (fVarD.isModifiable()) {
            return fVarD;
        }
        int size = fVarD.size();
        y.f fVarMutableCopyWithCapacity = fVarD.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        n1.O(obj, j11, fVarMutableCopyWithCapacity);
        return fVarMutableCopyWithCapacity;
    }
}
