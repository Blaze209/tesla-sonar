package atd.h;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import atd.aa.ChallengeResultError;
import atd.aa.cancelled;
import atd.l.getSDKEphemeralPublicKey;
import atd.l.timedout;
import atd.m.BuildConfig;
import atd.m.CompletionEvent;
import atd.r.ChallengeResult;
import atd.r.ChallengeResultCancelled;
import atd.v.ChallengeStatusHandler;
import atd.v.ChallengeStatusReceiver;
import atd.v.getTransactionStatus;
import atd.w.ChallengeResultCompleted;
import atd.w.ChallengeResultTimeout;
import atd.w.ErrorMessage;
import atd.w.InitializeResult;
import atd.w.InitializeResultFailure;
import atd.w.completed;
import atd.w.getErrorCode;
import atd.w.getErrorDescription;
import atd.w.getErrorDetails;
import atd.w.getTransactionID;
import atd.w.hashCode;
import atd.w.onCompletion;
import atd.w.protocolError;
import atd.w.runtimeError;
import atd.w.toString;
import atd.x.ChallengeResultKt;
import atd.x.getAdditionalDetails;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.http2.Http2Connection;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J+\u0010\u0013\u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J+\u0010\u0014\u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J#\u0010\u0015\u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J+\u0010\u0018\u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J+\u0010\u0019\u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0011J+\u0010\u001a\u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0011J+\u0010\u001b\u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0011J#\u0010\u001c\u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0016J+\u0010\u001d\u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u0011J+\u0010\u001e\u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J#\u0010\u001f\u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0016J+\u0010 \u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010\u0011J=\u0010%\u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000e2\n\u0010!\u001a\u00060\u0003j\u0002`\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u000b*\u00060\u0003j\u0002`\u0004H\u0002¢\u0006\u0004\b'\u0010(J+\u0010)\u001a\u00020\u000f*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*¨\u0006+"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceParametersDataVersion16;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameters;", "", "", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/Identifier;", "restrictedParameters", "<init>", "(Ljava/util/Collection;)V", "Landroid/app/Application;", Kind.APPLICATION, "", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "get", "(Landroid/app/Application;)Ljava/util/Map;", "", "Ljn0/h0;", "addCommonParameters", "(Ljava/util/Map;Landroid/app/Application;)V", "addTelephonyParameters", "addWifiParameters", "addBluetoothParameters", "addBuildParameters", "(Ljava/util/Map;)V", "addBuildVersionParameters", "addSettingsSecureParameters", "addSettingsGlobalParameters", "addSettingsSystemParameters", "addPackageManagerParameters", "addEnvironmentParameters", "addLocaleParameters", "addDisplayMetricsParameters", "addStatsFsParameters", "addWebViewParameters", "identifier", "Lkotlin/Function0;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "parameter", "addFor", "(Ljava/util/Map;Ljava/lang/String;Lwn0/a;)V", "getRestrictedFailureResultOrNull", "(Ljava/lang/String;)Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "addLocationResults", "Ljava/util/Collection;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getMessageVersion {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static char[] getDeviceData;
    private static long getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final Collection<String> getSDKAppID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        AuthenticationRequestParameters = 1;
        char[] cArr = new char[684];
        ByteBuffer.wrap("¶sS\u001e|<\u0019[\u0000;åVÊt¯\u0010\u001a\u001aÿwÐUµ0\u0000;åVÊt¯\u0016oF\u008a+¥\tÀj\u0000;åVÊt¯\u0014\u0015\nðgßEº+Â\u0087'ê\bÈm§\u0000;åVÊu¯\u0012\u0003\u001færÉQ¬5Ëä.\u0089\u0001ªdÉ\u0000;åVÊu¯\u0017\u008dùh\u0094G·\"Ö\u0000;åVÊu¯\u0015\u0000;åVÊu¯\u001ao\u0000\u008ao¥MÀ*\u00009åVÊt¯\u0010\u00009åVÊt¯\u0011Xé½\u0086\u0092¤÷ÆsÏ\u0096 ¹\u0082Üá\u0017\u0093òüÝÞ¸¾¢]G2h\u0010\rq\u00009åVÊt¯\u001a\u00009åVÊt¯\u001bá`\u0004\u000f+,NK¯\u008dJâeÁ\u0000§8HÝ'ò\u0004\u0097a\u00009åVÊu¯\u0011\u00009åVÊu¯\u0016\u00009åVÊu¯\u0017ÜH9'\u0016\u0004se\u00009åVÊu¯\u0015,ìÉ\u0083æ \u0083Ïº{_\u0014p7\u0015Yè¼\rÓ\"óG\u0097\u00009åVÊv¯\u0013¡æD\u0089k©\u000eÏ\u00009åVÊv¯\u0011\u00009åVÊv¯\u0016¯VJ9e\u0019\u0000xºz_\u0015p5\u0015W\u00009åVÊv¯\u0015\u00009åWÊw¯\u001a\u00009åWÊw¯\u001b\u0010[õ5Ú\u0012¿pgN\u0082 \u00ad\u0007Èd\u0000³åÝÊú¯\u009aÅL \"\u000f\u0005jd\u008c$iJFm#\nò\t\u0017f8F]*\u00009åVÊv¯\u001b³NV!y\u0000\u001ce\u00009åVÊw¯\u0013\u0003<æSÉr¬\u0015ª¯OÀ`á\u0005\u0087\u009cÿy\u0090V±3Ðþ/\u001b@4aQ\u0001\u00009åVÊw¯\u0014´\bQg~F\u001b$\u00009åVÊw¯\u001a\u00009åWÊp¯\u0014\u00009åWÊp¯\u0015\u00954pZ_}:\u0017\u0006Sã<Ì\u001d©qê·\u000fØ þE\u009cØ©=Ç\u0012àw\u008b«:NUas\u0004\u00100qÕ\u001eú8\u009fX\u00009åVÊp¯\u0011\u00009åVÊp¯\u0016~A\u009b.´\bÑo\u00009åVÊp¯\u0014g\u00ad\u0082Â\u00adäÈ\u0081\u00009åVÊp¯\u001aÜ\u007f9\u0010\u00166s]\u0001Aä.Ë\t®j\u00009åVÊq¯\u0013vw\u0093\u0018¼?Ù^\u00009åVÊq¯\u0011\u00009åWÊq¯\u0011\u00009åWÊq¯\u0016\u00009åWÊq¯\u0017\u00009åVÊq¯\u0016\u00009åVÊq¯\u0017ì}\t\u0012&5CP\u00009åVÊq¯\u0015@Þ¥±\u008a\u0096ïýëv\u000e\u0019!>DTÛÜ>³\u0011\u0097t÷\u00009åVÊr¯\u0013\u00009åVÊr¯\u0010\u00009åVÊr¯\u0011\u00009åVÊr¯\u0016\u00009åVÊr¯\u0017\u00009åVÊr¯\u0014\u0013~ö\u0011Ù5¼RñO\u0014 ;\u0004^luâ\u0090\u008d¿©ÚÀ\u00009åVÊs¯\u0013u`\u0090\u000f¿*ÚH\u00009åVÊs¯\u0016\u00009åVÊs¯\u0017bV\u00879¨\u001cÍ{\u00009åVÊs¯\u0015\u00009åVÊs¯\u001a\u00009åVÊs¯\u001b\u00009åVÊ|¯\u0012\u0003>æQÉ{¬\u0014\u00009åVÊ|¯\u0010\u00009åVÊ|¯\u0011\u00009åWÊq¯\u0012Pwµ\u0019\u009a?ÿ]\u00009åVÊ|¯\u0016\b¤íËÂá§\u008a\u00009åVÊ|¯\u0014´¶QÙ~ó\u001b\u009a\u00009åVÊ|¯\u001a\u00009åVÊ|¯\u001b\u00009åVÊs¯\u0012\u0003\u009aæõÉÞ¬±\u00009åVÊs¯\u0010\u00009åVÊ}¯\u0013Á\u001a$u\u000b^n3à}\u0005\u0012*9OU\raè\u000eÇ%¢NÂ\u0085'ê\bÁm«\u001f\u0007úhÕC°*a\u009e\u0084ñ«ÚÎ²\u00009åVÊ}¯\u001aÄF!(\u000e\u000eko\u0094¹qÖ^ý;\u009b\u00009åWÊt¯\u0012\u00009åWÊt¯\u0013þø\u001b\u00964µQÑ·+RE}f\u0018\u0003\u00009åWÊt¯\u0016@|¥\u0012\u008a1ïR\u00009åWÊt¯\u0014\u00009åWÊt¯\u0015\u00009åWÊt¯\u001aÑm4\u0003\u001b ~O\u00009åWÊu¯\u0012\u00009åWÊu¯\u0013U¡°Ï\u009fíú\u0088\u00009åWÊu¯\u0011\u0082Bg,H\u000e-m\u00009åWÊu¯\u0017xã\u009d\u008d²¯×Î\u00009åWÊu¯\u0015\u009d\u007fx\u0011W32\\\u00009åWÊu¯\u001b\u00009åWÊv¯\u0012\u00009åWÊv¯\u0013\u0012v÷\u0018Ø9½_c\u0016\u0086x©YÌ>êu\u000f\u001b :EZª\nOd`E\u0005$$,ÁBîc\u008b\u0001¢ÈG¦h\u0087\räÙ·<Ù\u0013øv\u0094NØ«¶\u0084\u0097áúàö\u0005\u0098*¸OÝ\u00009åWÊw¯\u0013\u0000\u0016åxÊX¯?\u00009åWÊw¯\u0011\u00009åWÊw¯\u0016\u00009åWÊw¯\u0017\u00009åWÊw¯\u0014\u00009åWÊw¯\u0015\u0000;åVÊu¯\u0013 ZE7j\u0014\u000fq".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 684);
        getDeviceData = cArr;
        getSDKReferenceNumber = 684765403477697894L;
    }

    public getMessageVersion(Collection<String> collection) {
        this.getSDKAppID = collection;
    }

    private final void A_(Map<String, DeviceParameterResult> map, final Application application) throws Throwable {
        getSDKTransactionID = (AuthenticationRequestParameters + 109) % 128;
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 38016), 520 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), '4' - AndroidCharacter.getMirror('0'), objArr);
        getDeviceData(map, ((String) objArr[0]).intern(), new wn0.a() { // from class: atd.h.c4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bw_(application);
            }
        });
        Object[] objArr2 = new Object[1];
        a((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 524, 3 - MotionEvent.axisFromString(""), objArr2);
        getDeviceData(map, ((String) objArr2[0]).intern(), new wn0.a() { // from class: atd.h.o4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bx_(application);
            }
        });
        Object[] objArr3 = new Object[1];
        a((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 527 - ((byte) KeyEvent.getModifierMetaStateMask()), 3 - TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
        getDeviceData(map, ((String) objArr3[0]).intern(), new wn0.a() { // from class: atd.h.v4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.by_(application);
            }
        });
        Object[] objArr4 = new Object[1];
        a((char) (65216 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), MotionEvent.axisFromString("") + 533, Color.blue(0) + 4, objArr4);
        getDeviceData(map, ((String) objArr4[0]).intern(), new wn0.a() { // from class: atd.h.w4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bz_(application);
            }
        });
        Object[] objArr5 = new Object[1];
        a((char) (46866 - ExpandableListView.getPackedPositionGroup(0L)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 535, ImageFormat.getBitsPerPixel(0) + 5, objArr5);
        getDeviceData(map, ((String) objArr5[0]).intern(), new wn0.a() { // from class: atd.h.x4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bA_(application);
            }
        });
        Object[] objArr6 = new Object[1];
        a((char) Color.green(0), 539 - TextUtils.lastIndexOf("", '0', 0, 0), 4 - (Process.myPid() >> 22), objArr6);
        getDeviceData(map, ((String) objArr6[0]).intern(), new wn0.a() { // from class: atd.h.y4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bB_(application);
            }
        });
        Object[] objArr7 = new Object[1];
        a((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16452), 544 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 5 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr7);
        getDeviceData(map, ((String) objArr7[0]).intern(), new wn0.a() { // from class: atd.h.z4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bC_(application);
            }
        });
        Object[] objArr8 = new Object[1];
        a((char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 548, ((byte) KeyEvent.getModifierMetaStateMask()) + 5, objArr8);
        getDeviceData(map, ((String) objArr8[0]).intern(), new wn0.a() { // from class: atd.h.a5
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bD_(application);
            }
        });
        Object[] objArr9 = new Object[1];
        a((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 551 - TextUtils.lastIndexOf("", '0', 0), 4 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr9);
        getDeviceData(map, ((String) objArr9[0]).intern(), new wn0.a() { // from class: atd.h.c5
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bE_(application);
            }
        });
        Object[] objArr10 = new Object[1];
        a((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 556, 4 - KeyEvent.normalizeMetaState(0), objArr10);
        getDeviceData(map, ((String) objArr10[0]).intern(), new wn0.a() { // from class: atd.h.d5
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bF_(application);
            }
        });
        Object[] objArr11 = new Object[1];
        a((char) (53589 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 560 - Color.red(0), 4 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr11);
        getDeviceData(map, ((String) objArr11[0]).intern(), new wn0.a() { // from class: atd.h.d4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bG_(application);
            }
        });
        Object[] objArr12 = new Object[1];
        a((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 564 - KeyEvent.normalizeMetaState(0), 3 - MotionEvent.axisFromString(""), objArr12);
        getDeviceData(map, ((String) objArr12[0]).intern(), new wn0.a() { // from class: atd.h.e4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bH_(application);
            }
        });
        Object[] objArr13 = new Object[1];
        a((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 567 - Process.getGidForName(""), (Process.myPid() >> 22) + 4, objArr13);
        getDeviceData(map, ((String) objArr13[0]).intern(), new wn0.a() { // from class: atd.h.g4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bI_(application);
            }
        });
        Object[] objArr14 = new Object[1];
        a((char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 21912), TextUtils.indexOf("", "", 0) + 572, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, objArr14);
        getDeviceData(map, ((String) objArr14[0]).intern(), new wn0.a() { // from class: atd.h.h4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bJ_(application);
            }
        });
        Object[] objArr15 = new Object[1];
        a((char) View.MeasureSpec.makeMeasureSpec(0, 0), 576 - (ViewConfiguration.getLongPressTimeout() >> 16), 4 - ExpandableListView.getPackedPositionType(0L), objArr15);
        getDeviceData(map, ((String) objArr15[0]).intern(), new wn0.a() { // from class: atd.h.i4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bK_(application);
            }
        });
        Object[] objArr16 = new Object[1];
        a((char) (33403 - Color.blue(0)), 579 - ImageFormat.getBitsPerPixel(0), TextUtils.indexOf("", "") + 4, objArr16);
        getDeviceData(map, ((String) objArr16[0]).intern(), new wn0.a() { // from class: atd.h.j4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bL_(application);
            }
        });
        Object[] objArr17 = new Object[1];
        a((char) (KeyEvent.getMaxKeyCode() >> 16), KeyEvent.keyCodeFromString("") + 584, 4 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr17);
        getDeviceData(map, ((String) objArr17[0]).intern(), new wn0.a() { // from class: atd.h.k4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bM_(application);
            }
        });
        Object[] objArr18 = new Object[1];
        a((char) (TextUtils.indexOf("", "", 0) + 30938), 588 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, objArr18);
        getDeviceData(map, ((String) objArr18[0]).intern(), new wn0.a() { // from class: atd.h.l4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bN_(application);
            }
        });
        Object[] objArr19 = new Object[1];
        a((char) TextUtils.indexOf("", "", 0), AndroidCharacter.getMirror('0') + 544, View.MeasureSpec.getSize(0) + 4, objArr19);
        getDeviceData(map, ((String) objArr19[0]).intern(), new wn0.a() { // from class: atd.h.m4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bO_(application);
            }
        });
        Object[] objArr20 = new Object[1];
        a((char) (TextUtils.indexOf("", "") + 40262), View.resolveSize(0, 0) + 596, 4 - KeyEvent.normalizeMetaState(0), objArr20);
        getDeviceData(map, ((String) objArr20[0]).intern(), new wn0.a() { // from class: atd.h.n4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bP_(application);
            }
        });
        Object[] objArr21 = new Object[1];
        a((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 600 - Color.green(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, objArr21);
        getDeviceData(map, ((String) objArr21[0]).intern(), new wn0.a() { // from class: atd.h.p4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bQ_(application);
            }
        });
        Object[] objArr22 = new Object[1];
        a((char) View.combineMeasuredStates(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 605, ImageFormat.getBitsPerPixel(0) + 5, objArr22);
        getDeviceData(map, ((String) objArr22[0]).intern(), new wn0.a() { // from class: atd.h.r4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bR_(application);
            }
        });
        Object[] objArr23 = new Object[1];
        a((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 608 - KeyEvent.getDeadChar(0, 0), 4 - TextUtils.indexOf("", "", 0, 0), objArr23);
        getDeviceData(map, ((String) objArr23[0]).intern(), new wn0.a() { // from class: atd.h.s4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bS_(application);
            }
        });
        Object[] objArr24 = new Object[1];
        a((char) (Color.red(0) + 4687), 612 - Color.red(0), (Process.myPid() >> 22) + 4, objArr24);
        getDeviceData(map, ((String) objArr24[0]).intern(), new wn0.a() { // from class: atd.h.t4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bT_(application);
            }
        });
        Object[] objArr25 = new Object[1];
        a((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25390), 616 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 4 - Color.red(0), objArr25);
        getDeviceData(map, ((String) objArr25[0]).intern(), new wn0.a() { // from class: atd.h.u4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bU_(application);
            }
        });
        int i11 = AuthenticationRequestParameters + 45;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 96 / 0;
        }
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i12;
        int i15 = ~(i14 | i11);
        int i16 = ~i13;
        switch ((i11 * 677) + (i12 * (-675)) + ((i11 | i13 | i14) * (-676)) + ((i15 | (~(i16 | i11))) * 676) + (((~(i11 | i12 | i13)) | (~((~i11) | i14)) | (~(i14 | i16))) * 676)) {
            case 1:
                atd.l.getSDKReferenceNumber getsdkreferencenumber = new atd.l.getSDKReferenceNumber((Application) objArr[0]);
                getSDKTransactionID = (AuthenticationRequestParameters + 49) % 128;
                return getsdkreferencenumber;
            case 2:
                ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler((Application) objArr[0]);
                getSDKTransactionID = (AuthenticationRequestParameters + 9) % 128;
                return challengeStatusHandler;
            case 3:
                return getSDKAppID(objArr);
            case 4:
                return getSDKTransactionID(objArr);
            case 5:
                ChallengeResult challengeResult = new ChallengeResult((Application) objArr[0]);
                getSDKTransactionID = (AuthenticationRequestParameters + 37) % 128;
                return challengeResult;
            case 6:
                atd.aa.getSDKTransactionID getsdktransactionid = new atd.aa.getSDKTransactionID((Application) objArr[0]);
                AuthenticationRequestParameters = (getSDKTransactionID + 21) % 128;
                return getsdktransactionid;
            case 7:
                CompletionEvent completionEvent = new CompletionEvent();
                AuthenticationRequestParameters = (getSDKTransactionID + 73) % 128;
                return completionEvent;
            case 8:
                return AuthenticationRequestParameters(objArr);
            case 9:
                BuildConfig buildConfig = new BuildConfig();
                getSDKTransactionID = (AuthenticationRequestParameters + 125) % 128;
                return buildConfig;
            case 10:
                return getDeviceData(objArr);
            case 11:
                return BuildConfig(objArr);
            case 12:
                timedout timedoutVar = new timedout((byte) 0);
                AuthenticationRequestParameters = (getSDKTransactionID + 97) % 128;
                return timedoutVar;
            case 13:
                atd.l.ChallengeStatusHandler challengeStatusHandler2 = new atd.l.ChallengeStatusHandler((Application) objArr[0]);
                getSDKTransactionID = (AuthenticationRequestParameters + 119) % 128;
                return challengeStatusHandler2;
            case 14:
                onCompletion oncompletion = new onCompletion((Application) objArr[0]);
                getSDKTransactionID = (AuthenticationRequestParameters + 85) % 128;
                return oncompletion;
            case 15:
                ChallengeResultError challengeResultError = new ChallengeResultError((Application) objArr[0]);
                AuthenticationRequestParameters = (getSDKTransactionID + 89) % 128;
                return challengeResultError;
            case 16:
                return ChallengeResultCancelled(objArr);
            case 17:
                getAdditionalDetails getadditionaldetails = new getAdditionalDetails((Application) objArr[0]);
                AuthenticationRequestParameters = (getSDKTransactionID + 27) % 128;
                return getadditionaldetails;
            case 18:
                return getMessageVersion(objArr);
            case 19:
                protocolError protocolerror = new protocolError((Application) objArr[0]);
                getSDKTransactionID = (AuthenticationRequestParameters + 115) % 128;
                return protocolerror;
            case 20:
                getSDKEphemeralPublicKey getsdkephemeralpublickey = new getSDKEphemeralPublicKey();
                getSDKTransactionID = (AuthenticationRequestParameters + 53) % 128;
                return getsdkephemeralpublickey;
            case 21:
                atd.r.BuildConfig buildConfig2 = new atd.r.BuildConfig((Application) objArr[0]);
                getSDKTransactionID = (AuthenticationRequestParameters + 123) % 128;
                return buildConfig2;
            case 22:
                atd.l.getAdditionalDetails getadditionaldetails2 = new atd.l.getAdditionalDetails();
                getSDKTransactionID = (AuthenticationRequestParameters + 59) % 128;
                return getadditionaldetails2;
            case 23:
                return ChallengeResult(objArr);
            case 24:
                return getSDKEphemeralPublicKey(objArr);
            case 25:
                return ChallengeResultTimeout(objArr);
            case 26:
                ChallengeStatusReceiver challengeStatusReceiver = new ChallengeStatusReceiver();
                AuthenticationRequestParameters = (getSDKTransactionID + 115) % 128;
                return challengeStatusReceiver;
            case 27:
                return ChallengeResultError(objArr);
            case 28:
                getTransactionStatus gettransactionstatus = new getTransactionStatus((Application) objArr[0]);
                getSDKTransactionID = (AuthenticationRequestParameters + 29) % 128;
                return gettransactionstatus;
            case 29:
                getErrorDetails geterrordetails = new getErrorDetails((Application) objArr[0]);
                AuthenticationRequestParameters = (getSDKTransactionID + 57) % 128;
                return geterrordetails;
            case 30:
                return getAdditionalDetails(objArr);
            case 31:
                atd.m.getDeviceData getdevicedata = new atd.m.getDeviceData();
                AuthenticationRequestParameters = (getSDKTransactionID + 23) % 128;
                return getdevicedata;
            case 32:
                return getTransactionStatus(objArr);
            case 33:
                return ChallengeResultCompleted(objArr);
            case 34:
                atd.k.getSDKAppID getsdkappid = new atd.k.getSDKAppID((Application) objArr[0]);
                getSDKTransactionID = (AuthenticationRequestParameters + 93) % 128;
                return getsdkappid;
            case 35:
                ChallengeResultCancelled challengeResultCancelled = new ChallengeResultCancelled((Application) objArr[0]);
                AuthenticationRequestParameters = (getSDKTransactionID + 71) % 128;
                return challengeResultCancelled;
            case 36:
                atd.n.getDeviceData getdevicedata2 = new atd.n.getDeviceData();
                getSDKTransactionID = (AuthenticationRequestParameters + 47) % 128;
                return getdevicedata2;
            default:
                return getSDKReferenceNumber(objArr);
        }
    }

    private final void B_(Map<String, DeviceParameterResult> map, final Application application) throws Throwable {
        AuthenticationRequestParameters = (getSDKTransactionID + 89) % 128;
        Object[] objArr = new Object[1];
        a((char) (Color.blue(0) + 59980), 620 - ExpandableListView.getPackedPositionType(0L), 5 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        getDeviceData(map, ((String) objArr[0]).intern(), new wn0.a() { // from class: atd.h.u3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bV_(application);
            }
        });
        Object[] objArr2 = new Object[1];
        a((char) (43571 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 624, TextUtils.indexOf("", "") + 4, objArr2);
        getDeviceData(map, ((String) objArr2[0]).intern(), new wn0.a() { // from class: atd.h.f4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ProgressDialog();
            }
        });
        Object[] objArr3 = new Object[1];
        a((char) ((-16767979) - Color.rgb(0, 0, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 628, 3 - TextUtils.lastIndexOf("", '0', 0), objArr3);
        getDeviceData(map, ((String) objArr3[0]).intern(), new wn0.a() { // from class: atd.h.q4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bW_(application);
            }
        });
        Object[] objArr4 = new Object[1];
        a((char) (41713 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 632 - (Process.myTid() >> 22), 4 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr4);
        getDeviceData(map, ((String) objArr4[0]).intern(), new wn0.a() { // from class: atd.h.b5
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bX_(application);
            }
        });
        Object[] objArr5 = new Object[1];
        a((char) (Process.getGidForName("") + 55695), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 635, (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4, objArr5);
        getDeviceData(map, ((String) objArr5[0]).intern(), new wn0.a() { // from class: atd.h.m5
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bY_(application);
            }
        });
        getSDKTransactionID = (AuthenticationRequestParameters + 87) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter BuildConfig() {
        cancelled cancelledVar = new cancelled();
        int i11 = AuthenticationRequestParameters + 5;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return cancelledVar;
        }
        throw null;
    }

    private final void C_(Map<String, DeviceParameterResult> map, final Application application) throws Throwable {
        getSDKTransactionID = (AuthenticationRequestParameters + 103) % 128;
        Object[] objArr = new Object[1];
        a((char) (57551 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 644 - (KeyEvent.getMaxKeyCode() >> 16), 4 - TextUtils.indexOf("", ""), objArr);
        getDeviceData(map, ((String) objArr[0]).intern(), new wn0.a() { // from class: atd.h.j2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bZ_(application);
            }
        });
        AuthenticationRequestParameters = (getSDKTransactionID + 71) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResult() {
        atd.l.protocolError protocolerror = new atd.l.protocolError();
        AuthenticationRequestParameters = (getSDKTransactionID + 33) % 128;
        return protocolerror;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResultCancelled() {
        atd.m.getSDKReferenceNumber getsdkreferencenumber = new atd.m.getSDKReferenceNumber();
        int i11 = getSDKTransactionID + 3;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkreferencenumber;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResultCompleted() {
        atd.m.getSDKTransactionID getsdktransactionid = new atd.m.getSDKTransactionID();
        int i11 = getSDKTransactionID + 59;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 60 / 0;
        }
        return getsdktransactionid;
    }

    private static /* synthetic */ Object ChallengeResultError(Object[] objArr) {
        ChallengeResultKt challengeResultKt = new ChallengeResultKt((Application) objArr[0]);
        int i11 = getSDKTransactionID + 51;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeResultKt;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResultKt() {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[0], 1113961953, -1113961944, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object ChallengeResultTimeout(Object[] objArr) {
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout((Application) objArr[0]);
        int i11 = getSDKTransactionID + 19;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeResultTimeout;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeStatusHandler() {
        atd.m.getAdditionalDetails getadditionaldetails = new atd.m.getAdditionalDetails();
        AuthenticationRequestParameters = (getSDKTransactionID + 27) % 128;
        return getadditionaldetails;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeStatusReceiver() {
        atd.m.ChallengeResultCancelled challengeResultCancelled = new atd.m.ChallengeResultCancelled();
        getSDKTransactionID = (AuthenticationRequestParameters + 87) % 128;
        return challengeResultCancelled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter CompletionEvent() {
        atd.m.ChallengeResultError challengeResultError = new atd.m.ChallengeResultError();
        int i11 = getSDKTransactionID + 15;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeResultError;
        }
        throw null;
    }

    private final void D_(Map<String, DeviceParameterResult> map, final Application application) throws Throwable {
        getSDKTransactionID = (AuthenticationRequestParameters + 1) % 128;
        Object[] objArr = new Object[1];
        a((char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 647, Color.rgb(0, 0, 0) + 16777220, objArr);
        getDeviceData(map, ((String) objArr[0]).intern(), new wn0.a() { // from class: atd.h.t1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ca_(application);
            }
        });
        Object[] objArr2 = new Object[1];
        a((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 47), Color.blue(0) + 652, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 5, objArr2);
        getDeviceData(map, ((String) objArr2[0]).intern(), new wn0.a() { // from class: atd.h.u1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.cb_(application);
            }
        });
        Object[] objArr3 = new Object[1];
        a((char) TextUtils.indexOf("", "", 0), (Process.myPid() >> 22) + 656, (ViewConfiguration.getTouchSlop() >> 8) + 4, objArr3);
        getDeviceData(map, ((String) objArr3[0]).intern(), new wn0.a() { // from class: atd.h.v1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.cc_(application);
            }
        });
        Object[] objArr4 = new Object[1];
        a((char) Color.blue(0), 660 - (Process.myPid() >> 22), 4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr4);
        getDeviceData(map, ((String) objArr4[0]).intern(), new wn0.a() { // from class: atd.h.w1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.cd_(application);
            }
        });
        Object[] objArr5 = new Object[1];
        a((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 664, TextUtils.getTrimmedLength("") + 4, objArr5);
        getDeviceData(map, ((String) objArr5[0]).intern(), new wn0.a() { // from class: atd.h.x1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ce_(application);
            }
        });
        int i11 = getSDKTransactionID + 77;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 12 / 0;
        }
    }

    private final void E_(Map<String, DeviceParameterResult> map, Application application) {
        AuthenticationRequestParameters(new Object[]{this, map, application}, 1481764803, -1481764770, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ErrorMessage() {
        atd.m.ChallengeStatusHandler challengeStatusHandler = new atd.m.ChallengeStatusHandler();
        AuthenticationRequestParameters = (getSDKTransactionID + 77) % 128;
        return challengeStatusHandler;
    }

    private final void F_(Map<String, DeviceParameterResult> map, Application application) {
        AuthenticationRequestParameters(new Object[]{this, map, application}, -432998492, 432998502, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter G_(Application application) {
        atd.l.ChallengeResultCancelled challengeResultCancelled = new atd.l.ChallengeResultCancelled(application);
        int i11 = getSDKTransactionID + 45;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeResultCancelled;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter H_(Application application) {
        atd.l.onCompletion oncompletion = new atd.l.onCompletion(application);
        int i11 = getSDKTransactionID + 37;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return oncompletion;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter I_(Application application) {
        atd.l.getMessageVersion getmessageversion = new atd.l.getMessageVersion(application);
        int i11 = AuthenticationRequestParameters + 99;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return getmessageversion;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter InitializeResult() {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[0], -560957183, 560957219, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter InitializeResultFailure() {
        atd.n.AuthenticationRequestParameters authenticationRequestParameters = new atd.n.AuthenticationRequestParameters();
        int i11 = getSDKTransactionID + 53;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return authenticationRequestParameters;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter InitializeResultKt() {
        atd.s.getDeviceData getdevicedata = new atd.s.getDeviceData();
        int i11 = AuthenticationRequestParameters + 53;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 94 / 0;
        }
        return getdevicedata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter InitializeResultSuccess() {
        atd.n.getSDKReferenceNumber getsdkreferencenumber = new atd.n.getSDKReferenceNumber();
        AuthenticationRequestParameters = (getSDKTransactionID + 19) % 128;
        return getsdkreferencenumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter J_(Application application) {
        atd.l.BuildConfig buildConfig = new atd.l.BuildConfig(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 89) % 128;
        return buildConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter K_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, 142115536, -142115523, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter L_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, 1000335772, -1000335771, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter M_(Application application) {
        atd.l.ChallengeStatusReceiver challengeStatusReceiver = new atd.l.ChallengeStatusReceiver(application);
        int i11 = getSDKTransactionID + 11;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 53 / 0;
        }
        return challengeStatusReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter N_(Application application) {
        atd.w.getDeviceData getdevicedata = new atd.w.getDeviceData(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 33) % 128;
        return getdevicedata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter O_(Application application) {
        toString tostring = new toString(application);
        int i11 = getSDKTransactionID + 77;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return tostring;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter P_(Application application) {
        atd.w.getSDKAppID getsdkappid = new atd.w.getSDKAppID(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 99) % 128;
        return getsdkappid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ProgressDialog() {
        atd.t.getSDKAppID getsdkappid = new atd.t.getSDKAppID();
        int i11 = AuthenticationRequestParameters + 125;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return getsdkappid;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter Q_(Application application) {
        atd.w.AuthenticationRequestParameters authenticationRequestParameters = new atd.w.AuthenticationRequestParameters(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 41) % 128;
        return authenticationRequestParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter R_(Application application) {
        ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted(application);
        int i11 = AuthenticationRequestParameters + 105;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return challengeResultCompleted;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter S_(Application application) {
        atd.w.getTransactionStatus gettransactionstatus = new atd.w.getTransactionStatus(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 31) % 128;
        return gettransactionstatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter T_(Application application) {
        atd.w.getAdditionalDetails getadditionaldetails = new atd.w.getAdditionalDetails(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 17) % 128;
        return getadditionaldetails;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ThreeDS2Service() {
        atd.u.getSDKAppID getsdkappid = new atd.u.getSDKAppID();
        getSDKTransactionID = (AuthenticationRequestParameters + 21) % 128;
        return getsdkappid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter U_(Application application) {
        completed completedVar = new completed(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 19) % 128;
        return completedVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter V_(Application application) {
        atd.w.ChallengeStatusHandler challengeStatusHandler = new atd.w.ChallengeStatusHandler(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 3) % 128;
        return challengeStatusHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter W_(Application application) {
        atd.w.ChallengeResultKt challengeResultKt = new atd.w.ChallengeResultKt(application);
        int i11 = AuthenticationRequestParameters + 47;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 61 / 0;
        }
        return challengeResultKt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter X_(Application application) {
        atd.w.ChallengeStatusReceiver challengeStatusReceiver = new atd.w.ChallengeStatusReceiver(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 19) % 128;
        return challengeStatusReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter Y_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, -1300396525, 1300396539, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter Z_(Application application) {
        atd.w.CompletionEvent completionEvent = new atd.w.CompletionEvent(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 123) % 128;
        return completionEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aA_(Application application) {
        atd.aa.BuildConfig buildConfig = new atd.aa.BuildConfig(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 59) % 128;
        return buildConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aB_(Application application) {
        atd.aa.getSDKEphemeralPublicKey getsdkephemeralpublickey = new atd.aa.getSDKEphemeralPublicKey(application);
        int i11 = AuthenticationRequestParameters + 79;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return getsdkephemeralpublickey;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aC_(Application application) {
        atd.aa.getMessageVersion getmessageversion = new atd.aa.getMessageVersion(application);
        int i11 = AuthenticationRequestParameters + 89;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return getmessageversion;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aD_(Application application) {
        atd.aa.ChallengeResultCancelled challengeResultCancelled = new atd.aa.ChallengeResultCancelled(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 31) % 128;
        return challengeResultCancelled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aE_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, -191756915, 191756939, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aF_(Application application) {
        atd.aa.getSDKReferenceNumber getsdkreferencenumber = new atd.aa.getSDKReferenceNumber(application);
        int i11 = getSDKTransactionID + 53;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkreferencenumber;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aG_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, -505665904, 505665919, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aH_(Application application) {
        atd.aa.completed completedVar = new atd.aa.completed(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 51) % 128;
        return completedVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aI_(Application application) {
        atd.o.getDeviceData getdevicedata = new atd.o.getDeviceData(application);
        int i11 = getSDKTransactionID + 65;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return getdevicedata;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aJ_(Application application) {
        atd.o.getSDKAppID getsdkappid = new atd.o.getSDKAppID(application);
        int i11 = AuthenticationRequestParameters + 17;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return getsdkappid;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aK_(Application application) {
        atd.o.getSDKTransactionID getsdktransactionid = new atd.o.getSDKTransactionID(application);
        int i11 = getSDKTransactionID + 65;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 70 / 0;
        }
        return getsdktransactionid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aL_(Application application) {
        atd.o.AuthenticationRequestParameters authenticationRequestParameters = new atd.o.AuthenticationRequestParameters(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 73) % 128;
        return authenticationRequestParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aM_(Application application) {
        atd.v.AuthenticationRequestParameters authenticationRequestParameters = new atd.v.AuthenticationRequestParameters(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 69) % 128;
        return authenticationRequestParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aN_(Application application) {
        atd.v.getSDKAppID getsdkappid = new atd.v.getSDKAppID(application);
        int i11 = AuthenticationRequestParameters + 125;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return getsdkappid;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aO_(Application application) {
        atd.v.getSDKTransactionID getsdktransactionid = new atd.v.getSDKTransactionID(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 5) % 128;
        return getsdktransactionid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aP_(Application application) {
        atd.v.getDeviceData getdevicedata = new atd.v.getDeviceData(application);
        int i11 = AuthenticationRequestParameters + 19;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return getdevicedata;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aQ_(Application application) {
        atd.v.getSDKReferenceNumber getsdkreferencenumber = new atd.v.getSDKReferenceNumber(application);
        int i11 = getSDKTransactionID + 71;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkreferencenumber;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aR_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, -113552205, 113552221, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aS_(Application application) {
        atd.v.getSDKEphemeralPublicKey getsdkephemeralpublickey = new atd.v.getSDKEphemeralPublicKey(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 13) % 128;
        return getsdkephemeralpublickey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aT_(Application application) {
        atd.v.getMessageVersion getmessageversion = new atd.v.getMessageVersion(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 25) % 128;
        return getmessageversion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aU_(Application application) {
        atd.v.BuildConfig buildConfig = new atd.v.BuildConfig(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 67) % 128;
        return buildConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aV_(Application application) {
        atd.v.getAdditionalDetails getadditionaldetails = new atd.v.getAdditionalDetails(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 119) % 128;
        return getadditionaldetails;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aW_(Application application) {
        atd.v.ChallengeResultTimeout challengeResultTimeout = new atd.v.ChallengeResultTimeout(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 17) % 128;
        return challengeResultTimeout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aX_(Application application) {
        atd.v.onCompletion oncompletion = new atd.v.onCompletion(application);
        int i11 = getSDKTransactionID + 105;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return oncompletion;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aY_(Application application) {
        atd.v.completed completedVar = new atd.v.completed(application);
        int i11 = getSDKTransactionID + 71;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return completedVar;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aZ_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, 48794327, -48794325, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aa_(Application application) {
        atd.w.timedout timedoutVar = new atd.w.timedout(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 111) % 128;
        return timedoutVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ab_(Application application) {
        atd.w.cancelled cancelledVar = new atd.w.cancelled(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 69) % 128;
        return cancelledVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ac_(Application application) {
        getErrorCode geterrorcode = new getErrorCode(application);
        int i11 = AuthenticationRequestParameters + 59;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return geterrorcode;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ad_(Application application) {
        getErrorDescription geterrordescription = new getErrorDescription(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 73) % 128;
        return geterrordescription;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ae_(Application application) {
        ErrorMessage errorMessage = new ErrorMessage(application);
        int i11 = AuthenticationRequestParameters + 19;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return errorMessage;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter af_(Application application) {
        hashCode hashcode = new hashCode(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 25) % 128;
        return hashcode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ag_(Application application) {
        InitializeResultFailure initializeResultFailure = new InitializeResultFailure(application);
        int i11 = AuthenticationRequestParameters + 47;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return initializeResultFailure;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ah_(Application application) {
        atd.w.getSDKReferenceNumber getsdkreferencenumber = new atd.w.getSDKReferenceNumber(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 53) % 128;
        return getsdkreferencenumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ai_(Application application) {
        atd.w.getSDKTransactionID getsdktransactionid = new atd.w.getSDKTransactionID(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 121) % 128;
        return getsdktransactionid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aj_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, 1379249464, -1379249460, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ak_(Application application) {
        atd.w.getMessageVersion getmessageversion = new atd.w.getMessageVersion(application);
        int i11 = AuthenticationRequestParameters + 95;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return getmessageversion;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter al_(Application application) {
        atd.w.ChallengeResult challengeResult = new atd.w.ChallengeResult(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 65) % 128;
        return challengeResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter am_(Application application) {
        atd.w.BuildConfig buildConfig = new atd.w.BuildConfig(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 7) % 128;
        return buildConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter an_(Application application) {
        atd.w.ChallengeResultCancelled challengeResultCancelled = new atd.w.ChallengeResultCancelled(application);
        int i11 = getSDKTransactionID + 7;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeResultCancelled;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ao_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, 771599500, -771599481, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ap_(Application application) {
        runtimeError runtimeerror = new runtimeError(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 71) % 128;
        return runtimeerror;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aq_(Application application) {
        atd.w.ChallengeResultError challengeResultError = new atd.w.ChallengeResultError(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 65) % 128;
        return challengeResultError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ar_(Application application) {
        getTransactionID gettransactionid = new getTransactionID(application);
        int i11 = getSDKTransactionID + 107;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 32 / 0;
        }
        return gettransactionid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter as_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, -410719429, 410719458, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter at_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, -1556936013, 1556936038, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter au_(Application application) {
        InitializeResult initializeResult = new InitializeResult(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 7) % 128;
        return initializeResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter av_(Application application) {
        atd.aa.AuthenticationRequestParameters authenticationRequestParameters = new atd.aa.AuthenticationRequestParameters(application);
        int i11 = getSDKTransactionID + 61;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return authenticationRequestParameters;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter aw_(Application application) {
        atd.aa.ChallengeStatusHandler challengeStatusHandler = new atd.aa.ChallengeStatusHandler(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 107) % 128;
        return challengeStatusHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ax_(Application application) {
        atd.aa.ChallengeResultCompleted challengeResultCompleted = new atd.aa.ChallengeResultCompleted(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 45) % 128;
        return challengeResultCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ay_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, 394091376, -394091370, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter az_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, 1445350745, -1445350734, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bA_(Application application) {
        atd.x.getDeviceData getdevicedata = new atd.x.getDeviceData(application);
        int i11 = AuthenticationRequestParameters + 99;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 90 / 0;
        }
        return getdevicedata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bB_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, 519516164, -519516164, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bC_(Application application) {
        atd.x.getMessageVersion getmessageversion = new atd.x.getMessageVersion(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 13) % 128;
        return getmessageversion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bD_(Application application) {
        atd.x.BuildConfig buildConfig = new atd.x.BuildConfig(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 91) % 128;
        return buildConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bE_(Application application) {
        atd.x.getSDKEphemeralPublicKey getsdkephemeralpublickey = new atd.x.getSDKEphemeralPublicKey(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 65) % 128;
        return getsdkephemeralpublickey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bF_(Application application) {
        atd.x.ChallengeResultCancelled challengeResultCancelled = new atd.x.ChallengeResultCancelled(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 19) % 128;
        return challengeResultCancelled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bG_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, -1318420345, 1318420362, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bH_(Application application) {
        atd.x.ChallengeResultError challengeResultError = new atd.x.ChallengeResultError(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 45) % 128;
        return challengeResultError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bI_(Application application) {
        atd.x.ChallengeResultCompleted challengeResultCompleted = new atd.x.ChallengeResultCompleted(application);
        int i11 = getSDKTransactionID + 69;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 74 / 0;
        }
        return challengeResultCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bJ_(Application application) {
        atd.x.getTransactionStatus gettransactionstatus = new atd.x.getTransactionStatus(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 11) % 128;
        return gettransactionstatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bK_(Application application) {
        atd.x.ChallengeResultTimeout challengeResultTimeout = new atd.x.ChallengeResultTimeout(application);
        int i11 = AuthenticationRequestParameters + 65;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return challengeResultTimeout;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bL_(Application application) {
        atd.x.ChallengeStatusHandler challengeStatusHandler = new atd.x.ChallengeStatusHandler(application);
        int i11 = AuthenticationRequestParameters + 107;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return challengeStatusHandler;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bM_(Application application) {
        atd.x.completed completedVar = new atd.x.completed(application);
        int i11 = AuthenticationRequestParameters + 5;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 62 / 0;
        }
        return completedVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bN_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, 1235984127, -1235984100, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bO_(Application application) {
        atd.x.ChallengeStatusReceiver challengeStatusReceiver = new atd.x.ChallengeStatusReceiver(application);
        int i11 = AuthenticationRequestParameters + 93;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 23 / 0;
        }
        return challengeStatusReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bP_(Application application) {
        atd.x.onCompletion oncompletion = new atd.x.onCompletion(application);
        int i11 = getSDKTransactionID + 109;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return oncompletion;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bQ_(Application application) {
        atd.x.runtimeError runtimeerror = new atd.x.runtimeError(application);
        int i11 = AuthenticationRequestParameters + 109;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return runtimeerror;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bR_(Application application) {
        atd.x.timedout timedoutVar = new atd.x.timedout(application);
        int i11 = AuthenticationRequestParameters + 101;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 31 / 0;
        }
        return timedoutVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bS_(Application application) {
        atd.x.CompletionEvent completionEvent = new atd.x.CompletionEvent(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 115) % 128;
        return completionEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bT_(Application application) {
        atd.x.protocolError protocolerror = new atd.x.protocolError(application);
        int i11 = AuthenticationRequestParameters + 45;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return protocolerror;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bU_(Application application) {
        atd.x.cancelled cancelledVar = new atd.x.cancelled(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 91) % 128;
        return cancelledVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bV_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, 1954776244, -1954776226, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bW_(Application application) {
        atd.t.getDeviceData getdevicedata = new atd.t.getDeviceData(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 5) % 128;
        return getdevicedata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bX_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, 210052491, -210052459, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bY_(Application application) {
        atd.t.getSDKTransactionID getsdktransactionid = new atd.t.getSDKTransactionID(application);
        int i11 = getSDKTransactionID + 123;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdktransactionid;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bZ_(Application application) {
        atd.p.getSDKTransactionID getsdktransactionid = new atd.p.getSDKTransactionID(application);
        int i11 = AuthenticationRequestParameters + 109;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return getsdktransactionid;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ba_(Application application) {
        atd.v.ChallengeResultKt challengeResultKt = new atd.v.ChallengeResultKt(application);
        int i11 = AuthenticationRequestParameters + 79;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return challengeResultKt;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bb_(Application application) {
        atd.v.runtimeError runtimeerror = new atd.v.runtimeError(application);
        int i11 = getSDKTransactionID + 111;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return runtimeerror;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bc_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, -60275710, 60275738, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bd_(Application application) {
        atd.v.ChallengeResultError challengeResultError = new atd.v.ChallengeResultError(application);
        int i11 = getSDKTransactionID + 7;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeResultError;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter be_(Application application) {
        atd.r.getDeviceData getdevicedata = new atd.r.getDeviceData(application);
        int i11 = getSDKTransactionID + 91;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return getdevicedata;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bf_(Application application) {
        atd.r.getSDKTransactionID getsdktransactionid = new atd.r.getSDKTransactionID(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 51) % 128;
        return getsdktransactionid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bg_(Application application) {
        atd.r.AuthenticationRequestParameters authenticationRequestParameters = new atd.r.AuthenticationRequestParameters(application);
        int i11 = getSDKTransactionID + 45;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return authenticationRequestParameters;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bh_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, 869922625, -869922595, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bi_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, -386109408, 386109443, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bj_(Application application) {
        atd.r.getMessageVersion getmessageversion = new atd.r.getMessageVersion(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 99) % 128;
        return getmessageversion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bk_(Application application) {
        atd.r.getSDKEphemeralPublicKey getsdkephemeralpublickey = new atd.r.getSDKEphemeralPublicKey(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 43) % 128;
        return getsdkephemeralpublickey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bl_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, -1984090038, 1984090059, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bm_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, -1788462420, 1788462425, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bn_(Application application) {
        atd.r.ChallengeResultError challengeResultError = new atd.r.ChallengeResultError(application);
        int i11 = getSDKTransactionID + 55;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeResultError;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bo_(Application application) {
        atd.r.ChallengeResultCompleted challengeResultCompleted = new atd.r.ChallengeResultCompleted(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 3) % 128;
        return challengeResultCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bp_(Application application) {
        atd.r.getTransactionStatus gettransactionstatus = new atd.r.getTransactionStatus(application);
        int i11 = AuthenticationRequestParameters + 123;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return gettransactionstatus;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bq_(Application application) {
        atd.r.ChallengeResultTimeout challengeResultTimeout = new atd.r.ChallengeResultTimeout(application);
        AuthenticationRequestParameters = (getSDKTransactionID + 53) % 128;
        return challengeResultTimeout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter br_(Application application) {
        atd.r.getAdditionalDetails getadditionaldetails = new atd.r.getAdditionalDetails(application);
        int i11 = getSDKTransactionID + 43;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return getadditionaldetails;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bs_(Application application) {
        atd.r.ChallengeStatusReceiver challengeStatusReceiver = new atd.r.ChallengeStatusReceiver(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 71) % 128;
        return challengeStatusReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bt_(Application application) {
        atd.r.ChallengeStatusHandler challengeStatusHandler = new atd.r.ChallengeStatusHandler(application);
        int i11 = getSDKTransactionID + 65;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeStatusHandler;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bu_(Application application) {
        atd.r.onCompletion oncompletion = new atd.r.onCompletion(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 19) % 128;
        return oncompletion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bv_(Application application) {
        atd.r.getSDKAppID getsdkappid = new atd.r.getSDKAppID(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 33) % 128;
        return getsdkappid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bw_(Application application) {
        atd.x.getSDKAppID getsdkappid = new atd.x.getSDKAppID(application);
        int i11 = AuthenticationRequestParameters + 113;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return getsdkappid;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bx_(Application application) {
        atd.x.getSDKTransactionID getsdktransactionid = new atd.x.getSDKTransactionID(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 53) % 128;
        return getsdktransactionid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter by_(Application application) {
        atd.x.getSDKReferenceNumber getsdkreferencenumber = new atd.x.getSDKReferenceNumber(application);
        int i11 = AuthenticationRequestParameters + 1;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 54 / 0;
        }
        return getsdkreferencenumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter bz_(Application application) {
        atd.x.AuthenticationRequestParameters authenticationRequestParameters = new atd.x.AuthenticationRequestParameters(application);
        int i11 = AuthenticationRequestParameters + 83;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return authenticationRequestParameters;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ca_(Application application) {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[]{application}, 1215705984, -1215705950, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter cancelled() {
        atd.m.completed completedVar = new atd.m.completed();
        getSDKTransactionID = (AuthenticationRequestParameters + 5) % 128;
        return completedVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter cb_(Application application) {
        atd.k.getDeviceData getdevicedata = new atd.k.getDeviceData(application);
        int i11 = AuthenticationRequestParameters + 35;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return getdevicedata;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter cc_(Application application) {
        atd.k.AuthenticationRequestParameters authenticationRequestParameters = new atd.k.AuthenticationRequestParameters(application);
        getSDKTransactionID = (AuthenticationRequestParameters + 63) % 128;
        return authenticationRequestParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter cd_(Application application) {
        atd.k.getSDKTransactionID getsdktransactionid = new atd.k.getSDKTransactionID(application);
        int i11 = AuthenticationRequestParameters + 119;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return getsdktransactionid;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ce_(Application application) {
        atd.k.getMessageVersion getmessageversion = new atd.k.getMessageVersion(application);
        int i11 = AuthenticationRequestParameters + 15;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return getmessageversion;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter cf_(Application application) {
        atd.y.getSDKAppID getsdkappid = new atd.y.getSDKAppID(application);
        int i11 = getSDKTransactionID + 9;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkappid;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter completed() {
        atd.m.getSDKEphemeralPublicKey getsdkephemeralpublickey = new atd.m.getSDKEphemeralPublicKey();
        int i11 = getSDKTransactionID + 29;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkephemeralpublickey;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter equals() {
        atd.n.getSDKTransactionID getsdktransactionid = new atd.n.getSDKTransactionID();
        int i11 = AuthenticationRequestParameters + 105;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 8 / 0;
        }
        return getsdktransactionid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getAdditionalDetails() {
        atd.m.getSDKAppID getsdkappid = new atd.m.getSDKAppID();
        int i11 = getSDKTransactionID + 69;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkappid;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getDeviceData() {
        atd.l.completed completedVar = new atd.l.completed();
        getSDKTransactionID = (AuthenticationRequestParameters + 77) % 128;
        return completedVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getErrorCode() {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[0], 1907650217, -1907650210, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getErrorDescription() {
        atd.m.ChallengeResultKt challengeResultKt = new atd.m.ChallengeResultKt();
        int i11 = getSDKTransactionID + 123;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return challengeResultKt;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getErrorDetails() {
        atd.m.ChallengeStatusReceiver challengeStatusReceiver = new atd.m.ChallengeStatusReceiver();
        getSDKTransactionID = (AuthenticationRequestParameters + 55) % 128;
        return challengeStatusReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getMessageVersion() {
        atd.l.getSDKAppID getsdkappid = new atd.l.getSDKAppID((byte) 0);
        int i11 = getSDKTransactionID + 95;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkappid;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getSDKAppID() {
        atd.l.getTransactionStatus gettransactionstatus = new atd.l.getTransactionStatus();
        int i11 = AuthenticationRequestParameters + 1;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return gettransactionstatus;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getSDKEphemeralPublicKey() {
        atd.l.ChallengeResultKt challengeResultKt = new atd.l.ChallengeResultKt();
        AuthenticationRequestParameters = (getSDKTransactionID + 37) % 128;
        return challengeResultKt;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        atd.x.ChallengeResult challengeResult = new atd.x.ChallengeResult((Application) objArr[0]);
        int i11 = getSDKTransactionID + 47;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 45 / 0;
        }
        return challengeResult;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        atd.w.getSDKEphemeralPublicKey getsdkephemeralpublickey = new atd.w.getSDKEphemeralPublicKey((Application) objArr[0]);
        int i11 = getSDKTransactionID + 73;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkephemeralpublickey;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getTransactionID() {
        atd.m.onCompletion oncompletion = new atd.m.onCompletion();
        int i11 = getSDKTransactionID + 119;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return oncompletion;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getTransactionStatus() {
        atd.m.getMessageVersion getmessageversion = new atd.m.getMessageVersion();
        int i11 = getSDKTransactionID + 117;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return getmessageversion;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter hide() {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[0], -616859981, 616860007, (int) System.currentTimeMillis());
    }

    static void init$0() {
        $$a = new byte[]{81, 113, 124, -104};
        $$b = EnumC4419g.SDK_ASSET_ICON_COMMENT_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter onCompletion() {
        atd.m.ChallengeResult challengeResult = new atd.m.ChallengeResult();
        int i11 = AuthenticationRequestParameters + 55;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return challengeResult;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter protocolError() {
        atd.m.ChallengeResultCompleted challengeResultCompleted = new atd.m.ChallengeResultCompleted();
        AuthenticationRequestParameters = (getSDKTransactionID + 27) % 128;
        return challengeResultCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter runtimeError() {
        atd.m.getTransactionStatus gettransactionstatus = new atd.m.getTransactionStatus();
        int i11 = getSDKTransactionID + 113;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 3 / 0;
        }
        return gettransactionstatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter show() {
        atd.n.getSDKAppID getsdkappid = new atd.n.getSDKAppID();
        getSDKTransactionID = (AuthenticationRequestParameters + 79) % 128;
        return getsdkappid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter timedout() {
        atd.m.ChallengeResultTimeout challengeResultTimeout = new atd.m.ChallengeResultTimeout();
        int i11 = AuthenticationRequestParameters + 123;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 20 / 0;
        }
        return challengeResultTimeout;
    }

    private final void u_(Map<String, DeviceParameterResult> map, final Application application) throws Throwable {
        AuthenticationRequestParameters = (getSDKTransactionID + 5) % 128;
        Object[] objArr = new Object[1];
        a((char) (46665 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 1, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 4, objArr);
        getDeviceData(map, ((String) objArr[0]).intern(), new wn0.a() { // from class: atd.h.l
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.getDeviceData();
            }
        });
        Object[] objArr2 = new Object[1];
        a((char) (ViewConfiguration.getTapTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 4, 4 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
        getDeviceData(map, ((String) objArr2[0]).intern(), new wn0.a() { // from class: atd.h.y1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.AuthenticationRequestParameters();
            }
        });
        Object[] objArr3 = new Object[1];
        a((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 6690), (ViewConfiguration.getWindowTouchSlop() >> 8) + 8, TextUtils.indexOf((CharSequence) "", '0', 0) + 5, objArr3);
        getDeviceData(map, ((String) objArr3[0]).intern(), new wn0.a() { // from class: atd.h.z1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.getSDKReferenceNumber();
            }
        });
        Object[] objArr4 = new Object[1];
        a((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 11 - ImageFormat.getBitsPerPixel(0), KeyEvent.getDeadChar(0, 0) + 4, objArr4);
        getDeviceData(map, ((String) objArr4[0]).intern(), new wn0.a() { // from class: atd.h.a2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.getSDKAppID();
            }
        });
        Object[] objArr5 = new Object[1];
        a((char) (28541 - View.MeasureSpec.getSize(0)), (Process.myTid() >> 22) + 16, 4 - ExpandableListView.getPackedPositionType(0L), objArr5);
        getDeviceData(map, ((String) objArr5[0]).intern(), new wn0.a() { // from class: atd.h.b2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.G_(application);
            }
        });
        Object[] objArr6 = new Object[1];
        a((char) (ViewConfiguration.getTapTimeout() >> 16), 20 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, objArr6);
        getDeviceData(map, ((String) objArr6[0]).intern(), new wn0.a() { // from class: atd.h.d2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.getSDKTransactionID();
            }
        });
        Object[] objArr7 = new Object[1];
        a((char) (5425 - (ViewConfiguration.getTapTimeout() >> 16)), 24 - TextUtils.getTrimmedLength(""), 4 - ExpandableListView.getPackedPositionType(0L), objArr7);
        getDeviceData(map, ((String) objArr7[0]).intern(), new wn0.a() { // from class: atd.h.e2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.H_(application);
            }
        });
        Object[] objArr8 = new Object[1];
        a((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49851), KeyEvent.normalizeMetaState(0) + 28, 3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr8);
        getDeviceData(map, ((String) objArr8[0]).intern(), new wn0.a() { // from class: atd.h.f2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.I_(application);
            }
        });
        Object[] objArr9 = new Object[1];
        a((char) (AndroidCharacter.getMirror('0') - '0'), TextUtils.indexOf("", "", 0, 0) + 32, TextUtils.indexOf((CharSequence) "", '0') + 5, objArr9);
        getDeviceData(map, ((String) objArr9[0]).intern(), new wn0.a() { // from class: atd.h.g2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.J_(application);
            }
        });
        AuthenticationRequestParameters(new Object[]{this, map, application}, -432998492, 432998502, System.identityHashCode(this));
        Object[] objArr10 = new Object[1];
        a((char) (AndroidCharacter.getMirror('0') + 756), 36 - ExpandableListView.getPackedPositionType(0L), 4 - (ViewConfiguration.getEdgeSlop() >> 16), objArr10);
        getDeviceData(map, ((String) objArr10[0]).intern(), new wn0.a() { // from class: atd.h.h2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.K_(application);
            }
        });
        Object[] objArr11 = new Object[1];
        a((char) (52191 - TextUtils.indexOf("", "")), 40 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 4, objArr11);
        getDeviceData(map, ((String) objArr11[0]).intern(), new wn0.a() { // from class: atd.h.w
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.L_(application);
            }
        });
        Object[] objArr12 = new Object[1];
        a((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 44 - (ViewConfiguration.getScrollBarSize() >> 8), 4 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr12);
        getDeviceData(map, ((String) objArr12[0]).intern(), new wn0.a() { // from class: atd.h.h0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ChallengeResult();
            }
        });
        Object[] objArr13 = new Object[1];
        a((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 36289), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 47, 3 - ImageFormat.getBitsPerPixel(0), objArr13);
        getDeviceData(map, ((String) objArr13[0]).intern(), new wn0.a() { // from class: atd.h.s0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.M_(application);
            }
        });
        Object[] objArr14 = new Object[1];
        a((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 53 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 3 - Process.getGidForName(""), objArr14);
        getDeviceData(map, ((String) objArr14[0]).intern(), new wn0.a() { // from class: atd.h.d1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.getMessageVersion();
            }
        });
        Object[] objArr15 = new Object[1];
        a((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 56 - TextUtils.getOffsetAfter("", 0), 4 - TextUtils.indexOf("", "", 0), objArr15);
        getDeviceData(map, ((String) objArr15[0]).intern(), new wn0.a() { // from class: atd.h.o1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.getSDKEphemeralPublicKey();
            }
        });
        AuthenticationRequestParameters = (getSDKTransactionID + 1) % 128;
    }

    private final void v_(Map<String, DeviceParameterResult> map, final Application application) throws Throwable {
        getSDKTransactionID = (AuthenticationRequestParameters + 45) % 128;
        Object[] objArr = new Object[1];
        a((char) (28473 - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.lastIndexOf("", '0') + 61, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4, objArr);
        getDeviceData(map, ((String) objArr[0]).intern(), new wn0.a() { // from class: atd.h.e5
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.N_(application);
            }
        });
        Object[] objArr2 = new Object[1];
        a((char) ((-1) - ImageFormat.getBitsPerPixel(0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 65, 4 - TextUtils.getCapsMode("", 0, 0), objArr2);
        getDeviceData(map, ((String) objArr2[0]).intern(), new wn0.a() { // from class: atd.h.e
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.O_(application);
            }
        });
        Object[] objArr3 = new Object[1];
        a((char) (AndroidCharacter.getMirror('0') - '0'), 68 - (Process.myTid() >> 22), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 3, objArr3);
        getDeviceData(map, ((String) objArr3[0]).intern(), new wn0.a() { // from class: atd.h.q
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.P_(application);
            }
        });
        Object[] objArr4 = new Object[1];
        a((char) (22736 - TextUtils.getOffsetAfter("", 0)), 73 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 4, objArr4);
        getDeviceData(map, ((String) objArr4[0]).intern(), new wn0.a() { // from class: atd.h.v
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.Q_(application);
            }
        });
        Object[] objArr5 = new Object[1];
        a((char) (Color.alpha(0) + 29686), 75 - TextUtils.indexOf((CharSequence) "", '0', 0), 4 - View.MeasureSpec.getSize(0), objArr5);
        getDeviceData(map, ((String) objArr5[0]).intern(), new wn0.a() { // from class: atd.h.x
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.R_(application);
            }
        });
        Object[] objArr6 = new Object[1];
        a((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 6058), (ViewConfiguration.getPressedStateDuration() >> 16) + 80, TextUtils.getOffsetBefore("", 0) + 4, objArr6);
        getDeviceData(map, ((String) objArr6[0]).intern(), new wn0.a() { // from class: atd.h.y
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.S_(application);
            }
        });
        Object[] objArr7 = new Object[1];
        a((char) (41571 - TextUtils.lastIndexOf("", '0', 0)), 84 - ExpandableListView.getPackedPositionType(0L), 4 - Color.red(0), objArr7);
        getDeviceData(map, ((String) objArr7[0]).intern(), new wn0.a() { // from class: atd.h.z
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.T_(application);
            }
        });
        Object[] objArr8 = new Object[1];
        a((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 88, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5, objArr8);
        getDeviceData(map, ((String) objArr8[0]).intern(), new wn0.a() { // from class: atd.h.a0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.U_(application);
            }
        });
        Object[] objArr9 = new Object[1];
        a((char) View.resolveSize(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 92, ExpandableListView.getPackedPositionType(0L) + 4, objArr9);
        getDeviceData(map, ((String) objArr9[0]).intern(), new wn0.a() { // from class: atd.h.b0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.V_(application);
            }
        });
        Object[] objArr10 = new Object[1];
        a((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 57689), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 95, (ViewConfiguration.getEdgeSlop() >> 16) + 4, objArr10);
        getDeviceData(map, ((String) objArr10[0]).intern(), new wn0.a() { // from class: atd.h.c0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.W_(application);
            }
        });
        Object[] objArr11 = new Object[1];
        a((char) (44981 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 100 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getOffsetAfter("", 0) + 4, objArr11);
        getDeviceData(map, ((String) objArr11[0]).intern(), new wn0.a() { // from class: atd.h.f5
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.X_(application);
            }
        });
        Object[] objArr12 = new Object[1];
        a((char) (14450 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (-16777112) - Color.rgb(0, 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 4, objArr12);
        getDeviceData(map, ((String) objArr12[0]).intern(), new wn0.a() { // from class: atd.h.g5
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.Y_(application);
            }
        });
        Object[] objArr13 = new Object[1];
        a((char) TextUtils.getOffsetAfter("", 0), 108 - (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.myTid() >> 22) + 4, objArr13);
        getDeviceData(map, ((String) objArr13[0]).intern(), new wn0.a() { // from class: atd.h.h5
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.Z_(application);
            }
        });
        Object[] objArr14 = new Object[1];
        a((char) Color.argb(0, 0, 0, 0), 113 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 4, objArr14);
        getDeviceData(map, ((String) objArr14[0]).intern(), new wn0.a() { // from class: atd.h.i5
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aa_(application);
            }
        });
        Object[] objArr15 = new Object[1];
        a((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 116, ((Process.getThreadPriority(0) + 20) >> 6) + 4, objArr15);
        getDeviceData(map, ((String) objArr15[0]).intern(), new wn0.a() { // from class: atd.h.j5
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ab_(application);
            }
        });
        Object[] objArr16 = new Object[1];
        a((char) (56434 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 120 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), KeyEvent.keyCodeFromString("") + 4, objArr16);
        getDeviceData(map, ((String) objArr16[0]).intern(), new wn0.a() { // from class: atd.h.k5
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ac_(application);
            }
        });
        Object[] objArr17 = new Object[1];
        a((char) Gravity.getAbsoluteGravity(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 123, 3 - ExpandableListView.getPackedPositionChild(0L), objArr17);
        getDeviceData(map, ((String) objArr17[0]).intern(), new wn0.a() { // from class: atd.h.l5
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ad_(application);
            }
        });
        Object[] objArr18 = new Object[1];
        a((char) (View.resolveSizeAndState(0, 0, 0) + 11477), View.combineMeasuredStates(0, 0) + 128, 4 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr18);
        getDeviceData(map, ((String) objArr18[0]).intern(), new wn0.a() { // from class: atd.h.b
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ae_(application);
            }
        });
        Object[] objArr19 = new Object[1];
        a((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 47682), 131 - TextUtils.lastIndexOf("", '0', 0), TextUtils.getOffsetAfter("", 0) + 4, objArr19);
        getDeviceData(map, ((String) objArr19[0]).intern(), new wn0.a() { // from class: atd.h.c
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.af_(application);
            }
        });
        Object[] objArr20 = new Object[1];
        a((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 59526), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 136, TextUtils.indexOf("", "", 0) + 4, objArr20);
        getDeviceData(map, ((String) objArr20[0]).intern(), new wn0.a() { // from class: atd.h.d
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ag_(application);
            }
        });
        Object[] objArr21 = new Object[1];
        a((char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getFadingEdgeLength() >> 16) + 140, 3 - ImageFormat.getBitsPerPixel(0), objArr21);
        getDeviceData(map, ((String) objArr21[0]).intern(), new wn0.a() { // from class: atd.h.f
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ah_(application);
            }
        });
        Object[] objArr22 = new Object[1];
        a((char) (41439 - Color.green(0)), 145 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 4 - ExpandableListView.getPackedPositionType(0L), objArr22);
        getDeviceData(map, ((String) objArr22[0]).intern(), new wn0.a() { // from class: atd.h.g
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ai_(application);
            }
        });
        Object[] objArr23 = new Object[1];
        a((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), TextUtils.lastIndexOf("", '0', 0) + 149, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 3, objArr23);
        getDeviceData(map, ((String) objArr23[0]).intern(), new wn0.a() { // from class: atd.h.h
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aj_(application);
            }
        });
        Object[] objArr24 = new Object[1];
        a((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 152 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 4 - ExpandableListView.getPackedPositionType(0L), objArr24);
        getDeviceData(map, ((String) objArr24[0]).intern(), new wn0.a() { // from class: atd.h.i
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ak_(application);
            }
        });
        Object[] objArr25 = new Object[1];
        a((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44911), 156 - View.combineMeasuredStates(0, 0), 4 - Color.red(0), objArr25);
        getDeviceData(map, ((String) objArr25[0]).intern(), new wn0.a() { // from class: atd.h.j
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.al_(application);
            }
        });
        Object[] objArr26 = new Object[1];
        a((char) (47683 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getTapTimeout() >> 16) + 160, 4 - KeyEvent.keyCodeFromString(""), objArr26);
        getDeviceData(map, ((String) objArr26[0]).intern(), new wn0.a() { // from class: atd.h.k
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.am_(application);
            }
        });
        Object[] objArr27 = new Object[1];
        a((char) (ViewConfiguration.getPressedStateDuration() >> 16), 164 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, objArr27);
        getDeviceData(map, ((String) objArr27[0]).intern(), new wn0.a() { // from class: atd.h.m
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.an_(application);
            }
        });
        Object[] objArr28 = new Object[1];
        a((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.rgb(0, 0, 0) + 16777384, 4 - TextUtils.getCapsMode("", 0, 0), objArr28);
        getDeviceData(map, ((String) objArr28[0]).intern(), new wn0.a() { // from class: atd.h.n
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ao_(application);
            }
        });
        Object[] objArr29 = new Object[1];
        a((char) View.MeasureSpec.getMode(0), 172 - Color.red(0), (Process.myTid() >> 22) + 4, objArr29);
        getDeviceData(map, ((String) objArr29[0]).intern(), new wn0.a() { // from class: atd.h.o
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ap_(application);
            }
        });
        Object[] objArr30 = new Object[1];
        a((char) (4193 - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 177, TextUtils.lastIndexOf("", '0') + 5, objArr30);
        getDeviceData(map, ((String) objArr30[0]).intern(), new wn0.a() { // from class: atd.h.p
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aq_(application);
            }
        });
        Object[] objArr31 = new Object[1];
        a((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26487), 180 - KeyEvent.getDeadChar(0, 0), 4 - ((Process.getThreadPriority(0) + 20) >> 6), objArr31);
        getDeviceData(map, ((String) objArr31[0]).intern(), new wn0.a() { // from class: atd.h.r
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ar_(application);
            }
        });
        Object[] objArr32 = new Object[1];
        a((char) (138 - (Process.myTid() >> 22)), 184 - KeyEvent.normalizeMetaState(0), 4 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr32);
        getDeviceData(map, ((String) objArr32[0]).intern(), new wn0.a() { // from class: atd.h.s
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.as_(application);
            }
        });
        Object[] objArr33 = new Object[1];
        a((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 50548), (Process.myPid() >> 22) + 188, TextUtils.lastIndexOf("", '0', 0, 0) + 5, objArr33);
        getDeviceData(map, ((String) objArr33[0]).intern(), new wn0.a() { // from class: atd.h.t
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.at_(application);
            }
        });
        Object[] objArr34 = new Object[1];
        a((char) (TextUtils.getOffsetBefore("", 0) + 35869), 192 - (ViewConfiguration.getWindowTouchSlop() >> 8), 4 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr34);
        getDeviceData(map, ((String) objArr34[0]).intern(), new wn0.a() { // from class: atd.h.u
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.au_(application);
            }
        });
        AuthenticationRequestParameters = (getSDKTransactionID + 37) % 128;
    }

    private final void w_(Map<String, DeviceParameterResult> map, Application application) {
        AuthenticationRequestParameters(new Object[]{this, map, application}, 1023740043, -1023740035, System.identityHashCode(this));
    }

    private final void x_(Map<String, DeviceParameterResult> map, Application application) {
        AuthenticationRequestParameters(new Object[]{this, map, application}, -2007178895, 2007178918, System.identityHashCode(this));
    }

    private final void y_(Map<String, DeviceParameterResult> map, final Application application) throws Throwable {
        getSDKTransactionID = (AuthenticationRequestParameters + 57) % 128;
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 372 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 4 - Drawable.resolveOpacity(0, 0), objArr);
        getDeviceData(map, ((String) objArr[0]).intern(), new wn0.a() { // from class: atd.h.y0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aM_(application);
            }
        });
        Object[] objArr2 = new Object[1];
        a((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), TextUtils.getCapsMode("", 0, 0) + 376, (-16777212) - Color.rgb(0, 0, 0), objArr2);
        getDeviceData(map, ((String) objArr2[0]).intern(), new wn0.a() { // from class: atd.h.j1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aN_(application);
            }
        });
        Object[] objArr3 = new Object[1];
        a((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4934), 380 - Color.blue(0), (ViewConfiguration.getTapTimeout() >> 16) + 4, objArr3);
        getDeviceData(map, ((String) objArr3[0]).intern(), new wn0.a() { // from class: atd.h.k1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aO_(application);
            }
        });
        Object[] objArr4 = new Object[1];
        a((char) (61814 - TextUtils.getTrimmedLength("")), 385 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), AndroidCharacter.getMirror('0') - ',', objArr4);
        getDeviceData(map, ((String) objArr4[0]).intern(), new wn0.a() { // from class: atd.h.l1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aP_(application);
            }
        });
        Object[] objArr5 = new Object[1];
        a((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30171), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 388, 4 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr5);
        getDeviceData(map, ((String) objArr5[0]).intern(), new wn0.a() { // from class: atd.h.m1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aQ_(application);
            }
        });
        Object[] objArr6 = new Object[1];
        a((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.indexOf("", "", 0) + 392, (ViewConfiguration.getJumpTapTimeout() >> 16) + 4, objArr6);
        getDeviceData(map, ((String) objArr6[0]).intern(), new wn0.a() { // from class: atd.h.n1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aR_(application);
            }
        });
        Object[] objArr7 = new Object[1];
        a((char) (30041 - View.combineMeasuredStates(0, 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 396, AndroidCharacter.getMirror('0') - ',', objArr7);
        getDeviceData(map, ((String) objArr7[0]).intern(), new wn0.a() { // from class: atd.h.p1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aS_(application);
            }
        });
        Object[] objArr8 = new Object[1];
        a((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 400, 4 - TextUtils.getOffsetBefore("", 0), objArr8);
        getDeviceData(map, ((String) objArr8[0]).intern(), new wn0.a() { // from class: atd.h.q1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aT_(application);
            }
        });
        Object[] objArr9 = new Object[1];
        a((char) TextUtils.indexOf("", ""), 404 - (ViewConfiguration.getScrollBarSize() >> 8), 4 - KeyEvent.normalizeMetaState(0), objArr9);
        getDeviceData(map, ((String) objArr9[0]).intern(), new wn0.a() { // from class: atd.h.r1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aU_(application);
            }
        });
        Object[] objArr10 = new Object[1];
        a((char) ((Process.myPid() >> 22) + 25199), 408 - KeyEvent.normalizeMetaState(0), Color.red(0) + 4, objArr10);
        getDeviceData(map, ((String) objArr10[0]).intern(), new wn0.a() { // from class: atd.h.s1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aV_(application);
            }
        });
        Object[] objArr11 = new Object[1];
        a((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 412 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.lastIndexOf("", '0', 0) + 5, objArr11);
        getDeviceData(map, ((String) objArr11[0]).intern(), new wn0.a() { // from class: atd.h.z0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aW_(application);
            }
        });
        Object[] objArr12 = new Object[1];
        a((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 416 - View.resolveSizeAndState(0, 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, objArr12);
        getDeviceData(map, ((String) objArr12[0]).intern(), new wn0.a() { // from class: atd.h.a1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aX_(application);
            }
        });
        Object[] objArr13 = new Object[1];
        a((char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getJumpTapTimeout() >> 16) + 420, 4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr13);
        getDeviceData(map, ((String) objArr13[0]).intern(), new wn0.a() { // from class: atd.h.b1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.hide();
            }
        });
        Object[] objArr14 = new Object[1];
        a((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 424 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 3 - ExpandableListView.getPackedPositionChild(0L), objArr14);
        getDeviceData(map, ((String) objArr14[0]).intern(), new wn0.a() { // from class: atd.h.c1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aY_(application);
            }
        });
        Object[] objArr15 = new Object[1];
        a((char) (776 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), View.MeasureSpec.getSize(0) + 428, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 4, objArr15);
        getDeviceData(map, ((String) objArr15[0]).intern(), new wn0.a() { // from class: atd.h.e1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aZ_(application);
            }
        });
        Object[] objArr16 = new Object[1];
        a((char) ((-1) - Process.getGidForName("")), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 432, 4 - View.resolveSizeAndState(0, 0, 0), objArr16);
        getDeviceData(map, ((String) objArr16[0]).intern(), new wn0.a() { // from class: atd.h.f1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ba_(application);
            }
        });
        Object[] objArr17 = new Object[1];
        a((char) Color.red(0), (KeyEvent.getMaxKeyCode() >> 16) + 436, 3 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr17);
        getDeviceData(map, ((String) objArr17[0]).intern(), new wn0.a() { // from class: atd.h.g1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bb_(application);
            }
        });
        Object[] objArr18 = new Object[1];
        a((char) TextUtils.getCapsMode("", 0, 0), 440 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 5 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr18);
        getDeviceData(map, ((String) objArr18[0]).intern(), new wn0.a() { // from class: atd.h.h1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bc_(application);
            }
        });
        Object[] objArr19 = new Object[1];
        a((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 20559), 444 - (Process.myTid() >> 22), Color.alpha(0) + 4, objArr19);
        getDeviceData(map, ((String) objArr19[0]).intern(), new wn0.a() { // from class: atd.h.i1
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bd_(application);
            }
        });
        int i11 = AuthenticationRequestParameters + 119;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private final void z_(Map<String, DeviceParameterResult> map, final Application application) throws Throwable {
        getSDKTransactionID = (AuthenticationRequestParameters + 79) % 128;
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 449, 4 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        getDeviceData(map, ((String) objArr[0]).intern(), new wn0.a() { // from class: atd.h.l2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.be_(application);
            }
        });
        Object[] objArr2 = new Object[1];
        a((char) (View.getDefaultSize(0, 0) + 2205), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 452, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, objArr2);
        getDeviceData(map, ((String) objArr2[0]).intern(), new wn0.a() { // from class: atd.h.v2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bf_(application);
            }
        });
        Object[] objArr3 = new Object[1];
        a((char) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE), 456 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 4, objArr3);
        getDeviceData(map, ((String) objArr3[0]).intern(), new wn0.a() { // from class: atd.h.w2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bg_(application);
            }
        });
        Object[] objArr4 = new Object[1];
        a((char) (46223 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), MotionEvent.axisFromString("") + 461, 4 - (Process.myTid() >> 22), objArr4);
        getDeviceData(map, ((String) objArr4[0]).intern(), new wn0.a() { // from class: atd.h.x2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bh_(application);
            }
        });
        Object[] objArr5 = new Object[1];
        a((char) KeyEvent.normalizeMetaState(0), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 464, TextUtils.getOffsetBefore("", 0) + 4, objArr5);
        getDeviceData(map, ((String) objArr5[0]).intern(), new wn0.a() { // from class: atd.h.z2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bi_(application);
            }
        });
        Object[] objArr6 = new Object[1];
        a((char) ((Process.getThreadPriority(0) + 20) >> 6), 468 - KeyEvent.keyCodeFromString(""), 4 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr6);
        getDeviceData(map, ((String) objArr6[0]).intern(), new wn0.a() { // from class: atd.h.a3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bj_(application);
            }
        });
        Object[] objArr7 = new Object[1];
        a((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 472 - TextUtils.getOffsetAfter("", 0), 4 - KeyEvent.normalizeMetaState(0), objArr7);
        getDeviceData(map, ((String) objArr7[0]).intern(), new wn0.a() { // from class: atd.h.b3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bk_(application);
            }
        });
        Object[] objArr8 = new Object[1];
        a((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 931), TextUtils.indexOf("", "") + 476, 4 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr8);
        getDeviceData(map, ((String) objArr8[0]).intern(), new wn0.a() { // from class: atd.h.c3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bl_(application);
            }
        });
        Object[] objArr9 = new Object[1];
        a((char) View.combineMeasuredStates(0, 0), View.resolveSizeAndState(0, 0, 0) + 480, 4 - KeyEvent.keyCodeFromString(""), objArr9);
        getDeviceData(map, ((String) objArr9[0]).intern(), new wn0.a() { // from class: atd.h.d3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bm_(application);
            }
        });
        Object[] objArr10 = new Object[1];
        a((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 483, 4 - ((Process.getThreadPriority(0) + 20) >> 6), objArr10);
        getDeviceData(map, ((String) objArr10[0]).intern(), new wn0.a() { // from class: atd.h.e3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bn_(application);
            }
        });
        Object[] objArr11 = new Object[1];
        a((char) (49443 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 488 - (Process.myPid() >> 22), 5 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr11);
        getDeviceData(map, ((String) objArr11[0]).intern(), new wn0.a() { // from class: atd.h.m2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bo_(application);
            }
        });
        Object[] objArr12 = new Object[1];
        a((char) (Color.red(0) + 57412), 492 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 4, objArr12);
        getDeviceData(map, ((String) objArr12[0]).intern(), new wn0.a() { // from class: atd.h.o2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bp_(application);
            }
        });
        Object[] objArr13 = new Object[1];
        a((char) (View.getDefaultSize(0, 0) + 3416), (ViewConfiguration.getWindowTouchSlop() >> 8) + DownloaderService.STATUS_HTTP_EXCEPTION, (ViewConfiguration.getPressedStateDuration() >> 16) + 4, objArr13);
        getDeviceData(map, ((String) objArr13[0]).intern(), new wn0.a() { // from class: atd.h.p2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bq_(application);
            }
        });
        Object[] objArr14 = new Object[1];
        a((char) (Color.red(0) + 49852), ExpandableListView.getPackedPositionChild(0L) + 501, View.MeasureSpec.getSize(0) + 4, objArr14);
        getDeviceData(map, ((String) objArr14[0]).intern(), new wn0.a() { // from class: atd.h.q2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.br_(application);
            }
        });
        Object[] objArr15 = new Object[1];
        a((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 7999), 504 - Drawable.resolveOpacity(0, 0), 4 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr15);
        getDeviceData(map, ((String) objArr15[0]).intern(), new wn0.a() { // from class: atd.h.r2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bs_(application);
            }
        });
        Object[] objArr16 = new Object[1];
        a((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 24999), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 508, 3 - TextUtils.lastIndexOf("", '0', 0), objArr16);
        getDeviceData(map, ((String) objArr16[0]).intern(), new wn0.a() { // from class: atd.h.s2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bt_(application);
            }
        });
        Object[] objArr17 = new Object[1];
        a((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 513, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, objArr17);
        getDeviceData(map, ((String) objArr17[0]).intern(), new wn0.a() { // from class: atd.h.t2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bu_(application);
            }
        });
        Object[] objArr18 = new Object[1];
        a((char) (50303 - (ViewConfiguration.getEdgeSlop() >> 16)), KeyEvent.getDeadChar(0, 0) + 516, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, objArr18);
        getDeviceData(map, ((String) objArr18[0]).intern(), new wn0.a() { // from class: atd.h.u2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.bv_(application);
            }
        });
        int i11 = getSDKTransactionID + 5;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 86 / 0;
        }
    }

    public final Map<String, DeviceParameterResult> t_(Application application) throws Throwable {
        p013kotlin.jvm.internal.s.k(application, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        u_(linkedHashMap, application);
        v_(linkedHashMap, application);
        AuthenticationRequestParameters(new Object[]{this, linkedHashMap, application}, 1023740043, -1023740035, System.identityHashCode(this));
        AuthenticationRequestParameters(new Object[]{this, linkedHashMap, application}, -2007178895, 2007178918, System.identityHashCode(this));
        AuthenticationRequestParameters(new Object[]{this, linkedHashMap}, 1131095259, -1131095256, System.identityHashCode(this));
        getDeviceData(linkedHashMap);
        y_(linkedHashMap, application);
        z_(linkedHashMap, application);
        A_(linkedHashMap, application);
        B_(linkedHashMap, application);
        getSDKAppID(linkedHashMap);
        C_(linkedHashMap, application);
        D_(linkedHashMap, application);
        getSDKTransactionID(linkedHashMap);
        AuthenticationRequestParameters(new Object[]{this, linkedHashMap, application}, 1481764803, -1481764770, System.identityHashCode(this));
        Map<String, DeviceParameterResult> mapA = p013kotlin.collections.v0.A(linkedHashMap);
        AuthenticationRequestParameters = (getSDKTransactionID + 97) % 128;
        return mapA;
    }

    private static /* synthetic */ Object BuildConfig(Object[] objArr) {
        atd.aa.ChallengeResult challengeResult = new atd.aa.ChallengeResult((Application) objArr[0]);
        int i11 = AuthenticationRequestParameters + 115;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 69 / 0;
        }
        return challengeResult;
    }

    private static /* synthetic */ Object ChallengeResult(Object[] objArr) throws Throwable {
        getMessageVersion getmessageversion = (getMessageVersion) objArr[0];
        Map<String, DeviceParameterResult> map = (Map) objArr[1];
        final Application application = (Application) objArr[2];
        AuthenticationRequestParameters = (getSDKTransactionID + 111) % 128;
        Object[] objArr2 = new Object[1];
        a((char) (1642 - Drawable.resolveOpacity(0, 0)), 253 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 4 - Color.red(0), objArr2);
        getmessageversion.getDeviceData(map, ((String) objArr2[0]).intern(), new wn0.a() { // from class: atd.h.e0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aI_(application);
            }
        });
        Object[] objArr3 = new Object[1];
        a((char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 60046), TextUtils.getOffsetAfter("", 0) + 256, AndroidCharacter.getMirror('0') - ',', objArr3);
        getmessageversion.getDeviceData(map, ((String) objArr3[0]).intern(), new wn0.a() { // from class: atd.h.f0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aJ_(application);
            }
        });
        Object[] objArr4 = new Object[1];
        a((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 55439), View.combineMeasuredStates(0, 0) + EnumC4419g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, 5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
        getmessageversion.getDeviceData(map, ((String) objArr4[0]).intern(), new wn0.a() { // from class: atd.h.g0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aK_(application);
            }
        });
        Object[] objArr5 = new Object[1];
        a((char) ((ViewConfiguration.getTouchSlop() >> 8) + 43779), 263 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 4 - TextUtils.getCapsMode("", 0, 0), objArr5);
        getmessageversion.getDeviceData(map, ((String) objArr5[0]).intern(), new wn0.a() { // from class: atd.h.i0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aL_(application);
            }
        });
        int i11 = getSDKTransactionID + 95;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 62 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object ChallengeResultCancelled(Object[] objArr) {
        atd.v.ChallengeResult challengeResult = new atd.v.ChallengeResult((Application) objArr[0]);
        int i11 = getSDKTransactionID + 83;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 37 / 0;
        }
        return challengeResult;
    }

    private static /* synthetic */ Object ChallengeResultCompleted(Object[] objArr) throws Throwable {
        String strIntern;
        wn0.a<? extends DeviceParameter> aVar;
        getMessageVersion getmessageversion = (getMessageVersion) objArr[0];
        Map<String, DeviceParameterResult> map = (Map) objArr[1];
        final Application application = (Application) objArr[2];
        int i11 = AuthenticationRequestParameters + 25;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            Object[] objArr2 = new Object[1];
            a((char) Color.green(0), ViewConfiguration.getMaximumDrawingCacheSize() + 15385, 3 << (Process.myPid() / 104), objArr2);
            strIntern = ((String) objArr2[0]).intern();
            aVar = new wn0.a() { // from class: atd.h.d0
                @Override // wn0.a
                public final Object invoke() {
                    return getMessageVersion.cf_(application);
                }
            };
        } else {
            Object[] objArr3 = new Object[1];
            a((char) Color.green(0), 672 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 4 - (Process.myPid() >> 22), objArr3);
            strIntern = ((String) objArr3[0]).intern();
            aVar = new wn0.a() { // from class: atd.h.d0
                @Override // wn0.a
                public final Object invoke() {
                    return getMessageVersion.cf_(application);
                }
            };
        }
        getmessageversion.getDeviceData(map, strIntern, aVar);
        int i12 = getSDKTransactionID + 97;
        AuthenticationRequestParameters = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 82 / 0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResultError() {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[0], 525896728, -525896697, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter ChallengeResultTimeout() {
        atd.m.AuthenticationRequestParameters authenticationRequestParameters = new atd.m.AuthenticationRequestParameters();
        int i11 = AuthenticationRequestParameters + 111;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return authenticationRequestParameters;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0212  */
    /* JADX WARN: Code duplicated, block: B:49:0x0213  */
    private static void a(char c11, int i11, int i12, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13;
        Object method;
        atd.az.BuildConfig buildConfig = new atd.az.BuildConfig();
        long[] jArr = new long[i12];
        int i14 = 0;
        buildConfig.getDeviceData = 0;
        while (true) {
            int i15 = buildConfig.getDeviceData;
            if (i15 >= i12) {
                break;
            }
            $11 = ($10 + 113) % 128;
            try {
                Object[] objArr2 = {Integer.valueOf(getDeviceData[i11 + i15])};
                Map map = atd.a.getMessageVersion.timedout;
                Object obj = map.get(1019086628);
                Class cls = Integer.TYPE;
                if (obj != null) {
                    method = obj;
                    i13 = i14;
                } else {
                    i13 = i14;
                    Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1774 - View.MeasureSpec.getSize(i13), (char) (Process.myTid() >> 22), (ViewConfiguration.getLongPressTimeout() >> 16) + 32);
                    byte b11 = (byte) ($$b & 1);
                    byte b12 = (byte) (b11 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls2.getMethod((String) objArr3[i13], cls);
                    map.put(1019086628, method);
                }
                Long l11 = (Long) ((Method) method).invoke(null, objArr2);
                l11.longValue();
                long j11 = buildConfig.getDeviceData;
                long j12 = getSDKReferenceNumber;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c11);
                objArr4[2] = Long.valueOf(j12);
                objArr4[1] = Long.valueOf(j11);
                objArr4[i13] = l11;
                Object method2 = map.get(-1106061844);
                if (method2 == null) {
                    int i16 = i13;
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getFadingEdgeLength() >> 16) + 441, (char) Color.blue(i13), TextUtils.lastIndexOf("", '0', i16, i16) + 38);
                    Class cls4 = Long.TYPE;
                    method2 = cls3.getMethod("n", cls4, cls4, cls4, cls);
                    map.put(-1106061844, method2);
                }
                jArr[i15] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr5 = {buildConfig, buildConfig};
                Object method3 = map.get(1947342796);
                if (method3 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1918 - MotionEvent.axisFromString(""), (char) Color.red(0), View.combineMeasuredStates(0, 0) + 29);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map.put(1947342796, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                jArr = jArr;
                i14 = 0;
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
        char[] cArr = new char[i12];
        buildConfig.getDeviceData = 0;
        while (true) {
            int i17 = buildConfig.getDeviceData;
            if (i17 >= i12) {
                break;
            }
            int i18 = $11 + 35;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                cArr[i17] = (char) jArr2[i17];
                Object[] objArr7 = {buildConfig, buildConfig};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method4 = map2.get(1947342796);
                if (method4 == null) {
                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1918 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 30);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, b16, objArr8);
                    method4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                    map2.put(1947342796, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                int i19 = 87 / 0;
            } else {
                cArr[i17] = (char) jArr2[i17];
                Object[] objArr9 = {buildConfig, buildConfig};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method5 = map3.get(1947342796);
                if (method5 == null) {
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.green(0) + 1919, (char) View.getDefaultSize(0, 0), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    byte b17 = (byte) 0;
                    byte b18 = b17;
                    Object[] objArr10 = new Object[1];
                    b(b17, b18, b18, objArr10);
                    method5 = cls7.getMethod((String) objArr10[0], Object.class, Object.class);
                    map3.put(1947342796, method5);
                }
                ((Method) method5).invoke(null, objArr9);
            }
        }
        String str = new String(cArr);
        int i21 = $11 + 87;
        $10 = i21 % 128;
        if (i21 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = atd.h.getMessageVersion.$$a
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r5 = r5 * 5
            int r5 = 113 - r5
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r1[r7]
        L2a:
            int r7 = r7 + 1
            int r3 = -r3
            int r5 = r5 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.h.getMessageVersion.b(short, short, short, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object getAdditionalDetails(Object[] objArr) {
        atd.r.getSDKReferenceNumber getsdkreferencenumber = new atd.r.getSDKReferenceNumber((Application) objArr[0]);
        int i11 = AuthenticationRequestParameters + 39;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 13 / 0;
        }
        return getsdkreferencenumber;
    }

    private final void getDeviceData(Map<String, DeviceParameterResult> map) throws Throwable {
        getSDKTransactionID = (AuthenticationRequestParameters + 75) % 128;
        Object[] objArr = new Object[1];
        a((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 56294), 351 - TextUtils.indexOf((CharSequence) "", '0', 0), Gravity.getAbsoluteGravity(0, 0) + 4, objArr);
        getDeviceData(map, ((String) objArr[0]).intern(), new wn0.a() { // from class: atd.h.a
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.InitializeResult();
            }
        });
        Object[] objArr2 = new Object[1];
        a((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ExpandableListView.getPackedPositionGroup(0L) + 356, 4 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
        getDeviceData(map, ((String) objArr2[0]).intern(), new wn0.a() { // from class: atd.h.c2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.InitializeResultFailure();
            }
        });
        Object[] objArr3 = new Object[1];
        a((char) TextUtils.indexOf("", ""), 361 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 4, objArr3);
        getDeviceData(map, ((String) objArr3[0]).intern(), new wn0.a() { // from class: atd.h.n2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.InitializeResultSuccess();
            }
        });
        Object[] objArr4 = new Object[1];
        a((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 364 - View.resolveSizeAndState(0, 0, 0), 4 - Gravity.getAbsoluteGravity(0, 0), objArr4);
        getDeviceData(map, ((String) objArr4[0]).intern(), new wn0.a() { // from class: atd.h.y2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.equals();
            }
        });
        Object[] objArr5 = new Object[1];
        a((char) (ViewConfiguration.getTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 368, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3, objArr5);
        getDeviceData(map, ((String) objArr5[0]).intern(), new wn0.a() { // from class: atd.h.j3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.show();
            }
        });
        AuthenticationRequestParameters = (getSDKTransactionID + 27) % 128;
    }

    private static /* synthetic */ Object getMessageVersion(Object[] objArr) {
        atd.t.getSDKReferenceNumber getsdkreferencenumber = new atd.t.getSDKReferenceNumber((Application) objArr[0]);
        int i11 = AuthenticationRequestParameters + 97;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return getsdkreferencenumber;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) throws Throwable {
        getMessageVersion getmessageversion = (getMessageVersion) objArr[0];
        Map<String, DeviceParameterResult> map = (Map) objArr[1];
        AuthenticationRequestParameters = (getSDKTransactionID + 115) % 128;
        Object[] objArr2 = new Object[1];
        a((char) (Color.alpha(0) + 12360), 268 - View.resolveSizeAndState(0, 0, 0), 3 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
        getmessageversion.getDeviceData(map, ((String) objArr2[0]).intern(), new wn0.a() { // from class: atd.h.f3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ChallengeResultCancelled();
            }
        });
        Object[] objArr3 = new Object[1];
        a((char) Color.green(0), 272 - TextUtils.getCapsMode("", 0, 0), 4 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
        getmessageversion.getDeviceData(map, ((String) objArr3[0]).intern(), new wn0.a() { // from class: atd.h.r3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ChallengeResultTimeout();
            }
        });
        Object[] objArr4 = new Object[1];
        a((char) TextUtils.getOffsetAfter("", 0), KeyEvent.normalizeMetaState(0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, 4 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr4);
        getmessageversion.getDeviceData(map, ((String) objArr4[0]).intern(), new wn0.a() { // from class: atd.h.t3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ChallengeResultCompleted();
            }
        });
        Object[] objArr5 = new Object[1];
        a((char) (32376 - View.MeasureSpec.getSize(0)), 280 - Color.green(0), 3 - TextUtils.indexOf((CharSequence) "", '0'), objArr5);
        getmessageversion.getDeviceData(map, ((String) objArr5[0]).intern(), new wn0.a() { // from class: atd.h.v3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ChallengeResultError();
            }
        });
        Object[] objArr6 = new Object[1];
        a((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 284 - (ViewConfiguration.getWindowTouchSlop() >> 8), 5 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr6);
        getmessageversion.getDeviceData(map, ((String) objArr6[0]).intern(), new wn0.a() { // from class: atd.h.w3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.getAdditionalDetails();
            }
        });
        Object[] objArr7 = new Object[1];
        a((char) (26516 - TextUtils.getOffsetBefore("", 0)), 289 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 4 - Color.argb(0, 0, 0, 0), objArr7);
        getmessageversion.getDeviceData(map, ((String) objArr7[0]).intern(), new wn0.a() { // from class: atd.h.x3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.getTransactionStatus();
            }
        });
        Object[] objArr8 = new Object[1];
        a((char) Color.red(0), 291 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.getDefaultSize(0, 0) + 4, objArr8);
        getmessageversion.getDeviceData(map, ((String) objArr8[0]).intern(), new wn0.a() { // from class: atd.h.y3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.completed();
            }
        });
        Object[] objArr9 = new Object[1];
        a((char) (ExpandableListView.getPackedPositionGroup(0L) + 56390), TextUtils.getOffsetBefore("", 0) + EnumC4419g.SDK_ASSET_LOADING_INDICATOR_VALUE, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5, objArr9);
        getmessageversion.getDeviceData(map, ((String) objArr9[0]).intern(), new wn0.a() { // from class: atd.h.z3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.onCompletion();
            }
        });
        Object[] objArr10 = new Object[1];
        a((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 376), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + EnumC4419g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, 3 - TextUtils.lastIndexOf("", '0', 0), objArr10);
        getmessageversion.getDeviceData(map, ((String) objArr10[0]).intern(), new wn0.a() { // from class: atd.h.a4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ChallengeResultKt();
            }
        });
        Object[] objArr11 = new Object[1];
        a((char) Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, objArr11);
        getmessageversion.getDeviceData(map, ((String) objArr11[0]).intern(), new wn0.a() { // from class: atd.h.b4
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ChallengeStatusReceiver();
            }
        });
        Object[] objArr12 = new Object[1];
        a((char) (View.getDefaultSize(0, 0) + 30286), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 307, 3 - Process.getGidForName(""), objArr12);
        getmessageversion.getDeviceData(map, ((String) objArr12[0]).intern(), new wn0.a() { // from class: atd.h.g3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ChallengeStatusHandler();
            }
        });
        Object[] objArr13 = new Object[1];
        a((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + EnumC4419g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE, TextUtils.indexOf("", "", 0, 0) + 4, objArr13);
        getmessageversion.getDeviceData(map, ((String) objArr13[0]).intern(), new wn0.a() { // from class: atd.h.h3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.protocolError();
            }
        });
        Object[] objArr14 = new Object[1];
        a((char) (Process.myTid() >> 22), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + EnumC4419g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, 3 - Process.getGidForName(""), objArr14);
        getmessageversion.getDeviceData(map, ((String) objArr14[0]).intern(), new wn0.a() { // from class: atd.h.i3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.CompletionEvent();
            }
        });
        Object[] objArr15 = new Object[1];
        a((char) View.MeasureSpec.getSize(0), Color.alpha(0) + 320, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, objArr15);
        getmessageversion.getDeviceData(map, ((String) objArr15[0]).intern(), new wn0.a() { // from class: atd.h.k3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.runtimeError();
            }
        });
        Object[] objArr16 = new Object[1];
        a((char) (ViewConfiguration.getPressedStateDuration() >> 16), 323 - TextUtils.lastIndexOf("", '0', 0), 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr16);
        getmessageversion.getDeviceData(map, ((String) objArr16[0]).intern(), new wn0.a() { // from class: atd.h.l3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.timedout();
            }
        });
        Object[] objArr17 = new Object[1];
        a((char) View.combineMeasuredStates(0, 0), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + EnumC4419g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, ExpandableListView.getPackedPositionChild(0L) + 5, objArr17);
        getmessageversion.getDeviceData(map, ((String) objArr17[0]).intern(), new wn0.a() { // from class: atd.h.m3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.cancelled();
            }
        });
        Object[] objArr18 = new Object[1];
        a((char) View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 331, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, objArr18);
        getmessageversion.getDeviceData(map, ((String) objArr18[0]).intern(), new wn0.a() { // from class: atd.h.n3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.getErrorDescription();
            }
        });
        Object[] objArr19 = new Object[1];
        a((char) (60484 - TextUtils.getOffsetAfter("", 0)), TextUtils.getOffsetAfter("", 0) + 336, (ViewConfiguration.getTouchSlop() >> 8) + 4, objArr19);
        getmessageversion.getDeviceData(map, ((String) objArr19[0]).intern(), new wn0.a() { // from class: atd.h.o3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.getErrorDetails();
            }
        });
        Object[] objArr20 = new Object[1];
        a((char) TextUtils.getOffsetAfter("", 0), View.getDefaultSize(0, 0) + 340, TextUtils.lastIndexOf("", '0') + 5, objArr20);
        getmessageversion.getDeviceData(map, ((String) objArr20[0]).intern(), new wn0.a() { // from class: atd.h.p3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.getTransactionID();
            }
        });
        Object[] objArr21 = new Object[1];
        a((char) (16616 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), Color.blue(0) + 344, Gravity.getAbsoluteGravity(0, 0) + 4, objArr21);
        getmessageversion.getDeviceData(map, ((String) objArr21[0]).intern(), new wn0.a() { // from class: atd.h.q3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ErrorMessage();
            }
        });
        Object[] objArr22 = new Object[1];
        a((char) (60238 - Process.getGidForName("")), (Process.myPid() >> 22) + 348, 4 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr22);
        getmessageversion.getDeviceData(map, ((String) objArr22[0]).intern(), new wn0.a() { // from class: atd.h.s3
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.getErrorCode();
            }
        });
        int i11 = getSDKTransactionID + 21;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKEphemeralPublicKey(Object[] objArr) {
        atd.aa.getAdditionalDetails getadditionaldetails = new atd.aa.getAdditionalDetails((Application) objArr[0]);
        int i11 = getSDKTransactionID + 81;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return getadditionaldetails;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getSDKReferenceNumber() {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[0], 926514327, -926514305, (int) System.currentTimeMillis());
    }

    private final void getSDKTransactionID(Map<String, DeviceParameterResult> map) throws Throwable {
        String strIntern;
        wn0.a<? extends DeviceParameter> aVar;
        int i11 = getSDKTransactionID + 13;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a((char) ((-1) / (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 22452 - Color.argb(1, 1, 0, 1), 3 << View.getDefaultSize(0, 1), objArr);
            strIntern = ((String) objArr[0]).intern();
            aVar = new wn0.a() { // from class: atd.h.i2
                @Override // wn0.a
                public final Object invoke() {
                    return getMessageVersion.ThreeDS2Service();
                }
            };
        } else {
            Object[] objArr2 = new Object[1];
            a((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0) + 668, View.getDefaultSize(0, 0) + 4, objArr2);
            strIntern = ((String) objArr2[0]).intern();
            aVar = new wn0.a() { // from class: atd.h.i2
                @Override // wn0.a
                public final Object invoke() {
                    return getMessageVersion.ThreeDS2Service();
                }
            };
        }
        getDeviceData(map, strIntern, aVar);
        int i12 = AuthenticationRequestParameters + 77;
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getTransactionStatus(Object[] objArr) {
        atd.t.AuthenticationRequestParameters authenticationRequestParameters = new atd.t.AuthenticationRequestParameters((Application) objArr[0]);
        int i11 = getSDKTransactionID + 101;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 33 / 0;
        }
        return authenticationRequestParameters;
    }

    private final DeviceParameterResult getSDKTransactionID(String str) {
        AuthenticationRequestParameters = (getSDKTransactionID + 89) % 128;
        Collection<String> collection = this.getSDKAppID;
        if (collection == null || !collection.contains(str)) {
            return null;
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.RESTRICTED);
        AuthenticationRequestParameters = (getSDKTransactionID + 33) % 128;
        return failure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter getSDKTransactionID() {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[0], 757351645, -757351633, (int) System.currentTimeMillis());
    }

    private final void getDeviceData(Map<String, DeviceParameterResult> map, String str, wn0.a<? extends DeviceParameter> aVar) {
        DeviceParameterResult sDKTransactionID = getSDKTransactionID(str);
        if (sDKTransactionID == null) {
            AuthenticationRequestParameters = (getSDKTransactionID + 75) % 128;
            DeviceParameter deviceParameterInvoke = aVar.invoke();
            sDKTransactionID = (DeviceParameterResult) DeviceParameter.getSDKTransactionID(new Object[]{deviceParameterInvoke}, 1790528185, -1790528183, System.identityHashCode(deviceParameterInvoke));
            AuthenticationRequestParameters = (getSDKTransactionID + 3) % 128;
        }
        map.put(str, sDKTransactionID);
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) throws Throwable {
        getMessageVersion getmessageversion = (getMessageVersion) objArr[0];
        Map map = (Map) objArr[1];
        Application application = (Application) objArr[2];
        Object[] objArr2 = new Object[1];
        a((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 676 - TextUtils.indexOf("", ""), 4 - KeyEvent.normalizeMetaState(0), objArr2);
        DeviceParameterResult sDKTransactionID = getmessageversion.getSDKTransactionID(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a((char) (41057 - (Process.myPid() >> 22)), 680 - TextUtils.indexOf("", ""), TextUtils.indexOf("", "") + 4, objArr3);
        DeviceParameterResult sDKTransactionID2 = getmessageversion.getSDKTransactionID(((String) objArr3[0]).intern());
        if (sDKTransactionID != null) {
            int i11 = AuthenticationRequestParameters;
            int i12 = i11 + 115;
            getSDKTransactionID = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            if (sDKTransactionID2 != null) {
                getSDKTransactionID = (i11 + 77) % 128;
                Object[] objArr4 = new Object[1];
                a((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 676 - (ViewConfiguration.getScrollBarSize() >> 8), 5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
                map.put(((String) objArr4[0]).intern(), sDKTransactionID);
                Object[] objArr5 = new Object[1];
                a((char) (41057 - Color.red(0)), 681 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4, objArr5);
                map.put(((String) objArr5[0]).intern(), sDKTransactionID2);
                return null;
            }
        }
        atd.l.ChallengeResultTimeout challengeResultTimeout = new atd.l.ChallengeResultTimeout(application);
        Object[] objArr6 = new Object[1];
        a((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 676, 4 - TextUtils.getOffsetBefore("", 0), objArr6);
        String strIntern = ((String) objArr6[0]).intern();
        if (sDKTransactionID == null) {
            atd.l.ChallengeResult challengeResult = new atd.l.ChallengeResult(challengeResultTimeout);
            sDKTransactionID = (DeviceParameterResult) DeviceParameter.getSDKTransactionID(new Object[]{challengeResult}, 1790528185, -1790528183, System.identityHashCode(challengeResult));
            getSDKTransactionID = (AuthenticationRequestParameters + 109) % 128;
        }
        map.put(strIntern, sDKTransactionID);
        Object[] objArr7 = new Object[1];
        a((char) (41057 - TextUtils.indexOf("", "", 0)), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 680, (ViewConfiguration.getFadingEdgeLength() >> 16) + 4, objArr7);
        String strIntern2 = ((String) objArr7[0]).intern();
        if (sDKTransactionID2 == null) {
            atd.l.ChallengeResultCompleted challengeResultCompleted = new atd.l.ChallengeResultCompleted(challengeResultTimeout);
            sDKTransactionID2 = (DeviceParameterResult) DeviceParameter.getSDKTransactionID(new Object[]{challengeResultCompleted}, 1790528185, -1790528183, System.identityHashCode(challengeResultCompleted));
            getSDKTransactionID = (AuthenticationRequestParameters + 63) % 128;
        }
        map.put(strIntern2, sDKTransactionID2);
        return null;
    }

    private final void getSDKAppID(Map<String, DeviceParameterResult> map) throws Throwable {
        AuthenticationRequestParameters = (getSDKTransactionID + 121) % 128;
        Object[] objArr = new Object[1];
        a((char) (20193 - (KeyEvent.getMaxKeyCode() >> 16)), TextUtils.getOffsetAfter("", 0) + 640, 4 - Gravity.getAbsoluteGravity(0, 0), objArr);
        getDeviceData(map, ((String) objArr[0]).intern(), new wn0.a() { // from class: atd.h.k2
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.InitializeResultKt();
            }
        });
        AuthenticationRequestParameters = (getSDKTransactionID + 105) % 128;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) throws Throwable {
        getMessageVersion getmessageversion = (getMessageVersion) objArr[0];
        Map<String, DeviceParameterResult> map = (Map) objArr[1];
        final Application application = (Application) objArr[2];
        getSDKTransactionID = (AuthenticationRequestParameters + 27) % 128;
        Object[] objArr2 = new Object[1];
        a((char) (62001 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 196 - View.MeasureSpec.getMode(0), 4 - TextUtils.getTrimmedLength(""), objArr2);
        getmessageversion.getDeviceData(map, ((String) objArr2[0]).intern(), new wn0.a() { // from class: atd.h.j0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.BuildConfig();
            }
        });
        Object[] objArr3 = new Object[1];
        a((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4, objArr3);
        getmessageversion.getDeviceData(map, ((String) objArr3[0]).intern(), new wn0.a() { // from class: atd.h.o0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.av_(application);
            }
        });
        Object[] objArr4 = new Object[1];
        a((char) (AndroidCharacter.getMirror('0') + 45895), 204 - (ViewConfiguration.getTouchSlop() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, objArr4);
        getmessageversion.getDeviceData(map, ((String) objArr4[0]).intern(), new wn0.a() { // from class: atd.h.p0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aw_(application);
            }
        });
        Object[] objArr5 = new Object[1];
        a((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 209 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, objArr5);
        getmessageversion.getDeviceData(map, ((String) objArr5[0]).intern(), new wn0.a() { // from class: atd.h.q0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ax_(application);
            }
        });
        Object[] objArr6 = new Object[1];
        a((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 773), View.MeasureSpec.makeMeasureSpec(0, 0) + EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE, TextUtils.getOffsetAfter("", 0) + 4, objArr6);
        getmessageversion.getDeviceData(map, ((String) objArr6[0]).intern(), new wn0.a() { // from class: atd.h.r0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.ay_(application);
            }
        });
        Object[] objArr7 = new Object[1];
        a((char) (((Process.getThreadPriority(0) + 20) >> 6) + 43670), 217 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 4 - View.MeasureSpec.getMode(0), objArr7);
        getmessageversion.getDeviceData(map, ((String) objArr7[0]).intern(), new wn0.a() { // from class: atd.h.t0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.az_(application);
            }
        });
        Object[] objArr8 = new Object[1];
        a((char) (40134 - View.resolveSizeAndState(0, 0, 0)), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 4 - Color.alpha(0), objArr8);
        getmessageversion.getDeviceData(map, ((String) objArr8[0]).intern(), new wn0.a() { // from class: atd.h.u0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aA_(application);
            }
        });
        Object[] objArr9 = new Object[1];
        a((char) (65046 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, (ViewConfiguration.getTapTimeout() >> 16) + 4, objArr9);
        getmessageversion.getDeviceData(map, ((String) objArr9[0]).intern(), new wn0.a() { // from class: atd.h.v0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aB_(application);
            }
        });
        Object[] objArr10 = new Object[1];
        a((char) ExpandableListView.getPackedPositionType(0L), 228 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3, objArr10);
        getmessageversion.getDeviceData(map, ((String) objArr10[0]).intern(), new wn0.a() { // from class: atd.h.w0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aC_(application);
            }
        });
        Object[] objArr11 = new Object[1];
        a((char) (46130 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Color.argb(0, 0, 0, 0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 3 - TextUtils.lastIndexOf("", '0', 0), objArr11);
        getmessageversion.getDeviceData(map, ((String) objArr11[0]).intern(), new wn0.a() { // from class: atd.h.x0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aD_(application);
            }
        });
        Object[] objArr12 = new Object[1];
        a((char) (Process.myTid() >> 22), 236 - (ViewConfiguration.getFadingEdgeLength() >> 16), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 3, objArr12);
        getmessageversion.getDeviceData(map, ((String) objArr12[0]).intern(), new wn0.a() { // from class: atd.h.k0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aE_(application);
            }
        });
        Object[] objArr13 = new Object[1];
        a((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 240 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 4 - Gravity.getAbsoluteGravity(0, 0), objArr13);
        getmessageversion.getDeviceData(map, ((String) objArr13[0]).intern(), new wn0.a() { // from class: atd.h.l0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aF_(application);
            }
        });
        Object[] objArr14 = new Object[1];
        a((char) (KeyEvent.getMaxKeyCode() >> 16), Color.green(0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, 4 - (Process.myPid() >> 22), objArr14);
        getmessageversion.getDeviceData(map, ((String) objArr14[0]).intern(), new wn0.a() { // from class: atd.h.m0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aG_(application);
            }
        });
        Object[] objArr15 = new Object[1];
        a((char) (38156 - MotionEvent.axisFromString("")), TextUtils.lastIndexOf("", '0', 0, 0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3, objArr15);
        getmessageversion.getDeviceData(map, ((String) objArr15[0]).intern(), new wn0.a() { // from class: atd.h.n0
            @Override // wn0.a
            public final Object invoke() {
                return getMessageVersion.aH_(application);
            }
        });
        int i11 = getSDKTransactionID + 99;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 80 / 0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceParameter AuthenticationRequestParameters() {
        return (DeviceParameter) AuthenticationRequestParameters(new Object[0], 519612905, -519612885, (int) System.currentTimeMillis());
    }

    private final void AuthenticationRequestParameters(Map<String, DeviceParameterResult> map) {
        AuthenticationRequestParameters(new Object[]{this, map}, 1131095259, -1131095256, System.identityHashCode(this));
    }
}
