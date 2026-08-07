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
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import so.BorderRadiusStyle;
import so.ComputedBorderRadius;
import so.CornerRadii;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0017¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b,\u00103R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b-\u00108R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Lqo/f;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "shadowColor", "", "offsetX", "offsetY", "blurRadius", "spread", "Lso/c;", "borderInsets", "Lso/e;", Snapshot.BORDER_RADIUS, "<init>", "(Landroid/content/Context;IFFFFLso/c;Lso/e;)V", "Lso/j;", "b", "()Lso/j;", "Landroid/graphics/RectF;", "a", "()Landroid/graphics/RectF;", "radius", "borderInset", "c", "(FLjava/lang/Float;)F", "alpha", "Ljn0/h0;", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/content/Context;", "I", Gender.FEMALE, DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "Lso/c;", "getBorderInsets", "()Lso/c;", "(Lso/c;)V", "h", "Lso/e;", "getBorderRadius", "()Lso/e;", "(Lso/e;)V", "Landroid/graphics/Paint;", IntegerTokenConverter.CONVERTER_KEY, "Landroid/graphics/Paint;", "shadowPaint", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends Drawable {

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
    private so.c borderInsets;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private BorderRadiusStyle borderRadius;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Paint shadowPaint;

    public f(Context context, int i11, float f11, float f12, float f13, float f14, so.c cVar, BorderRadiusStyle borderRadiusStyle) {
        s.k(context, "context");
        this.context = context;
        this.shadowColor = i11;
        this.offsetX = f11;
        this.offsetY = f12;
        this.blurRadius = f13;
        this.spread = f14;
        this.borderInsets = cVar;
        this.borderRadius = borderRadiusStyle;
        Paint paint = new Paint();
        paint.setColor(i11);
        float fX = com.facebook.react.uimanager.e.f23134a.x(f13 * 0.5f);
        if (fX > BitmapDescriptorFactory.HUE_RED) {
            paint.setMaskFilter(new BlurMaskFilter(fX, BlurMaskFilter.Blur.NORMAL));
        }
        this.shadowPaint = paint;
    }

    private final RectF a() {
        RectF rectFA;
        so.c cVar = this.borderInsets;
        if (cVar == null || (rectFA = cVar.a(getLayoutDirection(), this.context)) == null) {
            return null;
        }
        w wVar = w.f23413a;
        return new RectF(wVar.b(rectFA.left), wVar.b(rectFA.top), wVar.b(rectFA.right), wVar.b(rectFA.bottom));
    }

    private final ComputedBorderRadius b() {
        ComputedBorderRadius computedBorderRadiusD;
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        if (borderRadiusStyle != null) {
            int layoutDirection = getLayoutDirection();
            Context context = this.context;
            w wVar = w.f23413a;
            computedBorderRadiusD = borderRadiusStyle.d(layoutDirection, context, wVar.d(getBounds().width()), wVar.d(getBounds().height()));
        } else {
            computedBorderRadiusD = null;
        }
        if (computedBorderRadiusD == null || !computedBorderRadiusD.e()) {
            return null;
        }
        w wVar2 = w.f23413a;
        return new ComputedBorderRadius(new CornerRadii(wVar2.b(computedBorderRadiusD.getTopLeft().getHorizontal()), wVar2.b(computedBorderRadiusD.getTopLeft().getVertical())), new CornerRadii(wVar2.b(computedBorderRadiusD.getTopRight().getHorizontal()), wVar2.b(computedBorderRadiusD.getTopRight().getVertical())), new CornerRadii(wVar2.b(computedBorderRadiusD.getBottomLeft().getHorizontal()), wVar2.b(computedBorderRadiusD.getBottomLeft().getVertical())), new CornerRadii(wVar2.b(computedBorderRadiusD.getBottomRight().getHorizontal()), wVar2.b(computedBorderRadiusD.getBottomRight().getVertical())));
    }

    private final float c(float radius, Float borderInset) {
        return n.e(radius - (borderInset != null ? borderInset.floatValue() : 0.0f), BitmapDescriptorFactory.HUE_RED);
    }

    public final void d(so.c cVar) {
        this.borderInsets = cVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        s.k(canvas, "canvas");
        ComputedBorderRadius computedBorderRadiusB = b();
        RectF rectFA = a();
        RectF rectF = new RectF(getBounds().left + (rectFA != null ? rectFA.left : 0.0f), getBounds().top + (rectFA != null ? rectFA.top : 0.0f), getBounds().right - (rectFA != null ? rectFA.right : 0.0f), getBounds().bottom - (rectFA != null ? rectFA.bottom : 0.0f));
        float[] fArr = computedBorderRadiusB != null ? new float[]{c(computedBorderRadiusB.getTopLeft().getHorizontal(), rectFA != null ? Float.valueOf(rectFA.left) : null), c(computedBorderRadiusB.getTopLeft().getVertical(), rectFA != null ? Float.valueOf(rectFA.top) : null), c(computedBorderRadiusB.getTopRight().getHorizontal(), rectFA != null ? Float.valueOf(rectFA.right) : null), c(computedBorderRadiusB.getTopRight().getVertical(), rectFA != null ? Float.valueOf(rectFA.top) : null), c(computedBorderRadiusB.getBottomRight().getHorizontal(), rectFA != null ? Float.valueOf(rectFA.right) : null), c(computedBorderRadiusB.getBottomRight().getVertical(), rectFA != null ? Float.valueOf(rectFA.bottom) : null), c(computedBorderRadiusB.getBottomLeft().getHorizontal(), rectFA != null ? Float.valueOf(rectFA.left) : null), c(computedBorderRadiusB.getBottomLeft().getVertical(), rectFA != null ? Float.valueOf(rectFA.bottom) : null)} : null;
        w wVar = w.f23413a;
        float fB = wVar.b(this.offsetX);
        float fB2 = wVar.b(this.offsetY);
        float fB3 = wVar.b(this.spread);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(fB3, fB3);
        rectF2.offset(fB, fB2);
        float fX = com.facebook.react.uimanager.e.f23134a.x(this.blurRadius);
        RectF rectF3 = new RectF(rectF);
        float f11 = -fX;
        rectF3.inset(f11, f11);
        if (fB3 < BitmapDescriptorFactory.HUE_RED) {
            rectF3.inset(fB3, fB3);
        }
        RectF rectF4 = new RectF(rectF3);
        rectF4.offset(-fB, -fB2);
        rectF3.union(rectF4);
        int iSave = canvas.save();
        if (fArr != null) {
            Path path = new Path();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            ArrayList arrayList = new ArrayList(fArr.length);
            for (float f12 : fArr) {
                arrayList.add(Float.valueOf(c.a(f12, -fB3)));
            }
            canvas2 = canvas;
            canvas2.drawDoubleRoundRect(rectF3, g.f105779a, rectF2, v.j1(arrayList), this.shadowPaint);
        } else {
            canvas2 = canvas;
            canvas2.clipRect(rectF);
            canvas2.drawDoubleRoundRect(rectF3, g.f105779a, rectF2, g.f105779a, this.shadowPaint);
        }
        canvas2.restoreToCount(iSave);
    }

    public final void e(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
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
