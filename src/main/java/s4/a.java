package s4;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import k3.i4;
import k3.j4;
import k3.t0;
import k3.u3;
import m3.Stroke;
import m3.g;
import m3.j;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Ls4/a;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Lm3/g;", "drawStyle", "<init>", "(Lm3/g;)V", "Lk3/j4;", "Landroid/graphics/Paint$Join;", "b", "(I)Landroid/graphics/Paint$Join;", "Lk3/i4;", "Landroid/graphics/Paint$Cap;", "a", "(I)Landroid/graphics/Paint$Cap;", "Landroid/text/TextPaint;", "textPaint", "Ljn0/h0;", "updateDrawState", "(Landroid/text/TextPaint;)V", "Lm3/g;", "getDrawStyle", "()Lm3/g;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g drawStyle;

    public a(g gVar) {
        this.drawStyle = gVar;
    }

    private final Paint.Cap a(int i11) {
        i4.Companion companion = i4.INSTANCE;
        if (i4.e(i11, companion.a())) {
            return Paint.Cap.BUTT;
        }
        if (i4.e(i11, companion.b())) {
            return Paint.Cap.ROUND;
        }
        return i4.e(i11, companion.c()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    private final Paint.Join b(int i11) {
        j4.Companion companion = j4.INSTANCE;
        if (j4.e(i11, companion.b())) {
            return Paint.Join.MITER;
        }
        if (j4.e(i11, companion.c())) {
            return Paint.Join.ROUND;
        }
        return j4.e(i11, companion.a()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            g gVar = this.drawStyle;
            if (s.f(gVar, j.f90966a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (gVar instanceof Stroke) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((Stroke) this.drawStyle).getWidth());
                textPaint.setStrokeMiter(((Stroke) this.drawStyle).getMiter());
                textPaint.setStrokeJoin(b(((Stroke) this.drawStyle).getJoin()));
                textPaint.setStrokeCap(a(((Stroke) this.drawStyle).getCap()));
                u3 pathEffect = ((Stroke) this.drawStyle).getPathEffect();
                textPaint.setPathEffect(pathEffect != null ? t0.a(pathEffect) : null);
            }
        }
    }
}
