package atd.ak;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.getAdditionalDetails;
import com.adyen.threeds2.exception.SDKRuntimeException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int getSDKAppID;
    private getSDKAppID getDeviceData;
    private getSDKTransactionID getSDKReferenceNumber;
    private getSDKReferenceNumber getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        BuildConfig = 1;
        getSDKTransactionID();
        TextUtils.indexOf("", "");
        int i11 = BuildConfig + 91;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 23 / 0;
        }
    }

    private AuthenticationRequestParameters(getSDKReferenceNumber getsdkreferencenumber, getSDKTransactionID getsdktransactionid, getSDKAppID getsdkappid) {
        this.getSDKTransactionID = getsdkreferencenumber;
        this.getSDKReferenceNumber = getsdktransactionid;
        this.getDeviceData = getsdkappid;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        int i12 = $10 + 7;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        getAdditionalDetails getadditionaldetails = new getAdditionalDetails();
        char[] deviceData = getAdditionalDetails.getDeviceData(AuthenticationRequestParameters ^ 4326518537449951405L, charArray, i11);
        getadditionaldetails.getDeviceData = 4;
        while (true) {
            int i13 = getadditionaldetails.getDeviceData;
            if (i13 >= deviceData.length) {
                objArr[0] = new String(deviceData, 4, deviceData.length - 4);
                return;
            }
            $11 = ($10 + 41) % 128;
            int i14 = i13 - 4;
            getadditionaldetails.getSDKTransactionID = i14;
            try {
                Object[] objArr2 = {Long.valueOf(deviceData[i13] ^ deviceData[i13 % 4]), Long.valueOf(i14), Long.valueOf(AuthenticationRequestParameters)};
                Map map = getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(2748 - TextUtils.indexOf((CharSequence) "", '0'), (char) (54838 - View.MeasureSpec.makeMeasureSpec(0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 29);
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(1401 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (16690 - Color.blue(0)), 22 - KeyEvent.getDeadChar(0, 0));
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr4 = new Object[1];
                    b(b11, b12, b12, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-719904898, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                $10 = ($11 + 67) % 128;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 2
            int r9 = r9 + 101
            byte[] r0 = atd.ak.AuthenticationRequestParameters.$$a
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2c:
            int r3 = -r3
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ak.AuthenticationRequestParameters.b(short, short, int, java.lang.Object[]):void");
    }

    public static AuthenticationRequestParameters getDeviceData(String str, List<atd.ae.AuthenticationRequestParameters> list) throws Throwable {
        Object[] objArr = new Object[1];
        a("ࢽ࣡텙䀞刳땘", (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr);
        String[] strArrSplit = str.split(((String) objArr[0]).intern());
        if (strArrSplit.length != 3) {
            getSDKAppID = (BuildConfig + 69) % 128;
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.getSDKTransactionID();
        }
        AuthenticationRequestParameters authenticationRequestParameters = new AuthenticationRequestParameters(new getSDKReferenceNumber(strArrSplit[0], list), new getSDKTransactionID(strArrSplit[1]), new getSDKAppID(strArrSplit[2]));
        int i11 = getSDKAppID + 43;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            return authenticationRequestParameters;
        }
        throw null;
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i14 = (getSDKAppID + 13) % 128;
        BuildConfig = i14;
        getSDKTransactionID getsdktransactionid = authenticationRequestParameters.getSDKReferenceNumber;
        getSDKAppID = (i14 + 29) % 128;
        return getsdktransactionid;
    }

    static void init$0() {
        $$a = new byte[]{81, -98, -48, -128};
        $$b = 58;
    }

    public final void getSDKAppID(List<X509Certificate> list) throws Throwable {
        BuildConfig = (getSDKAppID + 103) % 128;
        List<X509Certificate> sDKAppID = this.getSDKTransactionID.getSDKAppID();
        if (!Collections.disjoint(list, sDKAppID)) {
            BuildConfig = (getSDKAppID + 105) % 128;
            try {
                getSDKTransactionID(sDKAppID.get(sDKAppID.size() - 1));
                return;
            } catch (SDKRuntimeException unused) {
            }
        }
        Iterator<X509Certificate> it = list.iterator();
        while (it.hasNext()) {
            try {
                getSDKTransactionID(it.next());
                return;
            } catch (SDKRuntimeException unused2) {
            }
        }
        throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.getSDKTransactionID();
    }

    public final getSDKTransactionID getSDKReferenceNumber() {
        return (getSDKTransactionID) getSDKTransactionID(new Object[]{this}, -465202534, 465202534, System.identityHashCode(this));
    }

    public final void getSDKTransactionID(X509Certificate x509Certificate) throws Throwable {
        getSDKAppID = (BuildConfig + 119) % 128;
        atd.an.getMessageVersion.AuthenticationRequestParameters(x509Certificate, this.getSDKTransactionID.getSDKAppID());
        byte[] sDKTransactionID = getSDKTransactionID(this.getSDKTransactionID.getSDKReferenceNumber(), this.getSDKReferenceNumber.getSDKReferenceNumber());
        try {
            if (this.getSDKTransactionID.AuthenticationRequestParameters().getSDKReferenceNumber(this.getDeviceData.BuildConfig(), sDKTransactionID, this.getSDKTransactionID.getSDKAppID().get(0).getPublicKey())) {
                getSDKAppID = (BuildConfig + 53) % 128;
                return;
            }
            int i11 = BuildConfig + 1;
            getSDKAppID = i11 % 128;
            if (i11 % 2 == 0) {
                throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.getSDKTransactionID();
            }
            atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.getSDKTransactionID();
            throw null;
        } catch (GeneralSecurityException unused) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    public final void getSDKAppID() {
        int i11 = (BuildConfig + 33) % 128;
        getSDKAppID = i11;
        getSDKReferenceNumber getsdkreferencenumber = this.getSDKTransactionID;
        if (getsdkreferencenumber != null) {
            int i12 = i11 + 93;
            BuildConfig = i12 % 128;
            if (i12 % 2 != 0) {
                getsdkreferencenumber.getDeviceData();
                this.getSDKTransactionID = null;
                BuildConfig = (getSDKAppID + 55) % 128;
            } else {
                getsdkreferencenumber.getDeviceData();
                this.getSDKTransactionID = null;
                throw null;
            }
        }
        getSDKTransactionID getsdktransactionid = this.getSDKReferenceNumber;
        if (getsdktransactionid != null) {
            BuildConfig = (getSDKAppID + 55) % 128;
            getsdktransactionid.getDeviceData();
            this.getSDKReferenceNumber = null;
        }
        getSDKAppID getsdkappid = this.getDeviceData;
        if (getsdkappid != null) {
            getsdkappid.getDeviceData();
            this.getDeviceData = null;
        }
    }

    private static byte[] getSDKTransactionID(String str, String str2) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        Object[] objArr = new Object[1];
        a("晌晢䈌⁒\ueffa", 1 - TextUtils.getCapsMode("", 0, 0), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(str2);
        byte[] bytes = sb2.toString().getBytes(atd.a.AuthenticationRequestParameters.AuthenticationRequestParameters);
        int i11 = getSDKAppID + 105;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            return bytes;
        }
        throw null;
    }

    static void getSDKTransactionID() {
        AuthenticationRequestParameters = 7906153654385983940L;
    }
}
