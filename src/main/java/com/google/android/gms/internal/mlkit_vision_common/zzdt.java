package com.google.android.gms.internal.mlkit_vision_common;

import ezvcard.property.Kind;
import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzdt implements c {
    static final zzdt zza = new zzdt();
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

    static {
        b.C2317b c2317bA = b.a("sdkVersion");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = c2317bA.b(zzaeVar.zzb()).a();
        b.C2317b c2317bA2 = b.a("osBuild");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = c2317bA2.b(zzaeVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("brand");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = c2317bA3.b(zzaeVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a(Kind.DEVICE);
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = c2317bA4.b(zzaeVar4.zzb()).a();
        b.C2317b c2317bA5 = b.a("hardware");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = c2317bA5.b(zzaeVar5.zzb()).a();
        b.C2317b c2317bA6 = b.a("manufacturer");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = c2317bA6.b(zzaeVar6.zzb()).a();
        b.C2317b c2317bA7 = b.a("model");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        zzh = c2317bA7.b(zzaeVar7.zzb()).a();
        b.C2317b c2317bA8 = b.a("product");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        zzi = c2317bA8.b(zzaeVar8.zzb()).a();
        b.C2317b c2317bA9 = b.a("soc");
        zzae zzaeVar9 = new zzae();
        zzaeVar9.zza(9);
        zzj = c2317bA9.b(zzaeVar9.zzb()).a();
        b.C2317b c2317bA10 = b.a("socMetaBuildId");
        zzae zzaeVar10 = new zzae();
        zzaeVar10.zza(10);
        zzk = c2317bA10.b(zzaeVar10.zzb()).a();
    }

    private zzdt() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
