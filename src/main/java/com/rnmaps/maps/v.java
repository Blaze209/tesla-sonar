package com.rnmaps.maps;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes6.dex */
public class v extends com.facebook.react.uimanager.events.d<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LatLngBounds f49342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f49343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f49344c;

    public v(int i11, LatLngBounds latLngBounds, boolean z11, boolean z12) {
        super(i11);
        this.f49342a = latLngBounds;
        this.f49343b = z11;
        this.f49344c = z12;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("continuous", this.f49343b);
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        LatLng center = this.f49342a.getCenter();
        writableNativeMap2.putDouble(OrcaKeys.LATITUDE, center.latitude);
        writableNativeMap2.putDouble(OrcaKeys.LONGITUDE, center.longitude);
        LatLngBounds latLngBounds = this.f49342a;
        writableNativeMap2.putDouble("latitudeDelta", latLngBounds.northeast.latitude - latLngBounds.southwest.latitude);
        LatLngBounds latLngBounds2 = this.f49342a;
        writableNativeMap2.putDouble("longitudeDelta", latLngBounds2.northeast.longitude - latLngBounds2.southwest.longitude);
        writableNativeMap.putMap("region", writableNativeMap2);
        writableNativeMap.putBoolean("isGesture", this.f49344c);
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), writableNativeMap);
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topChange";
    }
}
