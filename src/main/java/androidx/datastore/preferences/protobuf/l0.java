package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class l0 implements k0 {
    l0() {
    }

    private static <K, V> int a(int i11, Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        i0 i0Var = (i0) obj2;
        int iA = 0;
        if (j0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : j0Var.entrySet()) {
            iA += i0Var.a(i11, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static <K, V> j0<K, V> b(Object obj, Object obj2) {
        j0<K, V> j0VarN = (j0) obj;
        j0<K, V> j0Var = (j0) obj2;
        if (!j0Var.isEmpty()) {
            if (!j0VarN.k()) {
                j0VarN = j0VarN.n();
            }
            j0VarN.m(j0Var);
        }
        return j0VarN;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public Map<?, ?> forMapData(Object obj) {
        return (j0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public i0.a<?, ?> forMapMetadata(Object obj) {
        return ((i0) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public Map<?, ?> forMutableMapData(Object obj) {
        return (j0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public int getSerializedSize(int i11, Object obj, Object obj2) {
        return a(i11, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public boolean isImmutable(Object obj) {
        return !((j0) obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public Object mergeFrom(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public Object newMapField(Object obj) {
        return j0.e().n();
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public Object toImmutable(Object obj) {
        ((j0) obj).l();
        return obj;
    }
}
