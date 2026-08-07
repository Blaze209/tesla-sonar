package atd.w;

import android.annotation.SuppressLint;
import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f*\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\f*\u00020\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u0002H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/LineOneNumber;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/telephony/TelephonyManager;", "", "kotlin.jvm.PlatformType", "line1Number", "(Landroid/telephony/TelephonyManager;)Ljava/lang/String;", "Landroid/telephony/SubscriptionManager;", "phoneNumber", "(Landroid/telephony/SubscriptionManager;)Ljava/lang/String;", "getSubscriptionManager", "(Landroid/app/Application;)Landroid/telephony/SubscriptionManager;", "", "isAnyRequiredPermissionGrantedForLine1Number", "()Z", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultCompleted extends InitializeResultSuccess {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static char[] getSDKTransactionID;
    private final Application getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/LineOneNumber$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        AuthenticationRequestParameters = 0;
        getDeviceData = 1;
        getSDKReferenceNumber();
        new getDeviceData((byte) 0);
        int i11 = getDeviceData + 3;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ ChallengeResultCompleted(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0199  */
    /* JADX WARN: Code duplicated, block: B:45:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x01bf A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:12:0x006b, B:16:0x00d2, B:15:0x008a, B:20:0x0101, B:24:0x014a, B:23:0x0112, B:43:0x01a5, B:47:0x01f6, B:57:0x0261, B:61:0x02be, B:60:0x027a, B:46:0x01bf, B:50:0x0209, B:54:0x024d, B:53:0x0224), top: B:86:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0223  */
    /* JADX WARN: Code duplicated, block: B:53:0x0224 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:12:0x006b, B:16:0x00d2, B:15:0x008a, B:20:0x0101, B:24:0x014a, B:23:0x0112, B:43:0x01a5, B:47:0x01f6, B:57:0x0261, B:61:0x02be, B:60:0x027a, B:46:0x01bf, B:50:0x0209, B:54:0x024d, B:53:0x0224), top: B:86:0x006b }] */
    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        int i11;
        char c11;
        Map map;
        Object method;
        Class<Object> cls;
        Map map2;
        Object method2;
        Object method3;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        Integer num = -399400818;
        $11 = ($10 + 83) % 128;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        atd.az.ChallengeResultError challengeResultError = new atd.az.ChallengeResultError();
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        char[] cArr = getSDKTransactionID;
        Class cls3 = Integer.TYPE;
        int i16 = 2;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                int i18 = i17;
                int i19 = $11 + 29;
                char[] cArr3 = cArr2;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i18])};
                        Map map3 = atd.a.getMessageVersion.timedout;
                        Object obj = map3.get(-1708792688);
                        if (obj != null) {
                            method3 = obj;
                        } else {
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2313, (char) ((-1) - MotionEvent.axisFromString("")), 24 - (KeyEvent.getMaxKeyCode() >> 16));
                            byte b11 = (byte) 0;
                            byte b12 = (byte) (b11 + 1);
                            Object[] objArr3 = new Object[1];
                            b(b11, b12, (byte) (b12 - 1), objArr3);
                            method3 = cls4.getMethod((String) objArr3[0], cls3);
                            map3.put(-1708792688, method3);
                        }
                        cArr3[i18] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                        i17 = i18 % 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    cls2 = cls2;
                    num = num;
                    length = length;
                    i14 = i14;
                    i15 = i15;
                    cArr = cArr;
                    Object[] objArr4 = {Integer.valueOf(cArr[i18])};
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method4 = map4.get(-1708792688);
                    if (method4 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.keyCodeFromString("") + 2313, (char) View.MeasureSpec.getSize(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23);
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 + 1);
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 - 1), objArr5);
                        method4 = cls5.getMethod((String) objArr5[0], cls3);
                        map4.put(-1708792688, method4);
                    }
                    cArr3[i18] = ((Character) ((Method) method4).invoke(null, objArr4)).charValue();
                    i17 = i18 + 1;
                }
                cArr2 = cArr3;
                i15 = i15;
                length = length;
                i14 = i14;
                cArr = cArr;
                cls2 = cls2;
                num = num;
            }
            cArr = cArr2;
        }
        Class<Object> cls6 = cls2;
        Integer num2 = num;
        int i21 = i14;
        int i22 = i15;
        char[] cArr4 = new char[i13];
        System.arraycopy(cArr, i12, cArr4, 0, i13);
        if (bArr != 0) {
            char[] cArr5 = new char[i13];
            challengeResultError.getSDKAppID = 0;
            $10 = ($11 + 3) % 128;
            char c12 = 0;
            while (true) {
                int i23 = challengeResultError.getSDKAppID;
                if (i23 >= i13) {
                    break;
                }
                int i24 = $11 + 55;
                $10 = i24 % 128;
                if (i24 % 2 == 0) {
                    c11 = 1;
                    if (bArr[i23] == 1) {
                        char c13 = cArr4[i23];
                        Object[] objArr6 = new Object[i16];
                        objArr6[c11] = Integer.valueOf(c12);
                        objArr6[0] = Integer.valueOf(c13);
                        map2 = atd.a.getMessageVersion.timedout;
                        method2 = map2.get(10570995);
                        if (method2 != null) {
                            Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.rgb(0, 0, 0) + 16777774, (char) (TextUtils.indexOf("", "") + 5486), 23 - TextUtils.getCapsMode("", 0, 0));
                            byte b15 = (byte) 0;
                            byte b16 = b15;
                            Object[] objArr7 = new Object[1];
                            b(b15, b16, b16, objArr7);
                            method2 = cls7.getMethod((String) objArr7[0], cls3, cls3);
                            map2.put(10570995, method2);
                        }
                        cArr5[i23] = ((Character) ((Method) method2).invoke(null, objArr6)).charValue();
                    } else {
                        cArr4 = cArr4;
                        Object[] objArr8 = {Integer.valueOf(cArr4[i23]), Integer.valueOf(c12)};
                        map = atd.a.getMessageVersion.timedout;
                        method = map.get(-502074319);
                        if (method != null) {
                            method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(201 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (Process.myPid() >> 22), View.getDefaultSize(0, 0) + 24)).getMethod("a", cls3, cls3);
                            map.put(-502074319, method);
                        }
                        cArr5[i23] = ((Character) ((Method) method).invoke(null, objArr8)).charValue();
                    }
                } else if (bArr[i23] == 0) {
                    c11 = 1;
                    char c14 = cArr4[i23];
                    Object[] objArr9 = new Object[i16];
                    objArr9[c11] = Integer.valueOf(c12);
                    objArr9[0] = Integer.valueOf(c14);
                    map2 = atd.a.getMessageVersion.timedout;
                    method2 = map2.get(10570995);
                    if (method2 != null) {
                        Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.rgb(0, 0, 0) + 16777774, (char) (TextUtils.indexOf("", "") + 5486), 23 - TextUtils.getCapsMode("", 0, 0));
                        byte b17 = (byte) 0;
                        byte b18 = b17;
                        Object[] objArr10 = new Object[1];
                        b(b17, b18, b18, objArr10);
                        method2 = cls8.getMethod((String) objArr10[0], cls3, cls3);
                        map2.put(10570995, method2);
                    }
                    cArr5[i23] = ((Character) ((Method) method2).invoke(null, objArr9)).charValue();
                } else {
                    cArr4 = cArr4;
                    Object[] objArr11 = {Integer.valueOf(cArr4[i23]), Integer.valueOf(c12)};
                    map = atd.a.getMessageVersion.timedout;
                    method = map.get(-502074319);
                    if (method != null) {
                        method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(201 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (Process.myPid() >> 22), View.getDefaultSize(0, 0) + 24)).getMethod("a", cls3, cls3);
                        map.put(-502074319, method);
                    }
                    cArr5[i23] = ((Character) ((Method) method).invoke(null, objArr11)).charValue();
                }
                c12 = cArr5[challengeResultError.getSDKAppID];
                Object[] objArr12 = {challengeResultError, challengeResultError};
                Map map5 = atd.a.getMessageVersion.timedout;
                Integer num3 = num2;
                Object method5 = map5.get(num3);
                if (method5 != null) {
                    cls = cls6;
                } else {
                    Class cls9 = (Class) atd.a.getMessageVersion.getSDKTransactionID((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 853, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), MotionEvent.axisFromString("") + 25);
                    byte b19 = (byte) 0;
                    byte b21 = (byte) (b19 + 3);
                    Object[] objArr13 = new Object[1];
                    b(b19, b21, (byte) (b21 - 3), objArr13);
                    cls = cls6;
                    method5 = cls9.getMethod((String) objArr13[0], cls, cls);
                    map5.put(num3, method5);
                }
                ((Method) method5).invoke(null, objArr12);
                num2 = num3;
                cls6 = cls;
                cArr4 = cArr4;
                cArr5 = cArr5;
                i16 = 2;
            }
            cArr4 = cArr5;
        }
        if (i22 > 0) {
            char[] cArr6 = new char[i13];
            i11 = 0;
            System.arraycopy(cArr4, 0, cArr6, 0, i13);
            int i25 = i13 - i22;
            System.arraycopy(cArr6, 0, cArr4, i25, i22);
            System.arraycopy(cArr6, i22, cArr4, 0, i25);
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr7 = new char[i13];
            challengeResultError.getSDKAppID = i11;
            while (true) {
                int i26 = challengeResultError.getSDKAppID;
                if (i26 >= i13) {
                    break;
                }
                cArr7[i26] = cArr4[(i13 - i26) - 1];
                challengeResultError.getSDKAppID = i26 + 1;
            }
            cArr4 = cArr7;
        }
        if (i21 > 0) {
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i27 = challengeResultError.getSDKAppID;
                if (i27 >= i13) {
                    break;
                }
                cArr4[i27] = (char) (cArr4[i27] - iArr[2]);
                challengeResultError.getSDKAppID = i27 + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r0 = atd.w.ChallengeResultCompleted.$$a
            int r7 = r7 * 2
            int r7 = r7 + 98
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.w.ChallengeResultCompleted.b(short, short, byte, java.lang.Object[]):void");
    }

    private static SubscriptionManager cA_(Application application) throws Throwable {
        AuthenticationRequestParameters = (getDeviceData + 47) % 128;
        Object[] objArr = new Object[1];
        a("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000", new int[]{0, 30, 0, 15}, false, objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        if (!(systemService instanceof SubscriptionManager)) {
            return null;
        }
        SubscriptionManager subscriptionManager = (SubscriptionManager) systemService;
        getDeviceData = (AuthenticationRequestParameters + 49) % 128;
        return subscriptionManager;
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private static String cy_(TelephonyManager telephonyManager) {
        AuthenticationRequestParameters = (getDeviceData + 17) % 128;
        String line1Number = telephonyManager.getLine1Number();
        getDeviceData = (AuthenticationRequestParameters + 23) % 128;
        return line1Number;
    }

    @SuppressLint({"MissingPermission"})
    private final String cz_(SubscriptionManager subscriptionManager) {
        getDeviceData = (AuthenticationRequestParameters + 63) % 128;
        TelephonyManager telephonyManagerCF_ = cF_();
        if (telephonyManagerCF_ == null) {
            return null;
        }
        int i11 = AuthenticationRequestParameters + 89;
        getDeviceData = i11 % 128;
        int i12 = i11 % 2;
        int subscriptionId = telephonyManagerCF_.getSubscriptionId();
        if (i12 == 0) {
            subscriptionManager.getPhoneNumber(subscriptionId);
            throw null;
        }
        String phoneNumber = subscriptionManager.getPhoneNumber(subscriptionId);
        AuthenticationRequestParameters = (getDeviceData + 117) % 128;
        return phoneNumber;
    }

    public static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr, int i11, int i12, int i13) {
        return getSDKReferenceNumber(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    private final boolean getSDKTransactionID() {
        if (Build.VERSION.SDK_INT <= 29) {
            int i11 = getDeviceData + 105;
            AuthenticationRequestParameters = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 3 / 0;
                if (!BuildConfig()) {
                    if (!ChallengeResult() && !((Boolean) InitializeResultSuccess.getDeviceData(new Object[]{this}, -1158112426, 1158112426, System.identityHashCode(this))).booleanValue()) {
                        return false;
                    }
                }
            } else if (!BuildConfig()) {
                if (!ChallengeResult()) {
                    return false;
                }
            }
        } else if (!ChallengeResult()) {
            return false;
        }
        AuthenticationRequestParameters = (getDeviceData + 29) % 128;
        return true;
    }

    static void init$0() {
        $$a = new byte[]{123, 104, 101, 70};
        $$b = 34;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        return (DeviceParameterResult) getSDKReferenceNumber(new Object[]{this}, 857761480, -857761480, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009d A[PHI: r5
      0x009d: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v13 java.lang.String) binds: [B:34:0x009b, B:31:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) throws Throwable {
        String strCz_;
        ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[0];
        if (Build.VERSION.SDK_INT < 33) {
            if (!challengeResultCompleted.getSDKTransactionID()) {
                AuthenticationRequestParameters = (getDeviceData + 75) % 128;
                if (!challengeResultCompleted.getMessageVersion()) {
                    return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
                }
            }
            TelephonyManager telephonyManagerCF_ = challengeResultCompleted.cF_();
            if (telephonyManagerCF_ != null) {
                AuthenticationRequestParameters = (getDeviceData + 35) % 128;
                String strCy_ = cy_(telephonyManagerCF_);
                if (strCy_ != null) {
                    return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(strCy_));
                }
            }
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        if (!challengeResultCompleted.ChallengeResultCompleted() && !((Boolean) InitializeResultSuccess.getDeviceData(new Object[]{challengeResultCompleted}, -1158112426, 1158112426, System.identityHashCode(challengeResultCompleted))).booleanValue() && !challengeResultCompleted.getMessageVersion()) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        SubscriptionManager subscriptionManagerCA_ = cA_(challengeResultCompleted.getSDKReferenceNumber);
        if (subscriptionManagerCA_ != null) {
            int i11 = getDeviceData + 105;
            AuthenticationRequestParameters = i11 % 128;
            if (i11 % 2 != 0) {
                strCz_ = challengeResultCompleted.cz_(subscriptionManagerCA_);
                int i12 = 6 / 0;
                if (strCz_ != null) {
                    if (strCz_.length() <= 0) {
                        getDeviceData = (AuthenticationRequestParameters + 35) % 128;
                        strCz_ = null;
                    }
                    if (strCz_ != null) {
                        AuthenticationRequestParameters = (getDeviceData + 37) % 128;
                        return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(strCz_));
                    }
                }
            } else {
                strCz_ = challengeResultCompleted.cz_(subscriptionManagerCA_);
                if (strCz_ != null) {
                    if (strCz_.length() <= 0) {
                        getDeviceData = (AuthenticationRequestParameters + 35) % 128;
                        strCz_ = null;
                    }
                    if (strCz_ != null) {
                        AuthenticationRequestParameters = (getDeviceData + 37) % 128;
                        return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(strCz_));
                    }
                }
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ChallengeResultCompleted(Application application, PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        s.k(application, "");
        s.k(permissionChecker, "");
        this.getSDKReferenceNumber = application;
    }

    static void getSDKReferenceNumber() {
        getSDKTransactionID = new char[]{30727, 30803, 30802, 30796, 30800, 30802, 30800, 30808, 30807, 30802, 30805, 30794, 30801, 30808, 30810, 30802, 30802, 30806, 30806, 30804, 30802, 30805, 30800, 30797, 30802, 30807, 30794, 30805, 30804, 30805, 30805, 30954, 30956, 30948};
    }
}
