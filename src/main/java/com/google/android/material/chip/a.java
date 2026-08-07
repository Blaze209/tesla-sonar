package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import at.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.x;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import pt.c;
import pt.d;
import st.g;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class a extends g implements Drawable.Callback, x.b {
    private static final int[] J0 = {R.attr.state_enabled};
    private static final ShapeDrawable K0 = new ShapeDrawable(new OvalShape());
    private ColorStateList A;
    private PorterDuff.Mode A0;
    private float B;
    private int[] B0;
    private float C;
    private boolean C0;
    private ColorStateList D;
    private ColorStateList D0;
    private float E;

    @NonNull
    private WeakReference<InterfaceC0661a> E0;
    private ColorStateList F;
    private TextUtils.TruncateAt F0;
    private CharSequence G;
    private boolean G0;
    private boolean H;
    private int H0;
    private Drawable I;
    private boolean I0;
    private ColorStateList J;
    private float K;
    private boolean L;
    private boolean M;
    private Drawable N;
    private Drawable O;
    private ColorStateList P;
    private float Q;
    private CharSequence R;
    private boolean S;
    private boolean T;
    private Drawable U;
    private ColorStateList V;
    private i W;
    private i X;
    private float Y;
    private float Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f41876a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f41877b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private float f41878c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f41879d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f41880e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private float f41881f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NonNull
    private final Context f41882g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final Paint f41883h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final Paint f41884i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final Paint.FontMetrics f41885j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final RectF f41886k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final PointF f41887l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final Path f41888m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @NonNull
    private final x f41889n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f41890o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f41891p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f41892q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f41893r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f41894s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f41895t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f41896u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f41897v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f41898w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private ColorFilter f41899x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private PorterDuffColorFilter f41900y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ColorStateList f41901z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private ColorStateList f41902z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0661a {
        void a();
    }

    private a(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.C = -1.0f;
        this.f41883h0 = new Paint(1);
        this.f41885j0 = new Paint.FontMetrics();
        this.f41886k0 = new RectF();
        this.f41887l0 = new PointF();
        this.f41888m0 = new Path();
        this.f41898w0 = 255;
        this.A0 = PorterDuff.Mode.SRC_IN;
        this.E0 = new WeakReference<>(null);
        Q(context);
        this.f41882g0 = context;
        x xVar = new x(this);
        this.f41889n0 = xVar;
        this.G = "";
        xVar.g().density = context.getResources().getDisplayMetrics().density;
        this.f41884i0 = null;
        int[] iArr = J0;
        setState(iArr);
        r2(iArr);
        this.G0 = true;
        if (qt.b.f106147a) {
            K0.setTint(-1);
        }
    }

    private boolean A0() {
        return this.T && this.U != null && this.S;
    }

    private void A1(AttributeSet attributeSet, int i11, int i12) {
        TypedArray typedArrayI = a0.i(this.f41882g0, attributeSet, m.f129012q1, i11, i12, new int[0]);
        this.I0 = typedArrayI.hasValue(m.f128833b2);
        h2(c.a(this.f41882g0, typedArrayI, m.O1));
        L1(c.a(this.f41882g0, typedArrayI, m.B1));
        Z1(typedArrayI.getDimension(m.J1, BitmapDescriptorFactory.HUE_RED));
        if (typedArrayI.hasValue(m.C1)) {
            N1(typedArrayI.getDimension(m.C1, BitmapDescriptorFactory.HUE_RED));
        }
        d2(c.a(this.f41882g0, typedArrayI, m.M1));
        f2(typedArrayI.getDimension(m.N1, BitmapDescriptorFactory.HUE_RED));
        E2(c.a(this.f41882g0, typedArrayI, m.f128821a2));
        J2(typedArrayI.getText(m.f129072v1));
        d dVarH = c.h(this.f41882g0, typedArrayI, m.f129024r1);
        dVarH.l(typedArrayI.getDimension(m.f129036s1, dVarH.j()));
        K2(dVarH);
        int i13 = typedArrayI.getInt(m.f129048t1, 0);
        if (i13 == 1) {
            w2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            w2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            w2(TextUtils.TruncateAt.END);
        }
        Y1(typedArrayI.getBoolean(m.I1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            Y1(typedArrayI.getBoolean(m.F1, false));
        }
        R1(c.e(this.f41882g0, typedArrayI, m.E1));
        if (typedArrayI.hasValue(m.H1)) {
            V1(c.a(this.f41882g0, typedArrayI, m.H1));
        }
        T1(typedArrayI.getDimension(m.G1, -1.0f));
        u2(typedArrayI.getBoolean(m.V1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            u2(typedArrayI.getBoolean(m.Q1, false));
        }
        i2(c.e(this.f41882g0, typedArrayI, m.P1));
        s2(c.a(this.f41882g0, typedArrayI, m.U1));
        n2(typedArrayI.getDimension(m.S1, BitmapDescriptorFactory.HUE_RED));
        D1(typedArrayI.getBoolean(m.f129084w1, false));
        K1(typedArrayI.getBoolean(m.A1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            K1(typedArrayI.getBoolean(m.f129107y1, false));
        }
        F1(c.e(this.f41882g0, typedArrayI, m.f129096x1));
        if (typedArrayI.hasValue(m.f129118z1)) {
            H1(c.a(this.f41882g0, typedArrayI, m.f129118z1));
        }
        H2(i.c(this.f41882g0, typedArrayI, m.f128845c2));
        x2(i.c(this.f41882g0, typedArrayI, m.X1));
        b2(typedArrayI.getDimension(m.L1, BitmapDescriptorFactory.HUE_RED));
        B2(typedArrayI.getDimension(m.Z1, BitmapDescriptorFactory.HUE_RED));
        z2(typedArrayI.getDimension(m.Y1, BitmapDescriptorFactory.HUE_RED));
        P2(typedArrayI.getDimension(m.f128869e2, BitmapDescriptorFactory.HUE_RED));
        M2(typedArrayI.getDimension(m.f128857d2, BitmapDescriptorFactory.HUE_RED));
        p2(typedArrayI.getDimension(m.T1, BitmapDescriptorFactory.HUE_RED));
        k2(typedArrayI.getDimension(m.R1, BitmapDescriptorFactory.HUE_RED));
        P1(typedArrayI.getDimension(m.D1, BitmapDescriptorFactory.HUE_RED));
        D2(typedArrayI.getDimensionPixelSize(m.f129060u1, Integer.MAX_VALUE));
        typedArrayI.recycle();
    }

    @NonNull
    public static a B0(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        a aVar = new a(context, attributeSet, i11, i12);
        aVar.A1(attributeSet, i11, i12);
        return aVar;
    }

    private void C0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (T2()) {
            r0(rect, this.f41886k0);
            RectF rectF = this.f41886k0;
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas.translate(f11, f12);
            this.U.setBounds(0, 0, (int) this.f41886k0.width(), (int) this.f41886k0.height());
            this.U.draw(canvas);
            canvas.translate(-f11, -f12);
        }
    }

    private boolean C1(@NonNull int[] iArr, @NonNull int[] iArr2) {
        boolean z11;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f41901z;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f41890o0) : 0);
        boolean state = true;
        if (this.f41890o0 != iL) {
            this.f41890o0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.A;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f41891p0) : 0);
        if (this.f41891p0 != iL2) {
            this.f41891p0 = iL2;
            zOnStateChange = true;
        }
        int i11 = ht.a.i(iL, iL2);
        if ((this.f41892q0 != i11) | (x() == null)) {
            this.f41892q0 = i11;
            b0(ColorStateList.valueOf(i11));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.D;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f41893r0) : 0;
        if (this.f41893r0 != colorForState) {
            this.f41893r0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.D0 == null || !qt.b.e(iArr)) ? 0 : this.D0.getColorForState(iArr, this.f41894s0);
        if (this.f41894s0 != colorForState2) {
            this.f41894s0 = colorForState2;
            if (this.C0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f41889n0.e() == null || this.f41889n0.e().i() == null) ? 0 : this.f41889n0.e().i().getColorForState(iArr, this.f41895t0);
        if (this.f41895t0 != colorForState3) {
            this.f41895t0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z12 = t1(getState(), R.attr.state_checked) && this.S;
        if (this.f41896u0 == z12 || this.U == null) {
            z11 = false;
        } else {
            float fS0 = s0();
            this.f41896u0 = z12;
            if (fS0 != s0()) {
                zOnStateChange = true;
                z11 = true;
            } else {
                z11 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f41902z0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f41897v0) : 0;
        if (this.f41897v0 != colorForState4) {
            this.f41897v0 = colorForState4;
            this.f41900y0 = com.google.android.material.drawable.c.m(this, this.f41902z0, this.A0);
        } else {
            state = zOnStateChange;
        }
        if (y1(this.I)) {
            state |= this.I.setState(iArr);
        }
        if (y1(this.U)) {
            state |= this.U.setState(iArr);
        }
        if (y1(this.N)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.N.setState(iArr3);
        }
        if (qt.b.f106147a && y1(this.O)) {
            state |= this.O.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z11) {
            B1();
        }
        return state;
    }

    private void D0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.I0) {
            return;
        }
        this.f41883h0.setColor(this.f41891p0);
        this.f41883h0.setStyle(Paint.Style.FILL);
        this.f41883h0.setColorFilter(r1());
        this.f41886k0.set(rect);
        canvas.drawRoundRect(this.f41886k0, O0(), O0(), this.f41883h0);
    }

    private void E0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (U2()) {
            r0(rect, this.f41886k0);
            RectF rectF = this.f41886k0;
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas.translate(f11, f12);
            this.I.setBounds(0, 0, (int) this.f41886k0.width(), (int) this.f41886k0.height());
            this.I.draw(canvas);
            canvas.translate(-f11, -f12);
        }
    }

    private void F0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.E <= BitmapDescriptorFactory.HUE_RED || this.I0) {
            return;
        }
        this.f41883h0.setColor(this.f41893r0);
        this.f41883h0.setStyle(Paint.Style.STROKE);
        if (!this.I0) {
            this.f41883h0.setColorFilter(r1());
        }
        RectF rectF = this.f41886k0;
        float f11 = rect.left;
        float f12 = this.E;
        rectF.set(f11 + (f12 / 2.0f), rect.top + (f12 / 2.0f), rect.right - (f12 / 2.0f), rect.bottom - (f12 / 2.0f));
        float f13 = this.C - (this.E / 2.0f);
        canvas.drawRoundRect(this.f41886k0, f13, f13, this.f41883h0);
    }

    private void G0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.I0) {
            return;
        }
        this.f41883h0.setColor(this.f41890o0);
        this.f41883h0.setStyle(Paint.Style.FILL);
        this.f41886k0.set(rect);
        canvas.drawRoundRect(this.f41886k0, O0(), O0(), this.f41883h0);
    }

    private void H0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (V2()) {
            u0(rect, this.f41886k0);
            RectF rectF = this.f41886k0;
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas.translate(f11, f12);
            this.N.setBounds(0, 0, (int) this.f41886k0.width(), (int) this.f41886k0.height());
            if (qt.b.f106147a) {
                this.O.setBounds(this.N.getBounds());
                this.O.jumpToCurrentState();
                this.O.draw(canvas);
            } else {
                this.N.draw(canvas);
            }
            canvas.translate(-f11, -f12);
        }
    }

    private void I0(@NonNull Canvas canvas, @NonNull Rect rect) {
        this.f41883h0.setColor(this.f41894s0);
        this.f41883h0.setStyle(Paint.Style.FILL);
        this.f41886k0.set(rect);
        if (!this.I0) {
            canvas.drawRoundRect(this.f41886k0, O0(), O0(), this.f41883h0);
        } else {
            h(new RectF(rect), this.f41888m0);
            super.p(canvas, this.f41883h0, this.f41888m0, u());
        }
    }

    private void J0(@NonNull Canvas canvas, @NonNull Rect rect) {
        Canvas canvas2;
        Paint paint = this.f41884i0;
        if (paint != null) {
            paint.setColor(k5.d.l(-16777216, 127));
            canvas.drawRect(rect, this.f41884i0);
            if (U2() || T2()) {
                r0(rect, this.f41886k0);
                canvas.drawRect(this.f41886k0, this.f41884i0);
            }
            if (this.G != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f41884i0);
            } else {
                canvas2 = canvas;
            }
            if (V2()) {
                u0(rect, this.f41886k0);
                canvas2.drawRect(this.f41886k0, this.f41884i0);
            }
            this.f41884i0.setColor(k5.d.l(-65536, 127));
            t0(rect, this.f41886k0);
            canvas2.drawRect(this.f41886k0, this.f41884i0);
            this.f41884i0.setColor(k5.d.l(-16711936, 127));
            v0(rect, this.f41886k0);
            canvas2.drawRect(this.f41886k0, this.f41884i0);
        }
    }

    private void K0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.G != null) {
            Paint.Align alignZ0 = z0(rect, this.f41887l0);
            x0(rect, this.f41886k0);
            if (this.f41889n0.e() != null) {
                this.f41889n0.g().drawableState = getState();
                this.f41889n0.n(this.f41882g0);
            }
            this.f41889n0.g().setTextAlign(alignZ0);
            int iSave = 0;
            boolean z11 = Math.round(this.f41889n0.h(n1().toString())) > Math.round(this.f41886k0.width());
            if (z11) {
                iSave = canvas.save();
                canvas.clipRect(this.f41886k0);
            }
            CharSequence charSequenceEllipsize = this.G;
            if (z11 && this.F0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f41889n0.g(), this.f41886k0.width(), this.F0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f41887l0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f41889n0.g());
            if (z11) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean T2() {
        return this.T && this.U != null && this.f41896u0;
    }

    private boolean U2() {
        return this.H && this.I != null;
    }

    private boolean V2() {
        return this.M && this.N != null;
    }

    private void W2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void X2() {
        this.D0 = this.C0 ? qt.b.d(this.F) : null;
    }

    @TargetApi(21)
    private void Y2() {
        this.O = new RippleDrawable(qt.b.d(l1()), this.N, K0);
    }

    private float f1() {
        Drawable drawable = this.f41896u0 ? this.U : this.I;
        float fCeil = this.K;
        if (fCeil <= BitmapDescriptorFactory.HUE_RED && drawable != null) {
            fCeil = (float) Math.ceil(d0.h(this.f41882g0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float g1() {
        Drawable drawable = this.f41896u0 ? this.U : this.I;
        float f11 = this.K;
        return (f11 > BitmapDescriptorFactory.HUE_RED || drawable == null) ? f11 : drawable.getIntrinsicWidth();
    }

    private void h2(ColorStateList colorStateList) {
        if (this.f41901z != colorStateList) {
            this.f41901z = colorStateList;
            onStateChange(getState());
        }
    }

    private void q0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        l5.a.m(drawable, l5.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.N) {
            if (drawable.isStateful()) {
                drawable.setState(c1());
            }
            l5.a.o(drawable, this.P);
            return;
        }
        Drawable drawable2 = this.I;
        if (drawable == drawable2 && this.L) {
            l5.a.o(drawable2, this.J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void r0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (U2() || T2()) {
            float f11 = this.Y + this.Z;
            float fG1 = g1();
            if (l5.a.f(this) == 0) {
                float f12 = rect.left + f11;
                rectF.left = f12;
                rectF.right = f12 + fG1;
            } else {
                float f13 = rect.right - f11;
                rectF.right = f13;
                rectF.left = f13 - fG1;
            }
            float fF1 = f1();
            float fExactCenterY = rect.exactCenterY() - (fF1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fF1;
        }
    }

    private ColorFilter r1() {
        ColorFilter colorFilter = this.f41899x0;
        return colorFilter != null ? colorFilter : this.f41900y0;
    }

    private void t0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.set(rect);
        if (V2()) {
            float f11 = this.f41881f0 + this.f41880e0 + this.Q + this.f41879d0 + this.f41878c0;
            if (l5.a.f(this) == 0) {
                rectF.right = rect.right - f11;
            } else {
                rectF.left = rect.left + f11;
            }
        }
    }

    private static boolean t1(int[] iArr, int i11) {
        if (iArr == null) {
            return false;
        }
        for (int i12 : iArr) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    private void u0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (V2()) {
            float f11 = this.f41881f0 + this.f41880e0;
            if (l5.a.f(this) == 0) {
                float f12 = rect.right - f11;
                rectF.right = f12;
                rectF.left = f12 - this.Q;
            } else {
                float f13 = rect.left + f11;
                rectF.left = f13;
                rectF.right = f13 + this.Q;
            }
            float fExactCenterY = rect.exactCenterY();
            float f14 = this.Q;
            float f15 = fExactCenterY - (f14 / 2.0f);
            rectF.top = f15;
            rectF.bottom = f15 + f14;
        }
    }

    private void v0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (V2()) {
            float f11 = this.f41881f0 + this.f41880e0 + this.Q + this.f41879d0 + this.f41878c0;
            if (l5.a.f(this) == 0) {
                float f12 = rect.right;
                rectF.right = f12;
                rectF.left = f12 - f11;
            } else {
                int i11 = rect.left;
                rectF.left = i11;
                rectF.right = i11 + f11;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void x0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (this.G != null) {
            float fS0 = this.Y + s0() + this.f41877b0;
            float fW0 = this.f41881f0 + w0() + this.f41878c0;
            if (l5.a.f(this) == 0) {
                rectF.left = rect.left + fS0;
                rectF.right = rect.right - fW0;
            } else {
                rectF.left = rect.left + fW0;
                rectF.right = rect.right - fS0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean x1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float y0() {
        this.f41889n0.g().getFontMetrics(this.f41885j0);
        Paint.FontMetrics fontMetrics = this.f41885j0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean y1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean z1(d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    public void A2(int i11) {
        z2(this.f41882g0.getResources().getDimension(i11));
    }

    protected void B1() {
        InterfaceC0661a interfaceC0661a = this.E0.get();
        if (interfaceC0661a != null) {
            interfaceC0661a.a();
        }
    }

    public void B2(float f11) {
        if (this.Z != f11) {
            float fS0 = s0();
            this.Z = f11;
            float fS1 = s0();
            invalidateSelf();
            if (fS0 != fS1) {
                B1();
            }
        }
    }

    public void C2(int i11) {
        B2(this.f41882g0.getResources().getDimension(i11));
    }

    public void D1(boolean z11) {
        if (this.S != z11) {
            this.S = z11;
            float fS0 = s0();
            if (!z11 && this.f41896u0) {
                this.f41896u0 = false;
            }
            float fS1 = s0();
            invalidateSelf();
            if (fS0 != fS1) {
                B1();
            }
        }
    }

    public void D2(int i11) {
        this.H0 = i11;
    }

    public void E1(int i11) {
        D1(this.f41882g0.getResources().getBoolean(i11));
    }

    public void E2(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            X2();
            onStateChange(getState());
        }
    }

    public void F1(Drawable drawable) {
        if (this.U != drawable) {
            float fS0 = s0();
            this.U = drawable;
            float fS1 = s0();
            W2(this.U);
            q0(this.U);
            invalidateSelf();
            if (fS0 != fS1) {
                B1();
            }
        }
    }

    public void F2(int i11) {
        E2(j.a.a(this.f41882g0, i11));
    }

    public void G1(int i11) {
        F1(j.a.b(this.f41882g0, i11));
    }

    void G2(boolean z11) {
        this.G0 = z11;
    }

    public void H1(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (A0()) {
                l5.a.o(this.U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void H2(i iVar) {
        this.W = iVar;
    }

    public void I1(int i11) {
        H1(j.a.a(this.f41882g0, i11));
    }

    public void I2(int i11) {
        H2(i.d(this.f41882g0, i11));
    }

    public void J1(int i11) {
        K1(this.f41882g0.getResources().getBoolean(i11));
    }

    public void J2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.G, charSequence)) {
            return;
        }
        this.G = charSequence;
        this.f41889n0.m(true);
        invalidateSelf();
        B1();
    }

    public void K1(boolean z11) {
        if (this.T != z11) {
            boolean zT2 = T2();
            this.T = z11;
            boolean zT3 = T2();
            if (zT2 != zT3) {
                if (zT3) {
                    q0(this.U);
                } else {
                    W2(this.U);
                }
                invalidateSelf();
                B1();
            }
        }
    }

    public void K2(d dVar) {
        this.f41889n0.k(dVar, this.f41882g0);
    }

    public Drawable L0() {
        return this.U;
    }

    public void L1(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            onStateChange(getState());
        }
    }

    public void L2(int i11) {
        K2(new d(this.f41882g0, i11));
    }

    public ColorStateList M0() {
        return this.V;
    }

    public void M1(int i11) {
        L1(j.a.a(this.f41882g0, i11));
    }

    public void M2(float f11) {
        if (this.f41878c0 != f11) {
            this.f41878c0 = f11;
            invalidateSelf();
            B1();
        }
    }

    public ColorStateList N0() {
        return this.A;
    }

    @Deprecated
    public void N1(float f11) {
        if (this.C != f11) {
            this.C = f11;
            setShapeAppearanceModel(E().w(f11));
        }
    }

    public void N2(int i11) {
        M2(this.f41882g0.getResources().getDimension(i11));
    }

    public float O0() {
        return this.I0 ? J() : this.C;
    }

    @Deprecated
    public void O1(int i11) {
        N1(this.f41882g0.getResources().getDimension(i11));
    }

    public void O2(float f11) {
        d dVarO1 = o1();
        if (dVarO1 != null) {
            dVarO1.l(f11);
            this.f41889n0.g().setTextSize(f11);
            a();
        }
    }

    public float P0() {
        return this.f41881f0;
    }

    public void P1(float f11) {
        if (this.f41881f0 != f11) {
            this.f41881f0 = f11;
            invalidateSelf();
            B1();
        }
    }

    public void P2(float f11) {
        if (this.f41877b0 != f11) {
            this.f41877b0 = f11;
            invalidateSelf();
            B1();
        }
    }

    public Drawable Q0() {
        Drawable drawable = this.I;
        if (drawable != null) {
            return l5.a.q(drawable);
        }
        return null;
    }

    public void Q1(int i11) {
        P1(this.f41882g0.getResources().getDimension(i11));
    }

    public void Q2(int i11) {
        P2(this.f41882g0.getResources().getDimension(i11));
    }

    public float R0() {
        return this.K;
    }

    public void R1(Drawable drawable) {
        Drawable drawableQ0 = Q0();
        if (drawableQ0 != drawable) {
            float fS0 = s0();
            this.I = drawable != null ? l5.a.r(drawable).mutate() : null;
            float fS1 = s0();
            W2(drawableQ0);
            if (U2()) {
                q0(this.I);
            }
            invalidateSelf();
            if (fS0 != fS1) {
                B1();
            }
        }
    }

    public void R2(boolean z11) {
        if (this.C0 != z11) {
            this.C0 = z11;
            X2();
            onStateChange(getState());
        }
    }

    public ColorStateList S0() {
        return this.J;
    }

    public void S1(int i11) {
        R1(j.a.b(this.f41882g0, i11));
    }

    boolean S2() {
        return this.G0;
    }

    public float T0() {
        return this.B;
    }

    public void T1(float f11) {
        if (this.K != f11) {
            float fS0 = s0();
            this.K = f11;
            float fS1 = s0();
            invalidateSelf();
            if (fS0 != fS1) {
                B1();
            }
        }
    }

    public float U0() {
        return this.Y;
    }

    public void U1(int i11) {
        T1(this.f41882g0.getResources().getDimension(i11));
    }

    public ColorStateList V0() {
        return this.D;
    }

    public void V1(ColorStateList colorStateList) {
        this.L = true;
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (U2()) {
                l5.a.o(this.I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float W0() {
        return this.E;
    }

    public void W1(int i11) {
        V1(j.a.a(this.f41882g0, i11));
    }

    public Drawable X0() {
        Drawable drawable = this.N;
        if (drawable != null) {
            return l5.a.q(drawable);
        }
        return null;
    }

    public void X1(int i11) {
        Y1(this.f41882g0.getResources().getBoolean(i11));
    }

    public CharSequence Y0() {
        return this.R;
    }

    public void Y1(boolean z11) {
        if (this.H != z11) {
            boolean zU2 = U2();
            this.H = z11;
            boolean zU3 = U2();
            if (zU2 != zU3) {
                if (zU3) {
                    q0(this.I);
                } else {
                    W2(this.I);
                }
                invalidateSelf();
                B1();
            }
        }
    }

    public float Z0() {
        return this.f41880e0;
    }

    public void Z1(float f11) {
        if (this.B != f11) {
            this.B = f11;
            invalidateSelf();
            B1();
        }
    }

    @Override // com.google.android.material.internal.x.b
    public void a() {
        B1();
        invalidateSelf();
    }

    public float a1() {
        return this.Q;
    }

    public void a2(int i11) {
        Z1(this.f41882g0.getResources().getDimension(i11));
    }

    public float b1() {
        return this.f41879d0;
    }

    public void b2(float f11) {
        if (this.Y != f11) {
            this.Y = f11;
            invalidateSelf();
            B1();
        }
    }

    @NonNull
    public int[] c1() {
        return this.B0;
    }

    public void c2(int i11) {
        b2(this.f41882g0.getResources().getDimension(i11));
    }

    public ColorStateList d1() {
        return this.P;
    }

    public void d2(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.I0) {
                l0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // st.g, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        int iA;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i11 = this.f41898w0;
        if (i11 < 255) {
            canvas2 = canvas;
            iA = ct.a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i11);
        } else {
            canvas2 = canvas;
            iA = 0;
        }
        G0(canvas2, bounds);
        D0(canvas2, bounds);
        if (this.I0) {
            super.draw(canvas2);
        }
        F0(canvas2, bounds);
        I0(canvas2, bounds);
        E0(canvas2, bounds);
        C0(canvas2, bounds);
        if (this.G0) {
            K0(canvas2, bounds);
        }
        H0(canvas2, bounds);
        J0(canvas2, bounds);
        if (this.f41898w0 < 255) {
            canvas2.restoreToCount(iA);
        }
    }

    public void e1(@NonNull RectF rectF) {
        v0(getBounds(), rectF);
    }

    public void e2(int i11) {
        d2(j.a.a(this.f41882g0, i11));
    }

    public void f2(float f11) {
        if (this.E != f11) {
            this.E = f11;
            this.f41883h0.setStrokeWidth(f11);
            if (this.I0) {
                super.m0(f11);
            }
            invalidateSelf();
        }
    }

    public void g2(int i11) {
        f2(this.f41882g0.getResources().getDimension(i11));
    }

    @Override // st.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f41898w0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f41899x0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.Y + s0() + this.f41877b0 + this.f41889n0.h(n1().toString()) + this.f41878c0 + w0() + this.f41881f0), this.H0);
    }

    @Override // st.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // st.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        Outline outline2;
        if (this.I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.C);
        } else {
            outline.setRoundRect(bounds, this.C);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public TextUtils.TruncateAt h1() {
        return this.F0;
    }

    public i i1() {
        return this.X;
    }

    public void i2(Drawable drawable) {
        Drawable drawableX0 = X0();
        if (drawableX0 != drawable) {
            float fW0 = w0();
            this.N = drawable != null ? l5.a.r(drawable).mutate() : null;
            if (qt.b.f106147a) {
                Y2();
            }
            float fW1 = w0();
            W2(drawableX0);
            if (V2()) {
                q0(this.N);
            }
            invalidateSelf();
            if (fW0 != fW1) {
                B1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // st.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (x1(this.f41901z) || x1(this.A) || x1(this.D)) {
            return true;
        }
        return (this.C0 && x1(this.D0)) || z1(this.f41889n0.e()) || A0() || y1(this.I) || y1(this.U) || x1(this.f41902z0);
    }

    public float j1() {
        return this.f41876a0;
    }

    public void j2(CharSequence charSequence) {
        if (this.R != charSequence) {
            this.R = s5.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float k1() {
        return this.Z;
    }

    public void k2(float f11) {
        if (this.f41880e0 != f11) {
            this.f41880e0 = f11;
            invalidateSelf();
            if (V2()) {
                B1();
            }
        }
    }

    public ColorStateList l1() {
        return this.F;
    }

    public void l2(int i11) {
        k2(this.f41882g0.getResources().getDimension(i11));
    }

    public i m1() {
        return this.W;
    }

    public void m2(int i11) {
        i2(j.a.b(this.f41882g0, i11));
    }

    public CharSequence n1() {
        return this.G;
    }

    public void n2(float f11) {
        if (this.Q != f11) {
            this.Q = f11;
            invalidateSelf();
            if (V2()) {
                B1();
            }
        }
    }

    public d o1() {
        return this.f41889n0.e();
    }

    public void o2(int i11) {
        n2(this.f41882g0.getResources().getDimension(i11));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i11) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i11);
        if (U2()) {
            zOnLayoutDirectionChanged |= l5.a.m(this.I, i11);
        }
        if (T2()) {
            zOnLayoutDirectionChanged |= l5.a.m(this.U, i11);
        }
        if (V2()) {
            zOnLayoutDirectionChanged |= l5.a.m(this.N, i11);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        boolean zOnLevelChange = super.onLevelChange(i11);
        if (U2()) {
            zOnLevelChange |= this.I.setLevel(i11);
        }
        if (T2()) {
            zOnLevelChange |= this.U.setLevel(i11);
        }
        if (V2()) {
            zOnLevelChange |= this.N.setLevel(i11);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // st.g, android.graphics.drawable.Drawable, com.google.android.material.internal.x.b
    public boolean onStateChange(@NonNull int[] iArr) {
        if (this.I0) {
            super.onStateChange(iArr);
        }
        return C1(iArr, c1());
    }

    public float p1() {
        return this.f41878c0;
    }

    public void p2(float f11) {
        if (this.f41879d0 != f11) {
            this.f41879d0 = f11;
            invalidateSelf();
            if (V2()) {
                B1();
            }
        }
    }

    public float q1() {
        return this.f41877b0;
    }

    public void q2(int i11) {
        p2(this.f41882g0.getResources().getDimension(i11));
    }

    public boolean r2(@NonNull int[] iArr) {
        if (Arrays.equals(this.B0, iArr)) {
            return false;
        }
        this.B0 = iArr;
        if (V2()) {
            return C1(getState(), iArr);
        }
        return false;
    }

    float s0() {
        return (U2() || T2()) ? this.Z + g1() + this.f41876a0 : BitmapDescriptorFactory.HUE_RED;
    }

    public boolean s1() {
        return this.C0;
    }

    public void s2(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (V2()) {
                l5.a.o(this.N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j11) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j11);
        }
    }

    @Override // st.g, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.f41898w0 != i11) {
            this.f41898w0 = i11;
            invalidateSelf();
        }
    }

    @Override // st.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f41899x0 != colorFilter) {
            this.f41899x0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // st.g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f41902z0 != colorStateList) {
            this.f41902z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // st.g, android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.A0 != mode) {
            this.A0 = mode;
            this.f41900y0 = com.google.android.material.drawable.c.m(this, this.f41902z0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        if (U2()) {
            visible |= this.I.setVisible(z11, z12);
        }
        if (T2()) {
            visible |= this.U.setVisible(z11, z12);
        }
        if (V2()) {
            visible |= this.N.setVisible(z11, z12);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t2(int i11) {
        s2(j.a.a(this.f41882g0, i11));
    }

    public boolean u1() {
        return this.S;
    }

    public void u2(boolean z11) {
        if (this.M != z11) {
            boolean zV2 = V2();
            this.M = z11;
            boolean zV3 = V2();
            if (zV2 != zV3) {
                if (zV3) {
                    q0(this.N);
                } else {
                    W2(this.N);
                }
                invalidateSelf();
                B1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public boolean v1() {
        return y1(this.N);
    }

    public void v2(InterfaceC0661a interfaceC0661a) {
        this.E0 = new WeakReference<>(interfaceC0661a);
    }

    float w0() {
        return V2() ? this.f41879d0 + this.Q + this.f41880e0 : BitmapDescriptorFactory.HUE_RED;
    }

    public boolean w1() {
        return this.M;
    }

    public void w2(TextUtils.TruncateAt truncateAt) {
        this.F0 = truncateAt;
    }

    public void x2(i iVar) {
        this.X = iVar;
    }

    public void y2(int i11) {
        x2(i.d(this.f41882g0, i11));
    }

    @NonNull
    Paint.Align z0(@NonNull Rect rect, @NonNull PointF pointF) {
        pointF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Paint.Align align = Paint.Align.LEFT;
        if (this.G != null) {
            float fS0 = this.Y + s0() + this.f41877b0;
            if (l5.a.f(this) == 0) {
                pointF.x = rect.left + fS0;
            } else {
                pointF.x = rect.right - fS0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - y0();
        }
        return align;
    }

    public void z2(float f11) {
        if (this.f41876a0 != f11) {
            float fS0 = s0();
            this.f41876a0 = f11;
            float fS1 = s0();
            invalidateSelf();
            if (fS0 != fS1) {
                B1();
            }
        }
    }
}
