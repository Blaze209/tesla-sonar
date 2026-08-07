package atd.h;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.az.ChallengeResultError;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DataVersion;", "", "version", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "V1_5", "V1_6", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ getSDKAppID[] $VALUES;
    private static char[] AuthenticationRequestParameters;
    private static getSDKAppID V1_5;
    public static final getSDKAppID V1_6;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final String version;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getSDKReferenceNumber = 1;
        getSDKReferenceNumber();
        Object[] objArr = new Object[1];
        a("\u0001\u0001\u0000\u0000", new int[]{0, 4, 175, 0}, false, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("\u0001\u0000\u0001", new int[]{4, 3, 56, 1}, true, objArr2);
        V1_5 = new getSDKAppID(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a("\u0000\u0001\u0000\u0001", new int[]{7, 4, 0, 0}, false, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("\u0000\u0001\u0000", new int[]{11, 3, 13, 0}, false, objArr4);
        V1_6 = new getSDKAppID(strIntern2, 1, ((String) objArr4[0]).intern());
        getSDKAppID[] sDKTransactionID = getSDKTransactionID();
        $VALUES = sDKTransactionID;
        on0.a.a(sDKTransactionID);
        getSDKTransactionID = (getSDKReferenceNumber + 109) % 128;
    }

    private getSDKAppID(String str, int i11, String str2) {
        super(str, i11);
        this.version = str2;
    }

    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        int i11;
        char[] cArr;
        Class<Object> cls;
        char[] cArr2;
        int i12;
        int i13;
        Object method;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        Integer num = -399400818;
        int i14 = $10 + 115;
        $11 = i14 % 128;
        Object obj = str2;
        if (i14 % 2 == 0) {
            throw null;
        }
        if (str2 != null) {
            byte[] bytes = str2.getBytes("ISO-8859-1");
            $11 = ($10 + 113) % 128;
            obj = bytes;
        }
        byte[] bArr = (byte[]) obj;
        ChallengeResultError challengeResultError = new ChallengeResultError();
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        char[] cArr3 = AuthenticationRequestParameters;
        int i19 = 2;
        Class cls3 = Integer.TYPE;
        if (cArr3 != null) {
            int i21 = $10 + 7;
            int i22 = 0;
            $11 = i21 % 128;
            if (i21 % 2 == 0) {
                int length = cArr3.length;
                cArr2 = new char[length];
                i12 = length;
                i13 = 1;
            } else {
                int length2 = cArr3.length;
                cArr2 = new char[length2];
                i12 = length2;
                i13 = 0;
            }
            while (i13 < i12) {
                try {
                    byte[] bArr2 = bArr;
                    Object[] objArr2 = {Integer.valueOf(cArr3[i13])};
                    int i23 = i13;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj2 = map.get(-1708792688);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2312 - ImageFormat.getBitsPerPixel(i22), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 23 - Process.getGidForName(""));
                        int i24 = i22;
                        byte b11 = (byte) i24;
                        byte b12 = (byte) (b11 + 2);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 - 2), objArr3);
                        method = cls4.getMethod((String) objArr3[i24], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr2[i23] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i13 = i23 + 1;
                    bArr = bArr2;
                    i12 = i12;
                    i18 = i18;
                    i17 = i17;
                    cArr3 = cArr3;
                    cls2 = cls2;
                    num = num;
                    i22 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        byte[] bArr3 = bArr;
        Class<Object> cls5 = cls2;
        Integer num2 = num;
        int i25 = i17;
        int i26 = i18;
        char[] cArr4 = new char[i16];
        System.arraycopy(cArr3, i15, cArr4, 0, i16);
        if (bArr3 != null) {
            char[] cArr5 = new char[i16];
            challengeResultError.getSDKAppID = 0;
            char c11 = 0;
            while (true) {
                int i27 = challengeResultError.getSDKAppID;
                if (i27 >= i16) {
                    break;
                }
                if (bArr3[i27] == 1) {
                    $10 = ($11 + 95) % 128;
                    char c12 = cArr4[i27];
                    Object[] objArr4 = new Object[i19];
                    objArr4[1] = Integer.valueOf(c11);
                    objArr4[0] = Integer.valueOf(c12);
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(10570995);
                    if (method2 == null) {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 558, (char) (5486 - TextUtils.getTrimmedLength("")), Color.rgb(0, 0, 0) + 16777239);
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 + 3);
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 - 3), objArr5);
                        method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                        map2.put(10570995, method2);
                    }
                    cArr5[i27] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    cArr4 = cArr4;
                    Object[] objArr6 = {Integer.valueOf(cArr4[i27]), Integer.valueOf(c11)};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-502074319);
                    if (method3 == null) {
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(201 - TextUtils.indexOf("", "", 0, 0), (char) ('0' - AndroidCharacter.getMirror('0')), MotionEvent.axisFromString("") + 25)).getMethod("a", cls3, cls3);
                        map3.put(-502074319, method3);
                    }
                    cArr5[i27] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c11 = cArr5[challengeResultError.getSDKAppID];
                Object[] objArr7 = {challengeResultError, challengeResultError};
                Map map4 = atd.a.getMessageVersion.timedout;
                Integer num3 = num2;
                Object method4 = map4.get(num3);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(854 - View.resolveSizeAndState(0, 0, 0), (char) Color.green(0), (ViewConfiguration.getEdgeSlop() >> 16) + 24);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, b16, objArr8);
                    cls = cls5;
                    method4 = cls7.getMethod((String) objArr8[0], cls, cls);
                    map4.put(num3, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                num2 = num3;
                cls5 = cls;
                cArr4 = cArr4;
                cArr5 = cArr5;
                i19 = 2;
            }
            cArr4 = cArr5;
        }
        if (i26 > 0) {
            $11 = ($10 + 11) % 128;
            char[] cArr6 = new char[i16];
            System.arraycopy(cArr4, 0, cArr6, 0, i16);
            int i28 = i16 - i26;
            System.arraycopy(cArr6, 0, cArr4, i28, i26);
            System.arraycopy(cArr6, i26, cArr4, 0, i28);
        }
        if (z11) {
            int i29 = $10 + 91;
            $11 = i29 % 128;
            if (i29 % 2 == 0) {
                cArr = new char[i16];
                i11 = 1;
                challengeResultError.getSDKAppID = 1;
            } else {
                i11 = 1;
                cArr = new char[i16];
                challengeResultError.getSDKAppID = 0;
            }
            while (true) {
                int i31 = challengeResultError.getSDKAppID;
                if (i31 >= i16) {
                    break;
                }
                cArr[i31] = cArr4[(i16 - i31) - i11];
                challengeResultError.getSDKAppID = i31 + 1;
            }
            cArr4 = cArr;
        }
        if (i25 > 0) {
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i32 = challengeResultError.getSDKAppID;
                if (i32 >= i16) {
                    break;
                }
                cArr4[i32] = (char) (cArr4[i32] - iArr[2]);
                challengeResultError.getSDKAppID = i32 + 1;
                $11 = ($10 + 49) % 128;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 2
            int r6 = 104 - r6
            int r7 = r7 * 4
            int r0 = 1 - r7
            byte[] r1 = atd.h.getSDKAppID.$$a
            int r5 = r5 * 2
            int r5 = r5 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r3 = r6
            r6 = r7
            r4 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r1[r5]
        L2b:
            int r5 = r5 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.h.getSDKAppID.b(int, short, int, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        AuthenticationRequestParameters = new char[]{30908, 30924, 30921, 30919, 30730, 30805, 30807, 30741, 30845, 30838, 30836, 30753, 30722, 30721};
    }

    private static final /* synthetic */ getSDKAppID[] getSDKTransactionID() {
        int i11 = (getSDKTransactionID + 61) % 128;
        getSDKReferenceNumber = i11;
        getSDKAppID[] getsdkappidArr = {V1_5, V1_6};
        getSDKTransactionID = (i11 + 105) % 128;
        return getsdkappidArr;
    }

    static void init$0() {
        $$a = new byte[]{64, -12, 5, 6};
        $$b = EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE;
    }

    public static getSDKAppID valueOf(String str) {
        getSDKTransactionID = (getSDKReferenceNumber + 31) % 128;
        getSDKAppID getsdkappid = (getSDKAppID) Enum.valueOf(getSDKAppID.class, str);
        getSDKTransactionID = (getSDKReferenceNumber + 99) % 128;
        return getsdkappid;
    }

    public static getSDKAppID[] values() {
        getSDKTransactionID = (getSDKReferenceNumber + 13) % 128;
        getSDKAppID[] getsdkappidArr = (getSDKAppID[]) $VALUES.clone();
        getSDKTransactionID = (getSDKReferenceNumber + 123) % 128;
        return getsdkappidArr;
    }

    public final String getSDKAppID() {
        String str;
        int i11 = getSDKReferenceNumber;
        int i12 = i11 + 43;
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 != 0) {
            str = this.version;
            int i13 = 62 / 0;
        } else {
            str = this.version;
        }
        getSDKTransactionID = (i11 + 119) % 128;
        return str;
    }
}
