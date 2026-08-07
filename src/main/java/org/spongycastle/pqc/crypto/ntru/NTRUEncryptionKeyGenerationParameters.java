package org.spongycastle.pqc.crypto.ntru;

import com.plaid.internal.EnumC4419g;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Arrays;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;

/* JADX INFO: loaded from: classes10.dex */
public class NTRUEncryptionKeyGenerationParameters extends KeyGenerationParameters implements Cloneable {
    public int N;
    public int bufferLenBits;
    int bufferLenTrits;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f99799c;

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    public int f99800db;

    /* JADX INFO: renamed from: df, reason: collision with root package name */
    public int f99801df;
    public int df1;
    public int df2;
    public int df3;

    /* JADX INFO: renamed from: dg, reason: collision with root package name */
    public int f99802dg;

    /* JADX INFO: renamed from: dm0, reason: collision with root package name */
    public int f99803dm0;

    /* JADX INFO: renamed from: dr, reason: collision with root package name */
    public int f99804dr;
    public int dr1;
    public int dr2;
    public int dr3;
    public boolean fastFp;
    public Digest hashAlg;
    public boolean hashSeed;
    int llen;
    public int maxMsgLenBytes;
    public int minCallsMask;
    public int minCallsR;
    public byte[] oid;
    public int pkLen;
    public int polyType;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f99805q;
    public boolean sparse;
    public static final NTRUEncryptionKeyGenerationParameters EES1087EP2 = new NTRUEncryptionKeyGenerationParameters(1087, 2048, 120, 120, 256, 13, 25, 14, true, new byte[]{0, 6, 3}, true, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters EES1171EP1 = new NTRUEncryptionKeyGenerationParameters(1171, 2048, 106, 106, 256, 13, 20, 15, true, new byte[]{0, 6, 4}, true, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters EES1499EP1 = new NTRUEncryptionKeyGenerationParameters(1499, 2048, 79, 79, 256, 13, 17, 19, true, new byte[]{0, 6, 5}, true, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_439 = new NTRUEncryptionKeyGenerationParameters(439, 2048, 146, EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 128, 9, 32, 9, true, new byte[]{0, 7, 101}, true, false, new SHA256Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_439_FAST = new NTRUEncryptionKeyGenerationParameters(439, 2048, 9, 8, 5, EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 128, 9, 32, 9, true, new byte[]{0, 7, 101}, true, true, new SHA256Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_743 = new NTRUEncryptionKeyGenerationParameters(743, 2048, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 256, 10, 27, 14, true, new byte[]{0, 7, 105}, false, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_743_FAST = new NTRUEncryptionKeyGenerationParameters(743, 2048, 11, 11, 15, EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 256, 10, 27, 14, true, new byte[]{0, 7, 105}, false, true, new SHA512Digest());

    public NTRUEncryptionKeyGenerationParameters(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11, byte[] bArr, boolean z12, boolean z13, Digest digest) {
        super(new SecureRandom(), i15);
        this.N = i11;
        this.f99805q = i12;
        this.f99801df = i13;
        this.f99800db = i15;
        this.f99803dm0 = i14;
        this.f99799c = i16;
        this.minCallsR = i17;
        this.minCallsMask = i18;
        this.hashSeed = z11;
        this.oid = bArr;
        this.sparse = z12;
        this.fastFp = z13;
        this.polyType = 0;
        this.hashAlg = digest;
        init();
    }

    private void init() {
        this.f99804dr = this.f99801df;
        this.dr1 = this.df1;
        this.dr2 = this.df2;
        this.dr3 = this.df3;
        int i11 = this.N;
        this.f99802dg = i11 / 3;
        this.llen = 1;
        int i12 = this.f99800db;
        this.maxMsgLenBytes = (((((i11 * 3) / 2) / 8) - 1) - (i12 / 8)) - 1;
        this.bufferLenBits = (((((i11 * 3) / 2) + 7) / 8) * 8) + 1;
        this.bufferLenTrits = i11 - 1;
        this.pkLen = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NTRUEncryptionKeyGenerationParameters nTRUEncryptionKeyGenerationParameters = (NTRUEncryptionKeyGenerationParameters) obj;
        if (this.N != nTRUEncryptionKeyGenerationParameters.N || this.bufferLenBits != nTRUEncryptionKeyGenerationParameters.bufferLenBits || this.bufferLenTrits != nTRUEncryptionKeyGenerationParameters.bufferLenTrits || this.f99799c != nTRUEncryptionKeyGenerationParameters.f99799c || this.f99800db != nTRUEncryptionKeyGenerationParameters.f99800db || this.f99801df != nTRUEncryptionKeyGenerationParameters.f99801df || this.df1 != nTRUEncryptionKeyGenerationParameters.df1 || this.df2 != nTRUEncryptionKeyGenerationParameters.df2 || this.df3 != nTRUEncryptionKeyGenerationParameters.df3 || this.f99802dg != nTRUEncryptionKeyGenerationParameters.f99802dg || this.f99803dm0 != nTRUEncryptionKeyGenerationParameters.f99803dm0 || this.f99804dr != nTRUEncryptionKeyGenerationParameters.f99804dr || this.dr1 != nTRUEncryptionKeyGenerationParameters.dr1 || this.dr2 != nTRUEncryptionKeyGenerationParameters.dr2 || this.dr3 != nTRUEncryptionKeyGenerationParameters.dr3 || this.fastFp != nTRUEncryptionKeyGenerationParameters.fastFp) {
            return false;
        }
        Digest digest = this.hashAlg;
        if (digest == null) {
            if (nTRUEncryptionKeyGenerationParameters.hashAlg != null) {
                return false;
            }
        } else if (!digest.getAlgorithmName().equals(nTRUEncryptionKeyGenerationParameters.hashAlg.getAlgorithmName())) {
            return false;
        }
        return this.hashSeed == nTRUEncryptionKeyGenerationParameters.hashSeed && this.llen == nTRUEncryptionKeyGenerationParameters.llen && this.maxMsgLenBytes == nTRUEncryptionKeyGenerationParameters.maxMsgLenBytes && this.minCallsMask == nTRUEncryptionKeyGenerationParameters.minCallsMask && this.minCallsR == nTRUEncryptionKeyGenerationParameters.minCallsR && Arrays.equals(this.oid, nTRUEncryptionKeyGenerationParameters.oid) && this.pkLen == nTRUEncryptionKeyGenerationParameters.pkLen && this.polyType == nTRUEncryptionKeyGenerationParameters.polyType && this.f99805q == nTRUEncryptionKeyGenerationParameters.f99805q && this.sparse == nTRUEncryptionKeyGenerationParameters.sparse;
    }

    public NTRUEncryptionParameters getEncryptionParameters() {
        return this.polyType == 0 ? new NTRUEncryptionParameters(this.N, this.f99805q, this.f99801df, this.f99803dm0, this.f99800db, this.f99799c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg) : new NTRUEncryptionParameters(this.N, this.f99805q, this.df1, this.df2, this.df3, this.f99803dm0, this.f99800db, this.f99799c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg);
    }

    public int getMaxMessageLength() {
        return this.maxMsgLenBytes;
    }

    public int hashCode() {
        int i11 = (((((((((((((((((((((((((((((((this.N + 31) * 31) + this.bufferLenBits) * 31) + this.bufferLenTrits) * 31) + this.f99799c) * 31) + this.f99800db) * 31) + this.f99801df) * 31) + this.df1) * 31) + this.df2) * 31) + this.df3) * 31) + this.f99802dg) * 31) + this.f99803dm0) * 31) + this.f99804dr) * 31) + this.dr1) * 31) + this.dr2) * 31) + this.dr3) * 31) + (this.fastFp ? 1231 : 1237)) * 31;
        Digest digest = this.hashAlg;
        return ((((((((((((((((((((i11 + (digest == null ? 0 : digest.getAlgorithmName().hashCode())) * 31) + (this.hashSeed ? 1231 : 1237)) * 31) + this.llen) * 31) + this.maxMsgLenBytes) * 31) + this.minCallsMask) * 31) + this.minCallsR) * 31) + Arrays.hashCode(this.oid)) * 31) + this.pkLen) * 31) + this.polyType) * 31) + this.f99805q) * 31) + (this.sparse ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EncryptionParameters(N=" + this.N + " q=" + this.f99805q);
        if (this.polyType == 0) {
            sb2.append(" polyType=SIMPLE df=" + this.f99801df);
        } else {
            sb2.append(" polyType=PRODUCT df1=" + this.df1 + " df2=" + this.df2 + " df3=" + this.df3);
        }
        sb2.append(" dm0=" + this.f99803dm0 + " db=" + this.f99800db + " c=" + this.f99799c + " minCallsR=" + this.minCallsR + " minCallsMask=" + this.minCallsMask + " hashSeed=" + this.hashSeed + " hashAlg=" + this.hashAlg + " oid=" + Arrays.toString(this.oid) + " sparse=" + this.sparse + ")");
        return sb2.toString();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.N);
        dataOutputStream.writeInt(this.f99805q);
        dataOutputStream.writeInt(this.f99801df);
        dataOutputStream.writeInt(this.df1);
        dataOutputStream.writeInt(this.df2);
        dataOutputStream.writeInt(this.df3);
        dataOutputStream.writeInt(this.f99800db);
        dataOutputStream.writeInt(this.f99803dm0);
        dataOutputStream.writeInt(this.f99799c);
        dataOutputStream.writeInt(this.minCallsR);
        dataOutputStream.writeInt(this.minCallsMask);
        dataOutputStream.writeBoolean(this.hashSeed);
        dataOutputStream.write(this.oid);
        dataOutputStream.writeBoolean(this.sparse);
        dataOutputStream.writeBoolean(this.fastFp);
        dataOutputStream.write(this.polyType);
        dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
    }

    public NTRUEncryptionKeyGenerationParameters clone() {
        return this.polyType == 0 ? new NTRUEncryptionKeyGenerationParameters(this.N, this.f99805q, this.f99801df, this.f99803dm0, this.f99800db, this.f99799c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg) : new NTRUEncryptionKeyGenerationParameters(this.N, this.f99805q, this.df1, this.df2, this.df3, this.f99803dm0, this.f99800db, this.f99799c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg);
    }

    public NTRUEncryptionKeyGenerationParameters(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, boolean z11, byte[] bArr, boolean z12, boolean z13, Digest digest) {
        super(new SecureRandom(), i17);
        this.N = i11;
        this.f99805q = i12;
        this.df1 = i13;
        this.df2 = i14;
        this.df3 = i15;
        this.f99800db = i17;
        this.f99803dm0 = i16;
        this.f99799c = i18;
        this.minCallsR = i19;
        this.minCallsMask = i21;
        this.hashSeed = z11;
        this.oid = bArr;
        this.sparse = z12;
        this.fastFp = z13;
        this.polyType = 1;
        this.hashAlg = digest;
        init();
    }

    public NTRUEncryptionKeyGenerationParameters(InputStream inputStream) throws IOException {
        super(new SecureRandom(), -1);
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.N = dataInputStream.readInt();
        this.f99805q = dataInputStream.readInt();
        this.f99801df = dataInputStream.readInt();
        this.df1 = dataInputStream.readInt();
        this.df2 = dataInputStream.readInt();
        this.df3 = dataInputStream.readInt();
        this.f99800db = dataInputStream.readInt();
        this.f99803dm0 = dataInputStream.readInt();
        this.f99799c = dataInputStream.readInt();
        this.minCallsR = dataInputStream.readInt();
        this.minCallsMask = dataInputStream.readInt();
        this.hashSeed = dataInputStream.readBoolean();
        byte[] bArr = new byte[3];
        this.oid = bArr;
        dataInputStream.readFully(bArr);
        this.sparse = dataInputStream.readBoolean();
        this.fastFp = dataInputStream.readBoolean();
        this.polyType = dataInputStream.read();
        String utf = dataInputStream.readUTF();
        if ("SHA-512".equals(utf)) {
            this.hashAlg = new SHA512Digest();
        } else if ("SHA-256".equals(utf)) {
            this.hashAlg = new SHA256Digest();
        }
        init();
    }
}
