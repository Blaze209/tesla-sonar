package p013kotlin.text;

import bo0.n;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ho0.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import wn0.a;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 \u00152\u00060\u0001j\u0002`\u0002:\u0001.B\u0011\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0005\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100#¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b'\u0010\"J%\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070)2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010(\u001a\u00020\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lkotlin/text/q;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "", "pattern", "(Ljava/lang/String;)V", "Lkotlin/text/s;", "option", "(Ljava/lang/String;Lkotlin/text/s;)V", "", "options", "(Ljava/lang/String;Ljava/util/Set;)V", "", "input", "", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/CharSequence;)Z", "b", "", "startIndex", "Lkotlin/text/m;", "c", "(Ljava/lang/CharSequence;I)Lkotlin/text/m;", "Lho0/i;", "e", "(Ljava/lang/CharSequence;I)Lho0/i;", "h", "(Ljava/lang/CharSequence;)Lkotlin/text/m;", "replacement", "j", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "transform", "k", "(Ljava/lang/CharSequence;Lwn0/l;)Ljava/lang/String;", "l", "limit", "", "m", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "a", "Ljava/util/regex/Pattern;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Pattern nativePattern;

    /* JADX INFO: renamed from: kotlin.text.q$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/text/q$a;", "", "<init>", "()V", "", "flags", "b", "(I)I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int flags) {
            return (flags & 2) != 0 ? flags | 64 : flags;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends p implements l<m, m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f89196a = new b();

        b() {
            super(1, m.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m invoke(m p11) {
            s.k(p11, "p0");
            return p11.next();
        }
    }

    public q(Pattern nativePattern) {
        s.k(nativePattern, "nativePattern");
        this.nativePattern = nativePattern;
    }

    public static /* synthetic */ m d(q qVar, CharSequence charSequence, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return qVar.c(charSequence, i11);
    }

    public static /* synthetic */ i f(q qVar, CharSequence charSequence, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return qVar.e(charSequence, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m g(q qVar, CharSequence charSequence, int i11) {
        return qVar.c(charSequence, i11);
    }

    public final boolean b(CharSequence input) {
        s.k(input, "input");
        return this.nativePattern.matcher(input).find();
    }

    public final m c(CharSequence input, int startIndex) {
        s.k(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        s.j(matcher, "matcher(...)");
        return r.f(matcher, startIndex, input);
    }

    public final i<m> e(final CharSequence input, final int startIndex) {
        s.k(input, "input");
        if (startIndex >= 0 && startIndex <= input.length()) {
            return ho0.l.s(new a() { // from class: kotlin.text.p
                @Override // wn0.a
                public final Object invoke() {
                    return q.g(this.f89191a, input, startIndex);
                }
            }, b.f89196a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + startIndex + ", input length: " + input.length());
    }

    public final m h(CharSequence input) {
        s.k(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        s.j(matcher, "matcher(...)");
        return r.g(matcher, input);
    }

    public final boolean i(CharSequence input) {
        s.k(input, "input");
        return this.nativePattern.matcher(input).matches();
    }

    public final String j(CharSequence input, String replacement) {
        s.k(input, "input");
        s.k(replacement, "replacement");
        String strReplaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        s.j(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String k(CharSequence input, l<? super m, ? extends CharSequence> transform) {
        s.k(input, "input");
        s.k(transform, "transform");
        int iIntValue = 0;
        m mVarD = d(this, input, 0, 2, null);
        if (mVarD == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, iIntValue, mVarD.d().getStart().intValue());
            sb2.append(transform.invoke(mVarD));
            iIntValue = mVarD.d().e().intValue() + 1;
            mVarD = mVarD.next();
            if (iIntValue >= length) {
                break;
            }
        } while (mVarD != null);
        if (iIntValue < length) {
            sb2.append(input, iIntValue, length);
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    public final String l(CharSequence input, String replacement) {
        s.k(input, "input");
        s.k(replacement, "replacement");
        String strReplaceFirst = this.nativePattern.matcher(input).replaceFirst(replacement);
        s.j(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    public final List<String> m(CharSequence input, int limit) {
        s.k(input, "input");
        i0.a1(limit);
        Matcher matcher = this.nativePattern.matcher(input);
        if (limit == 1 || !matcher.find()) {
            return v.e(input.toString());
        }
        ArrayList arrayList = new ArrayList(limit > 0 ? n.j(limit, 10) : 10);
        int i11 = limit - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public String toString() {
        String string = this.nativePattern.toString();
        s.j(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String pattern) {
        s.k(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        s.j(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String pattern, s option) {
        s.k(pattern, "pattern");
        s.k(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, INSTANCE.b(option.getValue()));
        s.j(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String pattern, Set<? extends s> options) {
        s.k(pattern, "pattern");
        s.k(options, "options");
        Pattern patternCompile = Pattern.compile(pattern, INSTANCE.b(r.j(options)));
        s.j(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
