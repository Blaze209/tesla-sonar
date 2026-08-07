package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final boolean f42269t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NonNull
    private static final Paint f42270u0 = null;
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private pt.a D;
    private pt.a E;
    private CharSequence G;
    private CharSequence H;
    private boolean I;
    private boolean K;
    private Bitmap L;
    private Paint M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private int S;
    private int[] T;
    private boolean U;

    @NonNull
    private final TextPaint V;

    @NonNull
    private final TextPaint W;
    private TimeInterpolator X;
    private TimeInterpolator Y;
    private float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f42271a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f42272a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f42273b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f42274b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42275c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private ColorStateList f42276c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f42277d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f42278d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f42279e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f42280e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42281f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private float f42282f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final Rect f42283g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private ColorStateList f42284g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final Rect f42285h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f42286h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private final RectF f42287i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f42288i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private float f42290j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private StaticLayout f42292k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f42294l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f42296m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f42297n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private float f42298n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f42299o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private CharSequence f42300o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f42301p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f42303q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f42305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f42307s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f42309t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f42310u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f42311v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Typeface f42312w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Typeface f42313x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Typeface f42314y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Typeface f42315z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f42289j = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f42291k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f42293l = 15.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f42295m = 15.0f;
    private TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    private boolean J = true;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f42302p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f42304q0 = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f42306r0 = 1.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f42308s0 = v.f42361n;

    class a implements pt.a.InterfaceC2201a {
        a() {
        }

        @Override // pt.a.InterfaceC2201a
        public void a(Typeface typeface) {
            b.this.T(typeface);
        }
    }

    public b(View view) {
        this.f42271a = view;
        TextPaint textPaint = new TextPaint(EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        this.V = textPaint;
        this.W = new TextPaint(textPaint);
        this.f42285h = new Rect();
        this.f42283g = new Rect();
        this.f42287i = new RectF();
        this.f42279e = e();
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.f42293l);
        textPaint.setTypeface(this.f42315z);
        textPaint.setLetterSpacing(this.f42288i0);
    }

    private void B(float f11) {
        if (this.f42275c) {
            this.f42287i.set(f11 < this.f42279e ? this.f42283g : this.f42285h);
            return;
        }
        this.f42287i.left = G(this.f42283g.left, this.f42285h.left, f11, this.X);
        this.f42287i.top = G(this.f42303q, this.f42305r, f11, this.X);
        this.f42287i.right = G(this.f42283g.right, this.f42285h.right, f11, this.X);
        this.f42287i.bottom = G(this.f42283g.bottom, this.f42285h.bottom, f11, this.X);
    }

    private static boolean C(float f11, float f12) {
        return Math.abs(f11 - f12) < 1.0E-5f;
    }

    private boolean D() {
        return ViewCompat.A(this.f42271a) == 1;
    }

    private boolean F(@NonNull CharSequence charSequence, boolean z11) {
        return (z11 ? s5.h.f110185d : s5.h.f110184c).isRtl(charSequence, 0, charSequence.length());
    }

    private static float G(float f11, float f12, float f13, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f13 = timeInterpolator.getInterpolation(f13);
        }
        return at.b.a(f11, f12, f13);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean L(@NonNull Rect rect, int i11, int i12, int i13, int i14) {
        return rect.left == i11 && rect.top == i12 && rect.right == i13 && rect.bottom == i14;
    }

    private void Q(float f11) {
        this.f42296m0 = f11;
        ViewCompat.g0(this.f42271a);
    }

    private boolean U(Typeface typeface) {
        pt.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f42314y == typeface) {
            return false;
        }
        this.f42314y = typeface;
        Typeface typefaceB = pt.g.b(this.f42271a.getContext().getResources().getConfiguration(), typeface);
        this.f42313x = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f42314y;
        }
        this.f42312w = typefaceB;
        return true;
    }

    private void Y(float f11) {
        this.f42298n0 = f11;
        ViewCompat.g0(this.f42271a);
    }

    private static int a(int i11, int i12, float f11) {
        float f12 = 1.0f - f11;
        return Color.argb(Math.round((Color.alpha(i11) * f12) + (Color.alpha(i12) * f11)), Math.round((Color.red(i11) * f12) + (Color.red(i12) * f11)), Math.round((Color.green(i11) * f12) + (Color.green(i12) * f11)), Math.round((Color.blue(i11) * f12) + (Color.blue(i12) * f11)));
    }

    private void b(boolean z11) {
        StaticLayout staticLayout;
        i(1.0f, z11);
        CharSequence charSequence = this.H;
        if (charSequence != null && (staticLayout = this.f42292k0) != null) {
            this.f42300o0 = TextUtils.ellipsize(charSequence, this.V, staticLayout.getWidth(), this.F);
        }
        CharSequence charSequence2 = this.f42300o0;
        float fI = BitmapDescriptorFactory.HUE_RED;
        if (charSequence2 != null) {
            this.f42294l0 = I(this.V, charSequence2);
        } else {
            this.f42294l0 = BitmapDescriptorFactory.HUE_RED;
        }
        int iB = androidx.core.view.k.b(this.f42291k, this.I ? 1 : 0);
        int i11 = iB & 112;
        if (i11 == 48) {
            this.f42305r = this.f42285h.top;
        } else if (i11 != 80) {
            this.f42305r = this.f42285h.centerY() - ((this.V.descent() - this.V.ascent()) / 2.0f);
        } else {
            this.f42305r = this.f42285h.bottom + this.V.ascent();
        }
        int i12 = iB & 8388615;
        if (i12 == 1) {
            this.f42309t = this.f42285h.centerX() - (this.f42294l0 / 2.0f);
        } else if (i12 != 5) {
            this.f42309t = this.f42285h.left;
        } else {
            this.f42309t = this.f42285h.right - this.f42294l0;
        }
        i(BitmapDescriptorFactory.HUE_RED, z11);
        StaticLayout staticLayout2 = this.f42292k0;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f42292k0;
        if (staticLayout3 == null || this.f42302p0 <= 1) {
            CharSequence charSequence3 = this.H;
            if (charSequence3 != null) {
                fI = I(this.V, charSequence3);
            }
        } else {
            fI = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f42292k0;
        this.f42301p = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int iB2 = androidx.core.view.k.b(this.f42289j, this.I ? 1 : 0);
        int i13 = iB2 & 112;
        if (i13 == 48) {
            this.f42303q = this.f42283g.top;
        } else if (i13 != 80) {
            this.f42303q = this.f42283g.centerY() - (height / 2.0f);
        } else {
            this.f42303q = (this.f42283g.bottom - height) + this.V.descent();
        }
        int i14 = iB2 & 8388615;
        if (i14 == 1) {
            this.f42307s = this.f42283g.centerX() - (fI / 2.0f);
        } else if (i14 != 5) {
            this.f42307s = this.f42283g.left;
        } else {
            this.f42307s = this.f42283g.right - fI;
        }
        j();
        d0(this.f42273b);
    }

    private boolean b0(Typeface typeface) {
        pt.a aVar = this.D;
        if (aVar != null) {
            aVar.c();
        }
        if (this.B == typeface) {
            return false;
        }
        this.B = typeface;
        Typeface typefaceB = pt.g.b(this.f42271a.getContext().getResources().getConfiguration(), typeface);
        this.A = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.B;
        }
        this.f42315z = typefaceB;
        return true;
    }

    private void c() {
        g(this.f42273b);
    }

    private float d(float f11) {
        float f12 = this.f42279e;
        return f11 <= f12 ? at.b.b(1.0f, BitmapDescriptorFactory.HUE_RED, this.f42277d, f12, f11) : at.b.b(BitmapDescriptorFactory.HUE_RED, 1.0f, f12, 1.0f, f11);
    }

    private void d0(float f11) {
        h(f11);
        boolean z11 = f42269t0 && this.N != 1.0f;
        this.K = z11;
        if (z11) {
            n();
        }
        ViewCompat.g0(this.f42271a);
    }

    private float e() {
        float f11 = this.f42277d;
        return f11 + ((1.0f - f11) * 0.5f);
    }

    private boolean f(@NonNull CharSequence charSequence) {
        boolean zD = D();
        return this.J ? F(charSequence, zD) : zD;
    }

    private void g(float f11) {
        float f12;
        B(f11);
        if (!this.f42275c) {
            this.f42310u = G(this.f42307s, this.f42309t, f11, this.X);
            this.f42311v = G(this.f42303q, this.f42305r, f11, this.X);
            d0(f11);
            f12 = f11;
        } else if (f11 < this.f42279e) {
            this.f42310u = this.f42307s;
            this.f42311v = this.f42303q;
            d0(BitmapDescriptorFactory.HUE_RED);
            f12 = 0.0f;
        } else {
            this.f42310u = this.f42309t;
            this.f42311v = this.f42305r - Math.max(0, this.f42281f);
            d0(1.0f);
            f12 = 1.0f;
        }
        TimeInterpolator timeInterpolator = at.b.f14973b;
        Q(1.0f - G(BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f - f11, timeInterpolator));
        Y(G(1.0f, BitmapDescriptorFactory.HUE_RED, f11, timeInterpolator));
        if (this.f42299o != this.f42297n) {
            this.V.setColor(a(v(), t(), f12));
        } else {
            this.V.setColor(t());
        }
        int i11 = Build.VERSION.SDK_INT;
        float f13 = this.f42286h0;
        float f14 = this.f42288i0;
        if (f13 != f14) {
            this.V.setLetterSpacing(G(f14, f13, f11, timeInterpolator));
        } else {
            this.V.setLetterSpacing(f13);
        }
        this.P = G(this.f42278d0, this.Z, f11, null);
        this.Q = G(this.f42280e0, this.f42272a0, f11, null);
        this.R = G(this.f42282f0, this.f42274b0, f11, null);
        int iA = a(u(this.f42284g0), u(this.f42276c0), f11);
        this.S = iA;
        this.V.setShadowLayer(this.P, this.Q, this.R, iA);
        if (this.f42275c) {
            this.V.setAlpha((int) (d(f11) * this.V.getAlpha()));
            if (i11 >= 31) {
                TextPaint textPaint = this.V;
                textPaint.setShadowLayer(this.P, this.Q, this.R, ht.a.a(this.S, textPaint.getAlpha()));
            }
        }
        ViewCompat.g0(this.f42271a);
    }

    private void h(float f11) {
        i(f11, false);
    }

    private void i(float f11, boolean z11) {
        float f12;
        float f13;
        Typeface typeface;
        if (this.G == null) {
            return;
        }
        float fWidth = this.f42285h.width();
        float fWidth2 = this.f42283g.width();
        if (C(f11, 1.0f)) {
            f12 = this.f42295m;
            f13 = this.f42286h0;
            this.N = 1.0f;
            typeface = this.f42312w;
        } else {
            float f14 = this.f42293l;
            float f15 = this.f42288i0;
            Typeface typeface2 = this.f42315z;
            if (C(f11, BitmapDescriptorFactory.HUE_RED)) {
                this.N = 1.0f;
            } else {
                this.N = G(this.f42293l, this.f42295m, f11, this.Y) / this.f42293l;
            }
            float f16 = this.f42295m / this.f42293l;
            fWidth = (z11 || this.f42275c || fWidth2 * f16 <= fWidth) ? fWidth2 : Math.min(fWidth / f16, fWidth2);
            f12 = f14;
            f13 = f15;
            typeface = typeface2;
        }
        boolean z12 = false;
        if (fWidth > BitmapDescriptorFactory.HUE_RED) {
            boolean z13 = this.O != f12;
            boolean z14 = this.f42290j0 != f13;
            boolean z15 = this.C != typeface;
            StaticLayout staticLayout = this.f42292k0;
            boolean z16 = z13 || z14 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z15 || this.U;
            this.O = f12;
            this.f42290j0 = f13;
            this.C = typeface;
            this.U = false;
            this.V.setLinearText(this.N != 1.0f);
            z12 = z16;
        }
        if (this.H == null || z12) {
            this.V.setTextSize(this.O);
            this.V.setTypeface(this.C);
            this.V.setLetterSpacing(this.f42290j0);
            this.I = f(this.G);
            StaticLayout staticLayoutK = k(j0() ? this.f42302p0 : 1, fWidth, this.I);
            this.f42292k0 = staticLayoutK;
            this.H = staticLayoutK.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            bitmap.recycle();
            this.L = null;
        }
    }

    private boolean j0() {
        if (this.f42302p0 > 1) {
            return (!this.I || this.f42275c) && !this.K;
        }
        return false;
    }

    private StaticLayout k(int i11, float f11, boolean z11) {
        return (StaticLayout) u5.h.g(v.b(this.G, this.V, (int) f11).d(this.F).g(z11).c(i11 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i11).h(this.f42304q0, this.f42306r0).e(this.f42308s0).j(null).a());
    }

    private void m(@NonNull Canvas canvas, float f11, float f12) {
        int alpha = this.V.getAlpha();
        canvas.translate(f11, f12);
        if (!this.f42275c) {
            this.V.setAlpha((int) (this.f42298n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.V;
                textPaint.setShadowLayer(this.P, this.Q, this.R, ht.a.a(this.S, textPaint.getAlpha()));
            }
            this.f42292k0.draw(canvas);
        }
        if (!this.f42275c) {
            this.V.setAlpha((int) (this.f42296m0 * alpha));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            TextPaint textPaint2 = this.V;
            textPaint2.setShadowLayer(this.P, this.Q, this.R, ht.a.a(this.S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f42292k0.getLineBaseline(0);
        CharSequence charSequence = this.f42300o0;
        float f13 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), BitmapDescriptorFactory.HUE_RED, f13, this.V);
        if (i11 >= 31) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if (this.f42275c) {
            return;
        }
        String strTrim = this.f42300o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f42292k0.getLineEnd(0), str.length()), BitmapDescriptorFactory.HUE_RED, f13, (Paint) this.V);
    }

    private void n() {
        if (this.L != null || this.f42283g.isEmpty() || TextUtils.isEmpty(this.H)) {
            return;
        }
        g(BitmapDescriptorFactory.HUE_RED);
        int width = this.f42292k0.getWidth();
        int height = this.f42292k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f42292k0.draw(new Canvas(this.L));
        if (this.M == null) {
            this.M = new Paint(3);
        }
    }

    private float r(int i11, int i12) {
        if (i12 == 17 || (i12 & 7) == 1) {
            return (i11 / 2.0f) - (this.f42294l0 / 2.0f);
        }
        if ((i12 & 8388613) == 8388613 || (i12 & 5) == 5) {
            return this.I ? this.f42285h.left : this.f42285h.right - this.f42294l0;
        }
        return this.I ? this.f42285h.right - this.f42294l0 : this.f42285h.left;
    }

    private float s(@NonNull RectF rectF, int i11, int i12) {
        if (i12 == 17 || (i12 & 7) == 1) {
            return (i11 / 2.0f) + (this.f42294l0 / 2.0f);
        }
        if ((i12 & 8388613) == 8388613 || (i12 & 5) == 5) {
            return this.I ? rectF.left + this.f42294l0 : this.f42285h.right;
        }
        return this.I ? this.f42285h.right : rectF.left + this.f42294l0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f42297n);
    }

    private Layout.Alignment y() {
        int iB = androidx.core.view.k.b(this.f42289j, this.I ? 1 : 0) & 7;
        if (iB == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (iB != 5) {
            return this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
    }

    private void z(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.f42295m);
        textPaint.setTypeface(this.f42312w);
        textPaint.setLetterSpacing(this.f42286h0);
    }

    public final boolean E() {
        ColorStateList colorStateList = this.f42299o;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f42297n;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public void H(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f42314y;
            if (typeface != null) {
                this.f42313x = pt.g.b(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = pt.g.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f42313x;
            if (typeface3 == null) {
                typeface3 = this.f42314y;
            }
            this.f42312w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.f42315z = typeface4;
            K(true);
        }
    }

    public void J() {
        K(false);
    }

    public void K(boolean z11) {
        if ((this.f42271a.getHeight() <= 0 || this.f42271a.getWidth() <= 0) && !z11) {
            return;
        }
        b(z11);
        c();
    }

    public void M(ColorStateList colorStateList) {
        if (this.f42299o == colorStateList && this.f42297n == colorStateList) {
            return;
        }
        this.f42299o = colorStateList;
        this.f42297n = colorStateList;
        J();
    }

    public void N(int i11, int i12, int i13, int i14) {
        if (L(this.f42285h, i11, i12, i13, i14)) {
            return;
        }
        this.f42285h.set(i11, i12, i13, i14);
        this.U = true;
    }

    public void O(@NonNull Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i11) {
        pt.d dVar = new pt.d(this.f42271a.getContext(), i11);
        if (dVar.i() != null) {
            this.f42299o = dVar.i();
        }
        if (dVar.j() != BitmapDescriptorFactory.HUE_RED) {
            this.f42295m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f103990c;
        if (colorStateList != null) {
            this.f42276c0 = colorStateList;
        }
        this.f42272a0 = dVar.f103995h;
        this.f42274b0 = dVar.f103996i;
        this.Z = dVar.f103997j;
        this.f42286h0 = dVar.f103999l;
        pt.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        this.E = new pt.a(new a(), dVar.e());
        dVar.h(this.f42271a.getContext(), this.E);
        J();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f42299o != colorStateList) {
            this.f42299o = colorStateList;
            J();
        }
    }

    public void S(int i11) {
        if (this.f42291k != i11) {
            this.f42291k = i11;
            J();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            J();
        }
    }

    public void V(int i11, int i12, int i13, int i14) {
        if (L(this.f42283g, i11, i12, i13, i14)) {
            return;
        }
        this.f42283g.set(i11, i12, i13, i14);
        this.U = true;
    }

    public void W(@NonNull Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f11) {
        if (this.f42288i0 != f11) {
            this.f42288i0 = f11;
            J();
        }
    }

    public void Z(int i11) {
        if (this.f42289j != i11) {
            this.f42289j = i11;
            J();
        }
    }

    public void a0(float f11) {
        if (this.f42293l != f11) {
            this.f42293l = f11;
            J();
        }
    }

    public void c0(float f11) {
        float fA = o5.a.a(f11, BitmapDescriptorFactory.HUE_RED, 1.0f);
        if (fA != this.f42273b) {
            this.f42273b = fA;
            c();
        }
    }

    public void e0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        J();
    }

    public final boolean f0(int[] iArr) {
        this.T = iArr;
        if (!E()) {
            return false;
        }
        J();
        return true;
    }

    public void g0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.H = null;
            j();
            J();
        }
    }

    public void h0(TimeInterpolator timeInterpolator) {
        this.Y = timeInterpolator;
        J();
    }

    public void i0(Typeface typeface) {
        boolean zU = U(typeface);
        boolean zB0 = b0(typeface);
        if (zU || zB0) {
            J();
        }
    }

    public void l(@NonNull Canvas canvas) {
        int iSave = canvas.save();
        if (this.H == null || this.f42287i.width() <= BitmapDescriptorFactory.HUE_RED || this.f42287i.height() <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        this.V.setTextSize(this.O);
        float f11 = this.f42310u;
        float f12 = this.f42311v;
        boolean z11 = this.K && this.L != null;
        float f13 = this.N;
        if (f13 != 1.0f && !this.f42275c) {
            canvas.scale(f13, f13, f11, f12);
        }
        if (z11) {
            canvas.drawBitmap(this.L, f11, f12, this.M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!j0() || (this.f42275c && this.f42273b <= this.f42279e)) {
            canvas.translate(f11, f12);
            this.f42292k0.draw(canvas);
        } else {
            m(canvas, this.f42310u - this.f42292k0.getLineStart(0), f12);
        }
        canvas.restoreToCount(iSave);
    }

    public void o(@NonNull RectF rectF, int i11, int i12) {
        this.I = f(this.G);
        rectF.left = Math.max(r(i11, i12), this.f42285h.left);
        rectF.top = this.f42285h.top;
        rectF.right = Math.min(s(rectF, i11, i12), this.f42285h.right);
        rectF.bottom = this.f42285h.top + q();
    }

    public ColorStateList p() {
        return this.f42299o;
    }

    public float q() {
        z(this.W);
        return -this.W.ascent();
    }

    public int t() {
        return u(this.f42299o);
    }

    public float w() {
        A(this.W);
        return -this.W.ascent();
    }

    public float x() {
        return this.f42273b;
    }
}
