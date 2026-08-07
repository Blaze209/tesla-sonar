package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
final class c0 {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f12814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f12815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f12816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f12817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f12818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextPaint f12819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f12820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f12821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f12822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Layout.Alignment f12823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Bitmap f12824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f12825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f12826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f12827n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f12828o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f12829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f12830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f12831r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f12832s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f12833t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f12834u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f12835v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f12836w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f12837x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f12838y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f12839z;

    public c0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f12818e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f12817d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f12814a = fRound;
        this.f12815b = fRound;
        this.f12816c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f12819f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f12820g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f12821h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    @RequiresNonNull({"cueBitmap", "bitmapRect"})
    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f12824k, (Rect) null, this.J, this.f12821h);
    }

    private void d(Canvas canvas, boolean z11) {
        if (z11) {
            e(canvas);
            return;
        }
        s7.a.f(this.J);
        s7.a.f(this.f12824k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f12834u) > 0) {
            this.f12820g.setColor(this.f12834u);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, BitmapDescriptorFactory.HUE_RED, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f12820g);
        } else {
            canvas2 = canvas;
        }
        int i11 = this.f12836w;
        if (i11 == 1) {
            this.f12819f.setStrokeJoin(Paint.Join.ROUND);
            this.f12819f.setStrokeWidth(this.f12814a);
            this.f12819f.setColor(this.f12835v);
            this.f12819f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i11 == 2) {
            TextPaint textPaint = this.f12819f;
            float f11 = this.f12815b;
            float f12 = this.f12816c;
            textPaint.setShadowLayer(f11, f12, f12, this.f12835v);
        } else if (i11 == 3 || i11 == 4) {
            boolean z11 = i11 == 3;
            int i12 = z11 ? -1 : this.f12835v;
            int i13 = z11 ? this.f12835v : -1;
            float f13 = this.f12815b / 2.0f;
            this.f12819f.setColor(this.f12832s);
            this.f12819f.setStyle(Paint.Style.FILL);
            float f14 = -f13;
            this.f12819f.setShadowLayer(this.f12815b, f14, f14, i12);
            staticLayout2.draw(canvas2);
            this.f12819f.setShadowLayer(this.f12815b, f13, f13, i13);
        }
        this.f12819f.setColor(this.f12832s);
        this.f12819f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.f12819f.setShadowLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    @RequiresNonNull({"cueBitmap"})
    private void f() {
        float f11;
        int i11;
        float f12;
        Bitmap bitmap = this.f12824k;
        int i12 = this.C;
        int i13 = this.A;
        int i14 = this.D;
        int i15 = this.B;
        float f13 = i12 - i13;
        float f14 = i13 + (this.f12828o * f13);
        float f15 = i14 - i15;
        float f16 = i15 + (this.f12825l * f15);
        int iRound = Math.round(f13 * this.f12830q);
        float f17 = this.f12831r;
        int iRound2 = f17 != -3.4028235E38f ? Math.round(f15 * f17) : Math.round(iRound * (bitmap.getHeight() / bitmap.getWidth()));
        int i16 = this.f12829p;
        if (i16 != 2) {
            if (i16 == 1) {
                f11 = iRound / 2;
            }
            int iRound3 = Math.round(f14);
            i11 = this.f12827n;
            if (i11 == 2) {
                if (i11 == 1) {
                    f12 = iRound2 / 2;
                }
                int iRound4 = Math.round(f16);
                this.J = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f12 = iRound2;
            f16 -= f12;
            int iRound5 = Math.round(f16);
            this.J = new Rect(iRound3, iRound5, iRound + iRound3, iRound2 + iRound5);
        }
        f11 = iRound;
        f14 -= f11;
        int iRound6 = Math.round(f14);
        i11 = this.f12827n;
        if (i11 == 2) {
            if (i11 == 1) {
                f12 = iRound2 / 2;
            }
            int iRound7 = Math.round(f16);
            this.J = new Rect(iRound6, iRound7, iRound + iRound6, iRound2 + iRound7);
        }
        f12 = iRound2;
        f16 -= f12;
        int iRound8 = Math.round(f16);
        this.J = new Rect(iRound6, iRound8, iRound + iRound6, iRound2 + iRound8);
    }

    @RequiresNonNull({"cueText"})
    private void g() {
        int iMax;
        int iMin;
        int iRound;
        CharSequence charSequence = this.f12822i;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.f12822i);
        int i11 = this.C - this.A;
        int i12 = this.D - this.B;
        this.f12819f.setTextSize(this.f12837x);
        int i13 = (int) ((this.f12837x * 0.125f) + 0.5f);
        int i14 = i13 * 2;
        int i15 = i11 - i14;
        float f11 = this.f12830q;
        float f12 = -3.4028235E38f;
        if (f11 != -3.4028235E38f) {
            i15 = (int) (i15 * f11);
        }
        int i16 = i15;
        String str = "SubtitlePainter";
        if (i16 <= 0) {
            s7.t.i("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.f12838y > BitmapDescriptorFactory.HUE_RED) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f12838y), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.f12836w == 1) {
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class);
            int length = foregroundColorSpanArr.length;
            int i17 = 0;
            while (i17 < length) {
                spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i17]);
                i17++;
                f12 = f12;
            }
        }
        float f13 = f12;
        if (Color.alpha(this.f12833t) > 0) {
            int i18 = this.f12836w;
            if (i18 == 0 || i18 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f12833t), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f12833t), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.f12823j;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.f12819f, i16, alignment2, this.f12817d, this.f12818e, true);
        this.E = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.E.getLineCount();
        int iMax2 = 0;
        int i19 = 0;
        while (i19 < lineCount) {
            iMax2 = Math.max((int) Math.ceil(this.E.getLineWidth(i19)), iMax2);
            i19++;
            str = str;
        }
        String str2 = str;
        if (this.f12830q == f13 || iMax2 >= i16) {
            i16 = iMax2;
        }
        int i21 = i16 + i14;
        float f14 = this.f12828o;
        if (f14 != f13) {
            int iRound2 = Math.round(i11 * f14);
            int i22 = this.A;
            int i23 = iRound2 + i22;
            int i24 = this.f12829p;
            if (i24 == 1) {
                i23 = ((i23 * 2) - i21) / 2;
            } else if (i24 == 2) {
                i23 -= i21;
            }
            iMax = Math.max(i23, i22);
            iMin = Math.min(i21 + iMax, this.C);
        } else {
            iMax = ((i11 - i21) / 2) + this.A;
            iMin = iMax + i21;
        }
        int i25 = iMin - iMax;
        if (i25 <= 0) {
            s7.t.i(str2, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f15 = this.f12825l;
        if (f15 != f13) {
            if (this.f12826m == 0) {
                iRound = Math.round(i12 * f15) + this.B;
                int i26 = this.f12827n;
                if (i26 == 2) {
                    iRound -= height;
                } else if (i26 == 1) {
                    iRound = ((iRound * 2) - height) / 2;
                }
            } else {
                int lineBottom = this.E.getLineBottom(0) - this.E.getLineTop(0);
                float f16 = this.f12825l;
                if (f16 >= BitmapDescriptorFactory.HUE_RED) {
                    iRound = Math.round(f16 * lineBottom) + this.B;
                } else {
                    iRound = Math.round((f16 + 1.0f) * lineBottom) + this.D;
                    iRound -= height;
                }
            }
            int i27 = iRound + height;
            int i28 = this.D;
            if (i27 > i28) {
                iRound = i28 - height;
            } else {
                int i29 = this.B;
                if (iRound < i29) {
                    iRound = i29;
                }
            }
        } else {
            iRound = (this.D - height) - ((int) (i12 * this.f12839z));
        }
        this.E = new StaticLayout(spannableStringBuilder, this.f12819f, i25, alignment2, this.f12817d, this.f12818e, true);
        this.F = new StaticLayout(spannableStringBuilder2, this.f12819f, i25, alignment2, this.f12817d, this.f12818e, true);
        this.G = iMax;
        this.H = iRound;
        this.I = i13;
    }

    public void b(r7.a aVar, ia.a aVar2, float f11, float f12, float f13, Canvas canvas, int i11, int i12, int i13, int i14) {
        int i15;
        boolean z11 = aVar.f107069d == null;
        if (!z11) {
            i15 = -16777216;
        } else if (TextUtils.isEmpty(aVar.f107066a)) {
            return;
        } else {
            i15 = aVar.f107077l ? aVar.f107078m : aVar2.f77181c;
        }
        if (a(this.f12822i, aVar.f107066a) && Objects.equals(this.f12823j, aVar.f107067b) && this.f12824k == aVar.f107069d && this.f12825l == aVar.f107070e && this.f12826m == aVar.f107071f && Integer.valueOf(this.f12827n).equals(Integer.valueOf(aVar.f107072g)) && this.f12828o == aVar.f107073h && Integer.valueOf(this.f12829p).equals(Integer.valueOf(aVar.f107074i)) && this.f12830q == aVar.f107075j && this.f12831r == aVar.f107076k && this.f12832s == aVar2.f77179a && this.f12833t == aVar2.f77180b && this.f12834u == i15 && this.f12836w == aVar2.f77182d && this.f12835v == aVar2.f77183e && Objects.equals(this.f12819f.getTypeface(), aVar2.f77184f) && this.f12837x == f11 && this.f12838y == f12 && this.f12839z == f13 && this.A == i11 && this.B == i12 && this.C == i13 && this.D == i14) {
            d(canvas, z11);
            return;
        }
        this.f12822i = aVar.f107066a;
        this.f12823j = aVar.f107067b;
        this.f12824k = aVar.f107069d;
        this.f12825l = aVar.f107070e;
        this.f12826m = aVar.f107071f;
        this.f12827n = aVar.f107072g;
        this.f12828o = aVar.f107073h;
        this.f12829p = aVar.f107074i;
        this.f12830q = aVar.f107075j;
        this.f12831r = aVar.f107076k;
        this.f12832s = aVar2.f77179a;
        this.f12833t = aVar2.f77180b;
        this.f12834u = i15;
        this.f12836w = aVar2.f77182d;
        this.f12835v = aVar2.f77183e;
        this.f12819f.setTypeface(aVar2.f77184f);
        this.f12837x = f11;
        this.f12838y = f12;
        this.f12839z = f13;
        this.A = i11;
        this.B = i12;
        this.C = i13;
        this.D = i14;
        if (z11) {
            s7.a.f(this.f12822i);
            g();
        } else {
            s7.a.f(this.f12824k);
            f();
        }
        d(canvas, z11);
    }
}
