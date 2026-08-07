package qo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import so.BorderRadiusStyle;
import so.ComputedBorderRadius;
import so.CornerRadii;
import so.o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0006H\u0017¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b'\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010(R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010.R*\u0010\t\u001a\u00020\b2\u0006\u00100\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010.\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u0010\u000b\u001a\u00020\n2\u0006\u00100\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010\u0007\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010&\"\u0004\b:\u0010 R*\u0010\f\u001a\u00020\b2\u0006\u00100\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b=\u00102\"\u0004\b>\u00104R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010CR\u0016\u0010G\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lqo/h;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lso/e;", Snapshot.BORDER_RADIUS, "", "outlineColor", "", "outlineOffset", "Lso/o;", "outlineStyle", "outlineWidth", "<init>", "(Landroid/content/Context;Lso/e;IFLso/o;F)V", "Ljn0/h0;", "j", "()V", "style", "Landroid/graphics/PathEffect;", DateTokenConverter.CONVERTER_KEY, "(Lso/o;F)Landroid/graphics/PathEffect;", "radius", "a", "(FF)F", "Landroid/graphics/Canvas;", "canvas", "b", "(Landroid/graphics/Canvas;)V", "c", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "draw", "Landroid/content/Context;", "Lso/e;", "getBorderRadius", "()Lso/e;", "e", "(Lso/e;)V", Gender.FEMALE, "gapBetweenPaths", "value", "getOutlineOffset", "()F", "g", "(F)V", "Lso/o;", "getOutlineStyle", "()Lso/o;", "h", "(Lso/o;)V", "f", "I", "getOutlineColor", "getOutlineWidth", IntegerTokenConverter.CONVERTER_KEY, "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "outlinePaint", "Lso/j;", "Lso/j;", "computedBorderRadius", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "tempRectForOutline", "Landroid/graphics/Path;", "k", "Landroid/graphics/Path;", "pathForOutline", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private BorderRadiusStyle borderRadius;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float gapBetweenPaths;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float outlineOffset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private o outlineStyle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int outlineColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float outlineWidth;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Paint outlinePaint;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ComputedBorderRadius computedBorderRadius;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private RectF tempRectForOutline;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Path pathForOutline;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105791a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f105791a = iArr;
        }
    }

    public h(Context context, BorderRadiusStyle borderRadiusStyle, int i11, float f11, o outlineStyle, float f12) {
        s.k(context, "context");
        s.k(outlineStyle, "outlineStyle");
        this.context = context;
        this.borderRadius = borderRadiusStyle;
        this.gapBetweenPaths = 0.8f;
        this.outlineOffset = f11;
        this.outlineStyle = outlineStyle;
        this.outlineColor = i11;
        this.outlineWidth = f12;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i11);
        paint.setStrokeWidth(f12);
        paint.setPathEffect(d(outlineStyle, f12));
        this.outlinePaint = paint;
        this.tempRectForOutline = new RectF();
        this.pathForOutline = new Path();
    }

    private final float a(float radius, float outlineWidth) {
        return radius == BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : radius + (outlineWidth * 0.5f);
    }

    private final void b(Canvas canvas) {
        this.pathForOutline.addRect(this.tempRectForOutline, Path.Direction.CW);
        canvas.drawPath(this.pathForOutline, this.outlinePaint);
    }

    private final void c(Canvas canvas) {
        CornerRadii cornerRadii;
        CornerRadii cornerRadii2;
        CornerRadii cornerRadii3;
        CornerRadii cornerRadii4;
        CornerRadii bottomRight;
        CornerRadii bottomLeft;
        CornerRadii topRight;
        CornerRadii topLeft;
        ComputedBorderRadius computedBorderRadius = this.computedBorderRadius;
        if (computedBorderRadius == null || (topLeft = computedBorderRadius.getTopLeft()) == null || (cornerRadii = topLeft.c()) == null) {
            cornerRadii = new CornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        ComputedBorderRadius computedBorderRadius2 = this.computedBorderRadius;
        if (computedBorderRadius2 == null || (topRight = computedBorderRadius2.getTopRight()) == null || (cornerRadii2 = topRight.c()) == null) {
            cornerRadii2 = new CornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        ComputedBorderRadius computedBorderRadius3 = this.computedBorderRadius;
        if (computedBorderRadius3 == null || (bottomLeft = computedBorderRadius3.getBottomLeft()) == null || (cornerRadii3 = bottomLeft.c()) == null) {
            cornerRadii3 = new CornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        ComputedBorderRadius computedBorderRadius4 = this.computedBorderRadius;
        if (computedBorderRadius4 == null || (bottomRight = computedBorderRadius4.getBottomRight()) == null || (cornerRadii4 = bottomRight.c()) == null) {
            cornerRadii4 = new CornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        this.pathForOutline.addRoundRect(this.tempRectForOutline, new float[]{a(cornerRadii.getHorizontal(), this.outlineWidth), a(cornerRadii.getVertical(), this.outlineWidth), a(cornerRadii2.getHorizontal(), this.outlineWidth), a(cornerRadii2.getVertical(), this.outlineWidth), a(cornerRadii4.getHorizontal(), this.outlineWidth), a(cornerRadii4.getVertical(), this.outlineWidth), a(cornerRadii3.getHorizontal(), this.outlineWidth), a(cornerRadii3.getVertical(), this.outlineWidth)}, Path.Direction.CW);
        canvas.drawPath(this.pathForOutline, this.outlinePaint);
    }

    private final PathEffect d(o style, float outlineWidth) {
        int i11 = a.f105791a[style.ordinal()];
        if (i11 == 1) {
            return null;
        }
        if (i11 == 2) {
            float f11 = outlineWidth * 3;
            return new DashPathEffect(new float[]{f11, f11, f11, f11}, BitmapDescriptorFactory.HUE_RED);
        }
        if (i11 == 3) {
            return new DashPathEffect(new float[]{outlineWidth, outlineWidth, outlineWidth, outlineWidth}, BitmapDescriptorFactory.HUE_RED);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void j() {
        this.tempRectForOutline.set(getBounds());
        RectF rectF = this.tempRectForOutline;
        float f11 = rectF.top;
        float f12 = this.outlineWidth;
        float f13 = this.outlineOffset;
        float f14 = this.gapBetweenPaths;
        rectF.top = f11 - (((f12 * 0.5f) + f13) - f14);
        rectF.bottom += ((f12 * 0.5f) + f13) - f14;
        rectF.left -= ((f12 * 0.5f) + f13) - f14;
        rectF.right += ((f12 * 0.5f) + f13) - f14;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ComputedBorderRadius computedBorderRadiusD;
        s.k(canvas, "canvas");
        if (this.outlineWidth == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        this.pathForOutline.reset();
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        if (borderRadiusStyle != null) {
            int layoutDirection = getLayoutDirection();
            Context context = this.context;
            w wVar = w.f23413a;
            computedBorderRadiusD = borderRadiusStyle.d(layoutDirection, context, wVar.e(getBounds().width()), wVar.e(getBounds().height()));
        } else {
            computedBorderRadiusD = null;
        }
        this.computedBorderRadius = computedBorderRadiusD;
        j();
        ComputedBorderRadius computedBorderRadius = this.computedBorderRadius;
        if (computedBorderRadius == null || computedBorderRadius == null || !computedBorderRadius.e()) {
            b(canvas);
        } else {
            c(canvas);
        }
    }

    public final void e(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    public final void f(int i11) {
        if (i11 != this.outlineColor) {
            this.outlineColor = i11;
            this.outlinePaint.setColor(i11);
            invalidateSelf();
        }
    }

    public final void g(float f11) {
        if (f11 == this.outlineOffset) {
            return;
        }
        this.outlineOffset = f11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @jn0.e
    public int getOpacity() {
        int alpha = this.outlinePaint.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    public final void h(o value) {
        s.k(value, "value");
        if (value != this.outlineStyle) {
            this.outlineStyle = value;
            this.outlinePaint.setPathEffect(d(value, this.outlineWidth));
            invalidateSelf();
        }
    }

    public final void i(float f11) {
        if (f11 == this.outlineWidth) {
            return;
        }
        this.outlineWidth = f11;
        this.outlinePaint.setStrokeWidth(f11);
        this.outlinePaint.setPathEffect(d(this.outlineStyle, f11));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.outlinePaint.setAlpha(yn0.a.d((alpha / 255.0f) * (Color.alpha(this.outlineColor) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.outlinePaint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
