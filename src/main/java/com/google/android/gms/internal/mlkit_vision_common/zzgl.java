package com.google.android.gms.internal.mlkit_vision_common;

import expo.modules.interfaces.permissions.PermissionsResponse;
import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzgl implements c {
    static final zzgl zza = new zzgl();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;
    private static final b zzh;
    private static final b zzi;

    static {
        b.C2317b c2317bA = b.a("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = c2317bA.b(zzaeVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("options");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = c2317bA2.b(zzaeVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("inputLength");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = c2317bA3.b(zzaeVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("outputLength");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = c2317bA4.b(zzaeVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("loadDictionaryErrorCode");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = c2317bA5.b(zzaeVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("translateResultStatusCode");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = c2317bA6.b(zzaeVar6.zzb()).a();
        b.C2317b c2317bA7 = b.a(PermissionsResponse.STATUS_KEY);
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        zzh = c2317bA7.b(zzaeVar7.zzb()).a();
        b.C2317b c2317bA8 = b.a("downloadHttpResponseCode");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        zzi = c2317bA8.b(zzaeVar8.zzb()).a();
    }

    private zzgl() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
