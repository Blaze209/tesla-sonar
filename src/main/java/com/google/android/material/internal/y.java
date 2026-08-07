package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class y extends androidx.transition.r {

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f42383a;

        a(TextView textView) {
            this.f42383a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f42383a.setScaleX(fFloatValue);
            this.f42383a.setScaleY(fFloatValue);
        }
    }

    private void u0(@NonNull androidx.transition.e0 e0Var) {
        View view = e0Var.f14042b;
        if (view instanceof TextView) {
            e0Var.f14041a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.r
    public void i(@NonNull androidx.transition.e0 e0Var) {
        u0(e0Var);
    }

    @Override // androidx.transition.r
    public void l(@NonNull androidx.transition.e0 e0Var) {
        u0(e0Var);
    }

    @Override // androidx.transition.r
    public Animator p(@NonNull ViewGroup viewGroup, androidx.transition.e0 e0Var, androidx.transition.e0 e0Var2) {
        if (e0Var == null || e0Var2 == null || !(e0Var.f14042b instanceof TextView)) {
            return null;
        }
        View view = e0Var2.f14042b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = e0Var.f14041a;
        Map<String, Object> map2 = e0Var2.f14041a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(textView));
        return valueAnimatorOfFloat;
    }
}
