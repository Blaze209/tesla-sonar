package atd.an;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.completed;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static char getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKReferenceNumber = 1;
        AuthenticationRequestParameters = new char[]{52365, 52367, 52366, 52374, 52383, 52460, 52456, 52459, 52467};
        getSDKTransactionID = (char) 63815;
    }

    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        long j11;
        int i12;
        char c11;
        int length;
        char[] cArr;
        Object method;
        int i13 = 11;
        $10 = ($11 + 11) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] cArr2 = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        char c12 = '0';
        char c13 = 2;
        int i14 = 0;
        if (cArr2 != null) {
            int i15 = $10 + 43;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i16 = 0;
            j11 = 0;
            while (i16 < length) {
                int i17 = $11 + 91;
                char c14 = c13;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i16])};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(-1709775791);
                        if (obj != null) {
                            method = obj;
                        } else {
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2314 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ('0' - AndroidCharacter.getMirror(c12)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24);
                            byte b12 = (byte) i14;
                            byte b13 = b12;
                            Object[] objArr3 = new Object[1];
                            b(b12, b13, b13, objArr3);
                            method = cls2.getMethod((String) objArr3[i14], cls);
                            map.put(-1709775791, method);
                        }
                        cArr[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    charArray = charArray;
                    i13 = i13;
                    c12 = c12;
                    int i18 = i14;
                    Object[] objArr4 = {Integer.valueOf(cArr2[i16])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(-1709775791);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2312, (char) KeyEvent.getDeadChar(i18, i18), 24 - (Process.myTid() >> 22));
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr5 = new Object[1];
                        b(b14, b15, b15, objArr5);
                        method2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(-1709775791, method2);
                    }
                    cArr[i16] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                }
                i16++;
                $10 = ($11 + 69) % 128;
                c13 = c14;
                c12 = c12;
                i13 = i13;
                charArray = charArray;
                i14 = 0;
            }
            cArr2 = cArr;
        } else {
            j11 = 0;
        }
        char[] cArr3 = charArray;
        int i19 = i13;
        char c15 = c12;
        char c16 = c13;
        Object[] objArr6 = {Integer.valueOf(getSDKTransactionID)};
        Map map3 = atd.a.getMessageVersion.timedout;
        Object method3 = map3.get(-1709775791);
        char c17 = '\b';
        if (method3 == null) {
            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollBarSize() >> 8) + 2313, (char) (KeyEvent.getMaxKeyCode() >> 16), 23 - TextUtils.indexOf("", c15, 0));
            byte b16 = (byte) 0;
            byte b17 = b16;
            Object[] objArr7 = new Object[1];
            b(b16, b17, b17, objArr7);
            method3 = cls4.getMethod((String) objArr7[0], cls);
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
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i21 = completedVar.getSDKTransactionID;
                if (i21 >= i12) {
                    break;
                }
                char c18 = cArr3[i21];
                completedVar.getSDKAppID = c18;
                char c19 = cArr3[i21 + 1];
                completedVar.getSDKReferenceNumber = c19;
                if (c18 == c19) {
                    cArr4[i21] = (char) (c18 - b11);
                    cArr4[i21 + 1] = (char) (c19 - b11);
                    c11 = c17;
                } else {
                    Object[] objArr8 = new Object[13];
                    objArr8[12] = completedVar;
                    objArr8[i19] = Integer.valueOf(cCharValue);
                    objArr8[10] = completedVar;
                    objArr8[9] = completedVar;
                    objArr8[c17] = Integer.valueOf(cCharValue);
                    objArr8[7] = completedVar;
                    objArr8[6] = completedVar;
                    objArr8[5] = Integer.valueOf(cCharValue);
                    objArr8[4] = completedVar;
                    objArr8[3] = completedVar;
                    objArr8[c16] = Integer.valueOf(cCharValue);
                    objArr8[1] = completedVar;
                    objArr8[0] = completedVar;
                    c11 = c17;
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method4 = map4.get(700818725);
                    if (method4 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - Drawable.resolveOpacity(0, 0), (char) TextUtils.getOffsetAfter("", 0), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 29);
                        byte b18 = (byte) 0;
                        Object[] objArr9 = new Object[1];
                        b((byte) 55, b18, b18, objArr9);
                        String str2 = (String) objArr9[0];
                        Class cls6 = Integer.TYPE;
                        method4 = cls5.getMethod(str2, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class);
                        map4.put(700818725, method4);
                    }
                    int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                    int i22 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i22) {
                        $10 = ($11 + 113) % 128;
                        Object[] objArr10 = new Object[i19];
                        objArr10[10] = completedVar;
                        objArr10[9] = Integer.valueOf(cCharValue);
                        objArr10[c11] = completedVar;
                        objArr10[7] = Integer.valueOf(cCharValue);
                        objArr10[6] = Integer.valueOf(cCharValue);
                        objArr10[5] = completedVar;
                        objArr10[4] = completedVar;
                        objArr10[3] = Integer.valueOf(cCharValue);
                        objArr10[c16] = Integer.valueOf(cCharValue);
                        objArr10[1] = completedVar;
                        objArr10[0] = completedVar;
                        Object method5 = map4.get(-248084636);
                        if (method5 == null) {
                            Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1721 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (48635 - (SystemClock.elapsedRealtime() > j11 ? 1 : (SystemClock.elapsedRealtime() == j11 ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > j11 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j11 ? 0 : -1)) + 24);
                            byte b19 = (byte) 0;
                            Object[] objArr11 = new Object[1];
                            b((byte) 6, b19, b19, objArr11);
                            String str3 = (String) objArr11[0];
                            Class cls8 = Integer.TYPE;
                            method5 = cls7.getMethod(str3, Object.class, Object.class, cls8, cls8, Object.class, Object.class, cls8, cls8, Object.class, cls8, Object.class);
                            map4.put(-248084636, method5);
                        }
                        int iIntValue2 = ((Integer) ((Method) method5).invoke(null, objArr10)).intValue();
                        int i23 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i24 = completedVar.getSDKTransactionID;
                        cArr4[i24] = cArr2[iIntValue2];
                        cArr4[i24 + 1] = cArr2[i23];
                    } else {
                        int i25 = completedVar.getDeviceData;
                        int i26 = completedVar.AuthenticationRequestParameters;
                        if (i25 == i26) {
                            int i27 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i27;
                            int i28 = ((i22 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i28;
                            int i29 = (i26 * cCharValue) + i28;
                            int i31 = completedVar.getSDKTransactionID;
                            cArr4[i31] = cArr2[(i25 * cCharValue) + i27];
                            cArr4[i31 + 1] = cArr2[i29];
                        } else {
                            int i32 = (i25 * cCharValue) + i22;
                            int i33 = (i26 * cCharValue) + completedVar.getMessageVersion;
                            int i34 = completedVar.getSDKTransactionID;
                            cArr4[i34] = cArr2[i32];
                            cArr4[i34 + 1] = cArr2[i33];
                        }
                    }
                }
                completedVar.getSDKTransactionID += 2;
                c17 = c11;
                i19 = 11;
            }
        }
        int i35 = 0;
        while (i35 < i11) {
            cArr4[i35] = (char) (cArr4[i35] ^ 13722);
            i35++;
            $10 = ($11 + 83) % 128;
        }
        objArr[0] = new String(cArr4);
    }

    private static void b(short s11, int i11, byte b11, Object[] objArr) {
        int i12 = s11 + 67;
        int i13 = (i11 * 3) + 4;
        int i14 = b11 * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i14 + 1];
        int i15 = -1;
        if (bArr == null) {
            i13++;
            i12 = i14 + i12;
        }
        while (true) {
            i15++;
            bArr2[i15] = (byte) i12;
            if (i15 == i14) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b12 = bArr[i13];
                i13++;
                i12 += b12;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private static byte[] getSDKAppID(String str) {
        int i11;
        int i12 = getSDKAppID;
        int i13 = i12 + 65;
        getSDKReferenceNumber = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 38 / 0;
            if (str != null) {
                i11 = i12 + 85;
                getSDKReferenceNumber = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
            } else {
                str = "";
            }
        } else if (str != null) {
            i11 = i12 + 85;
            getSDKReferenceNumber = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        } else {
            str = "";
        }
        return ByteBuffer.allocate(str.length() + 4).putInt(str.length()).put(str.getBytes(atd.a.AuthenticationRequestParameters.AuthenticationRequestParameters)).array();
    }

    public static byte[] getSDKReferenceNumber(byte[] bArr, int i11, String str, String str2, String str3) throws Throwable {
        String str4;
        byte[] sDKTransactionID = getSDKTransactionID(1);
        byte[] sDKAppID = getSDKAppID(str);
        byte[] sDKAppID2 = getSDKAppID(str2);
        byte[] sDKAppID3 = getSDKAppID(str3);
        byte[] sDKTransactionID2 = getSDKTransactionID(i11);
        byte[] bArr2 = new byte[0];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(sDKTransactionID);
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(sDKAppID);
            byteArrayOutputStream.write(sDKAppID2);
            byteArrayOutputStream.write(sDKAppID3);
            byteArrayOutputStream.write(sDKTransactionID2);
            byteArrayOutputStream.write(bArr2);
            int i12 = getSDKAppID + 117;
            getSDKReferenceNumber = i12 % 128;
            try {
                if (i12 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a(37 % KeyEvent.normalizeMetaState(1), "\u0003\u0006\u0005\u0007\u0004\b㗉", (byte) (6 << (ViewConfiguration.getEdgeSlop() / 55)), objArr);
                    str4 = (String) objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    a(7 - KeyEvent.normalizeMetaState(0), "\u0003\u0006\u0005\u0007\u0004\b㗉", (byte) (29 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr2);
                    str4 = (String) objArr2[0];
                }
                MessageDigest messageDigest = MessageDigest.getInstance(str4.intern());
                messageDigest.update(byteArrayOutputStream.toByteArray());
                byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(), i11 / 8);
                int i13 = getSDKAppID + 49;
                getSDKReferenceNumber = i13 % 128;
                if (i13 % 2 != 0) {
                    return bArrCopyOf;
                }
                throw null;
            } catch (NoSuchAlgorithmException unused) {
                throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
            }
        } catch (IOException unused2) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    private static byte[] getSDKTransactionID(int i11) {
        int i12 = getSDKAppID + 27;
        getSDKReferenceNumber = i12 % 128;
        return (i12 % 2 == 0 ? ByteBuffer.allocate(2) : ByteBuffer.allocate(4)).putInt(i11).array();
    }

    static void init$0() {
        $$a = new byte[]{11, 12, 68, 127};
        $$b = 136;
    }
}
