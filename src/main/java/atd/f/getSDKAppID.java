package atd.f;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.AuthenticationRequestParameters;
import atd.az.getMessageVersion;
import atd.d.getDeviceData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKTransactionID = 1;
        AuthenticationRequestParameters = 1029304945;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    private static void a(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
        Object charArray;
        int i14;
        Throwable cause;
        int i15;
        Object method;
        int i16 = $10 + 81;
        $11 = i16 % 128;
        int i17 = 2;
        int i18 = 0;
        if (i16 % 2 == 0) {
            int i19 = 63 / 0;
            if (str != null) {
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
        } else if (str != null) {
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = (char[]) charArray;
        getMessageVersion getmessageversion = new getMessageVersion();
        char[] cArr2 = new char[i12];
        getmessageversion.getDeviceData = 0;
        while (true) {
            int i21 = getmessageversion.getDeviceData;
            if (i21 >= i12) {
                break;
            }
            char c11 = cArr[i21];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i11 + c11);
            cArr2[i21] = c12;
            try {
                Object[] objArr2 = new Object[i17];
                objArr2[1] = Integer.valueOf(AuthenticationRequestParameters);
                objArr2[i18] = Integer.valueOf(c12);
                Map map = atd.a.getMessageVersion.timedout;
                Object obj = map.get(139968170);
                if (obj != null) {
                    i15 = i18;
                    method = obj;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.MeasureSpec.getSize(i18) + 1186, (char) (ExpandableListView.getPackedPositionForGroup(i18) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i18) == 0L ? 0 : -1)), 46 - TextUtils.indexOf("", "", i18, i18));
                    byte b11 = (byte) i18;
                    byte b12 = b11;
                    i15 = i18;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    String str2 = (String) objArr3[i15];
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(139968170, method);
                }
                cArr2[i21] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = new Object[2];
                objArr4[1] = getmessageversion;
                objArr4[i15] = getmessageversion;
                Object method2 = map.get(-1388326022);
                if (method2 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1721, (char) (48634 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 24 - ExpandableListView.getPackedPositionType(0L));
                    int i22 = i15;
                    byte b13 = (byte) i22;
                    byte b14 = (byte) (b13 + 1);
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, (byte) (b14 - 1), objArr5);
                    method2 = cls3.getMethod((String) objArr5[i22], Object.class, Object.class);
                    map.put(-1388326022, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                cArr = cArr;
                i17 = 2;
                i18 = 0;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        if (i13 > 0) {
            getmessageversion.getSDKReferenceNumber = i13;
            char[] cArr3 = new char[i12];
            i14 = 0;
            System.arraycopy(cArr2, 0, cArr3, 0, i12);
            int i23 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr3, 0, cArr2, i12 - i23, i23);
            int i24 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr3, i24, cArr2, 0, i12 - i24);
        } else {
            i14 = 0;
        }
        if (z11) {
            char[] cArr4 = new char[i12];
            getmessageversion.getDeviceData = i14;
            while (true) {
                int i25 = getmessageversion.getDeviceData;
                if (i25 >= i12) {
                    break;
                }
                int i26 = $11 + 23;
                $10 = i26 % 128;
                if (i26 % 2 != 0) {
                    cArr4[i25] = cArr2[i12 << i25];
                    Object[] objArr6 = {getmessageversion, getmessageversion};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method3 = map2.get(-1388326022);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1721, (char) (48634 - (ViewConfiguration.getTapTimeout() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 24);
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 1);
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, (byte) (b16 - 1), objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                        map2.put(-1388326022, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
                } else {
                    cArr4[i25] = cArr2[(i12 - i25) - 1];
                    Object[] objArr8 = {getmessageversion, getmessageversion};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method4 = map3.get(-1388326022);
                    if (method4 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID((KeyEvent.getMaxKeyCode() >> 16) + 1721, (char) (48634 - TextUtils.getOffsetAfter("", 0)), 24 - Color.green(0));
                        byte b17 = (byte) 0;
                        byte b18 = (byte) (b17 + 1);
                        Object[] objArr9 = new Object[1];
                        b(b17, b18, (byte) (b18 - 1), objArr9);
                        method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                        map3.put(-1388326022, method4);
                    }
                    ((Method) method4).invoke(null, objArr8);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(byte b11, short s11, byte b12, Object[] objArr) {
        int i11 = 68 - (s11 * 2);
        byte[] bArr = $$a;
        int i12 = (b11 * 2) + 4;
        int i13 = b12 * 2;
        byte[] bArr2 = new byte[1 - i13];
        int i14 = 0 - i13;
        int i15 = -1;
        if (bArr == null) {
            i11 = i12 + i14;
            i12++;
            bArr = bArr;
            i15 = -1;
        }
        while (true) {
            int i16 = i15 + 1;
            bArr2[i16] = (byte) i11;
            if (i16 == i14) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i17 = i11;
            byte[] bArr3 = bArr;
            i11 = bArr[i12] + i17;
            i12++;
            bArr = bArr3;
            i15 = i16;
        }
    }

    public static Map<String, List<String>> getDeviceData() throws Throwable {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        getDeviceData.getSDKAppID getsdkappid = getDeviceData.getSDKAppID.APPLICATION_JSON;
        List listAsList = Arrays.asList(getsdkappid.getSDKReferenceNumber(AuthenticationRequestParameters.AuthenticationRequestParameters).AuthenticationRequestParameters());
        Object[] objArr = new Object[1];
        a(123 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), false, ImageFormat.getBitsPerPixel(0) + 13, "\f\u000b\u0011\u0002\u000b\u0011ￊ\ufff1\u0016\r\u0002￠", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), listAsList);
        List listAsList2 = Arrays.asList(getsdkappid.getSDKReferenceNumber());
        Object[] objArr2 = new Object[1];
        a(123 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), false, 5 - TextUtils.lastIndexOf("", '0', 0), "\uffdf\u0001\u0001\u0003\u000e\u0012", AndroidCharacter.getMirror('0') - '*', objArr2);
        linkedHashMap.put(((String) objArr2[0]).intern(), listAsList2);
        int i11 = getDeviceData + 123;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            return linkedHashMap;
        }
        throw null;
    }

    public static JSONObject getSDKAppID(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            getSDKTransactionID = (getDeviceData + 5) % 128;
            String next = itKeys.next();
            jSONObject3.put(next, jSONObject.get(next));
        }
        Iterator<String> itKeys2 = jSONObject2.keys();
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            jSONObject3.put(next2, jSONObject2.get(next2));
            getDeviceData = (getSDKTransactionID + 39) % 128;
        }
        return jSONObject3;
    }

    public static Map<String, List<String>> getSDKReferenceNumber() throws Throwable {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        getDeviceData.getSDKAppID getsdkappid = getDeviceData.getSDKAppID.APPLICATION_JOSE;
        List listAsList = Arrays.asList(getsdkappid.getSDKReferenceNumber(AuthenticationRequestParameters.AuthenticationRequestParameters).AuthenticationRequestParameters());
        Object[] objArr = new Object[1];
        a(124 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), false, 16777228 + Color.rgb(0, 0, 0), "\f\u000b\u0011\u0002\u000b\u0011ￊ\ufff1\u0016\r\u0002￠", 11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), listAsList);
        List listAsList2 = Arrays.asList(getsdkappid.getSDKReferenceNumber(), getDeviceData.getSDKAppID.APPLICATION_JSON.getSDKReferenceNumber());
        Object[] objArr2 = new Object[1];
        a((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 121, false, 6 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\uffdf\u0001\u0001\u0003\u000e\u0012", 6 - Color.red(0), objArr2);
        linkedHashMap.put(((String) objArr2[0]).intern(), listAsList2);
        getDeviceData = (getSDKTransactionID + 41) % 128;
        return linkedHashMap;
    }

    static void init$0() {
        $$a = new byte[]{83, -47, 56, 73};
        $$b = 193;
    }
}
