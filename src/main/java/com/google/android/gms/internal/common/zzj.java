package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public final class zzj {
    public static Object zza(Class cls, String str, zzi... zziVarArr) {
        return zzc(cls, "isIsolated", null, false, zziVarArr);
    }

    public static Object zzb(String str, String str2, ClassLoader classLoader, zzi... zziVarArr) {
        return zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, zziVarArr);
    }

    private static Object zzc(Class cls, String str, Object obj, boolean z11, zzi... zziVarArr) {
        int length = zziVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i11 = 0; i11 < zziVarArr.length; i11++) {
            zzi zziVar = zziVarArr[i11];
            zziVar.getClass();
            clsArr[i11] = zziVar.zzc();
            objArr[i11] = zziVarArr[i11].zzd();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
