package atd.a;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ getSDKAppID[] $VALUES;
    public static final getSDKAppID V2_1_0;
    public static final getSDKAppID V2_2_0;
    private static int getDeviceData;
    private static long getSDKAppID;
    private static int getSDKTransactionID;
    private final atd.h.getSDKAppID mDataVersion;
    private final String mVersion;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKTransactionID = 1;
        getSDKAppID();
        Object[] objArr = new Object[1];
        a("䉗捘䈁꩙멉蟿⡰\udc57曄躗", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("\uf605姍\uf637郐峖ᣍ캁䍺틹", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        atd.h.getSDKAppID getsdkappid = atd.h.getSDKAppID.V1_6;
        V2_1_0 = new getSDKAppID(strIntern, 0, strIntern2, getsdkappid);
        Object[] objArr3 = new Object[1];
        a("⮜\uea08⯊⌉\u10c6⨉苿熢༏߇", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("䔠龄䔒嚙况ﴹ栥Ꚏ懜", -TextUtils.lastIndexOf("", '0', 0, 0), objArr4);
        V2_2_0 = new getSDKAppID(strIntern3, 1, ((String) objArr4[0]).intern(), getsdkappid);
        $VALUES = AuthenticationRequestParameters();
        getSDKTransactionID = (getDeviceData + 121) % 128;
    }

    private getSDKAppID(String str, int i11, String str2, atd.h.getSDKAppID getsdkappid) {
        super(str, i11);
        this.mVersion = str2;
        this.mDataVersion = getsdkappid;
    }

    private static /* synthetic */ getSDKAppID[] AuthenticationRequestParameters() {
        int i11 = (getDeviceData + 19) % 128;
        getSDKTransactionID = i11;
        getSDKAppID[] getsdkappidArr = {V2_1_0, V2_2_0};
        int i12 = i11 + 25;
        getDeviceData = i12 % 128;
        if (i12 % 2 == 0) {
            return getsdkappidArr;
        }
        throw null;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            int i12 = $10 + 97;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        atd.az.getAdditionalDetails getadditionaldetails = new atd.az.getAdditionalDetails();
        char[] deviceData = atd.az.getAdditionalDetails.getDeviceData(getSDKAppID ^ 4326518537449951405L, charArray, i11);
        getadditionaldetails.getDeviceData = 4;
        while (true) {
            int i13 = getadditionaldetails.getDeviceData;
            if (i13 >= deviceData.length) {
                break;
            }
            $10 = ($11 + 13) % 128;
            int i14 = i13 - 4;
            getadditionaldetails.getSDKTransactionID = i14;
            try {
                Object[] objArr2 = {Long.valueOf(deviceData[i13] ^ deviceData[i13 % 4]), Long.valueOf(i14), Long.valueOf(getSDKAppID)};
                Map map = getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(TextUtils.getOffsetAfter("", 0) + 2749, (char) ((Process.myTid() >> 22) + 54838), (ViewConfiguration.getTouchSlop() >> 8) + 29);
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(1401 - ExpandableListView.getPackedPositionType(0L), (char) (Color.red(0) + 16690), 22 - View.getDefaultSize(0, 0));
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr4 = new Object[1];
                    b(b11, b12, b12, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-719904898, method2);
                }
                ((Method) method2).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        String str2 = new String(deviceData, 4, deviceData.length - 4);
        int i15 = $11 + 87;
        $10 = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    private static void b(int i11, int i12, short s11, Object[] objArr) {
        int i13 = (i11 * 2) + 101;
        int i14 = s11 * 4;
        byte[] bArr = $$a;
        int i15 = 4 - (i12 * 4);
        byte[] bArr2 = new byte[1 - i14];
        int i16 = 0 - i14;
        int i17 = -1;
        if (bArr == null) {
            i15++;
            i13 = i15 + (-i16);
        }
        while (true) {
            i17++;
            bArr2[i17] = (byte) i13;
            if (i17 == i16) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b11 = bArr[i15];
                i15++;
                i13 += -b11;
            }
        }
    }

    static void getSDKAppID() {
        getSDKAppID = 8890140018828384670L;
    }

    public static getSDKAppID getSDKReferenceNumber(String str) {
        getDeviceData = (getSDKTransactionID + 57) % 128;
        if (!TextUtils.isEmpty(str)) {
            getSDKAppID[] getsdkappidArrValues = values();
            int length = getsdkappidArrValues.length;
            getSDKTransactionID = (getDeviceData + 115) % 128;
            int i11 = 0;
            while (i11 < length) {
                getSDKAppID getsdkappid = getsdkappidArrValues[i11];
                if (getsdkappid.getSDKReferenceNumber().equals(str)) {
                    return getsdkappid;
                }
                i11++;
                getDeviceData = (getSDKTransactionID + 125) % 128;
            }
        }
        throw atd.ad.getDeviceData.MESSAGE_VERSION.getDeviceData();
    }

    public static getSDKAppID[] getSDKTransactionID() {
        getSDKTransactionID = (getDeviceData + 63) % 128;
        getSDKAppID[] getsdkappidArrValues = values();
        getSDKTransactionID = (getDeviceData + 55) % 128;
        return getsdkappidArrValues;
    }

    static void init$0() {
        $$a = new byte[]{43, -27, -101, 53};
        $$b = 111;
    }

    public static getSDKAppID valueOf(String str) {
        int i11 = getSDKTransactionID + 57;
        getDeviceData = i11 % 128;
        int i12 = i11 % 2;
        getSDKAppID getsdkappid = (getSDKAppID) Enum.valueOf(getSDKAppID.class, str);
        if (i12 != 0) {
            int i13 = 77 / 0;
        }
        int i14 = getSDKTransactionID + 101;
        getDeviceData = i14 % 128;
        if (i14 % 2 == 0) {
            return getsdkappid;
        }
        throw null;
    }

    public static getSDKAppID[] values() {
        getSDKTransactionID = (getDeviceData + 1) % 128;
        getSDKAppID[] getsdkappidArr = (getSDKAppID[]) $VALUES.clone();
        getDeviceData = (getSDKTransactionID + 13) % 128;
        return getsdkappidArr;
    }

    public final atd.h.getSDKAppID getDeviceData() {
        int i11 = getSDKTransactionID + 115;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return this.mDataVersion;
        }
        throw null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i11 = getSDKTransactionID + 97;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            getSDKReferenceNumber();
            throw null;
        }
        String sDKReferenceNumber = getSDKReferenceNumber();
        getSDKTransactionID = (getDeviceData + 7) % 128;
        return sDKReferenceNumber;
    }

    public final String getSDKReferenceNumber() {
        int i11 = getSDKTransactionID + 33;
        int i12 = i11 % 128;
        getDeviceData = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        String str = this.mVersion;
        getSDKTransactionID = (i12 + 105) % 128;
        return str;
    }
}
