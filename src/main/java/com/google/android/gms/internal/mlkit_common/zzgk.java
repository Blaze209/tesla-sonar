package com.google.android.gms.internal.mlkit_common;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzgk implements c {
    static final zzgk zza = new zzgk();
    private static final b zzb;

    static {
        b.C2317b c2317bA = b.a("api");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = c2317bA.b(zzayVar.zzb()).a();
    }

    private zzgk() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((d) obj2).add(zzb, ((zzmp) obj).zza());
    }
}
