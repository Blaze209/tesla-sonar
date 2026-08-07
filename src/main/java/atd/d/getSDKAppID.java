package atd.d;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getSDKAppID {
    static final int AuthenticationRequestParameters;
    private static int getSDKAppID = 0;
    static final int getSDKReferenceNumber;
    private static int getSDKTransactionID = 1;
    private final getSDKReferenceNumber getDeviceData = new ChallengeResultCancelled();

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        getSDKReferenceNumber = (int) timeUnit.toMillis(60L);
        AuthenticationRequestParameters = (int) timeUnit.toMillis(60L);
        int i11 = getSDKAppID;
        int i12 = i11 & 107;
        getSDKTransactionID = (i12 + ((i11 ^ 107) | i12)) % 128;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) objArr[0];
        ChallengeResultCompleted.getSDKReferenceNumber sDKTransactionID = new ChallengeResultCompleted.getSDKReferenceNumber().getSDKTransactionID(httpURLConnection.getResponseCode());
        ChallengeResultCompleted.getSDKReferenceNumber getsdkreferencenumberAuthenticationRequestParameters = ((ChallengeResultCompleted.getSDKReferenceNumber) ChallengeResultCompleted.getSDKReferenceNumber.getSDKTransactionID(new Object[]{sDKTransactionID, httpURLConnection.getHeaderFields()}, -1999070795, 1999070795, System.identityHashCode(sDKTransactionID))).AuthenticationRequestParameters(httpURLConnection.getResponseMessage());
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            int i11 = getSDKAppID + 71;
            getSDKTransactionID = i11 % 128;
            if (i11 % 2 == 0) {
                httpURLConnection.getInputStream();
                throw null;
            }
            errorStream = httpURLConnection.getInputStream();
            int i12 = getSDKAppID;
            int i13 = i12 ^ 121;
            int i14 = (i12 & 121) << 1;
            getSDKTransactionID = ((i13 & i14) + (i14 | i13)) % 128;
        }
        getsdkreferencenumberAuthenticationRequestParameters.getSDKTransactionID((byte[]) getSDKTransactionID(new Object[]{errorStream}, -1383148608, 1383148611, (int) System.currentTimeMillis()));
        ChallengeResultCompleted challengeResultCompletedAuthenticationRequestParameters = getsdkreferencenumberAuthenticationRequestParameters.AuthenticationRequestParameters();
        int i15 = getSDKAppID;
        int i16 = i15 & 53;
        int i17 = -(-((i15 ^ 53) | i16));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        getSDKTransactionID = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 77 / 0;
        }
        return challengeResultCompletedAuthenticationRequestParameters;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) throws ProtocolException {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[1];
        int i11 = getSDKAppID;
        int i12 = i11 & 33;
        int i13 = -(-((i11 ^ 33) | i12));
        getSDKTransactionID = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
        HttpURLConnection deviceData = getsdkappid.getDeviceData.getDeviceData((String) getTransactionStatus.getSDKReferenceNumber(new Object[]{gettransactionstatus}, -701491070, 701491071, System.identityHashCode(gettransactionstatus)));
        deviceData.setRequestMethod(((ChallengeResult) getTransactionStatus.getSDKReferenceNumber(new Object[]{gettransactionstatus}, -1520224174, 1520224177, System.identityHashCode(gettransactionstatus))).getDeviceData());
        deviceData.setConnectTimeout(getsdkappid.getSDKReferenceNumber());
        deviceData.setReadTimeout(getsdkappid.getDeviceData());
        deviceData.setUseCaches(false);
        deviceData.setDoInput(true);
        deviceData.setDoOutput(((ChallengeResult) getTransactionStatus.getSDKReferenceNumber(new Object[]{gettransactionstatus}, -1520224174, 1520224177, System.identityHashCode(gettransactionstatus))).AuthenticationRequestParameters());
        Map map = (Map) getTransactionStatus.getSDKReferenceNumber(new Object[]{gettransactionstatus}, -194309084, 194309084, System.identityHashCode(gettransactionstatus));
        if (map != null) {
            int i14 = getSDKTransactionID;
            int i15 = i14 & 71;
            int i16 = i15 + ((i14 ^ 71) | i15);
            getSDKAppID = i16 % 128;
            if (i16 % 2 != 0) {
                map.entrySet().iterator();
                throw null;
            }
            getSDKAppID = (getSDKTransactionID + 115) % 128;
            for (Map.Entry entry : map.entrySet()) {
                getSDKTransactionID = (getSDKAppID + 29) % 128;
                String str = (String) entry.getKey();
                Iterator it = ((List) entry.getValue()).iterator();
                int i17 = getSDKAppID;
                getSDKTransactionID = ((i17 ^ 109) + ((i17 & 109) << 1)) % 128;
                while (it.hasNext()) {
                    int i18 = getSDKTransactionID;
                    int i19 = (i18 & 53) + (i18 | 53);
                    getSDKAppID = i19 % 128;
                    if (i19 % 2 != 0) {
                        deviceData.addRequestProperty(str, (String) it.next());
                        int i21 = 0 / 0;
                    } else {
                        deviceData.addRequestProperty(str, (String) it.next());
                    }
                }
                int i22 = getSDKTransactionID;
                int i23 = i22 & 27;
                int i24 = (i22 ^ 27) | i23;
                getSDKAppID = ((i23 & i24) + (i24 | i23)) % 128;
            }
        }
        int i25 = getSDKAppID;
        int i26 = (i25 & 65) + (i25 | 65);
        getSDKTransactionID = i26 % 128;
        if (i26 % 2 != 0) {
            return deviceData;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) throws Throwable {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[1];
        int i11 = getSDKAppID;
        int i12 = i11 & 87;
        int i13 = ((i11 ^ 87) | i12) << 1;
        int i14 = -((i11 | 87) & (~i12));
        getSDKTransactionID = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) getSDKTransactionID(new Object[]{getsdkappid, gettransactionstatus}, -1661561125, 1661561125, System.identityHashCode(getsdkappid));
            try {
                httpURLConnection2.connect();
                if (((ChallengeResult) getTransactionStatus.getSDKReferenceNumber(new Object[]{gettransactionstatus}, -1520224174, 1520224177, System.identityHashCode(gettransactionstatus))).AuthenticationRequestParameters()) {
                    int i15 = getSDKAppID + 104;
                    int i16 = (i15 ^ (-1)) + (i15 << 1);
                    getSDKTransactionID = i16 % 128;
                    if (i16 % 2 == 0) {
                        OutputStream outputStream = httpURLConnection2.getOutputStream();
                        outputStream.write((byte[]) getTransactionStatus.getSDKReferenceNumber(new Object[]{gettransactionstatus}, -857678302, 857678304, System.identityHashCode(gettransactionstatus)));
                        outputStream.flush();
                        outputStream.close();
                        int i17 = 68 / 0;
                    } else {
                        OutputStream outputStream2 = httpURLConnection2.getOutputStream();
                        outputStream2.write((byte[]) getTransactionStatus.getSDKReferenceNumber(new Object[]{gettransactionstatus}, -857678302, 857678304, System.identityHashCode(gettransactionstatus)));
                        outputStream2.flush();
                        outputStream2.close();
                    }
                    int i18 = getSDKAppID;
                    int i19 = i18 & 3;
                    int i21 = (i18 | 3) & (~i19);
                    int i22 = i19 << 1;
                    getSDKTransactionID = ((i21 & i22) + (i21 | i22)) % 128;
                }
                ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) getSDKTransactionID(new Object[]{httpURLConnection2}, -1695955095, 1695955097, (int) System.currentTimeMillis());
                int i23 = getSDKTransactionID;
                int i24 = ((i23 ^ 53) | (i23 & 53)) << 1;
                int i25 = -(((~i23) & 53) | (i23 & (-54)));
                getSDKAppID = ((i24 ^ i25) + ((i25 & i24) << 1)) % 128;
                httpURLConnection2.disconnect();
                int i26 = getSDKTransactionID;
                int i27 = (i26 & (-56)) | ((~i26) & 55);
                int i28 = -(-((i26 & 55) << 1));
                getSDKAppID = (((i27 | i28) << 1) - (i28 ^ i27)) % 128;
                return challengeResultCompleted;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    int i29 = getSDKAppID;
                    getSDKTransactionID = (((i29 & 125) - (~(-(-(i29 | 125))))) - 1) % 128;
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) throws IOException {
        InputStream inputStream = (InputStream) objArr[0];
        int i11 = getSDKAppID;
        getSDKTransactionID = ((i11 & 41) + (i11 | 41)) % 128;
        if (inputStream == null) {
            int i12 = (i11 ^ 73) + ((i11 & 73) << 1);
            getSDKTransactionID = i12 % 128;
            if (i12 % 2 != 0) {
                return null;
            }
            throw null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int i13 = getSDKTransactionID;
        getSDKAppID = ((i13 ^ 25) + ((i13 & 25) << 1)) % 128;
        for (int i14 = inputStream.read(bArr); i14 > 0; i14 = inputStream.read(bArr)) {
            int i15 = getSDKTransactionID;
            int i16 = (i15 & (-88)) | ((~i15) & 87);
            int i17 = -(-((i15 & 87) << 1));
            int i18 = (i16 & i17) + (i17 | i16);
            getSDKAppID = i18 % 128;
            if (i18 % 2 != 0) {
                byteArrayOutputStream.write(bArr, 1, i14);
            } else {
                byteArrayOutputStream.write(bArr, 0, i14);
            }
        }
        inputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i19 = getSDKTransactionID;
        int i21 = i19 ^ 45;
        getSDKAppID = ((((i19 & 45) | i21) << 1) - i21) % 128;
        return byteArray;
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (i11 * (-103)) + (i12 * (-103)) + (((~(i14 | i15)) | (~(i15 | i13))) * 104) + ((~(i12 | (~i13) | i11)) * (-104)) + ((i11 | i13) * 104);
        if (i16 == 1) {
            return getSDKAppID(objArr);
        }
        if (i16 != 2) {
            return i16 != 3 ? getDeviceData(objArr) : getSDKReferenceNumber(objArr);
        }
        return AuthenticationRequestParameters(objArr);
    }

    protected abstract int getDeviceData();

    protected abstract int getSDKReferenceNumber();

    private static ChallengeResultCompleted getSDKTransactionID(HttpURLConnection httpURLConnection) {
        return (ChallengeResultCompleted) getSDKTransactionID(new Object[]{httpURLConnection}, -1695955095, 1695955097, (int) System.currentTimeMillis());
    }

    private HttpURLConnection getSDKTransactionID(getTransactionStatus gettransactionstatus) {
        return (HttpURLConnection) getSDKTransactionID(new Object[]{this, gettransactionstatus}, -1661561125, 1661561125, System.identityHashCode(this));
    }

    protected final ChallengeResultCompleted AuthenticationRequestParameters(getTransactionStatus gettransactionstatus) {
        return (ChallengeResultCompleted) getSDKTransactionID(new Object[]{this, gettransactionstatus}, -654258492, 654258493, System.identityHashCode(this));
    }

    private static byte[] getSDKReferenceNumber(InputStream inputStream) {
        return (byte[]) getSDKTransactionID(new Object[]{inputStream}, -1383148608, 1383148611, (int) System.currentTimeMillis());
    }
}
