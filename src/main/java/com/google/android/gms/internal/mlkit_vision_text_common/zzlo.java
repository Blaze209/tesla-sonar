package com.google.android.gms.internal.mlkit_vision_text_common;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzlo implements c {
    static final zzlo zza = new zzlo();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;

    static {
        b.C2317b c2317bA = b.a("languageOption");
        zzct zzctVar = new zzct();
        zzctVar.zza(3);
        zzb = c2317bA.b(zzctVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("isUsingLegacyApi");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(4);
        zzc = c2317bA2.b(zzctVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("sdkVersion");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(5);
        zzd = c2317bA3.b(zzctVar3.zzb()).a();
    }

    private zzlo() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        d dVar = (d) obj2;
        dVar.add(zzb, ((zzsd) obj).zza());
        dVar.add(zzc, (Object) null);
        dVar.add(zzd, (Object) null);
    }
}
