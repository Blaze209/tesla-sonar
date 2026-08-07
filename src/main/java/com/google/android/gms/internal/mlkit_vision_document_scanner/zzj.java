package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class zzj {
    public static final zzj zza;
    public static final zzj zzb;
    private final boolean zzc;
    private final zzx zzd;
    private final zzx zze;

    static {
        byte[] bArr = null;
        zzi zziVar = new zzi(bArr);
        zziVar.zzb();
        zza = zziVar.zzd();
        zzi zziVar2 = new zzi(bArr);
        zziVar2.zzb();
        zziVar2.zzc(new zzh());
        zziVar2.zzd();
        zzi zziVar3 = new zzi(bArr);
        zziVar3.zza();
        zzb = zziVar3.zzd();
    }

    /* synthetic */ zzj(boolean z11, boolean z12, zzx zzxVar, zzx zzxVar2, byte[] bArr) {
        this.zzc = z11;
        this.zzd = zzxVar;
        this.zze = zzxVar2;
    }

    final /* synthetic */ boolean zza() {
        return this.zzc;
    }

    final /* synthetic */ int zzb(Context context, zzl zzlVar) {
        zzx zzxVar = this.zzd;
        int size = zzxVar.size();
        int i11 = 0;
        while (i11 < size) {
            int iZza = ((zzm) zzxVar.get(i11)).zza(context, zzlVar, this.zzc) - 1;
            i11++;
            if (iZza == 1) {
                return 2;
            }
        }
        return 3;
    }

    final /* synthetic */ int zzc(Context context, String str) {
        zzx zzxVar = this.zze;
        int size = zzxVar.size();
        int i11 = 0;
        while (i11 < size) {
            int iZza = ((zze) zzxVar.get(i11)).zza();
            int i12 = iZza - 1;
            if (iZza == 0) {
                throw null;
            }
            i11++;
            if (i12 == 0) {
                return 1;
            }
            if (i12 == 1) {
                return 2;
            }
        }
        return 3;
    }
}
