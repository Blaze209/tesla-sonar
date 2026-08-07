package com.google.android.gms.internal.mlkit_vision_text_common;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzid implements c {
    static final zzid zza = new zzid();
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
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = c2317bA.b(zzctVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("errorCode");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = c2317bA2.b(zzctVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("isColdCall");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = c2317bA3.b(zzctVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("autoManageModelOnBackground");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = c2317bA4.b(zzctVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("autoManageModelOnLowMemory");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        zzf = c2317bA5.b(zzctVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("isNnApiEnabled");
        zzct zzctVar6 = new zzct();
        zzctVar6.zza(6);
        zzg = c2317bA6.b(zzctVar6.zzb()).a();
        b.C2317b c2317bA7 = b.a("eventsCount");
        zzct zzctVar7 = new zzct();
        zzctVar7.zza(7);
        zzh = c2317bA7.b(zzctVar7.zzb()).a();
        b.C2317b c2317bA8 = b.a("otherErrors");
        zzct zzctVar8 = new zzct();
        zzctVar8.zza(8);
        zzi = c2317bA8.b(zzctVar8.zzb()).a();
        b.C2317b c2317bA9 = b.a("remoteConfigValueForAcceleration");
        zzct zzctVar9 = new zzct();
        zzctVar9.zza(9);
        zzj = c2317bA9.b(zzctVar9.zzb()).a();
        b.C2317b c2317bA10 = b.a("isAccelerated");
        zzct zzctVar10 = new zzct();
        zzctVar10.zza(10);
        zzk = c2317bA10.b(zzctVar10.zzb()).a();
    }

    private zzid() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzoj zzojVar = (zzoj) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzojVar.zze());
        dVar.add(zzc, zzojVar.zza());
        dVar.add(zzd, zzojVar.zzd());
        dVar.add(zze, zzojVar.zzb());
        dVar.add(zzf, zzojVar.zzc());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) null);
        dVar.add(zzj, (Object) null);
        dVar.add(zzk, (Object) null);
    }
}
