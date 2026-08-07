package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* JADX INFO: loaded from: classes9.dex */
public class UncheckedRow implements h, q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f79060d = nativeGetFinalizerPtr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final g f79061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Table f79062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f79063c;

    public UncheckedRow(g gVar, Table table, long j11) {
        this.f79061a = gVar;
        this.f79062b = table;
        this.f79063c = j11;
        gVar.a(this);
    }

    static UncheckedRow a(g gVar, Table table, long j11) {
        return new UncheckedRow(gVar, table, table.nativeGetRowPtr(table.getNativePtr(), j11));
    }

    static UncheckedRow b(g gVar, Table table, long j11) {
        return new UncheckedRow(gVar, table, j11);
    }

    private static native long nativeGetFinalizerPtr();

    public OsMap c(long j11) {
        return new OsMap(this, j11);
    }

    @Override // io.realm.internal.q
    public byte[] getBinaryByteArray(long j11) {
        return nativeGetByteArray(this.f79063c, j11);
    }

    @Override // io.realm.internal.q
    public boolean getBoolean(long j11) {
        return nativeGetBoolean(this.f79063c, j11);
    }

    @Override // io.realm.internal.q
    public long getColumnKey(String str) {
        if (str != null) {
            return nativeGetColumnKey(this.f79063c, str);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }

    @Override // io.realm.internal.q
    public String[] getColumnNames() {
        return nativeGetColumnNames(this.f79063c);
    }

    @Override // io.realm.internal.q
    public RealmFieldType getColumnType(long j11) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.f79063c, j11));
    }

    @Override // io.realm.internal.q
    public Date getDate(long j11) {
        return new Date(nativeGetTimestamp(this.f79063c, j11));
    }

    @Override // io.realm.internal.q
    public Decimal128 getDecimal128(long j11) {
        long[] jArrNativeGetDecimal128 = nativeGetDecimal128(this.f79063c, j11);
        if (jArrNativeGetDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(jArrNativeGetDecimal128[1], jArrNativeGetDecimal128[0]);
        }
        return null;
    }

    @Override // io.realm.internal.q
    public double getDouble(long j11) {
        return nativeGetDouble(this.f79063c, j11);
    }

    @Override // io.realm.internal.q
    public float getFloat(long j11) {
        return nativeGetFloat(this.f79063c, j11);
    }

    @Override // io.realm.internal.q
    public long getLong(long j11) {
        return nativeGetLong(this.f79063c, j11);
    }

    public OsList getModelList(long j11) {
        return new OsList(this, j11);
    }

    public OsMap getModelMap(long j11) {
        return new OsMap(this, j11);
    }

    public OsSet getModelSet(long j11) {
        return new OsSet(this, j11);
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f79060d;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f79063c;
    }

    @Override // io.realm.internal.q
    public NativeRealmAny getNativeRealmAny(long j11) {
        return new NativeRealmAny(nativeGetRealmAny(this.f79063c, j11));
    }

    @Override // io.realm.internal.q
    public ObjectId getObjectId(long j11) {
        return new ObjectId(nativeGetObjectId(this.f79063c, j11));
    }

    @Override // io.realm.internal.q
    public long getObjectKey() {
        return nativeGetObjectKey(this.f79063c);
    }

    @Override // io.realm.internal.q
    public String getString(long j11) {
        return nativeGetString(this.f79063c, j11);
    }

    @Override // io.realm.internal.q
    public Table getTable() {
        return this.f79062b;
    }

    @Override // io.realm.internal.q
    public UUID getUUID(long j11) {
        return UUID.fromString(nativeGetUUID(this.f79063c, j11));
    }

    public OsList getValueList(long j11, RealmFieldType realmFieldType) {
        return new OsList(this, j11);
    }

    public OsMap getValueMap(long j11, RealmFieldType realmFieldType) {
        return new OsMap(this, j11);
    }

    public OsSet getValueSet(long j11, RealmFieldType realmFieldType) {
        return new OsSet(this, j11);
    }

    public boolean isNull(long j11) {
        return nativeIsNull(this.f79063c, j11);
    }

    public boolean isNullLink(long j11) {
        return nativeIsNullLink(this.f79063c, j11);
    }

    @Override // io.realm.internal.q
    public boolean isValid() {
        long j11 = this.f79063c;
        return j11 != 0 && nativeIsValid(j11);
    }

    protected native long nativeCreateEmbeddedObject(long j11, long j12);

    protected native long nativeFreeze(long j11, long j12);

    protected native boolean nativeGetBoolean(long j11, long j12);

    protected native byte[] nativeGetByteArray(long j11, long j12);

    protected native long nativeGetColumnCount(long j11);

    protected native long nativeGetColumnKey(long j11, String str);

    protected native String[] nativeGetColumnNames(long j11);

    protected native int nativeGetColumnType(long j11, long j12);

    protected native long[] nativeGetDecimal128(long j11, long j12);

    protected native double nativeGetDouble(long j11, long j12);

    protected native float nativeGetFloat(long j11, long j12);

    protected native long nativeGetLink(long j11, long j12);

    protected native long nativeGetLong(long j11, long j12);

    protected native String nativeGetObjectId(long j11, long j12);

    protected native long nativeGetObjectKey(long j11);

    protected native long nativeGetRealmAny(long j11, long j12);

    protected native String nativeGetString(long j11, long j12);

    protected native long nativeGetTimestamp(long j11, long j12);

    protected native String nativeGetUUID(long j11, long j12);

    protected native boolean nativeHasColumn(long j11, String str);

    protected native boolean nativeIsNull(long j11, long j12);

    protected native boolean nativeIsNullLink(long j11, long j12);

    protected native boolean nativeIsValid(long j11);

    protected native void nativeNullifyLink(long j11, long j12);

    protected native void nativeSetBoolean(long j11, long j12, boolean z11);

    protected native void nativeSetByteArray(long j11, long j12, byte[] bArr);

    protected native void nativeSetDecimal128(long j11, long j12, long j13, long j14);

    protected native void nativeSetDouble(long j11, long j12, double d11);

    protected native void nativeSetFloat(long j11, long j12, float f11);

    protected native void nativeSetLink(long j11, long j12, long j13);

    protected native void nativeSetLong(long j11, long j12, long j13);

    protected native void nativeSetNull(long j11, long j12);

    protected native void nativeSetObjectId(long j11, long j12, String str);

    protected native void nativeSetRealmAny(long j11, long j12, long j13);

    protected native void nativeSetString(long j11, long j12, String str);

    protected native void nativeSetTimestamp(long j11, long j12, long j13);

    protected native void nativeSetUUID(long j11, long j12, String str);

    @Override // io.realm.internal.q
    public void setBinaryByteArray(long j11, byte[] bArr) {
        this.f79062b.c();
        nativeSetByteArray(this.f79063c, j11, bArr);
    }

    public void setNull(long j11) {
        this.f79062b.c();
        nativeSetNull(this.f79063c, j11);
    }

    @Override // io.realm.internal.q
    public void setString(long j11, String str) {
        this.f79062b.c();
        if (str == null) {
            nativeSetNull(this.f79063c, j11);
        } else {
            nativeSetString(this.f79063c, j11, str);
        }
    }

    UncheckedRow(UncheckedRow uncheckedRow) {
        this.f79061a = uncheckedRow.f79061a;
        this.f79062b = uncheckedRow.f79062b;
        this.f79063c = uncheckedRow.f79063c;
    }
}
