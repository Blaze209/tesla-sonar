package atd.json;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import atd.a.getMessageVersion;
import atd.az.ChallengeStatusHandler;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKEphemeralPublicKey {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static char AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static char getDeviceData;
    private static char getSDKAppID;
    private static char getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        init$0();
        getSDKTransactionID = 0;
        ChallengeResult = 1;
        getSDKAppID = (char) 30108;
        getDeviceData = (char) 51980;
        getSDKReferenceNumber = (char) 52467;
        AuthenticationRequestParameters = (char) 1932;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = 1 - r9
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r7 = r7 * 4
            int r7 = r7 + 112
            byte[] r0 = atd.json.getSDKEphemeralPublicKey.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r0
            r5 = r2
            r0 = r8
            r8 = r9
            goto L2f
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r0
            r0 = r6
        L2f:
            int r7 = -r7
            int r7 = r7 + r8
            int r8 = r0 + 1
            r0 = r3
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.json.getSDKEphemeralPublicKey.a(byte, byte, short, java.lang.Object[]):void");
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
        char[] cArr = new char[charArray.length];
        int i12 = 0;
        challengeStatusHandler.getSDKReferenceNumber = 0;
        int i13 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i14 = challengeStatusHandler.getSDKReferenceNumber;
            if (i14 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i11);
                return;
            }
            cArr2[i12] = charArray[i14];
            char c11 = 1;
            cArr2[1] = charArray[i14 + 1];
            int i15 = 58224;
            int i16 = i12;
            while (i16 < 16) {
                char c12 = cArr2[c11];
                char c13 = cArr2[i12];
                int i17 = i13;
                int i18 = (c13 + i15) ^ ((c13 << 4) + ((char) (((long) getSDKReferenceNumber) ^ (-2881362678149017980L))));
                int i19 = c13 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(AuthenticationRequestParameters);
                    objArr2[i17] = Integer.valueOf(i19);
                    objArr2[c11] = Integer.valueOf(i18);
                    objArr2[i12] = Integer.valueOf(c12);
                    Map map = getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    Class cls = Integer.TYPE;
                    if (method == null) {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.getOffsetBefore("", i12) + 1745, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16681), Color.argb(i12, i12, i12, i12) + 29);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        a(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    char c14 = cArr2[0];
                    int i21 = (((char) (((long) getSDKAppID) ^ (-2881362678149017980L))) + (cCharValue << 4)) ^ (cCharValue + i15);
                    int i22 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(getDeviceData);
                    objArr4[i17] = Integer.valueOf(i22);
                    objArr4[1] = Integer.valueOf(i21);
                    objArr4[0] = Integer.valueOf(c14);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID(1744 - MotionEvent.axisFromString(""), (char) (16682 - Color.red(0)), 30 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        a(b13, b14, b14, objArr5);
                        method2 = cls3.getMethod((String) objArr5[0], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i15 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i16++;
                    i13 = i17;
                    charArray = charArray;
                    cArr2 = cArr2;
                    i12 = 0;
                    c11 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr3 = charArray;
            int i23 = i13;
            char[] cArr4 = cArr2;
            int i24 = challengeStatusHandler.getSDKReferenceNumber;
            cArr[i24] = cArr4[0];
            cArr[i24 + 1] = cArr4[1];
            Object[] objArr6 = new Object[i23];
            objArr6[1] = challengeStatusHandler;
            objArr6[0] = challengeStatusHandler;
            Map map2 = getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 == null) {
                Class cls4 = (Class) getMessageVersion.getSDKTransactionID(1596 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 27824), ImageFormat.getBitsPerPixel(0) + 26);
                byte b15 = (byte) ($$b & 1);
                byte b16 = (byte) (b15 - 1);
                Object[] objArr7 = new Object[1];
                a(b15, b16, b16, objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i13 = i23;
            charArray = cArr3;
            cArr2 = cArr4;
            i12 = 0;
        }
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public static Signature[] dq_(Context context) {
        return (Signature[]) getSDKTransactionID(new Object[]{context}, -641089908, 641089909, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) throws Throwable {
        Signature[] signingCertificateHistory;
        Context context = (Context) objArr[0];
        int i11 = ChallengeResult;
        int i12 = i11 & 29;
        int i13 = (i11 ^ 29) | i12;
        getSDKTransactionID = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            System.currentTimeMillis();
            System.currentTimeMillis();
            int i14 = ChallengeResult;
            int i15 = i14 & 99;
            int i16 = -(-(i14 | 99));
            getSDKTransactionID = ((i15 & i16) + (i16 | i15)) % 128;
            return null;
        }
        Signature[] signatureArr = new Signature[0];
        try {
            int i17 = Build.VERSION.SDK_INT;
            Class cls = Integer.TYPE;
            if (i17 >= 28) {
                int i18 = ChallengeResult + 63;
                getSDKTransactionID = i18 % 128;
                if (i18 % 2 != 0) {
                    context.getPackageName();
                    throw null;
                }
                String packageName = context.getPackageName();
                int i19 = getSDKTransactionID;
                ChallengeResult = ((-2) - (((i19 ^ 90) + ((i19 & 90) << 1)) ^ (-1))) % 128;
                try {
                    Object[] objArr2 = {packageName, 134217728};
                    int i21 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i22 = (i21 * 522) - 17159;
                    int i23 = (i22 ^ (-1)) + (i22 << 1);
                    int i24 = ~iCurrentTimeMillis;
                    int i25 = i24 & 33;
                    int i26 = ((i24 | 33) & (~i25)) | i25;
                    int i27 = (i26 | (~i26)) & (~i26);
                    int i28 = i21 ^ i27;
                    int i29 = i27 & i21;
                    int i31 = ((i29 & i28) | (i28 ^ i29)) * (-1042);
                    int i32 = ((i23 | i31) << 1) - (i31 ^ i23);
                    int i33 = ~iCurrentTimeMillis;
                    int i34 = (i33 & 33) | (iCurrentTimeMillis & (-34));
                    int i35 = iCurrentTimeMillis & 33;
                    int i36 = -(-(((i34 ^ i35) | (i34 & i35)) * 521));
                    int i37 = i32 & i36;
                    int i38 = (~i37) & (i36 | i32);
                    int i39 = -(-(i37 << 1));
                    int i41 = ((i38 | i39) << 1) - (i38 ^ i39);
                    int i42 = ~i21;
                    int i43 = i42 ^ (-34);
                    int i44 = i42 & (-34);
                    int i45 = ~((i43 ^ i44) | (i43 & i44));
                    int i46 = i42 & iCurrentTimeMillis;
                    int i47 = (i42 | iCurrentTimeMillis) & (~i46);
                    int i48 = (i47 & i46) | (i47 ^ i46);
                    int i49 = (i48 | (~i48)) & (~i48);
                    int i51 = (i49 & i45) | (i45 ^ i49);
                    int i52 = (iCurrentTimeMillis | i33) & (~iCurrentTimeMillis);
                    int i53 = i52 & i21;
                    int i54 = ((i21 | i52) & (~i53)) | i53;
                    int i55 = i54 ^ 33;
                    int i56 = i54 & 33;
                    int i57 = (i56 & i55) | (i55 ^ i56);
                    int i58 = (i57 | (~i57)) & (~i57);
                    int i59 = i51 & i58;
                    int i61 = (i51 | i58) & (~i59);
                    int i62 = ((i61 & i59) | (i61 ^ i59)) * 521;
                    int i63 = (((i41 ^ i62) | (i41 & i62)) << 1) - ((i62 & (~i41)) | ((~i62) & i41));
                    Object[] objArr3 = new Object[1];
                    b("賮刖\ue929ᴡᎥ\u245b漺Ԙ䏚抍\ue314䣇憦✞࣯冕霒蓢᯽峒᷺ڼⱎ鼙䞜鑞鬎윧\udd66漥䞜鑞湺脨", i63, objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    int i64 = -Color.alpha(0);
                    int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                    int i65 = i64 * (-244);
                    int i66 = i65 & 3444;
                    int i67 = (i65 ^ 3444) | i66;
                    int i68 = (i66 & i67) + (i67 | i66);
                    int i69 = ~iCurrentTimeMillis2;
                    int i71 = ~iCurrentTimeMillis2;
                    int i72 = i69 & (i71 | iCurrentTimeMillis2);
                    int i73 = (-15) ^ i72;
                    int i74 = i72 & (-15);
                    int i75 = (i74 & i73) | (i73 ^ i74);
                    int i76 = (i75 | (~i75)) & (~i75);
                    int i77 = ((~i64) & (-15)) | (i64 & 14);
                    int i78 = (-15) & i64;
                    int i79 = ~((i77 ^ i78) | (i77 & i78));
                    int i81 = i76 ^ i79;
                    int i82 = i76 & i79;
                    int i83 = -(-(((i82 & i81) | (i81 ^ i82)) * (-245)));
                    int i84 = i68 ^ i83;
                    int i85 = ((((i83 & i68) | i84) << 1) - (~(-i84))) - 1;
                    int i86 = (i71 & (-15)) | (iCurrentTimeMillis2 & 14);
                    int i87 = (-15) & iCurrentTimeMillis2;
                    int i88 = (~((i86 & i87) | (i86 ^ i87))) * (-245);
                    int i89 = (i85 | i88) << 1;
                    int i91 = -(((~i85) & i88) | ((~i88) & i85));
                    int i92 = (i89 & i91) + (i91 | i89);
                    int i93 = ~((iCurrentTimeMillis2 & (-15)) | ((-15) ^ iCurrentTimeMillis2));
                    int i94 = -(-(((i64 & i93) | (i64 ^ i93)) * EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
                    int i95 = i92 ^ i94;
                    int i96 = ((((i94 & i92) | i95) << 1) - (~(-i95))) - 1;
                    Object[] objArr4 = new Object[1];
                    b("䞜鑞ᓽ줿᷺ڼⱎ鼙䞜鑞裮麅❋翐", i96, objArr4);
                    SigningInfo signingInfo = ((PackageInfo) cls2.getMethod((String) objArr4[0], String.class, cls).invoke(packageManager, objArr2)).signingInfo;
                    if (signingInfo.hasMultipleSigners()) {
                        int i97 = ChallengeResult;
                        int i98 = ((i97 ^ 81) | (i97 & 81)) << 1;
                        int i99 = -(((~i97) & 81) | (i97 & (-82)));
                        int i100 = ((i98 | i99) << 1) - (i99 ^ i98);
                        getSDKTransactionID = i100 % 128;
                        if (i100 % 2 != 0) {
                            signingCertificateHistory = signingInfo.getApkContentsSigners();
                            int i101 = 79 / 0;
                        } else {
                            signingCertificateHistory = signingInfo.getApkContentsSigners();
                        }
                        int i102 = getSDKTransactionID;
                        ChallengeResult = ((i102 ^ 113) + ((i102 & 113) << 1)) % 128;
                    } else {
                        signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                    }
                    signatureArr = signingCertificateHistory;
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            } else {
                String packageName2 = context.getPackageName();
                int i103 = (ChallengeResult + 87) % 128;
                getSDKTransactionID = i103;
                int i104 = i103 & 103;
                ChallengeResult = (i104 + ((i103 ^ 103) | i104)) % 128;
                try {
                    Object[] objArr5 = {packageName2, 64};
                    int i105 = -(~(-(-(ViewConfiguration.getTapTimeout() >> 16))));
                    Object[] objArr6 = new Object[1];
                    b("賮刖\ue929ᴡᎥ\u245b漺Ԙ䏚抍\ue314䣇憦✞࣯冕霒蓢᯽峒᷺ڼⱎ鼙䞜鑞鬎윧\udd66漥䞜鑞湺脨", (-2) - ((((i105 | 33) << 1) - (i105 ^ 33)) ^ (-1)), objArr6);
                    Class<?> cls3 = Class.forName((String) objArr6[0]);
                    int i106 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                    int i107 = i106 * 46;
                    int i108 = i107 ^ 598;
                    int i109 = ((i107 & 598) | i108) << 1;
                    int i110 = -i108;
                    int i111 = ((i109 | i110) << 1) - (i109 ^ i110);
                    int i112 = ~iCurrentTimeMillis3;
                    int i113 = (-14) ^ i112;
                    int i114 = i112 & (-14);
                    int i115 = ~((i114 & i113) | (i113 ^ i114));
                    int i116 = i106 & i115;
                    int i117 = (i115 | i106) & (~i116);
                    int i118 = ((i117 & i116) | (i117 ^ i116)) * (-90);
                    int i119 = i111 ^ i118;
                    int i120 = ((((i118 & i111) | i119) << 1) - (~(-i119))) - 1;
                    int i121 = (-14) & iCurrentTimeMillis3;
                    int i122 = (~i121) & ((-14) | iCurrentTimeMillis3);
                    int i123 = ~((i121 & i122) | (i122 ^ i121));
                    int i124 = ~(i106 | 13);
                    int i125 = i123 & i124;
                    int i126 = (i123 | i124) & (~i125);
                    int i127 = ((i126 & i125) | (i126 ^ i125)) * (-45);
                    int i128 = ((~i127) & i120) | ((~i120) & i127);
                    int i129 = -(-((i120 & i127) << 1));
                    int i130 = (i128 ^ i129) + ((i129 & i128) << 1);
                    int i131 = ~i106;
                    int i132 = i131 ^ iCurrentTimeMillis3;
                    int i133 = i131 & iCurrentTimeMillis3;
                    int i134 = (i133 & i132) | (i132 ^ i133);
                    int i135 = (i134 | (~i134)) & (~i134);
                    int i136 = (i135 & (-14)) | ((~i135) & (-14)) | (i135 & 13);
                    int i137 = ~iCurrentTimeMillis3;
                    int i138 = i137 & i106;
                    int i139 = (i106 | i137) & (~i138);
                    int i140 = ~((i139 & i138) | (i139 ^ i138));
                    int i141 = -(-(((i140 & i136) | ((~i140) & i136) | ((~i136) & i140)) * 45));
                    int i142 = i130 ^ i141;
                    int i143 = ((i141 & i130) | i142) << 1;
                    int i144 = -i142;
                    Object[] objArr7 = new Object[1];
                    b("䞜鑞ᓽ줿᷺ڼⱎ鼙䞜鑞裮麅❋翐", (i143 & i144) + (i143 | i144), objArr7);
                    signatureArr = ((PackageInfo) cls3.getMethod((String) objArr7[0], String.class, cls).invoke(packageManager, objArr5)).signatures;
                    int i145 = ChallengeResult;
                    int i146 = i145 & 85;
                    int i147 = i145 | 85;
                    getSDKTransactionID = ((i146 & i147) + (i147 | i146)) % 128;
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th3;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        getSDKTransactionID = (ChallengeResult + 39) % 128;
        return signatureArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x01bd, code lost:
    
        if (r0.isEmpty() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01c5, code lost:
    
        if (r0.isEmpty() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01c9, code lost:
    
        r1 = r3.iterator();
        r3 = atd.json.getSDKEphemeralPublicKey.getSDKTransactionID;
        atd.json.getSDKEphemeralPublicKey.ChallengeResult = (((r3 & 28) + (r3 | 28)) - 1) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01dd, code lost:
    
        if (r1.hasNext() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01df, code lost:
    
        r3 = atd.json.getSDKEphemeralPublicKey.getSDKTransactionID;
        r5 = (r3 ^ 68) + ((r3 & 68) << 1);
        atd.json.getSDKEphemeralPublicKey.ChallengeResult = ((r5 ^ (-1)) + (r5 << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01f9, code lost:
    
        if (((java.lang.String) r1.next()).equals(r0) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01fb, code lost:
    
        r0 = atd.json.getSDKEphemeralPublicKey.ChallengeResult;
        r1 = r0 & 117;
        r1 = ((r1 - (~((r0 ^ 117) | r1))) - 1) % 128;
        atd.json.getSDKEphemeralPublicKey.getSDKTransactionID = r1;
        r0 = r1 | 63;
        r2 = (r0 << 1) - (r0 & (~(r1 & 63)));
        atd.json.getSDKEphemeralPublicKey.ChallengeResult = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0218, code lost:
    
        if ((r2 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x021c, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x021d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x021e, code lost:
    
        r3 = atd.json.getSDKEphemeralPublicKey.getSDKTransactionID;
        r5 = (r3 & (-40)) | ((~r3) & 39);
        r3 = (r3 & 39) << 1;
        atd.json.getSDKEphemeralPublicKey.ChallengeResult = ((r5 ^ r3) + ((r3 & r5) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0233, code lost:
    
        r0 = atd.json.getSDKEphemeralPublicKey.getSDKTransactionID;
        r1 = r0 & 119;
        r1 = (r1 - (~(-(-((r0 ^ 119) | r1))))) - 1;
        atd.json.getSDKEphemeralPublicKey.ChallengeResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0245, code lost:
    
        if ((r1 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0247, code lost:
    
        r0 = 33 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x024f, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getSDKReferenceNumber(java.lang.Object[] r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.json.getSDKEphemeralPublicKey.getSDKReferenceNumber(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * (-1335)) + (i12 * (-667));
        int i15 = ~i12;
        int i16 = i11 | i13;
        return ((i14 + (((~i16) | i15) * (-668))) + ((i11 | (~(i13 | i15))) * 1336)) + ((i16 | i15) * 668) != 1 ? getSDKReferenceNumber(objArr) : getDeviceData(objArr);
    }

    static void init$0() {
        $$a = new byte[]{14, -72, -78, -9};
        $$b = 103;
    }

    public static boolean getDeviceData(Context context, Collection<String> collection) {
        return ((Boolean) getSDKTransactionID(new Object[]{context, collection}, 229542798, -229542798, (int) System.currentTimeMillis())).booleanValue();
    }
}
