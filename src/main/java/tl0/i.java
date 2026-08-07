package tl0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class i implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rl0.c f114791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f114792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f114793c = h.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f114794d;

    public i(@NonNull rl0.c cVar, @NonNull String str) {
        this.f114791a = cVar;
        this.f114792b = str;
    }

    public static void a(@NonNull TextView textView, @NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            i[] iVarArr = (i[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), i.class);
            if (iVarArr != null) {
                TextPaint paint = textView.getPaint();
                for (i iVar : iVarArr) {
                    iVar.f114794d = (int) (paint.measureText(iVar.f114792b) + 0.5f);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        if (z11 && xl0.c.b(i16, charSequence, this)) {
            this.f114793c.set(paint);
            this.f114791a.g(this.f114793c);
            int iMeasureText = (int) (this.f114793c.measureText(this.f114792b) + 0.5f);
            int iJ = this.f114791a.j();
            if (iMeasureText > iJ) {
                this.f114794d = iMeasureText;
                iJ = iMeasureText;
            } else {
                this.f114794d = 0;
            }
            canvas.drawText(this.f114792b, i12 > 0 ? (i11 + (iJ * i12)) - iMeasureText : i11 + (i12 * iJ) + (iJ - iMeasureText), i14, this.f114793c);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z11) {
        return Math.max(this.f114794d, this.f114791a.j());
    }
}
