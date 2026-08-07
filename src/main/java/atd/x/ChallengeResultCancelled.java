package atd.x;

import android.app.Application;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ModeRingerStreamsAffected;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultCancelled extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static byte[] AuthenticationRequestParameters;
    private static int BuildConfig;
    private static short[] ChallengeResultCancelled;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ModeRingerStreamsAffected$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        BuildConfig = 1;
        getSDKTransactionID();
        TextUtils.lastIndexOf("", '0', 0, 0);
        View.resolveSizeAndState(0, 0, 0);
        ViewConfiguration.getScrollDefaultDelay();
        ExpandableListView.getPackedPositionChild(0L);
        AudioTrack.getMinVolume();
        new getDeviceData((byte) 0);
        int i11 = BuildConfig + 85;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 15 / 0;
        }
    }

    public /* synthetic */ ChallengeResultCancelled(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01f8 A[PHI: r2
      0x01f8: PHI (r2v8 int) = (r2v7 int), (r2v25 int) binds: [B:49:0x01f6, B:46:0x01e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01fb A[PHI: r2
      0x01fb: PHI (r2v21 int) = (r2v7 int), (r2v25 int) binds: [B:49:0x01f6, B:46:0x01e8] A[DONT_GENERATE, DONT_INLINE]] */
    private static void a(int i11, int i12, short s11, int i13, byte b11, Object[] objArr) throws Throwable {
        int i14;
        int i15;
        int i16;
        long j11;
        int i17;
        int i18;
        int i19;
        boolean z11;
        int length;
        byte[] bArr;
        int i21;
        int length2;
        byte[] bArr2;
        Object method;
        atd.az.ChallengeResultKt challengeResultKt = new atd.az.ChallengeResultKt();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i22 = 1;
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(getDeviceData)};
            Map map = atd.a.getMessageVersion.timedout;
            Object method2 = map.get(557807898);
            Class cls = Integer.TYPE;
            if (method2 != null) {
                i14 = 0;
            } else {
                Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2104 - Process.getGidForName(""), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 21995), 31 - TextUtils.getOffsetBefore("", 0));
                byte b12 = (byte) 0;
                byte b13 = b12;
                i14 = 0;
                Object[] objArr3 = new Object[1];
                b(b12, b13, b13, objArr3);
                method2 = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(557807898, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                $11 = ($10 + 23) % 128;
                i15 = 1;
            } else {
                i15 = i14;
            }
            if (i15 != 0) {
                int i23 = $10;
                $11 = (i23 + 29) % 128;
                byte[] bArr3 = AuthenticationRequestParameters;
                if (bArr3 != null) {
                    int i24 = i23 + 83;
                    $11 = i24 % 128;
                    if (i24 % 2 == 0) {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                    } else {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                    }
                    int i25 = i14;
                    j11 = -671853308956415234L;
                    while (i25 < length2) {
                        Object[] objArr4 = {Integer.valueOf(bArr3[i25])};
                        int i26 = i22;
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object obj = map2.get(-844142059);
                        if (obj != null) {
                            method = obj;
                        } else {
                            method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2936 - (Process.myTid() >> 22), (char) (TypedValue.complexToFraction(i14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(i14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 33 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).getMethod("s", cls);
                            map2.put(-844142059, method);
                        }
                        bArr2[i25] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                        i25++;
                        i22 = i26;
                        length2 = length2;
                        i15 = i15;
                        i14 = 0;
                    }
                    bArr3 = bArr2;
                } else {
                    j11 = -671853308956415234L;
                }
                i16 = i15;
                int i27 = i22;
                if (bArr3 != null) {
                    byte[] bArr4 = AuthenticationRequestParameters;
                    Object[] objArr5 = new Object[2];
                    objArr5[i27] = Integer.valueOf(getSDKAppID);
                    objArr5[0] = Integer.valueOf(i13);
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(557807898);
                    if (method3 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getWindowTouchSlop() >> 8) + 2105, (char) ((Process.myTid() >> 22) + 21995), (ViewConfiguration.getWindowTouchSlop() >> 8) + 31);
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr6 = new Object[i27];
                        b(b14, b15, b15, objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], cls, cls);
                        map3.put(557807898, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ j11)) + ((int) (((long) getDeviceData) ^ j11)));
                } else {
                    iIntValue = (short) (((short) (((long) ChallengeResultCancelled[i13 + ((int) (((long) getSDKAppID) ^ j11))]) ^ j11)) + ((int) (((long) getDeviceData) ^ j11)));
                }
            } else {
                i16 = i15;
                j11 = -671853308956415234L;
            }
            if (iIntValue > 0) {
                int i28 = $10 + 7;
                int i29 = i28 % 128;
                $11 = i29;
                if (i28 % 2 == 0) {
                    i17 = ((i13 << iIntValue) * 2) << ((int) (((long) getSDKAppID) % j11));
                    if (i16 != 0) {
                        i18 = i17;
                        i19 = 1;
                    } else {
                        $10 = (i29 + 55) % 128;
                        i18 = i17;
                        i19 = 0;
                    }
                } else {
                    i17 = ((i13 + iIntValue) - 2) + ((int) (((long) getSDKAppID) ^ j11));
                    if (i16 != 0) {
                        i18 = i17;
                        i19 = 1;
                    } else {
                        $10 = (i29 + 55) % 128;
                        i18 = i17;
                        i19 = 0;
                    }
                }
                challengeResultKt.getDeviceData = i18 + i19;
                Object[] objArr7 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(getSDKTransactionID), sb2};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-1793105104);
                if (method4 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2136 - ExpandableListView.getPackedPositionGroup(0L), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.keyCodeFromString("") + 28);
                    byte b16 = (byte) ($$b & 5);
                    byte b17 = (byte) (b16 - 1);
                    Object[] objArr8 = new Object[1];
                    b(b16, b17, b17, objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, cls, cls, Object.class);
                    map4.put(-1793105104, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(challengeResultKt.getSDKTransactionID);
                challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                byte[] bArr5 = AuthenticationRequestParameters;
                if (bArr5 != null) {
                    int i31 = $10 + 55;
                    $11 = i31 % 128;
                    if (i31 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i21 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i21 = 0;
                    }
                    while (i21 < length) {
                        int i32 = ($10 + 15) % 128;
                        $11 = i32;
                        bArr[i21] = (byte) (((long) bArr5[i21]) ^ j11);
                        i21++;
                        $10 = (i32 + 17) % 128;
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    $10 = ($11 + 77) % 128;
                    z11 = true;
                } else {
                    z11 = false;
                }
                challengeResultKt.getSDKReferenceNumber = 1;
                while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                    if (z11) {
                        byte[] bArr6 = AuthenticationRequestParameters;
                        int i33 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i33 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr6[i33]) ^ j11)) + s11)) ^ b11));
                    } else {
                        short[] sArr = ChallengeResultCancelled;
                        int i34 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i34 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr[i34]) ^ j11)) + s11)) ^ b11));
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

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.x.ChallengeResultCancelled.$$a
            int r6 = r6 * 7
            int r6 = r6 + 114
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L2f:
            int r6 = -r6
            int r6 = r6 + r8
            int r8 = r0 + 1
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeResultCancelled.b(int, int, short, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        getSDKAppID = 674725854;
        getDeviceData = -1568970056;
        getSDKTransactionID = 767296871;
        AuthenticationRequestParameters = new byte[]{40, 24, 38, 6, 27, 24, 25, 18, 23, 45, 19, 13, 29, 36, 27, 22, 5, 42, 10, 27, 30, 18, 32, 4, 31, 22, 34, 23, 64, 105, 112, -127};
    }

    static void init$0() {
        $$a = new byte[]{40, -122, 91, -69};
        $$b = 171;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        Integer numAuthenticationRequestParameters;
        BuildConfig = (getMessageVersion + 89) % 128;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        a((-71) - (Process.myTid() >> 22), 1882755283 - TextUtils.indexOf((CharSequence) "", '0'), (short) (25 - View.MeasureSpec.getMode(0)), 1974725343 - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) View.MeasureSpec.getSize(0), objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID == null || (numAuthenticationRequestParameters = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.AuthenticationRequestParameters(sDKTransactionID)) == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        BuildConfig = (getMessageVersion + 51) % 128;
        DeviceParameterResult.Success.IntValue intValueM35boximpl = DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(numAuthenticationRequestParameters.intValue()));
        int i11 = BuildConfig + 103;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 27 / 0;
        }
        return intValueM35boximpl;
    }

    private ChallengeResultCancelled(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKReferenceNumber = authenticationRequestParameters;
    }
}
