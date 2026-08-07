package atd.e;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.az.ChallengeStatusReceiver;
import java.lang.reflect.Method;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceData extends getMessageVersion {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static boolean BuildConfig;
    private static long ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int ChallengeResultError;
    private static int getMessageVersion;
    private static boolean getSDKEphemeralPublicKey;
    private static char[] getSDKReferenceNumber;
    private atd.i.ChallengeResult AuthenticationRequestParameters;
    private getSDKTransactionID getDeviceData;
    private int getSDKAppID;
    private atd.i.AuthenticationRequestParameters getSDKTransactionID;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        ChallengeResultCancelled = 0;
        ChallengeResultError = 1;
        getSDKReferenceNumber = new char[]{64733, 64740, 64721, 64719, 64793, 64722, 64736, 64738, 64720, 64725, 64732, 64723, 64716, 64735, 64784, 64791, 64751, 64759, 64729, 64727, 64731, 64770, 64761, 64776, 64772, 64739, 64726, 64807, 64771, 64741, 64734, 64795, 64758, 64752, 64754, 64730, 64760, 64728, 64764, 64737, 64769, 64773};
        getMessageVersion = -185467577;
        getSDKEphemeralPublicKey = true;
        BuildConfig = true;
        ChallengeResult = -5509743809093922444L;
    }

    getDeviceData(JsonObject jsonObject) throws Throwable {
        super(jsonObject);
        this.getSDKAppID = atd.d.getMessageVersion.getSDKReferenceNumber(jsonObject, atd.am.getDeviceData.ACS_COUNTER_A_TO_S).getSDKReferenceNumber().intValue();
        atd.am.getDeviceData getdevicedata = atd.am.getDeviceData.CHALLENGE_COMPLETION_INDICATOR;
        atd.i.AuthenticationRequestParameters AuthenticationRequestParameters = atd.i.AuthenticationRequestParameters.AuthenticationRequestParameters(atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, getdevicedata).getSDKReferenceNumber(), getdevicedata);
        this.getSDKTransactionID = AuthenticationRequestParameters;
        this.AuthenticationRequestParameters = atd.i.ChallengeResult.getDeviceData(AuthenticationRequestParameters.getSDKAppID() ? (String) ((atd.am.getSDKAppID) atd.d.getMessageVersion.getSDKAppID(new Object[]{jsonObject, atd.am.getDeviceData.TRANSACTION_STATUS}, -1351290859, 1351290860, (int) System.currentTimeMillis())).getSDKReferenceNumber() : atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, atd.am.getDeviceData.TRANSACTION_STATUS).getSDKReferenceNumber());
        this.getDeviceData = this.getSDKTransactionID.getSDKAppID() ? getSDKTransactionID.getSDKAppID(jsonObject) : null;
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
    private static void a(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 2
            int r9 = r9 + 103
            int r7 = r7 * 4
            int r7 = r7 + 21
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r0 = atd.e.getDeviceData.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r5 = r2
            r0 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r0
            r0 = r9
            r9 = r3
            r3 = r6
        L2d:
            int r9 = -r9
            int r0 = r0 + r9
            int r9 = r0 + 3
            int r8 = r8 + 1
            r0 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getDeviceData.a(byte, byte, short, java.lang.Object[]):void");
    }

    private static void b(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        int i12;
        long j11;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeStatusReceiver challengeStatusReceiver = new ChallengeStatusReceiver();
        char[] cArr = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        int i13 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            j11 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(508097192);
                    if (obj == null) {
                        Method method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(328 - (CdmaCellLocation.convertQuartSecToDecDegrees(i13) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i13) == 0.0d ? 0 : -1)), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31)).getMethod("o", cls);
                        map.put(508097192, method);
                        obj = method;
                    }
                    cArr2[i14] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i14++;
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
            i12 = 1;
            $11 = ($10 + 89) % 128;
            cArr = cArr2;
        } else {
            i12 = 1;
            j11 = 0;
        }
        Object[] objArr3 = {Integer.valueOf(getMessageVersion)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method2 = map2.get(-852383591);
        if (method2 == null) {
            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2062 - (Process.getElapsedCpuTime() > j11 ? 1 : (Process.getElapsedCpuTime() == j11 ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), Drawable.resolveOpacity(0, 0) + 17);
            byte b11 = (byte) 0;
            byte b12 = (byte) (b11 + 3);
            Object[] objArr4 = new Object[i12];
            d(b11, b12, (byte) (b12 - 3), objArr4);
            method2 = cls2.getMethod((String) objArr4[0], cls);
            map2.put(-852383591, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        if (BuildConfig) {
            int length2 = bArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length2;
            char[] cArr3 = new char[length2];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i15 = challengeStatusReceiver.getDeviceData;
                int i16 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i15 >= i16) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[i15] = (char) (cArr[bArr[(i16 - 1) - i15] + i11] - iIntValue);
                Object[] objArr5 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method3 = map3.get(-249860496);
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.keyCodeFromString("") + 1108, (char) TextUtils.getCapsMode("", 0, 0), 49 - TextUtils.indexOf((CharSequence) "", '0'));
                    byte length3 = (byte) $$d.length;
                    Object[] objArr6 = new Object[1];
                    d((byte) 0, length3, (byte) (length3 - 4), objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                    map3.put(-249860496, method3);
                }
                ((Method) method3).invoke(null, objArr5);
            }
        } else if (getSDKEphemeralPublicKey) {
            $11 = ($10 + 117) % 128;
            int length4 = charArray.length;
            challengeStatusReceiver.getSDKReferenceNumber = length4;
            char[] cArr4 = new char[length4];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i17 = challengeStatusReceiver.getDeviceData;
                int i18 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i17 >= i18) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i17] = (char) (cArr[charArray[(i18 - 1) - i17] - i11] - iIntValue);
                Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-249860496);
                if (method4 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1108 - View.resolveSize(0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > j11 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j11 ? 0 : -1)) - 1), (SystemClock.elapsedRealtimeNanos() > j11 ? 1 : (SystemClock.elapsedRealtimeNanos() == j11 ? 0 : -1)) + 49);
                    byte length5 = (byte) $$d.length;
                    Object[] objArr8 = new Object[1];
                    d((byte) 0, length5, (byte) (length5 - 4), objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                    map4.put(-249860496, method4);
                }
                ((Method) method4).invoke(null, objArr7);
            }
        } else {
            int length6 = iArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length6;
            char[] cArr5 = new char[length6];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i19 = challengeStatusReceiver.getDeviceData;
                int i21 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i19 >= i21) {
                    String str4 = new String(cArr5);
                    $11 = ($10 + 81) % 128;
                    objArr[0] = str4;
                    return;
                }
                cArr5[i19] = (char) (cArr[iArr[(i21 - 1) - i19] - i11] - iIntValue);
                challengeStatusReceiver.getDeviceData = i19 + 1;
            }
        }
    }

    private static void c(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.az.getAdditionalDetails getadditionaldetails = new atd.az.getAdditionalDetails();
        char[] deviceData = atd.az.getAdditionalDetails.getDeviceData(ChallengeResult ^ 4326518537449951405L, charArray, i11);
        getadditionaldetails.getDeviceData = 4;
        while (true) {
            int i12 = getadditionaldetails.getDeviceData;
            if (i12 >= deviceData.length) {
                break;
            }
            $11 = ($10 + 33) % 128;
            int i13 = i12 - 4;
            getadditionaldetails.getSDKTransactionID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(deviceData[i12] ^ deviceData[i12 % 4]), Long.valueOf(i13), Long.valueOf(ChallengeResult)};
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(2749 - Color.argb(0, 0, 0, 0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 54838), 29 - View.MeasureSpec.getMode(0));
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1401, (char) (View.getDefaultSize(0, 0) + 16690), View.MeasureSpec.getMode(0) + 22);
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr4 = new Object[1];
                    d(b11, b12, b12, objArr4);
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
        String str2 = new String(deviceData, 4, deviceData.length - 4);
        int i14 = $11 + 59;
        $10 = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
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
    private static void d(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 101
            byte[] r0 = atd.e.getDeviceData.$$d
            int r9 = r9 * 4
            int r9 = r9 + 1
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r9) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2e:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r8
            r8 = r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getDeviceData.d(byte, short, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
        return getDeviceData(objArr);
    }

    static void init$0() {
        $$a = new byte[]{38, 74, 48, -78, 5, -12, 36, 18, -4, -4, -16, 2, 4, -10, Tnaf.POW_2_WIDTH, -6, 14, 1, 26, -36, 11, 14, 0, -10};
        $$b = 52;
    }

    static void init$1() {
        $$d = new byte[]{81, 93, -56, -49};
        $$e = 170;
    }

    public final boolean AuthenticationRequestParameters() throws Throwable {
        int i11 = ChallengeResultCancelled + 43;
        ChallengeResultError = i11 % 128;
        if (i11 % 2 == 0) {
            this.getSDKTransactionID.AuthenticationRequestParameters();
            throw null;
        }
        boolean zAuthenticationRequestParameters = this.getSDKTransactionID.AuthenticationRequestParameters();
        int i12 = ChallengeResultError + 51;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 == 0) {
            return zAuthenticationRequestParameters;
        }
        throw null;
    }

    @Override // atd.e.getMessageVersion
    public final void ChallengeResultCancelled() {
        getDeviceData(new Object[]{this}, -771770073, 771770073, System.identityHashCode(this));
    }

    public final int getSDKAppID() {
        int i11 = ChallengeResultError;
        int i12 = this.getSDKAppID;
        ChallengeResultCancelled = (i11 + 29) % 128;
        return i12;
    }

    public final getSDKTransactionID getSDKReferenceNumber() {
        getSDKTransactionID getsdktransactionid;
        int i11 = ChallengeResultCancelled + 107;
        int i12 = i11 % 128;
        ChallengeResultError = i12;
        if (i11 % 2 == 0) {
            getsdktransactionid = this.getDeviceData;
            int i13 = 90 / 0;
        } else {
            getsdktransactionid = this.getDeviceData;
        }
        int i14 = i12 + 101;
        ChallengeResultCancelled = i14 % 128;
        if (i14 % 2 == 0) {
            return getsdktransactionid;
        }
        throw null;
    }

    public final String getSDKTransactionID() {
        int i11 = ChallengeResultCancelled + 45;
        ChallengeResultError = i11 % 128;
        if (i11 % 2 != 0) {
            return this.AuthenticationRequestParameters.getSDKReferenceNumber();
        }
        this.AuthenticationRequestParameters.getSDKReferenceNumber();
        throw null;
    }

    @Override // atd.e.getMessageVersion
    public final boolean getDeviceData() {
        int i11 = (ChallengeResultError + 91) % 128;
        ChallengeResultCancelled = i11;
        ChallengeResultError = (i11 + 55) % 128;
        return true;
    }

    @Override // atd.e.getMessageVersion
    final String getSDKTransactionID(JsonObject jsonObject, atd.am.getDeviceData getdevicedata) {
        ChallengeResultError = (ChallengeResultCancelled + 93) % 128;
        String sDKReferenceNumber = atd.d.getMessageVersion.getMessageVersion(jsonObject, getdevicedata).getSDKReferenceNumber();
        int i11 = ChallengeResultError + 49;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            return sDKReferenceNumber;
        }
        throw null;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        super.ChallengeResultCancelled();
        getdevicedata.getSDKAppID = 0;
        getdevicedata.getSDKTransactionID = null;
        getdevicedata.AuthenticationRequestParameters = null;
        getSDKTransactionID getsdktransactionid = getdevicedata.getDeviceData;
        if (getsdktransactionid != null) {
            int i11 = ChallengeResultCancelled + 7;
            ChallengeResultError = i11 % 128;
            if (i11 % 2 == 0) {
                getsdktransactionid.getSDKTransactionID();
                getdevicedata.getDeviceData = null;
                int i12 = 96 / 0;
            } else {
                getsdktransactionid.getSDKTransactionID();
                getdevicedata.getDeviceData = null;
            }
            ChallengeResultError = (ChallengeResultCancelled + 115) % 128;
        }
        return null;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] getDeviceData(android.content.Context r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 1394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getDeviceData.getDeviceData(android.content.Context, int, int):java.lang.Object[]");
    }
}
