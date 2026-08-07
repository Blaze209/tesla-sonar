package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final o f8310b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f8309a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f8311c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short f8312d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f8313e = 1.0f;

    i(@NonNull o oVar) {
        u5.h.h(oVar, "rasterizer cannot be null");
        this.f8310b = oVar;
    }

    @NonNull
    public final o a() {
        return this.f8310b;
    }

    final int b() {
        return this.f8311c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f8309a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f8309a;
        this.f8313e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f8310b.e();
        this.f8312d = (short) (this.f8310b.e() * this.f8313e);
        short sI = (short) (this.f8310b.i() * this.f8313e);
        this.f8311c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f8309a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
