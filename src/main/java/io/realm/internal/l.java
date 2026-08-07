package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.h0;
import io.realm.internal.core.NativeRealmAny;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* JADX INFO: loaded from: classes9.dex */
public class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OsSharedRealm f79090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OsResults f79091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h0<l> f79092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference<a> f79093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f79094e;

    public interface a {
        void a(q qVar);
    }

    private void a() {
        this.f79091b.q(this, this.f79092c);
        this.f79091b = null;
        this.f79092c = null;
        this.f79090a.removePendingRow(this);
    }

    private void c() {
        WeakReference<a> weakReference = this.f79093d;
        if (weakReference == null) {
            throw new IllegalStateException("The 'frontEnd' has not been set.");
        }
        a aVar = weakReference.get();
        if (aVar == null) {
            a();
            return;
        }
        if (!this.f79091b.n()) {
            a();
            return;
        }
        UncheckedRow uncheckedRowH = this.f79091b.h();
        a();
        if (uncheckedRowH == null) {
            aVar.a(f.INSTANCE);
            return;
        }
        if (this.f79094e) {
            uncheckedRowH = CheckedRow.e(uncheckedRowH);
        }
        aVar.a(uncheckedRowH);
    }

    public void b() {
        if (this.f79091b == null) {
            throw new IllegalStateException("The query has been executed. This 'PendingRow' is not valid anymore.");
        }
        c();
    }

    @Override // io.realm.internal.q
    public byte[] getBinaryByteArray(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public boolean getBoolean(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public long getColumnKey(String str) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public String[] getColumnNames() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public RealmFieldType getColumnType(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public Date getDate(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public Decimal128 getDecimal128(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public double getDouble(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public float getFloat(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public long getLong(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public OsList getModelList(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public OsMap getModelMap(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public OsSet getModelSet(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public NativeRealmAny getNativeRealmAny(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public ObjectId getObjectId(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public long getObjectKey() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public String getString(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public Table getTable() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public UUID getUUID(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public OsList getValueList(long j11, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public OsMap getValueMap(long j11, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public OsSet getValueSet(long j11, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public boolean isNull(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public boolean isNullLink(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public boolean isValid() {
        return false;
    }

    @Override // io.realm.internal.q
    public void setBinaryByteArray(long j11, byte[] bArr) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public void setNull(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.q
    public void setString(long j11, String str) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
}
