package atd.aa;

import android.app.Application;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/DeviceToApRttWifiFeatureSupport;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiFeatureSupport;", Kind.APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "isSupported", "", "()Ljava/lang/Boolean;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData implements runtimeError {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static char[] getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final Application getDeviceData;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getSDKReferenceNumber = 1;
        getSDKAppID = new char[]{52393, 52394, 52407, 52408};
        AuthenticationRequestParameters = (char) 63814;
    }

    public getDeviceData(Application application) {
        s.k(application, "");
        this.getDeviceData = application;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x015e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0175 A[Catch: all -> 0x0370, TRY_ENTER, TryCatch #0 {all -> 0x0370, blocks: (B:11:0x0032, B:15:0x0084, B:14:0x0049, B:20:0x00b2, B:24:0x0109, B:43:0x0175, B:47:0x023c, B:51:0x0255, B:55:0x02f1, B:54:0x0292, B:46:0x01d5, B:23:0x00c7), top: B:72:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x01d5 A[Catch: all -> 0x0370, TryCatch #0 {all -> 0x0370, blocks: (B:11:0x0032, B:15:0x0084, B:14:0x0049, B:20:0x00b2, B:24:0x0109, B:43:0x0175, B:47:0x023c, B:51:0x0255, B:55:0x02f1, B:54:0x0292, B:46:0x01d5, B:23:0x00c7), top: B:72:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x024d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0291  */
    /* JADX WARN: Code duplicated, block: B:54:0x0292 A[Catch: all -> 0x0370, TryCatch #0 {all -> 0x0370, blocks: (B:11:0x0032, B:15:0x0084, B:14:0x0049, B:20:0x00b2, B:24:0x0109, B:43:0x0175, B:47:0x023c, B:51:0x0255, B:55:0x02f1, B:54:0x0292, B:46:0x01d5, B:23:0x00c7), top: B:72:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0314  */
    /* JADX WARN: Code duplicated, block: B:59:0x031b  */
    /* JADX WARN: Code duplicated, block: B:60:0x033d  */
    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] cArr;
        int i12;
        int i13;
        Map map;
        Object method;
        int iIntValue;
        int i14;
        int i15;
        int i16;
        Object method2;
        int i17;
        if (str != null) {
            $11 = ($10 + 103) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr2 = charArray;
        atd.az.completed completedVar = new atd.az.completed();
        char[] cArr3 = getSDKAppID;
        Class cls = Integer.TYPE;
        int i18 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i19])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method3 = map2.get(-1709775791);
                    if (method3 != null) {
                        i17 = i18;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2312 - Process.getGidForName(""), (char) (ViewConfiguration.getTapTimeout() >> 16), View.resolveSizeAndState(i18, i18, i18) + 24);
                        byte b12 = (byte) i18;
                        byte b13 = (byte) (b12 - 1);
                        i17 = i18;
                        Object[] objArr3 = new Object[1];
                        b(b12, b13, (byte) (b13 + 1), objArr3);
                        method3 = cls2.getMethod((String) objArr3[i17], cls);
                        map2.put(-1709775791, method3);
                    }
                    cArr4[i19] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                    i19++;
                    i18 = i17;
                    cArr2 = cArr2;
                    cArr3 = cArr3;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
            i12 = i18;
            $10 = ($11 + 79) % 128;
            cArr3 = cArr4;
        } else {
            cArr = cArr2;
            i12 = 0;
        }
        Object[] objArr4 = {Integer.valueOf(AuthenticationRequestParameters)};
        Map map3 = atd.a.getMessageVersion.timedout;
        Object method4 = map3.get(-1709775791);
        if (method4 == null) {
            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
            int i21 = i12;
            byte b14 = (byte) i21;
            byte b15 = (byte) (b14 - 1);
            Object[] objArr5 = new Object[1];
            b(b14, b15, (byte) (b15 + 1), objArr5);
            method4 = cls3.getMethod((String) objArr5[i21], cls);
            map3.put(-1709775791, method4);
        }
        char cCharValue = ((Character) ((Method) method4).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i11];
        if (i11 % 2 != 0) {
            i13 = i11 - 1;
            cArr5[i13] = (char) (cArr[i13] - b11);
            $11 = ($10 + 105) % 128;
        } else {
            i13 = i11;
        }
        if (i13 > 1) {
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i22 = completedVar.getSDKTransactionID;
                if (i22 >= i13) {
                    break;
                }
                int i23 = $10 + 13;
                $11 = i23 % 128;
                if (i23 % 2 == 0) {
                    char c11 = cArr[i22];
                    completedVar.getSDKAppID = c11;
                    char c12 = cArr[i22];
                    completedVar.getSDKReferenceNumber = c12;
                    if (c11 == c12) {
                        cArr5[i22] = (char) (completedVar.getSDKAppID - b11);
                        cArr5[i22 + 1] = (char) (completedVar.getSDKReferenceNumber - b11);
                    } else {
                        Object[] objArr6 = {completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar};
                        map = atd.a.getMessageVersion.timedout;
                        method = map.get(700818725);
                        if (method != null) {
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1920 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) View.getDefaultSize(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29);
                            byte b16 = (byte) (-1);
                            Object[] objArr7 = new Object[1];
                            b((byte) 55, b16, (byte) (b16 + 1), objArr7);
                            String str2 = (String) objArr7[0];
                            Class cls5 = Integer.TYPE;
                            method = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                            map.put(700818725, method);
                        }
                        iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                        i14 = completedVar.getSDKEphemeralPublicKey;
                        if (iIntValue == i14) {
                            $10 = ($11 + 113) % 128;
                            Object[] objArr8 = {completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, Integer.valueOf(cCharValue), completedVar};
                            method2 = map.get(-248084636);
                            if (method2 != null) {
                                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1722, (char) ((SystemClock.elapsedRealtimeNanos() > r9 ? 1 : (SystemClock.elapsedRealtimeNanos() == r9 ? 0 : -1)) + 48633), (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 23);
                                byte b17 = (byte) (-1);
                                Object[] objArr9 = new Object[1];
                                b((byte) ($$b & 22), b17, (byte) (b17 + 1), objArr9);
                                String str3 = (String) objArr9[0];
                                Class cls7 = Integer.TYPE;
                                method2 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                                map.put(-248084636, method2);
                            }
                            int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr8)).intValue();
                            int i24 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                            int i25 = completedVar.getSDKTransactionID;
                            cArr5[i25] = cArr3[iIntValue2];
                            cArr5[i25 + 1] = cArr3[i24];
                        } else {
                            i15 = completedVar.getDeviceData;
                            i16 = completedVar.AuthenticationRequestParameters;
                            if (i15 == i16) {
                                int i26 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                completedVar.getMessageVersion = i26;
                                int i27 = ((i14 + cCharValue) - 1) % cCharValue;
                                completedVar.getSDKEphemeralPublicKey = i27;
                                int i28 = (i15 * cCharValue) + i26;
                                int i29 = completedVar.getSDKTransactionID;
                                cArr5[i29] = cArr3[i28];
                                cArr5[i29 + 1] = cArr3[(i16 * cCharValue) + i27];
                            } else {
                                int i31 = (i16 * cCharValue) + completedVar.getMessageVersion;
                                int i32 = completedVar.getSDKTransactionID;
                                cArr5[i32] = cArr3[(i15 * cCharValue) + i14];
                                cArr5[i32 + 1] = cArr3[i31];
                            }
                        }
                    }
                } else {
                    char c13 = cArr[i22];
                    completedVar.getSDKAppID = c13;
                    char c14 = cArr[i22 + 1];
                    completedVar.getSDKReferenceNumber = c14;
                    if (c13 == c14) {
                        cArr5[i22] = (char) (completedVar.getSDKAppID - b11);
                        cArr5[i22 + 1] = (char) (completedVar.getSDKReferenceNumber - b11);
                    } else {
                        Object[] objArr10 = {completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar};
                        map = atd.a.getMessageVersion.timedout;
                        method = map.get(700818725);
                        if (method != null) {
                            Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1920 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) View.getDefaultSize(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29);
                            byte b18 = (byte) (-1);
                            Object[] objArr11 = new Object[1];
                            b((byte) 55, b18, (byte) (b18 + 1), objArr11);
                            String str4 = (String) objArr11[0];
                            Class cls9 = Integer.TYPE;
                            method = cls8.getMethod(str4, Object.class, Object.class, cls9, Object.class, Object.class, cls9, Object.class, Object.class, cls9, Object.class, Object.class, cls9, Object.class);
                            map.put(700818725, method);
                        }
                        iIntValue = ((Integer) ((Method) method).invoke(null, objArr10)).intValue();
                        i14 = completedVar.getSDKEphemeralPublicKey;
                        if (iIntValue == i14) {
                            $10 = ($11 + 113) % 128;
                            Object[] objArr12 = {completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, Integer.valueOf(cCharValue), completedVar};
                            method2 = map.get(-248084636);
                            if (method2 != null) {
                                Class cls10 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1722, (char) ((SystemClock.elapsedRealtimeNanos() > r9 ? 1 : (SystemClock.elapsedRealtimeNanos() == r9 ? 0 : -1)) + 48633), (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 23);
                                byte b19 = (byte) (-1);
                                Object[] objArr13 = new Object[1];
                                b((byte) ($$b & 22), b19, (byte) (b19 + 1), objArr13);
                                String str5 = (String) objArr13[0];
                                Class cls11 = Integer.TYPE;
                                method2 = cls10.getMethod(str5, Object.class, Object.class, cls11, cls11, Object.class, Object.class, cls11, cls11, Object.class, cls11, Object.class);
                                map.put(-248084636, method2);
                            }
                            int iIntValue3 = ((Integer) ((Method) method2).invoke(null, objArr12)).intValue();
                            int i210 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                            int i211 = completedVar.getSDKTransactionID;
                            cArr5[i211] = cArr3[iIntValue3];
                            cArr5[i211 + 1] = cArr3[i210];
                        } else {
                            i15 = completedVar.getDeviceData;
                            i16 = completedVar.AuthenticationRequestParameters;
                            if (i15 == i16) {
                                int i212 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                completedVar.getMessageVersion = i212;
                                int i213 = ((i14 + cCharValue) - 1) % cCharValue;
                                completedVar.getSDKEphemeralPublicKey = i213;
                                int i214 = (i15 * cCharValue) + i212;
                                int i215 = completedVar.getSDKTransactionID;
                                cArr5[i215] = cArr3[i214];
                                cArr5[i215 + 1] = cArr3[(i16 * cCharValue) + i213];
                            } else {
                                int i33 = (i16 * cCharValue) + completedVar.getMessageVersion;
                                int i34 = completedVar.getSDKTransactionID;
                                cArr5[i34] = cArr3[(i15 * cCharValue) + i14];
                                cArr5[i34 + 1] = cArr3[i33];
                            }
                        }
                    }
                }
                completedVar.getSDKTransactionID += 2;
            }
        }
        for (int i35 = 0; i35 < i11; i35++) {
            cArr5[i35] = (char) (cArr5[i35] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    private static void b(int i11, byte b11, byte b12, Object[] objArr) {
        int i12 = b12 * 2;
        int i13 = i11 + 67;
        byte[] bArr = $$a;
        int i14 = b11 + 4;
        byte[] bArr2 = new byte[1 - i12];
        int i15 = 0 - i12;
        int i16 = -1;
        if (bArr == null) {
            i13 += i14;
            i14 = i14;
            bArr = bArr;
            i16 = -1;
        }
        while (true) {
            int i17 = i16 + 1;
            bArr2[i17] = (byte) i13;
            if (i17 == i15) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i18 = i14 + 1;
            byte[] bArr3 = bArr;
            i13 += bArr[i18];
            i14 = i18;
            bArr = bArr3;
            i16 = i17;
        }
    }

    static void init$0() {
        $$a = new byte[]{44, -5, -78, -40};
        $$b = 15;
    }

    @Override // atd.aa.runtimeError
    public final Boolean AuthenticationRequestParameters() throws Throwable {
        WifiManager wifiManager;
        Application application = this.getDeviceData;
        Object[] objArr = new Object[1];
        a(ImageFormat.getBitsPerPixel(0) + 5, "\u0002\u0000\u0002\u0003", (byte) (28 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        if (systemService instanceof WifiManager) {
            wifiManager = (WifiManager) systemService;
        } else {
            getSDKTransactionID = (getSDKReferenceNumber + 51) % 128;
            wifiManager = null;
        }
        if (wifiManager == null) {
            return null;
        }
        Boolean boolValueOf = Boolean.valueOf(wifiManager.isDeviceToApRttSupported());
        int i11 = getSDKReferenceNumber + 13;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 75 / 0;
        }
        return boolValueOf;
    }
}
