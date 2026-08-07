package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/Time12Or24;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "", "isValid", "(Ljava/lang/String;)Z", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class timedout extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static short[] getSDKEphemeralPublicKey;
    private static byte[] getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters AuthenticationRequestParameters;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/Time12Or24$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getMessageVersion = 0;
        ChallengeResultCancelled = 1;
        getSDKReferenceNumber();
        SystemClock.uptimeMillis();
        Color.alpha(0);
        AudioTrack.getMaxVolume();
        ViewConfiguration.getMinimumFlingVelocity();
        Process.getElapsedCpuTime();
        new getDeviceData((byte) 0);
        getMessageVersion = (ChallengeResultCancelled + 121) % 128;
    }

    public /* synthetic */ timedout(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    private static void a(int i11, int i12, short s11, int i13, byte b11, Object[] objArr) throws Throwable {
        int i14;
        int i15;
        long j11;
        char c11;
        int length;
        byte[] bArr;
        int i16;
        Object method;
        atd.az.ChallengeResultKt challengeResultKt = new atd.az.ChallengeResultKt();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i17 = 1;
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(getSDKAppID)};
            Map map = atd.a.getMessageVersion.timedout;
            Object method2 = map.get(557807898);
            Class cls = Integer.TYPE;
            if (method2 != null) {
                i14 = 0;
            } else {
                Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2105 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (Drawable.resolveOpacity(0, 0) + 21995), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31);
                byte b12 = (byte) 0;
                byte b13 = b12;
                i14 = 0;
                Object[] objArr3 = new Object[1];
                b(b12, b13, b13, objArr3);
                method2 = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(557807898, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
            int i18 = iIntValue == -1 ? 1 : i14;
            if (i18 != 0) {
                byte[] bArr2 = getSDKReferenceNumber;
                if (bArr2 != null) {
                    j11 = -671853308956415234L;
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i19 = i14;
                    c11 = '0';
                    while (i19 < length2) {
                        int i21 = i17;
                        Object[] objArr4 = {Integer.valueOf(bArr2[i19])};
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object obj = map2.get(-844142059);
                        if (obj != null) {
                            method = obj;
                        } else {
                            method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2984 - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32)).getMethod("s", cls);
                            map2.put(-844142059, method);
                        }
                        bArr3[i19] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                        i19++;
                        i17 = i21;
                        bArr2 = bArr2;
                        i18 = i18;
                    }
                    bArr2 = bArr3;
                } else {
                    j11 = -671853308956415234L;
                    c11 = '0';
                }
                int i22 = i17;
                i15 = i18;
                if (bArr2 != null) {
                    byte[] bArr4 = getSDKReferenceNumber;
                    Object[] objArr5 = new Object[2];
                    objArr5[i22] = Integer.valueOf(getSDKTransactionID);
                    objArr5[i14] = Integer.valueOf(i13);
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(557807898);
                    if (method3 == null) {
                        int i23 = i14;
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.normalizeMetaState(i14) + 2105, (char) (TextUtils.indexOf("", "", i23) + 21995), 31 - View.MeasureSpec.getSize(i23));
                        byte b14 = (byte) i23;
                        byte b15 = b14;
                        Object[] objArr6 = new Object[i22];
                        b(b14, b15, b15, objArr6);
                        method3 = cls3.getMethod((String) objArr6[i23], cls, cls);
                        map3.put(557807898, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ j11)) + ((int) (((long) getSDKAppID) ^ j11)));
                } else {
                    iIntValue = (short) (((short) (((long) getSDKEphemeralPublicKey[i13 + ((int) (((long) getSDKTransactionID) ^ j11))]) ^ j11)) + ((int) (((long) getSDKAppID) ^ j11)));
                    $11 = ($10 + 95) % 128;
                }
            } else {
                i15 = i18;
                j11 = -671853308956415234L;
                c11 = '0';
            }
            if (iIntValue > 0) {
                challengeResultKt.getDeviceData = ((i13 + iIntValue) - 2) + ((int) (((long) getSDKTransactionID) ^ j11)) + i15;
                Object[] objArr7 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(getDeviceData), sb2};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-1793105104);
                if (method4 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2135, (char) (TextUtils.indexOf("", c11, 0, 0) + 1), 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr8 = new Object[1];
                    b(b16, b17, (byte) (b17 + 1), objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, cls, cls, Object.class);
                    map4.put(-1793105104, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(challengeResultKt.getSDKTransactionID);
                challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                byte[] bArr5 = getSDKReferenceNumber;
                if (bArr5 != null) {
                    int i24 = $10 + 119;
                    $11 = i24 % 128;
                    if (i24 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i16 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i16 = 0;
                    }
                    while (i16 < length) {
                        int i25 = $10 + 11;
                        $11 = i25 % 128;
                        if (i25 % 2 == 0) {
                            bArr[i16] = (byte) (((long) bArr5[i16]) ^ j11);
                            i16 >>>= 1;
                        } else {
                            bArr[i16] = (byte) (((long) bArr5[i16]) ^ j11);
                            i16++;
                        }
                    }
                    bArr5 = bArr;
                }
                boolean z11 = bArr5 != null;
                challengeResultKt.getSDKReferenceNumber = 1;
                while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                    if (z11) {
                        byte[] bArr6 = getSDKReferenceNumber;
                        int i26 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i26 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr6[i26]) ^ j11)) + s11)) ^ b11));
                    } else {
                        short[] sArr = getSDKEphemeralPublicKey;
                        int i27 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i27 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr[i27]) ^ j11)) + s11)) ^ b11));
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

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.x.timedout.$$a
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r8 = r8 * 7
            int r8 = r8 + 114
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r3 = r0
            r4 = r2
            r0 = r6
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r7]
            r5 = r0
            r0 = r8
            r8 = r3
            r3 = r5
        L2f:
            int r8 = -r8
            int r7 = r7 + 1
            int r8 = r8 + r0
            r0 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.timedout.b(byte, byte, short, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getSDKTransactionID = 867719144;
        getSDKAppID = -1568970014;
        getDeviceData = 550874771;
        getSDKReferenceNumber = new byte[]{Tnaf.POW_2_WIDTH, 105, -106, 72, 100, -103, -127, 127, 99, 112, 24, 39, 24, 74, 22, 7, -64, 17};
    }

    static void init$0() {
        $$a = new byte[]{88, -76, 55, 74};
        $$b = 50;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
        Object[] objArr = new Object[1];
        a((-29) - Gravity.getAbsoluteGravity(0, 0), Color.rgb(0, 0, 0) + 2119252999, (short) ((-16) - ImageFormat.getBitsPerPixel(0)), 1849475818 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (byte) ((KeyEvent.getMaxKeyCode() >> 16) - 118), objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            int i11 = ChallengeResultCancelled + 13;
            getMessageVersion = i11 % 128;
            if (i11 % 2 != 0) {
                getDeviceData(sDKTransactionID);
                throw null;
            }
            if (getDeviceData(sDKTransactionID)) {
                int i12 = (ChallengeResultCancelled + 115) % 128;
                getMessageVersion = i12;
                ChallengeResultCancelled = (i12 + 29) % 128;
            } else {
                ChallengeResultCancelled = (getMessageVersion + 77) % 128;
                sDKTransactionID = null;
            }
            if (sDKTransactionID != null) {
                return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(sDKTransactionID));
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private timedout(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.AuthenticationRequestParameters = authenticationRequestParameters;
    }

    private static boolean getDeviceData(String str) throws Throwable {
        getMessageVersion = (ChallengeResultCancelled + 95) % 128;
        Object[] objArr = new Object[1];
        a((-29) - KeyEvent.getDeadChar(0, 0), 2102475716 - (ViewConfiguration.getScrollBarSize() >> 8), (short) ((ViewConfiguration.getTouchSlop() >> 8) + 43), TextUtils.indexOf("", "", 0, 0) + 1849475828, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 5), objArr);
        if (!str.equals(((String) objArr[0]).intern())) {
            ChallengeResultCancelled = (getMessageVersion + 21) % 128;
            Object[] objArr2 = new Object[1];
            a(TextUtils.indexOf("", "", 0, 0) - 29, Gravity.getAbsoluteGravity(0, 0) + 2102475717, (short) (53 - TextUtils.indexOf((CharSequence) "", '0')), 1849475831 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) ((-24) - Color.blue(0)), objArr2);
            if (!str.equals(((String) objArr2[0]).intern())) {
                return false;
            }
        }
        ChallengeResultCancelled = (getMessageVersion + 81) % 128;
        return true;
    }
}
