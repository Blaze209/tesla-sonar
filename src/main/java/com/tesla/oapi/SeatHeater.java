package com.tesla.oapi;

import io.realm.internal.Keep;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/tesla/oapi/SeatHeater;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "FRONT_LEFT", "FRONT_RIGHT", "REAR_LEFT", "REAR_LEFT_BACK", "REAR_CENTER", "REAR_RIGHT", "REAR_RIGHT_BACK", "THIRD_ROW_LEFT", "THIRD_ROW_RIGHT", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Keep
public enum SeatHeater {
    UNKNOWN(10),
    FRONT_LEFT(0),
    FRONT_RIGHT(1),
    REAR_LEFT(2),
    REAR_LEFT_BACK(3),
    REAR_CENTER(4),
    REAR_RIGHT(5),
    REAR_RIGHT_BACK(6),
    THIRD_ROW_LEFT(7),
    THIRD_ROW_RIGHT(8);

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final int value;

    SeatHeater(int i11) {
        this.value = i11;
    }

    public static EnumEntries<SeatHeater> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
