package pn;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u00016J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0006H&¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0006H&¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H&¢\u0006\u0004\b\u001d\u0010\u0011J\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u001aH&¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u001aH&¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020\u0006H&¢\u0006\u0004\b'\u0010\u0011J?\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)\u0018\u00010(2\u001a\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)\u0018\u00010(H&¢\u0006\u0004\b,\u0010-J\u001b\u00100\u001a\u0004\u0018\u00010/2\b\u0010.\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0006H&¢\u0006\u0004\b2\u0010\u0011J\u001f\u00106\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00022\u0006\u00105\u001a\u000204H&¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H&¢\u0006\u0004\b8\u0010\u0011R\u0016\u0010<\u001a\u0004\u0018\u0001098&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010@\u001a\u0004\u0018\u00010=8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010C\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0016\u0010E\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0016\u0010G\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010BR\u001c\u0010J\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0016\u0010N\u001a\u0004\u0018\u00010K8&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010R\u001a\u0004\u0018\u00010O8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0016\u0010U\u001a\u0004\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u001c\u0010X\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\bV\u0010\u001c\"\u0004\bW\u0010$ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006YÀ\u0006\u0001"}, d2 = {"Lpn/e;", "Lcom/facebook/react/bridge/JSExceptionHandler;", "", "optionName", "Lpn/d;", "optionHandler", "Ljn0/h0;", "n", "(Ljava/lang/String;Lpn/d;)V", "appKey", "Landroid/view/View;", "b", "(Ljava/lang/String;)Landroid/view/View;", "rootView", "e", "(Landroid/view/View;)V", "w", "()V", "r", "z", "v", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "p", "(Lcom/facebook/react/bridge/ReactContext;)V", "s", "", "D", "()Z", "C", "Lpn/h;", "callback", "B", "(Lpn/h;)V", "isHotModuleReplacementEnabled", "c", "(Z)V", "isFpsDebugEnabled", IntegerTokenConverter.CONVERTER_KEY, "g", "Landroid/util/Pair;", "", "Lpn/k;", "errorInfo", "l", "(Landroid/util/Pair;)Landroid/util/Pair;", "moduleName", "Ljn/h;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljn/h;", "t", "message", "Lpn/e$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "a", "(Ljava/lang/String;Lpn/e$a;)V", "f", "Leo/a;", "q", "()Leo/a;", "devSettings", "Lpn/j;", "o", "()Lpn/j;", "redBoxHandler", "y", "()Ljava/lang/String;", "sourceUrl", "j", "downloadedJSBundleFile", "u", "lastErrorTitle", "A", "()[Lpn/k;", "lastErrorStack", "Lpn/g;", "x", "()Lpn/g;", "lastErrorType", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "currentActivity", "h", "()Lcom/facebook/react/bridge/ReactContext;", "currentReactContext", "k", "m", "devSupportEnabled", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface e extends JSExceptionHandler {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lpn/e$a;", "", "Ljn0/h0;", "onResume", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        void onResume();
    }

    k[] A();

    void B(h callback);

    void C();

    boolean D();

    void a(String message, a listener);

    View b(String appKey);

    void c(boolean isHotModuleReplacementEnabled);

    jn.h d(String moduleName);

    void e(View rootView);

    void f();

    void g();

    Activity getCurrentActivity();

    ReactContext h();

    void i(boolean isFpsDebugEnabled);

    String j();

    boolean k();

    Pair<String, k[]> l(Pair<String, k[]> errorInfo);

    void m(boolean z11);

    void n(String optionName, d optionHandler);

    j o();

    void p(ReactContext reactContext);

    eo.a q();

    void r();

    void s(ReactContext reactContext);

    void t();

    String u();

    void v();

    void w();

    g x();

    String y();

    void z();
}
