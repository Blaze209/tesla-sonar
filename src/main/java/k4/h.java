package k4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import j4.n;
import java.text.BreakIterator;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0018B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001bJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001bJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u0013J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010&¨\u0006("}, d2 = {"Lk4/h;", "", "", "charSequence", "", "start", "end", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "offset", "", "getPrevWordBeginningOnTwoWordsBoundary", "b", "(IZ)I", "getNextWordEndOnTwoWordBoundary", "c", "m", "(I)Z", "l", "h", "j", "Ljn0/h0;", "a", "(I)V", "n", "(I)I", "o", "e", DateTokenConverter.CONVERTER_KEY, "f", "g", IntegerTokenConverter.CONVERTER_KEY, "k", "Ljava/lang/CharSequence;", "I", "Ljava/text/BreakIterator;", "Ljava/text/BreakIterator;", "iterator", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f84912f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharSequence charSequence;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int start;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final BreakIterator iterator;

    /* JADX INFO: renamed from: k4.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lk4/h$a;", "", "<init>", "()V", "", "cp", "", "a", "(I)Z", "WINDOW_WIDTH", "I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int cp2) {
            int type = Character.getType(cp2);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        private Companion() {
        }
    }

    public h(CharSequence charSequence, int i11, int i12, Locale locale) {
        this.charSequence = charSequence;
        if (i11 < 0 || i11 > charSequence.length()) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i12 < 0 || i12 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.iterator = wordInstance;
        this.start = Math.max(0, i11 - 50);
        this.end = Math.min(charSequence.length(), i12 + 50);
        wordInstance.setText(new n(charSequence, i11, i12));
    }

    private final void a(int offset) {
        int i11 = this.start;
        if (offset > this.end || i11 > offset) {
            throw new IllegalArgumentException(("Invalid offset: " + offset + ". Valid range is [" + this.start + " , " + this.end + ']').toString());
        }
    }

    private final int b(int offset, boolean getPrevWordBeginningOnTwoWordsBoundary) {
        a(offset);
        if (j(offset)) {
            return (!this.iterator.isBoundary(offset) || (h(offset) && getPrevWordBeginningOnTwoWordsBoundary)) ? this.iterator.preceding(offset) : offset;
        }
        if (h(offset)) {
            return this.iterator.preceding(offset);
        }
        return -1;
    }

    private final int c(int offset, boolean getNextWordEndOnTwoWordBoundary) {
        a(offset);
        if (h(offset)) {
            return (!this.iterator.isBoundary(offset) || (j(offset) && getNextWordEndOnTwoWordBoundary)) ? this.iterator.following(offset) : offset;
        }
        if (j(offset)) {
            return this.iterator.following(offset);
        }
        return -1;
    }

    private final boolean h(int offset) {
        return offset <= this.end && this.start + 1 <= offset && Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, offset));
    }

    private final boolean j(int offset) {
        return offset < this.end && this.start <= offset && Character.isLetterOrDigit(Character.codePointAt(this.charSequence, offset));
    }

    private final boolean l(int offset) {
        return !k(offset) && i(offset);
    }

    private final boolean m(int offset) {
        return k(offset) && !i(offset);
    }

    public final int d(int offset) {
        return c(offset, true);
    }

    public final int e(int offset) {
        return b(offset, true);
    }

    public final int f(int offset) {
        a(offset);
        while (offset != -1 && !m(offset)) {
            offset = o(offset);
        }
        return offset;
    }

    public final int g(int offset) {
        a(offset);
        while (offset != -1 && !l(offset)) {
            offset = n(offset);
        }
        return offset;
    }

    public final boolean i(int offset) {
        int i11 = this.start + 1;
        if (offset > this.end || i11 > offset) {
            return false;
        }
        return INSTANCE.a(Character.codePointBefore(this.charSequence, offset));
    }

    public final boolean k(int offset) {
        int i11 = this.start;
        if (offset >= this.end || i11 > offset) {
            return false;
        }
        return INSTANCE.a(Character.codePointAt(this.charSequence, offset));
    }

    public final int n(int offset) {
        a(offset);
        return this.iterator.following(offset);
    }

    public final int o(int offset) {
        a(offset);
        return this.iterator.preceding(offset);
    }
}
