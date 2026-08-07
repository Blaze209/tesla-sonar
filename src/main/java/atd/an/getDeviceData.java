package atd.an;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.az.ChallengeResultError;
import atd.az.ChallengeStatusReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.wallet.WalletConstants;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean AuthenticationRequestParameters;
    private static final int BuildConfig = 0;
    private static int ChallengeResult;
    private static boolean getDeviceData;
    private static final byte[] getMessageVersion = null;
    private static char[] getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData();
        getSDKEphemeralPublicKey = 0;
        ChallengeResult = 1;
        AuthenticationRequestParameters();
        getSDKAppID();
        getSDKEphemeralPublicKey = (ChallengeResult + 43) % 128;
    }

    public static ECPublicKey AuthenticationRequestParameters(AuthenticationRequestParameters authenticationRequestParameters, BigInteger bigInteger, BigInteger bigInteger2) throws Throwable {
        try {
            Object[] objArr = new Object[1];
            a("\u0001\u0000", new int[]{0, 2, 0, 1}, false, objArr);
            ECPublicKey eCPublicKey = (ECPublicKey) KeyFactory.getInstance(((String) objArr[0]).intern()).generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, bigInteger2), authenticationRequestParameters.getSDKAppID()));
            getSDKEphemeralPublicKey = (ChallengeResult + 17) % 128;
            return eCPublicKey;
        } catch (GeneralSecurityException unused) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        int i11;
        char[] cArr;
        Class<Object> cls;
        int length;
        char[] cArr2;
        int i12;
        Object method;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        ChallengeResultError challengeResultError = new ChallengeResultError();
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        char[] cArr3 = getSDKReferenceNumber;
        Class cls3 = Integer.TYPE;
        int i17 = 2;
        if (cArr3 != null) {
            int i18 = $11 + 1;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i12 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i12 = 0;
            }
            while (i12 < length) {
                byte[] bArr2 = bArr;
                $10 = ($11 + 125) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i12])};
                    int i19 = length;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1708792688);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24);
                        byte b11 = (byte) (-1);
                        byte b12 = (byte) (b11 + 3);
                        Object[] objArr3 = new Object[1];
                        d(b11, b12, (byte) (b12 - 2), objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr2[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i12++;
                    length = i19;
                    bArr = bArr2;
                    cArr3 = cArr3;
                    cArr2 = cArr2;
                    i15 = i15;
                    i16 = i16;
                    cls2 = cls2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        byte[] bArr3 = bArr;
        Class<Object> cls5 = cls2;
        int i21 = i15;
        int i22 = i16;
        char[] cArr4 = new char[i14];
        System.arraycopy(cArr3, i13, cArr4, 0, i14);
        if (bArr3 != null) {
            $11 = ($10 + 23) % 128;
            char[] cArr5 = new char[i14];
            challengeResultError.getSDKAppID = 0;
            char c11 = 0;
            while (true) {
                int i23 = challengeResultError.getSDKAppID;
                if (i23 >= i14) {
                    break;
                }
                $10 = ($11 + 75) % 128;
                if (bArr3[i23] == 1) {
                    char c12 = cArr4[i23];
                    Object[] objArr4 = new Object[i17];
                    objArr4[1] = Integer.valueOf(c11);
                    objArr4[0] = Integer.valueOf(c12);
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(10570995);
                    if (method2 == null) {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(557 - TextUtils.indexOf((CharSequence) "", '0'), (char) (5486 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        byte b13 = (byte) (-1);
                        byte b14 = (byte) (b13 + 1);
                        Object[] objArr5 = new Object[1];
                        d(b13, b14, b14, objArr5);
                        method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                        map2.put(10570995, method2);
                    }
                    cArr5[i23] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    cArr4 = cArr4;
                    cArr5 = cArr5;
                    Object[] objArr6 = {Integer.valueOf(cArr4[i23]), Integer.valueOf(c11)};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-502074319);
                    if (method3 == null) {
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, (char) Drawable.resolveOpacity(0, 0), (Process.myPid() >> 22) + 24)).getMethod("a", cls3, cls3);
                        map3.put(-502074319, method3);
                    }
                    cArr5[i23] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c11 = cArr5[challengeResultError.getSDKAppID];
                Object[] objArr7 = {challengeResultError, challengeResultError};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-399400818);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0') + 855, (char) (MotionEvent.axisFromString("") + 1), Gravity.getAbsoluteGravity(0, 0) + 24);
                    byte b15 = (byte) (-1);
                    Object[] objArr8 = new Object[1];
                    d(b15, (byte) (b15 & 6), (byte) 0, objArr8);
                    String str3 = (String) objArr8[0];
                    cls = cls5;
                    method4 = cls7.getMethod(str3, cls, cls);
                    map4.put(-399400818, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                cls5 = cls;
                cArr4 = cArr4;
                cArr5 = cArr5;
                i17 = 2;
            }
            $10 = ($11 + 41) % 128;
            cArr4 = cArr5;
        }
        if (i22 > 0) {
            char[] cArr6 = new char[i14];
            System.arraycopy(cArr4, 0, cArr6, 0, i14);
            int i24 = i14 - i22;
            System.arraycopy(cArr6, 0, cArr4, i24, i22);
            System.arraycopy(cArr6, i22, cArr4, 0, i24);
        }
        if (z11) {
            int i25 = $11 + 23;
            $10 = i25 % 128;
            if (i25 % 2 != 0) {
                cArr = new char[i14];
                i11 = 1;
                challengeResultError.getSDKAppID = 1;
            } else {
                i11 = 1;
                cArr = new char[i14];
                challengeResultError.getSDKAppID = 0;
            }
            while (true) {
                int i26 = challengeResultError.getSDKAppID;
                if (i26 >= i14) {
                    break;
                }
                cArr[i26] = cArr4[(i14 - i26) - i11];
                challengeResultError.getSDKAppID = i26 + 1;
            }
            cArr4 = cArr;
        }
        if (i21 > 0) {
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i27 = challengeResultError.getSDKAppID;
                if (i27 >= i14) {
                    break;
                }
                cArr4[i27] = (char) (cArr4[i27] - iArr[2]);
                challengeResultError.getSDKAppID = i27 + 1;
            }
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
    private static void b(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            byte[] r0 = atd.an.getDeviceData.getMessageVersion
            int r6 = 118 - r6
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r6
            r3 = r2
            r6 = r5
            goto L26
        L11:
            r3 = r6
            r6 = r5
            r5 = r3
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r6]
            int r3 = r3 + 1
        L26:
            int r5 = r5 + r4
            int r5 = r5 + (-5)
            int r6 = r6 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.an.getDeviceData.b(int, int, short, java.lang.Object[]):void");
    }

    private static void c(String str, int i11, int[] iArr, String str2, Object[] objArr) throws Throwable {
        Class cls;
        Object method;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeStatusReceiver challengeStatusReceiver = new ChallengeStatusReceiver();
        char[] cArr = getSDKAppID;
        Class cls2 = Integer.TYPE;
        int i12 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(508097192);
                    if (obj != null) {
                        method = obj;
                        cls = cls2;
                    } else {
                        cls = cls2;
                        method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(327 - TextUtils.indexOf((CharSequence) "", '0', i12, i12), (char) KeyEvent.getDeadChar(i12, i12), ImageFormat.getBitsPerPixel(i12) + 33)).getMethod("o", cls);
                        map.put(508097192, method);
                    }
                    cArr2[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i13++;
                    cls2 = cls;
                    cArr = cArr;
                    i12 = 0;
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
        Class cls3 = cls2;
        Object[] objArr3 = {Integer.valueOf(getSDKTransactionID)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method2 = map2.get(-852383591);
        int i14 = -1;
        if (method2 == null) {
            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2061 - TextUtils.getOffsetBefore("", 0), (char) ('0' - AndroidCharacter.getMirror('0')), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 17);
            byte b11 = (byte) (-1);
            Object[] objArr4 = new Object[1];
            d(b11, (byte) (b11 & 9), (byte) 0, objArr4);
            method2 = cls4.getMethod((String) objArr4[0], cls3);
            map2.put(-852383591, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        int i15 = 2;
        long j11 = 0;
        if (getDeviceData) {
            int length2 = bArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length2;
            char[] cArr3 = new char[length2];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i16 = challengeStatusReceiver.getDeviceData;
                int i17 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[i16] = (char) (cArr[bArr[(i17 - 1) - i16] + i11] - iIntValue);
                Object[] objArr5 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method3 = map3.get(-249860496);
                if (method3 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.resolveSize(0, 0) + 1108, (char) (KeyEvent.getMaxKeyCode() >> 16), 51 - (Process.getElapsedCpuTime() > j11 ? 1 : (Process.getElapsedCpuTime() == j11 ? 0 : -1)));
                    byte b12 = (byte) i14;
                    Object[] objArr6 = new Object[1];
                    d(b12, (byte) (b12 & 11), (byte) 0, objArr6);
                    method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map3.put(-249860496, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                j11 = j11;
                i14 = -1;
            }
        } else if (AuthenticationRequestParameters) {
            int length3 = charArray.length;
            challengeStatusReceiver.getSDKReferenceNumber = length3;
            char[] cArr4 = new char[length3];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i18 = challengeStatusReceiver.getDeviceData;
                int i19 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i18] = (char) (cArr[charArray[(i19 - 1) - i18] - i11] - iIntValue);
                Object[] objArr7 = new Object[i15];
                objArr7[1] = challengeStatusReceiver;
                objArr7[0] = challengeStatusReceiver;
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-249860496);
                if (method4 == null) {
                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1109 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (1 - (ViewConfiguration.getScrollFriction() > 0 ? 1 : (ViewConfiguration.getScrollFriction() == 0 ? 0 : -1))), 51 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    byte b13 = (byte) (-1);
                    Object[] objArr8 = new Object[1];
                    d(b13, (byte) (b13 & 11), (byte) 0, objArr8);
                    method4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                    map4.put(-249860496, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                i15 = 2;
            }
        } else {
            int length4 = iArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length4;
            char[] cArr5 = new char[length4];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i21 = challengeStatusReceiver.getDeviceData;
                int i22 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i21] = (char) (cArr[iArr[(i22 - 1) - i21] - i11] - iIntValue);
                    challengeStatusReceiver.getDeviceData = i21 + 1;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 98
            byte[] r0 = atd.an.getDeviceData.$$a
            int r7 = r7 + 4
            int r9 = r9 * 2
            int r9 = 1 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r0
            r4 = r2
            r0 = r8
            r8 = r7
            goto L2d
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r0
            r0 = r6
        L2d:
            int r7 = r7 + r0
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.an.getDeviceData.d(byte, int, byte, java.lang.Object[]):void");
    }

    static void getDeviceData() {
        byte[] bArr = new byte[942];
        System.arraycopy("{heF\t\u0000\u0006\nÿ\u0006\u000bþ\u000eü\u0006\fý\u0006\rü\u0006\u000eû\u000fû\u0010ú\u0006\u000fú\u0011ù\u000fû\u0006\u0010ù\u000fû\u0006\u0011ø\u000fû\u0006\t\u0004\u0001\u0006\t\u0005\u0000\u0006\t\u0006ÿ\n\u0004\u0001\n\u0006ÿ\u0006\t\u0007þ\n\u0006ÿ\u0006\t\u0007þ\n\u0007þ\u000eü\u000eü\u0006\t\bý\n\tü\u0006\t\tü\u0006\t\nû\u0006\t\u000bú\u0011ù\u0006\t\fù\u0011ù\u0006\t\rø\u0006\n\u0003\u0001\n\nû\n\u0006ÿ\n\u0006ÿ\n\u000bú\u0006\n\u0004\u0000\n\fù\u0006\n\u0005ÿ\u0006\n\u0006þ\n\u0006ÿ\u0006\n\u0007ý\u0006\n\bü\u0006\t\u0007þ\n\rø\n\u0006ÿ\u0006\n\tû\u000b\u0003\u0001\u0006\n\nú\u0006\n\u000bù\u000b\u0004\u0000\u000b\u0005ÿ\u0006\n\fø\u000b\u0006þ\u000b\u0007ý\u0006\u000b\u0002\u0001\u0006\u000b\u0003\u0000\u0006\u000b\u0004ÿ\u0006\nÿ\u0006\u000bþ\u000eü\u0006\fý\u0006\rü\u0006\u000eû\u000b\tû\u000b\nú\u0006\u000fú\u0011ù\u000fû\u0006\u0010ù\u0006\u000b\u0005þ\u000b\u000bù\u000b\fø\f\u0002\u0001\u000b\u0007ý\u0006\u000b\u0006ý\u000b\u0006þ\u000b\u0007ý\u0006\u000b\u0007ü\u0006\u000b\bû\u0006\u000b\tú\u0006\u000b\tú\u0006\u000b\nù\u000eü\u0006\u000b\u000bø\f\u0005þ\u0006\u000b\u000bü\u001aðÒCú\u0012þÌ*&\u0003ü\nþ\u0002\u0001\u0002\u0010ü\u001aðÒCú\u0012þÌ *\u000bö\u0007\u0003\u0012ð\u0010\u000eõï\u001c\n\u000bç\u0010\u0010\u000eõ\n\u000bö\u0012\u0001ü\u001aðÒJ÷\u0003\u0017\u0002ü\u0010\nº\"\u001f\u0019Ü\u0016\r\u000eÚ#\u000eü\u0012ô\u0018\u0000\b\u0003\u0014Ú*\n\u0006ò\u0012ú\u0007ü\u001aðÒCú\u0012þÌ+\u0019\u000f\u0002\rï\u0006\u000fþ\u0003\u0014Ô#\u0019\u0003÷\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017².\u001d\u0001\u0017\u0007\u0002øó\"ú\u0003ù\u000fÿí\u001d\u0001\u0017\u0007\u0002øó\"ú\u0003ü\u001aðÒCú\u0012þÌIø\u0006\u000bþ\u0003\u0016¿\u001a1\u0004\n\u0006\u0003\bó\u0016\u0000\bü\u0017×*\n\u0006ò\u0012ú\u0007ö#ü\u001aðÒCú\u0012þÌ&\u0018\r\u0000\u0003\u0016Ìü\u001aðÒJ÷\u0003\u0017\u0002ü\u0010\nº\"\u001f\u0019Ü\u0016\r\u000eÚ#\u000eü\u0012ô\u0018\u0000\bæ\"þ\n\u0000\u0010úý\u0010\u0002\u0016ðü\u001aðÒJ÷\u0003\u0017\u0002ü\u0010\nºJ\u0002ú\u0003Ð\u00180\u0000\r\bü\u0010ù\nè\u0016\u0016ô\u0011ý\u0014ö\u0012æ\"ú\u0003ü\u001aðÒJ÷\u0003\u0017\u0002ü\u0010\nº*\u0017\u0003\u0017\u0002øò\u0014\u0012û\u0010\u0003\u0003\u000eü\u0012ô\u0018öë\u001f\u0019Ü\u0016\r\u000eü\u001aðÒJ÷\u0003\u0017\u0002ü\u0010\nº\u001e#\u000eü\u0012ô\u0010ì\u0017\u0003\u0017\u0002ü\u0010\nÑ8ð\u0007\u0010\tú\u000b\u0004\t\u0000\u0006\nÿ\u0006\u000bþ\u000eü\u0006\fý\u0006\rü\u0006\u000eû\f\u0007ü\n\fù\u0006\u000fú\f\bû\u0006\u0010ù\f\tú\u0006\u0011ø\u0006\t\u0004\u0001\n\u0006ÿ\u0006\t\u0005\u0000\u0006\t\u0006ÿ\u0006\t\u0007þ\f\nù\u000b\u0007ý\n\u0006ÿ\u0006\t\bý\u000b\u0003\u0001\u0006\t\tü\u0006\t\nû\f\u000bø\r\u0001\u0001\r\u0002\u0000\u0006\t\u000bú\u000b\u0006þ\u000b\u0007ý\u0006\t\fù\u0006\t\rø\u0006\n\u0003\u0001\u0006\n\u0003\u0001\u0006\n\u0004\u0000\r\u0003ÿ\r\u0004þ\u000b\u0007ý\u0006\n\u0005ÿ\u000b\u0006þ\u000b\u0007ý\u0006\n\u0006þ\u0006\n\u0007ý\u0006\n\bü\u0006\nÿ\u0006\u000bþ\f\u0005þ\u0006\fý\u0006\rü\u0006\u000eû\u000fû\r\u0005ý\u0006\u000fú\r\u0006ü\u0006\u0010ù\f\tú\u0006\u0011ø\u0006\t\u0004\u0001\u0006\n\tû\f\u0005þ\u0006\n\nú\u000eü\u0006\n\nü\u001að\u001c»:\u0014\fü\t\u0000Ä\"\u001f\u0019Í+\u0010ø\u0005\rý\u000e\u000b\n\u0000\u0010ü\u001aðÒJ÷\u0003\u0017\u0002ü\u0010\nº\"\u001f\u0019\u0010æ\u001dþ\u0017÷\u0003\u000eü\u0012ô\u0018öó\u0017\u0003\u0014ø\u0014".getBytes("ISO-8859-1"), 0, bArr, 0, 942);
        getMessageVersion = bArr;
        BuildConfig = 40;
    }

    static void getSDKAppID() {
        getSDKReferenceNumber = new char[]{30751, 30842, 30837, 30891, 30890, 30889};
    }

    public static ECPrivateKey getSDKTransactionID(AuthenticationRequestParameters authenticationRequestParameters, BigInteger bigInteger) throws Throwable {
        try {
            Object[] objArr = new Object[1];
            a("\u0001\u0000", new int[]{0, 2, 0, 1}, false, objArr);
            ECPrivateKey eCPrivateKey = (ECPrivateKey) KeyFactory.getInstance(((String) objArr[0]).intern()).generatePrivate(new ECPrivateKeySpec(bigInteger, authenticationRequestParameters.getSDKAppID()));
            getSDKEphemeralPublicKey = (ChallengeResult + 59) % 128;
            return eCPrivateKey;
        } catch (GeneralSecurityException unused) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    static void init$0() {
        $$a = new byte[]{20, -31, -122, 77};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0461  */
    /* JADX WARN: Code duplicated, block: B:117:0x047c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0490 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x040a A[PHI: r21
      0x040a: PHI (r21v26 int) = (r21v6 int), (r21v7 int), (r21v9 int), (r21v10 int), (r3v4 int), (r21v17 int), (r21v18 int), (r21v27 int) binds: [B:99:0x0413, B:96:0x03fc, B:89:0x03e1, B:87:0x03c9, B:95:0x03f8, B:45:0x026c, B:14:0x0156, B:71:0x037f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] getSDKAppID(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        Object[] objArr;
        int i11;
        Object[] objArr2;
        int i12;
        Object objAuthenticationRequestParameters;
        ChallengeResultCancelled challengeResultCancelled = new ChallengeResultCancelled(eCPublicKey, eCPrivateKey);
        byte[] bArr = getMessageVersion;
        Object[] objArr3 = new Object[1];
        b((short) 665, bArr[465], (short) 211, objArr3);
        int i13 = 0;
        String str = (String) objArr3[0];
        short s11 = (short) EnumC4419g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE;
        Object[] objArr4 = new Object[1];
        b(s11, bArr[354], bArr[5], objArr4);
        try {
            Object[] objArr5 = {(String) objArr4[0]};
            int i14 = 15;
            int i15 = 23;
            Object[] objArr6 = new Object[1];
            b(s11, bArr[15], bArr[23], objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            char c11 = 'q';
            Object[] objArr7 = new Object[1];
            b((short) 308, bArr[113], bArr[46], objArr7);
            String str2 = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            b(s11, bArr[15], bArr[23], objArr8);
            Object[] objArr9 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr8[0])).invoke(str, objArr5);
            int[] iArr = new int[objArr9.length];
            int i16 = 0;
            while (i16 < objArr9.length) {
                Object[] objArr10 = {objArr9[i16]};
                int i17 = BuildConfig;
                int i18 = i15;
                short s12 = (short) (i17 | EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE);
                byte[] bArr2 = getMessageVersion;
                char c12 = c11;
                Object[] objArr11 = new Object[1];
                b(s12, bArr2[i14], bArr2[25], objArr11);
                Class<?> cls2 = Class.forName((String) objArr11[0]);
                int i19 = i14;
                Object[] objArr12 = new Object[1];
                b((short) EnumC4419g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, bArr2[5], bArr2[6], objArr12);
                String str3 = (String) objArr12[0];
                Object[] objArr13 = new Object[1];
                b(s11, bArr2[i19], bArr2[i18], objArr13);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr13[0])).invoke(null, objArr10);
                Object[] objArr14 = new Object[1];
                b((short) (i17 | EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE), bArr2[i19], bArr2[25], objArr14);
                Class<?> cls3 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                b((short) 334, bArr2[18], bArr2[64], objArr15);
                iArr[i16] = ((Integer) cls3.getMethod((String) objArr15[0], null).invoke(objInvoke, null)).intValue();
                i16++;
                i15 = i18;
                c11 = c12;
                i14 = i19;
            }
            int i21 = i14;
            int i22 = i15;
            char c13 = c11;
            int i23 = 0;
            while (true) {
                int i24 = i23 + 1;
                try {
                    switch (challengeResultCancelled.AuthenticationRequestParameters(iArr[i23])) {
                        case -27:
                            i23 = 60;
                            break;
                        case -26:
                            i13 = i13;
                            challengeResultCancelled.AuthenticationRequestParameters(32);
                            i23 = challengeResultCancelled.getSDKAppID != 0 ? 1 : 46;
                            i13 = i13;
                            break;
                        case -25:
                            i13 = i13;
                            i23 = 61;
                            break;
                        case -24:
                            i13 = i13;
                            i23 = 63;
                            break;
                        case -23:
                            i13 = i13;
                            challengeResultCancelled.AuthenticationRequestParameters(25);
                            if (challengeResultCancelled.getSDKAppID == 0) {
                                i23 = 45;
                            } else {
                                i23 = i24;
                            }
                            i13 = i13;
                            break;
                        case -22:
                            i13 = i13;
                            challengeResultCancelled.getDeviceData = 1;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(4);
                            getSDKEphemeralPublicKey = challengeResultCancelled.getSDKAppID;
                            i23 = i24;
                            i13 = i13;
                            break;
                        case -21:
                            i12 = ChallengeResult;
                            challengeResultCancelled.getDeviceData = i12;
                            challengeResultCancelled.AuthenticationRequestParameters(14);
                            i23 = i24;
                            i13 = i13;
                            break;
                        case -20:
                            i23 = i22;
                            break;
                        case -19:
                            i13 = i13;
                            i23 = 35;
                            break;
                        case -18:
                            i13 = i13;
                            challengeResultCancelled.AuthenticationRequestParameters(31);
                            if (challengeResultCancelled.getSDKAppID == 0) {
                                i23 = 34;
                            } else {
                                i23 = i24;
                            }
                            i13 = i13;
                            break;
                        case -17:
                            i13 = i13;
                            challengeResultCancelled.getDeviceData = 1;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(4);
                            ChallengeResult = challengeResultCancelled.getSDKAppID;
                            i23 = i24;
                            i13 = i13;
                            break;
                        case -16:
                            i12 = getSDKEphemeralPublicKey;
                            challengeResultCancelled.getDeviceData = i12;
                            challengeResultCancelled.AuthenticationRequestParameters(14);
                            i23 = i24;
                            i13 = i13;
                            break;
                        case -15:
                            challengeResultCancelled.AuthenticationRequestParameters(11);
                            return (byte[]) challengeResultCancelled.getSDKEphemeralPublicKey;
                        case -14:
                            i13 = i13;
                            i23 = 36;
                            break;
                        case -13:
                            challengeResultCancelled.AuthenticationRequestParameters(11);
                            throw ((Throwable) challengeResultCancelled.getSDKEphemeralPublicKey);
                        case -12:
                            i13 = i13;
                            challengeResultCancelled.getDeviceData = 1;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            objAuthenticationRequestParameters = ((atd.ad.AuthenticationRequestParameters) challengeResultCancelled.getSDKEphemeralPublicKey).AuthenticationRequestParameters();
                            challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                            challengeResultCancelled.AuthenticationRequestParameters(1);
                            i23 = i24;
                            i13 = i13;
                            break;
                        case -11:
                            i13 = i13;
                            objAuthenticationRequestParameters = atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE;
                            challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                            challengeResultCancelled.AuthenticationRequestParameters(1);
                            i23 = i24;
                            i13 = i13;
                            break;
                        case -10:
                            i23 = 25;
                            break;
                        case -9:
                            i13 = i13;
                            challengeResultCancelled.getDeviceData = 1;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            Object obj = challengeResultCancelled.getSDKEphemeralPublicKey;
                            try {
                                short s13 = (short) (BuildConfig | 836);
                                byte[] bArr3 = getMessageVersion;
                                Object[] objArr16 = new Object[1];
                                b(s13, bArr3[i21], bArr3[376], objArr16);
                                Class<?> cls4 = Class.forName((String) objArr16[i13]);
                                Object[] objArr17 = new Object[1];
                                b((short) 925, bArr3[i22], bArr3[18], objArr17);
                                objAuthenticationRequestParameters = cls4.getMethod((String) objArr17[i13], null).invoke(obj, null);
                                challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                                challengeResultCancelled.AuthenticationRequestParameters(1);
                                i23 = i24;
                                i13 = i13;
                            } catch (Throwable th2) {
                                Throwable cause = th2.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th2;
                            }
                            break;
                        case -8:
                            try {
                                i13 = i13;
                                challengeResultCancelled.getDeviceData = 3;
                                challengeResultCancelled.AuthenticationRequestParameters(2);
                                challengeResultCancelled.AuthenticationRequestParameters(3);
                                Object obj2 = challengeResultCancelled.getSDKEphemeralPublicKey;
                                challengeResultCancelled.AuthenticationRequestParameters(3);
                                Object obj3 = challengeResultCancelled.getSDKEphemeralPublicKey;
                                challengeResultCancelled.AuthenticationRequestParameters(4);
                                try {
                                    Object[] objArr18 = new Object[2];
                                    objArr18[1] = Boolean.valueOf(challengeResultCancelled.getSDKAppID != 0 ? 1 : i13);
                                    objArr18[i13] = obj3;
                                    short s14 = (short) (BuildConfig | 836);
                                    byte[] bArr4 = getMessageVersion;
                                    Object[] objArr19 = new Object[1];
                                    b(s14, bArr4[i21], bArr4[376], objArr19);
                                    Class<?> cls5 = Class.forName((String) objArr19[i13]);
                                    Object[] objArr20 = new Object[1];
                                    b((short) 919, bArr4[303], bArr4[6], objArr20);
                                    String str4 = (String) objArr20[i13];
                                    Object[] objArr21 = new Object[1];
                                    b((short) 903, bArr4[i21], bArr4[25], objArr21);
                                    objAuthenticationRequestParameters = cls5.getMethod(str4, Class.forName((String) objArr21[i13]), Boolean.TYPE).invoke(obj2, objArr18);
                                    challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                                    challengeResultCancelled.AuthenticationRequestParameters(1);
                                    i23 = i24;
                                } catch (Throwable th3) {
                                    Throwable cause2 = th3.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                short s15 = (short) 628;
                                byte[] bArr5 = getMessageVersion;
                                byte b11 = bArr5[i21];
                                int i25 = BuildConfig;
                                objArr = new Object[1];
                                b(s15, b11, (short) (i25 - 3), objArr);
                                if (Class.forName((String) objArr[i13]).isInstance(th)) {
                                    i11 = i21;
                                    objArr2 = new Object[1];
                                    b(s15, bArr5[i11], (short) (i25 - 3), objArr2);
                                    if (Class.forName((String) objArr2[i13]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                i11 = i21;
                                objArr2 = new Object[1];
                                b(s15, bArr5[i11], (short) (i25 - 3), objArr2);
                                if (Class.forName((String) objArr2[i13]).isInstance(th)) {
                                }
                                throw th;
                                challengeResultCancelled.BuildConfig = th;
                                challengeResultCancelled.AuthenticationRequestParameters(34);
                                i23 = i11;
                                i21 = i23;
                            }
                            i13 = i13;
                            break;
                        case -7:
                            challengeResultCancelled.getDeviceData = 2;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            Object obj4 = challengeResultCancelled.getSDKEphemeralPublicKey;
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            try {
                                Object[] objArr22 = {challengeResultCancelled.getSDKEphemeralPublicKey};
                                short s16 = (short) (BuildConfig | 836);
                                byte[] bArr6 = getMessageVersion;
                                i13 = i13;
                                try {
                                    Object[] objArr23 = new Object[1];
                                    b(s16, bArr6[i21], bArr6[376], objArr23);
                                    Class<?> cls6 = Class.forName((String) objArr23[i13]);
                                    Object[] objArr24 = new Object[1];
                                    b((short) 900, bArr6[18], bArr6[c13], objArr24);
                                    String str5 = (String) objArr24[i13];
                                    Object[] objArr25 = new Object[1];
                                    b((short) 903, bArr6[i21], bArr6[25], objArr25);
                                    cls6.getMethod(str5, Class.forName((String) objArr25[i13])).invoke(obj4, objArr22);
                                    i23 = i24;
                                    i13 = i13;
                                } catch (Throwable th5) {
                                    th = th5;
                                    Throwable cause3 = th.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                            break;
                        case BaseResp.ErrCode.ERR_BAN /* -6 */:
                            challengeResultCancelled.getDeviceData = 1;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            try {
                                Object[] objArr26 = {challengeResultCancelled.getSDKEphemeralPublicKey};
                                short s17 = (short) (BuildConfig | 836);
                                byte[] bArr7 = getMessageVersion;
                                Object[] objArr27 = new Object[1];
                                b(s17, bArr7[i21], bArr7[376], objArr27);
                                Class<?> cls7 = Class.forName((String) objArr27[i13]);
                                Object[] objArr28 = new Object[1];
                                b((short) 375, bArr7[i22], bArr7[7], objArr28);
                                String str6 = (String) objArr28[i13];
                                Object[] objArr29 = new Object[1];
                                b(s11, bArr7[i21], bArr7[i22], objArr29);
                                challengeResultCancelled.BuildConfig = cls7.getMethod(str6, Class.forName((String) objArr29[i13])).invoke(null, objArr26);
                                challengeResultCancelled.AuthenticationRequestParameters(1);
                                i13 = i13;
                                i23 = i24;
                                i13 = i13;
                            } catch (Throwable th7) {
                                Throwable cause4 = th7.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th7;
                            }
                            break;
                        case BaseResp.ErrCode.ERR_UNSUPPORT /* -5 */:
                            challengeResultCancelled.getDeviceData = 1;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            Object obj5 = challengeResultCancelled.getSDKEphemeralPublicKey;
                            try {
                                byte[] bArr8 = getMessageVersion;
                                Object[] objArr30 = new Object[1];
                                b(s11, bArr8[i21], bArr8[i22], objArr30);
                                Class<?> cls8 = Class.forName((String) objArr30[i13]);
                                Object[] objArr31 = new Object[1];
                                b((short) 341, bArr8[18], bArr8[50], objArr31);
                                challengeResultCancelled.BuildConfig = cls8.getMethod((String) objArr31[i13], null).invoke(obj5, null);
                                challengeResultCancelled.AuthenticationRequestParameters(1);
                                i13 = i13;
                                i23 = i24;
                                i13 = i13;
                            } catch (Throwable th8) {
                                Throwable cause5 = th8.getCause();
                                if (cause5 != null) {
                                    throw cause5;
                                }
                                throw th8;
                            }
                            break;
                        case BaseResp.ErrCode.ERR_AUTH_DENIED /* -4 */:
                            challengeResultCancelled.getDeviceData = 3;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            String str7 = (String) challengeResultCancelled.getSDKEphemeralPublicKey;
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            int[] iArr2 = (int[]) challengeResultCancelled.getSDKEphemeralPublicKey;
                            challengeResultCancelled.AuthenticationRequestParameters(4);
                            Object[] objArr32 = new Object[1];
                            a(str7, iArr2, challengeResultCancelled.getSDKAppID != 0 ? 1 : i13, objArr32);
                            challengeResultCancelled.BuildConfig = (String) objArr32[i13];
                            challengeResultCancelled.AuthenticationRequestParameters(1);
                            i13 = i13;
                            i23 = i24;
                            i13 = i13;
                            break;
                        case -3:
                            challengeResultCancelled.BuildConfig = new int[]{2, 4, 81, i13};
                            challengeResultCancelled.AuthenticationRequestParameters(1);
                            i13 = i13;
                            i23 = i24;
                            i13 = i13;
                            break;
                        case -2:
                            challengeResultCancelled.BuildConfig = "\u0000\u0000\u0001\u0000";
                            challengeResultCancelled.AuthenticationRequestParameters(1);
                            i13 = i13;
                            i23 = i24;
                            i13 = i13;
                            break;
                        case -1:
                            i23 = 19;
                            break;
                        default:
                            i13 = i13;
                            i23 = i24;
                            i13 = i13;
                            break;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    i13 = i13;
                    short s18 = (short) 628;
                    byte[] bArr9 = getMessageVersion;
                    byte b12 = bArr9[i21];
                    int i26 = BuildConfig;
                    objArr = new Object[1];
                    b(s18, b12, (short) (i26 - 3), objArr);
                    if (Class.forName((String) objArr[i13]).isInstance(th) || i24 < 1) {
                        i11 = i21;
                    } else {
                        i11 = i21;
                        if (i24 <= i11) {
                        }
                        challengeResultCancelled.BuildConfig = th;
                        challengeResultCancelled.AuthenticationRequestParameters(34);
                        i23 = i11;
                        i21 = i23;
                    }
                    objArr2 = new Object[1];
                    b(s18, bArr9[i11], (short) (i26 - 3), objArr2);
                    if (Class.forName((String) objArr2[i13]).isInstance(th) || i24 < 46 || i24 > 60) {
                        throw th;
                    }
                    challengeResultCancelled.BuildConfig = th;
                    challengeResultCancelled.AuthenticationRequestParameters(34);
                    i23 = i11;
                    i21 = i23;
                }
            }
        } catch (Throwable th10) {
            Throwable cause6 = th10.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th10;
        }
    }

    static void AuthenticationRequestParameters() {
        getSDKAppID = new char[]{64720, 64731, 64708, 64780, 64713, 64727, 64729, 64711, 64712, 64723, 64710, 64707, 64745, 64744, 64716, 64726, 64717, 64719};
        getSDKTransactionID = -185467590;
        AuthenticationRequestParameters = true;
        getDeviceData = true;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0583 A[PHI: r21
      0x0583: PHI (r21v30 int) = 
      (r21v4 int)
      (r21v5 int)
      (r21v7 int)
      (r21v8 int)
      (r21v13 int)
      (r21v20 int)
      (r21v22 int)
      (r21v27 int)
      (r21v31 int)
     binds: [B:135:0x058f, B:132:0x0575, B:127:0x055d, B:125:0x0547, B:102:0x0446, B:124:0x0543, B:73:0x02c3, B:42:0x01db, B:26:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static KeyPair AuthenticationRequestParameters(AuthenticationRequestParameters authenticationRequestParameters) {
        int i11;
        int i12;
        int iIntValue;
        Object objAuthenticationRequestParameters;
        ChallengeResultCancelled challengeResultCancelled = new ChallengeResultCancelled(authenticationRequestParameters);
        byte[] bArr = getMessageVersion;
        char c11 = 5;
        short s11 = bArr[5];
        byte b11 = bArr[465];
        short s12 = (short) EnumC4419g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE;
        Object[] objArr = new Object[1];
        b(s11, b11, s12, objArr);
        int i13 = 0;
        String str = (String) objArr[0];
        Object[] objArr2 = new Object[1];
        b(s12, bArr[354], bArr[5], objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c12 = 15;
            char c13 = 23;
            Object[] objArr4 = new Object[1];
            b(s12, bArr[15], bArr[23], objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b((short) 308, bArr[113], bArr[46], objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            b(s12, bArr[15], bArr[23], objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i14 = 0;
            while (i14 < objArr7.length) {
                try {
                    Object[] objArr8 = {objArr7[i14]};
                    int i15 = BuildConfig;
                    char c14 = c11;
                    short s13 = (short) (i15 | EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE);
                    byte[] bArr2 = getMessageVersion;
                    char c15 = c12;
                    char c16 = c13;
                    Object[] objArr9 = new Object[1];
                    b(s13, bArr2[c15], bArr2[25], objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    b((short) EnumC4419g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, bArr2[c14], bArr2[6], objArr10);
                    String str3 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b(s12, bArr2[c15], bArr2[c16], objArr11);
                    Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr11[0])).invoke(null, objArr8);
                    try {
                        Object[] objArr12 = new Object[1];
                        b((short) (i15 | EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE), bArr2[c15], bArr2[25], objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        b((short) 334, bArr2[18], bArr2[64], objArr13);
                        iArr[i14] = ((Integer) cls3.getMethod((String) objArr13[0], null).invoke(objInvoke, null)).intValue();
                        i14++;
                        c11 = c14;
                        c12 = c15;
                        c13 = c16;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th3;
                }
            }
            char c17 = c12;
            char c18 = c13;
            int i16 = 0;
            while (true) {
                int i17 = i16 + 1;
                try {
                    switch (challengeResultCancelled.AuthenticationRequestParameters(iArr[i16])) {
                        case -39:
                            i16 = 87;
                            break;
                        case -38:
                            i11 = i13;
                            challengeResultCancelled.AuthenticationRequestParameters(32);
                            i16 = challengeResultCancelled.getSDKAppID != 0 ? 63 : 1;
                            i13 = i11;
                            break;
                        case -37:
                            i16 = 52;
                            break;
                        case -36:
                            i16 = 86;
                            break;
                        case -35:
                            i11 = i13;
                            challengeResultCancelled.AuthenticationRequestParameters(31);
                            if (challengeResultCancelled.getSDKAppID == 0) {
                                i16 = 85;
                            } else {
                                i16 = i17;
                            }
                            i13 = i11;
                            break;
                        case -34:
                            i11 = i13;
                            challengeResultCancelled.getDeviceData = 1;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(4);
                            ChallengeResult = challengeResultCancelled.getSDKAppID;
                            i16 = i17;
                            i13 = i11;
                            break;
                        case -33:
                            i11 = i13;
                            iIntValue = getSDKEphemeralPublicKey;
                            challengeResultCancelled.getDeviceData = iIntValue;
                            challengeResultCancelled.AuthenticationRequestParameters(14);
                            i16 = i17;
                            i13 = i11;
                            break;
                        case -32:
                            i16 = 88;
                            break;
                        case -31:
                            i16 = 90;
                            break;
                        case -30:
                            i11 = i13;
                            challengeResultCancelled.AuthenticationRequestParameters(25);
                            if (challengeResultCancelled.getSDKAppID == 0) {
                                i16 = 62;
                            } else {
                                i16 = i17;
                            }
                            i13 = i11;
                            break;
                        case -29:
                            i11 = i13;
                            challengeResultCancelled.getDeviceData = 1;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(4);
                            getSDKEphemeralPublicKey = challengeResultCancelled.getSDKAppID;
                            i16 = i17;
                            i13 = i11;
                            break;
                        case -28:
                            i11 = i13;
                            iIntValue = ChallengeResult;
                            challengeResultCancelled.getDeviceData = iIntValue;
                            challengeResultCancelled.AuthenticationRequestParameters(14);
                            i16 = i17;
                            i13 = i11;
                            break;
                        case -27:
                            challengeResultCancelled.AuthenticationRequestParameters(11);
                            return (KeyPair) challengeResultCancelled.getSDKEphemeralPublicKey;
                        case -26:
                            i16 = 54;
                            break;
                        case -25:
                            i11 = i13;
                            challengeResultCancelled.getDeviceData = 1;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            objAuthenticationRequestParameters = ((atd.ad.AuthenticationRequestParameters) challengeResultCancelled.getSDKEphemeralPublicKey).AuthenticationRequestParameters();
                            try {
                                challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                                challengeResultCancelled.AuthenticationRequestParameters(1);
                                i16 = i17;
                            } catch (Throwable th4) {
                                th = th4;
                                short s14 = (short) 628;
                                byte[] bArr3 = getMessageVersion;
                                byte b12 = bArr3[c17];
                                int i18 = BuildConfig;
                                Object[] objArr14 = new Object[1];
                                b(s14, b12, (short) (i18 - 3), objArr14);
                                boolean zIsInstance = Class.forName((String) objArr14[i11]).isInstance(th);
                                int i19 = 45;
                                if (!zIsInstance || i17 < 1 || i17 > 13) {
                                    Object[] objArr15 = new Object[1];
                                    b(s14, bArr3[c17], (short) (i18 - 3), objArr15);
                                    if (!Class.forName((String) objArr15[i11]).isInstance(th) || i17 < 13 || i17 > 19) {
                                        Object[] objArr16 = new Object[1];
                                        b(s14, bArr3[c17], (short) (i18 - 3), objArr16);
                                        if (!Class.forName((String) objArr16[i11]).isInstance(th) || i17 < 19 || i17 > 22) {
                                            Object[] objArr17 = new Object[1];
                                            b(s14, bArr3[c17], (short) (i18 - 3), objArr17);
                                            if (!Class.forName((String) objArr17[i11]).isInstance(th) || i17 < 22) {
                                                i12 = 24;
                                            } else {
                                                i12 = 24;
                                                if (i17 > 24) {
                                                }
                                            }
                                            if (i17 < i12 || i17 > 41) {
                                                Object[] objArr18 = new Object[1];
                                                b(s14, bArr3[c17], (short) (i18 - 3), objArr18);
                                                if (!Class.forName((String) objArr18[i11]).isInstance(th) || i17 < 24 || i17 > 45) {
                                                    short s15 = (short) (i18 - 3);
                                                    Object[] objArr19 = new Object[1];
                                                    b(s14, bArr3[c17], s15, objArr19);
                                                    if (!Class.forName((String) objArr19[i11]).isInstance(th) || i17 < 63 || i17 > 75) {
                                                        throw th;
                                                    }
                                                }
                                            } else {
                                                i19 = 13;
                                            }
                                        }
                                    }
                                }
                                challengeResultCancelled.BuildConfig = th;
                                challengeResultCancelled.AuthenticationRequestParameters(34);
                                i16 = i19;
                            }
                            i13 = i11;
                            break;
                        case -24:
                            i11 = i13;
                            objAuthenticationRequestParameters = atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE;
                            challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                            challengeResultCancelled.AuthenticationRequestParameters(1);
                            i16 = i17;
                            i13 = i11;
                            break;
                        case -23:
                            i16 = 75;
                            break;
                        case -22:
                            i11 = i13;
                            challengeResultCancelled.getDeviceData = 1;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            Object obj = challengeResultCancelled.getSDKEphemeralPublicKey;
                            try {
                                short s16 = (short) (BuildConfig | 468);
                                byte[] bArr4 = getMessageVersion;
                                Object[] objArr20 = new Object[1];
                                b(s16, bArr4[c17], bArr4[325], objArr20);
                                Class<?> cls4 = Class.forName((String) objArr20[i11]);
                                Object[] objArr21 = new Object[1];
                                b((short) 614, bArr4[c18], bArr4[12], objArr21);
                                objAuthenticationRequestParameters = cls4.getMethod((String) objArr21[i11], null).invoke(obj, null);
                                challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                                challengeResultCancelled.AuthenticationRequestParameters(1);
                                i16 = i17;
                                i13 = i11;
                            } catch (Throwable th5) {
                                Throwable cause3 = th5.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th5;
                            }
                            break;
                        case -21:
                            i11 = i13;
                            challengeResultCancelled.getDeviceData = 3;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            Object obj2 = challengeResultCancelled.getSDKEphemeralPublicKey;
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            Object obj3 = challengeResultCancelled.getSDKEphemeralPublicKey;
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            try {
                                Object[] objArr22 = new Object[2];
                                objArr22[1] = challengeResultCancelled.getSDKEphemeralPublicKey;
                                objArr22[i11] = obj3;
                                int i21 = BuildConfig;
                                byte[] bArr5 = getMessageVersion;
                                Object[] objArr23 = new Object[1];
                                b((short) (i21 | 468), bArr5[c17], bArr5[325], objArr23);
                                Class<?> cls5 = Class.forName((String) objArr23[i11]);
                                Object[] objArr24 = new Object[1];
                                b((short) 540, bArr5[18], bArr5[4], objArr24);
                                String str4 = (String) objArr24[i11];
                                Object[] objArr25 = new Object[1];
                                b((short) 549, bArr5[c17], (short) i21, objArr25);
                                Class<?> cls6 = Class.forName((String) objArr25[i11]);
                                Object[] objArr26 = new Object[1];
                                b((short) 589, bArr5[c17], bArr5[365], objArr26);
                                cls5.getMethod(str4, cls6, Class.forName((String) objArr26[i11])).invoke(obj2, objArr22);
                                i16 = i17;
                                i13 = i11;
                            } catch (Throwable th6) {
                                Throwable cause4 = th6.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th6;
                            }
                            break;
                        case -20:
                            i11 = i13;
                            challengeResultCancelled.getDeviceData = 1;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            objAuthenticationRequestParameters = challengeResultCancelled.getSDKEphemeralPublicKey;
                            challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                            challengeResultCancelled.AuthenticationRequestParameters(1);
                            i16 = i17;
                            i13 = i11;
                            break;
                        case -19:
                            i11 = i13;
                            challengeResultCancelled.getDeviceData = 2;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            Object obj4 = challengeResultCancelled.getSDKEphemeralPublicKey;
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            try {
                                Object[] objArr27 = {challengeResultCancelled.getSDKEphemeralPublicKey};
                                byte[] bArr6 = getMessageVersion;
                                Object[] objArr28 = new Object[1];
                                b((short) 452, bArr6[c17], bArr6[337], objArr28);
                                Class<?> cls7 = Class.forName((String) objArr28[i11]);
                                Object[] objArr29 = new Object[1];
                                b((short) 480, bArr6[82], bArr6[7], objArr29);
                                String str5 = (String) objArr29[i11];
                                Object[] objArr30 = new Object[1];
                                b((short) (BuildConfig | 450), (byte) (bArr6[337] - 1), bArr6[303], objArr30);
                                objAuthenticationRequestParameters = cls7.getMethod(str5, Class.forName((String) objArr30[i11])).invoke(obj4, objArr27);
                                challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                                challengeResultCancelled.AuthenticationRequestParameters(1);
                                i16 = i17;
                                i13 = i11;
                            } catch (Throwable th7) {
                                Throwable cause5 = th7.getCause();
                                if (cause5 != null) {
                                    throw cause5;
                                }
                                throw th7;
                            }
                            break;
                        case -18:
                            i11 = i13;
                            challengeResultCancelled.getDeviceData = 2;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            Class cls8 = (Class) challengeResultCancelled.getSDKEphemeralPublicKey;
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            objAuthenticationRequestParameters = cls8.getDeclaredConstructor((Class[]) challengeResultCancelled.getSDKEphemeralPublicKey);
                            challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                            challengeResultCancelled.AuthenticationRequestParameters(1);
                            i16 = i17;
                            i13 = i11;
                            break;
                        case -17:
                            i11 = i13;
                            challengeResultCancelled.getDeviceData = 1;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            objAuthenticationRequestParameters = Class.forName((String) challengeResultCancelled.getSDKEphemeralPublicKey);
                            challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                            challengeResultCancelled.AuthenticationRequestParameters(1);
                            i16 = i17;
                            i13 = i11;
                            break;
                        case -16:
                            i11 = i13;
                            challengeResultCancelled.getDeviceData = 4;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            String str6 = (String) challengeResultCancelled.getSDKEphemeralPublicKey;
                            challengeResultCancelled.AuthenticationRequestParameters(4);
                            int i22 = challengeResultCancelled.getSDKAppID;
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            int[] iArr2 = (int[]) challengeResultCancelled.getSDKEphemeralPublicKey;
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            Object[] objArr31 = new Object[1];
                            c(str6, i22, iArr2, (String) challengeResultCancelled.getSDKEphemeralPublicKey, objArr31);
                            objAuthenticationRequestParameters = (String) objArr31[i11];
                            challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                            challengeResultCancelled.AuthenticationRequestParameters(1);
                            i16 = i17;
                            i13 = i11;
                            break;
                        case -15:
                            i11 = i13;
                            objAuthenticationRequestParameters = "\u0092\u0091\u0090\u008f\u0082\u008e\u0086\u0089\u0088\u0087\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081";
                            challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                            challengeResultCancelled.AuthenticationRequestParameters(1);
                            i16 = i17;
                            i13 = i11;
                            break;
                        case -14:
                            i11 = i13;
                            challengeResultCancelled.getDeviceData = 2;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(4);
                            int i23 = challengeResultCancelled.getSDKAppID;
                            challengeResultCancelled.AuthenticationRequestParameters(4);
                            try {
                                Object[] objArr32 = new Object[2];
                                objArr32[1] = Integer.valueOf(challengeResultCancelled.getSDKAppID);
                                objArr32[i11] = Integer.valueOf(i23);
                                short s17 = (short) WalletConstants.ERROR_CODE_INVALID_TRANSACTION;
                                byte[] bArr7 = getMessageVersion;
                                Object[] objArr33 = new Object[1];
                                b(s17, (byte) (-bArr7[625]), bArr7[337], objArr33);
                                Class<?> cls9 = Class.forName((String) objArr33[i11]);
                                Object[] objArr34 = new Object[1];
                                b((short) 438, bArr7[4], bArr7[12], objArr34);
                                String str7 = (String) objArr34[i11];
                                Class cls10 = Integer.TYPE;
                                iIntValue = ((Integer) cls9.getMethod(str7, cls10, cls10).invoke(null, objArr32)).intValue();
                                challengeResultCancelled.getDeviceData = iIntValue;
                                challengeResultCancelled.AuthenticationRequestParameters(14);
                                i16 = i17;
                                i13 = i11;
                            } catch (Throwable th8) {
                                Throwable cause6 = th8.getCause();
                                if (cause6 != null) {
                                    throw cause6;
                                }
                                throw th8;
                            }
                            break;
                        case -13:
                            challengeResultCancelled.AuthenticationRequestParameters(11);
                            throw ((Throwable) challengeResultCancelled.getSDKEphemeralPublicKey);
                        case -12:
                            i16 = 22;
                            break;
                        case -11:
                            i16 = 19;
                            break;
                        case -10:
                            i11 = i13;
                            challengeResultCancelled.AuthenticationRequestParameters(9);
                            if (challengeResultCancelled.getSDKAppID == 0) {
                                i16 = 18;
                            } else {
                                i16 = i17;
                            }
                            i13 = i11;
                            break;
                        case -9:
                            i11 = i13;
                            challengeResultCancelled.getDeviceData = 1;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            Object obj5 = challengeResultCancelled.getSDKEphemeralPublicKey;
                            short s18 = (short) 385;
                            try {
                                byte[] bArr8 = getMessageVersion;
                                Object[] objArr35 = new Object[1];
                                b(s18, bArr8[c17], bArr8[303], objArr35);
                                Class<?> cls11 = Class.forName((String) objArr35[i11]);
                                Object[] objArr36 = new Object[1];
                                b((short) DownloaderService.STATUS_FORBIDDEN, bArr8[c18], bArr8[64], objArr36);
                                objAuthenticationRequestParameters = cls11.getMethod((String) objArr36[i11], null).invoke(obj5, null);
                                challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                                challengeResultCancelled.AuthenticationRequestParameters(1);
                                i16 = i17;
                                i13 = i11;
                            } catch (Throwable th9) {
                                Throwable cause7 = th9.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th9;
                            }
                            break;
                        case -8:
                            i16 = 24;
                            break;
                        case -7:
                            i11 = i13;
                            challengeResultCancelled.getDeviceData = 1;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            objAuthenticationRequestParameters = ((AuthenticationRequestParameters) challengeResultCancelled.getSDKEphemeralPublicKey).getSDKAppID();
                            challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                            challengeResultCancelled.AuthenticationRequestParameters(1);
                            i16 = i17;
                            i13 = i11;
                            break;
                        case BaseResp.ErrCode.ERR_BAN /* -6 */:
                            i11 = i13;
                            challengeResultCancelled.getDeviceData = 1;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            try {
                                Object[] objArr37 = {challengeResultCancelled.getSDKEphemeralPublicKey};
                                byte[] bArr9 = getMessageVersion;
                                Object[] objArr38 = new Object[1];
                                b((short) 346, bArr9[c17], bArr9[432], objArr38);
                                Class<?> cls12 = Class.forName((String) objArr38[i11]);
                                Object[] objArr39 = new Object[1];
                                b((short) 375, bArr9[c18], bArr9[7], objArr39);
                                String str8 = (String) objArr39[i11];
                                Object[] objArr40 = new Object[1];
                                b(s12, bArr9[c17], bArr9[c18], objArr40);
                                objAuthenticationRequestParameters = cls12.getMethod(str8, Class.forName((String) objArr40[i11])).invoke(null, objArr37);
                                challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                                challengeResultCancelled.AuthenticationRequestParameters(1);
                                i16 = i17;
                                i13 = i11;
                            } catch (Throwable th10) {
                                Throwable cause8 = th10.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th10;
                            }
                            break;
                        case BaseResp.ErrCode.ERR_UNSUPPORT /* -5 */:
                            challengeResultCancelled.getDeviceData = 1;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            Object obj6 = challengeResultCancelled.getSDKEphemeralPublicKey;
                            try {
                                byte[] bArr10 = getMessageVersion;
                                Object[] objArr41 = new Object[1];
                                b(s12, bArr10[c17], bArr10[c18], objArr41);
                                Class<?> cls13 = Class.forName((String) objArr41[i13]);
                                i11 = i13;
                                try {
                                    Object[] objArr42 = new Object[1];
                                    b((short) 341, bArr10[18], bArr10[50], objArr42);
                                    objAuthenticationRequestParameters = cls13.getMethod((String) objArr42[i11], null).invoke(obj6, null);
                                    challengeResultCancelled.BuildConfig = objAuthenticationRequestParameters;
                                    challengeResultCancelled.AuthenticationRequestParameters(1);
                                    i16 = i17;
                                    i13 = i11;
                                } catch (Throwable th11) {
                                    th = th11;
                                    Throwable cause9 = th.getCause();
                                    if (cause9 != null) {
                                        throw cause9;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                            }
                            break;
                        case BaseResp.ErrCode.ERR_AUTH_DENIED /* -4 */:
                            challengeResultCancelled.getDeviceData = 3;
                            challengeResultCancelled.AuthenticationRequestParameters(2);
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            String str9 = (String) challengeResultCancelled.getSDKEphemeralPublicKey;
                            challengeResultCancelled.AuthenticationRequestParameters(3);
                            int[] iArr3 = (int[]) challengeResultCancelled.getSDKEphemeralPublicKey;
                            challengeResultCancelled.AuthenticationRequestParameters(4);
                            Object[] objArr43 = new Object[1];
                            a(str9, iArr3, challengeResultCancelled.getSDKAppID != 0 ? 1 : i13, objArr43);
                            challengeResultCancelled.BuildConfig = (String) objArr43[i13];
                            challengeResultCancelled.AuthenticationRequestParameters(1);
                            i11 = i13;
                            i16 = i17;
                            i13 = i11;
                            break;
                        case -3:
                            challengeResultCancelled.BuildConfig = new int[]{i13, 2, i13, 1};
                            challengeResultCancelled.AuthenticationRequestParameters(1);
                            i11 = i13;
                            i16 = i17;
                            i13 = i11;
                            break;
                        case -2:
                            challengeResultCancelled.BuildConfig = "\u0001\u0000";
                            challengeResultCancelled.AuthenticationRequestParameters(1);
                            i11 = i13;
                            i16 = i17;
                            i13 = i11;
                            break;
                        case -1:
                            i16 = 49;
                            break;
                        default:
                            i11 = i13;
                            i16 = i17;
                            i13 = i11;
                            break;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    i11 = i13;
                }
            }
        } catch (Throwable th14) {
            Throwable cause10 = th14.getCause();
            if (cause10 != null) {
                throw cause10;
            }
            throw th14;
        }
    }
}
