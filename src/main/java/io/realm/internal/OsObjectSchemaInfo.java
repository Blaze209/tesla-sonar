package io.realm.internal;

import io.realm.RealmFieldType;

/* JADX INFO: loaded from: classes9.dex */
public class OsObjectSchemaInfo implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f78997b = nativeGetFinalizerPtr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f78998a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f78999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f79000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long[] f79001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f79002d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long[] f79004f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f79003e = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f79005g = 0;

        public b(String str, String str2, boolean z11, int i11, int i12) {
            this.f79000b = str;
            this.f78999a = str2;
            this.f79002d = z11;
            this.f79001c = new long[i11];
            this.f79004f = new long[i12];
        }

        public b a(String str, String str2, RealmFieldType realmFieldType, boolean z11, boolean z12, boolean z13) {
            long jNativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str2, str, Property.a(realmFieldType, z13), z11, z12);
            long[] jArr = this.f79001c;
            int i11 = this.f79003e;
            jArr[i11] = jNativeCreatePersistedProperty;
            this.f79003e = i11 + 1;
            return this;
        }

        public OsObjectSchemaInfo b() {
            if (this.f79003e == -1 || this.f79005g == -1) {
                throw new IllegalStateException("'OsObjectSchemaInfo.build()' has been called before on this object.");
            }
            OsObjectSchemaInfo osObjectSchemaInfo = new OsObjectSchemaInfo(this.f79000b, this.f78999a, this.f79002d);
            OsObjectSchemaInfo.nativeAddProperties(osObjectSchemaInfo.f78998a, this.f79001c, this.f79004f);
            this.f79003e = -1;
            this.f79005g = -1;
            return osObjectSchemaInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddProperties(long j11, long[] jArr, long[] jArr2);

    private static native long nativeCreateRealmObjectSchema(String str, String str2, boolean z11);

    private static native String nativeGetClassName(long j11);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetPrimaryKeyProperty(long j11);

    private static native long nativeGetProperty(long j11, String str);

    private static native boolean nativeIsEmbedded(long j11);

    public Property c(String str) {
        return new Property(nativeGetProperty(this.f78998a, str));
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f78997b;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f78998a;
    }

    private OsObjectSchemaInfo(String str, String str2, boolean z11) {
        this(nativeCreateRealmObjectSchema(str, str2, z11));
    }

    OsObjectSchemaInfo(long j11) {
        this.f78998a = j11;
        g.f79082c.a(this);
    }
}
