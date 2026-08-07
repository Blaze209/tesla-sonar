package io.realm.internal;

import io.realm.i0;

/* JADX INFO: loaded from: classes9.dex */
public class OsObjectStore {
    public static boolean a(i0 i0Var, Runnable runnable) {
        return nativeCallWithLock(i0Var.k(), runnable);
    }

    public static String b(OsSharedRealm osSharedRealm, String str) {
        return nativeGetPrimaryKeyForObject(osSharedRealm.getNativePtr(), Util.d() + str);
    }

    public static long c(OsSharedRealm osSharedRealm) {
        return nativeGetSchemaVersion(osSharedRealm.getNativePtr());
    }

    public static void d(OsSharedRealm osSharedRealm, String str, String str2) {
        try {
            nativeSetPrimaryKeyForObject(osSharedRealm.getNativePtr(), Util.d() + str, str2);
        } catch (IllegalStateException e11) {
            throw new IllegalArgumentException(e11.getMessage());
        }
    }

    public static void e(OsSharedRealm osSharedRealm, long j11) {
        nativeSetSchemaVersion(osSharedRealm.getNativePtr(), j11);
    }

    private static native boolean nativeCallWithLock(String str, Runnable runnable);

    private static native boolean nativeDeleteTableForObject(long j11, String str);

    private static native String nativeGetPrimaryKeyForObject(long j11, String str);

    private static native long nativeGetSchemaVersion(long j11);

    private static native void nativeSetPrimaryKeyForObject(long j11, String str, String str2);

    private static native void nativeSetSchemaVersion(long j11, long j12);
}
