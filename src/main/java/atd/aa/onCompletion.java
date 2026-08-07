package atd.aa;

import android.app.Application;
import android.graphics.ImageFormat;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/SixGhzBandWifiFeatureSupport;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiFeatureSupport;", Kind.APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "isSupported", "", "()Ljava/lang/Boolean;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onCompletion implements runtimeError {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] getDeviceData;
    private static int getSDKAppID;
    private static char getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final Application AuthenticationRequestParameters;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKTransactionID = 1;
        getDeviceData = new char[]{52407, 52408, 52393, 52400};
        getSDKReferenceNumber = (char) 63814;
    }

    public onCompletion(Application application) {
        s.k(application, "");
        this.AuthenticationRequestParameters = application;
    }

    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        int i12;
        Object method;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.az.completed completedVar = new atd.az.completed();
        char[] cArr = getDeviceData;
        Class cls = Integer.TYPE;
        int i13 = 2;
        int i14 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                int i16 = $11 + 105;
                $10 = i16 % 128;
                if (i16 % i13 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i15])};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(-1709775791);
                        if (obj != null) {
                            method = obj;
                        } else {
                            byte b12 = (byte) i14;
                            byte b13 = b12;
                            Object[] objArr3 = new Object[1];
                            b(b12, b13, b13, objArr3);
                            method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - View.resolveSize(i14, i14), (char) (KeyEvent.getMaxKeyCode() >> 16), 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getMethod((String) objArr3[i14], cls);
                            map.put(-1709775791, method);
                        }
                        cArr2[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    charArray = charArray;
                    cArr = cArr;
                    i13 = i13;
                    int i17 = i14;
                    Object[] objArr4 = {Integer.valueOf(cArr[i15])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(-1709775791);
                    if (method2 == null) {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) TextUtils.indexOf("", ""), 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        byte b14 = (byte) i17;
                        byte b15 = b14;
                        Object[] objArr5 = new Object[1];
                        b(b14, b15, b15, objArr5);
                        method2 = cls2.getMethod((String) objArr5[i17], cls);
                        map2.put(-1709775791, method2);
                    }
                    cArr2[i15] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i15++;
                }
                i13 = i13;
                charArray = charArray;
                cArr = cArr;
                i14 = 0;
            }
            cArr = cArr2;
        }
        char[] cArr3 = charArray;
        int i18 = i13;
        Object[] objArr6 = {Integer.valueOf(getSDKReferenceNumber)};
        Map map3 = atd.a.getMessageVersion.timedout;
        Object method3 = map3.get(-1709775791);
        if (method3 == null) {
            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.resolveSizeAndState(0, 0, 0) + 2313, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 23 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            byte b16 = (byte) 0;
            byte b17 = b16;
            Object[] objArr7 = new Object[1];
            b(b16, b17, b17, objArr7);
            method3 = cls3.getMethod((String) objArr7[0], cls);
            map3.put(-1709775791, method3);
        }
        char cCharValue = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr4[i12] = (char) (cArr3[i12] - b11);
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            int i19 = $11 + 105;
            $10 = i19 % 128;
            int i21 = i19 % 2;
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i22 = completedVar.getSDKTransactionID;
                if (i22 >= i12) {
                    break;
                }
                char c11 = cArr3[i22];
                completedVar.getSDKAppID = c11;
                char c12 = cArr3[i22 + 1];
                completedVar.getSDKReferenceNumber = c12;
                if (c11 == c12) {
                    cArr4[i22] = (char) (c11 - b11);
                    cArr4[i22 + 1] = (char) (c12 - b11);
                } else {
                    Object[] objArr8 = new Object[13];
                    objArr8[12] = completedVar;
                    objArr8[11] = Integer.valueOf(cCharValue);
                    objArr8[10] = completedVar;
                    objArr8[9] = completedVar;
                    objArr8[8] = Integer.valueOf(cCharValue);
                    objArr8[7] = completedVar;
                    objArr8[6] = completedVar;
                    objArr8[5] = Integer.valueOf(cCharValue);
                    objArr8[4] = completedVar;
                    objArr8[3] = completedVar;
                    objArr8[i18] = Integer.valueOf(cCharValue);
                    objArr8[1] = completedVar;
                    objArr8[0] = completedVar;
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method4 = map4.get(700818725);
                    if (method4 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), View.combineMeasuredStates(0, 0) + 29);
                        byte b18 = (byte) 0;
                        Object[] objArr9 = new Object[1];
                        b(b18, (byte) (b18 | 55), b18, objArr9);
                        String str2 = (String) objArr9[0];
                        Class cls5 = Integer.TYPE;
                        method4 = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map4.put(700818725, method4);
                    }
                    int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                    int i23 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i23) {
                        Object[] objArr10 = new Object[11];
                        objArr10[10] = completedVar;
                        objArr10[9] = Integer.valueOf(cCharValue);
                        objArr10[8] = completedVar;
                        objArr10[7] = Integer.valueOf(cCharValue);
                        objArr10[6] = Integer.valueOf(cCharValue);
                        objArr10[5] = completedVar;
                        objArr10[4] = completedVar;
                        objArr10[3] = Integer.valueOf(cCharValue);
                        objArr10[i18] = Integer.valueOf(cCharValue);
                        objArr10[1] = completedVar;
                        objArr10[0] = completedVar;
                        Object method5 = map4.get(-248084636);
                        if (method5 == null) {
                            Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1721 - TextUtils.indexOf("", ""), (char) (ImageFormat.getBitsPerPixel(0) + 48635), 23 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                            byte b19 = (byte) 0;
                            Object[] objArr11 = new Object[1];
                            b(b19, (byte) (-$$a[1]), b19, objArr11);
                            String str3 = (String) objArr11[0];
                            Class cls7 = Integer.TYPE;
                            method5 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map4.put(-248084636, method5);
                        }
                        int iIntValue2 = ((Integer) ((Method) method5).invoke(null, objArr10)).intValue();
                        int i24 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i25 = completedVar.getSDKTransactionID;
                        cArr4[i25] = cArr[iIntValue2];
                        cArr4[i25 + 1] = cArr[i24];
                    } else {
                        int i26 = completedVar.getDeviceData;
                        int i27 = completedVar.AuthenticationRequestParameters;
                        if (i26 == i27) {
                            $10 = ($11 + 99) % 128;
                            int i28 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i28;
                            int i29 = ((i23 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i29;
                            int i31 = (i27 * cCharValue) + i29;
                            int i32 = completedVar.getSDKTransactionID;
                            cArr4[i32] = cArr[(i26 * cCharValue) + i28];
                            cArr4[i32 + 1] = cArr[i31];
                        } else {
                            int i33 = (i26 * cCharValue) + i23;
                            int i34 = (i27 * cCharValue) + completedVar.getMessageVersion;
                            int i35 = completedVar.getSDKTransactionID;
                            cArr4[i35] = cArr[i33];
                            cArr4[i35 + 1] = cArr[i34];
                        }
                        completedVar.getSDKTransactionID += 2;
                    }
                }
                completedVar.getSDKTransactionID += 2;
            }
        }
        for (int i36 = 0; i36 < i11; i36++) {
            cArr4[i36] = (char) (cArr4[i36] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 67
            byte[] r0 = atd.aa.onCompletion.$$a
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r5 = r5 * 4
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r4 = -r4
            int r6 = r6 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.onCompletion.b(short, byte, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{87, -6, 59, -47};
        $$b = 50;
    }

    @Override // atd.aa.runtimeError
    public final Boolean AuthenticationRequestParameters() throws Throwable {
        WifiManager wifiManager;
        Application application = this.AuthenticationRequestParameters;
        Object[] objArr = new Object[1];
        a(TextUtils.getCapsMode("", 0, 0) + 4, "\u0000\u0002\u0000\u0001", (byte) (65 - TextUtils.indexOf((CharSequence) "", '0')), objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        if (systemService instanceof WifiManager) {
            getSDKAppID = (getSDKTransactionID + 35) % 128;
            wifiManager = (WifiManager) systemService;
        } else {
            wifiManager = null;
        }
        if (wifiManager != null) {
            return Boolean.valueOf(wifiManager.is6GHzBandSupported());
        }
        int i11 = getSDKAppID + 103;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
