package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes4.dex */
public class m extends com.facebook.react.uimanager.events.d<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f23840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23841b;

    public m(int i11, int i12, String str, int i13) {
        super(i11, i12);
        this.f23840a = str;
        this.f23841b = i13;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("text", this.f23840a);
        writableMapCreateMap.putInt("eventCount", this.f23841b);
        writableMapCreateMap.putInt("target", getViewTag());
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topChange";
    }
}
