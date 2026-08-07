package atd.v;

import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/InputMethodSelectorVisibility;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuildConfig extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static char[] getSDKAppID;
    private static char getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/InputMethodSelectorVisibility$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getDeviceData = 0;
        AuthenticationRequestParameters = 1;
        AuthenticationRequestParameters();
        TextUtils.getCapsMode("", 0, 0);
        View.combineMeasuredStates(0, 0);
        new AuthenticationRequestParameters((byte) 0);
        AuthenticationRequestParameters = (getDeviceData + 97) % 128;
    }

    public /* synthetic */ BuildConfig(Application application) {
        this(application, new atd.q.getDeviceData(application));
    }

    static void AuthenticationRequestParameters() {
        getSDKAppID = new char[]{52398, 52399, 52394, 52459, 52400, 52402, 52411, 52401, 52406, 52403, 52457, 52413, 52392, 52353, 52391, 52404, 52383, 52462, 52396, 52397, 52395, 52412, 52410, 52393, 52407};
        getSDKTransactionID = (char) 63809;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x017b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0197  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:52:0x01f4 A[Catch: all -> 0x0383, TryCatch #0 {all -> 0x0383, blocks: (B:14:0x0044, B:18:0x0099, B:17:0x005d, B:22:0x00c6, B:26:0x010d, B:49:0x0199, B:53:0x0257, B:56:0x0268, B:60:0x02fc, B:59:0x02a7, B:52:0x01f4, B:25:0x00d7), top: B:77:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0268 A[Catch: all -> 0x0383, TRY_ENTER, TryCatch #0 {all -> 0x0383, blocks: (B:14:0x0044, B:18:0x0099, B:17:0x005d, B:22:0x00c6, B:26:0x010d, B:49:0x0199, B:53:0x0257, B:56:0x0268, B:60:0x02fc, B:59:0x02a7, B:52:0x01f4, B:25:0x00d7), top: B:77:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x02a7 A[Catch: all -> 0x0383, TryCatch #0 {all -> 0x0383, blocks: (B:14:0x0044, B:18:0x0099, B:17:0x005d, B:22:0x00c6, B:26:0x010d, B:49:0x0199, B:53:0x0257, B:56:0x0268, B:60:0x02fc, B:59:0x02a7, B:52:0x01f4, B:25:0x00d7), top: B:77:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x031f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0327  */
    /* JADX WARN: Code duplicated, block: B:65:0x0350  */
    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        int i12;
        Map map;
        Object method;
        int iIntValue;
        int i13;
        int i14;
        int i15;
        Object method2;
        int length;
        char[] cArr;
        int i16;
        int i17;
        Object method3;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.az.completed completedVar = new atd.az.completed();
        char[] cArr2 = getSDKAppID;
        Class cls = Integer.TYPE;
        int i18 = -1;
        char c11 = 2;
        int i19 = 0;
        if (cArr2 != null) {
            int i21 = $10 + 73;
            $11 = i21 % 128;
            if (i21 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i16 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i16 = 0;
            }
            while (i16 < length) {
                $11 = ($10 + 69) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i16])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object obj = map2.get(-1709775791);
                    if (obj != null) {
                        i17 = i19;
                        method3 = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionChild(0L) + 2314, (char) (TypedValue.complexToFraction(i19, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(i19, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24);
                        byte b12 = (byte) i19;
                        i17 = i19;
                        Object[] objArr3 = new Object[1];
                        b(b12, (byte) (b12 | 55), (byte) i18, objArr3);
                        method3 = cls2.getMethod((String) objArr3[i17], cls);
                        map2.put(-1709775791, method3);
                    }
                    cArr[i16] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                    i16++;
                    $11 = ($10 + 85) % 128;
                    c11 = c11;
                    i19 = i17;
                    charArray = charArray;
                    i18 = -1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = charArray;
        char c12 = c11;
        int i22 = i19;
        Object[] objArr4 = {Integer.valueOf(getSDKTransactionID)};
        Map map3 = atd.a.getMessageVersion.timedout;
        Object method4 = map3.get(-1709775791);
        if (method4 == null) {
            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 2313, (char) Drawable.resolveOpacity(i22, i22), View.MeasureSpec.getSize(i22) + 24);
            byte b13 = (byte) i22;
            Object[] objArr5 = new Object[1];
            b(b13, (byte) (b13 | 55), (byte) (-1), objArr5);
            method4 = cls3.getMethod((String) objArr5[i22], cls);
            map3.put(-1709775791, method4);
        }
        char cCharValue = ((Character) ((Method) method4).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            int i23 = $10 + 117;
            $11 = i23 % 128;
            if (i23 % 2 == 0) {
                i12 = i11 + 111;
                cArr4[i12] = (char) (cArr3[i12] + b11);
            } else {
                i12 = i11 - 1;
                cArr4[i12] = (char) (cArr3[i12] - b11);
            }
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            int i24 = $11 + 49;
            $10 = i24 % 128;
            int i25 = i24 % 2;
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i26 = completedVar.getSDKTransactionID;
                if (i26 >= i12) {
                    break;
                }
                int i27 = $10;
                int i28 = i27 + 95;
                $11 = i28 % 128;
                if (i28 % 2 == 0) {
                    char c13 = cArr3[i26];
                    completedVar.getSDKAppID = c13;
                    char c14 = cArr3[i26 >> 1];
                    completedVar.getSDKReferenceNumber = c14;
                    if (c13 == c14) {
                        cArr4[i26] = (char) (completedVar.getSDKAppID - b11);
                        cArr4[i26 + 1] = (char) (completedVar.getSDKReferenceNumber - b11);
                        $11 = (i27 + 99) % 128;
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
                        map = atd.a.getMessageVersion.timedout;
                        method = map.get(700818725);
                        if (method != null) {
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Process.getGidForName("") + 1920, (char) (ViewConfiguration.getLongPressTimeout() >> 16), View.resolveSize(0, 0) + 29);
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            Object[] objArr7 = new Object[1];
                            b(b14, b15, (byte) (b15 - 1), objArr7);
                            String str2 = (String) objArr7[0];
                            Class cls5 = Integer.TYPE;
                            method = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                            map.put(700818725, method);
                        }
                        iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                        i13 = completedVar.getSDKEphemeralPublicKey;
                        if (iIntValue == i13) {
                            Object[] objArr8 = new Object[11];
                            objArr8[10] = completedVar;
                            objArr8[9] = Integer.valueOf(cCharValue);
                            objArr8[8] = completedVar;
                            objArr8[7] = Integer.valueOf(cCharValue);
                            objArr8[6] = Integer.valueOf(cCharValue);
                            objArr8[5] = completedVar;
                            objArr8[4] = completedVar;
                            objArr8[3] = Integer.valueOf(cCharValue);
                            objArr8[c12] = Integer.valueOf(cCharValue);
                            objArr8[1] = completedVar;
                            objArr8[0] = completedVar;
                            method2 = map.get(-248084636);
                            if (method2 != null) {
                                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1722, (char) (Color.alpha(0) + 48634), 24 - Color.argb(0, 0, 0, 0));
                                byte b16 = (byte) 0;
                                Object[] objArr9 = new Object[1];
                                b(b16, (byte) (b16 | 49), (byte) (-1), objArr9);
                                String str3 = (String) objArr9[0];
                                Class cls7 = Integer.TYPE;
                                method2 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                                map.put(-248084636, method2);
                            }
                            int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr8)).intValue();
                            int i29 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                            int i31 = completedVar.getSDKTransactionID;
                            cArr4[i31] = cArr2[iIntValue2];
                            cArr4[i31 + 1] = cArr2[i29];
                        } else {
                            i14 = completedVar.getDeviceData;
                            i15 = completedVar.AuthenticationRequestParameters;
                            if (i14 == i15) {
                                int i32 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                completedVar.getMessageVersion = i32;
                                int i33 = ((i13 + cCharValue) - 1) % cCharValue;
                                completedVar.getSDKEphemeralPublicKey = i33;
                                int i34 = (i15 * cCharValue) + i33;
                                int i35 = completedVar.getSDKTransactionID;
                                cArr4[i35] = cArr2[(i14 * cCharValue) + i32];
                                cArr4[i35 + 1] = cArr2[i34];
                                $11 = ($10 + 11) % 128;
                            } else {
                                int i36 = (i14 * cCharValue) + i13;
                                int i37 = (i15 * cCharValue) + completedVar.getMessageVersion;
                                int i38 = completedVar.getSDKTransactionID;
                                cArr4[i38] = cArr2[i36];
                                cArr4[i38 + 1] = cArr2[i37];
                            }
                        }
                    }
                } else {
                    char c15 = cArr3[i26];
                    completedVar.getSDKAppID = c15;
                    char c16 = cArr3[i26 + 1];
                    completedVar.getSDKReferenceNumber = c16;
                    if (c15 == c16) {
                        cArr4[i26] = (char) (completedVar.getSDKAppID - b11);
                        cArr4[i26 + 1] = (char) (completedVar.getSDKReferenceNumber - b11);
                        $11 = (i27 + 99) % 128;
                    } else {
                        Object[] objArr10 = new Object[13];
                        objArr10[12] = completedVar;
                        objArr10[11] = Integer.valueOf(cCharValue);
                        objArr10[10] = completedVar;
                        objArr10[9] = completedVar;
                        objArr10[8] = Integer.valueOf(cCharValue);
                        objArr10[7] = completedVar;
                        objArr10[6] = completedVar;
                        objArr10[5] = Integer.valueOf(cCharValue);
                        objArr10[4] = completedVar;
                        objArr10[3] = completedVar;
                        objArr10[c12] = Integer.valueOf(cCharValue);
                        objArr10[1] = completedVar;
                        objArr10[0] = completedVar;
                        map = atd.a.getMessageVersion.timedout;
                        method = map.get(700818725);
                        if (method != null) {
                            Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Process.getGidForName("") + 1920, (char) (ViewConfiguration.getLongPressTimeout() >> 16), View.resolveSize(0, 0) + 29);
                            byte b17 = (byte) 0;
                            byte b18 = b17;
                            Object[] objArr11 = new Object[1];
                            b(b17, b18, (byte) (b18 - 1), objArr11);
                            String str4 = (String) objArr11[0];
                            Class cls9 = Integer.TYPE;
                            method = cls8.getMethod(str4, Object.class, Object.class, cls9, Object.class, Object.class, cls9, Object.class, Object.class, cls9, Object.class, Object.class, cls9, Object.class);
                            map.put(700818725, method);
                        }
                        iIntValue = ((Integer) ((Method) method).invoke(null, objArr10)).intValue();
                        i13 = completedVar.getSDKEphemeralPublicKey;
                        if (iIntValue == i13) {
                            Object[] objArr12 = new Object[11];
                            objArr12[10] = completedVar;
                            objArr12[9] = Integer.valueOf(cCharValue);
                            objArr12[8] = completedVar;
                            objArr12[7] = Integer.valueOf(cCharValue);
                            objArr12[6] = Integer.valueOf(cCharValue);
                            objArr12[5] = completedVar;
                            objArr12[4] = completedVar;
                            objArr12[3] = Integer.valueOf(cCharValue);
                            objArr12[c12] = Integer.valueOf(cCharValue);
                            objArr12[1] = completedVar;
                            objArr12[0] = completedVar;
                            method2 = map.get(-248084636);
                            if (method2 != null) {
                                Class cls10 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1722, (char) (Color.alpha(0) + 48634), 24 - Color.argb(0, 0, 0, 0));
                                byte b19 = (byte) 0;
                                Object[] objArr13 = new Object[1];
                                b(b19, (byte) (b19 | 49), (byte) (-1), objArr13);
                                String str5 = (String) objArr13[0];
                                Class cls11 = Integer.TYPE;
                                method2 = cls10.getMethod(str5, Object.class, Object.class, cls11, cls11, Object.class, Object.class, cls11, cls11, Object.class, cls11, Object.class);
                                map.put(-248084636, method2);
                            }
                            int iIntValue3 = ((Integer) ((Method) method2).invoke(null, objArr12)).intValue();
                            int i210 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                            int i39 = completedVar.getSDKTransactionID;
                            cArr4[i39] = cArr2[iIntValue3];
                            cArr4[i39 + 1] = cArr2[i210];
                        } else {
                            i14 = completedVar.getDeviceData;
                            i15 = completedVar.AuthenticationRequestParameters;
                            if (i14 == i15) {
                                int i310 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                completedVar.getMessageVersion = i310;
                                int i311 = ((i13 + cCharValue) - 1) % cCharValue;
                                completedVar.getSDKEphemeralPublicKey = i311;
                                int i312 = (i15 * cCharValue) + i311;
                                int i313 = completedVar.getSDKTransactionID;
                                cArr4[i313] = cArr2[(i14 * cCharValue) + i310];
                                cArr4[i313 + 1] = cArr2[i312];
                                $11 = ($10 + 11) % 128;
                            } else {
                                int i314 = (i14 * cCharValue) + i13;
                                int i315 = (i15 * cCharValue) + completedVar.getMessageVersion;
                                int i316 = completedVar.getSDKTransactionID;
                                cArr4[i316] = cArr2[i314];
                                cArr4[i316 + 1] = cArr2[i315];
                            }
                        }
                    }
                }
                completedVar.getSDKTransactionID += 2;
            }
        }
        for (int i41 = 0; i41 < i11; i41++) {
            cArr4[i41] = (char) (cArr4[i41] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 122 - r7
            byte[] r0 = atd.v.BuildConfig.$$a
            int r8 = r8 + 4
            int r6 = r6 * 4
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L15
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2f
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L2f:
            int r7 = r7 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.BuildConfig.b(int, short, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{59, 90, 71, -86};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        AuthenticationRequestParameters = (getDeviceData + 41) % 128;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        a(32 - ExpandableListView.getPackedPositionGroup(0L), "\u0004\t\u0005\u0000\u0003\f\u0005\u0007\u0003\u0007\f\u0002\u000e\u0012\u0007\u0006\u000b\u0010\u0007\f\u0017\u0012\u000e\u0016\u0018\u0004\u0016\u0014\t\u0014\u0004\f", (byte) (Color.argb(0, 0, 0, 0) + 73), objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID == null) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            getDeviceData = (AuthenticationRequestParameters + 1) % 128;
            return failure;
        }
        int i11 = AuthenticationRequestParameters + 97;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(sDKTransactionID));
        }
        DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(sDKTransactionID));
        throw null;
    }

    private BuildConfig(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKReferenceNumber = authenticationRequestParameters;
    }
}
