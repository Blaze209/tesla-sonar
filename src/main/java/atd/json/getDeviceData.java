package atd.json;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.AuthenticationRequestParameters;
import atd.a.getMessageVersion;
import atd.az.ChallengeStatusReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean ChallengeResult;
    private static int ChallengeResultCancelled;
    private static final Charset getDeviceData;
    private static boolean getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char[] getSDKReferenceNumber;
    private final Charset AuthenticationRequestParameters;
    private final int getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResultCancelled = 1;
        getSDKTransactionID();
        TextUtils.getOffsetBefore("", 0);
        getDeviceData = AuthenticationRequestParameters.AuthenticationRequestParameters;
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 43) % 128;
    }

    private getDeviceData(Charset charset, int i11) {
        this.AuthenticationRequestParameters = charset;
        this.getSDKTransactionID = i11;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        Charset charset = (Charset) objArr[0];
        int i11 = getSDKEphemeralPublicKey + 27;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        getDeviceData getdevicedata = (getDeviceData) getSDKTransactionID(new Object[]{charset, new int[]{11}}, 959472112, -959472110, (int) System.currentTimeMillis());
        int i12 = getSDKEphemeralPublicKey + 47;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 68 / 0;
        }
        return getdevicedata;
    }

    private static void a(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        long j11;
        Class cls;
        Object method;
        String str3 = str2;
        int i12 = ($11 + 93) % 128;
        $10 = i12;
        int i13 = 1;
        Object bytes = str3;
        if (str3 != null) {
            $11 = (i12 + 1) % 128;
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        if (str != null) {
            $10 = ($11 + 1) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeStatusReceiver challengeStatusReceiver = new ChallengeStatusReceiver();
        char[] cArr2 = getSDKReferenceNumber;
        Class cls2 = Integer.TYPE;
        if (cArr2 != null) {
            $11 = ($10 + 45) % 128;
            int length = cArr2.length;
            j11 = 0;
            char[] cArr3 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                try {
                    int i15 = i13;
                    Object[] objArr2 = {Integer.valueOf(cArr2[i14])};
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(508097192);
                    if (obj != null) {
                        method = obj;
                        cls = cls2;
                    } else {
                        cls = cls2;
                        method = ((Class) getMessageVersion.getSDKTransactionID(329 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), Color.red(0) + 32)).getMethod("o", cls);
                        map.put(508097192, method);
                    }
                    cArr3[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i14++;
                    cArr2 = cArr2;
                    i13 = i15;
                    cls2 = cls;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        } else {
            j11 = 0;
        }
        int i16 = i13;
        Class cls3 = cls2;
        Object[] objArr3 = {Integer.valueOf(getSDKAppID)};
        Map map2 = getMessageVersion.timedout;
        Object method2 = map2.get(-852383591);
        if (method2 == null) {
            Class cls4 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getDoubleTapTimeout() >> 16) + 2061, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 18 - (Process.getElapsedCpuTime() > j11 ? 1 : (Process.getElapsedCpuTime() == j11 ? 0 : -1)));
            byte b11 = (byte) 0;
            byte b12 = (byte) (b11 - 1);
            Object[] objArr4 = new Object[i16];
            b(b11, b12, (byte) (-b12), objArr4);
            method2 = cls4.getMethod((String) objArr4[0], cls3);
            map2.put(-852383591, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        int i17 = 2;
        if (getMessageVersion) {
            int length2 = bArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length2;
            char[] cArr4 = new char[length2];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i18 = challengeStatusReceiver.getDeviceData;
                int i19 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i18 >= i19) {
                    String str4 = new String(cArr4);
                    $11 = ($10 + 25) % 128;
                    objArr[0] = str4;
                    return;
                }
                $10 = ($11 + 63) % 128;
                cArr4[i18] = (char) (cArr2[bArr[(i19 - 1) - i18] + i11] - iIntValue);
                Object[] objArr5 = new Object[i17];
                objArr5[1] = challengeStatusReceiver;
                objArr5[0] = challengeStatusReceiver;
                Map map3 = getMessageVersion.timedout;
                Object method3 = map3.get(-249860496);
                if (method3 == null) {
                    Class cls5 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0', 0, 0) + 1109, (char) ExpandableListView.getPackedPositionGroup(j11), 49 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 - 1);
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, (byte) (b14 + 1), objArr6);
                    method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map3.put(-249860496, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                i17 = 2;
            }
        } else if (ChallengeResult) {
            int length3 = cArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length3;
            char[] cArr5 = new char[length3];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i21 = challengeStatusReceiver.getDeviceData;
                int i22 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i21 >= i22) {
                    String str5 = new String(cArr5);
                    $11 = ($10 + 117) % 128;
                    objArr[0] = str5;
                    return;
                }
                $10 = ($11 + 19) % 128;
                cArr5[i21] = (char) (cArr2[cArr[(i22 - 1) - i21] - i11] - iIntValue);
                Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map4 = getMessageVersion.timedout;
                Object method4 = map4.get(-249860496);
                if (method4 == null) {
                    Class cls6 = (Class) getMessageVersion.getSDKTransactionID(1109 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 50);
                    byte b15 = (byte) 0;
                    byte b16 = (byte) (b15 - 1);
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, (byte) (b16 + 1), objArr8);
                    method4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                    map4.put(-249860496, method4);
                }
                ((Method) method4).invoke(null, objArr7);
            }
        } else {
            int length4 = iArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length4;
            char[] cArr6 = new char[length4];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i23 = challengeStatusReceiver.getDeviceData;
                int i24 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i23 >= i24) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i23] = (char) (cArr2[iArr[(i24 - 1) - i23] - i11] - iIntValue);
                    challengeStatusReceiver.getDeviceData = i23 + 1;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.json.getDeviceData.$$a
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r8 = r8 * 2
            int r8 = 109 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L18
            r8 = r7
            r3 = r0
            r4 = r2
            r0 = r6
            goto L32
        L18:
            r3 = r2
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L32:
            int r7 = r7 + r0
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.json.getDeviceData.b(byte, int, int, java.lang.Object[]):void");
    }

    private static byte[] getDeviceData(byte[] bArr) {
        int i11 = ChallengeResultCancelled + 47;
        getSDKEphemeralPublicKey = i11 % 128;
        try {
            bArr = i11 % 2 != 0 ? Base64.decode(bArr, 28) : Base64.decode(bArr, 8);
        } catch (IllegalArgumentException unused) {
            bArr = Base64.decode(bArr, 0);
        }
        int i12 = ChallengeResultCancelled + 37;
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private byte[] getSDKEphemeralPublicKey(String str) {
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 117) % 128;
        byte[] bytes = str.getBytes(this.AuthenticationRequestParameters);
        int i11 = ChallengeResultCancelled + 111;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 22 / 0;
        }
        return bytes;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        int i11 = ChallengeResultCancelled + 41;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            return (getDeviceData) getSDKTransactionID(new Object[]{getDeviceData, new int[]{11}}, 959472112, -959472110, (int) System.currentTimeMillis());
        }
        throw null;
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * 530) + 1058 + (i12 * 530) + (((~((~i13) | i11)) | (~(i11 | i12))) * 529) + (((~(i11 | i13)) | (~i12)) * 529);
        if (i14 == 1) {
            return getSDKReferenceNumber(objArr);
        }
        if (i14 != 2) {
            return AuthenticationRequestParameters(objArr);
        }
        Charset charset = (Charset) objArr[0];
        int[] iArr = (int[]) objArr[1];
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 117) % 128;
        int length = iArr.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 <= 0) {
            i16 = iArr[0];
            i15++;
            ChallengeResultCancelled = (getSDKEphemeralPublicKey + 91) % 128;
        }
        getDeviceData getdevicedata = new getDeviceData(charset, i16);
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 59) % 128;
        return getdevicedata;
    }

    static void init$0() {
        $$a = new byte[]{79, 66, 87, 20};
        $$b = EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE;
    }

    public final byte[] getSDKAppID(byte[] bArr) {
        int i11 = getSDKEphemeralPublicKey + 105;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            return Base64.encode(bArr, this.getSDKTransactionID);
        }
        Base64.encode(bArr, this.getSDKTransactionID);
        throw null;
    }

    public final JSONObject AuthenticationRequestParameters(String str) {
        JSONObject jSONObject = new JSONObject(getSDKReferenceNumber(str));
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 71) % 128;
        return jSONObject;
    }

    public final byte[] getSDKAppID(String str) {
        byte[] deviceData;
        int i11 = ChallengeResultCancelled + 69;
        getSDKEphemeralPublicKey = i11 % 128;
        int i12 = i11 % 2;
        byte[] sDKEphemeralPublicKey = getSDKEphemeralPublicKey(str);
        if (i12 != 0) {
            deviceData = getDeviceData(sDKEphemeralPublicKey);
            int i13 = 29 / 0;
        } else {
            deviceData = getDeviceData(sDKEphemeralPublicKey);
        }
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 41) % 128;
        return deviceData;
    }

    public final Charset getSDKReferenceNumber() {
        int i11 = ChallengeResultCancelled;
        Charset charset = this.AuthenticationRequestParameters;
        getSDKEphemeralPublicKey = (i11 + 31) % 128;
        return charset;
    }

    private String AuthenticationRequestParameters(byte[] bArr) {
        String str = new String(bArr, this.AuthenticationRequestParameters);
        int i11 = getSDKEphemeralPublicKey + 19;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getSDKReferenceNumber(String str) {
        int i11 = getSDKEphemeralPublicKey + 81;
        ChallengeResultCancelled = i11 % 128;
        int i12 = i11 % 2;
        byte[] sDKAppID = getSDKAppID(str);
        if (i12 == 0) {
            getSDKReferenceNumber(sDKAppID);
            throw null;
        }
        String sDKReferenceNumber = getSDKReferenceNumber(sDKAppID);
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 123) % 128;
        return sDKReferenceNumber;
    }

    private static getDeviceData AuthenticationRequestParameters(Charset charset, int... iArr) {
        return (getDeviceData) getSDKTransactionID(new Object[]{charset, iArr}, 959472112, -959472110, (int) System.currentTimeMillis());
    }

    private String getSDKReferenceNumber(byte[] bArr) {
        String str = new String(bArr, this.AuthenticationRequestParameters);
        int i11 = ChallengeResultCancelled + 105;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 29 / 0;
        }
        return str;
    }

    public static getDeviceData AuthenticationRequestParameters() {
        return (getDeviceData) getSDKTransactionID(new Object[0], 76032564, -76032563, (int) System.currentTimeMillis());
    }

    public static boolean getDeviceData(String str) throws Throwable {
        int i11 = ChallengeResultCancelled + 111;
        int i12 = i11 % 128;
        getSDKEphemeralPublicKey = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            ChallengeResultCancelled = (i12 + 87) % 128;
            Object[] objArr = new Object[1];
            a(null, null, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0090\u008f\u008e\u008d\u008c\u0085\u008b\u008a\u0085\u0089\u0088\u0085\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            if (!str.matches(((String) objArr[0]).intern())) {
                return false;
            }
        }
        int i13 = getSDKEphemeralPublicKey + 111;
        ChallengeResultCancelled = i13 % 128;
        if (i13 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public static getDeviceData getDeviceData(Charset charset) {
        return (getDeviceData) getSDKTransactionID(new Object[]{charset}, -1621942088, 1621942088, (int) System.currentTimeMillis());
    }

    public final String getSDKTransactionID(byte[] bArr) {
        int i11 = getSDKEphemeralPublicKey + 55;
        ChallengeResultCancelled = i11 % 128;
        int i12 = i11 % 2;
        byte[] sDKAppID = getSDKAppID(bArr);
        if (i12 != 0) {
            return AuthenticationRequestParameters(sDKAppID);
        }
        AuthenticationRequestParameters(sDKAppID);
        throw null;
    }

    public final String getSDKTransactionID(String str) {
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 105) % 128;
        String sDKTransactionID = getSDKTransactionID(str.getBytes(this.AuthenticationRequestParameters));
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 49) % 128;
        return sDKTransactionID;
    }

    static void getSDKTransactionID() {
        getSDKReferenceNumber = new char[]{64773, 64827, 64774, 64800, 64820, 64777, 64768, 64745, 64775, 64770, 64819, 64808, 64772, 64825, 64824, 64831};
        getSDKAppID = -185467549;
        ChallengeResult = true;
        getMessageVersion = true;
    }
}
