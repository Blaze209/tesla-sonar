package atd.ag;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.BuildConfig;
import atd.az.getTransactionStatus;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AuthenticationRequestParameters extends atd.ac.getSDKAppID {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static char[] getDeviceData;
    private static long getSDKAppID;
    private static long getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getSDKTransactionID = 1;
        ChallengeResultCancelled();
        getSDKAppID = 5342027466424907517L;
    }

    AuthenticationRequestParameters() {
    }

    private static byte[] AuthenticationRequestParameters(int i11) {
        return (byte[]) getSDKReferenceNumber(new Object[]{Integer.valueOf(i11)}, 2103560594, -2103560594, i11);
    }

    static void ChallengeResultCancelled() {
        getDeviceData = new char[]{52047, 32622, 41735, 55098, 7075, 20356, 62396, 9824, 27136, 40493, 49896, 30367, 47780, 60713, 4410, 17718, 35302, 15770, 24995, 37982, 55359, 3126, 45271, 58503, 10426, 21330};
        getSDKReferenceNumber = -7235874329053645742L;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b1  */
    private static void c(int i11, char c11, int i12, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13;
        int i14;
        Object method;
        BuildConfig buildConfig = new BuildConfig();
        long[] jArr = new long[i12];
        int i15 = 0;
        buildConfig.getDeviceData = 0;
        while (true) {
            int i16 = buildConfig.getDeviceData;
            if (i16 >= i12) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(getDeviceData[i11 + i16])};
                Map map = getMessageVersion.timedout;
                Object obj = map.get(1019086628);
                Class cls = Integer.TYPE;
                if (obj != null) {
                    i14 = i15;
                    method = obj;
                    i13 = 2;
                } else {
                    i13 = 2;
                    Class cls2 = (Class) getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1773, (char) (Process.getGidForName("") + 1), Color.argb(i15, i15, i15, i15) + 32);
                    byte b11 = (byte) i15;
                    byte b12 = b11;
                    i14 = i15;
                    Object[] objArr3 = new Object[1];
                    e(b11, b12, (byte) (b12 - 1), objArr3);
                    method = cls2.getMethod((String) objArr3[i14], cls);
                    map.put(1019086628, method);
                }
                Long l11 = (Long) ((Method) method).invoke(null, objArr2);
                l11.longValue();
                long j11 = buildConfig.getDeviceData;
                long j12 = getSDKReferenceNumber;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c11);
                objArr4[i13] = Long.valueOf(j12);
                objArr4[1] = Long.valueOf(j11);
                objArr4[i14] = l11;
                Object method2 = map.get(-1106061844);
                if (method2 == null) {
                    int i17 = i14;
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID((CdmaCellLocation.convertQuartSecToDecDegrees(i14) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i14) == 0.0d ? 0 : -1)) + 441, (char) KeyEvent.normalizeMetaState(i14), View.getDefaultSize(i17, i17) + 37);
                    Class cls4 = Long.TYPE;
                    method2 = cls3.getMethod("n", cls4, cls4, cls4, cls);
                    map.put(-1106061844, method2);
                }
                jArr[i16] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr5 = new Object[i13];
                objArr5[1] = buildConfig;
                objArr5[0] = buildConfig;
                Object method3 = map.get(1947342796);
                if (method3 == null) {
                    Class cls5 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1918, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 29 - View.MeasureSpec.getMode(0));
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 + 1);
                    Object[] objArr6 = new Object[1];
                    e(b13, b14, (byte) (-b14), objArr6);
                    method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map.put(1947342796, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                jArr = jArr;
                i15 = 0;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        long[] jArr2 = jArr;
        char[] cArr = new char[i12];
        buildConfig.getDeviceData = 0;
        while (true) {
            int i18 = buildConfig.getDeviceData;
            if (i18 >= i12) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i18] = (char) jArr2[i18];
            Object[] objArr7 = {buildConfig, buildConfig};
            Map map2 = getMessageVersion.timedout;
            Object method4 = map2.get(1947342796);
            if (method4 == null) {
                Class cls6 = (Class) getMessageVersion.getSDKTransactionID(1919 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), TextUtils.getOffsetAfter("", 0) + 29);
                byte b15 = (byte) 0;
                byte b16 = (byte) (b15 + 1);
                Object[] objArr8 = new Object[1];
                e(b15, b16, (byte) (-b16), objArr8);
                method4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                map2.put(1947342796, method4);
            }
            ((Method) method4).invoke(null, objArr7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x016a  */
    /* JADX WARN: Code duplicated, block: B:36:0x016b  */
    private static void d(String str, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        int i12;
        Object method;
        $11 = ($10 + 115) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = charArray.length;
        long[] jArr = new long[length];
        int i13 = 0;
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i14 = gettransactionstatus.getSDKTransactionID;
            if (i14 >= charArray.length) {
                break;
            }
            char c11 = charArray[i14];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = gettransactionstatus;
                objArr2[1] = gettransactionstatus;
                objArr2[i13] = Integer.valueOf(c11);
                Map map = getMessageVersion.timedout;
                Object obj = map.get(962978490);
                if (obj != null) {
                    method = obj;
                    i12 = i13;
                } else {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(690 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (((Process.getThreadPriority(i13) + 20) >> 6) + 16022), 32 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    byte b11 = (byte) i13;
                    byte b12 = (byte) (b11 + 2);
                    i12 = i13;
                    Object[] objArr3 = new Object[1];
                    e(b11, b12, (byte) (b12 - 3), objArr3);
                    method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                    map.put(962978490, method);
                }
                jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (getSDKAppID ^ (-2227742522694838850L));
                Object[] objArr4 = new Object[2];
                objArr4[1] = gettransactionstatus;
                objArr4[i12] = gettransactionstatus;
                Object method2 = map.get(-46730980);
                if (method2 == null) {
                    method2 = ((Class) getMessageVersion.getSDKTransactionID(((byte) KeyEvent.getModifierMetaStateMask()) + 418, (char) ((ExpandableListView.getPackedPositionForGroup(i12) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i12) == 0L ? 0 : -1)) + 29017), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24)).getMethod("A", Object.class, Object.class);
                    map.put(-46730980, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i13 = i12;
                jArr = jArr;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        long[] jArr2 = jArr;
        char[] cArr = new char[length];
        gettransactionstatus.getSDKTransactionID = i13;
        while (true) {
            int i15 = gettransactionstatus.getSDKTransactionID;
            if (i15 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            $10 = ($11 + 87) % 128;
            cArr[i15] = (char) jArr2[i15];
            Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
            Map map2 = getMessageVersion.timedout;
            Object method3 = map2.get(-46730980);
            if (method3 == null) {
                method3 = ((Class) getMessageVersion.getSDKTransactionID((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 416, (char) (29016 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 24 - KeyEvent.normalizeMetaState(0))).getMethod("A", Object.class, Object.class);
                map2.put(-46730980, method3);
            }
            ((Method) method3).invoke(null, objArr5);
            $10 = ($11 + 79) % 128;
        }
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
    private static void e(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 5
            int r8 = r8 + 108
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r0 = atd.ag.AuthenticationRequestParameters.$$d
            int r9 = r9 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r0
            r4 = r2
            r0 = r9
            r9 = r7
            goto L2f
        L16:
            r3 = r2
        L17:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r0
            r0 = r6
        L2f:
            int r8 = -r8
            int r8 = r8 + r9
            r9 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ag.AuthenticationRequestParameters.e(short, int, byte, java.lang.Object[]):void");
    }

    private byte[] getSDKAppID(getDeviceData getdevicedata, int i11, byte[] bArr, byte[] bArr2) throws Throwable {
        SecretKey sDKAppID = getdevicedata.getSDKAppID();
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        Cipher cipher = Cipher.getInstance(AuthenticationRequestParameters());
        AuthenticationRequestParameters = (getSDKTransactionID + 105) % 128;
        try {
            Object[] objArr = new Object[1];
            c(ViewConfiguration.getFadingEdgeLength() >> 16, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 52061), TextUtils.getCapsMode("", 0, 0) + 26, objArr);
            cipher.init(i11, sDKAppID, ivParameterSpec, (SecureRandom) Class.forName((String) objArr[0]).getDeclaredConstructor(null).newInstance(null));
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            getSDKTransactionID = (AuthenticationRequestParameters + 125) % 128;
            return bArrDoFinal;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr, int i11, int i12, int i13) {
        int i14;
        int i15;
        int iIntValue = ((Number) objArr[0]).intValue();
        int i16 = getSDKTransactionID + 25;
        AuthenticationRequestParameters = i16 % 128;
        if (i16 % 2 != 0) {
            i14 = iIntValue >> 2;
            i15 = 27;
        } else {
            i14 = iIntValue << 3;
            i15 = 8;
        }
        return ByteBuffer.allocate(i15).putLong(i14).array();
    }

    static void init$0() {
        $$d = new byte[]{50, -94, 63, 122};
        $$e = 13;
    }

    public abstract String AuthenticationRequestParameters();

    public abstract String BuildConfig();

    public final byte[] ChallengeResult() throws Throwable {
        int i11 = AuthenticationRequestParameters + 23;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            byte[] bArr = new byte[getSDKReferenceNumber()];
            throw null;
        }
        byte[] bArr2 = new byte[getSDKReferenceNumber()];
        AuthenticationRequestParameters = (getSDKTransactionID + 73) % 128;
        try {
            Object[] objArr = new Object[1];
            c(ViewConfiguration.getWindowTouchSlop() >> 8, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 52061), 26 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
            ((Random) Class.forName((String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr2);
            getSDKTransactionID = (AuthenticationRequestParameters + 81) % 128;
            return bArr2;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public final getSDKAppID getDeviceData(getDeviceData getdevicedata, byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        byte[] sDKAppID = getSDKAppID(getdevicedata, 1, bArr, bArr2);
        getSDKAppID getsdkappid = new getSDKAppID(bArr, sDKAppID, getSDKTransactionID(getdevicedata, bArr, bArr3, sDKAppID));
        getSDKTransactionID = (AuthenticationRequestParameters + 125) % 128;
        return getsdkappid;
    }

    public abstract String getDeviceData();

    public abstract int getSDKEphemeralPublicKey();

    public abstract int getSDKReferenceNumber();

    public abstract int getSDKTransactionID();

    public final byte[] getSDKTransactionID(getDeviceData getdevicedata, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Throwable {
        int i11 = AuthenticationRequestParameters + 65;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            Arrays.equals(bArr4, getSDKTransactionID(getdevicedata, bArr, bArr3, bArr2));
            throw null;
        }
        if (Arrays.equals(bArr4, getSDKTransactionID(getdevicedata, bArr, bArr3, bArr2))) {
            byte[] sDKAppID = getSDKAppID(getdevicedata, 2, bArr, bArr2);
            AuthenticationRequestParameters = (getSDKTransactionID + 37) % 128;
            return sDKAppID;
        }
        Object[] objArr = new Object[1];
        d("⌂䷕ﻱ澂颪ू멥⬟吸웙矩\ue0ebᆈ芪㌉屺촒縷\ue895᧾誐㮹꒲픆䙥\uf707怹銒Ϻ겕\uddad九ｋ栮", 28387 - View.resolveSizeAndState(0, 0, 0), objArr);
        throw new GeneralSecurityException(((String) objArr[0]).intern());
    }

    private static byte[] getSDKReferenceNumber(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Object[] objArr = new Object[1];
            d("⌂枭ꩺ\ued3dㇾ", 17597 - ExpandableListView.getPackedPositionType(0L), objArr);
            byte[] sDKAppID = ((atd.json.getDeviceData) atd.json.getDeviceData.getSDKTransactionID(new Object[]{Charset.forName(((String) objArr[0]).intern())}, -1621942088, 1621942088, (int) System.currentTimeMillis())).getSDKAppID(bArr);
            byteArrayOutputStream.write(sDKAppID);
            byteArrayOutputStream.write(bArr2);
            byteArrayOutputStream.write(bArr3);
            int length = sDKAppID.length;
            byteArrayOutputStream.write((byte[]) getSDKReferenceNumber(new Object[]{Integer.valueOf(length)}, 2103560594, -2103560594, length));
            int i11 = (AuthenticationRequestParameters + 9) % 128;
            getSDKTransactionID = i11;
            int i12 = i11 + 1;
            AuthenticationRequestParameters = i12 % 128;
            if (i12 % 2 == 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.toByteArray();
            throw null;
        } catch (IOException unused) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    private byte[] getSDKTransactionID(getDeviceData getdevicedata, byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        byte[] bArrCopyOf;
        int i11 = AuthenticationRequestParameters + 27;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            byte[] sDKReferenceNumber = getSDKReferenceNumber(bArr2, bArr, bArr3);
            Mac mac = Mac.getInstance(BuildConfig());
            mac.init(getdevicedata.getSDKReferenceNumber());
            mac.update(sDKReferenceNumber);
            bArrCopyOf = Arrays.copyOf(mac.doFinal(), getSDKEphemeralPublicKey());
            int i12 = 6 / 0;
        } else {
            byte[] sDKReferenceNumber2 = getSDKReferenceNumber(bArr2, bArr, bArr3);
            Mac mac2 = Mac.getInstance(BuildConfig());
            mac2.init(getdevicedata.getSDKReferenceNumber());
            mac2.update(sDKReferenceNumber2);
            bArrCopyOf = Arrays.copyOf(mac2.doFinal(), getSDKEphemeralPublicKey());
        }
        int i13 = getSDKTransactionID + 3;
        AuthenticationRequestParameters = i13 % 128;
        if (i13 % 2 == 0) {
            return bArrCopyOf;
        }
        throw null;
    }
}
