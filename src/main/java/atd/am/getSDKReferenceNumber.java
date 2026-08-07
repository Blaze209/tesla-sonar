package atd.am;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultKt;
import ch.qos.logback.core.joran.action.Action;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.adyen.threeds2.BuildConfig;
import java.lang.reflect.Method;
import java.util.Map;
import jn0.h0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wo0.b0;
import wo0.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a5\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u0018\u001a\u0004\u0018\u00010\u0015*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"", "Lcom/adyen/threeds2/internal/result/ResultCode;", "toResultCode", "(Ljava/lang/String;)Lcom/adyen/threeds2/internal/result/ResultCode;", StatusResponse.RESULT_CODE, "Lcom/adyen/threeds2/internal/result/MessageField;", "errorField", "Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "transactionIdentifiers", "messageVersion", "getBase64EncodedAdditionalDetails", "(Lcom/adyen/threeds2/internal/result/ResultCode;Lcom/adyen/threeds2/internal/result/MessageField;Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;Ljava/lang/String;)Ljava/lang/String;", "Lcom/adyen/threeds2/internal/result/models/DeviceIdentifiers;", "deviceIdentifiers", "Lkotlinx/serialization/json/JsonObject;", "createAdditionalDetailsJson", "(Lcom/adyen/threeds2/internal/result/ResultCode;Lcom/adyen/threeds2/internal/result/MessageField;Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;Lcom/adyen/threeds2/internal/result/models/DeviceIdentifiers;Ljava/lang/String;)Lkotlinx/serialization/json/JsonObject;", "Lwo0/b0;", "Lcom/adyen/threeds2/internal/result/AdditionalDetailsField;", Action.KEY_ATTRIBUTE, "value", "Lkotlinx/serialization/json/JsonElement;", "putIfNotNull", "(Lwo0/b0;Lcom/adyen/threeds2/internal/result/AdditionalDetailsField;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "put", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static byte[] AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static short[] getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        getMessageVersion = 1;
        getSDKAppID = -1015201316;
        getSDKReferenceNumber = -1568969995;
        getDeviceData = 873860270;
        AuthenticationRequestParameters = new byte[]{6, -4, 3};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r6 = r6 * 7
            int r6 = r6 + 114
            byte[] r0 = atd.am.getSDKReferenceNumber.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r8]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r8
            int r8 = r0 + 1
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.am.getSDKReferenceNumber.b(int, byte, int, java.lang.Object[]):void");
    }

    public static final String getDeviceData(ChallengeResultCancelled challengeResultCancelled, getDeviceData getdevicedata, atd.ao.AuthenticationRequestParameters authenticationRequestParameters, String str) throws Throwable {
        s.k(challengeResultCancelled, "");
        s.k(authenticationRequestParameters, "");
        String str2 = Build.VERSION.RELEASE;
        if (str2 == null) {
            str2 = "UNKNOWN";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.MANUFACTURER);
        sb2.append(' ');
        sb2.append(Build.MODEL);
        atd.ao.getSDKReferenceNumber getsdkreferencenumber = new atd.ao.getSDKReferenceNumber("Android", str2, sb2.toString());
        JsonObject sDKReferenceNumber = getSDKReferenceNumber(challengeResultCancelled, getdevicedata, authenticationRequestParameters, getsdkreferencenumber, str);
        atd.ao.getSDKReferenceNumber.getSDKTransactionID(new Object[]{getsdkreferencenumber}, -990024658, 990024659, System.identityHashCode(getsdkreferencenumber));
        String sDKTransactionID = ((atd.json.getDeviceData) atd.json.getDeviceData.getSDKTransactionID(new Object[0], 76032564, -76032563, (int) System.currentTimeMillis())).getSDKTransactionID(sDKReferenceNumber.toString());
        s.j(sDKTransactionID, "");
        return sDKTransactionID;
    }

    public static final ChallengeResultCancelled getSDKAppID(String str) {
        s.k(str, "");
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case 48626:
                if (str.equals("101")) {
                    return ChallengeResultCancelled.ERROR_FROM_ACS_MESSAGE_RECEIVED_INVALID;
                }
                break;
            case 48627:
                if (str.equals("102")) {
                    return ChallengeResultCancelled.ERROR_FROM_ACS_MESSAGE_VERSION_NOT_SUPPORTED;
                }
                break;
            default:
                switch (iHashCode) {
                    case 49587:
                        if (str.equals("201")) {
                            return ChallengeResultCancelled.ERROR_FROM_ACS_DATA_ELEMENT_MISSING;
                        }
                        break;
                    case 49588:
                        if (str.equals("202")) {
                            return ChallengeResultCancelled.ERROR_FROM_ACS_MESSAGE_EXTENSION_MISSING;
                        }
                        getMessageVersion = (getSDKEphemeralPublicKey + 103) % 128;
                        break;
                    case 49589:
                        if (str.equals("203")) {
                            return ChallengeResultCancelled.ERROR_FROM_ACS_DATA_ELEMENT_INVALID_FORMAT;
                        }
                        break;
                    case 49590:
                        if (str.equals("204")) {
                            return ChallengeResultCancelled.ERROR_FROM_ACS_DUPLICATE_DATA_ELEMENT;
                        }
                        break;
                    default:
                        switch (iHashCode) {
                            case 50548:
                                if (str.equals("301")) {
                                    return ChallengeResultCancelled.ERROR_FROM_ACS_TRANSACTION_ID_NOT_RECOGNIZED;
                                }
                                break;
                            case 50549:
                                if (str.equals("302")) {
                                    ChallengeResultCancelled challengeResultCancelled = ChallengeResultCancelled.ERROR_FROM_ACS_DATA_DECRYPTION_FAILURE;
                                    int i11 = getSDKEphemeralPublicKey + 55;
                                    getMessageVersion = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        return challengeResultCancelled;
                                    }
                                    throw null;
                                }
                                break;
                            case 50550:
                                if (str.equals("303")) {
                                    return ChallengeResultCancelled.ERROR_FROM_ACS_ACCESS_DENIED;
                                }
                                break;
                            case 50551:
                                if (str.equals("304")) {
                                    return ChallengeResultCancelled.ERROR_FROM_ACS_ISO_CODE_INVALID;
                                }
                                break;
                            case 50552:
                                if (str.equals("305")) {
                                    return ChallengeResultCancelled.ERROR_FROM_ACS_TRANSACTION_DATA_INVALID;
                                }
                                break;
                            default:
                                switch (iHashCode) {
                                    case 51510:
                                        if (str.equals("402")) {
                                            return ChallengeResultCancelled.ERROR_FROM_ACS_TRANSACTION_TIMED_OUT;
                                        }
                                        break;
                                    case 51511:
                                        if (str.equals("403")) {
                                            return ChallengeResultCancelled.ERROR_FROM_ACS_TRANSIENT_SYSTEM_FAILURE;
                                        }
                                        break;
                                    case 51512:
                                        if (str.equals("404")) {
                                            return ChallengeResultCancelled.ERROR_FROM_ACS_PERMANENT_SYSTEM_FAILURE;
                                        }
                                        break;
                                    case 51513:
                                        if (str.equals("405")) {
                                            return ChallengeResultCancelled.ERROR_FROM_ACS_SYSTEM_CONNECTION_FAILURE;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
        return ChallengeResultCancelled.ERROR_MESSAGE_FROM_ACS_OTHER;
    }

    private static JsonObject getSDKReferenceNumber(ChallengeResultCancelled challengeResultCancelled, getDeviceData getdevicedata, final atd.ao.AuthenticationRequestParameters authenticationRequestParameters, final atd.ao.getSDKReferenceNumber getsdkreferencenumber, final String str) throws Throwable {
        String strAuthenticationRequestParameters;
        s.k(challengeResultCancelled, "");
        s.k(authenticationRequestParameters, "");
        s.k(getsdkreferencenumber, "");
        b0 b0Var = new b0();
        getSDKTransactionID(b0Var, getSDKTransactionID.ERROR_CODE, challengeResultCancelled.getSDKReferenceNumber());
        getSDKTransactionID getsdktransactionid = getSDKTransactionID.ERROR_FIELD;
        if (getdevicedata != null) {
            getSDKEphemeralPublicKey = (getMessageVersion + 63) % 128;
            strAuthenticationRequestParameters = getdevicedata.AuthenticationRequestParameters();
        } else {
            getMessageVersion = (getSDKEphemeralPublicKey + 63) % 128;
            strAuthenticationRequestParameters = null;
        }
        i.b(b0Var, getSDKTransactionID.ADDITIONAL_DETAILS.AuthenticationRequestParameters(), new l() { // from class: atd.am.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return getSDKReferenceNumber.getDeviceData(authenticationRequestParameters, str, getsdkreferencenumber, (b0) obj);
            }
        });
        getSDKTransactionID getsdktransactionid2 = getSDKTransactionID.VERSION;
        Object[] objArr = new Object[1];
        a((-12) - View.resolveSizeAndState(0, 0, 0), AndroidCharacter.getMirror('0') + 39345, (short) Drawable.resolveOpacity(0, 0), (-1627794210) - TextUtils.indexOf("", "", 0, 0), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), objArr);
        getSDKTransactionID(b0Var, getsdktransactionid2, ((String) objArr[0]).intern());
        JsonObject jsonObjectA = b0Var.a();
        getSDKEphemeralPublicKey = (getMessageVersion + 61) % 128;
        return jsonObjectA;
    }

    public static /* synthetic */ String getSDKTransactionID(ChallengeResultCancelled challengeResultCancelled, atd.ao.AuthenticationRequestParameters authenticationRequestParameters, String str) throws Throwable {
        getMessageVersion = (getSDKEphemeralPublicKey + 111) % 128;
        String deviceData = getDeviceData(challengeResultCancelled, (getDeviceData) null, authenticationRequestParameters, str);
        getSDKEphemeralPublicKey = (getMessageVersion + 89) % 128;
        return deviceData;
    }

    static void init$0() {
        $$a = new byte[]{93, 9, 92, 99};
        $$b = 49;
    }

    private static void a(int i11, int i12, short s11, int i13, byte b11, Object[] objArr) throws Throwable {
        long j11;
        int i14;
        int i15;
        Object method;
        ChallengeResultKt challengeResultKt = new ChallengeResultKt();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i16 = 1;
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(getSDKReferenceNumber)};
            int i17 = 0;
            Map map = getMessageVersion.timedout;
            Object method2 = map.get(557807898);
            Class cls = Integer.TYPE;
            if (method2 == null) {
                Class cls2 = (Class) getMessageVersion.getSDKTransactionID(2105 - View.MeasureSpec.getSize(0), (char) (21995 - (ViewConfiguration.getPressedStateDuration() >> 16)), Color.alpha(0) + 31);
                byte b12 = (byte) 0;
                byte b13 = b12;
                Object[] objArr3 = new Object[1];
                b(b12, b13, b13, objArr3);
                method2 = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(557807898, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
            int i18 = iIntValue == -1 ? 1 : 0;
            if (i18 != 0) {
                byte[] bArr = AuthenticationRequestParameters;
                if (bArr != null) {
                    $11 = ($10 + 59) % 128;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i19 = 0;
                    j11 = 0;
                    while (i19 < length) {
                        $10 = ($11 + 71) % 128;
                        Object[] objArr4 = {Integer.valueOf(bArr[i19])};
                        int i21 = i16;
                        Map map2 = getMessageVersion.timedout;
                        Object obj = map2.get(-844142059);
                        if (obj != null) {
                            method = obj;
                        } else {
                            method = ((Class) getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionGroup(0L) + 2936, (char) TextUtils.getOffsetAfter("", i17), (ViewConfiguration.getFadingEdgeLength() >> 16) + 33)).getMethod("s", cls);
                            map2.put(-844142059, method);
                        }
                        bArr2[i19] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                        i19++;
                        i16 = i21;
                        bArr = bArr;
                        i17 = i17;
                    }
                    i14 = i16;
                    i15 = i17;
                    $10 = ($11 + 47) % 128;
                    bArr = bArr2;
                } else {
                    i14 = 1;
                    i15 = 0;
                    j11 = 0;
                }
                if (bArr != null) {
                    byte[] bArr3 = AuthenticationRequestParameters;
                    Object[] objArr5 = new Object[2];
                    objArr5[i14] = Integer.valueOf(getSDKAppID);
                    objArr5[i15] = Integer.valueOf(i13);
                    Map map3 = getMessageVersion.timedout;
                    Object method3 = map3.get(557807898);
                    if (method3 == null) {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID(2105 - View.MeasureSpec.getSize(i15), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21995), 31 - Color.blue(i15));
                        int i22 = i15;
                        byte b14 = (byte) i22;
                        byte b15 = b14;
                        Object[] objArr6 = new Object[i14];
                        b(b14, b15, b15, objArr6);
                        method3 = cls3.getMethod((String) objArr6[i22], cls, cls);
                        map3.put(557807898, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ (-671853308956415234L))) + ((int) (((long) getSDKReferenceNumber) ^ (-671853308956415234L))));
                } else {
                    iIntValue = (short) (((short) (((long) getSDKTransactionID[i13 + ((int) (((long) getSDKAppID) ^ (-671853308956415234L)))]) ^ (-671853308956415234L))) + ((int) (((long) getSDKReferenceNumber) ^ (-671853308956415234L))));
                    $11 = ($10 + 69) % 128;
                }
            } else {
                j11 = 0;
            }
            if (iIntValue > 0) {
                challengeResultKt.getDeviceData = ((i13 + iIntValue) - 2) + ((int) (((long) getSDKAppID) ^ (-671853308956415234L))) + i18;
                Object[] objArr7 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(getDeviceData), sb2};
                Map map4 = getMessageVersion.timedout;
                Object method4 = map4.get(-1793105104);
                if (method4 == null) {
                    Class cls4 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getTouchSlop() >> 8) + 2136, (char) ((SystemClock.elapsedRealtimeNanos() > j11 ? 1 : (SystemClock.elapsedRealtimeNanos() == j11 ? 0 : -1)) - 1), 28 - (ExpandableListView.getPackedPositionForGroup(0) > j11 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j11 ? 0 : -1)));
                    byte b16 = (byte) ($$b & 7);
                    byte b17 = (byte) (b16 - 1);
                    Object[] objArr8 = new Object[1];
                    b(b16, b17, b17, objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, cls, cls, Object.class);
                    map4.put(-1793105104, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(challengeResultKt.getSDKTransactionID);
                challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                byte[] bArr4 = AuthenticationRequestParameters;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i23 = 0; i23 < length2; i23++) {
                        $11 = ($10 + 107) % 128;
                        bArr5[i23] = (byte) (((long) bArr4[i23]) ^ (-671853308956415234L));
                    }
                    bArr4 = bArr5;
                }
                boolean z11 = bArr4 != null;
                challengeResultKt.getSDKReferenceNumber = 1;
                while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                    if (z11) {
                        byte[] bArr6 = AuthenticationRequestParameters;
                        int i24 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i24 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr6[i24]) ^ (-671853308956415234L))) + s11)) ^ b11));
                    } else {
                        short[] sArr = getSDKTransactionID;
                        int i25 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i25 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr[i25]) ^ (-671853308956415234L))) + s11)) ^ b11));
                    }
                    sb2.append(challengeResultKt.getSDKTransactionID);
                    challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                    challengeResultKt.getSDKReferenceNumber++;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    private static final JsonElement getSDKTransactionID(b0 b0Var, getSDKTransactionID getsdktransactionid, String str) {
        if (str == null) {
            int i11 = getSDKEphemeralPublicKey + 79;
            getMessageVersion = i11 % 128;
            if (i11 % 2 != 0) {
                return null;
            }
            throw null;
        }
        getSDKEphemeralPublicKey = (getMessageVersion + 119) % 128;
        JsonElement jsonElementA = i.a(b0Var, getsdktransactionid.AuthenticationRequestParameters(), str);
        int i12 = getSDKEphemeralPublicKey + 95;
        getMessageVersion = i12 % 128;
        if (i12 % 2 != 0) {
            return jsonElementA;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 getDeviceData(atd.ao.AuthenticationRequestParameters authenticationRequestParameters, String str, atd.ao.getSDKReferenceNumber getsdkreferencenumber, b0 b0Var) {
        getMessageVersion = (getSDKEphemeralPublicKey + 93) % 128;
        s.k(b0Var, "");
        getSDKTransactionID(b0Var, getSDKTransactionID.SDK_VERSION, BuildConfig.VERSION_NAME);
        getSDKTransactionID(b0Var, getSDKTransactionID.PLATFORM, (String) atd.ao.getSDKReferenceNumber.getSDKTransactionID(new Object[]{getsdkreferencenumber}, 1916747622, -1916747622, System.identityHashCode(getsdkreferencenumber)));
        getSDKTransactionID(b0Var, getSDKTransactionID.PLATFORM_VERSION, (String) atd.ao.getSDKReferenceNumber.getSDKTransactionID(new Object[]{getsdkreferencenumber}, -1640721886, 1640721888, System.identityHashCode(getsdkreferencenumber)));
        getSDKTransactionID(b0Var, getSDKTransactionID.DEVICE_MODEL, (String) atd.ao.getSDKReferenceNumber.getSDKTransactionID(new Object[]{getsdkreferencenumber}, 765513546, -765513543, System.identityHashCode(getsdkreferencenumber)));
        h0 h0Var = h0.f84049a;
        getSDKEphemeralPublicKey = (getMessageVersion + 115) % 128;
        return h0Var;
    }

    private static final JsonElement getDeviceData(b0 b0Var, getSDKTransactionID getsdktransactionid, String str) {
        return (JsonElement) getSDKAppID(new Object[]{b0Var, getsdktransactionid, str}, -1079130166, 1079130166, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
        b0 b0Var = (b0) objArr[0];
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[1];
        String str = (String) objArr[2];
        int i14 = getSDKEphemeralPublicKey;
        getMessageVersion = (i14 + 17) % 128;
        if (str != null) {
            return i.a(b0Var, getsdktransactionid.AuthenticationRequestParameters(), str);
        }
        getMessageVersion = (i14 + 11) % 128;
        return null;
    }
}
