package io.realm.internal;

/* JADX INFO: loaded from: classes9.dex */
public class OsSet implements h, k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f79036e = nativeGetFinalizerPtr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f79037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f79038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OsSharedRealm f79039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Table f79040d;

    public OsSet(UncheckedRow uncheckedRow, long j11) {
        OsSharedRealm osSharedRealmP = uncheckedRow.getTable().p();
        this.f79039c = osSharedRealmP;
        long[] jArrNativeCreate = nativeCreate(osSharedRealmP.getNativePtr(), uncheckedRow.getNativePtr(), j11);
        this.f79037a = jArrNativeCreate[0];
        g gVar = osSharedRealmP.context;
        this.f79038b = gVar;
        gVar.a(this);
        if (jArrNativeCreate[1] != 0) {
            this.f79040d = new Table(osSharedRealmP, jArrNativeCreate[1]);
        } else {
            this.f79040d = null;
        }
    }

    private static native boolean nativeAddAllRealmAnyCollection(long j11, long j12);

    private static native long[] nativeAddBinary(long j11, byte[] bArr);

    private static native long[] nativeAddBoolean(long j11, boolean z11);

    private static native long[] nativeAddDate(long j11, long j12);

    private static native long[] nativeAddDecimal128(long j11, long j12, long j13);

    private static native long[] nativeAddDouble(long j11, double d11);

    private static native long[] nativeAddFloat(long j11, float f11);

    private static native long[] nativeAddLong(long j11, long j12);

    private static native long[] nativeAddNull(long j11);

    private static native long[] nativeAddObjectId(long j11, String str);

    private static native long[] nativeAddRealmAny(long j11, long j12);

    private static native long[] nativeAddRow(long j11, long j12);

    private static native long[] nativeAddString(long j11, String str);

    private static native long[] nativeAddUUID(long j11, String str);

    private static native boolean nativeAsymmetricDifference(long j11, long j12);

    private static native void nativeClear(long j11);

    private static native boolean nativeContainsAll(long j11, long j12);

    private static native boolean nativeContainsAllRealmAnyCollection(long j11, long j12);

    private static native boolean nativeContainsBinary(long j11, byte[] bArr);

    private static native boolean nativeContainsBoolean(long j11, boolean z11);

    private static native boolean nativeContainsDate(long j11, long j12);

    private static native boolean nativeContainsDecimal128(long j11, long j12, long j13);

    private static native boolean nativeContainsDouble(long j11, double d11);

    private static native boolean nativeContainsFloat(long j11, float f11);

    private static native boolean nativeContainsLong(long j11, long j12);

    private static native boolean nativeContainsNull(long j11);

    private static native boolean nativeContainsObjectId(long j11, String str);

    private static native boolean nativeContainsRealmAny(long j11, long j12);

    private static native boolean nativeContainsRow(long j11, long j12);

    private static native boolean nativeContainsString(long j11, String str);

    private static native boolean nativeContainsUUID(long j11, String str);

    private static native long[] nativeCreate(long j11, long j12, long j13);

    private static native void nativeDeleteAll(long j11);

    private static native long nativeFreeze(long j11, long j12);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetQuery(long j11);

    private static native long nativeGetRealmAny(long j11, int i11);

    private static native long nativeGetRow(long j11, int i11);

    private static native Object nativeGetValueAtIndex(long j11, int i11);

    private static native boolean nativeIntersect(long j11, long j12);

    private static native boolean nativeIsValid(long j11);

    private static native boolean nativeRemoveAllRealmAnyCollection(long j11, long j12);

    private static native long[] nativeRemoveBinary(long j11, byte[] bArr);

    private static native long[] nativeRemoveBoolean(long j11, boolean z11);

    private static native long[] nativeRemoveDate(long j11, long j12);

    private static native long[] nativeRemoveDecimal128(long j11, long j12, long j13);

    private static native long[] nativeRemoveDouble(long j11, double d11);

    private static native long[] nativeRemoveFloat(long j11, float f11);

    private static native long[] nativeRemoveLong(long j11, long j12);

    private static native long[] nativeRemoveNull(long j11);

    private static native long[] nativeRemoveObjectId(long j11, String str);

    private static native long[] nativeRemoveRealmAny(long j11, long j12);

    private static native long[] nativeRemoveRow(long j11, long j12);

    private static native long[] nativeRemoveString(long j11, String str);

    private static native long[] nativeRemoveUUID(long j11, String str);

    private static native boolean nativeRetainAllRealmAnyCollection(long j11, long j12);

    private static native long nativeSize(long j11);

    private static native void nativeStartListening(long j11, ObservableSet observableSet);

    private static native void nativeStopListening(long j11);

    private static native boolean nativeUnion(long j11, long j12);

    public long a() {
        return nativeSize(this.f79037a);
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f79036e;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f79037a;
    }
}
