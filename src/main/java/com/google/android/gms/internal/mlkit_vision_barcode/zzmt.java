package com.google.android.gms.internal.mlkit_vision_barcode;

import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzmt implements c {
    static final zzmt zza = new zzmt();

    static {
        b.C2317b c2317bA = b.a("maxLabels");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        c2317bA.b(zzfaVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("confidenceThreshold");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        c2317bA2.b(zzfaVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("customLocalModelOptions");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        c2317bA3.b(zzfaVar3.zzb()).a();
    }

    private zzmt() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
