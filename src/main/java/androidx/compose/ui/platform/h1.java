package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import i4.SpanStyle;
import k3.Shadow;
import p013kotlin.Metadata;
import p014n4.FontWeight;
import t4.TextGeometricTransform;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001bJ\u0018\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u0010\u001bJ\u0015\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u0010\"J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u000209ø\u0001\u0000¢\u0006\u0004\b;\u0010\u0010J\u0015\u0010=\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0006¢\u0006\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010@\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Landroidx/compose/ui/platform/h1;", "", "<init>", "()V", "Ljn0/h0;", "q", "", "p", "()Ljava/lang/String;", "Li4/d0;", "spanStyle", DateTokenConverter.CONVERTER_KEY, "(Li4/d0;)V", "Lk3/p1;", "color", "m", "(J)V", "Lw4/v;", "textUnit", "j", "Ln4/f0;", "fontWeight", "g", "(Ln4/f0;)V", "Ln4/b0;", "fontStyle", "o", "(I)V", "Ln4/c0;", "fontSynthesis", "l", "Lt4/a;", "baselineShift", "k", "(F)V", "Lt4/o;", "textGeometricTransform", IntegerTokenConverter.CONVERTER_KEY, "(Lt4/o;)V", "Lt4/k;", "textDecoration", "h", "(Lt4/k;)V", "Lk3/e4;", "shadow", "f", "(Lk3/e4;)V", "", "byte", "a", "(B)V", "", "int", "c", "", InquiryField.FloatField.TYPE, "b", "Ljn0/c0;", "uLong", "n", InquiryField.StringField.TYPE, "e", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "Landroid/os/Parcel;", "parcel", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Parcel parcel = Parcel.obtain();

    public final void a(byte b11) {
        this.parcel.writeByte(b11);
    }

    public final void b(float f11) {
        this.parcel.writeFloat(f11);
    }

    public final void c(int i11) {
        this.parcel.writeInt(i11);
    }

    public final void d(SpanStyle spanStyle) {
        long jG = spanStyle.g();
        k3.p1.Companion companion = k3.p1.INSTANCE;
        if (!k3.p1.r(jG, companion.j())) {
            a((byte) 1);
            m(spanStyle.g());
        }
        long fontSize = spanStyle.getFontSize();
        w4.v.Companion companion2 = w4.v.INSTANCE;
        if (!w4.v.e(fontSize, companion2.a())) {
            a((byte) 2);
            j(spanStyle.getFontSize());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            a((byte) 3);
            g(fontWeight);
        }
        p014n4.b0 fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int value = fontStyle.getValue();
            a((byte) 4);
            o(value);
        }
        p014n4.c0 fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int value2 = fontSynthesis.getValue();
            a((byte) 5);
            l(value2);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            a((byte) 6);
            e(fontFeatureSettings);
        }
        if (!w4.v.e(spanStyle.getLetterSpacing(), companion2.a())) {
            a((byte) 7);
            j(spanStyle.getLetterSpacing());
        }
        t4.a baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float multiplier = baselineShift.getMultiplier();
            a((byte) 8);
            k(multiplier);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            a((byte) 9);
            i(textGeometricTransform);
        }
        if (!k3.p1.r(spanStyle.getBackground(), companion.j())) {
            a((byte) 10);
            m(spanStyle.getBackground());
        }
        t4.k textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            a((byte) 11);
            h(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            a((byte) 12);
            f(shadow);
        }
    }

    public final void e(String string) {
        this.parcel.writeString(string);
    }

    public final void f(Shadow shadow) {
        m(shadow.getColor());
        b(j3.g.m(shadow.getOffset()));
        b(j3.g.n(shadow.getOffset()));
        b(shadow.getBlurRadius());
    }

    public final void g(FontWeight fontWeight) {
        c(fontWeight.k());
    }

    public final void h(t4.k textDecoration) {
        c(textDecoration.getMask());
    }

    public final void i(TextGeometricTransform textGeometricTransform) {
        b(textGeometricTransform.getScaleX());
        b(textGeometricTransform.getSkewX());
    }

    public final void j(long textUnit) {
        long jG = w4.v.g(textUnit);
        w4.x.Companion companion = w4.x.INSTANCE;
        byte b11 = 0;
        if (!w4.x.g(jG, companion.c())) {
            if (w4.x.g(jG, companion.b())) {
                b11 = 1;
            } else if (w4.x.g(jG, companion.a())) {
                b11 = 2;
            }
        }
        a(b11);
        if (w4.x.g(w4.v.g(textUnit), companion.c())) {
            return;
        }
        b(w4.v.h(textUnit));
    }

    public final void k(float baselineShift) {
        b(baselineShift);
    }

    public final void l(int fontSynthesis) {
        p014n4.c0.Companion companion = p014n4.c0.INSTANCE;
        byte b11 = 0;
        if (!p014n4.c0.h(fontSynthesis, companion.b())) {
            if (p014n4.c0.h(fontSynthesis, companion.a())) {
                b11 = 1;
            } else if (p014n4.c0.h(fontSynthesis, companion.d())) {
                b11 = 2;
            } else if (p014n4.c0.h(fontSynthesis, companion.c())) {
                b11 = 3;
            }
        }
        a(b11);
    }

    public final void m(long color) {
        n(color);
    }

    public final void n(long uLong) {
        this.parcel.writeLong(uLong);
    }

    public final void o(int fontStyle) {
        p014n4.b0.Companion companion = p014n4.b0.INSTANCE;
        byte b11 = 0;
        if (!p014n4.b0.f(fontStyle, companion.b()) && p014n4.b0.f(fontStyle, companion.a())) {
            b11 = 1;
        }
        a(b11);
    }

    public final String p() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void q() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }
}
