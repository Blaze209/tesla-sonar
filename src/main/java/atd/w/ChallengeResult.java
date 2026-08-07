package atd.w;

import android.annotation.SuppressLint;
import android.app.Application;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/IsTtyModeSupported;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/telecom/TelecomManager;", "", "isTtySupportedByDevice", "(Landroid/telecom/TelecomManager;)Z", "areAnyReadPhoneStatePermissionsGranted", "()Z", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResult extends InitializeResultSuccess {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static char getSDKAppID;
    private static int getSDKTransactionID;
    private final Application getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/IsTtyModeSupported$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private getSDKTransactionID() {
        }

        public /* synthetic */ getSDKTransactionID(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getMessageVersion = 1;
        getSDKReferenceNumber();
        ExpandableListView.getPackedPositionChild(0L);
        Process.getElapsedCpuTime();
        new getSDKTransactionID((byte) 0);
        int i11 = getMessageVersion + 45;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ ChallengeResult(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    private final boolean AuthenticationRequestParameters() {
        if (BuildConfig() || ChallengeResultCompleted()) {
            int i11 = getMessageVersion + 65;
            getSDKTransactionID = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 15 / 0;
            }
            return true;
        }
        int i13 = getSDKTransactionID + 101;
        getMessageVersion = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 35 / 0;
        }
        return false;
    }

    private static void a(String str, String str2, char c11, String str3, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        float f11;
        Integer num = -2032575242;
        Integer num2 = 262890898;
        if (str3 != null) {
            $11 = ($10 + 45) % 128;
            charArray = str3.toCharArray();
            $11 = ($10 + 77) % 128;
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        int i12 = 2;
        if (str2 != null) {
            int i13 = $11 + 59;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                charArray2 = str2.toCharArray();
                int i14 = 85 / 0;
            } else {
                charArray2 = str2.toCharArray();
            }
        } else {
            charArray2 = str2;
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        atd.az.ChallengeResultTimeout challengeResultTimeout = new atd.az.ChallengeResultTimeout();
        int length = charArray3.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
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
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionGroup(0L) + 1862, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), MotionEvent.axisFromString("") + 22);
                    byte b11 = (byte) 0;
                    byte b12 = (byte) (b11 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, (byte) (b12 + 1), objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(num2, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {challengeResultTimeout};
                Object method2 = map.get(num);
                if (method2 == null) {
                    method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(225 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 42 - ImageFormat.getBitsPerPixel(0))).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i16 = cArr3[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                char c12 = cArr4[iIntValue];
                Object[] objArr5 = new Object[3];
                objArr5[i15] = Integer.valueOf(c12);
                objArr5[1] = Integer.valueOf(i16);
                objArr5[0] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 != null) {
                    f11 = 0.0f;
                } else {
                    f11 = 0.0f;
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2446 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (KeyEvent.getMaxKeyCode() >> 16), 19 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 - 1);
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, (byte) (-b14), objArr6);
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
                    float f12 = f11;
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2968, (char) (9913 - (TypedValue.complexToFraction(0, f12, f12) > f12 ? 1 : (TypedValue.complexToFraction(0, f12, f12) == f12 ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 38)).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr4[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c13 = challengeResultTimeout.getDeviceData;
                cArr3[iIntValue2] = c13;
                int i18 = challengeResultTimeout.getSDKTransactionID;
                cArr5[i18] = (char) (((((long) (c13 ^ cArr[i18])) ^ (AuthenticationRequestParameters ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) getDeviceData) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) getSDKAppID) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i18 + 1;
                $11 = ($10 + 125) % 128;
                cArr3 = cArr3;
                i12 = i15;
                length3 = length3;
                cArr = cArr;
                cArr4 = cArr4;
                num = num;
                num2 = num2;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 102
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r7 = r7 + 4
            byte[] r1 = atd.w.ChallengeResult.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r1
            r4 = r2
            r1 = r8
            r8 = r7
            goto L2f
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r7 = r7 + 1
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r5
        L2f:
            int r7 = r7 + r1
            r1 = r8
            r8 = r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.w.ChallengeResult.b(int, int, int, java.lang.Object[]):void");
    }

    @SuppressLint({"MissingPermission"})
    private static boolean cx_(TelecomManager telecomManager) {
        getMessageVersion = (getSDKTransactionID + 9) % 128;
        boolean zIsTtySupported = telecomManager.isTtySupported();
        getSDKTransactionID = (getMessageVersion + 115) % 128;
        return zIsTtySupported;
    }

    static void getSDKReferenceNumber() {
        AuthenticationRequestParameters = -4201337076207898698L;
        getDeviceData = 1458778038;
        getSDKAppID = (char) 22337;
    }

    static void init$0() {
        $$a = new byte[]{81, 93, -56, -49};
        $$b = 45;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        getMessageVersion = (getSDKTransactionID + 121) % 128;
        Boolean boolValueOf = null;
        if (Build.VERSION.SDK_INT < 28) {
            getSDKTransactionID = (getMessageVersion + 89) % 128;
            TelephonyManager telephonyManagerCF_ = cF_();
            if (telephonyManagerCF_ != null) {
                getSDKTransactionID = (getMessageVersion + 69) % 128;
                boolValueOf = Boolean.valueOf(telephonyManagerCF_.isTtyModeSupported());
            }
        } else {
            if (!AuthenticationRequestParameters()) {
                return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
            }
            Application application = this.getSDKReferenceNumber;
            Object[] objArr = new Object[1];
            a("옢ʯ캙칓", "\u0000\u0000\u0000\u0000", (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "ᢎ᪹袶陒鍔䞊縮", (-1727877177) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
            Object systemService = application.getSystemService(((String) objArr[0]).intern());
            TelecomManager telecomManager = systemService instanceof TelecomManager ? (TelecomManager) systemService : null;
            if (telecomManager != null) {
                int i11 = getSDKTransactionID + 63;
                getMessageVersion = i11 % 128;
                if (i11 % 2 == 0) {
                    cx_(telecomManager);
                    throw null;
                }
                boolValueOf = Boolean.valueOf(cx_(telecomManager));
            }
        }
        return boolValueOf != null ? DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(boolValueOf.booleanValue())) : new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ChallengeResult(Application application, PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        s.k(application, "");
        s.k(permissionChecker, "");
        this.getSDKReferenceNumber = application;
    }
}
