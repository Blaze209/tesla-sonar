package okio;

import ch.qos.logback.core.CoreConstants;
import ezvcard.property.Gender;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\nJ\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0010¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0017H\u0010¢\u0006\u0004\b)\u0010*J/\u0010.\u001a\u00020-2\u0006\u0010&\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b.\u0010/J/\u00100\u001a\u00020-2\u0006\u0010&\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b0\u00101J!\u00103\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u0017H\u0016¢\u0006\u0004\b3\u00104J!\u00105\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u0017H\u0016¢\u0006\u0004\b5\u00104J\u000f\u00106\u001a\u00020\u0003H\u0010¢\u0006\u0004\b6\u0010#J\u001a\u00108\u001a\u00020-2\b\u0010+\u001a\u0004\u0018\u000107H\u0096\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0017H\u0016¢\u0006\u0004\b:\u0010!J\u000f\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b;\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lokio/o0;", "Lokio/k;", "", "", "segments", "", "directory", "<init>", "([[B[I)V", Gender.OTHER, "()Lokio/k;", "Ljava/nio/charset/Charset;", "charset", "", Gender.FEMALE, "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "a", "()Ljava/lang/String;", "m", "I", "algorithm", "e", "(Ljava/lang/String;)Lokio/k;", "", "beginIndex", "endIndex", "G", "(II)Lokio/k;", "pos", "", "r", "(I)B", "k", "()I", "J", "()[B", "Lokio/h;", "buffer", "offset", "byteCount", "Ljn0/h0;", "L", "(Lokio/h;II)V", "other", "otherOffset", "", "x", "(ILokio/k;II)Z", "y", "(I[BII)Z", "fromIndex", "o", "([BI)I", "t", "q", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "f", "[[B", Gender.NONE, "()[[B", "g", "[I", Gender.MALE, "()[I", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o0 extends k {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final transient byte[][] segments;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final transient int[] directory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(byte[][] segments, int[] directory) {
        super(k.f97943e.getData());
        p013kotlin.jvm.internal.s.k(segments, "segments");
        p013kotlin.jvm.internal.s.k(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    private final k O() {
        return new k(J());
    }

    @Override // okio.k
    public String F(Charset charset) {
        p013kotlin.jvm.internal.s.k(charset, "charset");
        return O().F(charset);
    }

    @Override // okio.k
    public k G(int beginIndex, int endIndex) {
        int iE = e.e(this, endIndex);
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex=" + beginIndex + " < 0").toString());
        }
        if (iE > D()) {
            throw new IllegalArgumentException(("endIndex=" + iE + " > length(" + D() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        int i11 = iE - beginIndex;
        if (i11 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iE + " < beginIndex=" + beginIndex).toString());
        }
        if (beginIndex == 0 && iE == D()) {
            return this;
        }
        if (beginIndex == iE) {
            return k.f97943e;
        }
        int iB = ip0.f.b(this, beginIndex);
        int iB2 = ip0.f.b(this, iE - 1);
        byte[][] bArr = (byte[][]) p013kotlin.collections.n.w(getSegments(), iB, iB2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iB <= iB2) {
            int i12 = iB;
            int i13 = 0;
            while (true) {
                iArr[i13] = Math.min(getDirectory()[i12] - beginIndex, i11);
                int i14 = i13 + 1;
                iArr[i13 + bArr.length] = getDirectory()[getSegments().length + i12];
                if (i12 == iB2) {
                    break;
                }
                i12++;
                i13 = i14;
            }
        }
        int i15 = iB != 0 ? getDirectory()[iB - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (beginIndex - i15);
        return new o0(bArr, iArr);
    }

    @Override // okio.k
    public k I() {
        return O().I();
    }

    @Override // okio.k
    public byte[] J() {
        byte[] bArr = new byte[D()];
        int length = getSegments().length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            int i14 = getDirectory()[length + i11];
            int i15 = getDirectory()[i11];
            int i16 = i15 - i12;
            p013kotlin.collections.n.k(getSegments()[i11], bArr, i13, i14, i14 + i16);
            i13 += i16;
            i11++;
            i12 = i15;
        }
        return bArr;
    }

    @Override // okio.k
    public void L(h buffer, int offset, int byteCount) {
        p013kotlin.jvm.internal.s.k(buffer, "buffer");
        int i11 = offset + byteCount;
        int iB = ip0.f.b(this, offset);
        while (offset < i11) {
            int i12 = iB == 0 ? 0 : getDirectory()[iB - 1];
            int i13 = getDirectory()[iB] - i12;
            int i14 = getDirectory()[getSegments().length + iB];
            int iMin = Math.min(i11, i13 + i12) - offset;
            int i15 = i14 + (offset - i12);
            m0 m0Var = new m0(getSegments()[iB], i15, i15 + iMin, true, false);
            m0 m0Var2 = buffer.head;
            if (m0Var2 == null) {
                m0Var.prev = m0Var;
                m0Var.next = m0Var;
                buffer.head = m0Var;
            } else {
                p013kotlin.jvm.internal.s.h(m0Var2);
                m0 m0Var3 = m0Var2.prev;
                p013kotlin.jvm.internal.s.h(m0Var3);
                m0Var3.c(m0Var);
            }
            offset += iMin;
            iB++;
        }
        buffer.r0(buffer.getSize() + ((long) byteCount));
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final int[] getDirectory() {
        return this.directory;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final byte[][] getSegments() {
        return this.segments;
    }

    @Override // okio.k
    public String a() {
        return O().a();
    }

    @Override // okio.k
    public k e(String algorithm) throws NoSuchAlgorithmException {
        p013kotlin.jvm.internal.s.k(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments().length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = getDirectory()[length + i11];
            int i14 = getDirectory()[i11];
            messageDigest.update(getSegments()[i11], i13, i14 - i12);
            i11++;
            i12 = i14;
        }
        byte[] bArrDigest = messageDigest.digest();
        p013kotlin.jvm.internal.s.h(bArrDigest);
        return new k(bArrDigest);
    }

    @Override // okio.k
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof k) {
            k kVar = (k) other;
            if (kVar.D() == D() && x(0, kVar, 0, D())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.k
    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = getSegments().length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int i14 = getDirectory()[length + i11];
            int i15 = getDirectory()[i11];
            byte[] bArr = getSegments()[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        z(i12);
        return i12;
    }

    @Override // okio.k
    public int k() {
        return getDirectory()[getSegments().length - 1];
    }

    @Override // okio.k
    public String m() {
        return O().m();
    }

    @Override // okio.k
    public int o(byte[] other, int fromIndex) {
        p013kotlin.jvm.internal.s.k(other, "other");
        return O().o(other, fromIndex);
    }

    @Override // okio.k
    public byte[] q() {
        return J();
    }

    @Override // okio.k
    public byte r(int pos) {
        e.b(getDirectory()[getSegments().length - 1], pos, 1L);
        int iB = ip0.f.b(this, pos);
        return getSegments()[iB][(pos - (iB == 0 ? 0 : getDirectory()[iB - 1])) + getDirectory()[getSegments().length + iB]];
    }

    @Override // okio.k
    public int t(byte[] other, int fromIndex) {
        p013kotlin.jvm.internal.s.k(other, "other");
        return O().t(other, fromIndex);
    }

    @Override // okio.k
    public String toString() {
        return O().toString();
    }

    @Override // okio.k
    public boolean x(int offset, k other, int otherOffset, int byteCount) {
        p013kotlin.jvm.internal.s.k(other, "other");
        if (offset < 0 || offset > D() - byteCount) {
            return false;
        }
        int i11 = byteCount + offset;
        int iB = ip0.f.b(this, offset);
        while (offset < i11) {
            int i12 = iB == 0 ? 0 : getDirectory()[iB - 1];
            int i13 = getDirectory()[iB] - i12;
            int i14 = getDirectory()[getSegments().length + iB];
            int iMin = Math.min(i11, i13 + i12) - offset;
            if (!other.y(otherOffset, getSegments()[iB], i14 + (offset - i12), iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iB++;
        }
        return true;
    }

    @Override // okio.k
    public boolean y(int offset, byte[] other, int otherOffset, int byteCount) {
        p013kotlin.jvm.internal.s.k(other, "other");
        if (offset < 0 || offset > D() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int i11 = byteCount + offset;
        int iB = ip0.f.b(this, offset);
        while (offset < i11) {
            int i12 = iB == 0 ? 0 : getDirectory()[iB - 1];
            int i13 = getDirectory()[iB] - i12;
            int i14 = getDirectory()[getSegments().length + iB];
            int iMin = Math.min(i11, i13 + i12) - offset;
            if (!e.a(getSegments()[iB], i14 + (offset - i12), other, otherOffset, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iB++;
        }
        return true;
    }
}
