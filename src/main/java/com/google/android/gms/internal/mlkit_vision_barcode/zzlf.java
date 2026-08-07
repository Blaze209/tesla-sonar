package com.google.android.gms.internal.mlkit_vision_barcode;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzlf implements c {
    static final zzlf zza = new zzlf();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;

    static {
        b.C2317b c2317bA = b.a("inferenceCommonLogEvent");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = c2317bA.b(zzfaVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("options");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = c2317bA2.b(zzfaVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("detectedBarcodeFormats");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = c2317bA3.b(zzfaVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("detectedBarcodeValueTypes");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = c2317bA4.b(zzfaVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("imageInfo");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = c2317bA5.b(zzfaVar5.zzb()).a();
    }

    private zzlf() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrr zzrrVar = (zzrr) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzrrVar.zzd());
        dVar.add(zzc, zzrrVar.zze());
        dVar.add(zzd, zzrrVar.zza());
        dVar.add(zze, zzrrVar.zzb());
        dVar.add(zzf, zzrrVar.zzc());
    }
}
