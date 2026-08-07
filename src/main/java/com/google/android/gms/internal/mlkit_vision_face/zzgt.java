package com.google.android.gms.internal.mlkit_vision_face;

import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzgt implements c {
    static final zzgt zza = new zzgt();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;

    static {
        b.C2317b c2317bA = b.a("modelInfo");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = c2317bA.b(zzcqVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("initialDownloadConditions");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = c2317bA2.b(zzcqVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("updateDownloadConditions");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = c2317bA3.b(zzcqVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("isModelUpdateEnabled");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = c2317bA4.b(zzcqVar4.zzb()).a();
    }

    private zzgt() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
