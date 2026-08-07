package atd.r;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.az.ChallengeResultKt;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/HttpProxy;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultError extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static short[] ChallengeResult;
    private static byte[] getDeviceData;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKAppID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/HttpProxy$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getSDKEphemeralPublicKey = 0;
        BuildConfig = 1;
        getSDKReferenceNumber();
        ImageFormat.getBitsPerPixel(0);
        Color.green(0);
        ViewConfiguration.getMinimumFlingVelocity();
        Process.getThreadPriority(0);
        TextUtils.getCapsMode("", 0, 0);
        new AuthenticationRequestParameters((byte) 0);
        int i11 = getSDKEphemeralPublicKey + 5;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 64 / 0;
        }
    }

    public /* synthetic */ ChallengeResultError(Application application) {
        this(application, new atd.q.getSDKTransactionID(application));
    }

    private static void a(int i11, int i12, short s11, int i13, byte b11, Object[] objArr) throws Throwable {
        int i14;
        int i15;
        long j11;
        Object method;
        ChallengeResultKt challengeResultKt = new ChallengeResultKt();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i16 = 1;
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(getSDKTransactionID)};
            Map map = atd.a.getMessageVersion.timedout;
            Object method2 = map.get(557807898);
            Class cls = Integer.TYPE;
            if (method2 != null) {
                i14 = 0;
            } else {
                Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2105 - KeyEvent.keyCodeFromString(""), (char) (21995 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 31 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                byte b12 = (byte) 0;
                byte b13 = (byte) (b12 + 1);
                i14 = 0;
                Object[] objArr3 = new Object[1];
                b(b12, b13, (byte) (b13 - 1), objArr3);
                method2 = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(557807898, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
            int i17 = iIntValue == -1 ? 1 : i14;
            if (i17 != 0) {
                byte[] bArr = getDeviceData;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i18 = i14;
                    j11 = 0;
                    while (i18 < length) {
                        Object[] objArr4 = {Integer.valueOf(bArr[i18])};
                        int i19 = i16;
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object obj = map2.get(-844142059);
                        if (obj != null) {
                            method = obj;
                        } else {
                            int i21 = i14;
                            method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2936 - KeyEvent.getDeadChar(i21, i21), (char) Color.red(i21), 32 - TextUtils.lastIndexOf("", '0', i21, i21))).getMethod("s", cls);
                            map2.put(-844142059, method);
                        }
                        bArr2[i18] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                        i18++;
                        $10 = ($11 + 17) % 128;
                        i16 = i19;
                        bArr = bArr;
                        bArr2 = bArr2;
                        i17 = i17;
                        i14 = 0;
                    }
                    bArr = bArr2;
                } else {
                    j11 = 0;
                }
                int i22 = i16;
                i15 = i17;
                if (bArr != null) {
                    byte[] bArr3 = getDeviceData;
                    Object[] objArr5 = new Object[2];
                    objArr5[i22] = Integer.valueOf(getSDKReferenceNumber);
                    objArr5[0] = Integer.valueOf(i13);
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(557807898);
                    if (method3 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2106 - (ViewConfiguration.getGlobalActionKeyTimeout() > j11 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j11 ? 0 : -1)), (char) (View.resolveSize(0, 0) + 21995), 31 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        byte b14 = (byte) 0;
                        byte b15 = (byte) (b14 + 1);
                        Object[] objArr6 = new Object[i22];
                        b(b14, b15, (byte) (b15 - 1), objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], cls, cls);
                        map3.put(557807898, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ (-671853308956415234L))) + ((int) (((long) getSDKTransactionID) ^ (-671853308956415234L))));
                } else {
                    iIntValue = (short) (((short) (((long) ChallengeResult[i13 + ((int) (((long) getSDKReferenceNumber) ^ (-671853308956415234L)))]) ^ (-671853308956415234L))) + ((int) (((long) getSDKTransactionID) ^ (-671853308956415234L))));
                }
            } else {
                i15 = i17;
                j11 = 0;
            }
            if (iIntValue > 0) {
                $11 = ($10 + 117) % 128;
                challengeResultKt.getDeviceData = ((i13 + iIntValue) - 2) + ((int) (((long) getSDKReferenceNumber) ^ (-671853308956415234L))) + i15;
                Object[] objArr7 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(AuthenticationRequestParameters), sb2};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-1793105104);
                if (method4 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2137 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 29 - (SystemClock.elapsedRealtimeNanos() > j11 ? 1 : (SystemClock.elapsedRealtimeNanos() == j11 ? 0 : -1)));
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr8 = new Object[1];
                    b(b16, b17, b17, objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, cls, cls, Object.class);
                    map4.put(-1793105104, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(challengeResultKt.getSDKTransactionID);
                challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                byte[] bArr4 = getDeviceData;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i23 = 0; i23 < length2; i23++) {
                        int i24 = $11 + 99;
                        $10 = i24 % 128;
                        if (i24 % 2 != 0) {
                            bArr5[i23] = (byte) (((long) bArr4[i23]) % (-671853308956415234L));
                        } else {
                            bArr5[i23] = (byte) (((long) bArr4[i23]) ^ (-671853308956415234L));
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z11 = bArr4 != null;
                challengeResultKt.getSDKReferenceNumber = 1;
                while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                    if (z11) {
                        byte[] bArr6 = getDeviceData;
                        int i25 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i25 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr6[i25]) ^ (-671853308956415234L))) + s11)) ^ b11));
                    } else {
                        short[] sArr = ChallengeResult;
                        int i26 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i26 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr[i26]) ^ (-671853308956415234L))) + s11)) ^ b11));
                    }
                    sb2.append(challengeResultKt.getSDKTransactionID);
                    challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                    challengeResultKt.getSDKReferenceNumber++;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
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
    private static void b(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r5 = r5 * 3
            int r0 = r5 + 1
            int r6 = r6 * 7
            int r6 = 121 - r6
            byte[] r1 = atd.r.ChallengeResultError.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r5
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r7 = r7 + 1
            r3 = r1[r7]
        L2a:
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.r.ChallengeResultError.b(short, byte, short, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getSDKReferenceNumber = 2015317717;
        getSDKTransactionID = -1568970018;
        AuthenticationRequestParameters = 1653651302;
        getDeviceData = new byte[]{-1, -9, 3, -4, -17, 17, 2, -2, -14, 6, -9, 17, -2, -2};
    }

    static void init$0() {
        $$a = new byte[]{79, -70, -97, 13};
        $$b = 39;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        getSDKEphemeralPublicKey = (BuildConfig + 119) % 128;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKAppID;
        Object[] objArr = new Object[1];
        a((-22) - (ViewConfiguration.getLongPressTimeout() >> 16), 1058284241 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) TextUtils.indexOf("", "", 0, 0), 630971349 + (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(sDKTransactionID));
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        int i11 = BuildConfig + 23;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            return failure;
        }
        throw null;
    }

    private ChallengeResultError(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKAppID = authenticationRequestParameters;
    }
}
