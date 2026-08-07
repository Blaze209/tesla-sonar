package io.realm.internal;

import ch.qos.logback.core.CoreConstants;
import io.realm.RealmFieldType;
import io.realm.exceptions.RealmError;
import io.realm.i0;
import io.realm.internal.android.AndroidRealmNotifier;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public final class OsSharedRealm implements Closeable, h {
    public static final byte FILE_EXCEPTION_INCOMPATIBLE_SYNC_FILE = 7;
    public static final byte FILE_EXCEPTION_KIND_ACCESS_ERROR = 0;
    public static final byte FILE_EXCEPTION_KIND_BAD_HISTORY = 1;
    public static final byte FILE_EXCEPTION_KIND_EXISTS = 3;
    public static final byte FILE_EXCEPTION_KIND_FORMAT_UPGRADE_REQUIRED = 6;
    public static final byte FILE_EXCEPTION_KIND_INCOMPATIBLE_LOCK_FILE = 5;
    public static final byte FILE_EXCEPTION_KIND_NOT_FOUND = 4;
    public static final byte FILE_EXCEPTION_KIND_PERMISSION_DENIED = 2;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private static final List<OsSharedRealm> sharedRealmsUnderConstruction = new CopyOnWriteArrayList();
    private static volatile File temporaryDirectory;
    public final io.realm.internal.a capabilities;
    public final g context;
    final List<WeakReference<OsResults.a>> iterators;
    private final long nativePtr;
    private final OsRealmConfig osRealmConfig;
    private final List<WeakReference<l>> pendingRows;
    public final RealmNotifier realmNotifier;
    private final OsSchemaInfo schemaInfo;
    private final List<OsSharedRealm> tempSharedRealmsForCallback;

    @Keep
    public interface InitializationCallback {
        void onInit(OsSharedRealm osSharedRealm);
    }

    @Keep
    public interface MigrationCallback {
        void onMigrationNeeded(OsSharedRealm osSharedRealm, long j11, long j12);
    }

    @Keep
    public interface SchemaChangedCallback {
        void onSchemaChanged();
    }

    public static class a implements Comparable<a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f79041c = new a(-1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f79042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f79043b;

        a(long j11, long j12) {
            this.f79042a = j11;
            this.f79043b = j12;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("Version cannot be compared to a null value.");
            }
            long j11 = this.f79042a;
            long j12 = aVar.f79042a;
            if (j11 > j12) {
                return 1;
            }
            return j11 < j12 ? -1 : 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f79042a == aVar.f79042a && this.f79043b == aVar.f79043b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            long j11 = this.f79042a;
            int i11 = ((int) (j11 ^ (j11 >>> 32))) * 31;
            long j12 = this.f79043b;
            return i11 + ((int) ((j12 >>> 32) ^ j12));
        }

        public String toString() {
            return "VersionID{version=" + this.f79042a + ", index=" + this.f79043b + CoreConstants.CURLY_RIGHT;
        }
    }

    private OsSharedRealm(OsRealmConfig osRealmConfig, a aVar) {
        ArrayList arrayList = new ArrayList();
        this.tempSharedRealmsForCallback = arrayList;
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        an0.a aVar2 = new an0.a();
        AndroidRealmNotifier androidRealmNotifier = new AndroidRealmNotifier(this, aVar2);
        g gVarA = osRealmConfig.a();
        this.context = gVarA;
        List<OsSharedRealm> list = sharedRealmsUnderConstruction;
        list.add(this);
        try {
            long jNativeGetSharedRealm = nativeGetSharedRealm(osRealmConfig.getNativePtr(), aVar.f79042a, aVar.f79043b, androidRealmNotifier);
            this.nativePtr = jNativeGetSharedRealm;
            arrayList.clear();
            list.remove(this);
            this.osRealmConfig = osRealmConfig;
            this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(jNativeGetSharedRealm), this);
            gVarA.a(this);
            this.capabilities = aVar2;
            this.realmNotifier = androidRealmNotifier;
            if (aVar.equals(a.f79041c)) {
                nativeSetAutoRefresh(jNativeGetSharedRealm, aVar2.b());
            }
        } catch (Throwable th2) {
            try {
                for (OsSharedRealm osSharedRealm : this.tempSharedRealmsForCallback) {
                    if (!osSharedRealm.isClosed()) {
                        osSharedRealm.close();
                    }
                }
                throw th2;
            } catch (Throwable th3) {
                this.tempSharedRealmsForCallback.clear();
                sharedRealmsUnderConstruction.remove(this);
                throw th3;
            }
        }
    }

    private void detachIterators() {
        Iterator<WeakReference<OsResults.a>> it = this.iterators.iterator();
        while (it.hasNext()) {
            OsResults.a aVar = it.next().get();
            if (aVar != null) {
                aVar.b();
            }
        }
        this.iterators.clear();
    }

    private void executePendingRowQueries() {
        Iterator<WeakReference<l>> it = this.pendingRows.iterator();
        while (it.hasNext()) {
            l lVar = it.next().get();
            if (lVar != null) {
                lVar.b();
            }
        }
        this.pendingRows.clear();
    }

    public static OsSharedRealm getInstance(i0 i0Var, a aVar) {
        return getInstance(new OsRealmConfig.b(i0Var), aVar);
    }

    public static File getTemporaryDirectory() {
        return temporaryDirectory;
    }

    public static void initialize(File file) {
        if (temporaryDirectory != null) {
            return;
        }
        String absolutePath = file.getAbsolutePath();
        if (!file.isDirectory() && !file.mkdirs() && !file.isDirectory()) {
            throw new IOException("failed to create temporary directory: " + absolutePath);
        }
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        nativeInit(absolutePath);
        temporaryDirectory = file;
    }

    private static native void nativeBeginTransaction(long j11);

    private static native void nativeCancelTransaction(long j11);

    private static native void nativeCloseSharedRealm(long j11);

    private static native void nativeCommitTransaction(long j11);

    private static native boolean nativeCompact(long j11);

    private static native long nativeCreateTable(long j11, String str);

    private static native long nativeCreateTableWithPrimaryKeyField(long j11, String str, String str2, int i11, boolean z11);

    private static native long nativeFreeze(long j11);

    private static native long nativeGetActiveSubscriptionSet(long j11);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetLatestSubscriptionSet(long j11);

    private static native long nativeGetSchemaInfo(long j11);

    private static native long nativeGetSharedRealm(long j11, long j12, long j13, RealmNotifier realmNotifier);

    private static native long nativeGetTableRef(long j11, String str);

    private static native String[] nativeGetTablesName(long j11);

    private static native long[] nativeGetVersionID(long j11);

    private static native boolean nativeHasTable(long j11, String str);

    private static native void nativeInit(String str);

    private static native boolean nativeIsAutoRefresh(long j11);

    private static native boolean nativeIsClosed(long j11);

    private static native boolean nativeIsEmpty(long j11);

    private static native boolean nativeIsFrozen(long j11);

    private static native boolean nativeIsInTransaction(long j11);

    private static native long nativeNumberOfVersions(long j11);

    private static native void nativeRefresh(long j11);

    private static native void nativeRegisterSchemaChangedCallback(long j11, SchemaChangedCallback schemaChangedCallback);

    private static native void nativeRenameTable(long j11, String str, String str2);

    private static native void nativeSetAutoRefresh(long j11, boolean z11);

    private static native long nativeSize(long j11);

    private static native void nativeStopWaitForChange(long j11);

    private static native boolean nativeWaitForChange(long j11);

    private static native void nativeWriteCopy(long j11, String str, byte[] bArr);

    private static void runInitializationCallback(long j11, OsRealmConfig osRealmConfig, InitializationCallback initializationCallback) {
        initializationCallback.onInit(new OsSharedRealm(j11, osRealmConfig));
    }

    private static void runMigrationCallback(long j11, OsRealmConfig osRealmConfig, MigrationCallback migrationCallback, long j12) {
        migrationCallback.onMigrationNeeded(new OsSharedRealm(j11, osRealmConfig), j12, osRealmConfig.c().o());
    }

    void addIterator(OsResults.a aVar) {
        this.iterators.add(new WeakReference<>(aVar));
    }

    void addPendingRow(l lVar) {
        this.pendingRows.add(new WeakReference<>(lVar));
    }

    public void beginTransaction() {
        detachIterators();
        executePendingRowQueries();
        nativeBeginTransaction(this.nativePtr);
    }

    public void cancelTransaction() {
        nativeCancelTransaction(this.nativePtr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RealmNotifier realmNotifier = this.realmNotifier;
        if (realmNotifier != null) {
            realmNotifier.close();
        }
        synchronized (this.context) {
            nativeCloseSharedRealm(this.nativePtr);
        }
    }

    public void commitTransaction() {
        nativeCommitTransaction(this.nativePtr);
    }

    public boolean compact() {
        return nativeCompact(this.nativePtr);
    }

    public Table createTable(String str) {
        return new Table(this, nativeCreateTable(this.nativePtr, str));
    }

    public Table createTableWithPrimaryKey(String str, String str2, RealmFieldType realmFieldType, boolean z11) {
        return new Table(this, nativeCreateTableWithPrimaryKeyField(this.nativePtr, str, str2, realmFieldType.getNativeValue(), z11));
    }

    public OsSharedRealm freeze() {
        return new OsSharedRealm(this.osRealmConfig, getVersionID());
    }

    public i0 getConfiguration() {
        return this.osRealmConfig.c();
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.nativePtr;
    }

    public long getNumberOfVersions() {
        return nativeNumberOfVersions(this.nativePtr);
    }

    public String getPath() {
        return this.osRealmConfig.c().k();
    }

    public OsSchemaInfo getSchemaInfo() {
        return this.schemaInfo;
    }

    public Table getTable(String str) {
        return new Table(this, nativeGetTableRef(this.nativePtr, str));
    }

    public String[] getTablesNames() {
        String[] strArrNativeGetTablesName = nativeGetTablesName(this.nativePtr);
        return strArrNativeGetTablesName != null ? strArrNativeGetTablesName : new String[0];
    }

    public a getVersionID() {
        long[] jArrNativeGetVersionID = nativeGetVersionID(this.nativePtr);
        if (jArrNativeGetVersionID != null) {
            return new a(jArrNativeGetVersionID[0], jArrNativeGetVersionID[1]);
        }
        throw new IllegalStateException("Cannot get versionId, this could be related to a non existing read/write transaction");
    }

    public boolean hasTable(String str) {
        return nativeHasTable(this.nativePtr, str);
    }

    void invalidateIterators() {
        Iterator<WeakReference<OsResults.a>> it = this.iterators.iterator();
        while (it.hasNext()) {
            OsResults.a aVar = it.next().get();
            if (aVar != null) {
                aVar.e();
            }
        }
        this.iterators.clear();
    }

    public boolean isAutoRefresh() {
        return nativeIsAutoRefresh(this.nativePtr);
    }

    public boolean isClosed() {
        return nativeIsClosed(this.nativePtr);
    }

    public boolean isEmpty() {
        return nativeIsEmpty(this.nativePtr);
    }

    public boolean isFrozen() {
        return nativeIsFrozen(this.nativePtr);
    }

    public boolean isInTransaction() {
        return nativeIsInTransaction(this.nativePtr);
    }

    public boolean isSyncRealm() {
        return this.osRealmConfig.d() != null;
    }

    public void refresh() {
        if (isFrozen()) {
            throw new IllegalStateException("It is not possible to refresh frozen Realms.");
        }
        nativeRefresh(this.nativePtr);
    }

    public void registerSchemaChangedCallback(SchemaChangedCallback schemaChangedCallback) {
        nativeRegisterSchemaChangedCallback(this.nativePtr, schemaChangedCallback);
    }

    void removePendingRow(l lVar) {
        for (WeakReference<l> weakReference : this.pendingRows) {
            l lVar2 = weakReference.get();
            if (lVar2 == null || lVar2 == lVar) {
                this.pendingRows.remove(weakReference);
            }
        }
    }

    public void renameTable(String str, String str2) {
        try {
            nativeRenameTable(this.nativePtr, str, str2);
        } catch (IllegalArgumentException e11) {
            throw new RealmError(e11.getMessage());
        }
    }

    public void setAutoRefresh(boolean z11) {
        this.capabilities.c(null);
        nativeSetAutoRefresh(this.nativePtr, z11);
    }

    public long size() {
        return nativeSize(this.nativePtr);
    }

    public void stopWaitForChange() {
        nativeStopWaitForChange(this.nativePtr);
    }

    public boolean waitForChange() {
        return nativeWaitForChange(this.nativePtr);
    }

    public void writeCopy(File file, byte[] bArr) {
        if (file.isFile() && file.exists()) {
            throw new IllegalArgumentException("The destination file must not exist");
        }
        if (isSyncRealm()) {
            Util.a("writeCopyTo() cannot be called from the main thread when using synchronized Realms.");
        }
        try {
            nativeWriteCopy(this.nativePtr, file.getAbsolutePath(), bArr);
        } catch (RuntimeException e11) {
            String message = e11.getMessage();
            if (!message.contains("Could not write file as not all client changes are integrated in server")) {
                throw e11;
            }
            throw new IllegalStateException(message);
        }
    }

    public static OsSharedRealm getInstance(OsRealmConfig.b bVar, a aVar) {
        OsRealmConfig osRealmConfigB = bVar.b();
        i.e().j(osRealmConfigB);
        return new OsSharedRealm(osRealmConfigB, aVar);
    }

    OsSharedRealm(long j11, OsRealmConfig osRealmConfig) {
        this(j11, osRealmConfig, osRealmConfig.a());
        for (OsSharedRealm osSharedRealm : sharedRealmsUnderConstruction) {
            if (osSharedRealm.context == osRealmConfig.a()) {
                osSharedRealm.tempSharedRealmsForCallback.add(this);
                return;
            }
        }
        throw new IllegalStateException("Cannot find the parent 'OsSharedRealm' which is under construction.");
    }

    OsSharedRealm(long j11, OsRealmConfig osRealmConfig, g gVar) {
        this.tempSharedRealmsForCallback = new ArrayList();
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        this.nativePtr = j11;
        this.osRealmConfig = osRealmConfig;
        this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(j11), this);
        this.context = gVar;
        gVar.a(this);
        this.capabilities = new an0.a();
        this.realmNotifier = null;
        nativeSetAutoRefresh(j11, false);
    }
}
