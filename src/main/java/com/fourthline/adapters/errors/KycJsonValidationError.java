package com.fourthline.adapters.errors;

import com.plaid.internal.EnumC4419g;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/fourthline/adapters/errors/KycJsonValidationError;", "", "errorCode", "", "errorDescription", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getErrorCode", "()I", "getErrorDescription", "()Ljava/lang/String;", "INVALID_PROVIDER_CONTAINER", "INVALID_PERSON_CONTAINER", "INVALID_ADDRESS_CONTAINER", "INVALID_CONTACTS_CONTAINER", "INVALID_SELFIE_CONTAINER", "INVALID_DOCUMENT_CONTAINER", "INVALID_NFC_CONTAINER", "INVALID_SECONDARY_DOCUMENT_CONTAINER", "INVALID_DEVICE_METADATA_CONTAINER", "INVALID_DOCUMENTS_TO_SIGN_CONTAINERS", "INVALID_TAX_INFO_CONTAINER", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum KycJsonValidationError {
    INVALID_PROVIDER_CONTAINER(300, "Invalid Provider container"),
    INVALID_PERSON_CONTAINER(EnumC4419g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, "Invalid Person container"),
    INVALID_ADDRESS_CONTAINER(EnumC4419g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE, "Invalid Address container"),
    INVALID_CONTACTS_CONTAINER(EnumC4419g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, "Invalid Contacts container"),
    INVALID_SELFIE_CONTAINER(EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, "Invalid Selfie container"),
    INVALID_DOCUMENT_CONTAINER(EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, "Invalid Document container"),
    INVALID_NFC_CONTAINER(EnumC4419g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, "Invalid NFC container"),
    INVALID_SECONDARY_DOCUMENT_CONTAINER(307, "Invalid Secondary Document container"),
    INVALID_DEVICE_METADATA_CONTAINER(308, "Invalid Device Metadata container"),
    INVALID_DOCUMENTS_TO_SIGN_CONTAINERS(EnumC4419g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE, "Invalid Documents To Sign containers"),
    INVALID_TAX_INFO_CONTAINER(EnumC4419g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE, "Invalid Tax Info container");

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());
    private final int errorCode;
    private final String errorDescription;

    KycJsonValidationError(int i11, String str) {
        this.errorCode = i11;
        this.errorDescription = str;
    }

    public static EnumEntries<KycJsonValidationError> getEntries() {
        return $ENTRIES;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }
}
