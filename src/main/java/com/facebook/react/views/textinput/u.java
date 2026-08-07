package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes4.dex */
class u extends com.facebook.react.uimanager.events.d<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23856b;

    public u(int i11, int i12, int i13, int i14) {
        super(i11, i12);
        this.f23855a = i13;
        this.f23856b = i14;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("end", this.f23856b);
        writableMapCreateMap2.putInt("start", this.f23855a);
        writableMapCreateMap.putMap("selection", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topSelectionChange";
    }
}
