package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.d0;
import qt.b;
import st.g;
import st.k;
import st.n;
import zs.c;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
class a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final boolean f41706u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final boolean f41707v = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaterialButton f41708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private k f41709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f41716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f41717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f41718k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f41719l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f41720m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f41724q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private LayerDrawable f41726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f41727t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f41721n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f41722o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f41723p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f41725r = true;

    a(MaterialButton materialButton, @NonNull k kVar) {
        this.f41708a = materialButton;
        this.f41709b = kVar;
    }

    private void G(int i11, int i12) {
        int iF = ViewCompat.F(this.f41708a);
        int paddingTop = this.f41708a.getPaddingTop();
        int iE = ViewCompat.E(this.f41708a);
        int paddingBottom = this.f41708a.getPaddingBottom();
        int i13 = this.f41712e;
        int i14 = this.f41713f;
        this.f41713f = i12;
        this.f41712e = i11;
        if (!this.f41722o) {
            H();
        }
        ViewCompat.F0(this.f41708a, iF, (paddingTop + i11) - i13, iE, (paddingBottom + i12) - i14);
    }

    private void H() {
        this.f41708a.setInternalBackground(a());
        g gVarF = f();
        if (gVarF != null) {
            gVarF.a0(this.f41727t);
            gVarF.setState(this.f41708a.getDrawableState());
        }
    }

    private void I(@NonNull k kVar) {
        if (f41707v && !this.f41722o) {
            int iF = ViewCompat.F(this.f41708a);
            int paddingTop = this.f41708a.getPaddingTop();
            int iE = ViewCompat.E(this.f41708a);
            int paddingBottom = this.f41708a.getPaddingBottom();
            H();
            ViewCompat.F0(this.f41708a, iF, paddingTop, iE, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    private void J() {
        g gVarF = f();
        g gVarN = n();
        if (gVarF != null) {
            gVarF.k0(this.f41715h, this.f41718k);
            if (gVarN != null) {
                gVarN.j0(this.f41715h, this.f41721n ? ht.a.d(this.f41708a, c.f128599w) : 0);
            }
        }
    }

    @NonNull
    private InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f41710c, this.f41712e, this.f41711d, this.f41713f);
    }

    private Drawable a() {
        g gVar = new g(this.f41709b);
        gVar.Q(this.f41708a.getContext());
        l5.a.o(gVar, this.f41717j);
        PorterDuff.Mode mode = this.f41716i;
        if (mode != null) {
            l5.a.p(gVar, mode);
        }
        gVar.k0(this.f41715h, this.f41718k);
        g gVar2 = new g(this.f41709b);
        gVar2.setTint(0);
        gVar2.j0(this.f41715h, this.f41721n ? ht.a.d(this.f41708a, c.f128599w) : 0);
        if (f41706u) {
            g gVar3 = new g(this.f41709b);
            this.f41720m = gVar3;
            l5.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(b.d(this.f41719l), K(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f41720m);
            this.f41726s = rippleDrawable;
            return rippleDrawable;
        }
        qt.a aVar = new qt.a(this.f41709b);
        this.f41720m = aVar;
        l5.a.o(aVar, b.d(this.f41719l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f41720m});
        this.f41726s = layerDrawable;
        return K(layerDrawable);
    }

    private g g(boolean z11) {
        LayerDrawable layerDrawable = this.f41726s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f41706u ? (g) ((LayerDrawable) ((InsetDrawable) this.f41726s.getDrawable(0)).getDrawable()).getDrawable(!z11 ? 1 : 0) : (g) this.f41726s.getDrawable(!z11 ? 1 : 0);
    }

    private g n() {
        return g(true);
    }

    void A(boolean z11) {
        this.f41721n = z11;
        J();
    }

    void B(ColorStateList colorStateList) {
        if (this.f41718k != colorStateList) {
            this.f41718k = colorStateList;
            J();
        }
    }

    void C(int i11) {
        if (this.f41715h != i11) {
            this.f41715h = i11;
            J();
        }
    }

    void D(ColorStateList colorStateList) {
        if (this.f41717j != colorStateList) {
            this.f41717j = colorStateList;
            if (f() != null) {
                l5.a.o(f(), this.f41717j);
            }
        }
    }

    void E(PorterDuff.Mode mode) {
        if (this.f41716i != mode) {
            this.f41716i = mode;
            if (f() == null || this.f41716i == null) {
                return;
            }
            l5.a.p(f(), this.f41716i);
        }
    }

    void F(boolean z11) {
        this.f41725r = z11;
    }

    int b() {
        return this.f41714g;
    }

    public int c() {
        return this.f41713f;
    }

    public int d() {
        return this.f41712e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f41726s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f41726s.getNumberOfLayers() > 2 ? (n) this.f41726s.getDrawable(2) : (n) this.f41726s.getDrawable(1);
    }

    g f() {
        return g(false);
    }

    ColorStateList h() {
        return this.f41719l;
    }

    @NonNull
    k i() {
        return this.f41709b;
    }

    ColorStateList j() {
        return this.f41718k;
    }

    int k() {
        return this.f41715h;
    }

    ColorStateList l() {
        return this.f41717j;
    }

    PorterDuff.Mode m() {
        return this.f41716i;
    }

    boolean o() {
        return this.f41722o;
    }

    boolean p() {
        return this.f41724q;
    }

    boolean q() {
        return this.f41725r;
    }

    void r(@NonNull TypedArray typedArray) {
        this.f41710c = typedArray.getDimensionPixelOffset(m.f128871e4, 0);
        this.f41711d = typedArray.getDimensionPixelOffset(m.f128883f4, 0);
        this.f41712e = typedArray.getDimensionPixelOffset(m.f128895g4, 0);
        this.f41713f = typedArray.getDimensionPixelOffset(m.f128907h4, 0);
        if (typedArray.hasValue(m.f128955l4)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(m.f128955l4, -1);
            this.f41714g = dimensionPixelSize;
            z(this.f41709b.w(dimensionPixelSize));
            this.f41723p = true;
        }
        this.f41715h = typedArray.getDimensionPixelSize(m.f129075v4, 0);
        this.f41716i = d0.n(typedArray.getInt(m.f128943k4, -1), PorterDuff.Mode.SRC_IN);
        this.f41717j = pt.c.a(this.f41708a.getContext(), typedArray, m.f128931j4);
        this.f41718k = pt.c.a(this.f41708a.getContext(), typedArray, m.f129063u4);
        this.f41719l = pt.c.a(this.f41708a.getContext(), typedArray, m.f129051t4);
        this.f41724q = typedArray.getBoolean(m.f128919i4, false);
        this.f41727t = typedArray.getDimensionPixelSize(m.f128967m4, 0);
        this.f41725r = typedArray.getBoolean(m.f129087w4, true);
        int iF = ViewCompat.F(this.f41708a);
        int paddingTop = this.f41708a.getPaddingTop();
        int iE = ViewCompat.E(this.f41708a);
        int paddingBottom = this.f41708a.getPaddingBottom();
        if (typedArray.hasValue(m.f128859d4)) {
            t();
        } else {
            H();
        }
        ViewCompat.F0(this.f41708a, iF + this.f41710c, paddingTop + this.f41712e, iE + this.f41711d, paddingBottom + this.f41713f);
    }

    void s(int i11) {
        if (f() != null) {
            f().setTint(i11);
        }
    }

    void t() {
        this.f41722o = true;
        this.f41708a.setSupportBackgroundTintList(this.f41717j);
        this.f41708a.setSupportBackgroundTintMode(this.f41716i);
    }

    void u(boolean z11) {
        this.f41724q = z11;
    }

    void v(int i11) {
        if (this.f41723p && this.f41714g == i11) {
            return;
        }
        this.f41714g = i11;
        this.f41723p = true;
        z(this.f41709b.w(i11));
    }

    public void w(int i11) {
        G(this.f41712e, i11);
    }

    public void x(int i11) {
        G(i11, this.f41713f);
    }

    void y(ColorStateList colorStateList) {
        if (this.f41719l != colorStateList) {
            this.f41719l = colorStateList;
            boolean z11 = f41706u;
            if (z11 && (this.f41708a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f41708a.getBackground()).setColor(b.d(colorStateList));
            } else {
                if (z11 || !(this.f41708a.getBackground() instanceof qt.a)) {
                    return;
                }
                ((qt.a) this.f41708a.getBackground()).setTintList(b.d(colorStateList));
            }
        }
    }

    void z(@NonNull k kVar) {
        this.f41709b = kVar;
        I(kVar);
    }
}
