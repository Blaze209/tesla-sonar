package q4;

import android.graphics.Typeface;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import i4.Placeholder;
import i4.SpanStyle;
import i4.TextStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p013kotlin.Metadata;
import p014n4.FontWeight;
import p014n4.b0;
import p014n4.c0;
import p014n4.g1;
import p020r2.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010)\u001a\u0004\b*\u0010+R\u001a\u00101\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b \u00100R\u001a\u00105\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b.\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010;R\u001a\u0010A\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b7\u0010@R\u0014\u0010D\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010CR\u0014\u0010E\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010CR\u0014\u0010G\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010F¨\u0006H"}, d2 = {"Lq4/d;", "Li4/r;", "", "text", "Li4/r0;", "style", "", "Li4/d$c;", "Li4/d0;", "spanStyles", "Li4/w;", "placeholders", "Ln4/q$b;", "fontFamilyResolver", "Lw4/d;", "density", "<init>", "(Ljava/lang/String;Li4/r0;Ljava/util/List;Ljava/util/List;Ln4/q$b;Lw4/d;)V", "a", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "b", "Li4/r0;", IntegerTokenConverter.CONVERTER_KEY, "()Li4/r0;", "c", "Ljava/util/List;", "getSpanStyles", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "getPlaceholders", "e", "Ln4/q$b;", "g", "()Ln4/q$b;", "f", "Lw4/d;", "getDensity", "()Lw4/d;", "Lq4/i;", "Lq4/i;", "k", "()Lq4/i;", "textPaint", "", "h", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "charSequence", "Lj4/s;", "Lj4/s;", "()Lj4/s;", "layoutIntrinsics", "Lq4/w;", "j", "Lq4/w;", "resolvedTypefaces", "", "Z", "emojiCompatProcessed", "", "l", "I", "()I", "textDirectionHeuristic", "", "()F", "maxIntrinsicWidth", "minIntrinsicWidth", "()Z", "hasStaleResolvedFonts", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements i4.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextStyle style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<i4.d.Range<SpanStyle>> spanStyles;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<i4.d.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final n4.q.b fontFamilyResolver;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final w4.d density;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i textPaint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CharSequence charSequence;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final j4.s layoutIntrinsics;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private w resolvedTypefaces;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean emojiCompatProcessed;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int textDirectionHeuristic;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ln4/q;", "fontFamily", "Ln4/f0;", "fontWeight", "Ln4/b0;", "fontStyle", "Ln4/c0;", "fontSynthesis", "Landroid/graphics/Typeface;", "a", "(Ln4/q;Ln4/f0;II)Landroid/graphics/Typeface;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.r<p014n4.q, FontWeight, b0, c0, Typeface> {
        a() {
            super(4);
        }

        public final Typeface a(p014n4.q qVar, FontWeight fontWeight, int i11, int i12) {
            y3<Object> y3VarA = d.this.getFontFamilyResolver().a(qVar, fontWeight, i11, i12);
            if (y3VarA instanceof g1.b) {
                Object value = y3VarA.getValue();
                p013kotlin.jvm.internal.s.i(value, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) value;
            }
            w wVar = new w(y3VarA, d.this.resolvedTypefaces);
            d.this.resolvedTypefaces = wVar;
            return wVar.a();
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ Typeface invoke(p014n4.q qVar, FontWeight fontWeight, b0 b0Var, c0 c0Var) {
            return a(qVar, fontWeight, b0Var.getValue(), c0Var.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, java.util.List<i4.d$c<i4.d0>>] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public d(String str, TextStyle textStyle, List<i4.d.Range<SpanStyle>> list, List<i4.d.Range<Placeholder>> list2, n4.q.b bVar, w4.d dVar) {
        this.text = str;
        this.style = textStyle;
        this.spanStyles = list;
        this.placeholders = list2;
        this.fontFamilyResolver = bVar;
        this.density = dVar;
        i iVar = new i(1, dVar.getDensity());
        this.textPaint = iVar;
        this.emojiCompatProcessed = !e.c(textStyle) ? false : q.f104762a.a().getValue().booleanValue();
        this.textDirectionHeuristic = e.d(textStyle.D(), textStyle.w());
        a aVar = new a();
        r4.d.e(iVar, textStyle.G());
        SpanStyle spanStyleA = r4.d.a(iVar, textStyle.O(), aVar, dVar, !((Collection) list).isEmpty());
        if (spanStyleA != null) {
            int size = list.size() + 1;
            list = new ArrayList<>(size);
            int i11 = 0;
            while (i11 < size) {
                list.add(i11 == 0 ? new i4.d.Range<>(spanStyleA, 0, this.text.length()) : this.spanStyles.get(i11 - 1));
                i11++;
            }
        }
        CharSequence charSequenceA = c.a(this.text, this.textPaint.getTextSize(), this.style, list, this.placeholders, this.density, aVar, this.emojiCompatProcessed);
        this.charSequence = charSequenceA;
        this.layoutIntrinsics = new j4.s(charSequenceA, this.textPaint, this.textDirectionHeuristic);
    }

    @Override // i4.r
    public boolean a() {
        w wVar = this.resolvedTypefaces;
        if (wVar != null ? wVar.b() : false) {
            return true;
        }
        return !this.emojiCompatProcessed && e.c(this.style) && q.f104762a.a().getValue().booleanValue();
    }

    @Override // i4.r
    public float d() {
        return this.layoutIntrinsics.c();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    @Override // i4.r
    public float f() {
        return this.layoutIntrinsics.b();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final n4.q.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final j4.s getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getTextDirectionHeuristic() {
        return this.textDirectionHeuristic;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final i getTextPaint() {
        return this.textPaint;
    }
}
