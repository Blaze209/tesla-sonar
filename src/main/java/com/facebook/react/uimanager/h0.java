package com.facebook.react.uimanager;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/facebook/react/uimanager/h0;", "", "<init>", "()V", "", "a", "()I", "b", "I", "nextRootViewTag", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f23213a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static int nextRootViewTag = 1;

    private h0() {
    }

    public static final synchronized int a() {
        int i11;
        i11 = nextRootViewTag;
        nextRootViewTag = i11 + 10;
        return i11;
    }
}
