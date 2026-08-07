package com.google.android.gms.internal.mlkit_vision_common;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzej implements c {
    static final zzej zza = new zzej();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;
    private static final b zzh;

    static {
        b.C2317b c2317bA = b.a("durationMs");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = c2317bA.b(zzaeVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("imageSource");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = c2317bA2.b(zzaeVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("imageFormat");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = c2317bA3.b(zzaeVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("imageByteSize");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = c2317bA4.b(zzaeVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("imageWidth");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = c2317bA5.b(zzaeVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("imageHeight");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = c2317bA6.b(zzaeVar6.zzb()).a();
        b.C2317b c2317bA7 = b.a("rotationDegrees");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        zzh = c2317bA7.b(zzaeVar7.zzb()).a();
    }

    private zzej() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zziq zziqVar = (zziq) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zziqVar.zzg());
        dVar.add(zzc, zziqVar.zzb());
        dVar.add(zzd, zziqVar.zza());
        dVar.add(zze, zziqVar.zzc());
        dVar.add(zzf, zziqVar.zze());
        dVar.add(zzg, zziqVar.zzd());
        dVar.add(zzh, zziqVar.zzf());
    }
}
