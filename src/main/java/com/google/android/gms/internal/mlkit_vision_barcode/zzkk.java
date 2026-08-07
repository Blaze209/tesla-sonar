package com.google.android.gms.internal.mlkit_vision_barcode;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzkk implements c {
    static final zzkk zza = new zzkk();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;
    private static final b zzh;
    private static final b zzi;
    private static final b zzj;
    private static final b zzk;

    static {
        b.C2317b c2317bA = b.a("durationMs");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = c2317bA.b(zzfaVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("errorCode");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = c2317bA2.b(zzfaVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("isColdCall");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = c2317bA3.b(zzfaVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("autoManageModelOnBackground");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = c2317bA4.b(zzfaVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("autoManageModelOnLowMemory");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = c2317bA5.b(zzfaVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("isNnApiEnabled");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        zzg = c2317bA6.b(zzfaVar6.zzb()).a();
        b.C2317b c2317bA7 = b.a("eventsCount");
        zzfa zzfaVar7 = new zzfa();
        zzfaVar7.zza(7);
        zzh = c2317bA7.b(zzfaVar7.zzb()).a();
        b.C2317b c2317bA8 = b.a("otherErrors");
        zzfa zzfaVar8 = new zzfa();
        zzfaVar8.zza(8);
        zzi = c2317bA8.b(zzfaVar8.zzb()).a();
        b.C2317b c2317bA9 = b.a("remoteConfigValueForAcceleration");
        zzfa zzfaVar9 = new zzfa();
        zzfaVar9.zza(9);
        zzj = c2317bA9.b(zzfaVar9.zzb()).a();
        b.C2317b c2317bA10 = b.a("isAccelerated");
        zzfa zzfaVar10 = new zzfa();
        zzfaVar10.zza(10);
        zzk = c2317bA10.b(zzfaVar10.zzb()).a();
    }

    private zzkk() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqq zzqqVar = (zzqq) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzqqVar.zze());
        dVar.add(zzc, zzqqVar.zza());
        dVar.add(zzd, zzqqVar.zzd());
        dVar.add(zze, zzqqVar.zzb());
        dVar.add(zzf, zzqqVar.zzc());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) null);
        dVar.add(zzj, (Object) null);
        dVar.add(zzk, (Object) null);
    }
}
