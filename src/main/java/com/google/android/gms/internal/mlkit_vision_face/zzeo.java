package com.google.android.gms.internal.mlkit_vision_face;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzeo implements c {
    static final zzeo zza = new zzeo();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;

    static {
        b.C2317b c2317bA = b.a("logEventKey");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = c2317bA.b(zzcqVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("eventCount");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = c2317bA2.b(zzcqVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("inferenceDurationStats");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = c2317bA3.b(zzcqVar3.zzb()).a();
    }

    private zzeo() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzdp zzdpVar = (zzdp) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzdpVar.zza());
        dVar.add(zzc, zzdpVar.zzc());
        dVar.add(zzd, zzdpVar.zzb());
    }
}
