package com.facebook.react.bridge;

import android.os.SystemClock;
import com.facebook.soloader.SoLoader;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/bridge/ReactBridge;", "", "<init>", "()V", "Ljn0/h0;", "staticInit", "", "_loadStartTime", "J", "_loadEndTime", "", "_didInit", "Z", "getLoadStartTime", "()J", "getLoadStartTime$annotations", "loadStartTime", "getLoadEndTime", "getLoadEndTime$annotations", "loadEndTime", "isInitialized", "()Z", "isInitialized$annotations", "initialized", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactBridge {
    public static final ReactBridge INSTANCE = new ReactBridge();
    private static volatile boolean _didInit;
    private static volatile long _loadEndTime;
    private static volatile long _loadStartTime;

    private ReactBridge() {
    }

    public static final long getLoadEndTime() {
        return _loadEndTime;
    }

    public static /* synthetic */ void getLoadEndTime$annotations() {
    }

    public static final long getLoadStartTime() {
        return _loadStartTime;
    }

    public static /* synthetic */ void getLoadStartTime$annotations() {
    }

    public static final boolean isInitialized() {
        return _didInit;
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static final synchronized void staticInit() {
        if (_didInit) {
            return;
        }
        _loadStartTime = SystemClock.uptimeMillis();
        ep.a.c(0L, "ReactBridge.staticInit::load:reactnativejni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
        SoLoader.t("reactnativejni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
        ep.a.i(0L);
        _loadEndTime = SystemClock.uptimeMillis();
        _didInit = true;
    }
}
