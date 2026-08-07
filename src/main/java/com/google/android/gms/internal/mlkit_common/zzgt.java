package com.google.android.gms.internal.mlkit_common;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzgt implements c {
    static final zzgt zza = new zzgt();

    static {
        b.C2317b c2317bA = b.a("isChargingRequired");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        c2317bA.b(zzayVar.zzb()).a();
        b.C2317b c2317bA2 = b.a(DownloaderService.EXTRA_IS_WIFI_REQUIRED);
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        c2317bA2.b(zzayVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("isDeviceIdleRequired");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        c2317bA3.b(zzayVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("canDownloadInBackground");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        c2317bA4.b(zzayVar4.zzb()).a();
    }

    private zzgt() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
