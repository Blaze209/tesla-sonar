package com.google.android.gms.internal.mlkit_vision_text_common;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzgk implements c {
    static final zzgk zza = new zzgk();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;

    static {
        b.C2317b c2317bA = b.a("errorCode");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = c2317bA.b(zzctVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("hasResult");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = c2317bA2.b(zzctVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("isColdCall");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = c2317bA3.b(zzctVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("imageInfo");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = c2317bA4.b(zzctVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("recognizerOptions");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        zzf = c2317bA5.b(zzctVar5.zzb()).a();
    }

    private zzgk() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzes zzesVar = (zzes) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzesVar.zza());
        dVar.add(zzc, (Object) null);
        dVar.add(zzd, zzesVar.zzc());
        dVar.add(zze, (Object) null);
        dVar.add(zzf, zzesVar.zzb());
    }
}
