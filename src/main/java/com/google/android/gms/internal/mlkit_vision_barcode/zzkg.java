package com.google.android.gms.internal.mlkit_vision_barcode;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzkg implements c {
    static final zzkg zza = new zzkg();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;

    static {
        b.C2317b c2317bA = b.a("imageFormat");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = c2317bA.b(zzfaVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("originalImageSize");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = c2317bA2.b(zzfaVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("compressedImageSize");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = c2317bA3.b(zzfaVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("isOdmlImage");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = c2317bA4.b(zzfaVar4.zzb()).a();
    }

    private zzkg() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqk zzqkVar = (zzqk) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzqkVar.zza());
        dVar.add(zzc, zzqkVar.zzb());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, (Object) null);
    }
}
