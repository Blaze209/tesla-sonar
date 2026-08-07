package com.tencent.mm.opensdk.diffdev.a;

import com.google.android.gms.wallet.WalletConstants;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;

/* JADX INFO: loaded from: classes7.dex */
public enum d {
    UUID_EXPIRED(WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE),
    UUID_CANCELED(DownloaderService.STATUS_FORBIDDEN),
    UUID_SCANED(404),
    UUID_CONFIRM(WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR),
    UUID_KEEP_CONNECT(408),
    UUID_ERROR(500);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f55568a;

    d(int i11) {
        this.f55568a = i11;
    }

    public int a() {
        return this.f55568a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "UUIDStatusCode:" + this.f55568a;
    }
}
