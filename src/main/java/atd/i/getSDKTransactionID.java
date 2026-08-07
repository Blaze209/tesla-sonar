package atd.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.ChallengeStatusHandler;
import atd.az.getMessageVersion;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0080\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;", "", "errorCode", "", "errorDescription", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorDescription", "MESSAGE_RECEIVED_INVALID", "MESSAGE_VERSION_NOT_SUPPORTED", "DATA_ELEMENT_MISSING", "MESSAGE_EXTENSION_MISSING", "DATA_ELEMENT_INVALID_FORMAT", "DUPLICATE_DATA_ELEMENT", "TRANSACTION_ID_NOT_RECOGNIZED", "DATA_DECRYPTION_FAILURE", "ACCESS_DENIED", "ISO_CODE_INVALID", "TRANSACTION_TIMED_OUT", "TRANSIENT_SYSTEM_FAILURE", "SYSTEM_CONNECTION_FAILURE", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ getSDKTransactionID[] $VALUES;
    private static getSDKTransactionID ACCESS_DENIED;
    private static char AuthenticationRequestParameters;
    private static String COMPONENT;
    private static int ChallengeResult;
    private static AuthenticationRequestParameters Companion;
    public static final getSDKTransactionID DATA_DECRYPTION_FAILURE;
    public static final getSDKTransactionID DATA_ELEMENT_INVALID_FORMAT;
    public static final getSDKTransactionID DATA_ELEMENT_MISSING;
    private static getSDKTransactionID DUPLICATE_DATA_ELEMENT;
    private static getSDKTransactionID ISO_CODE_INVALID;
    public static final getSDKTransactionID MESSAGE_EXTENSION_MISSING;
    public static final getSDKTransactionID MESSAGE_RECEIVED_INVALID;
    public static final getSDKTransactionID MESSAGE_VERSION_NOT_SUPPORTED;
    public static final getSDKTransactionID SYSTEM_CONNECTION_FAILURE;
    public static final getSDKTransactionID TRANSACTION_ID_NOT_RECOGNIZED;
    public static final getSDKTransactionID TRANSACTION_TIMED_OUT;
    private static getSDKTransactionID TRANSIENT_SYSTEM_FAILURE;
    private static String TYPE;
    private static char getDeviceData;
    private static char getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final String errorCode;
    private final String errorDescription;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType$Companion;", "", "<init>", "()V", "COMPONENT", "", "TYPE", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        getSDKEphemeralPublicKey = 1;
        AuthenticationRequestParameters();
        Color.blue(0);
        Color.blue(0);
        SystemClock.elapsedRealtime();
        AudioTrack.getMinVolume();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getWindowTouchSlop() >> 8) + 155, false, 24 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), "\ufff9\u0014\ufffe\u0003\u000b\ufff6\u0001\ufffe\ufff9\u0002\ufffa\b\b\ufff6￼\ufffa\u0014\u0007\ufffa\ufff8\ufffa\ufffe\u000b\ufffa", Color.blue(0) + 9, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b("溜ޕ淥灘", 3 - View.resolveSize(0, 0), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(TextUtils.indexOf("", "", 0, 0) + 173, true, 25 - Color.alpha(0), "\b\ufff5ￃ\b\n\u0004\u0016\u0016\b\ufff0\uffd1\u0007\f\u000f\u0004\u0019\u0011￬ￃ\u0007\b\u0019\f\b\u0006", (KeyEvent.getMaxKeyCode() >> 16) + 10, objArr3);
        MESSAGE_RECEIVED_INVALID = new getSDKTransactionID(strIntern, 0, strIntern2, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        b("卻เ掁弬\uf1f5덎朡ꂟ퀤偔Ო\udae9䜍讌ส뫮币澺獁\u1976\ue80b\ufb11蠋\uf2ac獢Ὗ⽣쯫♴➹", 29 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
        String strIntern3 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        b("溜ޕ¦⍎", 3 - View.resolveSizeAndState(0, 0, 0), objArr5);
        String strIntern4 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        b("Ꞛᮆ髲ۿ칗\uab1d\uec11퓀\ueeb7뒊\uec53♌呥ڝ鍩Ǝ\uf52b匮笡\uddec\uedbc\uf414ဇ꾇Ꮟ爄셛锳ꥨ⎲檤캽跩Ⰾ濬퓍扩恘", Color.blue(0) + 37, objArr6);
        MESSAGE_VERSION_NOT_SUPPORTED = new getSDKTransactionID(strIntern3, 1, strIntern4, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a(TextUtils.indexOf("", "", 0, 0) + 156, true, View.MeasureSpec.getSize(0) + 20, "�\u0007\u0007�\u0001\u0013\b\u0002\ufff9\u0001\ufff9\u0000\ufff9\u0013\ufff5\b\ufff5\ufff8\ufffb\u0002", 18 - TextUtils.indexOf("", "", 0, 0), objArr7);
        String strIntern5 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(129 - (ViewConfiguration.getTouchSlop() >> 8), true, 3 - View.resolveSize(0, 0), "\u0000\uffff\u0001", 3 - View.MeasureSpec.getMode(0), objArr8);
        String strIntern6 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        a(Color.rgb(0, 0, 0) + 16777389, true, 30 - Gravity.getAbsoluteGravity(0, 0), "\ufff0ￃ\u0017\u0011\b\u0010\b\u000f￨ￃ\u0004\u0017\u0004\uffe7ￃ\u0007\b\u0015\f\u0018\u0014\b\ufff5\uffd1\n\u0011\f\u0016\u0016\f", 23 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr9);
        DATA_ELEMENT_MISSING = new getSDKTransactionID(strIntern5, 2, strIntern6, ((String) objArr9[0]).intern());
        Object[] objArr10 = new Object[1];
        a(157 - Color.argb(0, 0, 0, 0), false, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24, "\u0001\u0012\u0000￼\u0006\u0006￼\u0001\ufffa\u0000\ufff8\u0006\u0006\ufff4\ufffa\ufff8\u0012\ufff8\u000b\u0007\ufff8\u0001\u0006￼\u0002", 9 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr10);
        String strIntern7 = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        b("佯뜕¦⍎", 3 - TextUtils.indexOf("", "", 0), objArr11);
        String strIntern8 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a(173 - TextUtils.indexOf((CharSequence) "", '0', 0), false, 42 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0007ￂ\uffe7\u001a\u0016\u0007\u0010\u0015\u000b\u0011\u0010ￂ\ufff0\u0011\u0016ￂ\ufff4\u0007\u0005\u0011\t\u0010\u000b\u0015\u0007\u0006\uffd0￥\u0014\u000b\u0016\u000b\u0005\u0003\u000eￂ\uffef\u0007\u0015\u0015\u0003\t", MotionEvent.axisFromString("") + 28, objArr12);
        MESSAGE_EXTENSION_MISSING = new getSDKTransactionID(strIntern7, 3, strIntern8, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L) + 156, true, TextUtils.lastIndexOf("", '0', 0) + 28, "\ufff8\b\ufff5\u0001\u0006\u0003\ufffa\u0013\ufff8�\u0000\ufff5\n\u0002�\u0013\b\u0002\ufff9\u0001\ufff9\u0000\ufff9\u0013\ufff5\b\ufff5", 1 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr13);
        String strIntern9 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a(View.resolveSize(0, 0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, false, 4 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0001\uffff\u0002", 3 - (ViewConfiguration.getTapTimeout() >> 16), objArr14);
        String strIntern10 = ((String) objArr14[0]).intern();
        Object[] objArr15 = new Object[1];
        a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 169, true, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 47, "\u001a\u0014\u000b\u0013\u000b\u0012￫ￆ\u0007\u001a\u0007￪ￆ\u000b\u0018\u0015\u0013ￆ\u0018\u0015ￆ\u000b\u0014\u0015ￆ\f\u0015ￆ\u001a\u0007\u0013\u0018\u0015￬ￔ\n\u000f\u0012\u0007\u001c\u0014\uffefￆ\u0019\u000fￆ\u0019", 35 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr15);
        DATA_ELEMENT_INVALID_FORMAT = new getSDKTransactionID(strIntern9, 4, strIntern10, ((String) objArr15[0]).intern());
        Object[] objArr16 = new Object[1];
        b("Ⲫ薂\uf7e1餵㢣ａ季困朡ꂟ펜蕸傴⛬傼㡡ㅴ囙卻เ奘\uefa7", 22 - TextUtils.getOffsetBefore("", 0), objArr16);
        String strIntern11 = ((String) objArr16[0]).intern();
        Object[] objArr17 = new Object[1];
        a(130 - (ViewConfiguration.getJumpTapTimeout() >> 16), false, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, "\ufffe\u0002\u0000", 2 - View.combineMeasuredStates(0, 0), objArr17);
        String strIntern12 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        a(172 - TextUtils.indexOf("", "", 0), true, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23, "\u0011\t\u0010￩ￄ\u0005\u0018\u0005￨ￄ\t\u0018\u0005\u0007\r\u0010\u0014\u0019￨ￒ\u0018\u0012\t", TextUtils.lastIndexOf("", '0', 0, 0) + 20, objArr18);
        DUPLICATE_DATA_ELEMENT = new getSDKTransactionID(strIntern11, 5, strIntern12, ((String) objArr18[0]).intern());
        Object[] objArr19 = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 158, true, 29 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0001\u0002￼\u0007\ufff6\ufff4\u0006\u0001\ufff4\u0005\u0007\ufff7\ufff8\r￼\u0001\ufffa\u0002\ufff6\ufff8\u0005\u0012\u0007\u0002\u0001\u0012\ufff7￼\u0012", (ViewConfiguration.getLongPressTimeout() >> 16) + 11, objArr19);
        String strIntern13 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, true, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3, "\uffff\u0002\u0000", ExpandableListView.getPackedPositionChild(0L) + 3, objArr20);
        String strIntern14 = ((String) objArr20[0]).intern();
        Object[] objArr21 = new Object[1];
        b("덤댋뜠槜紨蕛鄺刌呥ڝ鍩Ǝ좄鷱ဇ꾇Ꮟ爄걼溼\uee61쐩梼粒샢ꋴ읯⁈ⳮ簭", 30 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr21);
        TRANSACTION_ID_NOT_RECOGNIZED = new getSDKTransactionID(strIntern13, 6, strIntern14, ((String) objArr21[0]).intern());
        Object[] objArr22 = new Object[1];
        b("펜蕸傴⛬ṃ童푄괍\u2b75\uf3b1ዊ沰䜍讌ส뫮青䲽䞳镧᭴殀\udb6d讛", View.getDefaultSize(0, 0) + 23, objArr22);
        String strIntern15 = ((String) objArr22[0]).intern();
        Object[] objArr23 = new Object[1];
        b("\uef79㷂¦⍎", KeyEvent.keyCodeFromString("") + 3, objArr23);
        String strIntern16 = ((String) objArr23[0]).intern();
        Object[] objArr24 = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 175, true, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24, "\u000b\u0016\u0012\u001b\u0014\u0005\u0007￦ￂ\u0003\u0016\u0003￦\uffd0\u0007\u0014\u0017\u000e\u000b\u0003￨ￂ\u0010\u0011", 14 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr24);
        DATA_DECRYPTION_FAILURE = new getSDKTransactionID(strIntern15, 7, strIntern16, ((String) objArr24[0]).intern());
        Object[] objArr25 = new Object[1];
        b("\ud994뭉甯\uecb2掁弬ṃ童㣯곋㗴꟏♴➹", Drawable.resolveOpacity(0, 0) + 13, objArr25);
        String strIntern17 = ((String) objArr25[0]).intern();
        Object[] objArr26 = new Object[1];
        a(KeyEvent.normalizeMetaState(0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, true, TextUtils.getOffsetAfter("", 0) + 3, "\u0001\ufffe\u0001", 3 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr26);
        String strIntern18 = ((String) objArr26[0]).intern();
        Object[] objArr27 = new Object[1];
        b("삧寬᠄㟂髲ۿ켱\udbf3鬧烦\u19cc跒㭹ᣝ䧊冄\ue783猉㧚㯛㲑៛⍯\uda49䚆岀檤캽ᖥ濹誓ᑚ", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 32, objArr27);
        ACCESS_DENIED = new getSDKTransactionID(strIntern17, 8, strIntern18, ((String) objArr27[0]).intern());
        Object[] objArr28 = new Object[1];
        b("辖\uf87aᘸ鄃ᬇ\ue6bb엫呎癏锷奿洇\ueffe촞좄鷱", 16 - View.MeasureSpec.getSize(0), objArr28);
        String strIntern19 = ((String) objArr28[0]).intern();
        Object[] objArr29 = new Object[1];
        b("\uef79㷂氃\uf3ba", TextUtils.getTrimmedLength("") + 3, objArr29);
        String strIntern20 = ((String) objArr29[0]).intern();
        Object[] objArr30 = new Object[1];
        a(164 - TextUtils.indexOf("", "", 0), true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17, "\ufff5ￌ\u0011\u0010\u001b\uffefￌ\ufffb\uffff\ufff5ￚ\u0010\u0015\u0018\r\"\u001a", 11 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr30);
        ISO_CODE_INVALID = new getSDKTransactionID(strIntern19, 9, strIntern20, ((String) objArr30[0]).intern());
        Object[] objArr31 = new Object[1];
        b("\uf7ba哤嶋䋨瓑腁䢤⬻䜍讌ส뫮\ue27f\ueb31卻เꘐ♎થ\ue42e\ue6ba稰", TextUtils.getTrimmedLength("") + 21, objArr31);
        String strIntern21 = ((String) objArr31[0]).intern();
        Object[] objArr32 = new Object[1];
        a(130 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), false, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3, "\ufffe\u0000\u0002", 2 - TextUtils.indexOf("", "", 0, 0), objArr32);
        String strIntern22 = ((String) objArr32[0]).intern();
        Object[] objArr33 = new Object[1];
        b("덤댋뜠槜紨蕛鄺刌呥ڝ鍩Ǝᣪ痜\ue3b9\ue970㽱농\u187fﴮ誓ᑚ", (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 22, objArr33);
        TRANSACTION_TIMED_OUT = new getSDKTransactionID(strIntern21, 10, strIntern22, ((String) objArr33[0]).intern());
        Object[] objArr34 = new Object[1];
        b("\uf7ba哤嶋䋨ࡵ迴㣯곋獁\u1976믆㬴ꉱ㿷睍芒㜐쾓ɟ㑫虰툓篕跤", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23, objArr34);
        String strIntern23 = ((String) objArr34[0]).intern();
        Object[] objArr35 = new Object[1];
        b("阢冣\ue2bc끛", ImageFormat.getBitsPerPixel(0) + 4, objArr35);
        String strIntern24 = ((String) objArr35[0]).intern();
        Object[] objArr36 = new Object[1];
        b("덤댋뜠槜裛懥鬧烦꩓郺㓪鼢蠣餒完祿\ufaf7챡拷쾽䫸꩓ᘣ膪扩恘", TextUtils.getTrimmedLength("") + 25, objArr36);
        TRANSIENT_SYSTEM_FAILURE = new getSDKTransactionID(strIntern23, 11, strIntern24, ((String) objArr36[0]).intern());
        Object[] objArr37 = new Object[1];
        b("믆㬴ꉱ㿷睍芒娉彋ꂰ\ue014울᭯䢤⬻䜍讌ส뫮青䲽䞳镧᭴殀\udb6d讛", 25 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr37);
        String strIntern25 = ((String) objArr37[0]).intern();
        Object[] objArr38 = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 131, true, 3 - ((Process.getThreadPriority(0) + 20) >> 6), "�\u0001\u0002", (ViewConfiguration.getFadingEdgeLength() >> 16) + 2, objArr38);
        String strIntern26 = ((String) objArr38[0]).intern();
        Object[] objArr39 = new Object[1];
        a(KeyEvent.keyCodeFromString("") + 178, true, 25 - ExpandableListView.getPackedPositionType(0L), "\u0017\ufff1\u0003\u0010\u0013\n\u0007\uffff￤ﾾ\f\r\u0007\u0012\u0001\u0003\f\f\r￡ﾾ\u000b\u0003\u0012\u0011", 2 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr39);
        SYSTEM_CONNECTION_FAILURE = new getSDKTransactionID(strIntern25, 12, strIntern26, ((String) objArr39[0]).intern());
        getSDKTransactionID[] sDKAppID = getSDKAppID();
        $VALUES = sDKAppID;
        a.a(sDKAppID);
        new AuthenticationRequestParameters((byte) 0);
        ChallengeResult = (getSDKEphemeralPublicKey + 13) % 128;
    }

    private getSDKTransactionID(String str, int i11, String str2, String str3) {
        super(str, i11);
        this.errorCode = str2;
        this.errorDescription = str3;
    }

    static void AuthenticationRequestParameters() {
        getSDKTransactionID = 1029304889;
        getSDKReferenceNumber = (char) 35244;
        AuthenticationRequestParameters = (char) 61215;
        getSDKAppID = (char) 15281;
        getDeviceData = (char) 51481;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x021e  */
    /* JADX WARN: Code duplicated, block: B:52:0x021f  */
    private static void a(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] cArr;
        Throwable cause;
        Object method;
        int i14 = ($10 + 47) % 128;
        $11 = i14;
        if (str != null) {
            $10 = (i14 + 35) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr2 = charArray;
        getMessageVersion getmessageversion = new getMessageVersion();
        char[] cArr3 = new char[i12];
        int i15 = 0;
        getmessageversion.getDeviceData = 0;
        while (true) {
            int i16 = getmessageversion.getDeviceData;
            if (i16 >= i12) {
                break;
            }
            char c11 = cArr2[i16];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i11 + c11);
            cArr3[i16] = c12;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(getSDKTransactionID);
                objArr2[i15] = Integer.valueOf(c12);
                Map map = atd.a.getMessageVersion.timedout;
                Object obj = map.get(139968170);
                if (obj != null) {
                    method = obj;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1185, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 46 - Gravity.getAbsoluteGravity(i15, i15));
                    byte b11 = (byte) 0;
                    Object[] objArr3 = new Object[1];
                    c((byte) 24, b11, b11, objArr3);
                    String str2 = (String) objArr3[0];
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(139968170, method);
                }
                cArr3[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getmessageversion, getmessageversion};
                Object method2 = map.get(-1388326022);
                if (method2 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1721 - TextUtils.getOffsetAfter("", 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 48635), TextUtils.getCapsMode("", 0, 0) + 24);
                    byte b12 = (byte) 0;
                    Object[] objArr5 = new Object[1];
                    c((byte) 25, b12, b12, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(-1388326022, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                cArr2 = cArr2;
                i15 = 0;
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
            $10 = ($11 + 57) % 128;
            getmessageversion.getSDKReferenceNumber = i13;
            char[] cArr4 = new char[i12];
            System.arraycopy(cArr3, 0, cArr4, 0, i12);
            int i17 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr4, 0, cArr3, i12 - i17, i17);
            int i18 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr4, i18, cArr3, 0, i12 - i18);
        }
        if (z11) {
            int i19 = $10 + 103;
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                cArr = new char[i12];
                getmessageversion.getDeviceData = 1;
            } else {
                cArr = new char[i12];
                getmessageversion.getDeviceData = 0;
            }
            while (true) {
                int i21 = getmessageversion.getDeviceData;
                if (i21 >= i12) {
                    break;
                }
                int i22 = $10 + 59;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = i12 % i21;
                    cArr[i21] = cArr3[0];
                    Object[] objArr6 = {getmessageversion, getmessageversion};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method3 = map2.get(-1388326022);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ImageFormat.getBitsPerPixel(0) + 1722, (char) (48633 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23);
                        byte b13 = (byte) 0;
                        Object[] objArr7 = new Object[1];
                        c((byte) 25, b13, b13, objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                        map2.put(-1388326022, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
                } else {
                    cArr[i21] = cArr3[(i12 - i21) - 1];
                    Object[] objArr8 = {getmessageversion, getmessageversion};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method4 = map3.get(-1388326022);
                    if (method4 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1720, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 48634), 24 - ExpandableListView.getPackedPositionType(0L));
                        byte b14 = (byte) 0;
                        Object[] objArr9 = new Object[1];
                        c((byte) 25, b14, b14, objArr9);
                        method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                        map3.put(-1388326022, method4);
                    }
                    ((Method) method4).invoke(null, objArr8);
                }
            }
            cArr3 = cArr;
        }
        objArr[0] = new String(cArr3);
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        int i12;
        int i13 = $11 + 59;
        $10 = i13 % 128;
        int i14 = 2;
        if (i13 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
        char[] cArr = new char[charArray.length];
        int i15 = 0;
        challengeStatusHandler.getSDKReferenceNumber = 0;
        char[] cArr2 = new char[2];
        $11 = ($10 + 79) % 128;
        while (true) {
            int i16 = challengeStatusHandler.getSDKReferenceNumber;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i11);
                return;
            }
            int i17 = $10 + 37;
            $11 = i17 % 128;
            int i18 = 58224;
            char c11 = 1;
            if (i17 % i14 == 0) {
                cArr2[i15] = charArray[i16];
                cArr2[i15] = charArray[i16];
                i12 = 1;
            } else {
                cArr2[i15] = charArray[i16];
                cArr2[1] = charArray[i16 + 1];
                i12 = i15;
            }
            while (i12 < 16) {
                $11 = ($10 + 97) % 128;
                char c12 = cArr2[c11];
                char c13 = cArr2[i15];
                int i19 = (c13 + i18) ^ ((c13 << 4) + ((char) (((long) getSDKAppID) ^ (-2881362678149017980L))));
                int i21 = c13 >>> 5;
                int i22 = i15;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getDeviceData);
                    objArr2[i14] = Integer.valueOf(i21);
                    objArr2[c11] = Integer.valueOf(i19);
                    objArr2[i22] = Integer.valueOf(c12);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    Class cls = Integer.TYPE;
                    if (method == null) {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1745, (char) (16683 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 29 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        byte b11 = (byte) i14;
                        byte b12 = (byte) (b11 - 2);
                        Object[] objArr3 = new Object[1];
                        c(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[i22], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    char c14 = cArr2[i22];
                    int i23 = (cCharValue + i18) ^ ((cCharValue << 4) + ((char) (((long) getSDKReferenceNumber) ^ (-2881362678149017980L))));
                    int i24 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(AuthenticationRequestParameters);
                    objArr4[i14] = Integer.valueOf(i24);
                    objArr4[1] = Integer.valueOf(i23);
                    objArr4[i22] = Integer.valueOf(c14);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - KeyEvent.getDeadChar(i22, i22), (char) (16682 - (Process.myPid() >> 22)), 29 - Color.blue(i22));
                        byte b13 = (byte) i14;
                        byte b14 = (byte) (b13 - 2);
                        Object[] objArr5 = new Object[1];
                        c(b13, b14, b14, objArr5);
                        method2 = cls3.getMethod((String) objArr5[0], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i18 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i12++;
                    charArray = charArray;
                    cArr2 = cArr2;
                    i14 = 2;
                    i15 = 0;
                    c11 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr3 = charArray;
            char[] cArr4 = cArr2;
            int i25 = challengeStatusHandler.getSDKReferenceNumber;
            cArr[i25] = cArr4[0];
            cArr[i25 + 1] = cArr4[1];
            Object[] objArr6 = {challengeStatusHandler, challengeStatusHandler};
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 == null) {
                Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(((Process.getThreadPriority(0) + 20) >> 6) + 1596, (char) (View.combineMeasuredStates(0, 0) + 27824), 26 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                byte b15 = (byte) 0;
                byte b16 = b15;
                Object[] objArr7 = new Object[1];
                c(b15, b16, b16, objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            $11 = ($10 + 47) % 128;
            i14 = 2;
            charArray = cArr3;
            cArr2 = cArr4;
            i15 = 0;
        }
    }

    private static void c(byte b11, byte b12, byte b13, Object[] objArr) {
        int i11 = 116 - (b11 * 2);
        int i12 = b13 * 2;
        int i13 = 3 - (b12 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i12 + 1];
        int i14 = -1;
        if (bArr == null) {
            int i15 = i13 + (-i12);
            i13 = i13;
            i11 = i15;
        }
        while (true) {
            int i16 = i13 + 1;
            i14++;
            bArr2[i14] = (byte) i11;
            if (i14 == i12) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i13 = i16;
            i11 += -bArr[i16];
        }
    }

    private static final /* synthetic */ getSDKTransactionID[] getSDKAppID() {
        int i11 = (getSDKEphemeralPublicKey + 5) % 128;
        ChallengeResult = i11;
        getSDKTransactionID[] getsdktransactionidArr = {MESSAGE_RECEIVED_INVALID, MESSAGE_VERSION_NOT_SUPPORTED, DATA_ELEMENT_MISSING, MESSAGE_EXTENSION_MISSING, DATA_ELEMENT_INVALID_FORMAT, DUPLICATE_DATA_ELEMENT, TRANSACTION_ID_NOT_RECOGNIZED, DATA_DECRYPTION_FAILURE, ACCESS_DENIED, ISO_CODE_INVALID, TRANSACTION_TIMED_OUT, TRANSIENT_SYSTEM_FAILURE, SYSTEM_CONNECTION_FAILURE};
        int i12 = i11 + 33;
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 != 0) {
            return getsdktransactionidArr;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{8, 93, 113, 60};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE;
    }

    public static getSDKTransactionID valueOf(String str) {
        getSDKEphemeralPublicKey = (ChallengeResult + 65) % 128;
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) Enum.valueOf(getSDKTransactionID.class, str);
        ChallengeResult = (getSDKEphemeralPublicKey + 125) % 128;
        return getsdktransactionid;
    }

    public static getSDKTransactionID[] values() {
        ChallengeResult = (getSDKEphemeralPublicKey + 43) % 128;
        getSDKTransactionID[] getsdktransactionidArr = (getSDKTransactionID[]) $VALUES.clone();
        ChallengeResult = (getSDKEphemeralPublicKey + 15) % 128;
        return getsdktransactionidArr;
    }

    public final String getDeviceData() {
        String str;
        int i11 = ChallengeResult + 5;
        int i12 = i11 % 128;
        getSDKEphemeralPublicKey = i12;
        if (i11 % 2 == 0) {
            str = this.errorDescription;
            int i13 = 71 / 0;
        } else {
            str = this.errorDescription;
        }
        ChallengeResult = (i12 + 111) % 128;
        return str;
    }

    public final String getSDKReferenceNumber() {
        int i11 = ChallengeResult + 73;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            return this.errorCode;
        }
        throw null;
    }
}
