package atd.ak;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.ae.getDeviceData;
import atd.am.ChallengeResultCancelled;
import atd.an.BuildConfig;
import atd.an.getMessageVersion;
import atd.az.ChallengeResultError;
import atd.json.ChallengeResultTimeout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKReferenceNumber extends BuildConfig {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static char[] getSDKTransactionID;
    private atd.ae.AuthenticationRequestParameters AuthenticationRequestParameters;
    private List<X509Certificate> getDeviceData;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getSDKAppID = 1;
        getSDKTransactionID = new char[]{30895, 31010, 31012, 30882, 31016, 31026};
    }

    getSDKReferenceNumber(String str, List<atd.ae.AuthenticationRequestParameters> list) {
        super(str, ChallengeResultCancelled.JWS_HEADER_NOT_BASE64URL_ENCODED);
        try {
            JSONObject messageVersion = getMessageVersion();
            Object[] objArr = new Object[1];
            a("\u0000\u0001\u0000", new int[]{0, 3, 182, 2}, true, objArr);
            this.AuthenticationRequestParameters = (atd.ae.AuthenticationRequestParameters) getDeviceData.getSDKAppID(new Object[]{messageVersion.getString(((String) objArr[0]).intern()), list}, 911371195, -911371195, (int) System.currentTimeMillis());
            this.getDeviceData = new ArrayList();
            Object[] objArr2 = new Object[1];
            a("\u0000\u0001\u0000", new int[]{3, 3, 192, 0}, false, objArr2);
            JSONArray jSONArray = messageVersion.getJSONArray(((String) objArr2[0]).intern());
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                this.getDeviceData.add(getMessageVersion.AuthenticationRequestParameters(jSONArray.getString(i11)));
            }
        } catch (CertificateException | JSONException unused) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        float f11;
        int i11;
        Class<Object> cls;
        Object method;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        String str3 = "";
        Object bytes = str2;
        if (str2 != null) {
            int i12 = $11 + 59;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                str2.getBytes("ISO-8859-1");
                throw null;
            }
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        ChallengeResultError challengeResultError = new ChallengeResultError();
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        char[] cArr = getSDKTransactionID;
        Class cls3 = Integer.TYPE;
        int i17 = 1;
        if (cArr != null) {
            f11 = BitmapDescriptorFactory.HUE_RED;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i18 = 0;
            while (i18 < length) {
                try {
                    int i19 = i18;
                    Object[] objArr2 = {Integer.valueOf(cArr[i18])};
                    char[] cArr3 = cArr;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1708792688);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - TextUtils.indexOf(str3, str3, 0, 0), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 + 2);
                        Object[] objArr3 = new Object[i17];
                        b(b11, b12, (byte) (b12 - 2), objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr2[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i18 = i19 + 1;
                    cArr = cArr3;
                    length = length;
                    cArr2 = cArr2;
                    i15 = i15;
                    str3 = str3;
                    i16 = i16;
                    cls2 = cls2;
                    i17 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        } else {
            f11 = BitmapDescriptorFactory.HUE_RED;
        }
        Class<Object> cls5 = cls2;
        int i21 = i15;
        int i22 = i16;
        char[] cArr4 = new char[i14];
        System.arraycopy(cArr, i13, cArr4, 0, i14);
        if (bArr != 0) {
            char[] cArr5 = new char[i14];
            challengeResultError.getSDKAppID = 0;
            char c11 = 0;
            while (true) {
                int i23 = challengeResultError.getSDKAppID;
                if (i23 >= i14) {
                    break;
                }
                if (bArr[i23] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr4[i23]), Integer.valueOf(c11)};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(10570995);
                    if (method2 == null) {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(558 - (Process.myPid() >> 22), (char) (5486 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 23 - (ViewConfiguration.getScrollBarSize() >> 8));
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 + 3);
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 - 3), objArr5);
                        method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                        map2.put(10570995, method2);
                    }
                    cArr5[i23] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    cArr4 = cArr4;
                    Object[] objArr6 = {Integer.valueOf(cArr4[i23]), Integer.valueOf(c11)};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-502074319);
                    if (method3 == null) {
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionChild(0L) + EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, (char) View.resolveSize(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 24)).getMethod("a", cls3, cls3);
                        map3.put(-502074319, method3);
                    }
                    cArr5[i23] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c11 = cArr5[challengeResultError.getSDKAppID];
                Object[] objArr7 = {challengeResultError, challengeResultError};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-399400818);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    float f12 = f11;
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(854 - (PointF.length(f12, f12) > f12 ? 1 : (PointF.length(f12, f12) == f12 ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8), (Process.myTid() >> 22) + 24);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, b16, objArr8);
                    String str4 = (String) objArr8[0];
                    cls = cls5;
                    method4 = cls7.getMethod(str4, cls, cls);
                    map4.put(-399400818, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                cls5 = cls;
                cArr4 = cArr4;
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            cArr4 = cArr5;
        }
        if (i22 > 0) {
            int i24 = $11 + 73;
            $10 = i24 % 128;
            if (i24 % 2 != 0) {
                char[] cArr6 = new char[i14];
                i11 = 0;
                System.arraycopy(cArr4, 1, cArr6, 0, i14);
                System.arraycopy(cArr6, 0, cArr4, i14 >> i22, i22);
                System.arraycopy(cArr6, i22, cArr4, 0, i14 >>> i22);
            } else {
                i11 = 0;
                char[] cArr7 = new char[i14];
                System.arraycopy(cArr4, 0, cArr7, 0, i14);
                int i25 = i14 - i22;
                System.arraycopy(cArr7, 0, cArr4, i25, i22);
                System.arraycopy(cArr7, i22, cArr4, 0, i25);
            }
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr8 = new char[i14];
            challengeResultError.getSDKAppID = i11;
            while (true) {
                int i26 = challengeResultError.getSDKAppID;
                if (i26 >= i14) {
                    break;
                }
                cArr8[i26] = cArr4[(i14 - i26) - 1];
                challengeResultError.getSDKAppID = i26 + 1;
            }
            cArr4 = cArr8;
        }
        if (i21 > 0) {
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i27 = challengeResultError.getSDKAppID;
                if (i27 >= i14) {
                    break;
                }
                cArr4[i27] = (char) (cArr4[i27] - iArr[2]);
                challengeResultError.getSDKAppID = i27 + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 104 - r7
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = atd.ak.getSDKReferenceNumber.$$a
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r8
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r8]
            r5 = r1
            r1 = r8
            r8 = r3
            r3 = r5
        L2d:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r1 + 1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ak.getSDKReferenceNumber.b(int, byte, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{101, 29, 75, 23};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE;
    }

    public final atd.ae.AuthenticationRequestParameters AuthenticationRequestParameters() {
        int i11 = getSDKReferenceNumber;
        atd.ae.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
        int i12 = i11 + 79;
        getSDKAppID = i12 % 128;
        if (i12 % 2 != 0) {
            return authenticationRequestParameters;
        }
        throw null;
    }

    @Override // atd.an.BuildConfig
    public final void getDeviceData() {
        Iterator<X509Certificate> it;
        getSDKAppID = (getSDKReferenceNumber + 117) % 128;
        super.getDeviceData();
        this.AuthenticationRequestParameters = null;
        List<X509Certificate> list = this.getDeviceData;
        if (list != null) {
            int i11 = getSDKAppID + 63;
            getSDKReferenceNumber = i11 % 128;
            if (i11 % 2 != 0) {
                it = list.iterator();
                int i12 = 36 / 0;
            } else {
                it = list.iterator();
            }
            while (it.hasNext()) {
                getSDKReferenceNumber = (getSDKAppID + 91) % 128;
                ChallengeResultTimeout.AuthenticationRequestParameters(new Object[]{it.next()}, 93345123, -93345123, (int) System.currentTimeMillis());
            }
            this.getDeviceData.clear();
            this.getDeviceData = null;
        }
    }

    public final List<X509Certificate> getSDKAppID() {
        ArrayList arrayList = new ArrayList(this.getDeviceData);
        int i11 = getSDKAppID + 77;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }
}
