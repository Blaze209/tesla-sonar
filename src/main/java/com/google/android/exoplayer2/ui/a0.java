package com.google.android.exoplayer2.ui;

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
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class a0 {
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
    private final float f40813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f40814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f40815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f40816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f40817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextPaint f40818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f40819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f40820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f40821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Layout.Alignment f40822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Bitmap f40823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f40824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f40825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f40826n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f40827o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f40828p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f40829q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f40830r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f40831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f40832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f40833u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f40834v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f40835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f40836x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f40837y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f40838z;

    public a0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f40817e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f40816d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f40813a = fRound;
        this.f40814b = fRound;
        this.f40815c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f40818f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f40819g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f40820h = paint2;
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
        canvas.drawBitmap(this.f40823k, (Rect) null, this.J, this.f40820h);
    }

    private void d(Canvas canvas, boolean z11) {
        if (z11) {
            e(canvas);
            return;
        }
        ts.a.e(this.J);
        ts.a.e(this.f40823k);
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
        if (Color.alpha(this.f40833u) > 0) {
            this.f40819g.setColor(this.f40833u);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, BitmapDescriptorFactory.HUE_RED, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f40819g);
        } else {
            canvas2 = canvas;
        }
        int i11 = this.f40835w;
        if (i11 == 1) {
            this.f40818f.setStrokeJoin(Paint.Join.ROUND);
            this.f40818f.setStrokeWidth(this.f40813a);
            this.f40818f.setColor(this.f40834v);
            this.f40818f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i11 == 2) {
            TextPaint textPaint = this.f40818f;
            float f11 = this.f40814b;
            float f12 = this.f40815c;
            textPaint.setShadowLayer(f11, f12, f12, this.f40834v);
        } else if (i11 == 3 || i11 == 4) {
            boolean z11 = i11 == 3;
            int i12 = z11 ? -1 : this.f40834v;
            int i13 = z11 ? this.f40834v : -1;
            float f13 = this.f40814b / 2.0f;
            this.f40818f.setColor(this.f40831s);
            this.f40818f.setStyle(Paint.Style.FILL);
            float f14 = -f13;
            this.f40818f.setShadowLayer(this.f40814b, f14, f14, i12);
            staticLayout2.draw(canvas2);
            this.f40818f.setShadowLayer(this.f40814b, f13, f13, i13);
        }
        this.f40818f.setColor(this.f40831s);
        this.f40818f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.f40818f.setShadowLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
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
        Bitmap bitmap = this.f40823k;
        int i12 = this.C;
        int i13 = this.A;
        int i14 = this.D;
        int i15 = this.B;
        float f13 = i12 - i13;
        float f14 = i13 + (this.f40827o * f13);
        float f15 = i14 - i15;
        float f16 = i15 + (this.f40824l * f15);
        int iRound = Math.round(f13 * this.f40829q);
        float f17 = this.f40830r;
        int iRound2 = f17 != -3.4028235E38f ? Math.round(f15 * f17) : Math.round(iRound * (bitmap.getHeight() / bitmap.getWidth()));
        int i16 = this.f40828p;
        if (i16 != 2) {
            if (i16 == 1) {
                f11 = iRound / 2;
            }
            int iRound3 = Math.round(f14);
            i11 = this.f40826n;
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
        i11 = this.f40826n;
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
        CharSequence charSequence = this.f40821i;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.f40821i);
        int i11 = this.C - this.A;
        int i12 = this.D - this.B;
        this.f40818f.setTextSize(this.f40836x);
        int i13 = (int) ((this.f40836x * 0.125f) + 0.5f);
        int i14 = i13 * 2;
        int i15 = i11 - i14;
        float f11 = this.f40829q;
        float f12 = -3.4028235E38f;
        if (f11 != -3.4028235E38f) {
            i15 = (int) (i15 * f11);
        }
        int i16 = i15;
        String str = "SubtitlePainter";
        if (i16 <= 0) {
            ts.u.i("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.f40837y > BitmapDescriptorFactory.HUE_RED) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f40837y), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.f40835w == 1) {
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
        if (Color.alpha(this.f40832t) > 0) {
            int i18 = this.f40835w;
            if (i18 == 0 || i18 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f40832t), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f40832t), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.f40822j;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.f40818f, i16, alignment2, this.f40816d, this.f40817e, true);
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
        if (this.f40829q == f13 || iMax2 >= i16) {
            i16 = iMax2;
        }
        int i21 = i16 + i14;
        float f14 = this.f40827o;
        if (f14 != f13) {
            int iRound2 = Math.round(i11 * f14);
            int i22 = this.A;
            int i23 = iRound2 + i22;
            int i24 = this.f40828p;
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
            ts.u.i(str2, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f15 = this.f40824l;
        if (f15 != f13) {
            if (this.f40825m == 0) {
                iRound = Math.round(i12 * f15) + this.B;
                int i26 = this.f40826n;
                if (i26 == 2) {
                    iRound -= height;
                } else if (i26 == 1) {
                    iRound = ((iRound * 2) - height) / 2;
                }
            } else {
                int lineBottom = this.E.getLineBottom(0) - this.E.getLineTop(0);
                float f16 = this.f40824l;
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
            iRound = (this.D - height) - ((int) (i12 * this.f40838z));
        }
        this.E = new StaticLayout(spannableStringBuilder, this.f40818f, i25, alignment2, this.f40816d, this.f40817e, true);
        this.F = new StaticLayout(spannableStringBuilder2, this.f40818f, i25, alignment2, this.f40816d, this.f40817e, true);
        this.G = iMax;
        this.H = iRound;
        this.I = i13;
    }

    public void b(gs.b bVar, rs.b bVar2, float f11, float f12, float f13, Canvas canvas, int i11, int i12, int i13, int i14) {
        int i15;
        boolean z11 = bVar.f69476d == null;
        if (!z11) {
            i15 = -16777216;
        } else if (TextUtils.isEmpty(bVar.f69473a)) {
            return;
        } else {
            i15 = bVar.f69484l ? bVar.f69485m : bVar2.f109077c;
        }
        if (a(this.f40821i, bVar.f69473a) && p0.c(this.f40822j, bVar.f69474b) && this.f40823k == bVar.f69476d && this.f40824l == bVar.f69477e && this.f40825m == bVar.f69478f && p0.c(Integer.valueOf(this.f40826n), Integer.valueOf(bVar.f69479g)) && this.f40827o == bVar.f69480h && p0.c(Integer.valueOf(this.f40828p), Integer.valueOf(bVar.f69481i)) && this.f40829q == bVar.f69482j && this.f40830r == bVar.f69483k && this.f40831s == bVar2.f109075a && this.f40832t == bVar2.f109076b && this.f40833u == i15 && this.f40835w == bVar2.f109078d && this.f40834v == bVar2.f109079e && p0.c(this.f40818f.getTypeface(), bVar2.f109080f) && this.f40836x == f11 && this.f40837y == f12 && this.f40838z == f13 && this.A == i11 && this.B == i12 && this.C == i13 && this.D == i14) {
            d(canvas, z11);
            return;
        }
        this.f40821i = bVar.f69473a;
        this.f40822j = bVar.f69474b;
        this.f40823k = bVar.f69476d;
        this.f40824l = bVar.f69477e;
        this.f40825m = bVar.f69478f;
        this.f40826n = bVar.f69479g;
        this.f40827o = bVar.f69480h;
        this.f40828p = bVar.f69481i;
        this.f40829q = bVar.f69482j;
        this.f40830r = bVar.f69483k;
        this.f40831s = bVar2.f109075a;
        this.f40832t = bVar2.f109076b;
        this.f40833u = i15;
        this.f40835w = bVar2.f109078d;
        this.f40834v = bVar2.f109079e;
        this.f40818f.setTypeface(bVar2.f109080f);
        this.f40836x = f11;
        this.f40837y = f12;
        this.f40838z = f13;
        this.A = i11;
        this.B = i12;
        this.C = i13;
        this.D = i14;
        if (z11) {
            ts.a.e(this.f40821i);
            g();
        } else {
            ts.a.e(this.f40823k);
            f();
        }
        d(canvas, z11);
    }
}
