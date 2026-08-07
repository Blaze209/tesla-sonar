package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes4.dex */
class w extends com.facebook.react.uimanager.events.d<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f23857a;

    public w(int i11, int i12, String str) {
        super(i11, i12);
        this.f23857a = str;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putString("text", this.f23857a);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topSubmitEditing";
    }
}
