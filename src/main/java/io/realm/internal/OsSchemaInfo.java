package io.realm.internal;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class OsSchemaInfo implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f79033c = nativeGetFinalizerPtr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f79034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OsSharedRealm f79035b;

    public OsSchemaInfo(Collection<OsObjectSchemaInfo> collection) {
        this.f79034a = nativeCreateFromList(a(collection));
        g.f79082c.a(this);
        this.f79035b = null;
    }

    private static long[] a(Collection<OsObjectSchemaInfo> collection) {
        long[] jArr = new long[collection.size()];
        Iterator<OsObjectSchemaInfo> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = it.next().getNativePtr();
            i11++;
        }
        return jArr;
    }

    private static native long nativeCreateFromList(long[] jArr);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetObjectSchemaInfo(long j11, String str);

    public OsObjectSchemaInfo b(String str) {
        return new OsObjectSchemaInfo(nativeGetObjectSchemaInfo(this.f79034a, str));
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f79033c;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f79034a;
    }

    OsSchemaInfo(long j11, OsSharedRealm osSharedRealm) {
        this.f79034a = j11;
        this.f79035b = osSharedRealm;
    }
}
