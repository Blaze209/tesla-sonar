package atd.af;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultCompleted;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKReferenceNumber extends AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static int getSDKTransactionID;
    private final byte[] getDeviceData;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKTransactionID = 1;
        getDeviceData();
        ViewConfiguration.getScrollBarSize();
        getSDKTransactionID = (getSDKAppID + 85) % 128;
    }

    getSDKReferenceNumber(JSONObject jSONObject) throws Throwable {
        super(jSONObject);
        atd.json.getDeviceData getdevicedata = (atd.json.getDeviceData) atd.json.getDeviceData.getSDKTransactionID(new Object[0], 76032564, -76032563, (int) System.currentTimeMillis());
        Object[] objArr = new Object[1];
        a(new int[]{1686703867, -786815918}, 1 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        this.getDeviceData = getdevicedata.getSDKAppID(jSONObject.getString(((String) objArr[0]).intern()));
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        int length;
        int[] iArr2;
        Object method;
        Object method2;
        ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
        char[] cArr = new char[4];
        int i13 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        int i14 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i15 = 0;
            while (i15 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i15])};
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        method2 = obj;
                    } else {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(1861 - ImageFormat.getBitsPerPixel(i14), (char) (ImageFormat.getBitsPerPixel(i14) + 1), (ViewConfiguration.getFadingEdgeLength() >> 16) + 21);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 - 1), objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2050190164, method2);
                    }
                    iArr4[i15] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i15++;
                    cArr = cArr;
                    iArr4 = iArr4;
                    iArr3 = iArr3;
                    i14 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        char[] cArr3 = cArr;
        int i16 = 16;
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = AuthenticationRequestParameters;
        if (iArr6 != null) {
            int i17 = $10 + 59;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i18 = 0;
            while (i18 < length) {
                int i19 = $11 + 63;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    Object[] objArr4 = {Integer.valueOf(iArr6[i18])};
                    Map map2 = getMessageVersion.timedout;
                    Object obj2 = map2.get(2050190164);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1861, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 20);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 - 1), objArr5);
                        method = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2050190164, method);
                    }
                    iArr2[i18] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                    i18 >>= 1;
                } else {
                    cArr2 = cArr2;
                    iArr6 = iArr6;
                    length = length;
                    iArr2 = iArr2;
                    int i21 = i18;
                    Object[] objArr6 = {Integer.valueOf(iArr6[i21])};
                    Map map3 = getMessageVersion.timedout;
                    Object method3 = map3.get(2050190164);
                    if (method3 == null) {
                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID(1862 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) Color.argb(0, 0, 0, 0), 21 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, (byte) (b16 - 1), objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], cls);
                        map3.put(2050190164, method3);
                    }
                    iArr2[i21] = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    i18 = i21 + 1;
                }
                iArr2 = iArr2;
                iArr6 = iArr6;
                length = length;
                cArr2 = cArr2;
            }
            iArr6 = iArr2;
        }
        char[] cArr4 = cArr2;
        char c11 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        challengeResultCompleted.getDeviceData = 0;
        while (true) {
            int i22 = challengeResultCompleted.getDeviceData;
            if (i22 >= iArr.length) {
                String str = new String(cArr4, 0, i11);
                $10 = ($11 + 85) % 128;
                objArr[0] = str;
                return;
            }
            int i23 = iArr[i22];
            char c12 = (char) (i23 >> 16);
            cArr3[c11] = c12;
            char c13 = (char) i23;
            cArr3[1] = c13;
            char c14 = (char) (iArr[i22 + 1] >> 16);
            cArr3[i13] = c14;
            char c15 = (char) iArr[i22 + 1];
            int i24 = 3;
            cArr3[3] = c15;
            challengeResultCompleted.getSDKAppID = (c12 << 16) + c13;
            challengeResultCompleted.getSDKReferenceNumber = (c14 << 16) + c15;
            ChallengeResultCompleted.getSDKAppID(iArr5);
            int i25 = 0;
            while (i25 < i16) {
                $10 = ($11 + 25) % 128;
                int i26 = challengeResultCompleted.getSDKAppID ^ iArr5[i25];
                challengeResultCompleted.getSDKAppID = i26;
                int sDKAppID = ChallengeResultCompleted.getSDKAppID(i26);
                Object[] objArr8 = new Object[4];
                objArr8[i24] = challengeResultCompleted;
                objArr8[i13] = challengeResultCompleted;
                objArr8[1] = Integer.valueOf(sDKAppID);
                objArr8[0] = challengeResultCompleted;
                Map map4 = getMessageVersion.timedout;
                Object method4 = map4.get(929629307);
                if (method4 == null) {
                    Class cls5 = (Class) getMessageVersion.getSDKTransactionID(1298 - TextUtils.lastIndexOf("", '0'), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + CipherSuite.TLS_PSK_WITH_AES_128_CCM_8), 33 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    byte b17 = (byte) i24;
                    byte b18 = (byte) (b17 - 3);
                    Object[] objArr9 = new Object[1];
                    b(b17, b18, (byte) (b18 - 1), objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, cls, Object.class, Object.class);
                    map4.put(929629307, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i25++;
                $10 = ($11 + 7) % 128;
                i24 = i24;
                i16 = 16;
            }
            int i27 = i24;
            int i28 = challengeResultCompleted.getSDKAppID;
            int i29 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i29;
            challengeResultCompleted.getSDKReferenceNumber = i28;
            i16 = 16;
            int i31 = i28 ^ iArr5[16];
            challengeResultCompleted.getSDKReferenceNumber = i31;
            int i32 = i29 ^ iArr5[17];
            challengeResultCompleted.getSDKAppID = i32;
            cArr3[0] = (char) (i32 >>> 16);
            cArr3[1] = (char) i32;
            cArr3[i13] = (char) (i31 >>> 16);
            cArr3[i27] = (char) i31;
            ChallengeResultCompleted.getSDKAppID(iArr5);
            int i33 = challengeResultCompleted.getDeviceData;
            cArr4[i33 * 2] = cArr3[0];
            cArr4[(i33 * 2) + 1] = cArr3[1];
            cArr4[(i33 * 2) + 2] = cArr3[i13];
            cArr4[(i33 * 2) + 3] = cArr3[i27];
            Object[] objArr10 = new Object[i13];
            objArr10[1] = challengeResultCompleted;
            objArr10[0] = challengeResultCompleted;
            Map map5 = getMessageVersion.timedout;
            Object method5 = map5.get(1109131256);
            if (method5 != null) {
                i12 = 2;
            } else {
                Class cls6 = (Class) getMessageVersion.getSDKTransactionID(View.MeasureSpec.getMode(0) + 2061, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 18);
                i12 = 2;
                byte b19 = (byte) 2;
                byte b21 = (byte) (b19 - 2);
                Object[] objArr11 = new Object[1];
                b(b19, b21, (byte) (b21 - 1), objArr11);
                method5 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                map5.put(1109131256, method5);
            }
            ((Method) method5).invoke(null, objArr10);
            i13 = i12;
            c11 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = atd.af.getSDKReferenceNumber.$$a
            int r7 = r7 + 117
            int r9 = r9 + 4
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r0
            r5 = r2
            r0 = r9
            r9 = r8
            goto L2d
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r0
            r0 = r6
        L2d:
            int r7 = -r7
            int r7 = r7 + r9
            r9 = r0
            r0 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.af.getSDKReferenceNumber.b(byte, short, int, java.lang.Object[]):void");
    }

    static void getDeviceData() {
        AuthenticationRequestParameters = new int[]{-340348593, 853479877, 120520788, -179223926, 634283826, -220835139, 694874909, -1317973486, -783036280, -234038182, -307754009, 1010551347, 268964529, -104805932, 1977310590, 1217196181, -1318673753, -1934970252};
    }

    static void init$0() {
        $$a = new byte[]{120, -99, 115, 13};
        $$b = EnumC4419g.SDK_ASSET_ICON_SUBMIT_VALUE;
    }

    public final byte[] AuthenticationRequestParameters() {
        getSDKAppID = (getSDKTransactionID + 73) % 128;
        byte[] bArr = (byte[]) this.getDeviceData.clone();
        int i11 = getSDKTransactionID + 79;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 14 / 0;
        }
        return bArr;
    }

    @Override // atd.af.AuthenticationRequestParameters
    public final void getSDKTransactionID() {
        getSDKTransactionID = (getSDKAppID + 81) % 128;
        super.getSDKTransactionID();
        byte[] bArr = this.getDeviceData;
        if (bArr != null) {
            int i11 = getSDKAppID + 61;
            getSDKTransactionID = i11 % 128;
            Arrays.fill(bArr, i11 % 2 == 0 ? (byte) 1 : (byte) 0);
            getSDKAppID = (getSDKTransactionID + 111) % 128;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getSDKReferenceNumber(String str, byte[] bArr) throws Throwable {
        Object[] objArr = new Object[1];
        a(new int[]{1520966755, 211676349}, 3 - (Process.myTid() >> 22), objArr);
        super(str, ((String) objArr[0]).intern());
        this.getDeviceData = (byte[]) bArr.clone();
    }
}
