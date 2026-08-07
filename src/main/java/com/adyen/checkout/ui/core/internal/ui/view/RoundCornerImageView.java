package com.adyen.checkout.ui.core.internal.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import gf.j;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 62\u00020\u0001:\u00017B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0015¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R*\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010&\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R*\u0010-\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u00105\u001a\u00020.2\u0006\u0010\u001b\u001a\u00020.8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/RoundCornerImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "typedArrayAttrs", "Ljn0/h0;", "c", "(Landroid/content/res/TypedArray;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "strokePaint", "", "value", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "getRadius", "()F", "setRadius", "(F)V", "radius", "e", "getStrokeWidth", "setStrokeWidth", "strokeWidth", "f", "I", "getStrokeColor", "()I", "setStrokeColor", "(I)V", "strokeColor", "", "g", "Z", "getBorderEnabled", "()Z", "setBorderEnabled", "(Z)V", "borderEnabled", "h", "a", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoundCornerImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Paint strokePaint;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float radius;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float strokeWidth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int strokeColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean borderEnabled;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundCornerImageView(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    private final void c(TypedArray typedArrayAttrs) {
        try {
            setStrokeColor(typedArrayAttrs.getColor(j.f68840c, -16777216));
            setStrokeWidth(typedArrayAttrs.getDimension(j.f68841d, 4.0f));
            setRadius(typedArrayAttrs.getDimension(j.f68839b, 9.0f));
        } finally {
            typedArrayAttrs.recycle();
        }
    }

    public final boolean getBorderEnabled() {
        return this.borderEnabled;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onDraw(Canvas canvas) {
        s.k(canvas, "canvas");
        if (!this.borderEnabled) {
            super.onDraw(canvas);
            return;
        }
        float f11 = this.strokeWidth;
        float f12 = 2;
        RectF rectF = new RectF(f11 / f12, f11 / f12, getWidth() - (this.strokeWidth / f12), getHeight() - (this.strokeWidth / f12));
        this.strokePaint.reset();
        if (this.strokeWidth > BitmapDescriptorFactory.HUE_RED) {
            this.strokePaint.setStyle(Paint.Style.STROKE);
            this.strokePaint.setAntiAlias(true);
            this.strokePaint.setColor(this.strokeColor);
            this.strokePaint.setStrokeWidth(this.strokeWidth);
            float f13 = this.radius;
            canvas.drawRoundRect(rectF, f13, f13, this.strokePaint);
        }
        Path path = new Path();
        float f14 = this.radius;
        path.addRoundRect(rectF, f14, f14, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        float f11 = this.strokeWidth;
        super.onMeasure(widthMeasureSpec + (((int) f11) * 2), heightMeasureSpec + (((int) f11) * 2));
    }

    public final void setBorderEnabled(boolean z11) {
        this.borderEnabled = z11;
        invalidate();
    }

    public final void setRadius(float f11) {
        this.radius = f11;
        invalidate();
    }

    public final void setStrokeColor(int i11) {
        this.strokeColor = i11;
        invalidate();
    }

    public final void setStrokeWidth(float f11) {
        this.strokeWidth = f11;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.k(context, "context");
    }

    public /* synthetic */ RoundCornerImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        this.strokePaint = new Paint();
        this.borderEnabled = true;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, j.f68838a, 0, 0);
        s.j(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        c(typedArrayObtainStyledAttributes);
    }
}
