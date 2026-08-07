package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes5.dex */
final class zzkv {
    private static final zzkx zza = zzb(zzkx.zzd);

    private static zzkx zzb(String[] strArr) {
        zzkx zzkxVarZza;
        try {
            zzkxVarZza = zzky.zza();
        } catch (NoClassDefFoundError unused) {
            zzkxVarZza = null;
        }
        if (zzkxVarZza != null) {
            return zzkxVarZza;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zzkx) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb2.append('\n');
                sb2.append(str);
                sb2.append(": ");
                sb2.append(th);
            }
        }
        throw new IllegalStateException(sb2.insert(0, "No logging platforms found:").toString());
    }
}
