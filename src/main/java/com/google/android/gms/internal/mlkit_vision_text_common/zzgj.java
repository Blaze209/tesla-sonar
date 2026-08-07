package com.google.android.gms.internal.mlkit_vision_text_common;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzgj implements c {
    static final zzgj zza = new zzgj();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;

    static {
        b.C2317b c2317bA = b.a("logEventKey");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = c2317bA.b(zzctVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("eventCount");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = c2317bA2.b(zzctVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("inferenceDurationStats");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = c2317bA3.b(zzctVar3.zzb()).a();
    }

    private zzgj() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzeu zzeuVar = (zzeu) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzeuVar.zza());
        dVar.add(zzc, zzeuVar.zzc());
        dVar.add(zzd, zzeuVar.zzb());
    }
}
