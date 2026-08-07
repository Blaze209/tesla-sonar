package com.swmansion.rnscreens.utils;

import androidx.fragment.app.r0;
import com.swmansion.rnscreens.q;
import com.swmansion.rnscreens.t;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/fragment/app/r0;", "Lcom/swmansion/rnscreens/t$d;", "stackAnimation", "", "shouldUseOpenAnimation", "Ljn0/h0;", "setTweenAnimations", "(Landroidx/fragment/app/r0;Lcom/swmansion/rnscreens/t$d;Z)V", "react-native-screens_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t.d.values().length];
            try {
                iArr[t.d.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.d.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.d.FADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.d.SLIDE_FROM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t.d.SLIDE_FROM_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[t.d.SLIDE_FROM_BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[t.d.FADE_FROM_BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[t.d.IOS_FROM_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[t.d.IOS_FROM_LEFT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void setTweenAnimations(r0 r0Var, t.d stackAnimation, boolean z11) {
        s.k(r0Var, "<this>");
        s.k(stackAnimation, "stackAnimation");
        if (z11) {
            switch (a.$EnumSwitchMapping$0[stackAnimation.ordinal()]) {
                case 1:
                    r0Var.u(q.rns_default_enter_in, q.rns_default_enter_out);
                    return;
                case 2:
                    int i11 = q.rns_no_animation_20;
                    r0Var.u(i11, i11);
                    return;
                case 3:
                    r0Var.u(q.rns_fade_in, q.rns_fade_out);
                    return;
                case 4:
                    r0Var.u(q.rns_slide_in_from_right, q.rns_slide_out_to_left);
                    return;
                case 5:
                    r0Var.u(q.rns_slide_in_from_left, q.rns_slide_out_to_right);
                    return;
                case 6:
                    r0Var.u(q.rns_slide_in_from_bottom, q.rns_no_animation_medium);
                    return;
                case 7:
                    r0Var.u(q.rns_fade_from_bottom, q.rns_no_animation_350);
                    return;
                case 8:
                    r0Var.u(q.rns_ios_from_right_foreground_open, q.rns_ios_from_right_background_open);
                    return;
                case 9:
                    r0Var.u(q.rns_ios_from_left_foreground_open, q.rns_ios_from_left_background_open);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        switch (a.$EnumSwitchMapping$0[stackAnimation.ordinal()]) {
            case 1:
                r0Var.u(q.rns_default_exit_in, q.rns_default_exit_out);
                return;
            case 2:
                int i12 = q.rns_no_animation_20;
                r0Var.u(i12, i12);
                return;
            case 3:
                r0Var.u(q.rns_fade_in, q.rns_fade_out);
                return;
            case 4:
                r0Var.u(q.rns_slide_in_from_left, q.rns_slide_out_to_right);
                return;
            case 5:
                r0Var.u(q.rns_slide_in_from_right, q.rns_slide_out_to_left);
                return;
            case 6:
                r0Var.u(q.rns_no_animation_medium, q.rns_slide_out_to_bottom);
                return;
            case 7:
                r0Var.u(q.rns_no_animation_250, q.rns_fade_to_bottom);
                return;
            case 8:
                r0Var.u(q.rns_ios_from_right_background_close, q.rns_ios_from_right_foreground_close);
                return;
            case 9:
                r0Var.u(q.rns_ios_from_left_background_close, q.rns_ios_from_left_foreground_close);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
