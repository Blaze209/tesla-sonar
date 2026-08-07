package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class b extends r {
    private static final String[] R = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<i, PointF> S = new a(PointF.class, "topLeft");
    private static final Property<i, PointF> T = new C0237b(PointF.class, "bottomRight");
    private static final Property<View, PointF> U = new c(PointF.class, "bottomRight");
    private static final Property<View, PointF> V = new d(PointF.class, "topLeft");
    private static final Property<View, PointF> W = new e(PointF.class, "position");
    private static final m X = new m();
    private boolean Q;

    class a extends Property<i, PointF> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$b, reason: collision with other inner class name */
    class C0237b extends Property<i, PointF> {
        C0237b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    class c extends Property<View, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            j0.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    class d extends Property<View, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            j0.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            j0.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f13998a;
        private final i mViewBounds;

        f(i iVar) {
            this.f13998a = iVar;
            this.mViewBounds = iVar;
        }
    }

    private static class g extends AnimatorListenerAdapter implements r.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f14000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f14001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f14002c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f14003d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f14004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f14005f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f14006g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f14007h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f14008i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f14009j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f14010k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f14011l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f14012m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f14013n;

        g(View view, Rect rect, boolean z11, Rect rect2, boolean z12, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f14000a = view;
            this.f14001b = rect;
            this.f14002c = z11;
            this.f14003d = rect2;
            this.f14004e = z12;
            this.f14005f = i11;
            this.f14006g = i12;
            this.f14007h = i13;
            this.f14008i = i14;
            this.f14009j = i15;
            this.f14010k = i16;
            this.f14011l = i17;
            this.f14012m = i18;
        }

        @Override // androidx.transition.r.h
        public void a(@NonNull r rVar) {
            Rect rect = (Rect) this.f14000a.getTag(l.f14088b);
            this.f14000a.setTag(l.f14088b, null);
            this.f14000a.setClipBounds(rect);
        }

        @Override // androidx.transition.r.h
        public void e(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void f(@NonNull r rVar) {
            this.f14000a.setTag(l.f14088b, this.f14000a.getClipBounds());
            this.f14000a.setClipBounds(this.f14004e ? null : this.f14003d);
        }

        @Override // androidx.transition.r.h
        public void i(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void k(@NonNull r rVar) {
            this.f14013n = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z11) {
            if (this.f14013n) {
                return;
            }
            Rect rect = null;
            if (z11) {
                if (!this.f14002c) {
                    rect = this.f14001b;
                }
            } else if (!this.f14004e) {
                rect = this.f14003d;
            }
            this.f14000a.setClipBounds(rect);
            if (z11) {
                j0.d(this.f14000a, this.f14005f, this.f14006g, this.f14007h, this.f14008i);
            } else {
                j0.d(this.f14000a, this.f14009j, this.f14010k, this.f14011l, this.f14012m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z11) {
            int iMax = Math.max(this.f14007h - this.f14005f, this.f14011l - this.f14009j);
            int iMax2 = Math.max(this.f14008i - this.f14006g, this.f14012m - this.f14010k);
            int i11 = z11 ? this.f14009j : this.f14005f;
            int i12 = z11 ? this.f14010k : this.f14006g;
            j0.d(this.f14000a, i11, i12, iMax + i11, iMax2 + i12);
            this.f14000a.setClipBounds(z11 ? this.f14003d : this.f14001b);
        }
    }

    private static class h extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f14014a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ViewGroup f14015b;

        h(@NonNull ViewGroup viewGroup) {
            this.f14015b = viewGroup;
        }

        @Override // androidx.transition.y, androidx.transition.r.h
        public void a(@NonNull r rVar) {
            i0.b(this.f14015b, true);
        }

        @Override // androidx.transition.y, androidx.transition.r.h
        public void f(@NonNull r rVar) {
            i0.b(this.f14015b, false);
        }

        @Override // androidx.transition.y, androidx.transition.r.h
        public void i(@NonNull r rVar) {
            if (!this.f14014a) {
                i0.b(this.f14015b, false);
            }
            rVar.e0(this);
        }

        @Override // androidx.transition.y, androidx.transition.r.h
        public void k(@NonNull r rVar) {
            i0.b(this.f14015b, false);
            this.f14014a = true;
        }
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f14019d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f14020e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f14021f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f14022g;

        i(View view) {
            this.f14020e = view;
        }

        private void b() {
            j0.d(this.f14020e, this.f14016a, this.f14017b, this.f14018c, this.f14019d);
            this.f14021f = 0;
            this.f14022g = 0;
        }

        void a(PointF pointF) {
            this.f14018c = Math.round(pointF.x);
            this.f14019d = Math.round(pointF.y);
            int i11 = this.f14022g + 1;
            this.f14022g = i11;
            if (this.f14021f == i11) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f14016a = Math.round(pointF.x);
            this.f14017b = Math.round(pointF.y);
            int i11 = this.f14021f + 1;
            this.f14021f = i11;
            if (i11 == this.f14022g) {
                b();
            }
        }
    }

    public b() {
        this.Q = false;
    }

    private void u0(e0 e0Var) {
        View view = e0Var.f14042b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        e0Var.f14041a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        e0Var.f14041a.put("android:changeBounds:parent", e0Var.f14042b.getParent());
        if (this.Q) {
            e0Var.f14041a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.r
    @NonNull
    public String[] K() {
        return R;
    }

    @Override // androidx.transition.r
    public boolean N() {
        return true;
    }

    @Override // androidx.transition.r
    public void i(@NonNull e0 e0Var) {
        u0(e0Var);
    }

    @Override // androidx.transition.r
    public void l(@NonNull e0 e0Var) {
        Rect rect;
        u0(e0Var);
        if (!this.Q || (rect = (Rect) e0Var.f14042b.getTag(l.f14088b)) == null) {
            return;
        }
        e0Var.f14041a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.r
    public Animator p(@NonNull ViewGroup viewGroup, e0 e0Var, e0 e0Var2) {
        int i11;
        int i12;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (e0Var == null || e0Var2 == null) {
            return null;
        }
        Map<String, Object> map = e0Var.f14041a;
        Map<String, Object> map2 = e0Var2.f14041a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = e0Var2.f14042b;
        Rect rect2 = (Rect) e0Var.f14041a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) e0Var2.f14041a.get("android:changeBounds:bounds");
        int i13 = rect2.left;
        int i14 = rect3.left;
        int i15 = rect2.top;
        int i16 = rect3.top;
        int i17 = rect2.right;
        int i18 = rect3.right;
        int i19 = rect2.bottom;
        int i21 = rect3.bottom;
        int i22 = i17 - i13;
        int i23 = i19 - i15;
        int i24 = i18 - i14;
        int i25 = i21 - i16;
        Rect rect4 = (Rect) e0Var.f14041a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) e0Var2.f14041a.get("android:changeBounds:clip");
        if ((i22 == 0 || i23 == 0) && (i24 == 0 || i25 == 0)) {
            i11 = 0;
        } else {
            i11 = (i13 == i14 && i15 == i16) ? 0 : 1;
            if (i17 != i18 || i19 != i21) {
                i11++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i11++;
        }
        int i26 = i11;
        if (i26 <= 0) {
            return null;
        }
        if (this.Q) {
            j0.d(view, i13, i15, Math.max(i22, i24) + i13, i15 + Math.max(i23, i25));
            ObjectAnimator objectAnimatorA = (i13 == i14 && i15 == i16) ? null : j.a(view, W, A().a(i13, i15, i14, i16));
            boolean z11 = rect4 == null;
            if (z11) {
                i12 = 0;
                rect = new Rect(0, 0, i22, i23);
            } else {
                i12 = 0;
                rect = rect4;
            }
            int i27 = rect5 == null ? 1 : i12;
            Rect rect6 = i27 != 0 ? new Rect(i12, i12, i24, i25) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", X, rect, rect6);
                g gVar = new g(view, rect, z11, rect6, i27, i13, i15, i17, i19, i14, i16, i18, i21);
                objectAnimatorOfObject.addListener(gVar);
                c(gVar);
            }
            animatorC = d0.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            j0.d(view, i13, i15, i17, i19);
            if (i26 != 2) {
                animatorC = (i13 == i14 && i15 == i16) ? j.a(view, U, A().a(i17, i19, i18, i21)) : j.a(view, V, A().a(i13, i15, i14, i16));
            } else if (i22 == i24 && i23 == i25) {
                animatorC = j.a(view, W, A().a(i13, i15, i14, i16));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = j.a(iVar, S, A().a(i13, i15, i14, i16));
                ObjectAnimator objectAnimatorA3 = j.a(iVar, T, A().a(i17, i19, i18, i21));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            i0.b(viewGroup4, true);
            C().c(new h(viewGroup4));
        }
        return animatorC;
    }

    public void v0(boolean z11) {
        this.Q = z11;
    }

    public b(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f14128d);
        boolean zE = j5.k.e(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        v0(zE);
    }
}
