package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* JADX INFO: loaded from: classes9.dex */
public enum f implements q {
    INSTANCE;

    private RuntimeException getStubException() {
        return new IllegalStateException("Object is no longer managed by Realm. Has it been deleted?");
    }

    public void checkIfAttached() {
        throw getStubException();
    }

    public long createEmbeddedObject(long j11, RealmFieldType realmFieldType) {
        throw getStubException();
    }

    public q freeze(OsSharedRealm osSharedRealm) {
        return INSTANCE;
    }

    @Override // io.realm.internal.q
    public byte[] getBinaryByteArray(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public boolean getBoolean(long j11) {
        throw getStubException();
    }

    public long getColumnCount() {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public long getColumnKey(String str) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public String[] getColumnNames() {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public RealmFieldType getColumnType(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public Date getDate(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public Decimal128 getDecimal128(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public double getDouble(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public float getFloat(long j11) {
        throw getStubException();
    }

    public long getLink(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public long getLong(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public OsList getModelList(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public OsMap getModelMap(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public OsSet getModelSet(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public NativeRealmAny getNativeRealmAny(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public ObjectId getObjectId(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public long getObjectKey() {
        throw getStubException();
    }

    public OsMap getRealmAnyMap(long j11) {
        throw getStubException();
    }

    public OsSet getRealmAnySet(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public String getString(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public Table getTable() {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public UUID getUUID(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public OsList getValueList(long j11, RealmFieldType realmFieldType) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public OsMap getValueMap(long j11, RealmFieldType realmFieldType) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public OsSet getValueSet(long j11, RealmFieldType realmFieldType) {
        throw getStubException();
    }

    public boolean hasColumn(String str) {
        throw getStubException();
    }

    public boolean isLoaded() {
        return true;
    }

    @Override // io.realm.internal.q
    public boolean isNull(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public boolean isNullLink(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public boolean isValid() {
        return false;
    }

    public void nullifyLink(long j11) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public void setBinaryByteArray(long j11, byte[] bArr) {
        throw getStubException();
    }

    public void setBoolean(long j11, boolean z11) {
        throw getStubException();
    }

    public void setDate(long j11, Date date) {
        throw getStubException();
    }

    public void setDecimal128(long j11, Decimal128 decimal128) {
        throw getStubException();
    }

    public void setDouble(long j11, double d11) {
        throw getStubException();
    }

    public void setFloat(long j11, float f11) {
        throw getStubException();
    }

    public void setLink(long j11, long j12) {
        throw getStubException();
    }

    public void setLong(long j11, long j12) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public void setNull(long j11) {
        throw getStubException();
    }

    public void setObjectId(long j11, ObjectId objectId) {
        throw getStubException();
    }

    public void setRealmAny(long j11, long j12) {
        throw getStubException();
    }

    @Override // io.realm.internal.q
    public void setString(long j11, String str) {
        throw getStubException();
    }

    public void setUUID(long j11, UUID uuid) {
        throw getStubException();
    }
}
