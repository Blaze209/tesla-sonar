package atd.m;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Sku;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultError extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char[] getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Sku$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int getDeviceData;
        private static long getSDKAppID;
        private static int getSDKReferenceNumber;
        private static char getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = 0;
            getSDKReferenceNumber = 1;
            getSDKAppID = -4201337076207898698L;
            AuthenticationRequestParameters = -1910121952;
            getSDKTransactionID = (char) 12214;
        }

        private getSDKTransactionID() {
        }

        private static void a(String str, String str2, char c11, String str3, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            Integer num = -2032575242;
            Integer num2 = 262890898;
            if (str3 != null) {
                $11 = ($10 + 47) % 128;
                charArray = str3.toCharArray();
            } else {
                charArray = str3;
            }
            char[] cArr = charArray;
            char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
            char[] charArray3 = str != null ? str.toCharArray() : str;
            atd.az.ChallengeResultTimeout challengeResultTimeout = new atd.az.ChallengeResultTimeout();
            int length = charArray3.length;
            char[] cArr2 = new char[length];
            int length2 = charArray2.length;
            char[] cArr3 = new char[length2];
            int i12 = 0;
            System.arraycopy(charArray3, 0, cArr2, 0, length);
            System.arraycopy(charArray2, 0, cArr3, 0, length2);
            cArr2[0] = (char) (cArr2[0] ^ c11);
            int i13 = 2;
            cArr3[2] = (char) (cArr3[2] + ((char) i11));
            int length3 = cArr.length;
            char[] cArr4 = new char[length3];
            challengeResultTimeout.getSDKTransactionID = 0;
            while (challengeResultTimeout.getSDKTransactionID < length3) {
                try {
                    Object[] objArr2 = {challengeResultTimeout};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(num2);
                    int i14 = i13;
                    if (method == null) {
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(1863 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) View.resolveSizeAndState(i12, i12, i12), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        c(b11, b12, b12, objArr3);
                        method = cls.getMethod((String) objArr3[0], Object.class);
                        map.put(num2, method);
                    }
                    int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    Object[] objArr4 = {challengeResultTimeout};
                    Object method2 = map.get(num);
                    if (method2 == null) {
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(View.resolveSizeAndState(0, 0, 0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, (char) KeyEvent.normalizeMetaState(0), TextUtils.indexOf("", "", 0) + 43)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                        map.put(num, method2);
                    }
                    int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                    int i15 = cArr2[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                    Object[] objArr5 = new Object[3];
                    objArr5[i14] = Integer.valueOf(cArr3[iIntValue]);
                    objArr5[1] = Integer.valueOf(i15);
                    objArr5[0] = challengeResultTimeout;
                    Object method3 = map.get(484986213);
                    Class cls2 = Integer.TYPE;
                    if (method3 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getLongPressTimeout() >> 16) + 2446, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 18 - View.MeasureSpec.getSize(0));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr6 = new Object[1];
                        c(b13, b14, (byte) (b14 + 1), objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                        map.put(484986213, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                    int i16 = cArr2[iIntValue2] * 32718;
                    Object[] objArr7 = new Object[i14];
                    objArr7[1] = Integer.valueOf(cArr3[iIntValue]);
                    objArr7[0] = Integer.valueOf(i16);
                    Object method4 = map.get(-919285918);
                    if (method4 == null) {
                        method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2970, (char) (9913 - Color.red(0)), 36 - Process.getGidForName(""))).getMethod("g", cls2, cls2);
                        map.put(-919285918, method4);
                    }
                    cArr3[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                    char c12 = challengeResultTimeout.getDeviceData;
                    cArr2[iIntValue2] = c12;
                    int i17 = challengeResultTimeout.getSDKTransactionID;
                    cArr4[i17] = (char) (((((long) (c12 ^ cArr[i17])) ^ (getSDKAppID ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) AuthenticationRequestParameters) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) getSDKTransactionID) ^ (-4201337076207898698L)))));
                    challengeResultTimeout.getSDKTransactionID = i17 + 1;
                    cArr = cArr;
                    length3 = length3;
                    cArr2 = cArr2;
                    num2 = num2;
                    num = num;
                    i13 = 2;
                    i12 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            String str4 = new String(cArr4);
            int i18 = $10 + 75;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                throw null;
            }
            objArr[0] = str4;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(short r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 20
                int r8 = 23 - r8
                int r6 = r6 * 18
                int r0 = r6 + 3
                byte[] r1 = atd.m.ChallengeResultError.getSDKTransactionID.$$a
                int r7 = r7 * 2
                int r7 = r7 + 103
                byte[] r0 = new byte[r0]
                int r6 = r6 + 2
                r2 = 0
                if (r1 != 0) goto L19
                r3 = r1
                r4 = r2
                r1 = r8
                goto L32
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r8 = r8 + 1
                if (r3 != r6) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r1
                r1 = r8
                r8 = r4
                r4 = r3
                r3 = r5
            L32:
                int r7 = r7 + r8
                int r7 = r7 + 3
                r8 = r1
                r1 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.ChallengeResultError.getSDKTransactionID.b(short, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 4
                int r6 = 3 - r6
                int r8 = r8 * 4
                int r8 = r8 + 102
                byte[] r0 = atd.m.ChallengeResultError.getSDKTransactionID.$$d
                int r7 = r7 * 4
                int r1 = 1 - r7
                byte[] r1 = new byte[r1]
                r2 = 0
                int r7 = 0 - r7
                if (r0 != 0) goto L19
                r8 = r6
                r4 = r7
                r3 = r2
                goto L30
            L19:
                r3 = r2
            L1a:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r7) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L29:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r5
            L30:
                int r4 = -r4
                int r6 = r6 + r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.ChallengeResultError.getSDKTransactionID.c(short, short, int, java.lang.Object[]):void");
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKReferenceNumber(int r41, int r42) {
            /*
                Method dump skipped, instruction units count: 2235
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.ChallengeResultError.getSDKTransactionID.getSDKReferenceNumber(int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{72, 37, -103, 75, -5, 12, -36, -18, 4, 4, Tnaf.POW_2_WIDTH, -2, -4, 10, -16, 6, -14, -1, -26, 36, -11, -14, 0, 10, 2, -24};
            $$b = EnumC4419g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE;
        }

        static void init$1() {
            $$d = new byte[]{41, -37, 52, 7};
            $$e = 193;
        }

        public /* synthetic */ getSDKTransactionID(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKReferenceNumber();
        Color.argb(0, 0, 0, 0);
        new getSDKTransactionID((byte) 0);
        int i11 = getSDKEphemeralPublicKey + 91;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 57 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    private static void a(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] cArr;
        char[] cArr2;
        String str3 = str2;
        int i12 = $10 + 33;
        $11 = i12 % 128;
        int i13 = 2;
        int i14 = 0;
        Object obj = str3;
        if (i12 % 2 == 0) {
            int i15 = 15 / 0;
            if (str3 != null) {
                obj = str3;
                byte[] bytes = str3.getBytes("ISO-8859-1");
                $11 = ($10 + 61) % 128;
                obj = bytes;
            }
        } else if (str3 != null) {
            obj = str3;
            byte[] bytes2 = str3.getBytes("ISO-8859-1");
            $11 = ($10 + 61) % 128;
            obj = bytes2;
        }
        obj = str3;
        byte[] bArr = (byte[]) obj;
        if (str != null) {
            charArray = str.toCharArray();
            $10 = ($11 + 21) % 128;
        } else {
            charArray = str;
        }
        char[] cArr3 = charArray;
        atd.az.ChallengeStatusReceiver challengeStatusReceiver = new atd.az.ChallengeStatusReceiver();
        char[] cArr4 = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                $10 = ($11 + 109) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i16])};
                    int i17 = i13;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj2 = map.get(508097192);
                    if (obj2 == null) {
                        Method method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.normalizeMetaState(i14) + EnumC4419g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, (char) Color.argb(i14, i14, i14, i14), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 32)).getMethod("o", cls);
                        map.put(508097192, method);
                        obj2 = method;
                    }
                    cArr5[i16] = ((Character) ((Method) obj2).invoke(null, objArr2)).charValue();
                    i16++;
                    cArr4 = cArr4;
                    i13 = i17;
                    i14 = i14;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr5;
        }
        int i18 = i13;
        int i19 = i14;
        Object[] objArr3 = {Integer.valueOf(getSDKAppID)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method2 = map2.get(-852383591);
        if (method2 == null) {
            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2061 - Color.alpha(i19), (char) (1 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', i19, i19) + 18);
            byte b11 = (byte) i19;
            byte b12 = (byte) (b11 + 1);
            Object[] objArr4 = new Object[1];
            b(b11, b12, (byte) (b12 - 1), objArr4);
            method2 = cls2.getMethod((String) objArr4[i19], cls);
            map2.put(-852383591, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        if (AuthenticationRequestParameters) {
            int i21 = $10 + 25;
            $11 = i21 % 128;
            if (i21 % 2 == 0) {
                int length2 = bArr.length;
                challengeStatusReceiver.getSDKReferenceNumber = length2;
                cArr2 = new char[length2];
                challengeStatusReceiver.getDeviceData = 1;
            } else {
                int length3 = bArr.length;
                challengeStatusReceiver.getSDKReferenceNumber = length3;
                cArr2 = new char[length3];
                challengeStatusReceiver.getDeviceData = 0;
            }
            while (true) {
                int i22 = challengeStatusReceiver.getDeviceData;
                int i23 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i22 >= i23) {
                    objArr[0] = new String(cArr2);
                    return;
                }
                cArr2[i22] = (char) (cArr4[bArr[(i23 - 1) - i22] + i11] - iIntValue);
                Object[] objArr5 = new Object[i18];
                objArr5[1] = challengeStatusReceiver;
                objArr5[0] = challengeStatusReceiver;
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method3 = map3.get(-249860496);
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1108 - KeyEvent.keyCodeFromString(""), (char) TextUtils.indexOf("", "", 0), 49 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                    map3.put(-249860496, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                i18 = 2;
            }
        } else if (getSDKTransactionID) {
            int i24 = $11 + 69;
            $10 = i24 % 128;
            if (i24 % 2 != 0) {
                int length4 = cArr3.length;
                challengeStatusReceiver.getSDKReferenceNumber = length4;
                cArr = new char[length4];
                challengeStatusReceiver.getDeviceData = 1;
            } else {
                int length5 = cArr3.length;
                challengeStatusReceiver.getSDKReferenceNumber = length5;
                cArr = new char[length5];
                challengeStatusReceiver.getDeviceData = 0;
            }
            while (true) {
                int i25 = challengeStatusReceiver.getDeviceData;
                int i26 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i25 >= i26) {
                    objArr[0] = new String(cArr);
                    return;
                }
                int i27 = $10 + 117;
                $11 = i27 % 128;
                if (i27 % 2 == 0) {
                    cArr[i25] = (char) (cArr4[cArr3[0 / i25] / i11] << iIntValue);
                    Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method4 = map4.get(-249860496);
                    if (method4 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1107 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 50 - TextUtils.getOffsetAfter("", 0));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr8 = new Object[1];
                        b(b15, b16, b16, objArr8);
                        method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                        map4.put(-249860496, method4);
                    }
                    ((Method) method4).invoke(null, objArr7);
                } else {
                    cArr[i25] = (char) (cArr4[cArr3[(i26 - 1) - i25] - i11] - iIntValue);
                    Object[] objArr9 = {challengeStatusReceiver, challengeStatusReceiver};
                    Map map5 = atd.a.getMessageVersion.timedout;
                    Object method5 = map5.get(-249860496);
                    if (method5 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1108, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.green(0) + 50);
                        byte b17 = (byte) 0;
                        byte b18 = b17;
                        Object[] objArr10 = new Object[1];
                        b(b17, b18, b18, objArr10);
                        method5 = cls5.getMethod((String) objArr10[0], Object.class, Object.class);
                        map5.put(-249860496, method5);
                    }
                    ((Method) method5).invoke(null, objArr9);
                }
            }
        } else {
            int length6 = iArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length6;
            char[] cArr6 = new char[length6];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i28 = challengeStatusReceiver.getDeviceData;
                int i29 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i28 >= i29) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    $10 = ($11 + 115) % 128;
                    cArr6[i28] = (char) (cArr4[iArr[(i29 - 1) - i28] - i11] - iIntValue);
                    challengeStatusReceiver.getDeviceData = i28 + 1;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 3
            int r0 = r5 + 1
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r1 = atd.m.ChallengeResultError.$$a
            int r6 = r6 * 2
            int r6 = 109 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r6
            r4 = r2
            r6 = r5
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            r3 = r1[r7]
        L29:
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.m.ChallengeResultError.b(short, byte, short, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getSDKReferenceNumber = new char[]{64692, 64701, 64702, 64698, 64690, 64744, 64760, 64756, 64758};
        getSDKAppID = -185467605;
        getSDKTransactionID = true;
        AuthenticationRequestParameters = true;
    }

    static void init$0() {
        $$a = new byte[]{29, -91, 33, -72};
        $$b = 110;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        if (Build.VERSION.SDK_INT < 31) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        String str = Build.SKU;
        Object[] objArr = new Object[1];
        a(null, null, TextUtils.indexOf("", "", 0, 0) + 127, "\u0082\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
        if (s.f(str, ((String) objArr[0]).intern())) {
            str = null;
        } else {
            int i11 = getDeviceData + 49;
            getSDKEphemeralPublicKey = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }
        if (str == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        getSDKEphemeralPublicKey = (getDeviceData + 19) % 128;
        return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(str));
    }
}
