package p013kotlin.text;

import bo0.j;
import bo0.n;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "Lkotlin/text/f;", "", "j", "(Ljava/lang/Iterable;)I", "Ljava/util/regex/Matcher;", "from", "", "input", "Lkotlin/text/m;", "f", "(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lkotlin/text/m;", "g", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)Lkotlin/text/m;", "Ljava/util/regex/MatchResult;", "Lbo0/j;", "h", "(Ljava/util/regex/MatchResult;)Lbo0/j;", "groupIndex", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/regex/MatchResult;I)Lbo0/j;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {
    /* JADX INFO: Access modifiers changed from: private */
    public static final m f(Matcher matcher, int i11, CharSequence charSequence) {
        if (matcher.find(i11)) {
            return new n(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m g(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new n(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j h(MatchResult matchResult) {
        return n.w(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j i(MatchResult matchResult, int i11) {
        return n.w(matchResult.start(i11), matchResult.end(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(Iterable<? extends f> iterable) {
        Iterator<? extends f> it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= it.next().getValue();
        }
        return value;
    }
}
