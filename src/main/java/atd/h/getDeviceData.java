package atd.h;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.ChallengeStatusReceiver;
import com.adyen.threeds2.Warning;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceInformation;", "", "", "Lcom/adyen/threeds2/Warning;", "warnings", "", "", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "deviceParameters", "Lcom/adyen/threeds2/internal/deviceinfo/DataVersion;", "supportedDataVersion", "<init>", "(Ljava/util/List;Ljava/util/Map;Lcom/adyen/threeds2/internal/deviceinfo/DataVersion;)V", "dataVersion", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult;", "getDeviceData", "(Lcom/adyen/threeds2/internal/deviceinfo/DataVersion;)Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult;", "Ljn0/h0;", "destroy", "()V", "Lorg/json/JSONObject;", "getDeviceParametersJson", "(Ljava/util/Map;)Lorg/json/JSONObject;", "securityWarnings", "Lorg/json/JSONArray;", "getSecurityWarnings", "(Ljava/util/List;)Lorg/json/JSONArray;", "Lcom/adyen/threeds2/internal/deviceinfo/DataVersion;", "deviceData", "Lorg/json/JSONObject;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static boolean ChallengeResultCancelled;
    private static char[] getDeviceData;
    private static int getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private static boolean getSDKReferenceNumber;
    private final getSDKAppID getSDKAppID;
    private JSONObject getSDKTransactionID;

    /* JADX INFO: renamed from: atd.h.getDeviceData$getDeviceData, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceInformation$Companion;", "", "<init>", "()V", "DATA_VERSION", "", "SECURITY_WARNINGS", "DEVICE_DATA", "DEVICE_PARAMETERS_NOT_AVAILABLE", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0263getDeviceData {
        private C0263getDeviceData() {
        }

        public /* synthetic */ C0263getDeviceData(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        getMessageVersion = 1;
        getSDKReferenceNumber();
        ImageFormat.getBitsPerPixel(0);
        SystemClock.elapsedRealtimeNanos();
        ViewConfiguration.getKeyRepeatTimeout();
        TextUtils.indexOf("", "");
        new C0263getDeviceData((byte) 0);
        int i11 = getMessageVersion + 41;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public getDeviceData(List<? extends Warning> list, Map<String, ? extends DeviceParameterResult> map, getSDKAppID getsdkappid) throws Throwable {
        p013kotlin.jvm.internal.s.k(list, "");
        p013kotlin.jvm.internal.s.k(map, "");
        p013kotlin.jvm.internal.s.k(getsdkappid, "");
        this.getSDKAppID = getsdkappid;
        JSONObject deviceData = getDeviceData(map);
        Object[] objArr = new Object[1];
        a(null, null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u0082\u0081", objArr);
        deviceData.put(((String) objArr[0]).intern(), getsdkappid.getSDKAppID());
        JSONArray deviceData2 = getDeviceData(list);
        if (deviceData2.length() > 0) {
            Object[] objArr2 = new Object[1];
            a(null, null, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 126, "\u0084\u0083", objArr2);
            deviceData.put(((String) objArr2[0]).intern(), deviceData2);
        }
        map = p013kotlin.jvm.internal.u0.q(map) ? map : null;
        if (map != null) {
            map.clear();
        }
        this.getSDKTransactionID = deviceData;
    }

    private static void a(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        String str3 = str2;
        $11 = ($10 + 79) % 128;
        Object obj = str3;
        if (str3 != null) {
            byte[] bytes = str3.getBytes("ISO-8859-1");
            $11 = ($10 + 27) % 128;
            obj = bytes;
        }
        byte[] bArr = (byte[]) obj;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeStatusReceiver challengeStatusReceiver = new ChallengeStatusReceiver();
        char[] cArr = getDeviceData;
        Class cls = Integer.TYPE;
        int i12 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj2 = map.get(508097192);
                    if (obj2 == null) {
                        Method method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(328 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (KeyEvent.getMaxKeyCode() >> 16), 32 - Drawable.resolveOpacity(i12, i12))).getMethod("o", cls);
                        map.put(508097192, method);
                        obj2 = method;
                    }
                    cArr2[i13] = ((Character) ((Method) obj2).invoke(null, objArr2)).charValue();
                    i13++;
                    $11 = ($10 + 33) % 128;
                    cArr = cArr;
                    i12 = i12;
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
        int i14 = i12;
        Object[] objArr3 = {Integer.valueOf(AuthenticationRequestParameters)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method2 = map2.get(-852383591);
        if (method2 == null) {
            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2061 - (TypedValue.complexToFloat(i14) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(i14) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (Process.getGidForName("") + 1), TextUtils.getOffsetAfter("", i14) + 17);
            byte b11 = (byte) ($$b & 3);
            byte b12 = (byte) (b11 - 1);
            Object[] objArr4 = new Object[1];
            b(b11, b12, b12, objArr4);
            method2 = cls2.getMethod((String) objArr4[0], cls);
            map2.put(-852383591, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        char c11 = '0';
        long j11 = 0;
        int i15 = 2;
        if (ChallengeResultCancelled) {
            int length2 = bArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length2;
            char[] cArr3 = new char[length2];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i16 = challengeStatusReceiver.getDeviceData;
                int i17 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[i16] = (char) (cArr[bArr[(i17 - 1) - i16] + i11] - iIntValue);
                Object[] objArr5 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method3 = map3.get(-249860496);
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.alpha(0) + 1108, (char) (1 - (SystemClock.elapsedRealtime() > j11 ? 1 : (SystemClock.elapsedRealtime() == j11 ? 0 : -1))), 'b' - AndroidCharacter.getMirror('0'));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                    map3.put(-249860496, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                j11 = j11;
            }
        } else if (getSDKReferenceNumber) {
            int length3 = charArray.length;
            challengeStatusReceiver.getSDKReferenceNumber = length3;
            char[] cArr4 = new char[length3];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i18 = challengeStatusReceiver.getDeviceData;
                int i19 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                $10 = ($11 + 113) % 128;
                cArr4[i18] = (char) (cArr[charArray[(i19 - 1) - i18] - i11] - iIntValue);
                Object[] objArr7 = new Object[i15];
                objArr7[1] = challengeStatusReceiver;
                objArr7[0] = challengeStatusReceiver;
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-249860496);
                if (method4 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1108 - (AudioTrack.getMinVolume() > 0 ? 1 : (AudioTrack.getMinVolume() == 0 ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), 49 - TextUtils.indexOf("", c11, 0));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, b16, objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                    map4.put(-249860496, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                i15 = i15;
                c11 = '0';
            }
        } else {
            int length4 = iArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length4;
            char[] cArr5 = new char[length4];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i21 = challengeStatusReceiver.getDeviceData;
                int i22 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i23 = $11 + 27;
                $10 = i23 % 128;
                if (i23 % 2 != 0) {
                    cArr5[i21] = (char) (cArr[iArr[(i22 - 1) >> i21] << i11] / iIntValue);
                } else {
                    cArr5[i21] = (char) (cArr[iArr[(i22 - 1) - i21] - i11] - iIntValue);
                    i21++;
                }
                challengeStatusReceiver.getDeviceData = i21;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.h.getDeviceData.$$a
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r6 = r6 * 2
            int r6 = 109 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r8
            goto L32
        L17:
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r2
        L1b:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L32:
            int r8 = r8 + 1
            int r6 = r6 + r0
            r0 = r8
            r8 = r6
            r6 = r0
            r0 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.h.getDeviceData.b(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x008d A[SYNTHETIC] */
    private static JSONObject getDeviceData(Map<String, ? extends DeviceParameterResult> map) throws Throwable {
        String key;
        DeviceParameterResult value;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<Map.Entry<String, ? extends DeviceParameterResult>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            int i11 = getSDKEphemeralPublicKey + 13;
            getMessageVersion = i11 % 128;
            if (i11 % 2 == 0) {
                Map.Entry<String, ? extends DeviceParameterResult> next = it.next();
                key = next.getKey();
                value = next.getValue();
                int i12 = 44 / 0;
                if (value instanceof DeviceParameterResult.Failure) {
                    jSONObject.put(key, ((DeviceParameterResult.Failure) value).getReason().getCode());
                } else if (value instanceof DeviceParameterResult.Success.StringsListValue) {
                    jSONObject2.put(key, new JSONArray((Collection) ((DeviceParameterResult.Success.StringsListValue) value).m62unboximpl()));
                    getSDKEphemeralPublicKey = (getMessageVersion + 109) % 128;
                } else {
                    if (value instanceof DeviceParameterResult.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jSONObject2.put(key, value.toString());
                }
            } else {
                Map.Entry<String, ? extends DeviceParameterResult> next2 = it.next();
                key = next2.getKey();
                value = next2.getValue();
                if (value instanceof DeviceParameterResult.Failure) {
                    jSONObject.put(key, ((DeviceParameterResult.Failure) value).getReason().getCode());
                } else if (value instanceof DeviceParameterResult.Success.StringsListValue) {
                    jSONObject2.put(key, new JSONArray((Collection) ((DeviceParameterResult.Success.StringsListValue) value).m62unboximpl()));
                    getSDKEphemeralPublicKey = (getMessageVersion + 109) % 128;
                } else {
                    if (value instanceof DeviceParameterResult.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jSONObject2.put(key, value.toString());
                }
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject2.length() != 0) {
            getMessageVersion = (getSDKEphemeralPublicKey + 97) % 128;
            Object[] objArr = new Object[1];
            a(null, null, 126 - ImageFormat.getBitsPerPixel(0), "\u0081\u0081", objArr);
            jSONObject3.put(((String) objArr[0]).intern(), jSONObject2);
        }
        if (jSONObject.length() != 0) {
            Object[] objArr2 = new Object[1];
            a(null, null, 126 - Process.getGidForName(""), "\u0087\u0086\u0085\u0081", objArr2);
            jSONObject3.put(((String) objArr2[0]).intern(), jSONObject);
        }
        return jSONObject3;
    }

    static void getSDKReferenceNumber() {
        getDeviceData = new char[]{64920, 64902, 64907, 64903, 64908, 64910, 64925};
        AuthenticationRequestParameters = -185467428;
        getSDKReferenceNumber = true;
        ChallengeResultCancelled = true;
    }

    static void init$0() {
        $$a = new byte[]{29, -9, 65, -64};
        $$b = 125;
    }

    public final getSDKTransactionID getSDKTransactionID(getSDKAppID getsdkappid) {
        getMessageVersion = (getSDKEphemeralPublicKey + 19) % 128;
        p013kotlin.jvm.internal.s.k(getsdkappid, "");
        if (getsdkappid != this.getSDKAppID) {
            getMessageVersion = (getSDKEphemeralPublicKey + 35) % 128;
            return getSDKTransactionID.getSDKReferenceNumber.AuthenticationRequestParameters;
        }
        JSONObject jSONObject = this.getSDKTransactionID;
        if (jSONObject != null) {
            return new getSDKTransactionID.C0264getSDKTransactionID(jSONObject);
        }
        getSDKTransactionID.getDeviceData getdevicedata = getSDKTransactionID.getDeviceData.getDeviceData;
        int i11 = getSDKEphemeralPublicKey + 9;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            return getdevicedata;
        }
        throw null;
    }

    public final void getSDKTransactionID() {
        JSONObject jSONObject = this.getSDKTransactionID;
        if (jSONObject != null) {
            atd.json.JSONObject.getSDKAppID(new Object[]{jSONObject}, -1150790233, 1150790235, (int) System.currentTimeMillis());
        } else {
            getSDKEphemeralPublicKey = (getMessageVersion + 69) % 128;
        }
        this.getSDKTransactionID = null;
        int i11 = getSDKEphemeralPublicKey + 27;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private static JSONArray getDeviceData(List<? extends Warning> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            getSDKEphemeralPublicKey = (getMessageVersion + 21) % 128;
            jSONArray.put(((Warning) it.next()).getID());
            getSDKEphemeralPublicKey = (getMessageVersion + 87) % 128;
        }
        int i11 = getSDKEphemeralPublicKey + 61;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            return jSONArray;
        }
        throw null;
    }
}
