package com.google.android.gms.internal.mlkit_common;

import android.os.SystemClock;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.sdkinternal.l;
import com.google.mlkit.common.sdkinternal.n;
import qx.b;

/* JADX INFO: loaded from: classes5.dex */
public final class zzst {
    private static final GmsLogger zza = new GmsLogger("RemoteModelUtils", "");

    public static zznc zza(b bVar, n nVar, zzsj zzsjVar) {
        zzne zzneVar;
        l lVarZzb = zzsjVar.zzb();
        String strA = bVar.a();
        zzni zzniVar = new zzni();
        zznd zzndVar = new zznd();
        zzndVar.zzc(bVar.b());
        zzndVar.zzd(zznf.CLOUD);
        zzndVar.zza(zzu.zzb(strA));
        int iOrdinal = lVarZzb.ordinal();
        if (iOrdinal == 2) {
            zzneVar = zzne.BASE_TRANSLATE;
        } else if (iOrdinal != 4) {
            zzneVar = iOrdinal != 5 ? zzne.TYPE_UNKNOWN : zzne.BASE_DIGITAL_INK;
        } else {
            zzneVar = zzne.CUSTOM;
        }
        zzndVar.zzb(zzneVar);
        zzniVar.zzb(zzndVar.zzg());
        zznl zznlVarZzc = zzniVar.zzc();
        zzmz zzmzVar = new zzmz();
        zzmzVar.zzd(zzsjVar.zzc());
        zzmzVar.zzc(zzsjVar.zzd());
        zzmzVar.zzb(Long.valueOf(zzsjVar.zza()));
        zzmzVar.zzf(zznlVarZzc);
        if (zzsjVar.zzg()) {
            long jB = nVar.b(bVar);
            if (jB == 0) {
                zza.w("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                long jC = nVar.c(bVar);
                if (jC == 0) {
                    jC = SystemClock.elapsedRealtime();
                    nVar.d(bVar, jC);
                }
                zzmzVar.zzg(Long.valueOf(jC - jB));
            }
        }
        if (zzsjVar.zzf()) {
            long jB2 = nVar.b(bVar);
            if (jB2 == 0) {
                zza.w("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                zzmzVar.zze(Long.valueOf(SystemClock.elapsedRealtime() - jB2));
            }
        }
        return zzmzVar.zzi();
    }
}
