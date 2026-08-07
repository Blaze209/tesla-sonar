package com.reactnativecommunity.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes6.dex */
public class f extends com.facebook.react.uimanager.events.d<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f48542a;

    public f(int i11, double d11) {
        super(i11);
        this.f48542a = d11;
    }

    private WritableMap b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putDouble("value", a());
        return writableMapCreateMap;
    }

    public double a() {
        return this.f48542a;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        return b();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "onRNCSliderSlidingComplete";
    }
}
