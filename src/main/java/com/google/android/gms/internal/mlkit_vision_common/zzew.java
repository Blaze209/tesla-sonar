package com.google.android.gms.internal.mlkit_vision_common;

import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzew implements c {
    static final zzew zza = new zzew();
    private static final b zzb;
    private static final b zzc;

    static {
        b.C2317b c2317bA = b.a("deviceInfos");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = c2317bA.b(zzaeVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("errorInfo");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = c2317bA2.b(zzaeVar2.zzb()).a();
    }

    private zzew() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
