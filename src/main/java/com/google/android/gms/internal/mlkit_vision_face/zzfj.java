package com.google.android.gms.internal.mlkit_vision_face;

import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzfj implements c {
    static final zzfj zza = new zzfj();
    private static final b zzb;
    private static final b zzc;

    static {
        b.C2317b c2317bA = b.a("maxResults");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = c2317bA.b(zzcqVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("modelType");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = c2317bA2.b(zzcqVar2.zzb()).a();
    }

    private zzfj() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
