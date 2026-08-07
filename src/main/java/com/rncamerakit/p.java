package com.rncamerakit;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/rncamerakit/p;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Ljn0/h0;", "onDraw", "(Landroid/graphics/Canvas;)V", "", "Landroid/graphics/RectF;", "rectBounds", "b", "(Ljava/util/List;)V", "", "a", "Ljava/util/List;", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "react-native-camera-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<RectF> rectBounds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        super(context);
        s.k(context, "context");
        this.rectBounds = new ArrayList();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(androidx.core.content.b.getColor(context, R.color.holo_green_light));
        paint.setStrokeWidth(5.0f);
        this.paint = paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p pVar) {
        pVar.rectBounds.clear();
        pVar.invalidate();
    }

    public final void b(List<? extends RectF> rectBounds) {
        s.k(rectBounds, "rectBounds");
        this.rectBounds.clear();
        this.rectBounds.addAll(rectBounds);
        invalidate();
        postDelayed(new Runnable() { // from class: com.rncamerakit.o
            @Override // java.lang.Runnable
            public final void run() {
                p.c(this.f49025a);
            }
        }, 1000L);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        s.k(canvas, "canvas");
        super.onDraw(canvas);
        Iterator<T> it = this.rectBounds.iterator();
        while (it.hasNext()) {
            canvas.drawRect((RectF) it.next(), this.paint);
        }
    }
}
