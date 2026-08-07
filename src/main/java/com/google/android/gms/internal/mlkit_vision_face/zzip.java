package com.google.android.gms.internal.mlkit_vision_face;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzip implements c {
    static final zzip zza = new zzip();
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
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = c2317bA.b(zzcqVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("appVersion");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = c2317bA2.b(zzcqVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("firebaseProjectId");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = c2317bA3.b(zzcqVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("mlSdkVersion");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = c2317bA4.b(zzcqVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("tfliteSchemaVersion");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = c2317bA5.b(zzcqVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("gcmSenderId");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = c2317bA6.b(zzcqVar6.zzb()).a();
        b.C2317b c2317bA7 = b.a("apiKey");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        zzh = c2317bA7.b(zzcqVar7.zzb()).a();
        b.C2317b c2317bA8 = b.a("languages");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        zzi = c2317bA8.b(zzcqVar8.zzb()).a();
        b.C2317b c2317bA9 = b.a("mlSdkInstanceId");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        zzj = c2317bA9.b(zzcqVar9.zzb()).a();
        b.C2317b c2317bA10 = b.a("isClearcutClient");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(10);
        zzk = c2317bA10.b(zzcqVar10.zzb()).a();
        b.C2317b c2317bA11 = b.a("isStandaloneMlkit");
        zzcq zzcqVar11 = new zzcq();
        zzcqVar11.zza(11);
        zzl = c2317bA11.b(zzcqVar11.zzb()).a();
        b.C2317b c2317bA12 = b.a("isJsonLogging");
        zzcq zzcqVar12 = new zzcq();
        zzcqVar12.zza(12);
        zzm = c2317bA12.b(zzcqVar12.zzb()).a();
        b.C2317b c2317bA13 = b.a("buildLevel");
        zzcq zzcqVar13 = new zzcq();
        zzcqVar13.zza(13);
        zzn = c2317bA13.b(zzcqVar13.zzb()).a();
        b.C2317b c2317bA14 = b.a("optionalModuleVersion");
        zzcq zzcqVar14 = new zzcq();
        zzcqVar14.zza(14);
        zzo = c2317bA14.b(zzcqVar14.zzb()).a();
    }

    private zzip() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmv zzmvVar = (zzmv) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzmvVar.zzg());
        dVar.add(zzc, zzmvVar.zzh());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, zzmvVar.zzj());
        dVar.add(zzf, zzmvVar.zzk());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, zzmvVar.zza());
        dVar.add(zzj, zzmvVar.zzi());
        dVar.add(zzk, zzmvVar.zzb());
        dVar.add(zzl, zzmvVar.zzd());
        dVar.add(zzm, zzmvVar.zzc());
        dVar.add(zzn, zzmvVar.zze());
        dVar.add(zzo, zzmvVar.zzf());
    }
}
