package com.tesla.oapi;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/oapi/CachedResponseListener;", "", "", "vin", "", "cached", "Ljn0/h0;", "onVehicleDataResponseCached", "(Ljava/lang/String;Z)V", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CachedResponseListener {
    void onVehicleDataResponseCached(String vin, boolean cached);
}
