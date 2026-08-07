package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.y;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class p extends ConstraintLayout implements y {

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static boolean f6635d1;
    Interpolator A;
    protected boolean A0;
    Interpolator B;
    int B0;
    float C;
    int C0;
    private int D;
    int D0;
    int E;
    int E0;
    private int F;
    int F0;
    private int G;
    int G0;
    private int H;
    float H0;
    private boolean I;
    private b5.d I0;
    HashMap<View, m> J;
    private boolean J0;
    private long K;
    private h K0;
    private float L;
    private Runnable L0;
    float M;
    private int[] M0;
    float N;
    int N0;
    private long O;
    private boolean O0;
    float P;
    int P0;
    private boolean Q;
    HashMap<View, f5.e> Q0;
    boolean R;
    private int R0;
    boolean S;
    private int S0;
    private i T;
    private int T0;
    private float U;
    Rect U0;
    private float V;
    private boolean V0;
    int W;
    j W0;
    e X0;
    private boolean Y0;
    private RectF Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    d f6636a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private View f6637a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f6638b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private Matrix f6639b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private f5.b f6640c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    ArrayList<Integer> f6641c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private c f6642d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private androidx.constraintlayout.motion.widget.b f6643e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    boolean f6644f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    int f6645g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    int f6646h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    int f6647i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    int f6648j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    boolean f6649k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    float f6650l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    float f6651m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    long f6652n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    float f6653o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f6654p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private ArrayList<n> f6655q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private ArrayList<n> f6656r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private ArrayList<n> f6657s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private CopyOnWriteArrayList<i> f6658t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f6659u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private long f6660v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private float f6661w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f6662x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private float f6663y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    r f6664z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    boolean f6665z0;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f6666a;

        a(View view) {
            this.f6666a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6666a.setNestedScrollingEnabled(true);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.K0.a();
        }
    }

    class c extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f6669a = BitmapDescriptorFactory.HUE_RED;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f6670b = BitmapDescriptorFactory.HUE_RED;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f6671c;

        c() {
        }

        @Override // androidx.constraintlayout.motion.widget.o
        public float a() {
            return p.this.C;
        }

        public void b(float f11, float f12, float f13) {
            this.f6669a = f11;
            this.f6670b = f12;
            this.f6671c = f13;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12;
            float f13;
            float f14 = this.f6669a;
            if (f14 > BitmapDescriptorFactory.HUE_RED) {
                float f15 = this.f6671c;
                if (f14 / f15 < f11) {
                    f11 = f14 / f15;
                }
                p.this.C = f14 - (f15 * f11);
                f12 = (f14 * f11) - (((f15 * f11) * f11) / 2.0f);
                f13 = this.f6670b;
            } else {
                float f16 = this.f6671c;
                if ((-f14) / f16 < f11) {
                    f11 = (-f14) / f16;
                }
                p.this.C = (f16 * f11) + f14;
                f12 = (f14 * f11) + (((f16 * f11) * f11) / 2.0f);
                f13 = this.f6670b;
            }
            return f12 + f13;
        }
    }

    private class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float[] f6673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int[] f6674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float[] f6675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Path f6676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f6677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Paint f6678f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Paint f6679g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Paint f6680h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Paint f6681i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float[] f6682j;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        DashPathEffect f6688p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6689q;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6692t;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final int f6683k = -21965;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final int f6684l = -2067046;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final int f6685m = -13391360;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int f6686n = 1996488704;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final int f6687o = 10;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Rect f6690r = new Rect();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f6691s = false;

        d() {
            this.f6692t = 1;
            Paint paint = new Paint();
            this.f6677e = paint;
            paint.setAntiAlias(true);
            this.f6677e.setColor(-21965);
            this.f6677e.setStrokeWidth(2.0f);
            Paint paint2 = this.f6677e;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f6678f = paint3;
            paint3.setAntiAlias(true);
            this.f6678f.setColor(-2067046);
            this.f6678f.setStrokeWidth(2.0f);
            this.f6678f.setStyle(style);
            Paint paint4 = new Paint();
            this.f6679g = paint4;
            paint4.setAntiAlias(true);
            this.f6679g.setColor(-13391360);
            this.f6679g.setStrokeWidth(2.0f);
            this.f6679g.setStyle(style);
            Paint paint5 = new Paint();
            this.f6680h = paint5;
            paint5.setAntiAlias(true);
            this.f6680h.setColor(-13391360);
            this.f6680h.setTextSize(p.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f6682j = new float[8];
            Paint paint6 = new Paint();
            this.f6681i = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, BitmapDescriptorFactory.HUE_RED);
            this.f6688p = dashPathEffect;
            this.f6679g.setPathEffect(dashPathEffect);
            this.f6675c = new float[100];
            this.f6674b = new int[50];
            if (this.f6691s) {
                this.f6677e.setStrokeWidth(8.0f);
                this.f6681i.setStrokeWidth(8.0f);
                this.f6678f.setStrokeWidth(8.0f);
                this.f6692t = 4;
            }
        }

        private void c(Canvas canvas) {
            canvas.drawLines(this.f6673a, this.f6677e);
        }

        private void d(Canvas canvas) {
            boolean z11 = false;
            boolean z12 = false;
            for (int i11 = 0; i11 < this.f6689q; i11++) {
                int i12 = this.f6674b[i11];
                if (i12 == 1) {
                    z11 = true;
                }
                if (i12 == 0) {
                    z12 = true;
                }
            }
            if (z11) {
                g(canvas);
            }
            if (z12) {
                e(canvas);
            }
        }

        private void e(Canvas canvas) {
            float[] fArr = this.f6673a;
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[fArr.length - 2];
            float f14 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f11, f13), Math.max(f12, f14), Math.max(f11, f13), Math.max(f12, f14), this.f6679g);
            canvas.drawLine(Math.min(f11, f13), Math.min(f12, f14), Math.min(f11, f13), Math.max(f12, f14), this.f6679g);
        }

        private void f(Canvas canvas, float f11, float f12) {
            float[] fArr = this.f6673a;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[fArr.length - 2];
            float f16 = fArr[fArr.length - 1];
            float fMin = Math.min(f13, f15);
            float fMax = Math.max(f14, f16);
            float fMin2 = f11 - Math.min(f13, f15);
            float fMax2 = Math.max(f14, f16) - f12;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f15 - f13))) + 0.5d)) / 100.0f);
            l(str, this.f6680h);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.f6690r.width() / 2)) + fMin, f12 - 20.0f, this.f6680h);
            canvas.drawLine(f11, f12, Math.min(f13, f15), f12, this.f6679g);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f16 - f14))) + 0.5d)) / 100.0f);
            l(str2, this.f6680h);
            canvas.drawText(str2, f11 + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f6690r.height() / 2)), this.f6680h);
            canvas.drawLine(f11, f12, f11, Math.max(f14, f16), this.f6679g);
        }

        private void g(Canvas canvas) {
            float[] fArr = this.f6673a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f6679g);
        }

        private void h(Canvas canvas, float f11, float f12) {
            float[] fArr = this.f6673a;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[fArr.length - 2];
            float f16 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f13 - f15, f14 - f16);
            float f17 = f15 - f13;
            float f18 = f16 - f14;
            float f19 = (((f11 - f13) * f17) + ((f12 - f14) * f18)) / (fHypot * fHypot);
            float f21 = f13 + (f17 * f19);
            float f22 = f14 + (f19 * f18);
            Path path = new Path();
            path.moveTo(f11, f12);
            path.lineTo(f21, f22);
            float fHypot2 = (float) Math.hypot(f21 - f11, f22 - f12);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            l(str, this.f6680h);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f6690r.width() / 2), -20.0f, this.f6680h);
            canvas.drawLine(f11, f12, f21, f22, this.f6679g);
        }

        private void i(Canvas canvas, float f11, float f12, int i11, int i12) {
            String str = "" + (((int) (((double) (((f11 - (i11 / 2)) * 100.0f) / (p.this.getWidth() - i11))) + 0.5d)) / 100.0f);
            l(str, this.f6680h);
            canvas.drawText(str, ((f11 / 2.0f) - (this.f6690r.width() / 2)) + BitmapDescriptorFactory.HUE_RED, f12 - 20.0f, this.f6680h);
            canvas.drawLine(f11, f12, Math.min(BitmapDescriptorFactory.HUE_RED, 1.0f), f12, this.f6679g);
            String str2 = "" + (((int) (((double) (((f12 - (i12 / 2)) * 100.0f) / (p.this.getHeight() - i12))) + 0.5d)) / 100.0f);
            l(str2, this.f6680h);
            canvas.drawText(str2, 5.0f + f11, BitmapDescriptorFactory.HUE_RED - ((f12 / 2.0f) - (this.f6690r.height() / 2)), this.f6680h);
            canvas.drawLine(f11, f12, f11, Math.max(BitmapDescriptorFactory.HUE_RED, 1.0f), this.f6679g);
        }

        private void j(Canvas canvas, m mVar) {
            this.f6676d.reset();
            for (int i11 = 0; i11 <= 50; i11++) {
                mVar.e(i11 / 50, this.f6682j, 0);
                Path path = this.f6676d;
                float[] fArr = this.f6682j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f6676d;
                float[] fArr2 = this.f6682j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f6676d;
                float[] fArr3 = this.f6682j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f6676d;
                float[] fArr4 = this.f6682j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f6676d.close();
            }
            this.f6677e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f6676d, this.f6677e);
            canvas.translate(-2.0f, -2.0f);
            this.f6677e.setColor(-65536);
            canvas.drawPath(this.f6676d, this.f6677e);
        }

        private void k(Canvas canvas, int i11, int i12, m mVar) {
            int width;
            int height;
            View view = mVar.f6605b;
            if (view != null) {
                width = view.getWidth();
                height = mVar.f6605b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i13 = 1; i13 < i12 - 1; i13++) {
                if (i11 != 4 || this.f6674b[i13 - 1] != 0) {
                    float[] fArr = this.f6675c;
                    int i14 = i13 * 2;
                    float f11 = fArr[i14];
                    float f12 = fArr[i14 + 1];
                    this.f6676d.reset();
                    this.f6676d.moveTo(f11, f12 + 10.0f);
                    this.f6676d.lineTo(f11 + 10.0f, f12);
                    this.f6676d.lineTo(f11, f12 - 10.0f);
                    this.f6676d.lineTo(f11 - 10.0f, f12);
                    this.f6676d.close();
                    int i15 = i13 - 1;
                    mVar.q(i15);
                    if (i11 == 4) {
                        int i16 = this.f6674b[i15];
                        if (i16 == 1) {
                            h(canvas, f11 - BitmapDescriptorFactory.HUE_RED, f12 - BitmapDescriptorFactory.HUE_RED);
                        } else if (i16 == 0) {
                            f(canvas, f11 - BitmapDescriptorFactory.HUE_RED, f12 - BitmapDescriptorFactory.HUE_RED);
                        } else if (i16 == 2) {
                            i(canvas, f11 - BitmapDescriptorFactory.HUE_RED, f12 - BitmapDescriptorFactory.HUE_RED, width, height);
                        }
                        canvas.drawPath(this.f6676d, this.f6681i);
                    }
                    if (i11 == 2) {
                        h(canvas, f11 - BitmapDescriptorFactory.HUE_RED, f12 - BitmapDescriptorFactory.HUE_RED);
                    }
                    if (i11 == 3) {
                        f(canvas, f11 - BitmapDescriptorFactory.HUE_RED, f12 - BitmapDescriptorFactory.HUE_RED);
                    }
                    if (i11 == 6) {
                        i(canvas, f11 - BitmapDescriptorFactory.HUE_RED, f12 - BitmapDescriptorFactory.HUE_RED, width, height);
                    }
                    canvas.drawPath(this.f6676d, this.f6681i);
                }
            }
            float[] fArr2 = this.f6673a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f6678f);
                float[] fArr3 = this.f6673a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f6678f);
            }
        }

        public void a(Canvas canvas, HashMap<View, m> map, int i11, int i12) {
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!p.this.isInEditMode() && (i12 & 1) == 2) {
                String str = p.this.getContext().getResources().getResourceName(p.this.F) + ":" + p.this.getProgress();
                canvas.drawText(str, 10.0f, p.this.getHeight() - 30, this.f6680h);
                canvas.drawText(str, 11.0f, p.this.getHeight() - 29, this.f6677e);
            }
            for (m mVar : map.values()) {
                int iM = mVar.m();
                if (i12 > 0 && iM == 0) {
                    iM = 1;
                }
                if (iM != 0) {
                    this.f6689q = mVar.c(this.f6675c, this.f6674b);
                    if (iM >= 1) {
                        int i13 = i11 / 16;
                        float[] fArr = this.f6673a;
                        if (fArr == null || fArr.length != i13 * 2) {
                            this.f6673a = new float[i13 * 2];
                            this.f6676d = new Path();
                        }
                        int i14 = this.f6692t;
                        canvas.translate(i14, i14);
                        this.f6677e.setColor(1996488704);
                        this.f6681i.setColor(1996488704);
                        this.f6678f.setColor(1996488704);
                        this.f6679g.setColor(1996488704);
                        mVar.d(this.f6673a, i13);
                        b(canvas, iM, this.f6689q, mVar);
                        this.f6677e.setColor(-21965);
                        this.f6678f.setColor(-2067046);
                        this.f6681i.setColor(-2067046);
                        this.f6679g.setColor(-13391360);
                        int i15 = this.f6692t;
                        canvas.translate(-i15, -i15);
                        b(canvas, iM, this.f6689q, mVar);
                        if (iM == 5) {
                            j(canvas, mVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void b(Canvas canvas, int i11, int i12, m mVar) {
            if (i11 == 4) {
                d(canvas);
            }
            if (i11 == 2) {
                g(canvas);
            }
            if (i11 == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i11, i12, mVar);
        }

        void l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f6690r);
        }
    }

    class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        d5.f f6694a = new d5.f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d5.f f6695b = new d5.f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        androidx.constraintlayout.widget.d f6696c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        androidx.constraintlayout.widget.d f6697d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f6699f;

        e() {
        }

        private void b(int i11, int i12) {
            int optimizationLevel = p.this.getOptimizationLevel();
            p pVar = p.this;
            if (pVar.E == pVar.getStartState()) {
                p pVar2 = p.this;
                d5.f fVar = this.f6695b;
                androidx.constraintlayout.widget.d dVar = this.f6697d;
                pVar2.t(fVar, optimizationLevel, (dVar == null || dVar.f6983e == 0) ? i11 : i12, (dVar == null || dVar.f6983e == 0) ? i12 : i11);
                androidx.constraintlayout.widget.d dVar2 = this.f6696c;
                if (dVar2 != null) {
                    p pVar3 = p.this;
                    d5.f fVar2 = this.f6694a;
                    int i13 = dVar2.f6983e;
                    int i14 = i13 == 0 ? i11 : i12;
                    if (i13 == 0) {
                        i11 = i12;
                    }
                    pVar3.t(fVar2, optimizationLevel, i14, i11);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.d dVar3 = this.f6696c;
            if (dVar3 != null) {
                p pVar4 = p.this;
                d5.f fVar3 = this.f6694a;
                int i15 = dVar3.f6983e;
                pVar4.t(fVar3, optimizationLevel, i15 == 0 ? i11 : i12, i15 == 0 ? i12 : i11);
            }
            p pVar5 = p.this;
            d5.f fVar4 = this.f6695b;
            androidx.constraintlayout.widget.d dVar4 = this.f6697d;
            int i16 = (dVar4 == null || dVar4.f6983e == 0) ? i11 : i12;
            if (dVar4 == null || dVar4.f6983e == 0) {
                i11 = i12;
            }
            pVar5.t(fVar4, optimizationLevel, i16, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void j(d5.f fVar, androidx.constraintlayout.widget.d dVar) {
            SparseArray<d5.e> sparseArray = new SparseArray<>();
            androidx.constraintlayout.widget.e.a aVar = new androidx.constraintlayout.widget.e.a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, fVar);
            sparseArray.put(p.this.getId(), fVar);
            if (dVar != null && dVar.f6983e != 0) {
                p pVar = p.this;
                pVar.t(this.f6695b, pVar.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(p.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(p.this.getWidth(), 1073741824));
            }
            for (d5.e eVar : fVar.w1()) {
                eVar.E0(true);
                sparseArray.put(((View) eVar.u()).getId(), eVar);
            }
            for (d5.e eVar2 : fVar.w1()) {
                View view = (View) eVar2.u();
                dVar.l(view.getId(), aVar);
                eVar2.p1(dVar.J(view.getId()));
                eVar2.Q0(dVar.E(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.b) {
                    dVar.j((androidx.constraintlayout.widget.b) view, eVar2, aVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).w();
                    }
                }
                aVar.resolveLayoutDirection(p.this.getLayoutDirection());
                p.this.g(false, view, eVar2, aVar, sparseArray);
                if (dVar.I(view.getId()) == 1) {
                    eVar2.o1(view.getVisibility());
                } else {
                    eVar2.o1(dVar.H(view.getId()));
                }
            }
            for (d5.e eVar3 : fVar.w1()) {
                if (eVar3 instanceof d5.m) {
                    androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) eVar3.u();
                    d5.i iVar = (d5.i) eVar3;
                    bVar.v(fVar, iVar, sparseArray);
                    ((d5.m) iVar).z1();
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00df  */
        /* JADX WARN: Code duplicated, block: B:26:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:29:0x0105  */
        /* JADX WARN: Code duplicated, block: B:40:0x0133 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:42:0x0133 A[SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:29:0x0105, please report this as an issue */
        public void a() {
            String str;
            d5.e eVarD;
            int childCount = p.this.getChildCount();
            p.this.J.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = p.this.getChildAt(i11);
                m mVar = new m(childAt);
                int id2 = childAt.getId();
                iArr[i11] = id2;
                sparseArray.put(id2, mVar);
                p.this.J.put(childAt, mVar);
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = p.this.getChildAt(i12);
                m mVar2 = p.this.J.get(childAt2);
                if (mVar2 != null) {
                    if (this.f6696c != null) {
                        d5.e eVarD2 = d(this.f6694a, childAt2);
                        if (eVarD2 != null) {
                            mVar2.C(p.this.u0(eVarD2), this.f6696c, p.this.getWidth(), p.this.getHeight());
                        } else if (p.this.W != 0) {
                            Log.e("MotionLayout", androidx.constraintlayout.motion.widget.a.b() + "no widget for  " + androidx.constraintlayout.motion.widget.a.d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    } else {
                        if (p.this.O0) {
                            f5.e eVar = p.this.Q0.get(childAt2);
                            p pVar = p.this;
                            str = "MotionLayout";
                            mVar2.D(eVar, childAt2, pVar.P0, pVar.R0, p.this.S0);
                        }
                        if (this.f6697d == null) {
                            eVarD = d(this.f6695b, childAt2);
                            if (eVarD != null) {
                                mVar2.z(p.this.u0(eVarD), this.f6697d, p.this.getWidth(), p.this.getHeight());
                            } else if (p.this.W != 0) {
                                Log.e(str, androidx.constraintlayout.motion.widget.a.b() + "no widget for  " + androidx.constraintlayout.motion.widget.a.d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                            }
                        }
                    }
                    str = "MotionLayout";
                    if (this.f6697d == null) {
                        eVarD = d(this.f6695b, childAt2);
                        if (eVarD != null) {
                            mVar2.z(p.this.u0(eVarD), this.f6697d, p.this.getWidth(), p.this.getHeight());
                        } else if (p.this.W != 0) {
                            Log.e(str, androidx.constraintlayout.motion.widget.a.b() + "no widget for  " + androidx.constraintlayout.motion.widget.a.d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                m mVar3 = (m) sparseArray.get(iArr[i13]);
                int iH = mVar3.h();
                if (iH != -1) {
                    mVar3.G((m) sparseArray.get(iH));
                }
            }
        }

        void c(d5.f fVar, d5.f fVar2) {
            d5.e jVar;
            ArrayList<d5.e> arrayListW1 = fVar.w1();
            HashMap<d5.e, d5.e> map = new HashMap<>();
            map.put(fVar, fVar2);
            fVar2.w1().clear();
            fVar2.n(fVar, map);
            for (d5.e eVar : arrayListW1) {
                if (eVar instanceof d5.a) {
                    jVar = new d5.a();
                } else if (eVar instanceof d5.h) {
                    jVar = new d5.h();
                } else if (eVar instanceof d5.g) {
                    jVar = new d5.g();
                } else if (eVar instanceof d5.l) {
                    jVar = new d5.l();
                } else {
                    jVar = eVar instanceof d5.i ? new d5.j() : new d5.e();
                }
                fVar2.b(jVar);
                map.put(eVar, jVar);
            }
            for (d5.e eVar2 : arrayListW1) {
                map.get(eVar2).n(eVar2, map);
            }
        }

        d5.e d(d5.f fVar, View view) {
            if (fVar.u() == view) {
                return fVar;
            }
            ArrayList<d5.e> arrayListW1 = fVar.w1();
            int size = arrayListW1.size();
            for (int i11 = 0; i11 < size; i11++) {
                d5.e eVar = arrayListW1.get(i11);
                if (eVar.u() == view) {
                    return eVar;
                }
            }
            return null;
        }

        void e(d5.f fVar, androidx.constraintlayout.widget.d dVar, androidx.constraintlayout.widget.d dVar2) {
            this.f6696c = dVar;
            this.f6697d = dVar2;
            this.f6694a = new d5.f();
            this.f6695b = new d5.f();
            this.f6694a.b2(((ConstraintLayout) p.this).f6861c.O1());
            this.f6695b.b2(((ConstraintLayout) p.this).f6861c.O1());
            this.f6694a.z1();
            this.f6695b.z1();
            c(((ConstraintLayout) p.this).f6861c, this.f6694a);
            c(((ConstraintLayout) p.this).f6861c, this.f6695b);
            if (p.this.N > 0.5d) {
                if (dVar != null) {
                    j(this.f6694a, dVar);
                }
                j(this.f6695b, dVar2);
            } else {
                j(this.f6695b, dVar2);
                if (dVar != null) {
                    j(this.f6694a, dVar);
                }
            }
            this.f6694a.e2(p.this.p());
            this.f6694a.g2();
            this.f6695b.e2(p.this.p());
            this.f6695b.g2();
            ViewGroup.LayoutParams layoutParams = p.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    d5.f fVar2 = this.f6694a;
                    d5.e.b bVar = d5.e.b.WRAP_CONTENT;
                    fVar2.U0(bVar);
                    this.f6695b.U0(bVar);
                }
                if (layoutParams.height == -2) {
                    d5.f fVar3 = this.f6694a;
                    d5.e.b bVar2 = d5.e.b.WRAP_CONTENT;
                    fVar3.l1(bVar2);
                    this.f6695b.l1(bVar2);
                }
            }
        }

        public boolean f(int i11, int i12) {
            return (i11 == this.f6698e && i12 == this.f6699f) ? false : true;
        }

        public void g(int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            p pVar = p.this;
            pVar.F0 = mode;
            pVar.G0 = mode2;
            b(i11, i12);
            if (!(p.this.getParent() instanceof p) || mode != 1073741824 || mode2 != 1073741824) {
                b(i11, i12);
                p.this.B0 = this.f6694a.Y();
                p.this.C0 = this.f6694a.z();
                p.this.D0 = this.f6695b.Y();
                p.this.E0 = this.f6695b.z();
                p pVar2 = p.this;
                pVar2.A0 = (pVar2.B0 == pVar2.D0 && pVar2.C0 == pVar2.E0) ? false : true;
            }
            p pVar3 = p.this;
            int i13 = pVar3.B0;
            int i14 = pVar3.C0;
            int i15 = pVar3.F0;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                i13 = (int) (i13 + (pVar3.H0 * (pVar3.D0 - i13)));
            }
            int i16 = i13;
            int i17 = pVar3.G0;
            if (i17 == Integer.MIN_VALUE || i17 == 0) {
                i14 = (int) (i14 + (pVar3.H0 * (pVar3.E0 - i14)));
            }
            p.this.s(i11, i12, i16, i14, this.f6694a.W1() || this.f6695b.W1(), this.f6694a.U1() || this.f6695b.U1());
        }

        public void h() {
            g(p.this.G, p.this.H);
            p.this.t0();
        }

        public void i(int i11, int i12) {
            this.f6698e = i11;
            this.f6699f = i12;
        }
    }

    protected interface f {
        void a(MotionEvent motionEvent);

        float b();

        void c(int i11);

        float d();

        void recycle();
    }

    private static class g implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static g f6701b = new g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        VelocityTracker f6702a;

        private g() {
        }

        public static g e() {
            f6701b.f6702a = VelocityTracker.obtain();
            return f6701b;
        }

        @Override // androidx.constraintlayout.motion.widget.p.f
        public void a(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f6702a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.p.f
        public float b() {
            VelocityTracker velocityTracker = this.f6702a;
            return velocityTracker != null ? velocityTracker.getYVelocity() : BitmapDescriptorFactory.HUE_RED;
        }

        @Override // androidx.constraintlayout.motion.widget.p.f
        public void c(int i11) {
            VelocityTracker velocityTracker = this.f6702a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i11);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.p.f
        public float d() {
            VelocityTracker velocityTracker = this.f6702a;
            return velocityTracker != null ? velocityTracker.getXVelocity() : BitmapDescriptorFactory.HUE_RED;
        }

        @Override // androidx.constraintlayout.motion.widget.p.f
        public void recycle() {
            VelocityTracker velocityTracker = this.f6702a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f6702a = null;
            }
        }
    }

    class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f6703a = Float.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f6704b = Float.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6705c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f6706d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final String f6707e = "motion.progress";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f6708f = "motion.velocity";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final String f6709g = "motion.StartState";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final String f6710h = "motion.EndState";

        h() {
        }

        void a() {
            int i11 = this.f6705c;
            if (i11 != -1 || this.f6706d != -1) {
                if (i11 == -1) {
                    p.this.z0(this.f6706d);
                } else {
                    int i12 = this.f6706d;
                    if (i12 == -1) {
                        p.this.setState(i11, -1, -1);
                    } else {
                        p.this.setTransition(i11, i12);
                    }
                }
                p.this.setState(j.SETUP);
            }
            if (Float.isNaN(this.f6704b)) {
                if (Float.isNaN(this.f6703a)) {
                    return;
                }
                p.this.setProgress(this.f6703a);
            } else {
                p.this.setProgress(this.f6703a, this.f6704b);
                this.f6703a = Float.NaN;
                this.f6704b = Float.NaN;
                this.f6705c = -1;
                this.f6706d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f6703a);
            bundle.putFloat("motion.velocity", this.f6704b);
            bundle.putInt("motion.StartState", this.f6705c);
            bundle.putInt("motion.EndState", this.f6706d);
            return bundle;
        }

        public void c() {
            this.f6706d = p.this.F;
            this.f6705c = p.this.D;
            this.f6704b = p.this.getVelocity();
            this.f6703a = p.this.getProgress();
        }

        public void d(int i11) {
            this.f6706d = i11;
        }

        public void e(float f11) {
            this.f6703a = f11;
        }

        public void f(int i11) {
            this.f6705c = i11;
        }

        public void g(Bundle bundle) {
            this.f6703a = bundle.getFloat("motion.progress");
            this.f6704b = bundle.getFloat("motion.velocity");
            this.f6705c = bundle.getInt("motion.StartState");
            this.f6706d = bundle.getInt("motion.EndState");
        }

        public void h(float f11) {
            this.f6704b = f11;
        }
    }

    public interface i {
        void a(p pVar, int i11, int i12, float f11);

        void b(p pVar, int i11);

        void c(p pVar, int i11, int i12);

        void d(p pVar, int i11, boolean z11, float f11);
    }

    enum j {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public p(@NonNull Context context) {
        super(context);
        this.B = null;
        this.C = BitmapDescriptorFactory.HUE_RED;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = 0;
        this.H = 0;
        this.I = true;
        this.J = new HashMap<>();
        this.K = 0L;
        this.L = 1.0f;
        this.M = BitmapDescriptorFactory.HUE_RED;
        this.N = BitmapDescriptorFactory.HUE_RED;
        this.P = BitmapDescriptorFactory.HUE_RED;
        this.R = false;
        this.S = false;
        this.W = 0;
        this.f6638b0 = false;
        this.f6640c0 = new f5.b();
        this.f6642d0 = new c();
        this.f6644f0 = true;
        this.f6649k0 = false;
        this.f6654p0 = false;
        this.f6655q0 = null;
        this.f6656r0 = null;
        this.f6657s0 = null;
        this.f6658t0 = null;
        this.f6659u0 = 0;
        this.f6660v0 = -1L;
        this.f6661w0 = BitmapDescriptorFactory.HUE_RED;
        this.f6662x0 = 0;
        this.f6663y0 = BitmapDescriptorFactory.HUE_RED;
        this.f6665z0 = false;
        this.A0 = false;
        this.I0 = new b5.d();
        this.J0 = false;
        this.L0 = null;
        this.M0 = null;
        this.N0 = 0;
        this.O0 = false;
        this.P0 = 0;
        this.Q0 = new HashMap<>();
        this.U0 = new Rect();
        this.V0 = false;
        this.W0 = j.UNDEFINED;
        this.X0 = new e();
        this.Y0 = false;
        this.Z0 = new RectF();
        this.f6637a1 = null;
        this.f6639b1 = null;
        this.f6641c1 = new ArrayList<>();
        n0(null);
    }

    private static boolean F0(float f11, float f12, float f13) {
        if (f11 > BitmapDescriptorFactory.HUE_RED) {
            float f14 = f11 / f13;
            return f12 + ((f11 * f14) - (((f13 * f14) * f14) / 2.0f)) > 1.0f;
        }
        float f15 = (-f11) / f13;
        return f12 + ((f11 * f15) + (((f13 * f15) * f15) / 2.0f)) < BitmapDescriptorFactory.HUE_RED;
    }

    private boolean W(View view, MotionEvent motionEvent, float f11, float f12) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f11, f12);
            boolean zOnTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f11, -f12);
            return zOnTouchEvent;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(f11, f12);
        if (this.f6639b1 == null) {
            this.f6639b1 = new Matrix();
        }
        matrix.invert(this.f6639b1);
        motionEventObtain.transform(this.f6639b1);
        boolean zOnTouchEvent2 = view.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchEvent2;
    }

    private void X() {
        r rVar = this.f6664z;
        if (rVar == null) {
            Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int iE = rVar.E();
        r rVar2 = this.f6664z;
        Y(iE, rVar2.k(rVar2.E()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        for (r.b bVar : this.f6664z.n()) {
            if (bVar == this.f6664z.f6734c) {
                Log.v("MotionLayout", "CHECK: CURRENT");
            }
            Z(bVar);
            int iA = bVar.A();
            int iY = bVar.y();
            String strC = androidx.constraintlayout.motion.widget.a.c(getContext(), iA);
            String strC2 = androidx.constraintlayout.motion.widget.a.c(getContext(), iY);
            if (sparseIntArray.get(iA) == iY) {
                Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strC + "->" + strC2);
            }
            if (sparseIntArray2.get(iY) == iA) {
                Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strC + "->" + strC2);
            }
            sparseIntArray.put(iA, iY);
            sparseIntArray2.put(iY, iA);
            if (this.f6664z.k(iA) == null) {
                Log.e("MotionLayout", " no such constraintSetStart " + strC);
            }
            if (this.f6664z.k(iY) == null) {
                Log.e("MotionLayout", " no such constraintSetEnd " + strC);
            }
        }
    }

    private void Y(int i11, androidx.constraintlayout.widget.d dVar) {
        String strC = androidx.constraintlayout.motion.widget.a.c(getContext(), i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int id2 = childAt.getId();
            if (id2 == -1) {
                Log.w("MotionLayout", "CHECK: " + strC + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (dVar.D(id2) == null) {
                Log.w("MotionLayout", "CHECK: " + strC + " NO CONSTRAINTS for " + androidx.constraintlayout.motion.widget.a.d(childAt));
            }
        }
        int[] iArrF = dVar.F();
        for (int i13 = 0; i13 < iArrF.length; i13++) {
            int i14 = iArrF[i13];
            String strC2 = androidx.constraintlayout.motion.widget.a.c(getContext(), i14);
            if (findViewById(iArrF[i13]) == null) {
                Log.w("MotionLayout", "CHECK: " + strC + " NO View matches id " + strC2);
            }
            if (dVar.E(i14) == -1) {
                Log.w("MotionLayout", "CHECK: " + strC + "(" + strC2 + ") no LAYOUT_HEIGHT");
            }
            if (dVar.J(i14) == -1) {
                Log.w("MotionLayout", "CHECK: " + strC + "(" + strC2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    private void Z(r.b bVar) {
        if (bVar.A() == bVar.y()) {
            Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
        }
    }

    private void a0() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            m mVar = this.J.get(childAt);
            if (mVar != null) {
                mVar.B(childAt);
            }
        }
    }

    private void d0() {
        boolean z11;
        float fSignum = Math.signum(this.P - this.N);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.A;
        float interpolation = this.N + (!(interpolator instanceof f5.b) ? (((nanoTime - this.O) * fSignum) * 1.0E-9f) / this.L : 0.0f);
        if (this.Q) {
            interpolation = this.P;
        }
        if ((fSignum <= BitmapDescriptorFactory.HUE_RED || interpolation < this.P) && (fSignum > BitmapDescriptorFactory.HUE_RED || interpolation > this.P)) {
            z11 = false;
        } else {
            interpolation = this.P;
            z11 = true;
        }
        if (interpolator != null && !z11) {
            interpolation = this.f6638b0 ? interpolator.getInterpolation((nanoTime - this.K) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > BitmapDescriptorFactory.HUE_RED && interpolation >= this.P) || (fSignum <= BitmapDescriptorFactory.HUE_RED && interpolation <= this.P)) {
            interpolation = this.P;
        }
        this.H0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.B;
        if (interpolator2 != null) {
            interpolation = interpolator2.getInterpolation(interpolation);
        }
        float f11 = interpolation;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            m mVar = this.J.get(childAt);
            if (mVar != null) {
                mVar.u(childAt, f11, nanoTime2, this.I0);
            }
        }
        if (this.A0) {
            requestLayout();
        }
    }

    private void e0() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if ((this.T == null && ((copyOnWriteArrayList = this.f6658t0) == null || copyOnWriteArrayList.isEmpty())) || this.f6663y0 == this.M) {
            return;
        }
        if (this.f6662x0 != -1) {
            g0();
            this.f6665z0 = true;
        }
        this.f6662x0 = -1;
        float f11 = this.M;
        this.f6663y0 = f11;
        i iVar = this.T;
        if (iVar != null) {
            iVar.a(this, this.D, this.F, f11);
        }
        CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.f6658t0;
        if (copyOnWriteArrayList2 != null) {
            Iterator<i> it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.D, this.F, this.M);
            }
        }
        this.f6665z0 = true;
    }

    private void g0() {
        i iVar = this.T;
        if (iVar != null) {
            iVar.c(this, this.D, this.F);
        }
        CopyOnWriteArrayList<i> copyOnWriteArrayList = this.f6658t0;
        if (copyOnWriteArrayList != null) {
            Iterator<i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().c(this, this.D, this.F);
            }
        }
    }

    private boolean m0(float f11, float f12, View view, MotionEvent motionEvent) {
        boolean z11;
        if (!(view instanceof ViewGroup)) {
            z11 = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z11 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (m0((childAt.getLeft() + f11) - view.getScrollX(), (childAt.getTop() + f12) - view.getScrollY(), childAt, motionEvent)) {
                z11 = true;
                break;
            }
            childCount--;
        }
        if (!z11) {
            this.Z0.set(f11, f12, (view.getRight() + f11) - view.getLeft(), (view.getBottom() + f12) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.Z0.contains(motionEvent.getX(), motionEvent.getY())) && W(view, motionEvent, -f11, -f12)) {
                return true;
            }
        }
        return z11;
    }

    private void n0(AttributeSet attributeSet) {
        r rVar;
        f6635d1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f7238m8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z11 = true;
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == androidx.constraintlayout.widget.i.f7271p8) {
                    this.f6664z = new r(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == androidx.constraintlayout.widget.i.f7260o8) {
                    this.E = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == androidx.constraintlayout.widget.i.f7293r8) {
                    this.P = typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED);
                    this.R = true;
                } else if (index == androidx.constraintlayout.widget.i.f7249n8) {
                    z11 = typedArrayObtainStyledAttributes.getBoolean(index, z11);
                } else if (index == androidx.constraintlayout.widget.i.f7304s8) {
                    if (this.W == 0) {
                        this.W = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == androidx.constraintlayout.widget.i.f7282q8) {
                    this.W = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f6664z == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z11) {
                this.f6664z = null;
            }
        }
        if (this.W != 0) {
            X();
        }
        if (this.E != -1 || (rVar = this.f6664z) == null) {
            return;
        }
        this.E = rVar.E();
        this.D = this.f6664z.E();
        this.F = this.f6664z.p();
    }

    private void r0() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if (this.T == null && ((copyOnWriteArrayList = this.f6658t0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.f6665z0 = false;
        for (Integer num : this.f6641c1) {
            i iVar = this.T;
            if (iVar != null) {
                iVar.b(this, num.intValue());
            }
            CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.f6658t0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<i> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().b(this, num.intValue());
                }
            }
        }
        this.f6641c1.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        int childCount = getChildCount();
        this.X0.a();
        this.R = true;
        SparseArray sparseArray = new SparseArray();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            sparseArray.put(childAt.getId(), this.J.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int i13 = this.f6664z.i();
        if (i13 != -1) {
            for (int i14 = 0; i14 < childCount; i14++) {
                m mVar = this.J.get(getChildAt(i14));
                if (mVar != null) {
                    mVar.A(i13);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.J.size()];
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            m mVar2 = this.J.get(getChildAt(i16));
            if (mVar2.h() != -1) {
                sparseBooleanArray.put(mVar2.h(), true);
                iArr[i15] = mVar2.h();
                i15++;
            }
        }
        if (this.f6657s0 != null) {
            for (int i17 = 0; i17 < i15; i17++) {
                m mVar3 = this.J.get(findViewById(iArr[i17]));
                if (mVar3 != null) {
                    this.f6664z.s(mVar3);
                }
            }
            Iterator<n> it = this.f6657s0.iterator();
            while (it.hasNext()) {
                it.next().D(this, this.J);
            }
            for (int i18 = 0; i18 < i15; i18++) {
                m mVar4 = this.J.get(findViewById(iArr[i18]));
                if (mVar4 != null) {
                    mVar4.F(width, height, this.L, getNanoTime());
                }
            }
        } else {
            for (int i19 = 0; i19 < i15; i19++) {
                m mVar5 = this.J.get(findViewById(iArr[i19]));
                if (mVar5 != null) {
                    this.f6664z.s(mVar5);
                    mVar5.F(width, height, this.L, getNanoTime());
                }
            }
        }
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            m mVar6 = this.J.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && mVar6 != null) {
                this.f6664z.s(mVar6);
                mVar6.F(width, height, this.L, getNanoTime());
            }
        }
        float fD = this.f6664z.D();
        if (fD != BitmapDescriptorFactory.HUE_RED) {
            boolean z11 = ((double) fD) < 0.0d;
            float fAbs = Math.abs(fD);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i22 = 0; i22 < childCount; i22++) {
                m mVar7 = this.J.get(getChildAt(i22));
                if (!Float.isNaN(mVar7.f6616m)) {
                    for (int i23 = 0; i23 < childCount; i23++) {
                        m mVar8 = this.J.get(getChildAt(i23));
                        if (!Float.isNaN(mVar8.f6616m)) {
                            fMin = Math.min(fMin, mVar8.f6616m);
                            fMax = Math.max(fMax, mVar8.f6616m);
                        }
                    }
                    while (i11 < childCount) {
                        m mVar9 = this.J.get(getChildAt(i11));
                        if (!Float.isNaN(mVar9.f6616m)) {
                            mVar9.f6618o = 1.0f / (1.0f - fAbs);
                            if (z11) {
                                mVar9.f6617n = fAbs - (((fMax - mVar9.f6616m) / (fMax - fMin)) * fAbs);
                            } else {
                                mVar9.f6617n = fAbs - (((mVar9.f6616m - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i11++;
                    }
                    return;
                }
                float fN = mVar7.n();
                float fO = mVar7.o();
                float f11 = z11 ? fO - fN : fO + fN;
                fMin2 = Math.min(fMin2, f11);
                fMax2 = Math.max(fMax2, f11);
            }
            while (i11 < childCount) {
                m mVar10 = this.J.get(getChildAt(i11));
                float fN2 = mVar10.n();
                float fO2 = mVar10.o();
                float f12 = z11 ? fO2 - fN2 : fO2 + fN2;
                mVar10.f6618o = 1.0f / (1.0f - fAbs);
                mVar10.f6617n = fAbs - (((f12 - fMin2) * fAbs) / (fMax2 - fMin2));
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect u0(d5.e eVar) {
        this.U0.top = eVar.a0();
        this.U0.left = eVar.Z();
        Rect rect = this.U0;
        int iY = eVar.Y();
        Rect rect2 = this.U0;
        rect.right = iY + rect2.left;
        int iZ = eVar.z();
        Rect rect3 = this.U0;
        rect2.bottom = iZ + rect3.top;
        return rect3;
    }

    public void A0(int i11, int i12, int i13) {
        B0(i11, i12, i13, -1);
    }

    public void B0(int i11, int i12, int i13, int i14) {
        androidx.constraintlayout.widget.k kVar;
        int iA;
        r rVar = this.f6664z;
        if (rVar != null && (kVar = rVar.f6733b) != null && (iA = kVar.a(this.E, i11, i12, i13)) != -1) {
            i11 = iA;
        }
        int i15 = this.E;
        if (i15 == i11) {
            return;
        }
        if (this.D == i11) {
            V(BitmapDescriptorFactory.HUE_RED);
            if (i14 > 0) {
                this.L = i14 / 1000.0f;
                return;
            }
            return;
        }
        if (this.F == i11) {
            V(1.0f);
            if (i14 > 0) {
                this.L = i14 / 1000.0f;
                return;
            }
            return;
        }
        this.F = i11;
        if (i15 != -1) {
            setTransition(i15, i11);
            V(1.0f);
            this.N = BitmapDescriptorFactory.HUE_RED;
            w0();
            if (i14 > 0) {
                this.L = i14 / 1000.0f;
                return;
            }
            return;
        }
        this.f6638b0 = false;
        this.P = 1.0f;
        this.M = BitmapDescriptorFactory.HUE_RED;
        this.N = BitmapDescriptorFactory.HUE_RED;
        this.O = getNanoTime();
        this.K = getNanoTime();
        this.Q = false;
        this.A = null;
        if (i14 == -1) {
            this.L = this.f6664z.o() / 1000.0f;
        }
        this.D = -1;
        this.f6664z.W(-1, this.F);
        SparseArray sparseArray = new SparseArray();
        if (i14 == 0) {
            this.L = this.f6664z.o() / 1000.0f;
        } else if (i14 > 0) {
            this.L = i14 / 1000.0f;
        }
        int childCount = getChildCount();
        this.J.clear();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            this.J.put(childAt, new m(childAt));
            sparseArray.put(childAt.getId(), this.J.get(childAt));
        }
        this.R = true;
        this.X0.e(this.f6861c, null, this.f6664z.k(i11));
        s0();
        this.X0.a();
        a0();
        int width = getWidth();
        int height = getHeight();
        if (this.f6657s0 != null) {
            for (int i17 = 0; i17 < childCount; i17++) {
                m mVar = this.J.get(getChildAt(i17));
                if (mVar != null) {
                    this.f6664z.s(mVar);
                }
            }
            Iterator<n> it = this.f6657s0.iterator();
            while (it.hasNext()) {
                it.next().D(this, this.J);
            }
            for (int i18 = 0; i18 < childCount; i18++) {
                m mVar2 = this.J.get(getChildAt(i18));
                if (mVar2 != null) {
                    mVar2.F(width, height, this.L, getNanoTime());
                }
            }
        } else {
            for (int i19 = 0; i19 < childCount; i19++) {
                m mVar3 = this.J.get(getChildAt(i19));
                if (mVar3 != null) {
                    this.f6664z.s(mVar3);
                    mVar3.F(width, height, this.L, getNanoTime());
                }
            }
        }
        float fD = this.f6664z.D();
        if (fD != BitmapDescriptorFactory.HUE_RED) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i21 = 0; i21 < childCount; i21++) {
                m mVar4 = this.J.get(getChildAt(i21));
                float fO = mVar4.o() + mVar4.n();
                fMin = Math.min(fMin, fO);
                fMax = Math.max(fMax, fO);
            }
            for (int i22 = 0; i22 < childCount; i22++) {
                m mVar5 = this.J.get(getChildAt(i22));
                float fN = mVar5.n();
                float fO2 = mVar5.o();
                mVar5.f6618o = 1.0f / (1.0f - fD);
                mVar5.f6617n = fD - ((((fN + fO2) - fMin) * fD) / (fMax - fMin));
            }
        }
        this.M = BitmapDescriptorFactory.HUE_RED;
        this.N = BitmapDescriptorFactory.HUE_RED;
        this.R = true;
        invalidate();
    }

    public void C0() {
        this.X0.e(this.f6861c, this.f6664z.k(this.D), this.f6664z.k(this.F));
        s0();
    }

    public void D0(int i11, androidx.constraintlayout.widget.d dVar) {
        r rVar = this.f6664z;
        if (rVar != null) {
            rVar.T(i11, dVar);
        }
        C0();
        if (this.E == i11) {
            dVar.i(this);
        }
    }

    public void E0(int i11, View... viewArr) {
        r rVar = this.f6664z;
        if (rVar != null) {
            rVar.b0(i11, viewArr);
        } else {
            Log.e("MotionLayout", " no motionScene");
        }
    }

    void V(float f11) {
        r rVar = this.f6664z;
        if (rVar == null) {
            return;
        }
        float f12 = this.N;
        float f13 = this.M;
        if (f12 != f13 && this.Q) {
            this.N = f13;
        }
        float f14 = this.N;
        if (f14 == f11) {
            return;
        }
        this.f6638b0 = false;
        this.P = f11;
        this.L = rVar.o() / 1000.0f;
        setProgress(this.P);
        this.A = null;
        this.B = this.f6664z.r();
        this.Q = false;
        this.K = getNanoTime();
        this.R = true;
        this.M = f14;
        this.N = f14;
        invalidate();
    }

    void b0(boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            m mVar = this.J.get(getChildAt(i11));
            if (mVar != null) {
                mVar.f(z11);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:129:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:143:0x0219  */
    /* JADX WARN: Code duplicated, block: B:180:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[PHI: r3
      0x00e2: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00ae, B:58:0x00d6, B:60:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0118  */
    /* JADX WARN: Code duplicated, block: B:86:0x0136  */
    /* JADX WARN: Code duplicated, block: B:89:0x014d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0150  */
    /* JADX WARN: Code duplicated, block: B:93:0x015a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0171  */
    /* JADX WARN: Code duplicated, block: B:98:0x0180  */
    void c0(boolean z11) {
        boolean z12;
        char c11;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i11;
        int i12;
        int i13;
        int i14;
        View childAt;
        m mVar;
        boolean z13;
        if (this.O == -1) {
            this.O = getNanoTime();
        }
        float f11 = this.N;
        if (f11 > BitmapDescriptorFactory.HUE_RED && f11 < 1.0f) {
            this.E = -1;
        }
        boolean z14 = false;
        if (this.f6654p0 || (this.R && (z11 || this.P != f11))) {
            float fSignum = Math.signum(this.P - f11);
            long nanoTime2 = getNanoTime();
            Interpolator interpolator3 = this.A;
            float f12 = !(interpolator3 instanceof o) ? (((nanoTime2 - this.O) * fSignum) * 1.0E-9f) / this.L : 0.0f;
            float f13 = this.N + f12;
            if (this.Q) {
                f13 = this.P;
            }
            if ((fSignum <= BitmapDescriptorFactory.HUE_RED || f13 < this.P) && (fSignum > BitmapDescriptorFactory.HUE_RED || f13 > this.P)) {
                z12 = false;
            } else {
                f13 = this.P;
                this.R = false;
                z12 = true;
            }
            this.N = f13;
            this.M = f13;
            this.O = nanoTime2;
            if (interpolator3 == null || z12) {
                this.C = f12;
            } else {
                if (this.f6638b0) {
                    float interpolation2 = interpolator3.getInterpolation((nanoTime2 - this.K) * 1.0E-9f);
                    Interpolator interpolator4 = this.A;
                    f5.b bVar = this.f6640c0;
                    c11 = interpolator4 == bVar ? bVar.c() ? (char) 2 : (char) 1 : (char) 0;
                    this.N = interpolation2;
                    this.O = nanoTime2;
                    Interpolator interpolator5 = this.A;
                    if (interpolator5 instanceof o) {
                        float fA = ((o) interpolator5).a();
                        this.C = fA;
                        if (Math.abs(fA) * this.L <= 1.0E-5f && c11 == 2) {
                            this.R = false;
                        }
                        if (fA > BitmapDescriptorFactory.HUE_RED && interpolation2 >= 1.0f) {
                            this.N = 1.0f;
                            this.R = false;
                            interpolation2 = 1.0f;
                        }
                        if (fA >= BitmapDescriptorFactory.HUE_RED || interpolation2 > BitmapDescriptorFactory.HUE_RED) {
                            f13 = interpolation2;
                        } else {
                            this.N = BitmapDescriptorFactory.HUE_RED;
                            this.R = false;
                            f13 = 0.0f;
                        }
                    } else {
                        f13 = interpolation2;
                    }
                } else {
                    float interpolation3 = interpolator3.getInterpolation(f13);
                    Interpolator interpolator6 = this.A;
                    if (interpolator6 instanceof o) {
                        this.C = ((o) interpolator6).a();
                    } else {
                        this.C = ((interpolator6.getInterpolation(f13 + f12) - interpolation3) * fSignum) / f12;
                    }
                    f13 = interpolation3;
                }
                if (Math.abs(this.C) > 1.0E-5f) {
                    setState(j.MOVING);
                }
                if (c11 != 1) {
                    if ((fSignum <= BitmapDescriptorFactory.HUE_RED && f13 >= this.P) || (fSignum <= BitmapDescriptorFactory.HUE_RED && f13 <= this.P)) {
                        f13 = this.P;
                        this.R = false;
                    }
                    if (f13 < 1.0f || f13 <= BitmapDescriptorFactory.HUE_RED) {
                        this.R = false;
                        setState(j.FINISHED);
                    }
                }
                childCount = getChildCount();
                this.f6654p0 = false;
                nanoTime = getNanoTime();
                this.H0 = f13;
                interpolator = this.B;
                if (interpolator == null) {
                    interpolation = f13;
                } else {
                    interpolation = interpolator.getInterpolation(f13);
                }
                interpolator2 = this.B;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.L) + f13);
                    this.C = interpolation4;
                    this.C = interpolation4 - this.B.getInterpolation(f13);
                }
                for (i11 = 0; i11 < childCount; i11++) {
                    childAt = getChildAt(i11);
                    mVar = this.J.get(childAt);
                    if (mVar != null) {
                        this.f6654p0 |= mVar.u(childAt, interpolation, nanoTime, this.I0);
                    }
                }
                boolean z15 = (fSignum <= BitmapDescriptorFactory.HUE_RED && f13 >= this.P) || (fSignum <= BitmapDescriptorFactory.HUE_RED && f13 <= this.P);
                if (!this.f6654p0 && !this.R && z15) {
                    setState(j.FINISHED);
                }
                if (this.A0) {
                    requestLayout();
                }
                this.f6654p0 = (!z15) | this.f6654p0;
                if (f13 <= BitmapDescriptorFactory.HUE_RED && (i14 = this.D) != -1 && this.E != i14) {
                    this.E = i14;
                    this.f6664z.k(i14).g(this);
                    setState(j.FINISHED);
                    z14 = true;
                }
                if (f13 >= 1.0d) {
                    i12 = this.E;
                    i13 = this.F;
                    if (i12 != i13) {
                        this.E = i13;
                        this.f6664z.k(i13).g(this);
                        setState(j.FINISHED);
                        z14 = true;
                    }
                }
                if (!this.f6654p0 || this.R) {
                    invalidate();
                } else if ((fSignum > BitmapDescriptorFactory.HUE_RED && f13 == 1.0f) || (fSignum < BitmapDescriptorFactory.HUE_RED && f13 == BitmapDescriptorFactory.HUE_RED)) {
                    setState(j.FINISHED);
                }
                if (!this.f6654p0 && !this.R && ((fSignum > BitmapDescriptorFactory.HUE_RED && f13 == 1.0f) || (fSignum < BitmapDescriptorFactory.HUE_RED && f13 == BitmapDescriptorFactory.HUE_RED))) {
                    q0();
                }
            }
            c11 = 0;
            if (Math.abs(this.C) > 1.0E-5f) {
                setState(j.MOVING);
            }
            if (c11 != 1) {
                if (fSignum <= BitmapDescriptorFactory.HUE_RED) {
                    f13 = this.P;
                    this.R = false;
                } else {
                    f13 = this.P;
                    this.R = false;
                }
                if (f13 < 1.0f) {
                    this.R = false;
                    setState(j.FINISHED);
                } else {
                    this.R = false;
                    setState(j.FINISHED);
                }
            }
            childCount = getChildCount();
            this.f6654p0 = false;
            nanoTime = getNanoTime();
            this.H0 = f13;
            interpolator = this.B;
            if (interpolator == null) {
                interpolation = f13;
            } else {
                interpolation = interpolator.getInterpolation(f13);
            }
            interpolator2 = this.B;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.L) + f13);
                this.C = interpolation5;
                this.C = interpolation5 - this.B.getInterpolation(f13);
            }
            while (i11 < childCount) {
                childAt = getChildAt(i11);
                mVar = this.J.get(childAt);
                if (mVar != null) {
                    this.f6654p0 |= mVar.u(childAt, interpolation, nanoTime, this.I0);
                }
            }
            if (fSignum <= BitmapDescriptorFactory.HUE_RED) {
            }
            if (!this.f6654p0) {
                setState(j.FINISHED);
            }
            if (this.A0) {
                requestLayout();
            }
            this.f6654p0 = (!z15) | this.f6654p0;
            if (f13 <= BitmapDescriptorFactory.HUE_RED) {
                this.E = i14;
                this.f6664z.k(i14).g(this);
                setState(j.FINISHED);
                z14 = true;
            }
            if (f13 >= 1.0d) {
                i12 = this.E;
                i13 = this.F;
                if (i12 != i13) {
                    this.E = i13;
                    this.f6664z.k(i13).g(this);
                    setState(j.FINISHED);
                    z14 = true;
                }
            }
            if (this.f6654p0) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.f6654p0) {
                q0();
            }
        }
        float f14 = this.N;
        if (f14 < 1.0f) {
            if (f14 <= BitmapDescriptorFactory.HUE_RED) {
                int i15 = this.E;
                int i16 = this.D;
                z13 = i15 == i16 ? z14 : true;
                this.E = i16;
            }
            this.Y0 |= z14;
            if (z14 && !this.J0) {
                requestLayout();
            }
            this.M = this.N;
        }
        int i17 = this.E;
        int i18 = this.F;
        z13 = i17 == i18 ? z14 : true;
        this.E = i18;
        z14 = z13;
        this.Y0 |= z14;
        if (z14) {
            requestLayout();
        }
        this.M = this.N;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        v vVar;
        ArrayList<n> arrayList = this.f6657s0;
        if (arrayList != null) {
            Iterator<n> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().C(canvas);
            }
        }
        c0(false);
        r rVar = this.f6664z;
        if (rVar != null && (vVar = rVar.f6749r) != null) {
            vVar.c();
        }
        super.dispatchDraw(canvas);
        if (this.f6664z == null) {
            return;
        }
        if ((this.W & 1) == 1 && !isInEditMode()) {
            this.f6659u0++;
            long nanoTime = getNanoTime();
            long j11 = this.f6660v0;
            if (j11 != -1) {
                long j12 = nanoTime - j11;
                if (j12 > 200000000) {
                    this.f6661w0 = ((int) ((this.f6659u0 / (j12 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f6659u0 = 0;
                    this.f6660v0 = nanoTime;
                }
            } else {
                this.f6660v0 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            String str = this.f6661w0 + " fps " + androidx.constraintlayout.motion.widget.a.e(this, this.D) + " -> ";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(androidx.constraintlayout.motion.widget.a.e(this, this.F));
            sb2.append(" (progress: ");
            sb2.append(progress);
            sb2.append(" ) state=");
            int i11 = this.E;
            sb2.append(i11 == -1 ? "undefined" : androidx.constraintlayout.motion.widget.a.e(this, i11));
            String string = sb2.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.W > 1) {
            if (this.f6636a0 == null) {
                this.f6636a0 = new d();
            }
            this.f6636a0.a(canvas, this.J, this.f6664z.o(), this.W);
        }
        ArrayList<n> arrayList2 = this.f6657s0;
        if (arrayList2 != null) {
            Iterator<n> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().B(canvas);
            }
        }
    }

    protected void f0() {
        int iIntValue;
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if ((this.T != null || ((copyOnWriteArrayList = this.f6658t0) != null && !copyOnWriteArrayList.isEmpty())) && this.f6662x0 == -1) {
            this.f6662x0 = this.E;
            if (this.f6641c1.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList<Integer> arrayList = this.f6641c1;
                iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i11 = this.E;
            if (iIntValue != i11 && i11 != -1) {
                this.f6641c1.add(Integer.valueOf(i11));
            }
        }
        r0();
        Runnable runnable = this.L0;
        if (runnable != null) {
            runnable.run();
            this.L0 = null;
        }
        int[] iArr = this.M0;
        if (iArr == null || this.N0 <= 0) {
            return;
        }
        z0(iArr[0]);
        int[] iArr2 = this.M0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.N0--;
    }

    public int[] getConstraintSetIds() {
        r rVar = this.f6664z;
        if (rVar == null) {
            return null;
        }
        return rVar.m();
    }

    public int getCurrentState() {
        return this.E;
    }

    public ArrayList<r.b> getDefinedTransitions() {
        r rVar = this.f6664z;
        if (rVar == null) {
            return null;
        }
        return rVar.n();
    }

    public androidx.constraintlayout.motion.widget.b getDesignTool() {
        if (this.f6643e0 == null) {
            this.f6643e0 = new androidx.constraintlayout.motion.widget.b(this);
        }
        return this.f6643e0;
    }

    public int getEndState() {
        return this.F;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.N;
    }

    public r getScene() {
        return this.f6664z;
    }

    public int getStartState() {
        return this.D;
    }

    public float getTargetPosition() {
        return this.P;
    }

    public Bundle getTransitionState() {
        if (this.K0 == null) {
            this.K0 = new h();
        }
        this.K0.c();
        return this.K0.b();
    }

    public long getTransitionTimeMs() {
        r rVar = this.f6664z;
        if (rVar != null) {
            this.L = rVar.o() / 1000.0f;
        }
        return (long) (this.L * 1000.0f);
    }

    public float getVelocity() {
        return this.C;
    }

    public void h0(int i11, boolean z11, float f11) {
        i iVar = this.T;
        if (iVar != null) {
            iVar.d(this, i11, z11, f11);
        }
        CopyOnWriteArrayList<i> copyOnWriteArrayList = this.f6658t0;
        if (copyOnWriteArrayList != null) {
            Iterator<i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().d(this, i11, z11, f11);
            }
        }
    }

    void i0(int i11, float f11, float f12, float f13, float[] fArr) {
        String resourceName;
        HashMap<View, m> map = this.J;
        View viewM = m(i11);
        m mVar = map.get(viewM);
        if (mVar != null) {
            mVar.l(f11, f12, f13, fArr);
            float y11 = viewM.getY();
            this.U = f11;
            this.V = y11;
            return;
        }
        if (viewM == null) {
            resourceName = "" + i11;
        } else {
            resourceName = viewM.getContext().getResources().getResourceName(i11);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + resourceName);
    }

    public androidx.constraintlayout.widget.d j0(int i11) {
        r rVar = this.f6664z;
        if (rVar == null) {
            return null;
        }
        return rVar.k(i11);
    }

    m k0(int i11) {
        return this.J.get(findViewById(i11));
    }

    public r.b l0(int i11) {
        return this.f6664z.F(i11);
    }

    public boolean o0() {
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        r.b bVar;
        int i11;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.T0 = display.getRotation();
        }
        r rVar = this.f6664z;
        if (rVar != null && (i11 = this.E) != -1) {
            androidx.constraintlayout.widget.d dVarK = rVar.k(i11);
            this.f6664z.S(this);
            ArrayList<n> arrayList = this.f6657s0;
            if (arrayList != null) {
                Iterator<n> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().A(this);
                }
            }
            if (dVarK != null) {
                dVarK.i(this);
            }
            this.D = this.E;
        }
        q0();
        h hVar = this.K0;
        if (hVar != null) {
            if (this.V0) {
                post(new b());
                return;
            } else {
                hVar.a();
                return;
            }
        }
        r rVar2 = this.f6664z;
        if (rVar2 == null || (bVar = rVar2.f6734c) == null || bVar.x() != 4) {
            return;
        }
        w0();
        setState(j.SETUP);
        setState(j.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        s sVarB;
        int iQ;
        RectF rectFP;
        r rVar = this.f6664z;
        if (rVar != null && this.I) {
            v vVar = rVar.f6749r;
            if (vVar != null) {
                vVar.g(motionEvent);
            }
            r.b bVar = this.f6664z.f6734c;
            if (bVar != null && bVar.C() && (sVarB = bVar.B()) != null && ((motionEvent.getAction() != 0 || (rectFP = sVarB.p(this, new RectF())) == null || rectFP.contains(motionEvent.getX(), motionEvent.getY())) && (iQ = sVarB.q()) != -1)) {
                View view = this.f6637a1;
                if (view == null || view.getId() != iQ) {
                    this.f6637a1 = findViewById(iQ);
                }
                View view2 = this.f6637a1;
                if (view2 != null) {
                    this.Z0.set(view2.getLeft(), this.f6637a1.getTop(), this.f6637a1.getRight(), this.f6637a1.getBottom());
                    if (this.Z0.contains(motionEvent.getX(), motionEvent.getY()) && !m0(this.f6637a1.getLeft(), this.f6637a1.getTop(), this.f6637a1, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) throws Throwable {
        p pVar;
        this.J0 = true;
        try {
            if (this.f6664z == null) {
                super.onLayout(z11, i11, i12, i13, i14);
                this.J0 = false;
                return;
            }
            pVar = this;
            int i15 = i13 - i11;
            int i16 = i14 - i12;
            try {
                if (pVar.f6647i0 != i15 || pVar.f6648j0 != i16) {
                    s0();
                    c0(true);
                }
                pVar.f6647i0 = i15;
                pVar.f6648j0 = i16;
                pVar.f6645g0 = i15;
                pVar.f6646h0 = i16;
                pVar.J0 = false;
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            pVar = this;
        }
        Throwable th4 = th;
        pVar.J0 = false;
        throw th4;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.f6664z == null) {
            super.onMeasure(i11, i12);
            return;
        }
        boolean z11 = false;
        boolean z12 = (this.G == i11 && this.H == i12) ? false : true;
        if (this.Y0) {
            this.Y0 = false;
            q0();
            r0();
            z12 = true;
        }
        if (this.f6866h) {
            z12 = true;
        }
        this.G = i11;
        this.H = i12;
        int iE = this.f6664z.E();
        int iP = this.f6664z.p();
        if ((z12 || this.X0.f(iE, iP)) && this.D != -1) {
            super.onMeasure(i11, i12);
            this.X0.e(this.f6861c, this.f6664z.k(iE), this.f6664z.k(iP));
            this.X0.h();
            this.X0.i(iE, iP);
        } else {
            if (z12) {
                super.onMeasure(i11, i12);
            }
            z11 = true;
        }
        if (this.A0 || z11) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int iY = this.f6861c.Y() + getPaddingLeft() + getPaddingRight();
            int iZ = this.f6861c.z() + paddingTop;
            int i13 = this.F0;
            if (i13 == Integer.MIN_VALUE || i13 == 0) {
                int i14 = this.B0;
                iY = (int) (i14 + (this.H0 * (this.D0 - i14)));
                requestLayout();
            }
            int i15 = this.G0;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                int i16 = this.C0;
                iZ = (int) (i16 + (this.H0 * (this.E0 - i16)));
                requestLayout();
            }
            setMeasuredDimension(iY, iZ);
        }
        d0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(@NonNull View view, float f11, float f12, boolean z11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(@NonNull View view, float f11, float f12) {
        return false;
    }

    @Override // androidx.core.view.x
    public void onNestedPreScroll(@NonNull View view, int i11, int i12, @NonNull int[] iArr, int i13) {
        r.b bVar;
        s sVarB;
        int iQ;
        r rVar = this.f6664z;
        if (rVar == null || (bVar = rVar.f6734c) == null || !bVar.C()) {
            return;
        }
        int i14 = -1;
        if (!bVar.C() || (sVarB = bVar.B()) == null || (iQ = sVarB.q()) == -1 || view.getId() == iQ) {
            if (rVar.v()) {
                s sVarB2 = bVar.B();
                if (sVarB2 != null && (sVarB2.e() & 4) != 0) {
                    i14 = i12;
                }
                float f11 = this.M;
                if ((f11 == 1.0f || f11 == BitmapDescriptorFactory.HUE_RED) && view.canScrollVertically(i14)) {
                    return;
                }
            }
            if (bVar.B() != null && (bVar.B().e() & 1) != 0) {
                float fW = rVar.w(i11, i12);
                float f12 = this.N;
                if ((f12 <= BitmapDescriptorFactory.HUE_RED && fW < BitmapDescriptorFactory.HUE_RED) || (f12 >= 1.0f && fW > BitmapDescriptorFactory.HUE_RED)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new a(view));
                    return;
                }
            }
            float f13 = this.M;
            long nanoTime = getNanoTime();
            float f14 = i11;
            this.f6650l0 = f14;
            float f15 = i12;
            this.f6651m0 = f15;
            this.f6653o0 = (float) ((nanoTime - this.f6652n0) * 1.0E-9d);
            this.f6652n0 = nanoTime;
            rVar.O(f14, f15);
            if (f13 != this.M) {
                iArr[0] = i11;
                iArr[1] = i12;
            }
            c0(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f6649k0 = true;
        }
    }

    @Override // androidx.core.view.x
    public void onNestedScroll(@NonNull View view, int i11, int i12, int i13, int i14, int i15) {
    }

    @Override // androidx.core.view.x
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i11, int i12) {
        this.f6652n0 = getNanoTime();
        this.f6653o0 = BitmapDescriptorFactory.HUE_RED;
        this.f6650l0 = BitmapDescriptorFactory.HUE_RED;
        this.f6651m0 = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        r rVar = this.f6664z;
        if (rVar != null) {
            rVar.V(p());
        }
    }

    @Override // androidx.core.view.x
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i11, int i12) {
        r.b bVar;
        r rVar = this.f6664z;
        return (rVar == null || (bVar = rVar.f6734c) == null || bVar.B() == null || (this.f6664z.f6734c.B().e() & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.x
    public void onStopNestedScroll(@NonNull View view, int i11) {
        r rVar = this.f6664z;
        if (rVar != null) {
            float f11 = this.f6653o0;
            if (f11 == BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            rVar.P(this.f6650l0 / f11, this.f6651m0 / f11);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        r rVar = this.f6664z;
        if (rVar == null || !this.I || !rVar.a0()) {
            return super.onTouchEvent(motionEvent);
        }
        r.b bVar = this.f6664z.f6734c;
        if (bVar != null && !bVar.C()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f6664z.Q(motionEvent, getCurrentState(), this);
        if (this.f6664z.f6734c.D(4)) {
            return this.f6664z.f6734c.B().r();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof n) {
            n nVar = (n) view;
            if (this.f6658t0 == null) {
                this.f6658t0 = new CopyOnWriteArrayList<>();
            }
            this.f6658t0.add(nVar);
            if (nVar.z()) {
                if (this.f6655q0 == null) {
                    this.f6655q0 = new ArrayList<>();
                }
                this.f6655q0.add(nVar);
            }
            if (nVar.y()) {
                if (this.f6656r0 == null) {
                    this.f6656r0 = new ArrayList<>();
                }
                this.f6656r0.add(nVar);
            }
            if (nVar.x()) {
                if (this.f6657s0 == null) {
                    this.f6657s0 = new ArrayList<>();
                }
                this.f6657s0.add(nVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<n> arrayList = this.f6655q0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<n> arrayList2 = this.f6656r0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    protected f p0() {
        return g.e();
    }

    void q0() {
        r rVar = this.f6664z;
        if (rVar == null) {
            return;
        }
        if (rVar.g(this, this.E)) {
            requestLayout();
            return;
        }
        int i11 = this.E;
        if (i11 != -1) {
            this.f6664z.f(this, i11);
        }
        if (this.f6664z.a0()) {
            this.f6664z.Y();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void r(int i11) {
        this.f6869k = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        r rVar;
        r.b bVar;
        if (!this.A0 && this.E == -1 && (rVar = this.f6664z) != null && (bVar = rVar.f6734c) != null) {
            int iZ = bVar.z();
            if (iZ == 0) {
                return;
            }
            if (iZ == 2) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.J.get(getChildAt(i11)).w();
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void s0() {
        this.X0.h();
        invalidate();
    }

    public void setDebugMode(int i11) {
        this.W = i11;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z11) {
        this.V0 = z11;
    }

    public void setInteractionEnabled(boolean z11) {
        this.I = z11;
    }

    public void setInterpolatedProgress(float f11) {
        if (this.f6664z != null) {
            setState(j.MOVING);
            Interpolator interpolatorR = this.f6664z.r();
            if (interpolatorR != null) {
                setProgress(interpolatorR.getInterpolation(f11));
                return;
            }
        }
        setProgress(f11);
    }

    public void setOnHide(float f11) {
        ArrayList<n> arrayList = this.f6656r0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f6656r0.get(i11).setProgress(f11);
            }
        }
    }

    public void setOnShow(float f11) {
        ArrayList<n> arrayList = this.f6655q0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f6655q0.get(i11).setProgress(f11);
            }
        }
    }

    public void setProgress(float f11, float f12) {
        if (!isAttachedToWindow()) {
            if (this.K0 == null) {
                this.K0 = new h();
            }
            this.K0.e(f11);
            this.K0.h(f12);
            return;
        }
        setProgress(f11);
        setState(j.MOVING);
        this.C = f12;
        float f13 = BitmapDescriptorFactory.HUE_RED;
        if (f12 != BitmapDescriptorFactory.HUE_RED) {
            if (f12 > BitmapDescriptorFactory.HUE_RED) {
                f13 = 1.0f;
            }
            V(f13);
        } else {
            if (f11 == BitmapDescriptorFactory.HUE_RED || f11 == 1.0f) {
                return;
            }
            if (f11 > 0.5f) {
                f13 = 1.0f;
            }
            V(f13);
        }
    }

    public void setScene(r rVar) {
        this.f6664z = rVar;
        rVar.V(p());
        s0();
    }

    void setStartState(int i11) {
        if (isAttachedToWindow()) {
            this.E = i11;
            return;
        }
        if (this.K0 == null) {
            this.K0 = new h();
        }
        this.K0.f(i11);
        this.K0.d(i11);
    }

    void setState(j jVar) {
        j jVar2 = j.FINISHED;
        if (jVar == jVar2 && this.E == -1) {
            return;
        }
        j jVar3 = this.W0;
        this.W0 = jVar;
        j jVar4 = j.MOVING;
        if (jVar3 == jVar4 && jVar == jVar4) {
            e0();
        }
        int iOrdinal = jVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && jVar == jVar2) {
                f0();
                return;
            }
            return;
        }
        if (jVar == jVar4) {
            e0();
        }
        if (jVar == jVar2) {
            f0();
        }
    }

    public void setTransition(int i11, int i12) {
        if (!isAttachedToWindow()) {
            if (this.K0 == null) {
                this.K0 = new h();
            }
            this.K0.f(i11);
            this.K0.d(i12);
            return;
        }
        r rVar = this.f6664z;
        if (rVar != null) {
            this.D = i11;
            this.F = i12;
            rVar.W(i11, i12);
            this.X0.e(this.f6861c, this.f6664z.k(i11), this.f6664z.k(i12));
            s0();
            this.N = BitmapDescriptorFactory.HUE_RED;
            y0();
        }
    }

    public void setTransitionDuration(int i11) {
        r rVar = this.f6664z;
        if (rVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            rVar.U(i11);
        }
    }

    public void setTransitionListener(i iVar) {
        this.T = iVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.K0 == null) {
            this.K0 = new h();
        }
        this.K0.g(bundle);
        if (isAttachedToWindow()) {
            this.K0.a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.a.c(context, this.D) + "->" + androidx.constraintlayout.motion.widget.a.c(context, this.F) + " (pos:" + this.N + " Dpos/Dt:" + this.C;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    public void v0(int i11, float f11, float f12) {
        float f13;
        if (this.f6664z == null || this.N == f11) {
            return;
        }
        this.f6638b0 = true;
        this.K = getNanoTime();
        this.L = this.f6664z.o() / 1000.0f;
        this.P = f11;
        this.R = true;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            if (i11 != 1 || i11 == 7) {
                f13 = 0.0f;
            } else {
                if (i11 == 2 || i11 == 6) {
                    f11 = 1.0f;
                }
                f13 = f11;
            }
            if (this.f6664z.j() == 0) {
                this.f6640c0.b(this.N, f13, f12, this.L, this.f6664z.t(), this.f6664z.u());
            } else {
                this.f6640c0.d(this.N, f13, f12, this.f6664z.A(), this.f6664z.B(), this.f6664z.z(), this.f6664z.C(), this.f6664z.y());
            }
            int i12 = this.E;
            this.P = f13;
            this.E = i12;
            this.A = this.f6640c0;
        } else if (i11 == 4) {
            this.f6642d0.b(f12, this.N, this.f6664z.t());
            this.A = this.f6642d0;
        } else if (i11 != 5) {
            if (i11 == 6 || i11 == 7) {
                if (i11 != 1) {
                    f13 = 0.0f;
                } else {
                    f13 = 0.0f;
                }
                if (this.f6664z.j() == 0) {
                    this.f6640c0.b(this.N, f13, f12, this.L, this.f6664z.t(), this.f6664z.u());
                } else {
                    this.f6640c0.d(this.N, f13, f12, this.f6664z.A(), this.f6664z.B(), this.f6664z.z(), this.f6664z.C(), this.f6664z.y());
                }
                int i13 = this.E;
                this.P = f13;
                this.E = i13;
                this.A = this.f6640c0;
            }
        } else if (F0(f12, this.N, this.f6664z.t())) {
            this.f6642d0.b(f12, this.N, this.f6664z.t());
            this.A = this.f6642d0;
        } else {
            this.f6640c0.b(this.N, f11, f12, this.L, this.f6664z.t(), this.f6664z.u());
            this.C = BitmapDescriptorFactory.HUE_RED;
            int i14 = this.E;
            this.P = f11;
            this.E = i14;
            this.A = this.f6640c0;
        }
        this.Q = false;
        this.K = getNanoTime();
        invalidate();
    }

    public void w0() {
        V(1.0f);
        this.L0 = null;
    }

    public void x0(Runnable runnable) {
        V(1.0f);
        this.L0 = runnable;
    }

    public void y0() {
        V(BitmapDescriptorFactory.HUE_RED);
    }

    public void z0(int i11) {
        if (isAttachedToWindow()) {
            A0(i11, -1, -1);
            return;
        }
        if (this.K0 == null) {
            this.K0 = new h();
        }
        this.K0.d(i11);
    }

    @Override // androidx.core.view.y
    public void onNestedScroll(@NonNull View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        if (this.f6649k0 || i11 != 0 || i12 != 0) {
            iArr[0] = iArr[0] + i13;
            iArr[1] = iArr[1] + i14;
        }
        this.f6649k0 = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i11, int i12, int i13) {
        setState(j.SETUP);
        this.E = i11;
        this.D = -1;
        this.F = -1;
        androidx.constraintlayout.widget.c cVar = this.f6869k;
        if (cVar != null) {
            cVar.d(i11, i12, i13);
            return;
        }
        r rVar = this.f6664z;
        if (rVar != null) {
            rVar.k(i11).i(this);
        }
    }

    public void setProgress(float f11) {
        if (f11 < BitmapDescriptorFactory.HUE_RED || f11 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.K0 == null) {
                this.K0 = new h();
            }
            this.K0.e(f11);
            return;
        }
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            if (this.N == 1.0f && this.E == this.F) {
                setState(j.MOVING);
            }
            this.E = this.D;
            if (this.N == BitmapDescriptorFactory.HUE_RED) {
                setState(j.FINISHED);
            }
        } else if (f11 >= 1.0f) {
            if (this.N == BitmapDescriptorFactory.HUE_RED && this.E == this.D) {
                setState(j.MOVING);
            }
            this.E = this.F;
            if (this.N == 1.0f) {
                setState(j.FINISHED);
            }
        } else {
            this.E = -1;
            setState(j.MOVING);
        }
        if (this.f6664z == null) {
            return;
        }
        this.Q = true;
        this.P = f11;
        this.M = f11;
        this.O = -1L;
        this.K = -1L;
        this.A = null;
        this.R = true;
        invalidate();
    }

    public void setTransition(int i11) {
        float f11;
        if (this.f6664z != null) {
            r.b bVarL0 = l0(i11);
            this.D = bVarL0.A();
            this.F = bVarL0.y();
            if (!isAttachedToWindow()) {
                if (this.K0 == null) {
                    this.K0 = new h();
                }
                this.K0.f(this.D);
                this.K0.d(this.F);
                return;
            }
            int i12 = this.E;
            int i13 = this.D;
            float f12 = BitmapDescriptorFactory.HUE_RED;
            if (i12 == i13) {
                f11 = 0.0f;
            } else {
                f11 = i12 == this.F ? 1.0f : Float.NaN;
            }
            this.f6664z.X(bVarL0);
            this.X0.e(this.f6861c, this.f6664z.k(this.D), this.f6664z.k(this.F));
            s0();
            if (this.N != f11) {
                if (f11 == BitmapDescriptorFactory.HUE_RED) {
                    b0(true);
                    this.f6664z.k(this.D).i(this);
                } else if (f11 == 1.0f) {
                    b0(false);
                    this.f6664z.k(this.F).i(this);
                }
            }
            if (!Float.isNaN(f11)) {
                f12 = f11;
            }
            this.N = f12;
            if (Float.isNaN(f11)) {
                Log.v("MotionLayout", androidx.constraintlayout.motion.widget.a.b() + " transitionToStart ");
                y0();
                return;
            }
            setProgress(f11);
        }
    }

    protected void setTransition(r.b bVar) {
        this.f6664z.X(bVar);
        setState(j.SETUP);
        if (this.E == this.f6664z.p()) {
            this.N = 1.0f;
            this.M = 1.0f;
            this.P = 1.0f;
        } else {
            this.N = BitmapDescriptorFactory.HUE_RED;
            this.M = BitmapDescriptorFactory.HUE_RED;
            this.P = BitmapDescriptorFactory.HUE_RED;
        }
        this.O = bVar.D(1) ? -1L : getNanoTime();
        int iE = this.f6664z.E();
        int iP = this.f6664z.p();
        if (iE == this.D && iP == this.F) {
            return;
        }
        this.D = iE;
        this.F = iP;
        this.f6664z.W(iE, iP);
        this.X0.e(this.f6861c, this.f6664z.k(this.D), this.f6664z.k(this.F));
        this.X0.i(this.D, this.F);
        this.X0.h();
        s0();
    }

    public p(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = null;
        this.C = BitmapDescriptorFactory.HUE_RED;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = 0;
        this.H = 0;
        this.I = true;
        this.J = new HashMap<>();
        this.K = 0L;
        this.L = 1.0f;
        this.M = BitmapDescriptorFactory.HUE_RED;
        this.N = BitmapDescriptorFactory.HUE_RED;
        this.P = BitmapDescriptorFactory.HUE_RED;
        this.R = false;
        this.S = false;
        this.W = 0;
        this.f6638b0 = false;
        this.f6640c0 = new f5.b();
        this.f6642d0 = new c();
        this.f6644f0 = true;
        this.f6649k0 = false;
        this.f6654p0 = false;
        this.f6655q0 = null;
        this.f6656r0 = null;
        this.f6657s0 = null;
        this.f6658t0 = null;
        this.f6659u0 = 0;
        this.f6660v0 = -1L;
        this.f6661w0 = BitmapDescriptorFactory.HUE_RED;
        this.f6662x0 = 0;
        this.f6663y0 = BitmapDescriptorFactory.HUE_RED;
        this.f6665z0 = false;
        this.A0 = false;
        this.I0 = new b5.d();
        this.J0 = false;
        this.L0 = null;
        this.M0 = null;
        this.N0 = 0;
        this.O0 = false;
        this.P0 = 0;
        this.Q0 = new HashMap<>();
        this.U0 = new Rect();
        this.V0 = false;
        this.W0 = j.UNDEFINED;
        this.X0 = new e();
        this.Y0 = false;
        this.Z0 = new RectF();
        this.f6637a1 = null;
        this.f6639b1 = null;
        this.f6641c1 = new ArrayList<>();
        n0(attributeSet);
    }

    public p(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.B = null;
        this.C = BitmapDescriptorFactory.HUE_RED;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = 0;
        this.H = 0;
        this.I = true;
        this.J = new HashMap<>();
        this.K = 0L;
        this.L = 1.0f;
        this.M = BitmapDescriptorFactory.HUE_RED;
        this.N = BitmapDescriptorFactory.HUE_RED;
        this.P = BitmapDescriptorFactory.HUE_RED;
        this.R = false;
        this.S = false;
        this.W = 0;
        this.f6638b0 = false;
        this.f6640c0 = new f5.b();
        this.f6642d0 = new c();
        this.f6644f0 = true;
        this.f6649k0 = false;
        this.f6654p0 = false;
        this.f6655q0 = null;
        this.f6656r0 = null;
        this.f6657s0 = null;
        this.f6658t0 = null;
        this.f6659u0 = 0;
        this.f6660v0 = -1L;
        this.f6661w0 = BitmapDescriptorFactory.HUE_RED;
        this.f6662x0 = 0;
        this.f6663y0 = BitmapDescriptorFactory.HUE_RED;
        this.f6665z0 = false;
        this.A0 = false;
        this.I0 = new b5.d();
        this.J0 = false;
        this.L0 = null;
        this.M0 = null;
        this.N0 = 0;
        this.O0 = false;
        this.P0 = 0;
        this.Q0 = new HashMap<>();
        this.U0 = new Rect();
        this.V0 = false;
        this.W0 = j.UNDEFINED;
        this.X0 = new e();
        this.Y0 = false;
        this.Z0 = new RectF();
        this.f6637a1 = null;
        this.f6639b1 = null;
        this.f6641c1 = new ArrayList<>();
        n0(attributeSet);
    }
}
