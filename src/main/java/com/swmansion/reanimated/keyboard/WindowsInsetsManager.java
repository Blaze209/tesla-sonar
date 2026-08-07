package com.swmansion.reanimated.keyboard;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import androidx.core.view.z0;
import com.facebook.react.bridge.ReactApplicationContext;
import i.f;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class WindowsInsetsManager {
    private final Keyboard mKeyboard;
    private final NotifyAboutKeyboardChangeFunction mNotifyAboutKeyboardChange;
    private final WeakReference<ReactApplicationContext> mReactContext;
    private boolean mIsStatusBarTranslucent = false;
    private boolean mIsNavigationBarTranslucent = false;
    private final String MissingContextErrorMsg = "Unable to get reference to react activity";

    public WindowsInsetsManager(WeakReference<ReactApplicationContext> weakReference, Keyboard keyboard, NotifyAboutKeyboardChangeFunction notifyAboutKeyboardChangeFunction) {
        this.mReactContext = weakReference;
        this.mKeyboard = keyboard;
        this.mNotifyAboutKeyboardChange = notifyAboutKeyboardChangeFunction;
    }

    private Activity getCurrentActivity() {
        return this.mReactContext.get().getCurrentActivity();
    }

    private FrameLayout.LayoutParams getLayoutParams(int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.mIsStatusBarTranslucent) {
            i11 = 0;
        }
        if (this.mIsNavigationBarTranslucent) {
            i12 = 0;
        }
        layoutParams.setMargins(0, i11, 0, i12);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateInsets$1(int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = getLayoutParams(i11, i12);
        int i13 = f.f73803d;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
        } else {
            currentActivity.getWindow().getDecorView().findViewById(i13).setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateWindowDecor$0(boolean z11) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
        } else {
            z0.b(currentActivity.getWindow(), z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindowInsetsCompat onApplyWindowInsetsListener(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompatB0 = ViewCompat.b0(view, windowInsetsCompat);
        if (this.mKeyboard.getState() == KeyboardState.OPEN) {
            this.mKeyboard.updateHeight(windowInsetsCompat, this.mIsNavigationBarTranslucent);
            this.mNotifyAboutKeyboardChange.call();
        }
        setWindowInsets(windowInsetsCompatB0);
        return windowInsetsCompatB0;
    }

    private void setWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        int iH = WindowInsetsCompat.n.h();
        updateInsets(windowInsetsCompat.f(iH).f84925b, windowInsetsCompat.f(iH).f84927d);
    }

    private void updateInsets(final int i11, final int i12) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.swmansion.reanimated.keyboard.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f55468a.lambda$updateInsets$1(i11, i12);
            }
        });
    }

    private void updateWindowDecor(final boolean z11) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.swmansion.reanimated.keyboard.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f55466a.lambda$updateWindowDecor$0(z11);
            }
        });
    }

    public void startObservingChanges(KeyboardAnimationCallback keyboardAnimationCallback, boolean z11, boolean z12) {
        this.mIsStatusBarTranslucent = z11;
        this.mIsNavigationBarTranslucent = z12;
        updateWindowDecor(false);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        ViewCompat.E0(decorView, new a0() { // from class: com.swmansion.reanimated.keyboard.b
            @Override // androidx.core.view.a0
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f55465a.onApplyWindowInsetsListener(view, windowInsetsCompat);
            }
        });
        ViewCompat.L0(decorView, keyboardAnimationCallback);
    }

    public void stopObservingChanges() {
        updateWindowDecor((this.mIsStatusBarTranslucent || this.mIsNavigationBarTranslucent) ? false : true);
        updateInsets(0, 0);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        ViewCompat.L0(decorView, null);
        ViewCompat.E0(decorView, null);
    }
}
