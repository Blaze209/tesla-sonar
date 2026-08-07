package ro;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes4.dex */
class l extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f108650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f108651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f108652c;

    public l(View view, float f11, float f12) {
        this.f108650a = view;
        this.f108651b = f11;
        this.f108652c = f12 - f11;
        setAnimationListener(new a(view));
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f11, Transformation transformation) {
        this.f108650a.setAlpha(this.f108651b + (this.f108652c * f11));
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return false;
    }

    static class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f108653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f108654b = false;

        public a(View view) {
            this.f108653a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.f108654b) {
                this.f108653a.setLayerType(0, null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (this.f108653a.hasOverlappingRendering() && this.f108653a.getLayerType() == 0) {
                this.f108654b = true;
                this.f108653a.setLayerType(2, null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }
}
