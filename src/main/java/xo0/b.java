package xo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "token", "", "c", "(B)Ljava/lang/String;", "", "a", "(C)B", "", "b", "(I)C", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final byte a(char c11) {
        if (c11 < '~') {
            return m.CHAR_TO_TOKEN[c11];
        }
        return (byte) 0;
    }

    public static final char b(int i11) {
        if (i11 < 117) {
            return m.ESCAPE_2_CHAR[i11];
        }
        return (char) 0;
    }

    public static final String c(byte b11) {
        if (b11 == 1) {
            return "quotation mark '\"'";
        }
        if (b11 == 2) {
            return "string escape sequence '\\'";
        }
        if (b11 == 4) {
            return "comma ','";
        }
        if (b11 == 5) {
            return "colon ':'";
        }
        if (b11 == 6) {
            return "start of the object '{'";
        }
        if (b11 == 7) {
            return "end of the object '}'";
        }
        if (b11 == 8) {
            return "start of the array '['";
        }
        if (b11 == 9) {
            return "end of the array ']'";
        }
        if (b11 == 10) {
            return "end of the input";
        }
        return b11 == 127 ? "invalid token" : "valid token";
    }
}
