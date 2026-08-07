package com.google.android.gms.internal.mlkit_vision_face;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzhg implements c {
    static final zzhg zza = new zzhg();
    private static final b zzb;

    static {
        b.C2317b c2317bA = b.a("errorCode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = c2317bA.b(zzcqVar.zzb()).a();
    }

    private zzhg() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((d) obj2).add(zzb, ((zzlo) obj).zza());
    }
}
