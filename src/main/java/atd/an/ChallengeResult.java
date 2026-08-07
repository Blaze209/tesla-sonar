package atd.an;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.getTransactionStatus;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResult {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getSDKAppID;
    private static long getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKTransactionID = 1;
        getDeviceData();
        TextUtils.lastIndexOf("", '0', 0, 0);
        int i11 = getSDKTransactionID + 109;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 19 / 0;
        }
    }

    public static RSAPublicKey AuthenticationRequestParameters(BigInteger bigInteger, BigInteger bigInteger2) throws Throwable {
        try {
            Object[] objArr = new Object[1];
            a("ﴷ\uf609\ueb5a", 2880 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance(((String) objArr[0]).intern()).generatePublic(new RSAPublicKeySpec(bigInteger, bigInteger2));
            int i11 = getSDKTransactionID + 55;
            getSDKAppID = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 68 / 0;
            }
            return rSAPublicKey;
        } catch (GeneralSecurityException unused) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ba  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        int i12;
        int i13 = $11 + 25;
        $10 = i13 % 128;
        char c11 = 2;
        if (i13 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = charArray.length;
        long[] jArr = new long[length];
        int i14 = 0;
        gettransactionstatus.getSDKTransactionID = 0;
        $11 = ($10 + 79) % 128;
        while (true) {
            int i15 = gettransactionstatus.getSDKTransactionID;
            if (i15 >= charArray.length) {
                break;
            }
            $10 = ($11 + 125) % 128;
            char c12 = charArray[i15];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c11] = gettransactionstatus;
                objArr2[1] = gettransactionstatus;
                objArr2[i14] = Integer.valueOf(c12);
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(962978490);
                if (method != null) {
                    i12 = i14;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((Process.myPid() >> 22) + 689, (char) (16021 - TextUtils.indexOf((CharSequence) "", '0')), 32 - ExpandableListView.getPackedPositionType(0L));
                    byte b11 = (byte) i14;
                    byte b12 = b11;
                    i12 = i14;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                    map.put(962978490, method);
                }
                jArr[i15] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (getSDKReferenceNumber ^ (-2227742522694838850L));
                Object[] objArr4 = new Object[2];
                objArr4[1] = gettransactionstatus;
                objArr4[i12] = gettransactionstatus;
                Object method2 = map.get(-46730980);
                if (method2 == null) {
                    method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(418 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29017), 'H' - AndroidCharacter.getMirror('0'))).getMethod("A", Object.class, Object.class);
                    map.put(-46730980, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i14 = i12;
                jArr = jArr;
                c11 = 2;
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
        gettransactionstatus.getSDKTransactionID = i14;
        while (true) {
            int i16 = gettransactionstatus.getSDKTransactionID;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i17 = $10 + 107;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr[i16] = (char) jArr2[i16];
                Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-46730980);
                if (method3 == null) {
                    method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 416, (char) (29016 - ((byte) KeyEvent.getModifierMetaStateMask())), 24 - KeyEvent.getDeadChar(0, 0))).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                throw null;
            }
            cArr[i16] = (char) jArr2[i16];
            Object[] objArr6 = {gettransactionstatus, gettransactionstatus};
            Map map3 = atd.a.getMessageVersion.timedout;
            Object method4 = map3.get(-46730980);
            if (method4 == null) {
                method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((KeyEvent.getMaxKeyCode() >> 16) + 417, (char) (29017 - Color.argb(0, 0, 0, 0)), 24 - View.resolveSizeAndState(0, 0, 0))).getMethod("A", Object.class, Object.class);
                map3.put(-46730980, method4);
            }
            ((Method) method4).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 118
            int r5 = r5 * 4
            int r5 = 1 - r5
            byte[] r0 = atd.an.ChallengeResult.$$a
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r5
            r4 = r7
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r7]
        L29:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.an.ChallengeResult.b(int, byte, short, java.lang.Object[]):void");
    }

    static void getDeviceData() {
        getSDKReferenceNumber = -893207023301416741L;
    }

    public static RSAPrivateKey getSDKAppID(BigInteger bigInteger, BigInteger bigInteger2) throws Throwable {
        try {
            Object[] objArr = new Object[1];
            a("ﴷ\uf609\ueb5a", TextUtils.indexOf((CharSequence) "", '0', 0) + 2880, objArr);
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) KeyFactory.getInstance(((String) objArr[0]).intern()).generatePrivate(new RSAPrivateKeySpec(bigInteger, bigInteger2));
            int i11 = getSDKAppID + 89;
            getSDKTransactionID = i11 % 128;
            if (i11 % 2 != 0) {
                return rSAPrivateKey;
            }
            throw null;
        } catch (GeneralSecurityException unused) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    static void init$0() {
        $$a = new byte[]{125, 7, -90, 118};
        $$b = 72;
    }
}
