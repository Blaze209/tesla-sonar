package androidx.camera.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import c0.r0;
import c0.y0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Window f3757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r0.i f3758b;

    class a implements r0.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f3759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ValueAnimator f3760b;

        a() {
        }

        @Override // c0.r0.i
        public void a(long j11, @NonNull final r0.j jVar) {
            y0.a("ScreenFlashView", "ScreenFlash#apply");
            this.f3759a = r.this.getBrightness();
            r.this.setBrightness(1.0f);
            ValueAnimator valueAnimator = this.f3760b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            r rVar = r.this;
            Objects.requireNonNull(jVar);
            this.f3760b = rVar.e(new Runnable() { // from class: androidx.camera.view.q
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.a();
                }
            });
        }

        @Override // c0.r0.i
        public void clear() {
            y0.a("ScreenFlashView", "ScreenFlash#clearScreenFlashUi");
            ValueAnimator valueAnimator = this.f3760b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f3760b = null;
            }
            r.this.setAlpha(BitmapDescriptorFactory.HUE_RED);
            r.this.setBrightness(this.f3759a);
        }
    }

    class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f3762a;

        b(Runnable runnable) {
            this.f3762a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            y0.a("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
            Runnable runnable = this.f3762a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
        }
    }

    public r(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(r rVar, ValueAnimator valueAnimator) {
        rVar.getClass();
        y0.a("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
        rVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ValueAnimator e(Runnable runnable) {
        y0.a("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.camera.view.p
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                r.a(this.f3755a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new b(runnable));
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }

    private void f(Window window) {
        if (this.f3757a != window) {
            this.f3758b = window == null ? null : new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.f3757a;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        y0.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f11) {
        if (this.f3757a == null) {
            y0.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f11)) {
            y0.c("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.f3757a.getAttributes();
        attributes.screenBrightness = f11;
        this.f3757a.setAttributes(attributes);
        y0.a("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(r0.i iVar) {
        y0.a("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public r0.i getScreenFlash() {
        return this.f3758b;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(androidx.camera.view.a aVar) {
        h0.r.b();
    }

    public void setScreenFlashWindow(Window window) {
        h0.r.b();
        f(window);
        this.f3757a = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    public r(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public r(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public r(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        setBackgroundColor(-1);
        setAlpha(BitmapDescriptorFactory.HUE_RED);
        setElevation(Float.MAX_VALUE);
    }
}
