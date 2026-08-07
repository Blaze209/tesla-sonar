package tl0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class l implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rl0.c f114796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f114797b = h.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f114798c = h.a();

    public l(@NonNull rl0.c cVar) {
        this.f114796a = cVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int width;
        int i18 = i13 + ((i15 - i13) / 2);
        this.f114798c.set(paint);
        this.f114796a.h(this.f114798c);
        int strokeWidth = (int) ((((int) (this.f114798c.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i12 > 0) {
            width = canvas.getWidth();
        } else {
            width = i11;
            i11 -= canvas.getWidth();
        }
        this.f114797b.set(i11, i18 - strokeWidth, width, i18 + strokeWidth);
        canvas.drawRect(this.f114797b, this.f114798c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        return 0;
    }
}
