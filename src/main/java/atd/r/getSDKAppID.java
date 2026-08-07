package atd.r;

import android.app.Application;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/ApplyRampingRinger;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/app/Application;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long getDeviceData;
    private static int getMessageVersion;
    private static char getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters AuthenticationRequestParameters;
    private final Application getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/ApplyRampingRinger$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private getSDKReferenceNumber() {
        }

        public /* synthetic */ getSDKReferenceNumber(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKReferenceNumber();
        ViewConfiguration.getZoomControlsTimeout();
        TextUtils.indexOf((CharSequence) "", '0');
        new getSDKReferenceNumber((byte) 0);
        getMessageVersion = (getSDKEphemeralPublicKey + 99) % 128;
    }

    public /* synthetic */ getSDKAppID(Application application) {
        this(application, new atd.q.getSDKTransactionID(application));
    }

    private static void a(String str, String str2, char c11, String str3, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        char[] charArray3;
        Integer num = -2032575242;
        Integer num2 = 262890898;
        if (str3 != null) {
            charArray = str3.toCharArray();
            $10 = ($11 + 11) % 128;
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        int i12 = 2;
        if (str2 != null) {
            int i13 = $11 + 13;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                charArray2 = str2.toCharArray();
                int i14 = 23 / 0;
            } else {
                charArray2 = str2.toCharArray();
            }
        } else {
            charArray2 = str2;
        }
        char[] cArr2 = charArray2;
        if (str != null) {
            $10 = ($11 + 5) % 128;
            charArray3 = str.toCharArray();
        } else {
            charArray3 = str;
        }
        char[] cArr3 = charArray3;
        atd.az.ChallengeResultTimeout challengeResultTimeout = new atd.az.ChallengeResultTimeout();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c11);
        cArr5[2] = (char) (cArr5[2] + ((char) i11));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        challengeResultTimeout.getSDKTransactionID = 0;
        while (challengeResultTimeout.getSDKTransactionID < length3) {
            $10 = ($11 + 71) % 128;
            try {
                Object[] objArr2 = {challengeResultTimeout};
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(num2);
                int i15 = i12;
                if (method == null) {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1861, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.lastIndexOf("", '0', 0, 0) + 22);
                    byte b11 = (byte) (-1);
                    byte b12 = (byte) (b11 + 1);
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(num2, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {challengeResultTimeout};
                Object method2 = map.get(num);
                if (method2 == null) {
                    method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(Color.green(0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, (char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 43)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i16 = cArr4[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                char c12 = cArr5[iIntValue];
                Object[] objArr5 = new Object[3];
                objArr5[i15] = Integer.valueOf(c12);
                objArr5[1] = Integer.valueOf(i16);
                objArr5[0] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2446 - (Process.myPid() >> 22), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), View.resolveSize(0, 0) + 18);
                    byte b13 = (byte) (-1);
                    byte b14 = (byte) (-b13);
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, (byte) (b14 - 1), objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                    map.put(484986213, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i17 = cArr4[iIntValue2] * 32718;
                char c13 = cArr5[iIntValue];
                Object[] objArr7 = new Object[i15];
                objArr7[1] = Integer.valueOf(c13);
                objArr7[0] = Integer.valueOf(i17);
                Object method4 = map.get(-919285918);
                if (method4 == null) {
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(Color.alpha(0) + 2969, (char) (9912 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 37)).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr5[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c14 = challengeResultTimeout.getDeviceData;
                cArr4[iIntValue2] = c14;
                int i18 = challengeResultTimeout.getSDKTransactionID;
                cArr6[i18] = (char) (((((long) (c14 ^ cArr[i18])) ^ (getDeviceData ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) getSDKTransactionID) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) getSDKAppID) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i18 + 1;
                $11 = ($10 + 29) % 128;
                cArr = cArr;
                length3 = length3;
                cArr4 = cArr4;
                cArr5 = cArr5;
                num = num;
                num2 = num2;
                i12 = 2;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        String str4 = new String(cArr6);
        int i19 = $11 + 117;
        $10 = i19 % 128;
        if (i19 % 2 == 0) {
            objArr[0] = str4;
        } else {
            int i21 = 6 / 0;
            objArr[0] = str4;
        }
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
    private static void b(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 1
            int r7 = r7 + 3
            byte[] r0 = atd.r.getSDKAppID.$$a
            int r8 = r8 * 4
            int r8 = r8 + 102
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r0
            r5 = r2
            r0 = r8
            r8 = r7
            goto L2f
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r0
            r0 = r6
        L2f:
            int r7 = -r7
            int r7 = r7 + r0
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.r.getSDKAppID.b(int, byte, short, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getDeviceData = -4201337076207898698L;
        getSDKTransactionID = 1458778038;
        getSDKAppID = (char) 43954;
    }

    static void init$0() {
        $$a = new byte[]{83, -124, 59};
        $$b = 182;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        AudioManager audioManager;
        int i11 = getMessageVersion + 93;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0 ? Build.VERSION.SDK_INT < 29 : Build.VERSION.SDK_INT < 50) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        if (Build.VERSION.SDK_INT > 32) {
            Application application = this.getSDKReferenceNumber;
            Object[] objArr = new Object[1];
            a("甔풃勋ﰝ", "\u0000\u0000\u0000\u0000", (char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 7506), "\uddbd我㗞躮᧳", (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 875265164, objArr);
            Object systemService = application.getSystemService(((String) objArr[0]).intern());
            if (systemService instanceof AudioManager) {
                getSDKEphemeralPublicKey = (getMessageVersion + 23) % 128;
                audioManager = (AudioManager) systemService;
            } else {
                getSDKEphemeralPublicKey = (getMessageVersion + 123) % 128;
                audioManager = null;
            }
            return audioManager != null ? DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(audioManager.isRampingRingerEnabled())) : new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
        Object[] objArr2 = new Object[1];
        a("\udccd孢뒋ꝥ", "\u0000\u0000\u0000\u0000", (char) (ViewConfiguration.getLongPressTimeout() >> 16), "䩔ⱹ腍䪕\udf03怲䦤헉㢵\ue51e⍛晸훗赣ﶍ퇱Ⳮ靉\uf2beꋜ", ViewConfiguration.getDoubleTapTimeout() >> 16, objArr2);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr2[0]).intern());
        if (sDKTransactionID != null) {
            getMessageVersion = (getSDKEphemeralPublicKey + 5) % 128;
            Boolean sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
            if (sDKReferenceNumber != null) {
                return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private getSDKAppID(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKReferenceNumber = application;
        this.AuthenticationRequestParameters = authenticationRequestParameters;
    }
}
