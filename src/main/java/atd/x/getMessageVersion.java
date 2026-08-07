package atd.x;

import android.app.Application;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
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
import p013kotlin.text.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/EndButtonBehaviour;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "", "isValid", "(Ljava/lang/String;)Z", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getMessageVersion extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private final atd.q.AuthenticationRequestParameters getDeviceData;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/EndButtonBehaviour$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
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
        ViewConfiguration.getPressedStateDuration();
        new getDeviceData((byte) 0);
        getSDKReferenceNumber = (getSDKAppID + 39) % 128;
    }

    public /* synthetic */ getMessageVersion(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = new int[]{340977568, -1763215232, -1004472826, 372240643, 1094270361, -334919574, 1913755680, 319245387, -710702469, -2119833391, 1636723610, -2071178268, 886742420, 403582569, 1995406225, 1867393384, 644795574, -776011218};
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        Object method;
        int length;
        int[] iArr2;
        int i13;
        Object method2;
        Integer num = 1109131256;
        atd.az.ChallengeResultCompleted challengeResultCompleted = new atd.az.ChallengeResultCompleted();
        char[] cArr = new char[4];
        int i14 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        if (iArr3 != null) {
            int i15 = $11 + 115;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i13 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i13 = 0;
            }
            i12 = 16;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i13])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        method2 = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1863 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (MotionEvent.axisFromString("") + 1), 21 - (ViewConfiguration.getEdgeSlop() >> 16));
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 + 3);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 - 3), objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2050190164, method2);
                    }
                    iArr2[i13] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i13++;
                    iArr2 = iArr2;
                    length = length;
                    cArr = cArr;
                    iArr3 = iArr3;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        } else {
            i12 = 16;
        }
        char[] cArr3 = cArr;
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AuthenticationRequestParameters;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i16 = 0;
            while (i16 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i16])};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object obj2 = map2.get(2050190164);
                if (obj2 != null) {
                    method = obj2;
                } else {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1861 - TextUtils.lastIndexOf("", '0', 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 20 - TextUtils.lastIndexOf("", '0', 0, 0));
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 + 3);
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, (byte) (b14 - 3), objArr5);
                    method = cls3.getMethod((String) objArr5[0], cls);
                    map2.put(2050190164, method);
                }
                iArr6[i16] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                i16++;
                $11 = ($10 + 113) % 128;
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
        char c11 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        while (true) {
            int i17 = challengeResultCompleted.getDeviceData;
            if (i17 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i11);
                return;
            }
            int i18 = iArr[i17];
            char c12 = (char) (i18 >> 16);
            cArr3[c11] = c12;
            char c13 = (char) i18;
            cArr3[1] = c13;
            char c14 = (char) (iArr[i17 + 1] >> 16);
            cArr3[i14] = c14;
            char c15 = (char) iArr[i17 + 1];
            char c16 = 3;
            cArr3[3] = c15;
            challengeResultCompleted.getSDKAppID = (c12 << 16) + c13;
            challengeResultCompleted.getSDKReferenceNumber = (c14 << 16) + c15;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i19 = 0;
            while (i19 < i12) {
                int i21 = challengeResultCompleted.getSDKAppID ^ iArr4[i19];
                challengeResultCompleted.getSDKAppID = i21;
                int sDKAppID = atd.az.ChallengeResultCompleted.getSDKAppID(i21);
                Object[] objArr6 = new Object[4];
                objArr6[c16] = challengeResultCompleted;
                objArr6[i14] = challengeResultCompleted;
                objArr6[1] = Integer.valueOf(sDKAppID);
                objArr6[0] = challengeResultCompleted;
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method3 = map3.get(929629307);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.getDefaultSize(0, 0) + 1299, (char) (CipherSuite.TLS_PSK_WITH_AES_256_CCM_8 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 32 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, cls, Object.class, Object.class);
                    map3.put(929629307, method3);
                }
                int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i19++;
                c16 = c16;
                i12 = 16;
            }
            char c17 = c16;
            int i22 = challengeResultCompleted.getSDKAppID;
            int i23 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i23;
            challengeResultCompleted.getSDKReferenceNumber = i22;
            int i24 = i22 ^ iArr4[16];
            challengeResultCompleted.getSDKReferenceNumber = i24;
            int i25 = i23 ^ iArr4[17];
            challengeResultCompleted.getSDKAppID = i25;
            cArr3[0] = (char) (i25 >>> 16);
            cArr3[1] = (char) i25;
            cArr3[i14] = (char) (i24 >>> 16);
            cArr3[c17] = (char) i24;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i26 = challengeResultCompleted.getDeviceData;
            cArr4[i26 * 2] = cArr3[0];
            cArr4[(i26 * 2) + 1] = cArr3[1];
            cArr4[(i26 * 2) + 2] = cArr3[i14];
            cArr4[(i26 * 2) + 3] = cArr3[c17];
            Object[] objArr8 = new Object[i14];
            objArr8[1] = challengeResultCompleted;
            objArr8[0] = challengeResultCompleted;
            Map map4 = atd.a.getMessageVersion.timedout;
            Integer num3 = num2;
            Object method4 = map4.get(num3);
            if (method4 != null) {
                i12 = 16;
            } else {
                i12 = 16;
                Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2060, (char) (Process.myTid() >> 22), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 16);
                byte b17 = (byte) 0;
                byte b18 = (byte) (b17 + 1);
                Object[] objArr9 = new Object[1];
                b(b17, b18, (byte) (b18 - 1), objArr9);
                method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map4.put(num3, method4);
            }
            ((Method) method4).invoke(null, objArr8);
            num2 = num3;
            c11 = 0;
            i14 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r0 = 1 - r6
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = 120 - r7
            byte[] r1 = atd.x.getMessageVersion.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            r3 = -1
            if (r1 != 0) goto L18
            r4 = r3
            r3 = r1
            r1 = r8
            goto L34
        L18:
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            int r3 = r3 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r7 = r7 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L34:
            int r7 = -r7
            int r7 = r7 + r1
            r1 = r8
            r8 = r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.getMessageVersion.b(short, short, int, java.lang.Object[]):void");
    }

    private static boolean getSDKTransactionID(String str) throws Throwable {
        Object[] objArr = new Object[1];
        a(new int[]{648354762, -451337849, 1109563419, -452232379}, 7 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        boolean zI = new q(((String) objArr[0]).intern()).i(str);
        int i11 = getSDKAppID + 27;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 66 / 0;
        }
        return zI;
    }

    static void init$0() {
        $$a = new byte[]{29, -9, 65, -64};
        $$b = 121;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getDeviceData;
        Object[] objArr = new Object[1];
        a(new int[]{-957287177, 846607231, 1510308720, 627857371, -1506926223, -1240288785, -362379815, 1955631920, 379046894, 1854424843}, TextUtils.lastIndexOf("", '0', 0) + 20, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            if (!getSDKTransactionID(sDKTransactionID)) {
                sDKTransactionID = null;
            }
            if (sDKTransactionID != null) {
                getSDKReferenceNumber = (getSDKAppID + 107) % 128;
                DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(sDKTransactionID));
                int i11 = getSDKAppID + 35;
                getSDKReferenceNumber = i11 % 128;
                if (i11 % 2 == 0) {
                    return stringValueM49boximpl;
                }
                throw null;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private getMessageVersion(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getDeviceData = authenticationRequestParameters;
    }
}
