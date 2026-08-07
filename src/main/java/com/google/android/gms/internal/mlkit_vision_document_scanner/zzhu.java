package com.google.android.gms.internal.mlkit_vision_document_scanner;

import rv.b;
import rv.c;
import rv.d;

/* JADX INFO: loaded from: classes5.dex */
final class zzhu implements c {
    static final zzhu zza = new zzhu();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;

    static {
        b.C2317b c2317bA = b.a("durationMs");
        zzal zzalVar = new zzal();
        zzalVar.zza(1);
        zzb = c2317bA.b(zzalVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("errorCode");
        zzal zzalVar2 = new zzal();
        zzalVar2.zza(2);
        zzc = c2317bA2.b(zzalVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("options");
        zzal zzalVar3 = new zzal();
        zzalVar3.zza(3);
        zzd = c2317bA3.b(zzalVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("pageCount");
        zzal zzalVar4 = new zzal();
        zzalVar4.zza(4);
        zze = c2317bA4.b(zzalVar4.zzb()).a();
    }

    private zzhu() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpd zzpdVar = (zzpd) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzpdVar.zza());
        dVar.add(zzc, zzpdVar.zzb());
        dVar.add(zzd, zzpdVar.zzc());
        dVar.add(zze, zzpdVar.zzd());
    }
}
