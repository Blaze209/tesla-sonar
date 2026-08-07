package g2;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import i4.TextStyle;
import i4.s0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p014n4.q;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001\u0012B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lg2/c;", "", "Lw4/t;", "layoutDirection", "Li4/r0;", "inputTextStyle", "Lw4/d;", "density", "Ln4/q$b;", "fontFamilyResolver", "<init>", "(Lw4/t;Li4/r0;Lw4/d;Ln4/q$b;)V", "Lw4/b;", "inConstraints", "", "minLines", "c", "(JI)J", "a", "Lw4/t;", "g", "()Lw4/t;", "b", "Li4/r0;", "f", "()Li4/r0;", "Lw4/d;", DateTokenConverter.CONVERTER_KEY, "()Lw4/d;", "Ln4/q$b;", "e", "()Ln4/q$b;", "resolvedStyle", "", Gender.FEMALE, "lineHeightCache", "oneLineHeightCache", "h", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f67028i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static c f67029j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t layoutDirection;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextStyle inputTextStyle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w4.d density;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q.b fontFamilyResolver;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final TextStyle resolvedStyle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float lineHeightCache;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float oneLineHeightCache;

    /* JADX INFO: renamed from: g2.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lg2/c$a;", "", "<init>", "()V", "Lg2/c;", "minMaxUtil", "Lw4/t;", "layoutDirection", "Li4/r0;", "paramStyle", "Lw4/d;", "density", "Ln4/q$b;", "fontFamilyResolver", "a", "(Lg2/c;Lw4/t;Li4/r0;Lw4/d;Ln4/q$b;)Lg2/c;", "last", "Lg2/c;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(c minMaxUtil, t layoutDirection, TextStyle paramStyle, w4.d density, q.b fontFamilyResolver) {
            if (minMaxUtil != null && layoutDirection == minMaxUtil.getLayoutDirection() && s.f(paramStyle, minMaxUtil.getInputTextStyle()) && density.getDensity() == minMaxUtil.getDensity().getDensity() && fontFamilyResolver == minMaxUtil.getFontFamilyResolver()) {
                return minMaxUtil;
            }
            c cVar = c.f67029j;
            if (cVar != null && layoutDirection == cVar.getLayoutDirection() && s.f(paramStyle, cVar.getInputTextStyle()) && density.getDensity() == cVar.getDensity().getDensity() && fontFamilyResolver == cVar.getFontFamilyResolver()) {
                return cVar;
            }
            c cVar2 = new c(layoutDirection, s0.d(paramStyle, layoutDirection), w4.f.a(density.getDensity(), density.getFontScale()), fontFamilyResolver, null);
            c.f67029j = cVar2;
            return cVar2;
        }

        private Companion() {
        }
    }

    public /* synthetic */ c(t tVar, TextStyle textStyle, w4.d dVar, q.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(tVar, textStyle, dVar, bVar);
    }

    public final long c(long inConstraints, int minLines) {
        float height = this.oneLineHeightCache;
        float height2 = this.lineHeightCache;
        if (Float.isNaN(height) || Float.isNaN(height2)) {
            height = i4.t.a(d.f67037a, this.resolvedStyle, w4.c.b(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (64 & 32) != 0 ? v.m() : null, (64 & 64) != 0 ? v.m() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 1, (64 & 256) != 0 ? false : false).getHeight();
            height2 = i4.t.a(d.f67038b, this.resolvedStyle, w4.c.b(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (64 & 32) != 0 ? v.m() : null, (64 & 64) != 0 ? v.m() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 2, (64 & 256) != 0 ? false : false).getHeight() - height;
            this.oneLineHeightCache = height;
            this.lineHeightCache = height2;
        }
        return w4.c.a(w4.b.n(inConstraints), w4.b.l(inConstraints), minLines != 1 ? n.j(n.f(Math.round(height + (height2 * (minLines - 1))), 0), w4.b.k(inConstraints)) : w4.b.m(inConstraints), w4.b.k(inConstraints));
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final w4.d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final q.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextStyle getInputTextStyle() {
        return this.inputTextStyle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final t getLayoutDirection() {
        return this.layoutDirection;
    }

    private c(t tVar, TextStyle textStyle, w4.d dVar, q.b bVar) {
        this.layoutDirection = tVar;
        this.inputTextStyle = textStyle;
        this.density = dVar;
        this.fontFamilyResolver = bVar;
        this.resolvedStyle = s0.d(textStyle, tVar);
        this.lineHeightCache = Float.NaN;
        this.oneLineHeightCache = Float.NaN;
    }
}
