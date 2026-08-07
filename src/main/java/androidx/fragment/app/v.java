package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class v {
    private static int a(Fragment fragment, boolean z11, boolean z12) {
        if (z12) {
            return z11 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
        }
        return z11 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    @SuppressLint({"ResourceType"})
    static a b(@NonNull Context context, @NonNull Fragment fragment, boolean z11, boolean z12) {
        Animator animatorLoadAnimator;
        int nextTransition = fragment.getNextTransition();
        int iA = a(fragment, z11, z12);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(f7.b.f64526c) != null) {
            fragment.mContainer.setTag(f7.b.f64526c, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z11, iA);
        if (animationOnCreateAnimation != null) {
            return new a(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z11, iA);
        if (animatorOnCreateAnimator != null) {
            return new a(animatorOnCreateAnimator);
        }
        if (iA == 0 && nextTransition != 0) {
            iA = d(context, nextTransition, z11);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e11) {
                    throw e11;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                        if (animatorLoadAnimator != null) {
                            return new a(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e12) {
                        if (zEquals) {
                            throw e12;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                        if (animationLoadAnimation2 != null) {
                            return new a(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                if (animatorLoadAnimator != null) {
                    return new a(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    private static int c(@NonNull Context context, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i11});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(@NonNull Context context, int i11, boolean z11) {
        if (i11 == 4097) {
            return z11 ? f7.a.f64522e : f7.a.f64523f;
        }
        if (i11 == 8194) {
            return z11 ? f7.a.f64518a : f7.a.f64519b;
        }
        if (i11 == 8197) {
            return z11 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i11 == 4099) {
            return z11 ? f7.a.f64520c : f7.a.f64521d;
        }
        if (i11 != 4100) {
            return -1;
        }
        return z11 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f8685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnimatorSet f8686b;

        a(Animation animation) {
            this.f8685a = animation;
            this.f8686b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f8685a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f8686b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f8687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f8688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f8689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f8690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f8691e;

        b(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.f8691e = true;
            this.f8687a = viewGroup;
            this.f8688b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j11, @NonNull Transformation transformation) {
            this.f8691e = true;
            if (this.f8689c) {
                return !this.f8690d;
            }
            if (!super.getTransformation(j11, transformation)) {
                this.f8689c = true;
                androidx.core.view.d0.a(this.f8687a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8689c || !this.f8691e) {
                this.f8687a.endViewTransition(this.f8688b);
                this.f8690d = true;
            } else {
                this.f8691e = false;
                this.f8687a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j11, @NonNull Transformation transformation, float f11) {
            this.f8691e = true;
            if (this.f8689c) {
                return !this.f8690d;
            }
            if (!super.getTransformation(j11, transformation, f11)) {
                this.f8689c = true;
                androidx.core.view.d0.a(this.f8687a, this);
            }
            return true;
        }
    }
}
