package com.facebook.react.views.debuggingoverlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R0\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00070\u001aj\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0007`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR0\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f0\u001aj\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010#\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/facebook/react/views/debuggingoverlay/b;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "Lcom/facebook/react/views/debuggingoverlay/c;", "traceUpdates", "Ljn0/h0;", "setTraceUpdates", "(Ljava/util/List;)V", "", "Landroid/graphics/RectF;", "elementsRectangles", "setHighlightedElementsRectangles", "b", "()V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "a", "Landroid/graphics/Paint;", "traceUpdatePaint", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "traceUpdatesToDisplayMap", "Ljava/lang/Runnable;", "c", "traceUpdateIdToCleanupRunnableMap", DateTokenConverter.CONVERTER_KEY, "highlightedElementsPaint", "e", "Ljava/util/List;", "highlightedElementsRectangles", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Paint traceUpdatePaint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final HashMap<Integer, c> traceUpdatesToDisplayMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final HashMap<Integer, Runnable> traceUpdateIdToCleanupRunnableMap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Paint highlightedElementsPaint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List<RectF> highlightedElementsRectangles;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        s.k(context, "context");
        Paint paint = new Paint();
        this.traceUpdatePaint = paint;
        this.traceUpdatesToDisplayMap = new HashMap<>();
        this.traceUpdateIdToCleanupRunnableMap = new HashMap<>();
        Paint paint2 = new Paint();
        this.highlightedElementsPaint = paint2;
        this.highlightedElementsRectangles = new ArrayList();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6.0f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-859248897);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(b bVar, int i11) {
        bVar.traceUpdatesToDisplayMap.remove(Integer.valueOf(i11));
        bVar.traceUpdateIdToCleanupRunnableMap.remove(Integer.valueOf(i11));
        bVar.invalidate();
    }

    public final void b() {
        this.highlightedElementsRectangles.clear();
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        s.k(canvas, "canvas");
        super.onDraw(canvas);
        for (c cVar : this.traceUpdatesToDisplayMap.values()) {
            s.j(cVar, "next(...)");
            c cVar2 = cVar;
            this.traceUpdatePaint.setColor(cVar2.getColor());
            canvas.drawRect(cVar2.getRectangle(), this.traceUpdatePaint);
            final int id2 = cVar2.getId();
            Runnable runnable = new Runnable() { // from class: com.facebook.react.views.debuggingoverlay.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.c(this.f23439a, id2);
                }
            };
            if (!this.traceUpdateIdToCleanupRunnableMap.containsKey(Integer.valueOf(id2))) {
                this.traceUpdateIdToCleanupRunnableMap.put(Integer.valueOf(id2), runnable);
                UiThreadUtil.runOnUiThread(runnable, 2000L);
            }
        }
        Iterator<RectF> it = this.highlightedElementsRectangles.iterator();
        while (it.hasNext()) {
            canvas.drawRect(it.next(), this.highlightedElementsPaint);
        }
    }

    public final void setHighlightedElementsRectangles(List<RectF> elementsRectangles) {
        s.k(elementsRectangles, "elementsRectangles");
        this.highlightedElementsRectangles = elementsRectangles;
        invalidate();
    }

    public final void setTraceUpdates(List<c> traceUpdates) {
        s.k(traceUpdates, "traceUpdates");
        for (c cVar : traceUpdates) {
            int id2 = cVar.getId();
            if (this.traceUpdateIdToCleanupRunnableMap.containsKey(Integer.valueOf(id2))) {
                UiThreadUtil.removeOnUiThread(this.traceUpdateIdToCleanupRunnableMap.get(Integer.valueOf(id2)));
                this.traceUpdateIdToCleanupRunnableMap.remove(Integer.valueOf(id2));
            }
            this.traceUpdatesToDisplayMap.put(Integer.valueOf(id2), cVar);
        }
        invalidate();
    }
}
