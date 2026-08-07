package atd.ah;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import atd.a.getMessageVersion;
import atd.az.ChallengeStatusHandler;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import java.lang.reflect.Method;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class getSDKTransactionID extends getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static char getSDKAppID;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        ChallengeResultCancelled = 1;
        AuthenticationRequestParameters();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        getDeviceData = (ChallengeResultCancelled + 87) % 128;
    }

    getSDKTransactionID() {
    }

    static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = (char) 22021;
        getSDKTransactionID = (char) 49900;
        getSDKReferenceNumber = (char) 20661;
        getSDKAppID = (char) 52114;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13 = $10;
        $11 = (i13 + 35) % 128;
        if (str != null) {
            $11 = (i13 + 65) % 128;
            charArray = str.toCharArray();
            $11 = ($10 + 105) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
        char[] cArr2 = new char[cArr.length];
        int i14 = 0;
        challengeStatusHandler.getSDKReferenceNumber = 0;
        int i15 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i16 = challengeStatusHandler.getSDKReferenceNumber;
            if (i16 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            cArr3[i14] = cArr[i16];
            int i17 = 1;
            cArr3[1] = cArr[i16 + 1];
            int i18 = 58224;
            int i19 = i14;
            while (true) {
                i12 = i15;
                if (i19 >= 16) {
                    break;
                }
                char c11 = cArr3[i17];
                char c12 = cArr3[i14];
                int i21 = i17;
                int i22 = i19;
                int i23 = (c12 + i18) ^ ((c12 << 4) + ((char) (((long) getSDKReferenceNumber) ^ (-2881362678149017980L))));
                int i24 = c12 >>> 5;
                int i25 = i14;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getSDKAppID);
                    objArr2[i12] = Integer.valueOf(i24);
                    objArr2[i21] = Integer.valueOf(i23);
                    objArr2[i25] = Integer.valueOf(c11);
                    Map map = getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    Class cls = Integer.TYPE;
                    if (method == null) {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(Color.alpha(i25) + 1745, (char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 16682), 29 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        byte b11 = (byte) i25;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[i21];
                        b(b11, b12, (byte) (b12 + 1), objArr3);
                        method = cls2.getMethod((String) objArr3[i25], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char c13 = cArr3[0];
                    int i26 = (cCharValue + i18) ^ ((cCharValue << 4) + ((char) (((long) AuthenticationRequestParameters) ^ (-2881362678149017980L))));
                    int i27 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(getSDKTransactionID);
                    objArr4[i12] = Integer.valueOf(i27);
                    objArr4[1] = Integer.valueOf(i26);
                    objArr4[0] = Integer.valueOf(c13);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID(1746 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (16682 - TextUtils.getTrimmedLength("")), TextUtils.indexOf((CharSequence) "", '0', 0) + 30);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 + 1), objArr5);
                        method2 = cls3.getMethod((String) objArr5[0], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i18 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i19 = i22 + 1;
                    i15 = i12;
                    cArr = cArr;
                    cArr3 = cArr3;
                    i14 = 0;
                    i17 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = cArr;
            char[] cArr5 = cArr3;
            int i28 = challengeStatusHandler.getSDKReferenceNumber;
            cArr2[i28] = cArr5[0];
            cArr2[i28 + 1] = cArr5[1];
            Object[] objArr6 = new Object[i12];
            objArr6[1] = challengeStatusHandler;
            objArr6[0] = challengeStatusHandler;
            Map map2 = getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 == null) {
                Class cls4 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1596, (char) (27823 - TextUtils.lastIndexOf("", '0', 0)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
                byte b15 = (byte) 0;
                byte b16 = b15;
                Object[] objArr7 = new Object[1];
                b(b15, b16, b16, objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i15 = i12;
            cArr = cArr4;
            cArr3 = cArr5;
            i14 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 4
            int r9 = 116 - r9
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r0 = atd.ah.getSDKTransactionID.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2e:
            int r7 = r7 + r3
            r3 = r9
            r9 = r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ah.getSDKTransactionID.b(int, short, short, java.lang.Object[]):void");
    }

    private static atd.ag.getDeviceData getDeviceData(atd.ag.AuthenticationRequestParameters authenticationRequestParameters, String str, String str2, ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        atd.ag.getDeviceData getdevicedata = new atd.ag.getDeviceData(atd.an.getSDKReferenceNumber.getSDKReferenceNumber(atd.an.getDeviceData.getSDKAppID(eCPublicKey, eCPrivateKey), 256, authenticationRequestParameters.getSDKAppID(), str, str2), authenticationRequestParameters);
        int i11 = ChallengeResultCancelled + 65;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return getdevicedata;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{43, -27, -101, 53};
        $$b = 28;
    }

    @Override // atd.ac.getSDKAppID
    public final String getSDKAppID() throws Throwable {
        Object obj;
        int i11 = ChallengeResultCancelled + 81;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            Object[] objArr = new Object[1];
            a("䨉࠹跁迸尰㖳\ue1c3컊", 75 - View.combineMeasuredStates(1, 0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("䨉࠹跁迸尰㖳\ue1c3컊", View.combineMeasuredStates(0, 0) + 7, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // atd.ah.ChallengeResult
    public final atd.ag.getDeviceData getSDKReferenceNumber(atd.ai.getSDKEphemeralPublicKey getsdkephemeralpublickey, atd.af.AuthenticationRequestParameters authenticationRequestParameters) throws Throwable {
        atd.af.AuthenticationRequestParameters.getDeviceData(authenticationRequestParameters, atd.af.getDeviceData.class);
        atd.ag.AuthenticationRequestParameters sDKAppID = getsdkephemeralpublickey.getSDKAppID();
        atd.af.getDeviceData getdevicedata = new atd.af.getDeviceData(null, atd.an.AuthenticationRequestParameters.P256);
        ECPublicKey deviceData = ((atd.af.getDeviceData) authenticationRequestParameters).getDeviceData();
        ECPrivateKey eCPrivateKeyAuthenticationRequestParameters = getdevicedata.AuthenticationRequestParameters();
        JSONObject messageVersion = getsdkephemeralpublickey.getMessageVersion();
        Object[] objArr = new Object[1];
        a("ኛ뭅\ue820崗", (ViewConfiguration.getTapTimeout() >> 16) + 3, objArr);
        String strOptString = messageVersion.optString(((String) objArr[0]).intern(), null);
        Object[] objArr2 = new Object[1];
        a("ኛ뭅﷏糜", TextUtils.lastIndexOf("", '0', 0) + 4, objArr2);
        atd.ag.getDeviceData deviceData2 = getDeviceData(sDKAppID, strOptString, messageVersion.optString(((String) objArr2[0]).intern(), null), deviceData, eCPrivateKeyAuthenticationRequestParameters);
        int i11 = getDeviceData + 45;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            return deviceData2;
        }
        throw null;
    }
}
