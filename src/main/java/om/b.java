package om;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Arrays;
import java.util.regex.Pattern;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lom/b;", "", "", "from", "to", "<init>", "(II)V", "", "f", "()Ljava/lang/String;", "compare", "", "c", "(Lom/b;)Z", "toString", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "b", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Lazy<Pattern> f98019d = m.b(new wn0.a() { // from class: om.a
        @Override // wn0.a
        public final Object invoke() {
            return b.e();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int from;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int to;

    /* JADX INFO: renamed from: om.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lom/b$a;", "", "<init>", "()V", "", "n", "", "f", "(I)Ljava/lang/String;", "from", "Lom/b;", "b", "(I)Lom/b;", "to", "e", "header", "c", "(Ljava/lang/String;)Lom/b;", "Ljava/util/regex/Pattern;", "headerParsingRegEx$delegate", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/regex/Pattern;", "headerParsingRegEx", "TO_END_OF_CONTENT", "I", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pattern d() {
            Object value = b.f98019d.getValue();
            s.j(value, "getValue(...)");
            return (Pattern) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(int n11) {
            return n11 == Integer.MAX_VALUE ? "" : String.valueOf(n11);
        }

        public final b b(int from) {
            k.b(Boolean.valueOf(from >= 0));
            return new b(from, Integer.MAX_VALUE);
        }

        public final b c(String header) {
            if (header == null) {
                return null;
            }
            try {
                String[] strArrSplit = d().split(header);
                k.b(Boolean.valueOf(strArrSplit.length == 4));
                k.b(Boolean.valueOf(s.f(strArrSplit[0], "bytes")));
                String str = strArrSplit[1];
                s.j(str, "get(...)");
                int i11 = Integer.parseInt(str);
                String str2 = strArrSplit[2];
                s.j(str2, "get(...)");
                int i12 = Integer.parseInt(str2);
                String str3 = strArrSplit[3];
                s.j(str3, "get(...)");
                int i13 = Integer.parseInt(str3);
                k.b(Boolean.valueOf(i12 > i11));
                k.b(Boolean.valueOf(i13 > i12));
                return i12 < i13 - 1 ? new b(i11, i12) : new b(i11, Integer.MAX_VALUE);
            } catch (IllegalArgumentException e11) {
                t0 t0Var = t0.f86535a;
                String str4 = String.format(null, "Invalid Content-Range header value: \"%s\"", Arrays.copyOf(new Object[]{header}, 1));
                s.j(str4, "format(...)");
                throw new IllegalArgumentException(str4, e11);
            }
        }

        public final b e(int to2) {
            k.b(Boolean.valueOf(to2 > 0));
            return new b(0, to2);
        }

        private Companion() {
        }
    }

    public b(int i11, int i12) {
        this.from = i11;
        this.to = i12;
    }

    public static final b d(int i11) {
        return INSTANCE.b(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pattern e() {
        return Pattern.compile("[-/ ]");
    }

    public static final b g(int i11) {
        return INSTANCE.e(i11);
    }

    public final boolean c(b compare) {
        return compare != null && this.from <= compare.from && compare.to <= this.to;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!s.f(b.class, other != null ? other.getClass() : null)) {
            return false;
        }
        s.i(other, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        b bVar = (b) other;
        return this.from == bVar.from && this.to == bVar.to;
    }

    public final String f() {
        t0 t0Var = t0.f86535a;
        Companion companion = INSTANCE;
        String str = String.format(null, "bytes=%s-%s", Arrays.copyOf(new Object[]{companion.f(this.from), companion.f(this.to)}, 2));
        s.j(str, "format(...)");
        return str;
    }

    public int hashCode() {
        return (this.from * 31) + this.to;
    }

    public String toString() {
        t0 t0Var = t0.f86535a;
        Companion companion = INSTANCE;
        String str = String.format(null, "%s-%s", Arrays.copyOf(new Object[]{companion.f(this.from), companion.f(this.to)}, 2));
        s.j(str, "format(...)");
        return str;
    }
}
