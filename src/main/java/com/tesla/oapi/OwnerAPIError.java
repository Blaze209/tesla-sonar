package com.tesla.oapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes8.dex */
public enum OwnerAPIError {
    OWNERAPI_ERROR_UNAUTHORIZED("UNAUTHORIZED"),
    OWNERAPI_ERROR_NOT_FOUND("NOT_FOUND"),
    OWNERAPI_ERROR_MOBILE_ACCESS_DISABLED("MOBILE_ACCESS_DISABLED"),
    OWNERAPI_ERROR_TIMEOUT("OWNER_API_TIMEOUT"),
    OWNERAPI_ERROR_ACCOUNT_LOCKED("ACCOUNT_LOCKED"),
    OWNERAPI_ERROR_TOO_MANY_REQUESTS("TOO_MANY_REQUESTS"),
    OWNERAPI_ERROR_SERVER_ERROR("SERVER_ERROR"),
    OWNERAPI_ERROR_SERVER_SYSTEM_WIDE_ERROR("SERVER_SYSTEM_WIDE_ERROR"),
    OWNERAPI_ERROR_VEHICLE_SPECIFIC_ERROR("VEHICLE_SPECIFIC_ERROR"),
    OWNERAPI_ERROR_SERVICE_MAINTENANCE("SERVICE_MAINTENANCE"),
    OWNERAPI_ERROR_EMPTY_RESPONSE("EMPTY_RESPONSE"),
    OWNERAPI_ERROR_BAD_RESPONSE("BAD_RESPONSE"),
    OWNERAPI_ERROR_BACKEND_DEPENDENCY_OR_MISSING_DATA("BACKEND_DEPENDENCY_FAILURE_OR_MISSING_DATA"),
    OWNERAPI_ERROR_GATEWAY_TIMEOUT("GATEWAY_TIMEOUT"),
    OWNERAPI_ERROR_UNPROCESSABLE_ENTITY("UNPROCESSABLE_ENTITY"),
    OWNERAPI_ERROR_UNKNOWN_ERROR("UNKNOWN_ERROR");

    public static final HashSet<String> UnrecoverableErrorStrings;
    public static final HashSet<OwnerAPIError> UnrecoverableErrors;
    static final HashMap<String, OwnerAPIError> errorStringMap = new HashMap<>();
    private final String errorString;

    static {
        for (OwnerAPIError ownerAPIError : values()) {
            errorStringMap.put(ownerAPIError.errorString, ownerAPIError);
        }
        OwnerAPIError ownerAPIError2 = OWNERAPI_ERROR_UNAUTHORIZED;
        OwnerAPIError ownerAPIError3 = OWNERAPI_ERROR_ACCOUNT_LOCKED;
        OwnerAPIError ownerAPIError4 = OWNERAPI_ERROR_SERVICE_MAINTENANCE;
        OwnerAPIError ownerAPIError5 = OWNERAPI_ERROR_MOBILE_ACCESS_DISABLED;
        OwnerAPIError ownerAPIError6 = OWNERAPI_ERROR_NOT_FOUND;
        OwnerAPIError ownerAPIError7 = OWNERAPI_ERROR_TOO_MANY_REQUESTS;
        UnrecoverableErrors = new HashSet<>(Arrays.asList(ownerAPIError2, ownerAPIError3, ownerAPIError4, ownerAPIError5, ownerAPIError6, ownerAPIError7));
        UnrecoverableErrorStrings = new HashSet<>(Arrays.asList(ownerAPIError2.getErrorString(), ownerAPIError3.getErrorString(), ownerAPIError4.getErrorString(), ownerAPIError5.getErrorString(), ownerAPIError6.getErrorString(), ownerAPIError7.getErrorString()));
    }

    OwnerAPIError(String str) {
        this.errorString = str;
    }

    public static OwnerAPIError fromString(String str) {
        HashMap<String, OwnerAPIError> map = errorStringMap;
        return map.containsKey(str) ? map.get(str) : OWNERAPI_ERROR_UNKNOWN_ERROR;
    }

    public static OwnerAPIError getOwnerAPIError(int i11) {
        if (isUnauthorized(i11)) {
            return OWNERAPI_ERROR_UNAUTHORIZED;
        }
        if (i11 == 404) {
            return OWNERAPI_ERROR_NOT_FOUND;
        }
        if (i11 == 405) {
            return OWNERAPI_ERROR_MOBILE_ACCESS_DISABLED;
        }
        if (i11 == 408) {
            return OWNERAPI_ERROR_TIMEOUT;
        }
        if (i11 == 412) {
            return OWNERAPI_ERROR_BACKEND_DEPENDENCY_OR_MISSING_DATA;
        }
        if (i11 == 422) {
            return OWNERAPI_ERROR_UNPROCESSABLE_ENTITY;
        }
        if (i11 == 423) {
            return OWNERAPI_ERROR_ACCOUNT_LOCKED;
        }
        if (i11 == 429) {
            return OWNERAPI_ERROR_TOO_MANY_REQUESTS;
        }
        if (i11 == 500) {
            return OWNERAPI_ERROR_SERVER_ERROR;
        }
        if (i11 == 502) {
            return OWNERAPI_ERROR_SERVER_SYSTEM_WIDE_ERROR;
        }
        if (i11 == 503) {
            return OWNERAPI_ERROR_SERVICE_MAINTENANCE;
        }
        if (i11 == 504) {
            return OWNERAPI_ERROR_GATEWAY_TIMEOUT;
        }
        if (i11 == 540) {
            return OWNERAPI_ERROR_VEHICLE_SPECIFIC_ERROR;
        }
        if (i11 > 299) {
            return OWNERAPI_ERROR_UNKNOWN_ERROR;
        }
        return null;
    }

    public static boolean isUnauthorized(int i11) {
        return i11 == 401;
    }

    public String getErrorString() {
        return this.errorString;
    }
}
