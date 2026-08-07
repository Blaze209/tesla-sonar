package com.google.android.gms.internal.mlkit_common;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzgr implements c {
    static final zzgr zza = new zzgr();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;
    private static final b zzh;
    private static final b zzi;
    private static final b zzj;

    static {
        b.C2317b c2317bA = b.a("name");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = c2317bA.b(zzayVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("version");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = c2317bA2.b(zzayVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("source");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = c2317bA3.b(zzayVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("uri");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = c2317bA4.b(zzayVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("hash");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        zzf = c2317bA5.b(zzayVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("modelType");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        zzg = c2317bA6.b(zzayVar6.zzb()).a();
        b.C2317b c2317bA7 = b.a("size");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        zzh = c2317bA7.b(zzayVar7.zzb()).a();
        b.C2317b c2317bA8 = b.a("hasLabelMap");
        zzay zzayVar8 = new zzay();
        zzayVar8.zza(8);
        zzi = c2317bA8.b(zzayVar8.zzb()).a();
        b.C2317b c2317bA9 = b.a("isManifestModel");
        zzay zzayVar9 = new zzay();
        zzayVar9.zza(9);
        zzj = c2317bA9.b(zzayVar9.zzb()).a();
    }

    private zzgr() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznh zznhVar = (zznh) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zznhVar.zzd());
        dVar.add(zzc, (Object) null);
        dVar.add(zzd, zznhVar.zzb());
        dVar.add(zze, (Object) null);
        dVar.add(zzf, zznhVar.zzc());
        dVar.add(zzg, zznhVar.zza());
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) null);
        dVar.add(zzj, (Object) null);
    }
}
