package g2;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.Address;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import i4.TextLayoutInput;
import i4.TextLayoutResult;
import i4.TextStyle;
import i4.o;
import i4.r;
import i4.s0;
import jn0.h0;
import kotlin.m0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p014n4.q;
import w4.s;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b \u0010\u001cJ\u001d\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#JH\u0010$\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00105R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00105R\u001c\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u00109R.\u0010A\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010;8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010=\u001a\u0004\b.\u0010>\"\u0004\b?\u0010@R$\u0010F\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010B\u001a\u0004\b6\u0010C\"\u0004\bD\u0010ER\"\u0010J\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u00107\u001a\u0004\b0\u0010G\"\u0004\bH\u0010IR(\u0010O\u001a\u00020K8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001b\u00109\u001a\u0004\b2\u0010L\"\u0004\bM\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010QR\u0018\u0010T\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010SR\u0018\u0010V\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010UR\u001c\u0010W\u001a\u00020\u00168\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u00109R\u0016\u0010Y\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u00105R\u0016\u0010[\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u00105R\u0014\u0010]\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\\\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Lg2/f;", "", "", "text", "Li4/r0;", "style", "Ln4/q$b;", "fontFamilyResolver", "Lt4/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "<init>", "(Ljava/lang/String;Li4/r0;Ln4/q$b;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lw4/t;", "layoutDirection", "Li4/r;", "n", "(Lw4/t;)Li4/r;", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Li4/o;", "g", "(JLw4/t;)Li4/o;", "l", "(JLw4/t;)Z", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "()V", "h", Snapshot.WIDTH, "f", "(ILw4/t;)I", "p", "(Ljava/lang/String;Li4/r0;Ln4/q$b;IZII)V", "Li4/m0;", "o", "(Li4/r0;)Li4/m0;", "k", "(Lw4/t;)I", "j", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Li4/r0;", "c", "Ln4/q$b;", DateTokenConverter.CONVERTER_KEY, "I", "e", "Z", "Lg2/a;", "J", "lastDensity", "Lw4/d;", "value", "Lw4/d;", "()Lw4/d;", "m", "(Lw4/d;)V", "density", "Li4/o;", "()Li4/o;", "setParagraph$foundation_release", "(Li4/o;)V", "paragraph", "()Z", "setDidOverflow$foundation_release", "(Z)V", "didOverflow", "Lw4/r;", "()J", "setLayoutSize-ozmzZPI$foundation_release", "(J)V", "layoutSize", "Lg2/c;", "Lg2/c;", "mMinLinesConstrainer", "Li4/r;", "paragraphIntrinsics", "Lw4/t;", "intrinsicsLayoutDirection", "prevConstraints", "q", "cachedIntrinsicHeightInputWidth", "r", "cachedIntrinsicHeight", "()Ljn0/h0;", "observeFontChanges", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private TextStyle style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private q.b fontFamilyResolver;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long lastDensity;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private w4.d density;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private o paragraph;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean didOverflow;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long layoutSize;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private c mMinLinesConstrainer;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private r paragraphIntrinsics;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private t intrinsicsLayoutDirection;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long prevConstraints;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeightInputWidth;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeight;

    public /* synthetic */ f(String str, TextStyle textStyle, q.b bVar, int i11, boolean z11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, bVar, i11, z11, i12, i13);
    }

    private final o g(long constraints, t layoutDirection) {
        r rVarN = n(layoutDirection);
        return i4.t.c(rVarN, b.a(constraints, this.softWrap, this.overflow, rVarN.f()), b.b(this.softWrap, this.overflow, this.maxLines), t4.t.e(this.overflow, t4.t.INSTANCE.b()));
    }

    private final void i() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = w4.b.INSTANCE.c(0, 0);
        this.layoutSize = s.a(0, 0);
        this.didOverflow = false;
    }

    private final boolean l(long constraints, t layoutDirection) {
        r rVar;
        o oVar = this.paragraph;
        if (oVar == null || (rVar = this.paragraphIntrinsics) == null || rVar.a() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (w4.b.f(constraints, this.prevConstraints)) {
            return false;
        }
        return w4.b.l(constraints) != w4.b.l(this.prevConstraints) || ((float) w4.b.k(constraints)) < oVar.getHeight() || oVar.v();
    }

    private final r n(t layoutDirection) {
        r rVarB = this.paragraphIntrinsics;
        if (rVarB == null || layoutDirection != this.intrinsicsLayoutDirection || rVarB.a()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            TextStyle textStyleD = s0.d(this.style, layoutDirection);
            w4.d dVar = this.density;
            p013kotlin.jvm.internal.s.h(dVar);
            rVarB = i4.s.b(str, textStyleD, null, null, dVar, this.fontFamilyResolver, 12, null);
        }
        this.paragraphIntrinsics = rVarB;
        return rVarB;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final w4.d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDidOverflow() {
        return this.didOverflow;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getLayoutSize() {
        return this.layoutSize;
    }

    public final h0 d() {
        r rVar = this.paragraphIntrinsics;
        if (rVar != null) {
            rVar.a();
        }
        return h0.f84049a;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final o getParagraph() {
        return this.paragraph;
    }

    public final int f(int width, t layoutDirection) {
        int i11 = this.cachedIntrinsicHeightInputWidth;
        int i12 = this.cachedIntrinsicHeight;
        if (width == i11 && i11 != -1) {
            return i12;
        }
        int iA = m0.a(g(w4.c.a(0, width, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.cachedIntrinsicHeightInputWidth = width;
        this.cachedIntrinsicHeight = iA;
        return iA;
    }

    public final boolean h(long constraints, t layoutDirection) {
        t tVar;
        boolean z11 = true;
        if (this.minLines > 1) {
            c.Companion companion = c.INSTANCE;
            c cVar = this.mMinLinesConstrainer;
            TextStyle textStyle = this.style;
            w4.d dVar = this.density;
            p013kotlin.jvm.internal.s.h(dVar);
            tVar = layoutDirection;
            c cVarA = companion.a(cVar, tVar, textStyle, dVar, this.fontFamilyResolver);
            this.mMinLinesConstrainer = cVarA;
            constraints = cVarA.c(constraints, this.minLines);
        } else {
            tVar = layoutDirection;
        }
        boolean z12 = false;
        if (l(constraints, tVar)) {
            o oVarG = g(constraints, tVar);
            this.prevConstraints = constraints;
            long jF = w4.c.f(constraints, s.a(m0.a(oVarG.getWidth()), m0.a(oVarG.getHeight())));
            this.layoutSize = jF;
            if (!t4.t.e(this.overflow, t4.t.INSTANCE.c()) && (w4.r.g(jF) < oVarG.getWidth() || w4.r.f(jF) < oVarG.getHeight())) {
                z12 = true;
            }
            this.didOverflow = z12;
            this.paragraph = oVarG;
            return true;
        }
        if (!w4.b.f(constraints, this.prevConstraints)) {
            o oVar = this.paragraph;
            p013kotlin.jvm.internal.s.h(oVar);
            long jF2 = w4.c.f(constraints, s.a(m0.a(Math.min(oVar.f(), oVar.getWidth())), m0.a(oVar.getHeight())));
            this.layoutSize = jF2;
            if (t4.t.e(this.overflow, t4.t.INSTANCE.c()) || (w4.r.g(jF2) >= oVar.getWidth() && w4.r.f(jF2) >= oVar.getHeight())) {
                z11 = false;
            }
            this.didOverflow = z11;
            this.prevConstraints = constraints;
        }
        return false;
    }

    public final int j(t layoutDirection) {
        return m0.a(n(layoutDirection).f());
    }

    public final int k(t layoutDirection) {
        return m0.a(n(layoutDirection).d());
    }

    public final void m(w4.d dVar) {
        w4.d dVar2 = this.density;
        long jD = dVar != null ? a.d(dVar) : a.INSTANCE.a();
        if (dVar2 == null) {
            this.density = dVar;
            this.lastDensity = jD;
        } else if (dVar == null || !a.e(this.lastDensity, jD)) {
            this.density = dVar;
            this.lastDensity = jD;
            i();
        }
    }

    public final TextLayoutResult o(TextStyle style) {
        w4.d dVar;
        t tVar = this.intrinsicsLayoutDirection;
        if (tVar == null || (dVar = this.density) == null) {
            return null;
        }
        i4.d dVar2 = new i4.d(this.text, null, null, 6, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long jD = w4.b.d(this.prevConstraints, 0, 0, 0, 0, 10, null);
        return new TextLayoutResult(new TextLayoutInput(dVar2, style, v.m(), this.maxLines, this.softWrap, this.overflow, dVar, tVar, this.fontFamilyResolver, jD, (DefaultConstructorMarker) null), new i4.j(new i4.k(dVar2, style, v.m(), dVar, this.fontFamilyResolver), jD, this.maxLines, t4.t.e(this.overflow, t4.t.INSTANCE.b()), null), this.layoutSize, null);
    }

    public final void p(String text, TextStyle style, q.b fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        i();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ParagraphLayoutCache(paragraph=");
        sb2.append(this.paragraph != null ? "<paragraph>" : Address.ADDRESS_NULL_PLACEHOLDER);
        sb2.append(", lastDensity=");
        sb2.append((Object) a.h(this.lastDensity));
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    private f(String str, TextStyle textStyle, q.b bVar, int i11, boolean z11, int i12, int i13) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.overflow = i11;
        this.softWrap = z11;
        this.maxLines = i12;
        this.minLines = i13;
        this.lastDensity = a.INSTANCE.a();
        this.layoutSize = s.a(0, 0);
        this.prevConstraints = w4.b.INSTANCE.c(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }
}
