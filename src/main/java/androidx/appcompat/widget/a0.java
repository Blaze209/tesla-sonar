package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final TextView f2567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z0 f2568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z0 f2569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z0 f2570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private z0 f2571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private z0 f2572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private z0 f2573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private z0 f2574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private final b0 f2575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2576j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2577k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Typeface f2578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2579m;

    class a extends j5.h.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f2580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f2582c;

        a(int i11, int i12, WeakReference weakReference) {
            this.f2580a = i11;
            this.f2581b = i12;
            this.f2582c = weakReference;
        }

        @Override // j5.h.f
        public void f(int i11) {
        }

        @Override // j5.h.f
        public void g(@NonNull Typeface typeface) {
            int i11;
            if (Build.VERSION.SDK_INT >= 28 && (i11 = this.f2580a) != -1) {
                typeface = Typeface.create(typeface, i11, (this.f2581b & 2) != 0);
            }
            a0.this.n(this.f2582c, typeface);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f2584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f2585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2586c;

        b(TextView textView, Typeface typeface, int i11) {
            this.f2584a = textView;
            this.f2585b = typeface;
            this.f2586c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2584a.setTypeface(this.f2585b, this.f2586c);
        }
    }

    a0(@NonNull TextView textView) {
        this.f2567a = textView;
        this.f2575i = new b0(textView);
    }

    private void B(int i11, float f11) {
        this.f2575i.u(i11, f11);
    }

    private void C(Context context, b1 b1Var) {
        String strO;
        this.f2576j = b1Var.k(i.j.f73914i3, this.f2576j);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int iK = b1Var.k(i.j.f73929l3, -1);
            this.f2577k = iK;
            if (iK != -1) {
                this.f2576j &= 2;
            }
        }
        if (!b1Var.s(i.j.f73924k3) && !b1Var.s(i.j.f73934m3)) {
            if (b1Var.s(i.j.f73909h3)) {
                this.f2579m = false;
                int iK2 = b1Var.k(i.j.f73909h3, 1);
                if (iK2 == 1) {
                    this.f2578l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f2578l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f2578l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2578l = null;
        int i12 = b1Var.s(i.j.f73934m3) ? i.j.f73934m3 : i.j.f73924k3;
        int i13 = this.f2577k;
        int i14 = this.f2576j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = b1Var.j(i12, this.f2576j, new a(i13, i14, new WeakReference(this.f2567a)));
                if (typefaceJ != null) {
                    if (i11 < 28 || this.f2577k == -1) {
                        this.f2578l = typefaceJ;
                    } else {
                        this.f2578l = Typeface.create(Typeface.create(typefaceJ, 0), this.f2577k, (this.f2576j & 2) != 0);
                    }
                }
                this.f2579m = this.f2578l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2578l != null || (strO = b1Var.o(i12)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2577k == -1) {
            this.f2578l = Typeface.create(strO, this.f2576j);
        } else {
            this.f2578l = Typeface.create(Typeface.create(strO, 0), this.f2577k, (this.f2576j & 2) != 0);
        }
    }

    private void a(Drawable drawable, z0 z0Var) {
        if (drawable == null || z0Var == null) {
            return;
        }
        h.i(drawable, z0Var, this.f2567a.getDrawableState());
    }

    private static z0 d(Context context, h hVar, int i11) {
        ColorStateList colorStateListF = hVar.f(context, i11);
        if (colorStateListF == null) {
            return null;
        }
        z0 z0Var = new z0();
        z0Var.f2910d = true;
        z0Var.f2907a = colorStateListF;
        return z0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f2567a.getCompoundDrawablesRelative();
            TextView textView = this.f2567a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f2567a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f2567a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f2567a.getCompoundDrawables();
        TextView textView3 = this.f2567a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        z0 z0Var = this.f2574h;
        this.f2568b = z0Var;
        this.f2569c = z0Var;
        this.f2570d = z0Var;
        this.f2571e = z0Var;
        this.f2572f = z0Var;
        this.f2573g = z0Var;
    }

    void A(int i11, float f11) {
        if (androidx.core.widget.b.f7931k1 || l()) {
            return;
        }
        B(i11, f11);
    }

    void b() {
        if (this.f2568b != null || this.f2569c != null || this.f2570d != null || this.f2571e != null) {
            Drawable[] compoundDrawables = this.f2567a.getCompoundDrawables();
            a(compoundDrawables[0], this.f2568b);
            a(compoundDrawables[1], this.f2569c);
            a(compoundDrawables[2], this.f2570d);
            a(compoundDrawables[3], this.f2571e);
        }
        if (this.f2572f == null && this.f2573g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f2567a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f2572f);
        a(compoundDrawablesRelative[2], this.f2573g);
    }

    void c() {
        this.f2575i.a();
    }

    int e() {
        return this.f2575i.g();
    }

    int f() {
        return this.f2575i.h();
    }

    int g() {
        return this.f2575i.i();
    }

    int[] h() {
        return this.f2575i.j();
    }

    int i() {
        return this.f2575i.k();
    }

    ColorStateList j() {
        z0 z0Var = this.f2574h;
        if (z0Var != null) {
            return z0Var.f2907a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        z0 z0Var = this.f2574h;
        if (z0Var != null) {
            return z0Var.f2908b;
        }
        return null;
    }

    boolean l() {
        return this.f2575i.o();
    }

    @SuppressLint({"NewApi"})
    void m(AttributeSet attributeSet, int i11) {
        boolean zA;
        boolean z11;
        String strO;
        String strO2;
        Context context = this.f2567a.getContext();
        h hVarB = h.b();
        b1 b1VarV = b1.v(context, attributeSet, i.j.f73866a0, i11, 0);
        TextView textView = this.f2567a;
        ViewCompat.n0(textView, textView.getContext(), i.j.f73866a0, attributeSet, b1VarV.r(), i11, 0);
        int iN = b1VarV.n(i.j.f73872b0, -1);
        if (b1VarV.s(i.j.f73890e0)) {
            this.f2568b = d(context, hVarB, b1VarV.n(i.j.f73890e0, 0));
        }
        if (b1VarV.s(i.j.f73878c0)) {
            this.f2569c = d(context, hVarB, b1VarV.n(i.j.f73878c0, 0));
        }
        if (b1VarV.s(i.j.f73896f0)) {
            this.f2570d = d(context, hVarB, b1VarV.n(i.j.f73896f0, 0));
        }
        if (b1VarV.s(i.j.f73884d0)) {
            this.f2571e = d(context, hVarB, b1VarV.n(i.j.f73884d0, 0));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (b1VarV.s(i.j.f73901g0)) {
            this.f2572f = d(context, hVarB, b1VarV.n(i.j.f73901g0, 0));
        }
        if (b1VarV.s(i.j.f73906h0)) {
            this.f2573g = d(context, hVarB, b1VarV.n(i.j.f73906h0, 0));
        }
        b1VarV.w();
        boolean z12 = this.f2567a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iN != -1) {
            b1 b1VarT = b1.t(context, iN, i.j.f73899f3);
            if (z12 || !b1VarT.s(i.j.f73944o3)) {
                zA = false;
                z11 = false;
            } else {
                zA = b1VarT.a(i.j.f73944o3, false);
                z11 = true;
            }
            C(context, b1VarT);
            strO2 = b1VarT.s(i.j.f73949p3) ? b1VarT.o(i.j.f73949p3) : null;
            strO = (i12 < 26 || !b1VarT.s(i.j.f73939n3)) ? null : b1VarT.o(i.j.f73939n3);
            b1VarT.w();
        } else {
            zA = false;
            z11 = false;
            strO = null;
            strO2 = null;
        }
        b1 b1VarV2 = b1.v(context, attributeSet, i.j.f73899f3, i11, 0);
        if (!z12 && b1VarV2.s(i.j.f73944o3)) {
            zA = b1VarV2.a(i.j.f73944o3, false);
            z11 = true;
        }
        if (b1VarV2.s(i.j.f73949p3)) {
            strO2 = b1VarV2.o(i.j.f73949p3);
        }
        if (i12 >= 26 && b1VarV2.s(i.j.f73939n3)) {
            strO = b1VarV2.o(i.j.f73939n3);
        }
        if (i12 >= 28 && b1VarV2.s(i.j.f73904g3) && b1VarV2.f(i.j.f73904g3, -1) == 0) {
            this.f2567a.setTextSize(0, BitmapDescriptorFactory.HUE_RED);
        }
        C(context, b1VarV2);
        b1VarV2.w();
        if (!z12 && z11) {
            s(zA);
        }
        Typeface typeface = this.f2578l;
        if (typeface != null) {
            if (this.f2577k == -1) {
                this.f2567a.setTypeface(typeface, this.f2576j);
            } else {
                this.f2567a.setTypeface(typeface);
            }
        }
        if (strO != null) {
            this.f2567a.setFontVariationSettings(strO);
        }
        if (strO2 != null) {
            this.f2567a.setTextLocales(LocaleList.forLanguageTags(strO2));
        }
        this.f2575i.p(attributeSet, i11);
        if (androidx.core.widget.b.f7931k1 && this.f2575i.k() != 0) {
            int[] iArrJ = this.f2575i.j();
            if (iArrJ.length > 0) {
                if (this.f2567a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f2567a.setAutoSizeTextTypeUniformWithConfiguration(this.f2575i.h(), this.f2575i.g(), this.f2575i.i(), 0);
                } else {
                    this.f2567a.setAutoSizeTextTypeUniformWithPresetSizes(iArrJ, 0);
                }
            }
        }
        b1 b1VarU = b1.u(context, attributeSet, i.j.f73911i0);
        int iN2 = b1VarU.n(i.j.f73951q0, -1);
        Drawable drawableC = iN2 != -1 ? hVarB.c(context, iN2) : null;
        int iN3 = b1VarU.n(i.j.f73976v0, -1);
        Drawable drawableC2 = iN3 != -1 ? hVarB.c(context, iN3) : null;
        int iN4 = b1VarU.n(i.j.f73956r0, -1);
        Drawable drawableC3 = iN4 != -1 ? hVarB.c(context, iN4) : null;
        int iN5 = b1VarU.n(i.j.f73941o0, -1);
        Drawable drawableC4 = iN5 != -1 ? hVarB.c(context, iN5) : null;
        int iN6 = b1VarU.n(i.j.f73961s0, -1);
        Drawable drawableC5 = iN6 != -1 ? hVarB.c(context, iN6) : null;
        int iN7 = b1VarU.n(i.j.f73946p0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? hVarB.c(context, iN7) : null);
        if (b1VarU.s(i.j.f73966t0)) {
            androidx.core.widget.m.k(this.f2567a, b1VarU.c(i.j.f73966t0));
        }
        if (b1VarU.s(i.j.f73971u0)) {
            androidx.core.widget.m.l(this.f2567a, j0.d(b1VarU.k(i.j.f73971u0, -1), null));
        }
        int iF = b1VarU.f(i.j.f73981w0, -1);
        int iF2 = b1VarU.f(i.j.f73986x0, -1);
        int iF3 = b1VarU.f(i.j.f73991y0, -1);
        b1VarU.w();
        if (iF != -1) {
            androidx.core.widget.m.n(this.f2567a, iF);
        }
        if (iF2 != -1) {
            androidx.core.widget.m.o(this.f2567a, iF2);
        }
        if (iF3 != -1) {
            androidx.core.widget.m.p(this.f2567a, iF3);
        }
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f2579m) {
            this.f2578l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (ViewCompat.S(textView)) {
                    textView.post(new b(textView, typeface, this.f2576j));
                } else {
                    textView.setTypeface(typeface, this.f2576j);
                }
            }
        }
    }

    void o(boolean z11, int i11, int i12, int i13, int i14) {
        if (androidx.core.widget.b.f7931k1) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i11) {
        String strO;
        b1 b1VarT = b1.t(context, i11, i.j.f73899f3);
        if (b1VarT.s(i.j.f73944o3)) {
            s(b1VarT.a(i.j.f73944o3, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (b1VarT.s(i.j.f73904g3) && b1VarT.f(i.j.f73904g3, -1) == 0) {
            this.f2567a.setTextSize(0, BitmapDescriptorFactory.HUE_RED);
        }
        C(context, b1VarT);
        if (i12 >= 26 && b1VarT.s(i.j.f73939n3) && (strO = b1VarT.o(i.j.f73939n3)) != null) {
            this.f2567a.setFontVariationSettings(strO);
        }
        b1VarT.w();
        Typeface typeface = this.f2578l;
        if (typeface != null) {
            this.f2567a.setTypeface(typeface, this.f2576j);
        }
    }

    void r(@NonNull TextView textView, InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        b6.c.f(editorInfo, textView.getText());
    }

    void s(boolean z11) {
        this.f2567a.setAllCaps(z11);
    }

    void t(int i11, int i12, int i13, int i14) {
        this.f2575i.q(i11, i12, i13, i14);
    }

    void u(@NonNull int[] iArr, int i11) {
        this.f2575i.r(iArr, i11);
    }

    void v(int i11) {
        this.f2575i.s(i11);
    }

    void w(ColorStateList colorStateList) {
        if (this.f2574h == null) {
            this.f2574h = new z0();
        }
        z0 z0Var = this.f2574h;
        z0Var.f2907a = colorStateList;
        z0Var.f2910d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f2574h == null) {
            this.f2574h = new z0();
        }
        z0 z0Var = this.f2574h;
        z0Var.f2908b = mode;
        z0Var.f2909c = mode != null;
        z();
    }
}
