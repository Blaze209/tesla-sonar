package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* JADX INFO: loaded from: classes4.dex */
public class b extends com.facebook.react.uimanager.events.d<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23802b;

    public b(int i11, int i12, float f11, float f12) {
        super(i11, i12);
        this.f23801a = f11;
        this.f23802b = f12;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble(Snapshot.WIDTH, this.f23801a);
        writableMapCreateMap2.putDouble(Snapshot.HEIGHT, this.f23802b);
        writableMapCreateMap.putMap("contentSize", writableMapCreateMap2);
        writableMapCreateMap.putInt("target", getViewTag());
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topContentSizeChange";
    }
}
