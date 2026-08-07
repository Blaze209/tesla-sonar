package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

/* JADX INFO: loaded from: classes5.dex */
public final class zzfb {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x004c A[RETURN] */
    public static int zza(String str) {
        if (str == null) {
            return 13;
        }
        switch (str) {
            case "REQUEST_DENIED":
                return PlacesStatusCodes.REQUEST_DENIED;
            case "INVALID_REQUEST":
                return PlacesStatusCodes.INVALID_REQUEST;
            case "ZERO_RESULTS":
                return 0;
            case "OK":
                return 0;
            case "NOT_FOUND":
                return PlacesStatusCodes.NOT_FOUND;
            case "OVER_QUERY_LIMIT":
                return PlacesStatusCodes.OVER_QUERY_LIMIT;
            default:
                return 13;
        }
    }

    public static String zzb(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : str2;
    }
}
