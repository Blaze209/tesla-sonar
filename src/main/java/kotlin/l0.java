package kotlin;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import i4.Placeholder;
import i4.TextLayoutInput;
import i4.TextLayoutResult;
import i4.TextStyle;
import i4.d;
import i4.j;
import i4.k;
import i4.s0;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p014n4.q;
import w4.b;
import w4.c;
import w4.s;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001%Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J,\u0010#\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b%\u00108R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b)\u0010;R#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0006¢\u0006\f\n\u0004\b3\u0010<\u001a\u0004\b9\u0010=R$\u0010D\u001a\u0004\u0018\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010I\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010 R\u0014\u0010J\u001a\u00020>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010AR\u0011\u0010K\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b-\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Lb2/l0;", "", "Li4/d;", "text", "Li4/r0;", "style", "", "maxLines", "minLines", "", "softWrap", "Lt4/t;", "overflow", "Lw4/d;", "density", "Ln4/q$b;", "fontFamilyResolver", "", "Li4/d$c;", "Li4/w;", "placeholders", "<init>", "(Li4/d;Li4/r0;IIZILw4/d;Ln4/q$b;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lw4/t;", "layoutDirection", "Li4/j;", "n", "(JLw4/t;)Li4/j;", "Ljn0/h0;", "m", "(Lw4/t;)V", "Li4/m0;", "prevResult", "l", "(JLw4/t;Li4/m0;)Li4/m0;", "a", "Li4/d;", "k", "()Li4/d;", "b", "Li4/r0;", "j", "()Li4/r0;", "c", "I", DateTokenConverter.CONVERTER_KEY, "()I", "e", "Z", IntegerTokenConverter.CONVERTER_KEY, "()Z", "f", "g", "Lw4/d;", "()Lw4/d;", "h", "Ln4/q$b;", "()Ln4/q$b;", "Ljava/util/List;", "()Ljava/util/List;", "Li4/k;", "Li4/k;", "getParagraphIntrinsics$foundation_release", "()Li4/k;", "setParagraphIntrinsics$foundation_release", "(Li4/k;)V", "paragraphIntrinsics", "Lw4/t;", "getIntrinsicsLayoutDirection$foundation_release", "()Lw4/t;", "setIntrinsicsLayoutDirection$foundation_release", "intrinsicsLayoutDirection", "nonNullIntrinsics", "maxIntrinsicWidth", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextStyle style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final w4.d density;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final q.b fontFamilyResolver;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<d.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private k paragraphIntrinsics;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private t intrinsicsLayoutDirection;

    public /* synthetic */ l0(d dVar, TextStyle textStyle, int i11, int i12, boolean z11, int i13, w4.d dVar2, q.b bVar, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, textStyle, i11, i12, z11, i13, dVar2, bVar, list);
    }

    private final k f() {
        k kVar = this.paragraphIntrinsics;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    private final j n(long constraints, t layoutDirection) {
        m(layoutDirection);
        int iN = b.n(constraints);
        int iL = ((this.softWrap || t4.t.e(this.overflow, t4.t.INSTANCE.b())) && b.h(constraints)) ? b.l(constraints) : Integer.MAX_VALUE;
        int i11 = (this.softWrap || !t4.t.e(this.overflow, t4.t.INSTANCE.b())) ? this.maxLines : 1;
        if (iN != iL) {
            iL = n.n(c(), iN, iL);
        }
        return new j(f(), b.INSTANCE.b(0, iL, 0, b.k(constraints)), i11, t4.t.e(this.overflow, t4.t.INSTANCE.b()), null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final w4.d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final q.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final int c() {
        return m0.a(f().f());
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMinLines() {
        return this.minLines;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    public final List<d.Range<Placeholder>> h() {
        return this.placeholders;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final d getText() {
        return this.text;
    }

    public final TextLayoutResult l(long constraints, t layoutDirection, TextLayoutResult prevResult) {
        if (prevResult != null && b1.a(prevResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints)) {
            return prevResult.a(new TextLayoutInput(prevResult.getLayoutInput().getText(), this.style, prevResult.getLayoutInput().g(), prevResult.getLayoutInput().getMaxLines(), prevResult.getLayoutInput().getSoftWrap(), prevResult.getLayoutInput().getOverflow(), prevResult.getLayoutInput().getDensity(), prevResult.getLayoutInput().getLayoutDirection(), prevResult.getLayoutInput().getFontFamilyResolver(), constraints, (DefaultConstructorMarker) null), c.f(constraints, s.a(m0.a(prevResult.getMultiParagraph().getWidth()), m0.a(prevResult.getMultiParagraph().getHeight()))));
        }
        j jVarN = n(constraints, layoutDirection);
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints, (DefaultConstructorMarker) null), jVarN, c.f(constraints, s.a(m0.a(jVarN.getWidth()), m0.a(jVarN.getHeight()))), null);
    }

    public final void m(t layoutDirection) {
        k kVar = this.paragraphIntrinsics;
        if (kVar == null || layoutDirection != this.intrinsicsLayoutDirection || kVar.a()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            kVar = new k(this.text, s0.d(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = kVar;
    }

    private l0(d dVar, TextStyle textStyle, int i11, int i12, boolean z11, int i13, w4.d dVar2, q.b bVar, List<d.Range<Placeholder>> list) {
        this.text = dVar;
        this.style = textStyle;
        this.maxLines = i11;
        this.minLines = i12;
        this.softWrap = z11;
        this.overflow = i13;
        this.density = dVar2;
        this.fontFamilyResolver = bVar;
        this.placeholders = list;
        if (i11 <= 0) {
            throw new IllegalArgumentException("no maxLines");
        }
        if (i12 <= 0) {
            throw new IllegalArgumentException("no minLines");
        }
        if (i12 > i11) {
            throw new IllegalArgumentException("minLines greater than maxLines");
        }
    }

    public /* synthetic */ l0(d dVar, TextStyle textStyle, int i11, int i12, boolean z11, int i13, w4.d dVar2, q.b bVar, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, textStyle, (i14 & 4) != 0 ? Integer.MAX_VALUE : i11, (i14 & 8) != 0 ? 1 : i12, (i14 & 16) != 0 ? true : z11, (i14 & 32) != 0 ? t4.t.INSTANCE.a() : i13, dVar2, bVar, (i14 & 256) != 0 ? v.m() : list, null);
    }
}
