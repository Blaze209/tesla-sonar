package xo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.Address;
import ezvcard.property.Gender;
import java.util.ArrayList;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: xo0.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u000b\n\u0002\u0010\u0001\n\u0002\b&\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010\u0003J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H&¢\u0006\u0004\b$\u0010\u0014J\u000f\u0010%\u001a\u00020\u000fH&¢\u0006\u0004\b%\u0010\u0011J\u000f\u0010'\u001a\u00020&H&¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u000f¢\u0006\u0004\b)\u0010\u0011J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020*H\u0004¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u001f¢\u0006\u0004\b-\u0010\u0003J\u0015\u0010/\u001a\u00020&2\u0006\u0010.\u001a\u00020&¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020*H&¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020*H\u0004¢\u0006\u0004\b3\u00102J!\u00107\u001a\u0002062\u0006\u00104\u001a\u00020&2\b\b\u0002\u00105\u001a\u00020\u000fH\u0000¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020&H\u0016¢\u0006\u0004\b9\u0010(J\u0017\u0010;\u001a\u00020\u000f2\b\b\u0002\u0010:\u001a\u00020\u000f¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0004H&¢\u0006\u0004\b=\u0010>J!\u0010A\u001a\u0004\u0018\u00010\n2\u0006\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u000fH&¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u0004\u0018\u00010\n2\u0006\u0010@\u001a\u00020\u000f¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u001f¢\u0006\u0004\bE\u0010\u0003J\u001f\u0010G\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010\fJ\u000f\u0010H\u001a\u00020\nH&¢\u0006\u0004\bH\u0010\u000eJ\r\u0010I\u001a\u00020\n¢\u0006\u0004\bI\u0010\u000eJ'\u0010J\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0005¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\n¢\u0006\u0004\bL\u0010\u000eJ\r\u0010M\u001a\u00020\n¢\u0006\u0004\bM\u0010\u000eJ\u001f\u0010P\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u0004H\u0014¢\u0006\u0004\bP\u0010QJ\u0015\u0010S\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020\u000f¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010\u000eJ\u0015\u0010W\u001a\u00020\u001f2\u0006\u0010V\u001a\u00020\n¢\u0006\u0004\bW\u0010XJ)\u0010[\u001a\u0002062\u0006\u0010Y\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010Z\u001a\u00020\n¢\u0006\u0004\b[\u0010\\J\r\u0010^\u001a\u00020]¢\u0006\u0004\b^\u0010_J\r\u0010`\u001a\u00020\u000f¢\u0006\u0004\b`\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010SR\u0014\u0010c\u001a\u00020a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010dR&\u0010m\u001a\u00060fj\u0002`g8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bP\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010\u0016\u001a\u00020\u00158$X¤\u0004¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006p"}, d2 = {"Lxo0/a;", "", "<init>", "()V", "", "lastPosition", "current", "b", "(II)I", "currentPosition", "", "s", "(II)Ljava/lang/String;", "L", "()Ljava/lang/String;", "", "Q", "()Z", "startPosition", "a", "(I)I", "", "source", "startPos", "c", "(Ljava/lang/CharSequence;I)I", "B", "start", "f", "(I)Z", "literalSuffix", "Ljn0/h0;", "h", "(Ljava/lang/String;I)V", "u", "position", "H", "e", "", "j", "()B", Gender.MALE, "", "D", "(C)Z", "v", "expected", "k", "(B)B", "l", "(C)V", "P", "expectedToken", "wasConsumed", "", "y", "(BZ)Ljava/lang/Void;", Gender.FEMALE, "doConsume", Gender.NONE, "(Z)Z", "J", "()I", "keyToMatch", "isLenient", "E", "(Ljava/lang/String;Z)Ljava/lang/String;", "G", "(Z)Ljava/lang/String;", "t", "endPos", "K", IntegerTokenConverter.CONVERTER_KEY, "o", "p", "(Ljava/lang/CharSequence;II)Ljava/lang/String;", "r", "q", "fromIndex", "toIndex", DateTokenConverter.CONVERTER_KEY, "(II)V", "allowLenientStrings", "I", "(Z)V", "toString", Action.KEY_ATTRIBUTE, "A", "(Ljava/lang/String;)V", "message", "hint", "w", "(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/Void;", "", "m", "()J", "g", "Lxo0/c0;", "Lxo0/c0;", "path", "Ljava/lang/String;", "peekedString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "getEscapedString", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V", "escapedString", "C", "()Ljava/lang/CharSequence;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class JsonReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public int currentPosition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String peekedString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final c0 path = new c0();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private StringBuilder escapedString = new StringBuilder();

    private final int B(CharSequence source, int currentPosition) {
        char cCharAt = source.charAt(currentPosition);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        x(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final String L() {
        String str = this.peekedString;
        p013kotlin.jvm.internal.s.h(str);
        this.peekedString = null;
        return str;
    }

    public static /* synthetic */ boolean O(JsonReader jsonReader, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return jsonReader.N(z11);
    }

    private final boolean Q() {
        return C().charAt(this.currentPosition - 1) != '\"';
    }

    private final int a(int startPosition) {
        int iH = H(startPosition);
        if (iH == -1) {
            x(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = iH + 1;
        char cCharAt = C().charAt(iH);
        if (cCharAt == 'u') {
            return c(C(), i11);
        }
        char cB = b.b(cCharAt);
        if (cB != 0) {
            this.escapedString.append(cB);
            return i11;
        }
        x(this, "Invalid escaped char '" + cCharAt + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int b(int lastPosition, int current) {
        d(lastPosition, current);
        return a(current + 1);
    }

    private final int c(CharSequence source, int startPos) {
        int i11 = startPos + 4;
        if (i11 < source.length()) {
            this.escapedString.append((char) ((B(source, startPos) << 12) + (B(source, startPos + 1) << 8) + (B(source, startPos + 2) << 4) + B(source, startPos + 3)));
            return i11;
        }
        this.currentPosition = startPos;
        u();
        if (this.currentPosition + 4 < source.length()) {
            return c(source, this.currentPosition);
        }
        x(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean f(int start) {
        int iH = H(start);
        if (iH >= C().length() || iH == -1) {
            x(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = iH + 1;
        int iCharAt = C().charAt(iH) | ' ';
        if (iCharAt == 102) {
            h("alse", i11);
            return false;
        }
        if (iCharAt == 116) {
            h("rue", i11);
            return true;
        }
        x(this, "Expected valid boolean literal prefix, but had '" + q() + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final void h(String literalSuffix, int current) {
        if (C().length() - current < literalSuffix.length()) {
            x(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = literalSuffix.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (literalSuffix.charAt(i11) != (C().charAt(current + i11) | ' ')) {
                x(this, "Expected valid boolean literal prefix, but had '" + q() + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.currentPosition = current + literalSuffix.length();
    }

    private static final double n(long j11, boolean z11) {
        if (!z11) {
            return Math.pow(10.0d, -j11);
        }
        if (z11) {
            return Math.pow(10.0d, j11);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String s(int lastPosition, int currentPosition) {
        d(lastPosition, currentPosition);
        String string = this.escapedString.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        this.escapedString.setLength(0);
        return string;
    }

    public static /* synthetic */ Void x(JsonReader jsonReader, String str, int i11, String str2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i12 & 2) != 0) {
            i11 = jsonReader.currentPosition;
        }
        if ((i12 & 4) != 0) {
            str2 = "";
        }
        return jsonReader.w(str, i11, str2);
    }

    public static /* synthetic */ Void z(JsonReader jsonReader, byte b11, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return jsonReader.y(b11, z11);
    }

    public final void A(String key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        w("Encountered an unknown key '" + key + CoreConstants.SINGLE_QUOTE_CHAR, p013kotlin.text.t.C0(K(0, this.currentPosition), key, 0, false, 6, null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }

    protected abstract CharSequence C();

    protected final boolean D(char c11) {
        return (c11 == ',' || c11 == ':' || c11 == ']' || c11 == '}') ? false : true;
    }

    public abstract String E(String keyToMatch, boolean isLenient);

    public byte F() {
        CharSequence charSequenceC = C();
        int i11 = this.currentPosition;
        while (true) {
            int iH = H(i11);
            if (iH == -1) {
                this.currentPosition = iH;
                return (byte) 10;
            }
            char cCharAt = charSequenceC.charAt(iH);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.currentPosition = iH;
                return b.a(cCharAt);
            }
            i11 = iH + 1;
        }
    }

    public final String G(boolean isLenient) {
        String strO;
        byte bF = F();
        if (isLenient) {
            if (bF != 1 && bF != 0) {
                return null;
            }
            strO = q();
        } else {
            if (bF != 1) {
                return null;
            }
            strO = o();
        }
        this.peekedString = strO;
        return strO;
    }

    public abstract int H(int position);

    public final void I(boolean allowLenientStrings) {
        ArrayList arrayList = new ArrayList();
        byte bF = F();
        if (bF != 8 && bF != 6) {
            q();
            return;
        }
        while (true) {
            byte bF2 = F();
            if (bF2 != 1) {
                if (bF2 == 8 || bF2 == 6) {
                    arrayList.add(Byte.valueOf(bF2));
                } else if (bF2 == 9) {
                    if (((Number) p013kotlin.collections.v.A0(arrayList)).byteValue() != 8) {
                        throw z.f(this.currentPosition, "found ] instead of } at path: " + this.path, C());
                    }
                    p013kotlin.collections.v.O(arrayList);
                } else if (bF2 == 7) {
                    if (((Number) p013kotlin.collections.v.A0(arrayList)).byteValue() != 6) {
                        throw z.f(this.currentPosition, "found } instead of ] at path: " + this.path, C());
                    }
                    p013kotlin.collections.v.O(arrayList);
                } else if (bF2 == 10) {
                    x(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                j();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (allowLenientStrings) {
                q();
            } else {
                i();
            }
        }
    }

    public abstract int J();

    public String K(int startPos, int endPos) {
        return C().subSequence(startPos, endPos).toString();
    }

    public final boolean M() {
        int iJ = J();
        CharSequence charSequenceC = C();
        if (iJ >= charSequenceC.length() || iJ == -1 || charSequenceC.charAt(iJ) != ',') {
            return false;
        }
        this.currentPosition++;
        return true;
    }

    public final boolean N(boolean doConsume) {
        int iH = H(J());
        int length = C().length() - iH;
        if (length < 4 || iH == -1) {
            return false;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            if (Address.ADDRESS_NULL_PLACEHOLDER.charAt(i11) != C().charAt(iH + i11)) {
                return false;
            }
        }
        if (length > 4 && b.a(C().charAt(iH + 4)) == 0) {
            return false;
        }
        if (!doConsume) {
            return true;
        }
        this.currentPosition = iH + 4;
        return true;
    }

    protected final void P(char expected) {
        int i11 = this.currentPosition;
        if (i11 > 0 && expected == '\"') {
            try {
                this.currentPosition = i11 - 1;
                String strQ = q();
                this.currentPosition = i11;
                if (p013kotlin.jvm.internal.s.f(strQ, Address.ADDRESS_NULL_PLACEHOLDER)) {
                    w("Expected string literal but 'null' literal was found", this.currentPosition - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th2) {
                this.currentPosition = i11;
                throw th2;
            }
        }
        z(this, b.a(expected), false, 2, null);
        throw new KotlinNothingValueException();
    }

    protected void d(int fromIndex, int toIndex) {
        this.escapedString.append(C(), fromIndex, toIndex);
    }

    public abstract boolean e();

    public final boolean g() {
        boolean z11;
        int iJ = J();
        if (iJ == C().length()) {
            x(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (C().charAt(iJ) == '\"') {
            iJ++;
            z11 = true;
        } else {
            z11 = false;
        }
        boolean zF = f(iJ);
        if (!z11) {
            return zF;
        }
        if (this.currentPosition == C().length()) {
            x(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (C().charAt(this.currentPosition) == '\"') {
            this.currentPosition++;
            return zF;
        }
        x(this, "Expected closing quotation mark", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public abstract String i();

    public abstract byte j();

    public final byte k(byte expected) {
        byte bJ = j();
        if (bJ == expected) {
            return bJ;
        }
        z(this, expected, false, 2, null);
        throw new KotlinNothingValueException();
    }

    public abstract void l(char expected);

    public final long m() {
        boolean z11;
        boolean z12;
        int iH = H(J());
        if (iH >= C().length() || iH == -1) {
            x(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (C().charAt(iH) == '\"') {
            iH++;
            if (iH == C().length()) {
                x(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = iH;
        boolean z13 = false;
        boolean z14 = false;
        long j11 = 0;
        long j12 = 0;
        loop0: while (true) {
            z12 = false;
            while (true) {
                if (i11 == C().length()) {
                    break loop0;
                }
                char cCharAt = C().charAt(i11);
                if ((cCharAt == 'e' || cCharAt == 'E') && !z13) {
                    if (i11 == iH) {
                        x(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    i11++;
                    z13 = true;
                } else if (cCharAt != '-' || !z13) {
                    if (cCharAt != '+' || !z13) {
                        if (cCharAt != '-') {
                            if (b.a(cCharAt) != 0) {
                                break loop0;
                            }
                            i11++;
                            int i12 = cCharAt - '0';
                            if (i12 < 0 || i12 >= 10) {
                                x(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                            if (z13) {
                                j12 = (j12 * ((long) 10)) + ((long) i12);
                            } else {
                                j11 = (j11 * ((long) 10)) - ((long) i12);
                                if (j11 > 0) {
                                    x(this, "Numeric value overflow", 0, null, 6, null);
                                    throw new KotlinNothingValueException();
                                }
                            }
                        } else {
                            if (i11 != iH) {
                                x(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                            i11++;
                            z14 = true;
                        }
                    } else {
                        if (i11 == iH) {
                            x(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        i11++;
                    }
                }
                z12 = true;
            }
            if (i11 == iH) {
                x(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i11++;
        }
        boolean z15 = i11 != iH;
        if (iH == i11 || (z14 && iH == i11 - 1)) {
            x(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z11) {
            if (!z15) {
                x(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (C().charAt(i11) != '\"') {
                x(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i11++;
        }
        this.currentPosition = i11;
        if (z13) {
            double dN = j11 * n(j12, z12);
            if (dN > 9.223372036854776E18d || dN < -9.223372036854776E18d) {
                x(this, "Numeric value overflow", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (Math.floor(dN) != dN) {
                x(this, "Can't convert " + dN + " to Long", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            j11 = (long) dN;
        }
        if (z14) {
            return j11;
        }
        if (j11 != Long.MIN_VALUE) {
            return -j11;
        }
        x(this, "Numeric value overflow", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final String o() {
        return this.peekedString != null ? L() : i();
    }

    protected final String p(CharSequence source, int startPosition, int current) {
        p013kotlin.jvm.internal.s.k(source, "source");
        char cCharAt = source.charAt(current);
        boolean z11 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                int iH = H(b(startPosition, current));
                if (iH == -1) {
                    x(this, "Unexpected EOF", iH, null, 4, null);
                    throw new KotlinNothingValueException();
                }
                z11 = true;
                startPosition = iH;
                current = startPosition;
            } else {
                current++;
                if (current >= source.length()) {
                    d(startPosition, current);
                    int iH2 = H(current);
                    if (iH2 == -1) {
                        x(this, "Unexpected EOF", iH2, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    startPosition = iH2;
                    current = startPosition;
                    z11 = true;
                } else {
                    continue;
                }
            }
            cCharAt = source.charAt(current);
        }
        String strK = !z11 ? K(startPosition, current) : s(startPosition, current);
        this.currentPosition = current + 1;
        return strK;
    }

    public final String q() {
        if (this.peekedString != null) {
            return L();
        }
        int iJ = J();
        if (iJ >= C().length() || iJ == -1) {
            x(this, "EOF", iJ, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte bA = b.a(C().charAt(iJ));
        if (bA == 1) {
            return o();
        }
        if (bA != 0) {
            x(this, "Expected beginning of the string, but got " + C().charAt(iJ), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z11 = false;
        while (b.a(C().charAt(iJ)) == 0) {
            iJ++;
            if (iJ >= C().length()) {
                d(this.currentPosition, iJ);
                int iH = H(iJ);
                if (iH == -1) {
                    this.currentPosition = iJ;
                    return s(0, 0);
                }
                iJ = iH;
                z11 = true;
            }
        }
        String strK = !z11 ? K(this.currentPosition, iJ) : s(this.currentPosition, iJ);
        this.currentPosition = iJ;
        return strK;
    }

    public final String r() {
        String strQ = q();
        if (!p013kotlin.jvm.internal.s.f(strQ, Address.ADDRESS_NULL_PLACEHOLDER) || !Q()) {
            return strQ;
        }
        x(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void t() {
        this.peekedString = null;
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) C()) + "', currentPosition=" + this.currentPosition + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final void v() {
        if (j() == 10) {
            return;
        }
        x(this, "Expected EOF after parsing, but had " + C().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final Void w(String message, int position, String hint) {
        String str;
        p013kotlin.jvm.internal.s.k(message, "message");
        p013kotlin.jvm.internal.s.k(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw z.f(position, message + " at path: " + this.path.a() + str, C());
    }

    public final Void y(byte expectedToken, boolean wasConsumed) {
        String strC = b.c(expectedToken);
        int i11 = wasConsumed ? this.currentPosition - 1 : this.currentPosition;
        x(this, "Expected " + strC + ", but had '" + ((this.currentPosition == C().length() || i11 < 0) ? "EOF" : String.valueOf(C().charAt(i11))) + "' instead", i11, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public void u() {
    }
}
