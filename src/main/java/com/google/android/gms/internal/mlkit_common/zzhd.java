package com.google.android.gms.internal.mlkit_common;

import expo.modules.interfaces.permissions.PermissionsResponse;
import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzhd implements c {
    static final zzhd zza = new zzhd();

    static {
        b.C2317b c2317bA = b.a(PermissionsResponse.STATUS_KEY);
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        c2317bA.b(zzayVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("filename");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        c2317bA2.b(zzayVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("lineNumber");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        c2317bA3.b(zzayVar3.zzb()).a();
    }

    private zzhd() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
