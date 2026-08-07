package atd.aa;

import android.app.Application;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
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
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/IsDeviceToApRttSupported;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiFeatureSupport;", "deviceToApRtt", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiFeatureSupport;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/app/Application;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiFeatureSupport;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResult extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static char getSDKTransactionID;
    private final Application AuthenticationRequestParameters;
    private final runtimeError getDeviceData;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/IsDeviceToApRttSupported$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char AuthenticationRequestParameters;
        private static int[] getDeviceData;
        private static char getSDKAppID;
        private static char getSDKReferenceNumber;
        private static char getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = new int[]{-1297533417, 614657195, -1268151800, -1887613118, -208957090, 1562076623, -486611775, 308815418, -1408108520, -916751802, -198409763, 17987645, 496838819, -2060463605, 1134239761, -2093530425, -1412716561, -1554945317};
            getSDKAppID = (char) 23036;
            AuthenticationRequestParameters = (char) 35764;
            getSDKTransactionID = (char) 46211;
            getSDKReferenceNumber = (char) 37248;
        }

        private getSDKAppID() {
        }

        private static void a(byte b11, byte b12, int i11, Object[] objArr) {
            int i12 = 3 - (i11 * 4);
            int i13 = b12 * 4;
            int i14 = (b11 * 2) + 103;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[21 - i13];
            int i15 = 20 - i13;
            int i16 = -1;
            if (bArr == null) {
                i14 = i14 + i15 + 3;
            }
            while (true) {
                i16++;
                bArr2[i16] = (byte) i14;
                if (i16 == i15) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i12++;
                    i14 = i14 + bArr[i12] + 3;
                }
            }
        }

        private static void b(int[] iArr, int i11, Object[] objArr) throws Throwable {
            Object method;
            int i12;
            Object method2;
            atd.az.ChallengeResultCompleted challengeResultCompleted = new atd.az.ChallengeResultCompleted();
            char[] cArr = new char[4];
            int i13 = 2;
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = getDeviceData;
            Class cls = Integer.TYPE;
            int i14 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i15 = 0;
                while (i15 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i15])};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(2050190164);
                        if (obj != null) {
                            i12 = i14;
                            method2 = obj;
                        } else {
                            i12 = i14;
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - View.resolveSizeAndState(i14, i14, i14), (char) View.MeasureSpec.getSize(i12), 22 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            byte b11 = (byte) 3;
                            byte b12 = (byte) (b11 - 3);
                            Object[] objArr3 = new Object[1];
                            d(b11, b12, b12, objArr3);
                            method2 = cls2.getMethod((String) objArr3[i12], cls);
                            map.put(2050190164, method2);
                        }
                        iArr3[i15] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                        i15++;
                        i14 = i12;
                        cArr = cArr;
                        iArr3 = iArr3;
                        iArr2 = iArr2;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            char[] cArr3 = cArr;
            int i16 = i14;
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = getDeviceData;
            if (iArr5 != null) {
                $11 = ($10 + 3) % 128;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i17 = i16;
                while (i17 < length3) {
                    int i18 = $10 + 115;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i17])};
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object obj2 = map2.get(2050190164);
                        if (obj2 != null) {
                            method = obj2;
                        } else {
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1862, (char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf("", "", i16) + 21);
                            byte b13 = (byte) 3;
                            byte b14 = (byte) (b13 - 3);
                            Object[] objArr5 = new Object[1];
                            d(b13, b14, b14, objArr5);
                            method = cls3.getMethod((String) objArr5[0], cls);
                            map2.put(2050190164, method);
                        }
                        iArr6[i17] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                        iArr6 = iArr6;
                        iArr5 = iArr5;
                        i17 = i17;
                    } else {
                        cArr2 = cArr2;
                        int[] iArr7 = iArr5;
                        length3 = length3;
                        int[] iArr8 = iArr6;
                        int i19 = i17;
                        Object[] objArr6 = {Integer.valueOf(iArr7[i19])};
                        Map map3 = atd.a.getMessageVersion.timedout;
                        Object method3 = map3.get(2050190164);
                        if (method3 == null) {
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1861 - TextUtils.lastIndexOf("", '0', 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 21 - View.combineMeasuredStates(0, 0));
                            byte b15 = (byte) 3;
                            byte b16 = (byte) (b15 - 3);
                            Object[] objArr7 = new Object[1];
                            d(b15, b16, b16, objArr7);
                            method3 = cls4.getMethod((String) objArr7[0], cls);
                            map3.put(2050190164, method3);
                        }
                        iArr8[i19] = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                        i17 = i19 + 1;
                        iArr6 = iArr8;
                        iArr5 = iArr7;
                    }
                    length3 = length3;
                    cArr2 = cArr2;
                    i16 = 0;
                }
                iArr5 = iArr6;
            }
            char[] cArr4 = cArr2;
            int i21 = 16;
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            challengeResultCompleted.getDeviceData = 0;
            while (true) {
                int i22 = challengeResultCompleted.getDeviceData;
                if (i22 >= iArr.length) {
                    String str = new String(cArr4, 0, i11);
                    $10 = ($11 + 81) % 128;
                    objArr[0] = str;
                    return;
                }
                $10 = ($11 + 51) % 128;
                int i23 = iArr[i22];
                char c11 = (char) (i23 >> 16);
                cArr3[0] = c11;
                char c12 = (char) i23;
                cArr3[1] = c12;
                char c13 = (char) (iArr[i22 + 1] >> 16);
                cArr3[i13] = c13;
                char c14 = (char) iArr[i22 + 1];
                cArr3[3] = c14;
                challengeResultCompleted.getSDKAppID = (c11 << 16) + c12;
                challengeResultCompleted.getSDKReferenceNumber = (c13 << 16) + c14;
                atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
                int i24 = 0;
                while (i24 < i21) {
                    int i25 = $11 + 23;
                    $10 = i25 % 128;
                    if (i25 % 2 != 0) {
                        int i26 = challengeResultCompleted.getSDKAppID ^ iArr4[i24];
                        challengeResultCompleted.getSDKAppID = i26;
                        int sDKAppID = atd.az.ChallengeResultCompleted.getSDKAppID(i26);
                        Object[] objArr8 = new Object[4];
                        objArr8[3] = challengeResultCompleted;
                        objArr8[i13] = challengeResultCompleted;
                        objArr8[1] = Integer.valueOf(sDKAppID);
                        objArr8[0] = challengeResultCompleted;
                        Map map4 = atd.a.getMessageVersion.timedout;
                        Object method4 = map4.get(929629307);
                        if (method4 == null) {
                            Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1299, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + CipherSuite.TLS_PSK_WITH_AES_256_CCM_8), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 32);
                            byte b17 = (byte) 0;
                            byte b18 = b17;
                            Object[] objArr9 = new Object[1];
                            d(b17, b18, b18, objArr9);
                            method4 = cls5.getMethod((String) objArr9[0], Object.class, cls, Object.class, Object.class);
                            map4.put(929629307, method4);
                        }
                        int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                        challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                        i24 += 52;
                    } else {
                        int i27 = challengeResultCompleted.getSDKAppID ^ iArr4[i24];
                        challengeResultCompleted.getSDKAppID = i27;
                        int sDKAppID2 = atd.az.ChallengeResultCompleted.getSDKAppID(i27);
                        Object[] objArr10 = new Object[4];
                        objArr10[3] = challengeResultCompleted;
                        objArr10[i13] = challengeResultCompleted;
                        objArr10[1] = Integer.valueOf(sDKAppID2);
                        objArr10[0] = challengeResultCompleted;
                        Map map5 = atd.a.getMessageVersion.timedout;
                        Object method5 = map5.get(929629307);
                        if (method5 == null) {
                            Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Gravity.getAbsoluteGravity(0, 0) + 1299, (char) (AndroidCharacter.getMirror('0') + CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_CBC_SHA384), 33 - Color.blue(0));
                            byte b19 = (byte) 0;
                            byte b21 = b19;
                            Object[] objArr11 = new Object[1];
                            d(b19, b21, b21, objArr11);
                            method5 = cls6.getMethod((String) objArr11[0], Object.class, cls, Object.class, Object.class);
                            map5.put(929629307, method5);
                        }
                        int iIntValue2 = ((Integer) ((Method) method5).invoke(null, objArr10)).intValue();
                        challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                        challengeResultCompleted.getSDKReferenceNumber = iIntValue2;
                        i24++;
                    }
                    i21 = 16;
                }
                int i28 = challengeResultCompleted.getSDKAppID;
                int i29 = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKAppID = i29;
                challengeResultCompleted.getSDKReferenceNumber = i28;
                int i31 = i28 ^ iArr4[16];
                challengeResultCompleted.getSDKReferenceNumber = i31;
                int i32 = i29 ^ iArr4[17];
                challengeResultCompleted.getSDKAppID = i32;
                cArr3[0] = (char) (i32 >>> 16);
                cArr3[1] = (char) i32;
                cArr3[i13] = (char) (i31 >>> 16);
                cArr3[3] = (char) i31;
                atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
                int i33 = challengeResultCompleted.getDeviceData;
                cArr4[i33 * 2] = cArr3[0];
                cArr4[(i33 * 2) + 1] = cArr3[1];
                cArr4[(i33 * 2) + 2] = cArr3[i13];
                cArr4[(i33 * 2) + 3] = cArr3[3];
                int i34 = i13;
                Object[] objArr12 = new Object[i34];
                objArr12[1] = challengeResultCompleted;
                objArr12[0] = challengeResultCompleted;
                Map map6 = atd.a.getMessageVersion.timedout;
                Object method6 = map6.get(1109131256);
                if (method6 != null) {
                    i21 = 16;
                } else {
                    i21 = 16;
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID((Process.myPid() >> 22) + 2061, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16);
                    byte b22 = (byte) 1;
                    byte b23 = (byte) (b22 - 1);
                    Object[] objArr13 = new Object[1];
                    d(b22, b23, b23, objArr13);
                    method6 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                    map6.put(1109131256, method6);
                }
                ((Method) method6).invoke(null, objArr12);
                i13 = i34;
            }
        }

        private static void c(String str, int i11, Object[] objArr) throws Throwable {
            int i12;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.az.ChallengeStatusHandler challengeStatusHandler = new atd.az.ChallengeStatusHandler();
            char[] cArr = new char[charArray.length];
            int i13 = 0;
            challengeStatusHandler.getSDKReferenceNumber = 0;
            int i14 = 2;
            char[] cArr2 = new char[2];
            while (true) {
                int i15 = challengeStatusHandler.getSDKReferenceNumber;
                if (i15 >= charArray.length) {
                    objArr[0] = new String(cArr, 0, i11);
                    return;
                }
                cArr2[i13] = charArray[i15];
                char c11 = 1;
                cArr2[1] = charArray[i15 + 1];
                $10 = ($11 + 7) % 128;
                int i16 = 58224;
                int i17 = i13;
                while (i17 < 16) {
                    $11 = ($10 + 105) % 128;
                    char c12 = cArr2[c11];
                    char c13 = cArr2[i13];
                    int i18 = i14;
                    char[] cArr3 = cArr2;
                    int i19 = (c13 + i16) ^ ((c13 << 4) + ((char) (((long) getSDKTransactionID) ^ (-2881362678149017980L))));
                    int i21 = c13 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(getSDKReferenceNumber);
                        objArr2[i18] = Integer.valueOf(i21);
                        objArr2[c11] = Integer.valueOf(i19);
                        objArr2[i13] = Integer.valueOf(c12);
                        Map map = atd.a.getMessageVersion.timedout;
                        Object method = map.get(59536824);
                        Class cls = Integer.TYPE;
                        if (method != null) {
                            i12 = i13;
                        } else {
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getOffsetAfter("", i13) + 1745, (char) (16682 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 29);
                            byte b11 = (byte) i13;
                            i12 = i13;
                            Object[] objArr3 = new Object[1];
                            d((byte) ($$e & 12), b11, b11, objArr3);
                            method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                            map.put(59536824, method);
                        }
                        char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char c14 = cArr3[i12];
                        int i22 = (cCharValue + i16) ^ (((char) (((long) getSDKAppID) ^ (-2881362678149017980L))) + (cCharValue << 4));
                        int i23 = cCharValue >>> 5;
                        Object[] objArr4 = new Object[4];
                        objArr4[3] = Integer.valueOf(AuthenticationRequestParameters);
                        objArr4[i18] = Integer.valueOf(i23);
                        objArr4[1] = Integer.valueOf(i22);
                        objArr4[i12] = Integer.valueOf(c14);
                        Object method2 = map.get(59536824);
                        if (method2 == null) {
                            int i24 = i12;
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getCapsMode("", i24, i24) + 1745, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16681), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 29);
                            byte b12 = (byte) 0;
                            Object[] objArr5 = new Object[1];
                            d((byte) ($$e & 12), b12, b12, objArr5);
                            method2 = cls3.getMethod((String) objArr5[0], cls, cls, cls, cls);
                            map.put(59536824, method2);
                        }
                        cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i16 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                        i17++;
                        i14 = i18;
                        cArr2 = cArr3;
                        charArray = charArray;
                        i13 = 0;
                        c11 = 1;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                char[] cArr4 = charArray;
                int i25 = i14;
                char[] cArr5 = cArr2;
                int i26 = challengeStatusHandler.getSDKReferenceNumber;
                cArr[i26] = cArr5[0];
                cArr[i26 + 1] = cArr5[1];
                Object[] objArr6 = new Object[i25];
                objArr6[1] = challengeStatusHandler;
                objArr6[0] = challengeStatusHandler;
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(1312076635);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1596 - (Process.myTid() >> 22), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 27824), 25 - View.MeasureSpec.getSize(0));
                    byte length = (byte) $$d.length;
                    byte b13 = (byte) (length - 4);
                    Object[] objArr7 = new Object[1];
                    d(length, b13, b13, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1312076635, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                i14 = i25;
                cArr2 = cArr5;
                charArray = cArr4;
                i13 = 0;
            }
        }

        private static void d(short s11, int i11, short s12, Object[] objArr) {
            int i12 = 120 - s11;
            byte[] bArr = $$d;
            int i13 = (i11 * 4) + 4;
            int i14 = s12 * 3;
            byte[] bArr2 = new byte[1 - i14];
            int i15 = 0 - i14;
            int i16 = -1;
            if (bArr == null) {
                i12 += i15;
                i13++;
            }
            while (true) {
                i16++;
                bArr2[i16] = (byte) i12;
                if (i16 == i15) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i12 += bArr[i13];
                    i13++;
                }
            }
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getDeviceData(android.content.Context r30, int r31, int r32) {
            /*
                Method dump skipped, instruction units count: 2046
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.aa.ChallengeResult.getSDKAppID.getDeviceData(android.content.Context, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{39, -117, 45, 21, -5, 12, -36, -18, 4, 4, Tnaf.POW_2_WIDTH, -2, -4, 10, -16, 6, -14, -1, -26, 36, -11, -14, 0, 10};
            $$b = 33;
        }

        static void init$1() {
            $$d = new byte[]{112, -83, -25, -94};
            $$e = 122;
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKReferenceNumber();
        View.resolveSize(0, 0);
        TextUtils.indexOf("", "", 0);
        new getSDKAppID((byte) 0);
        getSDKReferenceNumber = (getSDKEphemeralPublicKey + 91) % 128;
    }

    public /* synthetic */ ChallengeResult(Application application) {
        this(application, new getDeviceData(application));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0156  */
    /* JADX WARN: Code duplicated, block: B:47:0x016d  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c6 A[Catch: all -> 0x0369, TryCatch #0 {all -> 0x0369, blocks: (B:11:0x0039, B:15:0x0090, B:14:0x0054, B:21:0x00b6, B:25:0x00fb, B:48:0x016f, B:52:0x0226, B:56:0x0241, B:60:0x02d8, B:59:0x027f, B:51:0x01c6, B:24:0x00c7), top: B:77:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0237  */
    /* JADX WARN: Code duplicated, block: B:58:0x027e  */
    /* JADX WARN: Code duplicated, block: B:59:0x027f A[Catch: all -> 0x0369, TryCatch #0 {all -> 0x0369, blocks: (B:11:0x0039, B:15:0x0090, B:14:0x0054, B:21:0x00b6, B:25:0x00fb, B:48:0x016f, B:52:0x0226, B:56:0x0241, B:60:0x02d8, B:59:0x027f, B:51:0x01c6, B:24:0x00c7), top: B:77:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:64:0x0302  */
    /* JADX WARN: Code duplicated, block: B:65:0x032c  */
    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        Map map;
        Object obj;
        Object method;
        int iIntValue;
        int i14;
        int i15;
        int i16;
        Object method2;
        Class cls;
        Object method3;
        if (str != null) {
            charArray = str.toCharArray();
            $10 = ($11 + 39) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.az.completed completedVar = new atd.az.completed();
        char[] cArr2 = getSDKAppID;
        Class cls2 = Integer.TYPE;
        int i17 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i18 = 0;
            while (i18 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i18])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object obj2 = map2.get(-1709775791);
                    if (obj2 != null) {
                        cls = cls2;
                        method3 = obj2;
                    } else {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - Drawable.resolveOpacity(i17, i17), (char) KeyEvent.keyCodeFromString(""), 25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        cls = cls2;
                        Object[] objArr3 = new Object[1];
                        b(b12, b13, (byte) (b13 | 55), objArr3);
                        method3 = cls3.getMethod((String) objArr3[0], cls);
                        map2.put(-1709775791, method3);
                    }
                    cArr3[i18] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                    i18++;
                    cArr = cArr;
                    cArr2 = cArr2;
                    cls2 = cls;
                    i17 = 0;
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
        char[] cArr4 = cArr;
        Class cls4 = cls2;
        Object[] objArr4 = {Integer.valueOf(getSDKTransactionID)};
        Map map3 = atd.a.getMessageVersion.timedout;
        Object method4 = map3.get(-1709775791);
        if (method4 == null) {
            Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - Color.argb(0, 0, 0, 0), (char) KeyEvent.getDeadChar(0, 0), 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            byte b14 = (byte) 0;
            byte b15 = b14;
            Object[] objArr5 = new Object[1];
            b(b14, b15, (byte) (b15 | 55), objArr5);
            method4 = cls5.getMethod((String) objArr5[0], cls4);
            map3.put(-1709775791, method4);
        }
        char cCharValue = ((Character) ((Method) method4).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr5[i12] = (char) (cArr4[i12] - b11);
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            int i19 = $10 + 97;
            $11 = i19 % 128;
            int i21 = 2;
            if (i19 % 2 == 0) {
                completedVar.getSDKTransactionID = 1;
            } else {
                completedVar.getSDKTransactionID = 0;
            }
            while (true) {
                int i22 = completedVar.getSDKTransactionID;
                if (i22 >= i12) {
                    break;
                }
                int i23 = $11 + 11;
                $10 = i23 % 128;
                if (i23 % i21 != 0) {
                    char c11 = cArr4[i22];
                    completedVar.getSDKAppID = c11;
                    char c12 = cArr4[i22];
                    completedVar.getSDKReferenceNumber = c12;
                    if (c11 == c12) {
                        cArr5[i22] = (char) (completedVar.getSDKAppID - b11);
                        cArr5[i22 + 1] = (char) (completedVar.getSDKReferenceNumber - b11);
                        i13 = i21;
                    } else {
                        Object[] objArr6 = new Object[13];
                        objArr6[12] = completedVar;
                        objArr6[11] = Integer.valueOf(cCharValue);
                        objArr6[10] = completedVar;
                        objArr6[9] = completedVar;
                        objArr6[8] = Integer.valueOf(cCharValue);
                        objArr6[7] = completedVar;
                        objArr6[6] = completedVar;
                        objArr6[5] = Integer.valueOf(cCharValue);
                        objArr6[4] = completedVar;
                        objArr6[3] = completedVar;
                        objArr6[i21] = Integer.valueOf(cCharValue);
                        objArr6[1] = completedVar;
                        objArr6[0] = completedVar;
                        i13 = i21;
                        map = atd.a.getMessageVersion.timedout;
                        obj = map.get(700818725);
                        if (obj != null) {
                            method = obj;
                        } else {
                            Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1918, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getFadingEdgeLength() >> 16) + 29);
                            byte b16 = (byte) 0;
                            byte b17 = b16;
                            Object[] objArr7 = new Object[1];
                            b(b16, b17, b17, objArr7);
                            String str2 = (String) objArr7[0];
                            Class cls7 = Integer.TYPE;
                            method = cls6.getMethod(str2, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class);
                            map.put(700818725, method);
                        }
                        iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                        i14 = completedVar.getSDKEphemeralPublicKey;
                        if (iIntValue == i14) {
                            $10 = ($11 + 33) % 128;
                            Object[] objArr8 = new Object[11];
                            objArr8[10] = completedVar;
                            objArr8[9] = Integer.valueOf(cCharValue);
                            objArr8[8] = completedVar;
                            objArr8[7] = Integer.valueOf(cCharValue);
                            objArr8[6] = Integer.valueOf(cCharValue);
                            objArr8[5] = completedVar;
                            objArr8[4] = completedVar;
                            objArr8[3] = Integer.valueOf(cCharValue);
                            objArr8[i13] = Integer.valueOf(cCharValue);
                            objArr8[1] = completedVar;
                            objArr8[0] = completedVar;
                            method2 = map.get(-248084636);
                            if (method2 != null) {
                                Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getEdgeSlop() >> 16) + 1721, (char) (48633 - TextUtils.lastIndexOf("", '0', 0, 0)), 24 - KeyEvent.getDeadChar(0, 0));
                                byte b18 = (byte) 0;
                                byte b19 = b18;
                                Object[] objArr9 = new Object[1];
                                b(b18, b19, (byte) (b19 | 49), objArr9);
                                String str3 = (String) objArr9[0];
                                Class cls9 = Integer.TYPE;
                                method2 = cls8.getMethod(str3, Object.class, Object.class, cls9, cls9, Object.class, Object.class, cls9, cls9, Object.class, cls9, Object.class);
                                map.put(-248084636, method2);
                            }
                            int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr8)).intValue();
                            int i24 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                            int i25 = completedVar.getSDKTransactionID;
                            cArr5[i25] = cArr2[iIntValue2];
                            cArr5[i25 + 1] = cArr2[i24];
                        } else {
                            i15 = completedVar.getDeviceData;
                            i16 = completedVar.AuthenticationRequestParameters;
                            if (i15 == i16) {
                                $11 = ($10 + 49) % 128;
                                int i26 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                completedVar.getMessageVersion = i26;
                                int i27 = ((i14 + cCharValue) - 1) % cCharValue;
                                completedVar.getSDKEphemeralPublicKey = i27;
                                int i28 = (i16 * cCharValue) + i27;
                                int i29 = completedVar.getSDKTransactionID;
                                cArr5[i29] = cArr2[(i15 * cCharValue) + i26];
                                cArr5[i29 + 1] = cArr2[i28];
                            } else {
                                int i31 = (i15 * cCharValue) + i14;
                                int i32 = (i16 * cCharValue) + completedVar.getMessageVersion;
                                int i33 = completedVar.getSDKTransactionID;
                                cArr5[i33] = cArr2[i31];
                                cArr5[i33 + 1] = cArr2[i32];
                            }
                        }
                    }
                } else {
                    char c13 = cArr4[i22];
                    completedVar.getSDKAppID = c13;
                    char c14 = cArr4[i22 + 1];
                    completedVar.getSDKReferenceNumber = c14;
                    if (c13 == c14) {
                        cArr5[i22] = (char) (completedVar.getSDKAppID - b11);
                        cArr5[i22 + 1] = (char) (completedVar.getSDKReferenceNumber - b11);
                        i13 = i21;
                    } else {
                        Object[] objArr10 = new Object[13];
                        objArr10[12] = completedVar;
                        objArr10[11] = Integer.valueOf(cCharValue);
                        objArr10[10] = completedVar;
                        objArr10[9] = completedVar;
                        objArr10[8] = Integer.valueOf(cCharValue);
                        objArr10[7] = completedVar;
                        objArr10[6] = completedVar;
                        objArr10[5] = Integer.valueOf(cCharValue);
                        objArr10[4] = completedVar;
                        objArr10[3] = completedVar;
                        objArr10[i21] = Integer.valueOf(cCharValue);
                        objArr10[1] = completedVar;
                        objArr10[0] = completedVar;
                        i13 = i21;
                        map = atd.a.getMessageVersion.timedout;
                        obj = map.get(700818725);
                        if (obj != null) {
                            method = obj;
                        } else {
                            Class cls10 = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1918, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getFadingEdgeLength() >> 16) + 29);
                            byte b110 = (byte) 0;
                            byte b111 = b110;
                            Object[] objArr11 = new Object[1];
                            b(b110, b111, b111, objArr11);
                            String str4 = (String) objArr11[0];
                            Class cls11 = Integer.TYPE;
                            method = cls10.getMethod(str4, Object.class, Object.class, cls11, Object.class, Object.class, cls11, Object.class, Object.class, cls11, Object.class, Object.class, cls11, Object.class);
                            map.put(700818725, method);
                        }
                        iIntValue = ((Integer) ((Method) method).invoke(null, objArr10)).intValue();
                        i14 = completedVar.getSDKEphemeralPublicKey;
                        if (iIntValue == i14) {
                            $10 = ($11 + 33) % 128;
                            Object[] objArr12 = new Object[11];
                            objArr12[10] = completedVar;
                            objArr12[9] = Integer.valueOf(cCharValue);
                            objArr12[8] = completedVar;
                            objArr12[7] = Integer.valueOf(cCharValue);
                            objArr12[6] = Integer.valueOf(cCharValue);
                            objArr12[5] = completedVar;
                            objArr12[4] = completedVar;
                            objArr12[3] = Integer.valueOf(cCharValue);
                            objArr12[i13] = Integer.valueOf(cCharValue);
                            objArr12[1] = completedVar;
                            objArr12[0] = completedVar;
                            method2 = map.get(-248084636);
                            if (method2 != null) {
                                Class cls12 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getEdgeSlop() >> 16) + 1721, (char) (48633 - TextUtils.lastIndexOf("", '0', 0, 0)), 24 - KeyEvent.getDeadChar(0, 0));
                                byte b112 = (byte) 0;
                                byte b113 = b112;
                                Object[] objArr13 = new Object[1];
                                b(b112, b113, (byte) (b113 | 49), objArr13);
                                String str5 = (String) objArr13[0];
                                Class cls13 = Integer.TYPE;
                                method2 = cls12.getMethod(str5, Object.class, Object.class, cls13, cls13, Object.class, Object.class, cls13, cls13, Object.class, cls13, Object.class);
                                map.put(-248084636, method2);
                            }
                            int iIntValue3 = ((Integer) ((Method) method2).invoke(null, objArr12)).intValue();
                            int i210 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                            int i211 = completedVar.getSDKTransactionID;
                            cArr5[i211] = cArr2[iIntValue3];
                            cArr5[i211 + 1] = cArr2[i210];
                        } else {
                            i15 = completedVar.getDeviceData;
                            i16 = completedVar.AuthenticationRequestParameters;
                            if (i15 == i16) {
                                $11 = ($10 + 49) % 128;
                                int i212 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                completedVar.getMessageVersion = i212;
                                int i213 = ((i14 + cCharValue) - 1) % cCharValue;
                                completedVar.getSDKEphemeralPublicKey = i213;
                                int i214 = (i16 * cCharValue) + i213;
                                int i215 = completedVar.getSDKTransactionID;
                                cArr5[i215] = cArr2[(i15 * cCharValue) + i212];
                                cArr5[i215 + 1] = cArr2[i214];
                            } else {
                                int i34 = (i15 * cCharValue) + i14;
                                int i35 = (i16 * cCharValue) + completedVar.getMessageVersion;
                                int i36 = completedVar.getSDKTransactionID;
                                cArr5[i36] = cArr2[i34];
                                cArr5[i36 + 1] = cArr2[i35];
                            }
                        }
                    }
                }
                completedVar.getSDKTransactionID += 2;
                i21 = i13;
            }
        }
        $11 = ($10 + 17) % 128;
        for (int i37 = 0; i37 < i11; i37++) {
            cArr5[i37] = (char) (cArr5[i37] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.aa.ChallengeResult.$$a
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r8 = 122 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r2
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r8]
        L2c:
            int r6 = r6 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.ChallengeResult.b(byte, byte, short, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getSDKAppID = new char[]{52400, 52393, 52394, 52401, 52408, 52464, 52407, 52415, 52461, 52396, 52462, 52410, 52411, 52406, 52402, 52383};
        getSDKTransactionID = (char) 63808;
    }

    static void init$0() {
        $$a = new byte[]{27, 27, 63, -5};
        $$b = 176;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        Boolean boolValueOf;
        int i11 = getSDKEphemeralPublicKey + 43;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0 && Build.VERSION.SDK_INT < 28) {
            boolValueOf = this.getDeviceData.AuthenticationRequestParameters();
        } else {
            PackageManager packageManager = this.AuthenticationRequestParameters.getPackageManager();
            Object[] objArr = new Object[1];
            a(25 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0004\u0003\b\n\u0002\u0007\t\u0007\u000f\u0005\n\b\u0003\u0005\b\r\t\u0005\u0007\u0005\u0007\u0006\n\u0001㙍", (byte) (TextUtils.indexOf("", "", 0, 0) + 95), objArr);
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature(((String) objArr[0]).intern()));
        }
        if (boolValueOf == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        int i12 = getSDKEphemeralPublicKey + 39;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 == 0) {
            return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(boolValueOf.booleanValue()));
        }
        int i13 = 35 / 0;
        return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(boolValueOf.booleanValue()));
    }

    private ChallengeResult(Application application, runtimeError runtimeerror) {
        s.k(application, "");
        s.k(runtimeerror, "");
        this.AuthenticationRequestParameters = application;
        this.getDeviceData = runtimeerror;
    }
}
