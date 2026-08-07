package com.google.android.gms.internal.mlkit_vision_barcode;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzka implements c {
    static final zzka zza = new zzka();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;

    static {
        b.C2317b c2317bA = b.a("maxMs");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = c2317bA.b(zzfaVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("minMs");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = c2317bA2.b(zzfaVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("avgMs");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = c2317bA3.b(zzfaVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("firstQuartileMs");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = c2317bA4.b(zzfaVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("medianMs");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = c2317bA5.b(zzfaVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("thirdQuartileMs");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        zzg = c2317bA6.b(zzfaVar6.zzb()).a();
    }

    private zzka() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqd zzqdVar = (zzqd) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzqdVar.zzc());
        dVar.add(zzc, zzqdVar.zze());
        dVar.add(zzd, zzqdVar.zza());
        dVar.add(zze, zzqdVar.zzb());
        dVar.add(zzf, zzqdVar.zzd());
        dVar.add(zzg, zzqdVar.zzf());
    }
}
