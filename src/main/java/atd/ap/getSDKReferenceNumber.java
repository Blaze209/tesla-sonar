package atd.ap;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.completed;
import com.adyen.threeds2.Warning;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/security/warning/RootedDeviceWarning;", "Lcom/adyen/threeds2/Warning;", "<init>", "()V", "getID", "", "getMessage", "getSeverity", "Lcom/adyen/threeds2/Warning$Severity;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber implements Warning {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final getSDKReferenceNumber AuthenticationRequestParameters;
    private static char[] getDeviceData;
    private static char getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getSDKTransactionID = 1;
        getSDKReferenceNumber();
        AuthenticationRequestParameters = new getSDKReferenceNumber();
        int i11 = getSDKTransactionID + 65;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private getSDKReferenceNumber() {
    }

    /* JADX WARN: Code duplicated, block: B:46:0x015b  */
    /* JADX WARN: Code duplicated, block: B:48:0x016e  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x01cd A[Catch: all -> 0x0346, TryCatch #0 {all -> 0x0346, blocks: (B:12:0x003a, B:16:0x008d, B:15:0x0053, B:22:0x00b1, B:26:0x00f7, B:49:0x0170, B:53:0x022c, B:56:0x023d, B:60:0x02d0, B:59:0x0279, B:52:0x01cd, B:25:0x00c2), top: B:79:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:56:0x023d A[Catch: all -> 0x0346, TRY_ENTER, TryCatch #0 {all -> 0x0346, blocks: (B:12:0x003a, B:16:0x008d, B:15:0x0053, B:22:0x00b1, B:26:0x00f7, B:49:0x0170, B:53:0x022c, B:56:0x023d, B:60:0x02d0, B:59:0x0279, B:52:0x01cd, B:25:0x00c2), top: B:79:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0278  */
    /* JADX WARN: Code duplicated, block: B:59:0x0279 A[Catch: all -> 0x0346, TryCatch #0 {all -> 0x0346, blocks: (B:12:0x003a, B:16:0x008d, B:15:0x0053, B:22:0x00b1, B:26:0x00f7, B:49:0x0170, B:53:0x022c, B:56:0x023d, B:60:0x02d0, B:59:0x0279, B:52:0x01cd, B:25:0x00c2), top: B:79:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:62:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:64:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x0315  */
    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        int i12;
        Map map;
        Object method;
        int iIntValue;
        int i13;
        int i14;
        int i15;
        Object method2;
        Object method3;
        String str2 = "";
        int i16 = $11 + 81;
        $10 = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] cArr = getDeviceData;
        Class cls = Integer.TYPE;
        int i17 = 55;
        int i18 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i19])};
                    Map map2 = getMessageVersion.timedout;
                    Object obj = map2.get(-1709775791);
                    if (obj != null) {
                        method3 = obj;
                    } else {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(2313 - TextUtils.getTrimmedLength(str2), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 24 - TextUtils.getOffsetAfter(str2, i18));
                        byte b12 = (byte) i17;
                        byte b13 = (byte) 0;
                        Object[] objArr3 = new Object[1];
                        b(b12, b13, b13, objArr3);
                        method3 = cls2.getMethod((String) objArr3[0], cls);
                        map2.put(-1709775791, method3);
                    }
                    cArr2[i19] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                    i19++;
                    str2 = str2;
                    charArray = charArray;
                    i17 = 55;
                    i18 = 0;
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
        Object[] objArr4 = {Integer.valueOf(getSDKAppID)};
        Map map3 = getMessageVersion.timedout;
        Object method4 = map3.get(-1709775791);
        if (method4 == null) {
            Class cls3 = (Class) getMessageVersion.getSDKTransactionID(View.resolveSize(0, 0) + 2313, (char) Color.blue(0), 24 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
            byte b14 = (byte) 0;
            Object[] objArr5 = new Object[1];
            b((byte) 55, b14, b14, objArr5);
            method4 = cls3.getMethod((String) objArr5[0], cls);
            map3.put(-1709775791, method4);
        }
        char cCharValue = ((Character) ((Method) method4).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            int i21 = $11 + 105;
            $10 = i21 % 128;
            if (i21 % 2 != 0) {
                i12 = i11 + 77;
                cArr4[i12] = (char) (cArr3[i12] >> b11);
            } else {
                i12 = i11 - 1;
                cArr4[i12] = (char) (cArr3[i12] - b11);
            }
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i22 = completedVar.getSDKTransactionID;
                if (i22 >= i12) {
                    break;
                }
                int i23 = $10 + 87;
                $11 = i23 % 128;
                if (i23 % 2 == 0) {
                    char c11 = cArr3[i22];
                    completedVar.getSDKAppID = c11;
                    char c12 = cArr3[i22 >> 1];
                    completedVar.getSDKReferenceNumber = c12;
                    if (c11 == c12) {
                        cArr4[i22] = (char) (completedVar.getSDKAppID - b11);
                        cArr4[i22 + 1] = (char) (completedVar.getSDKReferenceNumber - b11);
                    } else {
                        Object[] objArr6 = {completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar};
                        map = getMessageVersion.timedout;
                        method = map.get(700818725);
                        if (method != null) {
                            Class cls4 = (Class) getMessageVersion.getSDKTransactionID(1919 - Color.red(0), (char) (ViewConfiguration.getScrollBarSize() >> 8), 28 - ExpandableListView.getPackedPositionChild(0L));
                            byte b15 = (byte) 0;
                            byte b16 = b15;
                            Object[] objArr7 = new Object[1];
                            b(b15, b16, b16, objArr7);
                            String str3 = (String) objArr7[0];
                            Class cls5 = Integer.TYPE;
                            method = cls4.getMethod(str3, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                            map.put(700818725, method);
                        }
                        iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                        i13 = completedVar.getSDKEphemeralPublicKey;
                        if (iIntValue == i13) {
                            Object[] objArr8 = {completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, Integer.valueOf(cCharValue), completedVar};
                            method2 = map.get(-248084636);
                            if (method2 != null) {
                                Class cls6 = (Class) getMessageVersion.getSDKTransactionID(KeyEvent.getDeadChar(0, 0) + 1721, (char) (48634 - View.MeasureSpec.makeMeasureSpec(0, 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 24);
                                byte b17 = (byte) 0;
                                Object[] objArr9 = new Object[1];
                                b((byte) 49, b17, b17, objArr9);
                                String str4 = (String) objArr9[0];
                                Class cls7 = Integer.TYPE;
                                method2 = cls6.getMethod(str4, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                                map.put(-248084636, method2);
                            }
                            int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr8)).intValue();
                            int i24 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                            int i25 = completedVar.getSDKTransactionID;
                            cArr4[i25] = cArr[iIntValue2];
                            cArr4[i25 + 1] = cArr[i24];
                        } else {
                            i14 = completedVar.getDeviceData;
                            i15 = completedVar.AuthenticationRequestParameters;
                            if (i14 == i15) {
                                int i26 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                completedVar.getMessageVersion = i26;
                                int i27 = ((i13 + cCharValue) - 1) % cCharValue;
                                completedVar.getSDKEphemeralPublicKey = i27;
                                int i28 = (i14 * cCharValue) + i26;
                                int i29 = completedVar.getSDKTransactionID;
                                cArr4[i29] = cArr[i28];
                                cArr4[i29 + 1] = cArr[(i15 * cCharValue) + i27];
                            } else {
                                int i31 = (i15 * cCharValue) + completedVar.getMessageVersion;
                                int i32 = completedVar.getSDKTransactionID;
                                cArr4[i32] = cArr[(i14 * cCharValue) + i13];
                                cArr4[i32 + 1] = cArr[i31];
                            }
                        }
                    }
                } else {
                    char c13 = cArr3[i22];
                    completedVar.getSDKAppID = c13;
                    char c14 = cArr3[i22 + 1];
                    completedVar.getSDKReferenceNumber = c14;
                    if (c13 == c14) {
                        cArr4[i22] = (char) (completedVar.getSDKAppID - b11);
                        cArr4[i22 + 1] = (char) (completedVar.getSDKReferenceNumber - b11);
                    } else {
                        Object[] objArr10 = {completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar};
                        map = getMessageVersion.timedout;
                        method = map.get(700818725);
                        if (method != null) {
                            Class cls8 = (Class) getMessageVersion.getSDKTransactionID(1919 - Color.red(0), (char) (ViewConfiguration.getScrollBarSize() >> 8), 28 - ExpandableListView.getPackedPositionChild(0L));
                            byte b18 = (byte) 0;
                            byte b19 = b18;
                            Object[] objArr11 = new Object[1];
                            b(b18, b19, b19, objArr11);
                            String str5 = (String) objArr11[0];
                            Class cls9 = Integer.TYPE;
                            method = cls8.getMethod(str5, Object.class, Object.class, cls9, Object.class, Object.class, cls9, Object.class, Object.class, cls9, Object.class, Object.class, cls9, Object.class);
                            map.put(700818725, method);
                        }
                        iIntValue = ((Integer) ((Method) method).invoke(null, objArr10)).intValue();
                        i13 = completedVar.getSDKEphemeralPublicKey;
                        if (iIntValue == i13) {
                            Object[] objArr12 = {completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, Integer.valueOf(cCharValue), completedVar};
                            method2 = map.get(-248084636);
                            if (method2 != null) {
                                Class cls10 = (Class) getMessageVersion.getSDKTransactionID(KeyEvent.getDeadChar(0, 0) + 1721, (char) (48634 - View.MeasureSpec.makeMeasureSpec(0, 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 24);
                                byte b110 = (byte) 0;
                                Object[] objArr13 = new Object[1];
                                b((byte) 49, b110, b110, objArr13);
                                String str6 = (String) objArr13[0];
                                Class cls11 = Integer.TYPE;
                                method2 = cls10.getMethod(str6, Object.class, Object.class, cls11, cls11, Object.class, Object.class, cls11, cls11, Object.class, cls11, Object.class);
                                map.put(-248084636, method2);
                            }
                            int iIntValue3 = ((Integer) ((Method) method2).invoke(null, objArr12)).intValue();
                            int i210 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                            int i211 = completedVar.getSDKTransactionID;
                            cArr4[i211] = cArr[iIntValue3];
                            cArr4[i211 + 1] = cArr[i210];
                        } else {
                            i14 = completedVar.getDeviceData;
                            i15 = completedVar.AuthenticationRequestParameters;
                            if (i14 == i15) {
                                int i212 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                completedVar.getMessageVersion = i212;
                                int i213 = ((i13 + cCharValue) - 1) % cCharValue;
                                completedVar.getSDKEphemeralPublicKey = i213;
                                int i214 = (i14 * cCharValue) + i212;
                                int i215 = completedVar.getSDKTransactionID;
                                cArr4[i215] = cArr[i214];
                                cArr4[i215 + 1] = cArr[(i15 * cCharValue) + i213];
                            } else {
                                int i33 = (i15 * cCharValue) + completedVar.getMessageVersion;
                                int i34 = completedVar.getSDKTransactionID;
                                cArr4[i34] = cArr[(i14 * cCharValue) + i13];
                                cArr4[i34 + 1] = cArr[i33];
                            }
                        }
                    }
                }
                completedVar.getSDKTransactionID += 2;
            }
        }
        for (int i35 = 0; i35 < i11; i35++) {
            cArr4[i35] = (char) (cArr4[i35] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 122 - r6
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r1 = atd.ap.getSDKReferenceNumber.$$a
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r1
            r4 = r2
            r1 = r8
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r1
            r1 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r8
            int r8 = r1 + 1
            r1 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ap.getSDKReferenceNumber.b(short, byte, byte, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getDeviceData = new char[]{52362, 52365, 52375, 52406, 52368, 52369, 52392, 52374, 52397, 52462, 52407, 52370, 52411, 52396, 52478, 52372, 52361, 52373, 52463, 52363, 52394, 52464, 52413, 52401, 52410};
        getSDKAppID = (char) 63809;
    }

    static void init$0() {
        $$a = new byte[]{8, -110, -18, -108};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE;
    }

    @Override // com.adyen.threeds2.Warning
    public final String getID() throws Throwable {
        Object obj;
        int i11 = getSDKReferenceNumber + 45;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(5 % ExpandableListView.getPackedPositionGroup(1L), "\u0006\u0015\b\u0013", (byte) (79 % TextUtils.indexOf((CharSequence) "", '@')), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(4 - ExpandableListView.getPackedPositionGroup(0L), "\u0006\u0015\b\u0013", (byte) (54 - TextUtils.indexOf((CharSequence) "", '0')), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.adyen.threeds2.Warning
    public final String getMessage() throws Throwable {
        Object obj;
        int i11 = getSDKTransactionID + 69;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(111 - (KeyEvent.getMaxKeyCode() - 46), "\u0001\u0004\r\n\u0016\u000e\u0005\u000b\u0002\u0011\n\u000b\t\r\u0012\u0003\u0018\u0015\u000e\u0016㘝", (byte) (110 << (Process.myPid() - 72)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(21 - (KeyEvent.getMaxKeyCode() >> 16), "\u0001\u0004\r\n\u0016\u000e\u0005\u000b\u0002\u0011\n\u000b\t\r\u0012\u0003\u0018\u0015\u000e\u0016㘝", (byte) (105 - (Process.myPid() >> 22)), objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i12 = getSDKTransactionID + 111;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.Warning
    public final Warning.Severity getSeverity() {
        int i11 = getSDKTransactionID + 123;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            Warning.Severity severity = Warning.Severity.LOW;
            throw null;
        }
        Warning.Severity severity2 = Warning.Severity.HIGH;
        int i12 = getSDKReferenceNumber + 19;
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 != 0) {
            return severity2;
        }
        throw null;
    }
}
