package com.tesla.domain.model.widget;

import androidx.annotation.Keep;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/tesla/domain/model/widget/VehicleClosure;", "", "<init>", "(Ljava/lang/String;I)V", "DRIVER_FRONT_DOOR", "DRIVER_REAR_DOOR", "PASSENGER_FRONT_DOOR", "PASSENGER_REAR_DOOR", "FRONT_TRUNK", "REAR_TRUNK", "LOCKED", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum VehicleClosure {
    DRIVER_FRONT_DOOR,
    DRIVER_REAR_DOOR,
    PASSENGER_FRONT_DOOR,
    PASSENGER_REAR_DOOR,
    FRONT_TRUNK,
    REAR_TRUNK,
    LOCKED;

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());

    public static EnumEntries<VehicleClosure> getEntries() {
        return $ENTRIES;
    }
}
