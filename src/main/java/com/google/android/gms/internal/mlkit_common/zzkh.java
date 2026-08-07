package com.google.android.gms.internal.mlkit_common;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzkh implements c {
    static final zzkh zza = new zzkh();
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
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = c2317bA.b(zzayVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("appVersion");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = c2317bA2.b(zzayVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("firebaseProjectId");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = c2317bA3.b(zzayVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("mlSdkVersion");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = c2317bA4.b(zzayVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("tfliteSchemaVersion");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        zzf = c2317bA5.b(zzayVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("gcmSenderId");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        zzg = c2317bA6.b(zzayVar6.zzb()).a();
        b.C2317b c2317bA7 = b.a("apiKey");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        zzh = c2317bA7.b(zzayVar7.zzb()).a();
        b.C2317b c2317bA8 = b.a("languages");
        zzay zzayVar8 = new zzay();
        zzayVar8.zza(8);
        zzi = c2317bA8.b(zzayVar8.zzb()).a();
        b.C2317b c2317bA9 = b.a("mlSdkInstanceId");
        zzay zzayVar9 = new zzay();
        zzayVar9.zza(9);
        zzj = c2317bA9.b(zzayVar9.zzb()).a();
        b.C2317b c2317bA10 = b.a("isClearcutClient");
        zzay zzayVar10 = new zzay();
        zzayVar10.zza(10);
        zzk = c2317bA10.b(zzayVar10.zzb()).a();
        b.C2317b c2317bA11 = b.a("isStandaloneMlkit");
        zzay zzayVar11 = new zzay();
        zzayVar11.zza(11);
        zzl = c2317bA11.b(zzayVar11.zzb()).a();
        b.C2317b c2317bA12 = b.a("isJsonLogging");
        zzay zzayVar12 = new zzay();
        zzayVar12.zza(12);
        zzm = c2317bA12.b(zzayVar12.zzb()).a();
        b.C2317b c2317bA13 = b.a("buildLevel");
        zzay zzayVar13 = new zzay();
        zzayVar13.zza(13);
        zzn = c2317bA13.b(zzayVar13.zzb()).a();
        b.C2317b c2317bA14 = b.a("optionalModuleVersion");
        zzay zzayVar14 = new zzay();
        zzayVar14.zza(14);
        zzo = c2317bA14.b(zzayVar14.zzb()).a();
    }

    private zzkh() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqv zzqvVar = (zzqv) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzqvVar.zzg());
        dVar.add(zzc, zzqvVar.zzh());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, zzqvVar.zzj());
        dVar.add(zzf, zzqvVar.zzk());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, zzqvVar.zza());
        dVar.add(zzj, zzqvVar.zzi());
        dVar.add(zzk, zzqvVar.zzb());
        dVar.add(zzl, zzqvVar.zzd());
        dVar.add(zzm, zzqvVar.zzc());
        dVar.add(zzn, zzqvVar.zze());
        dVar.add(zzo, zzqvVar.zzf());
    }
}
