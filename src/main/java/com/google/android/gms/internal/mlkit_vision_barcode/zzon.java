package com.google.android.gms.internal.mlkit_vision_barcode;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzon implements c {
    static final zzon zza = new zzon();
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
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = c2317bA.b(zzfaVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("appVersion");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = c2317bA2.b(zzfaVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("firebaseProjectId");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = c2317bA3.b(zzfaVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("mlSdkVersion");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = c2317bA4.b(zzfaVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("tfliteSchemaVersion");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = c2317bA5.b(zzfaVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("gcmSenderId");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        zzg = c2317bA6.b(zzfaVar6.zzb()).a();
        b.C2317b c2317bA7 = b.a("apiKey");
        zzfa zzfaVar7 = new zzfa();
        zzfaVar7.zza(7);
        zzh = c2317bA7.b(zzfaVar7.zzb()).a();
        b.C2317b c2317bA8 = b.a("languages");
        zzfa zzfaVar8 = new zzfa();
        zzfaVar8.zza(8);
        zzi = c2317bA8.b(zzfaVar8.zzb()).a();
        b.C2317b c2317bA9 = b.a("mlSdkInstanceId");
        zzfa zzfaVar9 = new zzfa();
        zzfaVar9.zza(9);
        zzj = c2317bA9.b(zzfaVar9.zzb()).a();
        b.C2317b c2317bA10 = b.a("isClearcutClient");
        zzfa zzfaVar10 = new zzfa();
        zzfaVar10.zza(10);
        zzk = c2317bA10.b(zzfaVar10.zzb()).a();
        b.C2317b c2317bA11 = b.a("isStandaloneMlkit");
        zzfa zzfaVar11 = new zzfa();
        zzfaVar11.zza(11);
        zzl = c2317bA11.b(zzfaVar11.zzb()).a();
        b.C2317b c2317bA12 = b.a("isJsonLogging");
        zzfa zzfaVar12 = new zzfa();
        zzfaVar12.zza(12);
        zzm = c2317bA12.b(zzfaVar12.zzb()).a();
        b.C2317b c2317bA13 = b.a("buildLevel");
        zzfa zzfaVar13 = new zzfa();
        zzfaVar13.zza(13);
        zzn = c2317bA13.b(zzfaVar13.zzb()).a();
        b.C2317b c2317bA14 = b.a("optionalModuleVersion");
        zzfa zzfaVar14 = new zzfa();
        zzfaVar14.zza(14);
        zzo = c2317bA14.b(zzfaVar14.zzb()).a();
    }

    private zzon() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzvd zzvdVar = (zzvd) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzvdVar.zzg());
        dVar.add(zzc, zzvdVar.zzh());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, zzvdVar.zzj());
        dVar.add(zzf, zzvdVar.zzk());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, zzvdVar.zza());
        dVar.add(zzj, zzvdVar.zzi());
        dVar.add(zzk, zzvdVar.zzb());
        dVar.add(zzl, zzvdVar.zzd());
        dVar.add(zzm, zzvdVar.zzc());
        dVar.add(zzn, zzvdVar.zze());
        dVar.add(zzo, zzvdVar.zzf());
    }
}
