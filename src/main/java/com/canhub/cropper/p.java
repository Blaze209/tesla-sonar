package com.canhub.cropper;

import android.graphics.RectF;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\fJ1\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\fJ7\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010!\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u001eJ?\u0010&\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010\u001eJ\u000f\u0010'\u001a\u00020\bH\u0002¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0004¢\u0006\u0004\b.\u0010-J\r\u0010/\u001a\u00020\u0004¢\u0006\u0004\b/\u0010-J\r\u00100\u001a\u00020\u0004¢\u0006\u0004\b0\u0010-J\r\u00101\u001a\u00020\u0004¢\u0006\u0004\b1\u0010-J\r\u00102\u001a\u00020\u0004¢\u0006\u0004\b2\u0010-J\u001d\u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u0002062\u0006\u00109\u001a\u0002032\u0006\u0010:\u001a\u000203¢\u0006\u0004\b;\u00108J-\u0010@\u001a\u0002062\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u0004¢\u0006\u0004\b@\u0010AJ\u0015\u0010D\u001a\u0002062\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u0002062\u0006\u0010F\u001a\u00020)¢\u0006\u0004\bG\u0010HJ\r\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010(J7\u0010L\u001a\u0004\u0018\u00010K2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010NR\u0014\u0010P\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010NR\u0016\u0010R\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010QR\u0016\u0010S\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010QR\u0016\u0010T\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010QR\u0016\u0010U\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010QR\u0016\u0010V\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010QR\u0016\u0010W\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010QR\u0016\u0010X\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010QR\u0016\u0010Y\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010QR\u0016\u0010Z\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010QR\u0016\u0010[\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010Q¨\u0006\\"}, d2 = {"Lcom/canhub/cropper/p;", "", "<init>", "()V", "", "x", "y", "targetRadius", "", "isCenterMoveEnabled", "Lcom/canhub/cropper/q$b;", "k", "(FFFZ)Lcom/canhub/cropper/q$b;", "h", "(FFZ)Lcom/canhub/cropper/q$b;", "l", "j", "handleX", "handleY", "p", "(FFFFF)Z", "x1", "y1", "x2", "y2", "a", "(FFFF)F", "handleXStart", "handleXEnd", "q", "(FFFFFF)Z", "handleYStart", "handleYEnd", "r", "left", "top", "right", "bottom", "o", "b", "()Z", "Landroid/graphics/RectF;", IntegerTokenConverter.CONVERTER_KEY, "()Landroid/graphics/RectF;", "f", "()F", "e", DateTokenConverter.CONVERTER_KEY, "c", "n", "m", "", "minCropResultWidth", "minCropResultHeight", "Ljn0/h0;", "v", "(II)V", "maxCropResultWidth", "maxCropResultHeight", "u", "maxWidth", "maxHeight", "scaleFactorWidth", "scaleFactorHeight", "s", "(FFFF)V", "Lcom/canhub/cropper/o;", "options", "t", "(Lcom/canhub/cropper/o;)V", "rect", "w", "(Landroid/graphics/RectF;)V", "Lcom/canhub/cropper/CropImageView$d;", "cropShape", "Lcom/canhub/cropper/q;", "g", "(FFFLcom/canhub/cropper/CropImageView$d;Z)Lcom/canhub/cropper/q;", "Landroid/graphics/RectF;", "mEdges", "mGetEdges", Gender.FEMALE, "mMinCropWindowWidth", "mMinCropWindowHeight", "mMaxCropWindowWidth", "mMaxCropWindowHeight", "mMinCropResultWidth", "mMinCropResultHeight", "mMaxCropResultWidth", "mMaxCropResultHeight", "mScaleFactorWidth", "mScaleFactorHeight", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float mMinCropWindowWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float mMinCropWindowHeight;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float mMaxCropWindowWidth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float mMaxCropWindowHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float mMinCropResultWidth;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float mMinCropResultHeight;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float mMaxCropResultWidth;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float mMaxCropResultHeight;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final RectF mEdges = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final RectF mGetEdges = new RectF();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float mScaleFactorWidth = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float mScaleFactorHeight = 1.0f;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21132a;

        static {
            int[] iArr = new int[CropImageView.d.values().length];
            try {
                iArr[CropImageView.d.RECTANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropImageView.d.OVAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropImageView.d.RECTANGLE_VERTICAL_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropImageView.d.RECTANGLE_HORIZONTAL_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f21132a = iArr;
        }
    }

    private final float a(float x11, float y11, float x12, float y12) {
        return Math.max(Math.abs(x11 - x12), Math.abs(y11 - y12));
    }

    private final boolean b() {
        return !x();
    }

    private final q.b h(float x11, float y11, boolean isCenterMoveEnabled) {
        float f11 = 6;
        float fWidth = this.mEdges.width() / f11;
        RectF rectF = this.mEdges;
        float f12 = rectF.left;
        float f13 = f12 + fWidth;
        float f14 = 5;
        float f15 = f12 + (fWidth * f14);
        float fHeight = rectF.height() / f11;
        float f16 = this.mEdges.top;
        float f17 = f16 + fHeight;
        float f18 = f16 + (f14 * fHeight);
        if (x11 < f13) {
            if (y11 < f17) {
                return q.b.TOP_LEFT;
            }
            return y11 < f18 ? q.b.LEFT : q.b.BOTTOM_LEFT;
        }
        if (x11 >= f15) {
            if (y11 < f17) {
                return q.b.TOP_RIGHT;
            }
            return y11 < f18 ? q.b.RIGHT : q.b.BOTTOM_RIGHT;
        }
        if (y11 < f17) {
            return q.b.TOP;
        }
        if (y11 >= f18) {
            return q.b.BOTTOM;
        }
        if (isCenterMoveEnabled) {
            return q.b.CENTER;
        }
        return null;
    }

    private final q.b j(float x11, float y11, float targetRadius, boolean isCenterMoveEnabled) {
        float f11;
        float f12;
        RectF rectF = this.mEdges;
        if (a(x11, y11, rectF.left, rectF.centerY()) <= targetRadius) {
            return q.b.LEFT;
        }
        RectF rectF2 = this.mEdges;
        if (a(x11, y11, rectF2.right, rectF2.centerY()) <= targetRadius) {
            return q.b.RIGHT;
        }
        if (isCenterMoveEnabled) {
            RectF rectF3 = this.mEdges;
            f11 = x11;
            f12 = y11;
            if (o(f11, f12, rectF3.left, rectF3.top, rectF3.right, rectF3.bottom)) {
                return q.b.CENTER;
            }
        } else {
            f11 = x11;
            f12 = y11;
        }
        return h(f11, f12, isCenterMoveEnabled);
    }

    private final q.b k(float x11, float y11, float targetRadius, boolean isCenterMoveEnabled) {
        RectF rectF = this.mEdges;
        if (p(x11, y11, rectF.left, rectF.top, targetRadius)) {
            return q.b.TOP_LEFT;
        }
        RectF rectF2 = this.mEdges;
        if (p(x11, y11, rectF2.right, rectF2.top, targetRadius)) {
            return q.b.TOP_RIGHT;
        }
        RectF rectF3 = this.mEdges;
        if (p(x11, y11, rectF3.left, rectF3.bottom, targetRadius)) {
            return q.b.BOTTOM_LEFT;
        }
        RectF rectF4 = this.mEdges;
        if (p(x11, y11, rectF4.right, rectF4.bottom, targetRadius)) {
            return q.b.BOTTOM_RIGHT;
        }
        if (isCenterMoveEnabled) {
            RectF rectF5 = this.mEdges;
            if (o(x11, y11, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) && b()) {
                return q.b.CENTER;
            }
        }
        RectF rectF6 = this.mEdges;
        if (q(x11, y11, rectF6.left, rectF6.right, rectF6.top, targetRadius)) {
            return q.b.TOP;
        }
        RectF rectF7 = this.mEdges;
        if (q(x11, y11, rectF7.left, rectF7.right, rectF7.bottom, targetRadius)) {
            return q.b.BOTTOM;
        }
        RectF rectF8 = this.mEdges;
        if (r(x11, y11, rectF8.left, rectF8.top, rectF8.bottom, targetRadius)) {
            return q.b.LEFT;
        }
        RectF rectF9 = this.mEdges;
        if (r(x11, y11, rectF9.right, rectF9.top, rectF9.bottom, targetRadius)) {
            return q.b.RIGHT;
        }
        if (isCenterMoveEnabled) {
            RectF rectF10 = this.mEdges;
            if (o(x11, y11, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) && !b()) {
                return q.b.CENTER;
            }
        }
        return h(x11, y11, isCenterMoveEnabled);
    }

    private final q.b l(float x11, float y11, float targetRadius, boolean isCenterMoveEnabled) {
        float f11;
        float f12;
        if (a(x11, y11, this.mEdges.centerX(), this.mEdges.top) <= targetRadius) {
            return q.b.TOP;
        }
        if (a(x11, y11, this.mEdges.centerX(), this.mEdges.bottom) <= targetRadius) {
            return q.b.BOTTOM;
        }
        if (isCenterMoveEnabled) {
            RectF rectF = this.mEdges;
            f11 = x11;
            f12 = y11;
            if (o(f11, f12, rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                return q.b.CENTER;
            }
        } else {
            f11 = x11;
            f12 = y11;
        }
        return h(f11, f12, isCenterMoveEnabled);
    }

    private final boolean o(float x11, float y11, float left, float top, float right, float bottom) {
        return x11 > left && x11 < right && y11 > top && y11 < bottom;
    }

    private final boolean p(float x11, float y11, float handleX, float handleY, float targetRadius) {
        return a(x11, y11, handleX, handleY) <= targetRadius;
    }

    private final boolean q(float x11, float y11, float handleXStart, float handleXEnd, float handleY, float targetRadius) {
        return x11 > handleXStart && x11 < handleXEnd && Math.abs(y11 - handleY) <= targetRadius;
    }

    private final boolean r(float x11, float y11, float handleX, float handleYStart, float handleYEnd, float targetRadius) {
        return Math.abs(x11 - handleX) <= targetRadius && y11 > handleYStart && y11 < handleYEnd;
    }

    public final float c() {
        return bo0.n.i(this.mMaxCropWindowHeight, this.mMaxCropResultHeight / this.mScaleFactorHeight);
    }

    public final float d() {
        return bo0.n.i(this.mMaxCropWindowWidth, this.mMaxCropResultWidth / this.mScaleFactorWidth);
    }

    public final float e() {
        return bo0.n.e(this.mMinCropWindowHeight, this.mMinCropResultHeight / this.mScaleFactorHeight);
    }

    public final float f() {
        return bo0.n.e(this.mMinCropWindowWidth, this.mMinCropResultWidth / this.mScaleFactorWidth);
    }

    public final q g(float x11, float y11, float targetRadius, CropImageView.d cropShape, boolean isCenterMoveEnabled) {
        q.b bVarK;
        p013kotlin.jvm.internal.s.k(cropShape, "cropShape");
        int i11 = a.f21132a[cropShape.ordinal()];
        if (i11 == 1) {
            bVarK = k(x11, y11, targetRadius, isCenterMoveEnabled);
        } else if (i11 == 2) {
            bVarK = h(x11, y11, isCenterMoveEnabled);
        } else if (i11 == 3) {
            bVarK = l(x11, y11, targetRadius, isCenterMoveEnabled);
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            bVarK = j(x11, y11, targetRadius, isCenterMoveEnabled);
        }
        if (bVarK != null) {
            return new q(bVarK, this, x11, y11);
        }
        return null;
    }

    public final RectF i() {
        this.mGetEdges.set(this.mEdges);
        return this.mGetEdges;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getMScaleFactorHeight() {
        return this.mScaleFactorHeight;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getMScaleFactorWidth() {
        return this.mScaleFactorWidth;
    }

    public final void s(float maxWidth, float maxHeight, float scaleFactorWidth, float scaleFactorHeight) {
        this.mMaxCropWindowWidth = maxWidth;
        this.mMaxCropWindowHeight = maxHeight;
        this.mScaleFactorWidth = scaleFactorWidth;
        this.mScaleFactorHeight = scaleFactorHeight;
    }

    public final void t(CropImageOptions options) {
        p013kotlin.jvm.internal.s.k(options, "options");
        this.mMinCropWindowWidth = options.minCropWindowWidth;
        this.mMinCropWindowHeight = options.minCropWindowHeight;
        this.mMinCropResultWidth = options.minCropResultWidth;
        this.mMinCropResultHeight = options.minCropResultHeight;
        this.mMaxCropResultWidth = options.maxCropResultWidth;
        this.mMaxCropResultHeight = options.maxCropResultHeight;
    }

    public final void u(int maxCropResultWidth, int maxCropResultHeight) {
        this.mMaxCropResultWidth = maxCropResultWidth;
        this.mMaxCropResultHeight = maxCropResultHeight;
    }

    public final void v(int minCropResultWidth, int minCropResultHeight) {
        this.mMinCropResultWidth = minCropResultWidth;
        this.mMinCropResultHeight = minCropResultHeight;
    }

    public final void w(RectF rect) {
        p013kotlin.jvm.internal.s.k(rect, "rect");
        this.mEdges.set(rect);
    }

    public final boolean x() {
        return this.mEdges.width() >= 100.0f && this.mEdges.height() >= 100.0f;
    }
}
