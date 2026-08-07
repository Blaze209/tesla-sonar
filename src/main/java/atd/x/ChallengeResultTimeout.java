package atd.x;

import android.app.Application;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ScreenBrightnessMode;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultTimeout extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static int getMessageVersion;
    private static char[] getSDKAppID;
    private static int getSDKReferenceNumber;
    private static boolean getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getDeviceData;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ScreenBrightnessMode$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        ChallengeResultCancelled = 0;
        getMessageVersion = 1;
        getSDKTransactionID();
        ViewConfiguration.getZoomControlsTimeout();
        new getDeviceData((byte) 0);
        int i11 = getMessageVersion + 67;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ ChallengeResultTimeout(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    private static void a(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        Class cls;
        Object method;
        String str3 = str2;
        int i12 = $10 + 7;
        $11 = i12 % 128;
        int i13 = 2;
        Object bytes = str3;
        if (i12 % 2 == 0) {
            int i14 = 3 / 0;
            if (str3 != null) {
                bytes = str3;
                bytes = str3.getBytes("ISO-8859-1");
            }
        } else if (str3 != null) {
            bytes = str3;
            bytes = str3.getBytes("ISO-8859-1");
        }
        bytes = str3;
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.az.ChallengeStatusReceiver challengeStatusReceiver = new atd.az.ChallengeStatusReceiver();
        char[] cArr2 = getSDKAppID;
        Class cls2 = Integer.TYPE;
        if (cArr2 != null) {
            int i15 = $11 + 95;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i16 = 0;
            while (i16 < length) {
                int i17 = i13;
                int i18 = $10 + 97;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i16])};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(508097192);
                        if (obj != null) {
                            cls = cls2;
                            method = obj;
                        } else {
                            cls = cls2;
                            method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(((byte) KeyEvent.getModifierMetaStateMask()) + 329, (char) (Process.myPid() >> 22), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 32)).getMethod("o", cls);
                            map.put(508097192, method);
                        }
                        cArr[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    cArr2 = cArr2;
                    cls = cls2;
                    length = length;
                    cArr = cArr;
                    Object[] objArr3 = {Integer.valueOf(cArr2[i16])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(508097192);
                    if (method2 == null) {
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getJumpTapTimeout() >> 16) + EnumC4419g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, (char) TextUtils.getOffsetAfter("", 0), TextUtils.indexOf("", "", 0, 0) + 32)).getMethod("o", cls);
                        map2.put(508097192, method2);
                    }
                    cArr[i16] = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
                    i16++;
                }
                cArr2 = cArr2;
                i13 = i17;
                length = length;
                cls2 = cls;
                cArr = cArr;
            }
            cArr2 = cArr;
        }
        int i19 = i13;
        Class cls3 = cls2;
        Object[] objArr4 = {Integer.valueOf(getSDKReferenceNumber)};
        Map map3 = atd.a.getMessageVersion.timedout;
        Object method3 = map3.get(-852383591);
        if (method3 == null) {
            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2060 - TextUtils.indexOf((CharSequence) "", '0'), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), 18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            byte b11 = (byte) 1;
            byte b12 = (byte) (b11 - 1);
            Object[] objArr5 = new Object[1];
            b(b11, b12, b12, objArr5);
            method3 = cls4.getMethod((String) objArr5[0], cls3);
            map3.put(-852383591, method3);
        }
        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr4)).intValue();
        if (AuthenticationRequestParameters) {
            int length2 = bArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length2;
            char[] cArr3 = new char[length2];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i21 = challengeStatusReceiver.getDeviceData;
                int i22 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[i21] = (char) (cArr2[bArr[(i22 - 1) - i21] + i11] - iIntValue);
                Object[] objArr6 = new Object[i19];
                objArr6[1] = challengeStatusReceiver;
                objArr6[0] = challengeStatusReceiver;
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-249860496);
                if (method4 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1108 - TextUtils.getTrimmedLength(""), (char) TextUtils.getOffsetBefore("", 0), TextUtils.indexOf("", "") + 50);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr7 = new Object[1];
                    b(b13, b14, b14, objArr7);
                    method4 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                    map4.put(-249860496, method4);
                }
                ((Method) method4).invoke(null, objArr6);
                i19 = 2;
            }
        } else if (getSDKTransactionID) {
            $10 = ($11 + 119) % 128;
            int length3 = charArray.length;
            challengeStatusReceiver.getSDKReferenceNumber = length3;
            char[] cArr4 = new char[length3];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i23 = challengeStatusReceiver.getDeviceData;
                int i24 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i23 >= i24) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i23] = (char) (cArr2[charArray[(i24 - 1) - i23] - i11] - iIntValue);
                Object[] objArr8 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map5 = atd.a.getMessageVersion.timedout;
                Object method5 = map5.get(-249860496);
                if (method5 == null) {
                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getTouchSlop() >> 8) + 1108, (char) (Process.myPid() >> 22), 49 - TextUtils.lastIndexOf("", '0', 0, 0));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr9 = new Object[1];
                    b(b15, b16, b16, objArr9);
                    method5 = cls6.getMethod((String) objArr9[0], Object.class, Object.class);
                    map5.put(-249860496, method5);
                }
                ((Method) method5).invoke(null, objArr8);
            }
        } else {
            int length4 = iArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length4;
            char[] cArr5 = new char[length4];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i25 = challengeStatusReceiver.getDeviceData;
                int i26 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i25 >= i26) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i25] = (char) (cArr2[iArr[(i26 - 1) - i25] - i11] - iIntValue);
                    challengeStatusReceiver.getDeviceData = i25 + 1;
                }
            }
        }
    }

    private static void b(byte b11, byte b12, byte b13, Object[] objArr) {
        byte[] bArr = $$a;
        int i11 = 3 - (b12 * 4);
        int i12 = 109 - (b11 * 2);
        int i13 = b13 * 4;
        byte[] bArr2 = new byte[i13 + 1];
        int i14 = -1;
        if (bArr == null) {
            int i15 = i11 + (-i13);
            i11 = i11;
            i12 = i15;
        }
        while (true) {
            int i16 = i11 + 1;
            i14++;
            bArr2[i14] = (byte) i12;
            if (i14 == i13) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i11 = i16;
            i12 += -bArr[i16];
        }
    }

    static void getSDKTransactionID() {
        getSDKAppID = new char[]{64611, 64627, 64610, 64625, 64614, 64631, 64626, 64621, 64623, 64620, 64608, 64617, 64615, 64624, 64661, 64677, 64675};
        getSDKReferenceNumber = -185467692;
        getSDKTransactionID = true;
        AuthenticationRequestParameters = true;
    }

    static void init$0() {
        $$a = new byte[]{79, 66, 87, 20};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getDeviceData;
        Object[] objArr = new Object[1];
        a(null, null, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, "\u0084\u008e\u008d\u008c\u0086\u0081\u0081\u0084\u0085\u008b\u008a\u0089\u0088\u0083\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            int i11 = getMessageVersion + 33;
            ChallengeResultCancelled = i11 % 128;
            if (i11 % 2 != 0) {
                com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
                throw null;
            }
            Boolean sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
            if (sDKReferenceNumber != null) {
                DeviceParameterResult.Success.BooleanValue booleanValueM14boximpl = DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                ChallengeResultCancelled = (getMessageVersion + 71) % 128;
                return booleanValueM14boximpl;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private ChallengeResultTimeout(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getDeviceData = authenticationRequestParameters;
    }
}
