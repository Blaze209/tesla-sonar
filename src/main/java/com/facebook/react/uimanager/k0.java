package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes4.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ReadableMap f23326a;

    public k0(ReadableMap readableMap) {
        this.f23326a = readableMap;
    }

    public boolean a(String str, boolean z11) {
        return this.f23326a.isNull(str) ? z11 : this.f23326a.getBoolean(str);
    }

    public ReadableMap b(String str) {
        return this.f23326a.getMap(str);
    }

    public String c(String str) {
        return this.f23326a.getString(str);
    }

    public boolean d(String str) {
        return this.f23326a.hasKey(str);
    }

    public String toString() {
        return "{ " + getClass().getSimpleName() + ": " + this.f23326a.toString() + " }";
    }
}
