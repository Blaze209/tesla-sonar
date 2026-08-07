package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class d extends r {
    private static final String[] Q = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    private static final TypeEvaluator<Matrix> R = new a();
    private static final Property<ImageView, Matrix> S = new b(Matrix.class, "animatedTransform");

    class a implements TypeEvaluator<Matrix> {
        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f11, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    class b extends Property<ImageView, Matrix> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            h.a(imageView, matrix);
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14030a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f14030a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14030a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.transition.d$d, reason: collision with other inner class name */
    private static class C0238d extends AnimatorListenerAdapter implements r.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImageView f14031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Matrix f14032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Matrix f14033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f14034d = true;

        C0238d(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.f14031a = imageView;
            this.f14032b = matrix;
            this.f14033c = matrix2;
        }

        private void b() {
            Matrix matrix = (Matrix) this.f14031a.getTag(l.f14090d);
            if (matrix != null) {
                h.a(this.f14031a, matrix);
                this.f14031a.setTag(l.f14090d, null);
            }
        }

        private void c(Matrix matrix) {
            this.f14031a.setTag(l.f14090d, matrix);
            h.a(this.f14031a, this.f14033c);
        }

        @Override // androidx.transition.r.h
        public void a(@NonNull r rVar) {
            b();
        }

        @Override // androidx.transition.r.h
        public void e(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void f(@NonNull r rVar) {
            if (this.f14034d) {
                c(this.f14032b);
            }
        }

        @Override // androidx.transition.r.h
        public void i(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void k(@NonNull r rVar) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z11) {
            this.f14034d = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            c((Matrix) ((ObjectAnimator) animator).getAnimatedValue());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            b();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z11) {
            this.f14034d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f14034d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f14034d = false;
        }
    }

    public d() {
    }

    private void u0(e0 e0Var, boolean z11) {
        View view = e0Var.f14042b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = e0Var.f14041a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrixW0 = z11 ? (Matrix) imageView.getTag(l.f14090d) : null;
            if (matrixW0 == null) {
                matrixW0 = w0(imageView);
            }
            map.put("android:changeImageTransform:matrix", matrixW0);
        }
    }

    private static Matrix v0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f11 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f12 = intrinsicHeight;
        float fMax = Math.max(width / f11, height / f12);
        int iRound = Math.round((width - (f11 * fMax)) / 2.0f);
        int iRound2 = Math.round((height - (f12 * fMax)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(iRound, iRound2);
        return matrix;
    }

    @NonNull
    private static Matrix w0(@NonNull ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i11 = c.f14030a[imageView.getScaleType().ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? new Matrix(imageView.getImageMatrix()) : v0(imageView);
        }
        return z0(imageView);
    }

    private ObjectAnimator x0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) S, (TypeEvaluator) new d0.b(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @NonNull
    private ObjectAnimator y0(@NonNull ImageView imageView) {
        Property<ImageView, Matrix> property = S;
        TypeEvaluator<Matrix> typeEvaluator = R;
        Matrix matrix = i.f14079a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    private static Matrix z0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    @Override // androidx.transition.r
    @NonNull
    public String[] K() {
        return Q;
    }

    @Override // androidx.transition.r
    public boolean N() {
        return true;
    }

    @Override // androidx.transition.r
    public void i(@NonNull e0 e0Var) {
        u0(e0Var, false);
    }

    @Override // androidx.transition.r
    public void l(@NonNull e0 e0Var) {
        u0(e0Var, true);
    }

    @Override // androidx.transition.r
    public Animator p(@NonNull ViewGroup viewGroup, e0 e0Var, e0 e0Var2) {
        if (e0Var == null || e0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) e0Var.f14041a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) e0Var2.f14041a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) e0Var.f14041a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) e0Var2.f14041a.get("android:changeImageTransform:matrix");
        boolean z11 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z11) {
            return null;
        }
        ImageView imageView = (ImageView) e0Var2.f14042b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return y0(imageView);
        }
        if (matrix == null) {
            matrix = i.f14079a;
        }
        if (matrix2 == null) {
            matrix2 = i.f14079a;
        }
        S.set(imageView, matrix);
        ObjectAnimator objectAnimatorX0 = x0(imageView, matrix, matrix2);
        C0238d c0238d = new C0238d(imageView, matrix, matrix2);
        objectAnimatorX0.addListener(c0238d);
        objectAnimatorX0.addPauseListener(c0238d);
        c(c0238d);
        return objectAnimatorX0;
    }

    public d(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
