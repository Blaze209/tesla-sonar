package com.google.android.gms.internal.mlkit_common;

import com.google.android.libraries.places.api.model.PlaceTypes;
import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzfx implements c {
    static final zzfx zza = new zzfx();

    static {
        b.C2317b c2317bA = b.a("mode");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        c2317bA.b(zzayVar.zzb()).a();
        b.C2317b c2317bA2 = b.a(PlaceTypes.LANDMARK);
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        c2317bA2.b(zzayVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("classification");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        c2317bA3.b(zzayVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("prominentFaceOnly");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        c2317bA4.b(zzayVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("tracking");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        c2317bA5.b(zzayVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("minFaceSize");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        c2317bA6.b(zzayVar6.zzb()).a();
    }

    private zzfx() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
