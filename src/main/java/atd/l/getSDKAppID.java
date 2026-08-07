package atd.l;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import j$.util.DesugarTimeZone;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/DateTime;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Ljava/util/Calendar;", "calendar", "<init>", "(Ljava/util/Calendar;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Ljava/util/Calendar;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ChallengeResultCancelled;
    private static boolean getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static boolean getSDKReferenceNumber;
    private static char[] getSDKTransactionID;
    private final Calendar AuthenticationRequestParameters;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/DateTime$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static long AuthenticationRequestParameters;
        private static int getDeviceData;
        private static int getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = 0;
            getSDKTransactionID = 1;
            AuthenticationRequestParameters = -6521626067425976190L;
        }

        private getSDKReferenceNumber() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = 122 - r8
                int r0 = 31 - r6
                byte[] r1 = atd.l.getSDKAppID.getSDKReferenceNumber.$$a
                int r7 = r7 * 2
                int r7 = r7 + 4
                byte[] r0 = new byte[r0]
                int r6 = 30 - r6
                r2 = 0
                if (r1 != 0) goto L15
                r4 = r6
                r8 = r7
                r3 = r2
                goto L2a
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L23:
                r4 = r1[r7]
                int r3 = r3 + 1
                r5 = r8
                r8 = r7
                r7 = r5
            L2a:
                int r4 = -r4
                int r7 = r7 + r4
                int r8 = r8 + 1
                int r7 = r7 + 6
                r5 = r8
                r8 = r7
                r7 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.l.getSDKAppID.getSDKReferenceNumber.a(short, byte, int, java.lang.Object[]):void");
        }

        private static void b(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            if (str != null) {
                $11 = ($10 + 37) % 128;
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            atd.az.getAdditionalDetails getadditionaldetails = new atd.az.getAdditionalDetails();
            char[] deviceData = atd.az.getAdditionalDetails.getDeviceData(AuthenticationRequestParameters ^ 4326518537449951405L, charArray, i11);
            getadditionaldetails.getDeviceData = 4;
            while (true) {
                int i12 = getadditionaldetails.getDeviceData;
                if (i12 >= deviceData.length) {
                    objArr[0] = new String(deviceData, 4, deviceData.length - 4);
                    return;
                }
                $10 = ($11 + 101) % 128;
                int i13 = i12 - 4;
                getadditionaldetails.getSDKTransactionID = i13;
                try {
                    Object[] objArr2 = {Long.valueOf(deviceData[i12] ^ deviceData[i12 % 4]), Long.valueOf(i13), Long.valueOf(AuthenticationRequestParameters)};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(-1024136788);
                    if (method == null) {
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.red(0) + 2749, (char) (KeyEvent.normalizeMetaState(0) + 54838), ExpandableListView.getPackedPositionGroup(0L) + 29);
                        Class cls2 = Long.TYPE;
                        method = cls.getMethod("c", cls2, cls2, cls2);
                        map.put(-1024136788, method);
                    }
                    deviceData[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                    Object method2 = map.get(-719904898);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1400, (char) (16691 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.combineMeasuredStates(0, 0) + 22);
                        byte b11 = (byte) (-1);
                        byte b12 = (byte) (b11 + 1);
                        Object[] objArr4 = new Object[1];
                        c(b11, b12, b12, objArr4);
                        method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                        map.put(-719904898, method2);
                    }
                    ((Method) method2).invoke(null, objArr3);
                    $11 = ($10 + 83) % 128;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 * 4
                int r0 = r6 + 1
                byte[] r1 = atd.l.getSDKAppID.getSDKReferenceNumber.$$d
                int r7 = r7 * 4
                int r7 = r7 + 101
                int r5 = r5 + 3
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L14
                r4 = r6
                r3 = r2
                goto L28
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L22:
                int r5 = r5 + 1
                r4 = r1[r5]
                int r3 = r3 + 1
            L28:
                int r7 = r7 + r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.l.getSDKAppID.getSDKReferenceNumber.c(byte, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:42:0x03ad  */
        /* JADX WARN: Code duplicated, block: B:44:0x03b3  */
        /* JADX WARN: Code duplicated, block: B:47:0x0401  */
        /* JADX WARN: Code duplicated, block: B:48:0x0402 A[Catch: all -> 0x07a3, TryCatch #1 {all -> 0x07a3, blocks: (B:5:0x006b, B:9:0x00c1, B:8:0x0084, B:17:0x0196, B:21:0x01f2, B:33:0x02c6, B:37:0x0319, B:86:0x067d, B:90:0x06d9, B:89:0x069a, B:94:0x0730, B:98:0x078c, B:97:0x074c, B:45:0x03e9, B:49:0x043f, B:48:0x0402, B:36:0x02d6, B:20:0x01b3, B:24:0x024f, B:28:0x02a9, B:27:0x0268), top: B:114:0x0025 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r5v48 */
        /* JADX WARN: Type inference failed for: r5v49 */
        /* JADX WARN: Type inference failed for: r5v50 */
        /* JADX WARN: Type inference failed for: r5v74, types: [int] */
        /* JADX WARN: Type inference failed for: r5v75 */
        /* JADX WARN: Type inference failed for: r5v76 */
        /* JADX WARN: Type inference failed for: r5v80, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v82, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r5v83 */
        /* JADX WARN: Type inference failed for: r5v90 */
        /* JADX WARN: Type inference failed for: r5v91 */
        /* JADX WARN: Type inference failed for: r5v92 */
        /* JADX WARN: Type inference failed for: r9v73, types: [java.lang.reflect.Method] */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException
            */
        public static java.lang.Object[] getSDKTransactionID(android.content.Context r42, int r43, int r44) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1973
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.l.getSDKAppID.getSDKReferenceNumber.getSDKTransactionID(android.content.Context, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{63, -110, -75, -71, 8, -9, 39, 21, -1, -1, -13, 5, 7, -7, 19, -3, 17, 4, 29, -33, 14, 17, 3, -7, -46, 7, 18, 9, -3, 0, 17, 12, 8, -13, 17, 0, 7, 34, -13, -6, 2, 22, -8, 5, 42, -11, -11, 23, -6, 14, -9, 21, -7, 5, 8, -9, 39, 21, -1, Tnaf.POW_2_WIDTH, -41, 6, 45, 11, 1, 27, 39};
            $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE;
        }

        static void init$1() {
            $$d = new byte[]{83, -124, 59};
            $$e = 57;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        getMessageVersion = 1;
        AuthenticationRequestParameters();
        AndroidCharacter.getMirror('0');
        new getSDKReferenceNumber((byte) 0);
        int i11 = getMessageVersion + 111;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ getSDKAppID(byte b11) {
        this(Calendar.getInstance());
    }

    static void AuthenticationRequestParameters() {
        getSDKTransactionID = new char[]{64806, 64850, 64829, 64857, 64818, 64812, 64842, 64845, 64860, 64881, 64878, 64872};
        getSDKAppID = -185467487;
        getDeviceData = true;
        getSDKReferenceNumber = true;
    }

    private static void a(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        Class cls;
        Object method;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            $10 = ($11 + 33) % 128;
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        if (str != null) {
            int i12 = $10 + 95;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.az.ChallengeStatusReceiver challengeStatusReceiver = new atd.az.ChallengeStatusReceiver();
        char[] cArr2 = getSDKTransactionID;
        Class cls2 = Integer.TYPE;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                $11 = ($10 + 123) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i13])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(508097192);
                    if (obj != null) {
                        method = obj;
                        cls = cls2;
                    } else {
                        cls = cls2;
                        method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(328 - ExpandableListView.getPackedPositionGroup(0L), (char) TextUtils.indexOf("", "", 0), 32 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("o", cls);
                        map.put(508097192, method);
                    }
                    cArr3[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i13++;
                    cArr2 = cArr2;
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
        }
        Class cls3 = cls2;
        Object[] objArr3 = {Integer.valueOf(getSDKAppID)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method2 = map2.get(-852383591);
        if (method2 == null) {
            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.rgb(0, 0, 0) + 16779277, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 17 - (ViewConfiguration.getEdgeSlop() >> 16));
            byte b11 = (byte) 0;
            byte b12 = (byte) (b11 + 1);
            Object[] objArr4 = new Object[1];
            b(b11, b12, (byte) (-b12), objArr4);
            method2 = cls4.getMethod((String) objArr4[0], cls3);
            map2.put(-852383591, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        boolean z11 = getSDKReferenceNumber;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        if (z11) {
            $11 = ($10 + 5) % 128;
            int length2 = bArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length2;
            char[] cArr4 = new char[length2];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i14 = challengeStatusReceiver.getDeviceData;
                int i15 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                $10 = ($11 + 35) % 128;
                cArr4[i14] = (char) (cArr2[bArr[(i15 - 1) - i14] + i11] - iIntValue);
                Object[] objArr5 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method3 = map3.get(-249860496);
                if (method3 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1156 - AndroidCharacter.getMirror('0'), (char) (TypedValue.complexToFraction(0, f11, f11) > f11 ? 1 : (TypedValue.complexToFraction(0, f11, f11) == f11 ? 0 : -1)), TextUtils.getTrimmedLength("") + 50);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, (byte) (b14 - 1), objArr6);
                    method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map3.put(-249860496, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
        } else if (getDeviceData) {
            int length3 = cArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length3;
            char[] cArr5 = new char[length3];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i16 = challengeStatusReceiver.getDeviceData;
                int i17 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                $11 = ($10 + 33) % 128;
                cArr5[i16] = (char) (cArr2[cArr[(i17 - 1) - i16] - i11] - iIntValue);
                Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-249860496);
                if (method4 == null) {
                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1108 - KeyEvent.getDeadChar(0, 0), (char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 49 - MotionEvent.axisFromString(""));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, (byte) (b16 - 1), objArr8);
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
                int i18 = challengeStatusReceiver.getDeviceData;
                int i19 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i18] = (char) (cArr2[iArr[(i19 - 1) - i18] - i11] - iIntValue);
                    challengeStatusReceiver.getDeviceData = i18 + 1;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r0 = 1 - r6
            int r8 = r8 + 4
            byte[] r1 = atd.l.getSDKAppID.$$a
            int r7 = r7 * 2
            int r7 = 109 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r8
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r1
            r1 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L30:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.l.getSDKAppID.b(byte, short, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{32, 120, 5, 50};
        $$b = 224;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        Object[] objArr = new Object[1];
        a(null, null, 127 - (Process.myPid() >> 22), "\u0086\u0086\u0085\u0085\u0084\u0084\u0083\u0083\u0082\u0082\u0081\u0081\u0081\u0081", objArr);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((String) objArr[0]).intern(), Locale.getDefault());
        Object[] objArr2 = new Object[1];
        a(null, null, TextUtils.lastIndexOf("", '0', 0) + 128, "\u0089\u0088\u0087", objArr2);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(((String) objArr2[0]).intern()));
        String str = simpleDateFormat.format(this.AuthenticationRequestParameters.getTime());
        s.h(str);
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(str));
        int i11 = ChallengeResultCancelled + 13;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            return stringValueM49boximpl;
        }
        throw null;
    }

    private getSDKAppID(Calendar calendar) {
        s.k(calendar, "");
        this.AuthenticationRequestParameters = calendar;
    }

    public getSDKAppID() {
        this((byte) 0);
    }
}
