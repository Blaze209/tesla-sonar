package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class c extends r {
    private static final String[] Q = {"android:clipBounds:clip"};
    static final Rect R = new Rect();

    private static class a extends AnimatorListenerAdapter implements r.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f14023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f14024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f14025c;

        a(View view, Rect rect, Rect rect2) {
            this.f14025c = view;
            this.f14023a = rect;
            this.f14024b = rect2;
        }

        @Override // androidx.transition.r.h
        public void a(@NonNull r rVar) {
            this.f14025c.setClipBounds((Rect) this.f14025c.getTag(l.f14088b));
            this.f14025c.setTag(l.f14088b, null);
        }

        @Override // androidx.transition.r.h
        public void e(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void f(@NonNull r rVar) {
            Rect clipBounds = this.f14025c.getClipBounds();
            if (clipBounds == null) {
                clipBounds = c.R;
            }
            this.f14025c.setTag(l.f14088b, clipBounds);
            this.f14025c.setClipBounds(this.f14024b);
        }

        @Override // androidx.transition.r.h
        public void i(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void k(@NonNull r rVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z11) {
            if (z11) {
                this.f14025c.setClipBounds(this.f14023a);
            } else {
                this.f14025c.setClipBounds(this.f14024b);
            }
        }
    }

    public c() {
    }

    private void u0(e0 e0Var, boolean z11) {
        View view = e0Var.f14042b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z11 ? (Rect) view.getTag(l.f14088b) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != R ? clipBounds : null;
        e0Var.f14041a.put("android:clipBounds:clip", rect);
        if (rect == null) {
            e0Var.f14041a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
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
        if (e0Var == null || e0Var2 == null || !e0Var.f14041a.containsKey("android:clipBounds:clip") || !e0Var2.f14041a.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) e0Var.f14041a.get("android:clipBounds:clip");
        Rect rect2 = (Rect) e0Var2.f14041a.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) e0Var.f14041a.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) e0Var2.f14041a.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        e0Var2.f14042b.setClipBounds(rect);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(e0Var2.f14042b, (Property<View, V>) j0.f14083c, (TypeEvaluator) new m(new Rect()), (Object[]) new Rect[]{rect3, rect4});
        a aVar = new a(e0Var2.f14042b, rect, rect2);
        objectAnimatorOfObject.addListener(aVar);
        c(aVar);
        return objectAnimatorOfObject;
    }

    public c(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
