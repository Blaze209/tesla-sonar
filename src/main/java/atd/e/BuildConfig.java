package atd.e;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class BuildConfig {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static int getSDKEphemeralPublicKey;
    private JsonObject getDeviceData;
    private String getSDKAppID;
    private boolean getSDKReferenceNumber;
    private String getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKEphemeralPublicKey();
        Gravity.getAbsoluteGravity(0, 0);
        ViewConfiguration.getWindowTouchSlop();
        TextUtils.indexOf("", "", 0);
        ViewConfiguration.getScrollBarSize();
        Process.getThreadPriority(0);
        ViewConfiguration.getJumpTapTimeout();
        TextUtils.getOffsetBefore("", 0);
        Color.alpha(0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 65) % 128;
    }

    public BuildConfig(String str, String str2, JsonObject jsonObject) {
        this.getSDKTransactionID = str;
        this.getSDKAppID = str2;
        this.getSDKReferenceNumber = false;
        this.getDeviceData = jsonObject;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0039 A[PHI: r3
      0x0039: PHI (r3v6 atd.am.getSDKAppID<kotlinx.serialization.json.JsonObject>) = 
      (r3v5 atd.am.getSDKAppID<kotlinx.serialization.json.JsonObject>)
      (r3v12 atd.am.getSDKAppID<kotlinx.serialization.json.JsonObject>)
     binds: [B:11:0x0037, B:8:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    static List<BuildConfig> AuthenticationRequestParameters(JsonArray jsonArray) throws Throwable {
        atd.am.getSDKAppID<JsonObject> sDKReferenceNumber;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jsonArray.e(); i11++) {
            int i12 = getSDKEphemeralPublicKey + 99;
            ChallengeResultCancelled = i12 % 128;
            if (i12 % 2 != 0) {
                sDKReferenceNumber = atd.d.getMessageVersion.getSDKReferenceNumber(jsonArray.get(i11), atd.am.getDeviceData.NONE);
                int i13 = 28 / 0;
                if (sDKReferenceNumber instanceof atd.am.getSDKAppID.getDeviceData) {
                    atd.am.getSDKAppID.getDeviceData getdevicedata = (atd.am.getSDKAppID.getDeviceData) sDKReferenceNumber;
                    arrayList.add(new BuildConfig((JsonObject) atd.am.getSDKAppID.getDeviceData.AuthenticationRequestParameters(new Object[]{getdevicedata}, -389237788, 389237789, System.identityHashCode(getdevicedata))));
                }
            } else {
                sDKReferenceNumber = atd.d.getMessageVersion.getSDKReferenceNumber(jsonArray.get(i11), atd.am.getDeviceData.NONE);
                if (sDKReferenceNumber instanceof atd.am.getSDKAppID.getDeviceData) {
                    atd.am.getSDKAppID.getDeviceData getdevicedata2 = (atd.am.getSDKAppID.getDeviceData) sDKReferenceNumber;
                    arrayList.add(new BuildConfig((JsonObject) atd.am.getSDKAppID.getDeviceData.AuthenticationRequestParameters(new Object[]{getdevicedata2}, -389237788, 389237789, System.identityHashCode(getdevicedata2))));
                }
            }
        }
        int i14 = getSDKEphemeralPublicKey + 107;
        ChallengeResultCancelled = i14 % 128;
        if (i14 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x01f3  */
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
            char c11 = charArray[i17];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i11 + c11);
            cArr[i17] = c12;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(AuthenticationRequestParameters);
                objArr2[i16] = Integer.valueOf(c12);
                Map map = atd.a.getMessageVersion.timedout;
                Object obj = map.get(139968170);
                if (obj != null) {
                    method = obj;
                    i15 = i16;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1186, (char) (MotionEvent.axisFromString("") + 1), TextUtils.getCapsMode("", i16, i16) + 46);
                    byte b11 = (byte) i16;
                    byte b12 = b11;
                    i15 = i16;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, (byte) (b12 + 1), objArr3);
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
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getOffsetAfter("", i18) + 1721, (char) (48634 - KeyEvent.normalizeMetaState(i18)), ExpandableListView.getPackedPositionChild(0L) + 25);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, b14, objArr5);
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
            $11 = ($10 + 61) % 128;
            getmessageversion.getSDKReferenceNumber = i13;
            char[] cArr2 = new char[i12];
            i14 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i12);
            int i19 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr2, 0, cArr, i12 - i19, i19);
            int i21 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr2, i21, cArr, 0, i12 - i21);
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
                int i23 = $11 + 123;
                $10 = i23 % 128;
                if (i23 % 2 != 0) {
                    cArr3[i22] = cArr[i12 * i22];
                    Object[] objArr6 = {getmessageversion, getmessageversion};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method3 = map2.get(-1388326022);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1722 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (48634 - View.MeasureSpec.getSize(0)), View.resolveSize(0, 0) + 24);
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, b16, objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                        map2.put(-1388326022, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
                } else {
                    cArr3[i22] = cArr[(i12 - i22) - 1];
                    Object[] objArr8 = {getmessageversion, getmessageversion};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method4 = map3.get(-1388326022);
                    if (method4 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getJumpTapTimeout() >> 16) + 1721, (char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 48634), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
                        byte b17 = (byte) 0;
                        byte b18 = b17;
                        Object[] objArr9 = new Object[1];
                        b(b17, b18, b18, objArr9);
                        method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                        map3.put(-1388326022, method4);
                    }
                    ((Method) method4).invoke(null, objArr8);
                }
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = atd.e.BuildConfig.$$a
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r9 = r9 * 2
            int r9 = r9 + 66
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L18
            r9 = r7
            r3 = r0
            r5 = r2
            r0 = r8
            goto L31
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r0
            r0 = r6
        L31:
            int r7 = r7 + r0
            r0 = r9
            r9 = r7
            r7 = r0
            r0 = r3
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.BuildConfig.b(int, short, int, java.lang.Object[]):void");
    }

    static void getSDKEphemeralPublicKey() {
        AuthenticationRequestParameters = 1029305003;
    }

    public static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr, int i11, int i12, int i13) {
        BuildConfig buildConfig = (BuildConfig) objArr[0];
        int i14 = ChallengeResultCancelled + 31;
        getSDKEphemeralPublicKey = i14 % 128;
        int i15 = i14 % 2;
        buildConfig.getSDKTransactionID = null;
        buildConfig.getSDKAppID = null;
        buildConfig.getSDKReferenceNumber = false;
        buildConfig.getDeviceData = null;
        return null;
    }

    static void init$0() {
        $$a = new byte[]{108, 15, 34, -15};
        $$b = 48;
    }

    public final void ChallengeResult() {
        getSDKReferenceNumber(new Object[]{this}, -804692130, 804692130, System.identityHashCode(this));
    }

    public final JsonObject getDeviceData() {
        int i11 = ChallengeResultCancelled + 125;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            return this.getDeviceData;
        }
        int i12 = 98 / 0;
        return this.getDeviceData;
    }

    public final String getSDKAppID() throws Throwable {
        JsonObject jsonObject = this.getDeviceData;
        if (jsonObject == null) {
            int i11 = ChallengeResultCancelled + 113;
            getSDKEphemeralPublicKey = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 16 / 0;
            }
            return null;
        }
        atd.am.getSDKAppID<String> getsdkappidAuthenticationRequestParameters = atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, atd.am.getDeviceData.MESSAGE_EXTENSION_VERSION);
        if (getsdkappidAuthenticationRequestParameters instanceof atd.am.getSDKAppID.getDeviceData) {
            atd.am.getSDKAppID.getDeviceData getdevicedata = (atd.am.getSDKAppID.getDeviceData) getsdkappidAuthenticationRequestParameters;
            return (String) atd.am.getSDKAppID.getDeviceData.AuthenticationRequestParameters(new Object[]{getdevicedata}, -389237788, 389237789, System.identityHashCode(getdevicedata));
        }
        int i13 = getSDKEphemeralPublicKey + 115;
        ChallengeResultCancelled = i13 % 128;
        if (i13 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final String getSDKTransactionID() {
        int i11 = ChallengeResultCancelled + 109;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            return this.getSDKAppID;
        }
        throw null;
    }

    private BuildConfig(JsonObject jsonObject) throws Throwable {
        atd.am.getDeviceData getdevicedata = atd.am.getDeviceData.MESSAGE_EXTENSION_NAME;
        String sDKReferenceNumber = atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, getdevicedata).getSDKReferenceNumber();
        this.getSDKTransactionID = sDKReferenceNumber;
        if (sDKReferenceNumber.length() <= 64) {
            atd.am.getDeviceData getdevicedata2 = atd.am.getDeviceData.MESSAGE_EXTENSION_ID;
            String sDKReferenceNumber2 = atd.d.getMessageVersion.AuthenticationRequestParameters(jsonObject, getdevicedata2).getSDKReferenceNumber();
            this.getSDKAppID = sDKReferenceNumber2;
            if (sDKReferenceNumber2.length() <= 64) {
                boolean zBooleanValue = atd.d.getMessageVersion.getDeviceData(jsonObject, atd.am.getDeviceData.MESSAGE_EXTENSION_CRITICALITY_INDICATOR).getSDKReferenceNumber().booleanValue();
                this.getSDKReferenceNumber = zBooleanValue;
                if (!zBooleanValue) {
                    atd.am.getDeviceData getdevicedata3 = atd.am.getDeviceData.MESSAGE_EXTENSION_DATA;
                    JsonObject sDKReferenceNumber3 = atd.d.getMessageVersion.getSDKTransactionID(jsonObject, getdevicedata3).getSDKReferenceNumber();
                    this.getDeviceData = sDKReferenceNumber3;
                    if (sDKReferenceNumber3.toString().length() <= 8059) {
                        return;
                    }
                    Object[] objArr = new Object[1];
                    a(286 - ((byte) KeyEvent.getModifierMetaStateMask()), false, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19, "\u0004\u000f\f\u0007ￃ\u0007\u0004\u0017\u0004ￃ\u000f\b\u0011\n\u0017\u000b\uffd1￬\u0011\u0019", 17 - Color.argb(0, 0, 0, 0), objArr);
                    throw new atd.z.AuthenticationRequestParameters(((String) objArr[0]).intern(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, atd.am.ChallengeResultCancelled.MESSAGE_FIELD_TOO_LONG, getdevicedata3);
                }
                Object[] objArr2 = new Object[1];
                a(293 - Color.red(0), true, 40 - (ViewConfiguration.getKeyRepeatDelay() >> 16), "ￋ\u000b\f\u0006\u0010\u000b\u0002\u0011\u0015\u0002ﾽ\u0002\u0004\ufffe\u0010\u0010\u0002\nﾽ\t\ufffe\u0000\u0006\u0011\u0006\u000f\u0000ﾽ\u0001\u0002\u0017\u0006\u000b\u0004\f\u0000\u0002\u000f\u000b\ufff2", 41 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
                throw new atd.z.AuthenticationRequestParameters(((String) objArr2[0]).intern(), atd.i.getSDKTransactionID.MESSAGE_EXTENSION_MISSING, atd.am.ChallengeResultCancelled.MESSAGE_EXTENSION_IS_CRITICAL);
            }
            Object[] objArr3 = new Object[1];
            a(View.MeasureSpec.getSize(0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, false, KeyEvent.keyCodeFromString("") + 20, "\u0004\u000f\f\u0007ￃ\u0007\u0004\u0017\u0004ￃ\u000f\b\u0011\n\u0017\u000b\uffd1￬\u0011\u0019", 'A' - AndroidCharacter.getMirror('0'), objArr3);
            throw new atd.z.AuthenticationRequestParameters(((String) objArr3[0]).intern(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, atd.am.ChallengeResultCancelled.MESSAGE_FIELD_TOO_LONG, getdevicedata2);
        }
        Object[] objArr4 = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0, 0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, false, 20 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0004\u000f\f\u0007ￃ\u0007\u0004\u0017\u0004ￃ\u000f\b\u0011\n\u0017\u000b\uffd1￬\u0011\u0019", 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr4);
        throw new atd.z.AuthenticationRequestParameters(((String) objArr4[0]).intern(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, atd.am.ChallengeResultCancelled.MESSAGE_FIELD_TOO_LONG, getdevicedata);
    }

    public final JSONObject getSDKReferenceNumber() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(atd.am.getDeviceData.MESSAGE_EXTENSION_NAME.AuthenticationRequestParameters(), this.getSDKTransactionID);
        jSONObject.put(atd.am.getDeviceData.MESSAGE_EXTENSION_ID.AuthenticationRequestParameters(), this.getSDKAppID);
        jSONObject.put(atd.am.getDeviceData.MESSAGE_EXTENSION_CRITICALITY_INDICATOR.AuthenticationRequestParameters(), this.getSDKReferenceNumber);
        jSONObject.put(atd.am.getDeviceData.MESSAGE_EXTENSION_DATA.AuthenticationRequestParameters(), atd.d.BuildConfig.getSDKAppID(this.getDeviceData));
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 83) % 128;
        return jSONObject;
    }

    public final String AuthenticationRequestParameters() {
        int i11 = (ChallengeResultCancelled + 35) % 128;
        getSDKEphemeralPublicKey = i11;
        String str = this.getSDKTransactionID;
        ChallengeResultCancelled = (i11 + 43) % 128;
        return str;
    }
}
