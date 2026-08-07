package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public class p extends p0 {
    private static final TimeInterpolator U = new DecelerateInterpolator();
    private static final TimeInterpolator V = new AccelerateInterpolator();
    private static final g W = new a();
    private static final g X = new b();
    private static final g Y = new c();
    private static final g Z = new d();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final g f14106a0 = new e();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final g f14107b0 = new f();
    private g S;
    private int T;

    class a extends h {
        a() {
            super(null);
        }

        @Override // androidx.transition.p.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    class b extends h {
        b() {
            super(null);
        }

        @Override // androidx.transition.p.g
        public float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    class c extends i {
        c() {
            super(null);
        }

        @Override // androidx.transition.p.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    class d extends h {
        d() {
            super(null);
        }

        @Override // androidx.transition.p.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    class e extends h {
        e() {
            super(null);
        }

        @Override // androidx.transition.p.g
        public float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    class f extends i {
        f() {
            super(null);
        }

        @Override // androidx.transition.p.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    private interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    private static abstract class h implements g {
        private h() {
        }

        @Override // androidx.transition.p.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    private static abstract class i implements g {
        private i() {
        }

        @Override // androidx.transition.p.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    public p(int i11) {
        this.S = f14107b0;
        this.T = 80;
        C0(i11);
    }

    private void u0(e0 e0Var) {
        int[] iArr = new int[2];
        e0Var.f14042b.getLocationOnScreen(iArr);
        e0Var.f14041a.put("android:slide:screenPosition", iArr);
    }

    public void C0(int i11) {
        if (i11 == 3) {
            this.S = W;
        } else if (i11 == 5) {
            this.S = Z;
        } else if (i11 == 48) {
            this.S = Y;
        } else if (i11 == 80) {
            this.S = f14107b0;
        } else if (i11 == 8388611) {
            this.S = X;
        } else {
            if (i11 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.S = f14106a0;
        }
        this.T = i11;
        o oVar = new o();
        oVar.j(i11);
        q0(oVar);
    }

    @Override // androidx.transition.r
    public boolean N() {
        return true;
    }

    @Override // androidx.transition.p0, androidx.transition.r
    public void i(@NonNull e0 e0Var) {
        super.i(e0Var);
        u0(e0Var);
    }

    @Override // androidx.transition.p0, androidx.transition.r
    public void l(@NonNull e0 e0Var) {
        super.l(e0Var);
        u0(e0Var);
    }

    @Override // androidx.transition.p0
    public Animator x0(@NonNull ViewGroup viewGroup, @NonNull View view, e0 e0Var, e0 e0Var2) {
        if (e0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) e0Var2.f14041a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return g0.a(view, e0Var2, iArr[0], iArr[1], this.S.b(viewGroup, view), this.S.a(viewGroup, view), translationX, translationY, U, this);
    }

    @Override // androidx.transition.p0
    public Animator z0(@NonNull ViewGroup viewGroup, @NonNull View view, e0 e0Var, e0 e0Var2) {
        if (e0Var == null) {
            return null;
        }
        int[] iArr = (int[]) e0Var.f14041a.get("android:slide:screenPosition");
        return g0.a(view, e0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.S.b(viewGroup, view), this.S.a(viewGroup, view), V, this);
    }

    public p(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.S = f14107b0;
        this.T = 80;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f14132h);
        int iK = j5.k.k(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        C0(iK);
    }
}
