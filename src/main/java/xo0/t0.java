package xo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lxo0/t0;", "Lxo0/a;", "", "source", "<init>", "(Ljava/lang/String;)V", "", "position", "H", "(I)I", "", "j", "()B", "", "e", "()Z", "J", "()I", "", "expected", "Ljn0/h0;", "l", "(C)V", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "keyToMatch", "isLenient", "E", "(Ljava/lang/String;Z)Ljava/lang/String;", "Ljava/lang/String;", "R", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class t0 extends JsonReader {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String source;

    public t0(String source) {
        p013kotlin.jvm.internal.s.k(source, "source");
        this.source = source;
    }

    @Override // xo0.JsonReader
    public String E(String keyToMatch, boolean isLenient) {
        p013kotlin.jvm.internal.s.k(keyToMatch, "keyToMatch");
        int i11 = this.currentPosition;
        try {
            if (j() == 6 && p013kotlin.jvm.internal.s.f(G(isLenient), keyToMatch)) {
                t();
                if (j() == 5) {
                    return G(isLenient);
                }
            }
            return null;
        } finally {
            this.currentPosition = i11;
            t();
        }
    }

    @Override // xo0.JsonReader
    public int H(int position) {
        if (position < C().length()) {
            return position;
        }
        return -1;
    }

    @Override // xo0.JsonReader
    public int J() {
        char cCharAt;
        int i11 = this.currentPosition;
        if (i11 == -1) {
            return i11;
        }
        String strC = C();
        while (i11 < strC.length() && ((cCharAt = strC.charAt(i11)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i11++;
        }
        this.currentPosition = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xo0.JsonReader
    /* JADX INFO: renamed from: R, reason: from getter and merged with bridge method [inline-methods] */
    public String C() {
        return this.source;
    }

    @Override // xo0.JsonReader
    public boolean e() {
        int i11 = this.currentPosition;
        if (i11 == -1) {
            return false;
        }
        String strC = C();
        while (i11 < strC.length()) {
            char cCharAt = strC.charAt(i11);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i11;
                return D(cCharAt);
            }
            i11++;
        }
        this.currentPosition = i11;
        return false;
    }

    @Override // xo0.JsonReader
    public String i() {
        l(CoreConstants.DOUBLE_QUOTE_CHAR);
        int i11 = this.currentPosition;
        int iU0 = p013kotlin.text.t.u0(C(), CoreConstants.DOUBLE_QUOTE_CHAR, i11, false, 4, null);
        if (iU0 == -1) {
            q();
            y((byte) 1, false);
            throw new KotlinNothingValueException();
        }
        for (int i12 = i11; i12 < iU0; i12++) {
            if (C().charAt(i12) == '\\') {
                return p(C(), this.currentPosition, i12);
            }
        }
        this.currentPosition = iU0 + 1;
        String strSubstring = C().substring(i11, iU0);
        p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // xo0.JsonReader
    public byte j() {
        String strC = C();
        int i11 = this.currentPosition;
        while (i11 != -1 && i11 < strC.length()) {
            int i12 = i11 + 1;
            char cCharAt = strC.charAt(i11);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i12;
                return b.a(cCharAt);
            }
            i11 = i12;
        }
        this.currentPosition = strC.length();
        return (byte) 10;
    }

    @Override // xo0.JsonReader
    public void l(char expected) {
        if (this.currentPosition == -1) {
            P(expected);
        }
        String strC = C();
        int i11 = this.currentPosition;
        while (i11 < strC.length()) {
            int i12 = i11 + 1;
            char cCharAt = strC.charAt(i11);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i12;
                if (cCharAt == expected) {
                    return;
                } else {
                    P(expected);
                }
            }
            i11 = i12;
        }
        this.currentPosition = -1;
        P(expected);
    }
}
