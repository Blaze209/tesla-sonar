package atd.an;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.getAdditionalDetails;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.CertPathValidator;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.X509Certificate;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getMessageVersion {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;
    private static final CertificateFactory getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getDeviceData = 1;
        getSDKAppID();
        AudioTrack.getMinVolume();
        try {
            Object[] objArr = new Object[1];
            a("鷉\u00ad鶑嶔ꋋ囧\uf169ꇗ쑠", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, objArr);
            getSDKTransactionID = CertificateFactory.getInstance(((String) objArr[0]).intern());
            int i11 = getSDKReferenceNumber + 25;
            getDeviceData = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        } catch (CertificateException unused) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    public static X509Certificate AuthenticationRequestParameters(String str) throws Throwable {
        Object[] objArr = new Object[1];
        a("겖趑겻튑흙\udbd8繴푘\uf52b∧풌订\u1fff葛赙慖ꁣ\ueed7殽\ud8cc쪐ㅼ쇚빴ጒ鯠븤ᖈ뗛\ue278ᒔ쯟\ude43䒶촣ꅨ总꽘꯴ᣘ諃\uf1ab\r﹅퍵寐ﺫ嗁痯ꉃ圠\u0b46鸗ӡ൜\ue298⃫漈\ueba4堈", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, objArr);
        X509Certificate sDKAppID = getSDKAppID(new ByteArrayInputStream(String.format(((String) objArr[0]).intern(), str).getBytes(atd.a.AuthenticationRequestParameters.AuthenticationRequestParameters)));
        getSDKReferenceNumber = (getDeviceData + 11) % 128;
        return sDKAppID;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            $11 = ($10 + 55) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        getAdditionalDetails getadditionaldetails = new getAdditionalDetails();
        char[] deviceData = getAdditionalDetails.getDeviceData(getSDKAppID ^ 4326518537449951405L, charArray, i11);
        getadditionaldetails.getDeviceData = 4;
        while (true) {
            int i12 = getadditionaldetails.getDeviceData;
            if (i12 >= deviceData.length) {
                objArr[0] = new String(deviceData, 4, deviceData.length - 4);
                return;
            }
            $10 = ($11 + 43) % 128;
            int i13 = i12 - 4;
            getadditionaldetails.getSDKTransactionID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(deviceData[i12] ^ deviceData[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKAppID)};
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(2750 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (54837 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 29 - View.MeasureSpec.getSize(0));
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1401 - Color.alpha(0), (char) (TextUtils.lastIndexOf("", '0') + 16691), View.MeasureSpec.getSize(0) + 22);
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr4 = new Object[1];
                    b(b11, b12, b12, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-719904898, method2);
                }
                ((Method) method2).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    private static void b(byte b11, short s11, byte b12, Object[] objArr) {
        int i11 = (b11 * 3) + 4;
        byte[] bArr = $$a;
        int i12 = s11 * 3;
        int i13 = 101 - (b12 * 4);
        byte[] bArr2 = new byte[1 - i12];
        int i14 = 0 - i12;
        int i15 = -1;
        if (bArr == null) {
            i13 = (-i13) + i14;
            i11++;
            bArr = bArr;
            i15 = -1;
        }
        while (true) {
            int i16 = i15 + 1;
            bArr2[i16] = (byte) i13;
            if (i16 == i14) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i13 = (-bArr[i11]) + i13;
            i11++;
            bArr = bArr;
            i15 = i16;
        }
    }

    private static X509Certificate getSDKAppID(InputStream inputStream) throws Throwable {
        X509Certificate x509Certificate;
        Certificate certificateGenerateCertificate = getSDKTransactionID.generateCertificate(inputStream);
        if (!(certificateGenerateCertificate instanceof X509Certificate)) {
            Object[] objArr = new Object[1];
            a("怢꿦恡ɕ\udaa8裏껯\ud9f0㧛tѤ虷퍣ꘖ巘泄泻첁묍픚؍ጶᅽ뎥\udfd2릊滣ᡡ祲쀛쑝왇\u12b7曀ᶙ곝계赫签ᕥ䙆폷킣", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr);
            throw new CertificateException(((String) objArr[0]).intern());
        }
        int i11 = getDeviceData + 125;
        int i12 = i11 % 128;
        getSDKReferenceNumber = i12;
        if (i11 % 2 != 0) {
            x509Certificate = (X509Certificate) certificateGenerateCertificate;
            int i13 = 69 / 0;
        } else {
            x509Certificate = (X509Certificate) certificateGenerateCertificate;
        }
        int i14 = i12 + 91;
        getDeviceData = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 0 / 0;
        }
        return x509Certificate;
    }

    static void init$0() {
        $$a = new byte[]{82, 111, -78, -28};
        $$b = 175;
    }

    public static void AuthenticationRequestParameters(X509Certificate x509Certificate, List<X509Certificate> list) {
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            Object[] objArr = new Object[1];
            a("갉⇀걻䃶拺矋\uec51憢", (Process.getThreadPriority(0) + 20) >> 6, objArr);
            keyStore.setCertificateEntry(((String) objArr[0]).intern(), x509Certificate);
            PKIXParameters pKIXParameters = new PKIXParameters(keyStore);
            Object[] objArr2 = new Object[1];
            a("咆鄆哖⑺洿윩裻湋", ViewConfiguration.getFadingEdgeLength() >> 16, objArr2);
            CertPathValidator certPathValidator = CertPathValidator.getInstance(((String) objArr2[0]).intern());
            PKIXRevocationChecker pKIXRevocationChecker = (PKIXRevocationChecker) certPathValidator.getRevocationChecker();
            if (pKIXRevocationChecker.getOcspResponder() == null) {
                Object[] objArr3 = new Object[1];
                a("恐Ƽ怿ꢴ䌆垻Џ䁚㧮긺꺉Έ팀ࡗ\uf732\uf52e沅拚ᆙ䲈ٜ", ViewConfiguration.getKeyRepeatDelay() >> 16, objArr3);
                if (Security.getProperty(((String) objArr3[0]).intern()) == null) {
                    pKIXParameters.setRevocationEnabled(false);
                    getSDKReferenceNumber = (getDeviceData + 35) % 128;
                } else {
                    pKIXRevocationChecker.setOptions(EnumSet.of(PKIXRevocationChecker.Option.SOFT_FAIL));
                    pKIXParameters.addCertPathChecker(pKIXRevocationChecker);
                }
            } else {
                pKIXRevocationChecker.setOptions(EnumSet.of(PKIXRevocationChecker.Option.SOFT_FAIL));
                pKIXParameters.addCertPathChecker(pKIXRevocationChecker);
            }
            if (certPathValidator.validate(getSDKTransactionID.generateCertPath(list), pKIXParameters) != null) {
            } else {
                throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.getSDKTransactionID();
            }
        } catch (IOException | GeneralSecurityException unused) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    static void getSDKAppID() {
        getSDKAppID = 8703595892460717769L;
    }
}
