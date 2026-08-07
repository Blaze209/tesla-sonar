package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class CarouselLayoutManager extends RecyclerView.q implements com.google.android.material.carousel.b, RecyclerView.b0.b {
    private int A;
    private Map<Integer, f> B;
    private com.google.android.material.carousel.c C;
    private final View.OnLayoutChangeListener D;
    private int E;
    private int F;
    private int G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f41764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f41765t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f41766u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f41767v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final c f41768w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    private com.google.android.material.carousel.d f41769x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private g f41770y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private f f41771z;

    class a extends p {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.b0
        public PointF a(int i11) {
            return CarouselLayoutManager.this.c(i11);
        }

        @Override // androidx.recyclerview.widget.p
        public int t(View view, int i11) {
            if (CarouselLayoutManager.this.f41770y == null || !CarouselLayoutManager.this.g()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.i2(carouselLayoutManager.m0(view));
        }

        @Override // androidx.recyclerview.widget.p
        public int u(View view, int i11) {
            if (CarouselLayoutManager.this.f41770y == null || CarouselLayoutManager.this.g()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.i2(carouselLayoutManager.m0(view));
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final View f41773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f41774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f41775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final d f41776d;

        b(View view, float f11, float f12, d dVar) {
            this.f41773a = view;
            this.f41774b = f11;
            this.f41775c = f12;
            this.f41776d = dVar;
        }
    }

    private static class c extends RecyclerView.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Paint f41777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<f.c> f41778b;

        c() {
            Paint paint = new Paint();
            this.f41777a = paint;
            this.f41778b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void k(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.c0 c0Var) {
            super.k(canvas, recyclerView, c0Var);
            this.f41777a.setStrokeWidth(recyclerView.getResources().getDimension(zs.e.A));
            for (f.c cVar : this.f41778b) {
                this.f41777a.setColor(k5.d.c(-65281, -16776961, cVar.f41809c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).g()) {
                    canvas.drawLine(cVar.f41808b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).C2(), cVar.f41808b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).x2(), this.f41777a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).z2(), cVar.f41808b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).A2(), cVar.f41808b, this.f41777a);
                }
            }
        }

        void l(List<f.c> list) {
            this.f41778b = Collections.unmodifiableList(list);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f.c f41779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final f.c f41780b;

        d(f.c cVar, f.c cVar2) {
            u5.h.a(cVar.f41807a <= cVar2.f41807a);
            this.f41779a = cVar;
            this.f41780b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int A2() {
        return this.C.j();
    }

    private int B2() {
        return this.C.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int C2() {
        return this.C.l();
    }

    private int D2() {
        if (S() || !this.f41769x.f()) {
            return 0;
        }
        return w2() == 1 ? i0() : k0();
    }

    private int E2(int i11, f fVar) {
        return H2() ? (int) (((p2() - fVar.h().f41807a) - (i11 * fVar.f())) - (fVar.f() / 2.0f)) : (int) (((i11 * fVar.f()) - fVar.a().f41807a) + (fVar.f() / 2.0f));
    }

    private int F2(int i11, @NonNull f fVar) {
        int i12 = Integer.MAX_VALUE;
        for (f.c cVar : fVar.e()) {
            float f11 = (i11 * fVar.f()) + (fVar.f() / 2.0f);
            int iP2 = (H2() ? (int) ((p2() - cVar.f41807a) - f11) : (int) (f11 - cVar.f41807a)) - this.f41764s;
            if (Math.abs(i12) > Math.abs(iP2)) {
                i12 = iP2;
            }
        }
        return i12;
    }

    private static d G2(List<f.c> list, float f11, boolean z11) {
        float f12 = Float.MAX_VALUE;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        float f13 = -3.4028235E38f;
        float f14 = Float.MAX_VALUE;
        float f15 = Float.MAX_VALUE;
        for (int i15 = 0; i15 < list.size(); i15++) {
            f.c cVar = list.get(i15);
            float f16 = z11 ? cVar.f41808b : cVar.f41807a;
            float fAbs = Math.abs(f16 - f11);
            if (f16 <= f11 && fAbs <= f12) {
                i11 = i15;
                f12 = fAbs;
            }
            if (f16 > f11 && fAbs <= f14) {
                i13 = i15;
                f14 = fAbs;
            }
            if (f16 <= f15) {
                i12 = i15;
                f15 = f16;
            }
            if (f16 > f13) {
                i14 = i15;
                f13 = f16;
            }
        }
        if (i11 == -1) {
            i11 = i12;
        }
        if (i13 == -1) {
            i13 = i14;
        }
        return new d(list.get(i11), list.get(i13));
    }

    private boolean I2(float f11, d dVar) {
        float fB2 = b2(f11, u2(f11, dVar) / 2.0f);
        if (H2()) {
            return fB2 < BitmapDescriptorFactory.HUE_RED;
        }
        return fB2 > ((float) p2());
    }

    private boolean J2(float f11, d dVar) {
        float fA2 = a2(f11, u2(f11, dVar) / 2.0f);
        if (H2()) {
            return fA2 > ((float) p2());
        }
        return fA2 < BitmapDescriptorFactory.HUE_RED;
    }

    private void K2() {
        if (this.f41767v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i11 = 0; i11 < P(); i11++) {
                View viewO = O(i11);
                Log.d("CarouselLayoutManager", "item position " + m0(viewO) + ", center:" + q2(viewO) + ", child index:" + i11);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private b L2(RecyclerView.x xVar, float f11, int i11) {
        View viewO = xVar.o(i11);
        G0(viewO, 0, 0);
        float fA2 = a2(f11, this.f41771z.f() / 2.0f);
        d dVarG2 = G2(this.f41771z.g(), fA2, false);
        return new b(viewO, fA2, f2(viewO, fA2, dVarG2), dVarG2);
    }

    private float M2(View view, float f11, float f12, Rect rect) {
        float fA2 = a2(f11, f12);
        d dVarG2 = G2(this.f41771z.g(), fA2, false);
        float fF2 = f2(view, fA2, dVarG2);
        super.V(view, rect);
        W2(view, fA2, dVarG2);
        this.C.o(view, rect, f12, fF2);
        return fF2;
    }

    private void N2(RecyclerView.x xVar) {
        View viewO = xVar.o(0);
        G0(viewO, 0, 0);
        f fVarG = this.f41769x.g(this, viewO);
        if (H2()) {
            fVarG = f.n(fVarG, p2());
        }
        this.f41770y = g.f(this, fVarG, r2(), t2(), D2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O2() {
        this.f41770y = null;
        z1();
    }

    private void P2(RecyclerView.x xVar) {
        while (P() > 0) {
            View viewO = O(0);
            float fQ2 = q2(viewO);
            if (!J2(fQ2, G2(this.f41771z.g(), fQ2, true))) {
                break;
            } else {
                s1(viewO, xVar);
            }
        }
        while (P() - 1 >= 0) {
            View viewO2 = O(P() - 1);
            float fQ3 = q2(viewO2);
            if (!I2(fQ3, G2(this.f41771z.g(), fQ3, true))) {
                return;
            } else {
                s1(viewO2, xVar);
            }
        }
    }

    private int Q2(int i11, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (P() == 0 || i11 == 0) {
            return 0;
        }
        if (this.f41770y == null) {
            N2(xVar);
        }
        int iJ2 = j2(i11, this.f41764s, this.f41765t, this.f41766u);
        this.f41764s += iJ2;
        X2(this.f41770y);
        float f11 = this.f41771z.f() / 2.0f;
        float fG2 = g2(m0(O(0)));
        Rect rect = new Rect();
        float f12 = H2() ? this.f41771z.h().f41808b : this.f41771z.a().f41808b;
        float f13 = Float.MAX_VALUE;
        for (int i12 = 0; i12 < P(); i12++) {
            View viewO = O(i12);
            float fAbs = Math.abs(f12 - M2(viewO, fG2, f11, rect));
            if (viewO != null && fAbs < f13) {
                this.F = m0(viewO);
                f13 = fAbs;
            }
            fG2 = a2(fG2, this.f41771z.f());
        }
        m2(xVar, c0Var);
        return iJ2;
    }

    private void R2(RecyclerView recyclerView, int i11) {
        if (g()) {
            recyclerView.scrollBy(i11, 0);
        } else {
            recyclerView.scrollBy(0, i11);
        }
    }

    public static /* synthetic */ void T1(final CarouselLayoutManager carouselLayoutManager, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        carouselLayoutManager.getClass();
        if (i11 == i15 && i12 == i16 && i13 == i17 && i14 == i18) {
            return;
        }
        view.post(new Runnable() { // from class: dt.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f61017a.O2();
            }
        });
    }

    private void T2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f128988o1);
            S2(typedArrayObtainStyledAttributes.getInt(m.f129000p1, 0));
            V2(typedArrayObtainStyledAttributes.getInt(m.X6, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void W2(View view, float f11, d dVar) {
        if (view instanceof h) {
            f.c cVar = dVar.f41779a;
            float f12 = cVar.f41809c;
            f.c cVar2 = dVar.f41780b;
            float fB = at.b.b(f12, cVar2.f41809c, cVar.f41807a, cVar2.f41807a, f11);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFF = this.C.f(height, width, at.b.b(BitmapDescriptorFactory.HUE_RED, height / 2.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, fB), at.b.b(BitmapDescriptorFactory.HUE_RED, width / 2.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, fB));
            float fF2 = f2(view, f11, dVar);
            RectF rectF = new RectF(fF2 - (rectFF.width() / 2.0f), fF2 - (rectFF.height() / 2.0f), fF2 + (rectFF.width() / 2.0f), (rectFF.height() / 2.0f) + fF2);
            RectF rectF2 = new RectF(z2(), C2(), A2(), x2());
            if (this.f41769x.f()) {
                this.C.a(rectFF, rectF, rectF2);
            }
            this.C.n(rectFF, rectF, rectF2);
            ((h) view).a(rectFF);
        }
    }

    private void X2(@NonNull g gVar) {
        int i11 = this.f41766u;
        int i12 = this.f41765t;
        if (i11 <= i12) {
            this.f41771z = H2() ? gVar.h() : gVar.l();
        } else {
            this.f41771z = gVar.j(this.f41764s, i12, i11);
        }
        this.f41768w.l(this.f41771z.g());
    }

    private void Y2() {
        int iA = a();
        int i11 = this.E;
        if (iA == i11 || this.f41770y == null) {
            return;
        }
        if (this.f41769x.h(this, i11)) {
            O2();
        }
        this.E = iA;
    }

    private void Z1(View view, int i11, b bVar) {
        float f11 = this.f41771z.f() / 2.0f;
        k(view, i11);
        float f12 = bVar.f41775c;
        this.C.m(view, (int) (f12 - f11), (int) (f12 + f11));
        W2(view, bVar.f41774b, bVar.f41776d);
    }

    private void Z2() {
        if (!this.f41767v || P() < 1) {
            return;
        }
        int i11 = 0;
        while (i11 < P() - 1) {
            int iM0 = m0(O(i11));
            int i12 = i11 + 1;
            int iM1 = m0(O(i12));
            if (iM0 > iM1) {
                K2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i11 + "] had adapter position [" + iM0 + "] and child at index [" + i12 + "] had adapter position [" + iM1 + "].");
            }
            i11 = i12;
        }
    }

    private float a2(float f11, float f12) {
        return H2() ? f11 - f12 : f11 + f12;
    }

    private float b2(float f11, float f12) {
        return H2() ? f11 + f12 : f11 - f12;
    }

    private void c2(@NonNull RecyclerView.x xVar, int i11, int i12) {
        if (i11 < 0 || i11 >= a()) {
            return;
        }
        b bVarL2 = L2(xVar, g2(i11), i11);
        Z1(bVarL2.f41773a, i12, bVarL2);
    }

    private void d2(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i11) {
        float fG2 = g2(i11);
        while (i11 < c0Var.b()) {
            b bVarL2 = L2(xVar, fG2, i11);
            if (I2(bVarL2.f41775c, bVarL2.f41776d)) {
                return;
            }
            fG2 = a2(fG2, this.f41771z.f());
            if (!J2(bVarL2.f41775c, bVarL2.f41776d)) {
                Z1(bVarL2.f41773a, -1, bVarL2);
            }
            i11++;
        }
    }

    private void e2(RecyclerView.x xVar, int i11) {
        float fG2 = g2(i11);
        while (i11 >= 0) {
            b bVarL2 = L2(xVar, fG2, i11);
            if (J2(bVarL2.f41775c, bVarL2.f41776d)) {
                return;
            }
            fG2 = b2(fG2, this.f41771z.f());
            if (!I2(bVarL2.f41775c, bVarL2.f41776d)) {
                Z1(bVarL2.f41773a, 0, bVarL2);
            }
            i11--;
        }
    }

    private float f2(View view, float f11, d dVar) {
        f.c cVar = dVar.f41779a;
        float f12 = cVar.f41808b;
        f.c cVar2 = dVar.f41780b;
        float fB = at.b.b(f12, cVar2.f41808b, cVar.f41807a, cVar2.f41807a, f11);
        if (dVar.f41780b != this.f41771z.c() && dVar.f41779a != this.f41771z.j()) {
            return fB;
        }
        float fE = this.C.e((RecyclerView.r) view.getLayoutParams()) / this.f41771z.f();
        f.c cVar3 = dVar.f41780b;
        return fB + ((f11 - cVar3.f41807a) * ((1.0f - cVar3.f41809c) + fE));
    }

    private float g2(int i11) {
        return a2(B2() - this.f41764s, this.f41771z.f() * i11);
    }

    private int h2(RecyclerView.c0 c0Var, g gVar) {
        boolean zH2 = H2();
        f fVarL = zH2 ? gVar.l() : gVar.h();
        f.c cVarA = zH2 ? fVarL.a() : fVarL.h();
        int iB = (int) (((((c0Var.b() - 1) * fVarL.f()) * (zH2 ? -1.0f : 1.0f)) - (cVarA.f41807a - B2())) + (y2() - cVarA.f41807a) + (zH2 ? -cVarA.f41813g : cVarA.f41814h));
        return zH2 ? Math.min(0, iB) : Math.max(0, iB);
    }

    private static int j2(int i11, int i12, int i13, int i14) {
        int i15 = i12 + i11;
        if (i15 < i13) {
            return i13 - i12;
        }
        return i15 > i14 ? i14 - i12 : i11;
    }

    private int k2(@NonNull g gVar) {
        boolean zH2 = H2();
        f fVarH = zH2 ? gVar.h() : gVar.l();
        return (int) (B2() - b2((zH2 ? fVarH.h() : fVarH.a()).f41807a, fVarH.f() / 2.0f));
    }

    private int l2(int i11) {
        int iW2 = w2();
        if (i11 == 1) {
            return -1;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 17) {
            if (iW2 == 0) {
                return H2() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i11 == 33) {
            return iW2 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i11 == 66) {
            if (iW2 == 0) {
                return H2() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i11 == 130) {
            return iW2 == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i11);
        return Integer.MIN_VALUE;
    }

    private void m2(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        P2(xVar);
        if (P() == 0) {
            e2(xVar, this.A - 1);
            d2(xVar, c0Var, this.A);
        } else {
            int iM0 = m0(O(0));
            int iM1 = m0(O(P() - 1));
            e2(xVar, iM0 - 1);
            d2(xVar, c0Var, iM1 + 1);
        }
        Z2();
    }

    private View n2() {
        return O(H2() ? 0 : P() - 1);
    }

    private View o2() {
        return O(H2() ? P() - 1 : 0);
    }

    private int p2() {
        return g() ? d() : b();
    }

    private float q2(View view) {
        Rect rect = new Rect();
        super.V(view, rect);
        return g() ? rect.centerX() : rect.centerY();
    }

    private int r2() {
        int i11;
        int i12;
        if (P() <= 0) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) O(0).getLayoutParams();
        if (this.C.f41789a == 0) {
            i11 = ((ViewGroup.MarginLayoutParams) rVar).leftMargin;
            i12 = ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        } else {
            i11 = ((ViewGroup.MarginLayoutParams) rVar).topMargin;
            i12 = ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }
        return i11 + i12;
    }

    private f s2(int i11) {
        f fVar;
        Map<Integer, f> map = this.B;
        return (map == null || (fVar = map.get(Integer.valueOf(o5.a.b(i11, 0, Math.max(0, a() + (-1)))))) == null) ? this.f41770y.g() : fVar;
    }

    private int t2() {
        if (S() || !this.f41769x.f()) {
            return 0;
        }
        return w2() == 1 ? l0() : j0();
    }

    private float u2(float f11, d dVar) {
        f.c cVar = dVar.f41779a;
        float f12 = cVar.f41810d;
        f.c cVar2 = dVar.f41780b;
        return at.b.b(f12, cVar2.f41810d, cVar.f41808b, cVar2.f41808b, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int x2() {
        return this.C.g();
    }

    private int y2() {
        return this.C.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int z2() {
        return this.C.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int A(@NonNull RecyclerView.c0 c0Var) {
        return this.f41764s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int B(@NonNull RecyclerView.c0 c0Var) {
        return this.f41766u - this.f41765t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int C1(int i11, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (q()) {
            return Q2(i11, xVar, c0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void D1(int i11) {
        this.F = i11;
        if (this.f41770y == null) {
            return;
        }
        this.f41764s = E2(i11, s2(i11));
        this.A = o5.a.b(i11, 0, Math.max(0, a() - 1));
        X2(this.f41770y);
        z1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int E1(int i11, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (r()) {
            return Q2(i11, xVar, c0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void G0(@NonNull View view, int i11, int i12) {
        if (!(view instanceof h)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        Rect rect = new Rect();
        p(view, rect);
        int i13 = i11 + rect.left + rect.right;
        int i14 = i12 + rect.top + rect.bottom;
        g gVar = this.f41770y;
        float f11 = (gVar == null || this.C.f41789a != 0) ? ((ViewGroup.MarginLayoutParams) rVar).width : gVar.g().f();
        g gVar2 = this.f41770y;
        view.measure(RecyclerView.q.Q(t0(), u0(), j0() + k0() + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin + i13, (int) f11, q()), RecyclerView.q.Q(c0(), d0(), l0() + i0() + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin + i14, (int) ((gVar2 == null || this.C.f41789a != 1) ? ((ViewGroup.MarginLayoutParams) rVar).height : gVar2.g().f()), r()));
    }

    boolean H2() {
        return g() && e0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r J() {
        return new RecyclerView.r(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void M0(RecyclerView recyclerView) {
        super.M0(recyclerView);
        this.f41769x.e(recyclerView.getContext());
        O2();
        recyclerView.addOnLayoutChangeListener(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void O0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.O0(recyclerView, xVar);
        recyclerView.removeOnLayoutChangeListener(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void O1(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i11) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i11);
        P1(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View P0(@NonNull View view, int i11, @NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var) {
        int iL2;
        if (P() == 0 || (iL2 = l2(i11)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iL2 == -1) {
            if (m0(view) == 0) {
                return null;
            }
            c2(xVar, m0(O(0)) - 1, 0);
            return o2();
        }
        if (m0(view) == a() - 1) {
            return null;
        }
        c2(xVar, m0(O(P() - 1)) + 1, -1);
        return n2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Q0(@NonNull AccessibilityEvent accessibilityEvent) {
        super.Q0(accessibilityEvent);
        if (P() > 0) {
            accessibilityEvent.setFromIndex(m0(O(0)));
            accessibilityEvent.setToIndex(m0(O(P() - 1)));
        }
    }

    public void S2(int i11) {
        this.G = i11;
        O2();
    }

    public void U2(@NonNull com.google.android.material.carousel.d dVar) {
        this.f41769x = dVar;
        O2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void V(@NonNull View view, @NonNull Rect rect) {
        super.V(view, rect);
        float fCenterY = rect.centerY();
        if (g()) {
            fCenterY = rect.centerX();
        }
        float fU2 = u2(fCenterY, G2(this.f41771z.g(), fCenterY, true));
        boolean zG = g();
        float fHeight = BitmapDescriptorFactory.HUE_RED;
        float fWidth = zG ? (rect.width() - fU2) / 2.0f : 0.0f;
        if (!g()) {
            fHeight = (rect.height() - fU2) / 2.0f;
        }
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public void V2(int i11) {
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i11);
        }
        m(null);
        com.google.android.material.carousel.c cVar = this.C;
        if (cVar == null || i11 != cVar.f41789a) {
            this.C = com.google.android.material.carousel.c.c(this, i11);
            O2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void X0(@NonNull RecyclerView recyclerView, int i11, int i12) {
        super.X0(recyclerView, i11, i12);
        Y2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void a1(@NonNull RecyclerView recyclerView, int i11, int i12) {
        super.a1(recyclerView, i11, i12);
        Y2();
    }

    @Override // com.google.android.material.carousel.b
    public int b() {
        return c0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0.b
    public PointF c(int i11) {
        if (this.f41770y == null) {
            return null;
        }
        int iV2 = v2(i11, s2(i11));
        return g() ? new PointF(iV2, BitmapDescriptorFactory.HUE_RED) : new PointF(BitmapDescriptorFactory.HUE_RED, iV2);
    }

    @Override // com.google.android.material.carousel.b
    public int d() {
        return t0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (c0Var.b() <= 0 || p2() <= BitmapDescriptorFactory.HUE_RED) {
            q1(xVar);
            this.A = 0;
            return;
        }
        boolean zH2 = H2();
        boolean z11 = this.f41770y == null;
        if (z11) {
            N2(xVar);
        }
        int iK2 = k2(this.f41770y);
        int iH2 = h2(c0Var, this.f41770y);
        this.f41765t = zH2 ? iH2 : iK2;
        if (zH2) {
            iH2 = iK2;
        }
        this.f41766u = iH2;
        if (z11) {
            this.f41764s = iK2;
            this.B = this.f41770y.i(a(), this.f41765t, this.f41766u, H2());
            int i11 = this.F;
            if (i11 != -1) {
                this.f41764s = E2(i11, s2(i11));
            }
        }
        int i12 = this.f41764s;
        this.f41764s = i12 + j2(0, i12, this.f41765t, this.f41766u);
        this.A = o5.a.b(this.A, 0, c0Var.b());
        X2(this.f41770y);
        C(xVar);
        m2(xVar, c0Var);
        this.E = a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void e1(RecyclerView.c0 c0Var) {
        super.e1(c0Var);
        if (P() == 0) {
            this.A = 0;
        } else {
            this.A = m0(O(0));
        }
        Z2();
    }

    @Override // com.google.android.material.carousel.b
    public int f() {
        return this.G;
    }

    @Override // com.google.android.material.carousel.b
    public boolean g() {
        return this.C.f41789a == 0;
    }

    int i2(int i11) {
        return (int) (this.f41764s - E2(i11, s2(i11)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean q() {
        return g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean r() {
        return !g();
    }

    int v2(int i11, @NonNull f fVar) {
        return E2(i11, fVar) - this.f41764s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int w(@NonNull RecyclerView.c0 c0Var) {
        if (P() == 0 || this.f41770y == null || a() <= 1) {
            return 0;
        }
        return (int) (t0() * (this.f41770y.g().f() / y(c0Var)));
    }

    public int w2() {
        return this.C.f41789a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int x(@NonNull RecyclerView.c0 c0Var) {
        return this.f41764s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean x0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int y(@NonNull RecyclerView.c0 c0Var) {
        return this.f41766u - this.f41765t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean y1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z11, boolean z12) {
        int iF2;
        if (this.f41770y == null || (iF2 = F2(m0(view), s2(m0(view)))) == 0) {
            return false;
        }
        R2(recyclerView, F2(m0(view), this.f41770y.j(this.f41764s + j2(iF2, this.f41764s, this.f41765t, this.f41766u), this.f41765t, this.f41766u)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int z(@NonNull RecyclerView.c0 c0Var) {
        if (P() == 0 || this.f41770y == null || a() <= 1) {
            return 0;
        }
        return (int) (c0() * (this.f41770y.g().f() / B(c0Var)));
    }

    public CarouselLayoutManager(@NonNull com.google.android.material.carousel.d dVar) {
        this(dVar, 0);
    }

    public CarouselLayoutManager(@NonNull com.google.android.material.carousel.d dVar, int i11) {
        this.f41767v = false;
        this.f41768w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: dt.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                CarouselLayoutManager.T1(this.f61016a, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.F = -1;
        this.G = 0;
        U2(dVar);
        V2(i11);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f41767v = false;
        this.f41768w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: dt.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i110) {
                CarouselLayoutManager.T1(this.f61016a, view, i13, i14, i15, i16, i17, i18, i19, i110);
            }
        };
        this.F = -1;
        this.G = 0;
        U2(new i());
        T2(context, attributeSet);
    }
}
