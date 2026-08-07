package androidx.compose.foundation.text.modifiers;

import b4.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import g2.g;
import i4.Placeholder;
import i4.TextLayoutResult;
import i4.TextStyle;
import i4.d;
import j3.i;
import java.util.List;
import jn0.h0;
import k3.s1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p014n4.q;
import t4.t;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00106R\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00104R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010@R\"\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Lb4/s0;", "Landroidx/compose/foundation/text/modifiers/b;", "Li4/d;", "text", "Li4/r0;", "style", "Ln4/q$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Li4/m0;", "Ljn0/h0;", "onTextLayout", "Lt4/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Li4/d$c;", "Li4/w;", "placeholders", "Lj3/i;", "onPlaceholderLayout", "Lg2/g;", "selectionController", "Lk3/s1;", "color", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(Li4/d;Li4/r0;Ln4/q$b;Lwn0/l;IZIILjava/util/List;Lwn0/l;Lg2/g;Lk3/s1;Lwn0/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "o", "()Landroidx/compose/foundation/text/modifiers/b;", "node", "p", "(Landroidx/compose/foundation/text/modifiers/b;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "Li4/d;", "c", "Li4/r0;", DateTokenConverter.CONVERTER_KEY, "Ln4/q$b;", "e", "Lwn0/l;", "f", "I", "g", "Z", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "Ljava/util/List;", "k", "l", "Lg2/g;", "Lk3/s1;", "m", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextAnnotatedStringElement extends s0<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextStyle style;
    private final s1 color;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q.b fontFamilyResolver;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<TextLayoutResult, h0> onTextLayout;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<d.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final l<List<i>, h0> onPlaceholderLayout;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final g selectionController;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final l<b.TextSubstitutionValue, h0> onShowTranslation;

    public /* synthetic */ TextAnnotatedStringElement(d dVar, TextStyle textStyle, q.b bVar, l lVar, int i11, boolean z11, int i12, int i13, List list, l lVar2, g gVar, s1 s1Var, l lVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, textStyle, bVar, lVar, i11, z11, i12, i13, list, lVar2, gVar, s1Var, lVar3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) other;
        return s.f(this.color, textAnnotatedStringElement.color) && s.f(this.text, textAnnotatedStringElement.text) && s.f(this.style, textAnnotatedStringElement.style) && s.f(this.placeholders, textAnnotatedStringElement.placeholders) && s.f(this.fontFamilyResolver, textAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == textAnnotatedStringElement.onTextLayout && this.onShowTranslation == textAnnotatedStringElement.onShowTranslation && t.e(this.overflow, textAnnotatedStringElement.overflow) && this.softWrap == textAnnotatedStringElement.softWrap && this.maxLines == textAnnotatedStringElement.maxLines && this.minLines == textAnnotatedStringElement.minLines && this.onPlaceholderLayout == textAnnotatedStringElement.onPlaceholderLayout && s.f(this.selectionController, textAnnotatedStringElement.selectionController);
    }

    public int hashCode() {
        int iHashCode = ((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31;
        l<TextLayoutResult, h0> lVar = this.onTextLayout;
        int iHashCode2 = (((((((((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + t.f(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        List<d.Range<Placeholder>> list = this.placeholders;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        l<List<i>, h0> lVar2 = this.onPlaceholderLayout;
        int iHashCode4 = (iHashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        g gVar = this.selectionController;
        int iHashCode5 = (iHashCode4 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        s1 s1Var = this.color;
        int iHashCode6 = (iHashCode5 + (s1Var != null ? s1Var.hashCode() : 0)) * 31;
        l<b.TextSubstitutionValue, h0> lVar3 = this.onShowTranslation;
        return iHashCode6 + (lVar3 != null ? lVar3.hashCode() : 0);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public b getNode() {
        return new b(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, this.onShowTranslation, null);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(b node) {
        node.E2(node.R2(this.color, this.style), node.T2(this.text), node.S2(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow), node.Q2(this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.onShowTranslation));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextAnnotatedStringElement(d dVar, TextStyle textStyle, q.b bVar, l<? super TextLayoutResult, h0> lVar, int i11, boolean z11, int i12, int i13, List<d.Range<Placeholder>> list, l<? super List<i>, h0> lVar2, g gVar, s1 s1Var, l<? super b.TextSubstitutionValue, h0> lVar3) {
        this.text = dVar;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.onTextLayout = lVar;
        this.overflow = i11;
        this.softWrap = z11;
        this.maxLines = i12;
        this.minLines = i13;
        this.placeholders = list;
        this.onPlaceholderLayout = lVar2;
        this.selectionController = gVar;
        this.color = s1Var;
        this.onShowTranslation = lVar3;
    }
}
