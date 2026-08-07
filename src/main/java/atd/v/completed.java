package atd.v;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsDefaultPitch;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class completed extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static char getDeviceData;
    private static int getMessageVersion;
    private static char getSDKAppID;
    private static char getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsDefaultPitch$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char[] AuthenticationRequestParameters;
        private static boolean getDeviceData;
        private static int getMessageVersion;
        private static int getSDKAppID;
        private static boolean getSDKReferenceNumber;
        private static int getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKTransactionID = 0;
            getMessageVersion = 1;
            AuthenticationRequestParameters = new char[]{64650, 64649};
            getSDKAppID = -185467667;
            getSDKReferenceNumber = true;
            getDeviceData = true;
        }

        private AuthenticationRequestParameters() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 37
                int r9 = r9 + 4
                int r7 = r7 * 17
                int r7 = r7 + 21
                int r8 = r8 * 6
                int r8 = r8 + 97
                byte[] r0 = atd.v.completed.AuthenticationRequestParameters.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r0
                r4 = r2
                r0 = r9
                goto L30
            L17:
                r3 = r9
                r9 = r8
                r8 = r3
                r3 = r2
            L1b:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r8]
                r6 = r0
                r0 = r8
                r8 = r3
                r3 = r6
            L30:
                int r9 = r9 + r8
                int r8 = r0 + 1
                int r9 = r9 + (-8)
                r0 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.v.completed.AuthenticationRequestParameters.a(byte, short, short, java.lang.Object[]):void");
        }

        private static void b(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
            char[] cArr;
            Class cls;
            Object method;
            String str3 = str2;
            Object bytes = str3;
            if (str3 != null) {
                bytes = str3.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.az.ChallengeStatusReceiver challengeStatusReceiver = new atd.az.ChallengeStatusReceiver();
            char[] cArr2 = AuthenticationRequestParameters;
            Class cls2 = Integer.TYPE;
            int i12 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i13 = 0;
                while (i13 < length) {
                    int i14 = $10 + 111;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i13])};
                            Map map = atd.a.getMessageVersion.timedout;
                            Object obj = map.get(508097192);
                            if (obj != null) {
                                method = obj;
                                cls = cls2;
                            } else {
                                cls = cls2;
                                method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(328 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) View.combineMeasuredStates(i12, i12), Color.blue(i12) + 32)).getMethod("o", cls);
                                map.put(508097192, method);
                            }
                            cArr3[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                            i13--;
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } else {
                        cArr2 = cArr2;
                        cls = cls2;
                        int i15 = i12;
                        Object[] objArr3 = {Integer.valueOf(cArr2[i13])};
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object method2 = map2.get(508097192);
                        if (method2 == null) {
                            method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(328 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i15) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i15) == 0.0d ? 0 : -1)), 32 - View.resolveSize(i15, i15))).getMethod("o", cls);
                            map2.put(508097192, method2);
                        }
                        cArr3[i13] = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
                        i13++;
                    }
                    $11 = ($10 + 15) % 128;
                    cls2 = cls;
                    cArr2 = cArr2;
                    i12 = 0;
                }
                cArr2 = cArr3;
            }
            Class cls3 = cls2;
            int i16 = 2;
            Object[] objArr4 = {Integer.valueOf(getSDKAppID)};
            Map map3 = atd.a.getMessageVersion.timedout;
            Object method3 = map3.get(-852383591);
            if (method3 == null) {
                Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2061 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) View.combineMeasuredStates(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16);
                byte b11 = (byte) 0;
                byte b12 = b11;
                Object[] objArr5 = new Object[1];
                c(b11, b12, (byte) (b12 - 1), objArr5);
                method3 = cls4.getMethod((String) objArr5[0], cls3);
                map3.put(-852383591, method3);
            }
            int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr4)).intValue();
            if (getDeviceData) {
                int length2 = bArr.length;
                challengeStatusReceiver.getSDKReferenceNumber = length2;
                char[] cArr4 = new char[length2];
                challengeStatusReceiver.getDeviceData = 0;
                while (true) {
                    int i17 = challengeStatusReceiver.getDeviceData;
                    int i18 = challengeStatusReceiver.getSDKReferenceNumber;
                    if (i17 >= i18) {
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    int i19 = $10 + 13;
                    $11 = i19 % 128;
                    if (i19 % 2 == 0) {
                        cArr4[i17] = (char) (cArr2[bArr[i18 - i17] - i11] % iIntValue);
                        Object[] objArr6 = new Object[i16];
                        objArr6[1] = challengeStatusReceiver;
                        objArr6[0] = challengeStatusReceiver;
                        Map map4 = atd.a.getMessageVersion.timedout;
                        Object method4 = map4.get(-249860496);
                        if (method4 == null) {
                            Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1107 - Process.getGidForName(""), (char) Color.green(0), 50 - KeyEvent.getDeadChar(0, 0));
                            byte b13 = (byte) 1;
                            byte b14 = (byte) (b13 - 1);
                            Object[] objArr7 = new Object[1];
                            c(b13, b14, (byte) (b14 - 1), objArr7);
                            method4 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                            map4.put(-249860496, method4);
                        }
                        ((Method) method4).invoke(null, objArr6);
                    } else {
                        cArr4[i17] = (char) (cArr2[bArr[(i18 - 1) - i17] + i11] - iIntValue);
                        Object[] objArr8 = {challengeStatusReceiver, challengeStatusReceiver};
                        Map map5 = atd.a.getMessageVersion.timedout;
                        Object method5 = map5.get(-249860496);
                        if (method5 == null) {
                            Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1108 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) Gravity.getAbsoluteGravity(0, 0), 50 - View.resolveSize(0, 0));
                            byte b15 = (byte) 1;
                            byte b16 = (byte) (b15 - 1);
                            Object[] objArr9 = new Object[1];
                            c(b15, b16, (byte) (b16 - 1), objArr9);
                            method5 = cls6.getMethod((String) objArr9[0], Object.class, Object.class);
                            map5.put(-249860496, method5);
                        }
                        ((Method) method5).invoke(null, objArr8);
                    }
                    i16 = 2;
                }
            } else {
                if (!getSDKReferenceNumber) {
                    int length3 = iArr.length;
                    challengeStatusReceiver.getSDKReferenceNumber = length3;
                    char[] cArr5 = new char[length3];
                    challengeStatusReceiver.getDeviceData = 0;
                    while (true) {
                        int i21 = challengeStatusReceiver.getDeviceData;
                        int i22 = challengeStatusReceiver.getSDKReferenceNumber;
                        if (i21 >= i22) {
                            break;
                        }
                        cArr5[i21] = (char) (cArr2[iArr[(i22 - 1) - i21] - i11] - iIntValue);
                        challengeStatusReceiver.getDeviceData = i21 + 1;
                    }
                    String str4 = new String(cArr5);
                    int i23 = $10 + 29;
                    $11 = i23 % 128;
                    if (i23 % 2 != 0) {
                        objArr[0] = str4;
                        return;
                    } else {
                        int i24 = 44 / 0;
                        objArr[0] = str4;
                        return;
                    }
                }
                int i25 = $11 + 47;
                $10 = i25 % 128;
                if (i25 % 2 != 0) {
                    int length4 = charArray.length;
                    challengeStatusReceiver.getSDKReferenceNumber = length4;
                    cArr = new char[length4];
                    challengeStatusReceiver.getDeviceData = 1;
                } else {
                    int length5 = charArray.length;
                    challengeStatusReceiver.getSDKReferenceNumber = length5;
                    cArr = new char[length5];
                    challengeStatusReceiver.getDeviceData = 0;
                }
                while (true) {
                    int i26 = challengeStatusReceiver.getDeviceData;
                    int i27 = challengeStatusReceiver.getSDKReferenceNumber;
                    if (i26 >= i27) {
                        objArr[0] = new String(cArr);
                        return;
                    }
                    cArr[i26] = (char) (cArr2[charArray[(i27 - 1) - i26] - i11] - iIntValue);
                    Object[] objArr10 = {challengeStatusReceiver, challengeStatusReceiver};
                    Map map6 = atd.a.getMessageVersion.timedout;
                    Object method6 = map6.get(-249860496);
                    if (method6 == null) {
                        Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1107 - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getEdgeSlop() >> 16), 50 - TextUtils.getTrimmedLength(""));
                        byte b17 = (byte) 1;
                        byte b18 = (byte) (b17 - 1);
                        Object[] objArr11 = new Object[1];
                        c(b17, b18, (byte) (b18 - 1), objArr11);
                        method6 = cls7.getMethod((String) objArr11[0], Object.class, Object.class);
                        map6.put(-249860496, method6);
                    }
                    ((Method) method6).invoke(null, objArr10);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 + 4
                byte[] r0 = atd.v.completed.AuthenticationRequestParameters.$$d
                int r6 = r6 * 2
                int r6 = r6 + 107
                int r7 = r7 * 3
                int r1 = r7 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r0
                r4 = r2
                r0 = r8
                r8 = r7
                goto L2f
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                int r8 = r8 + 1
                r3 = r0[r8]
                r5 = r8
                r8 = r6
                r6 = r3
                r3 = r0
                r0 = r5
            L2f:
                int r6 = -r6
                int r6 = r6 + r8
                r8 = r0
                r0 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.v.completed.AuthenticationRequestParameters.c(byte, int, short, java.lang.Object[]):void");
        }

        public static void getSDKReferenceNumber(long j11, long j12) throws Throwable {
            getSDKTransactionID = (getMessageVersion + 119) % 128;
            byte[] bArr = $$a;
            byte b11 = (byte) (bArr[0] - 1);
            byte b12 = bArr[36];
            Object[] objArr = new Object[1];
            a(b11, b12, b12, objArr);
            Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
            getMessageVersion = (getSDKTransactionID + 85) % 128;
            try {
                byte b13 = (byte) (bArr[0] - 1);
                byte b14 = bArr[36];
                Object[] objArr2 = new Object[1];
                a(b13, b14, b14, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b15 = bArr[36];
                byte b16 = (byte) (b15 + 1);
                Object[] objArr3 = new Object[1];
                a(b15, b16, b16, objArr3);
                Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(null, null);
                Object[] objArr4 = {atd.ap.getSDKTransactionID.class.getField("getDeviceData").get(null)};
                Object[] objArr5 = new Object[1];
                b(null, null, 127 - View.MeasureSpec.getMode(0), "\u0082\u0082\u0081", objArr5);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        static void init$0() {
            $$a = new byte[]{2, 58, 30, 104, 27, -8, -46, 59, 26, -61, 27, 60, 7, -4, 5, 17, 14, -3, 2, 6, 27, -3, 14, 7, -20, 27, 20, 12, -8, 22, 9, -28, 25, 25, -9, 20, 0, 23, -7, 21, 9, 6, 23, -25, -7, 15, 15, 27, 9, 7, 21, -5, 17, -3, 10, -15, 47, 0, -3, 11, 21};
            $$b = 152;
        }

        static void init$1() {
            $$d = new byte[]{125, 7, -90, 118};
            $$e = 76;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        ChallengeResultCancelled = 1;
        AuthenticationRequestParameters();
        ViewConfiguration.getJumpTapTimeout();
        new AuthenticationRequestParameters((byte) 0);
        getMessageVersion = (ChallengeResultCancelled + 99) % 128;
    }

    public /* synthetic */ completed(Application application) {
        this(application, new atd.q.getDeviceData(application));
    }

    static void AuthenticationRequestParameters() {
        getSDKTransactionID = (char) 24792;
        AuthenticationRequestParameters = (char) 2036;
        getDeviceData = (char) 64148;
        getSDKAppID = (char) 65162;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14 = ($10 + 51) % 128;
        $11 = i14;
        int i15 = 2;
        int i16 = 0;
        if (str != null) {
            int i17 = i14 + 123;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                charArray = str.toCharArray();
                int i18 = 83 / 0;
            } else {
                charArray = str.toCharArray();
            }
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.az.ChallengeStatusHandler challengeStatusHandler = new atd.az.ChallengeStatusHandler();
        char[] cArr2 = new char[cArr.length];
        challengeStatusHandler.getSDKReferenceNumber = 0;
        char[] cArr3 = new char[2];
        $11 = ($10 + 57) % 128;
        while (true) {
            int i19 = challengeStatusHandler.getSDKReferenceNumber;
            if (i19 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            int i21 = $11 + 51;
            $10 = i21 % 128;
            int i22 = 58224;
            char c11 = 1;
            if (i21 % i15 != 0) {
                cArr3[i16] = cArr[i19];
                cArr3[i16] = cArr[i19];
                i12 = 1;
            } else {
                cArr3[i16] = cArr[i19];
                cArr3[1] = cArr[i19 + 1];
                i12 = i16;
            }
            while (i12 < 16) {
                char c12 = cArr3[c11];
                char c13 = cArr3[i16];
                int i23 = i22;
                int i24 = (c13 + i22) ^ ((c13 << 4) + ((char) (((long) getDeviceData) ^ (-2881362678149017980L))));
                int i25 = c13 >>> 5;
                int i26 = i15;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getSDKAppID);
                    objArr2[i26] = Integer.valueOf(i25);
                    objArr2[c11] = Integer.valueOf(i24);
                    objArr2[i16] = Integer.valueOf(c12);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    Class cls = Integer.TYPE;
                    if (method != null) {
                        i13 = i16;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((KeyEvent.getMaxKeyCode() >> 16) + 1745, (char) (Color.red(i16) + 16682), (ExpandableListView.getPackedPositionForGroup(i16) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i16) == 0L ? 0 : -1)) + 29);
                        byte b11 = (byte) i16;
                        byte b12 = (byte) (b11 - 1);
                        i13 = i16;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (-b12), objArr3);
                        method = cls2.getMethod((String) objArr3[i13], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char c14 = cArr3[i13];
                    int i27 = (cCharValue + i23) ^ ((cCharValue << 4) + ((char) (((long) getSDKTransactionID) ^ (-2881362678149017980L))));
                    int i28 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(AuthenticationRequestParameters);
                    objArr4[i26] = Integer.valueOf(i28);
                    objArr4[1] = Integer.valueOf(i27);
                    objArr4[i13] = Integer.valueOf(c14);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        int i29 = i13;
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (TextUtils.lastIndexOf("", '0', i29, i29) + 16683), 29 - TextUtils.indexOf("", "", i29));
                        byte b13 = (byte) i29;
                        byte b14 = (byte) (b13 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (-b14), objArr5);
                        method2 = cls3.getMethod((String) objArr5[i29], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i22 = i23 - FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i12++;
                    i15 = i26;
                    cArr = cArr;
                    cArr3 = cArr3;
                    i16 = 0;
                    c11 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = cArr;
            int i31 = i15;
            char[] cArr5 = cArr3;
            int i32 = challengeStatusHandler.getSDKReferenceNumber;
            cArr2[i32] = cArr5[0];
            cArr2[i32 + 1] = cArr5[1];
            Object[] objArr6 = new Object[i31];
            objArr6[1] = challengeStatusHandler;
            objArr6[0] = challengeStatusHandler;
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 == null) {
                Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.MeasureSpec.getSize(0) + 1596, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27823), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 26);
                byte b15 = (byte) 0;
                byte b16 = (byte) (b15 - 1);
                Object[] objArr7 = new Object[1];
                b(b15, b16, (byte) (b16 + 1), objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i15 = i31;
            cArr = cArr4;
            cArr3 = cArr5;
            i16 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = atd.v.completed.$$a
            int r9 = r9 * 4
            int r9 = 116 - r9
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r9 = r8
            r3 = r0
            r4 = r2
            r0 = r7
            goto L2f
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r0
            r0 = r6
        L2f:
            int r8 = r8 + r0
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.completed.b(short, int, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{75, 126, 55, 101};
        $$b = 106;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        ChallengeResultCancelled = (getMessageVersion + 67) % 128;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        a("䛽鞽쥝ﭿ瑼ꈣ홭℄☦࿀\uebbb⍯\uebf8洊묁ⴔ\ud8cbഗ", TextUtils.lastIndexOf("", '0', 0, 0) + 18, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            ChallengeResultCancelled = (getMessageVersion + 75) % 128;
            Integer numAuthenticationRequestParameters = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.AuthenticationRequestParameters(sDKTransactionID);
            if (numAuthenticationRequestParameters != null) {
                ChallengeResultCancelled = (getMessageVersion + 103) % 128;
                return DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(numAuthenticationRequestParameters.intValue()));
            }
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        ChallengeResultCancelled = (getMessageVersion + 19) % 128;
        return failure;
    }

    private completed(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKReferenceNumber = authenticationRequestParameters;
    }
}
