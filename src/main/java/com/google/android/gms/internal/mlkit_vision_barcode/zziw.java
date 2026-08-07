package com.google.android.gms.internal.mlkit_vision_barcode;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zziw implements c {
    static final zziw zza = new zziw();
    private static final b zzb;

    static {
        b.C2317b c2317bA = b.a("format");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = c2317bA.b(zzfaVar.zzb()).a();
    }

    private zziw() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((d) obj2).add(zzb, ((zzvz) obj).zza());
    }
}
