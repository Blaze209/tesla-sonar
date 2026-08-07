package atd.b;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import atd.az.getTransactionStatus;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BuildConfig extends getSDKReferenceNumber<String> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int ChallengeResult;
    private static long getSDKAppID;
    public static final Boolean getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private String AuthenticationRequestParameters;
    private String getDeviceData;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        ChallengeResult = 1;
        ChallengeResult();
        Color.red(0);
        ViewConfiguration.getScrollBarSize();
        ViewConfiguration.getJumpTapTimeout();
        Process.myTid();
        ViewConfiguration.getScrollDefaultDelay();
        ViewConfiguration.getScrollDefaultDelay();
        ExpandableListView.getPackedPositionForGroup(0);
        getSDKReferenceNumber = Boolean.TRUE;
        ChallengeResult = (getSDKTransactionID + 5) % 128;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BuildConfig(@NonNull String str, String str2) throws Throwable {
        Object[] objArr = new Object[1];
        a("㱾ࠝ咵ꅻ\uedf2㦐ط勍齧\ueb1f㞪", 13410 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        super(((String) objArr[0]).intern(), str);
        this.getDeviceData = str;
        this.AuthenticationRequestParameters = str2;
    }

    static void ChallengeResult() {
        getSDKAppID = -5707013466664212049L;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0222  */
    /* JADX WARN: Code duplicated, block: B:51:0x0223  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        int i12;
        char[] charArray = str != null ? str.toCharArray() : str;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = charArray.length;
        long[] jArr = new long[length];
        int i13 = 0;
        gettransactionstatus.getSDKTransactionID = 0;
        $11 = ($10 + 79) % 128;
        while (true) {
            int i14 = gettransactionstatus.getSDKTransactionID;
            if (i14 >= charArray.length) {
                break;
            }
            int i15 = $10 + 23;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            Class cls = Integer.TYPE;
            if (i16 == 0) {
                char c11 = charArray[i14];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[2] = gettransactionstatus;
                    objArr2[1] = gettransactionstatus;
                    objArr2[i13] = Integer.valueOf(c11);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(962978490);
                    if (method != null) {
                        i12 = i13;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(689 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (ExpandableListView.getPackedPositionGroup(0L) + 16022), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 32);
                        byte b11 = (byte) i13;
                        byte b12 = b11;
                        i12 = i13;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[i12], cls, Object.class, Object.class);
                        map.put(962978490, method);
                    }
                    jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() * (getSDKAppID / (-2227742522694838850L));
                    Object[] objArr4 = new Object[2];
                    objArr4[1] = gettransactionstatus;
                    objArr4[i12] = gettransactionstatus;
                    Object method2 = map.get(-46730980);
                    if (method2 == null) {
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (29017 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 24)).getMethod("A", Object.class, Object.class);
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
            } else {
                long[] jArr2 = jArr;
                int i17 = i13;
                char c12 = charArray[i14];
                Object[] objArr5 = new Object[3];
                objArr5[2] = gettransactionstatus;
                objArr5[1] = gettransactionstatus;
                objArr5[i17] = Integer.valueOf(c12);
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(962978490);
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(689 - (Process.myTid() >> 22), (char) (16022 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Gravity.getAbsoluteGravity(i17, i17) + 32);
                    byte b13 = (byte) i17;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[i17], cls, Object.class, Object.class);
                    map2.put(962978490, method3);
                }
                jArr2[i14] = ((Long) ((Method) method3).invoke(null, objArr5)).longValue() ^ (getSDKAppID ^ (-2227742522694838850L));
                Object[] objArr7 = {gettransactionstatus, gettransactionstatus};
                Object method4 = map2.get(-46730980);
                if (method4 == null) {
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(416 - TextUtils.indexOf((CharSequence) "", '0'), (char) (29016 - Process.getGidForName("")), TextUtils.lastIndexOf("", '0') + 25)).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                jArr = jArr2;
                charArray = charArray;
                i13 = 0;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = charArray;
        long[] jArr3 = jArr;
        char[] cArr2 = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i18 = gettransactionstatus.getSDKTransactionID;
            char[] cArr3 = cArr;
            if (i18 >= cArr3.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            cArr2[i18] = (char) jArr3[i18];
            Object[] objArr8 = {gettransactionstatus, gettransactionstatus};
            Map map3 = atd.a.getMessageVersion.timedout;
            Object method5 = map3.get(-46730980);
            if (method5 == null) {
                method5 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(View.MeasureSpec.getMode(0) + 417, (char) (TextUtils.indexOf("", "", 0, 0) + 29017), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23)).getMethod("A", Object.class, Object.class);
                map3.put(-46730980, method5);
            }
            ((Method) method5).invoke(null, objArr8);
            cArr = cArr3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r7 = r7 * 3
            int r7 = 118 - r7
            byte[] r0 = atd.b.BuildConfig.$$d
            int r5 = r5 * 2
            int r5 = r5 + 1
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r5
            r7 = r6
            r3 = r2
            goto L2e
        L17:
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r2
        L1b:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L2c
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L2c:
            r4 = r0[r7]
        L2e:
            int r4 = -r4
            int r6 = r6 + r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.BuildConfig.b(short, byte, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        return getSDKTransactionID(objArr);
    }

    static void init$0() {
        $$d = new byte[]{114, -98, 117, -42};
        $$e = 12;
    }

    public final String BuildConfig() {
        int i11 = getSDKTransactionID + 89;
        int i12 = i11 % 128;
        ChallengeResult = i12;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = this.AuthenticationRequestParameters;
        getSDKTransactionID = (i12 + 105) % 128;
        return str;
    }

    public final String getDeviceData() {
        int i11 = getSDKTransactionID + 103;
        int i12 = i11 % 128;
        ChallengeResult = i12;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = this.getDeviceData;
        getSDKTransactionID = (i12 + 35) % 128;
        return str;
    }

    @Override // atd.b.getSDKReferenceNumber, atd.f.getSDKReferenceNumber
    public final JSONObject getSDKAppID() throws Throwable {
        JSONObject jSONObject = new JSONObject();
        if (getSDKTransactionID(getSDKReferenceNumber())) {
            getSDKTransactionID = (ChallengeResult + 53) % 128;
            jSONObject.put(AuthenticationRequestParameters(), getSDKReferenceNumber());
        }
        Object[] objArr = new Object[1];
        a("㱾ᙣ桉䈇鐕\ueef0샬\u1aae沘䝠饆\uf35d", TextUtils.indexOf("", "", 0) + 10781, objArr);
        jSONObject.putOpt(((String) objArr[0]).intern(), this.AuthenticationRequestParameters);
        int i11 = ChallengeResult + 55;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return jSONObject;
        }
        throw null;
    }

    @Override // atd.b.getSDKReferenceNumber
    final /* synthetic */ boolean getSDKReferenceNumber(String str) throws Throwable {
        ChallengeResult = (getSDKTransactionID + 109) % 128;
        boolean sDKTransactionID = getSDKTransactionID(str);
        getSDKTransactionID = (ChallengeResult + 77) % 128;
        return sDKTransactionID;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        BuildConfig buildConfig = (BuildConfig) objArr[0];
        ChallengeResult = (getSDKTransactionID + 45) % 128;
        super.getSDKTransactionID();
        buildConfig.getDeviceData = null;
        buildConfig.AuthenticationRequestParameters = null;
        int i11 = ChallengeResult + 51;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x0076 A[PHI: r7
      0x0076: PHI (r7v2 boolean) = (r7v1 boolean), (r7v3 boolean) binds: [B:8:0x0074, B:5:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean getSDKTransactionID(String str) throws Throwable {
        boolean zEquals;
        int i11 = getSDKTransactionID + 101;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a("㰡\ud927", 58631 - Color.blue(0), objArr);
            boolean zEquals2 = ((String) objArr[0]).intern().equals(str);
            Object[] objArr2 = new Object[1];
            a("㰡Ԍ", 984 - Process.getGidForName(""), objArr2);
            zEquals = ((String) objArr2[0]).intern().equals(str);
            if (!zEquals2) {
                ChallengeResult = (getSDKTransactionID + 11) % 128;
                if (zEquals) {
                    return false;
                }
            }
        } else {
            Object[] objArr3 = new Object[1];
            a("㰡\ud927", 58631 - Color.blue(0), objArr3);
            boolean zEquals3 = ((String) objArr3[0]).intern().equals(str);
            Object[] objArr4 = new Object[1];
            a("㰡Ԍ", Process.getGidForName("") + 14640, objArr4);
            zEquals = ((String) objArr4[0]).intern().equals(str);
            if (!zEquals3) {
                ChallengeResult = (getSDKTransactionID + 11) % 128;
                if (zEquals) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // atd.b.getSDKReferenceNumber
    public final void getSDKTransactionID() {
        getSDKTransactionID(new Object[]{this}, -68380020, 68380020, System.identityHashCode(this));
    }
}
