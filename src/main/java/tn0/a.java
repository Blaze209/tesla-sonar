package tn0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.nio.charset.Charset;
import p013kotlin.Metadata;
import p013kotlin.collections.d;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0012\b\u0017\u0018\u0000 \u00192\u00020\u0001:\u0002/1B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J)\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J)\u0010$\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J)\u0010'\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020&2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b)\u0010%J7\u0010*\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b*\u0010\u0013J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000eH\u0000¢\u0006\u0004\b,\u0010-J'\u0010.\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b.\u0010\u001cJ'\u0010/\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b/\u0010(J'\u00100\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b0\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00102\u001a\u0004\b4\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Ltn0/a;", "", "", "isUrlSafe", "isMimeScheme", "Ltn0/a$b;", "paddingOption", "<init>", "(ZZLtn0/a$b;)V", "r", "()Z", "", "source", "destination", "", "destinationOffset", "startIndex", "endIndex", "j", "([B[BIII)I", "padIndex", "byteStart", "q", "([BIII)I", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(I)V", "s", "([BII)I", "destinationSize", "capacityNeeded", "c", "(III)V", "", "l", "([BII)Ljava/lang/String;", "g", "([BII)[B", "", "f", "(Ljava/lang/CharSequence;II)[B", "p", "n", "sourceSize", "o", "(I)I", "k", "b", "e", "a", "Z", "isUrlSafe$kotlin_stdlib", "isMimeScheme$kotlin_stdlib", "Ltn0/a$b;", "getPaddingOption$kotlin_stdlib", "()Ltn0/a$b;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f114850e = {13, 10};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f114851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f114852g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isUrlSafe;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isMimeScheme;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b paddingOption;

    /* JADX INFO: renamed from: tn0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Ltn0/a$a;", "Ltn0/a;", "<init>", "()V", "UrlSafe", "Ltn0/a;", "t", "()Ltn0/a;", "", "bitsPerByte", "I", "bitsPerSymbol", "bytesPerGroup", "symbolsPerGroup", "", "padSymbol", "B", "mimeLineLength", "mimeGroupsPerLine", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion extends a {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a t() {
            return a.f114851f;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private Companion() {
            boolean z11 = false;
            super(z11, z11, b.PRESENT, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Ltn0/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "PRESENT", "ABSENT", "PRESENT_OPTIONAL", "ABSENT_OPTIONAL", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        PRESENT,
        ABSENT,
        PRESENT_OPTIONAL,
        ABSENT_OPTIONAL;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    static {
        b bVar = b.PRESENT;
        f114851f = new a(true, false, bVar);
        f114852g = new a(false, true, bVar);
    }

    public /* synthetic */ a(boolean z11, boolean z12, b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, z12, bVar);
    }

    private final void c(int destinationSize, int destinationOffset, int capacityNeeded) {
        if (destinationOffset < 0 || destinationOffset > destinationSize) {
            throw new IndexOutOfBoundsException("destination offset: " + destinationOffset + ", destination size: " + destinationSize);
        }
        int i11 = destinationOffset + capacityNeeded;
        if (i11 < 0 || i11 > destinationSize) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + destinationOffset + ", destination size: " + destinationSize + ", capacity needed: " + capacityNeeded);
        }
    }

    private final void d(int padIndex) {
        if (this.paddingOption != b.ABSENT) {
            return;
        }
        throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + padIndex);
    }

    public static /* synthetic */ byte[] h(a aVar, CharSequence charSequence, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = charSequence.length();
        }
        return aVar.f(charSequence, i11, i12);
    }

    public static /* synthetic */ byte[] i(a aVar, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return aVar.g(bArr, i11, i12);
    }

    private final int j(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        int i11;
        int i12;
        int i13;
        int[] iArr = this.isUrlSafe ? tn0.b.f114859d : tn0.b.f114857b;
        int i14 = -8;
        int i15 = destinationOffset;
        int iQ = startIndex;
        int i16 = -8;
        int i17 = 0;
        while (true) {
            if (iQ >= endIndex) {
                i11 = 8;
                i12 = 0;
                break;
            }
            if (i16 != i14 || iQ + 3 >= endIndex) {
                i11 = 8;
                i13 = 1;
            } else {
                i11 = 8;
                i13 = 1;
                int i18 = iQ + 4;
                int i19 = (iArr[source[iQ + 1] & 255] << 12) | (iArr[source[iQ] & 255] << 18) | (iArr[source[iQ + 2] & 255] << 6) | iArr[source[iQ + 3] & 255];
                if (i19 >= 0) {
                    destination[i15] = (byte) (i19 >> 16);
                    int i21 = i15 + 2;
                    destination[i15 + 1] = (byte) (i19 >> 8);
                    i15 += 3;
                    destination[i21] = (byte) i19;
                    iQ = i18;
                }
                i14 = -8;
            }
            int i22 = source[iQ] & 255;
            int i23 = iArr[i22];
            if (i23 >= 0) {
                iQ++;
                i17 = (i17 << 6) | i23;
                int i24 = i16 + 6;
                if (i24 >= 0) {
                    destination[i15] = (byte) (i17 >>> i24);
                    i17 &= (i13 << i24) - 1;
                    i16 -= 2;
                    i15++;
                } else {
                    i16 = i24;
                }
            } else {
                if (i23 == -2) {
                    iQ = q(source, iQ, endIndex, i16);
                    i12 = i13;
                    break;
                }
                if (!this.isMimeScheme) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid symbol '");
                    sb2.append((char) i22);
                    sb2.append("'(");
                    String string = Integer.toString(i22, p013kotlin.text.a.a(i11));
                    s.j(string, "toString(...)");
                    sb2.append(string);
                    sb2.append(") at index ");
                    sb2.append(iQ);
                    throw new IllegalArgumentException(sb2.toString());
                }
                iQ++;
            }
            i14 = -8;
        }
        if (i16 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i16 != -8 && i12 == 0 && this.paddingOption == b.PRESENT) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i17 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        int iS = s(source, iQ, endIndex);
        if (iS >= endIndex) {
            return i15 - destinationOffset;
        }
        int i25 = source[iS] & 255;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Symbol '");
        sb3.append((char) i25);
        sb3.append("'(");
        String string2 = Integer.toString(i25, p013kotlin.text.a.a(i11));
        s.j(string2, "toString(...)");
        sb3.append(string2);
        sb3.append(") at index ");
        sb3.append(iS - 1);
        sb3.append(" is prohibited after the pad character");
        throw new IllegalArgumentException(sb3.toString());
    }

    public static /* synthetic */ String m(a aVar, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return aVar.l(bArr, i11, i12);
    }

    private final int q(byte[] source, int padIndex, int endIndex, int byteStart) {
        if (byteStart == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + padIndex);
        }
        if (byteStart == -6) {
            d(padIndex);
            return padIndex + 1;
        }
        if (byteStart != -4) {
            if (byteStart == -2) {
                return padIndex + 1;
            }
            throw new IllegalStateException("Unreachable");
        }
        d(padIndex);
        int iS = s(source, padIndex + 1, endIndex);
        if (iS != endIndex && source[iS] == 61) {
            return iS + 1;
        }
        throw new IllegalArgumentException("Missing one pad character at index " + iS);
    }

    private final boolean r() {
        b bVar = this.paddingOption;
        return bVar == b.PRESENT || bVar == b.PRESENT_OPTIONAL;
    }

    private final int s(byte[] source, int startIndex, int endIndex) {
        if (!this.isMimeScheme) {
            return startIndex;
        }
        while (startIndex < endIndex) {
            if (tn0.b.f114857b[source[startIndex] & 255] != -1) {
                break;
            }
            startIndex++;
        }
        return startIndex;
    }

    public final byte[] b(CharSequence source, int startIndex, int endIndex) {
        s.k(source, "source");
        e(source.length(), startIndex, endIndex);
        byte[] bArr = new byte[endIndex - startIndex];
        int i11 = 0;
        while (startIndex < endIndex) {
            char cCharAt = source.charAt(startIndex);
            if (cCharAt <= 255) {
                bArr[i11] = (byte) cCharAt;
                i11++;
            } else {
                bArr[i11] = 63;
                i11++;
            }
            startIndex++;
        }
        return bArr;
    }

    public final void e(int sourceSize, int startIndex, int endIndex) {
        d.INSTANCE.a(startIndex, endIndex, sourceSize);
    }

    public final byte[] f(CharSequence source, int startIndex, int endIndex) {
        byte[] bArrB;
        s.k(source, "source");
        if (source instanceof String) {
            String str = (String) source;
            e(str.length(), startIndex, endIndex);
            String strSubstring = str.substring(startIndex, endIndex);
            s.j(strSubstring, "substring(...)");
            Charset charset = p013kotlin.text.d.ISO_8859_1;
            s.i(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrB = strSubstring.getBytes(charset);
            s.j(bArrB, "getBytes(...)");
        } else {
            bArrB = b(source, startIndex, endIndex);
        }
        return i(this, bArrB, 0, 0, 6, null);
    }

    public final byte[] g(byte[] source, int startIndex, int endIndex) {
        s.k(source, "source");
        e(source.length, startIndex, endIndex);
        int iK = k(source, startIndex, endIndex);
        byte[] bArr = new byte[iK];
        if (j(source, bArr, 0, startIndex, endIndex) == iK) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int k(byte[] source, int startIndex, int endIndex) {
        s.k(source, "source");
        int i11 = endIndex - startIndex;
        if (i11 == 0) {
            return 0;
        }
        if (i11 == 1) {
            throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + startIndex + ", endIndex: " + endIndex);
        }
        if (this.isMimeScheme) {
            while (startIndex < endIndex) {
                int i12 = tn0.b.f114857b[source[startIndex] & 255];
                if (i12 < 0) {
                    if (i12 == -2) {
                        i11 -= endIndex - startIndex;
                        break;
                    }
                    i11--;
                }
                startIndex++;
            }
        } else if (source[endIndex - 1] == 61) {
            i11 = source[endIndex + (-2)] == 61 ? i11 - 2 : i11 - 1;
        }
        return (int) ((((long) i11) * ((long) 6)) / ((long) 8));
    }

    public final String l(byte[] source, int startIndex, int endIndex) {
        s.k(source, "source");
        return new String(p(source, startIndex, endIndex), p013kotlin.text.d.ISO_8859_1);
    }

    public final int n(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        int i11 = startIndex;
        s.k(source, "source");
        s.k(destination, "destination");
        e(source.length, i11, endIndex);
        c(destination.length, destinationOffset, o(endIndex - i11));
        byte[] bArr = this.isUrlSafe ? tn0.b.f114858c : tn0.b.f114856a;
        int i12 = this.isMimeScheme ? 19 : Integer.MAX_VALUE;
        int i13 = destinationOffset;
        while (i11 + 2 < endIndex) {
            int iMin = Math.min((endIndex - i11) / 3, i12);
            for (int i14 = 0; i14 < iMin; i14++) {
                int i15 = source[i11] & 255;
                int i16 = i11 + 2;
                int i17 = source[i11 + 1] & 255;
                i11 += 3;
                int i18 = (i17 << 8) | (i15 << 16) | (source[i16] & 255);
                destination[i13] = bArr[i18 >>> 18];
                destination[i13 + 1] = bArr[(i18 >>> 12) & 63];
                int i19 = i13 + 3;
                destination[i13 + 2] = bArr[(i18 >>> 6) & 63];
                i13 += 4;
                destination[i19] = bArr[i18 & 63];
            }
            if (iMin == i12 && i11 != endIndex) {
                int i21 = i13 + 1;
                byte[] bArr2 = f114850e;
                destination[i13] = bArr2[0];
                i13 += 2;
                destination[i21] = bArr2[1];
            }
        }
        int i22 = endIndex - i11;
        if (i22 == 1) {
            int i23 = i11 + 1;
            int i24 = (source[i11] & 255) << 4;
            destination[i13] = bArr[i24 >>> 6];
            int i25 = i13 + 2;
            destination[i13 + 1] = bArr[i24 & 63];
            if (r()) {
                int i26 = i13 + 3;
                destination[i25] = 61;
                i13 += 4;
                destination[i26] = 61;
                i11 = i23;
            } else {
                i11 = i23;
                i13 = i25;
            }
        } else if (i22 == 2) {
            int i27 = i11 + 1;
            int i28 = source[i11] & 255;
            i11 += 2;
            int i29 = ((source[i27] & 255) << 2) | (i28 << 10);
            destination[i13] = bArr[i29 >>> 12];
            destination[i13 + 1] = bArr[(i29 >>> 6) & 63];
            int i31 = i13 + 3;
            destination[i13 + 2] = bArr[i29 & 63];
            if (r()) {
                i13 += 4;
                destination[i31] = 61;
            } else {
                i13 = i31;
            }
        }
        if (i11 == endIndex) {
            return i13 - destinationOffset;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int o(int sourceSize) {
        int i11 = sourceSize / 3;
        int i12 = sourceSize % 3;
        int i13 = i11 * 4;
        if (i12 != 0) {
            i13 += r() ? 4 : i12 + 1;
        }
        if (this.isMimeScheme) {
            i13 += ((i13 - 1) / 76) * 2;
        }
        if (i13 >= 0) {
            return i13;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    public final byte[] p(byte[] source, int startIndex, int endIndex) {
        s.k(source, "source");
        e(source.length, startIndex, endIndex);
        byte[] bArr = new byte[o(endIndex - startIndex)];
        n(source, bArr, 0, startIndex, endIndex);
        return bArr;
    }

    private a(boolean z11, boolean z12, b bVar) {
        this.isUrlSafe = z11;
        this.isMimeScheme = z12;
        this.paddingOption = bVar;
        if (z11 && z12) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
