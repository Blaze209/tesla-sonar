package atd.m;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Tags;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeStatusReceiver extends DeviceParameter {
    private static char AuthenticationRequestParameters = 0;
    private static char[] getSDKAppID = null;
    private static int getSDKReferenceNumber = 1;
    private static int getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Tags$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int getDeviceData;
        private static int getSDKAppID;
        private static char[] getSDKReferenceNumber;
        private static long getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKAppID = 0;
            getDeviceData = 1;
            getSDKReferenceNumber = new char[]{16525, 15310, 46596};
            getSDKTransactionID = 7365478340887477054L;
        }

        private AuthenticationRequestParameters() {
        }

        private static void AuthenticationRequestParameters() throws Throwable {
            getDeviceData = (getSDKAppID + 109) % 128;
            byte[] bArr = $$a;
            byte b11 = bArr[36];
            byte b12 = b11;
            Object[] objArr = new Object[1];
            a(b11, b12, b12, objArr);
            Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
            getSDKAppID = (getDeviceData + 69) % 128;
            try {
                byte b13 = bArr[36];
                byte b14 = b13;
                Object[] objArr2 = new Object[1];
                a(b13, b14, b14, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b15 = (byte) ($$b & 5);
                byte b16 = b15;
                Object[] objArr3 = new Object[1];
                a(b15, b16, b16, objArr3);
                Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(null, null);
                Object[] objArr4 = {atd.ap.getSDKReferenceNumber.class.getField("AuthenticationRequestParameters").get(null)};
                Object[] objArr5 = new Object[1];
                b((char) (16532 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 4 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr5);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        private static void a(short s11, short s12, byte b11, Object[] objArr) {
            byte[] bArr = $$a;
            int i11 = (s12 * 6) + 97;
            int i12 = (b11 * 37) + 4;
            int i13 = s11 * 17;
            byte[] bArr2 = new byte[38 - i13];
            int i14 = 37 - i13;
            int i15 = -1;
            if (bArr == null) {
                int i16 = i12 + i11;
                int i17 = i12 + 1;
                int i18 = i16 - 8;
                i12 = i17;
                i11 = i18;
                bArr = bArr;
                i15 = -1;
            }
            while (true) {
                int i19 = i15 + 1;
                bArr2[i19] = (byte) i11;
                if (i19 == i14) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i12++;
                i11 = (i11 + bArr[i12]) - 8;
                bArr = bArr;
                i15 = i19;
            }
        }

        /* JADX WARN: Code duplicated, block: B:58:0x02ed  */
        /* JADX WARN: Code duplicated, block: B:59:0x02ee  */
        private static void b(char c11, int i11, int i12, Object[] objArr) throws Throwable {
            Throwable cause;
            int i13;
            int i14 = i12;
            atd.az.BuildConfig buildConfig = new atd.az.BuildConfig();
            long[] jArr = new long[i14];
            int i15 = 0;
            buildConfig.getDeviceData = 0;
            while (true) {
                int i16 = buildConfig.getDeviceData;
                if (i16 >= i14) {
                    break;
                }
                int i17 = $10 + 19;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                Class cls = Long.TYPE;
                Class cls2 = Integer.TYPE;
                if (i18 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(getSDKReferenceNumber[i11 % i16])};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(1019086628);
                        if (obj != null) {
                            i13 = i15;
                        } else {
                            i13 = i15;
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1774 - View.MeasureSpec.getSize(i15), (char) Gravity.getAbsoluteGravity(i15, i15), 31 - TextUtils.indexOf((CharSequence) "", '0'));
                            byte b11 = (byte) ($$e & 3);
                            byte b12 = (byte) (-b11);
                            Object[] objArr3 = new Object[1];
                            c(b11, b12, (byte) (b12 + 1), objArr3);
                            Method method = cls3.getMethod((String) objArr3[i13], cls2);
                            map.put(1019086628, method);
                            obj = method;
                        }
                        Long l11 = (Long) ((Method) obj).invoke(null, objArr2);
                        l11.longValue();
                        long j11 = buildConfig.getDeviceData;
                        long j12 = getSDKTransactionID;
                        Object[] objArr4 = new Object[4];
                        objArr4[3] = Integer.valueOf(c11);
                        objArr4[2] = Long.valueOf(j12);
                        objArr4[1] = Long.valueOf(j11);
                        objArr4[i13] = l11;
                        Object method2 = map.get(-1106061844);
                        if (method2 == null) {
                            method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(441 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) Color.alpha(i13), 37 - TextUtils.indexOf("", ""))).getMethod("n", cls, cls, cls, cls2);
                            map.put(-1106061844, method2);
                        }
                        jArr[i16] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                        Object[] objArr5 = new Object[2];
                        objArr5[1] = buildConfig;
                        objArr5[i13] = buildConfig;
                        Object method3 = map.get(1947342796);
                        if (method3 == null) {
                            int i19 = i13;
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.resolveSizeAndState(i19, i19, i19) + 1919, (char) Color.green(i19), (ViewConfiguration.getTouchSlop() >> 8) + 29);
                            byte b13 = (byte) 0;
                            byte b14 = (byte) (b13 - 1);
                            Object[] objArr6 = new Object[1];
                            c(b13, b14, (byte) (b14 + 1), objArr6);
                            method3 = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
                            map.put(1947342796, method3);
                        }
                        ((Method) method3).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        cause = th2.getCause();
                        if (cause != null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    jArr = jArr;
                    Object[] objArr7 = {Integer.valueOf(getSDKReferenceNumber[i11 + i16])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method4 = map2.get(1019086628);
                    if (method4 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getTrimmedLength("") + 1774, (char) TextUtils.getCapsMode("", 0, 0), View.getDefaultSize(0, 0) + 32);
                        byte b15 = (byte) ($$e & 3);
                        byte b16 = (byte) (-b15);
                        Object[] objArr8 = new Object[1];
                        c(b15, b16, (byte) (b16 + 1), objArr8);
                        method4 = cls5.getMethod((String) objArr8[0], cls2);
                        map2.put(1019086628, method4);
                    }
                    Long l12 = (Long) ((Method) method4).invoke(null, objArr7);
                    l12.longValue();
                    Object[] objArr9 = {l12, Long.valueOf(buildConfig.getDeviceData), Long.valueOf(getSDKTransactionID), Integer.valueOf(c11)};
                    Object method5 = map2.get(-1106061844);
                    if (method5 == null) {
                        method5 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 440, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37)).getMethod("n", cls, cls, cls, cls2);
                        map2.put(-1106061844, method5);
                    }
                    jArr[i16] = ((Long) ((Method) method5).invoke(null, objArr9)).longValue();
                    Object[] objArr10 = {buildConfig, buildConfig};
                    Object method6 = map2.get(1947342796);
                    if (method6 == null) {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - TextUtils.indexOf("", "", 0, 0), (char) ((-16777216) - Color.rgb(0, 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 30);
                        byte b17 = (byte) 0;
                        byte b18 = (byte) (b17 - 1);
                        Object[] objArr11 = new Object[1];
                        c(b17, b18, (byte) (b18 + 1), objArr11);
                        method6 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                        map2.put(1947342796, method6);
                    }
                    ((Method) method6).invoke(null, objArr10);
                }
                i14 = i12;
                jArr = jArr;
                i15 = 0;
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            long[] jArr2 = jArr;
            char[] cArr = new char[i14];
            buildConfig.getDeviceData = 0;
            while (true) {
                int i21 = buildConfig.getDeviceData;
                if (i21 >= i14) {
                    break;
                }
                $10 = ($11 + 77) % 128;
                cArr[i21] = (char) jArr2[i21];
                Object[] objArr12 = {buildConfig, buildConfig};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method7 = map3.get(1947342796);
                if (method7 == null) {
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - KeyEvent.getDeadChar(0, 0), (char) KeyEvent.getDeadChar(0, 0), 29 - (ViewConfiguration.getTapTimeout() >> 16));
                    byte b19 = (byte) 0;
                    byte b21 = (byte) (b19 - 1);
                    Object[] objArr13 = new Object[1];
                    c(b19, b21, (byte) (b21 + 1), objArr13);
                    method7 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                    map3.put(1947342796, method7);
                }
                ((Method) method7).invoke(null, objArr12);
            }
            String str = new String(cArr);
            int i22 = $11 + 9;
            $10 = i22 % 128;
            if (i22 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
        }

        private static void c(short s11, short s12, byte b11, Object[] objArr) {
            int i11 = s12 + 4;
            byte[] bArr = $$d;
            int i12 = 113 - (s11 * 5);
            int i13 = b11 * 3;
            byte[] bArr2 = new byte[1 - i13];
            int i14 = 0 - i13;
            int i15 = -1;
            if (bArr == null) {
                i12 += i11;
                i11 = i11;
                bArr = bArr;
                i15 = -1;
            }
            while (true) {
                int i16 = i15 + 1;
                bArr2[i16] = (byte) i12;
                int i17 = i11 + 1;
                if (i16 == i14) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                byte[] bArr3 = bArr;
                i12 += bArr[i17];
                i11 = i17;
                bArr = bArr3;
                i15 = i16;
            }
        }

        static void init$0() {
            $$a = new byte[]{34, -58, -116, -81, 27, -8, -46, 59, 26, -61, 27, 60, 7, -4, 5, 17, 14, -3, 2, 6, 27, -3, 14, 7, -20, 27, 20, 12, -8, 22, 9, -28, 25, 25, -9, 20, 0, 23, -7, 21, 9, 6, 23, -25, -7, 15, 15, 27, 9, 7, 21, -5, 17, -3, 10, -15, 47, 0, -3, 11, 21};
            $$b = 131;
        }

        static void init$1() {
            $$d = new byte[]{104, -66, 51, -36};
            $$e = 61;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        TextUtils.indexOf("", "");
        Process.myPid();
        new AuthenticationRequestParameters((byte) 0);
        int i11 = getSDKTransactionID + 51;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    static void AuthenticationRequestParameters() {
        getSDKAppID = new char[]{52462, 52383, 52459, 52456};
        AuthenticationRequestParameters = (char) 63814;
    }

    private static String getSDKReferenceNumber() {
        int i11 = getSDKTransactionID + 99;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            String str = Build.TAGS;
            s.j(str, "");
            return DeviceParameterResult.Success.StringValue.m50constructorimpl(str);
        }
        String str2 = Build.TAGS;
        s.j(str2, "");
        DeviceParameterResult.Success.StringValue.m50constructorimpl(str2);
        throw null;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        int i11 = getSDKTransactionID + 57;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return DeviceParameterResult.Success.StringValue.m49boximpl(getSDKReferenceNumber());
        }
        int i12 = 75 / 0;
        return DeviceParameterResult.Success.StringValue.m49boximpl(getSDKReferenceNumber());
    }
}
