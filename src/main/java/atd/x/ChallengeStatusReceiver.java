package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextAutoPunctuate;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeStatusReceiver extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static char[] getDeviceData;
    private static int getSDKAppID;
    private static long getSDKReferenceNumber;
    private final atd.q.AuthenticationRequestParameters getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextAutoPunctuate$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int ChallengeResultCancelled;
        private static int getDeviceData;
        private static boolean getSDKAppID;
        private static boolean getSDKReferenceNumber;
        private static char[] getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            AuthenticationRequestParameters = 0;
            ChallengeResultCancelled = 1;
            getSDKTransactionID = new char[]{64701, 64696};
            getDeviceData = -185467620;
            getSDKReferenceNumber = true;
            getSDKAppID = true;
        }

        private getDeviceData() {
        }

        private static void a(int i11, int i12, short s11, Object[] objArr) {
            int i13 = 40 - (s11 * 37);
            byte[] bArr = $$a;
            int i14 = i11 * 17;
            int i15 = (i12 * 6) + 97;
            byte[] bArr2 = new byte[38 - i14];
            int i16 = 37 - i14;
            int i17 = -1;
            if (bArr == null) {
                i15 = (i15 + i13) - 8;
                i13 = i13;
                bArr = bArr;
                i17 = -1;
            }
            while (true) {
                int i18 = i13 + 1;
                int i19 = i17 + 1;
                bArr2[i19] = (byte) i15;
                if (i19 == i16) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                byte[] bArr3 = bArr;
                i15 = (i15 + bArr[i18]) - 8;
                i13 = i18;
                bArr = bArr3;
                i17 = i19;
            }
        }

        /* JADX WARN: Code duplicated, block: B:8:0x002e  */
        private static void b(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
            char[] charArray;
            Class cls;
            Object method;
            String str3 = str2;
            int i12 = $10 + 73;
            $11 = i12 % 128;
            int i13 = 0;
            Object obj = str3;
            if (i12 % 2 == 0) {
                int i14 = 83 / 0;
                if (str3 != null) {
                    obj = str3;
                    byte[] bytes = str3.getBytes("ISO-8859-1");
                    $11 = ($10 + 107) % 128;
                    obj = bytes;
                }
            } else if (str3 != null) {
                obj = str3;
                byte[] bytes2 = str3.getBytes("ISO-8859-1");
                $11 = ($10 + 107) % 128;
                obj = bytes2;
            }
            obj = str3;
            byte[] bArr = (byte[]) obj;
            if (str != null) {
                int i15 = $11 + 17;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
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
                int i16 = 0;
                while (i16 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i16])};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj2 = map.get(508097192);
                        if (obj2 != null) {
                            cls = cls2;
                            method = obj2;
                        } else {
                            int i17 = i13;
                            cls = cls2;
                            method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(328 - View.MeasureSpec.getSize(i17), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(i17, i17) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i17, i17) == 0L ? 0 : -1))), 32 - KeyEvent.keyCodeFromString(""))).getMethod("o", cls);
                            map.put(508097192, method);
                        }
                        cArr3[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i16++;
                        cArr2 = cArr2;
                        cls2 = cls;
                        i13 = 0;
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
            Object[] objArr3 = {Integer.valueOf(getDeviceData)};
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method2 = map2.get(-852383591);
            if (method2 == null) {
                Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2061 - View.resolveSize(0, 0), (char) View.MeasureSpec.getMode(0), 17 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                byte b11 = (byte) 1;
                byte b12 = (byte) (b11 - 1);
                Object[] objArr4 = new Object[1];
                c(b11, b12, b12, objArr4);
                method2 = cls4.getMethod((String) objArr4[0], cls3);
                map2.put(-852383591, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
            if (getSDKAppID) {
                int length2 = bArr.length;
                challengeStatusReceiver.getSDKReferenceNumber = length2;
                char[] cArr4 = new char[length2];
                challengeStatusReceiver.getDeviceData = 0;
                while (true) {
                    int i18 = challengeStatusReceiver.getDeviceData;
                    int i19 = challengeStatusReceiver.getSDKReferenceNumber;
                    if (i18 >= i19) {
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    cArr4[i18] = (char) (cArr2[bArr[(i19 - 1) - i18] + i11] - iIntValue);
                    Object[] objArr5 = {challengeStatusReceiver, challengeStatusReceiver};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-249860496);
                    if (method3 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1107 - Process.getGidForName(""), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 50 - KeyEvent.getDeadChar(0, 0));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr6 = new Object[1];
                        c(b13, b14, b14, objArr6);
                        method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                        map3.put(-249860496, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                }
            } else if (getSDKReferenceNumber) {
                $11 = ($10 + 93) % 128;
                int length3 = cArr.length;
                challengeStatusReceiver.getSDKReferenceNumber = length3;
                char[] cArr5 = new char[length3];
                challengeStatusReceiver.getDeviceData = 0;
                while (true) {
                    int i21 = challengeStatusReceiver.getDeviceData;
                    int i22 = challengeStatusReceiver.getSDKReferenceNumber;
                    if (i21 >= i22) {
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    $11 = ($10 + 31) % 128;
                    cArr5[i21] = (char) (cArr2[cArr[(i22 - 1) - i21] - i11] - iIntValue);
                    Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method4 = map4.get(-249860496);
                    if (method4 == null) {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "", 0, 0) + 1108, (char) ((-16777216) - Color.rgb(0, 0, 0)), Color.red(0) + 50);
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr8 = new Object[1];
                        c(b15, b16, b16, objArr8);
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

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 3
                int r9 = 1 - r9
                byte[] r0 = atd.x.ChallengeStatusReceiver.getDeviceData.$$d
                int r8 = r8 * 4
                int r8 = 4 - r8
                int r7 = r7 * 2
                int r7 = 109 - r7
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r0
                r4 = r2
                r0 = r8
                goto L31
            L17:
                r3 = r8
                r8 = r7
                r7 = r3
                r3 = r2
            L1b:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r0
                r0 = r6
            L31:
                int r8 = r8 + 1
                int r7 = -r7
                int r7 = r7 + r0
                r0 = r8
                r8 = r7
                r7 = r0
                r0 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeStatusReceiver.getDeviceData.c(byte, short, byte, java.lang.Object[]):void");
        }

        public static void getSDKTransactionID(long j11, long j12) throws Throwable {
            byte[] bArr = $$a;
            byte b11 = bArr[36];
            byte b12 = b11;
            Object[] objArr = new Object[1];
            a(b11, b12, (byte) (b12 + 1), objArr);
            Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
            AuthenticationRequestParameters = (ChallengeResultCancelled + 117) % 128;
            try {
                byte b13 = bArr[36];
                byte b14 = b13;
                Object[] objArr2 = new Object[1];
                a(b13, b14, (byte) (b14 + 1), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b15 = (byte) ($$b & 3);
                Object[] objArr3 = new Object[1];
                a(b15, b15, bArr[36], objArr3);
                Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(null, null);
                Object[] objArr4 = {atd.ap.getDeviceData.class.getField("getSDKAppID").get(null)};
                Object[] objArr5 = new Object[1];
                b(null, null, View.MeasureSpec.getSize(0) + 127, "\u0082\u0082\u0081", objArr5);
                ChallengeResultCancelled = (AuthenticationRequestParameters + 89) % 128;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        static void init$0() {
            $$a = new byte[]{77, -102, -36, 111, 27, -8, -46, 59, 26, -61, 27, 60, 7, -4, 5, 17, 14, -3, 2, 6, 27, -3, 14, 7, -20, 27, 20, 12, -8, 22, 9, -28, 25, 25, -9, 20, 0, 23, -7, 21, 9, 6, 23, -25, -7, 15, 15, 27, 9, 7, 21, -5, 17, -3, 10, -15, 47, 0, -3, 11, 21};
            $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE;
        }

        static void init$1() {
            $$d = new byte[]{97, -77, -57, -120};
            $$e = EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        AuthenticationRequestParameters = 1;
        getSDKReferenceNumber();
        AudioTrack.getMaxVolume();
        PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        MotionEvent.axisFromString("");
        new getDeviceData((byte) 0);
        AuthenticationRequestParameters = (getSDKAppID + 75) % 128;
    }

    public /* synthetic */ ChallengeStatusReceiver(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:40:0x01da  */
    private static void a(char c11, int i11, int i12, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13;
        int i14;
        Object method;
        atd.az.BuildConfig buildConfig = new atd.az.BuildConfig();
        long[] jArr = new long[i12];
        int i15 = 0;
        buildConfig.getDeviceData = 0;
        while (true) {
            int i16 = buildConfig.getDeviceData;
            if (i16 >= i12) {
                break;
            }
            $10 = ($11 + 61) % 128;
            try {
                Object[] objArr2 = {Integer.valueOf(getDeviceData[i11 + i16])};
                Map map = atd.a.getMessageVersion.timedout;
                Object obj = map.get(1019086628);
                Class cls = Integer.TYPE;
                if (obj != null) {
                    i14 = i15;
                    method = obj;
                    i13 = 2;
                } else {
                    i13 = 2;
                    Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1774 - Color.green(i15), (char) (ViewConfiguration.getTouchSlop() >> 8), KeyEvent.keyCodeFromString("") + 32);
                    byte b11 = (byte) i15;
                    byte b12 = b11;
                    i14 = i15;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls2.getMethod((String) objArr3[i14], cls);
                    map.put(1019086628, method);
                }
                Long l11 = (Long) ((Method) method).invoke(null, objArr2);
                l11.longValue();
                long j11 = buildConfig.getDeviceData;
                long j12 = getSDKReferenceNumber;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c11);
                objArr4[i13] = Long.valueOf(j12);
                objArr4[1] = Long.valueOf(j11);
                objArr4[i14] = l11;
                Object method2 = map.get(-1106061844);
                if (method2 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(441 - (TypedValue.complexToFloat(i14) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(i14) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 36);
                    Class cls4 = Long.TYPE;
                    method2 = cls3.getMethod("n", cls4, cls4, cls4, cls);
                    map.put(-1106061844, method2);
                }
                jArr[i16] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr5 = new Object[i13];
                objArr5[1] = buildConfig;
                objArr5[i14] = buildConfig;
                Object method3 = map.get(1947342796);
                if (method3 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0') + 1920, (char) TextUtils.getOffsetBefore("", i14), 29 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 + 1);
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, (byte) (b14 - 1), objArr6);
                    method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map.put(1947342796, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                $10 = ($11 + 125) % 128;
                jArr = jArr;
                i15 = 0;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        long[] jArr2 = jArr;
        char[] cArr = new char[i12];
        buildConfig.getDeviceData = 0;
        while (true) {
            int i17 = buildConfig.getDeviceData;
            if (i17 >= i12) {
                objArr[0] = new String(cArr);
                return;
            }
            $10 = ($11 + 21) % 128;
            cArr[i17] = (char) jArr2[i17];
            Object[] objArr7 = {buildConfig, buildConfig};
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method4 = map2.get(1947342796);
            if (method4 == null) {
                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1920 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 28 - TextUtils.lastIndexOf("", '0', 0, 0));
                byte b15 = (byte) 0;
                byte b16 = (byte) (b15 + 1);
                Object[] objArr8 = new Object[1];
                b(b15, b16, (byte) (b16 - 1), objArr8);
                method4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                map2.put(1947342796, method4);
            }
            ((Method) method4).invoke(null, objArr7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = r5 + 4
            int r6 = r6 * 5
            int r6 = r6 + 108
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = atd.x.ChallengeStatusReceiver.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            r3 = r6
            if (r1 != 0) goto L19
            r4 = r2
            r6 = r5
            goto L2d
        L19:
            r6 = r5
            r5 = r3
            r3 = r2
        L1c:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2b
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L2b:
            r3 = r1[r6]
        L2d:
            int r5 = r5 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeStatusReceiver.b(short, short, short, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getDeviceData = new char[]{26476, 35336, 48537, 44850, 53906, 50253, 63448, 6515, 3310, 16265, 8472, 21692, 17977, 27096, 17100, 45004, 39004, 35562};
        getSDKReferenceNumber = 5526828554847317256L;
    }

    static void init$0() {
        $$a = new byte[]{97, -77, -57, -120};
        $$b = 136;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        Boolean sDKReferenceNumber;
        getSDKAppID = (AuthenticationRequestParameters + 93) % 128;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        a((char) (TextUtils.getOffsetBefore("", 0) + 26485), ViewConfiguration.getPressedStateDuration() >> 16, TextUtils.lastIndexOf("", '0') + 15, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID == null || (sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID)) == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        AuthenticationRequestParameters = (getSDKAppID + 21) % 128;
        DeviceParameterResult.Success.BooleanValue booleanValueM14boximpl = DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
        int i11 = getSDKAppID + 87;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return booleanValueM14boximpl;
        }
        throw null;
    }

    private ChallengeStatusReceiver(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKTransactionID = authenticationRequestParameters;
    }
}
