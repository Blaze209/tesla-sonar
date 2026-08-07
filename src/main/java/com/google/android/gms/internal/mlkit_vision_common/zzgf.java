package com.google.android.gms.internal.mlkit_vision_common;

import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzgf implements c {
    static final zzgf zza = new zzgf();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;

    static {
        b.C2317b c2317bA = b.a("detectorMode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = c2317bA.b(zzaeVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("streamModeSmoothingRatio");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = c2317bA2.b(zzaeVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("rawSizeMaskEnabled");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = c2317bA3.b(zzaeVar3.zzb()).a();
    }

    private zzgf() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
