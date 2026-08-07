package com.facebook.react.uimanager;

import android.view.Choreographer;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/uimanager/g;", "Landroid/view/Choreographer$FrameCallback;", "Lcom/facebook/react/bridge/JSExceptionHandler;", "exceptionHandler", "<init>", "(Lcom/facebook/react/bridge/JSExceptionHandler;)V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "(Lcom/facebook/react/bridge/ReactContext;)V", "", "frameTimeNanos", "Ljn0/h0;", "doFrame", "(J)V", "doFrameGuarded", "Lcom/facebook/react/bridge/JSExceptionHandler;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class g implements Choreographer.FrameCallback {
    private final JSExceptionHandler exceptionHandler;

    protected g(JSExceptionHandler exceptionHandler) {
        p013kotlin.jvm.internal.s.k(exceptionHandler, "exceptionHandler");
        this.exceptionHandler = exceptionHandler;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        try {
            doFrameGuarded(frameTimeNanos);
        } catch (RuntimeException e11) {
            this.exceptionHandler.handleException(e11);
        }
    }

    protected abstract void doFrameGuarded(long frameTimeNanos);

    /* JADX WARN: Illegal instructions before constructor call */
    protected g(ReactContext reactContext) {
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        JSExceptionHandler exceptionHandler = reactContext.getExceptionHandler();
        p013kotlin.jvm.internal.s.j(exceptionHandler, "getExceptionHandler(...)");
        this(exceptionHandler);
    }
}
