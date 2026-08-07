package com.tesla.oapi;

import com.squareup.moshi.u;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/oapi/AdapterMoshi;", "", "<init>", "()V", "Lcom/squareup/moshi/u;", "moshi", "Lcom/squareup/moshi/u;", "getMoshi", "()Lcom/squareup/moshi/u;", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AdapterMoshi {
    public static final AdapterMoshi INSTANCE = new AdapterMoshi();
    private static final u moshi;

    static {
        u uVarD = new u.b().b(SeatHeaterAdapter.INSTANCE).b(SeatHeaterLevelAdapter.INSTANCE).b(DoorAdapter.INSTANCE).b(ClimateKeeperModeLevelAdapter.INSTANCE).b(StwHeatLevelAdapter.INSTANCE).b(SeatPositionAdapter.INSTANCE).b(OverrideModeAdapter.INSTANCE).b(ClimateOverrideModeAdapter.INSTANCE).b(CoolingLevelAdapter.INSTANCE).b(TrunkAdapter.INSTANCE).b(WindowControlCommandAdapter.INSTANCE).b(SunroofStateChangeAdapter.INSTANCE).d();
        s.j(uVarD, "build(...)");
        moshi = uVarD;
    }

    private AdapterMoshi() {
    }

    public final u getMoshi() {
        return moshi;
    }
}
