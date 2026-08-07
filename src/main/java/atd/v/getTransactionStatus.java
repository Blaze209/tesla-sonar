package atd.v;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/RttCallingMode;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getTransactionStatus extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKAppID;
    private final atd.q.AuthenticationRequestParameters getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/RttCallingMode$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getDeviceData = 1;
        AuthenticationRequestParameters();
        TextUtils.getOffsetBefore("", 0);
        new getSDKAppID((byte) 0);
        int i11 = getSDKAppID + 107;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ getTransactionStatus(Application application) {
        this(application, new atd.q.getDeviceData(application));
    }

    static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = new int[]{-1597937974, 1825364355, -1068991262, 120278075, -1279020381, -1008248512, 1143244664, -1019751772, 716989212, -596625475, 686195977, -52685654, -376944744, 1583581525, 710633071, 1228585631, -787596604, 31773275};
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        Object method;
        Object method2;
        Integer num = 1109131256;
        atd.az.ChallengeResultCompleted challengeResultCompleted = new atd.az.ChallengeResultCompleted();
        char[] cArr = new char[4];
        int i12 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i13 = 0;
            while (i13 < length) {
                $10 = ($11 + 33) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i13])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        method2 = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Process.getGidForName("") + 1863, (char) Color.green(0), MotionEvent.axisFromString("") + 22);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2050190164, method2);
                    }
                    iArr3[i13] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i13++;
                    iArr3 = iArr3;
                    cArr = cArr;
                    iArr2 = iArr2;
                    length = length;
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
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AuthenticationRequestParameters;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            $10 = ($11 + 47) % 128;
            int i14 = 0;
            while (i14 < length3) {
                int i15 = $11 + 41;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i14])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object obj2 = map2.get(2050190164);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 22 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2050190164, method);
                    }
                    iArr6[i14] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                    i14 %= 1;
                } else {
                    num = num;
                    cArr2 = cArr2;
                    iArr5 = iArr5;
                    length3 = length3;
                    iArr6 = iArr6;
                    int i16 = i14;
                    Object[] objArr6 = {Integer.valueOf(iArr5[i16])};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(2050190164);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.keyCodeFromString("") + 1862, (char) TextUtils.getOffsetAfter("", 0), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20);
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, b16, objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], cls);
                        map3.put(2050190164, method3);
                    }
                    iArr6[i16] = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    i14 = i16 + 1;
                }
                length3 = length3;
                iArr5 = iArr5;
                iArr6 = iArr6;
                cArr2 = cArr2;
                num = num;
            }
            iArr5 = iArr6;
        }
        Integer num2 = num;
        char[] cArr4 = cArr2;
        int i17 = 16;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        while (true) {
            int i18 = challengeResultCompleted.getDeviceData;
            if (i18 >= iArr.length) {
                break;
            }
            $11 = ($10 + 57) % 128;
            int i19 = iArr[i18];
            char c11 = (char) (i19 >> 16);
            cArr3[0] = c11;
            char c12 = (char) i19;
            cArr3[1] = c12;
            char c13 = (char) (iArr[i18 + 1] >> 16);
            cArr3[i12] = c13;
            char c14 = (char) iArr[i18 + 1];
            char c15 = 3;
            cArr3[3] = c14;
            challengeResultCompleted.getSDKAppID = (c11 << 16) + c12;
            challengeResultCompleted.getSDKReferenceNumber = (c13 << 16) + c14;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i21 = 0;
            while (i21 < i17) {
                int i22 = challengeResultCompleted.getSDKAppID ^ iArr4[i21];
                challengeResultCompleted.getSDKAppID = i22;
                int sDKAppID = atd.az.ChallengeResultCompleted.getSDKAppID(i22);
                Object[] objArr8 = new Object[4];
                objArr8[c15] = challengeResultCompleted;
                objArr8[i12] = challengeResultCompleted;
                objArr8[1] = Integer.valueOf(sDKAppID);
                objArr8[0] = challengeResultCompleted;
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(929629307);
                if (method4 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1300 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (TextUtils.getOffsetBefore("", 0) + CipherSuite.TLS_PSK_WITH_AES_256_CCM_8), 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    byte b17 = (byte) 0;
                    byte b18 = (byte) (b17 + 3);
                    Object[] objArr9 = new Object[1];
                    b(b17, b18, (byte) (b18 - 3), objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, cls, Object.class, Object.class);
                    map4.put(929629307, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i21++;
                $10 = ($11 + 39) % 128;
                c15 = c15;
                i17 = 16;
            }
            char c16 = c15;
            int i23 = challengeResultCompleted.getSDKAppID;
            int i24 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i24;
            challengeResultCompleted.getSDKReferenceNumber = i23;
            int i25 = i23 ^ iArr4[16];
            challengeResultCompleted.getSDKReferenceNumber = i25;
            int i26 = i24 ^ iArr4[17];
            challengeResultCompleted.getSDKAppID = i26;
            cArr3[0] = (char) (i26 >>> 16);
            cArr3[1] = (char) i26;
            cArr3[i12] = (char) (i25 >>> 16);
            cArr3[c16] = (char) i25;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i27 = challengeResultCompleted.getDeviceData;
            cArr4[i27 * 2] = cArr3[0];
            cArr4[(i27 * 2) + 1] = cArr3[1];
            cArr4[(i27 * 2) + 2] = cArr3[i12];
            cArr4[(i27 * 2) + 3] = cArr3[c16];
            Object[] objArr10 = new Object[i12];
            objArr10[1] = challengeResultCompleted;
            objArr10[0] = challengeResultCompleted;
            Map map5 = atd.a.getMessageVersion.timedout;
            Integer num3 = num2;
            Object method5 = map5.get(num3);
            if (method5 != null) {
                i17 = 16;
            } else {
                i17 = 16;
                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2109 - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 17 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                byte b19 = (byte) 0;
                byte b21 = (byte) (b19 + 2);
                Object[] objArr11 = new Object[1];
                b(b19, b21, (byte) (b21 - 2), objArr11);
                method5 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                map5.put(num3, method5);
            }
            ((Method) method5).invoke(null, objArr10);
            num2 = num3;
            i12 = 2;
        }
        String str = new String(cArr4, 0, i11);
        int i28 = $10 + 25;
        $11 = i28 % 128;
        if (i28 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
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
    private static void b(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r7 = r7 + 117
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = atd.v.getTransactionStatus.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L18
            r3 = r1
            r4 = r2
            r1 = r8
            r8 = r6
            goto L2f
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r5
        L2f:
            int r7 = -r7
            int r7 = r7 + r8
            int r8 = r1 + 1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.getTransactionStatus.b(short, byte, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{87, -6, 59, -47};
        $$b = 180;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        int i11 = getSDKAppID + 79;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0 ? Build.VERSION.SDK_INT < 28 : Build.VERSION.SDK_INT < 80) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        a(new int[]{-1814384459, -1972247688, -1295512038, 197961347, -1758364198, 670154222, -1702274124, 1898466150}, 16 - TextUtils.indexOf("", ""), objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            getSDKAppID = (getDeviceData + 81) % 128;
            Boolean sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
            if (sDKReferenceNumber != null) {
                getDeviceData = (getSDKAppID + 27) % 128;
                return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private getTransactionStatus(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKReferenceNumber = authenticationRequestParameters;
    }
}
