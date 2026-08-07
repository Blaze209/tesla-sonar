package com.google.android.libraries.places.internal;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes5.dex */
public final class zzlz {
    private static final String[] zza;
    private static final zzmd zzb;

    static {
        zzmd zzmeVar;
        String[] strArr = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
        zza = strArr;
        for (int i11 = 0; i11 < 2; i11++) {
            zzmeVar = null;
            try {
                zzmeVar = (zzmd) Class.forName(strArr[i11]).asSubclass(zzmd.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzmeVar != null) {
                zzb = zzmeVar;
            }
        }
        zzmeVar = new zzme();
        zzb = zzmeVar;
    }

    @NullableDecl
    public static StackTraceElement zza(Class cls, int i11) {
        zzma.zza(cls, "target");
        return zzb.zza(cls, 2);
    }
}
