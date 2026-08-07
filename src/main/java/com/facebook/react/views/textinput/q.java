package com.facebook.react.views.textinput;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes4.dex */
class q extends com.facebook.react.uimanager.events.d<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f23843a;

    @Deprecated
    q(int i11, String str) {
        this(-1, i11, str);
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(Action.KEY_ATTRIBUTE, this.f23843a);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topKeyPress";
    }

    q(int i11, int i12, String str) {
        super(i11, i12);
        this.f23843a = str;
    }
}
