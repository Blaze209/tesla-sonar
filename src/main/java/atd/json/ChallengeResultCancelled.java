package atd.json;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import atd.az.getMessageVersion;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Random;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResultCancelled {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKReferenceNumber = 1;
        AuthenticationRequestParameters();
        Process.getElapsedCpuTime();
        Gravity.getAbsoluteGravity(0, 0);
        Color.rgb(0, 0, 0);
        getSDKAppID = (getSDKReferenceNumber + 1) % 128;
    }

    static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = 1029305045;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0195  */
    /* JADX WARN: Code duplicated, block: B:43:0x0196  */
    private static void a(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
        int i14;
        char[] cArr;
        Throwable cause;
        int i15;
        String str2 = "";
        char[] charArray = str != null ? str.toCharArray() : str;
        getMessageVersion getmessageversion = new getMessageVersion();
        char[] cArr2 = new char[i12];
        int i16 = 0;
        getmessageversion.getDeviceData = 0;
        while (true) {
            int i17 = getmessageversion.getDeviceData;
            if (i17 >= i12) {
                break;
            }
            char c11 = charArray[i17];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i11 + c11);
            cArr2[i17] = c12;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(AuthenticationRequestParameters);
                objArr2[i16] = Integer.valueOf(c12);
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(139968170);
                if (method != null) {
                    i15 = i16;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(1187 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) View.combineMeasuredStates(i16, i16), 46 - TextUtils.indexOf(str2, str2, i16, i16));
                    byte b11 = (byte) i16;
                    byte b12 = (byte) (b11 + 1);
                    i15 = i16;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, (byte) (b12 - 1), objArr3);
                    String str3 = (String) objArr3[i15];
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod(str3, cls2, cls2);
                    map.put(139968170, method);
                }
                cArr2[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = new Object[2];
                objArr4[1] = getmessageversion;
                objArr4[i15] = getmessageversion;
                Object method2 = map.get(-1388326022);
                if (method2 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1722 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 48634), (ViewConfiguration.getLongPressTimeout() >> 16) + 24);
                    int i18 = i15;
                    byte b13 = (byte) i18;
                    byte b14 = b13;
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, b14, objArr5);
                    method2 = cls3.getMethod((String) objArr5[i18], Object.class, Object.class);
                    map.put(-1388326022, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                str2 = str2;
                charArray = charArray;
                i16 = 0;
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
            System.arraycopy(cArr2, 0, cArr3, 0, i12);
            int i19 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr3, 0, cArr2, i12 - i19, i19);
            int i21 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr3, i21, cArr2, 0, i12 - i21);
        }
        if (z11) {
            int i22 = $10 + 3;
            $11 = i22 % 128;
            if (i22 % 2 == 0) {
                cArr = new char[i12];
                i14 = 0;
            } else {
                i14 = 0;
                cArr = new char[i12];
            }
            getmessageversion.getDeviceData = i14;
            while (true) {
                int i23 = getmessageversion.getDeviceData;
                if (i23 >= i12) {
                    break;
                }
                cArr[i23] = cArr2[(i12 - i23) - 1];
                Object[] objArr6 = {getmessageversion, getmessageversion};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-1388326022);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1721 - Color.red(0), (char) (Color.rgb(0, 0, 0) + 16825850), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1388326022, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            cArr2 = cArr;
        }
        String str4 = new String(cArr2);
        $10 = ($11 + 11) % 128;
        objArr[0] = str4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = atd.json.ChallengeResultCancelled.$$a
            int r5 = r5 * 2
            int r1 = 1 - r5
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r6 = r6 * 2
            int r6 = r6 + 66
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L19
            r4 = r5
            r6 = r7
            r3 = r2
            goto L2e
        L19:
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r2
        L1d:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L2a
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2e:
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.json.ChallengeResultCancelled.b(short, int, short, java.lang.Object[]):void");
    }

    private static byte[] getDeviceData(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        int i11 = 0;
        while (i11 < bArr.length) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 % bArr2.length]);
            i11++;
            getSDKReferenceNumber = (getSDKAppID + 67) % 128;
        }
        getSDKAppID = (getSDKReferenceNumber + 71) % 128;
        return bArr3;
    }

    public static String getSDKAppID(String str) throws Throwable {
        getDeviceData getdevicedata = (getDeviceData) getDeviceData.getSDKTransactionID(new Object[0], 76032564, -76032563, (int) System.currentTimeMillis());
        byte[] bytes = str.getBytes(getdevicedata.getSDKReferenceNumber());
        byte[] sDKTransactionID = getSDKTransactionID(bytes.length);
        byte[] deviceData = getDeviceData(bytes, sDKTransactionID);
        String sDKTransactionID2 = getdevicedata.getSDKTransactionID(sDKTransactionID);
        String sDKTransactionID3 = getdevicedata.getSDKTransactionID(deviceData);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sDKTransactionID2);
        Object[] objArr = new Object[1];
        a(253 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), false, 1 - TextUtils.getOffsetBefore("", 0), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, -Process.getGidForName(""), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(sDKTransactionID3);
        String sDKTransactionID4 = getdevicedata.getSDKTransactionID(sb2.toString());
        getSDKReferenceNumber = (getSDKAppID + 37) % 128;
        return sDKTransactionID4;
    }

    public static String getSDKReferenceNumber(String str) throws Throwable {
        getDeviceData getdevicedata = (getDeviceData) getDeviceData.getSDKTransactionID(new Object[0], 76032564, -76032563, (int) System.currentTimeMillis());
        Charset sDKReferenceNumber = getdevicedata.getSDKReferenceNumber();
        String sDKReferenceNumber2 = getdevicedata.getSDKReferenceNumber(str);
        Object[] objArr = new Object[1];
        a(ImageFormat.getBitsPerPixel(0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, false, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - TextUtils.getOffsetBefore("", 0), objArr);
        String[] strArrSplit = sDKReferenceNumber2.split(((String) objArr[0]).intern());
        String str2 = new String(getDeviceData(getdevicedata.getSDKReferenceNumber(strArrSplit[0]).getBytes(sDKReferenceNumber), getdevicedata.getSDKReferenceNumber(strArrSplit[1]).getBytes(sDKReferenceNumber)), sDKReferenceNumber);
        getSDKAppID = (getSDKReferenceNumber + 29) % 128;
        return str2;
    }

    private static byte[] getSDKTransactionID(int i11) {
        byte[] bArr = new byte[i11];
        new Random(System.currentTimeMillis()).nextBytes(bArr);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = getSDKAppID + 87;
            getSDKReferenceNumber = i13 % 128;
            if (i13 % 2 == 0) {
                bArr[i12] = (byte) (Math.abs((int) bArr[i12]) - 110);
                i12 += 36;
            } else {
                bArr[i12] = (byte) (Math.abs((int) bArr[i12]) % 127);
                i12++;
            }
        }
        return bArr;
    }

    static void init$0() {
        $$a = new byte[]{75, 126, 55, 101};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE;
    }
}
