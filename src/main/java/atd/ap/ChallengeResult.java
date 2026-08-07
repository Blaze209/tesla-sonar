package atd.ap;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/security/warning/UnsecuredDeviceWarning;", "Lcom/adyen/threeds2/internal/security/warning/AppWarning;", "<init>", "()V", "getID", "", "getMessage", "getSeverity", "Lcom/adyen/threeds2/Warning$Severity;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResult implements getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final ChallengeResult AuthenticationRequestParameters;
    private static int getDeviceData;
    private static char getSDKAppID;
    private static char[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKTransactionID = 1;
        getSDKTransactionID();
        AuthenticationRequestParameters = new ChallengeResult();
        int i11 = getSDKTransactionID + 49;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private ChallengeResult() {
    }

    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        Object method;
        Class cls;
        Object method2;
        char c11 = 2;
        if (str != null) {
            int i13 = $11 + 109;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        completed completedVar = new completed();
        char[] cArr2 = getSDKReferenceNumber;
        Class cls2 = Integer.TYPE;
        int i14 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                char c12 = c11;
                $10 = ($11 + 21) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i15])};
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(-1709775791);
                    if (obj != null) {
                        cls = cls2;
                        method2 = obj;
                    } else {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID(2312 - TextUtils.lastIndexOf("", '0', i14, i14), (char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        cls = cls2;
                        Object[] objArr3 = new Object[1];
                        b(b12, b13, b13, objArr3);
                        method2 = cls3.getMethod((String) objArr3[0], cls);
                        map.put(-1709775791, method2);
                    }
                    cArr3[i15] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    i15++;
                    c11 = c12;
                    cArr2 = cArr2;
                    cArr = cArr;
                    cls2 = cls;
                    length = length;
                    i14 = 0;
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
        char c13 = c11;
        char[] cArr4 = cArr;
        Class cls4 = cls2;
        Object[] objArr4 = {Integer.valueOf(getSDKAppID)};
        Map map2 = getMessageVersion.timedout;
        Object method3 = map2.get(-1709775791);
        if (method3 == null) {
            Class cls5 = (Class) getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) KeyEvent.keyCodeFromString(""), (KeyEvent.getMaxKeyCode() >> 16) + 24);
            byte b14 = (byte) 0;
            byte b15 = b14;
            Object[] objArr5 = new Object[1];
            b(b14, b15, b15, objArr5);
            method3 = cls5.getMethod((String) objArr5[0], cls4);
            map2.put(-1709775791, method3);
        }
        char cCharValue = ((Character) ((Method) method3).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i11];
        if (i11 % 2 != 0) {
            int i16 = $11 + 65;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                i12 = i11 + 54;
                cArr5[i12] = (char) (cArr4[i12] + b11);
            } else {
                i12 = i11 - 1;
                cArr5[i12] = (char) (cArr4[i12] - b11);
            }
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i17 = completedVar.getSDKTransactionID;
                if (i17 >= i12) {
                    break;
                }
                $11 = ($10 + 3) % 128;
                char c14 = cArr4[i17];
                completedVar.getSDKAppID = c14;
                char c15 = cArr4[i17 + 1];
                completedVar.getSDKReferenceNumber = c15;
                if (c14 == c15) {
                    cArr5[i17] = (char) (c14 - b11);
                    cArr5[i17 + 1] = (char) (c15 - b11);
                    cCharValue = cCharValue;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = completedVar;
                    objArr6[11] = Integer.valueOf(cCharValue);
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
                    Map map3 = getMessageVersion.timedout;
                    Object obj2 = map3.get(700818725);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls6 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "", 0, 0) + 1919, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 30 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        byte b16 = (byte) 0;
                        Object[] objArr7 = new Object[1];
                        b((byte) 55, b16, b16, objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls7 = Integer.TYPE;
                        method = cls6.getMethod(str2, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class);
                        map3.put(700818725, method);
                    }
                    int iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    int i18 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i18) {
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = completedVar;
                        objArr8[9] = Integer.valueOf(cCharValue);
                        objArr8[8] = completedVar;
                        objArr8[7] = Integer.valueOf(cCharValue);
                        objArr8[r9] = Integer.valueOf(cCharValue);
                        objArr8[5] = completedVar;
                        objArr8[4] = completedVar;
                        objArr8[3] = Integer.valueOf(cCharValue);
                        objArr8[c13] = Integer.valueOf(cCharValue);
                        objArr8[1] = completedVar;
                        objArr8[0] = completedVar;
                        Object method4 = map3.get(-248084636);
                        if (method4 == null) {
                            Class cls8 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "", 0) + 1721, (char) (ExpandableListView.getPackedPositionType(0L) + 48634), 24 - View.MeasureSpec.getMode(0));
                            byte b17 = (byte) 0;
                            Object[] objArr9 = new Object[1];
                            b((byte) 6, b17, b17, objArr9);
                            String str3 = (String) objArr9[0];
                            Class cls9 = Integer.TYPE;
                            method4 = cls8.getMethod(str3, Object.class, Object.class, cls9, cls9, Object.class, Object.class, cls9, cls9, Object.class, cls9, Object.class);
                            map3.put(-248084636, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i19 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i21 = completedVar.getSDKTransactionID;
                        cArr5[i21] = cArr2[iIntValue2];
                        cArr5[i21 + 1] = cArr2[i19];
                    } else {
                        int i22 = completedVar.getDeviceData;
                        int i23 = completedVar.AuthenticationRequestParameters;
                        if (i22 == i23) {
                            int i24 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i24;
                            int i25 = ((i18 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i25;
                            int i26 = (i23 * cCharValue) + i25;
                            int i27 = completedVar.getSDKTransactionID;
                            cArr5[i27] = cArr2[(i22 * cCharValue) + i24];
                            cArr5[i27 + 1] = cArr2[i26];
                            $10 = ($11 + 3) % 128;
                        } else {
                            int i28 = (i22 * cCharValue) + i18;
                            int i29 = (i23 * cCharValue) + completedVar.getMessageVersion;
                            int i31 = completedVar.getSDKTransactionID;
                            cArr5[i31] = cArr2[i28];
                            cArr5[i31 + 1] = cArr2[i29];
                        }
                        completedVar.getSDKTransactionID += 2;
                        cCharValue = cCharValue;
                    }
                }
                completedVar.getSDKTransactionID += 2;
                cCharValue = cCharValue;
            }
        }
        for (int i32 = 0; i32 < i11; i32++) {
            cArr5[i32] = (char) (cArr5[i32] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 67
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = atd.ap.ChallengeResult.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r8
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r1
            r1 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r8
            int r8 = r1 + 1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ap.ChallengeResult.b(int, int, byte, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        getSDKReferenceNumber = new char[]{52395, 52393, 52362, 52464, 52455, 52478, 52368, 52466, 52415, 52375, 52407, 52413, 52366, 52396, 52411, 52361, 52401, 52397, 52392, 52365, 52400, 52406, 52398, 52410, 52394};
        getSDKAppID = (char) 63809;
    }

    static void init$0() {
        $$a = new byte[]{59, 90, 71, -86};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE;
    }

    @Override // com.adyen.threeds2.Warning
    public final String getID() throws Throwable {
        Object obj;
        int i11 = getSDKTransactionID + 1;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(TextUtils.getTrimmedLength("") + 3, "\u000f\u0010㗄㗄", (byte) (100 >>> (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(TextUtils.getTrimmedLength("") + 4, "\u000f\u0010㗄㗄", (byte) (34 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        getSDKTransactionID = (getDeviceData + 115) % 128;
        return strIntern;
    }

    @Override // com.adyen.threeds2.Warning
    public final String getMessage() throws Throwable {
        getSDKTransactionID = (getDeviceData + 25) % 128;
        Object[] objArr = new Object[1];
        a(55 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0001\u0016\n\t\u0018\r\u000f\r\f\n\n\u000f\u000f\u0007\u0015\u000f\u0014\t\u0013\f\n\u0001\u000e\n\u0014\b\u0000\u000b\u0014\u0016\u0007\n\u0005\u0007\b\u0006\u0017\u0007㙑㙑\u0006\u0015\u0012\u0003\u0006\u000f\n\b\u0017\u0007㙖㙖\n\u000e\u0017\u0000", (byte) (104 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i11 = getDeviceData + 81;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 65 / 0;
        }
        return strIntern;
    }

    @Override // com.adyen.threeds2.Warning
    public final Warning.Severity getSeverity() {
        getSDKTransactionID = (getDeviceData + 123) % 128;
        Warning.Severity severity = Warning.Severity.MEDIUM;
        getSDKTransactionID = (getDeviceData + 97) % 128;
        return severity;
    }
}
