package atd.b;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.az.completed;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getSDKReferenceNumber<T> implements atd.f.getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static int $10;
    private static int $11;
    private static char[] getDeviceData;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static char getSDKTransactionID;
    private String AuthenticationRequestParameters;
    private T getSDKAppID;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getSDKReferenceNumber = 0;
        getSDKEphemeralPublicKey = 1;
        getDeviceData = new char[]{52397, 52396, 53060, 52381, 52410, 52399, 52465, 52463, 52415, 52409, 52395, 52391, 52464, 53063, 52402, 52392, 52414, 53061, 52413, 52398, 52400, 52378, 52376, 53062, 52406, 52403, 52412, 52408, 52407, 52393, 52411, 52404, 52405, 52401, 52394, 52353};
        getSDKTransactionID = (char) 63810;
    }

    public getSDKReferenceNumber(String str, T t11) {
        this.AuthenticationRequestParameters = str;
        this.getSDKAppID = t11;
    }

    private static void e(byte b11, int i11, String str, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14;
        Object method;
        String str2 = "";
        int i15 = 11;
        char c11 = 2;
        int i16 = 0;
        if (str != null) {
            int i17 = $10 + 11;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                charArray = str.toCharArray();
                int i18 = 1 / 0;
            } else {
                charArray = str.toCharArray();
            }
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        completed completedVar = new completed();
        char[] cArr2 = getDeviceData;
        Class cls = Integer.TYPE;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i19])};
                    char c12 = c11;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1709775791);
                    if (obj != null) {
                        i14 = i16;
                        method = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((Process.myTid() >> 22) + 2313, (char) Color.green(i16), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
                        byte b12 = (byte) i16;
                        byte b13 = b12;
                        i14 = i16;
                        Object[] objArr3 = new Object[1];
                        g(b12, b13, b13, objArr3);
                        method = cls2.getMethod((String) objArr3[i14], cls);
                        map.put(-1709775791, method);
                    }
                    cArr3[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i19++;
                    $10 = ($11 + 107) % 128;
                    c11 = c12;
                    i15 = i15;
                    i16 = i14;
                    str2 = str2;
                    cArr = cArr;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        String str3 = str2;
        int i21 = i15;
        char c13 = c11;
        int i22 = i16;
        char[] cArr4 = cArr;
        Object[] objArr4 = {Integer.valueOf(getSDKTransactionID)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method2 = map2.get(-1709775791);
        if (method2 == null) {
            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - KeyEvent.keyCodeFromString(str3), (char) View.resolveSize(i22, i22), 24 - TextUtils.getTrimmedLength(str3));
            byte b14 = (byte) i22;
            byte b15 = b14;
            Object[] objArr5 = new Object[1];
            g(b14, b15, b15, objArr5);
            method2 = cls3.getMethod((String) objArr5[i22], cls);
            map2.put(-1709775791, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i11];
        if (i11 % 2 != 0) {
            int i23 = $10 + 45;
            $11 = i23 % 128;
            if (i23 % 2 == 0) {
                i12 = i11 + 53;
                cArr5[i12] = (char) (cArr4[i12] << b11);
            } else {
                i12 = i11 - 1;
                cArr5[i12] = (char) (cArr4[i12] - b11);
            }
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            $11 = ($10 + 125) % 128;
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i24 = completedVar.getSDKTransactionID;
                if (i24 >= i12) {
                    break;
                }
                char c14 = cArr4[i24];
                completedVar.getSDKAppID = c14;
                char c15 = cArr4[i24 + 1];
                completedVar.getSDKReferenceNumber = c15;
                if (c14 == c15) {
                    $10 = ($11 + 1) % 128;
                    cArr5[i24] = (char) (c14 - b11);
                    cArr5[i24 + 1] = (char) (c15 - b11);
                    i13 = i21;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = completedVar;
                    objArr6[i21] = Integer.valueOf(cCharValue);
                    objArr6[10] = completedVar;
                    objArr6[9] = completedVar;
                    objArr6[8] = Integer.valueOf(cCharValue);
                    objArr6[7] = completedVar;
                    objArr6[6] = completedVar;
                    objArr6[5] = Integer.valueOf(cCharValue);
                    objArr6[4] = completedVar;
                    objArr6[3] = completedVar;
                    objArr6[c13] = Integer.valueOf(cCharValue);
                    objArr6[1] = completedVar;
                    objArr6[0] = completedVar;
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(700818725);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.rgb(0, 0, 0) + 16779135, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 29 - (ViewConfiguration.getScrollBarSize() >> 8));
                        byte b16 = (byte) 0;
                        byte b17 = b16;
                        Object[] objArr7 = new Object[1];
                        g(b16, b17, (byte) (b17 | 55), objArr7);
                        String str4 = (String) objArr7[0];
                        Class cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str4, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map3.put(700818725, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i25 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i25) {
                        $10 = ($11 + 97) % 128;
                        i13 = i21;
                        Object[] objArr8 = new Object[i13];
                        objArr8[10] = completedVar;
                        objArr8[9] = Integer.valueOf(cCharValue);
                        objArr8[8] = completedVar;
                        objArr8[7] = Integer.valueOf(cCharValue);
                        objArr8[6] = Integer.valueOf(cCharValue);
                        objArr8[5] = completedVar;
                        objArr8[4] = completedVar;
                        objArr8[3] = Integer.valueOf(cCharValue);
                        objArr8[c13] = Integer.valueOf(cCharValue);
                        objArr8[1] = completedVar;
                        objArr8[0] = completedVar;
                        Object method4 = map3.get(-248084636);
                        if (method4 == null) {
                            Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1721 - View.getDefaultSize(0, 0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 48634), (ViewConfiguration.getLongPressTimeout() >> 16) + 24);
                            byte b18 = (byte) 0;
                            byte b19 = b18;
                            Object[] objArr9 = new Object[1];
                            g(b18, b19, (byte) (b19 | 6), objArr9);
                            String str5 = (String) objArr9[0];
                            Class cls7 = Integer.TYPE;
                            method4 = cls6.getMethod(str5, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map3.put(-248084636, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i26 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i27 = completedVar.getSDKTransactionID;
                        cArr5[i27] = cArr2[iIntValue2];
                        cArr5[i27 + 1] = cArr2[i26];
                    } else {
                        i13 = i21;
                        int i28 = completedVar.getDeviceData;
                        int i29 = completedVar.AuthenticationRequestParameters;
                        if (i28 == i29) {
                            $10 = ($11 + 53) % 128;
                            int i31 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i31;
                            int i32 = ((i25 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i32;
                            int i33 = (i29 * cCharValue) + i32;
                            int i34 = completedVar.getSDKTransactionID;
                            cArr5[i34] = cArr2[(i28 * cCharValue) + i31];
                            cArr5[i34 + 1] = cArr2[i33];
                        } else {
                            int i35 = (i28 * cCharValue) + i25;
                            int i36 = (i29 * cCharValue) + completedVar.getMessageVersion;
                            int i37 = completedVar.getSDKTransactionID;
                            cArr5[i37] = cArr2[i35];
                            cArr5[i37 + 1] = cArr2[i36];
                        }
                        completedVar.getSDKTransactionID += 2;
                        i21 = i13;
                    }
                }
                completedVar.getSDKTransactionID += 2;
                i21 = i13;
            }
        }
        for (int i38 = 0; i38 < i11; i38++) {
            $11 = ($10 + 83) % 128;
            cArr5[i38] = (char) (cArr5[i38] ^ 13722);
        }
        objArr[0] = new String(cArr5);
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
    private static void f(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 20
            int r5 = 24 - r5
            int r6 = r6 * 2
            int r6 = 105 - r6
            byte[] r0 = atd.b.getSDKReferenceNumber.$$a
            int r7 = r7 * 18
            int r1 = 21 - r7
            byte[] r1 = new byte[r1]
            int r7 = 20 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r6 = r5
            r4 = r7
            r3 = r2
            goto L2e
        L19:
            r3 = r6
            r6 = r5
            r5 = r3
            r3 = r2
        L1d:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L2a
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2e:
            int r5 = r5 + r4
            int r5 = r5 + 3
            int r6 = r6 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.getSDKReferenceNumber.f(short, short, int, java.lang.Object[]):void");
    }

    private static void g(int i11, short s11, int i12, Object[] objArr) {
        int i13 = (s11 * 2) + 4;
        byte[] bArr = $$j;
        int i14 = i11 * 2;
        int i15 = i12 + 67;
        byte[] bArr2 = new byte[i14 + 1];
        int i16 = -1;
        if (bArr == null) {
            i15 = (-i13) + i14;
            i13++;
            bArr = bArr;
            i16 = -1;
        }
        while (true) {
            int i17 = i16 + 1;
            bArr2[i17] = (byte) i15;
            if (i17 == i14) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i18 = i15;
            byte[] bArr3 = bArr;
            i15 = (-bArr[i13]) + i18;
            i13++;
            bArr = bArr3;
            i16 = i17;
        }
    }

    static void init$0() {
        $$a = new byte[]{81, -98, -48, -128, -5, 12, -36, -18, 4, 4, Tnaf.POW_2_WIDTH, -2, -4, 10, -16, 6, -14, -1, -26, 36, -11, -14, 0, 10, 2, -24};
        $$b = 21;
    }

    static void init$1() {
        $$j = new byte[]{82, 42, -92, 24};
        $$k = 74;
    }

    protected final String AuthenticationRequestParameters() {
        int i11 = getSDKEphemeralPublicKey;
        String str = this.AuthenticationRequestParameters;
        int i12 = i11 + 21;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // atd.f.getSDKReferenceNumber
    public JSONObject getSDKAppID() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (getSDKReferenceNumber(getSDKReferenceNumber())) {
            getSDKReferenceNumber = (getSDKEphemeralPublicKey + 79) % 128;
            jSONObject.put(AuthenticationRequestParameters(), getSDKReferenceNumber());
        }
        int i11 = getSDKReferenceNumber + 59;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            return jSONObject;
        }
        throw null;
    }

    protected final T getSDKReferenceNumber() {
        int i11 = getSDKEphemeralPublicKey;
        T t11 = this.getSDKAppID;
        getSDKReferenceNumber = (i11 + 19) % 128;
        return t11;
    }

    abstract boolean getSDKReferenceNumber(T t11);

    public void getSDKTransactionID() {
        int i11 = getSDKReferenceNumber;
        this.AuthenticationRequestParameters = null;
        this.getSDKAppID = null;
        getSDKEphemeralPublicKey = (i11 + 1) % 128;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] AuthenticationRequestParameters(int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 2171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.getSDKReferenceNumber.AuthenticationRequestParameters(int, int):java.lang.Object[]");
    }
}
