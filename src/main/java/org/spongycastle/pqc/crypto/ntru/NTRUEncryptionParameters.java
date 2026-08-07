package org.spongycastle.pqc.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;

/* JADX INFO: loaded from: classes10.dex */
public class NTRUEncryptionParameters implements Cloneable {
    public int N;
    public int bufferLenBits;
    int bufferLenTrits;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f99806c;

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    public int f99807db;

    /* JADX INFO: renamed from: df, reason: collision with root package name */
    public int f99808df;
    public int df1;
    public int df2;
    public int df3;

    /* JADX INFO: renamed from: dg, reason: collision with root package name */
    public int f99809dg;

    /* JADX INFO: renamed from: dm0, reason: collision with root package name */
    public int f99810dm0;

    /* JADX INFO: renamed from: dr, reason: collision with root package name */
    public int f99811dr;
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
    public int f99812q;
    public boolean sparse;

    public NTRUEncryptionParameters(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11, byte[] bArr, boolean z12, boolean z13, Digest digest) {
        this.N = i11;
        this.f99812q = i12;
        this.f99808df = i13;
        this.f99807db = i15;
        this.f99810dm0 = i14;
        this.f99806c = i16;
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
        this.f99811dr = this.f99808df;
        this.dr1 = this.df1;
        this.dr2 = this.df2;
        this.dr3 = this.df3;
        int i11 = this.N;
        this.f99809dg = i11 / 3;
        this.llen = 1;
        int i12 = this.f99807db;
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
        NTRUEncryptionParameters nTRUEncryptionParameters = (NTRUEncryptionParameters) obj;
        if (this.N != nTRUEncryptionParameters.N || this.bufferLenBits != nTRUEncryptionParameters.bufferLenBits || this.bufferLenTrits != nTRUEncryptionParameters.bufferLenTrits || this.f99806c != nTRUEncryptionParameters.f99806c || this.f99807db != nTRUEncryptionParameters.f99807db || this.f99808df != nTRUEncryptionParameters.f99808df || this.df1 != nTRUEncryptionParameters.df1 || this.df2 != nTRUEncryptionParameters.df2 || this.df3 != nTRUEncryptionParameters.df3 || this.f99809dg != nTRUEncryptionParameters.f99809dg || this.f99810dm0 != nTRUEncryptionParameters.f99810dm0 || this.f99811dr != nTRUEncryptionParameters.f99811dr || this.dr1 != nTRUEncryptionParameters.dr1 || this.dr2 != nTRUEncryptionParameters.dr2 || this.dr3 != nTRUEncryptionParameters.dr3 || this.fastFp != nTRUEncryptionParameters.fastFp) {
            return false;
        }
        Digest digest = this.hashAlg;
        if (digest == null) {
            if (nTRUEncryptionParameters.hashAlg != null) {
                return false;
            }
        } else if (!digest.getAlgorithmName().equals(nTRUEncryptionParameters.hashAlg.getAlgorithmName())) {
            return false;
        }
        return this.hashSeed == nTRUEncryptionParameters.hashSeed && this.llen == nTRUEncryptionParameters.llen && this.maxMsgLenBytes == nTRUEncryptionParameters.maxMsgLenBytes && this.minCallsMask == nTRUEncryptionParameters.minCallsMask && this.minCallsR == nTRUEncryptionParameters.minCallsR && Arrays.equals(this.oid, nTRUEncryptionParameters.oid) && this.pkLen == nTRUEncryptionParameters.pkLen && this.polyType == nTRUEncryptionParameters.polyType && this.f99812q == nTRUEncryptionParameters.f99812q && this.sparse == nTRUEncryptionParameters.sparse;
    }

    public int getMaxMessageLength() {
        return this.maxMsgLenBytes;
    }

