package com.fourthline.vision.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4320y0 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f39107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f39108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f39109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4313x0 f39110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f39111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f39112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Matrix f39113g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4320y0(wn0.a<Rect> contentDetectionArea, wn0.a<? extends Matrix> imageToScreenCoordsMatrix, boolean z11, C4313x0 c4313x0, Context context) {
        this(contentDetectionArea, imageToScreenCoordsMatrix, z11, c4313x0, context, null, 0, 96, null);
        p013kotlin.jvm.internal.s.k(contentDetectionArea, "contentDetectionArea");
        p013kotlin.jvm.internal.s.k(imageToScreenCoordsMatrix, "imageToScreenCoordsMatrix");
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    private final boolean scheduleRedraw() {
        return postDelayed(new Runnable() { // from class: com.fourthline.vision.internal.xb
            @Override // java.lang.Runnable
            public final void run() {
                this.f39103a.invalidate();
            }
        }, 50L);
    }

    public final C4313x0 getDebugConsumer() {
        return this.f39110d;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        List<C4165c4> detections$fourthline_vision_release;
        p013kotlin.jvm.internal.s.k(canvas, "canvas");
        super.onDraw(canvas);
        scheduleRedraw();
        if (this.f39109c) {
            float f11 = 2;
            this.f39113g.setScale(-1.0f, 1.0f, canvas.getWidth() / f11, canvas.getHeight() / f11);
        }
        C4313x0 c4313x0 = this.f39110d;
        if (c4313x0 != null && (detections$fourthline_vision_release = c4313x0.getDetections$fourthline_vision_release()) != null) {
            for (C4165c4 c4165c4 : detections$fourthline_vision_release) {
                Matrix matrix = (Matrix) this.f39108b.invoke();
                if (matrix != null) {
                    RectF rectF = AbstractC4173d4.toRectF(AbstractC4173d4.toRect(c4165c4));
                    this.f39113g.mapRect(rectF);
                    matrix.mapRect(rectF);
                    canvas.drawRect(rectF, (Paint) this.f39112f.get(0));
                }
            }
        }
        canvas.drawRect((Rect) this.f39107a.invoke(), (Paint) this.f39112f.get(1));
    }

    public final void setDebugConsumer(C4313x0 c4313x0) {
        this.f39110d = c4313x0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4320y0(wn0.a<Rect> contentDetectionArea, wn0.a<? extends Matrix> imageToScreenCoordsMatrix, boolean z11, C4313x0 c4313x0, Context context, AttributeSet attributeSet) {
        this(contentDetectionArea, imageToScreenCoordsMatrix, z11, c4313x0, context, attributeSet, 0, 64, null);
        p013kotlin.jvm.internal.s.k(contentDetectionArea, "contentDetectionArea");
        p013kotlin.jvm.internal.s.k(imageToScreenCoordsMatrix, "imageToScreenCoordsMatrix");
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ C4320y0(wn0.a aVar, wn0.a aVar2, boolean z11, C4313x0 c4313x0, Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, z11, c4313x0, context, (i12 & 32) != 0 ? null : attributeSet, (i12 & 64) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4320y0(wn0.a<Rect> contentDetectionArea, wn0.a<? extends Matrix> imageToScreenCoordsMatrix, boolean z11, C4313x0 c4313x0, Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(contentDetectionArea, "contentDetectionArea");
        p013kotlin.jvm.internal.s.k(imageToScreenCoordsMatrix, "imageToScreenCoordsMatrix");
        p013kotlin.jvm.internal.s.k(context, "context");
        this.f39107a = contentDetectionArea;
        this.f39108b = imageToScreenCoordsMatrix;
        this.f39109c = z11;
        this.f39110d = c4313x0;
        List listP = p013kotlin.collections.v.p(-65536, -16711936);
        this.f39111e = listP;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listP, 10));
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Paint paint = new Paint();
            paint.setColor(iIntValue);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(5.0f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            arrayList.add(paint);
        }
        this.f39112f = arrayList;
        this.f39113g = new Matrix();
    }
}
