package atd.e;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes3.dex */
public class getSDKTransactionID implements Parcelable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final Parcelable.Creator<getSDKTransactionID> CREATOR;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int[] getSDKTransactionID;
    private atd.i.getSDKAppID getSDKReferenceNumber;

    /* JADX INFO: renamed from: atd.e.getSDKTransactionID$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        private static int AuthenticationRequestParameters = 0;
        static final /* synthetic */ int[] getSDKAppID;
        private static int getSDKTransactionID = 1;

        static {
            int[] iArr = new int[atd.i.getSDKAppID.values().length];
            getSDKAppID = iArr;
            try {
                iArr[atd.i.getSDKAppID.SINGLE_TEXT_INPUT.ordinal()] = 1;
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 7;
                int i13 = (i11 ^ 7) | i12;
                getSDKTransactionID = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getSDKAppID[atd.i.getSDKAppID.SINGLE_SELECT.ordinal()] = 2;
                int i14 = AuthenticationRequestParameters;
                int i15 = i14 & 21;
                int i16 = -(-((i14 ^ 21) | i15));
                getSDKTransactionID = ((i15 ^ i16) + ((i16 & i15) << 1)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                getSDKAppID[atd.i.getSDKAppID.MULTI_SELECT.ordinal()] = 3;
                int i17 = getSDKTransactionID;
                int i18 = i17 & 103;
                AuthenticationRequestParameters = ((i18 - (~((i17 ^ 103) | i18))) - 1) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                getSDKAppID[atd.i.getSDKAppID.OUT_OF_BAND.ordinal()] = 4;
                int i19 = AuthenticationRequestParameters;
                int i21 = (i19 & (-90)) | ((~i19) & 89);
                int i22 = (i19 & 89) << 1;
                getSDKTransactionID = ((i21 ^ i22) + ((i22 & i21) << 1)) % 128;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                getSDKAppID[atd.i.getSDKAppID.HTML_UI.ordinal()] = 5;
                int i23 = AuthenticationRequestParameters + 87;
                getSDKTransactionID = i23 % 128;
                if (i23 % 2 == 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getDeviceData = 1;
        getSDKAppID();
        CREATOR = new Parcelable.Creator<getSDKTransactionID>() { // from class: atd.e.getSDKTransactionID.5
            private static int getDeviceData = 1;
            private static int getSDKTransactionID;

            private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
                getSDKTransactionID getsdktransactionid;
                Parcel parcel = (Parcel) objArr[1];
                int i11 = getSDKTransactionID + 119;
                getDeviceData = i11 % 128;
                int i12 = i11 % 2;
                Object[] objArr2 = {parcel};
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (i12 == 0) {
                    getsdktransactionid = (getSDKTransactionID) getSDKAppID(objArr2, -1805777532, 1805777535, (int) jCurrentTimeMillis);
                    int i13 = 44 / 0;
                } else {
                    getsdktransactionid = (getSDKTransactionID) getSDKAppID(objArr2, -1805777532, 1805777535, (int) jCurrentTimeMillis);
                }
                int i14 = getDeviceData;
                int i15 = ((i14 ^ 39) | (i14 & 39)) << 1;
                int i16 = -(((~i14) & 39) | (i14 & (-40)));
                int i17 = (i15 & i16) + (i16 | i15);
                getSDKTransactionID = i17 % 128;
                if (i17 % 2 == 0) {
                    return getsdktransactionid;
                }
                throw null;
            }

            private static /* synthetic */ Object getDeviceData(Object[] objArr) {
                getSDKTransactionID[] getsdktransactionidArr;
                int iIntValue = ((Number) objArr[1]).intValue();
                int i11 = getSDKTransactionID;
                int i12 = (i11 & (-10)) | ((~i11) & 9);
                int i13 = -(-((i11 & 9) << 1));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                getDeviceData = i14 % 128;
                if (i14 % 2 == 0) {
                    getsdktransactionidArr = (getSDKTransactionID[]) getSDKAppID(new Object[]{Integer.valueOf(iIntValue)}, 1686827922, -1686827922, iIntValue);
                    int i15 = 72 / 0;
                } else {
                    getsdktransactionidArr = (getSDKTransactionID[]) getSDKAppID(new Object[]{Integer.valueOf(iIntValue)}, 1686827922, -1686827922, iIntValue);
                }
                int i16 = getDeviceData;
                int i17 = i16 & 53;
                int i18 = (((i16 ^ 53) | i17) << 1) - ((i16 | 53) & (~i17));
                getSDKTransactionID = i18 % 128;
                if (i18 % 2 == 0) {
                    return getsdktransactionidArr;
                }
                throw null;
            }

            public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
                int i14 = ~i11;
                int i15 = ~i13;
                int i16 = ~(i14 | i15);
                int i17 = ~i12;
                int i18 = (i11 * 868) + (i12 * 868) + ((i16 | (~(i17 | i15))) * (-867));
                int i19 = i14 | i17;
                int i21 = i18 + (((~i19) | (~(i14 | i13)) | (~(i17 | i13))) * (-1734)) + (((~(i11 | i17 | i13)) | (~(i12 | i14 | i13)) | (~(i15 | i19))) * 867);
                if (i21 == 1) {
                    return AuthenticationRequestParameters(objArr);
                }
                if (i21 == 2) {
                    return getDeviceData(objArr);
                }
                if (i21 != 3) {
                    return getSDKReferenceNumber(objArr);
                }
                getSDKTransactionID getsdktransactionid = new getSDKTransactionID((Parcel) objArr[0]);
                int i22 = getSDKTransactionID + 124;
                getDeviceData = ((i22 ^ (-1)) + (i22 << 1)) % 128;
                return getsdktransactionid;
            }

            private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
                int iIntValue = ((Number) objArr[0]).intValue();
                int i11 = getDeviceData;
                int i12 = i11 & 87;
                int i13 = (((i11 | 87) & (~i12)) - (~(i12 << 1))) - 1;
                getSDKTransactionID = i13 % 128;
                getSDKTransactionID[] getsdktransactionidArr = new getSDKTransactionID[iIntValue];
                if (i13 % 2 != 0) {
                    int i14 = 19 / 0;
                }
                return getsdktransactionidArr;
            }

            private static getSDKTransactionID h_(Parcel parcel) {
                return (getSDKTransactionID) getSDKAppID(new Object[]{parcel}, -1805777532, 1805777535, (int) System.currentTimeMillis());
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.getSDKTransactionID, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ getSDKTransactionID createFromParcel(Parcel parcel) {
                return getSDKAppID(new Object[]{this, parcel}, -1817465723, 1817465724, System.identityHashCode(this));
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [atd.e.getSDKTransactionID[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ getSDKTransactionID[] newArray(int i11) {
                return (Object[]) getSDKAppID(new Object[]{this, Integer.valueOf(i11)}, -518537517, 518537519, i11);
            }

            private static getSDKTransactionID[] AuthenticationRequestParameters(int i11) {
                return (getSDKTransactionID[]) getSDKAppID(new Object[]{Integer.valueOf(i11)}, 1686827922, -1686827922, i11);
            }
        };
        int i11 = getDeviceData + 63;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    getSDKTransactionID(JsonObject jsonObject) {
        this.getSDKReferenceNumber = atd.i.getSDKAppID.getSDKTransactionID(atd.d.getMessageVersion.getSDKReferenceNumber(jsonObject, atd.am.getDeviceData.ACS_UI_TYPE).getSDKReferenceNumber().intValue());
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i12;
        int length2;
        int[] iArr3;
        int i13;
        int i14;
        Object method;
        atd.az.ChallengeResultCompleted challengeResultCompleted = new atd.az.ChallengeResultCompleted();
        char[] cArr = new char[4];
        int i15 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = getSDKTransactionID;
        Class cls = Integer.TYPE;
        int i16 = 0;
        if (iArr4 != null) {
            int i17 = $10 + 111;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i13 = 1;
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
                i13 = 0;
            }
            int i18 = i13;
            while (i18 < length2) {
                int i19 = $11 + 105;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr4[i18])};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(2050190164);
                        if (obj != null) {
                            method = obj;
                            i14 = i16;
                        } else {
                            i14 = i16;
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getTouchSlop() >> 8) + 1862, (char) Drawable.resolveOpacity(i16, i16), 21 - (ViewConfiguration.getLongPressTimeout() >> 16));
                            byte b11 = (byte) ($$a[1] + 1);
                            byte b12 = (byte) (b11 + 4);
                            Object[] objArr3 = new Object[1];
                            b(b11, b12, (byte) (b12 - 3), objArr3);
                            method = cls2.getMethod((String) objArr3[i14], cls);
                            map.put(2050190164, method);
                        }
                        iArr3[i18] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                        i18 = i18;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    int i21 = i18;
                    cArr = cArr;
                    length2 = length2;
                    iArr4 = iArr4;
                    i14 = i16;
                    Object[] objArr4 = {Integer.valueOf(iArr4[i21])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(2050190164);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 20 - ExpandableListView.getPackedPositionChild(0L));
                        byte b13 = (byte) ($$a[1] + 1);
                        byte b14 = (byte) (b13 + 4);
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 - 3), objArr5);
                        method2 = cls3.getMethod((String) objArr5[i14], cls);
                        map2.put(2050190164, method2);
                    }
                    iArr3[i21] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                    i18 = i21 + 1;
                }
                cArr = cArr;
                i16 = i14;
                length2 = length2;
                iArr4 = iArr4;
            }
            iArr4 = iArr3;
        }
        char[] cArr3 = cArr;
        int i22 = i16;
        int i23 = 16;
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = getSDKTransactionID;
        if (iArr6 != null) {
            int i24 = $10 + 13;
            $11 = i24 % 128;
            if (i24 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i12 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i12 = i22;
            }
            while (i12 < length) {
                Object[] objArr6 = {Integer.valueOf(iArr6[i12])};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method3 = map3.get(2050190164);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.green(i22) + 1862, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 20 - Process.getGidForName(""));
                    byte b15 = (byte) ($$a[1] + 1);
                    byte b16 = (byte) (b15 + 4);
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, (byte) (b16 - 3), objArr7);
                    method3 = cls4.getMethod((String) objArr7[i22], cls);
                    map3.put(2050190164, method3);
                }
                iArr2[i12] = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                i12++;
                iArr2 = iArr2;
                iArr6 = iArr6;
                length = length;
                cArr2 = cArr2;
            }
            iArr6 = iArr2;
        }
        char[] cArr4 = cArr2;
        int i25 = i22;
        System.arraycopy(iArr6, i25, iArr5, i25, length3);
        challengeResultCompleted.getDeviceData = i25;
        while (true) {
            int i26 = challengeResultCompleted.getDeviceData;
            if (i26 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i11);
                return;
            }
            int i27 = iArr[i26];
            char c11 = (char) (i27 >> 16);
            cArr3[i25] = c11;
            char c12 = (char) i27;
            cArr3[1] = c12;
            char c13 = (char) (iArr[i26 + 1] >> 16);
            cArr3[i15] = c13;
            char c14 = (char) iArr[i26 + 1];
            char c15 = 3;
            cArr3[3] = c14;
            challengeResultCompleted.getSDKAppID = (c11 << 16) + c12;
            challengeResultCompleted.getSDKReferenceNumber = (c13 << 16) + c14;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr5);
            int i28 = 0;
            while (i28 < i23) {
                int i29 = challengeResultCompleted.getSDKAppID ^ iArr5[i28];
                challengeResultCompleted.getSDKAppID = i29;
                int sDKAppID = atd.az.ChallengeResultCompleted.getSDKAppID(i29);
                Object[] objArr8 = new Object[4];
                objArr8[c15] = challengeResultCompleted;
                objArr8[i15] = challengeResultCompleted;
                objArr8[1] = Integer.valueOf(sDKAppID);
                objArr8[0] = challengeResultCompleted;
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(929629307);
                if (method4 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1300 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (CipherSuite.TLS_PSK_WITH_AES_256_CCM_8 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32);
                    byte b17 = (byte) ($$a[1] + 1);
                    byte b18 = (byte) (b17 + 1);
                    Object[] objArr9 = new Object[1];
                    b(b17, b18, b18, objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, cls, Object.class, Object.class);
                    map4.put(929629307, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i28++;
                c15 = c15;
                i23 = 16;
            }
            char c16 = c15;
            int i31 = challengeResultCompleted.getSDKAppID;
            int i32 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i32;
            challengeResultCompleted.getSDKReferenceNumber = i31;
            i23 = 16;
            int i33 = i31 ^ iArr5[16];
            challengeResultCompleted.getSDKReferenceNumber = i33;
            int i34 = i32 ^ iArr5[17];
            challengeResultCompleted.getSDKAppID = i34;
            cArr3[0] = (char) (i34 >>> 16);
            cArr3[1] = (char) i34;
            cArr3[i15] = (char) (i33 >>> 16);
            cArr3[c16] = (char) i33;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr5);
            int i35 = challengeResultCompleted.getDeviceData;
            cArr4[i35 * 2] = cArr3[0];
            cArr4[(i35 * 2) + 1] = cArr3[1];
            cArr4[(i35 * 2) + 2] = cArr3[i15];
            cArr4[(i35 * 2) + 3] = cArr3[c16];
            int i36 = i15;
            Object[] objArr10 = new Object[i36];
            objArr10[1] = challengeResultCompleted;
            objArr10[0] = challengeResultCompleted;
            Map map5 = atd.a.getMessageVersion.timedout;
            Object method5 = map5.get(1109131256);
            if (method5 == null) {
                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2061 - Gravity.getAbsoluteGravity(0, 0), (char) Color.green(0), 17 - Color.blue(0));
                byte b19 = (byte) ($$a[1] + 1);
                byte b21 = (byte) (-b19);
                Object[] objArr11 = new Object[1];
                b(b19, b21, (byte) (b21 - 1), objArr11);
                method5 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                map5.put(1109131256, method5);
            }
            ((Method) method5).invoke(null, objArr10);
            i15 = i36;
            i25 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 120 - r7
            byte[] r0 = atd.e.getSDKTransactionID.$$a
            int r8 = r8 * 3
            int r1 = 1 - r8
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getSDKTransactionID.b(short, byte, byte, java.lang.Object[]):void");
    }

    public static getSDKTransactionID getSDKAppID(JsonObject jsonObject) throws Throwable {
        getSDKAppID = (getDeviceData + 69) % 128;
        int iIntValue = atd.d.getMessageVersion.getSDKReferenceNumber(jsonObject, atd.am.getDeviceData.ACS_UI_TYPE).getSDKReferenceNumber().intValue();
        int i11 = AnonymousClass3.getSDKAppID[atd.i.getSDKAppID.getSDKTransactionID(iIntValue).ordinal()];
        if (i11 == 1) {
            ChallengeResultKt challengeResultKt = new ChallengeResultKt(jsonObject);
            getSDKAppID = (getDeviceData + 53) % 128;
            return challengeResultKt;
        }
        if (i11 == 2 || i11 == 3) {
            return new getTransactionStatus(jsonObject);
        }
        if (i11 == 4) {
            return new ChallengeResultTimeout(jsonObject);
        }
        if (i11 == 5) {
            return new ChallengeResult(jsonObject);
        }
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{1243674084, 1735104013, -1072323400, 796929357, 1855177318, 844720988, 160828106, -782551229, 934071236, 2099903580, -1283978619, 1145630808}, ExpandableListView.getPackedPositionGroup(0L) + 23, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(iIntValue);
        throw new RuntimeException(sb2.toString());
    }

    static void init$0() {
        $$a = new byte[]{120, -2, 118, Tnaf.POW_2_WIDTH};
        $$b = 174;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int i11 = getDeviceData + 97;
        getSDKAppID = i11 % 128;
        return i11 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            getDeviceData = (getSDKAppID + 85) % 128;
            return true;
        }
        if (obj != null) {
            getSDKAppID = (getDeviceData + 9) % 128;
            if (getClass() == obj.getClass()) {
                return this.getSDKReferenceNumber != ((getSDKTransactionID) obj).getSDKReferenceNumber;
            }
        }
        getSDKAppID = (getDeviceData + 105) % 128;
        return false;
    }

    public final atd.i.getSDKAppID getDeviceData() {
        int i11 = (getDeviceData + 43) % 128;
        getSDKAppID = i11;
        atd.i.getSDKAppID getsdkappid = this.getSDKReferenceNumber;
        int i12 = i11 + 81;
        getDeviceData = i12 % 128;
        if (i12 % 2 != 0) {
            return getsdkappid;
        }
        throw null;
    }

    public void getSDKTransactionID() {
        int i11 = (getSDKAppID + 101) % 128;
        getDeviceData = i11;
        this.getSDKReferenceNumber = null;
        getSDKAppID = (i11 + 21) % 128;
    }

    public int hashCode() {
        atd.i.getSDKAppID getsdkappid = this.getSDKReferenceNumber;
        if (getsdkappid == null) {
            return 0;
        }
        int i11 = getSDKAppID + 121;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            getsdkappid.hashCode();
            throw null;
        }
        int iHashCode = getsdkappid.hashCode();
        int i12 = getSDKAppID + 107;
        getDeviceData = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 21 / 0;
        }
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        getSDKAppID = (getDeviceData + 15) % 128;
        parcel.writeInt(this.getSDKReferenceNumber.getDeviceData());
        getDeviceData = (getSDKAppID + 59) % 128;
    }

    protected getSDKTransactionID(Parcel parcel) {
        try {
            this.getSDKReferenceNumber = atd.i.getSDKAppID.getSDKTransactionID(parcel.readInt());
        } catch (atd.z.AuthenticationRequestParameters e11) {
            throw new RuntimeException(e11.getMessage(), e11);
        }
    }

    static void getSDKAppID() {
        getSDKTransactionID = new int[]{-1628715141, -33218373, 1737124428, -1998576434, 1786236332, -309798136, -766151048, -1134752971, -1096587670, 935965317, -1551947331, -396044804, -21734610, 94485956, -834636158, 130719824, -772740853, -1113755722};
    }
}
