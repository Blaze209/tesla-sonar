package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class p extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Paint f8343g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextPaint f8344f;

    public p(@NonNull o oVar) {
        super(oVar);
    }

    private TextPaint c(CharSequence charSequence, int i11, int i12, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i11, i12, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f8344f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f8344f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    @NonNull
    private static Paint e() {
        if (f8343g == null) {
            TextPaint textPaint = new TextPaint();
            f8343g = textPaint;
            textPaint.setColor(e.c().e());
            f8343g.setStyle(Paint.Style.FILL);
        }
        return f8343g;
    }

    void d(Canvas canvas, TextPaint textPaint, float f11, float f12, float f13, float f14) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f11, f13, f12, f14, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, @NonNull Paint paint) {
        TextPaint textPaintC = c(charSequence, i11, i12, paint);
        if (textPaintC != null && textPaintC.bgColor != 0) {
            d(canvas, textPaintC, f11, f11 + b(), i13, i15);
        }
        Paint paint2 = textPaintC;
        if (e.c().j()) {
            canvas.drawRect(f11, i13, f11 + b(), i15, e());
        }
        o oVarA = a();
        float f12 = i14;
        if (paint2 == null) {
            paint2 = paint;
        }
        oVarA.a(canvas, f11, f12, paint2);
    }
}
