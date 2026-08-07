package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/BluetoothDiscoverability;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "", "isAcceptableValue", "(Ljava/lang/String;)Z", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static char getSDKReferenceNumber;
    private static char[] getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKAppID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/BluetoothDiscoverability$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        AuthenticationRequestParameters = 1;
        getSDKTransactionID();
        TextUtils.indexOf("", "");
        ExpandableListView.getPackedPositionType(0L);
        new getSDKAppID((byte) 0);
        int i11 = getDeviceData + 71;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ getSDKTransactionID(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        char[] cArr;
        int i12;
        int i13;
        char c11;
        Object method;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.az.completed completedVar = new atd.az.completed();
        char[] cArr2 = getSDKTransactionID;
        Class cls = Integer.TYPE;
        int i14 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i15])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1709775791);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - KeyEvent.keyCodeFromString(""), (char) View.MeasureSpec.getMode(0), 23 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        byte b12 = (byte) i14;
                        byte b13 = (byte) (b12 + 1);
                        Object[] objArr3 = new Object[1];
                        b(b12, b13, (byte) (b13 | 55), objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-1709775791, method);
                    }
                    cArr3[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i15++;
                    charArray = charArray;
                    cArr2 = cArr2;
                    i14 = -1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = charArray;
            i12 = 0;
            $10 = ($11 + 29) % 128;
            cArr2 = cArr3;
        } else {
            cArr = charArray;
            i12 = 0;
        }
        Object[] objArr4 = {Integer.valueOf(getSDKReferenceNumber)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method2 = map2.get(-1709775791);
        if (method2 == null) {
            int i16 = i12;
            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) Color.argb(i16, i16, i16, i16), View.MeasureSpec.getSize(i16) + 24);
            byte b14 = (byte) (-1);
            byte b15 = (byte) (b14 + 1);
            Object[] objArr5 = new Object[1];
            b(b14, b15, (byte) (b15 | 55), objArr5);
            method2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-1709775791, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            i13 = i11 - 1;
            cArr4[i13] = (char) (cArr[i13] - b11);
        } else {
            i13 = i11;
        }
        char c12 = 2;
        if (i13 > 1) {
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i17 = completedVar.getSDKTransactionID;
                if (i17 >= i13) {
                    break;
                }
                char c13 = cArr[i17];
                completedVar.getSDKAppID = c13;
                char c14 = cArr[i17 + 1];
                completedVar.getSDKReferenceNumber = c14;
                if (c13 == c14) {
                    $11 = ($10 + 1) % 128;
                    cArr4[i17] = (char) (c13 - b11);
                    cArr4[i17 + 1] = (char) (c14 - b11);
                    c11 = c12;
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
                    objArr6[c12] = Integer.valueOf(cCharValue);
                    objArr6[1] = completedVar;
                    objArr6[0] = completedVar;
                    c11 = c12;
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(700818725);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1919, (char) TextUtils.indexOf("", ""), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 30);
                        byte b16 = (byte) (-1);
                        byte b17 = (byte) (b16 + 1);
                        Object[] objArr7 = new Object[1];
                        b(b16, b17, b17, objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map3.put(700818725, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i18 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i18) {
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = completedVar;
                        objArr8[9] = Integer.valueOf(cCharValue);
                        objArr8[8] = completedVar;
                        objArr8[7] = Integer.valueOf(cCharValue);
                        objArr8[6] = Integer.valueOf(cCharValue);
                        objArr8[5] = completedVar;
                        objArr8[4] = completedVar;
                        objArr8[3] = Integer.valueOf(cCharValue);
                        objArr8[c11] = Integer.valueOf(cCharValue);
                        objArr8[1] = completedVar;
                        objArr8[0] = completedVar;
                        Object method4 = map3.get(-248084636);
                        if (method4 == null) {
                            Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0', 0, 0) + 1722, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 48634), 24 - KeyEvent.normalizeMetaState(0));
                            byte b18 = (byte) (-1);
                            byte b19 = (byte) (b18 + 1);
                            Object[] objArr9 = new Object[1];
                            b(b18, b19, (byte) (b19 | 49), objArr9);
                            String str3 = (String) objArr9[0];
                            Class cls7 = Integer.TYPE;
                            method4 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map3.put(-248084636, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i19 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i21 = completedVar.getSDKTransactionID;
                        cArr4[i21] = cArr2[iIntValue2];
                        cArr4[i21 + 1] = cArr2[i19];
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
                            cArr4[i27] = cArr2[(i22 * cCharValue) + i24];
                            cArr4[i27 + 1] = cArr2[i26];
                        } else {
                            int i28 = (i22 * cCharValue) + i18;
                            int i29 = (i23 * cCharValue) + completedVar.getMessageVersion;
                            int i31 = completedVar.getSDKTransactionID;
                            cArr4[i31] = cArr2[i28];
                            cArr4[i31 + 1] = cArr2[i29];
                        }
                        completedVar.getSDKTransactionID += 2;
                        c12 = c11;
                    }
                }
                completedVar.getSDKTransactionID += 2;
                c12 = c11;
            }
        }
        int i32 = 0;
        while (i32 < i11) {
            int i33 = $11 + 125;
            $10 = i33 % 128;
            if (i33 % 2 != 0) {
                cArr4[i32] = (char) (cArr4[i32] ^ 26302);
                i32 += 78;
            } else {
                cArr4[i32] = (char) (cArr4[i32] ^ 13722);
                i32++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            byte[] r0 = atd.x.getSDKTransactionID.$$a
            int r7 = 122 - r7
            int r6 = r6 * 2
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r5
            r4 = r6
            r3 = r2
            goto L2a
        L13:
            r3 = r7
            r7 = r5
            r5 = r3
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r7 = r7 + 1
            r4 = r0[r7]
            int r3 = r3 + 1
        L2a:
            int r5 = r5 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.getSDKTransactionID.b(int, byte, int, java.lang.Object[]):void");
    }

    private static boolean getSDKAppID(String str) throws Throwable {
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf("", '0') + 6, "\u0004\u0005\t\f㘴", (byte) (110 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr);
        boolean zI = new q(((String) objArr[0]).intern()).i(str);
        int i11 = getDeviceData + 113;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 76 / 0;
        }
        return zI;
    }

    static void getSDKTransactionID() {
        getSDKTransactionID = new char[]{52357, 52358, 52410, 52406, 52355, 52352, 52383, 52463, 52397, 52462, 52402, 52395, 52391, 52415, 52460, 52353, 52413, 52394, 52396, 52392, 52412, 52359, 52407, 52401, 52411};
        getSDKReferenceNumber = (char) 63809;
    }

    static void init$0() {
        $$a = new byte[]{34, -58, -116, -81};
        $$b = 140;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKAppID;
        Object[] objArr = new Object[1];
        a(ImageFormat.getBitsPerPixel(0) + 26, "\u0000\u000f\u000e\u0015\u0012\u0016\u0016\u0012\u0000\u0012\u0007\u0002\u0006\u0012\u0018\u0012\u0017\u0013\n\u0017\u0014\f\u0002\u0016㙗", (byte) (View.MeasureSpec.getMode(0) + 116), objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            AuthenticationRequestParameters = (getDeviceData + 7) % 128;
            if (getSDKAppID(sDKTransactionID)) {
                int i11 = AuthenticationRequestParameters + 75;
                getDeviceData = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 3 / 0;
                }
            } else {
                sDKTransactionID = null;
            }
            if (sDKTransactionID != null) {
                return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(sDKTransactionID));
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private getSDKTransactionID(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKAppID = authenticationRequestParameters;
    }
}
