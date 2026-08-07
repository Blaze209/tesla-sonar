package p014n4;

import android.graphics.Typeface;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\fJ\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Ln4/q0;", "Ln4/o0;", "<init>", "()V", "", "familyName", "Ln4/f0;", "weight", "Ln4/b0;", "style", "Landroid/graphics/Typeface;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ln4/f0;I)Landroid/graphics/Typeface;", "genericFontFamily", "fontWeight", "fontStyle", "c", "a", "(Ln4/f0;I)Landroid/graphics/Typeface;", "Ln4/j0;", "name", "b", "(Ln4/j0;Ln4/f0;I)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class q0 implements o0 {
    private final Typeface c(String genericFontFamily, FontWeight fontWeight, int fontStyle) {
        if (b0.f(fontStyle, b0.INSTANCE.b()) && s.f(fontWeight, FontWeight.INSTANCE.d()) && (genericFontFamily == null || genericFontFamily.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iC = h.c(fontWeight, fontStyle);
        return (genericFontFamily == null || genericFontFamily.length() == 0) ? Typeface.defaultFromStyle(iC) : Typeface.create(genericFontFamily, iC);
    }

    private final Typeface d(String familyName, FontWeight weight, int style) {
        if (familyName.length() == 0) {
            return null;
        }
        Typeface typefaceC = c(familyName, weight, style);
        if (s.f(typefaceC, Typeface.create(Typeface.DEFAULT, h.c(weight, style))) || s.f(typefaceC, c(null, weight, style))) {
            return null;
        }
        return typefaceC;
    }

    @Override // p014n4.o0
    public Typeface a(FontWeight fontWeight, int fontStyle) {
        return c(null, fontWeight, fontStyle);
    }

    @Override // p014n4.o0
    public Typeface b(j0 name, FontWeight fontWeight, int fontStyle) {
        Typeface typefaceD = d(r0.b(name.getName(), fontWeight), fontWeight, fontStyle);
        return typefaceD == null ? c(name.getName(), fontWeight, fontStyle) : typefaceD;
    }
}
