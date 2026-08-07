package atd.e;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.completed;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.h0;
import org.json.JSONArray;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wo0.b0;
import wo0.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR(\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R$\u0010'\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`&\u0012\u0004\u0012\u00020\u001c0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/adyen/threeds2/internal/api/challenge/model/ChallengeMessageRequest;", "Lcom/adyen/threeds2/internal/api/challenge/model/MessageRequest;", "Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "transactionIdentifiers", "", "threeDSRequestorAppURL", "messageVersion", "Lcom/adyen/threeds2/internal/api/challenge/input/ChallengeInput;", "challengeInput", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "whitelistingDataEntry", "<init>", "(Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/threeds2/internal/api/challenge/input/ChallengeInput;Lcom/adyen/threeds2/internal/util/DestroyableString;)V", "", "requiresEncryption", "()Z", "Lorg/json/JSONObject;", "serialize", "()Lorg/json/JSONObject;", "Ljn0/h0;", "clear", "()V", "Lcom/adyen/threeds2/internal/Protocol;", "protocol", "isProtocol", "(Lcom/adyen/threeds2/internal/Protocol;)Z", "Lcom/adyen/threeds2/internal/api/challenge/input/OutOfBandChallengeInput;", "outOfBandChallengeInput", "Lcom/adyen/threeds2/internal/api/challenge/model/MessageExtension;", "createOutOfBandMessageExtension", "(Lcom/adyen/threeds2/internal/api/challenge/input/OutOfBandChallengeInput;)Lcom/adyen/threeds2/internal/api/challenge/model/MessageExtension;", "Lcom/adyen/threeds2/internal/api/challenge/input/ChallengeInput;", "getChallengeInput", "()Lcom/adyen/threeds2/internal/api/challenge/input/ChallengeInput;", "setChallengeInput", "(Lcom/adyen/threeds2/internal/api/challenge/input/ChallengeInput;)V", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "", "Lcom/adyen/threeds2/internal/api/challenge/model/MessageExtensionId;", "messageExtensions", "Ljava/util/Map;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID extends getSDKEphemeralPublicKey {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char BuildConfig;
    private static int ChallengeResult;
    private static char[] getDeviceData;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private final atd.json.AuthenticationRequestParameters AuthenticationRequestParameters;
    private atd.b.getSDKReferenceNumber<?> getSDKReferenceNumber;
    private final Map<String, BuildConfig> getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKAppID = 1029305054;
        getDeviceData = new char[]{52401, 52412, 52395, 52462, 52415, 52383, 52463, 52403, 52408, 52413, 52402, 52394, 52414, 52398, 52365, 52397};
        BuildConfig = (char) 63808;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getSDKAppID(atd.ao.AuthenticationRequestParameters authenticationRequestParameters, String str, String str2) {
        this(authenticationRequestParameters, str, str2, (byte) 0);
        s.k(authenticationRequestParameters, "");
        s.k(str2, "");
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) throws Throwable {
        atd.b.BuildConfig buildConfig = (atd.b.BuildConfig) objArr[0];
        b0 b0Var = (b0) objArr[1];
        ChallengeResult = (getSDKEphemeralPublicKey + 7) % 128;
        s.k(b0Var, "");
        Object[] objArr2 = new Object[1];
        a(View.MeasureSpec.getSize(0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, false, TextUtils.indexOf((CharSequence) "", '0', 0) + 13, "\u0004￣\u0012\u0012\ufff7\ufff4￮￫\u0010\u0006\u0011\u0011", TextUtils.indexOf((CharSequence) "", '0') + 11, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        c((byte) (45 - TextUtils.indexOf("", "")), "\u0002\u0007", View.MeasureSpec.getSize(0) + 2, objArr3);
        i.a(b0Var, strIntern, ((String) objArr3[0]).intern());
        if (buildConfig != null) {
            Object[] objArr4 = new Object[1];
            a(Color.alpha(0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, true, TextUtils.getOffsetAfter("", 0) + 11, "\u0005\u0000\u000b\u0005\u0006ￚ\ufff9\u0006\u0006￼\f", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8, objArr4);
            i.a(b0Var, ((String) objArr4[0]).intern(), buildConfig.getDeviceData());
            String strBuildConfig = buildConfig.BuildConfig();
            if (strBuildConfig != null) {
                Object[] objArr5 = new Object[1];
                c((byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 116), "㙩㙩\u0005\t㙞㙞\u000f\n\u0007\b\u0003\u000e", (ViewConfiguration.getTouchSlop() >> 8) + 12, objArr5);
                i.a(b0Var, ((String) objArr5[0]).intern(), strBuildConfig);
            } else {
                getSDKEphemeralPublicKey = (ChallengeResult + 71) % 128;
            }
        }
        return h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = atd.e.getSDKAppID.$$a
            int r5 = r5 * 2
            int r5 = 4 - r5
            int r7 = 122 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r1[r5]
            int r3 = r3 + 1
        L26:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getSDKAppID.b(int, byte, int, java.lang.Object[]):void");
    }

    private static void c(byte b11, String str, int i11, Object[] objArr) throws Throwable {
        int i12;
        float f11;
        Object method;
        int i13;
        Object method2;
        $11 = ($10 + 1) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] cArr = getDeviceData;
        Class cls = Integer.TYPE;
        int i14 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i15])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1709775791);
                    if (obj != null) {
                        i13 = i14;
                        method2 = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - (Process.myTid() >> 22), (char) Color.red(i14), 24 - (TypedValue.complexToFloat(i14) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(i14) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        byte b12 = (byte) i14;
                        i13 = i14;
                        Object[] objArr3 = new Object[1];
                        b(b12, b12, $$a[2], objArr3);
                        method2 = cls2.getMethod((String) objArr3[i13], cls);
                        map.put(-1709775791, method2);
                    }
                    cArr2[i15] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    i15++;
                    charArray = charArray;
                    i14 = i13;
                    cArr = cArr;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = charArray;
        int i16 = i14;
        float f12 = BitmapDescriptorFactory.HUE_RED;
        Object[] objArr4 = {Integer.valueOf(BuildConfig)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method3 = map2.get(-1709775791);
        if (method3 == null) {
            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2314 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), View.MeasureSpec.getMode(i16) + 24);
            byte b13 = (byte) i16;
            Object[] objArr5 = new Object[1];
            b(b13, b13, $$a[2], objArr5);
            method3 = cls3.getMethod((String) objArr5[i16], cls);
            map2.put(-1709775791, method3);
        }
        char cCharValue = ((Character) ((Method) method3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            $11 = ($10 + 77) % 128;
            i12 = i11 - 1;
            cArr4[i12] = (char) (cArr3[i12] - b11);
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            $11 = ($10 + 57) % 128;
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i17 = completedVar.getSDKTransactionID;
                if (i17 >= i12) {
                    break;
                }
                char c11 = cArr3[i17];
                completedVar.getSDKAppID = c11;
                char c12 = cArr3[i17 + 1];
                completedVar.getSDKReferenceNumber = c12;
                if (c11 == c12) {
                    cArr4[i17] = (char) (c11 - b11);
                    cArr4[i17 + 1] = (char) (c12 - b11);
                    f11 = f12;
                } else {
                    Object[] objArr6 = {completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object obj2 = map3.get(700818725);
                    if (obj2 != null) {
                        method = obj2;
                        f11 = f12;
                    } else {
                        float f13 = f12;
                        f11 = f13;
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionChild(0L) + 1920, (char) (PointF.length(f13, f13) > f11 ? 1 : (PointF.length(f13, f13) == f11 ? 0 : -1)), 29 - Gravity.getAbsoluteGravity(0, 0));
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr7 = new Object[1];
                        b(b14, b15, b15, objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls5 = Integer.TYPE;
                        method = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map3.put(700818725, method);
                    }
                    int iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    int i18 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i18) {
                        $11 = ($10 + 61) % 128;
                        Object[] objArr8 = {completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, Integer.valueOf(cCharValue), completedVar};
                        Object method4 = map3.get(-248084636);
                        if (method4 == null) {
                            Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1721 - View.getDefaultSize(0, 0), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 48634), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23);
                            byte b16 = (byte) 0;
                            byte b17 = b16;
                            Object[] objArr9 = new Object[1];
                            b(b16, b17, (byte) (b17 | 49), objArr9);
                            String str3 = (String) objArr9[0];
                            Class cls7 = Integer.TYPE;
                            method4 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map3.put(-248084636, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i19 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i21 = completedVar.getSDKTransactionID;
                        cArr4[i21] = cArr[iIntValue2];
                        cArr4[i21 + 1] = cArr[i19];
                    } else {
                        int i22 = completedVar.getDeviceData;
                        int i23 = completedVar.AuthenticationRequestParameters;
                        if (i22 == i23) {
                            $11 = ($10 + 59) % 128;
                            int i24 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i24;
                            int i25 = ((i18 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i25;
                            int i26 = (i22 * cCharValue) + i24;
                            int i27 = completedVar.getSDKTransactionID;
                            cArr4[i27] = cArr[i26];
                            cArr4[i27 + 1] = cArr[(i23 * cCharValue) + i25];
                        } else {
                            int i28 = (i23 * cCharValue) + completedVar.getMessageVersion;
                            int i29 = completedVar.getSDKTransactionID;
                            cArr4[i29] = cArr[(i22 * cCharValue) + i18];
                            cArr4[i29 + 1] = cArr[i28];
                            $11 = ($10 + 75) % 128;
                        }
                        completedVar.getSDKTransactionID += 2;
                        f12 = f11;
                    }
                }
                completedVar.getSDKTransactionID += 2;
                f12 = f11;
            }
        }
        $11 = ($10 + 29) % 128;
        int i31 = 0;
        while (i31 < i11) {
            int i32 = $10 + 107;
            $11 = i32 % 128;
            if (i32 % 2 == 0) {
                cArr4[i31] = (char) (cArr4[i31] ^ 13916);
                i31 += 119;
            } else {
                cArr4[i31] = (char) (cArr4[i31] ^ 13722);
                i31++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static BuildConfig getDeviceData(final atd.b.BuildConfig buildConfig) throws Throwable {
        Object[] objArr = new Object[1];
        a(284 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true, (KeyEvent.getMaxKeyCode() >> 16) + 8, "\u0003\n\u0005\u0003\u0000\u0005\u000e\uffde", 8 - Gravity.getAbsoluteGravity(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(232 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), false, (-16777202) - Color.rgb(0, 0, 0), "\ufffe\ufffe\u0002\u000f\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\u0006\ufffe\u0000\ufffb", 4 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        b0 b0Var = new b0();
        String strAuthenticationRequestParameters = atd.am.getDeviceData.MESSAGE_EXTENSION_VERSION.AuthenticationRequestParameters();
        Object[] objArr3 = new Object[1];
        a(230 - KeyEvent.normalizeMetaState(0), true, (ViewConfiguration.getScrollBarSize() >> 8) + 3, "\uffff\u0002\u0001", 2 - View.combineMeasuredStates(0, 0), objArr3);
        i.a(b0Var, strAuthenticationRequestParameters, ((String) objArr3[0]).intern());
        i.b(b0Var, atd.am.getDeviceData.MESSAGE_EXTENSION_CHALLENGE_DATA.AuthenticationRequestParameters(), new l() { // from class: atd.e.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return getSDKAppID.getSDKTransactionID(buildConfig, (b0) obj);
            }
        });
        h0 h0Var = h0.f84049a;
        BuildConfig buildConfig2 = new BuildConfig(strIntern, strIntern2, b0Var.a());
        ChallengeResult = (getSDKEphemeralPublicKey + 33) % 128;
        return buildConfig2;
    }

    static void init$0() {
        $$a = new byte[]{83, 108, 55, -47};
        $$b = EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, org.json.JSONObject] */
    @Override // atd.e.getSDKEphemeralPublicKey, atd.f.getSDKReferenceNumber
    public final JSONObject getSDKAppID() throws Throwable {
        T tPut;
        n0 n0Var = new n0();
        n0Var.f86529a = super.getSDKAppID();
        atd.b.getSDKReferenceNumber<?> getsdkreferencenumber = this.getSDKReferenceNumber;
        if (getsdkreferencenumber != null) {
            if (!(getsdkreferencenumber instanceof atd.b.BuildConfig)) {
                JSONObject sDKAppID = getsdkreferencenumber.getSDKAppID();
                s.j(sDKAppID, "");
                JSONObject sDKAppID2 = atd.f.getSDKAppID.getSDKAppID((JSONObject) n0Var.f86529a, sDKAppID);
                atd.json.JSONObject.getSDKAppID(new Object[]{(JSONObject) n0Var.f86529a}, -1150790233, 1150790235, (int) System.currentTimeMillis());
                atd.json.JSONObject.getSDKAppID(new Object[]{sDKAppID}, -1150790233, 1150790235, (int) System.currentTimeMillis());
                ChallengeResult = (getSDKEphemeralPublicKey + 19) % 128;
                tPut = sDKAppID2;
            } else if (AuthenticationRequestParameters(atd.a.getSDKAppID.V2_1_0) || AuthenticationRequestParameters(atd.a.getSDKAppID.V2_2_0)) {
                JSONObject jSONObject = (JSONObject) n0Var.f86529a;
                Object[] objArr = new Object[1];
                a(ExpandableListView.getPackedPositionGroup(0L) + EnumC4419g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, true, 12 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0005\u0000\u000b\u0005\u0006ￚ\ufff9\u0006\u0006￼\f", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Boolean bool = atd.b.BuildConfig.getSDKReferenceNumber;
                s.j(bool, "");
                tPut = jSONObject.put(strIntern, bool.booleanValue());
            } else {
                JSONObject sDKAppID3 = ((atd.b.BuildConfig) getsdkreferencenumber).getSDKAppID();
                s.j(sDKAppID3, "");
                JSONObject sDKAppID4 = atd.f.getSDKAppID.getSDKAppID((JSONObject) n0Var.f86529a, sDKAppID3);
                atd.json.JSONObject.getSDKAppID(new Object[]{(JSONObject) n0Var.f86529a}, -1150790233, 1150790235, (int) System.currentTimeMillis());
                atd.json.JSONObject.getSDKAppID(new Object[]{sDKAppID3}, -1150790233, 1150790235, (int) System.currentTimeMillis());
                tPut = sDKAppID4;
            }
            n0Var.f86529a = tPut;
        }
        JSONObject jSONObject2 = (JSONObject) n0Var.f86529a;
        String strAuthenticationRequestParameters = atd.am.getDeviceData.WHITELISTING_DATA_ENTRY.AuthenticationRequestParameters();
        atd.json.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
        jSONObject2.putOpt(strAuthenticationRequestParameters, authenticationRequestParameters != null ? (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters}, 680619687, -680619685, System.identityHashCode(authenticationRequestParameters)) : null);
        JSONArray jSONArray = new JSONArray();
        Iterator<Map.Entry<String, BuildConfig>> it = this.getSDKTransactionID.entrySet().iterator();
        while (it.hasNext()) {
            int i11 = getSDKEphemeralPublicKey + 55;
            ChallengeResult = i11 % 128;
            if (i11 % 2 != 0) {
                jSONArray.put(it.next().getValue().getSDKReferenceNumber());
                int i12 = 64 / 0;
            } else {
                jSONArray.put(it.next().getValue().getSDKReferenceNumber());
            }
            ChallengeResult = (getSDKEphemeralPublicKey + 55) % 128;
        }
        if (jSONArray.length() != 0) {
            ((JSONObject) n0Var.f86529a).put(atd.am.getDeviceData.MESSAGE_EXTENSION.AuthenticationRequestParameters(), jSONArray);
        }
        return (JSONObject) n0Var.f86529a;
    }

    @Override // atd.e.getSDKEphemeralPublicKey
    public final void getSDKReferenceNumber() {
        int i11 = getSDKEphemeralPublicKey + 69;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            super.getSDKReferenceNumber();
            throw null;
        }
        super.getSDKReferenceNumber();
        atd.b.getSDKReferenceNumber<?> getsdkreferencenumber = this.getSDKReferenceNumber;
        if (getsdkreferencenumber != null) {
            getsdkreferencenumber.getSDKTransactionID();
            getSDKEphemeralPublicKey = (ChallengeResult + 13) % 128;
        } else {
            ChallengeResult = (getSDKEphemeralPublicKey + 35) % 128;
        }
        this.getSDKReferenceNumber = null;
        atd.json.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
        if (authenticationRequestParameters != null) {
            atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters}, -1497589000, 1497589000, System.identityHashCode(authenticationRequestParameters));
        }
        Iterator<Map.Entry<String, BuildConfig>> it = this.getSDKTransactionID.entrySet().iterator();
        while (it.hasNext()) {
            int i12 = getSDKEphemeralPublicKey + 41;
            ChallengeResult = i12 % 128;
            if (i12 % 2 != 0) {
                BuildConfig value = it.next().getValue();
                BuildConfig.getSDKReferenceNumber(new Object[]{value}, -804692130, 804692130, System.identityHashCode(value));
                throw null;
            }
            BuildConfig value2 = it.next().getValue();
            BuildConfig.getSDKReferenceNumber(new Object[]{value2}, -804692130, 804692130, System.identityHashCode(value2));
        }
        this.getSDKTransactionID.clear();
    }

    public final atd.b.getSDKReferenceNumber<?> getSDKTransactionID() {
        int i11 = (getSDKEphemeralPublicKey + 81) % 128;
        ChallengeResult = i11;
        atd.b.getSDKReferenceNumber<?> getsdkreferencenumber = this.getSDKReferenceNumber;
        getSDKEphemeralPublicKey = (i11 + 17) % 128;
        return getsdkreferencenumber;
    }

    private /* synthetic */ getSDKAppID(atd.ao.AuthenticationRequestParameters authenticationRequestParameters, String str, String str2, byte b11) {
        this(authenticationRequestParameters, str, str2, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x018a  */
    /* JADX WARN: Code duplicated, block: B:41:0x018b  */
    private static void a(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
        int i14;
        Throwable cause;
        int i15;
        Object method;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.az.getMessageVersion getmessageversion = new atd.az.getMessageVersion();
        char[] cArr = new char[i12];
        int i16 = 0;
        getmessageversion.getDeviceData = 0;
        while (true) {
            int i17 = getmessageversion.getDeviceData;
            if (i17 >= i12) {
                break;
            }
            $11 = ($10 + 43) % 128;
            char c11 = charArray[i17];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i11 + c11);
            cArr[i17] = c12;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(getSDKAppID);
                objArr2[i16] = Integer.valueOf(c12);
                Map map = atd.a.getMessageVersion.timedout;
                Object obj = map.get(139968170);
                if (obj != null) {
                    i15 = i16;
                    method = obj;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(1186 - (ViewConfiguration.getScrollBarSize() >> 8), (char) TextUtils.indexOf("", "", i16), TextUtils.getOffsetAfter("", i16) + 46);
                    byte b11 = (byte) i16;
                    byte b12 = b11;
                    i15 = i16;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, (byte) (b12 | 54), objArr3);
                    String str2 = (String) objArr3[i15];
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(139968170, method);
                }
                cArr[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = new Object[2];
                objArr4[1] = getmessageversion;
                objArr4[i15] = getmessageversion;
                Object method2 = map.get(-1388326022);
                if (method2 == null) {
                    int i18 = i15;
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(((Process.getThreadPriority(i15) + 20) >> 6) + 1721, (char) (View.MeasureSpec.makeMeasureSpec(i18, i18) + 48634), ExpandableListView.getPackedPositionChild(0L) + 25);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, (byte) (b14 | 56), objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(-1388326022, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                charArray = charArray;
                i16 = 0;
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
        if (i13 > 0) {
            getmessageversion.getSDKReferenceNumber = i13;
            char[] cArr2 = new char[i12];
            i14 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i12);
            int i19 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr2, 0, cArr, i12 - i19, i19);
            int i21 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr2, i21, cArr, 0, i12 - i21);
            $11 = ($10 + 69) % 128;
        } else {
            i14 = 0;
        }
        if (z11) {
            char[] cArr3 = new char[i12];
            getmessageversion.getDeviceData = i14;
            while (true) {
                int i22 = getmessageversion.getDeviceData;
                if (i22 >= i12) {
                    break;
                }
                cArr3[i22] = cArr[(i12 - i22) - 1];
                Object[] objArr6 = {getmessageversion, getmessageversion};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-1388326022);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.keyCodeFromString("") + 1721, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 48634), View.resolveSizeAndState(0, 0, 0) + 24);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, (byte) (b16 | 56), objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1388326022, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 getSDKTransactionID(atd.b.BuildConfig buildConfig, b0 b0Var) {
        return (h0) AuthenticationRequestParameters(new Object[]{buildConfig, b0Var}, -1927756972, 1927756972, (int) System.currentTimeMillis());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSDKAppID(atd.ao.AuthenticationRequestParameters authenticationRequestParameters, String str, String str2, atd.b.getSDKReferenceNumber<?> getsdkreferencenumber, atd.json.AuthenticationRequestParameters authenticationRequestParameters2) throws Throwable {
        super(atd.i.getDeviceData.CHALLENGE_REQUEST, authenticationRequestParameters, new atd.json.AuthenticationRequestParameters(str2), str != null ? new atd.json.AuthenticationRequestParameters(str) : null);
        s.k(authenticationRequestParameters, "");
        s.k(str2, "");
        this.getSDKReferenceNumber = getsdkreferencenumber;
        this.AuthenticationRequestParameters = authenticationRequestParameters2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.getSDKTransactionID = linkedHashMap;
        if (AuthenticationRequestParameters(atd.a.getSDKAppID.V2_2_0)) {
            Object[] objArr = new Object[1];
            a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, false, 14 - Gravity.getAbsoluteGravity(0, 0), "\ufffe\ufffe\u0002\u000f\ufffe\ufffe\ufffe\ufffe\ufffe\ufffe\u0006\ufffe\u0000\ufffb", 3 - View.MeasureSpec.getMode(0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            atd.b.getSDKReferenceNumber<?> getsdkreferencenumber2 = this.getSDKReferenceNumber;
            linkedHashMap.put(strIntern, getDeviceData(getsdkreferencenumber2 instanceof atd.b.BuildConfig ? (atd.b.BuildConfig) getsdkreferencenumber2 : null));
        }
    }

    @Override // atd.e.getSDKEphemeralPublicKey
    public final boolean AuthenticationRequestParameters() {
        int i11 = ChallengeResult + 125;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private final boolean AuthenticationRequestParameters(atd.a.getSDKAppID getsdkappid) {
        int i11 = getSDKEphemeralPublicKey + 117;
        ChallengeResult = i11 % 128;
        int i12 = i11 % 2;
        String sDKReferenceNumber = getsdkappid.getSDKReferenceNumber();
        if (i12 == 0) {
            atd.json.AuthenticationRequestParameters authenticationRequestParametersChallengeResultCancelled = ChallengeResultCancelled();
            return s.f(sDKReferenceNumber, (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParametersChallengeResultCancelled}, 680619687, -680619685, System.identityHashCode(authenticationRequestParametersChallengeResultCancelled)));
        }
        atd.json.AuthenticationRequestParameters authenticationRequestParametersChallengeResultCancelled2 = ChallengeResultCancelled();
        s.f(sDKReferenceNumber, (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParametersChallengeResultCancelled2}, 680619687, -680619685, System.identityHashCode(authenticationRequestParametersChallengeResultCancelled2)));
        throw null;
    }
}
