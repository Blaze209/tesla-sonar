package com.google.android.gms.internal.mlkit_vision_face;

import expo.modules.interfaces.permissions.PermissionsResponse;
import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzig implements c {
    static final zzig zza = new zzig();
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
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = c2317bA.b(zzcqVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("options");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = c2317bA2.b(zzcqVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("inputLength");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = c2317bA3.b(zzcqVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("outputLength");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = c2317bA4.b(zzcqVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("loadDictionaryErrorCode");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = c2317bA5.b(zzcqVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("translateResultStatusCode");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = c2317bA6.b(zzcqVar6.zzb()).a();
        b.C2317b c2317bA7 = b.a(PermissionsResponse.STATUS_KEY);
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        zzh = c2317bA7.b(zzcqVar7.zzb()).a();
        b.C2317b c2317bA8 = b.a("downloadHttpResponseCode");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        zzi = c2317bA8.b(zzcqVar8.zzb()).a();
    }

    private zzig() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
