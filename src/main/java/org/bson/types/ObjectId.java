package org.bson.types;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import nq0.a;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes10.dex */
public final class ObjectId implements Comparable<ObjectId>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f99290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final short f99291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicInteger f99292g = new AtomicInteger(new SecureRandom().nextInt());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final char[] f99293h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f99294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f99295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f99296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f99297d;

    static {
        try {
            SecureRandom secureRandom = new SecureRandom();
            f99290e = secureRandom.nextInt(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            f99291f = (short) secureRandom.nextInt(32768);
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    public ObjectId() {
        this(new Date());
    }

    private static int b(Date date) {
        return (int) (date.getTime() / 1000);
    }

    private static byte c(int i11) {
        return (byte) i11;
    }

    private static byte d(int i11) {
        return (byte) (i11 >> 8);
    }

    private static byte e(int i11) {
        return (byte) (i11 >> 16);
    }

    private static byte f(int i11) {
        return (byte) (i11 >> 24);
    }

    public static boolean g(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        int length = str.length();
        if (length != 24) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'f') && (cCharAt < 'A' || cCharAt > 'F'))) {
                return false;
            }
        }
        return true;
    }

    private static byte[] h(int i11, int i12, int i13) {
        return new byte[]{f(i11), e(i11), d(i11), c(i11), f(i12), e(i12), d(i12), c(i12), f(i13), e(i13), d(i13), c(i13)};
    }

    private static int i(byte b11, byte b12, byte b13, byte b14) {
        return (b11 << 24) | ((b12 & 255) << 16) | ((b13 & 255) << 8) | (b14 & 255);
    }

    private static short j(byte b11, byte b12) {
        return (short) (((b11 & 255) << 8) | (b12 & 255));
    }

    private static byte[] k(String str) {
        if (!g(str)) {
            throw new IllegalArgumentException("invalid hexadecimal representation of an ObjectId: [" + str + "]");
        }
        byte[] bArr = new byte[12];
        for (int i11 = 0; i11 < 12; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) Integer.parseInt(str.substring(i12, i12 + 2), 16);
        }
        return bArr;
    }

    private static byte m(short s11) {
        return (byte) s11;
    }

    private static byte n(short s11) {
        return (byte) (s11 >> 8);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ObjectId objectId) {
        objectId.getClass();
        byte[] bArrO = o();
        byte[] bArrO2 = objectId.o();
        for (int i11 = 0; i11 < 12; i11++) {
            byte b11 = bArrO[i11];
            byte b12 = bArrO2[i11];
            if (b11 != b12) {
                return (b11 & 255) < (b12 & 255) ? -1 : 1;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ObjectId.class != obj.getClass()) {
            return false;
        }
        ObjectId objectId = (ObjectId) obj;
        return this.f99295b == objectId.f99295b && this.f99294a == objectId.f99294a && this.f99296c == objectId.f99296c && this.f99297d == objectId.f99297d;
    }

    public int hashCode() {
        return (((((this.f99294a * 31) + this.f99295b) * 31) + this.f99296c) * 31) + this.f99297d;
    }

    public void l(ByteBuffer byteBuffer) {
        a.c("buffer", byteBuffer);
        a.b("buffer.remaining() >=12", byteBuffer.remaining() >= 12);
        byteBuffer.put(f(this.f99294a));
        byteBuffer.put(e(this.f99294a));
        byteBuffer.put(d(this.f99294a));
        byteBuffer.put(c(this.f99294a));
        byteBuffer.put(e(this.f99296c));
        byteBuffer.put(d(this.f99296c));
        byteBuffer.put(c(this.f99296c));
        byteBuffer.put(n(this.f99297d));
        byteBuffer.put(m(this.f99297d));
        byteBuffer.put(e(this.f99295b));
        byteBuffer.put(d(this.f99295b));
        byteBuffer.put(c(this.f99295b));
    }

    public byte[] o() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        l(byteBufferAllocate);
        return byteBufferAllocate.array();
    }

    public String p() {
        char[] cArr = new char[24];
        int i11 = 0;
        for (byte b11 : o()) {
            int i12 = i11 + 1;
            char[] cArr2 = f99293h;
            cArr[i11] = cArr2[(b11 >> 4) & 15];
            i11 += 2;
            cArr[i12] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    public String toString() {
        return p();
    }

    public ObjectId(Date date) {
        this(b(date), f99292g.getAndIncrement() & 16777215, false);
    }

    public ObjectId(Date date, int i11) {
        this(b(date), i11, true);
    }

    @Deprecated
    public ObjectId(Date date, int i11, short s11, int i12) {
        this(b(date), i11, s11, i12);
    }

    @Deprecated
    public ObjectId(int i11, int i12, short s11, int i13) {
        this(i11, i12, s11, i13, true);
    }

    public ObjectId(int i11, int i12) {
        this(i11, i12, true);
    }

    private ObjectId(int i11, int i12, boolean z11) {
        this(i11, f99290e, f99291f, i12, z11);
    }

    private ObjectId(int i11, int i12, short s11, int i13, boolean z11) {
        if ((i12 & (-16777216)) != 0) {
            throw new IllegalArgumentException("The machine identifier must be between 0 and 16777215 (it must fit in three bytes).");
        }
        if (z11 && (i13 & (-16777216)) != 0) {
            throw new IllegalArgumentException("The counter must be between 0 and 16777215 (it must fit in three bytes).");
        }
        this.f99294a = i11;
        this.f99295b = 16777215 & i13;
        this.f99296c = i12;
        this.f99297d = s11;
    }

    public ObjectId(String str) {
        this(k(str));
    }

    public ObjectId(byte[] bArr) {
        this(ByteBuffer.wrap((byte[]) a.a("bytes has length of 12", bArr, ((byte[]) a.c("bytes", bArr)).length == 12)));
    }

    ObjectId(int i11, int i12, int i13) {
        this(h(i11, i12, i13));
    }

    public ObjectId(ByteBuffer byteBuffer) {
        a.c("buffer", byteBuffer);
        a.b("buffer.remaining() >=12", byteBuffer.remaining() >= 12);
        this.f99294a = i(byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
        this.f99296c = i((byte) 0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
        this.f99297d = j(byteBuffer.get(), byteBuffer.get());
        this.f99295b = i((byte) 0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
    }
}
