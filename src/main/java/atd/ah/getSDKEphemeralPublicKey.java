package atd.ah;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeStatusReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* JADX INFO: loaded from: classes3.dex */
final class getSDKEphemeralPublicKey extends getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static char[] getDeviceData;
    private static int getMessageVersion;
    private static boolean getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static final OAEPParameterSpec getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKTransactionID();
        AndroidCharacter.getMirror('0');
        ViewConfiguration.getGlobalActionKeyTimeout();
        Object[] objArr = new Object[1];
        a(null, null, 126 - TextUtils.lastIndexOf("", '0', 0), "\u008a\u0089\u0088\u0084\u0083\u0092\u0082", objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, "\u0098\u0097\u0096\u0095", objArr2);
        getSDKReferenceNumber = new OAEPParameterSpec(strIntern, ((String) objArr2[0]).intern(), MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT);
        getMessageVersion = (getSDKEphemeralPublicKey + 49) % 128;
    }

    getSDKEphemeralPublicKey() {
    }

    private static void a(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        Class cls;
        float f11;
        Class cls2;
        Object method;
        String str3 = str2;
        int i13 = $11 + 119;
        $10 = i13 % 128;
        int i14 = 2;
        Object bytes = str3;
        if (i13 % 2 != 0) {
            throw null;
        }
        if (str3 != null) {
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        if (str != null) {
            int i15 = $11 + 31;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeStatusReceiver challengeStatusReceiver = new ChallengeStatusReceiver();
        char[] cArr2 = getDeviceData;
        Class cls3 = Integer.TYPE;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            f11 = BitmapDescriptorFactory.HUE_RED;
            int i16 = 0;
            while (i16 < length) {
                i14 = i14;
                int i17 = $11 + 69;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i16])};
                        Map map = getMessageVersion.timedout;
                        Object obj = map.get(508097192);
                        if (obj != null) {
                            method = obj;
                            cls2 = cls3;
                        } else {
                            cls2 = cls3;
                            method = ((Class) getMessageVersion.getSDKTransactionID(Color.rgb(0, 0, 0) + 16777544, (char) View.getDefaultSize(0, 0), MotionEvent.axisFromString("") + 33)).getMethod("o", cls2);
                            map.put(508097192, method);
                        }
                        cArr3[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        cls3 = cls2;
                        cArr2 = cArr2;
                        i16 = i16;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    char[] cArr4 = cArr2;
                    int i18 = i16;
                    Class cls4 = cls3;
                    Object[] objArr3 = {Integer.valueOf(cArr4[i18])};
                    Map map2 = getMessageVersion.timedout;
                    Object method2 = map2.get(508097192);
                    if (method2 == null) {
                        method2 = ((Class) getMessageVersion.getSDKTransactionID((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + EnumC4419g.SDK_ASSET_ICON_UPLOAD_VALUE, (char) TextUtils.indexOf("", "", 0), 31 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getMethod("o", cls4);
                        map2.put(508097192, method2);
                    }
                    cArr3[i18] = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
                    i16 = i18 + 1;
                    cls3 = cls4;
                    cArr2 = cArr4;
                }
            }
            i12 = i14;
            cls = cls3;
            $10 = ($11 + 123) % 128;
            cArr2 = cArr3;
        } else {
            i12 = 2;
            cls = cls3;
            f11 = BitmapDescriptorFactory.HUE_RED;
        }
        Object[] objArr4 = {Integer.valueOf(AuthenticationRequestParameters)};
        Map map3 = getMessageVersion.timedout;
        Object method3 = map3.get(-852383591);
        if (method3 == null) {
            Class cls5 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "", 0, 0) + 2061, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 17 - Color.red(0));
            byte b11 = (byte) 1;
            byte b12 = (byte) (b11 - 1);
            Object[] objArr5 = new Object[1];
            b(b11, b12, b12, objArr5);
            method3 = cls5.getMethod((String) objArr5[0], cls);
            map3.put(-852383591, method3);
        }
        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr4)).intValue();
        if (getSDKTransactionID) {
            int length2 = bArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length2;
            char[] cArr5 = new char[length2];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i19 = challengeStatusReceiver.getDeviceData;
                int i21 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i19 >= i21) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i19] = (char) (cArr2[bArr[(i21 - 1) - i19] + i11] - iIntValue);
                Object[] objArr6 = new Object[i12];
                objArr6[1] = challengeStatusReceiver;
                objArr6[0] = challengeStatusReceiver;
                Map map4 = getMessageVersion.timedout;
                Object method4 = map4.get(-249860496);
                if (method4 == null) {
                    Class cls6 = (Class) getMessageVersion.getSDKTransactionID((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1108, (char) ((AudioTrack.getMaxVolume() > f11 ? 1 : (AudioTrack.getMaxVolume() == f11 ? 0 : -1)) - 1), (Process.myTid() >> 22) + 50);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr7 = new Object[1];
                    b(b13, b14, b14, objArr7);
                    method4 = cls6.getMethod((String) objArr7[0], Object.class, Object.class);
                    map4.put(-249860496, method4);
                }
                ((Method) method4).invoke(null, objArr6);
                i12 = 2;
            }
        } else if (getSDKAppID) {
            int length3 = cArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length3;
            char[] cArr6 = new char[length3];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i22 = challengeStatusReceiver.getDeviceData;
                int i23 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i22 >= i23) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                cArr6[i22] = (char) (cArr2[cArr[(i23 - 1) - i22] - i11] - iIntValue);
                Object[] objArr8 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map5 = getMessageVersion.timedout;
                Object method5 = map5.get(-249860496);
                if (method5 == null) {
                    Class cls7 = (Class) getMessageVersion.getSDKTransactionID(1108 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) TextUtils.indexOf("", "", 0), 50 - (AudioTrack.getMinVolume() > f11 ? 1 : (AudioTrack.getMinVolume() == f11 ? 0 : -1)));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr9 = new Object[1];
                    b(b15, b16, b16, objArr9);
                    method5 = cls7.getMethod((String) objArr9[0], Object.class, Object.class);
                    map5.put(-249860496, method5);
                }
                ((Method) method5).invoke(null, objArr8);
            }
        } else {
            int length4 = iArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length4;
            char[] cArr7 = new char[length4];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i24 = challengeStatusReceiver.getDeviceData;
                int i25 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i24 >= i25) {
                    objArr[0] = new String(cArr7);
                    return;
                }
                int i26 = $10 + 57;
                $11 = i26 % 128;
                if (i26 % 2 == 0) {
                    cArr7[i24] = (char) (cArr2[iArr[(i25 >>> 1) % i24] >>> i11] / iIntValue);
                } else {
                    cArr7[i24] = (char) (cArr2[iArr[(i25 - 1) - i24] - i11] - iIntValue);
                    i24++;
                }
                challengeStatusReceiver.getDeviceData = i24;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.ah.getSDKEphemeralPublicKey.$$a
            int r6 = r6 * 2
            int r6 = 109 - r6
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r8 = r8 * 2
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L19
            r3 = r0
            r4 = r2
            r0 = r7
            goto L32
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r0
            r0 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L32:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r0
            r0 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ah.getSDKEphemeralPublicKey.b(short, short, byte, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        getDeviceData = new char[]{64841, 64838, 64856, 64876, 64842, 64852, 64843, 64873, 64868, 64869, 64874, 64854, 64857, 64834, 64816, 64807, 64819, 64851, 64813, 64823, 64844, 64850, 64853, 64872, 64824, 64818};
        AuthenticationRequestParameters = -185467493;
        getSDKAppID = true;
        getSDKTransactionID = true;
    }

    static void init$0() {
        $$a = new byte[]{125, -62, 102, 61};
        $$b = 174;
    }

    @Override // atd.ac.getSDKAppID
    public final String getSDKAppID() throws Throwable {
        Object obj;
        int i11 = getMessageVersion + 29;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(null, null, View.resolveSizeAndState(1, 0, 0) + 33, "\u008a\u0089\u0088\u0084\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(null, null, 127 - View.resolveSizeAndState(0, 0, 0), "\u008a\u0089\u0088\u0084\u0087\u0086\u0083\u0085\u0084\u0083\u0082\u0081", objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // atd.ah.ChallengeResult
    public final atd.ag.getDeviceData getSDKReferenceNumber(atd.ai.getSDKEphemeralPublicKey getsdkephemeralpublickey, atd.af.AuthenticationRequestParameters authenticationRequestParameters) {
        getSDKEphemeralPublicKey = (getMessageVersion + 99) % 128;
        atd.af.AuthenticationRequestParameters.getDeviceData(authenticationRequestParameters, atd.af.getSDKAppID.class);
        atd.ag.getDeviceData sDKAppID = getSDKAppID(getsdkephemeralpublickey.getSDKAppID());
        getSDKEphemeralPublicKey = (getMessageVersion + 47) % 128;
        return sDKAppID;
    }

    private static atd.ag.getDeviceData getSDKAppID(atd.ag.AuthenticationRequestParameters authenticationRequestParameters) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(authenticationRequestParameters.getDeviceData());
            keyGenerator.init(authenticationRequestParameters.getSDKTransactionID());
            atd.ag.getDeviceData getdevicedata = new atd.ag.getDeviceData(keyGenerator.generateKey(), authenticationRequestParameters);
            getSDKEphemeralPublicKey = (getMessageVersion + 71) % 128;
            return getdevicedata;
        } catch (NoSuchAlgorithmException unused) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    @Override // atd.ah.getDeviceData
    public final byte[] getSDKReferenceNumber(atd.ag.getDeviceData getdevicedata, RSAPublicKey rSAPublicKey) {
        Cipher cipher;
        int i11 = getSDKEphemeralPublicKey + 23;
        getMessageVersion = i11 % 128;
        try {
            if (i11 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(null, null, 6 - (Process.myPid() - 107), "\u009a\u0093\u008f\u0094\u0094\u0099\u0087\u0098\u0097\u0096\u0095\u0094\u0093\u0083\u008a\u0089\u0088\u0084\u0083\u0092\u0082\u0091\u0090\u008f\u008e\u0087\u0086\u0083\u0085\u008b\u008d\u008c\u0086\u008b\u0083\u0082\u0081", objArr);
                cipher = Cipher.getInstance(((String) objArr[0]).intern());
                cipher.init(2, rSAPublicKey, getSDKReferenceNumber);
            } else {
                Object[] objArr2 = new Object[1];
                a(null, null, 127 - (Process.myPid() >> 22), "\u009a\u0093\u008f\u0094\u0094\u0099\u0087\u0098\u0097\u0096\u0095\u0094\u0093\u0083\u008a\u0089\u0088\u0084\u0083\u0092\u0082\u0091\u0090\u008f\u008e\u0087\u0086\u0083\u0085\u008b\u008d\u008c\u0086\u008b\u0083\u0082\u0081", objArr2);
                cipher = Cipher.getInstance(((String) objArr2[0]).intern());
                cipher.init(3, rSAPublicKey, getSDKReferenceNumber);
            }
            return cipher.wrap(getdevicedata);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }
}
