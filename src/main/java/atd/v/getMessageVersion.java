package atd.v;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.CoreConstants;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/EnabledInputMethods;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getMessageVersion extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static char[] getSDKAppID;
    private static char getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters AuthenticationRequestParameters;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/EnabledInputMethods$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getSDKTransactionID = 0;
        getDeviceData = 1;
        AuthenticationRequestParameters();
        ExpandableListView.getPackedPositionForGroup(0);
        Process.myTid();
        new AuthenticationRequestParameters((byte) 0);
        getSDKTransactionID = (getDeviceData + 83) % 128;
    }

    public /* synthetic */ getMessageVersion(Application application) {
        this(application, new atd.q.getDeviceData(application));
    }

    static void AuthenticationRequestParameters() {
        getSDKAppID = new char[]{52406, 52353, 52462, 52411, 52400, 52410, 52397, 52415, 52408, 53060, 52458, 52412, 52414, 52401, 52403, 52409, 52407, 52413, 52457, 52394, 52398, 52383, 52402, 52395, 53061};
        getSDKReferenceNumber = (char) 63809;
    }

    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        int i12;
        Object method;
        Class cls;
        Object method2;
        $11 = ($10 + 105) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.az.completed completedVar = new atd.az.completed();
        char[] cArr = getSDKAppID;
        Class cls2 = Integer.TYPE;
        char c11 = '0';
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
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2313, (char) (TextUtils.indexOf("", c11, i13, i13) + 1), 24 - (Process.myPid() >> 22));
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
                    charArray = charArray;
                    cArr = cArr;
                    cls2 = cls;
                    c11 = '0';
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
        Object[] objArr4 = {Integer.valueOf(getSDKReferenceNumber)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method3 = map2.get(-1709775791);
        if (method3 == null) {
            Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Process.getGidForName("") + 2314, (char) KeyEvent.getDeadChar(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25);
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
            $10 = ($11 + 115) % 128;
            i12 = i11 - 1;
            cArr4[i12] = (char) (cArr3[i12] - b11);
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i15 = completedVar.getSDKTransactionID;
                if (i15 >= i12) {
                    break;
                }
                char c12 = cArr3[i15];
                completedVar.getSDKAppID = c12;
                char c13 = cArr3[i15 + 1];
                completedVar.getSDKReferenceNumber = c13;
                if (c12 == c13) {
                    int i16 = $11 + 9;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        cArr4[i15] = (char) (c12 - b11);
                        cArr4[i15 / 0] = (char) (c13 + b11);
                    } else {
                        cArr4[i15] = (char) (c12 - b11);
                        cArr4[i15 + 1] = (char) (c13 - b11);
                    }
                } else {
                    Object[] objArr6 = {completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object obj2 = map3.get(700818725);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1918 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) Color.green(0), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        byte b16 = (byte) 0;
                        Object[] objArr7 = new Object[1];
                        b((byte) 55, b16, b16, objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls7 = Integer.TYPE;
                        method = cls6.getMethod(str2, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class);
                        map3.put(700818725, method);
                    }
                    int iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    int i17 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i17) {
                        $11 = ($10 + 41) % 128;
                        Object[] objArr8 = {completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, Integer.valueOf(cCharValue), completedVar};
                        Object method4 = map3.get(-248084636);
                        if (method4 == null) {
                            Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1721 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 48634), (Process.myTid() >> 22) + 24);
                            byte b17 = (byte) 0;
                            Object[] objArr9 = new Object[1];
                            b((byte) 6, b17, b17, objArr9);
                            String str3 = (String) objArr9[0];
                            Class cls9 = Integer.TYPE;
                            method4 = cls8.getMethod(str3, Object.class, Object.class, cls9, cls9, Object.class, Object.class, cls9, cls9, Object.class, cls9, Object.class);
                            map3.put(-248084636, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i18 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i19 = completedVar.getSDKTransactionID;
                        cArr4[i19] = cArr[iIntValue2];
                        cArr4[i19 + 1] = cArr[i18];
                    } else {
                        int i21 = completedVar.getDeviceData;
                        int i22 = completedVar.AuthenticationRequestParameters;
                        if (i21 == i22) {
                            int i23 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i23;
                            int i24 = ((i17 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i24;
                            int i25 = (i22 * cCharValue) + i24;
                            int i26 = completedVar.getSDKTransactionID;
                            cArr4[i26] = cArr[(i21 * cCharValue) + i23];
                            cArr4[i26 + 1] = cArr[i25];
                        } else {
                            int i27 = (i21 * cCharValue) + i17;
                            int i28 = (i22 * cCharValue) + completedVar.getMessageVersion;
                            int i29 = completedVar.getSDKTransactionID;
                            cArr4[i29] = cArr[i27];
                            cArr4[i29 + 1] = cArr[i28];
                        }
                        completedVar.getSDKTransactionID += 2;
                    }
                }
                completedVar.getSDKTransactionID += 2;
            }
        }
        $11 = ($10 + 19) % 128;
        for (int i31 = 0; i31 < i11; i31++) {
            cArr4[i31] = (char) (cArr4[i31] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static void b(byte b11, int i11, int i12, Object[] objArr) {
        int i13 = 3 - (i12 * 2);
        int i14 = i11 * 3;
        int i15 = b11 + 67;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i14 + 1];
        int i16 = -1;
        if (bArr == null) {
            i15 += -i14;
        }
        while (true) {
            i16++;
            bArr2[i16] = (byte) i15;
            i13++;
            if (i16 == i14) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i15 += -bArr[i13];
        }
    }

    static void init$0() {
        $$a = new byte[]{82, 42, -92, 24};
        $$b = 74;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        List listE1;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
        Object[] objArr = new Object[1];
        a(21 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0004\u0000\u0006\f\u0017\u0002\u0006\u0000\u0013\u0001\u0015\u0018\u0010\u0004\r\u0004\u000f\u0004\n\b㗯", (byte) (6 - KeyEvent.getDeadChar(0, 0)), objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID == null || (listE1 = t.e1(sDKTransactionID, new char[]{CoreConstants.COLON_CHAR}, false, 0, 6, null)) == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE1) {
            if (t.y0((String) obj)) {
                getSDKTransactionID = (getDeviceData + 47) % 128;
            } else {
                int i11 = getDeviceData + 11;
                int i12 = i11 % 128;
                getSDKTransactionID = i12;
                if (i11 % 2 == 0) {
                    getDeviceData = (i12 + 97) % 128;
                    arrayList.add(obj);
                }
            }
        }
        return DeviceParameterResult.Success.StringsListValue.m56boximpl(DeviceParameterResult.Success.StringsListValue.m57constructorimpl(arrayList));
    }

    private getMessageVersion(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.AuthenticationRequestParameters = authenticationRequestParameters;
    }
}
