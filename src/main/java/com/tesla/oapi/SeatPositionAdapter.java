package com.tesla.oapi;

import com.squareup.moshi.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/tesla/oapi/SeatPositionAdapter;", "", "<init>", "()V", "toJson", "", "heater", "Lcom/tesla/oapi/SeatPosition;", "fromJson", "value", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SeatPositionAdapter {
    public static final SeatPositionAdapter INSTANCE = new SeatPositionAdapter();

    private SeatPositionAdapter() {
    }

    @com.squareup.moshi.f
    public final SeatPosition fromJson(int value) {
        for (SeatPosition seatPosition : SeatPosition.values()) {
            if (seatPosition.getValue() == value) {
                s.h(seatPosition);
                return seatPosition;
            }
        }
        seatPosition = null;
        s.h(seatPosition);
        return seatPosition;
    }

    @x
    public final int toJson(SeatPosition heater) {
        s.k(heater, "heater");
        return heater.getValue();
    }
}
