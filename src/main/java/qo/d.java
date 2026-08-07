package qo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.t0;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import so.BorderRadiusStyle;
import so.ComputedBorderRadius;
import so.CornerRadii;

/* JADX INFO: loaded from: classes4.dex */
public class d extends Drawable {
    private final Context B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t0 f105731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t0 f105732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t0 f105733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private so.f f105734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Path f105735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Path f105736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Path f105737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Path f105738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Path f105739i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Path f105741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RectF f105742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RectF f105743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f105744n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RectF f105745o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private PointF f105746p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PointF f105747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private PointF f105748r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PointF f105749s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f105740j = new Path();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f105750t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Paint f105751u = new Paint(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f105752v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<so.a> f105753w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f105754x = 255;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f105755y = 0.8f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private BorderRadiusStyle f105756z = new BorderRadiusStyle();
    private ComputedBorderRadius A = new ComputedBorderRadius();
    private int C = -1;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f105757a;

        static {
            int[] iArr = new int[so.f.values().length];
            f105757a = iArr;
            try {
                iArr[so.f.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105757a[so.f.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105757a[so.f.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(Context context) {
        this.B = context;
    }

    private void D() {
        if (this.f105750t) {
            this.f105750t = false;
            if (this.f105735e == null) {
                this.f105735e = new Path();
            }
            if (this.f105736f == null) {
                this.f105736f = new Path();
            }
            if (this.f105737g == null) {
                this.f105737g = new Path();
            }
            if (this.f105738h == null) {
                this.f105738h = new Path();
            }
            if (this.f105741k == null) {
                this.f105741k = new Path();
            }
            if (this.f105742l == null) {
                this.f105742l = new RectF();
            }
            if (this.f105743m == null) {
                this.f105743m = new RectF();
            }
            if (this.f105744n == null) {
                this.f105744n = new RectF();
            }
            if (this.f105745o == null) {
                this.f105745o = new RectF();
            }
            this.f105735e.reset();
            this.f105736f.reset();
            this.f105737g.reset();
            this.f105738h.reset();
            this.f105741k.reset();
            this.f105742l.set(getBounds());
            this.f105743m.set(getBounds());
            this.f105744n.set(getBounds());
            this.f105745o.set(getBounds());
            RectF rectFL = l();
            int iG = g(0);
            int iG2 = g(1);
            int iG3 = g(2);
            int iG4 = g(3);
            int iG5 = g(8);
            int iG6 = g(9);
            int iG7 = g(11);
            int iG8 = g(10);
            if (t(9)) {
                iG2 = iG6;
                iG4 = iG2;
            }
            if (!t(10)) {
                iG8 = iG4;
            }
            if (!t(11)) {
                iG7 = iG2;
            }
            if (Color.alpha(iG) != 0 || Color.alpha(iG7) != 0 || Color.alpha(iG3) != 0 || Color.alpha(iG8) != 0 || Color.alpha(iG5) != 0) {
                RectF rectF = this.f105742l;
                rectF.top += rectFL.top;
                rectF.bottom -= rectFL.bottom;
                rectF.left += rectFL.left;
                rectF.right -= rectFL.right;
            }
            RectF rectF2 = this.f105745o;
            rectF2.top += rectFL.top * 0.5f;
            rectF2.bottom -= rectFL.bottom * 0.5f;
            rectF2.left += rectFL.left * 0.5f;
            rectF2.right -= rectFL.right * 0.5f;
            ComputedBorderRadius computedBorderRadiusD = this.f105756z.d(getLayoutDirection(), this.B, w.f(this.f105743m.width()), w.f(this.f105743m.height()));
            this.A = computedBorderRadiusD;
            CornerRadii cornerRadiiC = computedBorderRadiusD.getTopLeft().c();
            CornerRadii cornerRadiiC2 = this.A.getTopRight().c();
            CornerRadii cornerRadiiC3 = this.A.getBottomLeft().c();
            CornerRadii cornerRadiiC4 = this.A.getBottomRight().c();
            float fO = o(cornerRadiiC.getHorizontal(), rectFL.left);
            float fO2 = o(cornerRadiiC.getVertical(), rectFL.top);
            float fO3 = o(cornerRadiiC2.getHorizontal(), rectFL.right);
            float fO4 = o(cornerRadiiC2.getVertical(), rectFL.top);
            float fO5 = o(cornerRadiiC4.getHorizontal(), rectFL.right);
            float fO6 = o(cornerRadiiC4.getVertical(), rectFL.bottom);
            float fO7 = o(cornerRadiiC3.getHorizontal(), rectFL.left);
            float fO8 = o(cornerRadiiC3.getVertical(), rectFL.bottom);
            Path.Direction direction = Path.Direction.CW;
            this.f105735e.addRoundRect(this.f105742l, new float[]{fO, fO2, fO3, fO4, fO5, fO6, fO7, fO8}, direction);
            this.f105736f.addRoundRect(rectFL.left > BitmapDescriptorFactory.HUE_RED ? this.f105742l.left - 0.8f : this.f105742l.left, rectFL.top > BitmapDescriptorFactory.HUE_RED ? this.f105742l.top - 0.8f : this.f105742l.top, rectFL.right > BitmapDescriptorFactory.HUE_RED ? this.f105742l.right + 0.8f : this.f105742l.right, rectFL.bottom > BitmapDescriptorFactory.HUE_RED ? this.f105742l.bottom + 0.8f : this.f105742l.bottom, new float[]{fO, fO2, fO3, fO4, fO5, fO6, fO7, fO8}, direction);
            this.f105737g.addRoundRect(this.f105743m, new float[]{cornerRadiiC.getHorizontal(), cornerRadiiC.getVertical(), cornerRadiiC2.getHorizontal(), cornerRadiiC2.getVertical(), cornerRadiiC4.getHorizontal(), cornerRadiiC4.getVertical(), cornerRadiiC3.getHorizontal(), cornerRadiiC3.getVertical()}, direction);
            t0 t0Var = this.f105731a;
            float fA = t0Var != null ? t0Var.a(8) / 2.0f : BitmapDescriptorFactory.HUE_RED;
            this.f105738h.addRoundRect(this.f105744n, new float[]{cornerRadiiC.getHorizontal() + fA, cornerRadiiC.getVertical() + fA, cornerRadiiC2.getHorizontal() + fA, cornerRadiiC2.getVertical() + fA, cornerRadiiC4.getHorizontal() + fA, cornerRadiiC4.getVertical() + fA, cornerRadiiC3.getHorizontal() + fA, cornerRadiiC3.getVertical() + fA}, direction);
            this.f105741k.addRoundRect(this.f105745o, new float[]{cornerRadiiC.getHorizontal() - (rectFL.left * 0.5f), cornerRadiiC.getVertical() - (rectFL.top * 0.5f), cornerRadiiC2.getHorizontal() - (rectFL.right * 0.5f), cornerRadiiC2.getVertical() - (rectFL.top * 0.5f), cornerRadiiC4.getHorizontal() - (rectFL.right * 0.5f), cornerRadiiC4.getVertical() - (rectFL.bottom * 0.5f), cornerRadiiC3.getHorizontal() - (rectFL.left * 0.5f), cornerRadiiC3.getVertical() - (rectFL.bottom * 0.5f)}, direction);
            if (this.f105746p == null) {
                this.f105746p = new PointF();
            }
            PointF pointF = this.f105746p;
            RectF rectF3 = this.f105742l;
            float f11 = rectF3.left;
            pointF.x = f11;
            float f12 = rectF3.top;
            pointF.y = f12;
            RectF rectF4 = this.f105743m;
            m(f11, f12, (fO * 2.0f) + f11, (fO2 * 2.0f) + f12, rectF4.left, rectF4.top, f11, f12, pointF);
            if (this.f105749s == null) {
                this.f105749s = new PointF();
            }
            PointF pointF2 = this.f105749s;
            RectF rectF5 = this.f105742l;
            float f13 = rectF5.left;
            pointF2.x = f13;
            float f14 = rectF5.bottom;
            pointF2.y = f14;
            RectF rectF6 = this.f105743m;
            m(f13, f14 - (fO8 * 2.0f), (fO7 * 2.0f) + f13, f14, rectF6.left, rectF6.bottom, f13, f14, pointF2);
            if (this.f105747q == null) {
                this.f105747q = new PointF();
            }
            PointF pointF3 = this.f105747q;
            RectF rectF7 = this.f105742l;
            float f15 = rectF7.right;
            pointF3.x = f15;
            float f16 = rectF7.top;
            pointF3.y = f16;
            RectF rectF8 = this.f105743m;
            m(f15 - (fO3 * 2.0f), f16, f15, (fO4 * 2.0f) + f16, rectF8.right, rectF8.top, f15, f16, pointF3);
            if (this.f105748r == null) {
                this.f105748r = new PointF();
            }
            PointF pointF4 = this.f105748r;
            RectF rectF9 = this.f105742l;
            float f17 = rectF9.right;
            pointF4.x = f17;
            float f18 = rectF9.bottom;
            pointF4.y = f18;
            RectF rectF10 = this.f105743m;
            m(f17 - (fO5 * 2.0f), f18 - (fO6 * 2.0f), f17, f18, rectF10.right, rectF10.bottom, f17, f18, pointF4);
        }
    }

    private void E() {
        so.f fVar = this.f105734d;
        this.f105751u.setPathEffect(fVar != null ? r(fVar, n()) : null);
    }

    private void F(int i11) {
        so.f fVar = this.f105734d;
        this.f105751u.setPathEffect(fVar != null ? r(fVar, i11) : null);
    }

    private static int a(float f11, float f12) {
        return ((((int) f11) << 24) & (-16777216)) | (((int) f12) & 16777215);
    }

    private void b(Canvas canvas, int i11, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        if (i11 == 0) {
            return;
        }
        if (this.f105739i == null) {
            this.f105739i = new Path();
        }
        this.f105751u.setColor(i11);
        this.f105739i.reset();
        this.f105739i.moveTo(f11, f12);
        this.f105739i.lineTo(f13, f14);
        this.f105739i.lineTo(f15, f16);
        this.f105739i.lineTo(f17, f18);
        this.f105739i.lineTo(f11, f12);
        canvas.drawPath(this.f105739i, this.f105751u);
    }

    private void c(Canvas canvas) {
        int i11;
        d dVar;
        this.f105751u.setStyle(Paint.Style.FILL);
        int iU = u(this.f105752v, this.f105754x);
        if (Color.alpha(iU) != 0) {
            this.f105751u.setColor(iU);
            canvas.drawRect(getBounds(), this.f105751u);
        }
        List<so.a> list = this.f105753w;
        if (list != null && !list.isEmpty()) {
            this.f105751u.setShader(f());
            canvas.drawRect(getBounds(), this.f105751u);
            this.f105751u.setShader(null);
        }
        RectF rectFL = l();
        int iRound = Math.round(rectFL.left);
        int iRound2 = Math.round(rectFL.top);
        int iRound3 = Math.round(rectFL.right);
        int iRound4 = Math.round(rectFL.bottom);
        if (iRound > 0 || iRound3 > 0 || iRound2 > 0 || iRound4 > 0) {
            Rect bounds = getBounds();
            int iG = g(0);
            int iG2 = g(1);
            int iG3 = g(2);
            int iG4 = g(3);
            int iG5 = g(9);
            int iG6 = g(11);
            int iG7 = g(10);
            if (t(9)) {
                iG2 = iG5;
                iG4 = iG2;
            }
            if (t(10)) {
                iG4 = iG7;
            }
            if (t(11)) {
                iG2 = iG6;
            }
            boolean z11 = getLayoutDirection() == 1;
            int iG8 = g(4);
            int iG9 = g(5);
            if (com.facebook.react.modules.i18nmanager.a.f().d(this.B)) {
                if (t(4)) {
                    iG = iG8;
                }
                if (t(5)) {
                    iG3 = iG9;
                }
                int i12 = z11 ? iG3 : iG;
                if (z11) {
                    iG3 = iG;
                }
                i11 = iRound;
                iG = i12;
            } else {
                int i13 = z11 ? iG9 : iG8;
                if (!z11) {
                    iG8 = iG9;
                }
                boolean zT = t(4);
                i11 = iRound;
                boolean zT2 = t(5);
                boolean z12 = z11 ? zT2 : zT;
                if (!z11) {
                    zT = zT2;
                }
                if (z12) {
                    iG = i13;
                }
                if (zT) {
                    iG3 = iG8;
                }
            }
            int i14 = bounds.left;
            int i15 = bounds.top;
            int iE = e(i11, iRound2, iRound3, iRound4, iG, iG2, iG3, iG4);
            int i16 = iG2;
            int i17 = iG3;
            int i18 = iG4;
            if (iE == 0) {
                this.f105751u.setAntiAlias(false);
                int iWidth = bounds.width();
                int iHeight = bounds.height();
                if (i11 > 0) {
                    float f11 = i14;
                    float f12 = i14 + i11;
                    int i19 = i15 + iHeight;
                    b(canvas, iG, f11, i15, f12, i15 + iRound2, f12, i19 - iRound4, f11, i19);
                }
                if (iRound2 > 0) {
                    float f13 = i15;
                    float f14 = i15 + iRound2;
                    int i21 = i14 + iWidth;
                    b(canvas, i16, i14, f13, i14 + i11, f14, i21 - iRound3, f14, i21, f13);
                }
                if (iRound3 > 0) {
                    int i22 = i14 + iWidth;
                    float f15 = i22;
                    int i23 = i15 + iHeight;
                    float f16 = i22 - iRound3;
                    b(canvas, i17, f15, i15, f15, i23, f16, i23 - iRound4, f16, i15 + iRound2);
                }
                if (iRound4 > 0) {
                    int i24 = i15 + iHeight;
                    float f17 = i24;
                    int i25 = iWidth + i14;
                    float f18 = i24 - iRound4;
                    dVar = this;
                    dVar.b(canvas, i18, i14, f17, i25, f17, i25 - iRound3, f18, i14 + i11, f18);
                } else {
                    dVar = this;
                }
                dVar.f105751u.setAntiAlias(true);
                return;
            }
            if (Color.alpha(iE) != 0) {
                int i26 = bounds.right;
                int i27 = bounds.bottom;
                this.f105751u.setColor(iE);
                this.f105751u.setStyle(Paint.Style.STROKE);
                if (i11 > 0) {
                    this.f105740j.reset();
                    int iRound5 = Math.round(rectFL.left);
                    F(iRound5);
                    this.f105751u.setStrokeWidth(iRound5);
                    float f19 = (iRound5 / 2) + i14;
                    this.f105740j.moveTo(f19, i15);
                    this.f105740j.lineTo(f19, i27);
                    canvas.drawPath(this.f105740j, this.f105751u);
                }
                if (iRound2 > 0) {
                    this.f105740j.reset();
                    int iRound6 = Math.round(rectFL.top);
                    F(iRound6);
                    this.f105751u.setStrokeWidth(iRound6);
                    float f21 = (iRound6 / 2) + i15;
                    this.f105740j.moveTo(i14, f21);
                    this.f105740j.lineTo(i26, f21);
                    canvas.drawPath(this.f105740j, this.f105751u);
                }
                if (iRound3 > 0) {
                    this.f105740j.reset();
                    int iRound7 = Math.round(rectFL.right);
                    F(iRound7);
                    this.f105751u.setStrokeWidth(iRound7);
                    float f22 = i26 - (iRound7 / 2);
                    this.f105740j.moveTo(f22, i15);
                    this.f105740j.lineTo(f22, i27);
                    canvas.drawPath(this.f105740j, this.f105751u);
                }
                if (iRound4 > 0) {
                    this.f105740j.reset();
                    int iRound8 = Math.round(rectFL.bottom);
                    F(iRound8);
                    this.f105751u.setStrokeWidth(iRound8);
                    float f23 = i27 - (iRound8 / 2);
                    this.f105740j.moveTo(i14, f23);
                    this.f105740j.lineTo(i26, f23);
                    canvas.drawPath(this.f105740j, this.f105751u);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:85:0x0207  */
    /* JADX WARN: Code duplicated, block: B:88:0x021f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0242  */
    /* JADX WARN: Code duplicated, block: B:94:0x0265  */
    private void d(Canvas canvas) {
        int i11;
        int i12;
        float f11;
        float f12;
        float f13;
        float f14;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        float f15;
        float f16;
        PointF pointF5;
        PointF pointF6;
        PointF pointF7;
        D();
        canvas.save();
        int i13 = this.f105752v;
        int iL = k5.d.l(i13, (Color.alpha(i13) * this.f105754x) >> 8);
        if (Color.alpha(iL) != 0) {
            this.f105751u.setColor(iL);
            this.f105751u.setStyle(Paint.Style.FILL);
            canvas.drawPath((Path) u5.h.g(this.f105736f), this.f105751u);
        }
        List<so.a> list = this.f105753w;
        if (list != null && !list.isEmpty()) {
            this.f105751u.setShader(f());
            this.f105751u.setStyle(Paint.Style.FILL);
            canvas.drawPath((Path) u5.h.g(this.f105736f), this.f105751u);
            this.f105751u.setShader(null);
        }
        RectF rectFL = l();
        int iG = g(0);
        int iG2 = g(1);
        int iG3 = g(2);
        int iG4 = g(3);
        int iG5 = g(9);
        int iG6 = g(11);
        int iG7 = g(10);
        if (t(9)) {
            iG2 = iG5;
            iG4 = iG2;
        }
        if (!t(10)) {
            iG7 = iG4;
        }
        if (!t(11)) {
            iG6 = iG2;
        }
        if (rectFL.top > BitmapDescriptorFactory.HUE_RED || rectFL.bottom > BitmapDescriptorFactory.HUE_RED || rectFL.left > BitmapDescriptorFactory.HUE_RED || rectFL.right > BitmapDescriptorFactory.HUE_RED) {
            canvas.clipPath((Path) u5.h.g(this.f105737g), Region.Op.INTERSECT);
            float fN = n();
            int iG8 = g(8);
            if (rectFL.top != fN || rectFL.bottom != fN || rectFL.left != fN || rectFL.right != fN || iG != iG8 || iG6 != iG8 || iG3 != iG8 || iG7 != iG8) {
                this.f105751u.setStyle(Paint.Style.FILL);
                canvas.clipPath((Path) u5.h.g(this.f105735e), Region.Op.DIFFERENCE);
                boolean z11 = getLayoutDirection() == 1;
                int iG9 = g(4);
                int iG10 = g(5);
                if (com.facebook.react.modules.i18nmanager.a.f().d(this.B)) {
                    if (t(4)) {
                        iG = iG9;
                    }
                    if (t(5)) {
                        iG3 = iG10;
                    }
                    int i14 = z11 ? iG3 : iG;
                    if (z11) {
                        iG3 = iG;
                    }
                    i11 = i14;
                } else {
                    int i15 = z11 ? iG10 : iG9;
                    if (!z11) {
                        iG9 = iG10;
                    }
                    boolean zT = t(4);
                    boolean zT2 = t(5);
                    boolean z12 = z11 ? zT2 : zT;
                    if (!z11) {
                        zT = zT2;
                    }
                    if (z12) {
                        iG = i15;
                    }
                    i11 = iG;
                    if (zT) {
                        i12 = iG9;
                    }
                    RectF rectF = (RectF) u5.h.g(this.f105743m);
                    f11 = rectF.left;
                    f12 = rectF.right;
                    f13 = rectF.top;
                    f14 = rectF.bottom;
                    pointF = (PointF) u5.h.g(this.f105746p);
                    pointF2 = (PointF) u5.h.g(this.f105747q);
                    pointF3 = (PointF) u5.h.g(this.f105749s);
                    pointF4 = (PointF) u5.h.g(this.f105748r);
                    if (rectFL.left > BitmapDescriptorFactory.HUE_RED) {
                        f15 = f14;
                        pointF5 = pointF;
                        pointF6 = pointF3;
                        pointF7 = pointF4;
                        b(canvas, i11, f11, f13 - 0.8f, pointF.x, pointF.y - 0.8f, pointF3.x, pointF3.y + 0.8f, f11, f14 + 0.8f);
                        f16 = f11;
                    } else {
                        f15 = f14;
                        f16 = f11;
                        pointF5 = pointF;
                        pointF6 = pointF3;
                        pointF7 = pointF4;
                    }
                    if (rectFL.top > BitmapDescriptorFactory.HUE_RED) {
                        b(canvas, iG6, f16 - 0.8f, f13, pointF5.x - 0.8f, pointF5.y, pointF2.x + 0.8f, pointF2.y, f12 + 0.8f, f13);
                    }
                    if (rectFL.right > BitmapDescriptorFactory.HUE_RED) {
                        b(canvas, i12, f12, f13 - 0.8f, pointF2.x, pointF2.y - 0.8f, pointF7.x, pointF7.y + 0.8f, f12, f15 + 0.8f);
                    }
                    if (rectFL.bottom > BitmapDescriptorFactory.HUE_RED) {
                        b(canvas, iG7, f16 - 0.8f, f15, pointF6.x - 0.8f, pointF6.y, pointF7.x + 0.8f, pointF7.y, f12 + 0.8f, f15);
                    }
                }
                i12 = iG3;
                RectF rectF2 = (RectF) u5.h.g(this.f105743m);
                f11 = rectF2.left;
                f12 = rectF2.right;
                f13 = rectF2.top;
                f14 = rectF2.bottom;
                pointF = (PointF) u5.h.g(this.f105746p);
                pointF2 = (PointF) u5.h.g(this.f105747q);
                pointF3 = (PointF) u5.h.g(this.f105749s);
                pointF4 = (PointF) u5.h.g(this.f105748r);
                if (rectFL.left > BitmapDescriptorFactory.HUE_RED) {
                    f15 = f14;
                    pointF5 = pointF;
                    pointF6 = pointF3;
                    pointF7 = pointF4;
                    b(canvas, i11, f11, f13 - 0.8f, pointF.x, pointF.y - 0.8f, pointF3.x, pointF3.y + 0.8f, f11, f14 + 0.8f);
                    f16 = f11;
                } else {
                    f15 = f14;
                    f16 = f11;
                    pointF5 = pointF;
                    pointF6 = pointF3;
                    pointF7 = pointF4;
                }
                if (rectFL.top > BitmapDescriptorFactory.HUE_RED) {
                    b(canvas, iG6, f16 - 0.8f, f13, pointF5.x - 0.8f, pointF5.y, pointF2.x + 0.8f, pointF2.y, f12 + 0.8f, f13);
                }
                if (rectFL.right > BitmapDescriptorFactory.HUE_RED) {
                    b(canvas, i12, f12, f13 - 0.8f, pointF2.x, pointF2.y - 0.8f, pointF7.x, pointF7.y + 0.8f, f12, f15 + 0.8f);
                }
                if (rectFL.bottom > BitmapDescriptorFactory.HUE_RED) {
                    b(canvas, iG7, f16 - 0.8f, f15, pointF6.x - 0.8f, pointF6.y, pointF7.x + 0.8f, pointF7.y, f12 + 0.8f, f15);
                }
            } else if (fN > BitmapDescriptorFactory.HUE_RED) {
                this.f105751u.setColor(u(iG8, this.f105754x));
                this.f105751u.setStyle(Paint.Style.STROKE);
                this.f105751u.setStrokeWidth(fN);
                canvas.drawPath((Path) u5.h.g(this.f105741k), this.f105751u);
            }
        }
        canvas.restore();
    }

    private static int e(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = (i14 > 0 ? i18 : -1) & (i11 > 0 ? i15 : -1) & (i12 > 0 ? i16 : -1) & (i13 > 0 ? i17 : -1);
        if (i11 <= 0) {
            i15 = 0;
        }
        if (i12 <= 0) {
            i16 = 0;
        }
        int i21 = i15 | i16;
        if (i13 <= 0) {
            i17 = 0;
        }
        int i22 = i21 | i17;
        if (i14 <= 0) {
            i18 = 0;
        }
        if (i19 == (i22 | i18)) {
            return i19;
        }
        return 0;
    }

    private Shader f() {
        List<so.a> list = this.f105753w;
        Shader composeShader = null;
        if (list == null) {
            return null;
        }
        Iterator<so.a> it = list.iterator();
        while (it.hasNext()) {
            Shader shaderA = it.next().a(getBounds());
            if (shaderA != null) {
                composeShader = composeShader == null ? shaderA : new ComposeShader(shaderA, composeShader, PorterDuff.Mode.SRC_OVER);
            }
        }
        return composeShader;
    }

    private static void m(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, PointF pointF) {
        double d19 = (d11 + d13) / 2.0d;
        double d21 = (d12 + d14) / 2.0d;
        double d22 = d15 - d19;
        double d23 = d16 - d21;
        double dAbs = Math.abs(d13 - d11) / 2.0d;
        double dAbs2 = Math.abs(d14 - d12) / 2.0d;
        double d24 = ((d18 - d21) - d23) / ((d17 - d19) - d22);
        double d25 = d23 - (d22 * d24);
        double d26 = dAbs2 * dAbs2;
        double d27 = dAbs * dAbs;
        double d28 = d26 + (d27 * d24 * d24);
        double d29 = dAbs * 2.0d * dAbs * d25 * d24;
        double d31 = (-(d27 * ((d25 * d25) - d26))) / d28;
        double d32 = d28 * 2.0d;
        double dSqrt = ((-d29) / d32) - Math.sqrt(d31 + Math.pow(d29 / d32, 2.0d));
        double d33 = (d24 * dSqrt) + d25;
        double d34 = dSqrt + d19;
        double d35 = d33 + d21;
        if (Double.isNaN(d34) || Double.isNaN(d35)) {
            return;
        }
        pointF.x = (float) d34;
        pointF.y = (float) d35;
    }

    private static PathEffect r(so.f fVar, float f11) {
        int i11 = a.f105757a[fVar.ordinal()];
        if (i11 == 2) {
            float f12 = f11 * 3.0f;
            return new DashPathEffect(new float[]{f12, f12, f12, f12}, BitmapDescriptorFactory.HUE_RED);
        }
        if (i11 != 3) {
            return null;
        }
        return new DashPathEffect(new float[]{f11, f11, f11, f11}, BitmapDescriptorFactory.HUE_RED);
    }

    private boolean t(int i11) {
        t0 t0Var = this.f105732b;
        float fA = t0Var != null ? t0Var.a(i11) : Float.NaN;
        t0 t0Var2 = this.f105733c;
        return (Float.isNaN(fA) || Float.isNaN(t0Var2 != null ? t0Var2.a(i11) : Float.NaN)) ? false : true;
    }

    private static int u(int i11, int i12) {
        if (i12 == 255) {
            return i11;
        }
        if (i12 == 0) {
            return i11 & 16777215;
        }
        return (i11 & 16777215) | ((((i11 >>> 24) * (i12 + (i12 >> 7))) >> 8) << 24);
    }

    private void w(int i11, float f11) {
        if (this.f105733c == null) {
            this.f105733c = new t0(255.0f);
        }
        if (com.facebook.react.uimanager.f.a(this.f105733c.b(i11), f11)) {
            return;
        }
        this.f105733c.c(i11, f11);
        invalidateSelf();
    }

    private void y(int i11, float f11) {
        if (this.f105732b == null) {
            this.f105732b = new t0(BitmapDescriptorFactory.HUE_RED);
        }
        if (com.facebook.react.uimanager.f.a(this.f105732b.b(i11), f11)) {
            return;
        }
        this.f105732b.c(i11, f11);
        invalidateSelf();
    }

    public void A(so.f fVar) {
        if (this.f105734d != fVar) {
            this.f105734d = fVar;
            this.f105750t = true;
            invalidateSelf();
        }
    }

    public void B(int i11, float f11) {
        if (this.f105731a == null) {
            this.f105731a = new t0();
        }
        if (com.facebook.react.uimanager.f.a(this.f105731a.b(i11), f11)) {
            return;
        }
        this.f105731a.c(i11, f11);
        if (i11 == 0 || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 8) {
            this.f105750t = true;
        }
        invalidateSelf();
    }

    public void C(int i11) {
        this.f105752v = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        E();
        if (s()) {
            d(canvas);
        } else {
            c(canvas);
        }
    }

    public int g(int i11) {
        t0 t0Var = this.f105732b;
        float fA = t0Var != null ? t0Var.a(i11) : BitmapDescriptorFactory.HUE_RED;
        t0 t0Var2 = this.f105733c;
        return a(t0Var2 != null ? t0Var2.a(i11) : 255.0f, fA);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f105754x;
    }

    @Override // android.graphics.drawable.Drawable
    @SuppressLint({"WrongConstant"})
    public int getLayoutDirection() {
        int i11 = this.C;
        return i11 == -1 ? super.getLayoutDirection() : i11;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int iAlpha = (Color.alpha(this.f105752v) * this.f105754x) >> 8;
        if (iAlpha != 0) {
            return iAlpha != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (!s()) {
            outline.setRect(getBounds());
        } else {
            D();
            outline.setConvexPath((Path) u5.h.g(this.f105738h));
        }
    }

    public BorderRadiusStyle h() {
        return this.f105756z;
    }

    public Float i(int i11) {
        t0 t0Var = this.f105731a;
        if (t0Var == null) {
            return null;
        }
        float fB = t0Var.b(i11);
        if (Float.isNaN(fB)) {
            return null;
        }
        return Float.valueOf(fB);
    }

    public float j(float f11, int i11) {
        Float fI = i(i11);
        return fI == null ? f11 : fI.floatValue();
    }

    public int k() {
        return this.f105752v;
    }

    public RectF l() {
        float fJ = j(BitmapDescriptorFactory.HUE_RED, 8);
        float fJ2 = j(fJ, 1);
        float fJ3 = j(fJ, 3);
        float fJ4 = j(fJ, 0);
        float fJ5 = j(fJ, 2);
        if (this.f105731a != null) {
            boolean z11 = getLayoutDirection() == 1;
            float fB = this.f105731a.b(4);
            float fB2 = this.f105731a.b(5);
            if (com.facebook.react.modules.i18nmanager.a.f().d(this.B)) {
                if (!Float.isNaN(fB)) {
                    fJ4 = fB;
                }
                if (!Float.isNaN(fB2)) {
                    fJ5 = fB2;
                }
                float f11 = z11 ? fJ5 : fJ4;
                if (z11) {
                    fJ5 = fJ4;
                }
                fJ4 = f11;
            } else {
                float f12 = z11 ? fB2 : fB;
                if (!z11) {
                    fB = fB2;
                }
                if (!Float.isNaN(f12)) {
                    fJ4 = f12;
                }
                if (!Float.isNaN(fB)) {
                    fJ5 = fB;
                }
            }
        }
        return new RectF(fJ4, fJ2, fJ5, fJ3);
    }

    public float n() {
        t0 t0Var = this.f105731a;
        return (t0Var == null || Float.isNaN(t0Var.b(8))) ? BitmapDescriptorFactory.HUE_RED : this.f105731a.b(8);
    }

    public float o(float f11, float f12) {
        return Math.max(f11 - f12, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f105750t = true;
    }

    public Path p() {
        if (!s()) {
            return null;
        }
        D();
        return new Path((Path) u5.h.g(this.f105735e));
    }

    public RectF q() {
        RectF rectFL = l();
        return rectFL == null ? new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getBounds().width(), getBounds().height()) : new RectF(rectFL.left, rectFL.top, getBounds().width() - rectFL.right, getBounds().height() - rectFL.bottom);
    }

    public boolean s() {
        return this.f105756z.c();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (i11 != this.f105754x) {
            this.f105754x = i11;
            invalidateSelf();
        }
    }

    public void v(List<so.a> list) {
        this.f105753w = list;
        invalidateSelf();
    }

    public void x(int i11, Integer num) {
        float fIntValue = num == null ? Float.NaN : num.intValue() & 16777215;
        float fIntValue2 = num != null ? num.intValue() >>> 24 : Float.NaN;
        y(i11, fIntValue);
        w(i11, fIntValue2);
        this.f105750t = true;
    }

    public void z(so.d dVar, LengthPercentage lengthPercentage) {
        if (Objects.equals(lengthPercentage, this.f105756z.b(dVar))) {
            return;
        }
        this.f105756z.e(dVar, lengthPercentage);
        this.f105750t = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
