package com.facebook.react.devsupport;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0003J\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J?\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*\u0018\u00010)2\u001a\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*\u0018\u00010)H\u0016¢\u0006\u0004\b-\u0010.J\u001b\u00101\u001a\u00020\b2\n\u0010\u0010\u001a\u00060/j\u0002`0H\u0016¢\u0006\u0004\b1\u00102J\u001b\u00105\u001a\u0004\u0018\u0001042\b\u00103\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\bH\u0016¢\u0006\u0004\b7\u0010\u0003J\u001f\u0010;\u001a\u00020\b2\u0006\u00108\u001a\u00020\u00042\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010\u0003R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010?R$\u0010D\u001a\u00020\u00162\u0006\u0010A\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bB\u0010#\"\u0004\bC\u0010\u0019R\u0016\u0010H\u001a\u0004\u0018\u00010E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0016\u0010L\u001a\u0004\u0018\u00010I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0016\u0010O\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0016\u0010Q\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010NR\u0016\u0010S\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010NR\u001c\u0010V\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0016\u0010Z\u001a\u0004\u0018\u00010W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0016\u0010^\u001a\u0004\u0018\u00010[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0016\u0010a\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006b"}, d2 = {"Lcom/facebook/react/devsupport/h1;", "Lpn/e;", "<init>", "()V", "", "optionName", "Lpn/d;", "optionHandler", "Ljn0/h0;", "n", "(Ljava/lang/String;Lpn/d;)V", "appKey", "Landroid/view/View;", "b", "(Ljava/lang/String;)Landroid/view/View;", "rootView", "e", "(Landroid/view/View;)V", "w", "r", "z", "v", "", "isHotModuleReplacementEnabled", "c", "(Z)V", "isFpsDebugEnabled", IntegerTokenConverter.CONVERTER_KEY, "g", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "p", "(Lcom/facebook/react/bridge/ReactContext;)V", "s", "D", "()Z", "C", "Lpn/h;", "callback", "B", "(Lpn/h;)V", "Landroid/util/Pair;", "", "Lpn/k;", "errorInfo", "l", "(Landroid/util/Pair;)Landroid/util/Pair;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "handleException", "(Ljava/lang/Exception;)V", "moduleName", "Ljn/h;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljn/h;", "t", "message", "Lpn/e$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "a", "(Ljava/lang/String;Lpn/e$a;)V", "f", "Lcom/facebook/react/bridge/JSExceptionHandler;", "Lcom/facebook/react/bridge/JSExceptionHandler;", "defaultJSExceptionHandler", "isDevSupportEnabled", "k", "m", "devSupportEnabled", "Leo/a;", "q", "()Leo/a;", "devSettings", "Lpn/j;", "o", "()Lpn/j;", "redBoxHandler", "y", "()Ljava/lang/String;", "sourceUrl", "j", "downloadedJSBundleFile", "u", "lastErrorTitle", "A", "()[Lpn/k;", "lastErrorStack", "Lpn/g;", "x", "()Lpn/g;", "lastErrorType", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "currentActivity", "h", "()Lcom/facebook/react/bridge/ReactContext;", "currentReactContext", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class h1 implements pn.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final JSExceptionHandler defaultJSExceptionHandler = new DefaultJSExceptionHandler();

    @Override // pn.e
    public pn.k[] A() {
        return null;
    }

    @Override // pn.e
    public void B(pn.h callback) {
        p013kotlin.jvm.internal.s.k(callback, "callback");
        callback.a(false);
    }

    @Override // pn.e
    public void C() {
    }

    @Override // pn.e
    public boolean D() {
        return false;
    }

    @Override // pn.e
    public void a(String message, pn.e.a listener) {
        p013kotlin.jvm.internal.s.k(message, "message");
        p013kotlin.jvm.internal.s.k(listener, "listener");
    }

    @Override // pn.e
    public View b(String appKey) {
        return null;
    }

    @Override // pn.e
    public void c(boolean isHotModuleReplacementEnabled) {
    }

    @Override // pn.e
    public jn.h d(String moduleName) {
        return null;
    }

    @Override // pn.e
    public void e(View rootView) {
    }

    @Override // pn.e
    public void f() {
    }

    @Override // pn.e
    public void g() {
    }

    @Override // pn.e
    public Activity getCurrentActivity() {
        return null;
    }

    @Override // pn.e
    public ReactContext h() {
        return null;
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception e11) {
        p013kotlin.jvm.internal.s.k(e11, "e");
        this.defaultJSExceptionHandler.handleException(e11);
    }

    @Override // pn.e
    public void i(boolean isFpsDebugEnabled) {
    }

    @Override // pn.e
    public String j() {
        return null;
    }

    @Override // pn.e
    public boolean k() {
        return false;
    }

    @Override // pn.e
    public Pair<String, pn.k[]> l(Pair<String, pn.k[]> errorInfo) {
        return errorInfo;
    }

    @Override // pn.e
    public void m(boolean z11) {
    }

    @Override // pn.e
    public pn.j o() {
        return null;
    }

    @Override // pn.e
    public void p(ReactContext reactContext) {
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
    }

    @Override // pn.e
    public eo.a q() {
        return null;
    }

    @Override // pn.e
    public void r() {
    }

    @Override // pn.e
    public void s(ReactContext reactContext) {
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
    }

    @Override // pn.e
    public void t() {
    }

    @Override // pn.e
    public String u() {
        return null;
    }

    @Override // pn.e
    public void v() {
    }

    @Override // pn.e
    public void w() {
    }

    @Override // pn.e
    public pn.g x() {
        return null;
    }

    @Override // pn.e
    public String y() {
        return null;
    }

    @Override // pn.e
    public void z() {
    }

    @Override // pn.e
    public void n(String optionName, pn.d optionHandler) {
    }
}
