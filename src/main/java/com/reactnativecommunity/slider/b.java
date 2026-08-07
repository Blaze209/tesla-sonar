package com.reactnativecommunity.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes6.dex */
public class b extends com.facebook.react.uimanager.events.d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f48540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f48541b;

    public b(int i11, double d11, boolean z11) {
        super(i11);
        this.f48540a = d11;
        this.f48541b = z11;
    }

    private WritableMap c() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putDouble("value", a());
        writableMapCreateMap.putBoolean("fromUser", b());
        return writableMapCreateMap;
    }

    public double a() {
        return this.f48540a;
    }

    public boolean b() {
        return this.f48541b;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        return c();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topChange";
    }
}
