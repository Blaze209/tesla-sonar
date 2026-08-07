package com.google.android.gms.internal.mlkit_common;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzfk implements c {
    static final zzfk zza = new zzfk();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;

    static {
        b.C2317b c2317bA = b.a("modelType");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = c2317bA.b(zzayVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("isSuccessful");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = c2317bA2.b(zzayVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("modelName");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = c2317bA3.b(zzayVar3.zzb()).a();
    }

    private zzfk() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlo zzloVar = (zzlo) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzloVar.zza());
        dVar.add(zzc, zzloVar.zzb());
        dVar.add(zzd, (Object) null);
    }
}
