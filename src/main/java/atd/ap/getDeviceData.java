package atd.ap;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeStatusHandler;
import com.adyen.threeds2.Warning;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/security/warning/SdkIntegrityTamperedWarning;", "Lcom/adyen/threeds2/Warning;", "<init>", "()V", "getID", "", "getMessage", "getSeverity", "Lcom/adyen/threeds2/Warning$Severity;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData implements Warning {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResultCancelled;
    private static char getDeviceData;
    public static final getDeviceData getSDKAppID;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        BuildConfig = 1;
        getDeviceData();
        getSDKAppID = new getDeviceData();
        BuildConfig = (ChallengeResultCancelled + 109) % 128;
    }

    private getDeviceData() {
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        Object charArray;
        char c11;
        int i12;
        int i13 = $10 + 35;
        $11 = i13 % 128;
        int i14 = 2;
        int i15 = 0;
        if (i13 % 2 == 0) {
            int i16 = 49 / 0;
            if (str != null) {
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
        } else if (str != null) {
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = (char[]) charArray;
        ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
        char[] cArr2 = new char[cArr.length];
        challengeStatusHandler.getSDKReferenceNumber = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i17 = challengeStatusHandler.getSDKReferenceNumber;
            if (i17 >= cArr.length) {
                String str2 = new String(cArr2, 0, i11);
                $11 = ($10 + 121) % 128;
                objArr[0] = str2;
                return;
            }
            cArr3[i15] = cArr[i17];
            int i18 = 1;
            cArr3[1] = cArr[i17 + 1];
            int i19 = 58224;
            int i21 = i15;
            while (i21 < 16) {
                $11 = ($10 + 63) % 128;
                char c12 = cArr3[i18];
                char c13 = cArr3[i15];
                int i22 = (c13 + i19) ^ ((c13 << 4) + ((char) (((long) getSDKReferenceNumber) ^ (-2881362678149017980L))));
                int i23 = c13 >>> 5;
                int i24 = i14;
                int i25 = i18;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getDeviceData);
                    objArr2[i24] = Integer.valueOf(i23);
                    objArr2[i25] = Integer.valueOf(i22);
                    objArr2[i15] = Integer.valueOf(c12);
                    Map map = getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    Class cls = Integer.TYPE;
                    if (method != null) {
                        i12 = i15;
                        c11 = '0';
                    } else {
                        c11 = '0';
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(ImageFormat.getBitsPerPixel(i15) + 1746, (char) (16730 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getEdgeSlop() >> 16) + 29);
                        byte b11 = (byte) i15;
                        byte b12 = b11;
                        i12 = i15;
                        Object[] objArr3 = new Object[i25];
                        b(b11, b12, (byte) (b12 + 1), objArr3);
                        method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char c14 = cArr3[i12];
                    int i26 = (cCharValue + i19) ^ ((cCharValue << 4) + ((char) (((long) AuthenticationRequestParameters) ^ (-2881362678149017980L))));
                    int i27 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(getSDKTransactionID);
                    objArr4[i24] = Integer.valueOf(i27);
                    objArr4[1] = Integer.valueOf(i26);
                    objArr4[i12] = Integer.valueOf(c14);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        int i28 = i12;
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID(1745 - (ExpandableListView.getPackedPositionForGroup(i12) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i12) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 16682), TextUtils.indexOf("", c11, i28) + 30);
                        byte b13 = (byte) i28;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 + 1), objArr5);
                        method2 = cls3.getMethod((String) objArr5[i28], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i19 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i21++;
                    i14 = i24;
                    cArr = cArr;
                    cArr3 = cArr3;
                    i15 = 0;
                    i18 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = cArr;
            int i29 = i14;
            char[] cArr5 = cArr3;
            int i31 = challengeStatusHandler.getSDKReferenceNumber;
            cArr2[i31] = cArr5[0];
            cArr2[i31 + 1] = cArr5[1];
            Object[] objArr6 = new Object[i29];
            objArr6[1] = challengeStatusHandler;
            objArr6[0] = challengeStatusHandler;
            Map map2 = getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 == null) {
                Class cls4 = (Class) getMessageVersion.getSDKTransactionID(1596 - Color.blue(0), (char) (Color.rgb(0, 0, 0) + 16805040), (ViewConfiguration.getJumpTapTimeout() >> 16) + 25);
                byte b15 = (byte) 0;
                byte b16 = b15;
                Object[] objArr7 = new Object[1];
                b(b15, b16, b16, objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i14 = i29;
            cArr = cArr4;
            cArr3 = cArr5;
            i15 = 0;
        }
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
    private static void b(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = 116 - r8
            int r6 = r6 * 2
            int r6 = r6 + 1
            byte[] r0 = atd.ap.getDeviceData.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            r3 = r8
            if (r0 != 0) goto L17
            r5 = r2
            r8 = r7
            goto L2b
        L17:
            r8 = r7
            r7 = r3
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r8]
        L2b:
            int r3 = -r3
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ap.getDeviceData.b(short, int, int, java.lang.Object[]):void");
    }

    static void getDeviceData() {
        AuthenticationRequestParameters = (char) 44804;
        getSDKTransactionID = (char) 31047;
        getSDKReferenceNumber = (char) 30179;
        getDeviceData = (char) 27818;
    }

    static void init$0() {
        $$a = new byte[]{72, 37, -103, 75};
        $$b = EnumC4419g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE;
    }

    @Override // com.adyen.threeds2.Warning
    public final String getID() throws Throwable {
        Object obj;
        int i11 = BuildConfig + 47;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            Object[] objArr = new Object[1];
            a("ೠᤔᴁᬌ", (ViewConfiguration.getMaximumDrawingCacheSize() >>> 97) * 2, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("ೠᤔᴁᬌ", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        ChallengeResultCancelled = (BuildConfig + 3) % 128;
        return strIntern;
    }

    @Override // com.adyen.threeds2.Warning
    public final String getMessage() throws Throwable {
        Object obj;
        int i11 = ChallengeResultCancelled + 11;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a("\uf3a6\u09ff⟲쒈\u171d킫씶ಈ\ueab3碝\udd13峢䦍惗\ue7c3\uf051㟪〴듺뜢ꖧ鴓︱コ脈釲昏偳轼\ueffc莪풵뤹腼甛䦷⼿胯깬ԛ\ue65d\uf3f5哖Ḇ", (ViewConfiguration.getScrollFriction() > 2.0f ? 1 : (ViewConfiguration.getScrollFriction() == 2.0f ? 0 : -1)) * 44, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("\uf3a6\u09ff⟲쒈\u171d킫씶ಈ\ueab3碝\udd13峢䦍惗\ue7c3\uf051㟪〴듺뜢ꖧ鴓︱コ脈釲昏偳轼\ueffc莪풵뤹腼甛䦷⼿胯깬ԛ\ue65d\uf3f5哖Ḇ", 44 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        ChallengeResultCancelled = (BuildConfig + 95) % 128;
        return strIntern;
    }

    @Override // com.adyen.threeds2.Warning
    public final Warning.Severity getSeverity() {
        BuildConfig = (ChallengeResultCancelled + 107) % 128;
        Warning.Severity severity = Warning.Severity.HIGH;
        BuildConfig = (ChallengeResultCancelled + 49) % 128;
        return severity;
    }
}
