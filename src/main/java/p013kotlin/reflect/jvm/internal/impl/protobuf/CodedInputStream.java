package p013kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class CodedInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f88250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f88251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f88252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f88253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f88254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InputStream f88255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f88256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f88257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f88258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f88259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f88260k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f88261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f88262m;

    private CodedInputStream(InputStream inputStream) {
        this.f88257h = false;
        this.f88259j = Integer.MAX_VALUE;
        this.f88261l = 64;
        this.f88262m = 67108864;
        this.f88250a = new byte[4096];
        this.f88252c = 0;
        this.f88254e = 0;
        this.f88258i = 0;
        this.f88255f = inputStream;
        this.f88251b = false;
    }

    private void a(int i11) throws InvalidProtocolBufferException {
        if (this.f88252c - this.f88254e < i11) {
            f(i11);
        }
    }

    static CodedInputStream b(b bVar) {
        CodedInputStream codedInputStream = new CodedInputStream(bVar);
        try {
            codedInputStream.pushLimit(bVar.size());
            return codedInputStream;
        } catch (InvalidProtocolBufferException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    private byte[] c(int i11) throws InvalidProtocolBufferException {
        if (i11 <= 0) {
            if (i11 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.f();
        }
        int i12 = this.f88258i;
        int i13 = this.f88254e;
        int i14 = i12 + i13 + i11;
        int i15 = this.f88259j;
        if (i14 > i15) {
            skipRawBytes((i15 - i12) - i13);
            throw InvalidProtocolBufferException.i();
        }
        if (i11 < 4096) {
            byte[] bArr = new byte[i11];
            int i16 = this.f88252c - i13;
            System.arraycopy(this.f88250a, i13, bArr, 0, i16);
            this.f88254e = this.f88252c;
            int i17 = i11 - i16;
            a(i17);
            System.arraycopy(this.f88250a, 0, bArr, i16, i17);
            this.f88254e = i17;
            return bArr;
        }
        int i18 = this.f88252c;
        this.f88258i = i12 + i18;
        this.f88254e = 0;
        this.f88252c = 0;
        int length = i18 - i13;
        int i19 = i11 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i19 > 0) {
            int iMin = Math.min(i19, 4096);
            byte[] bArr2 = new byte[iMin];
            int i21 = 0;
            while (i21 < iMin) {
                InputStream inputStream = this.f88255f;
                int i22 = inputStream == null ? -1 : inputStream.read(bArr2, i21, iMin - i21);
                if (i22 == -1) {
                    throw InvalidProtocolBufferException.i();
                }
                this.f88258i += i22;
                i21 += i22;
            }
            i19 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i11];
        System.arraycopy(this.f88250a, i13, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    public static int decodeZigZag32(int i11) {
        return (-(i11 & 1)) ^ (i11 >>> 1);
    }

    public static long decodeZigZag64(long j11) {
        return (-(j11 & 1)) ^ (j11 >>> 1);
    }

    private void e() {
        int i11 = this.f88252c + this.f88253d;
        this.f88252c = i11;
        int i12 = this.f88258i + i11;
        int i13 = this.f88259j;
        if (i12 <= i13) {
            this.f88253d = 0;
            return;
        }
        int i14 = i12 - i13;
        this.f88253d = i14;
        this.f88252c = i11 - i14;
    }

    private void f(int i11) throws InvalidProtocolBufferException {
        if (!h(i11)) {
            throw InvalidProtocolBufferException.i();
        }
    }

    private void g(int i11) throws InvalidProtocolBufferException {
        if (i11 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int i12 = this.f88258i;
        int i13 = this.f88254e;
        int i14 = i12 + i13 + i11;
        int i15 = this.f88259j;
        if (i14 > i15) {
            skipRawBytes((i15 - i12) - i13);
            throw InvalidProtocolBufferException.i();
        }
        int i16 = this.f88252c;
        int i17 = i16 - i13;
        this.f88254e = i16;
        f(1);
        while (true) {
            int i18 = i11 - i17;
            int i19 = this.f88252c;
            if (i18 <= i19) {
                this.f88254e = i18;
                return;
            } else {
                i17 += i19;
                this.f88254e = i19;
                f(1);
            }
        }
    }

    private boolean h(int i11) throws IOException {
        int i12 = this.f88254e;
        int i13 = i12 + i11;
        int i14 = this.f88252c;
        if (i13 <= i14) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i11);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f88258i + i12 + i11 <= this.f88259j && this.f88255f != null) {
            if (i12 > 0) {
                if (i14 > i12) {
                    byte[] bArr = this.f88250a;
                    System.arraycopy(bArr, i12, bArr, 0, i14 - i12);
                }
                this.f88258i += i12;
                this.f88252c -= i12;
                this.f88254e = 0;
            }
            InputStream inputStream = this.f88255f;
            byte[] bArr2 = this.f88250a;
            int i15 = this.f88252c;
            int i16 = inputStream.read(bArr2, i15, bArr2.length - i15);
            if (i16 == 0 || i16 < -1 || i16 > this.f88250a.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i16);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i16 > 0) {
                this.f88252c += i16;
                if ((this.f88258i + i11) - this.f88262m > 0) {
                    throw InvalidProtocolBufferException.h();
                }
                e();
                if (this.f88252c >= i11) {
                    return true;
                }
                return h(i11);
            }
        }
        return false;
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    public void checkLastTagWas(int i11) throws InvalidProtocolBufferException {
        if (this.f88256g != i11) {
            throw InvalidProtocolBufferException.a();
        }
    }

    long d() throws InvalidProtocolBufferException {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            byte rawByte = readRawByte();
            j11 |= ((long) (rawByte & 127)) << i11;
            if ((rawByte & 128) == 0) {
                return j11;
            }
        }
        throw InvalidProtocolBufferException.e();
    }

    public int getBytesUntilLimit() {
        int i11 = this.f88259j;
        if (i11 == Integer.MAX_VALUE) {
            return -1;
        }
        return i11 - (this.f88258i + this.f88254e);
    }

    public boolean isAtEnd() {
        return this.f88254e == this.f88252c && !h(1);
    }

    public void popLimit(int i11) {
        this.f88259j = i11;
        e();
    }

    public int pushLimit(int i11) throws InvalidProtocolBufferException {
        if (i11 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int i12 = i11 + this.f88258i + this.f88254e;
        int i13 = this.f88259j;
        if (i12 > i13) {
            throw InvalidProtocolBufferException.i();
        }
        this.f88259j = i12;
        e();
        return i13;
    }

    public boolean readBool() {
        return readRawVarint64() != 0;
    }

    public ByteString readBytes() {
        int rawVarint32 = readRawVarint32();
        int i11 = this.f88252c;
        int i12 = this.f88254e;
        if (rawVarint32 > i11 - i12 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? ByteString.EMPTY : new b(c(rawVarint32));
        }
        ByteString aVar = (this.f88251b && this.f88257h) ? new a(this.f88250a, this.f88254e, rawVarint32) : ByteString.copyFrom(this.f88250a, i12, rawVarint32);
        this.f88254e += rawVarint32;
        return aVar;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() {
        return readRawVarint32();
    }

    public int readFixed32() {
        return readRawLittleEndian32();
    }

    public long readFixed64() {
        return readRawLittleEndian64();
    }

    public float readFloat() {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(int i11, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        int i12 = this.f88260k;
        if (i12 >= this.f88261l) {
            throw InvalidProtocolBufferException.g();
        }
        this.f88260k = i12 + 1;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.b(i11, 4));
        this.f88260k--;
    }

    public int readInt32() {
        return readRawVarint32();
    }

    public long readInt64() {
        return readRawVarint64();
    }

    public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (this.f88260k >= this.f88261l) {
            throw InvalidProtocolBufferException.g();
        }
        int iPushLimit = pushLimit(rawVarint32);
        this.f88260k++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.f88260k--;
        popLimit(iPushLimit);
    }

    public byte readRawByte() throws InvalidProtocolBufferException {
        if (this.f88254e == this.f88252c) {
            f(1);
        }
        byte[] bArr = this.f88250a;
        int i11 = this.f88254e;
        this.f88254e = i11 + 1;
        return bArr[i11];
    }

    public int readRawLittleEndian32() throws InvalidProtocolBufferException {
        int i11 = this.f88254e;
        if (this.f88252c - i11 < 4) {
            f(4);
            i11 = this.f88254e;
        }
        byte[] bArr = this.f88250a;
        this.f88254e = i11 + 4;
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public long readRawLittleEndian64() throws InvalidProtocolBufferException {
        int i11 = this.f88254e;
        if (this.f88252c - i11 < 8) {
            f(8);
            i11 = this.f88254e;
        }
        byte[] bArr = this.f88250a;
        this.f88254e = i11 + 8;
        return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
    }

    public int readRawVarint32() {
        int i11;
        int i12 = this.f88254e;
        int i13 = this.f88252c;
        if (i13 != i12) {
            byte[] bArr = this.f88250a;
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            if (b11 >= 0) {
                this.f88254e = i14;
                return b11;
            }
            if (i13 - i14 >= 9) {
                int i15 = i12 + 2;
                int i16 = (bArr[i14] << 7) ^ b11;
                long j11 = i16;
                if (j11 < 0) {
                    i11 = (int) ((-128) ^ j11);
                } else {
                    int i17 = i12 + 3;
                    int i18 = (bArr[i15] << 14) ^ i16;
                    long j12 = i18;
                    if (j12 >= 0) {
                        i11 = (int) (16256 ^ j12);
                    } else {
                        int i19 = i12 + 4;
                        int i21 = i18 ^ (bArr[i17] << 21);
                        long j13 = i21;
                        if (j13 < 0) {
                            i11 = (int) ((-2080896) ^ j13);
                        } else {
                            i17 = i12 + 5;
                            byte b12 = bArr[i19];
                            int i22 = (int) (((long) (i21 ^ (b12 << 28))) ^ 266354560);
                            if (b12 < 0) {
                                i19 = i12 + 6;
                                if (bArr[i17] < 0) {
                                    i17 = i12 + 7;
                                    if (bArr[i19] < 0) {
                                        i19 = i12 + 8;
                                        if (bArr[i17] < 0) {
                                            i17 = i12 + 9;
                                            if (bArr[i19] < 0) {
                                                int i23 = i12 + 10;
                                                if (bArr[i17] >= 0) {
                                                    i15 = i23;
                                                    i11 = i22;
                                                }
                                            }
                                        }
                                    }
                                }
                                i11 = i22;
                            }
                            i11 = i22;
                        }
                        i15 = i19;
                    }
                    i15 = i17;
                }
                this.f88254e = i15;
                return i11;
            }
        }
        return (int) d();
    }

    public long readRawVarint64() {
        long j11;
        long j12;
        long j13;
        int i11 = this.f88254e;
        int i12 = this.f88252c;
        if (i12 != i11) {
            byte[] bArr = this.f88250a;
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            if (b11 >= 0) {
                this.f88254e = i13;
                return b11;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                long j14 = (bArr[i13] << 7) ^ b11;
                if (j14 >= 0) {
                    int i15 = i11 + 3;
                    long j15 = j14 ^ ((long) (bArr[i14] << 14));
                    if (j15 >= 0) {
                        j13 = 16256;
                    } else {
                        i14 = i11 + 4;
                        j14 = j15 ^ ((long) (bArr[i15] << 21));
                        if (j14 < 0) {
                            j12 = -2080896;
                        } else {
                            i15 = i11 + 5;
                            j15 = j14 ^ (((long) bArr[i14]) << 28);
                            if (j15 >= 0) {
                                j13 = 266354560;
                            } else {
                                i14 = i11 + 6;
                                j14 = j15 ^ (((long) bArr[i15]) << 35);
                                if (j14 >= 0) {
                                    i15 = i11 + 7;
                                    j15 = j14 ^ (((long) bArr[i14]) << 42);
                                    if (j15 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i14 = i11 + 8;
                                        j14 = j15 ^ (((long) bArr[i15]) << 49);
                                        if (j14 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i15 = i11 + 9;
                                            long j16 = (j14 ^ (((long) bArr[i14]) << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                i14 = i11 + 10;
                                                if (bArr[i15] >= 0) {
                                                    j11 = j16;
                                                }
                                            } else {
                                                j11 = j16;
                                                i14 = i15;
                                            }
                                        }
                                    }
                                    this.f88254e = i14;
                                    return j11;
                                }
                                j12 = -34093383808L;
                            }
                        }
                    }
                    j11 = j15 ^ j13;
                    i14 = i15;
                    this.f88254e = i14;
                    return j11;
                }
                j12 = -128;
                j11 = j14 ^ j12;
                this.f88254e = i14;
                return j11;
            }
        }
        return d();
    }

    public int readSFixed32() {
        return readRawLittleEndian32();
    }

    public long readSFixed64() {
        return readRawLittleEndian64();
    }

    public int readSInt32() {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() {
        int rawVarint32 = readRawVarint32();
        int i11 = this.f88252c;
        int i12 = this.f88254e;
        if (rawVarint32 > i11 - i12 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? "" : new String(c(rawVarint32), "UTF-8");
        }
        String str = new String(this.f88250a, i12, rawVarint32, "UTF-8");
        this.f88254e += rawVarint32;
        return str;
    }

    public String readStringRequireUtf8() throws InvalidProtocolBufferException {
        byte[] bArrC;
        int rawVarint32 = readRawVarint32();
        int i11 = this.f88254e;
        if (rawVarint32 <= this.f88252c - i11 && rawVarint32 > 0) {
            bArrC = this.f88250a;
            this.f88254e = i11 + rawVarint32;
        } else {
            if (rawVarint32 == 0) {
                return "";
            }
            bArrC = c(rawVarint32);
            i11 = 0;
        }
        if (e.f(bArrC, i11, i11 + rawVarint32)) {
            return new String(bArrC, i11, rawVarint32, "UTF-8");
        }
        throw InvalidProtocolBufferException.c();
    }

    public int readTag() throws InvalidProtocolBufferException {
        if (isAtEnd()) {
            this.f88256g = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f88256g = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.f88256g;
        }
        throw InvalidProtocolBufferException.b();
    }

    public int readUInt32() {
        return readRawVarint32();
    }

    public long readUInt64() {
        return readRawVarint64();
    }

    public boolean skipField(int i11, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
        int iA = WireFormat.a(i11);
        if (iA == 0) {
            long int64 = readInt64();
            codedOutputStream.writeRawVarint32(i11);
            codedOutputStream.writeUInt64NoTag(int64);
            return true;
        }
        if (iA == 1) {
            long rawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i11);
            codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        if (iA == 2) {
            ByteString bytes = readBytes();
            codedOutputStream.writeRawVarint32(i11);
            codedOutputStream.writeBytesNoTag(bytes);
            return true;
        }
        if (iA == 3) {
            codedOutputStream.writeRawVarint32(i11);
            skipMessage(codedOutputStream);
            int iB = WireFormat.b(WireFormat.getTagFieldNumber(i11), 4);
            checkLastTagWas(iB);
            codedOutputStream.writeRawVarint32(iB);
            return true;
        }
        if (iA == 4) {
            return false;
        }
        if (iA != 5) {
            throw InvalidProtocolBufferException.d();
        }
        int rawLittleEndian32 = readRawLittleEndian32();
        codedOutputStream.writeRawVarint32(i11);
        codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
        return true;
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag, codedOutputStream));
    }

    public void skipRawBytes(int i11) throws InvalidProtocolBufferException {
        int i12 = this.f88252c;
        int i13 = this.f88254e;
        if (i11 > i12 - i13 || i11 < 0) {
            g(i11);
        } else {
            this.f88254e = i13 + i11;
        }
    }

    public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (this.f88260k < this.f88261l) {
            int iPushLimit = pushLimit(rawVarint32);
            this.f88260k++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f88260k--;
            popLimit(iPushLimit);
            return partialFrom;
        }
        throw InvalidProtocolBufferException.g();
    }

    private CodedInputStream(b bVar) {
        this.f88257h = false;
        this.f88259j = Integer.MAX_VALUE;
        this.f88261l = 64;
        this.f88262m = 67108864;
        this.f88250a = bVar.f88323a;
        int iM = bVar.m();
        this.f88254e = iM;
        this.f88252c = iM + bVar.size();
        this.f88258i = -this.f88254e;
        this.f88255f = null;
        this.f88251b = true;
    }

    public static int readRawVarint32(int i11, InputStream inputStream) throws IOException {
        if ((i11 & 128) == 0) {
            return i11;
        }
        int i12 = i11 & 127;
        int i13 = 7;
        while (i13 < 32) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw InvalidProtocolBufferException.i();
            }
            i12 |= (i14 & 127) << i13;
            if ((i14 & 128) == 0) {
                return i12;
            }
            i13 += 7;
        }
        while (i13 < 64) {
            int i15 = inputStream.read();
            if (i15 == -1) {
                throw InvalidProtocolBufferException.i();
            }
            if ((i15 & 128) == 0) {
                return i12;
            }
            i13 += 7;
        }
        throw InvalidProtocolBufferException.e();
    }
}
