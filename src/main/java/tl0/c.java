package tl0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class c extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rl0.c f114777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f114778b = h.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f114779c = h.a();

    public c(@NonNull rl0.c cVar) {
        this.f114777a = cVar;
    }

    private void a(TextPaint textPaint) {
        this.f114777a.b(textPaint);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int width;
        this.f114779c.setStyle(Paint.Style.FILL);
        this.f114779c.setColor(this.f114777a.n(paint));
        if (i12 > 0) {
            width = canvas.getWidth();
        } else {
            i11 -= canvas.getWidth();
            width = i11;
        }
        this.f114778b.set(i11, i13, width, i15);
        canvas.drawRect(this.f114778b, this.f114779c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        return this.f114777a.o();
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
