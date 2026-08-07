package q4;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import i4.Placeholder;
import i4.PlatformParagraphStyle;
import i4.PlatformTextStyle;
import i4.SpanStyle;
import i4.TextStyle;
import java.util.List;
import p013kotlin.Metadata;
import p014n4.FontWeight;
import p014n4.b0;
import p014n4.c0;
import t4.LineHeightStyle;
import t4.TextIndent;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000[\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u001c\u001a\u0087\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\r\u001a\u00020\f2&\u0010\u0014\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0015*\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, d2 = {"", "text", "", "contextFontSize", "Li4/r0;", "contextTextStyle", "", "Li4/d$c;", "Li4/d0;", "spanStyles", "Li4/w;", "placeholders", "Lw4/d;", "density", "Lkotlin/Function4;", "Ln4/q;", "Ln4/f0;", "Ln4/b0;", "Ln4/c0;", "Landroid/graphics/Typeface;", "resolveTypeface", "", "useEmojiCompat", "", "a", "(Ljava/lang/String;FLi4/r0;Ljava/util/List;Ljava/util/List;Lw4/d;Lwn0/r;Z)Ljava/lang/CharSequence;", "b", "(Li4/r0;)Z", "q4/c$a", "Lq4/c$a;", "NoopSpan", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f104731a = new a();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.emoji2.text.e] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final CharSequence a(String str, float f11, TextStyle textStyle, List<i4.d.Range<SpanStyle>> list, List<i4.d.Range<Placeholder>> list2, w4.d dVar, wn0.r<? super p014n4.q, ? super FontWeight, ? super b0, ? super c0, ? extends Typeface> rVar, boolean z11) {
        String str2;
        CharSequence charSequenceP;
        float f12;
        w4.d dVar2;
        PlatformParagraphStyle paragraphSyle;
        if (z11 && androidx.emoji2.text.e.i()) {
            PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
            i4.g gVarD = (platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) ? null : i4.g.d(paragraphSyle.getEmojiSupportMatch());
            str2 = str;
            charSequenceP = androidx.emoji2.text.e.c().p(str2, 0, str.length(), Integer.MAX_VALUE, gVarD == null ? 0 : i4.g.g(gVarD.getValue(), i4.g.INSTANCE.a()));
            p013kotlin.jvm.internal.s.h(charSequenceP);
        } else {
            str2 = str;
            charSequenceP = str2;
        }
        if (list.isEmpty() && list2.isEmpty() && p013kotlin.jvm.internal.s.f(textStyle.F(), TextIndent.INSTANCE.a()) && w4.w.i(textStyle.u())) {
            return charSequenceP;
        }
        Spannable spannableString = charSequenceP instanceof Spannable ? (Spannable) charSequenceP : new SpannableString(charSequenceP);
        if (p013kotlin.jvm.internal.s.f(textStyle.C(), t4.k.INSTANCE.d())) {
            r4.c.u(spannableString, f104731a, 0, str2.length());
        }
        if (b(textStyle) && textStyle.v() == null) {
            r4.c.r(spannableString, textStyle.u(), f11, dVar);
            f12 = f11;
            dVar2 = dVar;
        } else {
            LineHeightStyle lineHeightStyleV = textStyle.v();
            if (lineHeightStyleV == null) {
                lineHeightStyleV = LineHeightStyle.INSTANCE.a();
            }
            f12 = f11;
            dVar2 = dVar;
            r4.c.q(spannableString, textStyle.u(), f12, dVar2, lineHeightStyleV);
        }
        r4.c.y(spannableString, textStyle.F(), f12, dVar2);
        r4.c.w(spannableString, textStyle, list, dVar2, rVar);
        r4.b.d(spannableString, list2, dVar2);
        return spannableString;
    }

    public static final boolean b(TextStyle textStyle) {
        PlatformParagraphStyle paragraphSyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) {
            return false;
        }
        return paragraphSyle.getIncludeFontPadding();
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"q4/c$a", "Landroid/text/style/CharacterStyle;", "Landroid/text/TextPaint;", "p0", "Ljn0/h0;", "updateDrawState", "(Landroid/text/TextPaint;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends CharacterStyle {
        a() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint p11) {
        }
    }
}
