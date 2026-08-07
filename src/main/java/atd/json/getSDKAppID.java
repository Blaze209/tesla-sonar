package atd.json;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import atd.a.getMessageVersion;
import atd.ad.getDeviceData;
import atd.az.ChallengeResultError;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static char[] getSDKReferenceNumber;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        AuthenticationRequestParameters = 1;
        getDeviceData();
        AuthenticationRequestParameters = (getSDKAppID + 117) % 128;
    }

    private static boolean AuthenticationRequestParameters(Locale locale) {
        if (locale == null) {
            return false;
        }
        getSDKAppID = (AuthenticationRequestParameters + 83) % 128;
        if (locale.getLanguage() == null) {
            return false;
        }
        int i11 = getSDKAppID + 21;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return locale.getCountry() != null;
        }
        locale.getCountry();
        throw null;
    }

    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        int i11;
        int i12;
        Class<Object> cls;
        Object method;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        Object obj = str2;
        if (str2 != null) {
            byte[] bytes = str2.getBytes("ISO-8859-1");
            $11 = ($10 + 55) % 128;
            obj = bytes;
        }
        byte[] bArr = (byte[]) obj;
        ChallengeResultError challengeResultError = new ChallengeResultError();
        int i13 = 0;
        int i14 = iArr[0];
        int i15 = iArr[1];
        int i16 = iArr[2];
        int i17 = iArr[3];
        char[] cArr = getSDKReferenceNumber;
        Class cls3 = Integer.TYPE;
        int i18 = 2;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            while (i13 < length) {
                byte[] bArr2 = bArr;
                $11 = ($10 + 63) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    int i19 = i13;
                    Map map = getMessageVersion.timedout;
                    Object obj2 = map.get(-1708792688);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID(2314 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) View.MeasureSpec.makeMeasureSpec(0, 0), View.getDefaultSize(0, 0) + 24);
                        byte b11 = (byte) (-1);
                        byte b12 = (byte) (b11 + 3);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 - 2), objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr2[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i13 = i19 + 1;
                    bArr = bArr2;
                    cArr2 = cArr2;
                    i16 = i16;
                    length = length;
                    cArr = cArr;
                    i17 = i17;
                    cls2 = cls2;
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
        byte[] bArr3 = bArr;
        Class<Object> cls5 = cls2;
        int i21 = i16;
        int i22 = i17;
        char[] cArr3 = new char[i15];
        System.arraycopy(cArr, i14, cArr3, 0, i15);
        if (bArr3 != null) {
            char[] cArr4 = new char[i15];
            challengeResultError.getSDKAppID = 0;
            char c11 = 0;
            while (true) {
                int i23 = challengeResultError.getSDKAppID;
                if (i23 >= i15) {
                    cArr3 = cArr4;
                    break;
                }
                if (bArr3[i23] == 1) {
                    int i24 = $11 + 31;
                    $10 = i24 % 128;
                    if (i24 % 2 != 0) {
                        char c12 = cArr3[i23];
                        Object[] objArr4 = new Object[i18];
                        objArr4[1] = Integer.valueOf(c11);
                        objArr4[0] = Integer.valueOf(c12);
                        Map map2 = getMessageVersion.timedout;
                        Object method2 = map2.get(10570995);
                        if (method2 == null) {
                            Class cls6 = (Class) getMessageVersion.getSDKTransactionID(559 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 5486), Gravity.getAbsoluteGravity(0, 0) + 23);
                            byte b13 = (byte) (-1);
                            byte b14 = (byte) (b13 + 4);
                            Object[] objArr5 = new Object[1];
                            b(b13, b14, (byte) (b14 - 3), objArr5);
                            method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                            map2.put(10570995, method2);
                        }
                        cArr4[i23] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    Object[] objArr6 = {Integer.valueOf(cArr3[i23]), Integer.valueOf(c11)};
                    Map map3 = getMessageVersion.timedout;
                    Object method3 = map3.get(10570995);
                    if (method3 == null) {
                        Class cls7 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getPressedStateDuration() >> 16) + 558, (char) (5534 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22);
                        byte b15 = (byte) (-1);
                        byte b16 = (byte) (b15 + 4);
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, (byte) (b16 - 3), objArr7);
                        method3 = cls7.getMethod((String) objArr7[0], cls3, cls3);
                        map3.put(10570995, method3);
                    }
                    cArr4[i23] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                } else {
                    cArr3 = cArr3;
                    Object[] objArr8 = {Integer.valueOf(cArr3[i23]), Integer.valueOf(c11)};
                    Map map4 = getMessageVersion.timedout;
                    Object method4 = map4.get(-502074319);
                    if (method4 == null) {
                        method4 = ((Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0) + EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, (char) (1 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (Process.myTid() >> 22) + 24)).getMethod("a", cls3, cls3);
                        map4.put(-502074319, method4);
                    }
                    cArr4[i23] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                }
                c11 = cArr4[challengeResultError.getSDKAppID];
                Object[] objArr9 = {challengeResultError, challengeResultError};
                Map map5 = getMessageVersion.timedout;
                Object method5 = map5.get(-399400818);
                if (method5 != null) {
                    cls = cls5;
                } else {
                    Class cls8 = (Class) getMessageVersion.getSDKTransactionID(854 - (ViewConfiguration.getTapTimeout() >> 16), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), View.combineMeasuredStates(0, 0) + 24);
                    byte b17 = (byte) (-1);
                    byte b18 = (byte) (b17 + 1);
                    Object[] objArr10 = new Object[1];
                    b(b17, b18, b18, objArr10);
                    String str3 = (String) objArr10[0];
                    cls = cls5;
                    method5 = cls8.getMethod(str3, cls, cls);
                    map5.put(-399400818, method5);
                }
                ((Method) method5).invoke(null, objArr9);
                cls5 = cls;
                cArr3 = cArr3;
                i18 = 2;
            }
        }
        if (i22 > 0) {
            char[] cArr5 = new char[i15];
            i11 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i15);
            int i25 = i15 - i22;
            System.arraycopy(cArr5, 0, cArr3, i25, i22);
            System.arraycopy(cArr5, i22, cArr3, 0, i25);
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr6 = new char[i15];
            challengeResultError.getSDKAppID = i11;
            while (true) {
                int i26 = challengeResultError.getSDKAppID;
                if (i26 >= i15) {
                    break;
                }
                int i27 = $11 + 71;
                $10 = i27 % 128;
                if (i27 % 2 != 0) {
                    cArr6[i26] = cArr3[i15 - i26];
                } else {
                    cArr6[i26] = cArr3[(i15 - i26) - 1];
                    i26++;
                }
                challengeResultError.getSDKAppID = i26;
            }
            cArr3 = cArr6;
        }
        if (i21 > 0) {
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i28 = challengeResultError.getSDKAppID;
                if (i28 >= i15) {
                    break;
                }
                int i29 = $10 + 95;
                $11 = i29 % 128;
                if (i29 % 2 == 0) {
                    cArr3[i28] = (char) (cArr3[i28] / iArr[5]);
                    i12 = i28 % 0;
                } else {
                    cArr3[i28] = (char) (cArr3[i28] - iArr[2]);
                    i12 = i28 + 1;
                }
                challengeResultError.getSDKAppID = i12;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            int r6 = r6 * 2
            int r6 = 104 - r6
            byte[] r0 = atd.json.getSDKAppID.$$a
            int r7 = r7 * 3
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r7
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            int r5 = r5 + 1
            r3 = r0[r5]
        L2b:
            int r6 = r6 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.json.getSDKAppID.b(byte, byte, short, java.lang.Object[]):void");
    }

    static void getDeviceData() {
        getSDKReferenceNumber = new char[]{30838};
    }

    public static void getSDKAppID(String str) {
        AuthenticationRequestParameters = (getSDKAppID + 1) % 128;
        if (str == null || AuthenticationRequestParameters(getSDKTransactionID(str))) {
            return;
        }
        int i11 = AuthenticationRequestParameters + 81;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            throw getDeviceData.LOCALE.getDeviceData();
        }
        getDeviceData.LOCALE.getDeviceData();
        throw null;
    }

    private static Locale getSDKTransactionID(String str) throws Throwable {
        AuthenticationRequestParameters = (getSDKAppID + 101) % 128;
        if (str == null) {
            return null;
        }
        Object[] objArr = new Object[1];
        a(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{0, 1, 49, 0}, false, objArr);
        String[] strArrSplit = str.split(((String) objArr[0]).intern());
        int length = strArrSplit.length;
        if (length != 1) {
            if (length == 2) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (length != 3) {
                return null;
            }
            return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        }
        Locale locale = new Locale(strArrSplit[0]);
        int i11 = getSDKAppID + 5;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 68 / 0;
        }
        return locale;
    }

    static void init$0() {
        $$a = new byte[]{27, 27, 63, -5};
        $$b = 185;
    }
}
