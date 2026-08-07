package atd.av;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultCompleted;
import com.adyen.threeds2.R;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceData extends View {
    private static final getSDKTransactionID AuthenticationRequestParameters = getSDKTransactionID.HORIZONTAL;
    private static int BuildConfig = 1;
    private static int getSDKReferenceNumber;
    private getSDKTransactionID getDeviceData;
    private int getSDKAppID;
    private int getSDKTransactionID;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: atd.av.getDeviceData$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        private static int AuthenticationRequestParameters = 1;
        static final /* synthetic */ int[] getDeviceData;
        private static int getSDKReferenceNumber;

        static {
            int[] iArr = new int[getSDKTransactionID.values().length];
            getDeviceData = iArr;
            try {
                iArr[getSDKTransactionID.HORIZONTAL.ordinal()] = 1;
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 27;
                int i13 = (i11 | 27) & (~i12);
                int i14 = i12 << 1;
                getSDKReferenceNumber = ((i13 ^ i14) + ((i13 & i14) << 1)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getDeviceData[getSDKTransactionID.VERTICAL.ordinal()] = 2;
                int i15 = getSDKReferenceNumber;
                int i16 = i15 ^ 3;
                int i17 = (i15 & 3) << 1;
                AuthenticationRequestParameters = ((i16 & i17) + (i17 | i16)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static final /* synthetic */ getSDKTransactionID[] $VALUES;
        private static int AuthenticationRequestParameters;
        public static final getSDKTransactionID HORIZONTAL;
        public static final getSDKTransactionID VERTICAL;
        private static int getSDKReferenceNumber;
        private static int[] getSDKTransactionID;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKReferenceNumber = 0;
            AuthenticationRequestParameters = 1;
            getDeviceData();
            Object[] objArr = new Object[1];
            a(new int[]{-1006344787, -2051303543, 946428158, -352116048, 992812530, -539515337}, Color.blue(0) + 10, objArr);
            HORIZONTAL = new getSDKTransactionID(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a(new int[]{-68554023, -2020230273, 822563206, -583361684}, 8 - (ViewConfiguration.getTouchSlop() >> 8), objArr2);
            VERTICAL = new getSDKTransactionID(((String) objArr2[0]).intern(), 1);
            $VALUES = getSDKAppID();
            int i11 = getSDKReferenceNumber + 109;
            AuthenticationRequestParameters = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }

        private getSDKTransactionID(String str, int i11) {
            super(str, i11);
        }

        private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
            Object method;
            Object method2;
            Integer num = 1109131256;
            ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
            char[] cArr = new char[4];
            int i12 = 2;
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = getSDKTransactionID;
            Class cls = Integer.TYPE;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i13 = 0;
                while (i13 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i13])};
                        Map map = getMessageVersion.timedout;
                        Object obj = map.get(2050190164);
                        if (obj != null) {
                            method2 = obj;
                        } else {
                            Class cls2 = (Class) getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionGroup(0L) + 1862, (char) Color.green(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 21);
                            byte b11 = (byte) 0;
                            byte b12 = b11;
                            Object[] objArr3 = new Object[1];
                            b(b11, b12, b12, objArr3);
                            method2 = cls2.getMethod((String) objArr3[0], cls);
                            map.put(2050190164, method2);
                        }
                        iArr3[i13] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                        i13++;
                        cArr = cArr;
                        iArr3 = iArr3;
                        iArr2 = iArr2;
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
            int i14 = 16;
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = getSDKTransactionID;
            if (iArr5 != null) {
                $11 = ($10 + 49) % 128;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i15 = 0;
                while (i15 < length3) {
                    $11 = ($10 + 77) % 128;
                    Object[] objArr4 = {Integer.valueOf(iArr5[i15])};
                    Map map2 = getMessageVersion.timedout;
                    Object obj2 = map2.get(2050190164);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "", 0, 0) + 1862, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), ExpandableListView.getPackedPositionChild(0L) + 22);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2050190164, method);
                    }
                    iArr6[i15] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                    i15++;
                    length3 = length3;
                    iArr5 = iArr5;
                    iArr6 = iArr6;
                    cArr2 = cArr2;
                    num = num;
                }
                iArr5 = iArr6;
            }
            Integer num2 = num;
            char[] cArr4 = cArr2;
            char c11 = 0;
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            challengeResultCompleted.getDeviceData = 0;
            while (true) {
                int i16 = challengeResultCompleted.getDeviceData;
                if (i16 >= iArr.length) {
                    objArr[0] = new String(cArr4, 0, i11);
                    return;
                }
                int i17 = iArr[i16];
                char c12 = (char) (i17 >> 16);
                cArr3[c11] = c12;
                char c13 = (char) i17;
                cArr3[1] = c13;
                char c14 = (char) (iArr[i16 + 1] >> 16);
                cArr3[i12] = c14;
                char c15 = (char) iArr[i16 + 1];
                char c16 = 3;
                cArr3[3] = c15;
                challengeResultCompleted.getSDKAppID = (c12 << 16) + c13;
                challengeResultCompleted.getSDKReferenceNumber = (c14 << 16) + c15;
                ChallengeResultCompleted.getSDKAppID(iArr4);
                int i18 = 0;
                while (i18 < i14) {
                    int i19 = challengeResultCompleted.getSDKAppID ^ iArr4[i18];
                    challengeResultCompleted.getSDKAppID = i19;
                    int sDKAppID = ChallengeResultCompleted.getSDKAppID(i19);
                    Object[] objArr6 = new Object[4];
                    objArr6[c16] = challengeResultCompleted;
                    objArr6[i12] = challengeResultCompleted;
                    objArr6[1] = Integer.valueOf(sDKAppID);
                    objArr6[0] = challengeResultCompleted;
                    Map map3 = getMessageVersion.timedout;
                    Object method3 = map3.get(929629307);
                    if (method3 == null) {
                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID(1298 - Process.getGidForName(""), (char) (CipherSuite.TLS_PSK_WITH_AES_256_CCM_8 - KeyEvent.normalizeMetaState(0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 34);
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 3);
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, (byte) (b16 - 3), objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, cls, Object.class, Object.class);
                        map3.put(929629307, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                    challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                    i18++;
                    c16 = c16;
                    i14 = 16;
                }
                char c17 = c16;
                int i21 = challengeResultCompleted.getSDKAppID;
                int i22 = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKAppID = i22;
                challengeResultCompleted.getSDKReferenceNumber = i21;
                i14 = 16;
                int i23 = i21 ^ iArr4[16];
                challengeResultCompleted.getSDKReferenceNumber = i23;
                int i24 = i22 ^ iArr4[17];
                challengeResultCompleted.getSDKAppID = i24;
                cArr3[0] = (char) (i24 >>> 16);
                cArr3[1] = (char) i24;
                cArr3[i12] = (char) (i23 >>> 16);
                cArr3[c17] = (char) i23;
                ChallengeResultCompleted.getSDKAppID(iArr4);
                int i25 = challengeResultCompleted.getDeviceData;
                cArr4[i25 * 2] = cArr3[0];
                cArr4[(i25 * 2) + 1] = cArr3[1];
                cArr4[(i25 * 2) + 2] = cArr3[i12];
                cArr4[(i25 * 2) + 3] = cArr3[c17];
                Object[] objArr8 = new Object[i12];
                objArr8[1] = challengeResultCompleted;
                objArr8[0] = challengeResultCompleted;
                Map map4 = getMessageVersion.timedout;
                Integer num3 = num2;
                Object method4 = map4.get(num3);
                if (method4 == null) {
                    Class cls5 = (Class) getMessageVersion.getSDKTransactionID(View.combineMeasuredStates(0, 0) + 2061, (char) KeyEvent.keyCodeFromString(""), TextUtils.indexOf("", "", 0, 0) + 17);
                    byte b17 = (byte) 0;
                    byte b18 = (byte) (b17 + 2);
                    Object[] objArr9 = new Object[1];
                    b(b17, b18, (byte) (b18 - 2), objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                    map4.put(num3, method4);
                }
                ((Method) method4).invoke(null, objArr8);
                num2 = num3;
                c11 = 0;
                i12 = 2;
            }
        }

        private static void b(byte b11, int i11, int i12, Object[] objArr) {
            byte[] bArr = $$a;
            int i13 = b11 * 3;
            int i14 = i11 + 117;
            int i15 = 3 - (i12 * 4);
            byte[] bArr2 = new byte[1 - i13];
            int i16 = 0 - i13;
            int i17 = -1;
            if (bArr == null) {
                int i18 = i15 + (-i16);
                i15 = i15;
                i14 = i18;
            }
            while (true) {
                i17++;
                bArr2[i17] = (byte) i14;
                if (i17 == i16) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i19 = i15 + 1;
                i15 = i19;
                i14 += -bArr[i19];
            }
        }

        static void getDeviceData() {
            getSDKTransactionID = new int[]{2007814380, 784476377, -1062729709, -975711280, 521204037, -1145843327, 39590305, -1102284588, -1246890762, 172314676, -308063387, 831289739, 1548309108, -1840263550, 1874000253, 1901684408, 66719302, 2068737345};
        }

        private static /* synthetic */ getSDKTransactionID[] getSDKAppID() {
            int i11 = (AuthenticationRequestParameters + 5) % 128;
            getSDKReferenceNumber = i11;
            getSDKTransactionID[] getsdktransactionidArr = {HORIZONTAL, VERTICAL};
            AuthenticationRequestParameters = (i11 + 115) % 128;
            return getsdktransactionidArr;
        }

        static void init$0() {
            $$a = new byte[]{108, 15, 34, -15};
            $$b = 82;
        }

        public static getSDKTransactionID valueOf(String str) {
            int i11 = getSDKReferenceNumber + 93;
            AuthenticationRequestParameters = i11 % 128;
            if (i11 % 2 != 0) {
                return (getSDKTransactionID) Enum.valueOf(getSDKTransactionID.class, str);
            }
            Enum.valueOf(getSDKTransactionID.class, str);
            throw null;
        }

        public static getSDKTransactionID[] values() throws CloneNotSupportedException {
            int i11 = AuthenticationRequestParameters + 23;
            getSDKReferenceNumber = i11 % 128;
            if (i11 % 2 == 0) {
                return (getSDKTransactionID[]) $VALUES.clone();
            }
            $VALUES.clone();
            throw null;
        }
    }

    static {
        int i11 = getSDKReferenceNumber;
        int i12 = (((i11 & (-30)) | ((~i11) & 29)) - (~((i11 & 29) << 1))) - 1;
        BuildConfig = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public getDeviceData(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = ~i13;
        int i17 = (i11 * (-519)) + (i12 * 521) + (((~(i12 | i13)) | (~(i14 | i15 | i16))) * 520);
        int i18 = ~(i15 | i16);
        int i19 = ~(i13 | i11);
        int i21 = i17 + ((i18 | i19) * (-1040)) + (((~(i11 | i15)) | (~(i14 | i16)) | i19) * 520);
        if (i21 == 1) {
            return getSDKReferenceNumber(objArr);
        }
        if (i21 != 2) {
            if (i21 == 3) {
                return getSDKAppID(objArr);
            }
            if (i21 != 4) {
                return AuthenticationRequestParameters(objArr);
            }
            getDeviceData getdevicedata = (getDeviceData) objArr[0];
            int i22 = BuildConfig;
            int i23 = ((i22 & 121) + (i22 | 121)) % 128;
            getSDKReferenceNumber = i23;
            getSDKTransactionID getsdktransactionid = getdevicedata.getDeviceData;
            BuildConfig = ((i23 & 111) + (i23 | 111)) % 128;
            return getsdktransactionid;
        }
        getDeviceData getdevicedata2 = (getDeviceData) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i24 = BuildConfig;
        int i25 = i24 ^ 19;
        int i26 = (i24 & 19) << 1;
        getSDKReferenceNumber = ((i25 ^ i26) + ((i26 & i25) << 1)) % 128;
        int defaultSize = View.getDefaultSize(getdevicedata2.getSuggestedMinimumWidth(), iIntValue);
        int defaultSize2 = View.getDefaultSize(getdevicedata2.getSuggestedMinimumHeight(), iIntValue2);
        if (getdevicedata2.getSDKTransactionID > 0) {
            int i27 = getSDKReferenceNumber;
            int i28 = i27 ^ 101;
            BuildConfig = ((((i27 & 101) | i28) << 1) - i28) % 128;
            int i29 = AnonymousClass2.getDeviceData[getdevicedata2.getDeviceData.ordinal()];
            if (i29 == 1) {
                defaultSize2 = getdevicedata2.getSDKTransactionID;
                BuildConfig = (getSDKReferenceNumber + 23) % 128;
            } else if (i29 == 2) {
                defaultSize = getdevicedata2.getSDKTransactionID;
                int i31 = BuildConfig;
                int i32 = i31 ^ 125;
                int i33 = -(-((i31 & 125) << 1));
                getSDKReferenceNumber = ((i32 & i33) + (i33 | i32)) % 128;
            }
        }
        getdevicedata2.setMeasuredDimension(defaultSize, defaultSize2);
        int i34 = BuildConfig;
        int i35 = i34 & 11;
        int i36 = (i34 | 11) & (~i35);
        int i37 = -(-(i35 << 1));
        getSDKReferenceNumber = ((i36 & i37) + (i36 | i37)) % 128;
        return null;
    }

    private void dp_(TypedArray typedArray) {
        AuthenticationRequestParameters(new Object[]{this, typedArray}, 1693422463, -1693422463, System.identityHashCode(this));
    }

    private int getDeviceData() {
        return ((Integer) AuthenticationRequestParameters(new Object[]{this}, 1983386497, -1983386496, System.identityHashCode(this))).intValue();
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        int i11 = BuildConfig + 37;
        getSDKReferenceNumber = i11 % 128;
        int i12 = i11 % 2;
        Resources resources = getdevicedata.getContext().getResources();
        if (i12 == 0) {
            return Integer.valueOf((int) resources.getDimension(R.dimen.a3ds2_divider_thickness));
        }
        resources.getDimension(R.dimen.a3ds2_divider_thickness);
        throw null;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        TypedValue typedValue = new TypedValue();
        getdevicedata.getContext().getTheme().resolveAttribute(android.R.attr.textColorSecondary, typedValue, true);
        int i11 = typedValue.data;
        int i12 = BuildConfig;
        int i13 = i12 & 117;
        int i14 = i13 + ((i12 ^ 117) | i13);
        getSDKReferenceNumber = i14 % 128;
        if (i14 % 2 == 0) {
            return Integer.valueOf(i11);
        }
        throw null;
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        AuthenticationRequestParameters(new Object[]{this, Integer.valueOf(i11), Integer.valueOf(i12)}, 1455973316, -1455973314, i11);
    }

    public final void setColor(int i11) {
        getSDKReferenceNumber = ((-2) - ((BuildConfig + 122) ^ (-1))) % 128;
        this.getSDKAppID = i11;
        setBackgroundColor(i11);
        int i12 = BuildConfig;
        int i13 = i12 & 85;
        int i14 = i13 + ((i12 ^ 85) | i13);
        getSDKReferenceNumber = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 98 / 0;
        }
    }

    public final void setOrientation(getSDKTransactionID getsdktransactionid) {
        int i11 = (BuildConfig + 27) % 128;
        getSDKReferenceNumber = i11;
        this.getDeviceData = getsdktransactionid;
        int i12 = i11 & 123;
        int i13 = -(-(i11 | 123));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        BuildConfig = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 81 / 0;
        }
    }

    public final void setThickness(int i11) {
        int i12 = BuildConfig + 23;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 == 0) {
            this.getSDKTransactionID = i11;
        } else {
            this.getSDKTransactionID = i11;
            throw null;
        }
    }

    public getDeviceData(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final getSDKTransactionID getSDKAppID() {
        return (getSDKTransactionID) AuthenticationRequestParameters(new Object[]{this}, -821502415, 821502419, System.identityHashCode(this));
    }

    public getDeviceData(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.DividerView, i11, 0);
        try {
            AuthenticationRequestParameters(new Object[]{this, typedArrayObtainStyledAttributes}, 1693422463, -1693422463, System.identityHashCode(this));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        TypedArray typedArray = (TypedArray) objArr[1];
        int i11 = getSDKReferenceNumber;
        int i12 = i11 ^ 65;
        int i13 = ((i11 & 65) | i12) << 1;
        int i14 = -i12;
        BuildConfig = ((i13 & i14) + (i13 | i14)) % 128;
        getdevicedata.setColor(typedArray.getColor(R.styleable.DividerView_dividerColor, ((Integer) AuthenticationRequestParameters(new Object[]{getdevicedata}, 1983386497, -1983386496, System.identityHashCode(getdevicedata))).intValue()));
        getdevicedata.setThickness((int) typedArray.getDimension(R.styleable.DividerView_dividerThickness, ((Integer) AuthenticationRequestParameters(new Object[]{getdevicedata}, 385125208, -385125205, System.identityHashCode(getdevicedata))).intValue()));
        getdevicedata.setOrientation(getSDKTransactionID.values()[typedArray.getInteger(R.styleable.DividerView_dividerOrientation, AuthenticationRequestParameters.ordinal())]);
        int i15 = getSDKReferenceNumber;
        int i16 = i15 ^ 99;
        int i17 = -(-((i15 & 99) << 1));
        int i18 = (i16 & i17) + (i17 | i16);
        BuildConfig = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 32 / 0;
        }
        return null;
    }

    private int AuthenticationRequestParameters() {
        return ((Integer) AuthenticationRequestParameters(new Object[]{this}, 385125208, -385125205, System.identityHashCode(this))).intValue();
    }
}
