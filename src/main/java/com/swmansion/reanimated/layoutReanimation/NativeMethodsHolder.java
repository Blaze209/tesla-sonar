package com.swmansion.reanimated.layoutReanimation;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public interface NativeMethodsHolder {
    void cancelAnimation(int i11);

    void checkDuplicateSharedTag(int i11, int i12);

    void clearAnimationConfig(int i11);

    int findPrecedingViewTagForTransition(int i11);

    int[] getSharedGroup(int i11);

    boolean hasAnimation(int i11, int i12);

    boolean isLayoutAnimationEnabled();

    boolean shouldAnimateExiting(int i11, boolean z11);

    void startAnimation(int i11, int i12, HashMap<String, Object> map);
}
