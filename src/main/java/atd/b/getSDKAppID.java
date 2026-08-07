package atd.b;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.ChallengeResultCompleted;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKAppID extends getSDKReferenceNumber<String> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int[] AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKReferenceNumber = 1;
        AuthenticationRequestParameters = new int[]{1760836488, -1818165338, -1759891275, 442189890, -29337483, -1564346745, -1934425249, 1959123319, -1354971373, 936118411, 2023950118, -510542276, -587981352, -1026369160, -80779607, -1183259511, 852325227, 1008699846};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getSDKAppID(String str) throws Throwable {
        Object[] objArr = new Object[1];
        a(new int[]{-651423133, -769356306, -2004198418, 656025398, -543131925, -1049942649, -1772675177, -432326811, 1710555554, -579660202, -638863526, -1176195540}, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 22, objArr);
        super(((String) objArr[0]).intern(), str);
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        Object method;
        Object method2;
        Object method3;
        Integer num = 1109131256;
        ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
        char[] cArr = new char[4];
        int i12 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        int i13 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i14])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        method3 = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.resolveSize(i13, i13) + 1862, (char) TextUtils.indexOf("", ""), 21 - TextUtils.getOffsetBefore("", 0));
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method3 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2050190164, method3);
                    }
                    iArr3[i14] = ((Integer) ((Method) method3).invoke(null, objArr2)).intValue();
                    i14++;
                    cArr = cArr;
                    iArr3 = iArr3;
                    iArr2 = iArr2;
                    length = length;
                    i13 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        char[] cArr3 = cArr;
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AuthenticationRequestParameters;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i15 = 0;
            while (i15 < length3) {
                int i16 = $11 + 45;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i15])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object obj2 = map2.get(2050190164);
                    if (obj2 != null) {
                        method2 = obj2;
                    } else {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - Color.alpha(0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (Process.myPid() >> 22) + 21);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2050190164, method2);
                    }
                    iArr6[i15] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                    i15 /= 0;
                } else {
                    num = num;
                    cArr2 = cArr2;
                    iArr5 = iArr5;
                    length3 = length3;
                    iArr6 = iArr6;
                    int i17 = i15;
                    Object[] objArr6 = {Integer.valueOf(iArr5[i17])};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method4 = map3.get(2050190164);
                    if (method4 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) TextUtils.indexOf("", "", 0, 0), 'E' - AndroidCharacter.getMirror('0'));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, b16, objArr7);
                        method4 = cls4.getMethod((String) objArr7[0], cls);
                        map3.put(2050190164, method4);
                    }
                    iArr6[i17] = ((Integer) ((Method) method4).invoke(null, objArr6)).intValue();
                    i15 = i17 + 1;
                }
                iArr5 = iArr5;
                iArr6 = iArr6;
                cArr2 = cArr2;
                num = num;
                length3 = length3;
            }
            iArr5 = iArr6;
        }
        Integer num2 = num;
        char[] cArr4 = cArr2;
        char c11 = '0';
        char c12 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        while (true) {
            int i18 = challengeResultCompleted.getDeviceData;
            if (i18 >= iArr.length) {
                break;
            }
            int i19 = iArr[i18];
            char c13 = (char) (i19 >> 16);
            cArr3[c12] = c13;
            char c14 = (char) i19;
            cArr3[1] = c14;
            int i21 = 16;
            char c15 = (char) (iArr[i18 + 1] >> 16);
            cArr3[i12] = c15;
            char c16 = (char) iArr[i18 + 1];
            char c17 = 3;
            cArr3[3] = c16;
            challengeResultCompleted.getSDKAppID = (c13 << 16) + c14;
            challengeResultCompleted.getSDKReferenceNumber = (c15 << 16) + c16;
            ChallengeResultCompleted.getSDKAppID(iArr4);
            char c18 = 17;
            $11 = ($10 + 17) % 128;
            int i22 = 0;
            while (i22 < i21) {
                int i23 = challengeResultCompleted.getSDKAppID ^ iArr4[i22];
                challengeResultCompleted.getSDKAppID = i23;
                int sDKAppID = ChallengeResultCompleted.getSDKAppID(i23);
                Object[] objArr8 = new Object[4];
                objArr8[c17] = challengeResultCompleted;
                objArr8[i12] = challengeResultCompleted;
                objArr8[1] = Integer.valueOf(sDKAppID);
                objArr8[0] = challengeResultCompleted;
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method5 = map4.get(929629307);
                if (method5 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.combineMeasuredStates(0, 0) + 1299, (char) (CipherSuite.TLS_PSK_WITH_AES_128_CCM_8 - TextUtils.lastIndexOf("", c11)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33);
                    byte b17 = (byte) 0;
                    byte b18 = b17;
                    Object[] objArr9 = new Object[1];
                    b(b17, b18, (byte) (b18 + 3), objArr9);
                    method5 = cls5.getMethod((String) objArr9[0], Object.class, cls, Object.class, Object.class);
                    map4.put(929629307, method5);
                }
                int iIntValue = ((Integer) ((Method) method5).invoke(null, objArr8)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i22++;
                i21 = i21;
                c18 = c18;
                c17 = c17;
                c11 = '0';
            }
            char c19 = c18;
            char c21 = c17;
            int i24 = challengeResultCompleted.getSDKAppID;
            int i25 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i25;
            challengeResultCompleted.getSDKReferenceNumber = i24;
            int i26 = i24 ^ iArr4[i21];
            challengeResultCompleted.getSDKReferenceNumber = i26;
            int i27 = i25 ^ iArr4[c19];
            challengeResultCompleted.getSDKAppID = i27;
            cArr3[0] = (char) (i27 >>> 16);
            cArr3[1] = (char) i27;
            cArr3[i12] = (char) (i26 >>> 16);
            cArr3[c21] = (char) i26;
            ChallengeResultCompleted.getSDKAppID(iArr4);
            int i28 = challengeResultCompleted.getDeviceData;
            cArr4[i28 * 2] = cArr3[0];
            cArr4[(i28 * 2) + 1] = cArr3[1];
            cArr4[(i28 * 2) + 2] = cArr3[i12];
            cArr4[(i28 * 2) + 3] = cArr3[c21];
            Object[] objArr10 = new Object[i12];
            objArr10[1] = challengeResultCompleted;
            objArr10[0] = challengeResultCompleted;
            Map map5 = atd.a.getMessageVersion.timedout;
            Integer num3 = num2;
            Object obj3 = map5.get(num3);
            if (obj3 != null) {
                method = obj3;
            } else {
                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2060 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (AndroidCharacter.getMirror('0') - '0'), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18);
                byte b19 = (byte) 0;
                byte b21 = b19;
                Object[] objArr11 = new Object[1];
                b(b19, b21, (byte) (b21 + 2), objArr11);
                method = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                map5.put(num3, method);
            }
            ((Method) method).invoke(null, objArr10);
            num2 = num3;
            c12 = 0;
            i12 = 2;
            c11 = '0';
        }
        String str = new String(cArr4, 0, i11);
        int i29 = $11 + 77;
        $10 = i29 % 128;
        if (i29 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r9 = r9 + 117
            byte[] r0 = atd.b.getSDKAppID.$$d
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r5 = r2
            goto L2d
        L15:
            r3 = r9
            r9 = r7
            r7 = r3
            r3 = r2
        L19:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L2d:
            int r7 = r7 + 1
            int r9 = r9 + r3
            r3 = r9
            r9 = r7
            r7 = r3
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.getSDKAppID.b(int, byte, short, java.lang.Object[]):void");
    }

    private static boolean getSDKTransactionID(String str) {
        getSDKReferenceNumber = (getSDKAppID + 77) % 128;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i11 = (getSDKReferenceNumber + 21) % 128;
        getSDKAppID = i11;
        getSDKReferenceNumber = (i11 + 117) % 128;
        return true;
    }

    static void init$0() {
        $$d = new byte[]{102, 100, -115, -8};
        $$e = EnumC4419g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE;
    }

    @Override // atd.b.getSDKReferenceNumber
    final /* synthetic */ boolean getSDKReferenceNumber(String str) {
        getSDKAppID = (getSDKReferenceNumber + 87) % 128;
        boolean sDKTransactionID = getSDKTransactionID(str);
        getSDKReferenceNumber = (getSDKAppID + 123) % 128;
        return sDKTransactionID;
    }
}
