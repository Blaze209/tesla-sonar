package com.tesla.oapi;

import io.realm.internal.Keep;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/tesla/oapi/SunroofStateChange;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "VENT", "CLOSE", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Keep
public enum SunroofStateChange {
    VENT("vent"),
    CLOSE("close");

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final String value;

    SunroofStateChange(String str) {
        this.value = str;
    }

    public static EnumEntries<SunroofStateChange> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
