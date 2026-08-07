package atd.g;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.af.AuthenticationRequestParameters;
import atd.az.completed;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int BuildConfig;
    private static char getDeviceData;
    private static int getSDKEphemeralPublicKey;
    private AuthenticationRequestParameters getSDKAppID;
    private AuthenticationRequestParameters getSDKReferenceNumber;
    private String getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        BuildConfig = 1;
        AuthenticationRequestParameters = new char[]{52366, 52375, 52395, 52391, 52413, 52411, 52373, 52379, 52412, 52405, 52367, 52410, 52361, 52362, 52364, 52398, 52403, 52363, 52372, 52374, 52397, 52360, 52370, 52406, 52415};
        getDeviceData = (char) 63809;
    }

    public getDeviceData(JSONObject jSONObject) throws Throwable {
        Object[] objArr = new Object[1];
        a((-16777202) - Color.rgb(0, 0, 0), "\u0004\t\u0016\u0005\u0012\u0014\u0006\u000f\u0001\u0003\t\u0007\b\u0000", (byte) (105 - View.MeasureSpec.getSize(0)), objArr);
        this.getSDKAppID = AuthenticationRequestParameters.AuthenticationRequestParameters(jSONObject.getJSONObject(((String) objArr[0]).intern()));
        Object[] objArr2 = new Object[1];
        a(14 - ExpandableListView.getPackedPositionType(0L), "\u0015\n\u0005\b\u0012\u0014\u0006\u000f\u0001\u0003\t\u0007\b\u0000", (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 35), objArr2);
        this.getSDKReferenceNumber = AuthenticationRequestParameters.AuthenticationRequestParameters(jSONObject.getJSONObject(((String) objArr2[0]).intern()));
        Object[] objArr3 = new Object[1];
        a(6 - (ViewConfiguration.getTapTimeout() >> 16), "\u0004\t\u0016\u000f\f\u0018", (byte) (89 - ImageFormat.getBitsPerPixel(0)), objArr3);
        this.getSDKTransactionID = jSONObject.getString(((String) objArr3[0]).intern());
    }

    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] cArr = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        int i14 = 55;
        int i15 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                $11 = ($10 + 115) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i16])};
                    Map map = getMessageVersion.timedout;
                    Object method = map.get(-1709775791);
                    if (method != null) {
                        i13 = i15;
                    } else {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(2314 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (Process.myTid() >> 22), View.MeasureSpec.makeMeasureSpec(i15, i15) + 24);
                        byte b12 = (byte) i15;
                        i13 = i15;
                        Object[] objArr3 = new Object[1];
                        b((byte) i14, b12, (byte) (b12 - 1), objArr3);
                        method = cls2.getMethod((String) objArr3[i13], cls);
                        map.put(-1709775791, method);
                    }
                    cArr2[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i16++;
                    i15 = i13;
                    charArray = charArray;
                    i14 = 55;
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
        int i17 = i15;
        Object[] objArr4 = {Integer.valueOf(getDeviceData)};
        Map map2 = getMessageVersion.timedout;
        Object method2 = map2.get(-1709775791);
        if (method2 == null) {
            Class cls3 = (Class) getMessageVersion.getSDKTransactionID(2314 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 24 - (Process.myTid() >> 22));
            byte b13 = (byte) i17;
            Object[] objArr5 = new Object[1];
            b((byte) 55, b13, (byte) (b13 - 1), objArr5);
            method2 = cls3.getMethod((String) objArr5[i17], cls);
            map2.put(-1709775791, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr4[i12] = (char) (cArr3[i12] - b11);
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i18 = completedVar.getSDKTransactionID;
                if (i18 >= i12) {
                    break;
                }
                $10 = ($11 + 111) % 128;
                char c11 = cArr3[i18];
                completedVar.getSDKAppID = c11;
                char c12 = cArr3[i18 + 1];
                completedVar.getSDKReferenceNumber = c12;
                if (c11 == c12) {
                    cArr4[i18] = (char) (c11 - b11);
                    cArr4[i18 + 1] = (char) (c12 - b11);
                } else {
                    Object[] objArr6 = {completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar};
                    Map map3 = getMessageVersion.timedout;
                    Object method3 = map3.get(700818725);
                    if (method3 == null) {
                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID(1919 - (Process.myTid() >> 22), (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29);
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr7 = new Object[1];
                        b(b14, b15, (byte) (b15 - 1), objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map3.put(700818725, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i19 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i19) {
                        $11 = ($10 + 107) % 128;
                        Object[] objArr8 = {completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, Integer.valueOf(cCharValue), completedVar};
                        Object method4 = map3.get(-248084636);
                        if (method4 == null) {
                            Class cls6 = (Class) getMessageVersion.getSDKTransactionID(1722 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (View.MeasureSpec.getSize(0) + 48634), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24);
                            byte b16 = (byte) 0;
                            Object[] objArr9 = new Object[1];
                            b((byte) 49, b16, (byte) (b16 - 1), objArr9);
                            String str3 = (String) objArr9[0];
                            Class cls7 = Integer.TYPE;
                            method4 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map3.put(-248084636, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i21 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i22 = completedVar.getSDKTransactionID;
                        cArr4[i22] = cArr[iIntValue2];
                        cArr4[i22 + 1] = cArr[i21];
                    } else {
                        int i23 = completedVar.getDeviceData;
                        int i24 = completedVar.AuthenticationRequestParameters;
                        if (i23 == i24) {
                            $11 = ($10 + 65) % 128;
                            int i25 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i25;
                            int i26 = ((i19 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i26;
                            int i27 = (i23 * cCharValue) + i25;
                            int i28 = completedVar.getSDKTransactionID;
                            cArr4[i28] = cArr[i27];
                            cArr4[i28 + 1] = cArr[(i24 * cCharValue) + i26];
                        } else {
                            int i29 = (i24 * cCharValue) + completedVar.getMessageVersion;
                            int i31 = completedVar.getSDKTransactionID;
                            cArr4[i31] = cArr[(i23 * cCharValue) + i19];
                            cArr4[i31 + 1] = cArr[i29];
                        }
                        completedVar.getSDKTransactionID += 2;
                    }
                }
                completedVar.getSDKTransactionID += 2;
            }
        }
        for (int i32 = 0; i32 < i11; i32++) {
            cArr4[i32] = (char) (cArr4[i32] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.g.getDeviceData.$$a
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r8 = r8 + 4
            int r6 = 122 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2d
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L2d:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.g.getDeviceData.b(int, int, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{93, 9, 92, 99};
        $$b = 94;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final void AuthenticationRequestParameters() {
        int i11 = BuildConfig + 17;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 20 / 0;
            if (this.getSDKAppID != null) {
                this.getSDKAppID.getSDKTransactionID();
                this.getSDKAppID = null;
            }
        } else if (this.getSDKAppID != null) {
            this.getSDKAppID.getSDKTransactionID();
            this.getSDKAppID = null;
        }
        AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
        if (authenticationRequestParameters != null) {
            authenticationRequestParameters.getSDKTransactionID();
            this.getSDKReferenceNumber = null;
            getSDKEphemeralPublicKey = (BuildConfig + 61) % 128;
        }
        this.getSDKTransactionID = null;
        BuildConfig = (getSDKEphemeralPublicKey + 87) % 128;
    }

    public final String getSDKAppID() {
        int i11 = getSDKEphemeralPublicKey;
        String str = this.getSDKTransactionID;
        int i12 = i11 + 89;
        BuildConfig = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 3 / 0;
        }
        return str;
    }

    public final AuthenticationRequestParameters getSDKTransactionID() {
        int i11 = getSDKEphemeralPublicKey + 5;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            return this.getSDKAppID;
        }
        throw null;
    }
}
