package atd.r;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.completed;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/DevelopmentSettingsEnabled;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuildConfig extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static char getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getDeviceData;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/DevelopmentSettingsEnabled$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKTransactionID = 1;
        getSDKReferenceNumber();
        ViewConfiguration.getTouchSlop();
        ExpandableListView.getPackedPositionChild(0L);
        new getDeviceData((byte) 0);
        getSDKTransactionID = (getSDKAppID + 111) % 128;
    }

    public /* synthetic */ BuildConfig(Application application) {
        this(application, new atd.q.getSDKTransactionID(application));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0177  */
    /* JADX WARN: Code duplicated, block: B:51:0x018a  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e9 A[Catch: all -> 0x037b, TryCatch #0 {all -> 0x037b, blocks: (B:15:0x004c, B:19:0x00a0, B:18:0x0067, B:25:0x00c7, B:29:0x010b, B:52:0x018c, B:56:0x024b, B:59:0x025c, B:63:0x02f1, B:62:0x0299, B:55:0x01e9, B:28:0x00da), top: B:82:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:59:0x025c A[Catch: all -> 0x037b, TRY_ENTER, TryCatch #0 {all -> 0x037b, blocks: (B:15:0x004c, B:19:0x00a0, B:18:0x0067, B:25:0x00c7, B:29:0x010b, B:52:0x018c, B:56:0x024b, B:59:0x025c, B:63:0x02f1, B:62:0x0299, B:55:0x01e9, B:28:0x00da), top: B:82:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0298  */
    /* JADX WARN: Code duplicated, block: B:62:0x0299 A[Catch: all -> 0x037b, TryCatch #0 {all -> 0x037b, blocks: (B:15:0x004c, B:19:0x00a0, B:18:0x0067, B:25:0x00c7, B:29:0x010b, B:52:0x018c, B:56:0x024b, B:59:0x025c, B:63:0x02f1, B:62:0x0299, B:55:0x01e9, B:28:0x00da), top: B:82:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0312  */
    /* JADX WARN: Code duplicated, block: B:67:0x0318  */
    /* JADX WARN: Code duplicated, block: B:68:0x0344  */
    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        char[] charArray;
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
        int i18 = $10;
        int i19 = i18 + 51;
        $11 = i19 % 128;
        char c11 = 2;
        if (i19 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            $11 = (i18 + 41) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr2 = charArray;
        completed completedVar = new completed();
        char[] cArr3 = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        int i21 = 0;
        if (cArr3 != null) {
            int i22 = $10 + 111;
            $11 = i22 % 128;
            if (i22 % 2 == 0) {
                length = cArr3.length;
                cArr = new char[length];
                i16 = 1;
            } else {
                length = cArr3.length;
                cArr = new char[length];
                i16 = 0;
            }
            while (i16 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i16])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object obj = map2.get(-1709775791);
                    if (obj != null) {
                        i17 = i21;
                        method3 = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 24 - Color.green(i21));
                        byte b12 = (byte) i21;
                        byte b13 = b12;
                        i17 = i21;
                        Object[] objArr3 = new Object[1];
                        b(b12, b13, b13, objArr3);
                        method3 = cls2.getMethod((String) objArr3[i17], cls);
                        map2.put(-1709775791, method3);
                    }
                    cArr[i16] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                    i16++;
                    c11 = c11;
                    i21 = i17;
                    cArr2 = cArr2;
                    cArr3 = cArr3;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr;
        }
        char[] cArr4 = cArr2;
        char c12 = c11;
        int i23 = i21;
        Object[] objArr4 = {Integer.valueOf(getSDKReferenceNumber)};
        Map map3 = atd.a.getMessageVersion.timedout;
        Object method4 = map3.get(-1709775791);
        if (method4 == null) {
            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2312 - TextUtils.lastIndexOf("", '0', i23, i23), (char) KeyEvent.normalizeMetaState(i23), 23 - ImageFormat.getBitsPerPixel(i23));
            byte b14 = (byte) i23;
            byte b15 = b14;
            Object[] objArr5 = new Object[1];
            b(b14, b15, b15, objArr5);
            method4 = cls3.getMethod((String) objArr5[i23], cls);
            map3.put(-1709775791, method4);
        }
        char cCharValue = ((Character) ((Method) method4).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i11];
        if (i11 % 2 != 0) {
            int i24 = $11 + 29;
            $10 = i24 % 128;
            if (i24 % 2 != 0) {
                i12 = i11 + 116;
                cArr5[i12] = (char) (cArr4[i12] << b11);
            } else {
                i12 = i11 - 1;
                cArr5[i12] = (char) (cArr4[i12] - b11);
            }
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            $10 = ($11 + 109) % 128;
            int i25 = 0;
            while (true) {
                completedVar.getSDKTransactionID = i25;
                int i26 = completedVar.getSDKTransactionID;
                if (i26 >= i12) {
                    break;
                }
                int i27 = $10 + 69;
                $11 = i27 % 128;
                if (i27 % 2 == 0) {
                    char c13 = cArr4[i26];
                    completedVar.getSDKAppID = c13;
                    char c14 = cArr4[0];
                    completedVar.getSDKReferenceNumber = c14;
                    if (c13 == c14) {
                        cArr5[i26] = (char) (completedVar.getSDKAppID - b11);
                        cArr5[i26 + 1] = (char) (completedVar.getSDKReferenceNumber - b11);
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
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), MotionEvent.axisFromString("") + 30);
                            byte b16 = (byte) 0;
                            Object[] objArr7 = new Object[1];
                            b(b16, (byte) (b16 | 55), b16, objArr7);
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
                                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1720 - TextUtils.indexOf((CharSequence) "", '0'), (char) (View.MeasureSpec.getSize(0) + 48634), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23);
                                byte b17 = (byte) 0;
                                Object[] objArr9 = new Object[1];
                                b(b17, (byte) (b17 | 6), b17, objArr9);
                                String str3 = (String) objArr9[0];
                                Class cls7 = Integer.TYPE;
                                method2 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                                map.put(-248084636, method2);
                            }
                            int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr8)).intValue();
                            int i28 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                            int i29 = completedVar.getSDKTransactionID;
                            cArr5[i29] = cArr3[iIntValue2];
                            cArr5[i29 + 1] = cArr3[i28];
                        } else {
                            i14 = completedVar.getDeviceData;
                            i15 = completedVar.AuthenticationRequestParameters;
                            if (i14 == i15) {
                                int i31 = ($10 + 29) % 128;
                                $11 = i31;
                                int i32 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                completedVar.getMessageVersion = i32;
                                int i33 = ((i13 + cCharValue) - 1) % cCharValue;
                                completedVar.getSDKEphemeralPublicKey = i33;
                                int i34 = (i15 * cCharValue) + i33;
                                int i35 = completedVar.getSDKTransactionID;
                                cArr5[i35] = cArr3[(i14 * cCharValue) + i32];
                                cArr5[i35 + 1] = cArr3[i34];
                                $10 = (i31 + 89) % 128;
                            } else {
                                int i36 = (i15 * cCharValue) + completedVar.getMessageVersion;
                                int i37 = completedVar.getSDKTransactionID;
                                cArr5[i37] = cArr3[(i14 * cCharValue) + i13];
                                cArr5[i37 + 1] = cArr3[i36];
                            }
                        }
                    }
                } else {
                    char c15 = cArr4[i26];
                    completedVar.getSDKAppID = c15;
                    char c16 = cArr4[i26 + 1];
                    completedVar.getSDKReferenceNumber = c16;
                    if (c15 == c16) {
                        cArr5[i26] = (char) (completedVar.getSDKAppID - b11);
                        cArr5[i26 + 1] = (char) (completedVar.getSDKReferenceNumber - b11);
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
                            Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), MotionEvent.axisFromString("") + 30);
                            byte b18 = (byte) 0;
                            Object[] objArr11 = new Object[1];
                            b(b18, (byte) (b18 | 55), b18, objArr11);
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
                                Class cls10 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1720 - TextUtils.indexOf((CharSequence) "", '0'), (char) (View.MeasureSpec.getSize(0) + 48634), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23);
                                byte b19 = (byte) 0;
                                Object[] objArr13 = new Object[1];
                                b(b19, (byte) (b19 | 6), b19, objArr13);
                                String str5 = (String) objArr13[0];
                                Class cls11 = Integer.TYPE;
                                method2 = cls10.getMethod(str5, Object.class, Object.class, cls11, cls11, Object.class, Object.class, cls11, cls11, Object.class, cls11, Object.class);
                                map.put(-248084636, method2);
                            }
                            int iIntValue3 = ((Integer) ((Method) method2).invoke(null, objArr12)).intValue();
                            int i210 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                            int i211 = completedVar.getSDKTransactionID;
                            cArr5[i211] = cArr3[iIntValue3];
                            cArr5[i211 + 1] = cArr3[i210];
                        } else {
                            i14 = completedVar.getDeviceData;
                            i15 = completedVar.AuthenticationRequestParameters;
                            if (i14 == i15) {
                                int i38 = ($10 + 29) % 128;
                                $11 = i38;
                                int i39 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                completedVar.getMessageVersion = i39;
                                int i310 = ((i13 + cCharValue) - 1) % cCharValue;
                                completedVar.getSDKEphemeralPublicKey = i310;
                                int i311 = (i15 * cCharValue) + i310;
                                int i312 = completedVar.getSDKTransactionID;
                                cArr5[i312] = cArr3[(i14 * cCharValue) + i39];
                                cArr5[i312 + 1] = cArr3[i311];
                                $10 = (i38 + 89) % 128;
                            } else {
                                int i313 = (i15 * cCharValue) + completedVar.getMessageVersion;
                                int i314 = completedVar.getSDKTransactionID;
                                cArr5[i314] = cArr3[(i14 * cCharValue) + i13];
                                cArr5[i314 + 1] = cArr3[i313];
                            }
                        }
                    }
                }
                i25 = completedVar.getSDKTransactionID + 2;
            }
        }
        int i41 = 0;
        while (i41 < i11) {
            cArr5[i41] = (char) (cArr5[i41] ^ 13722);
            i41++;
            $10 = ($11 + 29) % 128;
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r0 = r5 + 1
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r6 = r6 + 67
            byte[] r1 = atd.r.BuildConfig.$$a
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L15
            r3 = r2
            r2 = r1
            r1 = r7
            goto L2f
        L15:
            r4 = r7
            r7 = r6
            r6 = r4
        L18:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r0[r2] = r3
            if (r2 != r5) goto L28
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L28:
            r3 = r1[r6]
            r4 = r1
            r1 = r6
            r6 = r3
            r3 = r2
            r2 = r4
        L2f:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r1 + 1
            r1 = r2
            r2 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.r.BuildConfig.b(short, int, byte, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        AuthenticationRequestParameters = new char[]{52402, 52383, 52401, 52392, 52408, 52414, 52397, 52409, 52462, 52400, 53061, 52407, 52412, 52413, 53063, 52403, 52455, 53062, 52353, 52415, 52411, 52410, 52398, 52394, 53060};
        getSDKReferenceNumber = (char) 63809;
    }

    static void init$0() {
        $$a = new byte[]{68, 46, 5, 3};
        $$b = 178;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        getSDKAppID = (getSDKTransactionID + 47) % 128;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getDeviceData;
        Object[] objArr = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28, "\u0016\u0015\u0000\u0017\u0001\u0003\u0014\u0011\u0018\u0005\u0003\u0017\u0005\u0015㘈㘈\u000e\u0006\b\u0007\u000f\u0017\u000e\u0018\n\u0002\u0015\u0016", (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 26), objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            int i11 = getSDKAppID + 87;
            getSDKTransactionID = i11 % 128;
            if (i11 % 2 == 0) {
                com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
                throw null;
            }
            Boolean sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
            if (sDKReferenceNumber != null) {
                return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private BuildConfig(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getDeviceData = authenticationRequestParameters;
    }
}
