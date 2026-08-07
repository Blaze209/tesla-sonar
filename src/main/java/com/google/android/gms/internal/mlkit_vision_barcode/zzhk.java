package com.google.android.gms.internal.mlkit_vision_barcode;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzhk implements c {
    static final zzhk zza = new zzhk();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;

    static {
        b.C2317b c2317bA = b.a("logEventKey");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = c2317bA.b(zzfaVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("eventCount");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = c2317bA2.b(zzfaVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("inferenceDurationStats");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = c2317bA3.b(zzfaVar3.zzb()).a();
    }

    private zzhk() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzfv zzfvVar = (zzfv) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzfvVar.zza());
        dVar.add(zzc, zzfvVar.zzc());
        dVar.add(zzd, zzfvVar.zzb());
    }
}
