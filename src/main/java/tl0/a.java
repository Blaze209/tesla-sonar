package tl0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class a implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rl0.c f114768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f114769b = h.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f114770c = h.a();

    public a(@NonNull rl0.c cVar) {
        this.f114768a = cVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int iK = this.f114768a.k();
        this.f114770c.set(paint);
        this.f114768a.a(this.f114770c);
        int i18 = i12 * iK;
        int i19 = i11 + i18;
        int i21 = i18 + i19;
        this.f114769b.set(Math.min(i19, i21), i13, Math.max(i19, i21), i15);
        canvas.drawRect(this.f114769b, this.f114770c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        return this.f114768a.j();
    }
}
