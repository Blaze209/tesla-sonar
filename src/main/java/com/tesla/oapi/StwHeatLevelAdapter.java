package com.tesla.oapi;

import com.squareup.moshi.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/tesla/oapi/StwHeatLevelAdapter;", "", "<init>", "()V", "toJson", "", "mode", "Lcom/tesla/oapi/StwHeatLevel;", "fromJson", "value", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StwHeatLevelAdapter {
    public static final StwHeatLevelAdapter INSTANCE = new StwHeatLevelAdapter();

    private StwHeatLevelAdapter() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
    @com.squareup.moshi.f
    public final StwHeatLevel fromJson(int value) {
        for (StwHeatLevel stwHeatLevel : StwHeatLevel.values()) {
            if (stwHeatLevel.getValue() == value) {
                if (stwHeatLevel == null) {
                    return StwHeatLevel.UNKNOWN;
                }
                return stwHeatLevel;
            }
        }
        stwHeatLevel = null;
        if (stwHeatLevel == null) {
            return StwHeatLevel.UNKNOWN;
        }
        return stwHeatLevel;
    }

    @x
    public final int toJson(StwHeatLevel mode) {
        s.k(mode, "mode");
        return mode.getValue();
    }
}
