package com.fourthline.adapters.errors;

import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/fourthline/adapters/errors/LocationProviderJSONError;", "", "errorCode", "", "errorDescription", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getErrorCode", "()I", "getErrorDescription", "()Ljava/lang/String;", "LOCATION_SERVICES_NOT_ENABLED", "LOCATION_PERMISSIONS_NOT_GRANTED", "ANOTHER_REQUEST_IS_IN_PROGRESS", "UNKNOWN", "toString", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum LocationProviderJSONError {
    LOCATION_SERVICES_NOT_ENABLED(0, "Location services not enabled"),
    LOCATION_PERMISSIONS_NOT_GRANTED(1, "Location permission not granted"),
    ANOTHER_REQUEST_IS_IN_PROGRESS(2, "Another request in progress"),
    UNKNOWN(4, "Unknown error");

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());
    private final int errorCode;
    private final String errorDescription;

    LocationProviderJSONError(int i11, String str) {
        this.errorCode = i11;
        this.errorDescription = str;
    }

    public static EnumEntries<LocationProviderJSONError> getEntries() {
        return $ENTRIES;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "{ \"errorCode\" : " + this.errorCode + ", \"errorDescription\" : \"" + this.errorDescription + "\" }";
    }
}
