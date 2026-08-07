package androidx.media3.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p7.j0;
import p7.r0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public class c extends FrameLayout {
    private final Drawable A;
    private final Drawable B;
    private final float C;
    private final float D;
    private final String E;
    private final String F;
    private j0 G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private long U;
    private long[] V;
    private boolean[] W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f12782a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private long[] f12783a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<d> f12784b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean[] f12785b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f12786c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private long f12787c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f12788d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private long f12789d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final View f12790e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private long f12791e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f12792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View f12793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final View f12794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ImageView f12795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ImageView f12796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View f12797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final TextView f12798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final TextView f12799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g0 f12800n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final StringBuilder f12801o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Formatter f12802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final r0.b f12803q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final r0.d f12804r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Runnable f12805s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f12806t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Drawable f12807u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Drawable f12808v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Drawable f12809w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f12810x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f12811y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f12812z;

    private final class b implements j0.d, g0.a, View.OnClickListener {
        private b() {
        }

        @Override // p7.j0.d
        public void V(j0 j0Var, j0.c cVar) {
            if (cVar.b(4, 5)) {
                c.this.K();
            }
            if (cVar.b(4, 5, 7)) {
                c.this.L();
            }
            if (cVar.a(8)) {
                c.this.M();
            }
            if (cVar.a(9)) {
                c.this.N();
            }
            if (cVar.b(8, 9, 11, 0, 13)) {
                c.this.J();
            }
            if (cVar.b(11, 0)) {
                c.this.O();
            }
        }

        @Override // androidx.media3.ui.g0.a
        public void n(g0 g0Var, long j11) {
            c.this.L = true;
            if (c.this.f12799m != null) {
                c.this.f12799m.setText(q0.x0(c.this.f12801o, c.this.f12802p, j11));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j0 j0Var = c.this.G;
            if (j0Var == null) {
                return;
            }
            if (c.this.f12788d == view) {
                j0Var.K();
                return;
            }
            if (c.this.f12786c == view) {
                j0Var.F();
                return;
            }
            if (c.this.f12793g == view) {
                if (j0Var.g() != 4) {
                    j0Var.C();
                    return;
                }
                return;
            }
            if (c.this.f12794h == view) {
                j0Var.U();
                return;
            }
            if (c.this.f12790e == view) {
                q0.G0(j0Var);
                return;
            }
            if (c.this.f12792f == view) {
                q0.F0(j0Var);
            } else if (c.this.f12795i == view) {
                j0Var.i(s7.d0.a(j0Var.h(), c.this.O));
            } else if (c.this.f12796j == view) {
                j0Var.u(!j0Var.T());
            }
        }

        @Override // androidx.media3.ui.g0.a
        public void q(g0 g0Var, long j11) {
            if (c.this.f12799m != null) {
                c.this.f12799m.setText(q0.x0(c.this.f12801o, c.this.f12802p, j11));
            }
        }

        @Override // androidx.media3.ui.g0.a
        public void z(g0 g0Var, long j11, boolean z11) {
            c.this.L = false;
            if (z11 || c.this.G == null) {
                return;
            }
            c cVar = c.this;
            cVar.G(cVar.G, j11);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.c$c, reason: collision with other inner class name */
    public interface InterfaceC0212c {
    }

    public interface d {
        void n(int i11);
    }

    static {
        p7.d0.a("media3.ui");
    }

    public c(Context context) {
        this(context, null);
    }

    private void A() {
        removeCallbacks(this.f12806t);
        if (this.M <= 0) {
            this.U = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i11 = this.M;
        this.U = jUptimeMillis + ((long) i11);
        if (this.H) {
            postDelayed(this.f12806t, i11);
        }
    }

    @SuppressLint({"InlinedApi"})
    private static boolean B(int i11) {
        return i11 == 90 || i11 == 89 || i11 == 85 || i11 == 79 || i11 == 126 || i11 == 127 || i11 == 87 || i11 == 88;
    }

    private void D() {
        View view;
        View view2;
        boolean zB1 = q0.B1(this.G, this.J);
        if (zB1 && (view2 = this.f12790e) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (zB1 || (view = this.f12792f) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private void E() {
        View view;
        View view2;
        boolean zB1 = q0.B1(this.G, this.J);
        if (zB1 && (view2 = this.f12790e) != null) {
            view2.requestFocus();
        } else {
            if (zB1 || (view = this.f12792f) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private void F(j0 j0Var, int i11, long j11) {
        j0Var.M(i11, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(j0 j0Var, long j11) {
        int iR;
        r0 r0VarJ = j0Var.J();
        if (this.K && !r0VarJ.u()) {
            int iT = r0VarJ.t();
            iR = 0;
            while (true) {
                long jE = r0VarJ.r(iR, this.f12804r).e();
                if (j11 < jE) {
                    break;
                }
                if (iR == iT - 1) {
                    j11 = jE;
                    break;
                } else {
                    j11 -= jE;
                    iR++;
                }
            }
        } else {
            iR = j0Var.R();
        }
        F(j0Var, iR, j11);
        L();
    }

    private void H() {
        K();
        J();
        M();
        N();
        O();
    }

    private void I(boolean z11, boolean z12, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z12);
        view.setAlpha(z12 ? this.C : this.D);
        view.setVisibility(z11 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        boolean zC0;
        boolean zC1;
        boolean zC2;
        boolean zC3;
        boolean zC4;
        if (C() && this.H) {
            j0 j0Var = this.G;
            if (j0Var != null) {
                zC0 = j0Var.c0(5);
                zC2 = j0Var.c0(7);
                zC3 = j0Var.c0(11);
                zC4 = j0Var.c0(12);
                zC1 = j0Var.c0(9);
            } else {
                zC0 = false;
                zC1 = false;
                zC2 = false;
                zC3 = false;
                zC4 = false;
            }
            I(this.R, zC2, this.f12786c);
            I(this.P, zC3, this.f12794h);
            I(this.Q, zC4, this.f12793g);
            I(this.S, zC1, this.f12788d);
            g0 g0Var = this.f12800n;
            if (g0Var != null) {
                g0Var.setEnabled(zC0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        boolean z11;
        boolean z12;
        if (C() && this.H) {
            boolean zB1 = q0.B1(this.G, this.J);
            View view = this.f12790e;
            if (view != null) {
                z11 = !zB1 && view.isFocused();
                z12 = !zB1 && this.f12790e.isAccessibilityFocused();
                this.f12790e.setVisibility(zB1 ? 0 : 8);
            } else {
                z11 = false;
                z12 = false;
            }
            View view2 = this.f12792f;
            if (view2 != null) {
                z11 |= zB1 && view2.isFocused();
                z12 |= zB1 && this.f12792f.isAccessibilityFocused();
                this.f12792f.setVisibility(zB1 ? 8 : 0);
            }
            if (z11) {
                E();
            }
            if (z12) {
                D();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        long jQ;
        long jB;
        if (C() && this.H) {
            j0 j0Var = this.G;
            if (j0Var != null) {
                jQ = this.f12787c0 + j0Var.Q();
                jB = this.f12787c0 + j0Var.B();
            } else {
                jQ = 0;
                jB = 0;
            }
            boolean z11 = jQ != this.f12789d0;
            this.f12789d0 = jQ;
            this.f12791e0 = jB;
            TextView textView = this.f12799m;
            if (textView != null && !this.L && z11) {
                textView.setText(q0.x0(this.f12801o, this.f12802p, jQ));
            }
            g0 g0Var = this.f12800n;
            if (g0Var != null) {
                g0Var.setPosition(jQ);
                this.f12800n.setBufferedPosition(jB);
            }
            removeCallbacks(this.f12805s);
            int iG = j0Var == null ? 1 : j0Var.g();
            if (j0Var == null || !j0Var.isPlaying()) {
                if (iG == 4 || iG == 1) {
                    return;
                }
                postDelayed(this.f12805s, 1000L);
                return;
            }
            g0 g0Var2 = this.f12800n;
            long jMin = Math.min(g0Var2 != null ? g0Var2.getPreferredUpdateDelay() : 1000L, 1000 - (jQ % 1000));
            float f11 = j0Var.e().f101379a;
            postDelayed(this.f12805s, q0.s(f11 > BitmapDescriptorFactory.HUE_RED ? (long) (jMin / f11) : 1000L, this.N, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        ImageView imageView;
        if (C() && this.H && (imageView = this.f12795i) != null) {
            if (this.O == 0) {
                I(false, false, imageView);
                return;
            }
            j0 j0Var = this.G;
            if (j0Var == null) {
                I(true, false, imageView);
                this.f12795i.setImageDrawable(this.f12807u);
                this.f12795i.setContentDescription(this.f12810x);
                return;
            }
            I(true, true, imageView);
            int iH = j0Var.h();
            if (iH == 0) {
                this.f12795i.setImageDrawable(this.f12807u);
                this.f12795i.setContentDescription(this.f12810x);
            } else if (iH == 1) {
                this.f12795i.setImageDrawable(this.f12808v);
                this.f12795i.setContentDescription(this.f12811y);
            } else if (iH == 2) {
                this.f12795i.setImageDrawable(this.f12809w);
                this.f12795i.setContentDescription(this.f12812z);
            }
            this.f12795i.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        ImageView imageView;
        if (C() && this.H && (imageView = this.f12796j) != null) {
            j0 j0Var = this.G;
            if (!this.T) {
                I(false, false, imageView);
                return;
            }
            if (j0Var == null) {
                I(true, false, imageView);
                this.f12796j.setImageDrawable(this.B);
                this.f12796j.setContentDescription(this.F);
            } else {
                I(true, true, imageView);
                this.f12796j.setImageDrawable(j0Var.T() ? this.A : this.B);
                this.f12796j.setContentDescription(j0Var.T() ? this.E : this.F);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        int i11;
        r0.d dVar;
        long j11;
        j0 j0Var = this.G;
        if (j0Var == null) {
            return;
        }
        boolean z11 = true;
        this.K = this.I && w(j0Var.J(), this.f12804r);
        long j12 = 0;
        this.f12787c0 = 0L;
        r0 r0VarJ = j0Var.J();
        if (r0VarJ.u()) {
            i11 = 0;
        } else {
            int iR = j0Var.R();
            boolean z12 = this.K;
            int i12 = z12 ? 0 : iR;
            int iT = z12 ? r0VarJ.t() - 1 : iR;
            i11 = 0;
            long j13 = 0;
            while (i12 <= iT) {
                if (i12 == iR) {
                    this.f12787c0 = q0.O1(j13);
                }
                r0VarJ.r(i12, this.f12804r);
                r0.d dVar2 = this.f12804r;
                if (dVar2.f101493m == -9223372036854775807L) {
                    s7.a.h(this.K ^ z11);
                    break;
                }
                int i13 = dVar2.f101494n;
                while (true) {
                    dVar = this.f12804r;
                    if (i13 <= dVar.f101495o) {
                        r0VarJ.j(i13, this.f12803q);
                        int iQ = this.f12803q.q();
                        int iD = this.f12803q.d();
                        while (iQ < iD) {
                            long jG = this.f12803q.g(iQ);
                            if (jG == Long.MIN_VALUE) {
                                j11 = j12;
                                long j14 = this.f12803q.f101463d;
                                if (j14 != -9223372036854775807L) {
                                    jG = j14;
                                }
                                iQ++;
                                j12 = j11;
                            } else {
                                j11 = j12;
                            }
                            long jP = jG + this.f12803q.p();
                            if (jP >= j11) {
                                long[] jArr = this.V;
                                if (i11 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.V = Arrays.copyOf(jArr, length);
                                    this.W = Arrays.copyOf(this.W, length);
                                }
                                this.V[i11] = q0.O1(j13 + jP);
                                this.W[i11] = this.f12803q.r(iQ);
                                i11++;
                            }
                            iQ++;
                            j12 = j11;
                        }
                        i13++;
                    }
                }
                j13 += dVar.f101493m;
                i12++;
                j12 = j12;
                z11 = true;
            }
            j12 = j13;
        }
        long jO1 = q0.O1(j12);
        TextView textView = this.f12798l;
        if (textView != null) {
            textView.setText(q0.x0(this.f12801o, this.f12802p, jO1));
        }
        g0 g0Var = this.f12800n;
        if (g0Var != null) {
            g0Var.setDuration(jO1);
            int length2 = this.f12783a0.length;
            int i14 = i11 + length2;
            long[] jArr2 = this.V;
            if (i14 > jArr2.length) {
                this.V = Arrays.copyOf(jArr2, i14);
                this.W = Arrays.copyOf(this.W, i14);
            }
            System.arraycopy(this.f12783a0, 0, this.V, i11, length2);
            System.arraycopy(this.f12785b0, 0, this.W, i11, length2);
            this.f12800n.setAdGroupTimesMs(this.V, this.W, i14);
        }
        L();
    }

    private static boolean w(r0 r0Var, r0.d dVar) {
        if (r0Var.t() > 100) {
            return false;
        }
        int iT = r0Var.t();
        for (int i11 = 0; i11 < iT; i11++) {
            if (r0Var.r(i11, dVar).f101493m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    private static int y(TypedArray typedArray, int i11) {
        return typedArray.getInt(ia.z.f77344z, i11);
    }

    public boolean C() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return x(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f12806t);
        } else if (motionEvent.getAction() == 1) {
            A();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public j0 getPlayer() {
        return this.G;
    }

    public int getRepeatToggleModes() {
        return this.O;
    }

    public boolean getShowShuffleButton() {
        return this.T;
    }

    public int getShowTimeoutMs() {
        return this.M;
    }

    public boolean getShowVrButton() {
        View view = this.f12797k;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H = true;
        long j11 = this.U;
        if (j11 != -9223372036854775807L) {
            long jUptimeMillis = j11 - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                z();
            } else {
                postDelayed(this.f12806t, jUptimeMillis);
            }
        } else if (C()) {
            A();
        }
        H();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H = false;
        removeCallbacks(this.f12805s);
        removeCallbacks(this.f12806t);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.f12783a0 = new long[0];
            this.f12785b0 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) s7.a.f(zArr);
            s7.a.a(jArr.length == zArr2.length);
            this.f12783a0 = jArr;
            this.f12785b0 = zArr2;
        }
        O();
    }

    public void setPlayer(j0 j0Var) {
        s7.a.h(Looper.myLooper() == Looper.getMainLooper());
        s7.a.a(j0Var == null || j0Var.F0() == Looper.getMainLooper());
        j0 j0Var2 = this.G;
        if (j0Var2 == j0Var) {
            return;
        }
        if (j0Var2 != null) {
            j0Var2.e0(this.f12782a);
        }
        this.G = j0Var;
        if (j0Var != null) {
            j0Var.D0(this.f12782a);
        }
        H();
    }

    public void setProgressUpdateListener(InterfaceC0212c interfaceC0212c) {
    }

    public void setRepeatToggleModes(int i11) {
        this.O = i11;
        j0 j0Var = this.G;
        if (j0Var != null) {
            int iH = j0Var.h();
            if (i11 == 0 && iH != 0) {
                this.G.i(0);
            } else if (i11 == 1 && iH == 2) {
                this.G.i(1);
            } else if (i11 == 2 && iH == 1) {
                this.G.i(2);
            }
        }
        M();
    }

    public void setShowFastForwardButton(boolean z11) {
        this.Q = z11;
        J();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z11) {
        this.I = z11;
        O();
    }

    public void setShowNextButton(boolean z11) {
        this.S = z11;
        J();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z11) {
        this.J = z11;
        K();
    }

    public void setShowPreviousButton(boolean z11) {
        this.R = z11;
        J();
    }

    public void setShowRewindButton(boolean z11) {
        this.P = z11;
        J();
    }

    public void setShowShuffleButton(boolean z11) {
        this.T = z11;
        N();
    }

    public void setShowTimeoutMs(int i11) {
        this.M = i11;
        if (C()) {
            A();
        }
    }

    public void setShowVrButton(boolean z11) {
        View view = this.f12797k;
        if (view != null) {
            view.setVisibility(z11 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i11) {
        this.N = q0.r(i11, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f12797k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            I(getShowVrButton(), onClickListener != null, this.f12797k);
        }
    }

    public boolean x(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        j0 j0Var = this.G;
        if (j0Var == null || !B(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (j0Var.g() == 4) {
                return true;
            }
            j0Var.C();
            return true;
        }
        if (keyCode == 89) {
            j0Var.U();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            q0.H0(j0Var, this.J);
            return true;
        }
        if (keyCode == 87) {
            j0Var.K();
            return true;
        }
        if (keyCode == 88) {
            j0Var.F();
            return true;
        }
        if (keyCode == 126) {
            q0.G0(j0Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        q0.F0(j0Var);
        return true;
    }

    public void z() {
        if (C()) {
            setVisibility(8);
            Iterator<d> it = this.f12784b.iterator();
            while (it.hasNext()) {
                it.next().n(getVisibility());
            }
            removeCallbacks(this.f12805s);
            removeCallbacks(this.f12806t);
            this.U = -9223372036854775807L;
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, attributeSet);
    }

    public c(Context context, AttributeSet attributeSet, int i11, AttributeSet attributeSet2) {
        super(context, attributeSet, i11);
        int resourceId = ia.v.f77258a;
        this.J = true;
        this.M = 5000;
        this.O = 0;
        this.N = 200;
        this.U = -9223372036854775807L;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, ia.z.f77340x, i11, 0);
            try {
                this.M = typedArrayObtainStyledAttributes.getInt(ia.z.F, this.M);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(ia.z.f77342y, resourceId);
                this.O = y(typedArrayObtainStyledAttributes, this.O);
                this.P = typedArrayObtainStyledAttributes.getBoolean(ia.z.D, this.P);
                this.Q = typedArrayObtainStyledAttributes.getBoolean(ia.z.A, this.Q);
                this.R = typedArrayObtainStyledAttributes.getBoolean(ia.z.C, this.R);
                this.S = typedArrayObtainStyledAttributes.getBoolean(ia.z.B, this.S);
                this.T = typedArrayObtainStyledAttributes.getBoolean(ia.z.E, this.T);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(ia.z.G, this.N));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f12784b = new CopyOnWriteArrayList<>();
        this.f12803q = new r0.b();
        this.f12804r = new r0.d();
        StringBuilder sb2 = new StringBuilder();
        this.f12801o = sb2;
        this.f12802p = new Formatter(sb2, Locale.getDefault());
        this.V = new long[0];
        this.W = new boolean[0];
        this.f12783a0 = new long[0];
        this.f12785b0 = new boolean[0];
        b bVar = new b();
        this.f12782a = bVar;
        this.f12805s = new Runnable() { // from class: ia.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f77188a.L();
            }
        };
        this.f12806t = new Runnable() { // from class: ia.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f77189a.z();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        g0 g0Var = (g0) findViewById(ia.t.I);
        View viewFindViewById = findViewById(ia.t.J);
        if (g0Var != null) {
            this.f12800n = g0Var;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(ia.t.I);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f12800n = defaultTimeBar;
        } else {
            this.f12800n = null;
        }
        this.f12798l = (TextView) findViewById(ia.t.f77242m);
        this.f12799m = (TextView) findViewById(ia.t.G);
        g0 g0Var2 = this.f12800n;
        if (g0Var2 != null) {
            g0Var2.a(bVar);
        }
        View viewFindViewById2 = findViewById(ia.t.D);
        this.f12790e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(bVar);
        }
        View viewFindViewById3 = findViewById(ia.t.C);
        this.f12792f = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(bVar);
        }
        View viewFindViewById4 = findViewById(ia.t.H);
        this.f12786c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(bVar);
        }
        View viewFindViewById5 = findViewById(ia.t.f77254y);
        this.f12788d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(bVar);
        }
        View viewFindViewById6 = findViewById(ia.t.L);
        this.f12794h = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(bVar);
        }
        View viewFindViewById7 = findViewById(ia.t.f77246q);
        this.f12793g = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(bVar);
        }
        ImageView imageView = (ImageView) findViewById(ia.t.K);
        this.f12795i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(ia.t.O);
        this.f12796j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        View viewFindViewById8 = findViewById(ia.t.V);
        this.f12797k = viewFindViewById8;
        setShowVrButton(false);
        I(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.C = resources.getInteger(ia.u.f77257b) / 100.0f;
        this.D = resources.getInteger(ia.u.f77256a) / 100.0f;
        this.f12807u = q0.g0(context, resources, ia.r.f77207e);
        this.f12808v = q0.g0(context, resources, ia.r.f77208f);
        this.f12809w = q0.g0(context, resources, ia.r.f77206d);
        this.A = q0.g0(context, resources, ia.r.f77210h);
        this.B = q0.g0(context, resources, ia.r.f77209g);
        this.f12810x = resources.getString(ia.x.f77276j);
        this.f12811y = resources.getString(ia.x.f77277k);
        this.f12812z = resources.getString(ia.x.f77275i);
        this.E = resources.getString(ia.x.f77280n);
        this.F = resources.getString(ia.x.f77279m);
        this.f12789d0 = -9223372036854775807L;
        this.f12791e0 = -9223372036854775807L;
    }
}
