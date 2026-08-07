package com.google.android.gms.internal.mlkit_vision_face;

import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzfz implements c {
    static final zzfz zza = new zzfz();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;

    static {
        b.C2317b c2317bA = b.a("remoteModelOptions");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = c2317bA.b(zzcqVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("localModelOptions");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = c2317bA2.b(zzcqVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("errorCodes");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = c2317bA3.b(zzcqVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("modelInitializationMs");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = c2317bA4.b(zzcqVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("isNnApiEnabled");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = c2317bA5.b(zzcqVar5.zzb()).a();
    }

    private zzfz() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
