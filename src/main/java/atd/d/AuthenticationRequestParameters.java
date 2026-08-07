package atd.d;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
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
import atd.e.getMessageVersion;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Callable;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationRequestParameters<T extends atd.e.getMessageVersion> implements Runnable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static char[] getSDKReferenceNumber;
    private static long getSDKTransactionID;
    final getSDKTransactionID<T> getDeviceData;
    private final Callable<T> getSDKAppID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        ChallengeResult = 1;
        getSDKReferenceNumber = new char[]{'9', 2614, 5144, 7805, 10378, 12970, 15575, 18154, 20824, 23351, 25947, 28539, 31117, 33706, 36298, 38909, 41500, 44152, 46671, 49264, 51857, 54452, 57053, 59576, 62219, 64813, 1882, 4469, 7057, 9644, 12236, 14833, 17430, 20031, 22552, 25209, 27864, 30395, 32976, 35577, 38164, 40756, 43357, 45942, 48543, 51133, 53654};
        getSDKTransactionID = 635484376902011480L;
    }

    public AuthenticationRequestParameters(getSDKTransactionID<T> getsdktransactionid, Callable<T> callable) {
        this.getDeviceData = getsdktransactionid;
        this.getSDKAppID = callable;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x034c  */
    /* JADX WARN: Code duplicated, block: B:68:0x034d  */
    private static void a(char c11, int i11, int i12, Object[] objArr) throws Throwable {
        Throwable cause;
        Object method;
        int i13 = i12;
        atd.az.BuildConfig buildConfig = new atd.az.BuildConfig();
        long[] jArr = new long[i13];
        int i14 = 0;
        buildConfig.getDeviceData = 0;
        while (true) {
            int i15 = buildConfig.getDeviceData;
            if (i15 >= i13) {
                break;
            }
            int i16 = $10 + 25;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            Class cls = Integer.TYPE;
            if (i17 == 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(getSDKReferenceNumber[i11 << i15])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(1019086628);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1774 - (Process.myPid() >> 22), (char) TextUtils.getOffsetBefore("", i14), 32 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 + 1), objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(1019086628, method);
                    }
                    Long l11 = (Long) ((Method) method).invoke(null, objArr2);
                    l11.longValue();
                    Object[] objArr4 = {l11, Long.valueOf(buildConfig.getDeviceData), Long.valueOf(getSDKTransactionID), Integer.valueOf(c11)};
                    Object method2 = map.get(-1106061844);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(440 - ExpandableListView.getPackedPositionChild(0L), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.getOffsetBefore("", 0) + 37);
                        Class cls4 = Long.TYPE;
                        method2 = cls3.getMethod("n", cls4, cls4, cls4, cls);
                        map.put(-1106061844, method2);
                    }
                    jArr[i15] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = {buildConfig, buildConfig};
                    Object method3 = map.get(1947342796);
                    if (method3 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - TextUtils.getOffsetBefore("", 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 29 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr6 = new Object[1];
                        b(b13, b14, b14, objArr6);
                        method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
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
                Object[] objArr7 = {Integer.valueOf(getSDKReferenceNumber[i11 + i15])};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method4 = map2.get(1019086628);
                if (method4 == null) {
                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getPressedStateDuration() >> 16) + 1774, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 31 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, (byte) (b16 + 1), objArr8);
                    method4 = cls6.getMethod((String) objArr8[0], cls);
                    map2.put(1019086628, method4);
                }
                Long l12 = (Long) ((Method) method4).invoke(null, objArr7);
                l12.longValue();
                Object[] objArr9 = {l12, Long.valueOf(buildConfig.getDeviceData), Long.valueOf(getSDKTransactionID), Integer.valueOf(c11)};
                Object method5 = map2.get(-1106061844);
                if (method5 == null) {
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(442 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 37 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    Class cls8 = Long.TYPE;
                    method5 = cls7.getMethod("n", cls8, cls8, cls8, cls);
                    map2.put(-1106061844, method5);
                }
                jArr[i15] = ((Long) ((Method) method5).invoke(null, objArr9)).longValue();
                Object[] objArr10 = {buildConfig, buildConfig};
                Object method6 = map2.get(1947342796);
                if (method6 == null) {
                    Class cls9 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Drawable.resolveOpacity(0, 0) + 1919, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 29 - TextUtils.getOffsetAfter("", 0));
                    byte b17 = (byte) 0;
                    byte b18 = b17;
                    Object[] objArr11 = new Object[1];
                    b(b17, b18, b18, objArr11);
                    method6 = cls9.getMethod((String) objArr11[0], Object.class, Object.class);
                    map2.put(1947342796, method6);
                }
                ((Method) method6).invoke(null, objArr10);
            }
            i13 = i12;
            jArr = jArr;
            i14 = 0;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        long[] jArr2 = jArr;
        char[] cArr = new char[i13];
        buildConfig.getDeviceData = 0;
        $11 = ($10 + 59) % 128;
        while (true) {
            int i18 = buildConfig.getDeviceData;
            if (i18 >= i13) {
                objArr[0] = new String(cArr);
                return;
            }
            int i19 = $11 + 83;
            $10 = i19 % 128;
            if (i19 % 2 != 0) {
                cArr[i18] = (char) jArr2[i18];
                Object[] objArr12 = {buildConfig, buildConfig};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method7 = map3.get(1947342796);
                if (method7 == null) {
                    Class cls10 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1920 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    byte b19 = (byte) 0;
                    byte b21 = b19;
                    Object[] objArr13 = new Object[1];
                    b(b19, b21, b21, objArr13);
                    method7 = cls10.getMethod((String) objArr13[0], Object.class, Object.class);
                    map3.put(1947342796, method7);
                }
                ((Method) method7).invoke(null, objArr12);
                int i21 = 9 / 0;
            } else {
                cArr[i18] = (char) jArr2[i18];
                Object[] objArr14 = {buildConfig, buildConfig};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method8 = map4.get(1947342796);
                if (method8 == null) {
                    Class cls11 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getLongPressTimeout() >> 16) + 1919, (char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 29 - (ViewConfiguration.getScrollBarSize() >> 8));
                    byte b22 = (byte) 0;
                    byte b23 = b22;
                    Object[] objArr15 = new Object[1];
                    b(b22, b23, b23, objArr15);
                    method8 = cls11.getMethod((String) objArr15[0], Object.class, Object.class);
                    map4.put(1947342796, method8);
                }
                ((Method) method8).invoke(null, objArr14);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r0 = 1 - r5
            int r7 = r7 * 5
            int r7 = 113 - r7
            byte[] r1 = atd.d.AuthenticationRequestParameters.$$a
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r5
            goto L2d
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2d:
            int r7 = r7 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.AuthenticationRequestParameters.b(int, byte, short, java.lang.Object[]):void");
    }

    private static void getSDKReferenceNumber(Runnable runnable) {
        int i11 = AuthenticationRequestParameters + 87;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            Looper.myLooper();
            Looper.getMainLooper();
            throw null;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(runnable);
            int i12 = ChallengeResult + 51;
            AuthenticationRequestParameters = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return;
        }
        runnable.run();
        int i13 = AuthenticationRequestParameters + 53;
        ChallengeResult = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 62 / 0;
        }
    }

    private void getSDKTransactionID(final T t11) {
        getSDKReferenceNumber(new Runnable() { // from class: atd.d.AuthenticationRequestParameters.2
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static int $10;
            private static int $11;
            private static char[] getSDKAppID;
            private static int getSDKEphemeralPublicKey;
            private static long getSDKReferenceNumber;
            private static int getSDKTransactionID;

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                getSDKTransactionID = 0;
                getSDKEphemeralPublicKey = 1;
                getSDKAppID = new char[]{25, 24527, 49070, 8065, 32627, 57132, 16138, 40633, 65235, 24246, 48748, 7775, 32305, 56851, 15826, 40417, 64939, 23934, 48468, 7447, 31977, 56525, 15530, 31, 24516, 49086, 8114, 32620, 57141, 16130, 40702, 65235, 24248, 48758, 7746, 32315, 56851, 15855, 40353, 64910, 23934, 25, 24527, 49070, 8065, 32627, 57132, 16138, 40633, 65235, 24246, 48748, 7775, 32305, 56851, 15826, 40417, 64920, 23932, 48404, 7458, 31996, 56517, 15538, 40046, 64579, 23592, 48134, 7154, 31659, 56195, 15199, 39761, 64318, 23278, 14384, 26595, 34693, 10170, 18241, 'W', 24516, 49086, 8080, 32563, 57132, 16128, 40702, 65220, 24310, 48750, 7751, 32319, 56857, 15755, 40363, 64909, 23923, 48463, 7428, 31979, 56532, 15548, 40043, 64581, 23655, 48128, 7160, 4293, 20225, 44843, 3928, 28598, 53224, 12244, 36415, 60952, 20087, 44719, 3720, 28414, 'I'};
                getSDKReferenceNumber = -3879781298369306719L;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r0 = r6 + 2
                    int r7 = 122 - r7
                    int r8 = r8 * 2
                    int r8 = 66 - r8
                    byte[] r1 = atd.d.AuthenticationRequestParameters.AnonymousClass2.$$a
                    byte[] r0 = new byte[r0]
                    int r6 = r6 + 1
                    r2 = 0
                    if (r1 != 0) goto L15
                    r3 = r6
                    r7 = r8
                    r4 = r2
                    goto L2a
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L25:
                    r3 = r1[r8]
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L2a:
                    int r8 = r8 + r3
                    int r8 = r8 + 6
                    int r7 = r7 + 1
                    r3 = r8
                    r8 = r7
                    r7 = r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.d.AuthenticationRequestParameters.AnonymousClass2.a(int, short, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:67:0x0334  */
            /* JADX WARN: Code duplicated, block: B:68:0x0335  */
            private static void b(char c11, int i11, int i12, Object[] objArr) throws Throwable {
                Throwable cause;
                Object method;
                int i13 = i12;
                atd.az.BuildConfig buildConfig = new atd.az.BuildConfig();
                long[] jArr = new long[i13];
                buildConfig.getDeviceData = 0;
                while (true) {
                    int i14 = buildConfig.getDeviceData;
                    if (i14 >= i13) {
                        break;
                    }
                    int i15 = $11 + 117;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    Class cls = Integer.TYPE;
                    if (i16 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(getSDKAppID[i11 << i14])};
                            Map map = atd.a.getMessageVersion.timedout;
                            Object obj = map.get(1019086628);
                            if (obj != null) {
                                method = obj;
                            } else {
                                Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1774 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 32 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                byte b11 = (byte) 0;
                                byte b12 = (byte) (b11 + 1);
                                Object[] objArr3 = new Object[1];
                                c(b11, b12, (byte) (b12 - 1), objArr3);
                                method = cls2.getMethod((String) objArr3[0], cls);
                                map.put(1019086628, method);
                            }
                            Long l11 = (Long) ((Method) method).invoke(null, objArr2);
                            l11.longValue();
                            Object[] objArr4 = {l11, Long.valueOf(buildConfig.getDeviceData), Long.valueOf(getSDKReferenceNumber), Integer.valueOf(c11)};
                            Object method2 = map.get(-1106061844);
                            if (method2 == null) {
                                Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 442, (char) (TextUtils.lastIndexOf("", '0') + 1), TextUtils.getCapsMode("", 0, 0) + 37);
                                Class cls4 = Long.TYPE;
                                method2 = cls3.getMethod("n", cls4, cls4, cls4, cls);
                                map.put(-1106061844, method2);
                            }
                            jArr[i14] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                            Object[] objArr5 = {buildConfig, buildConfig};
                            Object method3 = map.get(1947342796);
                            if (method3 == null) {
                                Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.getDeadChar(0, 0) + 1919, (char) Color.green(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28);
                                byte b13 = (byte) 0;
                                byte b14 = b13;
                                Object[] objArr6 = new Object[1];
                                c(b13, b14, b14, objArr6);
                                method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
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
                        Object[] objArr7 = {Integer.valueOf(getSDKAppID[i11 + i14])};
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object method4 = map2.get(1019086628);
                        if (method4 == null) {
                            Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1774 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.combineMeasuredStates(0, 0) + 32);
                            byte b15 = (byte) 0;
                            byte b16 = (byte) (b15 + 1);
                            Object[] objArr8 = new Object[1];
                            c(b15, b16, (byte) (b16 - 1), objArr8);
                            method4 = cls6.getMethod((String) objArr8[0], cls);
                            map2.put(1019086628, method4);
                        }
                        Long l12 = (Long) ((Method) method4).invoke(null, objArr7);
                        l12.longValue();
                        Object[] objArr9 = {l12, Long.valueOf(buildConfig.getDeviceData), Long.valueOf(getSDKReferenceNumber), Integer.valueOf(c11)};
                        Object method5 = map2.get(-1106061844);
                        if (method5 == null) {
                            Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 441, (char) View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf("", "", 0, 0) + 37);
                            Class cls8 = Long.TYPE;
                            method5 = cls7.getMethod("n", cls8, cls8, cls8, cls);
                            map2.put(-1106061844, method5);
                        }
                        jArr[i14] = ((Long) ((Method) method5).invoke(null, objArr9)).longValue();
                        Object[] objArr10 = {buildConfig, buildConfig};
                        Object method6 = map2.get(1947342796);
                        if (method6 == null) {
                            Class cls9 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1918 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) View.MeasureSpec.getSize(0), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28);
                            byte b17 = (byte) 0;
                            byte b18 = b17;
                            Object[] objArr11 = new Object[1];
                            c(b17, b18, b18, objArr11);
                            method6 = cls9.getMethod((String) objArr11[0], Object.class, Object.class);
                            map2.put(1947342796, method6);
                        }
                        ((Method) method6).invoke(null, objArr10);
                    }
                    i13 = i12;
                    jArr = jArr;
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
                long[] jArr2 = jArr;
                char[] cArr = new char[i13];
                buildConfig.getDeviceData = 0;
                while (true) {
                    int i17 = buildConfig.getDeviceData;
                    if (i17 >= i13) {
                        objArr[0] = new String(cArr);
                        return;
                    }
                    int i18 = $10 + 49;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        cArr[i17] = (char) jArr2[i17];
                        Object[] objArr12 = {buildConfig, buildConfig};
                        Map map3 = atd.a.getMessageVersion.timedout;
                        Object method7 = map3.get(1947342796);
                        if (method7 == null) {
                            Class cls10 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1918 - Process.getGidForName(""), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (Process.myPid() >> 22) + 29);
                            byte b19 = (byte) 0;
                            byte b21 = b19;
                            Object[] objArr13 = new Object[1];
                            c(b19, b21, b21, objArr13);
                            method7 = cls10.getMethod((String) objArr13[0], Object.class, Object.class);
                            map3.put(1947342796, method7);
                        }
                        ((Method) method7).invoke(null, objArr12);
                        throw null;
                    }
                    cArr[i17] = (char) jArr2[i17];
                    Object[] objArr14 = {buildConfig, buildConfig};
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method8 = map4.get(1947342796);
                    if (method8 == null) {
                        Class cls11 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), 30 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        byte b22 = (byte) 0;
                        byte b23 = b22;
                        Object[] objArr15 = new Object[1];
                        c(b22, b23, b23, objArr15);
                        method8 = cls11.getMethod((String) objArr15[0], Object.class, Object.class);
                        map4.put(1947342796, method8);
                    }
                    ((Method) method8).invoke(null, objArr14);
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 2
                    int r6 = r6 + 1
                    int r7 = r7 * 5
                    int r7 = 113 - r7
                    byte[] r0 = atd.d.AuthenticationRequestParameters.AnonymousClass2.$$d
                    int r8 = r8 * 2
                    int r8 = 4 - r8
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r6
                    r5 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r7
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r6) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    r3 = r0[r8]
                L28:
                    int r7 = r7 + r3
                    int r8 = r8 + 1
                    r3 = r5
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.d.AuthenticationRequestParameters.AnonymousClass2.c(short, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:42:0x03e0  */
            /* JADX WARN: Code duplicated, block: B:44:0x03e6  */
            /* JADX WARN: Code duplicated, block: B:47:0x0433  */
            /* JADX WARN: Code duplicated, block: B:48:0x0434 A[Catch: all -> 0x07f5, TryCatch #3 {all -> 0x07f5, blocks: (B:5:0x0073, B:9:0x00c5, B:8:0x008c, B:17:0x01d1, B:21:0x0229, B:33:0x02ea, B:37:0x0344, B:87:0x06c9, B:91:0x0722, B:90:0x06e6, B:95:0x077f, B:99:0x07dd, B:98:0x079c, B:45:0x041b, B:49:0x0474, B:48:0x0434, B:36:0x02ff, B:20:0x01ec, B:24:0x0273, B:28:0x02cb, B:27:0x028c), top: B:118:0x002e }] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r6v36 */
            /* JADX WARN: Type inference failed for: r6v37 */
            /* JADX WARN: Type inference failed for: r6v38 */
            /* JADX WARN: Type inference failed for: r6v47, types: [int] */
            /* JADX WARN: Type inference failed for: r6v48 */
            /* JADX WARN: Type inference failed for: r6v49 */
            /* JADX WARN: Type inference failed for: r6v58, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r6v60, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r6v61 */
            /* JADX WARN: Type inference failed for: r6v69 */
            /* JADX WARN: Type inference failed for: r6v70 */
            /* JADX WARN: Type inference failed for: r6v71 */
            /* JADX WARN: Type inference failed for: r8v67, types: [java.lang.reflect.Method] */
            /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
                java.lang.NullPointerException
                */
            public static java.lang.Object[] getSDKTransactionID(android.content.Context r35, int r36, int r37) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 2055
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.d.AuthenticationRequestParameters.AnonymousClass2.getSDKTransactionID(android.content.Context, int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{63, -110, -75, -71, -8, 9, -39, -21, 1, 1, 13, -5, -7, 7, -19, 3, -17, -4, -29, 33, -14, -17, -3, 7, 46, -7, -18, -9, 3, 0, -17, -12, -8, 13, -17, 0, -7, -34, 13, 6, -2, -22, 8, -5, -42, 11, 11, -23, 6, -14, 9, -21, 7, -5, -8, 9, -39, -21, 1, -16, 41, -6, -45, -11, -1, -27, -39};
                $$b = 71;
            }

            static void init$1() {
                $$d = new byte[]{14, -72, -78, -9};
                $$e = EnumC4419g.SDK_ASSET_ICON_PIN_VALUE;
            }

            @Override // java.lang.Runnable
            @SuppressLint({"SyntheticAccessor"})
            public void run() {
                getSDKEphemeralPublicKey = (getSDKTransactionID + 13) % 128;
                AuthenticationRequestParameters.this.getDeviceData.getSDKReferenceNumber((T) t11);
                int i11 = getSDKTransactionID + 107;
                getSDKEphemeralPublicKey = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 69 / 0;
                }
            }
        });
        ChallengeResult = (AuthenticationRequestParameters + 7) % 128;
    }

    static void init$0() {
        $$a = new byte[]{32, 120, 5, 50};
        $$b = 95;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ChallengeResult = (AuthenticationRequestParameters + 29) % 128;
        try {
            getSDKTransactionID(this.getSDKAppID.call());
            int i11 = AuthenticationRequestParameters + 45;
            ChallengeResult = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        } catch (Exception e11) {
            Object[] objArr = new Object[1];
            a((char) (ViewConfiguration.getTouchSlop() >> 8), ViewConfiguration.getLongPressTimeout() >> 16, 47 - Gravity.getAbsoluteGravity(0, 0), objArr);
            getSDKTransactionID(e11, ((String) objArr[0]).intern());
        }
    }

    private void getSDKTransactionID(final Exception exc, final String str) {
        getSDKReferenceNumber(new Runnable() { // from class: atd.d.AuthenticationRequestParameters.4
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static int $10;
            private static int $11;
            private static long AuthenticationRequestParameters;
            private static char ChallengeResult;
            private static int ChallengeResultCancelled;
            private static int getMessageVersion;
            private static long getSDKAppID;
            private static int getSDKEphemeralPublicKey;

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                getSDKEphemeralPublicKey = 0;
                getMessageVersion = 1;
                AuthenticationRequestParameters = -88501526095705361L;
                getSDKAppID = -4201337076207898698L;
                ChallengeResultCancelled = 1458778038;
                ChallengeResult = (char) 17235;
            }

            /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] AuthenticationRequestParameters(android.content.Context r52, int r53, int r54, int r55) {
                /*
                    Method dump skipped, instruction units count: 9943
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.d.AuthenticationRequestParameters.AnonymousClass4.AuthenticationRequestParameters(android.content.Context, int, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Code duplicated, block: B:48:0x01bb  */
            /* JADX WARN: Code duplicated, block: B:49:0x01bc  */
            private static void a(String str2, int i11, Object[] objArr) throws Throwable {
                char[] charArray;
                Throwable cause;
                int i12;
                char c11 = 2;
                if (str2 != null) {
                    int i13 = $11 + 123;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        str2.toCharArray();
                        throw null;
                    }
                    charArray = str2.toCharArray();
                } else {
                    charArray = str2;
                }
                char[] cArr = charArray;
                atd.az.getTransactionStatus gettransactionstatus = new atd.az.getTransactionStatus();
                gettransactionstatus.getSDKAppID = i11;
                int length = cArr.length;
                long[] jArr = new long[length];
                int i14 = 0;
                gettransactionstatus.getSDKTransactionID = 0;
                while (true) {
                    int i15 = gettransactionstatus.getSDKTransactionID;
                    if (i15 >= cArr.length) {
                        break;
                    }
                    char c12 = cArr[i15];
                    try {
                        Object[] objArr2 = new Object[3];
                        objArr2[c11] = gettransactionstatus;
                        objArr2[1] = gettransactionstatus;
                        objArr2[i14] = Integer.valueOf(c12);
                        Map map = atd.a.getMessageVersion.timedout;
                        Object method = map.get(962978490);
                        if (method != null) {
                            i12 = i14;
                        } else {
                            i12 = i14;
                            Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 688, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 16022), 32 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                            byte length2 = (byte) $$d.length;
                            byte b11 = (byte) (length2 - 4);
                            Object[] objArr3 = new Object[1];
                            d(length2, b11, b11, objArr3);
                            method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                            map.put(962978490, method);
                        }
                        jArr[i15] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (AuthenticationRequestParameters ^ (-2227742522694838850L));
                        Object[] objArr4 = new Object[2];
                        objArr4[1] = gettransactionstatus;
                        objArr4[i12] = gettransactionstatus;
                        Object method2 = map.get(-46730980);
                        if (method2 == null) {
                            int i16 = i12;
                            method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - View.combineMeasuredStates(i16, i16), (char) (29017 - Color.red(i16)), 24 - Color.alpha(i16))).getMethod("A", Object.class, Object.class);
                            map.put(-46730980, method2);
                        }
                        ((Method) method2).invoke(null, objArr4);
                        jArr = jArr;
                        c11 = 2;
                        i14 = 0;
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
                char[] cArr2 = new char[length];
                gettransactionstatus.getSDKTransactionID = 0;
                $11 = ($10 + 39) % 128;
                while (true) {
                    int i17 = gettransactionstatus.getSDKTransactionID;
                    if (i17 >= cArr.length) {
                        objArr[0] = new String(cArr2);
                        return;
                    }
                    int i18 = $10 + 49;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        cArr2[i17] = (char) jArr2[i17];
                        Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object method3 = map2.get(-46730980);
                        if (method3 == null) {
                            method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(416 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (29016 - TextUtils.lastIndexOf("", '0', 0, 0)), 24 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).getMethod("A", Object.class, Object.class);
                            map2.put(-46730980, method3);
                        }
                        ((Method) method3).invoke(null, objArr5);
                        int i19 = 41 / 0;
                    } else {
                        cArr2[i17] = (char) jArr2[i17];
                        Object[] objArr6 = {gettransactionstatus, gettransactionstatus};
                        Map map3 = atd.a.getMessageVersion.timedout;
                        Object method4 = map3.get(-46730980);
                        if (method4 == null) {
                            method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(416 - ExpandableListView.getPackedPositionChild(0L), (char) (29016 - ((byte) KeyEvent.getModifierMetaStateMask())), KeyEvent.normalizeMetaState(0) + 24)).getMethod("A", Object.class, Object.class);
                            map3.put(-46730980, method4);
                        }
                        ((Method) method4).invoke(null, objArr6);
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void b(byte r5, short r6, int r7, java.lang.Object[] r8) {
                /*
                    int r5 = r5 * 2
                    int r0 = 21 - r5
                    int r6 = r6 * 2
                    int r6 = r6 + 4
                    byte[] r1 = atd.d.AuthenticationRequestParameters.AnonymousClass4.$$a
                    int r7 = r7 + 103
                    byte[] r0 = new byte[r0]
                    int r5 = 20 - r5
                    r2 = -1
                    if (r1 != 0) goto L16
                    r3 = r7
                    r7 = r6
                    goto L2b
                L16:
                    r4 = r7
                    r7 = r6
                    r6 = r4
                L19:
                    int r2 = r2 + 1
                    byte r3 = (byte) r6
                    r0[r2] = r3
                    if (r2 != r5) goto L29
                    java.lang.String r5 = new java.lang.String
                    r6 = 0
                    r5.<init>(r0, r6)
                    r8[r6] = r5
                    return
                L29:
                    r3 = r1[r7]
                L2b:
                    int r6 = r6 + r3
                    int r7 = r7 + 1
                    int r6 = r6 + (-3)
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.d.AuthenticationRequestParameters.AnonymousClass4.b(byte, short, int, java.lang.Object[]):void");
            }

            private static void c(char c11, String str2, String str3, String str4, int i11, Object[] objArr) throws Throwable {
                char[] charArray;
                char[] charArray2;
                Integer num = -2032575242;
                Integer num2 = 262890898;
                int i12 = 2;
                if (str4 != null) {
                    int i13 = $11 + 9;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        str4.toCharArray();
                        throw null;
                    }
                    charArray = str4.toCharArray();
                } else {
                    charArray = str4;
                }
                char[] cArr = charArray;
                if (str3 != null) {
                    $11 = ($10 + 97) % 128;
                    charArray2 = str3.toCharArray();
                } else {
                    charArray2 = str3;
                }
                char[] cArr2 = charArray2;
                char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
                atd.az.ChallengeResultTimeout challengeResultTimeout = new atd.az.ChallengeResultTimeout();
                int length = charArray3.length;
                char[] cArr3 = new char[length];
                int length2 = cArr2.length;
                char[] cArr4 = new char[length2];
                int i14 = 0;
                System.arraycopy(charArray3, 0, cArr3, 0, length);
                System.arraycopy(cArr2, 0, cArr4, 0, length2);
                cArr3[0] = (char) (cArr3[0] ^ c11);
                cArr4[2] = (char) (cArr4[2] + ((char) i11));
                int length3 = cArr.length;
                char[] cArr5 = new char[length3];
                challengeResultTimeout.getSDKTransactionID = 0;
                while (challengeResultTimeout.getSDKTransactionID < length3) {
                    try {
                        Object[] objArr2 = {challengeResultTimeout};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object method = map.get(num2);
                        int i15 = i12;
                        if (method == null) {
                            Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(ImageFormat.getBitsPerPixel(i14) + 1863, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 21 - (KeyEvent.getMaxKeyCode() >> 16));
                            byte b11 = (byte) 0;
                            byte b12 = b11;
                            Object[] objArr3 = new Object[1];
                            d(b11, b12, b12, objArr3);
                            method = cls.getMethod((String) objArr3[0], Object.class);
                            map.put(num2, method);
                        }
                        int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                        Object[] objArr4 = {challengeResultTimeout};
                        Object method2 = map.get(num);
                        if (method2 == null) {
                            method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(225 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                            map.put(num, method2);
                        }
                        int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                        int i16 = cArr3[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                        Object[] objArr5 = new Object[3];
                        objArr5[i15] = Integer.valueOf(cArr4[iIntValue]);
                        objArr5[1] = Integer.valueOf(i16);
                        objArr5[0] = challengeResultTimeout;
                        Object method3 = map.get(484986213);
                        Class cls2 = Integer.TYPE;
                        if (method3 == null) {
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2445 - TextUtils.lastIndexOf("", '0'), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 18 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                            byte b13 = (byte) ($$e & 7);
                            byte b14 = (byte) (b13 - 1);
                            Object[] objArr6 = new Object[1];
                            d(b13, b14, b14, objArr6);
                            method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                            map.put(484986213, method3);
                        }
                        ((Method) method3).invoke(null, objArr5);
                        int i17 = cArr3[iIntValue2] * 32718;
                        Object[] objArr7 = new Object[i15];
                        objArr7[1] = Integer.valueOf(cArr4[iIntValue]);
                        objArr7[0] = Integer.valueOf(i17);
                        Object method4 = map.get(-919285918);
                        if (method4 == null) {
                            method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2968, (char) (9912 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 38)).getMethod("g", cls2, cls2);
                            map.put(-919285918, method4);
                        }
                        cArr4[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                        char c12 = challengeResultTimeout.getDeviceData;
                        cArr3[iIntValue2] = c12;
                        int i18 = challengeResultTimeout.getSDKTransactionID;
                        cArr5[i18] = (char) (((((long) (c12 ^ cArr[i18])) ^ (getSDKAppID ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) ChallengeResultCancelled) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) ChallengeResult) ^ (-4201337076207898698L)))));
                        challengeResultTimeout.getSDKTransactionID = i18 + 1;
                        cArr3 = cArr3;
                        cArr = cArr;
                        length3 = length3;
                        num = num;
                        num2 = num2;
                        i12 = 2;
                        i14 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                String str5 = new String(cArr5);
                int i19 = $10 + 21;
                $11 = i19 % 128;
                if (i19 % 2 != 0) {
                    objArr[0] = str5;
                } else {
                    int i21 = 14 / 0;
                    objArr[0] = str5;
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
            private static void d(byte r6, byte r7, int r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 4
                    int r6 = r6 + 102
                    int r7 = r7 * 2
                    int r0 = 1 - r7
                    int r8 = r8 * 2
                    int r8 = 4 - r8
                    byte[] r1 = atd.d.AuthenticationRequestParameters.AnonymousClass4.$$d
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r1 != 0) goto L19
                    r3 = r1
                    r4 = r2
                    r1 = r8
                    goto L30
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r7) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L27:
                    int r3 = r3 + 1
                    r4 = r1[r8]
                    r5 = r1
                    r1 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L30:
                    int r8 = r8 + 1
                    int r6 = -r6
                    int r6 = r6 + r1
                    r1 = r3
                    r3 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.d.AuthenticationRequestParameters.AnonymousClass4.d(byte, byte, int, java.lang.Object[]):void");
            }

            static void init$0() {
                $$a = new byte[]{118, -75, 74, 48, -2, -20, 1, 18, -30, -12, 10, 10, 22, 4, 2, Tnaf.POW_2_WIDTH, -10, 12, -8, 5, -20, 42, -5, -8, 6, Tnaf.POW_2_WIDTH, -44, 44, 8, -18, 1, 18, -30, -12, 10, 12, 33, -14, Tnaf.POW_2_WIDTH, 8, -15, 5, 20, -8, 9, 2, -34, -2};
                $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE;
            }

            static void init$1() {
                $$d = new byte[]{81, 93, -56, -49};
                $$e = 153;
            }

            @Override // java.lang.Runnable
            @SuppressLint({"SyntheticAccessor"})
            public void run() {
                getSDKEphemeralPublicKey = (getMessageVersion + 81) % 128;
                AuthenticationRequestParameters.this.getDeviceData.getSDKAppID(exc, str);
                getMessageVersion = (getSDKEphemeralPublicKey + 115) % 128;
            }
        });
        ChallengeResult = (AuthenticationRequestParameters + 71) % 128;
    }
}
