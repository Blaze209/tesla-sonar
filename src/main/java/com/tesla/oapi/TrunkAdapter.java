package com.tesla.oapi;

import com.squareup.moshi.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/tesla/oapi/TrunkAdapter;", "", "<init>", "()V", "toJson", "", "trunk", "Lcom/tesla/oapi/Trunk;", "fromJson", "value", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrunkAdapter {
    public static final TrunkAdapter INSTANCE = new TrunkAdapter();

    private TrunkAdapter() {
    }

    @com.squareup.moshi.f
    public final Trunk fromJson(String value) {
        s.k(value, "value");
        for (Trunk trunk : Trunk.values()) {
            if (s.f(trunk.getValue(), value)) {
                s.h(trunk);
                return trunk;
            }
        }
        trunk = null;
        s.h(trunk);
        return trunk;
    }

    @x
    public final String toJson(Trunk trunk) {
        s.k(trunk, "trunk");
        return trunk.getValue();
    }
}
