package com.google.android.material.card;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import nt.i;
import st.d;
import st.e;
import st.g;
import st.j;
import st.k;
import zs.c;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
class b {
    private static final Drawable A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final double f41737z = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final MaterialCardView f41738a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final g f41740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final g f41741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f41746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f41747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f41748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f41749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private k f41750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f41751n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f41752o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LayerDrawable f41753p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private g f41754q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private g f41755r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f41757t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ValueAnimator f41758u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final TimeInterpolator f41759v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f41760w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f41761x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Rect f41739b = new Rect();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f41756s = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f41762y = BitmapDescriptorFactory.HUE_RED;

    class a extends InsetDrawable {
        a(Drawable drawable, int i11, int i12, int i13, int i14) {
            super(drawable, i11, i12, i13, i14);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        A = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public b(@NonNull MaterialCardView materialCardView, AttributeSet attributeSet, int i11, int i12) {
        this.f41738a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, i11, i12);
        this.f41740c = gVar;
        gVar.Q(materialCardView.getContext());
        gVar.h0(-12303292);
        k.b bVarV = gVar.E().v();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, m.f128964m1, i11, l.f128792a);
        if (typedArrayObtainStyledAttributes.hasValue(m.f128976n1)) {
            bVarV.o(typedArrayObtainStyledAttributes.getDimension(m.f128976n1, BitmapDescriptorFactory.HUE_RED));
        }
        this.f41741d = new g();
        Y(bVarV.m());
        this.f41759v = i.g(materialCardView.getContext(), c.f128572i0, at.b.f14972a);
        this.f41760w = i.f(materialCardView.getContext(), c.f128560c0, 300);
        this.f41761x = i.f(materialCardView.getContext(), c.f128558b0, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    @NonNull
    private Drawable D(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f41738a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(f());
            iCeil = (int) Math.ceil(e());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    private boolean G() {
        return (this.f41744g & 80) == 80;
    }

    private boolean H() {
        return (this.f41744g & 8388613) == 8388613;
    }

    public static /* synthetic */ void a(b bVar, ValueAnimator valueAnimator) {
        bVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.f41747j.setAlpha((int) (255.0f * fFloatValue));
        bVar.f41762y = fFloatValue;
    }

    private float c() {
        return Math.max(Math.max(d(this.f41750m.q(), this.f41740c.J()), d(this.f41750m.s(), this.f41740c.K())), Math.max(d(this.f41750m.k(), this.f41740c.t()), d(this.f41750m.i(), this.f41740c.s())));
    }

    private boolean c0() {
        return this.f41738a.getPreventCornerOverlap() && !g();
    }

    private float d(d dVar, float f11) {
        if (dVar instanceof j) {
            return (float) ((1.0d - f41737z) * ((double) f11));
        }
        return dVar instanceof e ? f11 / 2.0f : BitmapDescriptorFactory.HUE_RED;
    }

    private boolean d0() {
        return this.f41738a.getPreventCornerOverlap() && g() && this.f41738a.getUseCompatPadding();
    }

    private float e() {
        return this.f41738a.getMaxCardElevation() + (d0() ? c() : BitmapDescriptorFactory.HUE_RED);
    }

    private boolean e0() {
        if (this.f41738a.isClickable()) {
            return true;
        }
        View view = this.f41738a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    private float f() {
        return (this.f41738a.getMaxCardElevation() * 1.5f) + (d0() ? c() : BitmapDescriptorFactory.HUE_RED);
    }

    private boolean g() {
        return this.f41740c.T();
    }

    @NonNull
    private Drawable h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        g gVarJ = j();
        this.f41754q = gVarJ;
        gVarJ.b0(this.f41748k);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f41754q);
        return stateListDrawable;
    }

    @NonNull
    private Drawable i() {
        if (!qt.b.f106147a) {
            return h();
        }
        this.f41755r = j();
        return new RippleDrawable(this.f41748k, null, this.f41755r);
    }

    private void i0(Drawable drawable) {
        if (this.f41738a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f41738a.getForeground()).setDrawable(drawable);
        } else {
            this.f41738a.setForeground(D(drawable));
        }
    }

    @NonNull
    private g j() {
        return new g(this.f41750m);
    }

    private void k0() {
        Drawable drawable;
        if (qt.b.f106147a && (drawable = this.f41752o) != null) {
            ((RippleDrawable) drawable).setColor(this.f41748k);
            return;
        }
        g gVar = this.f41754q;
        if (gVar != null) {
            gVar.b0(this.f41748k);
        }
    }

