package atd.d;

import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes3.dex */
final class ChallengeResultCancelled extends getSDKReferenceNumber {
    private static int getDeviceData = 0;
    private static int getSDKReferenceNumber = 1;

    ChallengeResultCancelled() {
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) objArr[1];
        int i14 = getSDKReferenceNumber;
        int i15 = i14 & 73;
        int i16 = i14 | 73;
        getDeviceData = (((i15 | i16) << 1) - (i16 ^ i15)) % 128;
        return httpURLConnection;
    }

    @Override // atd.d.getSDKReferenceNumber
    final HttpURLConnection getSDKAppID(HttpURLConnection httpURLConnection) {
        return (HttpURLConnection) AuthenticationRequestParameters(new Object[]{this, httpURLConnection}, -120485315, 120485315, System.identityHashCode(this));
    }
}
