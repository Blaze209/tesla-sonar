package kotlin;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import i4.TextStyle;
import p013kotlin.jvm.internal.s;
import p014n4.q;
import w4.d;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\n\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r8\u0006@BX\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u0017\u0010\u000f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Lb2/z0;", "", "Lw4/t;", "layoutDirection", "Lw4/d;", "density", "Ln4/q$b;", "fontFamilyResolver", "Li4/r0;", "resolvedStyle", "typeface", "<init>", "(Lw4/t;Lw4/d;Ln4/q$b;Li4/r0;Ljava/lang/Object;)V", "Lw4/r;", "a", "()J", "Ljn0/h0;", "c", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "setLayoutDirection", "(Lw4/t;)V", "b", "Lw4/d;", "getDensity", "()Lw4/d;", "setDensity", "(Lw4/d;)V", "Ln4/q$b;", "getFontFamilyResolver", "()Ln4/q$b;", "setFontFamilyResolver", "(Ln4/q$b;)V", DateTokenConverter.CONVERTER_KEY, "Li4/r0;", "getResolvedStyle", "()Li4/r0;", "setResolvedStyle", "(Li4/r0;)V", "e", "Ljava/lang/Object;", "getTypeface", "()Ljava/lang/Object;", "setTypeface", "(Ljava/lang/Object;)V", "<set-?>", "f", "J", "minSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private d density;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private q.b fontFamilyResolver;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private TextStyle resolvedStyle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Object typeface;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long minSize = a();

    public z0(t tVar, d dVar, q.b bVar, TextStyle textStyle, Object obj) {
        this.layoutDirection = tVar;
        this.density = dVar;
        this.fontFamilyResolver = bVar;
        this.resolvedStyle = textStyle;
        this.typeface = obj;
    }

    private final long a() {
        return q0.b(this.resolvedStyle, this.density, this.fontFamilyResolver, null, 0, 24, null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getMinSize() {
        return this.minSize;
    }

    public final void c(t layoutDirection, d density, q.b fontFamilyResolver, TextStyle resolvedStyle, Object typeface) {
        if (layoutDirection == this.layoutDirection && s.f(density, this.density) && s.f(fontFamilyResolver, this.fontFamilyResolver) && s.f(resolvedStyle, this.resolvedStyle) && s.f(typeface, this.typeface)) {
            return;
        }
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = fontFamilyResolver;
        this.resolvedStyle = resolvedStyle;
        this.typeface = typeface;
        this.minSize = a();
    }
}
