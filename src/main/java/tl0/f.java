package tl0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes8.dex */
public class f extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rl0.c f114781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f114782b = h.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f114783c = h.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f114784d;

    public f(@NonNull rl0.c cVar, int i11) {
        this.f114781a = cVar;
        this.f114784d = i11;
    }

    private void a(TextPaint textPaint) {
        this.f114781a.e(textPaint, this.f114784d);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int width;
        int i18 = this.f114784d;
        if ((i18 == 1 || i18 == 2) && xl0.c.a(i17, charSequence, this)) {
            this.f114783c.set(paint);
            this.f114781a.d(this.f114783c);
            float strokeWidth = this.f114783c.getStrokeWidth();
            if (strokeWidth > BitmapDescriptorFactory.HUE_RED) {
                int i19 = (int) ((i15 - strokeWidth) + 0.5f);
                if (i12 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i11;
                    i11 -= canvas.getWidth();
                }
                this.f114782b.set(i11, i19, width, i15);
                canvas.drawRect(this.f114782b, this.f114783c);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        return 0;
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
