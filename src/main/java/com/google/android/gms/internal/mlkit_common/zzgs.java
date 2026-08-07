package com.google.android.gms.internal.mlkit_common;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzgs implements c {
    static final zzgs zza = new zzgs();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;

    static {
        b.C2317b c2317bA = b.a("modelInfo");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = c2317bA.b(zzayVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("initialDownloadConditions");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = c2317bA2.b(zzayVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("updateDownloadConditions");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = c2317bA3.b(zzayVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("isModelUpdateEnabled");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = c2317bA4.b(zzayVar4.zzb()).a();
    }

    private zzgs() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        d dVar = (d) obj2;
        dVar.add(zzb, ((zznl) obj).zza());
        dVar.add(zzc, (Object) null);
        dVar.add(zzd, (Object) null);
        dVar.add(zze, (Object) null);
    }
}
