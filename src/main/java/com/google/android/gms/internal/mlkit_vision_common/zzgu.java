package com.google.android.gms.internal.mlkit_vision_common;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzgu implements c {
    static final zzgu zza = new zzgu();
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
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = c2317bA.b(zzaeVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("appVersion");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = c2317bA2.b(zzaeVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("firebaseProjectId");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = c2317bA3.b(zzaeVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("mlSdkVersion");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = c2317bA4.b(zzaeVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("tfliteSchemaVersion");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = c2317bA5.b(zzaeVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("gcmSenderId");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = c2317bA6.b(zzaeVar6.zzb()).a();
        b.C2317b c2317bA7 = b.a("apiKey");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        zzh = c2317bA7.b(zzaeVar7.zzb()).a();
        b.C2317b c2317bA8 = b.a("languages");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        zzi = c2317bA8.b(zzaeVar8.zzb()).a();
        b.C2317b c2317bA9 = b.a("mlSdkInstanceId");
        zzae zzaeVar9 = new zzae();
        zzaeVar9.zza(9);
        zzj = c2317bA9.b(zzaeVar9.zzb()).a();
        b.C2317b c2317bA10 = b.a("isClearcutClient");
        zzae zzaeVar10 = new zzae();
        zzaeVar10.zza(10);
        zzk = c2317bA10.b(zzaeVar10.zzb()).a();
        b.C2317b c2317bA11 = b.a("isStandaloneMlkit");
        zzae zzaeVar11 = new zzae();
        zzaeVar11.zza(11);
        zzl = c2317bA11.b(zzaeVar11.zzb()).a();
        b.C2317b c2317bA12 = b.a("isJsonLogging");
        zzae zzaeVar12 = new zzae();
        zzaeVar12.zza(12);
        zzm = c2317bA12.b(zzaeVar12.zzb()).a();
        b.C2317b c2317bA13 = b.a("buildLevel");
        zzae zzaeVar13 = new zzae();
        zzaeVar13.zza(13);
        zzn = c2317bA13.b(zzaeVar13.zzb()).a();
        b.C2317b c2317bA14 = b.a("optionalModuleVersion");
        zzae zzaeVar14 = new zzae();
        zzaeVar14.zza(14);
        zzo = c2317bA14.b(zzaeVar14.zzb()).a();
    }

    private zzgu() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzla zzlaVar = (zzla) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzlaVar.zzg());
        dVar.add(zzc, zzlaVar.zzh());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, zzlaVar.zzj());
        dVar.add(zzf, zzlaVar.zzk());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, zzlaVar.zza());
        dVar.add(zzj, zzlaVar.zzi());
        dVar.add(zzk, zzlaVar.zzb());
        dVar.add(zzl, zzlaVar.zzd());
        dVar.add(zzm, zzlaVar.zzc());
        dVar.add(zzn, zzlaVar.zze());
        dVar.add(zzo, zzlaVar.zzf());
    }
}
