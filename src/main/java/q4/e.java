package q4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import i4.Placeholder;
import i4.PlatformParagraphStyle;
import i4.PlatformTextStyle;
import i4.SpanStyle;
import i4.TextStyle;
import java.util.List;
import java.util.Locale;
import p013kotlin.Metadata;
import p4.LocaleList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aW\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Lt4/l;", "textDirection", "Lp4/e;", "localeList", "", DateTokenConverter.CONVERTER_KEY, "(ILp4/e;)I", "", "text", "Li4/r0;", "style", "", "Li4/d$c;", "Li4/d0;", "spanStyles", "Li4/w;", "placeholders", "Lw4/d;", "density", "Ln4/q$b;", "fontFamilyResolver", "Li4/r;", "a", "(Ljava/lang/String;Li4/r0;Ljava/util/List;Ljava/util/List;Lw4/d;Ln4/q$b;)Li4/r;", "", "c", "(Li4/r0;)Z", "hasEmojiCompat", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    public static final i4.r a(String str, TextStyle textStyle, List<i4.d.Range<SpanStyle>> list, List<i4.d.Range<Placeholder>> list2, w4.d dVar, n4.q.b bVar) {
        return new d(str, textStyle, list, list2, bVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(TextStyle textStyle) {
        PlatformParagraphStyle paragraphSyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        i4.g gVarD = (platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) ? null : i4.g.d(paragraphSyle.getEmojiSupportMatch());
        return !(gVarD == null ? false : i4.g.g(gVarD.getValue(), i4.g.INSTANCE.c()));
    }

    public static final int d(int i11, LocaleList localeList) {
        Locale platformLocale;
        t4.l.Companion companion = t4.l.INSTANCE;
        if (t4.l.j(i11, companion.b())) {
            return 2;
        }
        if (t4.l.j(i11, companion.c())) {
            return 3;
        }
        if (t4.l.j(i11, companion.d())) {
            return 0;
        }
        if (t4.l.j(i11, companion.e())) {
            return 1;
        }
        if (!(t4.l.j(i11, companion.a()) ? true : t4.l.j(i11, companion.f()))) {
            throw new IllegalStateException("Invalid TextDirection.");
        }
        if (localeList == null || (platformLocale = localeList.e(0).getPlatformLocale()) == null) {
            platformLocale = Locale.getDefault();
        }
        int iA = s5.i.a(platformLocale);
        return (iA == 0 || iA != 1) ? 2 : 3;
    }
}
