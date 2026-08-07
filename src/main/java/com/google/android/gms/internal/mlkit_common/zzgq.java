package com.google.android.gms.internal.mlkit_common;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzgq implements c {
    static final zzgq zza = new zzgq();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;
    private static final b zzh;

    static {
        b.C2317b c2317bA = b.a("options");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = c2317bA.b(zzayVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("roughDownloadDurationMs");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = c2317bA2.b(zzayVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("errorCode");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = c2317bA3.b(zzayVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("exactDownloadDurationMs");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = c2317bA4.b(zzayVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("downloadStatus");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        zzf = c2317bA5.b(zzayVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("downloadFailureStatus");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        zzg = c2317bA6.b(zzayVar6.zzb()).a();
        b.C2317b c2317bA7 = b.a("mddDownloadErrorCodes");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        zzh = c2317bA7.b(zzayVar7.zzb()).a();
    }

    private zzgq() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznc zzncVar = (zznc) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzncVar.zzc());
        dVar.add(zzc, zzncVar.zzf());
        dVar.add(zzd, zzncVar.zza());
        dVar.add(zze, zzncVar.zze());
        dVar.add(zzf, zzncVar.zzb());
        dVar.add(zzg, zzncVar.zzd());
        dVar.add(zzh, (Object) null);
    }
}
