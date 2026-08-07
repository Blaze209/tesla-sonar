package atd.an;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.az.ChallengeStatusHandler;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class BuildConfig {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static char ChallengeResult;
    private static int ChallengeResultCancelled;
    private static final atd.json.getDeviceData getDeviceData;
    private static char getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;
    private boolean getSDKAppID = false;
    private final byte[] getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResultCancelled = 1;
        ChallengeResultCancelled();
        getDeviceData = (atd.json.getDeviceData) atd.json.getDeviceData.getSDKTransactionID(new Object[0], 76032564, -76032563, (int) System.currentTimeMillis());
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 21) % 128;
    }

    public BuildConfig(byte[] bArr) {
        this.getSDKTransactionID = (byte[]) bArr.clone();
    }

    private static atd.json.getDeviceData AuthenticationRequestParameters() {
        int i11 = getSDKEphemeralPublicKey;
        atd.json.getDeviceData getdevicedata = getDeviceData;
        int i12 = i11 + 119;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 != 0) {
            return getdevicedata;
        }
        throw null;
    }

    static void ChallengeResultCancelled() {
        AuthenticationRequestParameters = (char) 52409;
        getSDKReferenceNumber = (char) 64246;
        getMessageVersion = (char) 23636;
        ChallengeResult = (char) 40458;
    }

    private static void c(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13 = 3;
        if (str != null) {
            charArray = str.toCharArray();
            $10 = ($11 + 3) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
        char[] cArr2 = new char[cArr.length];
        int i14 = 0;
        challengeStatusHandler.getSDKReferenceNumber = 0;
        int i15 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i16 = challengeStatusHandler.getSDKReferenceNumber;
            if (i16 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            int i17 = $10 + i13;
            $11 = i17 % 128;
            int i18 = 58224;
            char c11 = 1;
            if (i17 % i15 == 0) {
                cArr3[1] = cArr[i16];
                cArr3[i14] = cArr[i14];
            } else {
                cArr3[i14] = cArr[i16];
                cArr3[1] = cArr[i16 + 1];
            }
            int i19 = i14;
            while (i19 < 16) {
                char c12 = cArr3[c11];
                char c13 = cArr3[i14];
                int i21 = i13;
                int i22 = i18;
                int i23 = (c13 + i18) ^ ((c13 << 4) + ((char) (((long) getMessageVersion) ^ (-2881362678149017980L))));
                int i24 = c13 >>> 5;
                int i25 = i15;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[i21] = Integer.valueOf(ChallengeResult);
                    objArr2[i25] = Integer.valueOf(i24);
                    objArr2[c11] = Integer.valueOf(i23);
                    objArr2[i14] = Integer.valueOf(c12);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    Class cls = Integer.TYPE;
                    if (method != null) {
                        i12 = i14;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1744 - TextUtils.indexOf((CharSequence) "", '0'), (char) (16682 - KeyEvent.getDeadChar(i14, i14)), 28 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        byte b11 = (byte) i14;
                        byte b12 = b11;
                        i12 = i14;
                        Object[] objArr3 = new Object[1];
                        d(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char c14 = cArr3[i12];
                    int i26 = (cCharValue + i22) ^ ((cCharValue << 4) + ((char) (((long) AuthenticationRequestParameters) ^ (-2881362678149017980L))));
                    int i27 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[i21] = Integer.valueOf(getSDKReferenceNumber);
                    objArr4[i25] = Integer.valueOf(i27);
                    objArr4[1] = Integer.valueOf(i26);
                    objArr4[i12] = Integer.valueOf(c14);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((Process.myTid() >> 22) + 16682), 28 - Process.getGidForName(""));
                        int i28 = i12;
                        byte b13 = (byte) i28;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        d(b13, b14, b14, objArr5);
                        method2 = cls3.getMethod((String) objArr5[i28], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i18 = i22 - FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i19++;
                    i15 = i25;
                    i13 = i21;
                    cArr = cArr;
                    cArr3 = cArr3;
                    i14 = 0;
                    c11 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i29 = i13;
            char[] cArr4 = cArr;
            int i31 = i15;
            char[] cArr5 = cArr3;
            int i32 = challengeStatusHandler.getSDKReferenceNumber;
            cArr2[i32] = cArr5[0];
            cArr2[i32 + 1] = cArr5[1];
            Object[] objArr6 = new Object[i31];
            objArr6[1] = challengeStatusHandler;
            objArr6[0] = challengeStatusHandler;
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 == null) {
                Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1597 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (View.MeasureSpec.getSize(0) + 27824), 25 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                byte b15 = (byte) 0;
                byte b16 = b15;
                Object[] objArr7 = new Object[1];
                d(b15, b16, (byte) (b16 + 1), objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            $11 = ($10 + 109) % 128;
            i15 = i31;
            i13 = i29;
            cArr = cArr4;
            cArr3 = cArr5;
            i14 = 0;
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
    private static void d(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 112
            byte[] r0 = atd.an.BuildConfig.$$d
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r5 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
        L29:
            int r6 = r6 + 1
            int r8 = r8 + r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.an.BuildConfig.d(byte, int, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$d = new byte[]{98, -9, 35, 31};
        $$e = EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE;
    }

    public final byte[] BuildConfig() throws CloneNotSupportedException {
        int i11 = getSDKEphemeralPublicKey + 59;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            this.getSDKTransactionID.clone();
            throw null;
        }
        byte[] bArr = (byte[]) this.getSDKTransactionID.clone();
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 65) % 128;
        return bArr;
    }

    public void getDeviceData() {
        int i11 = getSDKEphemeralPublicKey + 101;
        int i12 = i11 % 128;
        ChallengeResultCancelled = i12;
        if (i11 % 2 == 0) {
            throw null;
        }
        byte[] bArr = this.getSDKTransactionID;
        if (bArr != null) {
            int i13 = i12 + 75;
            getSDKEphemeralPublicKey = i13 % 128;
            int i14 = i13 % 2;
            Arrays.fill(bArr, (byte) 0);
        }
        this.getSDKAppID = true;
    }

    public final JSONObject getMessageVersion() {
        JSONObject jSONObject = new JSONObject(new String(BuildConfig(), AuthenticationRequestParameters().getSDKReferenceNumber()));
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 123) % 128;
        return jSONObject;
    }

    public final String getSDKReferenceNumber() {
        int i11 = getSDKEphemeralPublicKey + 33;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            return AuthenticationRequestParameters().getSDKTransactionID(this.getSDKTransactionID);
        }
        AuthenticationRequestParameters().getSDKTransactionID(this.getSDKTransactionID);
        throw null;
    }

    public BuildConfig(String str, atd.am.ChallengeResultCancelled challengeResultCancelled) throws Throwable {
        if (atd.json.getDeviceData.getDeviceData(str)) {
            this.getSDKTransactionID = AuthenticationRequestParameters().getSDKAppID(str);
        } else {
            Object[] objArr = new Object[1];
            c("牌ۉ㲅续\uf66f\ue79a識䲼\ue60f噷\uf0c2⎽苃⛓䧴馴祏\uf798ᣲ鉹ᛰܳ\udb4d䑠뼰㝙彣峔寬ᆜ⊶崿", 31 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            throw new atd.z.AuthenticationRequestParameters(((String) objArr[0]).intern(), atd.i.getSDKTransactionID.DATA_DECRYPTION_FAILURE, challengeResultCancelled);
        }
    }
}
