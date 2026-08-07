package com.facebook.react.devsupport;

import com.facebook.soloader.SoLoader;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/facebook/react/devsupport/g0;", "", "<init>", "()V", "Ljn0/h0;", "a", "", "b", "Z", "didInit", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f22483a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static volatile boolean didInit;

    private g0() {
    }

    public static final synchronized void a() {
        if (didInit) {
            return;
        }
        SoLoader.t("react_devsupportjni");
        didInit = true;
    }
}
