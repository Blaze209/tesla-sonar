package atd.af;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultTimeout;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AuthenticationRequestParameters {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static long getSDKTransactionID;
    private String getSDKAppID;
    private String getSDKReferenceNumber;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResultCancelled = 1;
        getSDKTransactionID = -6757399832308763633L;
        getDeviceData = 1458778038;
        AuthenticationRequestParameters = (char) 12214;
    }

    AuthenticationRequestParameters(JSONObject jSONObject) throws Throwable {
        Object[] objArr = new Object[1];
        c((char) (View.getDefaultSize(0, 0) + 648), "冀沘衪윂", "鮹쬀㺗枉", "匞\uf832匇", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1785501778, objArr);
        this.getSDKAppID = jSONObject.optString(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        c((char) (20229 - Process.getGidForName("")), "ؽ窤۔潏", "鮹쬀㺗枉", "ꉵᬉ䥏", (-730160122) - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
        this.getSDKReferenceNumber = jSONObject.getString(((String) objArr2[0]).intern());
    }

    public static AuthenticationRequestParameters AuthenticationRequestParameters(JSONObject jSONObject) throws Throwable {
        ChallengeResultCancelled = (BuildConfig + 123) % 128;
        Object[] objArr = new Object[1];
        c((char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20230), "ؽ窤۔潏", "鮹쬀㺗枉", "ꉵᬉ䥏", (-730160122) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        String string = jSONObject.getString(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        c((char) (9217 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), "כּ\uf15eV줤", "鮹쬀㺗枉", "梕⍥씩", 1458659067 - (ViewConfiguration.getTouchSlop() >> 8), objArr2);
        if (((String) objArr2[0]).intern().equals(string)) {
            getSDKAppID getsdkappid = new getSDKAppID(jSONObject);
            BuildConfig = (ChallengeResultCancelled + 77) % 128;
            return getsdkappid;
        }
        Object[] objArr3 = new Object[1];
        c((char) (52945 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), "攨☗턹廎", "鮹쬀㺗枉", "\ue62c쨠", TextUtils.indexOf((CharSequence) "", '0') + 1, objArr3);
        if (((String) objArr3[0]).intern().equals(string)) {
            return new getDeviceData(jSONObject);
        }
        Object[] objArr4 = new Object[1];
        c((char) (TextUtils.indexOf("", "", 0) + 44838), "\uf0dc\ue544☵Ꭿ", "鮹쬀㺗枉", "潋⻛흮", KeyEvent.normalizeMetaState(0) + 904217840, objArr4);
        if (((String) objArr4[0]).intern().equals(string)) {
            return new getSDKReferenceNumber(jSONObject);
        }
        throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.getSDKTransactionID();
    }

    private static void c(char c11, String str, String str2, String str3, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        Integer num = -2032575242;
        Integer num2 = 262890898;
        if (str3 != null) {
            $11 = ($10 + 59) % 128;
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            charArray2 = str.toCharArray();
            $11 = ($10 + 21) % 128;
        } else {
            charArray2 = str;
        }
        char[] cArr2 = charArray2;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = charArray3.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr2, 0, cArr3, 0, length);
        System.arraycopy(charArray3, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c11);
        int i12 = 2;
        cArr4[2] = (char) (cArr4[2] + ((char) i11));
        int length3 = cArr.length;
        char[] cArr5 = new char[length3];
        challengeResultTimeout.getSDKTransactionID = 0;
        while (challengeResultTimeout.getSDKTransactionID < length3) {
            $11 = ($10 + 85) % 128;
            try {
                Object[] objArr2 = {challengeResultTimeout};
                Map map = getMessageVersion.timedout;
                Object method = map.get(num2);
                int i13 = i12;
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(1862 - TextUtils.getOffsetAfter("", 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 22 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr3 = new Object[1];
                    d(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(num2, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {challengeResultTimeout};
                Object method2 = map.get(num);
                if (method2 == null) {
                    method2 = ((Class) getMessageVersion.getSDKTransactionID(273 - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 43)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i14 = cArr3[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                Object[] objArr5 = new Object[3];
                objArr5[i13] = Integer.valueOf(cArr4[iIntValue]);
                objArr5[1] = Integer.valueOf(i14);
                objArr5[0] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2445, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 18 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 + 1);
                    Object[] objArr6 = new Object[1];
                    d(b13, b14, (byte) (b14 - 1), objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                    map.put(484986213, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i15 = cArr3[iIntValue2] * 32718;
                char c12 = cArr4[iIntValue];
                Object[] objArr7 = new Object[i13];
                objArr7[1] = Integer.valueOf(c12);
                objArr7[0] = Integer.valueOf(i15);
                Object method4 = map.get(-919285918);
                if (method4 == null) {
                    method4 = ((Class) getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2968, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 9914), TextUtils.indexOf("", "", 0, 0) + 37)).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr4[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c13 = challengeResultTimeout.getDeviceData;
                cArr3[iIntValue2] = c13;
                int i16 = challengeResultTimeout.getSDKTransactionID;
                cArr5[i16] = (char) (((((long) (c13 ^ cArr[i16])) ^ (getSDKTransactionID ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) getDeviceData) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) AuthenticationRequestParameters) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i16 + 1;
                i12 = i13;
                length3 = length3;
                cArr = cArr;
                cArr3 = cArr3;
                cArr4 = cArr4;
                num = num;
                num2 = num2;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 1 - r6
            int r7 = r7 * 4
            int r7 = r7 + 102
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r0 = atd.af.AuthenticationRequestParameters.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.af.AuthenticationRequestParameters.d(short, int, byte, java.lang.Object[]):void");
    }

    public static void getDeviceData(AuthenticationRequestParameters authenticationRequestParameters, Class<? extends AuthenticationRequestParameters> cls) {
        ChallengeResultCancelled = (BuildConfig + 57) % 128;
        if (!cls.isInstance(authenticationRequestParameters)) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.getSDKTransactionID();
        }
        ChallengeResultCancelled = (BuildConfig + 9) % 128;
    }

    static void init$0() {
        $$d = new byte[]{88, -76, 55, 74};
        $$e = 143;
    }

    public final String ChallengeResultCancelled() {
        int i11 = (ChallengeResultCancelled + 125) % 128;
        BuildConfig = i11;
        String str = this.getSDKAppID;
        int i12 = i11 + 9;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void getSDKTransactionID() {
        int i11 = ChallengeResultCancelled + 55;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            this.getSDKAppID = null;
            this.getSDKReferenceNumber = null;
        } else {
            this.getSDKAppID = null;
            this.getSDKReferenceNumber = null;
            int i12 = 76 / 0;
        }
    }

    AuthenticationRequestParameters(String str, String str2) {
        this.getSDKAppID = str;
        this.getSDKReferenceNumber = str2;
    }
}
