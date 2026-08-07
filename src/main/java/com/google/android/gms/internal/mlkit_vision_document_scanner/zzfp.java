package com.google.android.gms.internal.mlkit_vision_document_scanner;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzfp implements c {
    static final zzfp zza = new zzfp();
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
    private static final b zzp;
    private static final b zzq;
    private static final b zzr;

    static {
        b.C2317b c2317bA = b.a("initialImageUriCount");
        zzal zzalVar = new zzal();
        zzalVar.zza(1);
        zzb = c2317bA.b(zzalVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("defaultCaptureMode");
        zzal zzalVar2 = new zzal();
        zzalVar2.zza(2);
        zzc = c2317bA2.b(zzalVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("flashModeChangeAllowed");
        zzal zzalVar3 = new zzal();
        zzalVar3.zza(3);
        zzd = c2317bA3.b(zzalVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("galleryImportAllowed");
        zzal zzalVar4 = new zzal();
        zzalVar4.zza(4);
        zze = c2317bA4.b(zzalVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("multiPageAllowed");
        zzal zzalVar5 = new zzal();
        zzalVar5.zza(5);
        zzf = c2317bA5.b(zzalVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("filterAllowed");
        zzal zzalVar6 = new zzal();
        zzalVar6.zza(6);
        zzg = c2317bA6.b(zzalVar6.zzb()).a();
        b.C2317b c2317bA7 = b.a("targetResolutionWidth");
        zzal zzalVar7 = new zzal();
        zzalVar7.zza(7);
        zzh = c2317bA7.b(zzalVar7.zzb()).a();
        b.C2317b c2317bA8 = b.a("targetResolutionHeight");
        zzal zzalVar8 = new zzal();
        zzalVar8.zza(8);
        zzi = c2317bA8.b(zzalVar8.zzb()).a();
        b.C2317b c2317bA9 = b.a("resultFormats");
        zzal zzalVar9 = new zzal();
        zzalVar9.zza(9);
        zzj = c2317bA9.b(zzalVar9.zzb()).a();
        b.C2317b c2317bA10 = b.a("pageEditListenerSet");
        zzal zzalVar10 = new zzal();
        zzalVar10.zza(10);
        zzk = c2317bA10.b(zzalVar10.zzb()).a();
        b.C2317b c2317bA11 = b.a("shadowRemovalAllowed");
        zzal zzalVar11 = new zzal();
        zzalVar11.zza(11);
        zzl = c2317bA11.b(zzalVar11.zzb()).a();
        b.C2317b c2317bA12 = b.a("stainRemovalAllowed");
        zzal zzalVar12 = new zzal();
        zzalVar12.zza(12);
        zzm = c2317bA12.b(zzalVar12.zzb()).a();
        b.C2317b c2317bA13 = b.a("enableAllNewFeaturesByDefault");
        zzal zzalVar13 = new zzal();
        zzalVar13.zza(13);
        zzn = c2317bA13.b(zzalVar13.zzb()).a();
        b.C2317b c2317bA14 = b.a("pageLimitMax");
        zzal zzalVar14 = new zzal();
        zzalVar14.zza(14);
        zzo = c2317bA14.b(zzalVar14.zzb()).a();
        b.C2317b c2317bA15 = b.a("enableGalleryImportAutoTransform");
        zzal zzalVar15 = new zzal();
        zzalVar15.zza(15);
        zzp = c2317bA15.b(zzalVar15.zzb()).a();
        b.C2317b c2317bA16 = b.a("enableComputeHashForGalleryImage");
        zzal zzalVar16 = new zzal();
        zzalVar16.zza(16);
        zzq = c2317bA16.b(zzalVar16.zzb()).a();
        b.C2317b c2317bA17 = b.a("enableAutoEnhancements");
        zzal zzalVar17 = new zzal();
        zzalVar17.zza(17);
        zzr = c2317bA17.b(zzalVar17.zzb()).a();
    }

    private zzfp() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmz zzmzVar = (zzmz) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzmzVar.zza());
        dVar.add(zzc, zzmzVar.zzb());
        dVar.add(zzd, zzmzVar.zzc());
        dVar.add(zze, zzmzVar.zzd());
        dVar.add(zzf, zzmzVar.zze());
        dVar.add(zzg, zzmzVar.zzf());
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) null);
        dVar.add(zzj, zzmzVar.zzg());
        dVar.add(zzk, zzmzVar.zzh());
        dVar.add(zzl, zzmzVar.zzi());
        dVar.add(zzm, zzmzVar.zzj());
        dVar.add(zzn, zzmzVar.zzk());
        dVar.add(zzo, zzmzVar.zzl());
        dVar.add(zzp, zzmzVar.zzm());
        dVar.add(zzq, zzmzVar.zzn());
        dVar.add(zzr, zzmzVar.zzo());
    }
}
