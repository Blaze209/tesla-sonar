package com.horcrux.svg.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.w;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* JADX INFO: loaded from: classes6.dex */
public class SvgOnLayoutEvent extends d<SvgOnLayoutEvent> {
    public static final String EVENT_NAME = "topSvgLayout";
    public int height;
    public int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f45361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f45362y;

    public SvgOnLayoutEvent(int i11, int i12, int i13, int i14, int i15, int i16) {
        super(i11, i12);
        this.f45361x = i13;
        this.f45362y = i14;
        this.width = i15;
        this.height = i16;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", w.f(this.f45361x));
        writableMapCreateMap.putDouble("y", w.f(this.f45362y));
        writableMapCreateMap.putDouble(Snapshot.WIDTH, w.f(this.width));
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, w.f(this.height));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("layout", writableMapCreateMap);
        writableMapCreateMap2.putInt("target", getViewTag());
        return writableMapCreateMap2;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return EVENT_NAME;
    }
}
