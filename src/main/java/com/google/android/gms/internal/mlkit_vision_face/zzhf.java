package com.google.android.gms.internal.mlkit_vision_face;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzhf implements c {
    static final zzhf zza = new zzhf();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;

    static {
        b.C2317b c2317bA = b.a("inferenceCommonLogEvent");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = c2317bA.b(zzcqVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("options");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = c2317bA2.b(zzcqVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("imageInfo");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = c2317bA3.b(zzcqVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("detectorOptions");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = c2317bA4.b(zzcqVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("contourDetectedFaces");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = c2317bA5.b(zzcqVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("nonContourDetectedFaces");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = c2317bA6.b(zzcqVar6.zzb()).a();
    }

    private zzhf() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzll zzllVar = (zzll) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzllVar.zzc());
        dVar.add(zzc, (Object) null);
        dVar.add(zzd, zzllVar.zzb());
        dVar.add(zze, zzllVar.zza());
        dVar.add(zzf, zzllVar.zzd());
        dVar.add(zzg, zzllVar.zze());
    }
}
