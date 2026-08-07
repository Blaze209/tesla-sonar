package atd.ad;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.getTransactionStatus;
import com.adyen.threeds2.exception.InvalidInputException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ getDeviceData[] $VALUES;
    public static final getDeviceData APPLICATION_CONTEXT;
    public static final getDeviceData CHALLENGE_PARAMETERS;
    public static final getDeviceData CHALLENGE_STATUS_RECEIVER;
    public static final getDeviceData CONFIG_PARAMETERS;
    public static final getDeviceData CURRENT_ACTIVITY;
    public static final getDeviceData DEVICE_DATA;
    private static getDeviceData DIRECTORY_SERVER_ID;
    public static final getDeviceData LOCALE;
    public static final getDeviceData MESSAGE_VERSION;
    public static final getDeviceData SDK_APP_ID;
    public static final getDeviceData SDK_EPHEMERAL_PUBLIC_KEY;
    public static final getDeviceData SDK_REFERENCE_NUMBER;
    public static final getDeviceData SDK_TRANSACTION_ID;
    public static final getDeviceData TIMEOUT;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static long getSDKTransactionID;
    private final String mErrorMessage;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKReferenceNumber = 1;
        AuthenticationRequestParameters();
        Object[] objArr = new Object[1];
        a("ﴕ╉䶞痿鰩쒖\uecdb\u171b㽵枮踘뙄\ude8b۲⤬冃私ꀑ졪", View.resolveSize(0, 0) + 55373, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27, View.resolveSize(0, 0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, true, "\u000b\u0005\u0010�\uffff\u0005\b\f\f�ﾼ\u0000\u0005\b�\u0012\n￥ￊ\u0010\u0014\u0001\u0010\n\u000b\uffdf\n", 18 - ExpandableListView.getPackedPositionType(0L), objArr2);
        APPLICATION_CONTEXT = new getDeviceData(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a("ﴗ䘦譠첥ᇩ唢鹥\ue3af⓽栣굷\uf686㯍缙쁇֕仗", 47934 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(26 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 224 - TextUtils.indexOf("", "", 0), true, "ￌ\u0011\u0010\u0003\u0012\u0003\u000b\uffff\u0010\uffff￮\u0005\u0007\u0004\f\r\u0001ﾾ\u0002\u0007\n\uffff\u0014\f\uffe7", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 25, objArr4);
        CONFIG_PARAMETERS = new getDeviceData(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a("ﴘﵰﷁﱔﲴ＆", (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 107, objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a("ﴝ䖿谨풺Ἤ枤긮\uf6d7㤐膖젅ႂ嬄ꏰ\uea3c", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 47236, objArr6);
        LOCALE = new getDeviceData(strIntern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        b(19 - Gravity.getAbsoluteGravity(0, 0), 204 - (ViewConfiguration.getScrollBarSize() >> 8), true, "\u0011\u0004\ufff7\b\u0004\ufff7\u0005\u0011\u000b\u0004\u0001\u0006\ufff5\ufff7\u0004\ufffb\ufff6\ufff6\ufffb", ImageFormat.getBitsPerPixel(0) + 18, objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        b(26 - View.MeasureSpec.getSize(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + EnumC4419g.SDK_ASSET_ICON_SUBTRACT_VALUE, true, "\u0018\u0011\u000e\u0013\u0002\u0004\u0011\b\u0003\uffbf\u0003\b\u000b\u0000\u0015\r￨ￍ￣￨\u0011\u0004\u0015\u0011\u0004\ufff2", 17 - (Process.myPid() >> 22), objArr8);
        DIRECTORY_SERVER_ID = new getDeviceData(strIntern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        a("ﴙӜຝၠᨡᰒ⟟⦐㍪㔤㼄䛈䢁割听", TextUtils.indexOf("", "", 0) + 63949, objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        b(24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), Process.getGidForName("") + EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, true, "\f\r\u0007\u0011\u0010\u0003\ufff4\u0003\u0005\uffff\u0011\u0011\u0003\u000bﾾ\u0002\u0007\n\uffff\u0014\f\uffe7ￌ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22, objArr10);
        MESSAGE_VERSION = new getDeviceData(strIntern5, 4, ((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        a("ﴗၤ⟌㔩䢅忣浞胈阽ꖚ룲칊\uddbe\uf33cچᗦ", KeyEvent.keyCodeFromString("") + 60773, objArr11);
        String strIntern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a("ﴝ쉣莐䌾\\솀脦䘛߿윀葜䗵ԝ쪿课䬢ࢧ짉西亹࿉콭貋䶅", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16216, objArr12);
        CURRENT_ACTIVITY = new getDeviceData(strIntern6, 5, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        a("ﴗ兣ꗫ\uf865䳤ꍪ\uf7e0䩪黩\ued7c䇲鑠\ue8f2㽦鏫\ue660㫰襾\udde8な", View.combineMeasuredStates(0, 0) + 44159, objArr13);
        String strIntern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a("ﴝ\uef4b\ud9c0쩦듼ꄈ鎖籣溿壅䕟㟣⁴ኌ４\ue9ac\uda21쒅뛇ꍅ跡繼梇唇䞩〯≝\u0c91", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4721, objArr14);
        CHALLENGE_PARAMETERS = new getDeviceData(strIntern7, 6, ((String) objArr14[0]).intern());
        Object[] objArr15 = new Object[1];
        a("ﴗ\u20f5䛇撣誼ꢜ칬\uec4c\u1259〺嘝球鯹맕\udfbfﶠ⎛䅿杳蕜ꬥ준\uef04ዾマ", (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 56809, objArr15);
        String strIntern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        b((ViewConfiguration.getScrollBarSize() >> 8) + 32, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, false, "￦\u000b\u0013\ufffe\t\u0006\u0001ﾽ\u0000\u0005\ufffe\t\t\u0002\u000b\u0004\u0002\ufff0\u0011\ufffe\u0011\u0012\u0010\uffef\u0002\u0000\u0002\u0006\u0013\u0002\u000fￋ", 33 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr16);
        CHALLENGE_STATUS_RECEIVER = new getDeviceData(strIntern8, 7, ((String) objArr16[0]).intern());
        Object[] objArr17 = new Object[1];
        a("ﴀ\ued8e\udc3f첨뽗꿞鹲", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4242, objArr17);
        String strIntern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        a("ﴝᆗ⑸㬲侌扜焾藏顈꼨쏻홞\ue507裡ౖ⍙", (ViewConfiguration.getLongPressTimeout() >> 16) + 60589, objArr18);
        TIMEOUT = new getDeviceData(strIntern9, 8, ((String) objArr18[0]).intern());
        Object[] objArr19 = new Object[1];
        b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, true, "\u0012\u0001\u0002￼\u0007\ufff6\ufff4\u0006\u0001\ufff4\u0005\u0007\u0012\ufffe\ufff7\u0006\ufff7￼", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16, objArr19);
        String strIntern10 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        a("ﴝ聾\uf5dc\uf048\uecc4\ueb46\ue7ca\ue20d\udedf핇퇉챵죒읆쏈빖뫅녘귎ꡐꓗꍑ鿷驹隒", 1150 - TextUtils.indexOf((CharSequence) "", '0'), objArr20);
        SDK_TRANSACTION_ID = new getDeviceData(strIntern10, 9, ((String) objArr20[0]).intern());
        Object[] objArr21 = new Object[1];
        b(Drawable.resolveOpacity(0, 0) + 11, 199 - (ViewConfiguration.getFadingEdgeLength() >> 16), true, "￼\ufffb\ufff8\u000b\ufff8\ufffb\u0016￼\ufffa\u0000\r", Color.argb(0, 0, 0, 0) + 2, objArr21);
        String strIntern11 = ((String) objArr21[0]).intern();
        Object[] objArr22 = new Object[1];
        b((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19, View.MeasureSpec.makeMeasureSpec(0, 0) + EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, true, "\u0018\u0007\u0006ￂ\u0006\u000b\u000e\u0003\u0018\u0010￫\uffd0\u0003\u0016\u0003￦\u0007\u0005\u000b", 11 - (ViewConfiguration.getScrollBarSize() >> 8), objArr22);
        DEVICE_DATA = new getDeviceData(strIntern11, 10, ((String) objArr22[0]).intern());
        Object[] objArr23 = new Object[1];
        b(TextUtils.indexOf("", "", 0, 0) + 24, TextUtils.lastIndexOf("", '0') + EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE, false, "\f\u0006\ufff7\ufffe\u0012\ufff8\u0003\ufffb\ufff8\u0000\ufff8\u0005\ufff4\uffff\u0012\u0003\b\ufff5\uffff￼\ufff6\u0012\ufffe\ufff8", 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr23);
        String strIntern12 = ((String) objArr23[0]).intern();
        Object[] objArr24 = new Object[1];
        a("ﴝ᭩ㆄ俌摴芢飂넱쾿\ue5dbȁᢀ㛀伋斻菤頁뚥쳣\ue511\u0378᧮㘔䱍櫵茬饱런찹\uea1d", 58964 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr24);
        SDK_EPHEMERAL_PUBLIC_KEY = new getDeviceData(strIntern12, 11, ((String) objArr24[0]).intern());
        Object[] objArr25 = new Object[1];
        b((Process.myPid() >> 22) + 10, AndroidCharacter.getMirror('0') + 156, true, "\u0011�\ufff6\u0005\ufff6\ufffb\u0011\u0002\u0002\ufff3", View.MeasureSpec.getMode(0) + 4, objArr25);
        String strIntern13 = ((String) objArr25[0]).intern();
        Object[] objArr26 = new Object[1];
        b(18 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Drawable.resolveOpacity(0, 0) + EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, true, "\uffef\u0016\u0016\uffe7\u0011\n\u0019ￆ\n\u000f\u0012\u0007\u001c\u0014\uffefￔ￪", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, objArr26);
        SDK_APP_ID = new getDeviceData(strIntern13, 12, ((String) objArr26[0]).intern());
        Object[] objArr27 = new Object[1];
        b(20 - TextUtils.indexOf("", "", 0, 0), 202 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), true, "\ufff9\ufffa\ufff9\u0006\u0013\uffff\ufff8\u0007\u0006\ufff9\ufff6\u0001\t\u0002\u0013\ufff9\ufff7\u0002\ufff9\u0006", '8' - AndroidCharacter.getMirror('0'), objArr27);
        String strIntern14 = ((String) objArr27[0]).intern();
        Object[] objArr28 = new Object[1];
        a("ﴝ崉뵄ᶬ練\uddc2㰂鰑ﲿ峻볁ἷ罕\udfa5㿻鿛︁幙뺡Ỹ绦\ud90e㥛馣粒姝롔", MotionEvent.axisFromString("") + 41012, objArr28);
        SDK_REFERENCE_NUMBER = new getDeviceData(strIntern14, 13, ((String) objArr28[0]).intern());
        $VALUES = getSDKAppID();
        getSDKAppID = (getSDKReferenceNumber + 51) % 128;
    }

    private getDeviceData(String str, int i11, String str2) {
        super(str, i11);
        this.mErrorMessage = str2;
    }

    static void AuthenticationRequestParameters() {
        getSDKTransactionID = -8519022769953101590L;
        getDeviceData = 1029304855;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:45:0x01c8  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        Throwable cause;
        int i12;
        Object method;
        if (str != null) {
            $11 = ($10 + 115) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = cArr.length;
        long[] jArr = new long[length];
        int i13 = 0;
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i14 = gettransactionstatus.getSDKTransactionID;
            if (i14 >= cArr.length) {
                break;
            }
            char c11 = cArr[i14];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = gettransactionstatus;
                objArr2[1] = gettransactionstatus;
                objArr2[i13] = Integer.valueOf(c11);
                Map map = getMessageVersion.timedout;
                Object obj = map.get(962978490);
                if (obj != null) {
                    i12 = i13;
                    method = obj;
                } else {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(688 - TextUtils.lastIndexOf("", '0'), (char) ((Process.myTid() >> 22) + 16022), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 32);
                    byte b11 = (byte) i13;
                    byte b12 = b11;
                    i12 = i13;
                    Object[] objArr3 = new Object[1];
                    c(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                    map.put(962978490, method);
                }
                jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (getSDKTransactionID ^ (-2227742522694838850L));
                Object[] objArr4 = new Object[2];
                objArr4[1] = gettransactionstatus;
                objArr4[i12] = gettransactionstatus;
                Object method2 = map.get(-46730980);
                if (method2 == null) {
                    int i15 = i12;
                    method2 = ((Class) getMessageVersion.getSDKTransactionID(KeyEvent.normalizeMetaState(i12) + 417, (char) (29017 - (CdmaCellLocation.convertQuartSecToDecDegrees(i12) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i12) == 0.0d ? 0 : -1))), 23 - TextUtils.lastIndexOf("", '0', i15, i15))).getMethod("A", Object.class, Object.class);
                    map.put(-46730980, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                $11 = ($10 + 5) % 128;
                jArr = jArr;
                i13 = 0;
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
        long[] jArr2 = jArr;
        char[] cArr2 = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        $10 = ($11 + 123) % 128;
        while (true) {
            int i16 = gettransactionstatus.getSDKTransactionID;
            if (i16 >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            int i17 = $11 + 35;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                cArr2[i16] = (char) jArr2[i16];
                Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
                Map map2 = getMessageVersion.timedout;
                Object method3 = map2.get(-46730980);
                if (method3 == null) {
                    method3 = ((Class) getMessageVersion.getSDKTransactionID(417 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (29017 - (Process.myPid() >> 22)), 24 - View.MeasureSpec.getSize(0))).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i18 = 9 / 0;
            } else {
                cArr2[i16] = (char) jArr2[i16];
                Object[] objArr6 = {gettransactionstatus, gettransactionstatus};
                Map map3 = getMessageVersion.timedout;
                Object method4 = map3.get(-46730980);
                if (method4 == null) {
                    method4 = ((Class) getMessageVersion.getSDKTransactionID(TextUtils.getTrimmedLength("") + 417, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29017), 24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getMethod("A", Object.class, Object.class);
                    map3.put(-46730980, method4);
                }
                ((Method) method4).invoke(null, objArr6);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b4  */
    private static void b(int i11, int i12, boolean z11, String str, int i13, Object[] objArr) throws Throwable {
        char[] charArray;
        int i14;
        char[] cArr;
        int i15;
        Throwable cause;
        int i16;
        Object method;
        int i17 = 2;
        if (str != null) {
            int i18 = $10 + 109;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr2 = charArray;
        atd.az.getMessageVersion getmessageversion = new atd.az.getMessageVersion();
        char[] cArr3 = new char[i11];
        int i19 = 0;
        getmessageversion.getDeviceData = 0;
        while (true) {
            int i21 = getmessageversion.getDeviceData;
            if (i21 >= i11) {
                break;
            }
            char c11 = cArr2[i21];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i12 + c11);
            cArr3[i21] = c12;
            try {
                Object[] objArr2 = new Object[i17];
                objArr2[1] = Integer.valueOf(getDeviceData);
                objArr2[i19] = Integer.valueOf(c12);
                Map map = getMessageVersion.timedout;
                Object obj = map.get(139968170);
                if (obj != null) {
                    i16 = i19;
                    method = obj;
                } else {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getTouchSlop() >> 8) + 1186, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Color.red(i19) + 46);
                    byte b11 = (byte) i19;
                    i16 = i19;
                    Object[] objArr3 = new Object[1];
                    c((byte) 25, b11, b11, objArr3);
                    String str2 = (String) objArr3[i16];
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(139968170, method);
                }
                cArr3[i21] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = new Object[2];
                objArr4[1] = getmessageversion;
                objArr4[i16] = getmessageversion;
                Object method2 = map.get(-1388326022);
                if (method2 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1720, (char) (48633 - TextUtils.lastIndexOf("", '0')), 'H' - AndroidCharacter.getMirror('0'));
                    int i22 = i16;
                    byte b12 = (byte) i22;
                    Object[] objArr5 = new Object[1];
                    c((byte) 26, b12, b12, objArr5);
                    method2 = cls3.getMethod((String) objArr5[i22], Object.class, Object.class);
                    map.put(-1388326022, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                cArr2 = cArr2;
                i17 = 2;
                i19 = 0;
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
            char[] cArr4 = new char[i11];
            System.arraycopy(cArr3, 0, cArr4, 0, i11);
            int i23 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr4, 0, cArr3, i11 - i23, i23);
            int i24 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr4, i24, cArr3, 0, i11 - i24);
            $10 = ($11 + 101) % 128;
        }
        if (z11) {
            int i25 = $11 + 111;
            $10 = i25 % 128;
            if (i25 % 2 != 0) {
                cArr = new char[i11];
                i14 = 1;
                getmessageversion.getDeviceData = 1;
            } else {
                i14 = 1;
                cArr = new char[i11];
                getmessageversion.getDeviceData = 0;
            }
            while (true) {
                int i26 = getmessageversion.getDeviceData;
                if (i26 >= i11) {
                    break;
                }
                cArr[i26] = cArr3[(i11 - i26) - i14];
                Object[] objArr6 = new Object[2];
                objArr6[i14] = getmessageversion;
                objArr6[0] = getmessageversion;
                Map map2 = getMessageVersion.timedout;
                Object method3 = map2.get(-1388326022);
                if (method3 != null) {
                    i15 = 1;
                } else {
                    Class cls4 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "") + 1721, (char) (48633 - ExpandableListView.getPackedPositionChild(0L)), 24 - TextUtils.getOffsetAfter("", 0));
                    byte b13 = (byte) 0;
                    i15 = 1;
                    Object[] objArr7 = new Object[1];
                    c((byte) 26, b13, b13, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1388326022, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                i14 = i15;
            }
            cArr3 = cArr;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 118 - r6
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r1 = atd.ad.getDeviceData.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r1
            r1 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = r7 + 1
            int r6 = r6 + r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ad.getDeviceData.c(byte, byte, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ getDeviceData[] getSDKAppID() {
        int i11 = getSDKReferenceNumber;
        getDeviceData[] getdevicedataArr = {APPLICATION_CONTEXT, CONFIG_PARAMETERS, LOCALE, DIRECTORY_SERVER_ID, MESSAGE_VERSION, CURRENT_ACTIVITY, CHALLENGE_PARAMETERS, CHALLENGE_STATUS_RECEIVER, TIMEOUT, SDK_TRANSACTION_ID, DEVICE_DATA, SDK_EPHEMERAL_PUBLIC_KEY, SDK_APP_ID, SDK_REFERENCE_NUMBER};
        getSDKAppID = (i11 + 91) % 128;
        return getdevicedataArr;
    }

    static void init$0() {
        $$a = new byte[]{86, -59, -39, 110};
        $$b = 128;
    }

    public static getDeviceData valueOf(String str) {
        int i11 = getSDKReferenceNumber + 117;
        getSDKAppID = i11 % 128;
        int i12 = i11 % 2;
        getDeviceData getdevicedata = (getDeviceData) Enum.valueOf(getDeviceData.class, str);
        if (i12 != 0) {
            int i13 = 6 / 0;
        }
        getSDKAppID = (getSDKReferenceNumber + 69) % 128;
        return getdevicedata;
    }

    public static getDeviceData[] values() throws CloneNotSupportedException {
        int i11 = getSDKAppID + 41;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return (getDeviceData[]) $VALUES.clone();
        }
        $VALUES.clone();
        throw null;
    }

    public final InvalidInputException getDeviceData() {
        getSDKReferenceNumber = (getSDKAppID + 79) % 128;
        InvalidInputException sDKTransactionID = getSDKTransactionID();
        int i11 = getSDKReferenceNumber + 121;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 44 / 0;
        }
        return sDKTransactionID;
    }

    public final InvalidInputException getSDKTransactionID() {
        InvalidInputException invalidInputException = new InvalidInputException(this.mErrorMessage, null);
        int i11 = getSDKReferenceNumber + 79;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 0 / 0;
        }
        return invalidInputException;
    }
}
