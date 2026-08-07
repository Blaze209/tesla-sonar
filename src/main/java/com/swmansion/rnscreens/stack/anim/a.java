package com.swmansion.rnscreens.stack.anim;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.swmansion.rnscreens.a0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/swmansion/rnscreens/stack/anim/a;", "Landroid/view/animation/Animation;", "Lcom/swmansion/rnscreens/a0;", "mFragment", "<init>", "(Lcom/swmansion/rnscreens/a0;)V", "", "interpolatedTime", "Landroid/view/animation/Transformation;", "t", "Ljn0/h0;", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "Lcom/swmansion/rnscreens/a0;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends Animation {
    private final a0 mFragment;

    public a(a0 mFragment) {
        s.k(mFragment, "mFragment");
        this.mFragment = mFragment;
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float interpolatedTime, Transformation t11) {
        s.k(t11, "t");
        super.applyTransformation(interpolatedTime, t11);
        a0 a0Var = this.mFragment;
        a0Var.dispatchTransitionProgressEvent(interpolatedTime, !a0Var.isResumed());
    }
}
