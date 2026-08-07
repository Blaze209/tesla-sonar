package com.google.android.gms.internal.mlkit_common;

import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzgj implements c {
    static final zzgj zza = new zzgj();

    static {
        b.C2317b c2317bA = b.a("identifyLanguageConfidenceThreshold");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        c2317bA.b(zzayVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("identifyAllLanguagesConfidenceThreshold");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        c2317bA2.b(zzayVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("confidenceThreshold");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        c2317bA3.b(zzayVar3.zzb()).a();
    }

    private zzgj() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
