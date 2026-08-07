package com.caverock.androidsvg;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: loaded from: classes3.dex */
class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static HashSet<String> f21406i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f21407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f21408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.caverock.androidsvg.g f21409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0427h f21410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Stack<C0427h> f21411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Stack<com.caverock.androidsvg.g.j0> f21412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Stack<Matrix> f21413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.caverock.androidsvg.b.q f21414h = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f21416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f21417c;

        static {
            int[] iArr = new int[com.caverock.androidsvg.g.e0.d.values().length];
            f21417c = iArr;
            try {
                iArr[com.caverock.androidsvg.g.e0.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21417c[com.caverock.androidsvg.g.e0.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21417c[com.caverock.androidsvg.g.e0.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.caverock.androidsvg.g.e0.c.values().length];
            f21416b = iArr2;
            try {
                iArr2[com.caverock.androidsvg.g.e0.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21416b[com.caverock.androidsvg.g.e0.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21416b[com.caverock.androidsvg.g.e0.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[com.caverock.androidsvg.e.a.values().length];
            f21415a = iArr3;
            try {
                iArr3[com.caverock.androidsvg.e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21415a[com.caverock.androidsvg.e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21415a[com.caverock.androidsvg.e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21415a[com.caverock.androidsvg.e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21415a[com.caverock.androidsvg.e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21415a[com.caverock.androidsvg.e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21415a[com.caverock.androidsvg.e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21415a[com.caverock.androidsvg.e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private class b implements com.caverock.androidsvg.g.x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f21419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f21420c;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f21425h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<c> f21418a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f21421d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f21422e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f21423f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f21424g = -1;

        b(com.caverock.androidsvg.g.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.e(this);
            if (this.f21425h) {
                this.f21421d.b(this.f21418a.get(this.f21424g));
                this.f21418a.set(this.f21424g, this.f21421d);
                this.f21425h = false;
            }
            c cVar = this.f21421d;
            if (cVar != null) {
                this.f21418a.add(cVar);
            }
        }

        @Override // com.caverock.androidsvg.g.x
        public void a(float f11, float f12, float f13, float f14) {
            this.f21421d.a(f11, f12);
            this.f21418a.add(this.f21421d);
            this.f21421d = h.this.new c(f13, f14, f13 - f11, f14 - f12);
            this.f21425h = false;
        }

        @Override // com.caverock.androidsvg.g.x
        public void b(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            this.f21422e = true;
            this.f21423f = false;
            c cVar = this.f21421d;
            h.h(cVar.f21427a, cVar.f21428b, f11, f12, f13, z11, z12, f14, f15, this);
            this.f21423f = true;
            this.f21425h = false;
        }

        List<c> c() {
            return this.f21418a;
        }

        @Override // com.caverock.androidsvg.g.x
        public void close() {
            this.f21418a.add(this.f21421d);
            lineTo(this.f21419b, this.f21420c);
            this.f21425h = true;
        }

        @Override // com.caverock.androidsvg.g.x
        public void cubicTo(float f11, float f12, float f13, float f14, float f15, float f16) {
            if (this.f21423f || this.f21422e) {
                this.f21421d.a(f11, f12);
                this.f21418a.add(this.f21421d);
                this.f21422e = false;
            }
            this.f21421d = h.this.new c(f15, f16, f15 - f13, f16 - f14);
            this.f21425h = false;
        }

        @Override // com.caverock.androidsvg.g.x
        public void lineTo(float f11, float f12) {
            this.f21421d.a(f11, f12);
            this.f21418a.add(this.f21421d);
            h hVar = h.this;
            c cVar = this.f21421d;
            this.f21421d = hVar.new c(f11, f12, f11 - cVar.f21427a, f12 - cVar.f21428b);
            this.f21425h = false;
        }

        @Override // com.caverock.androidsvg.g.x
        public void moveTo(float f11, float f12) {
            if (this.f21425h) {
                this.f21421d.b(this.f21418a.get(this.f21424g));
                this.f21418a.set(this.f21424g, this.f21421d);
                this.f21425h = false;
            }
            c cVar = this.f21421d;
            if (cVar != null) {
                this.f21418a.add(cVar);
            }
            this.f21419b = f11;
            this.f21420c = f12;
            this.f21421d = h.this.new c(f11, f12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.f21424g = this.f21418a.size();
        }
    }

    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f21427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f21428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f21429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f21430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f21431e = false;

        c(float f11, float f12, float f13, float f14) {
            this.f21429c = BitmapDescriptorFactory.HUE_RED;
            this.f21430d = BitmapDescriptorFactory.HUE_RED;
            this.f21427a = f11;
            this.f21428b = f12;
            double dSqrt = Math.sqrt((f13 * f13) + (f14 * f14));
            if (dSqrt != 0.0d) {
                this.f21429c = (float) (((double) f13) / dSqrt);
                this.f21430d = (float) (((double) f14) / dSqrt);
            }
        }

        void a(float f11, float f12) {
            float f13 = f11 - this.f21427a;
            float f14 = f12 - this.f21428b;
            double dSqrt = Math.sqrt((f13 * f13) + (f14 * f14));
            if (dSqrt != 0.0d) {
                f13 = (float) (((double) f13) / dSqrt);
                f14 = (float) (((double) f14) / dSqrt);
            }
            float f15 = this.f21429c;
            if (f13 != (-f15) || f14 != (-this.f21430d)) {
                this.f21429c = f15 + f13;
                this.f21430d += f14;
            } else {
                this.f21431e = true;
                this.f21429c = -f14;
                this.f21430d = f13;
            }
        }

        void b(c cVar) {
            float f11 = cVar.f21429c;
            float f12 = this.f21429c;
            if (f11 == (-f12)) {
                float f13 = cVar.f21430d;
                if (f13 == (-this.f21430d)) {
                    this.f21431e = true;
                    this.f21429c = -f13;
                    this.f21430d = cVar.f21429c;
                    return;
                }
            }
            this.f21429c = f12 + f11;
            this.f21430d += cVar.f21430d;
        }

        public String toString() {
            return "(" + this.f21427a + "," + this.f21428b + " " + this.f21429c + "," + this.f21430d + ")";
        }
    }

    private class d implements com.caverock.androidsvg.g.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Path f21433a = new Path();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f21434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f21435c;

        d(com.caverock.androidsvg.g.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.e(this);
        }

        @Override // com.caverock.androidsvg.g.x
        public void a(float f11, float f12, float f13, float f14) {
            this.f21433a.quadTo(f11, f12, f13, f14);
            this.f21434b = f13;
            this.f21435c = f14;
        }

        @Override // com.caverock.androidsvg.g.x
        public void b(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            h.h(this.f21434b, this.f21435c, f11, f12, f13, z11, z12, f14, f15, this);
            this.f21434b = f14;
            this.f21435c = f15;
        }

        Path c() {
            return this.f21433a;
        }

        @Override // com.caverock.androidsvg.g.x
        public void close() {
            this.f21433a.close();
        }

        @Override // com.caverock.androidsvg.g.x
        public void cubicTo(float f11, float f12, float f13, float f14, float f15, float f16) {
            this.f21433a.cubicTo(f11, f12, f13, f14, f15, f16);
            this.f21434b = f15;
            this.f21435c = f16;
        }

        @Override // com.caverock.androidsvg.g.x
        public void lineTo(float f11, float f12) {
            this.f21433a.lineTo(f11, f12);
            this.f21434b = f11;
            this.f21435c = f12;
        }

        @Override // com.caverock.androidsvg.g.x
        public void moveTo(float f11, float f12) {
            this.f21433a.moveTo(f11, f12);
            this.f21434b = f11;
            this.f21435c = f12;
        }
    }

    private class e extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Path f21437e;

        e(Path path, float f11, float f12) {
            super(f11, f12);
            this.f21437e = path;
        }

        @Override // com.caverock.androidsvg.h.f, com.caverock.androidsvg.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                if (h.this.f21410d.f21447b) {
                    str2 = str;
                    h.this.f21407a.drawTextOnPath(str2, this.f21437e, this.f21439b, this.f21440c, h.this.f21410d.f21449d);
                } else {
                    str2 = str;
                }
                if (h.this.f21410d.f21448c) {
                    h.this.f21407a.drawTextOnPath(str2, this.f21437e, this.f21439b, this.f21440c, h.this.f21410d.f21450e);
                }
            } else {
                str2 = str;
            }
            this.f21439b += h.this.f21410d.f21449d.measureText(str2);
        }
    }

    private class f extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f21439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f21440c;

        f(float f11, float f12) {
            super(h.this, null);
            this.f21439b = f11;
            this.f21440c = f12;
        }

        @Override // com.caverock.androidsvg.h.j
        public void b(String str) {
            h.y("TextSequence render", new Object[0]);
            if (h.this.Y0()) {
                if (h.this.f21410d.f21447b) {
                    h.this.f21407a.drawText(str, this.f21439b, this.f21440c, h.this.f21410d.f21449d);
                }
                if (h.this.f21410d.f21448c) {
                    h.this.f21407a.drawText(str, this.f21439b, this.f21440c, h.this.f21410d.f21450e);
                }
            }
            this.f21439b += h.this.f21410d.f21449d.measureText(str);
        }
    }

    private class g extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f21442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f21443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Path f21444d;

        g(float f11, float f12, Path path) {
            super(h.this, null);
            this.f21442b = f11;
            this.f21443c = f12;
            this.f21444d = path;
        }

        @Override // com.caverock.androidsvg.h.j
        public boolean a(com.caverock.androidsvg.g.y0 y0Var) {
            if (!(y0Var instanceof com.caverock.androidsvg.g.z0)) {
                return true;
            }
            h.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // com.caverock.androidsvg.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                Path path = new Path();
                str2 = str;
                h.this.f21410d.f21449d.getTextPath(str2, 0, str.length(), this.f21442b, this.f21443c, path);
                this.f21444d.addPath(path);
            } else {
                str2 = str;
            }
            this.f21442b += h.this.f21410d.f21449d.measureText(str2);
        }
    }

    private class i extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f21455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f21456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        RectF f21457d;

        i(float f11, float f12) {
            super(h.this, null);
            this.f21457d = new RectF();
            this.f21455b = f11;
            this.f21456c = f12;
        }

        @Override // com.caverock.androidsvg.h.j
        public boolean a(com.caverock.androidsvg.g.y0 y0Var) {
            if (!(y0Var instanceof com.caverock.androidsvg.g.z0)) {
                return true;
            }
            com.caverock.androidsvg.g.z0 z0Var = (com.caverock.androidsvg.g.z0) y0Var;
            com.caverock.androidsvg.g.n0 n0VarP = y0Var.f21349a.p(z0Var.f21403o);
            if (n0VarP == null) {
                h.F("TextPath path reference '%s' not found", z0Var.f21403o);
                return false;
            }
            com.caverock.androidsvg.g.v vVar = (com.caverock.androidsvg.g.v) n0VarP;
            Path pathC = h.this.new d(vVar.f21386o).c();
            Matrix matrix = vVar.f21338n;
            if (matrix != null) {
                pathC.transform(matrix);
            }
            RectF rectF = new RectF();
            pathC.computeBounds(rectF, true);
            this.f21457d.union(rectF);
            return false;
        }

        @Override // com.caverock.androidsvg.h.j
        public void b(String str) {
            if (h.this.Y0()) {
                Rect rect = new Rect();
                h.this.f21410d.f21449d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f21455b, this.f21456c);
                this.f21457d.union(rectF);
            }
            this.f21455b += h.this.f21410d.f21449d.measureText(str);
        }
    }

    private abstract class j {
        private j() {
        }

        public boolean a(com.caverock.androidsvg.g.y0 y0Var) {
            return true;
        }

        public abstract void b(String str);

        /* synthetic */ j(h hVar, a aVar) {
            this();
        }
    }

    h(Canvas canvas, float f11) {
        this.f21407a = canvas;
        this.f21408b = f11;
    }

    private boolean A() {
        Boolean bool = this.f21410d.f21446a.A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void A0(com.caverock.androidsvg.g.n0 n0Var) {
        if (n0Var instanceof com.caverock.androidsvg.g.t) {
            return;
        }
        S0();
        u(n0Var);
        if (n0Var instanceof com.caverock.androidsvg.g.f0) {
            x0((com.caverock.androidsvg.g.f0) n0Var);
        } else if (n0Var instanceof com.caverock.androidsvg.g.e1) {
            E0((com.caverock.androidsvg.g.e1) n0Var);
        } else if (n0Var instanceof com.caverock.androidsvg.g.s0) {
            B0((com.caverock.androidsvg.g.s0) n0Var);
        } else if (n0Var instanceof com.caverock.androidsvg.g.m) {
            q0((com.caverock.androidsvg.g.m) n0Var);
        } else if (n0Var instanceof com.caverock.androidsvg.g.o) {
            r0((com.caverock.androidsvg.g.o) n0Var);
        } else if (n0Var instanceof com.caverock.androidsvg.g.v) {
            t0((com.caverock.androidsvg.g.v) n0Var);
        } else if (n0Var instanceof com.caverock.androidsvg.g.b0) {
            w0((com.caverock.androidsvg.g.b0) n0Var);
        } else if (n0Var instanceof com.caverock.androidsvg.g.d) {
            o0((com.caverock.androidsvg.g.d) n0Var);
        } else if (n0Var instanceof com.caverock.androidsvg.g.i) {
            p0((com.caverock.androidsvg.g.i) n0Var);
        } else if (n0Var instanceof com.caverock.androidsvg.g.q) {
            s0((com.caverock.androidsvg.g.q) n0Var);
        } else if (n0Var instanceof com.caverock.androidsvg.g.a0) {
            v0((com.caverock.androidsvg.g.a0) n0Var);
        } else if (n0Var instanceof com.caverock.androidsvg.g.z) {
            u0((com.caverock.androidsvg.g.z) n0Var);
        } else if (n0Var instanceof com.caverock.androidsvg.g.w0) {
            D0((com.caverock.androidsvg.g.w0) n0Var);
        }
        R0();
    }

    private void B(com.caverock.androidsvg.g.k0 k0Var, Path path) {
        com.caverock.androidsvg.g.o0 o0Var = this.f21410d.f21446a.f21278b;
        if (o0Var instanceof com.caverock.androidsvg.g.u) {
            com.caverock.androidsvg.g.n0 n0VarP = this.f21409c.p(((com.caverock.androidsvg.g.u) o0Var).f21382a);
            if (n0VarP instanceof com.caverock.androidsvg.g.y) {
                L(k0Var, path, (com.caverock.androidsvg.g.y) n0VarP);
                return;
            }
        }
        this.f21407a.drawPath(path, this.f21410d.f21449d);
    }

    private void B0(com.caverock.androidsvg.g.s0 s0Var) {
        y("Switch render", new Object[0]);
        W0(this.f21410d, s0Var);
        if (A()) {
            Matrix matrix = s0Var.f21344o;
            if (matrix != null) {
                this.f21407a.concat(matrix);
            }
            p(s0Var);
            boolean zM0 = m0();
            K0(s0Var);
            if (zM0) {
                j0(s0Var);
            }
            U0(s0Var);
        }
    }

    private void C(Path path) {
        C0427h c0427h = this.f21410d;
        if (c0427h.f21446a.L != com.caverock.androidsvg.g.e0.i.NonScalingStroke) {
            this.f21407a.drawPath(path, c0427h.f21450e);
            return;
        }
        Matrix matrix = this.f21407a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f21407a.setMatrix(new Matrix());
        Shader shader = this.f21410d.f21450e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f21407a.drawPath(path2, this.f21410d.f21450e);
        this.f21407a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private void C0(com.caverock.androidsvg.g.t0 t0Var, com.caverock.androidsvg.g.b bVar) {
        y("Symbol render", new Object[0]);
        if (bVar.f21250c == BitmapDescriptorFactory.HUE_RED || bVar.f21251d == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        com.caverock.androidsvg.e eVar = t0Var.f21359o;
        if (eVar == null) {
            eVar = com.caverock.androidsvg.e.f21221e;
        }
        W0(this.f21410d, t0Var);
        C0427h c0427h = this.f21410d;
        c0427h.f21451f = bVar;
        if (!c0427h.f21446a.f21298v.booleanValue()) {
            com.caverock.androidsvg.g.b bVar2 = this.f21410d.f21451f;
            O0(bVar2.f21248a, bVar2.f21249b, bVar2.f21250c, bVar2.f21251d);
        }
        com.caverock.androidsvg.g.b bVar3 = t0Var.f21375p;
        if (bVar3 != null) {
            this.f21407a.concat(o(this.f21410d.f21451f, bVar3, eVar));
            this.f21410d.f21452g = t0Var.f21375p;
        } else {
            Canvas canvas = this.f21407a;
            com.caverock.androidsvg.g.b bVar4 = this.f21410d.f21451f;
            canvas.translate(bVar4.f21248a, bVar4.f21249b);
        }
        boolean zM0 = m0();
        F0(t0Var, true);
        if (zM0) {
            j0(t0Var);
        }
        U0(t0Var);
    }

    private float D(float f11, float f12, float f13, float f14) {
        return (f11 * f13) + (f12 * f14);
    }

    private void D0(com.caverock.androidsvg.g.w0 w0Var) {
        y("Text render", new Object[0]);
        W0(this.f21410d, w0Var);
        if (A()) {
            Matrix matrix = w0Var.f21393s;
            if (matrix != null) {
                this.f21407a.concat(matrix);
            }
            List<com.caverock.androidsvg.g.p> list = w0Var.f21244o;
            float f11 = BitmapDescriptorFactory.HUE_RED;
            float fE = (list == null || list.size() == 0) ? 0.0f : w0Var.f21244o.get(0).e(this);
            List<com.caverock.androidsvg.g.p> list2 = w0Var.f21245p;
            float f12 = (list2 == null || list2.size() == 0) ? 0.0f : w0Var.f21245p.get(0).f(this);
            List<com.caverock.androidsvg.g.p> list3 = w0Var.f21246q;
            float fE2 = (list3 == null || list3.size() == 0) ? 0.0f : w0Var.f21246q.get(0).e(this);
            List<com.caverock.androidsvg.g.p> list4 = w0Var.f21247r;
            if (list4 != null && list4.size() != 0) {
                f11 = w0Var.f21247r.get(0).f(this);
            }
            com.caverock.androidsvg.g.e0.f fVarO = O();
            if (fVarO != com.caverock.androidsvg.g.e0.f.Start) {
                float fN = n(w0Var);
                if (fVarO == com.caverock.androidsvg.g.e0.f.Middle) {
                    fN /= 2.0f;
                }
                fE -= fN;
            }
            if (w0Var.f21337h == null) {
                i iVar = new i(fE, f12);
                E(w0Var, iVar);
                RectF rectF = iVar.f21457d;
                w0Var.f21337h = new com.caverock.androidsvg.g.b(rectF.left, rectF.top, rectF.width(), iVar.f21457d.height());
            }
            U0(w0Var);
            r(w0Var);
            p(w0Var);
            boolean zM0 = m0();
            E(w0Var, new f(fE + fE2, f12 + f11));
            if (zM0) {
                j0(w0Var);
            }
        }
    }

    private void E(com.caverock.androidsvg.g.y0 y0Var, j jVar) {
        if (A()) {
            Iterator<com.caverock.androidsvg.g.n0> it = y0Var.f21317i.iterator();
            boolean z11 = true;
            while (it.hasNext()) {
                com.caverock.androidsvg.g.n0 next = it.next();
                if (next instanceof com.caverock.androidsvg.g.c1) {
                    jVar.b(T0(((com.caverock.androidsvg.g.c1) next).f21262c, z11, !it.hasNext()));
                } else {
                    l0(next, jVar);
                }
                z11 = false;
            }
        }
    }

    private void E0(com.caverock.androidsvg.g.e1 e1Var) {
        y("Use render", new Object[0]);
        com.caverock.androidsvg.g.p pVar = e1Var.f21306s;
        if (pVar == null || !pVar.h()) {
            com.caverock.androidsvg.g.p pVar2 = e1Var.f21307t;
            if (pVar2 == null || !pVar2.h()) {
                W0(this.f21410d, e1Var);
                if (A()) {
                    com.caverock.androidsvg.g.n0 n0VarP = e1Var.f21349a.p(e1Var.f21303p);
                    if (n0VarP == null) {
                        F("Use reference '%s' not found", e1Var.f21303p);
                        return;
                    }
                    Matrix matrix = e1Var.f21344o;
                    if (matrix != null) {
                        this.f21407a.concat(matrix);
                    }
                    com.caverock.androidsvg.g.p pVar3 = e1Var.f21304q;
                    float f11 = BitmapDescriptorFactory.HUE_RED;
                    float fE = pVar3 != null ? pVar3.e(this) : 0.0f;
                    com.caverock.androidsvg.g.p pVar4 = e1Var.f21305r;
                    if (pVar4 != null) {
                        f11 = pVar4.f(this);
                    }
                    this.f21407a.translate(fE, f11);
                    p(e1Var);
                    boolean zM0 = m0();
                    i0(e1Var);
                    if (n0VarP instanceof com.caverock.androidsvg.g.f0) {
                        com.caverock.androidsvg.g.b bVarF0 = f0(null, null, e1Var.f21306s, e1Var.f21307t);
                        S0();
                        y0((com.caverock.androidsvg.g.f0) n0VarP, bVarF0);
                        R0();
                    } else if (n0VarP instanceof com.caverock.androidsvg.g.t0) {
                        com.caverock.androidsvg.g.p pVar5 = e1Var.f21306s;
                        if (pVar5 == null) {
                            pVar5 = new com.caverock.androidsvg.g.p(100.0f, com.caverock.androidsvg.g.d1.percent);
                        }
                        com.caverock.androidsvg.g.p pVar6 = e1Var.f21307t;
                        if (pVar6 == null) {
                            pVar6 = new com.caverock.androidsvg.g.p(100.0f, com.caverock.androidsvg.g.d1.percent);
                        }
                        com.caverock.androidsvg.g.b bVarF1 = f0(null, null, pVar5, pVar6);
                        S0();
                        C0((com.caverock.androidsvg.g.t0) n0VarP, bVarF1);
                        R0();
                    } else {
                        A0(n0VarP);
                    }
                    h0();
                    if (zM0) {
                        j0(e1Var);
                    }
                    U0(e1Var);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void F0(com.caverock.androidsvg.g.j0 j0Var, boolean z11) {
        if (z11) {
            i0(j0Var);
        }
        Iterator<com.caverock.androidsvg.g.n0> it = j0Var.getChildren().iterator();
        while (it.hasNext()) {
            A0(it.next());
        }
        if (z11) {
            h0();
        }
    }

    private void G(com.caverock.androidsvg.g.y0 y0Var, StringBuilder sb2) {
        Iterator<com.caverock.androidsvg.g.n0> it = y0Var.f21317i.iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            com.caverock.androidsvg.g.n0 next = it.next();
            if (next instanceof com.caverock.androidsvg.g.y0) {
                G((com.caverock.androidsvg.g.y0) next, sb2);
            } else if (next instanceof com.caverock.androidsvg.g.c1) {
                sb2.append(T0(((com.caverock.androidsvg.g.c1) next).f21262c, z11, !it.hasNext()));
            }
            z11 = false;
        }
    }

    private void H(com.caverock.androidsvg.g.j jVar, String str) {
        com.caverock.androidsvg.g.n0 n0VarP = jVar.f21349a.p(str);
        if (n0VarP == null) {
            Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(n0VarP instanceof com.caverock.androidsvg.g.j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (n0VarP == jVar) {
            F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        com.caverock.androidsvg.g.j jVar2 = (com.caverock.androidsvg.g.j) n0VarP;
        if (jVar.f21333i == null) {
            jVar.f21333i = jVar2.f21333i;
        }
        if (jVar.f21334j == null) {
            jVar.f21334j = jVar2.f21334j;
        }
        if (jVar.f21335k == null) {
            jVar.f21335k = jVar2.f21335k;
        }
        if (jVar.f21332h.isEmpty()) {
            jVar.f21332h = jVar2.f21332h;
        }
        try {
            if (jVar instanceof com.caverock.androidsvg.g.m0) {
                I((com.caverock.androidsvg.g.m0) jVar, (com.caverock.androidsvg.g.m0) n0VarP);
            } else {
                J((com.caverock.androidsvg.g.q0) jVar, (com.caverock.androidsvg.g.q0) n0VarP);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = jVar2.f21336l;
        if (str2 != null) {
            H(jVar, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void H0(com.caverock.androidsvg.g.r r12, com.caverock.androidsvg.h.c r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.h.H0(com.caverock.androidsvg.g$r, com.caverock.androidsvg.h$c):void");
    }

    private void I(com.caverock.androidsvg.g.m0 m0Var, com.caverock.androidsvg.g.m0 m0Var2) {
        if (m0Var.f21345m == null) {
            m0Var.f21345m = m0Var2.f21345m;
        }
        if (m0Var.f21346n == null) {
            m0Var.f21346n = m0Var2.f21346n;
        }
        if (m0Var.f21347o == null) {
            m0Var.f21347o = m0Var2.f21347o;
        }
        if (m0Var.f21348p == null) {
            m0Var.f21348p = m0Var2.f21348p;
        }
    }

    private void I0(com.caverock.androidsvg.g.l lVar) {
        com.caverock.androidsvg.g.r rVar;
        com.caverock.androidsvg.g.r rVar2;
        com.caverock.androidsvg.g.r rVar3;
        List<c> listK;
        int size;
        com.caverock.androidsvg.g.e0 e0Var = this.f21410d.f21446a;
        String str = e0Var.f21300x;
        if (str == null && e0Var.f21301y == null && e0Var.f21302z == null) {
            return;
        }
        if (str == null) {
            rVar = null;
        } else {
            com.caverock.androidsvg.g.n0 n0VarP = lVar.f21349a.p(str);
            if (n0VarP != null) {
                rVar = (com.caverock.androidsvg.g.r) n0VarP;
            } else {
                F("Marker reference '%s' not found", this.f21410d.f21446a.f21300x);
                rVar = null;
            }
        }
        String str2 = this.f21410d.f21446a.f21301y;
        if (str2 == null) {
            rVar2 = null;
        } else {
            com.caverock.androidsvg.g.n0 n0VarP2 = lVar.f21349a.p(str2);
            if (n0VarP2 != null) {
                rVar2 = (com.caverock.androidsvg.g.r) n0VarP2;
            } else {
                F("Marker reference '%s' not found", this.f21410d.f21446a.f21301y);
                rVar2 = null;
            }
        }
        String str3 = this.f21410d.f21446a.f21302z;
        if (str3 == null) {
            rVar3 = null;
        } else {
            com.caverock.androidsvg.g.n0 n0VarP3 = lVar.f21349a.p(str3);
            if (n0VarP3 != null) {
                rVar3 = (com.caverock.androidsvg.g.r) n0VarP3;
            } else {
                F("Marker reference '%s' not found", this.f21410d.f21446a.f21302z);
                rVar3 = null;
            }
        }
        if (lVar instanceof com.caverock.androidsvg.g.v) {
            listK = new b(((com.caverock.androidsvg.g.v) lVar).f21386o).c();
        } else {
            listK = lVar instanceof com.caverock.androidsvg.g.q ? k((com.caverock.androidsvg.g.q) lVar) : l((com.caverock.androidsvg.g.z) lVar);
        }
        if (listK == null || (size = listK.size()) == 0) {
            return;
        }
        com.caverock.androidsvg.g.e0 e0Var2 = this.f21410d.f21446a;
        e0Var2.f21302z = null;
        e0Var2.f21301y = null;
        e0Var2.f21300x = null;
        if (rVar != null) {
            H0(rVar, listK.get(0));
        }
        if (rVar2 != null && listK.size() > 2) {
            c cVarN0 = listK.get(0);
            c cVar = listK.get(1);
            int i11 = 1;
            while (i11 < size - 1) {
                i11++;
                c cVar2 = listK.get(i11);
                cVarN0 = cVar.f21431e ? n0(cVarN0, cVar, cVar2) : cVar;
                H0(rVar2, cVarN0);
                cVar = cVar2;
            }
        }
        if (rVar3 != null) {
            H0(rVar3, listK.get(size - 1));
        }
    }

    private void J(com.caverock.androidsvg.g.q0 q0Var, com.caverock.androidsvg.g.q0 q0Var2) {
        if (q0Var.f21364m == null) {
            q0Var.f21364m = q0Var2.f21364m;
        }
        if (q0Var.f21365n == null) {
            q0Var.f21365n = q0Var2.f21365n;
        }
        if (q0Var.f21366o == null) {
            q0Var.f21366o = q0Var2.f21366o;
        }
        if (q0Var.f21367p == null) {
            q0Var.f21367p = q0Var2.f21367p;
        }
        if (q0Var.f21368q == null) {
            q0Var.f21368q = q0Var2.f21368q;
        }
    }

    private void J0(com.caverock.androidsvg.g.s sVar, com.caverock.androidsvg.g.k0 k0Var, com.caverock.androidsvg.g.b bVar) {
        float fE;
        float f11;
        y("Mask render", new Object[0]);
        Boolean bool = sVar.f21376o;
        if (bool == null || !bool.booleanValue()) {
            com.caverock.androidsvg.g.p pVar = sVar.f21380s;
            float fD = pVar != null ? pVar.d(this, 1.0f) : 1.2f;
            com.caverock.androidsvg.g.p pVar2 = sVar.f21381t;
            float fD2 = pVar2 != null ? pVar2.d(this, 1.0f) : 1.2f;
            fE = fD * bVar.f21250c;
            f11 = fD2 * bVar.f21251d;
        } else {
            com.caverock.androidsvg.g.p pVar3 = sVar.f21380s;
            fE = pVar3 != null ? pVar3.e(this) : bVar.f21250c;
            com.caverock.androidsvg.g.p pVar4 = sVar.f21381t;
            f11 = pVar4 != null ? pVar4.f(this) : bVar.f21251d;
        }
        if (fE == BitmapDescriptorFactory.HUE_RED || f11 == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        S0();
        C0427h c0427hM = M(sVar);
        this.f21410d = c0427hM;
        c0427hM.f21446a.f21289m = Float.valueOf(1.0f);
        boolean zM0 = m0();
        this.f21407a.save();
        Boolean bool2 = sVar.f21377p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f21407a.translate(bVar.f21248a, bVar.f21249b);
            this.f21407a.scale(bVar.f21250c, bVar.f21251d);
        }
        F0(sVar, false);
        this.f21407a.restore();
        if (zM0) {
            k0(k0Var, bVar);
        }
        R0();
    }

    private void K(com.caverock.androidsvg.g.y yVar, String str) {
        com.caverock.androidsvg.g.n0 n0VarP = yVar.f21349a.p(str);
        if (n0VarP == null) {
            Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(n0VarP instanceof com.caverock.androidsvg.g.y)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (n0VarP == yVar) {
            F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        com.caverock.androidsvg.g.y yVar2 = (com.caverock.androidsvg.g.y) n0VarP;
        if (yVar.f21394q == null) {
            yVar.f21394q = yVar2.f21394q;
        }
        if (yVar.f21395r == null) {
            yVar.f21395r = yVar2.f21395r;
        }
        if (yVar.f21396s == null) {
            yVar.f21396s = yVar2.f21396s;
        }
        if (yVar.f21397t == null) {
            yVar.f21397t = yVar2.f21397t;
        }
        if (yVar.f21398u == null) {
            yVar.f21398u = yVar2.f21398u;
        }
        if (yVar.f21399v == null) {
            yVar.f21399v = yVar2.f21399v;
        }
        if (yVar.f21400w == null) {
            yVar.f21400w = yVar2.f21400w;
        }
        if (yVar.f21317i.isEmpty()) {
            yVar.f21317i = yVar2.f21317i;
        }
        if (yVar.f21375p == null) {
            yVar.f21375p = yVar2.f21375p;
        }
        if (yVar.f21359o == null) {
            yVar.f21359o = yVar2.f21359o;
        }
        String str2 = yVar2.f21401x;
        if (str2 != null) {
            K(yVar, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K0(com.caverock.androidsvg.g.s0 s0Var) {
        Set<String> setF;
        String language = Locale.getDefault().getLanguage();
        com.caverock.androidsvg.g.k();
        for (com.caverock.androidsvg.g.n0 n0Var : s0Var.getChildren()) {
            if (n0Var instanceof com.caverock.androidsvg.g.g0) {
                com.caverock.androidsvg.g.g0 g0Var = (com.caverock.androidsvg.g.g0) n0Var;
                if (g0Var.a() == null && ((setF = g0Var.f()) == null || (!setF.isEmpty() && setF.contains(language)))) {
                    Set<String> requiredFeatures = g0Var.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (f21406i == null) {
                            V();
                        }
                        if (requiredFeatures.isEmpty() || !f21406i.containsAll(requiredFeatures)) {
                        }
                    }
                    Set<String> setE = g0Var.e();
                    if (setE != null) {
                        setE.isEmpty();
                    } else {
                        Set<String> setL = g0Var.l();
                        if (setL == null) {
                            A0(n0Var);
                            return;
                        }
                        setL.isEmpty();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x015a  */
    private void L(com.caverock.androidsvg.g.k0 k0Var, Path path, com.caverock.androidsvg.g.y yVar) {
        float fE;
        float f11;
        float f12;
        float fE2;
        boolean z11;
        boolean z12;
        Boolean bool = yVar.f21394q;
        boolean z13 = bool != null && bool.booleanValue();
        String str = yVar.f21401x;
        if (str != null) {
            K(yVar, str);
        }
        if (z13) {
            com.caverock.androidsvg.g.p pVar = yVar.f21397t;
            fE = pVar != null ? pVar.e(this) : 0.0f;
            com.caverock.androidsvg.g.p pVar2 = yVar.f21398u;
            f12 = pVar2 != null ? pVar2.f(this) : 0.0f;
            com.caverock.androidsvg.g.p pVar3 = yVar.f21399v;
            fE2 = pVar3 != null ? pVar3.e(this) : 0.0f;
            com.caverock.androidsvg.g.p pVar4 = yVar.f21400w;
            f11 = pVar4 != null ? pVar4.f(this) : 0.0f;
        } else {
            com.caverock.androidsvg.g.p pVar5 = yVar.f21397t;
            float fD = pVar5 != null ? pVar5.d(this, 1.0f) : 0.0f;
            com.caverock.androidsvg.g.p pVar6 = yVar.f21398u;
            float fD2 = pVar6 != null ? pVar6.d(this, 1.0f) : 0.0f;
            com.caverock.androidsvg.g.p pVar7 = yVar.f21399v;
            float fD3 = pVar7 != null ? pVar7.d(this, 1.0f) : 0.0f;
            com.caverock.androidsvg.g.p pVar8 = yVar.f21400w;
            float fD4 = pVar8 != null ? pVar8.d(this, 1.0f) : 0.0f;
            com.caverock.androidsvg.g.b bVar = k0Var.f21337h;
            float f13 = bVar.f21248a;
            float f14 = bVar.f21250c;
            fE = (fD * f14) + f13;
            float f15 = bVar.f21249b;
            float f16 = bVar.f21251d;
            float f17 = fD3 * f14;
            f11 = fD4 * f16;
            f12 = (fD2 * f16) + f15;
            fE2 = f17;
        }
        if (fE2 == BitmapDescriptorFactory.HUE_RED || f11 == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        com.caverock.androidsvg.e eVar = yVar.f21359o;
        if (eVar == null) {
            eVar = com.caverock.androidsvg.e.f21221e;
        }
        S0();
        this.f21407a.clipPath(path);
        C0427h c0427h = new C0427h();
        V0(c0427h, com.caverock.androidsvg.g.e0.a());
        c0427h.f21446a.f21298v = Boolean.FALSE;
        this.f21410d = N(yVar, c0427h);
        com.caverock.androidsvg.g.b bVar2 = k0Var.f21337h;
        Matrix matrix = yVar.f21396s;
        if (matrix != null) {
            this.f21407a.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (yVar.f21396s.invert(matrix2)) {
                com.caverock.androidsvg.g.b bVar3 = k0Var.f21337h;
                float f18 = bVar3.f21248a;
                float f19 = bVar3.f21249b;
                float fB = bVar3.b();
                com.caverock.androidsvg.g.b bVar4 = k0Var.f21337h;
                z11 = false;
                float f21 = bVar4.f21249b;
                float fB2 = bVar4.b();
                z12 = true;
                float fC = k0Var.f21337h.c();
                com.caverock.androidsvg.g.b bVar5 = k0Var.f21337h;
                float[] fArr = {f18, f19, fB, f21, fB2, fC, bVar5.f21248a, bVar5.c()};
                matrix2.mapPoints(fArr);
                float f22 = fArr[0];
                float f23 = fArr[1];
                RectF rectF = new RectF(f22, f23, f22, f23);
                for (int i11 = 2; i11 <= 6; i11 += 2) {
                    float f24 = fArr[i11];
                    if (f24 < rectF.left) {
                        rectF.left = f24;
                    }
                    if (f24 > rectF.right) {
                        rectF.right = f24;
                    }
                    float f25 = fArr[i11 + 1];
                    if (f25 < rectF.top) {
                        rectF.top = f25;
                    }
                    if (f25 > rectF.bottom) {
                        rectF.bottom = f25;
                    }
                }
                float f26 = rectF.left;
                float f27 = rectF.top;
                bVar2 = new com.caverock.androidsvg.g.b(f26, f27, rectF.right - f26, rectF.bottom - f27);
            } else {
                z11 = false;
                z12 = true;
            }
        } else {
            z11 = false;
            z12 = true;
        }
        float fFloor = fE + (((float) Math.floor((bVar2.f21248a - fE) / fE2)) * fE2);
        float fB3 = bVar2.b();
        float fC2 = bVar2.c();
        com.caverock.androidsvg.g.b bVar6 = new com.caverock.androidsvg.g.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fE2, f11);
        boolean zM0 = m0();
        for (float fFloor2 = f12 + (((float) Math.floor((bVar2.f21249b - f12) / f11)) * f11); fFloor2 < fC2; fFloor2 += f11) {
            float f28 = fFloor;
            while (f28 < fB3) {
                bVar6.f21248a = f28;
                bVar6.f21249b = fFloor2;
                S0();
                if (!this.f21410d.f21446a.f21298v.booleanValue()) {
                    O0(bVar6.f21248a, bVar6.f21249b, bVar6.f21250c, bVar6.f21251d);
                }
                com.caverock.androidsvg.g.b bVar7 = yVar.f21375p;
                if (bVar7 != null) {
                    this.f21407a.concat(o(bVar6, bVar7, eVar));
                } else {
                    Boolean bool2 = yVar.f21395r;
                    boolean z14 = (bool2 == null || bool2.booleanValue()) ? z12 : z11;
                    this.f21407a.translate(f28, fFloor2);
                    if (!z14) {
                        Canvas canvas = this.f21407a;
                        com.caverock.androidsvg.g.b bVar8 = k0Var.f21337h;
                        canvas.scale(bVar8.f21250c, bVar8.f21251d);
                    }
                }
                Iterator<com.caverock.androidsvg.g.n0> it = yVar.f21317i.iterator();
                while (it.hasNext()) {
                    A0(it.next());
                }
                R0();
                f28 += fE2;
                fFloor = fFloor;
            }
        }
        if (zM0) {
            j0(yVar);
        }
        R0();
    }

    private void L0(com.caverock.androidsvg.g.z0 z0Var) {
        y("TextPath render", new Object[0]);
        W0(this.f21410d, z0Var);
        if (A() && Y0()) {
            com.caverock.androidsvg.g.n0 n0VarP = z0Var.f21349a.p(z0Var.f21403o);
            if (n0VarP == null) {
                F("TextPath reference '%s' not found", z0Var.f21403o);
                return;
            }
            com.caverock.androidsvg.g.v vVar = (com.caverock.androidsvg.g.v) n0VarP;
            Path pathC = new d(vVar.f21386o).c();
            Matrix matrix = vVar.f21338n;
            if (matrix != null) {
                pathC.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathC, false);
            com.caverock.androidsvg.g.p pVar = z0Var.f21404p;
            float fD = pVar != null ? pVar.d(this, pathMeasure.getLength()) : 0.0f;
            com.caverock.androidsvg.g.e0.f fVarO = O();
            if (fVarO != com.caverock.androidsvg.g.e0.f.Start) {
                float fN = n(z0Var);
                if (fVarO == com.caverock.androidsvg.g.e0.f.Middle) {
                    fN /= 2.0f;
                }
                fD -= fN;
            }
            r((com.caverock.androidsvg.g.k0) z0Var.c());
            boolean zM0 = m0();
            E(z0Var, new e(pathC, fD, BitmapDescriptorFactory.HUE_RED));
            if (zM0) {
                j0(z0Var);
            }
        }
    }

    private C0427h M(com.caverock.androidsvg.g.n0 n0Var) {
        C0427h c0427h = new C0427h();
        V0(c0427h, com.caverock.androidsvg.g.e0.a());
        return N(n0Var, c0427h);
    }

    private boolean M0() {
        return this.f21410d.f21446a.f21289m.floatValue() < 1.0f || this.f21410d.f21446a.G != null;
    }

    private C0427h N(com.caverock.androidsvg.g.n0 n0Var, C0427h c0427h) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (n0Var instanceof com.caverock.androidsvg.g.l0) {
                arrayList.add(0, (com.caverock.androidsvg.g.l0) n0Var);
            }
            Object obj = n0Var.f21350b;
            if (obj == null) {
                break;
            }
            n0Var = (com.caverock.androidsvg.g.n0) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            W0(c0427h, (com.caverock.androidsvg.g.l0) it.next());
        }
        C0427h c0427h2 = this.f21410d;
        c0427h.f21452g = c0427h2.f21452g;
        c0427h.f21451f = c0427h2.f21451f;
        return c0427h;
    }

    private void N0() {
        this.f21410d = new C0427h();
        this.f21411e = new Stack<>();
        V0(this.f21410d, com.caverock.androidsvg.g.e0.a());
        C0427h c0427h = this.f21410d;
        c0427h.f21451f = null;
        c0427h.f21453h = false;
        this.f21411e.push(new C0427h(c0427h));
        this.f21413g = new Stack<>();
        this.f21412f = new Stack<>();
    }

    private com.caverock.androidsvg.g.e0.f O() {
        com.caverock.androidsvg.g.e0.f fVar;
        com.caverock.androidsvg.g.e0 e0Var = this.f21410d.f21446a;
        if (e0Var.f21296t == com.caverock.androidsvg.g.e0.h.LTR || (fVar = e0Var.f21297u) == com.caverock.androidsvg.g.e0.f.Middle) {
            return e0Var.f21297u;
        }
        com.caverock.androidsvg.g.e0.f fVar2 = com.caverock.androidsvg.g.e0.f.Start;
        return fVar == fVar2 ? com.caverock.androidsvg.g.e0.f.End : fVar2;
    }

    private void O0(float f11, float f12, float f13, float f14) {
        float fE = f13 + f11;
        float f15 = f14 + f12;
        com.caverock.androidsvg.g.c cVar = this.f21410d.f21446a.f21299w;
        if (cVar != null) {
            f11 += cVar.f21261d.e(this);
            f12 += this.f21410d.f21446a.f21299w.f21258a.f(this);
            fE -= this.f21410d.f21446a.f21299w.f21259b.e(this);
            f15 -= this.f21410d.f21446a.f21299w.f21260c.f(this);
        }
        this.f21407a.clipRect(f11, f12, fE, f15);
    }

    private Path.FillType P() {
        com.caverock.androidsvg.g.e0.a aVar = this.f21410d.f21446a.F;
        return (aVar == null || aVar != com.caverock.androidsvg.g.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void P0(C0427h c0427h, boolean z11, com.caverock.androidsvg.g.o0 o0Var) {
        int i11;
        com.caverock.androidsvg.g.e0 e0Var = c0427h.f21446a;
        float fFloatValue = (z11 ? e0Var.f21280d : e0Var.f21282f).floatValue();
        if (o0Var instanceof com.caverock.androidsvg.g.f) {
            i11 = ((com.caverock.androidsvg.g.f) o0Var).f21310a;
        } else if (!(o0Var instanceof com.caverock.androidsvg.g.C0426g)) {
            return;
        } else {
            i11 = c0427h.f21446a.f21290n.f21310a;
        }
        int iX = x(i11, fFloatValue);
        if (z11) {
            c0427h.f21449d.setColor(iX);
        } else {
            c0427h.f21450e.setColor(iX);
        }
    }

    private void Q0(boolean z11, com.caverock.androidsvg.g.c0 c0Var) {
        if (z11) {
            if (W(c0Var.f21341e, 2147483648L)) {
                C0427h c0427h = this.f21410d;
                com.caverock.androidsvg.g.e0 e0Var = c0427h.f21446a;
                com.caverock.androidsvg.g.o0 o0Var = c0Var.f21341e.H;
                e0Var.f21278b = o0Var;
                c0427h.f21447b = o0Var != null;
            }
            if (W(c0Var.f21341e, 4294967296L)) {
                this.f21410d.f21446a.f21280d = c0Var.f21341e.I;
            }
            if (W(c0Var.f21341e, 6442450944L)) {
                C0427h c0427h2 = this.f21410d;
                P0(c0427h2, z11, c0427h2.f21446a.f21278b);
                return;
            }
            return;
        }
        if (W(c0Var.f21341e, 2147483648L)) {
            C0427h c0427h3 = this.f21410d;
            com.caverock.androidsvg.g.e0 e0Var2 = c0427h3.f21446a;
            com.caverock.androidsvg.g.o0 o0Var2 = c0Var.f21341e.H;
            e0Var2.f21281e = o0Var2;
            c0427h3.f21448c = o0Var2 != null;
        }
        if (W(c0Var.f21341e, 4294967296L)) {
            this.f21410d.f21446a.f21282f = c0Var.f21341e.I;
        }
        if (W(c0Var.f21341e, 6442450944L)) {
            C0427h c0427h4 = this.f21410d;
            P0(c0427h4, z11, c0427h4.f21446a.f21281e);
        }
    }

    private void R0() {
        this.f21407a.restore();
        this.f21410d = this.f21411e.pop();
    }

    private void S0() {
        this.f21407a.save();
        this.f21411e.push(this.f21410d);
        this.f21410d = new C0427h(this.f21410d);
    }

    private String T0(String str, boolean z11, boolean z12) {
        if (this.f21410d.f21453h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z11) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z12) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    private Path.FillType U() {
        com.caverock.androidsvg.g.e0.a aVar = this.f21410d.f21446a.f21279c;
        return (aVar == null || aVar != com.caverock.androidsvg.g.e0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void U0(com.caverock.androidsvg.g.k0 k0Var) {
        if (k0Var.f21350b == null || k0Var.f21337h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f21413g.peek().invert(matrix)) {
            com.caverock.androidsvg.g.b bVar = k0Var.f21337h;
            float f11 = bVar.f21248a;
            float f12 = bVar.f21249b;
            float fB = bVar.b();
            com.caverock.androidsvg.g.b bVar2 = k0Var.f21337h;
            float f13 = bVar2.f21249b;
            float fB2 = bVar2.b();
            float fC = k0Var.f21337h.c();
            com.caverock.androidsvg.g.b bVar3 = k0Var.f21337h;
            float[] fArr = {f11, f12, fB, f13, fB2, fC, bVar3.f21248a, bVar3.c()};
            matrix.preConcat(this.f21407a.getMatrix());
            matrix.mapPoints(fArr);
            float f14 = fArr[0];
            float f15 = fArr[1];
            RectF rectF = new RectF(f14, f15, f14, f15);
            for (int i11 = 2; i11 <= 6; i11 += 2) {
                float f16 = fArr[i11];
                if (f16 < rectF.left) {
                    rectF.left = f16;
                }
                if (f16 > rectF.right) {
                    rectF.right = f16;
                }
                float f17 = fArr[i11 + 1];
                if (f17 < rectF.top) {
                    rectF.top = f17;
                }
                if (f17 > rectF.bottom) {
                    rectF.bottom = f17;
                }
            }
            com.caverock.androidsvg.g.k0 k0Var2 = (com.caverock.androidsvg.g.k0) this.f21412f.peek();
            com.caverock.androidsvg.g.b bVar4 = k0Var2.f21337h;
            if (bVar4 == null) {
                k0Var2.f21337h = com.caverock.androidsvg.g.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                bVar4.e(com.caverock.androidsvg.g.b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private static synchronized void V() {
        HashSet<String> hashSet = new HashSet<>();
        f21406i = hashSet;
        hashSet.add("Structure");
        f21406i.add("BasicStructure");
        f21406i.add("ConditionalProcessing");
        f21406i.add("Image");
        f21406i.add("Style");
        f21406i.add("ViewportAttribute");
        f21406i.add("Shape");
        f21406i.add("BasicText");
        f21406i.add("PaintAttribute");
        f21406i.add("BasicPaintAttribute");
        f21406i.add("OpacityAttribute");
        f21406i.add("BasicGraphicsAttribute");
        f21406i.add("Marker");
        f21406i.add("Gradient");
        f21406i.add("Pattern");
        f21406i.add("Clip");
        f21406i.add("BasicClip");
        f21406i.add("Mask");
        f21406i.add("View");
    }

    private void V0(C0427h c0427h, com.caverock.androidsvg.g.e0 e0Var) {
        if (W(e0Var, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF)) {
            c0427h.f21446a.f21290n = e0Var.f21290n;
        }
        if (W(e0Var, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX)) {
            c0427h.f21446a.f21289m = e0Var.f21289m;
        }
        if (W(e0Var, 1L)) {
            c0427h.f21446a.f21278b = e0Var.f21278b;
            com.caverock.androidsvg.g.o0 o0Var = e0Var.f21278b;
            c0427h.f21447b = (o0Var == null || o0Var == com.caverock.androidsvg.g.f.f21309c) ? false : true;
        }
        if (W(e0Var, 4L)) {
            c0427h.f21446a.f21280d = e0Var.f21280d;
        }
        if (W(e0Var, 6149L)) {
            P0(c0427h, true, c0427h.f21446a.f21278b);
        }
        if (W(e0Var, 2L)) {
            c0427h.f21446a.f21279c = e0Var.f21279c;
        }
        if (W(e0Var, 8L)) {
            c0427h.f21446a.f21281e = e0Var.f21281e;
            com.caverock.androidsvg.g.o0 o0Var2 = e0Var.f21281e;
            c0427h.f21448c = (o0Var2 == null || o0Var2 == com.caverock.androidsvg.g.f.f21309c) ? false : true;
        }
        if (W(e0Var, 16L)) {
            c0427h.f21446a.f21282f = e0Var.f21282f;
        }
        if (W(e0Var, 6168L)) {
            P0(c0427h, false, c0427h.f21446a.f21281e);
        }
        if (W(e0Var, 34359738368L)) {
            c0427h.f21446a.L = e0Var.L;
        }
        if (W(e0Var, 32L)) {
            com.caverock.androidsvg.g.e0 e0Var2 = c0427h.f21446a;
            com.caverock.androidsvg.g.p pVar = e0Var.f21283g;
            e0Var2.f21283g = pVar;
            c0427h.f21450e.setStrokeWidth(pVar.c(this));
        }
        if (W(e0Var, 64L)) {
            c0427h.f21446a.f21284h = e0Var.f21284h;
            int i11 = a.f21416b[e0Var.f21284h.ordinal()];
            if (i11 == 1) {
                c0427h.f21450e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i11 == 2) {
                c0427h.f21450e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i11 == 3) {
                c0427h.f21450e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(e0Var, 128L)) {
            c0427h.f21446a.f21285i = e0Var.f21285i;
            int i12 = a.f21417c[e0Var.f21285i.ordinal()];
            if (i12 == 1) {
                c0427h.f21450e.setStrokeJoin(Paint.Join.MITER);
            } else if (i12 == 2) {
                c0427h.f21450e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i12 == 3) {
                c0427h.f21450e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(e0Var, 256L)) {
            c0427h.f21446a.f21286j = e0Var.f21286j;
            c0427h.f21450e.setStrokeMiter(e0Var.f21286j.floatValue());
        }
        if (W(e0Var, 512L)) {
            c0427h.f21446a.f21287k = e0Var.f21287k;
        }
        if (W(e0Var, 1024L)) {
            c0427h.f21446a.f21288l = e0Var.f21288l;
        }
        Typeface typefaceT = null;
        if (W(e0Var, 1536L)) {
            com.caverock.androidsvg.g.p[] pVarArr = c0427h.f21446a.f21287k;
            if (pVarArr == null) {
                c0427h.f21450e.setPathEffect(null);
            } else {
                int length = pVarArr.length;
                int i13 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i13];
                float f11 = 0.0f;
                for (int i14 = 0; i14 < i13; i14++) {
                    float fC = c0427h.f21446a.f21287k[i14 % length].c(this);
                    fArr[i14] = fC;
                    f11 += fC;
                }
                if (f11 == BitmapDescriptorFactory.HUE_RED) {
                    c0427h.f21450e.setPathEffect(null);
                } else {
                    float fC2 = c0427h.f21446a.f21288l.c(this);
                    if (fC2 < BitmapDescriptorFactory.HUE_RED) {
                        fC2 = (fC2 % f11) + f11;
                    }
                    c0427h.f21450e.setPathEffect(new DashPathEffect(fArr, fC2));
                }
            }
        }
        if (W(e0Var, Http2Stream.EMIT_BUFFER_SIZE)) {
            float fQ = Q();
            c0427h.f21446a.f21292p = e0Var.f21292p;
            c0427h.f21449d.setTextSize(e0Var.f21292p.d(this, fQ));
            c0427h.f21450e.setTextSize(e0Var.f21292p.d(this, fQ));
        }
        if (W(e0Var, FileAppender.DEFAULT_BUFFER_SIZE)) {
            c0427h.f21446a.f21291o = e0Var.f21291o;
        }
        if (W(e0Var, 32768L)) {
            if (e0Var.f21293q.intValue() == -1 && c0427h.f21446a.f21293q.intValue() > 100) {
                com.caverock.androidsvg.g.e0 e0Var3 = c0427h.f21446a;
                e0Var3.f21293q = Integer.valueOf(e0Var3.f21293q.intValue() - 100);
            } else if (e0Var.f21293q.intValue() != 1 || c0427h.f21446a.f21293q.intValue() >= 900) {
                c0427h.f21446a.f21293q = e0Var.f21293q;
            } else {
                com.caverock.androidsvg.g.e0 e0Var4 = c0427h.f21446a;
                e0Var4.f21293q = Integer.valueOf(e0Var4.f21293q.intValue() + 100);
            }
        }
        if (W(e0Var, 65536L)) {
            c0427h.f21446a.f21294r = e0Var.f21294r;
        }
        if (W(e0Var, 106496L)) {
            if (c0427h.f21446a.f21291o != null && this.f21409c != null) {
                com.caverock.androidsvg.g.k();
                for (String str : c0427h.f21446a.f21291o) {
                    com.caverock.androidsvg.g.e0 e0Var5 = c0427h.f21446a;
                    typefaceT = t(str, e0Var5.f21293q, e0Var5.f21294r);
                    if (typefaceT != null) {
                        break;
                    }
                }
            }
            if (typefaceT == null) {
                com.caverock.androidsvg.g.e0 e0Var6 = c0427h.f21446a;
                typefaceT = t("serif", e0Var6.f21293q, e0Var6.f21294r);
            }
            c0427h.f21449d.setTypeface(typefaceT);
            c0427h.f21450e.setTypeface(typefaceT);
        }
        if (W(e0Var, 131072L)) {
            c0427h.f21446a.f21295s = e0Var.f21295s;
            Paint paint = c0427h.f21449d;
            com.caverock.androidsvg.g.e0.EnumC0425g enumC0425g = e0Var.f21295s;
            com.caverock.androidsvg.g.e0.EnumC0425g enumC0425g2 = com.caverock.androidsvg.g.e0.EnumC0425g.LineThrough;
            paint.setStrikeThruText(enumC0425g == enumC0425g2);
            Paint paint2 = c0427h.f21449d;
            com.caverock.androidsvg.g.e0.EnumC0425g enumC0425g3 = e0Var.f21295s;
            com.caverock.androidsvg.g.e0.EnumC0425g enumC0425g4 = com.caverock.androidsvg.g.e0.EnumC0425g.Underline;
            paint2.setUnderlineText(enumC0425g3 == enumC0425g4);
            c0427h.f21450e.setStrikeThruText(e0Var.f21295s == enumC0425g2);
            c0427h.f21450e.setUnderlineText(e0Var.f21295s == enumC0425g4);
        }
        if (W(e0Var, 68719476736L)) {
            c0427h.f21446a.f21296t = e0Var.f21296t;
        }
        if (W(e0Var, 262144L)) {
            c0427h.f21446a.f21297u = e0Var.f21297u;
        }
        if (W(e0Var, 524288L)) {
            c0427h.f21446a.f21298v = e0Var.f21298v;
        }
        if (W(e0Var, 2097152L)) {
            c0427h.f21446a.f21300x = e0Var.f21300x;
        }
        if (W(e0Var, 4194304L)) {
            c0427h.f21446a.f21301y = e0Var.f21301y;
        }
        if (W(e0Var, 8388608L)) {
            c0427h.f21446a.f21302z = e0Var.f21302z;
        }
        if (W(e0Var, 16777216L)) {
            c0427h.f21446a.A = e0Var.A;
        }
        if (W(e0Var, 33554432L)) {
            c0427h.f21446a.B = e0Var.B;
        }
        if (W(e0Var, 1048576L)) {
            c0427h.f21446a.f21299w = e0Var.f21299w;
        }
        if (W(e0Var, 268435456L)) {
            c0427h.f21446a.E = e0Var.E;
        }
        if (W(e0Var, 536870912L)) {
            c0427h.f21446a.F = e0Var.F;
        }
        if (W(e0Var, FileSize.GB_COEFFICIENT)) {
            c0427h.f21446a.G = e0Var.G;
        }
        if (W(e0Var, 67108864L)) {
            c0427h.f21446a.C = e0Var.C;
        }
        if (W(e0Var, 134217728L)) {
            c0427h.f21446a.D = e0Var.D;
        }
        if (W(e0Var, 8589934592L)) {
            c0427h.f21446a.J = e0Var.J;
        }
        if (W(e0Var, 17179869184L)) {
            c0427h.f21446a.K = e0Var.K;
        }
        if (W(e0Var, 137438953472L)) {
            c0427h.f21446a.M = e0Var.M;
        }
    }

    private boolean W(com.caverock.androidsvg.g.e0 e0Var, long j11) {
        return (e0Var.f21277a & j11) != 0;
    }

    private void W0(C0427h c0427h, com.caverock.androidsvg.g.l0 l0Var) {
        c0427h.f21446a.b(l0Var.f21350b == null);
        com.caverock.androidsvg.g.e0 e0Var = l0Var.f21341e;
        if (e0Var != null) {
            V0(c0427h, e0Var);
        }
        if (this.f21409c.n()) {
            for (com.caverock.androidsvg.b.p pVar : this.f21409c.d()) {
                if (com.caverock.androidsvg.b.l(this.f21414h, pVar.f21203a, l0Var)) {
                    V0(c0427h, pVar.f21204b);
                }
            }
        }
        com.caverock.androidsvg.g.e0 e0Var2 = l0Var.f21342f;
        if (e0Var2 != null) {
            V0(c0427h, e0Var2);
        }
    }

    private void X(boolean z11, com.caverock.androidsvg.g.b bVar, com.caverock.androidsvg.g.m0 m0Var) {
        float fD;
        float f11;
        float fD2;
        float f12;
        String str = m0Var.f21336l;
        if (str != null) {
            H(m0Var, str);
        }
        Boolean bool = m0Var.f21333i;
        int i11 = 0;
        boolean z12 = bool != null && bool.booleanValue();
        C0427h c0427h = this.f21410d;
        Paint paint = z11 ? c0427h.f21449d : c0427h.f21450e;
        if (z12) {
            com.caverock.androidsvg.g.b bVarS = S();
            com.caverock.androidsvg.g.p pVar = m0Var.f21345m;
            float fE = pVar != null ? pVar.e(this) : BitmapDescriptorFactory.HUE_RED;
            com.caverock.androidsvg.g.p pVar2 = m0Var.f21346n;
            fD = pVar2 != null ? pVar2.f(this) : BitmapDescriptorFactory.HUE_RED;
            com.caverock.androidsvg.g.p pVar3 = m0Var.f21347o;
            float fE2 = pVar3 != null ? pVar3.e(this) : bVarS.f21250c;
            com.caverock.androidsvg.g.p pVar4 = m0Var.f21348p;
            f12 = fE2;
            f11 = fE;
            fD2 = pVar4 != null ? pVar4.f(this) : BitmapDescriptorFactory.HUE_RED;
        } else {
            com.caverock.androidsvg.g.p pVar5 = m0Var.f21345m;
            float fD3 = pVar5 != null ? pVar5.d(this, 1.0f) : BitmapDescriptorFactory.HUE_RED;
            com.caverock.androidsvg.g.p pVar6 = m0Var.f21346n;
            fD = pVar6 != null ? pVar6.d(this, 1.0f) : BitmapDescriptorFactory.HUE_RED;
            com.caverock.androidsvg.g.p pVar7 = m0Var.f21347o;
            float fD4 = pVar7 != null ? pVar7.d(this, 1.0f) : 1.0f;
            com.caverock.androidsvg.g.p pVar8 = m0Var.f21348p;
            f11 = fD3;
            fD2 = pVar8 != null ? pVar8.d(this, 1.0f) : BitmapDescriptorFactory.HUE_RED;
            f12 = fD4;
        }
        float f13 = fD;
        S0();
        this.f21410d = M(m0Var);
        Matrix matrix = new Matrix();
        if (!z12) {
            matrix.preTranslate(bVar.f21248a, bVar.f21249b);
            matrix.preScale(bVar.f21250c, bVar.f21251d);
        }
        Matrix matrix2 = m0Var.f21334j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m0Var.f21332h.size();
        if (size == 0) {
            R0();
            if (z11) {
                this.f21410d.f21447b = false;
                return;
            } else {
                this.f21410d.f21448c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<com.caverock.androidsvg.g.n0> it = m0Var.f21332h.iterator();
        float f14 = -1.0f;
        while (it.hasNext()) {
            com.caverock.androidsvg.g.d0 d0Var = (com.caverock.androidsvg.g.d0) it.next();
            Float f15 = d0Var.f21267h;
            float fFloatValue = f15 != null ? f15.floatValue() : BitmapDescriptorFactory.HUE_RED;
            if (i11 == 0 || fFloatValue >= f14) {
                fArr[i11] = fFloatValue;
                f14 = fFloatValue;
            } else {
                fArr[i11] = f14;
            }
            S0();
            W0(this.f21410d, d0Var);
            com.caverock.androidsvg.g.e0 e0Var = this.f21410d.f21446a;
            com.caverock.androidsvg.g.f fVar = (com.caverock.androidsvg.g.f) e0Var.C;
            if (fVar == null) {
                fVar = com.caverock.androidsvg.g.f.f21308b;
            }
            iArr[i11] = x(fVar.f21310a, e0Var.D.floatValue());
            i11++;
            R0();
        }
        if ((f11 == f12 && f13 == fD2) || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        com.caverock.androidsvg.g.k kVar = m0Var.f21335k;
        if (kVar != null) {
            if (kVar == com.caverock.androidsvg.g.k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (kVar == com.caverock.androidsvg.g.k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        LinearGradient linearGradient = new LinearGradient(f11, f13, f12, fD2, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(w(this.f21410d.f21446a.f21280d.floatValue()));
    }

    private void X0() {
        int iX;
        com.caverock.androidsvg.g.e0 e0Var = this.f21410d.f21446a;
        com.caverock.androidsvg.g.o0 o0Var = e0Var.J;
        if (o0Var instanceof com.caverock.androidsvg.g.f) {
            iX = ((com.caverock.androidsvg.g.f) o0Var).f21310a;
        } else if (!(o0Var instanceof com.caverock.androidsvg.g.C0426g)) {
            return;
        } else {
            iX = e0Var.f21290n.f21310a;
        }
        Float f11 = e0Var.K;
        if (f11 != null) {
            iX = x(iX, f11.floatValue());
        }
        this.f21407a.drawColor(iX);
    }

    private Path Y(com.caverock.androidsvg.g.d dVar) {
        com.caverock.androidsvg.g.p pVar = dVar.f21264o;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float fE = pVar != null ? pVar.e(this) : 0.0f;
        com.caverock.androidsvg.g.p pVar2 = dVar.f21265p;
        if (pVar2 != null) {
            f11 = pVar2.f(this);
        }
        float f12 = f11;
        float fC = dVar.f21266q.c(this);
        float f13 = fE - fC;
        float f14 = f12 - fC;
        float f15 = fE + fC;
        float f16 = f12 + fC;
        if (dVar.f21337h == null) {
            float f17 = 2.0f * fC;
            dVar.f21337h = new com.caverock.androidsvg.g.b(f13, f14, f17, f17);
        }
        float f18 = fC * 0.5522848f;
        Path path = new Path();
        path.moveTo(fE, f14);
        float f19 = fE + f18;
        float f21 = f12 - f18;
        path.cubicTo(f19, f14, f15, f21, f15, f12);
        float f22 = f12 + f18;
        path.cubicTo(f15, f22, f19, f16, fE, f16);
        float f23 = fE - f18;
        path.cubicTo(f23, f16, f13, f22, f13, f12);
        path.cubicTo(f13, f21, f23, f14, fE, f14);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Y0() {
        Boolean bool = this.f21410d.f21446a.B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private Path Z(com.caverock.androidsvg.g.i iVar) {
        com.caverock.androidsvg.g.p pVar = iVar.f21323o;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float fE = pVar != null ? pVar.e(this) : 0.0f;
        com.caverock.androidsvg.g.p pVar2 = iVar.f21324p;
        if (pVar2 != null) {
            f11 = pVar2.f(this);
        }
        float f12 = f11;
        float fE2 = iVar.f21325q.e(this);
        float f13 = iVar.f21326r.f(this);
        float f14 = fE - fE2;
        float f15 = f12 - f13;
        float f16 = fE + fE2;
        float f17 = f12 + f13;
        if (iVar.f21337h == null) {
            iVar.f21337h = new com.caverock.androidsvg.g.b(f14, f15, fE2 * 2.0f, 2.0f * f13);
        }
        float f18 = fE2 * 0.5522848f;
        float f19 = f13 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fE, f15);
        float f21 = fE + f18;
        float f22 = f12 - f19;
        path.cubicTo(f21, f15, f16, f22, f16, f12);
        float f23 = f12 + f19;
        path.cubicTo(f16, f23, f21, f17, fE, f17);
        float f24 = fE - f18;
        path.cubicTo(f24, f17, f14, f23, f14, f12);
        path.cubicTo(f14, f22, f24, f15, fE, f15);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private Path a0(com.caverock.androidsvg.g.q qVar) {
        com.caverock.androidsvg.g.p pVar = qVar.f21360o;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float fE = pVar == null ? 0.0f : pVar.e(this);
        com.caverock.androidsvg.g.p pVar2 = qVar.f21361p;
        float f12 = pVar2 == null ? 0.0f : pVar2.f(this);
        com.caverock.androidsvg.g.p pVar3 = qVar.f21362q;
        float fE2 = pVar3 == null ? 0.0f : pVar3.e(this);
        com.caverock.androidsvg.g.p pVar4 = qVar.f21363r;
        if (pVar4 != null) {
            f11 = pVar4.f(this);
        }
        if (qVar.f21337h == null) {
            qVar.f21337h = new com.caverock.androidsvg.g.b(Math.min(fE, fE2), Math.min(f12, f11), Math.abs(fE2 - fE), Math.abs(f11 - f12));
        }
        Path path = new Path();
        path.moveTo(fE, f12);
        path.lineTo(fE2, f11);
        return path;
    }

    private Path b0(com.caverock.androidsvg.g.z zVar) {
        Path path = new Path();
        float[] fArr = zVar.f21402o;
        path.moveTo(fArr[0], fArr[1]);
        int i11 = 2;
        while (true) {
            float[] fArr2 = zVar.f21402o;
            if (i11 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i11], fArr2[i11 + 1]);
            i11 += 2;
        }
        if (zVar instanceof com.caverock.androidsvg.g.a0) {
            path.close();
        }
        if (zVar.f21337h == null) {
            zVar.f21337h = m(path);
        }
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    private Path c0(com.caverock.androidsvg.g.b0 b0Var) {
        float fE;
        float f11;
        float fMin;
        com.caverock.androidsvg.g.p pVar;
        float fE2;
        com.caverock.androidsvg.g.p pVar2;
        float f12;
        float fE3;
        float f13;
        float f14;
        float f15;
        Path path;
        com.caverock.androidsvg.g.p pVar3 = b0Var.f21256s;
        if (pVar3 == null && b0Var.f21257t == null) {
            fE = 0.0f;
        } else {
            if (pVar3 != null) {
                if (b0Var.f21257t == null) {
                    fE = pVar3.e(this);
                } else {
                    fE = pVar3.e(this);
                    f11 = b0Var.f21257t.f(this);
                }
                fMin = Math.min(fE, b0Var.f21254q.e(this) / 2.0f);
                float fMin2 = Math.min(f11, b0Var.f21255r.f(this) / 2.0f);
                pVar = b0Var.f21252o;
                if (pVar != null) {
                    fE2 = pVar.e(this);
                } else {
                    fE2 = 0.0f;
                }
                pVar2 = b0Var.f21253p;
                if (pVar2 != null) {
                    f12 = pVar2.f(this);
                } else {
                    f12 = 0.0f;
                }
                fE3 = b0Var.f21254q.e(this);
                f13 = b0Var.f21255r.f(this);
                if (b0Var.f21337h == null) {
                    b0Var.f21337h = new com.caverock.androidsvg.g.b(fE2, f12, fE3, f13);
                }
                f14 = fE3 + fE2;
                f15 = f12 + f13;
                path = new Path();
                if (fMin != BitmapDescriptorFactory.HUE_RED || fMin2 == BitmapDescriptorFactory.HUE_RED) {
                    path.moveTo(fE2, f12);
                    path.lineTo(f14, f12);
                    path.lineTo(f14, f15);
                    path.lineTo(fE2, f15);
                    path.lineTo(fE2, f12);
                } else {
                    float f16 = fMin * 0.5522848f;
                    float f17 = 0.5522848f * fMin2;
                    float f18 = f12 + fMin2;
                    path.moveTo(fE2, f18);
                    float f19 = f18 - f17;
                    float f21 = fE2 + fMin;
                    float f22 = f21 - f16;
                    path.cubicTo(fE2, f19, f22, f12, f21, f12);
                    float f23 = f14 - fMin;
                    path.lineTo(f23, f12);
                    float f24 = f23 + f16;
                    path.cubicTo(f24, f12, f14, f19, f14, f18);
                    float f25 = f15 - fMin2;
                    path.lineTo(f14, f25);
                    float f26 = f25 + f17;
                    path.cubicTo(f14, f26, f24, f15, f23, f15);
                    path.lineTo(f21, f15);
                    float f27 = fE2;
                    path.cubicTo(f22, f15, f27, f26, fE2, f25);
                    path.lineTo(f27, f18);
                }
                path.close();
                return path;
            }
            fE = b0Var.f21257t.f(this);
        }
        f11 = fE;
        fMin = Math.min(fE, b0Var.f21254q.e(this) / 2.0f);
        float fMin3 = Math.min(f11, b0Var.f21255r.f(this) / 2.0f);
        pVar = b0Var.f21252o;
        if (pVar != null) {
            fE2 = pVar.e(this);
        } else {
            fE2 = 0.0f;
        }
        pVar2 = b0Var.f21253p;
        if (pVar2 != null) {
            f12 = pVar2.f(this);
        } else {
            f12 = 0.0f;
        }
        fE3 = b0Var.f21254q.e(this);
        f13 = b0Var.f21255r.f(this);
        if (b0Var.f21337h == null) {
            b0Var.f21337h = new com.caverock.androidsvg.g.b(fE2, f12, fE3, f13);
        }
        f14 = fE3 + fE2;
        f15 = f12 + f13;
        path = new Path();
        if (fMin != BitmapDescriptorFactory.HUE_RED) {
            path.moveTo(fE2, f12);
            path.lineTo(f14, f12);
            path.lineTo(f14, f15);
            path.lineTo(fE2, f15);
            path.lineTo(fE2, f12);
        } else {
            path.moveTo(fE2, f12);
            path.lineTo(f14, f12);
            path.lineTo(f14, f15);
            path.lineTo(fE2, f15);
            path.lineTo(fE2, f12);
        }
        path.close();
        return path;
    }

    private Path d0(com.caverock.androidsvg.g.w0 w0Var) {
        List<com.caverock.androidsvg.g.p> list = w0Var.f21244o;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float fE = (list == null || list.size() == 0) ? 0.0f : w0Var.f21244o.get(0).e(this);
        List<com.caverock.androidsvg.g.p> list2 = w0Var.f21245p;
        float f12 = (list2 == null || list2.size() == 0) ? 0.0f : w0Var.f21245p.get(0).f(this);
        List<com.caverock.androidsvg.g.p> list3 = w0Var.f21246q;
        float fE2 = (list3 == null || list3.size() == 0) ? 0.0f : w0Var.f21246q.get(0).e(this);
        List<com.caverock.androidsvg.g.p> list4 = w0Var.f21247r;
        if (list4 != null && list4.size() != 0) {
            f11 = w0Var.f21247r.get(0).f(this);
        }
        if (this.f21410d.f21446a.f21297u != com.caverock.androidsvg.g.e0.f.Start) {
            float fN = n(w0Var);
            if (this.f21410d.f21446a.f21297u == com.caverock.androidsvg.g.e0.f.Middle) {
                fN /= 2.0f;
            }
            fE -= fN;
        }
        if (w0Var.f21337h == null) {
            i iVar = new i(fE, f12);
            E(w0Var, iVar);
            RectF rectF = iVar.f21457d;
            w0Var.f21337h = new com.caverock.androidsvg.g.b(rectF.left, rectF.top, rectF.width(), iVar.f21457d.height());
        }
        Path path = new Path();
        E(w0Var, new g(fE + fE2, f12 + f11, path));
        return path;
    }

    private void e0(boolean z11, com.caverock.androidsvg.g.b bVar, com.caverock.androidsvg.g.q0 q0Var) {
        float f11;
        float fD;
        float f12;
        String str = q0Var.f21336l;
        if (str != null) {
            H(q0Var, str);
        }
        Boolean bool = q0Var.f21333i;
        int i11 = 0;
        boolean z12 = bool != null && bool.booleanValue();
        C0427h c0427h = this.f21410d;
        Paint paint = z11 ? c0427h.f21449d : c0427h.f21450e;
        if (z12) {
            com.caverock.androidsvg.g.p pVar = new com.caverock.androidsvg.g.p(50.0f, com.caverock.androidsvg.g.d1.percent);
            com.caverock.androidsvg.g.p pVar2 = q0Var.f21364m;
            float fE = pVar2 != null ? pVar2.e(this) : pVar.e(this);
            com.caverock.androidsvg.g.p pVar3 = q0Var.f21365n;
            float f13 = pVar3 != null ? pVar3.f(this) : pVar.f(this);
            com.caverock.androidsvg.g.p pVar4 = q0Var.f21366o;
            fD = pVar4 != null ? pVar4.c(this) : pVar.c(this);
            f11 = fE;
            f12 = f13;
        } else {
            com.caverock.androidsvg.g.p pVar5 = q0Var.f21364m;
            float fD2 = pVar5 != null ? pVar5.d(this, 1.0f) : 0.5f;
            com.caverock.androidsvg.g.p pVar6 = q0Var.f21365n;
            float fD3 = pVar6 != null ? pVar6.d(this, 1.0f) : 0.5f;
            com.caverock.androidsvg.g.p pVar7 = q0Var.f21366o;
            f11 = fD2;
            fD = pVar7 != null ? pVar7.d(this, 1.0f) : 0.5f;
            f12 = fD3;
        }
        S0();
        this.f21410d = M(q0Var);
        Matrix matrix = new Matrix();
        if (!z12) {
            matrix.preTranslate(bVar.f21248a, bVar.f21249b);
            matrix.preScale(bVar.f21250c, bVar.f21251d);
        }
        Matrix matrix2 = q0Var.f21334j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q0Var.f21332h.size();
        if (size == 0) {
            R0();
            if (z11) {
                this.f21410d.f21447b = false;
                return;
            } else {
                this.f21410d.f21448c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<com.caverock.androidsvg.g.n0> it = q0Var.f21332h.iterator();
        float f14 = -1.0f;
        while (it.hasNext()) {
            com.caverock.androidsvg.g.d0 d0Var = (com.caverock.androidsvg.g.d0) it.next();
            Float f15 = d0Var.f21267h;
            float fFloatValue = f15 != null ? f15.floatValue() : 0.0f;
            if (i11 == 0 || fFloatValue >= f14) {
                fArr[i11] = fFloatValue;
                f14 = fFloatValue;
            } else {
                fArr[i11] = f14;
            }
            S0();
            W0(this.f21410d, d0Var);
            com.caverock.androidsvg.g.e0 e0Var = this.f21410d.f21446a;
            com.caverock.androidsvg.g.f fVar = (com.caverock.androidsvg.g.f) e0Var.C;
            if (fVar == null) {
                fVar = com.caverock.androidsvg.g.f.f21308b;
            }
            iArr[i11] = x(fVar.f21310a, e0Var.D.floatValue());
            i11++;
            R0();
        }
        if (fD == BitmapDescriptorFactory.HUE_RED || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        com.caverock.androidsvg.g.k kVar = q0Var.f21335k;
        if (kVar != null) {
            if (kVar == com.caverock.androidsvg.g.k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (kVar == com.caverock.androidsvg.g.k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        RadialGradient radialGradient = new RadialGradient(f11, f12, fD, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(w(this.f21410d.f21446a.f21280d.floatValue()));
    }

    private com.caverock.androidsvg.g.b f0(com.caverock.androidsvg.g.p pVar, com.caverock.androidsvg.g.p pVar2, com.caverock.androidsvg.g.p pVar3, com.caverock.androidsvg.g.p pVar4) {
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float fE = pVar != null ? pVar.e(this) : 0.0f;
        if (pVar2 != null) {
            f11 = pVar2.f(this);
        }
        com.caverock.androidsvg.g.b bVarS = S();
        return new com.caverock.androidsvg.g.b(fE, f11, pVar3 != null ? pVar3.e(this) : bVarS.f21250c, pVar4 != null ? pVar4.f(this) : bVarS.f21251d);
    }

    @TargetApi(19)
    private Path g0(com.caverock.androidsvg.g.k0 k0Var, boolean z11) {
        Path pathD0;
        Path pathJ;
        this.f21411e.push(this.f21410d);
        C0427h c0427h = new C0427h(this.f21410d);
        this.f21410d = c0427h;
        W0(c0427h, k0Var);
        if (!A() || !Y0()) {
            this.f21410d = this.f21411e.pop();
            return null;
        }
        if (k0Var instanceof com.caverock.androidsvg.g.e1) {
            if (!z11) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            com.caverock.androidsvg.g.e1 e1Var = (com.caverock.androidsvg.g.e1) k0Var;
            com.caverock.androidsvg.g.n0 n0VarP = k0Var.f21349a.p(e1Var.f21303p);
            if (n0VarP == null) {
                F("Use reference '%s' not found", e1Var.f21303p);
                this.f21410d = this.f21411e.pop();
                return null;
            }
            if (!(n0VarP instanceof com.caverock.androidsvg.g.k0)) {
                this.f21410d = this.f21411e.pop();
                return null;
            }
            pathD0 = g0((com.caverock.androidsvg.g.k0) n0VarP, false);
            if (pathD0 == null) {
                return null;
            }
            if (e1Var.f21337h == null) {
                e1Var.f21337h = m(pathD0);
            }
            Matrix matrix = e1Var.f21344o;
            if (matrix != null) {
                pathD0.transform(matrix);
            }
        } else if (k0Var instanceof com.caverock.androidsvg.g.l) {
            com.caverock.androidsvg.g.l lVar = (com.caverock.androidsvg.g.l) k0Var;
            if (k0Var instanceof com.caverock.androidsvg.g.v) {
                pathD0 = new d(((com.caverock.androidsvg.g.v) k0Var).f21386o).c();
                if (k0Var.f21337h == null) {
                    k0Var.f21337h = m(pathD0);
                }
            } else if (k0Var instanceof com.caverock.androidsvg.g.b0) {
                pathD0 = c0((com.caverock.androidsvg.g.b0) k0Var);
            } else if (k0Var instanceof com.caverock.androidsvg.g.d) {
                pathD0 = Y((com.caverock.androidsvg.g.d) k0Var);
            } else if (k0Var instanceof com.caverock.androidsvg.g.i) {
                pathD0 = Z((com.caverock.androidsvg.g.i) k0Var);
            } else {
                pathD0 = k0Var instanceof com.caverock.androidsvg.g.z ? b0((com.caverock.androidsvg.g.z) k0Var) : null;
            }
            if (pathD0 == null) {
                return null;
            }
            if (lVar.f21337h == null) {
                lVar.f21337h = m(pathD0);
            }
            Matrix matrix2 = lVar.f21338n;
            if (matrix2 != null) {
                pathD0.transform(matrix2);
            }
            pathD0.setFillType(P());
        } else {
            if (!(k0Var instanceof com.caverock.androidsvg.g.w0)) {
                F("Invalid %s element found in clipPath definition", k0Var.m());
                return null;
            }
            com.caverock.androidsvg.g.w0 w0Var = (com.caverock.androidsvg.g.w0) k0Var;
            pathD0 = d0(w0Var);
            if (pathD0 == null) {
                return null;
            }
            Matrix matrix3 = w0Var.f21393s;
            if (matrix3 != null) {
                pathD0.transform(matrix3);
            }
            pathD0.setFillType(P());
        }
        if (this.f21410d.f21446a.E != null && (pathJ = j(k0Var, k0Var.f21337h)) != null) {
            pathD0.op(pathJ, Path.Op.INTERSECT);
        }
        this.f21410d = this.f21411e.pop();
        return pathD0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(float f11, float f12, float f13, float f14, float f15, boolean z11, boolean z12, float f16, float f17, com.caverock.androidsvg.g.x xVar) {
        if (f11 == f16 && f12 == f17) {
            return;
        }
        if (f13 == BitmapDescriptorFactory.HUE_RED || f14 == BitmapDescriptorFactory.HUE_RED) {
            xVar.lineTo(f16, f17);
            return;
        }
        float fAbs = Math.abs(f13);
        float fAbs2 = Math.abs(f14);
        double radians = Math.toRadians(((double) f15) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d11 = ((double) (f11 - f16)) / 2.0d;
        double d12 = ((double) (f12 - f17)) / 2.0d;
        double d13 = (dCos * d11) + (dSin * d12);
        double d14 = ((-dSin) * d11) + (dCos * d12);
        double d15 = fAbs * fAbs;
        double d16 = fAbs2 * fAbs2;
        double d17 = d13 * d13;
        double d18 = d14 * d14;
        double d19 = (d17 / d15) + (d18 / d16);
        if (d19 > 0.99999d) {
            double dSqrt = Math.sqrt(d19) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d15 = fAbs * fAbs;
            d16 = fAbs2 * fAbs2;
        }
        double d21 = z11 == z12 ? -1.0d : 1.0d;
        double d22 = d15 * d16;
        double d23 = d15 * d18;
        double d24 = d16 * d17;
        double d25 = ((d22 - d23) - d24) / (d23 + d24);
        if (d25 < 0.0d) {
            d25 = 0.0d;
        }
        double dSqrt2 = d21 * Math.sqrt(d25);
        double d26 = fAbs;
        double d27 = fAbs2;
        double d28 = ((d26 * d14) / d27) * dSqrt2;
        double d29 = (-((d27 * d13) / d26)) * dSqrt2;
        double d31 = (((double) (f11 + f16)) / 2.0d) + ((dCos * d28) - (dSin * d29));
        double d32 = (((double) (f12 + f17)) / 2.0d) + (dSin * d28) + (dCos * d29);
        double d33 = (d13 - d28) / d26;
        double d34 = (d14 - d29) / d27;
        double d35 = ((-d13) - d28) / d26;
        double d36 = ((-d14) - d29) / d27;
        double d37 = (d33 * d33) + (d34 * d34);
        double dAcos = (d34 < 0.0d ? -1.0d : 1.0d) * Math.acos(d33 / Math.sqrt(d37));
        double dV = ((d33 * d36) - (d34 * d35) < 0.0d ? -1.0d : 1.0d) * v(((d33 * d35) + (d34 * d36)) / Math.sqrt(d37 * ((d35 * d35) + (d36 * d36))));
        if (!z12 && dV > 0.0d) {
            dV -= 6.283185307179586d;
        } else if (z12 && dV < 0.0d) {
            dV += 6.283185307179586d;
        }
        float[] fArrI = i(dAcos % 6.283185307179586d, dV % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f15);
        matrix.postTranslate((float) d31, (float) d32);
        matrix.mapPoints(fArrI);
        fArrI[fArrI.length - 2] = f16;
        fArrI[fArrI.length - 1] = f17;
        for (int i11 = 0; i11 < fArrI.length; i11 += 6) {
            xVar.cubicTo(fArrI[i11], fArrI[i11 + 1], fArrI[i11 + 2], fArrI[i11 + 3], fArrI[i11 + 4], fArrI[i11 + 5]);
        }
    }

    private void h0() {
        this.f21412f.pop();
        this.f21413g.pop();
    }

    private static float[] i(double d11, double d12) {
        int iCeil = (int) Math.ceil((Math.abs(d12) * 2.0d) / 3.141592653589793d);
        double d13 = d12 / ((double) iCeil);
        double d14 = d13 / 2.0d;
        double dSin = (Math.sin(d14) * 1.3333333333333333d) / (Math.cos(d14) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i11 = 0;
        int i12 = 0;
        while (i11 < iCeil) {
            double d15 = d11 + (((double) i11) * d13);
            double dCos = Math.cos(d15);
            double dSin2 = Math.sin(d15);
            float[] fArr2 = fArr;
            fArr2[i12] = (float) (dCos - (dSin * dSin2));
            fArr2[i12 + 1] = (float) (dSin2 + (dCos * dSin));
            double d16 = d15 + d13;
            double dCos2 = Math.cos(d16);
            double dSin3 = Math.sin(d16);
            fArr2[i12 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr2[i12 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i13 = i12 + 5;
            fArr2[i12 + 4] = (float) dCos2;
            i12 += 6;
            fArr2[i13] = (float) dSin3;
            i11++;
            fArr = fArr2;
            iCeil = iCeil;
        }
        return fArr;
    }

    private void i0(com.caverock.androidsvg.g.j0 j0Var) {
        this.f21412f.push(j0Var);
        this.f21413g.push(this.f21407a.getMatrix());
    }

    @TargetApi(19)
    private Path j(com.caverock.androidsvg.g.k0 k0Var, com.caverock.androidsvg.g.b bVar) {
        Path pathG0;
        com.caverock.androidsvg.g.n0 n0VarP = k0Var.f21349a.p(this.f21410d.f21446a.E);
        if (n0VarP == null) {
            F("ClipPath reference '%s' not found", this.f21410d.f21446a.E);
            return null;
        }
        com.caverock.androidsvg.g.e eVar = (com.caverock.androidsvg.g.e) n0VarP;
        this.f21411e.push(this.f21410d);
        this.f21410d = M(eVar);
        Boolean bool = eVar.f21276p;
        boolean z11 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(bVar.f21248a, bVar.f21249b);
            matrix.preScale(bVar.f21250c, bVar.f21251d);
        }
        Matrix matrix2 = eVar.f21344o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (com.caverock.androidsvg.g.n0 n0Var : eVar.f21317i) {
            if ((n0Var instanceof com.caverock.androidsvg.g.k0) && (pathG0 = g0((com.caverock.androidsvg.g.k0) n0Var, true)) != null) {
                path.op(pathG0, Path.Op.UNION);
            }
        }
        if (this.f21410d.f21446a.E != null) {
            if (eVar.f21337h == null) {
                eVar.f21337h = m(path);
            }
            Path pathJ = j(eVar, eVar.f21337h);
            if (pathJ != null) {
                path.op(pathJ, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f21410d = this.f21411e.pop();
        return path;
    }

    private void j0(com.caverock.androidsvg.g.k0 k0Var) {
        k0(k0Var, k0Var.f21337h);
    }

    private List<c> k(com.caverock.androidsvg.g.q qVar) {
        com.caverock.androidsvg.g.p pVar = qVar.f21360o;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float fE = pVar != null ? pVar.e(this) : 0.0f;
        com.caverock.androidsvg.g.p pVar2 = qVar.f21361p;
        float f12 = pVar2 != null ? pVar2.f(this) : 0.0f;
        com.caverock.androidsvg.g.p pVar3 = qVar.f21362q;
        float fE2 = pVar3 != null ? pVar3.e(this) : 0.0f;
        com.caverock.androidsvg.g.p pVar4 = qVar.f21363r;
        if (pVar4 != null) {
            f11 = pVar4.f(this);
        }
        float f13 = f11;
        ArrayList arrayList = new ArrayList(2);
        float f14 = fE2 - fE;
        float f15 = f13 - f12;
        arrayList.add(new c(fE, f12, f14, f15));
        arrayList.add(new c(fE2, f13, f14, f15));
        return arrayList;
    }

    private void k0(com.caverock.androidsvg.g.k0 k0Var, com.caverock.androidsvg.g.b bVar) {
        if (this.f21410d.f21446a.G != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f21407a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2127f, 0.7151f, 0.0722f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED})));
            this.f21407a.saveLayer(null, paint2, 31);
            com.caverock.androidsvg.g.s sVar = (com.caverock.androidsvg.g.s) this.f21409c.p(this.f21410d.f21446a.G);
            J0(sVar, k0Var, bVar);
            this.f21407a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f21407a.saveLayer(null, paint3, 31);
            J0(sVar, k0Var, bVar);
            this.f21407a.restore();
            this.f21407a.restore();
        }
        R0();
    }

    private List<c> l(com.caverock.androidsvg.g.z zVar) {
        int length = zVar.f21402o.length;
        int i11 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = zVar.f21402o;
        c cVar = new c(fArr[0], fArr[1], BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float f12 = 0.0f;
        while (i11 < length) {
            float[] fArr2 = zVar.f21402o;
            float f13 = fArr2[i11];
            float f14 = fArr2[i11 + 1];
            cVar.a(f13, f14);
            arrayList.add(cVar);
            i11 += 2;
            cVar = new c(f13, f14, f13 - cVar.f21427a, f14 - cVar.f21428b);
            f11 = f13;
            f12 = f14;
        }
        if (!(zVar instanceof com.caverock.androidsvg.g.a0)) {
            arrayList.add(cVar);
            return arrayList;
        }
        float[] fArr3 = zVar.f21402o;
        float f15 = fArr3[0];
        if (f11 != f15) {
            float f16 = fArr3[1];
            if (f12 != f16) {
                cVar.a(f15, f16);
                arrayList.add(cVar);
                c cVar2 = new c(f15, f16, f15 - cVar.f21427a, f16 - cVar.f21428b);
                cVar2.b((c) arrayList.get(0));
                arrayList.add(cVar2);
                arrayList.set(0, cVar2);
            }
        }
        return arrayList;
    }

    private void l0(com.caverock.androidsvg.g.n0 n0Var, j jVar) {
        float f11;
        float f12;
        float fE;
        com.caverock.androidsvg.g.e0.f fVarO;
        if (jVar.a((com.caverock.androidsvg.g.y0) n0Var)) {
            if (n0Var instanceof com.caverock.androidsvg.g.z0) {
                S0();
                L0((com.caverock.androidsvg.g.z0) n0Var);
                R0();
                return;
            }
            if (!(n0Var instanceof com.caverock.androidsvg.g.v0)) {
                if (n0Var instanceof com.caverock.androidsvg.g.u0) {
                    S0();
                    com.caverock.androidsvg.g.u0 u0Var = (com.caverock.androidsvg.g.u0) n0Var;
                    W0(this.f21410d, u0Var);
                    if (A()) {
                        r((com.caverock.androidsvg.g.k0) u0Var.c());
                        com.caverock.androidsvg.g.n0 n0VarP = n0Var.f21349a.p(u0Var.f21384o);
                        if (n0VarP == null || !(n0VarP instanceof com.caverock.androidsvg.g.y0)) {
                            F("Tref reference '%s' not found", u0Var.f21384o);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            G((com.caverock.androidsvg.g.y0) n0VarP, sb2);
                            if (sb2.length() > 0) {
                                jVar.b(sb2.toString());
                            }
                        }
                    }
                    R0();
                    return;
                }
                return;
            }
            y("TSpan render", new Object[0]);
            S0();
            com.caverock.androidsvg.g.v0 v0Var = (com.caverock.androidsvg.g.v0) n0Var;
            W0(this.f21410d, v0Var);
            if (A()) {
                List<com.caverock.androidsvg.g.p> list = v0Var.f21244o;
                boolean z11 = list != null && list.size() > 0;
                boolean z12 = jVar instanceof f;
                float f13 = BitmapDescriptorFactory.HUE_RED;
                if (z12) {
                    float fE2 = !z11 ? ((f) jVar).f21439b : v0Var.f21244o.get(0).e(this);
                    List<com.caverock.androidsvg.g.p> list2 = v0Var.f21245p;
                    f12 = (list2 == null || list2.size() == 0) ? ((f) jVar).f21440c : v0Var.f21245p.get(0).f(this);
                    List<com.caverock.androidsvg.g.p> list3 = v0Var.f21246q;
                    fE = (list3 == null || list3.size() == 0) ? 0.0f : v0Var.f21246q.get(0).e(this);
                    List<com.caverock.androidsvg.g.p> list4 = v0Var.f21247r;
                    if (list4 != null && list4.size() != 0) {
                        f13 = v0Var.f21247r.get(0).f(this);
                    }
                    f11 = f13;
                    f13 = fE2;
                } else {
                    f11 = 0.0f;
                    f12 = 0.0f;
                    fE = 0.0f;
                }
                if (z11 && (fVarO = O()) != com.caverock.androidsvg.g.e0.f.Start) {
                    float fN = n(v0Var);
                    if (fVarO == com.caverock.androidsvg.g.e0.f.Middle) {
                        fN /= 2.0f;
                    }
                    f13 -= fN;
                }
                r((com.caverock.androidsvg.g.k0) v0Var.c());
                if (z12) {
                    f fVar = (f) jVar;
                    fVar.f21439b = f13 + fE;
                    fVar.f21440c = f12 + f11;
                }
                boolean zM0 = m0();
                E(v0Var, jVar);
                if (zM0) {
                    j0(v0Var);
                }
            }
            R0();
        }
    }

    private com.caverock.androidsvg.g.b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new com.caverock.androidsvg.g.b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private boolean m0() {
        com.caverock.androidsvg.g.n0 n0VarP;
        if (!M0()) {
            return false;
        }
        this.f21407a.saveLayerAlpha(null, w(this.f21410d.f21446a.f21289m.floatValue()), 31);
        this.f21411e.push(this.f21410d);
        C0427h c0427h = new C0427h(this.f21410d);
        this.f21410d = c0427h;
        String str = c0427h.f21446a.G;
        if (str != null && ((n0VarP = this.f21409c.p(str)) == null || !(n0VarP instanceof com.caverock.androidsvg.g.s))) {
            F("Mask reference '%s' not found", this.f21410d.f21446a.G);
            this.f21410d.f21446a.G = null;
        }
        return true;
    }

    private float n(com.caverock.androidsvg.g.y0 y0Var) {
        k kVar = new k(this, null);
        E(y0Var, kVar);
        return kVar.f21460b;
    }

    private c n0(c cVar, c cVar2, c cVar3) {
        float fD = D(cVar2.f21429c, cVar2.f21430d, cVar2.f21427a - cVar.f21427a, cVar2.f21428b - cVar.f21428b);
        if (fD == BitmapDescriptorFactory.HUE_RED) {
            fD = D(cVar2.f21429c, cVar2.f21430d, cVar3.f21427a - cVar2.f21427a, cVar3.f21428b - cVar2.f21428b);
        }
        if (fD > BitmapDescriptorFactory.HUE_RED || (fD == BitmapDescriptorFactory.HUE_RED && (cVar2.f21429c > BitmapDescriptorFactory.HUE_RED || cVar2.f21430d >= BitmapDescriptorFactory.HUE_RED))) {
            return cVar2;
        }
        cVar2.f21429c = -cVar2.f21429c;
        cVar2.f21430d = -cVar2.f21430d;
        return cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Matrix o(com.caverock.androidsvg.g.b r10, com.caverock.androidsvg.g.b r11, com.caverock.androidsvg.e r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9d
            com.caverock.androidsvg.e$a r1 = r12.a()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r10.f21250c
            float r2 = r11.f21250c
            float r1 = r1 / r2
            float r2 = r10.f21251d
            float r3 = r11.f21251d
            float r2 = r2 / r3
            float r3 = r11.f21248a
            float r3 = -r3
            float r4 = r11.f21249b
            float r4 = -r4
            com.caverock.androidsvg.e r5 = com.caverock.androidsvg.e.f21220d
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.f21248a
            float r10 = r10.f21249b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            com.caverock.androidsvg.e$b r5 = r12.b()
            com.caverock.androidsvg.e$b r6 = com.caverock.androidsvg.e.b.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.f21250c
            float r2 = r2 / r1
            float r5 = r10.f21251d
            float r5 = r5 / r1
            int[] r6 = com.caverock.androidsvg.h.a.f21415a
            com.caverock.androidsvg.e$a r7 = r12.a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r7 = r11.f21250c
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r11.f21250c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            com.caverock.androidsvg.e$a r12 = r12.a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L8b
            r2 = 3
            if (r12 == r2) goto L86
            r2 = 5
            if (r12 == r2) goto L8b
            r2 = 6
            if (r12 == r2) goto L86
            r2 = 7
            if (r12 == r2) goto L8b
            r2 = 8
            if (r12 == r2) goto L86
            goto L90
        L86:
            float r11 = r11.f21251d
            float r11 = r11 - r5
        L89:
            float r4 = r4 - r11
            goto L90
        L8b:
            float r11 = r11.f21251d
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L89
        L90:
            float r11 = r10.f21248a
            float r10 = r10.f21249b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.h.o(com.caverock.androidsvg.g$b, com.caverock.androidsvg.g$b, com.caverock.androidsvg.e):android.graphics.Matrix");
    }

    private void o0(com.caverock.androidsvg.g.d dVar) {
        y("Circle render", new Object[0]);
        com.caverock.androidsvg.g.p pVar = dVar.f21266q;
        if (pVar == null || pVar.h()) {
            return;
        }
        W0(this.f21410d, dVar);
        if (A() && Y0()) {
            Matrix matrix = dVar.f21338n;
            if (matrix != null) {
                this.f21407a.concat(matrix);
            }
            Path pathY = Y(dVar);
            U0(dVar);
            r(dVar);
            p(dVar);
            boolean zM0 = m0();
            if (this.f21410d.f21447b) {
                B(dVar, pathY);
            }
            if (this.f21410d.f21448c) {
                C(pathY);
            }
            if (zM0) {
                j0(dVar);
            }
        }
    }

    private void p(com.caverock.androidsvg.g.k0 k0Var) {
        q(k0Var, k0Var.f21337h);
    }

    private void p0(com.caverock.androidsvg.g.i iVar) {
        y("Ellipse render", new Object[0]);
        com.caverock.androidsvg.g.p pVar = iVar.f21325q;
        if (pVar == null || iVar.f21326r == null || pVar.h() || iVar.f21326r.h()) {
            return;
        }
        W0(this.f21410d, iVar);
        if (A() && Y0()) {
            Matrix matrix = iVar.f21338n;
            if (matrix != null) {
                this.f21407a.concat(matrix);
            }
            Path pathZ = Z(iVar);
            U0(iVar);
            r(iVar);
            p(iVar);
            boolean zM0 = m0();
            if (this.f21410d.f21447b) {
                B(iVar, pathZ);
            }
            if (this.f21410d.f21448c) {
                C(pathZ);
            }
            if (zM0) {
                j0(iVar);
            }
        }
    }

    private void q(com.caverock.androidsvg.g.k0 k0Var, com.caverock.androidsvg.g.b bVar) {
        Path pathJ;
        if (this.f21410d.f21446a.E == null || (pathJ = j(k0Var, bVar)) == null) {
            return;
        }
        this.f21407a.clipPath(pathJ);
    }

    private void q0(com.caverock.androidsvg.g.m mVar) {
        y("Group render", new Object[0]);
        W0(this.f21410d, mVar);
        if (A()) {
            Matrix matrix = mVar.f21344o;
            if (matrix != null) {
                this.f21407a.concat(matrix);
            }
            p(mVar);
            boolean zM0 = m0();
            F0(mVar, true);
            if (zM0) {
                j0(mVar);
            }
            U0(mVar);
        }
    }

    private void r(com.caverock.androidsvg.g.k0 k0Var) {
        com.caverock.androidsvg.g.o0 o0Var = this.f21410d.f21446a.f21278b;
        if (o0Var instanceof com.caverock.androidsvg.g.u) {
            z(true, k0Var.f21337h, (com.caverock.androidsvg.g.u) o0Var);
        }
        com.caverock.androidsvg.g.o0 o0Var2 = this.f21410d.f21446a.f21281e;
        if (o0Var2 instanceof com.caverock.androidsvg.g.u) {
            z(false, k0Var.f21337h, (com.caverock.androidsvg.g.u) o0Var2);
        }
    }

    private void r0(com.caverock.androidsvg.g.o oVar) {
        com.caverock.androidsvg.g.p pVar;
        String str;
        y("Image render", new Object[0]);
        com.caverock.androidsvg.g.p pVar2 = oVar.f21354s;
        if (pVar2 == null || pVar2.h() || (pVar = oVar.f21355t) == null || pVar.h() || (str = oVar.f21351p) == null) {
            return;
        }
        com.caverock.androidsvg.e eVar = oVar.f21359o;
        if (eVar == null) {
            eVar = com.caverock.androidsvg.e.f21221e;
        }
        Bitmap bitmapS = s(str);
        if (bitmapS == null) {
            com.caverock.androidsvg.g.k();
            return;
        }
        com.caverock.androidsvg.g.b bVar = new com.caverock.androidsvg.g.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmapS.getWidth(), bitmapS.getHeight());
        W0(this.f21410d, oVar);
        if (A() && Y0()) {
            Matrix matrix = oVar.f21356u;
            if (matrix != null) {
                this.f21407a.concat(matrix);
            }
            com.caverock.androidsvg.g.p pVar3 = oVar.f21352q;
            float fE = pVar3 != null ? pVar3.e(this) : 0.0f;
            com.caverock.androidsvg.g.p pVar4 = oVar.f21353r;
            this.f21410d.f21451f = new com.caverock.androidsvg.g.b(fE, pVar4 != null ? pVar4.f(this) : 0.0f, oVar.f21354s.e(this), oVar.f21355t.e(this));
            if (!this.f21410d.f21446a.f21298v.booleanValue()) {
                com.caverock.androidsvg.g.b bVar2 = this.f21410d.f21451f;
                O0(bVar2.f21248a, bVar2.f21249b, bVar2.f21250c, bVar2.f21251d);
            }
            oVar.f21337h = this.f21410d.f21451f;
            U0(oVar);
            p(oVar);
            boolean zM0 = m0();
            X0();
            this.f21407a.save();
            this.f21407a.concat(o(this.f21410d.f21451f, bVar, eVar));
            this.f21407a.drawBitmap(bitmapS, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Paint(this.f21410d.f21446a.M != com.caverock.androidsvg.g.e0.e.optimizeSpeed ? 2 : 0));
            this.f21407a.restore();
            if (zM0) {
                j0(oVar);
            }
        }
    }

    private Bitmap s(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e11) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e11);
            return null;
        }
    }

    private void s0(com.caverock.androidsvg.g.q qVar) {
        y("Line render", new Object[0]);
        W0(this.f21410d, qVar);
        if (A() && Y0() && this.f21410d.f21448c) {
            Matrix matrix = qVar.f21338n;
            if (matrix != null) {
                this.f21407a.concat(matrix);
            }
            Path pathA0 = a0(qVar);
            U0(qVar);
            r(qVar);
            p(qVar);
            boolean zM0 = m0();
            C(pathA0);
            I0(qVar);
            if (zM0) {
                j0(qVar);
            }
        }
    }

    private Typeface t(String str, Integer num, com.caverock.androidsvg.g.e0.b bVar) {
        int i11;
        boolean z11 = bVar == com.caverock.androidsvg.g.e0.b.Italic;
        if (num.intValue() > 500) {
            i11 = z11 ? 3 : 1;
        } else {
            i11 = z11 ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i11);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i11);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i11);
            case "serif":
                return Typeface.create(Typeface.SERIF, i11);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i11);
            default:
                return null;
        }
    }

    private void t0(com.caverock.androidsvg.g.v vVar) {
        y("Path render", new Object[0]);
        if (vVar.f21386o == null) {
            return;
        }
        W0(this.f21410d, vVar);
        if (A() && Y0()) {
            C0427h c0427h = this.f21410d;
            if (c0427h.f21448c || c0427h.f21447b) {
                Matrix matrix = vVar.f21338n;
                if (matrix != null) {
                    this.f21407a.concat(matrix);
                }
                Path pathC = new d(vVar.f21386o).c();
                if (vVar.f21337h == null) {
                    vVar.f21337h = m(pathC);
                }
                U0(vVar);
                r(vVar);
                p(vVar);
                boolean zM0 = m0();
                if (this.f21410d.f21447b) {
                    pathC.setFillType(U());
                    B(vVar, pathC);
                }
                if (this.f21410d.f21448c) {
                    C(pathC);
                }
                I0(vVar);
                if (zM0) {
                    j0(vVar);
                }
            }
        }
    }

    private void u(com.caverock.androidsvg.g.n0 n0Var) {
        Boolean bool;
        if ((n0Var instanceof com.caverock.androidsvg.g.l0) && (bool = ((com.caverock.androidsvg.g.l0) n0Var).f21340d) != null) {
            this.f21410d.f21453h = bool.booleanValue();
        }
    }

    private void u0(com.caverock.androidsvg.g.z zVar) {
        y("PolyLine render", new Object[0]);
        W0(this.f21410d, zVar);
        if (A() && Y0()) {
            C0427h c0427h = this.f21410d;
            if (c0427h.f21448c || c0427h.f21447b) {
                Matrix matrix = zVar.f21338n;
                if (matrix != null) {
                    this.f21407a.concat(matrix);
                }
                if (zVar.f21402o.length < 2) {
                    return;
                }
                Path pathB0 = b0(zVar);
                U0(zVar);
                pathB0.setFillType(U());
                r(zVar);
                p(zVar);
                boolean zM0 = m0();
                if (this.f21410d.f21447b) {
                    B(zVar, pathB0);
                }
                if (this.f21410d.f21448c) {
                    C(pathB0);
                }
                I0(zVar);
                if (zM0) {
                    j0(zVar);
                }
            }
        }
    }

    private static double v(double d11) {
        if (d11 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d11 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d11);
    }

    private void v0(com.caverock.androidsvg.g.a0 a0Var) {
        y("Polygon render", new Object[0]);
        W0(this.f21410d, a0Var);
        if (A() && Y0()) {
            C0427h c0427h = this.f21410d;
            if (c0427h.f21448c || c0427h.f21447b) {
                Matrix matrix = a0Var.f21338n;
                if (matrix != null) {
                    this.f21407a.concat(matrix);
                }
                if (a0Var.f21402o.length < 2) {
                    return;
                }
                Path pathB0 = b0(a0Var);
                U0(a0Var);
                r(a0Var);
                p(a0Var);
                boolean zM0 = m0();
                if (this.f21410d.f21447b) {
                    B(a0Var, pathB0);
                }
                if (this.f21410d.f21448c) {
                    C(pathB0);
                }
                I0(a0Var);
                if (zM0) {
                    j0(a0Var);
                }
            }
        }
    }

    private static int w(float f11) {
        int i11 = (int) (f11 * 256.0f);
        if (i11 < 0) {
            return 0;
        }
        if (i11 > 255) {
            return 255;
        }
        return i11;
    }

    private void w0(com.caverock.androidsvg.g.b0 b0Var) {
        y("Rect render", new Object[0]);
        com.caverock.androidsvg.g.p pVar = b0Var.f21254q;
        if (pVar == null || b0Var.f21255r == null || pVar.h() || b0Var.f21255r.h()) {
            return;
        }
        W0(this.f21410d, b0Var);
        if (A() && Y0()) {
            Matrix matrix = b0Var.f21338n;
            if (matrix != null) {
                this.f21407a.concat(matrix);
            }
            Path pathC0 = c0(b0Var);
            U0(b0Var);
            r(b0Var);
            p(b0Var);
            boolean zM0 = m0();
            if (this.f21410d.f21447b) {
                B(b0Var, pathC0);
            }
            if (this.f21410d.f21448c) {
                C(pathC0);
            }
            if (zM0) {
                j0(b0Var);
            }
        }
    }

    private static int x(int i11, float f11) {
        int i12 = 255;
        int iRound = Math.round(((i11 >> 24) & 255) * f11);
        if (iRound < 0) {
            i12 = 0;
        } else if (iRound <= 255) {
            i12 = iRound;
        }
        return (i11 & 16777215) | (i12 << 24);
    }

    private void x0(com.caverock.androidsvg.g.f0 f0Var) {
        z0(f0Var, f0(f0Var.f21311q, f0Var.f21312r, f0Var.f21313s, f0Var.f21314t), f0Var.f21375p, f0Var.f21359o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(String str, Object... objArr) {
    }

    private void y0(com.caverock.androidsvg.g.f0 f0Var, com.caverock.androidsvg.g.b bVar) {
        z0(f0Var, bVar, f0Var.f21375p, f0Var.f21359o);
    }

    private void z(boolean z11, com.caverock.androidsvg.g.b bVar, com.caverock.androidsvg.g.u uVar) {
        com.caverock.androidsvg.g.n0 n0VarP = this.f21409c.p(uVar.f21382a);
        if (n0VarP == null) {
            F("%s reference '%s' not found", z11 ? "Fill" : "Stroke", uVar.f21382a);
            com.caverock.androidsvg.g.o0 o0Var = uVar.f21383b;
            if (o0Var != null) {
                P0(this.f21410d, z11, o0Var);
                return;
            } else if (z11) {
                this.f21410d.f21447b = false;
                return;
            } else {
                this.f21410d.f21448c = false;
                return;
            }
        }
        if (n0VarP instanceof com.caverock.androidsvg.g.m0) {
            X(z11, bVar, (com.caverock.androidsvg.g.m0) n0VarP);
        } else if (n0VarP instanceof com.caverock.androidsvg.g.q0) {
            e0(z11, bVar, (com.caverock.androidsvg.g.q0) n0VarP);
        } else if (n0VarP instanceof com.caverock.androidsvg.g.c0) {
            Q0(z11, (com.caverock.androidsvg.g.c0) n0VarP);
        }
    }

    private void z0(com.caverock.androidsvg.g.f0 f0Var, com.caverock.androidsvg.g.b bVar, com.caverock.androidsvg.g.b bVar2, com.caverock.androidsvg.e eVar) {
        y("Svg render", new Object[0]);
        if (bVar.f21250c == BitmapDescriptorFactory.HUE_RED || bVar.f21251d == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        if (eVar == null && (eVar = f0Var.f21359o) == null) {
            eVar = com.caverock.androidsvg.e.f21221e;
        }
        W0(this.f21410d, f0Var);
        if (A()) {
            C0427h c0427h = this.f21410d;
            c0427h.f21451f = bVar;
            if (!c0427h.f21446a.f21298v.booleanValue()) {
                com.caverock.androidsvg.g.b bVar3 = this.f21410d.f21451f;
                O0(bVar3.f21248a, bVar3.f21249b, bVar3.f21250c, bVar3.f21251d);
            }
            q(f0Var, this.f21410d.f21451f);
            if (bVar2 != null) {
                this.f21407a.concat(o(this.f21410d.f21451f, bVar2, eVar));
                this.f21410d.f21452g = f0Var.f21375p;
            } else {
                Canvas canvas = this.f21407a;
                com.caverock.androidsvg.g.b bVar4 = this.f21410d.f21451f;
                canvas.translate(bVar4.f21248a, bVar4.f21249b);
            }
            boolean zM0 = m0();
            X0();
            F0(f0Var, true);
            if (zM0) {
                j0(f0Var);
            }
            U0(f0Var);
        }
    }

    void G0(com.caverock.androidsvg.g gVar, com.caverock.androidsvg.f fVar) {
        com.caverock.androidsvg.g.b bVar;
        com.caverock.androidsvg.e eVar;
        if (fVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f21409c = gVar;
        com.caverock.androidsvg.g.f0 f0VarM = gVar.m();
        if (f0VarM == null) {
            Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (fVar.e()) {
            com.caverock.androidsvg.g.l0 l0VarJ = this.f21409c.j(fVar.f21234e);
            if (l0VarJ == null || !(l0VarJ instanceof com.caverock.androidsvg.g.f1)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", fVar.f21234e));
                return;
            }
            com.caverock.androidsvg.g.f1 f1Var = (com.caverock.androidsvg.g.f1) l0VarJ;
            bVar = f1Var.f21375p;
            if (bVar == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", fVar.f21234e));
                return;
            }
            eVar = f1Var.f21359o;
        } else {
            bVar = fVar.f() ? fVar.f21233d : f0VarM.f21375p;
            eVar = fVar.c() ? fVar.f21231b : f0VarM.f21359o;
        }
        if (fVar.b()) {
            gVar.a(fVar.f21230a);
        }
        if (fVar.d()) {
            com.caverock.androidsvg.b.q qVar = new com.caverock.androidsvg.b.q();
            this.f21414h = qVar;
            qVar.f21206a = gVar.j(fVar.f21232c);
        }
        N0();
        u(f0VarM);
        S0();
        com.caverock.androidsvg.g.b bVar2 = new com.caverock.androidsvg.g.b(fVar.f21235f);
        com.caverock.androidsvg.g.p pVar = f0VarM.f21313s;
        if (pVar != null) {
            bVar2.f21250c = pVar.d(this, bVar2.f21250c);
        }
        com.caverock.androidsvg.g.p pVar2 = f0VarM.f21314t;
        if (pVar2 != null) {
            bVar2.f21251d = pVar2.d(this, bVar2.f21251d);
        }
        z0(f0VarM, bVar2, bVar, eVar);
        R0();
        if (fVar.b()) {
            gVar.b();
        }
    }

    float Q() {
        return this.f21410d.f21449d.getTextSize();
    }

    float R() {
        return this.f21410d.f21449d.getTextSize() / 2.0f;
    }

    com.caverock.androidsvg.g.b S() {
        C0427h c0427h = this.f21410d;
        com.caverock.androidsvg.g.b bVar = c0427h.f21452g;
        return bVar != null ? bVar : c0427h.f21451f;
    }

    float T() {
        return this.f21408b;
    }

    private class k extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f21460b;

        private k() {
            super(h.this, null);
            this.f21460b = BitmapDescriptorFactory.HUE_RED;
        }

        @Override // com.caverock.androidsvg.h.j
        public void b(String str) {
            this.f21460b += h.this.f21410d.f21449d.measureText(str);
        }

        /* synthetic */ k(h hVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.caverock.androidsvg.h$h, reason: collision with other inner class name */
    private class C0427h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.caverock.androidsvg.g.e0 f21446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f21447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f21448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f21449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f21450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        com.caverock.androidsvg.g.b f21451f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        com.caverock.androidsvg.g.b f21452g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f21453h;

        C0427h() {
            Paint paint = new Paint();
            this.f21449d = paint;
            paint.setFlags(193);
            this.f21449d.setHinting(0);
            this.f21449d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f21449d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f21450e = paint3;
            paint3.setFlags(193);
            this.f21450e.setHinting(0);
            this.f21450e.setStyle(Paint.Style.STROKE);
            this.f21450e.setTypeface(typeface);
            this.f21446a = com.caverock.androidsvg.g.e0.a();
        }

        C0427h(C0427h c0427h) {
            this.f21447b = c0427h.f21447b;
            this.f21448c = c0427h.f21448c;
            this.f21449d = new Paint(c0427h.f21449d);
            this.f21450e = new Paint(c0427h.f21450e);
            com.caverock.androidsvg.g.b bVar = c0427h.f21451f;
            if (bVar != null) {
                this.f21451f = new com.caverock.androidsvg.g.b(bVar);
            }
            com.caverock.androidsvg.g.b bVar2 = c0427h.f21452g;
            if (bVar2 != null) {
                this.f21452g = new com.caverock.androidsvg.g.b(bVar2);
            }
            this.f21453h = c0427h.f21453h;
            try {
                this.f21446a = (com.caverock.androidsvg.g.e0) c0427h.f21446a.clone();
            } catch (CloneNotSupportedException e11) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e11);
                this.f21446a = com.caverock.androidsvg.g.e0.a();
            }
        }
    }
}
