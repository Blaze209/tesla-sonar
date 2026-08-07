package com.reactnativecommunity.asyncstorage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
@xn.a(name = AsyncStorageModule.NAME)
public final class AsyncStorageModule extends NativeAsyncStorageModuleSpec {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "RNCAsyncStorage";
    private final h executor;
    private g mReactDatabaseSupplier;
    private boolean mShuttingDown;

    class a extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f48450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f48451b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f48450a = callback;
            this.f48451b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f48450a.invoke(com.reactnativecommunity.asyncstorage.b.a(null), null);
                return;
            }
            String[] strArr = {Action.KEY_ATTRIBUTE, "value"};
            HashSet<String> hashSet = new HashSet();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (int i11 = 0; i11 < this.f48451b.size(); i11 += 999) {
                int iMin = Math.min(this.f48451b.size() - i11, 999);
                Cursor cursorQuery = AsyncStorageModule.this.mReactDatabaseSupplier.t().query("catalystLocalStorage", strArr, com.reactnativecommunity.asyncstorage.a.a(iMin), com.reactnativecommunity.asyncstorage.a.b(this.f48451b, i11, iMin), null, null, null);
                hashSet.clear();
                try {
                    try {
                        if (cursorQuery.getCount() != this.f48451b.size()) {
                            for (int i12 = i11; i12 < i11 + iMin; i12++) {
                                hashSet.add(this.f48451b.getString(i12));
                            }
                        }
                        if (cursorQuery.moveToFirst()) {
                            do {
                                WritableArray writableArrayCreateArray2 = Arguments.createArray();
                                writableArrayCreateArray2.pushString(cursorQuery.getString(0));
                                writableArrayCreateArray2.pushString(cursorQuery.getString(1));
                                writableArrayCreateArray.pushArray(writableArrayCreateArray2);
                                hashSet.remove(cursorQuery.getString(0));
                            } while (cursorQuery.moveToNext());
                        }
                        cursorQuery.close();
                        for (String str : hashSet) {
                            WritableArray writableArrayCreateArray3 = Arguments.createArray();
                            writableArrayCreateArray3.pushString(str);
                            writableArrayCreateArray3.pushNull();
                            writableArrayCreateArray.pushArray(writableArrayCreateArray3);
                        }
                        hashSet.clear();
                    } catch (Exception e11) {
                        qk.a.J("ReactNative", e11.getMessage(), e11);
                        this.f48450a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e11.getMessage()), null);
                        cursorQuery.close();
                        return;
                    }
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
            this.f48450a.invoke(null, writableArrayCreateArray);
        }
    }

    class b extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f48453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f48454b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f48453a = callback;
            this.f48454b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code duplicated, block: B:55:0x014e  */
        /* JADX WARN: Code duplicated, block: B:56:0x0158  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f48453a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            SQLiteStatement sQLiteStatementCompileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.t().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.t().beginTransaction();
                    for (int i11 = 0; i11 < this.f48454b.size(); i11++) {
                        if (this.f48454b.getArray(i11).size() != 2) {
                            WritableMap writableMapD = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.t().endTransaction();
                                return;
                            } catch (Exception e11) {
                                e = e11;
                                qk.a.J("ReactNative", e.getMessage(), e);
                                if (writableMapD != null) {
                                    return;
                                }
                            }
                        } else if (this.f48454b.getArray(i11).getString(0) == null) {
                            WritableMap writableMapC = com.reactnativecommunity.asyncstorage.b.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.t().endTransaction();
                                return;
                            } catch (Exception e12) {
                                e = e12;
                                qk.a.J("ReactNative", e.getMessage(), e);
                                if (writableMapC != null) {
                                    return;
                                }
                            }
                        } else if (this.f48454b.getArray(i11).getString(1) == null) {
                            WritableMap writableMapD2 = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.t().endTransaction();
                                return;
                            } catch (Exception e13) {
                                e = e13;
                                qk.a.J("ReactNative", e.getMessage(), e);
                                if (writableMapD2 != null) {
                                    return;
                                }
                            }
                        } else {
                            sQLiteStatementCompileStatement.clearBindings();
                            sQLiteStatementCompileStatement.bindString(1, this.f48454b.getArray(i11).getString(0));
                            sQLiteStatementCompileStatement.bindString(2, this.f48454b.getArray(i11).getString(1));
                            sQLiteStatementCompileStatement.execute();
                        }
                        com.reactnativecommunity.asyncstorage.b.b(null, e.getMessage());
                        return;
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.t().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.t().endTransaction();
                    } catch (Exception e14) {
                        qk.a.J("ReactNative", e14.getMessage(), e14);
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e14.getMessage());
                    }
                } catch (Throwable th2) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.t().endTransaction();
                    } catch (Exception e15) {
                        qk.a.J("ReactNative", e15.getMessage(), e15);
                        com.reactnativecommunity.asyncstorage.b.b(null, e15.getMessage());
                    }
                    throw th2;
                }
            } catch (Exception e16) {
                qk.a.J("ReactNative", e16.getMessage(), e16);
                WritableMap writableMapB2 = com.reactnativecommunity.asyncstorage.b.b(null, e16.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.t().endTransaction();
                } catch (Exception e17) {
                    qk.a.J("ReactNative", e17.getMessage(), e17);
                    if (writableMapB2 == null) {
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e17.getMessage());
                    }
                    if (writableMapB != null) {
                        this.f48453a.invoke(writableMapB);
                    } else {
                        this.f48453a.invoke(new Object[0]);
                    }
                }
                writableMapB = writableMapB2;
            }
            if (writableMapB != null) {
                this.f48453a.invoke(writableMapB);
            } else {
                this.f48453a.invoke(new Object[0]);
            }
        }
    }

    class c extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f48456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f48457b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f48456a = callback;
            this.f48457b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f48456a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.t().beginTransaction();
                    for (int i11 = 0; i11 < this.f48457b.size(); i11 += 999) {
                        int iMin = Math.min(this.f48457b.size() - i11, 999);
                        AsyncStorageModule.this.mReactDatabaseSupplier.t().delete("catalystLocalStorage", com.reactnativecommunity.asyncstorage.a.a(iMin), com.reactnativecommunity.asyncstorage.a.b(this.f48457b, i11, iMin));
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.t().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.t().endTransaction();
                    } catch (Exception e11) {
                        qk.a.J("ReactNative", e11.getMessage(), e11);
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e11.getMessage());
                    }
                } catch (Exception e12) {
                    qk.a.J("ReactNative", e12.getMessage(), e12);
                    WritableMap writableMapB2 = com.reactnativecommunity.asyncstorage.b.b(null, e12.getMessage());
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.t().endTransaction();
                    } catch (Exception e13) {
                        qk.a.J("ReactNative", e13.getMessage(), e13);
                        if (writableMapB2 == null) {
                            writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e13.getMessage());
                        }
                        if (writableMapB != null) {
                            this.f48456a.invoke(writableMapB);
                        } else {
                            this.f48456a.invoke(new Object[0]);
                        }
                    }
                    writableMapB = writableMapB2;
                }
                if (writableMapB != null) {
                    this.f48456a.invoke(writableMapB);
                } else {
                    this.f48456a.invoke(new Object[0]);
                }
            } catch (Throwable th2) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.t().endTransaction();
                } catch (Exception e14) {
                    qk.a.J("ReactNative", e14.getMessage(), e14);
                    com.reactnativecommunity.asyncstorage.b.b(null, e14.getMessage());
                }
                throw th2;
            }
        }
    }

    class d extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f48459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f48460b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f48459a = callback;
            this.f48460b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code duplicated, block: B:64:0x0160  */
        /* JADX WARN: Code duplicated, block: B:65:0x016a  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f48459a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.t().beginTransaction();
                    for (int i11 = 0; i11 < this.f48460b.size(); i11++) {
                        if (this.f48460b.getArray(i11).size() != 2) {
                            WritableMap writableMapD = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.t().endTransaction();
                                return;
                            } catch (Exception e11) {
                                e = e11;
                                qk.a.J("ReactNative", e.getMessage(), e);
                                if (writableMapD != null) {
                                    return;
                                }
                            }
                        } else if (this.f48460b.getArray(i11).getString(0) == null) {
                            WritableMap writableMapC = com.reactnativecommunity.asyncstorage.b.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.t().endTransaction();
                                return;
                            } catch (Exception e12) {
                                e = e12;
                                qk.a.J("ReactNative", e.getMessage(), e);
                                if (writableMapC != null) {
                                    return;
                                }
                            }
                        } else if (this.f48460b.getArray(i11).getString(1) == null) {
                            WritableMap writableMapD2 = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.t().endTransaction();
                                return;
                            } catch (Exception e13) {
                                e = e13;
                                qk.a.J("ReactNative", e.getMessage(), e);
                                if (writableMapD2 != null) {
                                    return;
                                }
                            }
                        } else if (!com.reactnativecommunity.asyncstorage.a.e(AsyncStorageModule.this.mReactDatabaseSupplier.t(), this.f48460b.getArray(i11).getString(0), this.f48460b.getArray(i11).getString(1))) {
                            WritableMap writableMapA = com.reactnativecommunity.asyncstorage.b.a(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.t().endTransaction();
                                return;
                            } catch (Exception e14) {
                                e = e14;
                                qk.a.J("ReactNative", e.getMessage(), e);
                                if (writableMapA != null) {
                                    return;
                                }
                            }
                        }
                        com.reactnativecommunity.asyncstorage.b.b(null, e.getMessage());
                        return;
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.t().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.t().endTransaction();
                    } catch (Exception e15) {
                        qk.a.J("ReactNative", e15.getMessage(), e15);
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e15.getMessage());
                    }
                } catch (Throwable th2) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.t().endTransaction();
                    } catch (Exception e16) {
                        qk.a.J("ReactNative", e16.getMessage(), e16);
                        com.reactnativecommunity.asyncstorage.b.b(null, e16.getMessage());
                    }
                    throw th2;
                }
            } catch (Exception e17) {
                qk.a.J("ReactNative", e17.getMessage(), e17);
                WritableMap writableMapB2 = com.reactnativecommunity.asyncstorage.b.b(null, e17.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.t().endTransaction();
                } catch (Exception e18) {
                    qk.a.J("ReactNative", e18.getMessage(), e18);
                    if (writableMapB2 == null) {
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e18.getMessage());
                    }
                    if (writableMapB != null) {
                        this.f48459a.invoke(writableMapB);
                    } else {
                        this.f48459a.invoke(new Object[0]);
                    }
                }
                writableMapB = writableMapB2;
            }
            if (writableMapB != null) {
                this.f48459a.invoke(writableMapB);
            } else {
                this.f48459a.invoke(new Object[0]);
            }
        }
    }

    class e extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f48462a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f48462a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.mReactDatabaseSupplier.p()) {
                this.f48462a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.c();
                this.f48462a.invoke(new Object[0]);
            } catch (Exception e11) {
                qk.a.J("ReactNative", e11.getMessage(), e11);
                this.f48462a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e11.getMessage()));
            }
        }
    }

    class f extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f48464a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f48464a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f48464a.invoke(com.reactnativecommunity.asyncstorage.b.a(null), null);
                return;
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Cursor cursorQuery = AsyncStorageModule.this.mReactDatabaseSupplier.t().query("catalystLocalStorage", new String[]{Action.KEY_ATTRIBUTE}, null, null, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        do {
                            writableArrayCreateArray.pushString(cursorQuery.getString(0));
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                    this.f48464a.invoke(null, writableArrayCreateArray);
                } catch (Exception e11) {
                    qk.a.J("ReactNative", e11.getMessage(), e11);
                    this.f48464a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e11.getMessage()), null);
                    cursorQuery.close();
                }
            } catch (Throwable th2) {
                cursorQuery.close();
                throw th2;
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.p();
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void clear(Callback callback) {
        new e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void getAllKeys(Callback callback) {
        new f(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mShuttingDown = true;
        this.mReactDatabaseSupplier.n();
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(com.reactnativecommunity.asyncstorage.b.c(null), null);
        } else {
            new a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) throws Throwable {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        com.reactnativecommunity.asyncstorage.d.g(reactApplicationContext);
        this.executor = new h(executor);
        this.mReactDatabaseSupplier = g.B(reactApplicationContext);
    }
}
