package atd.aa;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/FiveGhzBandWifiFeatureSupport;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiFeatureSupport;", Kind.APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "isSupported", "", "()Ljava/lang/Boolean;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID implements runtimeError {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static char[] getSDKAppID;
    private static int getSDKReferenceNumber;
    private final Application getDeviceData;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        AuthenticationRequestParameters = 1;
        getSDKAppID = new char[]{30965, 30951, 30965, 30966};
    }

    public getSDKAppID(Application application) {
        s.k(application, "");
        this.getDeviceData = application;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0132  */
    /* JADX WARN: Code duplicated, block: B:35:0x013a A[PHI: r13
      0x013a: PHI (r13v4 char) = (r13v3 char), (r13v11 char) binds: [B:34:0x0138, B:30:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0156  */
    /* JADX WARN: Code duplicated, block: B:39:0x0159 A[Catch: all -> 0x025d, TryCatch #0 {all -> 0x025d, blocks: (B:13:0x0073, B:17:0x00db, B:16:0x0094, B:43:0x01a8, B:47:0x01eb, B:50:0x01ff, B:54:0x024f, B:53:0x0214, B:46:0x01c3, B:36:0x013e, B:40:0x0195, B:39:0x0159), top: B:79:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x01c3 A[Catch: all -> 0x025d, TryCatch #0 {all -> 0x025d, blocks: (B:13:0x0073, B:17:0x00db, B:16:0x0094, B:43:0x01a8, B:47:0x01eb, B:50:0x01ff, B:54:0x024f, B:53:0x0214, B:46:0x01c3, B:36:0x013e, B:40:0x0195, B:39:0x0159), top: B:79:0x0073 }] */
    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        int i11;
        char c11;
        Map map;
        Object method;
        Class<Object> cls;
        Map map2;
        Object method2;
        int length;
        char[] cArr;
        Object method3;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        $10 = ($11 + 65) % 128;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        atd.az.ChallengeResultError challengeResultError = new atd.az.ChallengeResultError();
        int i12 = 0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        char[] cArr2 = getSDKAppID;
        Class cls3 = Integer.TYPE;
        int i17 = 2;
        if (cArr2 != null) {
            int i18 = $10 + 103;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i12 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            while (i12 < length) {
                byte[] bArr2 = bArr;
                $11 = ($10 + 113) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i12])};
                    int i19 = i12;
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object obj = map3.get(-1708792688);
                    if (obj != null) {
                        method3 = obj;
                    } else {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 24 - View.MeasureSpec.getMode(i12));
                        int i21 = i12;
                        byte b11 = (byte) i21;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 + 1), objArr3);
                        method3 = cls4.getMethod((String) objArr3[i21], cls3);
                        map3.put(-1708792688, method3);
                    }
                    cArr[i19] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                    i12 = i19 + 1;
                    bArr = bArr2;
                    cArr2 = cArr2;
                    length = length;
                    cArr = cArr;
                    i15 = i15;
                    i16 = i16;
                    cls2 = cls2;
                    i12 = 0;
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
        byte[] bArr3 = bArr;
        Class<Object> cls5 = cls2;
        int i22 = i15;
        int i23 = i16;
        char[] cArr3 = new char[i14];
        System.arraycopy(cArr2, i13, cArr3, 0, i14);
        if (bArr3 != null) {
            char[] cArr4 = new char[i14];
            challengeResultError.getSDKAppID = 0;
            char c12 = 0;
            while (true) {
                int i24 = challengeResultError.getSDKAppID;
                if (i24 >= i14) {
                    break;
                }
                int i25 = $10 + 15;
                $11 = i25 % 128;
                if (i25 % 2 == 0) {
                    c11 = 1;
                    if (bArr3[i24] == 1) {
                        char c13 = cArr3[i24];
                        Object[] objArr4 = new Object[i17];
                        objArr4[c11] = Integer.valueOf(c12);
                        objArr4[0] = Integer.valueOf(c13);
                        map = atd.a.getMessageVersion.timedout;
                        method = map.get(10570995);
                        if (method != null) {
                            Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(559 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 5486), (ViewConfiguration.getLongPressTimeout() >> 16) + 23);
                            byte b13 = (byte) 0;
                            byte b14 = b13;
                            Object[] objArr5 = new Object[1];
                            b(b13, b14, b14, objArr5);
                            method = cls6.getMethod((String) objArr5[0], cls3, cls3);
                            map.put(10570995, method);
                        }
                        cArr4[i24] = ((Character) ((Method) method).invoke(null, objArr4)).charValue();
                    } else {
                        cArr3 = cArr3;
                        Object[] objArr6 = {Integer.valueOf(cArr3[i24]), Integer.valueOf(c12)};
                        map2 = atd.a.getMessageVersion.timedout;
                        method2 = map2.get(-502074319);
                        if (method2 != null) {
                            method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(Color.alpha(0) + EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getMethod("a", cls3, cls3);
                            map2.put(-502074319, method2);
                        }
                        cArr4[i24] = ((Character) ((Method) method2).invoke(null, objArr6)).charValue();
                    }
                } else {
                    c11 = 1;
                    if (bArr3[i24] == 1) {
                        char c14 = cArr3[i24];
                        Object[] objArr7 = new Object[i17];
                        objArr7[c11] = Integer.valueOf(c12);
                        objArr7[0] = Integer.valueOf(c14);
                        map = atd.a.getMessageVersion.timedout;
                        method = map.get(10570995);
                        if (method != null) {
                            Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(559 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 5486), (ViewConfiguration.getLongPressTimeout() >> 16) + 23);
                            byte b15 = (byte) 0;
                            byte b16 = b15;
                            Object[] objArr8 = new Object[1];
                            b(b15, b16, b16, objArr8);
                            method = cls7.getMethod((String) objArr8[0], cls3, cls3);
                            map.put(10570995, method);
                        }
                        cArr4[i24] = ((Character) ((Method) method).invoke(null, objArr7)).charValue();
                    } else {
                        cArr3 = cArr3;
                        Object[] objArr9 = {Integer.valueOf(cArr3[i24]), Integer.valueOf(c12)};
                        map2 = atd.a.getMessageVersion.timedout;
                        method2 = map2.get(-502074319);
                        if (method2 != null) {
                            method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(Color.alpha(0) + EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getMethod("a", cls3, cls3);
                            map2.put(-502074319, method2);
                        }
                        cArr4[i24] = ((Character) ((Method) method2).invoke(null, objArr9)).charValue();
                    }
                }
                c12 = cArr4[challengeResultError.getSDKAppID];
                Object[] objArr10 = {challengeResultError, challengeResultError};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-399400818);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(854 - (ViewConfiguration.getTapTimeout() >> 16), (char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 24 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    byte b17 = (byte) 0;
                    byte b18 = b17;
                    Object[] objArr11 = new Object[1];
                    b(b17, b18, (byte) (b18 + 3), objArr11);
                    String str3 = (String) objArr11[0];
                    cls = cls5;
                    method4 = cls8.getMethod(str3, cls, cls);
                    map4.put(-399400818, method4);
                }
                ((Method) method4).invoke(null, objArr10);
                cls5 = cls;
                cArr3 = cArr3;
                i17 = 2;
            }
            cArr3 = cArr4;
        }
        if (i23 > 0) {
            char[] cArr5 = new char[i14];
            i11 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i14);
            int i26 = i14 - i23;
            System.arraycopy(cArr5, 0, cArr3, i26, i23);
            System.arraycopy(cArr5, i23, cArr3, 0, i26);
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr6 = new char[i14];
            challengeResultError.getSDKAppID = i11;
            while (true) {
                int i27 = challengeResultError.getSDKAppID;
                if (i27 >= i14) {
                    break;
                }
                cArr6[i27] = cArr3[(i14 - i27) - 1];
                challengeResultError.getSDKAppID = i27 + 1;
            }
            cArr3 = cArr6;
        }
        if (i22 > 0) {
            challengeResultError.getSDKAppID = 0;
            $10 = ($11 + 85) % 128;
            while (true) {
                int i28 = challengeResultError.getSDKAppID;
                if (i28 >= i14) {
                    break;
                }
                cArr3[i28] = (char) (cArr3[i28] - iArr[2]);
                challengeResultError.getSDKAppID = i28 + 1;
            }
        }
        objArr[0] = new String(cArr3);
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
    private static void b(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r0 = atd.aa.getSDKAppID.$$a
            int r9 = r9 * 2
            int r9 = r9 + 98
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2e:
            int r8 = r8 + r3
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.getSDKAppID.b(int, int, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{81, 93, -56, -49};
        $$b = 131;
    }

    @Override // atd.aa.runtimeError
    public final Boolean AuthenticationRequestParameters() throws Throwable {
        WifiManager wifiManager;
        AuthenticationRequestParameters = (getSDKReferenceNumber + 77) % 128;
        Application application = this.getDeviceData;
        Object[] objArr = new Object[1];
        a(null, new int[]{0, 4, 98, 2}, true, objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        if (systemService instanceof WifiManager) {
            AuthenticationRequestParameters = (getSDKReferenceNumber + 101) % 128;
            wifiManager = (WifiManager) systemService;
        } else {
            wifiManager = null;
        }
        if (wifiManager != null) {
            return Boolean.valueOf(wifiManager.is5GHzBandSupported());
        }
        return null;
    }
}
