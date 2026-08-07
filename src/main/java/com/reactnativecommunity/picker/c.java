package com.reactnativecommunity.picker;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes6.dex */
public class c extends com.facebook.react.uimanager.events.d<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48502a;

    public c(int i11, int i12) {
        super(i11);
        this.f48502a = i12;
    }

    private WritableMap a() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("position", this.f48502a);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), a());
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topSelect";
    }
}
