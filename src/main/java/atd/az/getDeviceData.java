package atd.az;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceData extends FilterInputStream {
    private final int AuthenticationRequestParameters;
    private byte[] BuildConfig;
    private byte[] ChallengeResult;
    private byte[] ChallengeResultCancelled;
    private int ChallengeResultCompleted;
    private int ChallengeResultError;
    private int ChallengeResultTimeout;
    private final int getDeviceData;
    private int[] getMessageVersion;
    private final int getSDKAppID;
    private int getSDKEphemeralPublicKey;
    private int getSDKReferenceNumber;
    private ChallengeResultCancelled getSDKTransactionID;

    public getDeviceData(InputStream inputStream, int[] iArr, byte[] bArr, int i11, boolean z11, int i12) {
        this(inputStream, iArr, bArr, i11, false, i12, (byte) 0);
    }

    private int getSDKAppID() throws IOException {
        if (this.ChallengeResultError == Integer.MAX_VALUE) {
            this.ChallengeResultError = ((FilterInputStream) this).in.read();
        }
        if (this.getSDKEphemeralPublicKey == 8) {
            byte[] bArr = this.ChallengeResultCancelled;
            int i11 = this.ChallengeResultError;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.ChallengeResultCancelled, i12, 8 - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < 8);
            if (i12 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i14 = this.AuthenticationRequestParameters;
            if (i14 == this.getSDKAppID) {
                getSDKReferenceNumber();
            } else {
                if (this.getSDKReferenceNumber <= i14) {
                    getSDKReferenceNumber();
                }
                int i15 = this.getSDKReferenceNumber;
                if (i15 < this.getSDKAppID) {
                    this.getSDKReferenceNumber = i15 + 1;
                } else {
                    this.getSDKReferenceNumber = 1;
                }
            }
            int i16 = ((FilterInputStream) this).in.read();
            this.ChallengeResultError = i16;
            this.getSDKEphemeralPublicKey = 0;
            this.ChallengeResultCompleted = i16 < 0 ? 8 - (this.ChallengeResultCancelled[7] & 255) : 8;
        }
        return this.ChallengeResultCompleted;
    }

    private void getSDKReferenceNumber() {
        if (this.ChallengeResultTimeout == 2) {
            byte[] bArr = this.ChallengeResultCancelled;
            System.arraycopy(bArr, 0, this.BuildConfig, 0, bArr.length);
        }
        byte[] bArr2 = this.ChallengeResultCancelled;
        int i11 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << Tnaf.POW_2_WIDTH) & 16711680) + ((bArr2[2] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) + (bArr2[3] & 255);
        int i12 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << Tnaf.POW_2_WIDTH)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i13 = this.getDeviceData;
        ChallengeResultCancelled challengeResultCancelled = this.getSDKTransactionID;
        getSDKEphemeralPublicKey.getSDKAppID(i11, i12, false, i13, challengeResultCancelled.getSDKReferenceNumber, challengeResultCancelled.getSDKAppID, this.getMessageVersion);
        int[] iArr = this.getMessageVersion;
        int i14 = iArr[0];
        int i15 = iArr[1];
        byte[] bArr3 = this.ChallengeResultCancelled;
        bArr3[0] = (byte) (i14 >> 24);
        bArr3[1] = (byte) (i14 >> 16);
        bArr3[2] = (byte) (i14 >> 8);
        bArr3[3] = (byte) i14;
        bArr3[4] = (byte) (i15 >> 24);
        bArr3[5] = (byte) (i15 >> 16);
        bArr3[6] = (byte) (i15 >> 8);
        bArr3[7] = (byte) i15;
        if (this.ChallengeResultTimeout == 2) {
            for (int i16 = 0; i16 < 8; i16++) {
                byte[] bArr4 = this.ChallengeResultCancelled;
                bArr4[i16] = (byte) (bArr4[i16] ^ this.ChallengeResult[i16]);
            }
            byte[] bArr5 = this.BuildConfig;
            System.arraycopy(bArr5, 0, this.ChallengeResult, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getSDKAppID();
        return this.ChallengeResultCompleted - this.getSDKEphemeralPublicKey;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getSDKAppID();
        int i11 = this.getSDKEphemeralPublicKey;
        if (i11 >= this.ChallengeResultCompleted) {
            return -1;
        }
        byte[] bArr = this.ChallengeResultCancelled;
        this.getSDKEphemeralPublicKey = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j11) {
        long j12 = 0;
        while (j12 < j11 && read() != -1) {
            j12++;
        }
        return j12;
    }

    private getDeviceData(InputStream inputStream, int[] iArr, byte[] bArr, int i11, boolean z11, int i12, byte b11) {
        super(new BufferedInputStream(inputStream, 4096));
        this.getSDKReferenceNumber = 1;
        this.ChallengeResultError = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i11, 3), 16);
        this.getDeviceData = iMin;
        this.ChallengeResultCancelled = new byte[8];
        byte[] bArr2 = new byte[8];
        this.ChallengeResult = bArr2;
        this.BuildConfig = new byte[8];
        this.getMessageVersion = new int[2];
        this.getSDKEphemeralPublicKey = 8;
        this.ChallengeResultCompleted = 8;
        this.ChallengeResultTimeout = i12;
        if (i12 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.getSDKTransactionID = new ChallengeResultCancelled(iArr, iMin, true, z11);
        this.AuthenticationRequestParameters = 100;
        this.getSDKAppID = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            getSDKAppID();
            int i15 = this.getSDKEphemeralPublicKey;
            if (i15 >= this.ChallengeResultCompleted) {
                if (i14 == i11) {
                    return -1;
                }
                return i12 - (i13 - i14);
            }
            byte[] bArr2 = this.ChallengeResultCancelled;
            this.getSDKEphemeralPublicKey = i15 + 1;
            bArr[i14] = bArr2[i15];
        }
        return i12;
    }
}
