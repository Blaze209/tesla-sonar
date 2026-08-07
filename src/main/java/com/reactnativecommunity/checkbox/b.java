package com.reactnativecommunity.checkbox;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;

/* JADX INFO: loaded from: classes6.dex */
class b extends d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48478a;

    public b(int i11, boolean z11) {
        super(i11);
        this.f48478a = z11;
    }

    private WritableMap b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putBoolean("value", a());
        return writableMapCreateMap;
    }

    public boolean a() {
        return this.f48478a;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), b());
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topChange";
    }
}
