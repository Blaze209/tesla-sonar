package com.fourthline.adapters.errors;

import com.plaid.internal.EnumC4419g;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/fourthline/adapters/errors/KycJsonError;", "", "errorCode", "", "errorDescription", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getErrorCode", "()I", "getErrorDescription", "()Ljava/lang/String;", "INCORRECT_PROVIDER_CONFIGURATION", "INCORRECT_PERSON_CONFIGURATION", "INCORRECT_ADDRESS_CONFIGURATION", "INCORRECT_CONTACTS_CONFIGURATION", "INCORRECT_PROFESSION_CONFIGURATION", "INCORRECT_SELFIE_CONFIGURATION", "INCORRECT_DOCUMENT_CONFIGURATION", "INCORRECT_SECONDARY_DOCUMENT_CONFIGURATION", "INCORRECT_DEVICE_METADATA_CONFIGURATION", "INCORRECT_DOCUMENTS_TO_SIGN_CONFIGURATION", "INCORRECT_TAX_INFO_CONFIGURATION", "JSON_PARSE_ERROR", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum KycJsonError {
    INCORRECT_PROVIDER_CONFIGURATION(200, "Incorrect Provider configuration"),
    INCORRECT_PERSON_CONFIGURATION(EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, "Incorrect Person configuration"),
    INCORRECT_ADDRESS_CONFIGURATION(EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, "Incorrect Address configuration"),
    INCORRECT_CONTACTS_CONFIGURATION(EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, "Incorrect Contacts configuration"),
    INCORRECT_PROFESSION_CONFIGURATION(EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE, "Incorrect Profession configuration"),
    INCORRECT_SELFIE_CONFIGURATION(EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE, "Incorrect Selfie configuration"),
    INCORRECT_DOCUMENT_CONFIGURATION(EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE, "Incorrect Document configuration"),
    INCORRECT_SECONDARY_DOCUMENT_CONFIGURATION(EnumC4419g.SDK_ASSET_ICON_COMMENT_VALUE, "Incorrect Secondary Document configuration"),
    INCORRECT_DEVICE_METADATA_CONFIGURATION(EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, "Incorrect Metadata configuration"),
    INCORRECT_DOCUMENTS_TO_SIGN_CONFIGURATION(EnumC4419g.SDK_ASSET_ICON_INCOMPLETE_VALUE, "Incorrect Documents To Sign configuration"),
    INCORRECT_TAX_INFO_CONFIGURATION(EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, "Incorrect Tax Info configuration"),
    JSON_PARSE_ERROR(EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, "Could not parse the provided json");

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());
    private final int errorCode;
    private final String errorDescription;

    KycJsonError(int i11, String str) {
        this.errorCode = i11;
        this.errorDescription = str;
    }

    public static EnumEntries<KycJsonError> getEntries() {
        return $ENTRIES;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }
}
