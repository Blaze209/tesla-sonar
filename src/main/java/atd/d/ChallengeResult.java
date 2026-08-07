package atd.d;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.ChallengeStatusReceiver;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResult {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ ChallengeResult[] $VALUES;
    private static char[] AuthenticationRequestParameters;
    private static int ChallengeResult;
    public static final ChallengeResult GET;
    public static final ChallengeResult POST;
    private static int getDeviceData;
    private static boolean getSDKAppID;
    private static int getSDKReferenceNumber;
    private static boolean getSDKTransactionID;
    private boolean mDoOutput;
    private String mValue;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        ChallengeResult = 1;
        getSDKReferenceNumber();
        Object[] objArr = new Object[1];
        a(null, null, TextUtils.indexOf("", "") + 127, "\u0083\u0082\u0081", objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, Color.argb(0, 0, 0, 0) + 127, "\u0083\u0082\u0081", objArr2);
        GET = new ChallengeResult(strIntern, 0, ((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a(null, null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0083\u0086\u0085\u0084", objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(null, null, 127 - View.resolveSize(0, 0), "\u0083\u0086\u0085\u0084", objArr4);
        POST = new ChallengeResult(strIntern2, 1, ((String) objArr4[0]).intern(), true);
        $VALUES = getSDKAppID();
        int i11 = getDeviceData + 89;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private ChallengeResult(String str, int i11, String str2, boolean z11) {
        super(str, i11);
        this.mValue = str2;
        this.mDoOutput = z11;
    }

    private static void a(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            $10 = ($11 + 71) % 128;
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeStatusReceiver challengeStatusReceiver = new ChallengeStatusReceiver();
        char[] cArr = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        int i12 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(508097192);
                    if (obj == null) {
                        Method method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.getDeadChar(i12, i12) + EnumC4419g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 32)).getMethod("o", cls);
                        map.put(508097192, method);
                        obj = method;
                    }
                    cArr2[i13] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i13++;
                    i12 = i12;
                    cArr = cArr;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        int i14 = i12;
        Object[] objArr3 = {Integer.valueOf(getSDKReferenceNumber)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method2 = map2.get(-852383591);
        if (method2 == null) {
            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.normalizeMetaState(i14) + 2061, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 18);
            byte b11 = (byte) i14;
            byte b12 = b11;
            Object[] objArr4 = new Object[1];
            b(b11, b12, b12, objArr4);
            method2 = cls2.getMethod((String) objArr4[i14], cls);
            map2.put(-852383591, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        long j11 = 0;
        int i15 = 2;
        if (getSDKAppID) {
            int length2 = bArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length2;
            char[] cArr3 = new char[length2];
            challengeStatusReceiver.getDeviceData = 0;
            $11 = ($10 + 73) % 128;
            while (true) {
                int i16 = challengeStatusReceiver.getDeviceData;
                int i17 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                int i18 = $11 + 45;
                $10 = i18 % 128;
                if (i18 % i15 != 0) {
                    cArr3[i16] = (char) (cArr[bArr[i17 * i16] % i11] << iIntValue);
                    Object[] objArr5 = new Object[i15];
                    objArr5[1] = challengeStatusReceiver;
                    objArr5[0] = challengeStatusReceiver;
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-249860496);
                    if (method3 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionGroup(j11) + 1108, (char) (ViewConfiguration.getEdgeSlop() >> 16), 51 - (SystemClock.uptimeMillis() > j11 ? 1 : (SystemClock.uptimeMillis() == j11 ? 0 : -1)));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr6 = new Object[1];
                        b(b13, b14, (byte) (b14 + 1), objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                        map3.put(-249860496, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                } else {
                    j11 = j11;
                    cArr3[i16] = (char) (cArr[bArr[(i17 - 1) - i16] + i11] - iIntValue);
                    Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method4 = map4.get(-249860496);
                    if (method4 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1107 - MotionEvent.axisFromString(""), (char) Color.alpha(0), 50 - TextUtils.indexOf("", ""));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr8 = new Object[1];
                        b(b15, b16, (byte) (b16 + 1), objArr8);
                        method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                        map4.put(-249860496, method4);
                    }
                    ((Method) method4).invoke(null, objArr7);
                }
                j11 = j11;
                i15 = 2;
            }
        } else if (getSDKTransactionID) {
            int length3 = charArray.length;
            challengeStatusReceiver.getSDKReferenceNumber = length3;
            char[] cArr4 = new char[length3];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i19 = challengeStatusReceiver.getDeviceData;
                int i21 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i19 >= i21) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i19] = (char) (cArr[charArray[(i21 - 1) - i19] - i11] - iIntValue);
                Object[] objArr9 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map5 = atd.a.getMessageVersion.timedout;
                Object method5 = map5.get(-249860496);
                if (method5 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1108, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 49 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    byte b17 = (byte) 0;
                    byte b18 = b17;
                    Object[] objArr10 = new Object[1];
                    b(b17, b18, (byte) (b18 + 1), objArr10);
                    method5 = cls5.getMethod((String) objArr10[0], Object.class, Object.class);
                    map5.put(-249860496, method5);
                }
                ((Method) method5).invoke(null, objArr9);
            }
        } else {
            int length4 = iArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length4;
            char[] cArr5 = new char[length4];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i22 = challengeStatusReceiver.getDeviceData;
                int i23 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i22 >= i23) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    $10 = ($11 + 91) % 128;
                    cArr5[i22] = (char) (cArr[iArr[(i23 - 1) - i22] - i11] - iIntValue);
                    challengeStatusReceiver.getDeviceData = i22 + 1;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 1
            byte[] r0 = atd.d.ChallengeResult.$$a
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r8 = r8 * 2
            int r8 = r8 + 107
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L18
            r8 = r7
            r3 = r0
            r4 = r2
            r0 = r6
            goto L30
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L30:
            int r7 = r7 + r0
            int r8 = r8 + 1
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.ChallengeResult.b(int, short, byte, java.lang.Object[]):void");
    }

    private static /* synthetic */ ChallengeResult[] getSDKAppID() {
        int i11 = (ChallengeResult + 69) % 128;
        getDeviceData = i11;
        ChallengeResult[] challengeResultArr = {GET, POST};
        ChallengeResult = (i11 + 5) % 128;
        return challengeResultArr;
    }

    public static boolean getSDKReferenceNumber(ChallengeResult challengeResult) {
        ChallengeResult = (getDeviceData + 31) % 128;
        if (challengeResult.equals(GET)) {
            return false;
        }
        int i11 = getDeviceData + 91;
        ChallengeResult = i11 % 128;
        return i11 % 2 != 0;
    }

    public static boolean getSDKTransactionID(ChallengeResult challengeResult) {
        getDeviceData = (ChallengeResult + 89) % 128;
        boolean zEquals = challengeResult.equals(POST);
        int i11 = ChallengeResult + 7;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{62, 104, -85, -6};
        $$b = 98;
    }

    public static ChallengeResult valueOf(String str) {
        int i11 = ChallengeResult + 93;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            Enum.valueOf(ChallengeResult.class, str);
            throw null;
        }
        ChallengeResult challengeResult = (ChallengeResult) Enum.valueOf(ChallengeResult.class, str);
        getDeviceData = (ChallengeResult + 11) % 128;
        return challengeResult;
    }

    public static ChallengeResult[] values() {
        int i11 = ChallengeResult + 97;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return (ChallengeResult[]) $VALUES.clone();
        }
        int i12 = 22 / 0;
        return (ChallengeResult[]) $VALUES.clone();
    }

    public final boolean AuthenticationRequestParameters() {
        int i11 = getDeviceData;
        boolean z11 = this.mDoOutput;
        ChallengeResult = (i11 + 93) % 128;
        return z11;
    }

    public final String getDeviceData() {
        int i11 = (ChallengeResult + 37) % 128;
        getDeviceData = i11;
        String str = this.mValue;
        ChallengeResult = (i11 + 125) % 128;
        return str;
    }

    static void getSDKReferenceNumber() {
        AuthenticationRequestParameters = new char[]{64799, 64801, 64784, 64788, 64791, 64787};
        getSDKReferenceNumber = -185467548;
        getSDKTransactionID = true;
        getSDKAppID = true;
    }
}
