package qo;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import so.BorderRadiusStyle;
import so.ComputedBorderRadius;
import so.CornerRadii;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b(\u00101R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lqo/i;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "shadowColor", "", "offsetX", "offsetY", "blurRadius", "spread", "Lso/e;", Snapshot.BORDER_RADIUS, "<init>", "(Landroid/content/Context;IFFFFLso/e;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/RectF;", "shadowRect", "spreadExtent", "Lso/j;", "computedBorderRadii", "Ljn0/h0;", "b", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;FLso/j;)V", "a", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/content/Context;", "I", "c", Gender.FEMALE, DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "Lso/e;", "getBorderRadius", "()Lso/e;", "(Lso/e;)V", "Landroid/graphics/Paint;", "h", "Landroid/graphics/Paint;", "shadowPaint", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int shadowColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float offsetX;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float offsetY;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float blurRadius;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float spread;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private BorderRadiusStyle borderRadius;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Paint shadowPaint;

    public i(Context context, int i11, float f11, float f12, float f13, float f14, BorderRadiusStyle borderRadiusStyle) {
        s.k(context, "context");
        this.context = context;
        this.shadowColor = i11;
        this.offsetX = f11;
        this.offsetY = f12;
        this.blurRadius = f13;
        this.spread = f14;
        this.borderRadius = borderRadiusStyle;
        Paint paint = new Paint();
        paint.setColor(i11);
        float fX = com.facebook.react.uimanager.e.f23134a.x(f13 * 0.5f);
        if (fX > BitmapDescriptorFactory.HUE_RED) {
            paint.setMaskFilter(new BlurMaskFilter(fX, BlurMaskFilter.Blur.NORMAL));
        }
        this.shadowPaint = paint;
    }

    private final void a(Canvas canvas, RectF shadowRect) {
        canvas.clipOutRect(getBounds());
        canvas.drawRect(shadowRect, this.shadowPaint);
    }

    private final void b(Canvas canvas, RectF shadowRect, float spreadExtent, ComputedBorderRadius computedBorderRadii) {
        RectF rectF = new RectF(getBounds());
        rectF.inset(0.4f, 0.4f);
        Path path = new Path();
        float[] fArr = {computedBorderRadii.getTopLeft().getHorizontal(), computedBorderRadii.getTopLeft().getVertical(), computedBorderRadii.getTopRight().getHorizontal(), computedBorderRadii.getTopRight().getVertical(), computedBorderRadii.getBottomRight().getHorizontal(), computedBorderRadii.getBottomRight().getVertical(), computedBorderRadii.getBottomLeft().getHorizontal(), computedBorderRadii.getBottomLeft().getVertical()};
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        canvas.clipOutPath(path);
        Path path2 = new Path();
        path2.addRoundRect(shadowRect, new float[]{c.a(computedBorderRadii.getTopLeft().getHorizontal(), spreadExtent), c.a(computedBorderRadii.getTopLeft().getVertical(), spreadExtent), c.a(computedBorderRadii.getTopRight().getHorizontal(), spreadExtent), c.a(computedBorderRadii.getTopRight().getVertical(), spreadExtent), c.a(computedBorderRadii.getBottomRight().getHorizontal(), spreadExtent), c.a(computedBorderRadii.getBottomRight().getVertical(), spreadExtent), c.a(computedBorderRadii.getBottomLeft().getHorizontal(), spreadExtent), c.a(computedBorderRadii.getBottomLeft().getVertical(), spreadExtent)}, direction);
        canvas.drawPath(path2, this.shadowPaint);
    }

    public final void c(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ComputedBorderRadius computedBorderRadiusD;
        s.k(canvas, "canvas");
        w wVar = w.f23413a;
        float fD = wVar.d(getBounds().width());
        float fD2 = wVar.d(getBounds().height());
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        ComputedBorderRadius computedBorderRadius = (borderRadiusStyle == null || (computedBorderRadiusD = borderRadiusStyle.d(getLayoutDirection(), this.context, fD, fD2)) == null) ? null : new ComputedBorderRadius(new CornerRadii(wVar.b(computedBorderRadiusD.getTopLeft().getHorizontal()), wVar.b(computedBorderRadiusD.getTopLeft().getVertical())), new CornerRadii(wVar.b(computedBorderRadiusD.getTopRight().getHorizontal()), wVar.b(computedBorderRadiusD.getTopRight().getVertical())), new CornerRadii(wVar.b(computedBorderRadiusD.getBottomLeft().getHorizontal()), wVar.b(computedBorderRadiusD.getBottomLeft().getVertical())), new CornerRadii(wVar.b(computedBorderRadiusD.getBottomRight().getHorizontal()), wVar.b(computedBorderRadiusD.getBottomRight().getVertical())));
        float fB = wVar.b(this.spread);
        RectF rectF = new RectF(getBounds());
        float f11 = -fB;
        rectF.inset(f11, f11);
        rectF.offset(wVar.b(this.offsetX), wVar.b(this.offsetY));
        int iSave = canvas.save();
        if (computedBorderRadius == null || !computedBorderRadius.e()) {
            a(canvas, rectF);
        } else {
            b(canvas, rectF, fB, computedBorderRadius);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    @jn0.e
    public int getOpacity() {
        int alpha = this.shadowPaint.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.shadowPaint.setAlpha(yn0.a.d((alpha / 255.0f) * (Color.alpha(this.shadowColor) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.shadowPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
