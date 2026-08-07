package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public class l extends RecyclerView.p implements RecyclerView.s {
    private f A;
    private Rect C;
    private long D;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f13507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f13508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f13509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f13510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f13511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f13512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f13513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f13514k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    e f13516m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f13518o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f13520q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    RecyclerView f13521r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    VelocityTracker f13523t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List<RecyclerView.g0> f13524u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List<Integer> f13525v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    GestureDetector f13529z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<View> f13504a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f13505b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    RecyclerView.g0 f13506c = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f13515l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f13517n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    List<g> f13519p = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final Runnable f13522s = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private RecyclerView.l f13526w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    View f13527x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f13528y = -1;
    private final RecyclerView.u B = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            if (lVar.f13506c == null || !lVar.E()) {
                return;
            }
            l lVar2 = l.this;
            RecyclerView.g0 g0Var = lVar2.f13506c;
            if (g0Var != null) {
                lVar2.z(g0Var);
            }
            l lVar3 = l.this;
            lVar3.f13521r.removeCallbacks(lVar3.f13522s);
            ViewCompat.h0(l.this.f13521r, this);
        }
    }

    class b implements RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            l.this.f13529z.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = l.this.f13523t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (l.this.f13515l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(l.this.f13515l);
            if (iFindPointerIndex >= 0) {
                l.this.o(actionMasked, motionEvent, iFindPointerIndex);
            }
            l lVar = l.this;
            RecyclerView.g0 g0Var = lVar.f13506c;
            if (g0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        lVar.K(motionEvent, lVar.f13518o, iFindPointerIndex);
                        l.this.z(g0Var);
                        l lVar2 = l.this;
                        lVar2.f13521r.removeCallbacks(lVar2.f13522s);
                        l.this.f13522s.run();
                        l.this.f13521r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    l lVar3 = l.this;
                    if (pointerId == lVar3.f13515l) {
                        lVar3.f13515l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        l lVar4 = l.this;
                        lVar4.K(motionEvent, lVar4.f13518o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = lVar.f13523t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            l.this.F(null, 0);
            l.this.f13515l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public boolean c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            int iFindPointerIndex;
            g gVarS;
            l.this.f13529z.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                l.this.f13515l = motionEvent.getPointerId(0);
                l.this.f13507d = motionEvent.getX();
                l.this.f13508e = motionEvent.getY();
                l.this.A();
                l lVar = l.this;
                if (lVar.f13506c == null && (gVarS = lVar.s(motionEvent)) != null) {
                    l lVar2 = l.this;
                    lVar2.f13507d -= gVarS.f13552j;
                    lVar2.f13508e -= gVarS.f13553k;
                    lVar2.r(gVarS.f13547e, true);
                    if (l.this.f13504a.remove(gVarS.f13547e.itemView)) {
                        l lVar3 = l.this;
                        lVar3.f13516m.c(lVar3.f13521r, gVarS.f13547e);
                    }
                    l.this.F(gVarS.f13547e, gVarS.f13548f);
                    l lVar4 = l.this;
                    lVar4.K(motionEvent, lVar4.f13518o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                l lVar5 = l.this;
                lVar5.f13515l = -1;
                lVar5.F(null, 0);
            } else {
                int i11 = l.this.f13515l;
                if (i11 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i11)) >= 0) {
                    l.this.o(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = l.this.f13523t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return l.this.f13506c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void e(boolean z11) {
            if (z11) {
                l.this.F(null, 0);
            }
        }
    }

    class c extends g {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f13532o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ RecyclerView.g0 f13533p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RecyclerView.g0 g0Var, int i11, int i12, float f11, float f12, float f13, float f14, int i13, RecyclerView.g0 g0Var2) {
            super(g0Var, i11, i12, f11, f12, f13, f14);
            this.f13532o = i13;
            this.f13533p = g0Var2;
        }

        @Override // androidx.recyclerview.widget.l.g, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f13554l) {
                return;
            }
            if (this.f13532o <= 0) {
                l lVar = l.this;
                lVar.f13516m.c(lVar.f13521r, this.f13533p);
            } else {
                l.this.f13504a.add(this.f13533p.itemView);
                this.f13551i = true;
                int i11 = this.f13532o;
                if (i11 > 0) {
                    l.this.B(this, i11);
                }
            }
            l lVar2 = l.this;
            View view = lVar2.f13527x;
            View view2 = this.f13533p.itemView;
            if (view == view2) {
                lVar2.D(view2);
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f13535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13536b;

        d(g gVar, int i11) {
            this.f13535a = gVar;
            this.f13536b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = l.this.f13521r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            g gVar = this.f13535a;
            if (gVar.f13554l || gVar.f13547e.getAbsoluteAdapterPosition() == -1) {
                return;
            }
            RecyclerView.n itemAnimator = l.this.f13521r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !l.this.x()) {
                l.this.f13516m.B(this.f13535a.f13547e, this.f13536b);
            } else {
                l.this.f13521r.post(this);
            }
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Interpolator f13538b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Interpolator f13539c = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f13540a = -1;

        class a implements Interpolator {
            a() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f11) {
                return f11 * f11 * f11 * f11 * f11;
            }
        }

        class b implements Interpolator {
            b() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f11) {
                float f12 = f11 - 1.0f;
                return (f12 * f12 * f12 * f12 * f12) + 1.0f;
            }
        }

        public static int e(int i11, int i12) {
            int i13;
            int i14 = i11 & 789516;
            if (i14 == 0) {
                return i11;
            }
            int i15 = i11 & (~i14);
            if (i12 == 0) {
                i13 = i14 << 2;
            } else {
                int i16 = i14 << 1;
                i15 |= (-789517) & i16;
                i13 = (i16 & 789516) << 2;
            }
            return i15 | i13;
        }

        private int i(RecyclerView recyclerView) {
            if (this.f13540a == -1) {
                this.f13540a = recyclerView.getResources().getDimensionPixelSize(qa.b.f105273d);
            }
            return this.f13540a;
        }

        public static int s(int i11, int i12) {
            return i12 << (i11 * 8);
        }

        public static int t(int i11, int i12) {
            return s(2, i11) | s(1, i12) | s(0, i12 | i11);
        }

        public void A(RecyclerView.g0 g0Var, int i11) {
            if (g0Var != null) {
                n.f13560a.a(g0Var.itemView);
            }
        }

        public abstract void B(@NonNull RecyclerView.g0 g0Var, int i11);

        public boolean a(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var, @NonNull RecyclerView.g0 g0Var2) {
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public RecyclerView.g0 b(@NonNull RecyclerView.g0 g0Var, @NonNull List<RecyclerView.g0> list, int i11, int i12) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = g0Var.itemView.getWidth() + i11;
            int height = i12 + g0Var.itemView.getHeight();
            int left2 = i11 - g0Var.itemView.getLeft();
            int top2 = i12 - g0Var.itemView.getTop();
            int size = list.size();
            RecyclerView.g0 g0Var2 = null;
            int i13 = -1;
            for (int i14 = 0; i14 < size; i14++) {
                RecyclerView.g0 g0Var3 = list.get(i14);
                if (left2 > 0 && (right = g0Var3.itemView.getRight() - width) < 0 && g0Var3.itemView.getRight() > g0Var.itemView.getRight() && (iAbs4 = Math.abs(right)) > i13) {
                    g0Var2 = g0Var3;
                    i13 = iAbs4;
                }
                if (left2 < 0 && (left = g0Var3.itemView.getLeft() - i11) > 0 && g0Var3.itemView.getLeft() < g0Var.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i13) {
                    g0Var2 = g0Var3;
                    i13 = iAbs3;
                }
                if (top2 < 0 && (top = g0Var3.itemView.getTop() - i12) > 0 && g0Var3.itemView.getTop() < g0Var.itemView.getTop() && (iAbs2 = Math.abs(top)) > i13) {
                    g0Var2 = g0Var3;
                    i13 = iAbs2;
                }
                if (top2 > 0 && (bottom = g0Var3.itemView.getBottom() - height) < 0 && g0Var3.itemView.getBottom() > g0Var.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i13) {
                    g0Var2 = g0Var3;
                    i13 = iAbs;
                }
            }
            return g0Var2;
        }

        public void c(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var) {
            n.f13560a.c(g0Var.itemView);
        }

        public int d(int i11, int i12) {
            int i13;
            int i14 = i11 & 3158064;
            if (i14 == 0) {
                return i11;
            }
            int i15 = i11 & (~i14);
            if (i12 == 0) {
                i13 = i14 >> 2;
            } else {
                int i16 = i14 >> 1;
                i15 |= (-3158065) & i16;
                i13 = (i16 & 3158064) >> 2;
            }
            return i15 | i13;
        }

        final int f(RecyclerView recyclerView, RecyclerView.g0 g0Var) {
            return d(k(recyclerView, g0Var), recyclerView.getLayoutDirection());
        }

        public long g(@NonNull RecyclerView recyclerView, int i11, float f11, float f12) {
            RecyclerView.n itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i11 == 8 ? 200L : 250L;
            }
            return i11 == 8 ? itemAnimator.getMoveDuration() : itemAnimator.getRemoveDuration();
        }

        public int h() {
            return 0;
        }

        public float j(@NonNull RecyclerView.g0 g0Var) {
            return 0.5f;
        }

        public abstract int k(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var);

        public float l(float f11) {
            return f11;
        }

        public abstract float m(@NonNull RecyclerView.g0 g0Var);

        public float n(float f11) {
            return f11;
        }

        boolean o(RecyclerView recyclerView, RecyclerView.g0 g0Var) {
            return (f(recyclerView, g0Var) & 16711680) != 0;
        }

        public int p(@NonNull RecyclerView recyclerView, int i11, int i12, int i13, long j11) {
            int iSignum = (int) (((int) (((int) Math.signum(i12)) * i(recyclerView) * f13539c.getInterpolation(Math.min(1.0f, (Math.abs(i12) * 1.0f) / i11)))) * f13538b.getInterpolation(j11 <= 2000 ? j11 / 2000.0f : 1.0f));
            if (iSignum == 0) {
                return i12 > 0 ? 1 : -1;
            }
            return iSignum;
        }

        public boolean q() {
            return true;
        }

        public boolean r() {
            return true;
        }

        public void u(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var, float f11, float f12, int i11, boolean z11) {
            n.f13560a.b(canvas, recyclerView, g0Var.itemView, f11, f12, i11, z11);
        }

        public void v(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.g0 g0Var, float f11, float f12, int i11, boolean z11) {
            n.f13560a.d(canvas, recyclerView, g0Var.itemView, f11, f12, i11, z11);
        }

        void w(Canvas canvas, RecyclerView recyclerView, RecyclerView.g0 g0Var, List<g> list, int i11, float f11, float f12) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = list.get(i12);
                gVar.e();
                int iSave = canvas.save();
                u(canvas, recyclerView, gVar.f13547e, gVar.f13552j, gVar.f13553k, gVar.f13548f, false);
                canvas.restoreToCount(iSave);
            }
            if (g0Var != null) {
                int iSave2 = canvas.save();
                u(canvas, recyclerView, g0Var, f11, f12, i11, true);
                canvas.restoreToCount(iSave2);
            }
        }

        void x(Canvas canvas, RecyclerView recyclerView, RecyclerView.g0 g0Var, List<g> list, int i11, float f11, float f12) {
            int size = list.size();
            boolean z11 = false;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = list.get(i12);
                int iSave = canvas.save();
                v(canvas, recyclerView, gVar.f13547e, gVar.f13552j, gVar.f13553k, gVar.f13548f, false);
                canvas.restoreToCount(iSave);
            }
            if (g0Var != null) {
                int iSave2 = canvas.save();
                v(canvas, recyclerView, g0Var, f11, f12, i11, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i13 = size - 1; i13 >= 0; i13--) {
                g gVar2 = list.get(i13);
                boolean z12 = gVar2.f13555m;
                if (z12 && !gVar2.f13551i) {
                    list.remove(i13);
                } else if (!z12) {
                    z11 = true;
                }
            }
            if (z11) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean y(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var, @NonNull RecyclerView.g0 g0Var2);

        /* JADX WARN: Multi-variable type inference failed */
        public void z(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var, int i11, @NonNull RecyclerView.g0 g0Var2, int i12, int i13, int i14) {
            RecyclerView.q layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof i) {
                ((i) layoutManager).e(g0Var.itemView, g0Var2.itemView, i13, i14);
                return;
            }
            if (layoutManager.q()) {
                if (layoutManager.W(g0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.v1(i12);
                }
                if (layoutManager.Z(g0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.v1(i12);
                }
            }
            if (layoutManager.r()) {
                if (layoutManager.a0(g0Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.v1(i12);
                }
                if (layoutManager.U(g0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.v1(i12);
                }
            }
        }
    }

    private class f extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f13541a = true;

        f() {
        }

        void a() {
            this.f13541a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewT;
            RecyclerView.g0 g0VarN0;
            if (!this.f13541a || (viewT = l.this.t(motionEvent)) == null || (g0VarN0 = l.this.f13521r.n0(viewT)) == null) {
                return;
            }
            l lVar = l.this;
            if (lVar.f13516m.o(lVar.f13521r, g0VarN0)) {
                int pointerId = motionEvent.getPointerId(0);
                int i11 = l.this.f13515l;
                if (pointerId == i11) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    l lVar2 = l.this;
                    lVar2.f13507d = x11;
                    lVar2.f13508e = y11;
                    lVar2.f13512i = BitmapDescriptorFactory.HUE_RED;
                    lVar2.f13511h = BitmapDescriptorFactory.HUE_RED;
                    if (lVar2.f13516m.r()) {
                        l.this.F(g0VarN0, 2);
                    }
                }
            }
        }
    }

    static class g implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f13543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f13544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f13545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f13546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final RecyclerView.g0 f13547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f13548f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final ValueAnimator f13549g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int f13550h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f13551i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f13552j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f13553k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f13554l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f13555m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f13556n;

        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        g(RecyclerView.g0 g0Var, int i11, int i12, float f11, float f12, float f13, float f14) {
            this.f13548f = i12;
            this.f13550h = i11;
            this.f13547e = g0Var;
            this.f13543a = f11;
            this.f13544b = f12;
            this.f13545c = f13;
            this.f13546d = f14;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.f13549g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new a());
            valueAnimatorOfFloat.setTarget(g0Var.itemView);
            valueAnimatorOfFloat.addListener(this);
            c(BitmapDescriptorFactory.HUE_RED);
        }

        public void a() {
            this.f13549g.cancel();
        }

        public void b(long j11) {
            this.f13549g.setDuration(j11);
        }

        public void c(float f11) {
            this.f13556n = f11;
        }

        public void d() {
            this.f13547e.setIsRecyclable(false);
            this.f13549g.start();
        }

        public void e() {
            float f11 = this.f13543a;
            float f12 = this.f13545c;
            if (f11 == f12) {
                this.f13552j = this.f13547e.itemView.getTranslationX();
            } else {
                this.f13552j = f11 + (this.f13556n * (f12 - f11));
            }
            float f13 = this.f13544b;
            float f14 = this.f13546d;
            if (f13 == f14) {
                this.f13553k = this.f13547e.itemView.getTranslationY();
            } else {
                this.f13553k = f13 + (this.f13556n * (f14 - f13));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f13555m) {
                this.f13547e.setIsRecyclable(true);
            }
            this.f13555m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static abstract class h extends e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f13558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f13559e;

        public h(int i11, int i12) {
            this.f13558d = i12;
            this.f13559e = i11;
        }

        public int C(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var) {
            return this.f13559e;
        }

        public int D(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var) {
            return this.f13558d;
        }

        @Override // androidx.recyclerview.widget.l.e
        public int k(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var) {
            return e.t(C(recyclerView, g0Var), D(recyclerView, g0Var));
        }
    }

    public interface i {
        void e(@NonNull View view, @NonNull View view2, int i11, int i12);
    }

    public l(@NonNull e eVar) {
        this.f13516m = eVar;
    }

    private void C() {
        VelocityTracker velocityTracker = this.f13523t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f13523t = null;
        }
    }

    private void G() {
        this.f13520q = ViewConfiguration.get(this.f13521r.getContext()).getScaledTouchSlop();
        this.f13521r.j(this);
        this.f13521r.m(this.B);
        this.f13521r.l(this);
        H();
    }

    private void H() {
        this.A = new f();
        this.f13529z = new GestureDetector(this.f13521r.getContext(), this.A);
    }

    private void I() {
        f fVar = this.A;
        if (fVar != null) {
            fVar.a();
            this.A = null;
        }
        if (this.f13529z != null) {
            this.f13529z = null;
        }
    }

    private int J(RecyclerView.g0 g0Var) {
        if (this.f13517n == 2) {
            return 0;
        }
        int iK = this.f13516m.k(this.f13521r, g0Var);
        int iD = (this.f13516m.d(iK, this.f13521r.getLayoutDirection()) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) >> 8;
        if (iD == 0) {
            return 0;
        }
        int i11 = (iK & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) >> 8;
        if (Math.abs(this.f13511h) > Math.abs(this.f13512i)) {
            int iN = n(g0Var, iD);
            if (iN > 0) {
                return (i11 & iN) == 0 ? e.e(iN, this.f13521r.getLayoutDirection()) : iN;
            }
            int iP = p(g0Var, iD);
            if (iP > 0) {
                return iP;
            }
        } else {
            int iP2 = p(g0Var, iD);
            if (iP2 > 0) {
                return iP2;
            }
            int iN2 = n(g0Var, iD);
            if (iN2 > 0) {
                return (i11 & iN2) == 0 ? e.e(iN2, this.f13521r.getLayoutDirection()) : iN2;
            }
        }
        return 0;
    }

    private void l() {
    }

    private int n(RecyclerView.g0 g0Var, int i11) {
        if ((i11 & 12) == 0) {
            return 0;
        }
        int i12 = this.f13511h > BitmapDescriptorFactory.HUE_RED ? 8 : 4;
        VelocityTracker velocityTracker = this.f13523t;
        if (velocityTracker != null && this.f13515l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f13516m.n(this.f13510g));
            float xVelocity = this.f13523t.getXVelocity(this.f13515l);
            float yVelocity = this.f13523t.getYVelocity(this.f13515l);
            int i13 = xVelocity > BitmapDescriptorFactory.HUE_RED ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i13 & i11) != 0 && i12 == i13 && fAbs >= this.f13516m.l(this.f13509f) && fAbs > Math.abs(yVelocity)) {
                return i13;
            }
        }
        float width = this.f13521r.getWidth() * this.f13516m.m(g0Var);
        if ((i11 & i12) == 0 || Math.abs(this.f13511h) <= width) {
            return 0;
        }
        return i12;
    }

    private int p(RecyclerView.g0 g0Var, int i11) {
        if ((i11 & 3) == 0) {
            return 0;
        }
        int i12 = this.f13512i > BitmapDescriptorFactory.HUE_RED ? 2 : 1;
        VelocityTracker velocityTracker = this.f13523t;
        if (velocityTracker != null && this.f13515l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f13516m.n(this.f13510g));
            float xVelocity = this.f13523t.getXVelocity(this.f13515l);
            float yVelocity = this.f13523t.getYVelocity(this.f13515l);
            int i13 = yVelocity > BitmapDescriptorFactory.HUE_RED ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i13 & i11) != 0 && i13 == i12 && fAbs >= this.f13516m.l(this.f13509f) && fAbs > Math.abs(xVelocity)) {
                return i13;
            }
        }
        float height = this.f13521r.getHeight() * this.f13516m.m(g0Var);
        if ((i11 & i12) == 0 || Math.abs(this.f13512i) <= height) {
            return 0;
        }
        return i12;
    }

    private void q() {
        this.f13521r.j1(this);
        this.f13521r.l1(this.B);
        this.f13521r.k1(this);
        for (int size = this.f13519p.size() - 1; size >= 0; size--) {
            g gVar = this.f13519p.get(0);
            gVar.a();
            this.f13516m.c(this.f13521r, gVar.f13547e);
        }
        this.f13519p.clear();
        this.f13527x = null;
        this.f13528y = -1;
        C();
        I();
    }

    private List<RecyclerView.g0> u(RecyclerView.g0 g0Var) {
        RecyclerView.g0 g0Var2 = g0Var;
        List<RecyclerView.g0> list = this.f13524u;
        if (list == null) {
            this.f13524u = new ArrayList();
            this.f13525v = new ArrayList();
        } else {
            list.clear();
            this.f13525v.clear();
        }
        int iH = this.f13516m.h();
        int iRound = Math.round(this.f13513j + this.f13511h) - iH;
        int iRound2 = Math.round(this.f13514k + this.f13512i) - iH;
        int i11 = iH * 2;
        int width = g0Var2.itemView.getWidth() + iRound + i11;
        int height = g0Var2.itemView.getHeight() + iRound2 + i11;
        int i12 = (iRound + width) / 2;
        int i13 = (iRound2 + height) / 2;
        RecyclerView.q layoutManager = this.f13521r.getLayoutManager();
        int iP = layoutManager.P();
        int i14 = 0;
        while (i14 < iP) {
            View viewO = layoutManager.O(i14);
            if (viewO != g0Var2.itemView && viewO.getBottom() >= iRound2 && viewO.getTop() <= height && viewO.getRight() >= iRound && viewO.getLeft() <= width) {
                RecyclerView.g0 g0VarN0 = this.f13521r.n0(viewO);
                if (this.f13516m.a(this.f13521r, this.f13506c, g0VarN0)) {
                    int iAbs = Math.abs(i12 - ((viewO.getLeft() + viewO.getRight()) / 2));
                    int iAbs2 = Math.abs(i13 - ((viewO.getTop() + viewO.getBottom()) / 2));
                    int i15 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = this.f13524u.size();
                    int i16 = 0;
                    for (int i17 = 0; i17 < size && i15 > this.f13525v.get(i17).intValue(); i17++) {
                        i16++;
                    }
                    this.f13524u.add(i16, g0VarN0);
                    this.f13525v.add(i16, Integer.valueOf(i15));
                }
            }
            i14++;
            g0Var2 = g0Var;
        }
        return this.f13524u;
    }

    private RecyclerView.g0 v(MotionEvent motionEvent) {
        View viewT;
        RecyclerView.q layoutManager = this.f13521r.getLayoutManager();
        int i11 = this.f13515l;
        if (i11 == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i11);
        float x11 = motionEvent.getX(iFindPointerIndex) - this.f13507d;
        float y11 = motionEvent.getY(iFindPointerIndex) - this.f13508e;
        float fAbs = Math.abs(x11);
        float fAbs2 = Math.abs(y11);
        int i12 = this.f13520q;
        if (fAbs < i12 && fAbs2 < i12) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.q()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.r()) && (viewT = t(motionEvent)) != null) {
            return this.f13521r.n0(viewT);
        }
        return null;
    }

    private void w(float[] fArr) {
        if ((this.f13518o & 12) != 0) {
            fArr[0] = (this.f13513j + this.f13511h) - this.f13506c.itemView.getLeft();
        } else {
            fArr[0] = this.f13506c.itemView.getTranslationX();
        }
        if ((this.f13518o & 3) != 0) {
            fArr[1] = (this.f13514k + this.f13512i) - this.f13506c.itemView.getTop();
        } else {
            fArr[1] = this.f13506c.itemView.getTranslationY();
        }
    }

    private static boolean y(View view, float f11, float f12, float f13, float f14) {
        return f11 >= f13 && f11 <= f13 + ((float) view.getWidth()) && f12 >= f14 && f12 <= f14 + ((float) view.getHeight());
    }

    void A() {
        VelocityTracker velocityTracker = this.f13523t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f13523t = VelocityTracker.obtain();
    }

    void B(g gVar, int i11) {
        this.f13521r.post(new d(gVar, i11));
    }

    void D(View view) {
        if (view == this.f13527x) {
            this.f13527x = null;
            if (this.f13526w != null) {
                this.f13521r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    boolean E() {
        int iP;
        int iP2;
        if (this.f13506c == null) {
            this.D = Long.MIN_VALUE;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = this.D;
        long j12 = j11 == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j11;
        RecyclerView.q layoutManager = this.f13521r.getLayoutManager();
        if (this.C == null) {
            this.C = new Rect();
        }
        layoutManager.p(this.f13506c.itemView, this.C);
        if (layoutManager.q()) {
            int i11 = (int) (this.f13513j + this.f13511h);
            int paddingLeft = (i11 - this.C.left) - this.f13521r.getPaddingLeft();
            float f11 = this.f13511h;
            if ((f11 >= BitmapDescriptorFactory.HUE_RED || paddingLeft >= 0) && (f11 <= BitmapDescriptorFactory.HUE_RED || (paddingLeft = ((i11 + this.f13506c.itemView.getWidth()) + this.C.right) - (this.f13521r.getWidth() - this.f13521r.getPaddingRight())) <= 0)) {
                iP = 0;
            } else {
                iP = paddingLeft;
            }
        } else {
            iP = 0;
        }
        if (layoutManager.r()) {
            int i12 = (int) (this.f13514k + this.f13512i);
            iP2 = (i12 - this.C.top) - this.f13521r.getPaddingTop();
            float f12 = this.f13512i;
            if ((f12 >= BitmapDescriptorFactory.HUE_RED || iP2 >= 0) && (f12 <= BitmapDescriptorFactory.HUE_RED || (iP2 = ((i12 + this.f13506c.itemView.getHeight()) + this.C.bottom) - (this.f13521r.getHeight() - this.f13521r.getPaddingBottom())) <= 0)) {
                iP2 = 0;
            }
        } else {
            iP2 = 0;
        }
        if (iP != 0) {
            iP = this.f13516m.p(this.f13521r, this.f13506c.itemView.getWidth(), iP, this.f13521r.getWidth(), j12);
        }
        int i13 = iP;
        if (iP2 != 0) {
            iP2 = this.f13516m.p(this.f13521r, this.f13506c.itemView.getHeight(), iP2, this.f13521r.getHeight(), j12);
        }
        if (i13 == 0 && iP2 == 0) {
            this.D = Long.MIN_VALUE;
            return false;
        }
        if (this.D == Long.MIN_VALUE) {
            this.D = jCurrentTimeMillis;
        }
        this.f13521r.scrollBy(i13, iP2);
        return true;
    }

    void F(RecyclerView.g0 g0Var, int i11) {
        boolean z11;
        float fSignum;
        float fSignum2;
        if (g0Var == this.f13506c && i11 == this.f13517n) {
            return;
        }
        this.D = Long.MIN_VALUE;
        int i12 = this.f13517n;
        r(g0Var, true);
        this.f13517n = i11;
        if (i11 == 2) {
            if (g0Var == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f13527x = g0Var.itemView;
            l();
        }
        int i13 = (1 << ((i11 * 8) + 8)) - 1;
        RecyclerView.g0 g0Var2 = this.f13506c;
        boolean z12 = false;
        if (g0Var2 != null) {
            if (g0Var2.itemView.getParent() != null) {
                int iJ = i12 == 2 ? 0 : J(g0Var2);
                C();
                int i14 = 4;
                if (iJ == 1 || iJ == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f13512i) * this.f13521r.getHeight();
                } else if (iJ == 4 || iJ == 8 || iJ == 16 || iJ == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.f13511h) * this.f13521r.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i12 == 2) {
                    i14 = 8;
                } else if (iJ > 0) {
                    i14 = 2;
                }
                w(this.f13505b);
                float[] fArr = this.f13505b;
                float f11 = fArr[0];
                float f12 = fArr[1];
                z11 = false;
                c cVar = new c(g0Var2, i14, i12, f11, f12, fSignum, fSignum2, iJ, g0Var2);
                cVar.b(this.f13516m.g(this.f13521r, i14, fSignum - f11, fSignum2 - f12));
                this.f13519p.add(cVar);
                cVar.d();
                z12 = true;
            } else {
                z11 = false;
                D(g0Var2.itemView);
                this.f13516m.c(this.f13521r, g0Var2);
                z12 = false;
            }
            this.f13506c = null;
        } else {
            z11 = false;
        }
        if (g0Var != null) {
            this.f13518o = (this.f13516m.f(this.f13521r, g0Var) & i13) >> (this.f13517n * 8);
            this.f13513j = g0Var.itemView.getLeft();
            this.f13514k = g0Var.itemView.getTop();
            this.f13506c = g0Var;
            if (i11 == 2) {
                g0Var.itemView.performHapticFeedback(z11 ? 1 : 0);
            }
        }
        ViewParent parent = this.f13521r.getParent();
        if (parent != null) {
            if (this.f13506c != null) {
                z11 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z11);
        }
        if (!z12) {
            this.f13521r.getLayoutManager().A1();
        }
        this.f13516m.A(this.f13506c, this.f13517n);
        this.f13521r.invalidate();
    }

    void K(MotionEvent motionEvent, int i11, int i12) {
        float x11 = motionEvent.getX(i12);
        float y11 = motionEvent.getY(i12);
        float f11 = x11 - this.f13507d;
        this.f13511h = f11;
        this.f13512i = y11 - this.f13508e;
        if ((i11 & 4) == 0) {
            this.f13511h = Math.max(BitmapDescriptorFactory.HUE_RED, f11);
        }
        if ((i11 & 8) == 0) {
            this.f13511h = Math.min(BitmapDescriptorFactory.HUE_RED, this.f13511h);
        }
        if ((i11 & 1) == 0) {
            this.f13512i = Math.max(BitmapDescriptorFactory.HUE_RED, this.f13512i);
        }
        if ((i11 & 2) == 0) {
            this.f13512i = Math.min(BitmapDescriptorFactory.HUE_RED, this.f13512i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void b(@NonNull View view) {
        D(view);
        RecyclerView.g0 g0VarN0 = this.f13521r.n0(view);
        if (g0VarN0 == null) {
            return;
        }
        RecyclerView.g0 g0Var = this.f13506c;
        if (g0Var != null && g0VarN0 == g0Var) {
            F(null, 0);
            return;
        }
        r(g0VarN0, false);
        if (this.f13504a.remove(g0VarN0.itemView)) {
            this.f13516m.c(this.f13521r, g0VarN0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void d(@NonNull View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        float f11;
        float f12;
        this.f13528y = -1;
        if (this.f13506c != null) {
            w(this.f13505b);
            float[] fArr = this.f13505b;
            float f13 = fArr[0];
            f12 = fArr[1];
            f11 = f13;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        this.f13516m.w(canvas, recyclerView, this.f13506c, this.f13519p, this.f13517n, f11, f12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void k(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.c0 c0Var) {
        float f11;
        float f12;
        if (this.f13506c != null) {
            w(this.f13505b);
            float[] fArr = this.f13505b;
            float f13 = fArr[0];
            f12 = fArr[1];
            f11 = f13;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        this.f13516m.x(canvas, recyclerView, this.f13506c, this.f13519p, this.f13517n, f11, f12);
    }

    public void m(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f13521r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            q();
        }
        this.f13521r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f13509f = resources.getDimension(qa.b.f105275f);
            this.f13510g = resources.getDimension(qa.b.f105274e);
            G();
        }
    }

    void o(int i11, MotionEvent motionEvent, int i12) {
        RecyclerView.g0 g0VarV;
        int iF;
        if (this.f13506c != null || i11 != 2 || this.f13517n == 2 || !this.f13516m.q() || this.f13521r.getScrollState() == 1 || (g0VarV = v(motionEvent)) == null || (iF = (this.f13516m.f(this.f13521r, g0VarV) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) >> 8) == 0) {
            return;
        }
        float x11 = motionEvent.getX(i12);
        float y11 = motionEvent.getY(i12);
        float f11 = x11 - this.f13507d;
        float f12 = y11 - this.f13508e;
        float fAbs = Math.abs(f11);
        float fAbs2 = Math.abs(f12);
        int i13 = this.f13520q;
        if (fAbs >= i13 || fAbs2 >= i13) {
            if (fAbs > fAbs2) {
                if (f11 < BitmapDescriptorFactory.HUE_RED && (iF & 4) == 0) {
                    return;
                }
                if (f11 > BitmapDescriptorFactory.HUE_RED && (iF & 8) == 0) {
                    return;
                }
            } else {
                if (f12 < BitmapDescriptorFactory.HUE_RED && (iF & 1) == 0) {
                    return;
                }
                if (f12 > BitmapDescriptorFactory.HUE_RED && (iF & 2) == 0) {
                    return;
                }
            }
            this.f13512i = BitmapDescriptorFactory.HUE_RED;
            this.f13511h = BitmapDescriptorFactory.HUE_RED;
            this.f13515l = motionEvent.getPointerId(0);
            F(g0VarV, 1);
        }
    }

    void r(RecyclerView.g0 g0Var, boolean z11) {
        for (int size = this.f13519p.size() - 1; size >= 0; size--) {
            g gVar = this.f13519p.get(size);
            if (gVar.f13547e == g0Var) {
                gVar.f13554l |= z11;
                if (!gVar.f13555m) {
                    gVar.a();
                }
                this.f13519p.remove(size);
                return;
            }
        }
    }

    g s(MotionEvent motionEvent) {
        if (this.f13519p.isEmpty()) {
            return null;
        }
        View viewT = t(motionEvent);
        for (int size = this.f13519p.size() - 1; size >= 0; size--) {
            g gVar = this.f13519p.get(size);
            if (gVar.f13547e.itemView == viewT) {
                return gVar;
            }
        }
        return null;
    }

    View t(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        RecyclerView.g0 g0Var = this.f13506c;
        if (g0Var != null) {
            View view = g0Var.itemView;
            if (y(view, x11, y11, this.f13513j + this.f13511h, this.f13514k + this.f13512i)) {
                return view;
            }
        }
        for (int size = this.f13519p.size() - 1; size >= 0; size--) {
            g gVar = this.f13519p.get(size);
            View view2 = gVar.f13547e.itemView;
            if (y(view2, x11, y11, gVar.f13552j, gVar.f13553k)) {
                return view2;
            }
        }
        return this.f13521r.X(x11, y11);
    }

    boolean x() {
        int size = this.f13519p.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!this.f13519p.get(i11).f13555m) {
                return true;
            }
        }
        return false;
    }

    void z(RecyclerView.g0 g0Var) {
        if (!this.f13521r.isLayoutRequested() && this.f13517n == 2) {
            float fJ = this.f13516m.j(g0Var);
            int i11 = (int) (this.f13513j + this.f13511h);
            int i12 = (int) (this.f13514k + this.f13512i);
            if (Math.abs(i12 - g0Var.itemView.getTop()) >= g0Var.itemView.getHeight() * fJ || Math.abs(i11 - g0Var.itemView.getLeft()) >= g0Var.itemView.getWidth() * fJ) {
                List<RecyclerView.g0> listU = u(g0Var);
                if (listU.size() == 0) {
                    return;
                }
                RecyclerView.g0 g0VarB = this.f13516m.b(g0Var, listU, i11, i12);
                if (g0VarB == null) {
                    this.f13524u.clear();
                    this.f13525v.clear();
                    return;
                }
                int absoluteAdapterPosition = g0VarB.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = g0Var.getAbsoluteAdapterPosition();
                if (this.f13516m.y(this.f13521r, g0Var, g0VarB)) {
                    this.f13516m.z(this.f13521r, g0Var, absoluteAdapterPosition2, g0VarB, absoluteAdapterPosition, i11, i12);
                }
            }
        }
    }
}