    @NonNull
    private Drawable t() {
        if (this.f41752o == null) {
            this.f41752o = i();
        }
        if (this.f41753p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f41752o, this.f41741d, this.f41747j});
            this.f41753p = layerDrawable;
            layerDrawable.setId(2, zs.g.O);
        }
        return this.f41753p;
    }

    private float v() {
        return (this.f41738a.getPreventCornerOverlap() && this.f41738a.getUseCompatPadding()) ? (float) ((1.0d - f41737z) * ((double) this.f41738a.getCardViewRadius())) : BitmapDescriptorFactory.HUE_RED;
    }

    ColorStateList A() {
        return this.f41751n;
    }

    int B() {
        return this.f41745h;
    }

    @NonNull
    Rect C() {
        return this.f41739b;
    }

    boolean E() {
        return this.f41756s;
    }

    boolean F() {
        return this.f41757t;
    }

    void I(@NonNull TypedArray typedArray) {
        ColorStateList colorStateListA = pt.c.a(this.f41738a.getContext(), typedArray, m.f128896g5);
        this.f41751n = colorStateListA;
        if (colorStateListA == null) {
            this.f41751n = ColorStateList.valueOf(-1);
        }
        this.f41745h = typedArray.getDimensionPixelSize(m.f128908h5, 0);
        boolean z11 = typedArray.getBoolean(m.Y4, false);
        this.f41757t = z11;
        this.f41738a.setLongClickable(z11);
        this.f41749l = pt.c.a(this.f41738a.getContext(), typedArray, m.f128872e5);
        Q(pt.c.e(this.f41738a.getContext(), typedArray, m.f128824a5));
        T(typedArray.getDimensionPixelSize(m.f128860d5, 0));
        S(typedArray.getDimensionPixelSize(m.f128848c5, 0));
        this.f41744g = typedArray.getInteger(m.f128836b5, 8388661);
        ColorStateList colorStateListA2 = pt.c.a(this.f41738a.getContext(), typedArray, m.f128884f5);
        this.f41748k = colorStateListA2;
        if (colorStateListA2 == null) {
            this.f41748k = ColorStateList.valueOf(ht.a.d(this.f41738a, c.f128579m));
        }
        M(pt.c.a(this.f41738a.getContext(), typedArray, m.Z4));
        k0();
        h0();
        l0();
        this.f41738a.setBackgroundInternal(D(this.f41740c));
        Drawable drawableT = e0() ? t() : this.f41741d;
        this.f41746i = drawableT;
        this.f41738a.setForeground(D(drawableT));
    }

    void J(int i11, int i12) {
        int iCeil;
        int iCeil2;
        int i13;
        int i14;
        if (this.f41753p != null) {
            if (this.f41738a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(f() * 2.0f);
                iCeil2 = (int) Math.ceil(e() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i15 = H() ? ((i11 - this.f41742e) - this.f41743f) - iCeil2 : this.f41742e;
            int i16 = G() ? this.f41742e : ((i12 - this.f41742e) - this.f41743f) - iCeil;
            int i17 = H() ? this.f41742e : ((i11 - this.f41742e) - this.f41743f) - iCeil2;
            int i18 = G() ? ((i12 - this.f41742e) - this.f41743f) - iCeil : this.f41742e;
            if (ViewCompat.A(this.f41738a) == 1) {
                i14 = i17;
                i13 = i15;
            } else {
                i13 = i17;
                i14 = i15;
            }
            this.f41753p.setLayerInset(2, i14, i18, i13, i16);
        }
    }

    void K(boolean z11) {
        this.f41756s = z11;
    }

    void L(ColorStateList colorStateList) {
        this.f41740c.b0(colorStateList);
    }

    void M(ColorStateList colorStateList) {
        g gVar = this.f41741d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.b0(colorStateList);
    }

    void N(boolean z11) {
        this.f41757t = z11;
    }

    public void O(boolean z11) {
        P(z11, false);
    }

    public void P(boolean z11, boolean z12) {
        Drawable drawable = this.f41747j;
        if (drawable != null) {
            if (z12) {
                b(z11);
            } else {
                drawable.setAlpha(z11 ? 255 : 0);
                this.f41762y = z11 ? 1.0f : BitmapDescriptorFactory.HUE_RED;
            }
        }
    }

    void Q(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = l5.a.r(drawable).mutate();
            this.f41747j = drawableMutate;
            l5.a.o(drawableMutate, this.f41749l);
            O(this.f41738a.isChecked());
        } else {
            this.f41747j = A;
        }
        LayerDrawable layerDrawable = this.f41753p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(zs.g.O, this.f41747j);
        }
    }

    void R(int i11) {
        this.f41744g = i11;
        J(this.f41738a.getMeasuredWidth(), this.f41738a.getMeasuredHeight());
    }

    void S(int i11) {
        this.f41742e = i11;
    }

    void T(int i11) {
        this.f41743f = i11;
    }

    void U(ColorStateList colorStateList) {
        this.f41749l = colorStateList;
        Drawable drawable = this.f41747j;
        if (drawable != null) {
            l5.a.o(drawable, colorStateList);
        }
    }

    void V(float f11) {
        Y(this.f41750m.w(f11));
        this.f41746i.invalidateSelf();
        if (d0() || c0()) {
            g0();
        }
        if (d0()) {
            j0();
        }
    }

    void W(float f11) {
        this.f41740c.c0(f11);
        g gVar = this.f41741d;
        if (gVar != null) {
            gVar.c0(f11);
        }
        g gVar2 = this.f41755r;
        if (gVar2 != null) {
            gVar2.c0(f11);
        }
    }

    void X(ColorStateList colorStateList) {
        this.f41748k = colorStateList;
        k0();
    }

    void Y(@NonNull k kVar) {
        this.f41750m = kVar;
        this.f41740c.setShapeAppearanceModel(kVar);
        g gVar = this.f41740c;
        gVar.g0(!gVar.T());
        g gVar2 = this.f41741d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        g gVar3 = this.f41755r;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
        g gVar4 = this.f41754q;
        if (gVar4 != null) {
            gVar4.setShapeAppearanceModel(kVar);
        }
    }

    void Z(ColorStateList colorStateList) {
        if (this.f41751n == colorStateList) {
            return;
        }
        this.f41751n = colorStateList;
        l0();
    }

    void a0(int i11) {
        if (i11 == this.f41745h) {
            return;
        }
        this.f41745h = i11;
        l0();
    }

    public void b(boolean z11) {
        float f11 = z11 ? 1.0f : BitmapDescriptorFactory.HUE_RED;
        float f12 = z11 ? 1.0f - this.f41762y : this.f41762y;
        ValueAnimator valueAnimator = this.f41758u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f41758u = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f41762y, f11);
        this.f41758u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b.a(this.f41736a, valueAnimator2);
            }
        });
        this.f41758u.setInterpolator(this.f41759v);
        this.f41758u.setDuration((long) ((z11 ? this.f41760w : this.f41761x) * f12));
        this.f41758u.start();
    }

    void b0(int i11, int i12, int i13, int i14) {
        this.f41739b.set(i11, i12, i13, i14);
        g0();
    }

    void f0() {
        Drawable drawable = this.f41746i;
        Drawable drawableT = e0() ? t() : this.f41741d;
        this.f41746i = drawableT;
        if (drawable != drawableT) {
            i0(drawableT);
        }
    }

    void g0() {
        int iC = (int) (((c0() || d0()) ? c() : BitmapDescriptorFactory.HUE_RED) - v());
        MaterialCardView materialCardView = this.f41738a;
        Rect rect = this.f41739b;
        materialCardView.j(rect.left + iC, rect.top + iC, rect.right + iC, rect.bottom + iC);
    }

    void h0() {
        this.f41740c.a0(this.f41738a.getCardElevation());
    }

    void j0() {
        if (!E()) {
            this.f41738a.setBackgroundInternal(D(this.f41740c));
        }
        this.f41738a.setForeground(D(this.f41746i));
    }

    void k() {
        Drawable drawable = this.f41752o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i11 = bounds.bottom;
            this.f41752o.setBounds(bounds.left, bounds.top, bounds.right, i11 - 1);
            this.f41752o.setBounds(bounds.left, bounds.top, bounds.right, i11);
        }
    }

    @NonNull
    g l() {
        return this.f41740c;
    }

    void l0() {
        this.f41741d.k0(this.f41745h, this.f41751n);
    }

    ColorStateList m() {
        return this.f41740c.x();
    }

    ColorStateList n() {
        return this.f41741d.x();
    }

    Drawable o() {
        return this.f41747j;
    }

    int p() {
        return this.f41744g;
    }

    int q() {
        return this.f41742e;
    }

    int r() {
        return this.f41743f;
    }

    ColorStateList s() {
        return this.f41749l;
    }

    float u() {
        return this.f41740c.J();
    }

    float w() {
        return this.f41740c.y();
    }

    ColorStateList x() {
        return this.f41748k;
    }

    k y() {
        return this.f41750m;
    }

    int z() {
        ColorStateList colorStateList = this.f41751n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
