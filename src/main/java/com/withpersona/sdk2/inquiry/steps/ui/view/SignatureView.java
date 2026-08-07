package com.withpersona.sdk2.inquiry.steps.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.card.MaterialCardView;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import yh0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ#\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\"\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b$\u0010\u001dJ\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010\u0015J\u000f\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010;R\u0016\u0010?\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010>R\u0016\u0010@\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010>R\u0014\u0010C\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/view/SignatureView;", "Lcom/google/android/material/card/MaterialCardView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljn0/h0;", "o", "", "x", "y", "r", "(FF)V", "q", "s", "()V", "t", "Landroid/graphics/Rect;", "l", "()Landroid/graphics/Rect;", "Landroid/graphics/Canvas;", "canvas", "m", "(Landroid/graphics/Canvas;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onDraw", "Landroid/view/MotionEvent;", "e", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "k", "Landroid/graphics/Bitmap;", "n", "()Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "signatureBitmap", "Landroid/graphics/Canvas;", "signatureCanvas", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "signatureRectF", "Landroid/graphics/Path;", "u", "Landroid/graphics/Path;", "drawPath", "Landroid/graphics/Paint;", "v", "Landroid/graphics/Paint;", "bitmapPaint", "paint", Gender.FEMALE, "penX", "penY", "p", "()Z", "isEmpty", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SignatureView extends MaterialCardView {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Bitmap signatureBitmap;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Canvas signatureCanvas;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private RectF signatureRectF;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private Path drawPath;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Paint bitmapPaint;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float penX;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private float penY;

    public SignatureView(Context context) {
        super(context);
        this.signatureRectF = new RectF();
        this.drawPath = new Path();
        this.bitmapPaint = new Paint(4);
        this.paint = new Paint();
        o(context, null);
    }

    private final Rect l() {
        RectF rectF = new RectF(this.signatureRectF.left - this.paint.getStrokeWidth(), this.signatureRectF.top - this.paint.getStrokeWidth(), this.signatureRectF.right + this.paint.getStrokeWidth(), this.signatureRectF.bottom + this.paint.getStrokeWidth());
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    private final void m(Canvas canvas) {
        canvas.save();
        Paint paint = new Paint();
        paint.setColor(-3355444);
        paint.setStrokeWidth(4.0f);
        float fA = (float) h.a(24.0d);
        float fA2 = (float) h.a(20.0d);
        canvas.drawLine(fA2, canvas.getHeight() - fA, canvas.getWidth() - fA2, canvas.getHeight() - fA, paint);
        canvas.restore();
    }

    private final void o(Context context, AttributeSet attrs) {
        this.paint.setAntiAlias(true);
        this.paint.setDither(true);
        this.paint.setColor(-16777216);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeJoin(Paint.Join.ROUND);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setStrokeWidth(5.0f);
    }

    private final boolean p() {
        return this.signatureRectF.isEmpty();
    }

    private final void q(float x11, float y11) {
        this.drawPath.lineTo(x11, y11);
        this.penX = x11;
        this.penY = y11;
    }

    private final void r(float x11, float y11) {
        this.drawPath.reset();
        this.drawPath.moveTo(x11, y11);
        this.penX = x11;
        this.penY = y11;
    }

    private final void s() {
        Canvas canvas = this.signatureCanvas;
        if (canvas == null) {
            return;
        }
        if (this.drawPath.isEmpty()) {
            this.drawPath.moveTo(this.penX - 0.5f, this.penY - 0.5f);
            this.drawPath.lineTo(this.penX, this.penY);
            canvas.drawPoint(this.penX, this.penY, this.paint);
        } else {
            this.drawPath.lineTo(this.penX, this.penY);
            canvas.drawPath(this.drawPath, this.paint);
        }
        t();
        this.drawPath.reset();
    }

    private final void t() {
        RectF rectF = new RectF();
        this.drawPath.computeBounds(rectF, true);
        if (!this.drawPath.isEmpty()) {
            float f11 = 2;
            rectF.inset((-this.paint.getStrokeWidth()) / f11, (-this.paint.getStrokeWidth()) / f11);
        }
        rectF.sort();
        this.signatureRectF.union(rectF);
        this.signatureRectF.sort();
    }

    public final void k() {
        Canvas canvas = this.signatureCanvas;
        if (canvas == null) {
            return;
        }
        this.drawPath.reset();
        this.signatureRectF = new RectF();
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        invalidate();
    }

    public final Bitmap n() {
        Bitmap bitmap = this.signatureBitmap;
        if (p() || bitmap == null) {
            return null;
        }
        t();
        Rect rectL = l();
        Rect rect = new Rect(0, 0, rectL.width(), rectL.height());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rectL.width(), rectL.height(), Bitmap.Config.ARGB_8888);
        s.j(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0);
        canvas.drawBitmap(bitmap, rectL, rect, (Paint) null);
        return bitmapCreateBitmap;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        s.k(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawColor(0);
        Bitmap bitmap = this.signatureBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.bitmapPaint);
        }
        m(canvas);
        canvas.drawPath(this.drawPath, this.paint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        if (w11 <= 0 || h11 <= 0) {
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(w11, h11, Bitmap.Config.ARGB_8888);
        this.signatureBitmap = bitmapCreateBitmap;
        s.j(bitmapCreateBitmap, "also(...)");
        this.signatureCanvas = new Canvas(bitmapCreateBitmap);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent e11) {
        s.k(e11, "e");
        super.onTouchEvent(e11);
        float x11 = e11.getX();
        float y11 = e11.getY();
        int action = e11.getAction();
        if (action == 0) {
            r(x11, y11);
            invalidate();
        } else if (action == 1) {
            s();
            invalidate();
        } else if (action == 2) {
            q(x11, y11);
            invalidate();
        }
        return true;
    }

    public SignatureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.signatureRectF = new RectF();
        this.drawPath = new Path();
        this.bitmapPaint = new Paint(4);
        this.paint = new Paint();
        o(context, attributeSet);
    }

    public SignatureView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.signatureRectF = new RectF();
        this.drawPath = new Path();
        this.bitmapPaint = new Paint(4);
        this.paint = new Paint();
        o(context, attributeSet);
    }
}
