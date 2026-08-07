package com.canhub.cropper;

import android.graphics.PointF;
import android.graphics.RectF;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 42\u00020\u0001:\u000250B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JG\u0010\u001a\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0018JO\u0010\u001c\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!JG\u0010&\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'JO\u0010)\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0002¢\u0006\u0004\b)\u0010*JG\u0010.\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020#H\u0002¢\u0006\u0004\b.\u0010'JO\u00100\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020#H\u0002¢\u0006\u0004\b0\u0010*J\u001f\u00101\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u00102J\u001f\u00104\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u00102J\u001f\u00105\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u00102J'\u00106\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b6\u0010!J'\u00107\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b7\u0010!JU\u00109\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u00108\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010;R\u0014\u0010=\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010<R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010<R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010<R\u0014\u0010@\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010<R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010B¨\u0006D"}, d2 = {"Lcom/canhub/cropper/q;", "", "Lcom/canhub/cropper/q$b;", "type", "Lcom/canhub/cropper/p;", "cropWindowHandler", "", "touchX", "touchY", "<init>", "(Lcom/canhub/cropper/q$b;Lcom/canhub/cropper/p;FF)V", "Landroid/graphics/RectF;", "rect", "Ljn0/h0;", "k", "(Landroid/graphics/RectF;FF)V", "x", "y", "bounds", "", "viewWidth", "viewHeight", "snapRadius", "m", "(Landroid/graphics/RectF;FFLandroid/graphics/RectF;IIF)V", "snapMargin", "o", "aspectRatio", "n", "(Landroid/graphics/RectF;FFLandroid/graphics/RectF;IIFF)V", "edges", "margin", "p", "(Landroid/graphics/RectF;Landroid/graphics/RectF;F)V", "left", "", "topMoves", "bottomMoves", "c", "(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V", "right", "f", "(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V", "top", "leftMoves", "rightMoves", "h", "bottom", "a", DateTokenConverter.CONVERTER_KEY, "(Landroid/graphics/RectF;F)V", "j", "g", "b", "e", IntegerTokenConverter.CONVERTER_KEY, "fixedAspectRatio", "l", "(Landroid/graphics/RectF;FFLandroid/graphics/RectF;IIFZF)V", "Lcom/canhub/cropper/q$b;", Gender.FEMALE, "mMinCropWidth", "mMinCropHeight", "mMaxCropWidth", "mMaxCropHeight", "Landroid/graphics/PointF;", "Landroid/graphics/PointF;", "mTouchOffset", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float mMinCropWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float mMinCropHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float mMaxCropWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float mMaxCropHeight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final PointF mTouchOffset;

    /* JADX INFO: renamed from: com.canhub.cropper.q$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/canhub/cropper/q$a;", "", "<init>", "()V", "", "left", "top", "right", "bottom", "a", "(FFFF)F", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a(float left, float top, float right, float bottom) {
            return (right - left) / (bottom - top);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/canhub/cropper/q$b;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "LEFT", "TOP", "RIGHT", "BOTTOM", "CENTER", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21140a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f21140a = iArr;
        }
    }

    public q(b type, p cropWindowHandler, float f11, float f12) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(cropWindowHandler, "cropWindowHandler");
        this.type = type;
        this.mMinCropWidth = cropWindowHandler.f();
        this.mMinCropHeight = cropWindowHandler.e();
        this.mMaxCropWidth = cropWindowHandler.d();
        this.mMaxCropHeight = cropWindowHandler.c();
        this.mTouchOffset = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        k(cropWindowHandler.i(), f11, f12);
    }

    private final void a(RectF rect, float bottom, RectF bounds, int viewHeight, float snapMargin, float aspectRatio, boolean leftMoves, boolean rightMoves) {
        float f11 = viewHeight;
        if (bottom > f11) {
            bottom = ((bottom - f11) / 1.05f) + f11;
            this.mTouchOffset.y -= (bottom - f11) / 1.1f;
        }
        float f12 = bounds.bottom;
        if (bottom > f12) {
            this.mTouchOffset.y -= (bottom - f12) / 2.0f;
        }
        if (f12 - bottom < snapMargin) {
            bottom = f12;
        }
        float f13 = rect.top;
        float f14 = bottom - f13;
        float f15 = this.mMinCropHeight;
        if (f14 < f15) {
            bottom = f13 + f15;
        }
        float f16 = bottom - f13;
        float f17 = this.mMaxCropHeight;
        if (f16 > f17) {
            bottom = f13 + f17;
        }
        if (f12 - bottom < snapMargin) {
            bottom = f12;
        }
        if (aspectRatio > BitmapDescriptorFactory.HUE_RED) {
            float f18 = (bottom - f13) * aspectRatio;
            float f19 = this.mMinCropWidth;
            if (f18 < f19) {
                bottom = Math.min(f12, f13 + (f19 / aspectRatio));
                f18 = (bottom - rect.top) * aspectRatio;
            }
            float f21 = this.mMaxCropWidth;
            if (f18 > f21) {
                bottom = Math.min(bounds.bottom, rect.top + (f21 / aspectRatio));
                f18 = (bottom - rect.top) * aspectRatio;
            }
            if (leftMoves && rightMoves) {
                bottom = Math.min(bottom, Math.min(bounds.bottom, rect.top + (bounds.width() / aspectRatio)));
            } else {
                if (leftMoves) {
                    float f22 = rect.right;
                    float f23 = f22 - f18;
                    float f24 = bounds.left;
                    if (f23 < f24) {
                        bottom = Math.min(bounds.bottom, rect.top + ((f22 - f24) / aspectRatio));
                        f18 = (bottom - rect.top) * aspectRatio;
                    }
                }
                if (rightMoves) {
                    float f25 = rect.left;
                    float f26 = f18 + f25;
                    float f27 = bounds.right;
                    if (f26 > f27) {
                        bottom = Math.min(bottom, Math.min(bounds.bottom, rect.top + ((f27 - f25) / aspectRatio)));
                    }
                }
            }
        }
        rect.bottom = bottom;
    }

    private final void b(RectF rect, float aspectRatio) {
        rect.bottom = rect.top + (rect.width() / aspectRatio);
    }

    private final void c(RectF rect, float left, RectF bounds, float snapMargin, float aspectRatio, boolean topMoves, boolean bottomMoves) {
        if (left < BitmapDescriptorFactory.HUE_RED) {
            left /= 1.05f;
            this.mTouchOffset.x -= left / 1.1f;
        }
        float f11 = bounds.left;
        if (left < f11) {
            this.mTouchOffset.x -= (left - f11) / 2.0f;
        }
        if (left - f11 < snapMargin) {
            left = f11;
        }
        float f12 = rect.right;
        float f13 = f12 - left;
        float f14 = this.mMinCropWidth;
        if (f13 < f14) {
            left = f12 - f14;
        }
        float f15 = f12 - left;
        float f16 = this.mMaxCropWidth;
        if (f15 > f16) {
            left = f12 - f16;
        }
        if (left - f11 < snapMargin) {
            left = f11;
        }
        if (aspectRatio > BitmapDescriptorFactory.HUE_RED) {
            float f17 = (f12 - left) / aspectRatio;
            float f18 = this.mMinCropHeight;
            if (f17 < f18) {
                left = Math.max(f11, f12 - (f18 * aspectRatio));
                f17 = (rect.right - left) / aspectRatio;
            }
            float f19 = this.mMaxCropHeight;
            if (f17 > f19) {
                left = Math.max(bounds.left, rect.right - (f19 * aspectRatio));
                f17 = (rect.right - left) / aspectRatio;
            }
            if (topMoves && bottomMoves) {
                left = Math.max(left, Math.max(bounds.left, rect.right - (bounds.height() * aspectRatio)));
            } else {
                if (topMoves) {
                    float f21 = rect.bottom;
                    float f22 = f21 - f17;
                    float f23 = bounds.top;
                    if (f22 < f23) {
                        left = Math.max(bounds.left, rect.right - ((f21 - f23) * aspectRatio));
                        f17 = (rect.right - left) / aspectRatio;
                    }
                }
                if (bottomMoves) {
                    float f24 = rect.top;
                    float f25 = f17 + f24;
                    float f26 = bounds.bottom;
                    if (f25 > f26) {
                        left = Math.max(left, Math.max(bounds.left, rect.right - ((f26 - f24) * aspectRatio)));
                    }
                }
            }
        }
        rect.left = left;
    }

    private final void d(RectF rect, float aspectRatio) {
        rect.left = rect.right - (rect.height() * aspectRatio);
    }

    private final void e(RectF rect, RectF bounds, float aspectRatio) {
        rect.inset((rect.width() - (rect.height() * aspectRatio)) / 2, BitmapDescriptorFactory.HUE_RED);
        float f11 = rect.left;
        float f12 = bounds.left;
        if (f11 < f12) {
            rect.offset(f12 - f11, BitmapDescriptorFactory.HUE_RED);
        }
        float f13 = rect.right;
        float f14 = bounds.right;
        if (f13 > f14) {
            rect.offset(f14 - f13, BitmapDescriptorFactory.HUE_RED);
        }
    }

    private final void f(RectF rect, float right, RectF bounds, int viewWidth, float snapMargin, float aspectRatio, boolean topMoves, boolean bottomMoves) {
        float f11 = viewWidth;
        if (right > f11) {
            right = ((right - f11) / 1.05f) + f11;
            this.mTouchOffset.x -= (right - f11) / 1.1f;
        }
        float f12 = bounds.right;
        if (right > f12) {
            this.mTouchOffset.x -= (right - f12) / 2.0f;
        }
        if (f12 - right < snapMargin) {
            right = f12;
        }
        float f13 = rect.left;
        float f14 = right - f13;
        float f15 = this.mMinCropWidth;
        if (f14 < f15) {
            right = f13 + f15;
        }
        float f16 = right - f13;
        float f17 = this.mMaxCropWidth;
        if (f16 > f17) {
            right = f13 + f17;
        }
        if (f12 - right < snapMargin) {
            right = f12;
        }
        if (aspectRatio > BitmapDescriptorFactory.HUE_RED) {
            float f18 = (right - f13) / aspectRatio;
            float f19 = this.mMinCropHeight;
            if (f18 < f19) {
                right = Math.min(f12, f13 + (f19 * aspectRatio));
                f18 = (right - rect.left) / aspectRatio;
            }
            float f21 = this.mMaxCropHeight;
            if (f18 > f21) {
                right = Math.min(bounds.right, rect.left + (f21 * aspectRatio));
                f18 = (right - rect.left) / aspectRatio;
            }
            if (topMoves && bottomMoves) {
                right = Math.min(right, Math.min(bounds.right, rect.left + (bounds.height() * aspectRatio)));
            } else {
                if (topMoves) {
                    float f22 = rect.bottom;
                    float f23 = f22 - f18;
                    float f24 = bounds.top;
                    if (f23 < f24) {
                        right = Math.min(bounds.right, rect.left + ((f22 - f24) * aspectRatio));
                        f18 = (right - rect.left) / aspectRatio;
                    }
                }
                if (bottomMoves) {
                    float f25 = rect.top;
                    float f26 = f18 + f25;
                    float f27 = bounds.bottom;
                    if (f26 > f27) {
                        right = Math.min(right, Math.min(bounds.right, rect.left + ((f27 - f25) * aspectRatio)));
                    }
                }
            }
        }
        rect.right = right;
    }

    private final void g(RectF rect, float aspectRatio) {
        rect.right = rect.left + (rect.height() * aspectRatio);
    }

    private final void h(RectF rect, float top, RectF bounds, float snapMargin, float aspectRatio, boolean leftMoves, boolean rightMoves) {
        if (top < BitmapDescriptorFactory.HUE_RED) {
            top /= 1.05f;
            this.mTouchOffset.y -= top / 1.1f;
        }
        float f11 = bounds.top;
        if (top < f11) {
            this.mTouchOffset.y -= (top - f11) / 2.0f;
        }
        if (top - f11 < snapMargin) {
            top = f11;
        }
        float f12 = rect.bottom;
        float f13 = f12 - top;
        float f14 = this.mMinCropHeight;
        if (f13 < f14) {
            top = f12 - f14;
        }
        float f15 = f12 - top;
        float f16 = this.mMaxCropHeight;
        if (f15 > f16) {
            top = f12 - f16;
        }
        if (top - f11 < snapMargin) {
            top = f11;
        }
        if (aspectRatio > BitmapDescriptorFactory.HUE_RED) {
            float f17 = (f12 - top) * aspectRatio;
            float f18 = this.mMinCropWidth;
            if (f17 < f18) {
                top = Math.max(f11, f12 - (f18 / aspectRatio));
                f17 = (rect.bottom - top) * aspectRatio;
            }
            float f19 = this.mMaxCropWidth;
            if (f17 > f19) {
                top = Math.max(bounds.top, rect.bottom - (f19 / aspectRatio));
                f17 = (rect.bottom - top) * aspectRatio;
            }
            if (leftMoves && rightMoves) {
                top = Math.max(top, Math.max(bounds.top, rect.bottom - (bounds.width() / aspectRatio)));
            } else {
                if (leftMoves) {
                    float f21 = rect.right;
                    float f22 = f21 - f17;
                    float f23 = bounds.left;
                    if (f22 < f23) {
                        top = Math.max(bounds.top, rect.bottom - ((f21 - f23) / aspectRatio));
                        f17 = (rect.bottom - top) * aspectRatio;
                    }
                }
                if (rightMoves) {
                    float f24 = rect.left;
                    float f25 = f17 + f24;
                    float f26 = bounds.right;
                    if (f25 > f26) {
                        top = Math.max(top, Math.max(bounds.top, rect.bottom - ((f26 - f24) / aspectRatio)));
                    }
                }
            }
        }
        rect.top = top;
    }

    private final void i(RectF rect, RectF bounds, float aspectRatio) {
        rect.inset(BitmapDescriptorFactory.HUE_RED, (rect.height() - (rect.width() / aspectRatio)) / 2);
        float f11 = rect.top;
        float f12 = bounds.top;
        if (f11 < f12) {
            rect.offset(BitmapDescriptorFactory.HUE_RED, f12 - f11);
        }
        float f13 = rect.bottom;
        float f14 = bounds.bottom;
        if (f13 > f14) {
            rect.offset(BitmapDescriptorFactory.HUE_RED, f14 - f13);
        }
    }

    private final void j(RectF rect, float aspectRatio) {
        rect.top = rect.bottom - (rect.width() / aspectRatio);
    }

    private final void k(RectF rect, float touchX, float touchY) {
        float fCenterY;
        float f11;
        float f12;
        int i11 = c.f21140a[this.type.ordinal()];
        float fCenterX = BitmapDescriptorFactory.HUE_RED;
        switch (i11) {
            case 1:
                fCenterX = rect.left - touchX;
                fCenterY = rect.top;
                f12 = fCenterY - touchY;
                PointF pointF = this.mTouchOffset;
                pointF.x = fCenterX;
                pointF.y = f12;
                return;
            case 2:
                fCenterX = rect.right - touchX;
                fCenterY = rect.top;
                f12 = fCenterY - touchY;
                PointF pointF2 = this.mTouchOffset;
                pointF2.x = fCenterX;
                pointF2.y = f12;
                return;
            case 3:
                fCenterX = rect.left - touchX;
                fCenterY = rect.bottom;
                f12 = fCenterY - touchY;
                PointF pointF3 = this.mTouchOffset;
                pointF3.x = fCenterX;
                pointF3.y = f12;
                return;
            case 4:
                fCenterX = rect.right - touchX;
                fCenterY = rect.bottom;
                f12 = fCenterY - touchY;
                PointF pointF4 = this.mTouchOffset;
                pointF4.x = fCenterX;
                pointF4.y = f12;
                return;
            case 5:
                f11 = rect.left;
                fCenterX = f11 - touchX;
                f12 = 0.0f;
                PointF pointF5 = this.mTouchOffset;
                pointF5.x = fCenterX;
                pointF5.y = f12;
                return;
            case 6:
                fCenterY = rect.top;
                f12 = fCenterY - touchY;
                PointF pointF6 = this.mTouchOffset;
                pointF6.x = fCenterX;
                pointF6.y = f12;
                return;
            case 7:
                f11 = rect.right;
                fCenterX = f11 - touchX;
                f12 = 0.0f;
                PointF pointF7 = this.mTouchOffset;
                pointF7.x = fCenterX;
                pointF7.y = f12;
                return;
            case 8:
                fCenterY = rect.bottom;
                f12 = fCenterY - touchY;
                PointF pointF8 = this.mTouchOffset;
                pointF8.x = fCenterX;
                pointF8.y = f12;
                return;
            case 9:
                fCenterX = rect.centerX() - touchX;
                fCenterY = rect.centerY();
                f12 = fCenterY - touchY;
                PointF pointF9 = this.mTouchOffset;
                pointF9.x = fCenterX;
                pointF9.y = f12;
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    private final void m(RectF rect, float x11, float y11, RectF bounds, int viewWidth, int viewHeight, float snapRadius) {
        float fCenterX = x11 - rect.centerX();
        float fCenterY = y11 - rect.centerY();
        float f11 = rect.left;
        if (f11 + fCenterX >= BitmapDescriptorFactory.HUE_RED) {
            float f12 = rect.right;
            if (f12 + fCenterX > viewWidth || f11 + fCenterX < bounds.left || f12 + fCenterX > bounds.right) {
                fCenterX /= 1.05f;
                this.mTouchOffset.x -= fCenterX / 2;
            }
        } else {
            fCenterX /= 1.05f;
            this.mTouchOffset.x -= fCenterX / 2;
        }
        float f13 = rect.top;
        if (f13 + fCenterY >= BitmapDescriptorFactory.HUE_RED) {
            float f14 = rect.bottom;
            if (f14 + fCenterY > viewHeight || f13 + fCenterY < bounds.top || f14 + fCenterY > bounds.bottom) {
                fCenterY /= 1.05f;
                this.mTouchOffset.y -= fCenterY / 2;
            }
        } else {
            fCenterY /= 1.05f;
            this.mTouchOffset.y -= fCenterY / 2;
        }
        rect.offset(fCenterX, fCenterY);
        p(rect, bounds, snapRadius);
    }

    private final void n(RectF rect, float x11, float y11, RectF bounds, int viewWidth, int viewHeight, float snapMargin, float aspectRatio) {
        switch (c.f21140a[this.type.ordinal()]) {
            case 1:
                if (INSTANCE.a(x11, y11, rect.right, rect.bottom) < aspectRatio) {
                    h(rect, y11, bounds, snapMargin, aspectRatio, true, false);
                    d(rect, aspectRatio);
                    return;
                } else {
                    c(rect, x11, bounds, snapMargin, aspectRatio, true, false);
                    j(rect, aspectRatio);
                    return;
                }
            case 2:
                if (INSTANCE.a(rect.left, y11, x11, rect.bottom) < aspectRatio) {
                    h(rect, y11, bounds, snapMargin, aspectRatio, false, true);
                    g(rect, aspectRatio);
                    return;
                } else {
                    f(rect, x11, bounds, viewWidth, snapMargin, aspectRatio, true, false);
                    j(rect, aspectRatio);
                    return;
                }
            case 3:
                if (INSTANCE.a(x11, rect.top, rect.right, y11) < aspectRatio) {
                    a(rect, y11, bounds, viewHeight, snapMargin, aspectRatio, true, false);
                    d(rect, aspectRatio);
                    return;
                } else {
                    c(rect, x11, bounds, snapMargin, aspectRatio, false, true);
                    b(rect, aspectRatio);
                    return;
                }
            case 4:
                if (INSTANCE.a(rect.left, rect.top, x11, y11) < aspectRatio) {
                    a(rect, y11, bounds, viewHeight, snapMargin, aspectRatio, false, true);
                    g(rect, aspectRatio);
                    return;
                } else {
                    f(rect, x11, bounds, viewWidth, snapMargin, aspectRatio, false, true);
                    b(rect, aspectRatio);
                    return;
                }
            case 5:
                c(rect, x11, bounds, snapMargin, aspectRatio, true, true);
                i(rect, bounds, aspectRatio);
                return;
            case 6:
                h(rect, y11, bounds, snapMargin, aspectRatio, true, true);
                e(rect, bounds, aspectRatio);
                return;
            case 7:
                f(rect, x11, bounds, viewWidth, snapMargin, aspectRatio, true, true);
                i(rect, bounds, aspectRatio);
                return;
            case 8:
                a(rect, y11, bounds, viewHeight, snapMargin, aspectRatio, true, true);
                e(rect, bounds, aspectRatio);
                return;
            case 9:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final void o(RectF rect, float x11, float y11, RectF bounds, int viewWidth, int viewHeight, float snapMargin) {
        switch (c.f21140a[this.type.ordinal()]) {
            case 1:
                h(rect, y11, bounds, snapMargin, BitmapDescriptorFactory.HUE_RED, false, false);
                c(rect, x11, bounds, snapMargin, BitmapDescriptorFactory.HUE_RED, false, false);
                return;
            case 2:
                h(rect, y11, bounds, snapMargin, BitmapDescriptorFactory.HUE_RED, false, false);
                f(rect, x11, bounds, viewWidth, snapMargin, BitmapDescriptorFactory.HUE_RED, false, false);
                return;
            case 3:
                a(rect, y11, bounds, viewHeight, snapMargin, BitmapDescriptorFactory.HUE_RED, false, false);
                c(rect, x11, bounds, snapMargin, BitmapDescriptorFactory.HUE_RED, false, false);
                return;
            case 4:
                a(rect, y11, bounds, viewHeight, snapMargin, BitmapDescriptorFactory.HUE_RED, false, false);
                f(rect, x11, bounds, viewWidth, snapMargin, BitmapDescriptorFactory.HUE_RED, false, false);
                return;
            case 5:
                c(rect, x11, bounds, snapMargin, BitmapDescriptorFactory.HUE_RED, false, false);
                return;
            case 6:
                h(rect, y11, bounds, snapMargin, BitmapDescriptorFactory.HUE_RED, false, false);
                return;
            case 7:
                f(rect, x11, bounds, viewWidth, snapMargin, BitmapDescriptorFactory.HUE_RED, false, false);
                return;
            case 8:
                a(rect, y11, bounds, viewHeight, snapMargin, BitmapDescriptorFactory.HUE_RED, false, false);
                return;
            case 9:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final void p(RectF edges, RectF bounds, float margin) {
        float f11 = edges.left;
        float f12 = bounds.left;
        if (f11 < f12 + margin) {
            edges.offset(f12 - f11, BitmapDescriptorFactory.HUE_RED);
        }
        float f13 = edges.top;
        float f14 = bounds.top;
        if (f13 < f14 + margin) {
            edges.offset(BitmapDescriptorFactory.HUE_RED, f14 - f13);
        }
        float f15 = edges.right;
        float f16 = bounds.right;
        if (f15 > f16 - margin) {
            edges.offset(f16 - f15, BitmapDescriptorFactory.HUE_RED);
        }
        float f17 = edges.bottom;
        float f18 = bounds.bottom;
        if (f17 > f18 - margin) {
            edges.offset(BitmapDescriptorFactory.HUE_RED, f18 - f17);
        }
    }

    public final void l(RectF rect, float x11, float y11, RectF bounds, int viewWidth, int viewHeight, float snapMargin, boolean fixedAspectRatio, float aspectRatio) {
        p013kotlin.jvm.internal.s.k(rect, "rect");
        p013kotlin.jvm.internal.s.k(bounds, "bounds");
        PointF pointF = this.mTouchOffset;
        float f11 = pointF.x + x11;
        float f12 = pointF.y + y11;
        if (this.type == b.CENTER) {
            m(rect, f11, f12, bounds, viewWidth, viewHeight, snapMargin);
        } else if (fixedAspectRatio) {
            n(rect, f11, f12, bounds, viewWidth, viewHeight, snapMargin, aspectRatio);
        } else {
            o(rect, f11, f12, bounds, viewWidth, viewHeight, snapMargin);
        }
    }
}
