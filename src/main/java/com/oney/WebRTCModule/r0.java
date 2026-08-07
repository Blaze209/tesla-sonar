package com.oney.WebRTCModule;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes6.dex */
public class r0 implements a.InterfaceC0713a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f46064c = "com.oney.WebRTCModule.r0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebRTCModule f46065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46066b;

    public r0(WebRTCModule webRTCModule, String str) {
        this.f46065a = webRTCModule;
        this.f46066b = str;
    }

    @Override // com.oney.WebRTCModule.a.InterfaceC0713a
    public void a() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("trackId", this.f46066b);
        Log.d(f46064c, "ended event trackId: " + this.f46066b);
        this.f46065a.sendEvent("mediaStreamTrackEnded", writableMapCreateMap);
    }
}
