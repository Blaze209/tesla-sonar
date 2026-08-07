package p014n4;

import android.graphics.Typeface;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ln4/p0;", "Ln4/o0;", "<init>", "()V", "", "genericFontFamily", "Ln4/f0;", "fontWeight", "Ln4/b0;", "fontStyle", "Landroid/graphics/Typeface;", "c", "(Ljava/lang/String;Ln4/f0;I)Landroid/graphics/Typeface;", "a", "(Ln4/f0;I)Landroid/graphics/Typeface;", "Ln4/j0;", "name", "b", "(Ln4/j0;Ln4/f0;I)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class p0 implements o0 {
    private final Typeface c(String genericFontFamily, FontWeight fontWeight, int fontStyle) {
        b0.Companion companion = b0.INSTANCE;
        if (b0.f(fontStyle, companion.b()) && s.f(fontWeight, FontWeight.INSTANCE.d()) && (genericFontFamily == null || genericFontFamily.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(genericFontFamily == null ? Typeface.DEFAULT : Typeface.create(genericFontFamily, 0), fontWeight.k(), b0.f(fontStyle, companion.a()));
    }

    @Override // p014n4.o0
    public Typeface a(FontWeight fontWeight, int fontStyle) {
        return c(null, fontWeight, fontStyle);
    }

    @Override // p014n4.o0
    public Typeface b(j0 name, FontWeight fontWeight, int fontStyle) {
        return c(name.getName(), fontWeight, fontStyle);
    }
}
