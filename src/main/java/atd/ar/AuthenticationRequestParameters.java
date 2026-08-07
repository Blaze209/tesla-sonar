package atd.ar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.Signature;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import atd.a.getMessageVersion;
import atd.az.getAdditionalDetails;
import atd.az.getTransactionStatus;
import atd.json.ChallengeResultCancelled;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationRequestParameters implements getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int getDeviceData;
    private static long getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getDeviceData = 1;
        AuthenticationRequestParameters();
        getDeviceData();
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getTapTimeout();
        getSDKTransactionID = (getDeviceData + 1) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x017c  */
    /* JADX WARN: Code duplicated, block: B:40:0x017d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        Object charArray;
        Throwable cause;
        int i12;
        Object method;
        int i13 = $11 + 33;
        $10 = i13 % 128;
        char c11 = 2;
        int i14 = 0;
        if (i13 % 2 != 0) {
            int i15 = 24 / 0;
            if (str != null) {
                charArray = str.toCharArray();
                $10 = ($11 + 117) % 128;
            } else {
                charArray = str;
            }
        } else if (str != null) {
            charArray = str.toCharArray();
            $10 = ($11 + 117) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = (char[]) charArray;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = cArr.length;
        long[] jArr = new long[length];
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i16 = gettransactionstatus.getSDKTransactionID;
            if (i16 >= cArr.length) {
                break;
            }
            char c12 = cArr[i16];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c11] = gettransactionstatus;
                objArr2[1] = gettransactionstatus;
                objArr2[i14] = Integer.valueOf(c12);
                Map map = getMessageVersion.timedout;
                Object obj = map.get(962978490);
                if (obj != null) {
                    method = obj;
                    i12 = i14;
                } else {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(689 - (Process.myPid() >> 22), (char) (16022 - KeyEvent.getDeadChar(i14, i14)), 33 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                    byte b11 = (byte) i14;
                    byte b12 = (byte) (b11 + 1);
                    i12 = i14;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, (byte) (b12 - 1), objArr3);
                    method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                    map.put(962978490, method);
                }
                jArr[i16] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (AuthenticationRequestParameters ^ (-2227742522694838850L));
                Object[] objArr4 = new Object[2];
                objArr4[1] = gettransactionstatus;
                objArr4[i12] = gettransactionstatus;
                Object method2 = map.get(-46730980);
                if (method2 == null) {
                    int i17 = i12;
                    method2 = ((Class) getMessageVersion.getSDKTransactionID((CdmaCellLocation.convertQuartSecToDecDegrees(i12) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i12) == 0.0d ? 0 : -1)) + 417, (char) (KeyEvent.getDeadChar(i17, i17) + 29017), (ViewConfiguration.getJumpTapTimeout() >> 16) + 24)).getMethod("A", Object.class, Object.class);
                    map.put(-46730980, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                $11 = ($10 + 77) % 128;
                jArr = jArr;
                c11 = 2;
                i14 = 0;
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
        char[] cArr2 = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i18 = gettransactionstatus.getSDKTransactionID;
            if (i18 >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            $10 = ($11 + 105) % 128;
            cArr2[i18] = (char) jArr2[i18];
            Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
            Map map2 = getMessageVersion.timedout;
            Object method3 = map2.get(-46730980);
            if (method3 == null) {
                method3 = ((Class) getMessageVersion.getSDKTransactionID(417 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (29017 - TextUtils.indexOf("", "", 0)), 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("A", Object.class, Object.class);
                map2.put(-46730980, method3);
            }
            ((Method) method3).invoke(null, objArr5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = atd.ar.AuthenticationRequestParameters.$$a
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r5 = r5 * 2
            int r1 = r5 + 1
            int r6 = r6 * 17
            int r6 = r6 + 101
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r5
            r6 = r7
            r4 = r2
            goto L2c
        L17:
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r2
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L2a
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L2a:
            r3 = r0[r6]
        L2c:
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ar.AuthenticationRequestParameters.b(short, int, int, java.lang.Object[]):void");
    }

    private static void c(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray = str != null ? str.toCharArray() : str;
        getAdditionalDetails getadditionaldetails = new getAdditionalDetails();
        char[] deviceData = getAdditionalDetails.getDeviceData(getSDKReferenceNumber ^ 4326518537449951405L, charArray, i11);
        getadditionaldetails.getDeviceData = 4;
        while (true) {
            int i12 = getadditionaldetails.getDeviceData;
            if (i12 >= deviceData.length) {
                objArr[0] = new String(deviceData, 4, deviceData.length - 4);
                return;
            }
            int i13 = i12 - 4;
            getadditionaldetails.getSDKTransactionID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(deviceData[i12] ^ deviceData[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKReferenceNumber)};
                Map map = getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollDefaultDelay() >> 16) + 2749, (char) (54838 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 29);
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getJumpTapTimeout() >> 16) + 1401, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16690), 21 - TextUtils.lastIndexOf("", '0'));
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr4 = new Object[1];
                    b(b11, b12, b12, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-719904898, method2);
                }
                ((Method) method2).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    private boolean cJ_(Signature[] signatureArr, String str) {
        int length = signatureArr.length;
        int i11 = 0;
        while (i11 < length) {
            getSDKTransactionID = (getDeviceData + 41) % 128;
            if (cK_(signatureArr[i11], str)) {
                getDeviceData = (getSDKTransactionID + 29) % 128;
                return true;
            }
            i11++;
            getSDKTransactionID = (getDeviceData + 83) % 128;
        }
        return false;
    }

    private boolean cK_(Signature signature, String str) throws Throwable {
        getSDKTransactionID = (getDeviceData + 61) % 128;
        String deviceData = getDeviceData(str);
        try {
            Object[] objArr = new Object[1];
            a("\uf8f8쥏鮓淙㸹\u0098틪ꌅ畲䟅ࡴ\uda71겾絥佢ᇄ\ue3ee둘蚓䣟ᤩ\ueb78뷔", (ViewConfiguration.getEdgeSlop() >> 16) + 12721, objArr);
            MessageDigest messageDigest = MessageDigest.getInstance(getSDKReferenceNumber(((String) objArr[0]).intern()));
            messageDigest.update(signature.toByteArray());
            boolean zEquals = getSDKTransactionID(messageDigest.digest()).equals(deviceData);
            int i11 = getSDKTransactionID + 17;
            getDeviceData = i11 % 128;
            if (i11 % 2 != 0) {
                return zEquals;
            }
            throw null;
        } catch (NoSuchAlgorithmException unused) {
            return false;
        }
    }

    public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
        return AuthenticationRequestParameters(objArr);
    }

    private static String getSDKReferenceNumber(String str) throws Throwable {
        getSDKTransactionID = (getDeviceData + 95) % 128;
        String sDKReferenceNumber = ChallengeResultCancelled.getSDKReferenceNumber(str);
        getDeviceData = (getSDKTransactionID + 53) % 128;
        return sDKReferenceNumber;
    }

    private static String getSDKTransactionID(byte[] bArr) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        int length = bArr.length;
        int i11 = 0;
        while (i11 < length) {
            getSDKTransactionID = (getDeviceData + 7) % 128;
            byte b11 = bArr[i11];
            Object[] objArr = new Object[1];
            a("\uf88e澎횳㷬", ExpandableListView.getPackedPositionChild(0L) + 38678, objArr);
            sb2.append(String.format(((String) objArr[0]).intern(), Byte.valueOf(b11)));
            i11++;
            getSDKTransactionID = (getDeviceData + 27) % 128;
        }
        return sb2.toString();
    }

    static void init$0() {
        $$a = new byte[]{88, 47, 87, -126};
        $$b = 46;
    }

    @Override // atd.ar.getSDKTransactionID
    public final boolean AuthenticationRequestParameters(Context context, Collection<String> collection) {
        HashSet hashSet;
        getSDKTransactionID = (getDeviceData + 57) % 128;
        if (collection != null) {
            hashSet = new HashSet(collection);
        } else {
            hashSet = new HashSet();
            getDeviceData = (getSDKTransactionID + 83) % 128;
        }
        hashSet.addAll(getSDKEphemeralPublicKey.getSDKAppID());
        return ((Boolean) atd.json.getSDKEphemeralPublicKey.getSDKTransactionID(new Object[]{context, hashSet}, 229542798, -229542798, (int) System.currentTimeMillis())).booleanValue();
    }

    @Override // atd.ar.getSDKTransactionID
    public final boolean getSDKAppID(Context context, String str) {
        Signature[] signatureArr;
        int i11 = getDeviceData + 59;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (str == null || (signatureArr = (Signature[]) atd.json.getSDKEphemeralPublicKey.getSDKTransactionID(new Object[]{context}, -641089908, 641089909, (int) System.currentTimeMillis())) == null) {
            return false;
        }
        boolean zCJ_ = cJ_(signatureArr, str);
        int i12 = getDeviceData + 55;
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 == 0) {
            return zCJ_;
        }
        throw null;
    }

    private static String getDeviceData(String str) throws Throwable {
        Object obj;
        int i11 = getDeviceData + 47;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            Object[] objArr = new Object[1];
            a("\uf8f1伨霳\udf27❂潮띒", 47087 >>> ExpandableListView.getPackedPositionType(0L), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("\uf8f1伨霳\udf27❂潮띒", ExpandableListView.getPackedPositionType(0L) + 47087, objArr2);
            obj = objArr2[0];
        }
        String lowerCase = str.replaceAll(getSDKReferenceNumber(((String) obj).intern()), "").toLowerCase(Locale.US);
        int i12 = getSDKTransactionID + 111;
        getDeviceData = i12 % 128;
        if (i12 % 2 != 0) {
            return lowerCase;
        }
        throw null;
    }

    static void getDeviceData() {
        AuthenticationRequestParameters = 3297789200689016085L;
    }

    @Override // atd.ar.getDeviceData
    @SuppressLint({"AnnotateVersionCheck"})
    public final boolean getSDKAppID() {
        int i11 = getSDKTransactionID + 55;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0 && Build.VERSION.SDK_INT < 119) {
            return false;
        }
        getDeviceData = (getSDKTransactionID + 101) % 128;
        return true;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) throws Throwable {
        Context context = (Context) objArr[1];
        getSDKTransactionID = (getDeviceData + 111) % 128;
        Object[] objArr2 = new Object[1];
        a("\uf8c0諟ᳰ껿゚슟咿\ue6b8", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29200, objArr2);
        Object systemService = context.getSystemService(((String) objArr2[0]).intern());
        if (systemService == null) {
            getDeviceData = (getSDKTransactionID + 33) % 128;
            return Boolean.FALSE;
        }
        getSDKTransactionID = (getDeviceData + 115) % 128;
        try {
            Object[] objArr3 = new Object[1];
            c("\u0af6ગ즊\ue0fd⎨燾㸱껽䔈ⷩ핚媉䉟酬뤢脵\ue791\uf6dd\u1c8fⴘ鬓娵쀘䦷㽏뾑ꯠ\uf456탉\ue3e9ཐ", KeyEvent.normalizeMetaState(0) + 1, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c("ҁӨ嬽牗㣨檞먗ꂓ섹뽃츝\udef3䰚ϓꉱ՟\ue9df摷", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr4);
            Boolean bool = (Boolean) cls.getMethod((String) objArr4[0], null).invoke(systemService, null);
            bool.booleanValue();
            return bool;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = 8784706015172360628L;
    }

    @Override // atd.ar.getSDKReferenceNumber
    public final boolean AuthenticationRequestParameters(@NonNull Context context) {
        return ((Boolean) getDeviceData(new Object[]{this, context}, -1836551632, 1836551632, System.identityHashCode(this))).booleanValue();
    }
}
