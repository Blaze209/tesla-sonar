package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzes implements c {
    static final zzes zza = new zzes();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;

    static {
        b.C2317b c2317bA = b.a("isChargingRequired");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = c2317bA.b(zzaeVar.zzb()).a();
        b.C2317b c2317bA2 = b.a(DownloaderService.EXTRA_IS_WIFI_REQUIRED);
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = c2317bA2.b(zzaeVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("isDeviceIdleRequired");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = c2317bA3.b(zzaeVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("canDownloadInBackground");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = c2317bA4.b(zzaeVar4.zzb()).a();
    }

    private zzes() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
