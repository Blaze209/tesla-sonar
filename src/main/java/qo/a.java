package qo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import so.BorderRadiusStyle;
import so.ComputedBorderRadius;
import so.CornerRadii;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0018H\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00105\u001a\u0002028\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010:R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010=R*\u0010A\u001a\u00020\u00182\u0006\u0010?\u001a\u00020\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010@\u001a\u0004\b'\u0010!\"\u0004\b3\u0010\u001bR\u0016\u0010C\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00107R\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR:\u0010O\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010H2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010H8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\b6\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lqo/a;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lso/e;", Snapshot.BORDER_RADIUS, "Lso/c;", "borderInsets", "<init>", "(Landroid/content/Context;Lso/e;Lso/c;)V", "Landroid/graphics/RectF;", "a", "()Landroid/graphics/RectF;", "Landroid/graphics/Shader;", "c", "()Landroid/graphics/Shader;", "Ljn0/h0;", "h", "()V", "invalidateSelf", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/content/Context;", "b", "Lso/e;", "getBorderRadius", "()Lso/e;", "g", "(Lso/e;)V", "Lso/c;", "getBorderInsets", "()Lso/c;", "f", "(Lso/c;)V", "", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "pathAdjustment", "e", "Landroid/graphics/RectF;", "computedBorderInsets", "Lso/j;", "Lso/j;", "computedBorderRadius", "", "Z", "needUpdatePath", "value", "I", "backgroundColor", IntegerTokenConverter.CONVERTER_KEY, "backgroundRect", "Landroid/graphics/Path;", "j", "Landroid/graphics/Path;", "backgroundRenderPath", "", "Lso/a;", "k", "Ljava/util/List;", "getBackgroundImageLayers", "()Ljava/util/List;", "(Ljava/util/List;)V", "backgroundImageLayers", "Landroid/graphics/Paint;", "l", "Landroid/graphics/Paint;", "backgroundPaint", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private BorderRadiusStyle borderRadius;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private so.c borderInsets;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float pathAdjustment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private RectF computedBorderInsets;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private ComputedBorderRadius computedBorderRadius;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean needUpdatePath;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int backgroundColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private RectF backgroundRect;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Path backgroundRenderPath;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private List<so.a> backgroundImageLayers;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Paint backgroundPaint;

    public a(Context context, BorderRadiusStyle borderRadiusStyle, so.c cVar) {
        s.k(context, "context");
        this.context = context;
        this.borderRadius = borderRadiusStyle;
        this.borderInsets = cVar;
        this.pathAdjustment = 0.8f;
        this.needUpdatePath = true;
        this.backgroundRect = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.backgroundColor);
        this.backgroundPaint = paint;
    }

    private final RectF a() {
        float fB;
        float fB2;
        float fB3;
        so.c cVar = this.borderInsets;
        RectF rectFA = cVar != null ? cVar.a(getLayoutDirection(), this.context) : null;
        float fB4 = BitmapDescriptorFactory.HUE_RED;
        if (rectFA != null) {
            fB = w.f23413a.b(rectFA.left);
        } else {
            fB = 0.0f;
        }
        if (rectFA != null) {
            fB2 = w.f23413a.b(rectFA.top);
        } else {
            fB2 = 0.0f;
        }
        if (rectFA != null) {
            fB3 = w.f23413a.b(rectFA.right);
        } else {
            fB3 = 0.0f;
        }
        if (rectFA != null) {
            fB4 = w.f23413a.b(rectFA.bottom);
        }
        return new RectF(fB, fB2, fB3, fB4);
    }

    private final Shader c() {
        List<so.a> list = this.backgroundImageLayers;
        Shader composeShader = null;
        if (list != null) {
            for (so.a aVar : list) {
                Rect bounds = getBounds();
                s.j(bounds, "getBounds(...)");
                Shader shaderA = aVar.a(bounds);
                if (shaderA != null) {
                    composeShader = composeShader == null ? shaderA : new ComposeShader(shaderA, composeShader, PorterDuff.Mode.SRC_OVER);
                }
            }
        }
        return composeShader;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    private final void h() {
        ComputedBorderRadius computedBorderRadiusD;
        boolean z11;
        Path path;
        CornerRadii bottomLeft;
        CornerRadii bottomLeft2;
        CornerRadii bottomRight;
        CornerRadii bottomRight2;
        CornerRadii topRight;
        CornerRadii topRight2;
        CornerRadii topLeft;
        CornerRadii topLeft2;
        BorderRadiusStyle borderRadiusStyle;
        ComputedBorderRadius computedBorderRadius;
        if (this.needUpdatePath) {
            this.needUpdatePath = false;
            this.backgroundRect.set(getBounds());
            this.computedBorderInsets = a();
            BorderRadiusStyle borderRadiusStyle2 = this.borderRadius;
            if (borderRadiusStyle2 != null) {
                int layoutDirection = getLayoutDirection();
                Context context = this.context;
                w wVar = w.f23413a;
                computedBorderRadiusD = borderRadiusStyle2.d(layoutDirection, context, wVar.e(getBounds().width()), wVar.e(getBounds().height()));
            } else {
                computedBorderRadiusD = null;
            }
            this.computedBorderRadius = computedBorderRadiusD;
            RectF rectF = this.computedBorderInsets;
            Float fValueOf = rectF != null ? Float.valueOf(rectF.left) : null;
            float fB = BitmapDescriptorFactory.HUE_RED;
            if (s.d(fValueOf, BitmapDescriptorFactory.HUE_RED)) {
                RectF rectF2 = this.computedBorderInsets;
                if (s.d(rectF2 != null ? Float.valueOf(rectF2.top) : null, BitmapDescriptorFactory.HUE_RED)) {
                    RectF rectF3 = this.computedBorderInsets;
                    if (s.d(rectF3 != null ? Float.valueOf(rectF3.right) : null, BitmapDescriptorFactory.HUE_RED)) {
                        RectF rectF4 = this.computedBorderInsets;
                        if (s.d(rectF4 != null ? Float.valueOf(rectF4.bottom) : null, BitmapDescriptorFactory.HUE_RED)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                    } else {
                        z11 = true;
                    }
                } else {
                    z11 = true;
                }
            } else {
                z11 = true;
            }
            ComputedBorderRadius computedBorderRadius2 = this.computedBorderRadius;
            if (computedBorderRadius2 != null && computedBorderRadius2.e() && (computedBorderRadius = this.computedBorderRadius) != null && !computedBorderRadius.f()) {
                Path path2 = this.backgroundRenderPath;
                if (path2 == null) {
                    path2 = new Path();
                }
                this.backgroundRenderPath = path2;
                path2.reset();
            }
            if (z11 && (borderRadiusStyle = this.borderRadius) != null && borderRadiusStyle.c()) {
                RectF rectF5 = this.backgroundRect;
                float f11 = rectF5.left;
                float f12 = this.pathAdjustment;
                rectF5.left = f11 + f12;
                rectF5.top += f12;
                rectF5.right -= f12;
                rectF5.bottom -= f12;
            }
            BorderRadiusStyle borderRadiusStyle3 = this.borderRadius;
            if (borderRadiusStyle3 == null || !borderRadiusStyle3.c()) {
                return;
            }
            ComputedBorderRadius computedBorderRadius3 = this.computedBorderRadius;
            if ((computedBorderRadius3 == null || !computedBorderRadius3.f()) && (path = this.backgroundRenderPath) != null) {
                RectF rectF6 = this.backgroundRect;
                ComputedBorderRadius computedBorderRadius4 = this.computedBorderRadius;
                float fB2 = (computedBorderRadius4 == null || (topLeft2 = computedBorderRadius4.getTopLeft()) == null) ? 0.0f : w.f23413a.b(topLeft2.getHorizontal());
                ComputedBorderRadius computedBorderRadius5 = this.computedBorderRadius;
                float fB3 = (computedBorderRadius5 == null || (topLeft = computedBorderRadius5.getTopLeft()) == null) ? 0.0f : w.f23413a.b(topLeft.getVertical());
                ComputedBorderRadius computedBorderRadius6 = this.computedBorderRadius;
                float fB4 = (computedBorderRadius6 == null || (topRight2 = computedBorderRadius6.getTopRight()) == null) ? 0.0f : w.f23413a.b(topRight2.getHorizontal());
                ComputedBorderRadius computedBorderRadius7 = this.computedBorderRadius;
                float fB5 = (computedBorderRadius7 == null || (topRight = computedBorderRadius7.getTopRight()) == null) ? 0.0f : w.f23413a.b(topRight.getVertical());
                ComputedBorderRadius computedBorderRadius8 = this.computedBorderRadius;
                float fB6 = (computedBorderRadius8 == null || (bottomRight2 = computedBorderRadius8.getBottomRight()) == null) ? 0.0f : w.f23413a.b(bottomRight2.getHorizontal());
                ComputedBorderRadius computedBorderRadius9 = this.computedBorderRadius;
                float fB7 = (computedBorderRadius9 == null || (bottomRight = computedBorderRadius9.getBottomRight()) == null) ? 0.0f : w.f23413a.b(bottomRight.getVertical());
                ComputedBorderRadius computedBorderRadius10 = this.computedBorderRadius;
                float fB8 = (computedBorderRadius10 == null || (bottomLeft2 = computedBorderRadius10.getBottomLeft()) == null) ? 0.0f : w.f23413a.b(bottomLeft2.getHorizontal());
                ComputedBorderRadius computedBorderRadius11 = this.computedBorderRadius;
                if (computedBorderRadius11 != null && (bottomLeft = computedBorderRadius11.getBottomLeft()) != null) {
                    fB = w.f23413a.b(bottomLeft.getVertical());
                }
                path.addRoundRect(rectF6, new float[]{fB2, fB3, fB4, fB5, fB6, fB7, fB8, fB}, Path.Direction.CW);
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final void d(int i11) {
        if (this.backgroundColor != i11) {
            this.backgroundColor = i11;
            this.backgroundPaint.setColor(i11);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        BorderRadiusStyle borderRadiusStyle;
        CornerRadii topLeft;
        CornerRadii topLeft2;
        BorderRadiusStyle borderRadiusStyle2;
        CornerRadii topLeft3;
        CornerRadii topLeft4;
        s.k(canvas, "canvas");
        h();
        canvas.save();
        int alpha = this.backgroundPaint.getAlpha();
        float fB = BitmapDescriptorFactory.HUE_RED;
        if (alpha != 0) {
            ComputedBorderRadius computedBorderRadius = this.computedBorderRadius;
            if (computedBorderRadius == null || !computedBorderRadius.f() || (borderRadiusStyle2 = this.borderRadius) == null || !borderRadiusStyle2.c()) {
                BorderRadiusStyle borderRadiusStyle3 = this.borderRadius;
                if (borderRadiusStyle3 == null || !borderRadiusStyle3.c()) {
                    canvas.drawRect(this.backgroundRect, this.backgroundPaint);
                } else {
                    Path path = this.backgroundRenderPath;
                    if (path == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.drawPath(path, this.backgroundPaint);
                }
            } else {
                RectF rectF = this.backgroundRect;
                ComputedBorderRadius computedBorderRadius2 = this.computedBorderRadius;
                float fB2 = (computedBorderRadius2 == null || (topLeft4 = computedBorderRadius2.getTopLeft()) == null) ? 0.0f : w.f23413a.b(topLeft4.getHorizontal());
                ComputedBorderRadius computedBorderRadius3 = this.computedBorderRadius;
                canvas.drawRoundRect(rectF, fB2, (computedBorderRadius3 == null || (topLeft3 = computedBorderRadius3.getTopLeft()) == null) ? 0.0f : w.f23413a.b(topLeft3.getVertical()), this.backgroundPaint);
            }
        }
        List<so.a> list = this.backgroundImageLayers;
        if (list != null && list != null && (!list.isEmpty())) {
            this.backgroundPaint.setShader(c());
            ComputedBorderRadius computedBorderRadius4 = this.computedBorderRadius;
            if (computedBorderRadius4 == null || !computedBorderRadius4.f() || (borderRadiusStyle = this.borderRadius) == null || !borderRadiusStyle.c()) {
                BorderRadiusStyle borderRadiusStyle4 = this.borderRadius;
                if (borderRadiusStyle4 == null || !borderRadiusStyle4.c()) {
                    canvas.drawRect(this.backgroundRect, this.backgroundPaint);
                } else {
                    Path path2 = this.backgroundRenderPath;
                    if (path2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.drawPath(path2, this.backgroundPaint);
                }
            } else {
                RectF rectF2 = this.backgroundRect;
                ComputedBorderRadius computedBorderRadius5 = this.computedBorderRadius;
                float fB3 = (computedBorderRadius5 == null || (topLeft2 = computedBorderRadius5.getTopLeft()) == null) ? 0.0f : w.f23413a.b(topLeft2.getHorizontal());
                ComputedBorderRadius computedBorderRadius6 = this.computedBorderRadius;
                if (computedBorderRadius6 != null && (topLeft = computedBorderRadius6.getTopLeft()) != null) {
                    fB = w.f23413a.b(topLeft.getVertical());
                }
                canvas.drawRoundRect(rectF2, fB3, fB, this.backgroundPaint);
            }
            this.backgroundPaint.setShader(null);
        }
        canvas.restore();
    }

    public final void e(List<so.a> list) {
        if (s.f(this.backgroundImageLayers, list)) {
            return;
        }
        this.backgroundImageLayers = list;
        invalidateSelf();
    }

    public final void f(so.c cVar) {
        this.borderInsets = cVar;
    }

    public final void g(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    @Override // android.graphics.drawable.Drawable
    @jn0.e
    public int getOpacity() {
        int alpha = this.backgroundPaint.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.needUpdatePath = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        s.k(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.needUpdatePath = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.backgroundPaint.setAlpha(yn0.a.d((alpha / 255.0f) * (Color.alpha(this.backgroundColor) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
