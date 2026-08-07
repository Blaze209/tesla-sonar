package g2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import i4.Placeholder;
import i4.TextLayoutInput;
import i4.TextLayoutResult;
import i4.TextStyle;
import i4.s0;
import java.util.List;
import kotlin.m0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p014n4.q;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\"\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J(\u0010$\u001a\u00020\n*\u0004\u0018\u00010\u001b2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b,\u0010-J^\u0010.\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000fø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b2\u00101R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u00109R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010:R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00109R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00109R$\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010=R\u001c\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010@R.\u0010H\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010B8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\b3\u0010F\"\u0004\bD\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010IR\u0018\u0010L\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010MR\u0016\u0010P\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u00109R\u0016\u0010R\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u00109R\u0011\u0010T\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b7\u0010SR\u0013\u0010U\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b5\u0010S\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"Lg2/e;", "", "Li4/d;", "text", "Li4/r0;", "style", "Ln4/q$b;", "fontFamilyResolver", "Lt4/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Li4/d$c;", "Li4/w;", "placeholders", "<init>", "(Li4/d;Li4/r0;Ln4/q$b;IZIILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lw4/t;", "layoutDirection", "Lw4/b;", "finalConstraints", "Li4/j;", "multiParagraph", "Li4/m0;", "m", "(Lw4/t;JLi4/j;)Li4/m0;", "Li4/k;", "l", "(Lw4/t;)Li4/k;", CryptoServicesPermission.CONSTRAINTS, "e", "(JLw4/t;)Li4/j;", "j", "(Li4/m0;JLw4/t;)Z", "Ljn0/h0;", "g", "()V", "f", "(JLw4/t;)Z", Snapshot.WIDTH, DateTokenConverter.CONVERTER_KEY, "(ILw4/t;)I", "n", "(Li4/d;Li4/r0;Ln4/q$b;IZIILjava/util/List;)V", "h", "(Lw4/t;)I", IntegerTokenConverter.CONVERTER_KEY, "a", "Li4/d;", "b", "Li4/r0;", "c", "Ln4/q$b;", "I", "Z", "Ljava/util/List;", "Lg2/c;", "Lg2/c;", "mMinLinesConstrainer", "Lg2/a;", "J", "lastDensity", "Lw4/d;", "value", "k", "Lw4/d;", "()Lw4/d;", "(Lw4/d;)V", "density", "Li4/k;", "paragraphIntrinsics", "Lw4/t;", "intrinsicsLayoutDirection", "Li4/m0;", "layoutCache", "o", "cachedIntrinsicHeightInputWidth", "p", "cachedIntrinsicHeight", "()Li4/m0;", "textLayoutResult", "layoutOrNull", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private i4.d text;

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
    private List<i4.d.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private c mMinLinesConstrainer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long lastDensity;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private w4.d density;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private i4.k paragraphIntrinsics;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private t intrinsicsLayoutDirection;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult layoutCache;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeightInputWidth;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeight;

    public /* synthetic */ e(i4.d dVar, TextStyle textStyle, q.b bVar, int i11, boolean z11, int i12, int i13, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, textStyle, bVar, i11, z11, i12, i13, list);
    }

    private final i4.j e(long constraints, t layoutDirection) {
        i4.k kVarL = l(layoutDirection);
        return new i4.j(kVarL, b.a(constraints, this.softWrap, this.overflow, kVarL.f()), b.b(this.softWrap, this.overflow, this.maxLines), t4.t.e(this.overflow, t4.t.INSTANCE.b()), null);
    }

    private final void g() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
    }

    private final boolean j(TextLayoutResult textLayoutResult, long j11, t tVar) {
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().a() || tVar != textLayoutResult.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (w4.b.f(j11, textLayoutResult.getLayoutInput().getConstraints())) {
            return false;
        }
        return w4.b.l(j11) != w4.b.l(textLayoutResult.getLayoutInput().getConstraints()) || ((float) w4.b.k(j11)) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines();
    }

    private final i4.k l(t layoutDirection) {
        i4.k kVar = this.paragraphIntrinsics;
        if (kVar == null || layoutDirection != this.intrinsicsLayoutDirection || kVar.a()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            i4.d dVar = this.text;
            TextStyle textStyleD = s0.d(this.style, layoutDirection);
            w4.d dVar2 = this.density;
            s.h(dVar2);
            q.b bVar = this.fontFamilyResolver;
            List<i4.d.Range<Placeholder>> listM = this.placeholders;
            if (listM == null) {
                listM = v.m();
            }
            kVar = new i4.k(dVar, textStyleD, listM, dVar2, bVar);
        }
        this.paragraphIntrinsics = kVar;
        return kVar;
    }

    private final TextLayoutResult m(t layoutDirection, long finalConstraints, i4.j multiParagraph) {
        float fMin = Math.min(multiParagraph.getIntrinsics().f(), multiParagraph.getWidth());
        i4.d dVar = this.text;
        TextStyle textStyle = this.style;
        List<i4.d.Range<Placeholder>> listM = this.placeholders;
        if (listM == null) {
            listM = v.m();
        }
        int i11 = this.maxLines;
        boolean z11 = this.softWrap;
        int i12 = this.overflow;
        w4.d dVar2 = this.density;
        s.h(dVar2);
        return new TextLayoutResult(new TextLayoutInput(dVar, textStyle, listM, i11, z11, i12, dVar2, layoutDirection, this.fontFamilyResolver, finalConstraints, (DefaultConstructorMarker) null), multiParagraph, w4.c.f(finalConstraints, w4.s.a(m0.a(fMin), m0.a(multiParagraph.getHeight()))), null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final w4.d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextLayoutResult getLayoutCache() {
        return this.layoutCache;
    }

    public final TextLayoutResult c() {
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int d(int width, t layoutDirection) {
        int i11 = this.cachedIntrinsicHeightInputWidth;
        int i12 = this.cachedIntrinsicHeight;
        if (width == i11 && i11 != -1) {
            return i12;
        }
        int iA = m0.a(e(w4.c.a(0, width, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.cachedIntrinsicHeightInputWidth = width;
        this.cachedIntrinsicHeight = iA;
        return iA;
    }

    public final boolean f(long constraints, t layoutDirection) {
        t tVar;
        if (this.minLines > 1) {
            c.Companion companion = c.INSTANCE;
            c cVar = this.mMinLinesConstrainer;
            TextStyle textStyle = this.style;
            w4.d dVar = this.density;
            s.h(dVar);
            tVar = layoutDirection;
            c cVarA = companion.a(cVar, tVar, textStyle, dVar, this.fontFamilyResolver);
            this.mMinLinesConstrainer = cVarA;
            constraints = cVarA.c(constraints, this.minLines);
        } else {
            tVar = layoutDirection;
        }
        if (j(this.layoutCache, constraints, tVar)) {
            this.layoutCache = m(tVar, constraints, e(constraints, tVar));
            return true;
        }
        TextLayoutResult textLayoutResult = this.layoutCache;
        s.h(textLayoutResult);
        if (w4.b.f(constraints, textLayoutResult.getLayoutInput().getConstraints())) {
            return false;
        }
        TextLayoutResult textLayoutResult2 = this.layoutCache;
        s.h(textLayoutResult2);
        this.layoutCache = m(tVar, constraints, textLayoutResult2.getMultiParagraph());
        return true;
    }

    public final int h(t layoutDirection) {
        return m0.a(l(layoutDirection).f());
    }

    public final int i(t layoutDirection) {
        return m0.a(l(layoutDirection).d());
    }

    public final void k(w4.d dVar) {
        w4.d dVar2 = this.density;
        long jD = dVar != null ? a.d(dVar) : a.INSTANCE.a();
        if (dVar2 == null) {
            this.density = dVar;
            this.lastDensity = jD;
        } else if (dVar == null || !a.e(this.lastDensity, jD)) {
            this.density = dVar;
            this.lastDensity = jD;
            g();
        }
    }

    public final void n(i4.d text, TextStyle style, q.b fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines, List<i4.d.Range<Placeholder>> placeholders) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        this.placeholders = placeholders;
        g();
    }

    private e(i4.d dVar, TextStyle textStyle, q.b bVar, int i11, boolean z11, int i12, int i13, List<i4.d.Range<Placeholder>> list) {
        this.text = dVar;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.overflow = i11;
        this.softWrap = z11;
        this.maxLines = i12;
        this.minLines = i13;
        this.placeholders = list;
        this.lastDensity = a.INSTANCE.a();
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }
}
