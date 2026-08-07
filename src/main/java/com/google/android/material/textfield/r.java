package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.b1;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.d0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ViewConstructor"})
class r extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f42905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final FrameLayout f42906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final CheckableImageButton f42907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f42908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f42909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View.OnLongClickListener f42910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final CheckableImageButton f42911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f42912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f42913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LinkedHashSet<TextInputLayout.g> f42914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f42915k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f42916l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f42917m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    private ImageView.ScaleType f42918n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View.OnLongClickListener f42919o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f42920p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    private final TextView f42921q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f42922r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private EditText f42923s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AccessibilityManager f42924t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private z5.c.a f42925u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final TextWatcher f42926v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final TextInputLayout.f f42927w;

    class a extends com.google.android.material.internal.z {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            r.this.m().a(editable);
        }

        @Override // com.google.android.material.internal.z, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            r.this.m().b(charSequence, i11, i12, i13);
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(@NonNull TextInputLayout textInputLayout) {
            if (r.this.f42923s == textInputLayout.getEditText()) {
                return;
            }
            if (r.this.f42923s != null) {
                r.this.f42923s.removeTextChangedListener(r.this.f42926v);
                if (r.this.f42923s.getOnFocusChangeListener() == r.this.m().e()) {
                    r.this.f42923s.setOnFocusChangeListener(null);
                }
            }
            r.this.f42923s = textInputLayout.getEditText();
            if (r.this.f42923s != null) {
                r.this.f42923s.addTextChangedListener(r.this.f42926v);
            }
            r.this.m().n(r.this.f42923s);
            r rVar = r.this;
            rVar.h0(rVar.m());
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.M();
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray<s> f42931a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r f42932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f42933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f42934d;

        d(r rVar, b1 b1Var) {
            this.f42932b = rVar;
            this.f42933c = b1Var.n(zs.m.f129044s9, 0);
            this.f42934d = b1Var.n(zs.m.Q9, 0);
        }

        private s b(int i11) {
            if (i11 == -1) {
                return new g(this.f42932b);
            }
            if (i11 == 0) {
                return new v(this.f42932b);
            }
            if (i11 == 1) {
                return new x(this.f42932b, this.f42934d);
            }
            if (i11 == 2) {
                return new f(this.f42932b);
            }
            if (i11 == 3) {
                return new p(this.f42932b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i11);
        }

        s c(int i11) {
            s sVar = this.f42931a.get(i11);
            if (sVar != null) {
                return sVar;
            }
            s sVarB = b(i11);
            this.f42931a.append(i11, sVarB);
            return sVarB;
        }
    }

    r(TextInputLayout textInputLayout, b1 b1Var) {
        super(textInputLayout.getContext());
        this.f42913i = 0;
        this.f42914j = new LinkedHashSet<>();
        this.f42926v = new a();
        b bVar = new b();
        this.f42927w = bVar;
        this.f42924t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f42905a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f42906b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, zs.g.f128725u0);
        this.f42907c = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, zs.g.f128723t0);
        this.f42911g = checkableImageButtonI2;
        this.f42912h = new d(this, b1Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f42921q = appCompatTextView;
        C(b1Var);
        B(b1Var);
        D(b1Var);
        frameLayout.addView(checkableImageButtonI2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(b1 b1Var) {
        if (!b1Var.s(zs.m.R9)) {
            if (b1Var.s(zs.m.f129092w9)) {
                this.f42915k = pt.c.b(getContext(), b1Var, zs.m.f129092w9);
            }
            if (b1Var.s(zs.m.f129104x9)) {
                this.f42916l = d0.n(b1Var.k(zs.m.f129104x9, -1), null);
            }
        }
        if (b1Var.s(zs.m.f129068u9)) {
            U(b1Var.k(zs.m.f129068u9, 0));
            if (b1Var.s(zs.m.f129032r9)) {
                Q(b1Var.p(zs.m.f129032r9));
            }
            O(b1Var.a(zs.m.f129020q9, true));
        } else if (b1Var.s(zs.m.R9)) {
            if (b1Var.s(zs.m.S9)) {
                this.f42915k = pt.c.b(getContext(), b1Var, zs.m.S9);
            }
            if (b1Var.s(zs.m.T9)) {
                this.f42916l = d0.n(b1Var.k(zs.m.T9, -1), null);
            }
            U(b1Var.a(zs.m.R9, false) ? 1 : 0);
            Q(b1Var.p(zs.m.P9));
        }
        T(b1Var.f(zs.m.f129056t9, getResources().getDimensionPixelSize(zs.e.f128661v0)));
        if (b1Var.s(zs.m.f129080v9)) {
            X(t.b(b1Var.k(zs.m.f129080v9, -1)));
        }
    }

    private void C(b1 b1Var) {
        if (b1Var.s(zs.m.C9)) {
            this.f42908d = pt.c.b(getContext(), b1Var, zs.m.C9);
        }
        if (b1Var.s(zs.m.D9)) {
            this.f42909e = d0.n(b1Var.k(zs.m.D9, -1), null);
        }
        if (b1Var.s(zs.m.B9)) {
            c0(b1Var.g(zs.m.B9));
        }
        this.f42907c.setContentDescription(getResources().getText(zs.k.f128771f));
        ViewCompat.z0(this.f42907c, 2);
        this.f42907c.setClickable(false);
        this.f42907c.setPressable(false);
        this.f42907c.setFocusable(false);
    }

    private void D(b1 b1Var) {
        this.f42921q.setVisibility(8);
        this.f42921q.setId(zs.g.A0);
        this.f42921q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.r0(this.f42921q, 1);
        q0(b1Var.n(zs.m.f128925ia, 0));
        if (b1Var.s(zs.m.f128937ja)) {
            r0(b1Var.c(zs.m.f128937ja));
        }
        p0(b1Var.p(zs.m.f128913ha));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        z5.c.a aVar = this.f42925u;
        if (aVar == null || (accessibilityManager = this.f42924t) == null) {
            return;
        }
        z5.c.b(accessibilityManager, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f42925u == null || this.f42924t == null || !ViewCompat.S(this)) {
            return;
        }
        z5.c.a(this.f42924t, this.f42925u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(s sVar) {
        if (this.f42923s == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f42923s.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f42911g.setOnFocusChangeListener(sVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i11) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(zs.i.f128744f, viewGroup, false);
        checkableImageButton.setId(i11);
        t.e(checkableImageButton);
        if (pt.c.j(getContext())) {
            androidx.core.view.n.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i11) {
        Iterator<TextInputLayout.g> it = this.f42914j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f42905a, i11);
        }
    }

    private void s0(@NonNull s sVar) {
        sVar.s();
        this.f42925u = sVar.h();
        g();
    }

    private int t(s sVar) {
        int i11 = this.f42912h.f42933c;
        return i11 == 0 ? sVar.d() : i11;
    }

    private void t0(@NonNull s sVar) {
        M();
        this.f42925u = null;
        sVar.u();
    }

    private void u0(boolean z11) {
        if (!z11 || n() == null) {
            t.a(this.f42905a, this.f42911g, this.f42915k, this.f42916l);
            return;
        }
        Drawable drawableMutate = l5.a.r(n()).mutate();
        l5.a.n(drawableMutate, this.f42905a.getErrorCurrentTextColors());
        this.f42911g.setImageDrawable(drawableMutate);
    }

    private void v0() {
        this.f42906b.setVisibility((this.f42911g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || ((this.f42920p == null || this.f42922r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void w0() {
        this.f42907c.setVisibility(s() != null && this.f42905a.N() && this.f42905a.c0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f42905a.n0();
    }

    private void y0() {
        int visibility = this.f42921q.getVisibility();
        int i11 = (this.f42920p == null || this.f42922r) ? 8 : 0;
        if (visibility != i11) {
            m().q(i11 == 0);
        }
        v0();
        this.f42921q.setVisibility(i11);
        this.f42905a.n0();
    }

    boolean A() {
        return this.f42913i != 0;
    }

    boolean E() {
        return A() && this.f42911g.isChecked();
    }

    boolean F() {
        return this.f42906b.getVisibility() == 0 && this.f42911g.getVisibility() == 0;
    }

    boolean G() {
        return this.f42907c.getVisibility() == 0;
    }

    void H(boolean z11) {
        this.f42922r = z11;
        y0();
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f42905a.c0());
        }
    }

    void J() {
        t.d(this.f42905a, this.f42911g, this.f42915k);
    }

    void K() {
        t.d(this.f42905a, this.f42907c, this.f42908d);
    }

    void L(boolean z11) {
        boolean z12;
        boolean zIsActivated;
        boolean zIsChecked;
        s sVarM = m();
        boolean z13 = true;
        if (!sVarM.l() || (zIsChecked = this.f42911g.isChecked()) == sVarM.m()) {
            z12 = false;
        } else {
            this.f42911g.setChecked(!zIsChecked);
            z12 = true;
        }
        if (!sVarM.j() || (zIsActivated = this.f42911g.isActivated()) == sVarM.k()) {
            z13 = z12;
        } else {
            N(!zIsActivated);
        }
        if (z11 || z13) {
            J();
        }
    }

    void N(boolean z11) {
        this.f42911g.setActivated(z11);
    }

    void O(boolean z11) {
        this.f42911g.setCheckable(z11);
    }

    void P(int i11) {
        Q(i11 != 0 ? getResources().getText(i11) : null);
    }

    void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f42911g.setContentDescription(charSequence);
        }
    }

    void R(int i11) {
        S(i11 != 0 ? j.a.b(getContext(), i11) : null);
    }

    void S(Drawable drawable) {
        this.f42911g.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f42905a, this.f42911g, this.f42915k, this.f42916l);
            J();
        }
    }

    void T(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i11 != this.f42917m) {
            this.f42917m = i11;
            t.g(this.f42911g, i11);
            t.g(this.f42907c, i11);
        }
    }

    void U(int i11) {
        if (this.f42913i == i11) {
            return;
        }
        t0(m());
        int i12 = this.f42913i;
        this.f42913i = i11;
        j(i12);
        a0(i11 != 0);
        s sVarM = m();
        R(t(sVarM));
        P(sVarM.c());
        O(sVarM.l());
        if (!sVarM.i(this.f42905a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f42905a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i11);
        }
        s0(sVarM);
        V(sVarM.f());
        EditText editText = this.f42923s;
        if (editText != null) {
            sVarM.n(editText);
            h0(sVarM);
        }
        t.a(this.f42905a, this.f42911g, this.f42915k, this.f42916l);
        L(true);
    }

    void V(View.OnClickListener onClickListener) {
        t.h(this.f42911g, onClickListener, this.f42919o);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.f42919o = onLongClickListener;
        t.i(this.f42911g, onLongClickListener);
    }

    void X(@NonNull ImageView.ScaleType scaleType) {
        this.f42918n = scaleType;
        t.j(this.f42911g, scaleType);
        t.j(this.f42907c, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.f42915k != colorStateList) {
            this.f42915k = colorStateList;
            t.a(this.f42905a, this.f42911g, colorStateList, this.f42916l);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.f42916l != mode) {
            this.f42916l = mode;
            t.a(this.f42905a, this.f42911g, this.f42915k, mode);
        }
    }

    void a0(boolean z11) {
        if (F() != z11) {
            this.f42911g.setVisibility(z11 ? 0 : 8);
            v0();
            x0();
            this.f42905a.n0();
        }
    }

    void b0(int i11) {
        c0(i11 != 0 ? j.a.b(getContext(), i11) : null);
        K();
    }

    void c0(Drawable drawable) {
        this.f42907c.setImageDrawable(drawable);
        w0();
        t.a(this.f42905a, this.f42907c, this.f42908d, this.f42909e);
    }

    void d0(View.OnClickListener onClickListener) {
        t.h(this.f42907c, onClickListener, this.f42910f);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f42910f = onLongClickListener;
        t.i(this.f42907c, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.f42908d != colorStateList) {
            this.f42908d = colorStateList;
            t.a(this.f42905a, this.f42907c, colorStateList, this.f42909e);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.f42909e != mode) {
            this.f42909e = mode;
            t.a(this.f42905a, this.f42907c, this.f42908d, mode);
        }
    }

    void h() {
        this.f42911g.performClick();
        this.f42911g.jumpDrawablesToCurrentState();
    }

    void i0(int i11) {
        j0(i11 != 0 ? getResources().getText(i11) : null);
    }

    void j0(CharSequence charSequence) {
        this.f42911g.setContentDescription(charSequence);
    }

    CheckableImageButton k() {
        if (G()) {
            return this.f42907c;
        }
        if (A() && F()) {
            return this.f42911g;
        }
        return null;
    }

    void k0(int i11) {
        l0(i11 != 0 ? j.a.b(getContext(), i11) : null);
    }

    CharSequence l() {
        return this.f42911g.getContentDescription();
    }

    void l0(Drawable drawable) {
        this.f42911g.setImageDrawable(drawable);
    }

    s m() {
        return this.f42912h.c(this.f42913i);
    }

    void m0(boolean z11) {
        if (z11 && this.f42913i != 1) {
            U(1);
        } else {
            if (z11) {
                return;
            }
            U(0);
        }
    }

    Drawable n() {
        return this.f42911g.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.f42915k = colorStateList;
        t.a(this.f42905a, this.f42911g, colorStateList, this.f42916l);
    }

    int o() {
        return this.f42917m;
    }

    void o0(PorterDuff.Mode mode) {
        this.f42916l = mode;
        t.a(this.f42905a, this.f42911g, this.f42915k, mode);
    }

    int p() {
        return this.f42913i;
    }

    void p0(CharSequence charSequence) {
        this.f42920p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f42921q.setText(charSequence);
        y0();
    }

    @NonNull
    ImageView.ScaleType q() {
        return this.f42918n;
    }

    void q0(int i11) {
        androidx.core.widget.m.r(this.f42921q, i11);
    }

    CheckableImageButton r() {
        return this.f42911g;
    }

    void r0(@NonNull ColorStateList colorStateList) {
        this.f42921q.setTextColor(colorStateList);
    }

    Drawable s() {
        return this.f42907c.getDrawable();
    }

    CharSequence u() {
        return this.f42911g.getContentDescription();
    }

    Drawable v() {
        return this.f42911g.getDrawable();
    }

    CharSequence w() {
        return this.f42920p;
    }

    ColorStateList x() {
        return this.f42921q.getTextColors();
    }

    void x0() {
        if (this.f42905a.f42810d == null) {
            return;
        }
        ViewCompat.F0(this.f42921q, getContext().getResources().getDimensionPixelSize(zs.e.Z), this.f42905a.f42810d.getPaddingTop(), (F() || G()) ? 0 : ViewCompat.E(this.f42905a.f42810d), this.f42905a.f42810d.getPaddingBottom());
    }

    int y() {
        return ViewCompat.E(this) + ViewCompat.E(this.f42921q) + ((F() || G()) ? this.f42911g.getMeasuredWidth() + androidx.core.view.n.b((ViewGroup.MarginLayoutParams) this.f42911g.getLayoutParams()) : 0);
    }

    TextView z() {
        return this.f42921q;
    }
}
