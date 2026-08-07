package com.google.android.gms.internal.mlkit_vision_document_scanner;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzgq implements c {
    static final zzgq zza = new zzgq();

    static {
        b.C2317b c2317bA = b.a("isChargingRequired");
        zzal zzalVar = new zzal();
        zzalVar.zza(1);
        c2317bA.b(zzalVar.zzb()).a();
        b.C2317b c2317bA2 = b.a(DownloaderService.EXTRA_IS_WIFI_REQUIRED);
        zzal zzalVar2 = new zzal();
        zzalVar2.zza(2);
        c2317bA2.b(zzalVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("isDeviceIdleRequired");
        zzal zzalVar3 = new zzal();
        zzalVar3.zza(3);
        c2317bA3.b(zzalVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("canDownloadInBackground");
        zzal zzalVar4 = new zzal();
        zzalVar4.zza(4);
        c2317bA4.b(zzalVar4.zzb()).a();
    }

    private zzgq() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
