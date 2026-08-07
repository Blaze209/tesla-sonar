package com.google.android.gms.internal.mlkit_common;

import ezvcard.property.Kind;
import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzjv implements c {
    static final zzjv zza = new zzjv();

    static {
        b.C2317b c2317bA = b.a("stageId");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        c2317bA.b(zzayVar.zzb()).a();
        b.C2317b c2317bA2 = b.a(Kind.DEVICE);
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        c2317bA2.b(zzayVar2.zzb()).a();
    }

    private zzjv() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
