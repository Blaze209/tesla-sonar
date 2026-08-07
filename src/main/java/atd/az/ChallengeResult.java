package atd.az;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResult {
    public static void getSDKReferenceNumber(byte[] bArr, byte b11, long j11) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (((1 << i11) & j11) != 0) {
                bArr[i11] = (byte) (bArr[i11] ^ b11);
            }
        }
    }
}
