package com.google.android.gms.internal.mlkit_vision_face;

import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzif implements c {
    static final zzif zza = new zzif();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;

    static {
        b.C2317b c2317bA = b.a("languageOption");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(3);
        zzb = c2317bA.b(zzcqVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("isUsingLegacyApi");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(4);
        zzc = c2317bA2.b(zzcqVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("sdkVersion");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(5);
        zzd = c2317bA3.b(zzcqVar3.zzb()).a();
    }

    private zzif() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
