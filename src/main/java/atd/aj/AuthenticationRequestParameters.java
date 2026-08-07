package atd.aj;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.completed;
import atd.az.getTransactionStatus;
import atd.json.BuildConfig;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationRequestParameters implements com.adyen.threeds2.AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] BuildConfig;
    private static long ChallengeResult;
    private static int ChallengeResultCancelled;
    private static char getMessageVersion;
    private static int getTransactionStatus;
    private String AuthenticationRequestParameters;
    private String getDeviceData;
    private String getSDKAppID;
    private String getSDKEphemeralPublicKey;
    private String getSDKReferenceNumber;
    private String getSDKTransactionID;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        ChallengeResultCancelled = 0;
        getTransactionStatus = 1;
        BuildConfig = new char[]{52397, 52478, 52378, 52410, 52400, 52451, 52466, 52358, 52405, 52363, 52459, 52365, 52402, 52409, 52403, 52412, 53060, 52396, 52375, 52415, 52404, 52393, 52455, 52401, 52407, 53056, 52392, 53061, 52395, 52464, 52414, 52394, 52462, 52383, 52366, 52371, 52406, 52368, 53062, 53063, 52391, 52398, 52369, 52399, 52411, 52381, 52408, 52390, 52413};
        getMessageVersion = (char) 63811;
        ChallengeResult = -8564029433161079968L;
    }

    public AuthenticationRequestParameters(String str, String str2, String str3, String str4, String str5, String str6) throws Throwable {
        BuildConfig.getSDKTransactionID(str, atd.ad.getDeviceData.SDK_TRANSACTION_ID);
        BuildConfig.getSDKTransactionID(str2, atd.ad.getDeviceData.DEVICE_DATA);
        BuildConfig.getSDKTransactionID(str3, atd.ad.getDeviceData.SDK_EPHEMERAL_PUBLIC_KEY);
        BuildConfig.getSDKTransactionID(str4, atd.ad.getDeviceData.SDK_APP_ID);
        BuildConfig.getSDKTransactionID(str5, atd.ad.getDeviceData.SDK_REFERENCE_NUMBER);
        BuildConfig.getSDKTransactionID(str6, atd.ad.getDeviceData.MESSAGE_VERSION);
        this.getSDKReferenceNumber = str;
        this.getSDKTransactionID = str2;
        this.getSDKAppID = str3;
        this.getDeviceData = str4;
        this.AuthenticationRequestParameters = str5;
        this.getSDKEphemeralPublicKey = str6;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getTransactionStatus;
        int i12 = ((i11 ^ 33) | (i11 & 33)) << 1;
        int i13 = -((i11 & (-34)) | ((~i11) & 33));
        int i14 = (i12 & i13) + (i12 | i13);
        ChallengeResultCancelled = i14 % 128;
        int i15 = i14 % 2;
        String str = authenticationRequestParameters.getDeviceData;
        if (i15 != 0) {
            int i16 = 17 / 0;
        }
        ChallengeResultCancelled = (i11 + 19) % 128;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 21
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r1 = atd.aj.AuthenticationRequestParameters.$$a
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r7 = r7 + 20
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r8 = r8 + r3
            int r6 = r6 + 1
            int r8 = r8 + 3
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.AuthenticationRequestParameters.a(short, int, byte, java.lang.Object[]):void");
    }

    private static void b(byte b11, int i11, String str, Object[] objArr) throws Throwable {
        int i12;
        char c11;
        int i13;
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] cArr = BuildConfig;
        Class cls = Integer.TYPE;
        int i14 = 2;
        int i15 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                int i17 = $11 + 35;
                $10 = i17 % 128;
                if (i17 % i14 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i16])};
                        Map map = getMessageVersion.timedout;
                        Object method = map.get(-1709775791);
                        if (method != null) {
                            i13 = i15;
                        } else {
                            Class cls2 = (Class) getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2312, (char) TextUtils.getCapsMode("", i15, i15), 24 - Color.blue(i15));
                            byte b12 = (byte) i15;
                            i13 = i15;
                            Object[] objArr3 = new Object[1];
                            d(b12, (byte) (b12 | 55), b12, objArr3);
                            method = cls2.getMethod((String) objArr3[i13], cls);
                            map.put(-1709775791, method);
                        }
                        cArr2[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i14 = i14;
                        i15 = i13;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    int i18 = i14;
                    int i19 = i15;
                    Object[] objArr4 = {Integer.valueOf(cArr[i16])};
                    Map map2 = getMessageVersion.timedout;
                    Object method2 = map2.get(-1709775791);
                    if (method2 == null) {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2313, (char) (1 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23);
                        byte b13 = (byte) i19;
                        Object[] objArr5 = new Object[1];
                        d(b13, (byte) (b13 | 55), b13, objArr5);
                        method2 = cls3.getMethod((String) objArr5[i19], cls);
                        map2.put(-1709775791, method2);
                    }
                    cArr2[i16] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i16++;
                    i14 = i18;
                    i15 = 0;
                }
            }
            cArr = cArr2;
        }
        int i21 = i14;
        Object[] objArr6 = {Integer.valueOf(getMessageVersion)};
        Map map3 = getMessageVersion.timedout;
        Object method3 = map3.get(-1709775791);
        if (method3 == null) {
            Class cls4 = (Class) getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ExpandableListView.getPackedPositionType(0L), 25 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
            byte b14 = (byte) 0;
            Object[] objArr7 = new Object[1];
            d(b14, (byte) (b14 | 55), b14, objArr7);
            method3 = cls4.getMethod((String) objArr7[0], cls);
            map3.put(-1709775791, method3);
        }
        char cCharValue = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
        char[] cArr3 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr3[i12] = (char) (charArray[i12] - b11);
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            char c12 = 5;
            $11 = ($10 + 5) % 128;
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i22 = completedVar.getSDKTransactionID;
                if (i22 >= i12) {
                    break;
                }
                $10 = ($11 + 81) % 128;
                char c13 = charArray[i22];
                completedVar.getSDKAppID = c13;
                char c14 = charArray[i22 + 1];
                completedVar.getSDKReferenceNumber = c14;
                if (c13 == c14) {
                    cArr3[i22] = (char) (c13 - b11);
                    cArr3[i22 + 1] = (char) (c14 - b11);
                    c11 = c12;
                } else {
                    Object[] objArr8 = new Object[13];
                    objArr8[12] = completedVar;
                    objArr8[11] = Integer.valueOf(cCharValue);
                    objArr8[10] = completedVar;
                    objArr8[9] = completedVar;
                    objArr8[8] = Integer.valueOf(cCharValue);
                    objArr8[7] = completedVar;
                    objArr8[6] = completedVar;
                    objArr8[c12] = Integer.valueOf(cCharValue);
                    objArr8[4] = completedVar;
                    objArr8[3] = completedVar;
                    objArr8[i21] = Integer.valueOf(cCharValue);
                    objArr8[1] = completedVar;
                    objArr8[0] = completedVar;
                    c11 = c12;
                    Map map4 = getMessageVersion.timedout;
                    Object method4 = map4.get(700818725);
                    if (method4 == null) {
                        Class cls5 = (Class) getMessageVersion.getSDKTransactionID(1920 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) KeyEvent.getDeadChar(0, 0), 29 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr9 = new Object[1];
                        d(b15, b16, b16, objArr9);
                        String str2 = (String) objArr9[0];
                        Class cls6 = Integer.TYPE;
                        method4 = cls5.getMethod(str2, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class);
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
                        objArr10[c11] = completedVar;
                        objArr10[4] = completedVar;
                        objArr10[3] = Integer.valueOf(cCharValue);
                        objArr10[i21] = Integer.valueOf(cCharValue);
                        objArr10[1] = completedVar;
                        objArr10[0] = completedVar;
                        Object method5 = map4.get(-248084636);
                        if (method5 == null) {
                            Class cls7 = (Class) getMessageVersion.getSDKTransactionID(1721 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (48634 - Color.alpha(0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 24);
                            byte b17 = (byte) 0;
                            Object[] objArr11 = new Object[1];
                            d(b17, (byte) (b17 | 49), b17, objArr11);
                            String str3 = (String) objArr11[0];
                            Class cls8 = Integer.TYPE;
                            method5 = cls7.getMethod(str3, Object.class, Object.class, cls8, cls8, Object.class, Object.class, cls8, cls8, Object.class, cls8, Object.class);
                            map4.put(-248084636, method5);
                        }
                        int iIntValue2 = ((Integer) ((Method) method5).invoke(null, objArr10)).intValue();
                        int i24 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i25 = completedVar.getSDKTransactionID;
                        cArr3[i25] = cArr[iIntValue2];
                        cArr3[i25 + 1] = cArr[i24];
                    } else {
                        int i26 = completedVar.getDeviceData;
                        int i27 = completedVar.AuthenticationRequestParameters;
                        if (i26 == i27) {
                            int i28 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i28;
                            int i29 = ((i23 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i29;
                            int i31 = (i27 * cCharValue) + i29;
                            int i32 = completedVar.getSDKTransactionID;
                            cArr3[i32] = cArr[(i26 * cCharValue) + i28];
                            cArr3[i32 + 1] = cArr[i31];
                        } else {
                            int i33 = (i26 * cCharValue) + i23;
                            int i34 = (i27 * cCharValue) + completedVar.getMessageVersion;
                            int i35 = completedVar.getSDKTransactionID;
                            cArr3[i35] = cArr[i33];
                            cArr3[i35 + 1] = cArr[i34];
                        }
                    }
                }
                completedVar.getSDKTransactionID += 2;
                c12 = c11;
            }
        }
        int i36 = 0;
        while (i36 < i11) {
            cArr3[i36] = (char) (cArr3[i36] ^ 13722);
            i36++;
            $11 = ($10 + 63) % 128;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0239  */
    /* JADX WARN: Code duplicated, block: B:52:0x023a  */
    private static void c(String str, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        int i12;
        Object method;
        int i13 = $10 + 113;
        $11 = i13 % 128;
        int i14 = 2;
        if (i13 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = charArray.length;
        long[] jArr = new long[length];
        int i15 = 0;
        gettransactionstatus.getSDKTransactionID = 0;
        $11 = ($10 + 111) % 128;
        while (true) {
            int i16 = gettransactionstatus.getSDKTransactionID;
            if (i16 >= charArray.length) {
                break;
            }
            int i17 = $11 + 121;
            $10 = i17 % 128;
            int i18 = i17 % i14;
            Class cls = Integer.TYPE;
            int i19 = i14;
            if (i18 != 0) {
                char c11 = charArray[i16];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[i19] = gettransactionstatus;
                    objArr2[1] = gettransactionstatus;
                    objArr2[i15] = Integer.valueOf(c11);
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(962978490);
                    if (obj != null) {
                        i12 = i15;
                        method = obj;
                    } else {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(689 - TextUtils.getOffsetBefore("", i15), (char) (16022 - View.MeasureSpec.makeMeasureSpec(i15, i15)), 32 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        byte length2 = (byte) $$d.length;
                        i12 = i15;
                        Object[] objArr3 = new Object[1];
                        d((byte) i15, length2, (byte) (length2 - 4), objArr3);
                        method = cls2.getMethod((String) objArr3[i12], cls, Object.class, Object.class);
                        map.put(962978490, method);
                    }
                    jArr[i16] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() & ChallengeResult & (-2227742522694838850L);
                    Object[] objArr4 = new Object[i19];
                    objArr4[1] = gettransactionstatus;
                    objArr4[i12] = gettransactionstatus;
                    Object method2 = map.get(-46730980);
                    if (method2 == null) {
                        method2 = ((Class) getMessageVersion.getSDKTransactionID(417 - (CdmaCellLocation.convertQuartSecToDecDegrees(i12) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i12) == 0.0d ? 0 : -1)), (char) (29017 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("A", Object.class, Object.class);
                        map.put(-46730980, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                    i15 = i12;
                    jArr = jArr;
                    i14 = 2;
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
            } else {
                long[] jArr2 = jArr;
                int i21 = i15;
                char c12 = charArray[i16];
                Object[] objArr5 = new Object[3];
                objArr5[2] = gettransactionstatus;
                objArr5[1] = gettransactionstatus;
                objArr5[i21] = Integer.valueOf(c12);
                Map map2 = getMessageVersion.timedout;
                Object method3 = map2.get(962978490);
                if (method3 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForChild(i21, i21) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i21, i21) == 0L ? 0 : -1)) + 690, (char) (16022 - (ViewConfiguration.getEdgeSlop() >> 16)), 32 - (KeyEvent.getMaxKeyCode() >> 16));
                    byte length3 = (byte) $$d.length;
                    Object[] objArr6 = new Object[1];
                    d((byte) 0, length3, (byte) (length3 - 4), objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], cls, Object.class, Object.class);
                    map2.put(962978490, method3);
                }
                jArr2[i16] = ((Long) ((Method) method3).invoke(null, objArr5)).longValue() ^ (ChallengeResult ^ (-2227742522694838850L));
                Object[] objArr7 = {gettransactionstatus, gettransactionstatus};
                Object method4 = map2.get(-46730980);
                if (method4 == null) {
                    method4 = ((Class) getMessageVersion.getSDKTransactionID(TextUtils.getTrimmedLength("") + 417, (char) (29065 - AndroidCharacter.getMirror('0')), ((Process.getThreadPriority(0) + 20) >> 6) + 24)).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                jArr = jArr2;
                i14 = 2;
                i15 = 0;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        long[] jArr3 = jArr;
        char[] cArr = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i22 = gettransactionstatus.getSDKTransactionID;
            if (i22 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i22] = (char) jArr3[i22];
            Object[] objArr8 = {gettransactionstatus, gettransactionstatus};
            Map map3 = getMessageVersion.timedout;
            Object method5 = map3.get(-46730980);
            if (method5 == null) {
                method5 = ((Class) getMessageVersion.getSDKTransactionID(417 - KeyEvent.getDeadChar(0, 0), (char) (29017 - (ViewConfiguration.getPressedStateDuration() >> 16)), 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("A", Object.class, Object.class);
                map3.put(-46730980, method5);
            }
            ((Method) method5).invoke(null, objArr8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = atd.aj.AuthenticationRequestParameters.$$d
            int r8 = 122 - r8
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r9 = r9 * 2
            int r9 = 3 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r8 = r7
            r3 = r0
            r4 = r2
            r0 = r9
            goto L2e
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
            r6 = r0
            r0 = r9
            r9 = r3
            r3 = r6
        L2e:
            int r9 = -r9
            int r8 = r8 + r9
            r9 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.AuthenticationRequestParameters.d(int, int, short, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getTransactionStatus;
        int i12 = i11 + 60;
        ChallengeResultCancelled = ((i12 ^ (-1)) + (i12 << 1)) % 128;
        String str = authenticationRequestParameters.getSDKReferenceNumber;
        int i13 = i11 + 27;
        ChallengeResultCancelled = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 84 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object getMessageVersion(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = ChallengeResultCancelled;
        getTransactionStatus = ((i11 ^ 89) + ((i11 & 89) << 1)) % 128;
        String str = authenticationRequestParameters.getSDKTransactionID;
        int i12 = ((i11 ^ 11) - (~((i11 & 11) << 1))) - 1;
        getTransactionStatus = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getTransactionStatus;
        int i12 = (i11 & (-54)) | ((~i11) & 53);
        int i13 = -(-((i11 & 53) << 1));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        ChallengeResultCancelled = i14 % 128;
        int i15 = i14 % 2;
        String str = authenticationRequestParameters.AuthenticationRequestParameters;
        if (i15 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getTransactionStatus + 83;
        int i12 = i11 % 128;
        ChallengeResultCancelled = i12;
        if (i11 % 2 != 0) {
            authenticationRequestParameters.getSDKReferenceNumber = null;
            authenticationRequestParameters.getSDKTransactionID = null;
            authenticationRequestParameters.getSDKAppID = null;
            authenticationRequestParameters.getDeviceData = null;
            authenticationRequestParameters.AuthenticationRequestParameters = null;
            authenticationRequestParameters.getSDKEphemeralPublicKey = null;
            throw null;
        }
        authenticationRequestParameters.getSDKReferenceNumber = null;
        authenticationRequestParameters.getSDKTransactionID = null;
        authenticationRequestParameters.getSDKAppID = null;
        authenticationRequestParameters.getDeviceData = null;
        authenticationRequestParameters.AuthenticationRequestParameters = null;
        authenticationRequestParameters.getSDKEphemeralPublicKey = null;
        int i13 = i12 & 109;
        int i14 = (((i12 ^ 109) | i13) << 1) - ((~i13) & (i12 | 109));
        getTransactionStatus = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 62 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i12;
        switch ((i11 * 367) + (i12 * 367) + ((i11 | i12) * (-366)) + (((~(i14 | i13)) | i11) * (-366)) + (((~(i11 | i14 | i13)) | (~(i12 | (~i11)))) * 366)) {
            case 1:
                return getDeviceData(objArr);
            case 2:
                return getSDKReferenceNumber(objArr);
            case 3:
                return getSDKTransactionID(objArr);
            case 4:
                return AuthenticationRequestParameters(objArr);
            case 5:
                return getSDKAppID(objArr);
            case 6:
                return getMessageVersion(objArr);
            default:
                AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
                int i15 = getTransactionStatus;
                int i16 = i15 ^ 69;
                int i17 = ((i15 & 69) | i16) << 1;
                int i18 = -i16;
                int i19 = ((i17 & i18) + (i17 | i18)) % 128;
                ChallengeResultCancelled = i19;
                String str = authenticationRequestParameters.getSDKEphemeralPublicKey;
                int i21 = i19 ^ 71;
                getTransactionStatus = ((((i19 & 71) | i21) << 1) - i21) % 128;
                return str;
        }
    }

    static void init$0() {
        $$a = new byte[]{75, 126, 55, 101, -5, 12, -36, -18, 4, 4, Tnaf.POW_2_WIDTH, -2, -4, 10, -16, 6, -14, -1, -26, 36, -11, -14, 0, 10};
        $$b = 125;
    }

    static void init$1() {
        $$d = new byte[]{87, -43, 119, -41};
        $$e = EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE;
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public final String getSDKEphemeralPublicKey() {
        return (String) getSDKTransactionID(new Object[]{this}, 1923818567, -1923818564, System.identityHashCode(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v10 */
    /* JADX WARN: Type inference failed for: r30v15, types: [int] */
    /* JADX WARN: Type inference failed for: r30v16 */
    /* JADX WARN: Type inference failed for: r30v19, types: [int] */
    /* JADX WARN: Type inference failed for: r30v20 */
    /* JADX WARN: Type inference failed for: r30v21 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v9 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v76, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v66 */
    public static Object[] getDeviceData(Context context, int i11, int i12) throws Throwable {
        ?? r31;
        Class<String> cls = String.class;
        int i13 = 0;
        Class cls2 = Integer.TYPE;
        try {
            if (context == null) {
                Object[] objArr = {new int[]{i11}, new int[]{i11}, null, new int[1]};
                int i14 = ~i11;
                ?? r11 = {Integer.valueOf(i12), 0, Integer.valueOf(343064215 + (((~((-600010487) | i14)) | (-448958286) | (~(600010486 | i11))) * (-564)) + ((~(i11 | (-402686218))) * 1128) + (((~((-448958286) | i14)) | (-1002696704)) * 564))};
                Map map = getMessageVersion.timedout;
                Object method = map.get(552468314);
                if (method == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getDoubleTapTimeout() >> 16) + 2244, (char) (46664 - View.resolveSizeAndState(0, 0, 0)), Color.green(0) + 26);
                    byte b11 = $$a[22];
                    byte b12 = b11;
                    Object[] objArr2 = new Object[1];
                    a(b11, b12, b12, objArr2);
                    method = cls3.getMethod((String) objArr2[0], cls2, cls2, cls2);
                    map.put(552468314, method);
                }
                ((int[]) objArr[3])[0] = ((Integer) ((Method) method).invoke(null, r11)).intValue();
                return objArr;
            }
            try {
                int i15 = -ExpandableListView.getPackedPositionGroup(0L);
                int i16 = i15 * 450;
                int i17 = 3;
                int i18 = ((i16 | (-27328)) << 1) - (i16 ^ (-27328));
                int i19 = ~i15;
                int i21 = ~((i19 ^ 61) | (i19 & 61));
                int i22 = ~(((-62) ^ i15) | ((-62) & i15) | i11);
                int i23 = (i18 - (~(-(-(((i21 ^ i22) | (i22 & i21)) * 449))))) - 1;
                int i24 = i21 * (-1347);
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                int i26 = ~((~i15) | 61);
                int i27 = ~i11;
                int i28 = ((-62) ^ i27) | ((-62) & i27);
                int i29 = -(-(((~((i28 ^ i15) | (i28 & i15))) | i26) * 449));
                Object[] objArr3 = new Object[1];
                b((byte) (((i25 | i29) << 1) - (i25 ^ i29)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 37, "\u000e\u0014!\u001a+!\u0002**\"\u0018\u001f!&!\u000f\u001d +$-\f㗧㗧\u001c\b\u000b\u001f!\u001c\u0018\u001f\u0006.\u001b&\u001a\u0013", objArr3);
                Object[] objArr4 = (Object[]) Array.newInstance(Class.forName((String) objArr3[0]), 2);
                int i31 = -Process.getGidForName("");
                int i32 = (i11 ^ 103) | (i11 & 103);
                int i33 = ~i31;
                int i34 = (((i31 * 628) + 64684) - (~(-(-(((i32 ^ i33) | (i32 & i33)) * (-627)))))) - 1;
                int i35 = ~((-104) | i11);
                int i36 = ((i31 ^ i35) | (i35 & i31)) * (-627);
                int i37 = ((i34 | i36) << 1) - (i34 ^ i36);
                int i38 = ~i11;
                int i39 = ~(i38 | 103);
                int i41 = ~((i31 ^ i11) | (i31 & i11));
                int i42 = -(-(((i39 ^ i41) | (i41 & i39)) * 627));
                Object[] objArr5 = new Object[1];
                b((byte) (((i37 | i42) << 1) - (i37 ^ i42)), 16777246 - (~Color.rgb(0, 0, 0)), ",&\f(\u0005\u0004\u0010\u0018\u001f\n\u0002\u0003+\u0010\"\u0007\u00000\f(\u0005\u0004\u0010\u0018\u001f\n\u00030\u0002\f㘱", objArr5);
                try {
                    try {
                        Object[] objArr6 = {(String) objArr5[0]};
                        int i43 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                        int i44 = (i43 * 784) - 47702;
                        int i45 = ((i44 | 48546) << 1) - (i44 ^ 48546);
                        int i46 = (~i43) | i38;
                        int i47 = (i45 - (~((~((i46 & 61) | (i46 ^ 61))) * (-783)))) - 1;
                        int i48 = ~i43;
                        int i49 = ~((i27 ^ 61) | (i27 & 61));
                        int i51 = ((i48 & i49) | (i48 ^ i49)) * 783;
                        int i52 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                        int i53 = (i52 ^ 38) + ((i52 & 38) << 1);
                        Object[] objArr7 = new Object[1];
                        b((byte) (((i47 | i51) << 1) - (i47 ^ i51)), i53, "\u000e\u0014!\u001a+!\u0002**\"\u0018\u001f!&!\u000f\u001d +$-\f㗧㗧\u001c\b\u000b\u001f!\u001c\u0018\u001f\u0006.\u001b&\u001a\u0013", objArr7);
                        objArr4[0] = Class.forName((String) objArr7[0]).getDeclaredConstructor(cls).newInstance(objArr6);
                        int i54 = -Drawable.resolveOpacity(0, 0);
                        int i55 = -View.combineMeasuredStates(0, 0);
                        int i56 = (i55 * (-381)) + 5952;
                        int i57 = -(-((~i55) * (-191)));
                        int i58 = (i56 & i57) + (i56 | i57);
                        int i59 = ~((i11 ^ 31) | (i11 & 31));
                        int i61 = ((i59 & i55) | (i55 ^ i59)) * 191;
                        int i62 = (i58 ^ i61) + ((i58 & i61) << 1);
                        int i63 = ~i55;
                        int i64 = ~((i63 & 31) | (i63 ^ 31));
                        int i65 = ~(i27 | 31);
                        int i66 = ((i64 ^ i65) | (i64 & i65)) * 191;
                        int i67 = (i62 & i66) + (i66 | i62);
                        Object[] objArr8 = new Object[1];
                        b((byte) ((i54 & 100) + (i54 | 100)), i67, "/\u0003\n\f\u00000\f(\u0005\u0004\u0010\u0018\u001f\n\u00030(\u0002 \u0005\n\u0018\u0018\u0019\u0004\u0002\t\u0002\u000e\u001d㙡", objArr8);
                        try {
                            Object[] objArr9 = {(String) objArr8[0]};
                            int i68 = -TextUtils.lastIndexOf("", '0');
                            int i69 = i68 * (-129);
                            int i71 = (i69 & 7860) + (i69 | 7860);
                            int i72 = ((-61) ^ i27) | ((-61) & i27);
                            int i73 = (~((i72 ^ i68) | (i72 & i68))) * EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE;
                            int i74 = (i71 ^ i73) + ((i73 & i71) << 1);
                            int i75 = -(-((~(((-61) ^ i68) | ((-61) & i68))) * (-260)));
                            int i76 = (i74 & i75) + (i74 | i75);
                            int i77 = ~i68;
                            int i78 = ~((i77 ^ 60) | (i77 & 60));
                            int i79 = (-61) | i68;
                            int i81 = ~((i79 ^ i11) | (i79 & i11));
                            int i82 = -(-(((i78 ^ i81) | (i81 & i78)) * EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE));
                            byte b13 = (byte) (((i76 | i82) << 1) - (i82 ^ i76));
                            int i83 = -TextUtils.getCapsMode("", 0, 0);
                            int i84 = (i83 ^ 38) + ((i83 & 38) << 1);
                            Object[] objArr10 = new Object[1];
                            b(b13, i84, "\u000e\u0014!\u001a+!\u0002**\"\u0018\u001f!&!\u000f\u001d +$-\f㗧㗧\u001c\b\u000b\u001f!\u001c\u0018\u001f\u0006.\u001b&\u001a\u0013", objArr10);
                            objArr4[1] = Class.forName((String) objArr10[0]).getDeclaredConstructor(cls).newInstance(objArr9);
                            try {
                                int i85 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                                int i86 = ((i85 | 50647) << 1) - (i85 ^ 50647);
                                Object[] objArr11 = new Object[1];
                                c("皿덧ﴔ✩懭ꮄ햰ḑ堅舾쳖\uf697ク絛Ꝩ\ue169⯭嗶龮\ud85fɷ䰅盐", i86, objArr11);
                                Class<?> cls4 = Class.forName((String) objArr11[0]);
                                int i87 = -(-TextUtils.indexOf("", "", 0, 0));
                                Object[] objArr12 = new Object[1];
                                b((byte) ((i87 & 84) + (i87 | 84)), 17 - (~TextUtils.lastIndexOf("", '0', 0, 0)), "\t0 \u001c\u0014/\f\u000f\t0(\u000e\u0005\u0012\t0㘼", objArr12);
                                Object objInvoke = cls4.getMethod((String) objArr12[0], null).invoke(context, null);
                                try {
                                    int i88 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    int i89 = i88 * 980;
                                    int i91 = (((i89 | (-49533744)) << 1) - (i89 ^ (-49533744))) + ((~(((-50649) & i38) | ((-50649) ^ i38))) * 979) + ((i88 | i11) * (-979));
                                    int i92 = -(-(((~(i88 | i38)) | (~(((-50649) & i11) | ((-50649) ^ i11)))) * 979));
                                    int i93 = (i91 & i92) + (i91 | i92);
                                    Object[] objArr13 = new Object[1];
                                    c("皿덧ﴔ✩懭ꮄ햰ḑ堅舾쳖\uf697ク絛Ꝩ\ue169⯭嗶龮\ud85fɷ䰅盐", i93, objArr13);
                                    Class<?> cls5 = Class.forName((String) objArr13[0]);
                                    Object[] objArr14 = new Object[1];
                                    c("皹妾⢠ﮁ쪫鶤沫㾜ຑ톖ꂢ玈䊏ᗺ", 12037 - Drawable.resolveOpacity(0, 0), objArr14);
                                    try {
                                        Object[] objArr15 = {cls5.getMethod((String) objArr14[0], null).invoke(context, null), 64};
                                        byte bResolveSize = (byte) (View.resolveSize(0, 0) + 109);
                                        int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                                        Object[] objArr16 = new Object[1];
                                        b(bResolveSize, (packedPositionType & 33) + (packedPositionType | 33), "\u0012\u0005\n\u0018\u0018\u0019\u0001\u001f,\u001b\u0003 .\u0002 \u001e#\u0014\u001e\u001c\u0014/\f\u000f\t0(\u000e\u0005\u0012\t0㙕", objArr16);
                                        Class<?> cls6 = Class.forName((String) objArr16[0]);
                                        int i94 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                        Object[] objArr17 = new Object[1];
                                        c("皹궦삐\ue7d9᫋ㄬ君譴깑슾例\u1c8f㏤囈", (i94 & 56093) + (i94 | 56093), objArr17);
                                        Object objInvoke2 = cls6.getMethod((String) objArr17[0], cls, cls2).invoke(objInvoke, objArr15);
                                        int i95 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                        int i96 = ~((~i95) | (-3));
                                        int i97 = ~(((-3) & i11) | ((-3) ^ i11));
                                        int i98 = ((i95 * (-167)) - 334) + (((i96 & i97) | (i96 ^ i97)) * 336) + (((~((i95 ^ 2) | (i95 & 2))) | (~((i95 ^ i11) | (i95 & i11)))) * (-168));
                                        int i99 = ~((i95 & i38) | (i38 ^ i95));
                                        Object[] objArr18 = new Object[1];
                                        b((byte) ((i98 - (~(((i99 & (-3)) | ((-3) ^ i99)) * 168))) - 1), 29 - (~View.resolveSize(0, 0)), "\u0012\u0005\n\u0018\u0018\u0019\u0001\u001f,\u001b\u0003 .\u0002 \u001e#\u0014\u001e\u001c\u0014/\f\u000f\t0\u0019\u000b,\u0019", objArr18);
                                        Class<?> cls7 = Class.forName((String) objArr18[0]);
                                        int i100 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        int i101 = i100 * 477;
                                        int i102 = ((i101 | (-42275)) << 1) - (i101 ^ (-42275));
                                        int i103 = ~i100;
                                        int i104 = ~((i103 & 89) | (i103 ^ 89));
                                        int i105 = ((-90) ^ i100) | ((-90) & i100);
                                        int i106 = (i105 ^ i11) | (i105 & i11);
                                        int i107 = ~i106;
                                        int i108 = i102 + (((i104 ^ i107) | (i107 & i104)) * (-476)) + ((~i106) * 952);
                                        int i109 = -(-((~(i100 | (-90) | i27)) * 476));
                                        byte b14 = (byte) (((i108 | i109) << 1) - (i109 ^ i108));
                                        int i110 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                        int i111 = ~i110;
                                        int i112 = (((i110 * 595) - 13057) - (~(-(-(((~((i111 & 11) | (i111 ^ 11))) | (~((i38 ^ 11) | (i38 & 11)))) * (-1188)))))) - 1;
                                        int i113 = (~((~i110) | 11)) | (~((-12) | i11));
                                        int i114 = ~((i38 ^ i110) | (i38 & i110));
                                        int i115 = -(-(((i113 ^ i114) | (i113 & i114)) * 594));
                                        int i116 = ((i112 | i115) << 1) - (i112 ^ i115);
                                        int i117 = ~(((-12) ^ i38) | ((-12) & i38));
                                        int i118 = ~(((-12) ^ i110) | ((-12) & i110));
                                        int i119 = i116 + (((~(i110 | i27)) | (i117 ^ i118) | (i117 & i118)) * 594);
                                        Object[] objArr19 = new Object[1];
                                        b(b14, i119, "\u0003\u0015\u000b\u0006\u0011!\u001f\u000e*\u0002", objArr19);
                                        Object[] objArr20 = (Object[]) cls7.getField((String) objArr19[0]).get(objInvoke2);
                                        int length = objArr20.length;
                                        int i120 = 0;
                                        i13 = 0;
                                        while (i120 < length) {
                                            Object obj = objArr20[i120];
                                            int i121 = -(AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                                            int i122 = (i121 * (-1529)) - 5082892;
                                            Object[] objArr21 = objArr20;
                                            int i123 = ~i121;
                                            int i124 = length;
                                            int i125 = (i123 ^ (-6654)) | (i123 & (-6654));
                                            int i126 = ~((i125 ^ i27) | (i125 & i27));
                                            int i127 = ~((i123 ^ 6653) | (i123 & 6653) | i11);
                                            int i128 = (i126 ^ i127) | (i126 & i127);
                                            int i129 = ((-6654) ^ i121) | ((-6654) & i121);
                                            r31 = i129 ^ i11;
                                            int i130 = ~(r31 | (i129 & i11));
                                            int i131 = ((i128 ^ i130) | (i128 & i130)) * 765;
                                            int i132 = (i122 ^ i131) + ((i131 & i122) << 1);
                                            int i133 = -(-(((~(i123 | i38)) | (~((i123 ^ (-6654)) | (i123 & (-6654))))) * 1530));
                                            int i134 = (-6654) | i27;
                                            int i135 = (((i132 ^ i133) + ((i132 & i133) << 1)) - (~(((~((~i121) | i11)) | (~((i134 ^ i121) | (i121 & i134)))) * 765))) - 1;
                                            Object[] objArr22 = new Object[1];
                                            c("皆漍䔑㬙ᄓ", i135, objArr22);
                                            try {
                                                Object[] objArr23 = {(String) objArr22[0]};
                                                int i136 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                int i137 = ((i136 | 2179) << 1) - (i136 ^ 2179);
                                                Object[] objArr24 = new Object[1];
                                                c("皴縼枮漶哼尢䖩䴨㊳㨷⎩⬋ႃᡗƗखﺜ\ue619\uefc6휤\udc87쐓취땲뫰ꉼ꯳鍮飾聬观煢曝湉埗彅䓋", i137, objArr24);
                                                Class<?> cls8 = Class.forName((String) objArr24[0]);
                                                int i138 = -TextUtils.indexOf("", "", 0);
                                                int i139 = i138 * 765;
                                                int i140 = (((i139 | (-9804867)) << 1) - (i139 ^ (-9804867))) + (((~((i38 ^ i138) | (i38 & i138))) | 6421) * 764);
                                                int i141 = ~i138;
                                                Class<String> cls9 = cls;
                                                int i142 = ~((i141 ^ 6421) | (i141 & 6421));
                                                int i143 = ~((i38 ^ 6421) | (i38 & 6421));
                                                int i144 = ((i142 ^ i143) | (i142 & i143)) * (-1528);
                                                r31 = ((i140 | i144) << 1) - (i140 ^ i144);
                                                int i145 = ~((i141 ^ 6421) | (i141 & 6421));
                                                int i146 = ~(((-6422) ^ i138) | ((-6422) & i138));
                                                int i147 = r31 + (((i145 ^ i146) | (i145 & i146) | (~(i138 | i27))) * 764);
                                                Object[] objArr25 = new Object[1];
                                                c("皹澮䒀㶨ዤ\u0bc4\ue0d4\ud92c븘需豩", i147, objArr25);
                                                Object objInvoke3 = cls8.getMethod((String) objArr25[0], cls9).invoke(null, objArr23);
                                                try {
                                                    int i148 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    int i149 = i148 * (-813);
                                                    int i150 = (i149 ^ 8377872) + ((i149 & 8377872) << 1);
                                                    int i151 = ~(((-20535) & i148) | ((-20535) ^ i148));
                                                    int i152 = ~((i148 ^ i11) | (i148 & i11));
                                                    int i153 = (i151 | i152) * (-814);
                                                    r31 = (i150 & i153) + (i150 | i153);
                                                    int i154 = ~(((-20535) ^ i38) | ((-20535) & i38));
                                                    int i155 = ~i148;
                                                    int i156 = i120;
                                                    int i157 = ~((i155 ^ 20534) | (i155 & 20534));
                                                    int i158 = ((i154 ^ i157) | (i154 & i157) | i152) * 407;
                                                    int i159 = ~((i155 & i11) | (i155 ^ i11));
                                                    int i160 = ((((r31 | i158) << 1) - (r31 ^ i158)) - (~(-(-((((i157 & i159) | (i157 ^ i159)) | (~((i11 ^ 20534) | (i11 & 20534)))) * 407))))) - 1;
                                                    Object[] objArr26 = new Object[1];
                                                    c("皿⚅훐蘳㙥\ue7be鞄䞃\uf715Ꝭ咢ӭ듇搁ᑌ엫痾┶핊蕢㊓\ue2e0鈾䉼\uf252ꎆ収̬", i160, objArr26);
                                                    Class<?> cls10 = Class.forName((String) objArr26[0]);
                                                    Object[] objArr27 = new Object[1];
                                                    c("皪\ue734喖숨ゾꄢᾁ谏彩欒\ud995", 37253 - Color.green(0), objArr27);
                                                    try {
                                                        Object[] objArr28 = {new ByteArrayInputStream((byte[]) cls10.getMethod((String) objArr27[0], null).invoke(obj, null))};
                                                        int offsetAfter = TextUtils.getOffsetAfter("", 0);
                                                        int i161 = offsetAfter * 866;
                                                        int i162 = ((i161 | (-1882656)) << 1) - (i161 ^ (-1882656));
                                                        int i163 = ~((~offsetAfter) | i38);
                                                        int i164 = -(-(((i163 & (-2180)) | ((-2180) ^ i163)) * (-865)));
                                                        int i165 = ((((i162 | i164) << 1) - (i164 ^ i162)) - (~(-(-((~((offsetAfter ^ i11) | (offsetAfter & i11))) * 865))))) - 1;
                                                        int i166 = ~(((-2180) & i27) | ((-2180) ^ i27));
                                                        int i167 = ~((offsetAfter & i27) | (i27 ^ offsetAfter));
                                                        int i168 = (i165 - (~(((i167 & i166) | (i166 ^ i167)) * 865))) - 1;
                                                        Object[] objArr29 = new Object[1];
                                                        c("皴縼枮漶哼尢䖩䴨㊳㨷⎩⬋ႃᡗƗखﺜ\ue619\uefc6휤\udc87쐓취땲뫰ꉼ꯳鍮飾聬观煢曝湉埗彅䓋", i168, objArr29);
                                                        Class<?> cls11 = Class.forName((String) objArr29[0]);
                                                        int iBlue = Color.blue(0);
                                                        int i169 = iBlue * 615;
                                                        int i170 = (i169 & (-2912363)) + (i169 | (-2912363));
                                                        int i171 = ~iBlue;
                                                        r31 = i13;
                                                        int i172 = ((~((i171 & 4751) | (i171 ^ 4751))) | i11 | (~(((-4752) ^ iBlue) | ((-4752) & iBlue)))) * 614;
                                                        int i173 = ((i170 | i172) << 1) - (i172 ^ i170);
                                                        int i174 = ~((i171 ^ i27) | (i171 & i27));
                                                        int i175 = ~iBlue;
                                                        int i176 = i174 | (~((i175 ^ 4751) | (i175 & 4751)));
                                                        int i177 = ~((i27 & 4751) | (i27 ^ 4751));
                                                        int i178 = i173 + (((i176 & i177) | (i176 ^ i177)) * (-1228));
                                                        int i179 = i171 | (-4752);
                                                        int i180 = ~((i179 & i27) | (i179 ^ i27));
                                                        int i181 = ~((iBlue & i27) | (i27 ^ iBlue) | 4751);
                                                        int i182 = (i178 - (~(((i180 & i181) | (i180 ^ i181)) * 614))) - 1;
                                                        try {
                                                            Object[] objArr30 = new Object[1];
                                                            c("皹搴厮䄖㲐⩴᧰\uf752\ue2e5톼켺몏ꠃ蟻略惜幏䷕㢵", i182, objArr30);
                                                            Object objInvoke4 = cls11.getMethod((String) objArr30[0], InputStream.class).invoke(objInvoke3, objArr28);
                                                            int i183 = 0;
                                                            while (i183 < 2) {
                                                                Object obj2 = objArr4[i183];
                                                                try {
                                                                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L);
                                                                    int i184 = (((packedPositionType2 * (-159)) - 3180) - (~(-(-(((~packedPositionType2) | 20) * 160))))) - 1;
                                                                    int i185 = -(-(((~((i27 ^ packedPositionType2) | (i27 & packedPositionType2))) | (~((packedPositionType2 ^ 20) | (packedPositionType2 & 20)))) * (-160)));
                                                                    int i186 = ((i184 | i185) << 1) - (i184 ^ i185);
                                                                    int i187 = ~((-21) | i38);
                                                                    Object[] objArr31 = new Object[1];
                                                                    b((byte) (i186 + (((packedPositionType2 & i187) | (packedPositionType2 ^ i187)) * 160)), 34 - ExpandableListView.getPackedPositionType(0L), "\u000e\u0014!\u001a\u001c\u0001-*\u001f\u000e\u001f&$!*-\u0018&\u001c\b\u000b\u001f\u0018+-\u0010&\u001f-\u0019/\u0014\u001e-", objArr31);
                                                                    Class<?> cls12 = Class.forName((String) objArr31[0]);
                                                                    int i188 = -Drawable.resolveOpacity(0, 0);
                                                                    int threadPriority = Process.getThreadPriority(0);
                                                                    int i189 = (((threadPriority | 20) << 1) - (threadPriority ^ 20)) >> 6;
                                                                    int i190 = (i189 * (-1939)) + 22333;
                                                                    int i191 = ~(((-24) & i189) | ((-24) ^ i189));
                                                                    int i192 = ~((i27 ^ 23) | (i27 & 23));
                                                                    int i193 = ((i191 ^ i192) | (i191 & i192)) * (-970);
                                                                    int i194 = (i190 ^ i193) + ((i190 & i193) << 1);
                                                                    int i195 = ~i189;
                                                                    int i196 = -(-((~((i195 & 23) | (i195 ^ 23))) * 1940));
                                                                    int i197 = (i194 & i196) + (i196 | i194);
                                                                    int i198 = ~i189;
                                                                    int i199 = ~((i198 & (-24)) | (i198 ^ (-24)));
                                                                    int i200 = ~((i38 ^ 23) | (i38 & 23));
                                                                    int i201 = ((i199 & i200) | (i199 ^ i200)) * 970;
                                                                    Object[] objArr32 = new Object[1];
                                                                    b((byte) ((i188 & 39) + (i188 | 39)), (i197 ^ i201) + ((i201 & i197) << 1), "\t0 \n\u001d\u000e\u00100-\"\b\u000b㗑㗑\u001f\u0014\u0019\u0003-\u001b(\u0014㘝", objArr32);
                                                                    if (obj2.equals(cls12.getMethod((String) objArr32[0], null).invoke(objInvoke4, null))) {
                                                                        Object[] objArr33 = new Object[4];
                                                                        objArr33[0] = new int[]{i11};
                                                                        objArr33[1] = new int[]{(i11 & (-2)) | (i27 & 1)};
                                                                        objArr33[i17] = new int[1];
                                                                        objArr33[2] = null;
                                                                        try {
                                                                            Object[] objArr34 = new Object[i17];
                                                                            objArr34[2] = Integer.valueOf(((((~((-243160382) | i27)) | (~(i11 | 805808390))) * 959) - 537468935) + (((~((-243160382) | i11)) | (~(805808390 | i27))) * 959));
                                                                            objArr34[1] = 16;
                                                                            objArr34[0] = Integer.valueOf(i12);
                                                                            Map map2 = getMessageVersion.timedout;
                                                                            Object method2 = map2.get(552468314);
                                                                            if (method2 == null) {
                                                                                Class cls13 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "") + 2244, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 46664), (Process.myPid() >> 22) + 26);
                                                                                byte b15 = $$a[22];
                                                                                byte b16 = b15;
                                                                                Object[] objArr35 = new Object[1];
                                                                                a(b15, b16, b16, objArr35);
                                                                                method2 = cls13.getMethod((String) objArr35[0], cls2, cls2, cls2);
                                                                                map2.put(552468314, method2);
                                                                            }
                                                                            ((int[]) objArr33[3])[0] = ((Integer) ((Method) method2).invoke(null, objArr34)).intValue();
                                                                            return objArr33;
                                                                        } catch (Throwable th2) {
                                                                            Throwable cause = th2.getCause();
                                                                            if (cause != null) {
                                                                                throw cause;
                                                                            }
                                                                            throw th2;
                                                                        }
                                                                    }
                                                                    i183++;
                                                                    i17 = 3;
                                                                } catch (Throwable th3) {
                                                                    Throwable cause2 = th3.getCause();
                                                                    if (cause2 != null) {
                                                                        throw cause2;
                                                                    }
                                                                    throw th3;
                                                                }
                                                            }
                                                            i120 = ((i156 | 1) << 1) - (i156 ^ 1);
                                                            objArr20 = objArr21;
                                                            length = i124;
                                                            cls = cls9;
                                                            i13 = r31;
                                                            i17 = 3;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            Throwable cause3 = th.getCause();
                                                            if (cause3 != null) {
                                                                throw cause3;
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                    }
                                                } catch (Throwable th6) {
                                                    Throwable cause4 = th6.getCause();
                                                    if (cause4 != null) {
                                                        throw cause4;
                                                    }
                                                    throw th6;
                                                }
                                            } catch (Throwable th7) {
                                                Throwable cause5 = th7.getCause();
                                                if (cause5 != null) {
                                                    throw cause5;
                                                }
                                                throw th7;
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        Throwable cause6 = th8.getCause();
                                        if (cause6 != null) {
                                            throw cause6;
                                        }
                                        throw th8;
                                    }
                                } catch (Throwable th9) {
                                    Throwable cause7 = th9.getCause();
                                    if (cause7 != null) {
                                        throw cause7;
                                    }
                                    throw th9;
                                }
                            } catch (Throwable th10) {
                                Throwable cause8 = th10.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th10;
                            }
                        } catch (Throwable th11) {
                            Throwable cause9 = th11.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th11;
                        }
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th12) {
                    Throwable cause10 = th12.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th12;
                }
            } catch (Throwable unused2) {
            }
            r31 = i13;
            Object[] objArr36 = {new int[]{i11}, new int[]{i11}, null, new int[1]};
            int i202 = ~i11;
            int i203 = (-1031967681) + (((~((-815400736) | i202)) | 9045764 | (~((-233568037) | i202)) | (~(1039923007 | i11))) * (-84));
            int i204 = (~(i11 | (-233568037))) | 815400735;
            int i205 = ~(i202 | 233568036);
            ?? r12 = {Integer.valueOf(i12), r31, Integer.valueOf(i203 + ((i204 | i205) * (-84)) + (((-1039923008) | i205) * 84))};
            Map map3 = getMessageVersion.timedout;
            Object method3 = map3.get(552468314);
            if (method3 == null) {
                Class cls14 = (Class) getMessageVersion.getSDKTransactionID(2244 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 46663), (ViewConfiguration.getTouchSlop() >> 8) + 26);
                byte b17 = $$a[22];
                byte b18 = b17;
                Object[] objArr37 = new Object[1];
                a(b17, b18, b18, objArr37);
                method3 = cls14.getMethod((String) objArr37[0], cls2, cls2, cls2);
                map3.put(552468314, method3);
            }
            ((int[]) objArr36[3])[0] = ((Integer) ((Method) method3).invoke(null, r12)).intValue();
            return objArr36;
        } catch (Throwable th13) {
            Throwable cause11 = th13.getCause();
            if (cause11 != null) {
                throw cause11;
            }
            throw th13;
        }
    }

    public final void AuthenticationRequestParameters() {
        getSDKTransactionID(new Object[]{this}, -611445056, 611445058, System.identityHashCode(this));
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public final String getMessageVersion() {
        return (String) getSDKTransactionID(new Object[]{this}, 532876828, -532876828, System.identityHashCode(this));
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public final String getSDKAppID() {
        return (String) getSDKTransactionID(new Object[]{this}, -2087297925, 2087297929, System.identityHashCode(this));
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public final String getDeviceData() {
        return (String) getSDKTransactionID(new Object[]{this}, -1224691326, 1224691332, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getTransactionStatus;
        int i12 = i11 & 113;
        int i13 = (~i12) & (i11 | 113);
        int i14 = i12 << 1;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        ChallengeResultCancelled = i15 % 128;
        int i16 = i15 % 2;
        String str = authenticationRequestParameters.getSDKAppID;
        if (i16 != 0) {
            int i17 = 4 / 0;
        }
        ChallengeResultCancelled = (i11 + 103) % 128;
        return str;
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public final String getSDKTransactionID() {
        return (String) getSDKTransactionID(new Object[]{this}, 164491289, -164491288, System.identityHashCode(this));
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public final String getSDKReferenceNumber() {
        return (String) getSDKTransactionID(new Object[]{this}, -1681299526, 1681299531, System.identityHashCode(this));
    }
}
