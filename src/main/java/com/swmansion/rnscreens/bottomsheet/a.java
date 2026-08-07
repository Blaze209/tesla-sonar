package com.swmansion.rnscreens.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a=\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\b\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\u0010\r\u001aW\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"useSingleDetent", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "T", "Landroid/view/View;", Snapshot.HEIGHT, "", "forceExpandedState", "", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Z)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "useTwoDetents", "state", "firstHeight", "secondHeight", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "useThreeDetents", "halfExpandedRatio", "", "expandedOffsetFromTop", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "react-native-screens_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final <T extends View> BottomSheetBehavior<T> useSingleDetent(BottomSheetBehavior<T> bottomSheetBehavior, Integer num, boolean z11) {
        s.k(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.X0(true);
        bottomSheetBehavior.N0(true);
        if (z11) {
            bottomSheetBehavior.Y0(3);
        }
        if (num != null) {
            bottomSheetBehavior.R0(num.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior useSingleDetent$default(BottomSheetBehavior bottomSheetBehavior, Integer num, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return useSingleDetent(bottomSheetBehavior, num, z11);
    }

    public static final <T extends View> BottomSheetBehavior<T> useThreeDetents(BottomSheetBehavior<T> bottomSheetBehavior, Integer num, Integer num2, Float f11, Integer num3) {
        s.k(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.X0(false);
        bottomSheetBehavior.N0(false);
        if (num != null) {
            bottomSheetBehavior.Y0(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.T0(num2.intValue());
        }
        if (f11 != null) {
            bottomSheetBehavior.P0(f11.floatValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.M0(num3.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior useThreeDetents$default(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Float f11, Integer num3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            num2 = null;
        }
        if ((i11 & 4) != 0) {
            f11 = null;
        }
        if ((i11 & 8) != 0) {
            num3 = null;
        }
        return useThreeDetents(bottomSheetBehavior, num, num2, f11, num3);
    }

    public static final <T extends View> BottomSheetBehavior<T> useTwoDetents(BottomSheetBehavior<T> bottomSheetBehavior, Integer num, Integer num2, Integer num3) {
        s.k(bottomSheetBehavior, "<this>");
        bottomSheetBehavior.X0(false);
        bottomSheetBehavior.N0(true);
        if (num != null) {
            bottomSheetBehavior.Y0(num.intValue());
        }
        if (num2 != null) {
            bottomSheetBehavior.T0(num2.intValue());
        }
        if (num3 != null) {
            bottomSheetBehavior.R0(num3.intValue());
        }
        return bottomSheetBehavior;
    }

    public static /* synthetic */ BottomSheetBehavior useTwoDetents$default(BottomSheetBehavior bottomSheetBehavior, Integer num, Integer num2, Integer num3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            num2 = null;
        }
        if ((i11 & 4) != 0) {
            num3 = null;
        }
        return useTwoDetents(bottomSheetBehavior, num, num2, num3);
    }
}
