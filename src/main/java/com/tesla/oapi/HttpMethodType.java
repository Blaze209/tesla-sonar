package com.tesla.oapi;

import androidx.annotation.Keep;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tesla/oapi/HttpMethodType;", "", "<init>", "(Ljava/lang/String;I)V", "GET", "POST", "PUT", "PATCH", "DELETE", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum HttpMethodType {
    GET,
    POST,
    PUT,
    PATCH,
    DELETE;

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    public static EnumEntries<HttpMethodType> getEntries() {
        return $ENTRIES;
    }
}
