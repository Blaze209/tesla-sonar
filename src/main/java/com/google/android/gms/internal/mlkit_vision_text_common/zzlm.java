package com.google.android.gms.internal.mlkit_vision_text_common;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzlm implements c {
    static final zzlm zza = new zzlm();
    private static final b zzb;

    static {
        b.C2317b c2317bA = b.a("errorCode");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = c2317bA.b(zzctVar.zzb()).a();
    }

    private zzlm() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((d) obj2).add(zzb, ((zzrw) obj).zza());
    }
}
