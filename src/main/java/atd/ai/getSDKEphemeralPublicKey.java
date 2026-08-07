package atd.ai;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.ag.getSDKTransactionID;
import atd.an.BuildConfig;
import atd.az.ChallengeStatusHandler;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKEphemeralPublicKey extends BuildConfig {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static char getDeviceData;
    private static char getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;
    private atd.ag.AuthenticationRequestParameters AuthenticationRequestParameters;
    private atd.ah.ChallengeResult getSDKAppID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        BuildConfig = 1;
        getDeviceData = (char) 54314;
        getSDKTransactionID = (char) 40933;
        getSDKReferenceNumber = (char) 17809;
        getMessageVersion = (char) 23147;
    }

    public getSDKEphemeralPublicKey(atd.ah.ChallengeResult challengeResult, atd.ag.AuthenticationRequestParameters authenticationRequestParameters, JSONObject jSONObject) {
        super(getSDKTransactionID(challengeResult, authenticationRequestParameters, jSONObject));
        this.getSDKAppID = challengeResult;
        this.AuthenticationRequestParameters = authenticationRequestParameters;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        float f11;
        int i12;
        if (str != null) {
            $10 = ($11 + 35) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
        char[] cArr2 = new char[cArr.length];
        int i13 = 0;
        challengeStatusHandler.getSDKReferenceNumber = 0;
        int i14 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i15 = challengeStatusHandler.getSDKReferenceNumber;
            if (i15 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            $10 = ($11 + 87) % 128;
            cArr3[i13] = cArr[i15];
            cArr3[1] = cArr[i15 + 1];
            int i16 = 58224;
            int i17 = i13;
            while (i17 < 16) {
                $10 = ($11 + 9) % 128;
                char c11 = cArr3[1];
                char c12 = cArr3[i13];
                int i18 = i14;
                char[] cArr4 = cArr3;
                int i19 = (c12 + i16) ^ ((c12 << 4) + ((char) (((long) getSDKReferenceNumber) ^ (-2881362678149017980L))));
                int i21 = c12 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getMessageVersion);
                    objArr2[i18] = Integer.valueOf(i21);
                    objArr2[1] = Integer.valueOf(i19);
                    objArr2[i13] = Integer.valueOf(c11);
                    Map map = getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    Class cls = Integer.TYPE;
                    if (method != null) {
                        i12 = i13;
                        f11 = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        int offsetBefore = TextUtils.getOffsetBefore("", i13) + 1745;
                        float fComplexToFloat = TypedValue.complexToFloat(i13);
                        f11 = BitmapDescriptorFactory.HUE_RED;
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(offsetBefore, (char) (16682 - (fComplexToFloat > BitmapDescriptorFactory.HUE_RED ? 1 : (fComplexToFloat == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 30 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        byte b11 = (byte) i13;
                        byte b12 = b11;
                        i12 = i13;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 + 1), objArr3);
                        method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    char c13 = cArr4[i12];
                    int i22 = (cCharValue + i16) ^ ((cCharValue << 4) + ((char) (((long) getDeviceData) ^ (-2881362678149017980L))));
                    int i23 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(getSDKTransactionID);
                    objArr4[i18] = Integer.valueOf(i23);
                    objArr4[1] = Integer.valueOf(i22);
                    objArr4[i12] = Integer.valueOf(c13);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getLongPressTimeout() >> 16) + 1745, (char) ((AudioTrack.getMaxVolume() > f11 ? 1 : (AudioTrack.getMaxVolume() == f11 ? 0 : -1)) + 16681), 'M' - AndroidCharacter.getMirror('0'));
                        int i24 = i12;
                        byte b13 = (byte) i24;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 + 1), objArr5);
                        method2 = cls3.getMethod((String) objArr5[i24], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr4[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i16 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i17++;
                    i14 = i18;
                    cArr3 = cArr4;
                    cArr = cArr;
                    i13 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr;
            int i25 = i14;
            char[] cArr6 = cArr3;
            int i26 = challengeStatusHandler.getSDKReferenceNumber;
            cArr2[i26] = cArr6[0];
            cArr2[i26 + 1] = cArr6[1];
            Object[] objArr6 = new Object[i25];
            objArr6[1] = challengeStatusHandler;
            objArr6[0] = challengeStatusHandler;
            Map map2 = getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 == null) {
                Class cls4 = (Class) getMessageVersion.getSDKTransactionID(1596 - KeyEvent.normalizeMetaState(0), (char) (27823 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25);
                byte b15 = (byte) 0;
                byte b16 = b15;
                Object[] objArr7 = new Object[1];
                b(b15, b16, b16, objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i14 = i25;
            cArr3 = cArr6;
            cArr = cArr5;
            i13 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 4
            int r7 = 116 - r7
            int r6 = r6 * 3
            int r0 = r6 + 1
            byte[] r1 = atd.ai.getSDKEphemeralPublicKey.$$a
            int r5 = r5 * 2
            int r5 = 3 - r5
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r5 = r5 + 1
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r1[r5]
            int r3 = r3 + 1
        L2b:
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ai.getSDKEphemeralPublicKey.b(byte, int, byte, java.lang.Object[]):void");
    }

    private static byte[] getSDKTransactionID(atd.ah.ChallengeResult challengeResult, atd.ag.AuthenticationRequestParameters authenticationRequestParameters, JSONObject jSONObject) throws Throwable {
        try {
            JSONObject jSONObject2 = new JSONObject();
            Object[] objArr = new Object[1];
            a("桉쿿庸ݑ", 3 - TextUtils.indexOf("", ""), objArr);
            jSONObject2.put(((String) objArr[0]).intern(), challengeResult.getSDKAppID());
            Object[] objArr2 = new Object[1];
            a("•\u0ad9뫏紎", 3 - TextUtils.getTrimmedLength(""), objArr2);
            jSONObject2.put(((String) objArr2[0]).intern(), authenticationRequestParameters.getSDKAppID());
            if (jSONObject != null) {
                int i11 = getSDKEphemeralPublicKey + 93;
                BuildConfig = i11 % 128;
                if (i11 % 2 == 0) {
                    jSONObject.keys();
                    throw null;
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            byte[] bytes = jSONObject2.toString().getBytes(atd.a.AuthenticationRequestParameters.AuthenticationRequestParameters);
            BuildConfig = (getSDKEphemeralPublicKey + 111) % 128;
            return bytes;
        } catch (JSONException unused) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    static void init$0() {
        $$a = new byte[]{113, -55, 83, -124};
        $$b = 163;
    }

    @Override // atd.an.BuildConfig
    public final void getDeviceData() {
        BuildConfig = (getSDKEphemeralPublicKey + 59) % 128;
        super.getDeviceData();
        this.getSDKAppID = null;
        this.AuthenticationRequestParameters = null;
        int i11 = BuildConfig + 61;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public final atd.ag.AuthenticationRequestParameters getSDKAppID() {
        int i11 = (getSDKEphemeralPublicKey + 65) % 128;
        BuildConfig = i11;
        atd.ag.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
        getSDKEphemeralPublicKey = (i11 + 41) % 128;
        return authenticationRequestParameters;
    }

    getSDKEphemeralPublicKey(String str) throws Throwable {
        super(str, atd.am.ChallengeResultCancelled.JWE_HEADER_NOT_BASE64URL_ENCODED);
        try {
            JSONObject messageVersion = getMessageVersion();
            Object[] objArr = new Object[1];
            a("桉쿿庸ݑ", MotionEvent.axisFromString("") + 4, objArr);
            this.getSDKAppID = atd.ah.BuildConfig.getSDKReferenceNumber(messageVersion.getString(((String) objArr[0]).intern()));
            Object[] objArr2 = new Object[1];
            a("•\u0ad9뫏紎", Color.green(0) + 3, objArr2);
            this.AuthenticationRequestParameters = getSDKTransactionID.getSDKTransactionID(messageVersion.getString(((String) objArr2[0]).intern()));
        } catch (JSONException unused) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    public final atd.ah.ChallengeResult getSDKTransactionID() {
        int i11 = BuildConfig;
        int i12 = i11 + 73;
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        atd.ah.ChallengeResult challengeResult = this.getSDKAppID;
        getSDKEphemeralPublicKey = (i11 + 25) % 128;
        return challengeResult;
    }
}
