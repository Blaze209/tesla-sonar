package com.tesla.oapi;

import io.realm.internal.Keep;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/tesla/oapi/CoolingLevel;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OFF", "LOW", "MEDIUM", "HIGH", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Keep
public enum CoolingLevel {
    OFF(0),
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final int value;

    CoolingLevel(int i11) {
        this.value = i11;
    }

    public static EnumEntries<CoolingLevel> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
