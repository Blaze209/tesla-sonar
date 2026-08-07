package c10;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0017\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\r*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u0011*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0012¨\u0006\u0014"}, d2 = {"", "a", "I", "archType", "Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/bridge/UIManager;", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/bridge/ReactContext;)Lcom/facebook/react/bridge/UIManager;", "uiManager", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "b", "(Lcom/facebook/react/bridge/ReactContext;)Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "Landroid/view/View;", "c", "(Lcom/facebook/react/bridge/ReactContext;)Landroid/view/View;", "rootView", "Landroid/view/ViewGroup;", "(Lcom/facebook/react/bridge/ReactContext;)Landroid/view/ViewGroup;", "content", "react-native-keyboard-controller_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f18568a = 1;

    public static final ViewGroup a(ReactContext reactContext) {
        Window window;
        View decorView;
        View rootView;
        s.k(reactContext, "<this>");
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootView = decorView.getRootView()) == null) {
            return null;
        }
        return (ViewGroup) rootView.findViewById(i.f.f73803d);
    }

    public static final EventDispatcher b(ReactContext reactContext) {
        s.k(reactContext, "<this>");
        return b1.b(reactContext, f18568a);
    }

    public static final View c(ReactContext reactContext) {
        Window window;
        View decorView;
        s.k(reactContext, "<this>");
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getRootView();
    }

    public static final UIManager d(ReactContext reactContext) {
        s.k(reactContext, "<this>");
        return b1.g(reactContext, f18568a);
    }
}
