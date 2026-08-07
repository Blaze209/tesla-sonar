package expo.modules.core.interfaces;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.facebook.react.o0;
import com.facebook.react.s;
import com.facebook.react.v;

/* JADX INFO: loaded from: classes8.dex */
public interface ReactActivityHandler {

    public interface DelayLoadAppHandler {
        void whenReady(Runnable runnable);
    }

    default ViewGroup createReactRootViewContainer(Activity activity) {
        return null;
    }

    default DelayLoadAppHandler getDelayLoadAppHandler(s sVar, o0 o0Var) {
        return null;
    }

    default v onDidCreateReactActivityDelegate(s sVar, v vVar) {
        return null;
    }

    default boolean onKeyDown(int i11, KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyLongPress(int i11, KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyUp(int i11, KeyEvent keyEvent) {
        return false;
    }
}
