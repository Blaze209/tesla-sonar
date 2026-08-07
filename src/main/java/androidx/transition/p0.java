package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p0 extends r {
    private static final String[] R = {"android:visibility:visibility", "android:visibility:parent"};
    private int Q;

    private static class a extends AnimatorListenerAdapter implements r.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f14108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f14109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewGroup f14110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f14111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f14112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f14113f = false;

        a(View view, int i11, boolean z11) {
            this.f14108a = view;
            this.f14109b = i11;
            this.f14110c = (ViewGroup) view.getParent();
            this.f14111d = z11;
            c(true);
        }

        private void b() {
            if (!this.f14113f) {
                j0.f(this.f14108a, this.f14109b);
                ViewGroup viewGroup = this.f14110c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            c(false);
        }

        private void c(boolean z11) {
            ViewGroup viewGroup;
            if (!this.f14111d || this.f14112e == z11 || (viewGroup = this.f14110c) == null) {
                return;
            }
            this.f14112e = z11;
            i0.b(viewGroup, z11);
        }

        @Override // androidx.transition.r.h
        public void a(@NonNull r rVar) {
            c(true);
            if (this.f14113f) {
                return;
            }
            j0.f(this.f14108a, 0);
        }

        @Override // androidx.transition.r.h
        public void e(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void f(@NonNull r rVar) {
            c(false);
            if (this.f14113f) {
                return;
            }
            j0.f(this.f14108a, this.f14109b);
        }

        @Override // androidx.transition.r.h
        public void i(@NonNull r rVar) {
            rVar.e0(this);
        }

        @Override // androidx.transition.r.h
        public void k(@NonNull r rVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f14113f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z11) {
            if (z11) {
                return;
            }
            b();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z11) {
            if (z11) {
                j0.f(this.f14108a, 0);
                ViewGroup viewGroup = this.f14110c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    private class b extends AnimatorListenerAdapter implements r.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f14114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f14115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f14116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f14117d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.f14114a = viewGroup;
            this.f14115b = view;
            this.f14116c = view2;
        }

        private void b() {
            this.f14116c.setTag(l.f14087a, null);
            this.f14114a.getOverlay().remove(this.f14115b);
            this.f14117d = false;
        }

        @Override // androidx.transition.r.h
        public void a(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void e(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void f(@NonNull r rVar) {
        }

        @Override // androidx.transition.r.h
        public void i(@NonNull r rVar) {
            rVar.e0(this);
        }

        @Override // androidx.transition.r.h
        public void k(@NonNull r rVar) {
            if (this.f14117d) {
                b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f14114a.getOverlay().remove(this.f14115b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f14115b.getParent() == null) {
                this.f14114a.getOverlay().add(this.f14115b);
            } else {
                p0.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z11) {
            if (z11) {
                this.f14116c.setTag(l.f14087a, this.f14115b);
                this.f14114a.getOverlay().add(this.f14115b);
                this.f14117d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z11) {
            if (z11) {
                return;
            }
            b();
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f14119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f14120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ViewGroup f14123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ViewGroup f14124f;

        c() {
        }
    }

    public p0() {
        this.Q = 3;
    }

    private void u0(e0 e0Var) {
        e0Var.f14041a.put("android:visibility:visibility", Integer.valueOf(e0Var.f14042b.getVisibility()));
        e0Var.f14041a.put("android:visibility:parent", e0Var.f14042b.getParent());
        int[] iArr = new int[2];
        e0Var.f14042b.getLocationOnScreen(iArr);
        e0Var.f14041a.put("android:visibility:screenLocation", iArr);
    }

    private c w0(e0 e0Var, e0 e0Var2) {
        c cVar = new c();
        cVar.f14119a = false;
        cVar.f14120b = false;
        if (e0Var == null || !e0Var.f14041a.containsKey("android:visibility:visibility")) {
            cVar.f14121c = -1;
            cVar.f14123e = null;
        } else {
            cVar.f14121c = ((Integer) e0Var.f14041a.get("android:visibility:visibility")).intValue();
            cVar.f14123e = (ViewGroup) e0Var.f14041a.get("android:visibility:parent");
        }
        if (e0Var2 == null || !e0Var2.f14041a.containsKey("android:visibility:visibility")) {
            cVar.f14122d = -1;
            cVar.f14124f = null;
        } else {
            cVar.f14122d = ((Integer) e0Var2.f14041a.get("android:visibility:visibility")).intValue();
            cVar.f14124f = (ViewGroup) e0Var2.f14041a.get("android:visibility:parent");
        }
        if (e0Var != null && e0Var2 != null) {
            int i11 = cVar.f14121c;
            int i12 = cVar.f14122d;
            if (i11 != i12 || cVar.f14123e != cVar.f14124f) {
                if (i11 != i12) {
                    if (i11 == 0) {
                        cVar.f14120b = false;
                        cVar.f14119a = true;
                        return cVar;
                    }
                    if (i12 == 0) {
                        cVar.f14120b = true;
                        cVar.f14119a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f14124f == null) {
                        cVar.f14120b = false;
                        cVar.f14119a = true;
                        return cVar;
                    }
                    if (cVar.f14123e == null) {
                        cVar.f14120b = true;
                        cVar.f14119a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (e0Var == null && cVar.f14122d == 0) {
                cVar.f14120b = true;
                cVar.f14119a = true;
                return cVar;
            }
            if (e0Var2 == null && cVar.f14121c == 0) {
                cVar.f14120b = false;
                cVar.f14119a = true;
            }
        }
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    public Animator A0(@NonNull ViewGroup viewGroup, e0 e0Var, int i11, e0 e0Var2, int i12) {
        View view;
        boolean z11;
        View view2;
        boolean z12;
        if ((this.Q & 2) != 2 || e0Var == null) {
            return null;
        }
        View view3 = e0Var.f14042b;
        View viewA = e0Var2 != null ? e0Var2.f14042b : null;
        View view4 = (View) view3.getTag(l.f14087a);
        if (view4 != null) {
            view2 = null;
            z12 = true;
        } else {
            if (viewA == null || viewA.getParent() == null) {
                if (viewA != null) {
                    view = null;
                    z11 = false;
                } else {
                    viewA = null;
                    view = null;
                    z11 = true;
                }
            } else if (i12 == 4 || view3 == viewA) {
                view = viewA;
                z11 = false;
                viewA = null;
            } else {
                viewA = null;
                view = null;
                z11 = true;
            }
            if (z11) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (w0(L(view5, true), y(view5, true)).f14119a) {
                            int id2 = view5.getId();
                            if (view5.getParent() != null || id2 == -1 || viewGroup.findViewById(id2) == null || !this.f14159w) {
                            }
                        } else {
                            viewA = d0.a(viewGroup, view3, view5);
                        }
                    }
                    View view6 = view;
                    view4 = viewA;
                    view2 = view6;
                    z12 = false;
                }
                view2 = view;
                z12 = false;
                view4 = view3;
            } else {
                View view7 = view;
                view4 = viewA;
                view2 = view7;
                z12 = false;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            j0.f(view2, 0);
            Animator animatorZ0 = z0(viewGroup, view2, e0Var, e0Var2);
            if (animatorZ0 == null) {
                j0.f(view2, visibility);
                return animatorZ0;
            }
            a aVar = new a(view2, i12, true);
            animatorZ0.addListener(aVar);
            C().c(aVar);
            return animatorZ0;
        }
        if (!z12) {
            int[] iArr = (int[]) e0Var.f14041a.get("android:visibility:screenLocation");
            int i13 = iArr[0];
            int i14 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i13 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i14 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorZ1 = z0(viewGroup, view4, e0Var, e0Var2);
        if (!z12) {
            if (animatorZ1 == null) {
                viewGroup.getOverlay().remove(view4);
                return animatorZ1;
            }
            view3.setTag(l.f14087a, view4);
            b bVar = new b(viewGroup, view4, view3);
            animatorZ1.addListener(bVar);
            animatorZ1.addPauseListener(bVar);
            C().c(bVar);
        }
        return animatorZ1;
    }

    public void B0(int i11) {
        if ((i11 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.Q = i11;
    }

    @Override // androidx.transition.r
    public String[] K() {
        return R;
    }

    @Override // androidx.transition.r
    public boolean O(e0 e0Var, e0 e0Var2) {
        if (e0Var == null && e0Var2 == null) {
            return false;
        }
        if (e0Var != null && e0Var2 != null && e0Var2.f14041a.containsKey("android:visibility:visibility") != e0Var.f14041a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarW0 = w0(e0Var, e0Var2);
        return cVarW0.f14119a && (cVarW0.f14121c == 0 || cVarW0.f14122d == 0);
    }

    @Override // androidx.transition.r
    public void i(@NonNull e0 e0Var) {
        u0(e0Var);
    }

    @Override // androidx.transition.r
    public void l(@NonNull e0 e0Var) {
        u0(e0Var);
    }

    @Override // androidx.transition.r
    public Animator p(@NonNull ViewGroup viewGroup, e0 e0Var, e0 e0Var2) {
        c cVarW0 = w0(e0Var, e0Var2);
        if (!cVarW0.f14119a) {
            return null;
        }
        if (cVarW0.f14123e == null && cVarW0.f14124f == null) {
            return null;
        }
        return cVarW0.f14120b ? y0(viewGroup, e0Var, cVarW0.f14121c, e0Var2, cVarW0.f14122d) : A0(viewGroup, e0Var, cVarW0.f14121c, e0Var2, cVarW0.f14122d);
    }

    public int v0() {
        return this.Q;
    }

    public Animator x0(@NonNull ViewGroup viewGroup, @NonNull View view, e0 e0Var, e0 e0Var2) {
        return null;
    }

    public Animator y0(@NonNull ViewGroup viewGroup, e0 e0Var, int i11, e0 e0Var2, int i12) {
        if ((this.Q & 1) != 1 || e0Var2 == null) {
            return null;
        }
        if (e0Var == null) {
            View view = (View) e0Var2.f14042b.getParent();
            if (w0(y(view, false), L(view, false)).f14119a) {
                return null;
            }
        }
        return x0(viewGroup, e0Var2.f14042b, e0Var, e0Var2);
    }

    public Animator z0(@NonNull ViewGroup viewGroup, @NonNull View view, e0 e0Var, e0 e0Var2) {
        return null;
    }

    public p0(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f14129e);
        int iK = j5.k.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iK != 0) {
            B0(iK);
        }
    }
}
