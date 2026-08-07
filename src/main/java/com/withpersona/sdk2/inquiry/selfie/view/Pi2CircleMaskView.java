package com.withpersona.sdk2.inquiry.selfie.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import ezvcard.property.Gender;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import th0.z0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 -2\u00020\u0001:\u0001!B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010)R\u0016\u0010,\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)¨\u0006."}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "", "targetScaleX", "", "b", "(F)J", "Landroid/graphics/Canvas;", "canvas", "Ljn0/h0;", "onDraw", "(Landroid/graphics/Canvas;)V", "h", "()V", "", "animated", "Lkotlin/Function0;", "onComplete", DateTokenConverter.CONVERTER_KEY, "(ZLwn0/a;)V", "g", "()Z", "a", Gender.FEMALE, "size", "I", "maskColor", "Landroid/graphics/Bitmap;", "mask", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "e", "clearPaint", "f", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Pi2CircleMaskView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maskColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Bitmap mask;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Paint paint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Paint clearPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pi2CircleMaskView(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    private final long b(float targetScaleX) {
        return yn0.a.f((Math.abs(getScaleX() - targetScaleX) / 4.0f) * 500);
    }

    private final Bitmap c() {
        Bitmap bitmap = this.mask;
        if (bitmap != null) {
            if (bitmap.getWidth() != getWidth() || bitmap.getHeight() != getHeight()) {
                bitmap = null;
            }
            if (bitmap != null) {
                return bitmap;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        s.j(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(this.maskColor);
        canvas.drawCircle(canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, this.size * Math.min(canvas.getWidth(), canvas.getHeight()), this.clearPaint);
        this.mask = bitmapCreateBitmap;
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(Pi2CircleMaskView pi2CircleMaskView, boolean z11, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        pi2CircleMaskView.d(z11, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(wn0.a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void d(boolean animated, final wn0.a<h0> onComplete) {
        if (animated) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
            viewPropertyAnimatorAnimate.setDuration(b(1.0f));
            viewPropertyAnimatorAnimate.scaleX(1.0f);
            viewPropertyAnimatorAnimate.scaleY(1.0f);
            viewPropertyAnimatorAnimate.withEndAction(new Runnable() { // from class: xh0.n
                @Override // java.lang.Runnable
                public final void run() {
                    Pi2CircleMaskView.f(onComplete);
                }
            });
            viewPropertyAnimatorAnimate.start();
            return;
        }
        getAnimation().cancel();
        setScaleX(1.0f);
        setScaleY(1.0f);
        if (onComplete != null) {
            onComplete.invoke();
        }
    }

    public final boolean g() {
        return (getScaleX() == 5.0f && getScaleY() == 5.0f) ? false : true;
    }

    public final void h() {
        if (getScaleX() == 5.0f && getScaleY() == 5.0f) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
        viewPropertyAnimatorAnimate.setDuration(b(5.0f));
        viewPropertyAnimatorAnimate.scaleX(5.0f);
        viewPropertyAnimatorAnimate.scaleY(5.0f);
        viewPropertyAnimatorAnimate.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        s.k(canvas, "canvas");
        canvas.drawBitmap(c(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.paint);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pi2CircleMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.k(context, "context");
    }

    public /* synthetic */ Pi2CircleMaskView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pi2CircleMaskView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        this.paint = new Paint(7);
        Paint paint = new Paint(1);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.clearPaint = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z0.f114486a, i11, 0);
        s.j(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.size = typedArrayObtainStyledAttributes.getFloat(z0.f114487b, 0.4f);
            this.maskColor = typedArrayObtainStyledAttributes.getColor(z0.f114488c, -16777216);
            typedArrayObtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
