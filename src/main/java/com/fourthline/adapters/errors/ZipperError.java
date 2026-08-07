package com.fourthline.adapters.errors;

import com.google.android.gms.wallet.WalletConstants;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/fourthline/adapters/errors/ZipperError;", "", "errorCode", "", "errorDescription", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getErrorCode", "()I", "getErrorDescription", "()Ljava/lang/String;", "KYC_NOT_VALID", "CAN_NOT_CREATE_ZIP", "ZIP_EXCEED_MAXIMUM_SIZE", "NOT_ENOUGH_SPACE", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ZipperError {
    KYC_NOT_VALID(400, "kycIsNotValid"),
    CAN_NOT_CREATE_ZIP(WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE, "cannotCreateZip"),
    ZIP_EXCEED_MAXIMUM_SIZE(DownloaderService.STATUS_FORBIDDEN, "zipExceedMaximumSize"),
    NOT_ENOUGH_SPACE(404, "notEnoughSpace");

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());
    private final int errorCode;
    private final String errorDescription;

    ZipperError(int i11, String str) {
        this.errorCode = i11;
        this.errorDescription = str;
    }

    public static EnumEntries<ZipperError> getEntries() {
        return $ENTRIES;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }
}
