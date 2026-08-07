package okio;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import ezvcard.property.Gender;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0016\u0018\u0000 V2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0010J#\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0018H\u0087\u0002¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u0018H\u0010¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0003H\u0010¢\u0006\u0004\b'\u0010&J'\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0010¢\u0006\u0004\b-\u0010.J/\u00102\u001a\u0002012\u0006\u0010*\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0016¢\u0006\u0004\b2\u00103J/\u00104\u001a\u0002012\u0006\u0010*\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u0002012\u0006\u00106\u001a\u00020\u0000¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u0002012\u0006\u00109\u001a\u00020\u0000¢\u0006\u0004\b:\u00108J!\u0010<\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00002\b\b\u0002\u0010;\u001a\u00020\u0018H\u0007¢\u0006\u0004\b<\u0010=J!\u0010>\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u0018H\u0017¢\u0006\u0004\b>\u0010?J!\u0010@\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00002\b\b\u0002\u0010;\u001a\u00020\u0018H\u0007¢\u0006\u0004\b@\u0010=J!\u0010A\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u0018H\u0017¢\u0006\u0004\bA\u0010?J\u001a\u0010C\u001a\u0002012\b\u0010/\u001a\u0004\u0018\u00010BH\u0096\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0018H\u0016¢\u0006\u0004\bE\u0010$J\u0018\u0010F\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0007H\u0016¢\u0006\u0004\bH\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bJ\u0010&R\"\u0010E\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010\u0017\u001a\u0004\bK\u0010$\"\u0004\bL\u0010MR$\u0010S\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010\t\"\u0004\bQ\u0010RR\u0011\u0010U\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\bT\u0010$¨\u0006W"}, d2 = {"Lokio/k;", "Ljava/io/Serializable;", "", "", "data", "<init>", "([B)V", "", "K", "()Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", Gender.FEMALE, "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "a", "v", "()Lokio/k;", "B", "C", "algorithm", "e", "(Ljava/lang/String;)Lokio/k;", "m", "I", "", "beginIndex", "endIndex", "G", "(II)Lokio/k;", "pos", "", "r", "(I)B", "index", "h", "k", "()I", "J", "()[B", "q", "Lokio/h;", "buffer", "offset", "byteCount", "Ljn0/h0;", "L", "(Lokio/h;II)V", "other", "otherOffset", "", "x", "(ILokio/k;II)Z", "y", "(I[BII)Z", "prefix", "E", "(Lokio/k;)Z", "suffix", "g", "fromIndex", "n", "(Lokio/k;I)I", "o", "([BI)I", "s", "t", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "b", "(Lokio/k;)I", "toString", "[B", IntegerTokenConverter.CONVERTER_KEY, "j", "z", "(I)V", "c", "Ljava/lang/String;", "l", "A", "(Ljava/lang/String;)V", "utf8", "D", "size", DateTokenConverter.CONVERTER_KEY, "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class k implements Serializable, Comparable<k> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f97943e = new k(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final byte[] data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private transient int hashCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private transient String utf8;

    /* JADX INFO: renamed from: okio.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00020\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0007*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u0007*\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0007*\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0011J\u0013\u0010\u0017\u001a\u00020\u0007*\u00020\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0011J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lokio/k$a;", "", "<init>", "()V", "", "", "data", "Lokio/k;", "g", "([B)Lokio/k;", "", "offset", "byteCount", "h", "([BII)Lokio/k;", "", "f", "(Ljava/lang/String;)Lokio/k;", "Ljava/nio/charset/Charset;", "charset", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/k;", "b", "c", InquiryField.StringField.TYPE, "a", "", "serialVersionUID", "J", "EMPTY", "Lokio/k;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ k e(Companion companion, String str, Charset charset, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                charset = p013kotlin.text.d.UTF_8;
            }
            return companion.d(str, charset);
        }

        public static /* synthetic */ k i(Companion companion, byte[] bArr, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = 0;
            }
            if ((i13 & 2) != 0) {
                i12 = e.c();
            }
            return companion.h(bArr, i11, i12);
        }

        @jn0.e
        public final k a(String string) {
            p013kotlin.jvm.internal.s.k(string, "string");
            return b(string);
        }

        public final k b(String str) {
            p013kotlin.jvm.internal.s.k(str, "<this>");
            byte[] bArrA = a.a(str);
            if (bArrA != null) {
                return new k(bArrA);
            }
            return null;
        }

        public final k c(String str) {
            p013kotlin.jvm.internal.s.k(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i11 = 0; i11 < length; i11++) {
                int i12 = i11 * 2;
                bArr[i11] = (byte) ((ip0.c.b(str.charAt(i12)) << 4) + ip0.c.b(str.charAt(i12 + 1)));
            }
            return new k(bArr);
        }

        public final k d(String str, Charset charset) {
            p013kotlin.jvm.internal.s.k(str, "<this>");
            p013kotlin.jvm.internal.s.k(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
            return new k(bytes);
        }

        public final k f(String str) {
            p013kotlin.jvm.internal.s.k(str, "<this>");
            k kVar = new k(v0.a(str));
            kVar.A(str);
            return kVar;
        }

        public final k g(byte... data) {
            p013kotlin.jvm.internal.s.k(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            p013kotlin.jvm.internal.s.j(bArrCopyOf, "copyOf(...)");
            return new k(bArrCopyOf);
        }

        public final k h(byte[] bArr, int i11, int i12) {
            p013kotlin.jvm.internal.s.k(bArr, "<this>");
            int iF = e.f(bArr, i12);
            e.b(bArr.length, i11, iF);
            return new k(p013kotlin.collections.n.u(bArr, i11, iF + i11));
        }

        private Companion() {
        }
    }

    public k(byte[] data) {
        p013kotlin.jvm.internal.s.k(data, "data");
        this.data = data;
    }

    public static /* synthetic */ k H(k kVar, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = e.c();
        }
        return kVar.G(i11, i12);
    }

    public static final k c(String str) {
        return INSTANCE.b(str);
    }

    public static final k d(String str) {
        return INSTANCE.c(str);
    }

    public static final k f(String str) {
        return INSTANCE.f(str);
    }

    public static /* synthetic */ int p(k kVar, k kVar2, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return kVar.n(kVar2, i11);
    }

    public static /* synthetic */ int u(k kVar, k kVar2, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i12 & 2) != 0) {
            i11 = e.c();
        }
        return kVar.s(kVar2, i11);
    }

    public static final k w(byte... bArr) {
        return INSTANCE.g(bArr);
    }

    public final void A(String str) {
        this.utf8 = str;
    }

    public final k B() {
        return e("SHA-1");
    }

    public final k C() {
        return e("SHA-256");
    }

    public final int D() {
        return k();
    }

    public final boolean E(k prefix) {
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        return x(0, prefix, 0, prefix.D());
    }

    public String F(Charset charset) {
        p013kotlin.jvm.internal.s.k(charset, "charset");
        return new String(this.data, charset);
    }

    public k G(int beginIndex, int endIndex) {
        int iE = e.e(this, endIndex);
        if (beginIndex < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iE <= getData().length) {
            if (iE - beginIndex >= 0) {
                return (beginIndex == 0 && iE == getData().length) ? this : new k(p013kotlin.collections.n.u(getData(), beginIndex, iE));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + getData().length + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public k I() {
        for (int i11 = 0; i11 < getData().length; i11++) {
            byte b11 = getData()[i11];
            if (b11 >= 65 && b11 <= 90) {
                byte[] data = getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                p013kotlin.jvm.internal.s.j(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i11] = (byte) (b11 + 32);
                for (int i12 = i11 + 1; i12 < bArrCopyOf.length; i12++) {
                    byte b12 = bArrCopyOf[i12];
                    if (b12 >= 65 && b12 <= 90) {
                        bArrCopyOf[i12] = (byte) (b12 + 32);
                    }
                }
                return new k(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] J() {
        byte[] data = getData();
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        p013kotlin.jvm.internal.s.j(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public String K() {
        String utf8 = getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        String strC = v0.c(q());
        A(strC);
        return strC;
    }

    public void L(h buffer, int offset, int byteCount) {
        p013kotlin.jvm.internal.s.k(buffer, "buffer");
        ip0.b.c(this, buffer, offset, byteCount);
    }

    public String a() {
        return a.c(getData(), null, 1, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(k other) {
        p013kotlin.jvm.internal.s.k(other, "other");
        int iD = D();
        int iD2 = other.D();
        int iMin = Math.min(iD, iD2);
        for (int i11 = 0; i11 < iMin; i11++) {
            int iH = h(i11) & 255;
            int iH2 = other.h(i11) & 255;
            if (iH != iH2) {
                return iH < iH2 ? -1 : 1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        return iD < iD2 ? -1 : 1;
    }

    public k e(String algorithm) throws NoSuchAlgorithmException {
        p013kotlin.jvm.internal.s.k(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, D());
        byte[] bArrDigest = messageDigest.digest();
        p013kotlin.jvm.internal.s.h(bArrDigest);
        return new k(bArrDigest);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof k) {
            k kVar = (k) other;
            if (kVar.D() == getData().length && kVar.y(0, getData(), 0, getData().length)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(k suffix) {
        p013kotlin.jvm.internal.s.k(suffix, "suffix");
        return x(D() - suffix.D(), suffix, 0, suffix.D());
    }

    public final byte h(int index) {
        return r(index);
    }

    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int iHashCode = Arrays.hashCode(getData());
        z(iHashCode);
        return iHashCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getHashCode() {
        return this.hashCode;
    }

    public int k() {
        return getData().length;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getUtf8() {
        return this.utf8;
    }

    public String m() {
        char[] cArr = new char[getData().length * 2];
        int i11 = 0;
        for (byte b11 : getData()) {
            int i12 = i11 + 1;
            cArr[i11] = ip0.b.d()[(b11 >> 4) & 15];
            i11 += 2;
            cArr[i12] = ip0.b.d()[b11 & 15];
        }
        return p013kotlin.text.t.D(cArr);
    }

    public final int n(k other, int fromIndex) {
        p013kotlin.jvm.internal.s.k(other, "other");
        return o(other.q(), fromIndex);
    }

    public int o(byte[] other, int fromIndex) {
        p013kotlin.jvm.internal.s.k(other, "other");
        int length = getData().length - other.length;
        int iMax = Math.max(fromIndex, 0);
        if (iMax > length) {
            return -1;
        }
        while (!e.a(getData(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] q() {
        return getData();
    }

    public byte r(int pos) {
        return getData()[pos];
    }

    public final int s(k other, int fromIndex) {
        p013kotlin.jvm.internal.s.k(other, "other");
        return t(other.q(), fromIndex);
    }

    public int t(byte[] other, int fromIndex) {
        p013kotlin.jvm.internal.s.k(other, "other");
        for (int iMin = Math.min(e.e(this, fromIndex), getData().length - other.length); -1 < iMin; iMin--) {
            if (e.a(getData(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public String toString() {
        if (getData().length == 0) {
            return "[size=0]";
        }
        int iB = ip0.b.b(getData(), 64);
        if (iB != -1) {
            String strK = K();
            String strSubstring = strK.substring(0, iB);
            p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
            String strV = p013kotlin.text.t.V(p013kotlin.text.t.V(p013kotlin.text.t.V(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iB >= strK.length()) {
                return "[text=" + strV + ']';
            }
            return "[size=" + getData().length + " text=" + strV + "…]";
        }
        if (getData().length <= 64) {
            return "[hex=" + m() + ']';
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(getData().length);
        sb2.append(" hex=");
        int iE = e.e(this, 64);
        if (iE <= getData().length) {
            if (iE < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb2.append((iE == getData().length ? this : new k(p013kotlin.collections.n.u(getData(), 0, iE))).m());
            sb2.append("…]");
            return sb2.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + getData().length + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public final k v() {
        return e("MD5");
    }

    public boolean x(int offset, k other, int otherOffset, int byteCount) {
        p013kotlin.jvm.internal.s.k(other, "other");
        return other.y(otherOffset, getData(), offset, byteCount);
    }

    public boolean y(int offset, byte[] other, int otherOffset, int byteCount) {
        p013kotlin.jvm.internal.s.k(other, "other");
        return offset >= 0 && offset <= getData().length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && e.a(getData(), offset, other, otherOffset, byteCount);
    }

    public final void z(int i11) {
        this.hashCode = i11;
    }
}
