package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.exceptions.RealmException;
import io.realm.n0;
import io.realm.q0;
import io.realm.t;
import java.util.UUID;
import org.bson.types.ObjectId;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class OsObject implements h {
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;
    private j<b> observerPairs = new j<>();

    private static class a implements j.a<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f78994a;

        a(String[] strArr) {
            this.f78994a = strArr;
        }

        private t b() {
            String[] strArr = this.f78994a;
            boolean z11 = strArr == null;
            if (z11) {
                strArr = new String[0];
            }
            return new c(strArr, z11);
        }

        @Override // io.realm.internal.j.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(b bVar, Object obj) {
            bVar.a((n0) obj, b());
        }
    }

    public static class b<T extends n0> extends j.b<T, q0<T>> {
        public b(T t11, q0<T> q0Var) {
            super(t11, q0Var);
        }

        public void a(T t11, t tVar) {
            ((q0) this.f79088b).a(t11, tVar);
        }
    }

    private static class c implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String[] f78995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f78996b;

        c(String[] strArr, boolean z11) {
            this.f78995a = strArr;
            this.f78996b = z11;
        }
    }

    public OsObject(OsSharedRealm osSharedRealm, UncheckedRow uncheckedRow) {
        this.nativePtr = nativeCreate(osSharedRealm.getNativePtr(), uncheckedRow.getNativePtr());
        osSharedRealm.context.a(this);
    }

    public static UncheckedRow create(Table table) {
        return new UncheckedRow(table.p().context, table, nativeCreateNewObject(table.getNativePtr()));
    }

    public static long createEmbeddedObject(Table table, long j11, long j12) {
        return nativeCreateEmbeddedObject(table.getNativePtr(), j11, j12);
    }

    public static long createRow(Table table) {
        return nativeCreateRow(table.getNativePtr());
    }

    public static long createRowWithPrimaryKey(Table table, long j11, Object obj) {
        RealmFieldType realmFieldTypeM = table.m(j11);
        OsSharedRealm osSharedRealmP = table.p();
        if (realmFieldTypeM == RealmFieldType.STRING) {
            if (obj == null || (obj instanceof String)) {
                return nativeCreateRowWithStringPrimaryKey(osSharedRealmP.getNativePtr(), table.getNativePtr(), j11, (String) obj);
            }
            throw new IllegalArgumentException("Primary key value is not a String: " + obj);
        }
        if (realmFieldTypeM == RealmFieldType.INTEGER) {
            return nativeCreateRowWithLongPrimaryKey(osSharedRealmP.getNativePtr(), table.getNativePtr(), j11, obj == null ? 0L : Long.parseLong(obj.toString()), obj == null);
        }
        if (realmFieldTypeM == RealmFieldType.OBJECT_ID) {
            if (obj == null || (obj instanceof ObjectId)) {
                return nativeCreateRowWithObjectIdPrimaryKey(osSharedRealmP.getNativePtr(), table.getNativePtr(), j11, obj != null ? obj.toString() : null);
            }
            throw new IllegalArgumentException("Primary key value is not an ObjectId: " + obj);
        }
        if (realmFieldTypeM != RealmFieldType.UUID) {
            throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + realmFieldTypeM);
        }
        if (obj == null || (obj instanceof UUID)) {
            return nativeCreateRowWithUUIDPrimaryKey(osSharedRealmP.getNativePtr(), table.getNativePtr(), j11, obj != null ? obj.toString() : null);
        }
        throw new IllegalArgumentException("Primary key value is not an UUID: " + obj);
    }

    public static UncheckedRow createWithPrimaryKey(Table table, Object obj) {
        long andVerifyPrimaryKeyColumnIndex = getAndVerifyPrimaryKeyColumnIndex(table);
        RealmFieldType realmFieldTypeM = table.m(andVerifyPrimaryKeyColumnIndex);
        OsSharedRealm osSharedRealmP = table.p();
        if (realmFieldTypeM == RealmFieldType.STRING) {
            if (obj == null || (obj instanceof String)) {
                return new UncheckedRow(osSharedRealmP.context, table, nativeCreateNewObjectWithStringPrimaryKey(osSharedRealmP.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, (String) obj));
            }
            throw new IllegalArgumentException("Primary key value is not a String: " + obj);
        }
        if (realmFieldTypeM == RealmFieldType.INTEGER) {
            return new UncheckedRow(osSharedRealmP.context, table, nativeCreateNewObjectWithLongPrimaryKey(osSharedRealmP.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj == null ? 0L : Long.parseLong(obj.toString()), obj == null));
        }
        if (realmFieldTypeM == RealmFieldType.OBJECT_ID) {
            return new UncheckedRow(osSharedRealmP.context, table, nativeCreateNewObjectWithObjectIdPrimaryKey(osSharedRealmP.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj != null ? obj.toString() : null));
        }
        if (realmFieldTypeM == RealmFieldType.UUID) {
            return new UncheckedRow(osSharedRealmP.context, table, nativeCreateNewObjectWithUUIDPrimaryKey(osSharedRealmP.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj != null ? obj.toString() : null));
        }
        throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + realmFieldTypeM);
    }

    private static long getAndVerifyPrimaryKeyColumnIndex(Table table) {
        String strB = OsObjectStore.b(table.p(), table.g());
        if (strB != null) {
            return table.j(strB);
        }
        throw new IllegalStateException(table.o() + " has no primary key defined.");
    }

    private static native long nativeCreate(long j11, long j12);

    private static native long nativeCreateEmbeddedObject(long j11, long j12, long j13);

    private static native long nativeCreateNewObject(long j11);

    private static native long nativeCreateNewObjectWithLongPrimaryKey(long j11, long j12, long j13, long j14, boolean z11);

    private static native long nativeCreateNewObjectWithObjectIdPrimaryKey(long j11, long j12, long j13, String str);

    private static native long nativeCreateNewObjectWithStringPrimaryKey(long j11, long j12, long j13, String str);

    private static native long nativeCreateNewObjectWithUUIDPrimaryKey(long j11, long j12, long j13, String str);

    private static native long nativeCreateRow(long j11);

    private static native long nativeCreateRowWithLongPrimaryKey(long j11, long j12, long j13, long j14, boolean z11);

    private static native long nativeCreateRowWithObjectIdPrimaryKey(long j11, long j12, long j13, String str);

    private static native long nativeCreateRowWithStringPrimaryKey(long j11, long j12, long j13, String str);

    private static native long nativeCreateRowWithUUIDPrimaryKey(long j11, long j12, long j13, String str);

    private static native long nativeGetFinalizerPtr();

    private native void nativeStartListening(long j11);

    private native void nativeStopListening(long j11);

    private void notifyChangeListeners(String[] strArr) {
        this.observerPairs.c(new a(strArr));
    }

    public <T extends n0> void addListener(T t11, q0<T> q0Var) {
        if (this.observerPairs.d()) {
            nativeStartListening(this.nativePtr);
        }
        this.observerPairs.a(new b(t11, q0Var));
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.nativePtr;
    }

    public <T extends n0> void removeListener(T t11) {
        this.observerPairs.f(t11);
        if (this.observerPairs.d()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public void setObserverPairs(j<b> jVar) {
        if (!this.observerPairs.d()) {
            throw new IllegalStateException("'observerPairs' is not empty. Listeners have been added before.");
        }
        this.observerPairs = jVar;
        if (jVar.d()) {
            return;
        }
        nativeStartListening(this.nativePtr);
    }

    public <T extends n0> void removeListener(T t11, q0<T> q0Var) {
        this.observerPairs.e(t11, q0Var);
        if (this.observerPairs.d()) {
            nativeStopListening(this.nativePtr);
        }
    }
}
