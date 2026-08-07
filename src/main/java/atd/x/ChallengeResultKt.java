package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextAutoCaps;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultKt extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static short[] ChallengeResult;
    private static byte[] getDeviceData;
    private static int getMessageVersion;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKAppID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextAutoCaps$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static long getDeviceData;
        private static int getSDKAppID;
        private static int getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKTransactionID = 0;
            getSDKAppID = 1;
            getDeviceData = 9121745949842436545L;
        }

        private getDeviceData() {
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
        private static void a(byte r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = atd.x.ChallengeResultKt.getDeviceData.$$a
                int r7 = r7 * 37
                int r7 = r7 + 4
                int r8 = r8 * 6
                int r8 = r8 + 97
                int r6 = r6 * 17
                int r1 = 38 - r6
                byte[] r1 = new byte[r1]
                int r6 = 37 - r6
                r2 = 0
                if (r0 != 0) goto L1a
                r8 = r7
                r3 = r0
                r4 = r2
                r0 = r6
                goto L32
            L1a:
                r3 = r2
            L1b:
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
                int r0 = r0 + r7
                int r7 = r0 + (-8)
                int r8 = r8 + 1
                r0 = r8
                r8 = r7
                r7 = r0
                r0 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeResultKt.getDeviceData.a(byte, int, byte, java.lang.Object[]):void");
        }

        private static void b(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            if (str != null) {
                int i12 = $11 + 105;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    str.toCharArray();
                    throw null;
                }
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            atd.az.getAdditionalDetails getadditionaldetails = new atd.az.getAdditionalDetails();
            char[] deviceData = atd.az.getAdditionalDetails.getDeviceData(getDeviceData ^ 4326518537449951405L, charArray, i11);
            getadditionaldetails.getDeviceData = 4;
            while (true) {
                int i13 = getadditionaldetails.getDeviceData;
                if (i13 >= deviceData.length) {
                    String str2 = new String(deviceData, 4, deviceData.length - 4);
                    $10 = ($11 + 91) % 128;
                    objArr[0] = str2;
                    return;
                }
                $11 = ($10 + 93) % 128;
                int i14 = i13 - 4;
                getadditionaldetails.getSDKTransactionID = i14;
                try {
                    Object[] objArr2 = {Long.valueOf(deviceData[i13] ^ deviceData[i13 % 4]), Long.valueOf(i14), Long.valueOf(getDeviceData)};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(-1024136788);
                    if (method == null) {
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2748, (char) (54838 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 29);
                        Class cls2 = Long.TYPE;
                        method = cls.getMethod("c", cls2, cls2, cls2);
                        map.put(-1024136788, method);
                    }
                    deviceData[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                    Object method2 = map.get(-719904898);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1401, (char) (16690 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 22 - (TypedValue.complexToFloat(0) > 0 ? 1 : (TypedValue.complexToFloat(0) == 0 ? 0 : -1)));
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr4 = new Object[1];
                        c(b11, b12, b12, objArr4);
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
        private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 3
                int r6 = r6 + 101
                byte[] r0 = atd.x.ChallengeResultKt.getDeviceData.$$d
                int r8 = r8 * 4
                int r8 = r8 + 4
                int r7 = r7 * 3
                int r1 = 1 - r7
                byte[] r1 = new byte[r1]
                r2 = 0
                int r7 = 0 - r7
                if (r0 != 0) goto L19
                r3 = r0
                r4 = r2
                r0 = r8
                goto L30
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r0[r8]
                r5 = r0
                r0 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L30:
                int r6 = -r6
                int r8 = r8 + 1
                int r6 = r6 + r0
                r0 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeResultKt.getDeviceData.c(short, int, byte, java.lang.Object[]):void");
        }

        public static void getSDKTransactionID(long j11, long j12) throws Throwable {
            int i11 = getSDKTransactionID + 29;
            getSDKAppID = i11 % 128;
            if (i11 % 2 == 0) {
                byte b11 = $$a[2];
                byte b12 = b11;
                Object[] objArr = new Object[1];
                a(b11, b12, b12, objArr);
                Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
                throw null;
            }
            byte[] bArr = $$a;
            byte b13 = bArr[2];
            byte b14 = b13;
            Object[] objArr2 = new Object[1];
            a(b13, b14, b14, objArr2);
            Class.forName((String) objArr2[0]).getField("getSDKReferenceNumber").get(null);
            getSDKTransactionID = (getSDKAppID + 45) % 128;
            try {
                byte b15 = bArr[2];
                byte b16 = b15;
                Object[] objArr3 = new Object[1];
                a(b15, b16, b16, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b17 = (byte) (bArr[18] - 1);
                byte b18 = b17;
                Object[] objArr4 = new Object[1];
                a(b17, b18, b18, objArr4);
                Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(null, null);
                Object[] objArr5 = {atd.ap.AuthenticationRequestParameters.class.getField("getSDKReferenceNumber").get(null)};
                Object[] objArr6 = new Object[1];
                b("ᖊ薳ᗫⒻ蚤쐘뱎", Drawable.resolveOpacity(0, 0), objArr6);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        static void init$0() {
            $$a = new byte[]{115, 82, 0, 114, 27, -8, -46, 59, 26, -61, 27, 60, 7, -4, 5, 17, 14, -3, 2, 6, 27, -3, 14, 7, -20, 27, 20, 12, -8, 22, 9, -28, 25, 25, -9, 20, 0, 23, -7, 21, 9, 6, 23, -25, -7, 15, 15, 27, 9, 7, 21, -5, 17, -3, 10, -15, 47, 0, -3, 11, 21};
            $$b = 66;
        }

        static void init$1() {
            $$d = new byte[]{59, 90, 71, -86};
            $$e = EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE;
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        getMessageVersion = 1;
        AuthenticationRequestParameters();
        Color.argb(0, 0, 0, 0);
        Process.getElapsedCpuTime();
        View.resolveSizeAndState(0, 0, 0);
        ViewConfiguration.getDoubleTapTimeout();
        TypedValue.complexToFloat(0);
        new getDeviceData((byte) 0);
        BuildConfig = (getMessageVersion + 93) % 128;
    }

    public /* synthetic */ ChallengeResultKt(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = -1236730921;
        AuthenticationRequestParameters = -1568970007;
        getSDKTransactionID = -1279922311;
        getDeviceData = new byte[]{-52, -64, -45, -51, -31, -44, -48, -67, 73, 76, 92, -2, -2};
    }

    private static void a(int i11, int i12, short s11, int i13, byte b11, Object[] objArr) throws Throwable {
        int i14;
        int i15;
        long j11;
        int i16;
        boolean z11;
        int length;
        byte[] bArr;
        Object method;
        atd.az.ChallengeResultKt challengeResultKt = new atd.az.ChallengeResultKt();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i17 = 1;
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(AuthenticationRequestParameters)};
            Map map = atd.a.getMessageVersion.timedout;
            Object method2 = map.get(557807898);
            Class cls = Integer.TYPE;
            if (method2 != null) {
                i14 = 0;
            } else {
                Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.MeasureSpec.getSize(0) + 2105, (char) (21995 - TextUtils.getCapsMode("", 0, 0)), 31 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                byte b12 = (byte) 0;
                byte b13 = b12;
                i14 = 0;
                Object[] objArr3 = new Object[1];
                b(b12, b13, (byte) (b13 + 1), objArr3);
                method2 = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(557807898, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
            int i18 = iIntValue == -1 ? 1 : i14;
            if (i18 != 0) {
                int i19 = $11 + 67;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    throw null;
                }
                byte[] bArr2 = getDeviceData;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i21 = i14;
                    j11 = -671853308956415234L;
                    while (i21 < length2) {
                        int i22 = $10 + 63;
                        int i23 = i17;
                        $11 = i22 % 128;
                        if (i22 % 2 == 0) {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i21])};
                            Map map2 = atd.a.getMessageVersion.timedout;
                            Object obj = map2.get(-844142059);
                            if (obj != null) {
                                method = obj;
                            } else {
                                int i24 = i14;
                                method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0') + 2937, (char) (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0', i24, i24) + 34)).getMethod("s", cls);
                                map2.put(-844142059, method);
                            }
                            bArr3[i21] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                            i21 /= 0;
                        } else {
                            bArr2 = bArr2;
                            i18 = i18;
                            int i25 = i21;
                            length2 = length2;
                            Object[] objArr5 = {Integer.valueOf(bArr2[i25])};
                            Map map3 = atd.a.getMessageVersion.timedout;
                            Object method3 = map3.get(-844142059);
                            if (method3 == null) {
                                method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getWindowTouchSlop() >> 8) + 2936, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 34 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod("s", cls);
                                map3.put(-844142059, method3);
                            }
                            bArr3[i25] = ((Byte) ((Method) method3).invoke(null, objArr5)).byteValue();
                            i21 = i25 + 1;
                        }
                        i17 = i23;
                        bArr2 = bArr2;
                        i18 = i18;
                        length2 = length2;
                        i14 = 0;
                    }
                    bArr2 = bArr3;
                } else {
                    j11 = -671853308956415234L;
                }
                i15 = i18;
                int i26 = i17;
                if (bArr2 != null) {
                    $10 = ($11 + 119) % 128;
                    byte[] bArr4 = getDeviceData;
                    Object[] objArr6 = new Object[2];
                    objArr6[i26] = Integer.valueOf(getSDKReferenceNumber);
                    objArr6[0] = Integer.valueOf(i13);
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method4 = map4.get(557807898);
                    if (method4 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getFadingEdgeLength() >> 16) + 2105, (char) (Color.rgb(0, 0, 0) + 16799211), 31 - Color.blue(0));
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr7 = new Object[i26];
                        b(b14, b15, (byte) (b15 + 1), objArr7);
                        method4 = cls3.getMethod((String) objArr7[0], cls, cls);
                        map4.put(557807898, method4);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) method4).invoke(null, objArr6)).intValue()]) ^ j11)) + ((int) (((long) AuthenticationRequestParameters) ^ j11)));
                } else {
                    iIntValue = (short) (((short) (((long) ChallengeResult[i13 + ((int) (((long) getSDKReferenceNumber) ^ j11))]) ^ j11)) + ((int) (((long) AuthenticationRequestParameters) ^ j11)));
                }
            } else {
                i15 = i18;
                j11 = -671853308956415234L;
            }
            if (iIntValue > 0) {
                int i27 = ((i13 + iIntValue) - 2) + ((int) (((long) getSDKReferenceNumber) ^ j11));
                if (i15 != 0) {
                    $10 = ($11 + 113) % 128;
                    i16 = 1;
                } else {
                    i16 = 0;
                }
                challengeResultKt.getDeviceData = i27 + i16;
                Object[] objArr8 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(getSDKTransactionID), sb2};
                Map map5 = atd.a.getMessageVersion.timedout;
                Object method5 = map5.get(-1793105104);
                if (method5 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.rgb(0, 0, 0) + 16779352, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 28 - Gravity.getAbsoluteGravity(0, 0));
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr9 = new Object[1];
                    b(b16, b17, b17, objArr9);
                    method5 = cls4.getMethod((String) objArr9[0], Object.class, cls, cls, Object.class);
                    map5.put(-1793105104, method5);
                }
                ((StringBuilder) ((Method) method5).invoke(null, objArr8)).append(challengeResultKt.getSDKTransactionID);
                challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                byte[] bArr5 = getDeviceData;
                if (bArr5 != null) {
                    int i28 = $10 + 97;
                    $11 = i28 % 128;
                    if (i28 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i29 = 0; i29 < length; i29++) {
                        bArr[i29] = (byte) (((long) bArr5[i29]) ^ j11);
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    $10 = ($11 + 37) % 128;
                    z11 = true;
                } else {
                    z11 = false;
                }
                challengeResultKt.getSDKReferenceNumber = 1;
                while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                    int i31 = $11 + 115;
                    $10 = i31 % 128;
                    if (i31 % 2 != 0) {
                        throw null;
                    }
                    if (z11) {
                        byte[] bArr6 = getDeviceData;
                        int i32 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i32 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr6[i32]) ^ j11)) + s11)) ^ b11));
                    } else {
                        short[] sArr = ChallengeResult;
                        int i33 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i33 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr[i33]) ^ j11)) + s11)) ^ b11));
                    }
                    sb2.append(challengeResultKt.getSDKTransactionID);
                    challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                    challengeResultKt.getSDKReferenceNumber++;
                }
            }
            String string = sb2.toString();
            $10 = ($11 + 103) % 128;
            objArr[0] = string;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 7
            int r7 = 121 - r7
            byte[] r0 = atd.x.ChallengeResultKt.$$a
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r5 = r5 * 3
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r5
            r4 = r6
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r4 = r0[r6]
            int r3 = r3 + 1
        L29:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeResultKt.b(int, int, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{36, 7, 47, 54};
        $$b = 118;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        BuildConfig = (getMessageVersion + 101) % 128;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKAppID;
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.getSize(0) - 14, View.combineMeasuredStates(0, 0) - 298747174, (short) ((-47) - (KeyEvent.getMaxKeyCode() >> 16)), (-338923817) - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            BuildConfig = (getMessageVersion + 9) % 128;
            Boolean sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
            if (sDKReferenceNumber != null) {
                BuildConfig = (getMessageVersion + 77) % 128;
                DeviceParameterResult.Success.BooleanValue booleanValueM14boximpl = DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                getMessageVersion = (BuildConfig + 25) % 128;
                return booleanValueM14boximpl;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private ChallengeResultKt(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKAppID = authenticationRequestParameters;
    }
}
