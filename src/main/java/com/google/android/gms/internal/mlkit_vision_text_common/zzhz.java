package com.google.android.gms.internal.mlkit_vision_text_common;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzhz implements c {
    static final zzhz zza = new zzhz();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;

    static {
        b.C2317b c2317bA = b.a("imageFormat");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = c2317bA.b(zzctVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("originalImageSize");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = c2317bA2.b(zzctVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("compressedImageSize");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = c2317bA3.b(zzctVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("isOdmlImage");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = c2317bA4.b(zzctVar4.zzb()).a();
    }

    private zzhz() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzod zzodVar = (zzod) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzodVar.zza());
        dVar.add(zzc, zzodVar.zzb());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, (Object) null);
    }
}
