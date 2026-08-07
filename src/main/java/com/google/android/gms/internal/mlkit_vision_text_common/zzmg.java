package com.google.android.gms.internal.mlkit_vision_text_common;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzmg implements c {
    static final zzmg zza = new zzmg();
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
    private static final b zzn;
    private static final b zzo;

    static {
        b.C2317b c2317bA = b.a("appId");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = c2317bA.b(zzctVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("appVersion");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = c2317bA2.b(zzctVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("firebaseProjectId");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = c2317bA3.b(zzctVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("mlSdkVersion");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = c2317bA4.b(zzctVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("tfliteSchemaVersion");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        zzf = c2317bA5.b(zzctVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("gcmSenderId");
        zzct zzctVar6 = new zzct();
        zzctVar6.zza(6);
        zzg = c2317bA6.b(zzctVar6.zzb()).a();
        b.C2317b c2317bA7 = b.a("apiKey");
        zzct zzctVar7 = new zzct();
        zzctVar7.zza(7);
        zzh = c2317bA7.b(zzctVar7.zzb()).a();
        b.C2317b c2317bA8 = b.a("languages");
        zzct zzctVar8 = new zzct();
        zzctVar8.zza(8);
        zzi = c2317bA8.b(zzctVar8.zzb()).a();
        b.C2317b c2317bA9 = b.a("mlSdkInstanceId");
        zzct zzctVar9 = new zzct();
        zzctVar9.zza(9);
        zzj = c2317bA9.b(zzctVar9.zzb()).a();
        b.C2317b c2317bA10 = b.a("isClearcutClient");
        zzct zzctVar10 = new zzct();
        zzctVar10.zza(10);
        zzk = c2317bA10.b(zzctVar10.zzb()).a();
        b.C2317b c2317bA11 = b.a("isStandaloneMlkit");
        zzct zzctVar11 = new zzct();
        zzctVar11.zza(11);
        zzl = c2317bA11.b(zzctVar11.zzb()).a();
        b.C2317b c2317bA12 = b.a("isJsonLogging");
        zzct zzctVar12 = new zzct();
        zzctVar12.zza(12);
        zzm = c2317bA12.b(zzctVar12.zzb()).a();
        b.C2317b c2317bA13 = b.a("buildLevel");
        zzct zzctVar13 = new zzct();
        zzctVar13.zza(13);
        zzn = c2317bA13.b(zzctVar13.zzb()).a();
        b.C2317b c2317bA14 = b.a("optionalModuleVersion");
        zzct zzctVar14 = new zzct();
        zzctVar14.zza(14);
        zzo = c2317bA14.b(zzctVar14.zzb()).a();
    }

    private zzmg() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzst zzstVar = (zzst) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzstVar.zzg());
        dVar.add(zzc, zzstVar.zzh());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, zzstVar.zzj());
        dVar.add(zzf, zzstVar.zzk());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, zzstVar.zza());
        dVar.add(zzj, zzstVar.zzi());
        dVar.add(zzk, zzstVar.zzb());
        dVar.add(zzl, zzstVar.zzd());
        dVar.add(zzm, zzstVar.zzc());
        dVar.add(zzn, zzstVar.zze());
        dVar.add(zzo, zzstVar.zzf());
    }
}
