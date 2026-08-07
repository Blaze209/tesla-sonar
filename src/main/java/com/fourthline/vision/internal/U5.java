package com.fourthline.vision.internal;

import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
public enum U5 {
    AVC("video/avc");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f38014d = on0.a.a(values());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38015a;

    U5(String str) {
        this.f38015a = str;
    }

    public static EnumEntries<U5> getEntries() {
        return f38014d;
    }

    public final String getMimeType() {
        return this.f38015a;
    }
}
