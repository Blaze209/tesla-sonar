package com.swmansion.reanimated.keyboard;

import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.uimanager.w;

/* JADX INFO: loaded from: classes7.dex */
public class Keyboard {
    private static final int CONTENT_TYPE_MASK = WindowInsetsCompat.n.c();
    private static final int SYSTEM_BAR_TYPE_MASK = WindowInsetsCompat.n.h();
    private KeyboardState mState = KeyboardState.UNKNOWN;
    private int mHeight = 0;
    private int mActiveTransitionCounter = 0;

    public int getHeight() {
        return this.mHeight;
    }

    public KeyboardState getState() {
        return this.mState;
    }

    public void onAnimationEnd() {
        int i11 = this.mActiveTransitionCounter - 1;
        this.mActiveTransitionCounter = i11;
        if (i11 == 0) {
            this.mState = this.mHeight <= 0 ? KeyboardState.CLOSED : KeyboardState.OPEN;
        }
    }

    public void onAnimationStart() {
        int i11 = this.mActiveTransitionCounter;
        if (i11 > 0) {
            KeyboardState keyboardState = this.mState;
            KeyboardState keyboardState2 = KeyboardState.OPENING;
            if (keyboardState == keyboardState2) {
                keyboardState2 = KeyboardState.CLOSING;
            }
            this.mState = keyboardState2;
        } else {
            this.mState = this.mHeight <= 0 ? KeyboardState.OPENING : KeyboardState.CLOSING;
        }
        this.mActiveTransitionCounter = i11 + 1;
    }

    public void updateHeight(WindowInsetsCompat windowInsetsCompat, boolean z11) {
        int iF = (int) w.f(Math.max(0, windowInsetsCompat.f(CONTENT_TYPE_MASK).f84927d - (z11 ? 0 : windowInsetsCompat.f(SYSTEM_BAR_TYPE_MASK).f84927d)));
        if (iF > 0 || this.mState != KeyboardState.OPEN) {
            this.mHeight = iF;
        }
    }
}
