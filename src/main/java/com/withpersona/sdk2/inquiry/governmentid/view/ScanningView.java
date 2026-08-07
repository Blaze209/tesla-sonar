package com.withpersona.sdk2.inquiry.governmentid.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import ezvcard.property.Gender;
import i.a;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import yh0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u0000 O2\u00020\u0001:\u0001#B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J/\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H\u0014¢\u0006\u0004\b!\u0010\u0014R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0016\u0010*\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0016\u0010/\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010.R$\u00105\u001a\u0002002\u0006\u00101\u001a\u0002008\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0015\u00102\"\u0004\b3\u00104R*\u0010:\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00102\u001a\u0004\b7\u00108\"\u0004\b9\u00104R*\u0010=\u001a\u00020;2\u0006\u00101\u001a\u00020;8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010G\u001a\u00020\t2\u0006\u00101\u001a\u00020\t8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010K\u001a\u00020\t2\u0006\u00101\u001a\u00020\t8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR$\u0010N\u001a\u0002002\u0006\u00101\u001a\u0002008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u00108\"\u0004\bM\u00104¨\u0006P"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/view/ScanningView;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Path;", "c", "()Landroid/graphics/Path;", "Landroid/graphics/SweepGradient;", "b", "()Landroid/graphics/SweepGradient;", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "f", "e", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "Landroid/graphics/Matrix;", "a", "Landroid/graphics/Matrix;", "gradientMatrix", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "animator", "Landroid/graphics/SweepGradient;", "gradient", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Path;", "path", "", "value", Gender.FEMALE, "setAnimationRotation", "(F)V", "animationRotation", "g", "getCornerRadius", "()F", "setCornerRadius", "cornerRadius", "", "Z", "isScanningAnimationEnabled", "()Z", "setScanningAnimationEnabled", "(Z)V", IntegerTokenConverter.CONVERTER_KEY, "I", "getHighlightColor", "()I", "setHighlightColor", "(I)V", "highlightColor", "j", "getBorderColor", "setBorderColor", "borderColor", "getStrokeWidth", "setStrokeWidth", "strokeWidth", "k", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanningView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Matrix gradientMatrix;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ValueAnimator animator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private SweepGradient gradient;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Path path;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float animationRotation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float cornerRadius;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isScanningAnimationEnabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int highlightColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int borderColor;

    public ScanningView(Context context) {
        super(context);
        this.gradientMatrix = new Matrix();
        this.cornerRadius = (float) h.a(8.0d);
        this.isScanningAnimationEnabled = true;
        Context context2 = getContext();
        s.j(context2, "getContext(...)");
        this.highlightColor = yh0.s.d(context2, a.f73749z, null, false, 6, null);
        this.borderColor = -1;
        this.gradient = b();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) h.a(3.0d));
        paint.setShader(this.gradient);
        this.paint = paint;
        this.path = c();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(4000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yg0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ScanningView.a(this.f125468a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.start();
        this.animator = valueAnimatorOfFloat;
    }

    public static void a(ScanningView scanningView, ValueAnimator it) {
        s.k(it, "it");
        scanningView.setAnimationRotation(it.getAnimatedFraction() * 360.0f);
    }

    private final SweepGradient b() {
        int[] iArr;
        if (this.isScanningAnimationEnabled) {
            int i11 = this.borderColor;
            iArr = new int[]{i11, i11, this.highlightColor};
        } else {
            int i12 = this.borderColor;
            iArr = new int[]{i12, i12, i12};
        }
        return new SweepGradient(0.5f, 0.5f, iArr, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f});
    }

    private final Path c() {
        Path path = new Path();
        float strokeWidth = this.paint.getStrokeWidth();
        float f11 = strokeWidth / 2.0f;
        if (getMeasuredWidth() > strokeWidth && getMeasuredHeight() > strokeWidth) {
            float measuredWidth = getMeasuredWidth() - f11;
            float measuredHeight = getMeasuredHeight() - f11;
            float f12 = this.cornerRadius;
            path.addRoundRect(f11, f11, measuredWidth, measuredHeight, new float[]{f12, f12, f12, f12, f12, f12, f12, f12}, Path.Direction.CW);
        }
        return path;
    }

    private final void d() {
        SweepGradient sweepGradientB = b();
        this.gradient = sweepGradientB;
        this.paint.setShader(sweepGradientB);
        e();
        invalidate();
    }

    private final void e() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iMax = Integer.max(measuredWidth, measuredHeight);
        this.gradientMatrix.setRotate(this.animationRotation, 0.5f, 0.5f);
        float f11 = iMax;
        this.gradientMatrix.postScale(f11, f11);
        this.gradientMatrix.postTranslate((measuredWidth - iMax) / 2.0f, (measuredHeight - iMax) / 2.0f);
        this.gradient.setLocalMatrix(this.gradientMatrix);
        invalidate();
    }

    private final void f() {
        this.path = c();
        invalidate();
    }

    private final void setAnimationRotation(float f11) {
        if (this.animationRotation == f11) {
            return;
        }
        this.animationRotation = f11;
        e();
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final int getHighlightColor() {
        return this.highlightColor;
    }

    public final float getStrokeWidth() {
        return this.paint.getStrokeWidth();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.animator.cancel();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        s.k(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.path, this.paint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        f();
        e();
    }

    public final void setBorderColor(int i11) {
        if (this.borderColor == i11) {
            return;
        }
        this.borderColor = i11;
        d();
    }

    public final void setCornerRadius(float f11) {
        if (this.cornerRadius == f11) {
            return;
        }
        this.cornerRadius = f11;
        f();
    }

    public final void setHighlightColor(int i11) {
        if (this.highlightColor == i11) {
            return;
        }
        this.highlightColor = i11;
        d();
    }

    public final void setScanningAnimationEnabled(boolean z11) {
        if (this.isScanningAnimationEnabled == z11) {
            return;
        }
        this.isScanningAnimationEnabled = z11;
        d();
    }

    public final void setStrokeWidth(float f11) {
        if (this.paint.getStrokeWidth() == f11) {
            return;
        }
        this.paint.setStrokeWidth(f11);
        invalidate();
    }

    public ScanningView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gradientMatrix = new Matrix();
        this.cornerRadius = (float) h.a(8.0d);
        this.isScanningAnimationEnabled = true;
        Context context2 = getContext();
        s.j(context2, "getContext(...)");
        this.highlightColor = yh0.s.d(context2, a.f73749z, null, false, 6, null);
        this.borderColor = -1;
        this.gradient = b();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) h.a(3.0d));
        paint.setShader(this.gradient);
        this.paint = paint;
        this.path = c();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(4000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yg0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ScanningView.a(this.f125468a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.start();
        this.animator = valueAnimatorOfFloat;
    }

    public ScanningView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.gradientMatrix = new Matrix();
        this.cornerRadius = (float) h.a(8.0d);
        this.isScanningAnimationEnabled = true;
        Context context2 = getContext();
        s.j(context2, "getContext(...)");
        this.highlightColor = yh0.s.d(context2, a.f73749z, null, false, 6, null);
        this.borderColor = -1;
        this.gradient = b();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) h.a(3.0d));
        paint.setShader(this.gradient);
        this.paint = paint;
        this.path = c();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(4000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yg0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ScanningView.a(this.f125468a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.start();
        this.animator = valueAnimatorOfFloat;
    }
}
