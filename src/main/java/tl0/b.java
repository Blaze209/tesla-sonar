package tl0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class b implements LeadingMarginSpan {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f114771f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private rl0.c f114772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f114773b = h.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f114774c = h.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f114775d = h.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f114776e;

    static {
        int i11 = Build.VERSION.SDK_INT;
        f114771f = 24 == i11 || 25 == i11;
    }

    public b(@NonNull rl0.c cVar, int i11) {
        this.f114772a = cVar;
        this.f114776e = i11;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int iMin;
        int iMax;
        if (z11 && xl0.c.b(i16, charSequence, this)) {
            this.f114773b.set(paint);
            this.f114772a.g(this.f114773b);
            int iSave = canvas.save();
            try {
                int iJ = this.f114772a.j();
                int iL = this.f114772a.l((int) ((this.f114773b.descent() - this.f114773b.ascent()) + 0.5f));
                int i18 = (iJ - iL) / 2;
                if (f114771f) {
                    int width = i12 < 0 ? i11 - (layout.getWidth() - (iJ * this.f114776e)) : (iJ * this.f114776e) - i11;
                    int i19 = i11 + (i18 * i12);
                    int i21 = (i12 * iL) + i19;
                    int i22 = i12 * width;
                    iMin = Math.min(i19, i21) + i22;
                    iMax = Math.max(i19, i21) + i22;
                } else {
                    if (i12 <= 0) {
                        i11 -= iJ;
                    }
                    iMin = i11 + i18;
                    iMax = iMin + iL;
                }
                int iDescent = (i14 + ((int) (((this.f114773b.descent() + this.f114773b.ascent()) / 2.0f) + 0.5f))) - (iL / 2);
                int i23 = iL + iDescent;
                int i24 = this.f114776e;
                if (i24 == 0 || i24 == 1) {
                    this.f114774c.set(iMin, iDescent, iMax, i23);
                    this.f114773b.setStyle(this.f114776e == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(this.f114774c, this.f114773b);
                } else {
                    this.f114775d.set(iMin, iDescent, iMax, i23);
                    this.f114773b.setStyle(Paint.Style.FILL);
                    canvas.drawRect(this.f114775d, this.f114773b);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        return this.f114772a.j();
    }
}