    public int hashCode() {
        int i11 = (((((((((((((((((((((((((((((((this.N + 31) * 31) + this.bufferLenBits) * 31) + this.bufferLenTrits) * 31) + this.f99806c) * 31) + this.f99807db) * 31) + this.f99808df) * 31) + this.df1) * 31) + this.df2) * 31) + this.df3) * 31) + this.f99809dg) * 31) + this.f99810dm0) * 31) + this.f99811dr) * 31) + this.dr1) * 31) + this.dr2) * 31) + this.dr3) * 31) + (this.fastFp ? 1231 : 1237)) * 31;
        Digest digest = this.hashAlg;
        return ((((((((((((((((((((i11 + (digest == null ? 0 : digest.getAlgorithmName().hashCode())) * 31) + (this.hashSeed ? 1231 : 1237)) * 31) + this.llen) * 31) + this.maxMsgLenBytes) * 31) + this.minCallsMask) * 31) + this.minCallsR) * 31) + Arrays.hashCode(this.oid)) * 31) + this.pkLen) * 31) + this.polyType) * 31) + this.f99812q) * 31) + (this.sparse ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EncryptionParameters(N=" + this.N + " q=" + this.f99812q);
        if (this.polyType == 0) {
            sb2.append(" polyType=SIMPLE df=" + this.f99808df);
        } else {
            sb2.append(" polyType=PRODUCT df1=" + this.df1 + " df2=" + this.df2 + " df3=" + this.df3);
        }
        sb2.append(" dm0=" + this.f99810dm0 + " db=" + this.f99807db + " c=" + this.f99806c + " minCallsR=" + this.minCallsR + " minCallsMask=" + this.minCallsMask + " hashSeed=" + this.hashSeed + " hashAlg=" + this.hashAlg + " oid=" + Arrays.toString(this.oid) + " sparse=" + this.sparse + ")");
        return sb2.toString();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.N);
        dataOutputStream.writeInt(this.f99812q);
        dataOutputStream.writeInt(this.f99808df);
        dataOutputStream.writeInt(this.df1);
        dataOutputStream.writeInt(this.df2);
        dataOutputStream.writeInt(this.df3);
        dataOutputStream.writeInt(this.f99807db);
        dataOutputStream.writeInt(this.f99810dm0);
        dataOutputStream.writeInt(this.f99806c);
        dataOutputStream.writeInt(this.minCallsR);
        dataOutputStream.writeInt(this.minCallsMask);
        dataOutputStream.writeBoolean(this.hashSeed);
        dataOutputStream.write(this.oid);
        dataOutputStream.writeBoolean(this.sparse);
        dataOutputStream.writeBoolean(this.fastFp);
        dataOutputStream.write(this.polyType);
        dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
    }

    public NTRUEncryptionParameters clone() {
        return this.polyType == 0 ? new NTRUEncryptionParameters(this.N, this.f99812q, this.f99808df, this.f99810dm0, this.f99807db, this.f99806c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg) : new NTRUEncryptionParameters(this.N, this.f99812q, this.df1, this.df2, this.df3, this.f99810dm0, this.f99807db, this.f99806c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, this.hashAlg);
    }

    public NTRUEncryptionParameters(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, boolean z11, byte[] bArr, boolean z12, boolean z13, Digest digest) {
        this.N = i11;
        this.f99812q = i12;
        this.df1 = i13;
        this.df2 = i14;
        this.df3 = i15;
        this.f99807db = i17;
        this.f99810dm0 = i16;
        this.f99806c = i18;
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

    public NTRUEncryptionParameters(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.N = dataInputStream.readInt();
        this.f99812q = dataInputStream.readInt();
        this.f99808df = dataInputStream.readInt();
        this.df1 = dataInputStream.readInt();
        this.df2 = dataInputStream.readInt();
        this.df3 = dataInputStream.readInt();
        this.f99807db = dataInputStream.readInt();
        this.f99810dm0 = dataInputStream.readInt();
        this.f99806c = dataInputStream.readInt();
        this.minCallsR = dataInputStream.readInt();
        this.minCallsMask = dataInputStream.readInt();
        this.hashSeed = dataInputStream.readBoolean();
        byte[] bArr = new byte[3];
        this.oid = bArr;
        dataInputStream.read(bArr);
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
