package com.p005reactnativeavoidsoftinput;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import jn0.h0;
import l00.c;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001?B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\f¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b,\u0010*J\u0017\u0010-\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b-\u0010*J\u0017\u0010.\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b.\u0010*J\r\u0010/\u001a\u00020\t¢\u0006\u0004\b/\u0010\u0019J\r\u00100\u001a\u00020\t¢\u0006\u0004\b0\u0010\u0019J\r\u00101\u001a\u00020\t¢\u0006\u0004\b1\u0010\u0019J\r\u00102\u001a\u00020\t¢\u0006\u0004\b2\u0010\u0019J\r\u00103\u001a\u00020\t¢\u0006\u0004\b3\u0010\u0019J\u001f\u00106\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007H\u0016¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007H\u0016¢\u0006\u0004\b8\u00107J'\u0010:\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u001bH\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u0010\u0019J\u000f\u0010=\u001a\u00020\tH\u0016¢\u0006\u0004\b=\u0010\u0019J\u000f\u0010>\u001a\u00020\tH\u0016¢\u0006\u0004\b>\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010DR\u0014\u0010H\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lcom/reactnativeavoidsoftinput/k;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Ll00/c;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "mode", "Ljn0/h0;", "B", "(I)V", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "k", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "offset", "j", Snapshot.HEIGHT, "l", "m", "n", "h", "()V", IntegerTokenConverter.CONVERTER_KEY, "", "shouldMimic", "y", "(Z)V", "isEnabled", "v", "", "avoidOffset", "s", "(F)V", "easing", "u", "(Ljava/lang/String;)V", "delay", "w", "(Ljava/lang/Integer;)V", "duration", "x", "z", "A", "o", "p", "q", "r", "t", "from", "to", "e", "(II)V", "b", "isOrientationChanged", "c", "(IIZ)V", "onHostResume", "onHostPause", "onHostDestroy", "a", "Lcom/facebook/react/bridge/ReactApplicationContext;", "I", "defaultSoftInputMode", "Lcom/reactnativeavoidsoftinput/h;", "Lcom/reactnativeavoidsoftinput/h;", "managerInstance", "g", "()Lcom/reactnativeavoidsoftinput/h;", "manager", DateTokenConverter.CONVERTER_KEY, "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements LifecycleEventListener, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext reactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int defaultSoftInputMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private h managerInstance;

    public k(ReactApplicationContext reactContext) {
        Window window;
        WindowManager.LayoutParams attributes;
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        Activity currentActivity = reactContext.getCurrentActivity();
        this.defaultSoftInputMode = (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? 0 : attributes.softInputMode;
    }

    private final void B(final int mode) {
        final Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactnativeavoidsoftinput.j
            @Override // java.lang.Runnable
            public final void run() {
                k.C(currentActivity, mode);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(Activity activity, int i11) {
        activity.getWindow().setSoftInputMode(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 f(k kVar, int i11) {
        kVar.j(i11);
        return h0.f84049a;
    }

    private final h g() {
        synchronized (this) {
            h hVar = this.managerInstance;
            if (hVar != null) {
                return hVar;
            }
            h hVar2 = new h(this.reactContext);
            hVar2.H(false);
            hVar2.T((View) View.f(this.reactContext));
            hVar2.R(new l() { // from class: com.reactnativeavoidsoftinput.i
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return k.f(this.f48437a, ((Integer) obj).intValue());
                }
            });
            hVar2.S(this);
            this.managerInstance = hVar2;
            return hVar2;
        }
    }

    private final void j(int offset) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("appliedOffset", offset);
        h0 h0Var = h0.f84049a;
        k("softInputAppliedOffsetChanged", writableMapCreateMap);
    }

    private final void k(String eventName, WritableMap params) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, params);
    }

    private final void l(int height) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("softInputHeight", height);
        h0 h0Var = h0.f84049a;
        k("softInputHeightChanged", writableMapCreateMap);
    }

    private final void m(int height) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("softInputHeight", height);
        h0 h0Var = h0.f84049a;
        k("softInputHidden", writableMapCreateMap);
    }

    private final void n(int height) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("softInputHeight", height);
        h0 h0Var = h0.f84049a;
        k("softInputShown", writableMapCreateMap);
    }

    public final void A(Integer duration) {
        g().Y(duration);
    }

    @Override // l00.c
    public void b(int from, int to2) {
        m(View.c(0));
    }

    @Override // l00.c
    public void c(int from, int to2, boolean isOrientationChanged) {
        l(View.c(to2));
    }

    @Override // l00.c
    public void e(int from, int to2) {
        n(View.c(to2));
    }

    public final void h() {
        Window window;
        WindowManager.LayoutParams attributes;
        Activity currentActivity = this.reactContext.getCurrentActivity();
        this.defaultSoftInputMode = (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? 0 : attributes.softInputMode;
        this.reactContext.addLifecycleEventListener(this);
    }

    public final void i() {
        if (this.managerInstance != null) {
            g().m();
            this.managerInstance = null;
        }
    }

    public final void o() {
        B(48);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        i();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        g().v();
    }

    public final void p() {
        B(32);
    }

    public final void q() {
        B(16);
    }

    public final void r() {
        B(0);
    }

    public final void s(float avoidOffset) {
        g().D(avoidOffset);
    }

    public final void t() {
        B(this.defaultSoftInputMode);
    }

    public final void u(String easing) {
        s.k(easing, "easing");
        g().E(easing);
    }

    public final void v(boolean isEnabled) {
        g().H(isEnabled);
    }

    public final void w(Integer delay) {
        g().F(delay);
    }

    public final void x(Integer duration) {
        g().G(duration);
    }

    public final void y(boolean shouldMimic) {
        g().W(shouldMimic);
    }

    public final void z(Integer delay) {
        g().X(delay);
    }
}
