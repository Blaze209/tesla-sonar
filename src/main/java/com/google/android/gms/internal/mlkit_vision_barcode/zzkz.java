package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import rv.b;
import rv.c;

/* JADX INFO: loaded from: classes5.dex */
final class zzkz implements c {
    static final zzkz zza = new zzkz();

    static {
        b.C2317b c2317bA = b.a("isChargingRequired");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        c2317bA.b(zzfaVar.zzb()).a();
        b.C2317b c2317bA2 = b.a(DownloaderService.EXTRA_IS_WIFI_REQUIRED);
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        c2317bA2.b(zzfaVar2.zzb()).a();
        b.C2317b c2317bA3 = b.a("isDeviceIdleRequired");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        c2317bA3.b(zzfaVar3.zzb()).a();
        b.C2317b c2317bA4 = b.a("canDownloadInBackground");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        c2317bA4.b(zzfaVar4.zzb()).a();
    }

    private zzkz() {
    }

    @Override // rv.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
