package com.google.android.gms.internal.mlkit_vision_face;

import expo.modules.interfaces.permissions.PermissionsResponse;
import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzik implements c {
    static final zzik zza = new zzik();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;
    private static final b zzh;
    private static final b zzi;
    private static final b zzj;
    private static final b zzk;
    private static final b zzl;
    private static final b zzm;

    static {
        b.C2317b c2317bA = b.a("deviceInfo");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = c2317bA.b(zzcqVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("nnapiInfo");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = c2317bA2.b(zzcqVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("gpuInfo");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = c2317bA3.b(zzcqVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("pipelineIdentifier");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = c2317bA4.b(zzcqVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("acceptedConfigurations");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = c2317bA5.b(zzcqVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("action");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = c2317bA6.b(zzcqVar6.zzb()).a();
        b.C2317b c2317bA7 = b.a(PermissionsResponse.STATUS_KEY);
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        zzh = c2317bA7.b(zzcqVar7.zzb()).a();
        b.C2317b c2317bA8 = b.a("customErrors");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        zzi = c2317bA8.b(zzcqVar8.zzb()).a();
        b.C2317b c2317bA9 = b.a("benchmarkStatus");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        zzj = c2317bA9.b(zzcqVar9.zzb()).a();
        b.C2317b c2317bA10 = b.a("validationTestResult");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(10);
        zzk = c2317bA10.b(zzcqVar10.zzb()).a();
        b.C2317b c2317bA11 = b.a("timestampUs");
        zzcq zzcqVar11 = new zzcq();
        zzcqVar11.zza(11);
        zzl = c2317bA11.b(zzcqVar11.zzb()).a();
        b.C2317b c2317bA12 = b.a("elapsedUs");
        zzcq zzcqVar12 = new zzcq();
        zzcqVar12.zza(12);
        zzm = c2317bA12.b(zzcqVar12.zzb()).a();
    }

    private zzik() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
