package atd.m;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u0007H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Serial;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "kotlin.jvm.PlatformType", "getBuildSerial", "()Ljava/lang/String;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultCompleted extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static char[] getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Serial$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getSDKAppID = 1;
        AuthenticationRequestParameters();
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        ViewConfiguration.getScrollBarSize();
        new AuthenticationRequestParameters((byte) 0);
        getSDKReferenceNumber = (getSDKAppID + 57) % 128;
    }

    static void AuthenticationRequestParameters() {
        getSDKTransactionID = new char[]{52395, 52462, 52401, 52459, 52400, 52461, 52393, 52383, 52405};
        AuthenticationRequestParameters = (char) 63815;
    }

    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        int i12;
        char c11;
        Object method;
        Class cls;
        Object method2;
        $10 = ($11 + 59) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.az.completed completedVar = new atd.az.completed();
        char[] cArr = getSDKTransactionID;
        Class cls2 = Integer.TYPE;
        int i13 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1709775791);
                    if (obj != null) {
                        method2 = obj;
                        cls = cls2;
                    } else {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf("", "", i13) + 24);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        cls = cls2;
                        Object[] objArr3 = new Object[1];
                        b(b12, b13, b13, objArr3);
                        method2 = cls3.getMethod((String) objArr3[0], cls);
                        map.put(-1709775791, method2);
                    }
                    cArr2[i14] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    i14++;
                    $10 = ($11 + 15) % 128;
                    charArray = charArray;
                    cArr = cArr;
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
            cArr = cArr2;
        }
        char[] cArr3 = charArray;
        Class cls4 = cls2;
        Object[] objArr4 = {Integer.valueOf(AuthenticationRequestParameters)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method3 = map2.get(-1709775791);
        char c12 = '0';
        if (method3 == null) {
            Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2314 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getTapTimeout() >> 16), 23 - TextUtils.indexOf((CharSequence) "", '0'));
            byte b14 = (byte) 0;
            byte b15 = b14;
            Object[] objArr5 = new Object[1];
            b(b14, b15, b15, objArr5);
            method3 = cls5.getMethod((String) objArr5[0], cls4);
            map2.put(-1709775791, method3);
        }
        char cCharValue = ((Character) ((Method) method3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr4[i12] = (char) (cArr3[i12] - b11);
        } else {
            i12 = i11;
        }
        char c13 = 2;
        if (i12 > 1) {
            int i15 = $11 + 19;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i17 = completedVar.getSDKTransactionID;
                if (i17 >= i12) {
                    break;
                }
                char c14 = cArr3[i17];
                completedVar.getSDKAppID = c14;
                char c15 = cArr3[i17 + 1];
                completedVar.getSDKReferenceNumber = c15;
                if (c14 == c15) {
                    cArr4[i17] = (char) (c14 - b11);
                    cArr4[i17 + 1] = (char) (c15 - b11);
                    c11 = c13;
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
                    objArr6[c13] = Integer.valueOf(cCharValue);
                    objArr6[1] = completedVar;
                    c11 = c13;
                    objArr6[0] = completedVar;
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object obj2 = map3.get(700818725);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Gravity.getAbsoluteGravity(0, 0) + 1919, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 28 - TextUtils.indexOf("", c12, 0));
                        byte b16 = (byte) 0;
                        byte b17 = b16;
                        Object[] objArr7 = new Object[1];
                        b(b16, b17, (byte) (b17 | 55), objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls7 = Integer.TYPE;
                        method = cls6.getMethod(str2, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class);
                        map3.put(700818725, method);
                    }
                    int iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    int i18 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i18) {
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = completedVar;
                        objArr8[9] = Integer.valueOf(cCharValue);
                        objArr8[8] = completedVar;
                        objArr8[7] = Integer.valueOf(cCharValue);
                        objArr8[6] = Integer.valueOf(cCharValue);
                        objArr8[5] = completedVar;
                        objArr8[4] = completedVar;
                        objArr8[3] = Integer.valueOf(cCharValue);
                        objArr8[c11] = Integer.valueOf(cCharValue);
                        objArr8[1] = completedVar;
                        objArr8[0] = completedVar;
                        Object method4 = map3.get(-248084636);
                        if (method4 == null) {
                            Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1721 - (Process.myTid() >> 22), (char) (48634 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 24 - View.combineMeasuredStates(0, 0));
                            byte b18 = (byte) 0;
                            byte b19 = b18;
                            Object[] objArr9 = new Object[1];
                            b(b18, b19, (byte) (b19 | 6), objArr9);
                            String str3 = (String) objArr9[0];
                            Class cls9 = Integer.TYPE;
                            method4 = cls8.getMethod(str3, Object.class, Object.class, cls9, cls9, Object.class, Object.class, cls9, cls9, Object.class, cls9, Object.class);
                            map3.put(-248084636, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i19 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i21 = completedVar.getSDKTransactionID;
                        cArr4[i21] = cArr[iIntValue2];
                        cArr4[i21 + 1] = cArr[i19];
                    } else {
                        int i22 = completedVar.getDeviceData;
                        int i23 = completedVar.AuthenticationRequestParameters;
                        if (i22 == i23) {
                            int i24 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i24;
                            int i25 = ((i18 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i25;
                            int i26 = (i23 * cCharValue) + i25;
                            int i27 = completedVar.getSDKTransactionID;
                            cArr4[i27] = cArr[(i22 * cCharValue) + i24];
                            cArr4[i27 + 1] = cArr[i26];
                        } else {
                            int i28 = (i22 * cCharValue) + i18;
                            int i29 = (i23 * cCharValue) + completedVar.getMessageVersion;
                            int i31 = completedVar.getSDKTransactionID;
                            cArr4[i31] = cArr[i28];
                            cArr4[i31 + 1] = cArr[i29];
                        }
                        completedVar.getSDKTransactionID += 2;
                        c13 = c11;
                        c12 = '0';
                    }
                }
                completedVar.getSDKTransactionID += 2;
                c13 = c11;
                c12 = '0';
            }
        }
        int i32 = 0;
        while (i32 < i11) {
            int i33 = $10 + 125;
            $11 = i33 % 128;
            if (i33 % 2 == 0) {
                cArr4[i32] = (char) (cArr4[i32] ^ 30447);
                i32 += 95;
            } else {
                cArr4[i32] = (char) (cArr4[i32] ^ 13722);
                i32++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r5 = r5 * 2
            int r0 = r5 + 1
            byte[] r1 = atd.m.ChallengeResultCompleted.$$a
            int r7 = r7 + 67
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r5
            r7 = r6
            r3 = r2
            goto L2a
        L15:
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2a:
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.m.ChallengeResultCompleted.b(short, short, short, java.lang.Object[]):void");
    }

    @SuppressLint({"MissingPermission"})
    private static String getSDKTransactionID() {
        getSDKReferenceNumber = (getSDKAppID + 115) % 128;
        String serial = Build.getSerial();
        getSDKAppID = (getSDKReferenceNumber + 125) % 128;
        return serial;
    }

    static void init$0() {
        $$a = new byte[]{8, 93, 113, 60};
        $$b = 37;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        int i11 = getSDKAppID + 5;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0 ? Build.VERSION.SDK_INT < 26 : Build.VERSION.SDK_INT < 120) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        try {
            String sDKTransactionID = getSDKTransactionID();
            Object[] objArr = new Object[1];
            a((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 7, "\u0001\u0003\u0007\u0005\u0000\b㙏", (byte) (TextUtils.lastIndexOf("", '0') + 92), objArr);
            if (s.f(sDKTransactionID, ((String) objArr[0]).intern())) {
                getSDKReferenceNumber = (getSDKAppID + 29) % 128;
                sDKTransactionID = null;
            } else {
                int i12 = (getSDKReferenceNumber + 119) % 128;
                getSDKAppID = i12;
                int i13 = i12 + 55;
                getSDKReferenceNumber = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
            }
            return sDKTransactionID != null ? DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(sDKTransactionID)) : new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        } catch (SecurityException unused) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
    }
}
