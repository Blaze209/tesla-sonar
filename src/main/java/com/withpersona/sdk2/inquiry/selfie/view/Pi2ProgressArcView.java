package com.withpersona.sdk2.inquiry.selfie.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import ezvcard.property.Gender;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import th0.z0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 12\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u0019\u0010\u0010J\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010)R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010$¨\u00062"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", ReactProgressBarViewManager.PROP_PROGRESS, "Lkotlin/Function0;", "Ljn0/h0;", "onAnimationEnd", "e", "(FLwn0/a;)V", DateTokenConverter.CONVERTER_KEY, "()V", "newColor", "setStrokeColor", "(I)V", "newWidth", "setStrokeWidth", "(F)V", "setProgress", "setIndeterminate", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "a", "Landroid/graphics/Paint;", "paint", "b", Gender.FEMALE, "size", "c", "startAngle", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "animator", "f", "indeterminateAnimator", "g", "rotateToZeroAnimator", "h", "_rotation", IntegerTokenConverter.CONVERTER_KEY, "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Pi2ProgressArcView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float startAngle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float progress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ValueAnimator animator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private ValueAnimator indeterminateAnimator;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ValueAnimator rotateToZeroAnimator;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float _rotation;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$b", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/ValueAnimator;", "animator", "Ljn0/h0;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "", "a", Gender.FEMALE, "getLastProgress", "()F", "setLastProgress", "(F)V", "lastProgress", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private float lastProgress;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ValueAnimator f58380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Pi2ProgressArcView f58381c;

        b(ValueAnimator valueAnimator, Pi2ProgressArcView pi2ProgressArcView) {
            this.f58380b = valueAnimator;
            this.f58381c = pi2ProgressArcView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animator) {
            s.k(animator, "animator");
            Object animatedValue = this.f58380b.getAnimatedValue();
            s.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            float fAbs = Math.abs(fFloatValue - this.lastProgress);
            float f11 = this.f58381c._rotation;
            Pi2ProgressArcView pi2ProgressArcView = this.f58381c;
            pi2ProgressArcView._rotation = (pi2ProgressArcView._rotation + fAbs) % 360;
            if (f11 > this.f58381c._rotation) {
                this.f58381c._rotation = BitmapDescriptorFactory.HUE_RED;
                animator.cancel();
            }
            this.lastProgress = fFloatValue;
            this.f58381c.invalidate();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ wn0.a f58382a;

        c(wn0.a function) {
            s.k(function, "function");
            this.f58382a = function;
        }

        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.f58382a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$d", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/ValueAnimator;", "animator", "Ljn0/h0;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "", "a", Gender.FEMALE, "getLastProgress", "()F", "setLastProgress", "(F)V", "lastProgress", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private float lastProgress;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ValueAnimator f58384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Pi2ProgressArcView f58385c;

        d(ValueAnimator valueAnimator, Pi2ProgressArcView pi2ProgressArcView) {
            this.f58384b = valueAnimator;
            this.f58385c = pi2ProgressArcView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animator) {
            s.k(animator, "animator");
            Object animatedValue = this.f58384b.getAnimatedValue();
            s.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            float fAbs = Math.abs(fFloatValue - this.lastProgress);
            Pi2ProgressArcView pi2ProgressArcView = this.f58385c;
            pi2ProgressArcView._rotation = (pi2ProgressArcView._rotation + fAbs) % 360;
            this.lastProgress = fFloatValue;
            this.f58385c.invalidate();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Ljn0/h0;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.a f58386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Pi2ProgressArcView f58387b;

        public e(wn0.a aVar, Pi2ProgressArcView pi2ProgressArcView) {
            this.f58386a = aVar;
            this.f58387b = pi2ProgressArcView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            wn0.a aVar = this.f58386a;
            if (aVar != null) {
                this.f58387b.postDelayed(new c(aVar), 100L);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pi2ProgressArcView(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    private final void d() {
        if (this._rotation == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 100.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new b(valueAnimatorOfFloat, this));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.start();
        this.rotateToZeroAnimator = valueAnimatorOfFloat;
    }

    private final void e(float progress, wn0.a<h0> onAnimationEnd) {
        if (this.progress == progress) {
            if (onAnimationEnd != null) {
                onAnimationEnd.invoke();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.progress;
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f11, progress);
        valueAnimatorOfFloat.setDuration((long) (1000 * (Math.abs(progress - f11) / 100.0f)));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xh0.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Pi2ProgressArcView.f(this.f123577a, valueAnimatorOfFloat, valueAnimator2);
            }
        });
        s.h(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new e(onAnimationEnd, this));
        valueAnimatorOfFloat.start();
        this.animator = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Pi2ProgressArcView pi2ProgressArcView, ValueAnimator valueAnimator, ValueAnimator it) {
        s.k(it, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        s.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        pi2ProgressArcView.progress = ((Float) animatedValue).floatValue();
        pi2ProgressArcView.invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setProgress$default(Pi2ProgressArcView pi2ProgressArcView, float f11, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        pi2ProgressArcView.setProgress(f11, aVar);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        s.k(canvas, "canvas");
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        float fMin = (this.size * Math.min(getWidth(), getHeight())) - (this.paint.getStrokeWidth() / 2);
        float f11 = width;
        float f12 = height;
        canvas.drawArc(f11 - fMin, f12 - fMin, f11 + fMin, f12 + fMin, this.startAngle + this._rotation, (this.progress * 360) / 100.0f, false, this.paint);
    }

    public final void setIndeterminate() {
        ValueAnimator valueAnimator = this.rotateToZeroAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.indeterminateAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        e(25.0f, null);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 100.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new d(valueAnimatorOfFloat, this));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.start();
        this.indeterminateAnimator = valueAnimatorOfFloat;
    }

    public final void setProgress(float progress, wn0.a<h0> onAnimationEnd) {
        ValueAnimator valueAnimator = this.indeterminateAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        d();
        e(progress, onAnimationEnd);
    }

    public final void setStrokeColor(int newColor) {
        this.paint.setColor(newColor);
    }

    public final void setStrokeWidth(float newWidth) {
        this.paint.setStrokeWidth(newWidth);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pi2ProgressArcView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.k(context, "context");
    }

    public /* synthetic */ Pi2ProgressArcView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2ProgressArcView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        Paint paint = new Paint(1);
        this.paint = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z0.f114489d, i11, 0);
        s.j(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.size = typedArrayObtainStyledAttributes.getFloat(z0.f114490e, 0.4f);
            this.startAngle = typedArrayObtainStyledAttributes.getFloat(z0.f114492g, 270.0f);
            this.progress = typedArrayObtainStyledAttributes.getFloat(z0.f114491f, BitmapDescriptorFactory.HUE_RED);
            paint.setColor(typedArrayObtainStyledAttributes.getColor(z0.f114493h, -1));
            paint.setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(z0.f114494i, 4));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            typedArrayObtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
