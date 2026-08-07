package atd.d;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.completed;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import wo0.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH\u0000\u001a\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0015*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH\u0002\u001a\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH\u0002\u001a\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH\u0002\u001a\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH\u0002\u001a\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0015*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH\u0002\u001a\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH\u0002\u001a\f\u0010\u001b\u001a\u00020\u0007*\u00020\tH\u0002\u001a\u000e\u0010\u001c\u001a\u00020\u0007*\u0004\u0018\u00010\tH\u0002¨\u0006\u001d"}, d2 = {"getInt", "Lcom/adyen/threeds2/internal/result/Result;", "", "Lkotlinx/serialization/json/JsonObject;", "field", "Lcom/adyen/threeds2/internal/result/MessageField;", "getBoolean", "", "getString", "", "getOptString", "getJsonObject", "getOptJsonObject", "getUuid", "getOptUuid", "getJsonArray", "Lkotlinx/serialization/json/JsonArray;", "getOptJsonArray", "asJsonObject", "Lkotlinx/serialization/json/JsonElement;", "getStringResult", "Lcom/adyen/threeds2/internal/api/JsonResult;", "getIntResult", "getBooleanResult", "getJsonObjectResult", "getUuidResult", "getJsonArrayResult", "isValidUUID", "isEmptyOrNull", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getMessageVersion {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static char getSDKReferenceNumber;
    private static long getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getDeviceData = 1;
        AuthenticationRequestParameters = new char[]{52401, 52402, 52410, 53061, 52403, 52408, 53056, 52395, 52397, 52411, 52392, 52400, 53062, 52452, 52409, 52415, 52412, 52379, 52404, 52478, 52372, 52376, 52396, 52413, 52391, 52375, 52365, 52407, 53060, 52368, 52369, 52394, 52371, 53063, 52414, 52398};
        getSDKReferenceNumber = (char) 63810;
        getSDKTransactionID = 5692610325719439065L;
    }

    public static final atd.am.getSDKAppID<String> AuthenticationRequestParameters(JsonObject jsonObject, atd.am.getDeviceData getdevicedata) throws Throwable {
        getSDKAppID = (getDeviceData + 71) % 128;
        s.k(jsonObject, "");
        s.k(getdevicedata, "");
        getAdditionalDetails<String> sDKAppID = getSDKAppID(jsonObject, getdevicedata.AuthenticationRequestParameters());
        if (sDKAppID instanceof getAdditionalDetails.getDeviceData) {
            getAdditionalDetails.getDeviceData getdevicedata2 = (getAdditionalDetails.getDeviceData) sDKAppID;
            return new atd.am.getSDKAppID.getDeviceData(getAdditionalDetails.getDeviceData.getSDKAppID(new Object[]{getdevicedata2}, -825152795, 825152795, System.identityHashCode(getdevicedata2)));
        }
        if (s.f(sDKAppID, getAdditionalDetails.getSDKReferenceNumber.getDeviceData)) {
            atd.am.ChallengeResultCancelled challengeResultCancelled = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_EMPTY;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a(14 - TextUtils.indexOf((CharSequence) "", '0'), "\u001b!\u0007\u0003\u0001\u0014!\u001a㘊㘊\u001d\t\u000f\u000e㗛", (byte) (33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(getdevicedata);
            atd.am.getSDKAppID.getSDKTransactionID getsdktransactionid = new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled, new atd.z.AuthenticationRequestParameters(sb2.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_MISSING, challengeResultCancelled, getdevicedata), getdevicedata, null, 8);
            getSDKAppID = (getDeviceData + 51) % 128;
            return getsdktransactionid;
        }
        if (s.f(sDKAppID, getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID)) {
            atd.am.ChallengeResultCancelled challengeResultCancelled2 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_MISSING_REQUIRED;
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a(View.resolveSizeAndState(0, 0, 0) + 15, "\u001b!\u0007\u0003\u0001\u0014!\u001a㘊㘊\u001d\t\u000f\u000e㗛", (byte) (32 - ImageFormat.getBitsPerPixel(0)), objArr2);
            sb3.append(((String) objArr2[0]).intern());
            sb3.append(getdevicedata);
            return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled2, new atd.z.AuthenticationRequestParameters(sb3.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_MISSING, challengeResultCancelled2, getdevicedata), getdevicedata, null, 8);
        }
        if (!s.f(sDKAppID, getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters)) {
            throw new NoWhenBranchMatchedException();
        }
        atd.am.ChallengeResultCancelled challengeResultCancelled3 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_INVALID_FORMAT;
        StringBuilder sb4 = new StringBuilder();
        Object[] objArr3 = new Object[1];
        a((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 15, "\u001b!\u0007\u0003\u0001\u0014!\u001a㘊㘊\u001d\t\u000f\u000e㗛", (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32), objArr3);
        sb4.append(((String) objArr3[0]).intern());
        sb4.append(getdevicedata);
        return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled3, new atd.z.AuthenticationRequestParameters(sb4.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_MISSING, challengeResultCancelled3, getdevicedata), getdevicedata, null, 8);
    }

    public static final atd.am.getSDKAppID<String> BuildConfig(JsonObject jsonObject, atd.am.getDeviceData getdevicedata) throws Throwable {
        getSDKAppID = (getDeviceData + 1) % 128;
        s.k(jsonObject, "");
        s.k(getdevicedata, "");
        getAdditionalDetails getadditionaldetails = (getAdditionalDetails) getSDKAppID(new Object[]{jsonObject, getdevicedata.AuthenticationRequestParameters()}, 1994116073, -1994116071, (int) System.currentTimeMillis());
        if (getadditionaldetails instanceof getAdditionalDetails.getDeviceData) {
            getAdditionalDetails.getDeviceData getdevicedata2 = (getAdditionalDetails.getDeviceData) getadditionaldetails;
            return new atd.am.getSDKAppID.getDeviceData(getAdditionalDetails.getDeviceData.getSDKAppID(new Object[]{getdevicedata2}, -825152795, 825152795, System.identityHashCode(getdevicedata2)));
        }
        if (s.f(getadditionaldetails, getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID)) {
            return new atd.am.getSDKAppID.getDeviceData(null);
        }
        if (s.f(getadditionaldetails, getAdditionalDetails.getSDKReferenceNumber.getDeviceData)) {
            atd.am.ChallengeResultCancelled challengeResultCancelled = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_EMPTY;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            b("塅鿐堀纸ᧉ爠鷙\u0ef1䇬㾴塦ꎴ殀▨㹔젷ᔕ", Gravity.getAbsoluteGravity(0, 0), objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(getdevicedata);
            return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled, new atd.z.AuthenticationRequestParameters(sb2.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, challengeResultCancelled, getdevicedata), getdevicedata, null, 8);
        }
        if (!s.f(getadditionaldetails, getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters)) {
            throw new NoWhenBranchMatchedException();
        }
        atd.am.ChallengeResultCancelled challengeResultCancelled2 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_INVALID_FORMAT;
        StringBuilder sb3 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        b("⬌怔⭅韽\ue60e魣헁䛼㊰쀹넡\uebf0\u18f9\uda55휼聄晜뎖췊Ꙃ䱬跆\ue3bc밅ꩰ柴ᨿ劰", ViewConfiguration.getDoubleTapTimeout() >> 16, objArr2);
        sb3.append(((String) objArr2[0]).intern());
        sb3.append(getdevicedata.AuthenticationRequestParameters());
        atd.am.getSDKAppID.getSDKTransactionID getsdktransactionid = new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled2, new atd.z.AuthenticationRequestParameters(sb3.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, challengeResultCancelled2, getdevicedata), getdevicedata, null, 8);
        getSDKAppID = (getDeviceData + 47) % 128;
        return getsdktransactionid;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005b, code lost:
    
        if ((r11 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (p013kotlin.jvm.internal.s.f(r11, atd.d.getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        return new atd.am.getSDKAppID.getDeviceData(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (p013kotlin.jvm.internal.s.f(r11, atd.d.getAdditionalDetails.getSDKReferenceNumber.getDeviceData) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        r5 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_EMPTY;
        r11 = new java.lang.StringBuilder();
        r1 = new java.lang.Object[1];
        a(android.text.TextUtils.getOffsetAfter("", 0) + 16, "\u001b!\u0007\u0003\u0001\u0014\u001a\t\u0015\u0007\u0005\"\u001e\u0019\u0013\u0019", (byte) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 83), r1);
        r11.append(((java.lang.String) r1[0]).intern());
        r11.append(r12);
        r4 = new atd.am.getSDKAppID.getSDKTransactionID(r5, new atd.z.AuthenticationRequestParameters(r11.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, r5, r12), r12, null, 8);
        r11 = atd.d.getMessageVersion.getDeviceData + 9;
        atd.d.getMessageVersion.getSDKAppID = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bf, code lost:
    
        if ((r11 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c1, code lost:
    
        r11 = 95 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cc, code lost:
    
        if (p013kotlin.jvm.internal.s.f(r11, atd.d.getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ce, code lost:
    
        r6 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_INVALID_FORMAT;
        r11 = new java.lang.StringBuilder();
        r0 = new java.lang.Object[1];
        b("뽪툡뼬뵔吼뇙\udf70䱀ꛞ牅鮂\ue103貾栕ﶵ諒\uf23aƳ\ue76d고\ud843㿱쥜뚺㸕헗チ塍◾\uf34f᪼", 1 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)), r0);
        r11.append(((java.lang.String) r0[0]).intern());
        r11.append(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0108, code lost:
    
        return new atd.am.getSDKAppID.getSDKTransactionID(r6, new atd.z.AuthenticationRequestParameters(r11.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, r6, r12), r12, null, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010e, code lost:
    
        throw new p013kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if ((r11 instanceof atd.d.getAdditionalDetails.getDeviceData) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if ((r11 instanceof atd.d.getAdditionalDetails.getDeviceData) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r11 = (atd.d.getAdditionalDetails.getDeviceData) r11;
        r12 = new atd.am.getSDKAppID.getDeviceData(atd.d.getAdditionalDetails.getDeviceData.getSDKAppID(new java.lang.Object[]{r11}, -825152795, 825152795, java.lang.System.identityHashCode(r11)));
        r11 = atd.d.getMessageVersion.getDeviceData + 37;
        atd.d.getMessageVersion.getSDKAppID = r11 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final atd.am.getSDKAppID<kotlinx.serialization.json.JsonObject> ChallengeResult(kotlinx.serialization.json.JsonObject r11, atd.am.getDeviceData r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.getMessageVersion.ChallengeResult(kotlinx.serialization.json.JsonObject, atd.am.getDeviceData):atd.am.getSDKAppID");
    }

    public static final atd.am.getSDKAppID<JsonArray> ChallengeResultCancelled(JsonObject jsonObject, atd.am.getDeviceData getdevicedata) throws Throwable {
        s.k(jsonObject, "");
        s.k(getdevicedata, "");
        getAdditionalDetails<JsonArray> getadditionaldetailsBuildConfig = BuildConfig(jsonObject, getdevicedata.AuthenticationRequestParameters());
        if (getadditionaldetailsBuildConfig instanceof getAdditionalDetails.getDeviceData) {
            getAdditionalDetails.getDeviceData getdevicedata2 = (getAdditionalDetails.getDeviceData) getadditionaldetailsBuildConfig;
            return new atd.am.getSDKAppID.getDeviceData(getAdditionalDetails.getDeviceData.getSDKAppID(new Object[]{getdevicedata2}, -825152795, 825152795, System.identityHashCode(getdevicedata2)));
        }
        if (s.f(getadditionaldetailsBuildConfig, getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID)) {
            atd.am.ChallengeResultCancelled challengeResultCancelled = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_MISSING_REQUIRED;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a(View.getDefaultSize(0, 0) + 15, "\u001b!\u0007\u0003\u0001\u0014!\u001a㘊㘊\u001d\t\u000f\u000e㗛", (byte) (33 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(getdevicedata.AuthenticationRequestParameters());
            atd.am.getSDKAppID.getSDKTransactionID getsdktransactionid = new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled, new atd.z.AuthenticationRequestParameters(sb2.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_MISSING, challengeResultCancelled, getdevicedata), getdevicedata, null, 8);
            int i11 = getDeviceData + 111;
            getSDKAppID = i11 % 128;
            if (i11 % 2 == 0) {
                return getsdktransactionid;
            }
            throw null;
        }
        if (!s.f(getadditionaldetailsBuildConfig, getAdditionalDetails.getSDKReferenceNumber.getDeviceData)) {
            if (!s.f(getadditionaldetailsBuildConfig, getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters)) {
                throw new NoWhenBranchMatchedException();
            }
            atd.am.ChallengeResultCancelled challengeResultCancelled2 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_INVALID_FORMAT;
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            b("\uece5圗\uecac\u2454턍⣊㰙꼤\uf559\uf73aʈȨ\udf0f\ued70撳榶ꇔ蒁繾侉诜몃倚嗗涇傳꧊묡癠瘯菸脢塵", Color.green(0), objArr2);
            sb3.append(((String) objArr2[0]).intern());
            sb3.append(getdevicedata.AuthenticationRequestParameters());
            return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled2, new atd.z.AuthenticationRequestParameters(sb3.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, challengeResultCancelled2, getdevicedata), getdevicedata, null, 8);
        }
        atd.am.ChallengeResultCancelled challengeResultCancelled3 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_EMPTY;
        StringBuilder sb4 = new StringBuilder();
        Object[] objArr3 = new Object[1];
        b("\uece5圗\uecac\u2454턍⣊㰙꼤\uf559\uf73aʈȨ\udf0f\ued70撳榶ꇔ蒁繾侉诜몃倚嗗涇傳꧊묡癠瘯菸脢塵", ExpandableListView.getPackedPositionType(0L), objArr3);
        sb4.append(((String) objArr3[0]).intern());
        sb4.append(getdevicedata.AuthenticationRequestParameters());
        atd.am.getSDKAppID.getSDKTransactionID getsdktransactionid2 = new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled3, new atd.z.AuthenticationRequestParameters(sb4.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_MISSING, challengeResultCancelled3, getdevicedata), getdevicedata, null, 8);
        int i12 = getSDKAppID + 11;
        getDeviceData = i12 % 128;
        if (i12 % 2 != 0) {
            return getsdktransactionid2;
        }
        throw null;
    }

    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        int i12;
        Object method;
        Class cls;
        Object method2;
        char c11 = 3;
        $11 = ($10 + 3) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] cArr = AuthenticationRequestParameters;
        Class cls2 = Integer.TYPE;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    char c12 = c11;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1709775791);
                    if (obj != null) {
                        cls = cls2;
                        method2 = obj;
                    } else {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollDefaultDelay() >> 16) + 2313, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 23 - TextUtils.lastIndexOf("", '0'));
                        byte b12 = (byte) 0;
                        cls = cls2;
                        Object[] objArr3 = new Object[1];
                        c((byte) ($$b | 35), b12, b12, objArr3);
                        method2 = cls3.getMethod((String) objArr3[0], cls);
                        map.put(-1709775791, method2);
                    }
                    cArr2[i13] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    i13++;
                    c11 = c12;
                    charArray = charArray;
                    cArr = cArr;
                    cls2 = cls;
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
        char c13 = c11;
        Class cls4 = cls2;
        Object[] objArr4 = {Integer.valueOf(getSDKReferenceNumber)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method3 = map2.get(-1709775791);
        if (method3 == null) {
            Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.MeasureSpec.makeMeasureSpec(0, 0) + 2313, (char) (Process.getGidForName("") + 1), (ViewConfiguration.getEdgeSlop() >> 16) + 24);
            byte b13 = (byte) 0;
            Object[] objArr5 = new Object[1];
            c((byte) ($$b | 35), b13, b13, objArr5);
            method3 = cls5.getMethod((String) objArr5[0], cls4);
            map2.put(-1709775791, method3);
        }
        char cCharValue = ((Character) ((Method) method3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            $10 = ($11 + 51) % 128;
            i12 = i11 - 1;
            cArr4[i12] = (char) (cArr3[i12] - b11);
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i14 = completedVar.getSDKTransactionID;
                if (i14 >= i12) {
                    break;
                }
                int i15 = ($10 + 31) % 128;
                $11 = i15;
                char c14 = cArr3[i14];
                completedVar.getSDKAppID = c14;
                char c15 = cArr3[i14 + 1];
                completedVar.getSDKReferenceNumber = c15;
                if (c14 == c15) {
                    int i16 = i15 + 39;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        cArr4[i14] = (char) (c14 % b11);
                        cArr4[i14 % 1] = (char) (c15 - b11);
                    } else {
                        cArr4[i14] = (char) (c14 - b11);
                        cArr4[i14 + 1] = (char) (c15 - b11);
                    }
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = completedVar;
                    objArr6[11] = Integer.valueOf(cCharValue);
                    objArr6[10] = completedVar;
                    objArr6[9] = completedVar;
                    objArr6[8] = Integer.valueOf(cCharValue);
                    objArr6[7] = completedVar;
                    objArr6[6] = completedVar;
                    objArr6[5] = Integer.valueOf(cCharValue);
                    objArr6[4] = completedVar;
                    objArr6[c13] = completedVar;
                    objArr6[2] = Integer.valueOf(cCharValue);
                    objArr6[1] = completedVar;
                    objArr6[0] = completedVar;
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object obj2 = map3.get(700818725);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.MeasureSpec.getSize(0) + 1919, (char) KeyEvent.normalizeMetaState(0), TextUtils.getTrimmedLength("") + 29);
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr7 = new Object[1];
                        c(b14, b15, b15, objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls7 = Integer.TYPE;
                        method = cls6.getMethod(str2, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class);
                        map3.put(700818725, method);
                    }
                    int iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    int i17 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i17) {
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = completedVar;
                        objArr8[9] = Integer.valueOf(cCharValue);
                        objArr8[8] = completedVar;
                        objArr8[7] = Integer.valueOf(cCharValue);
                        objArr8[6] = Integer.valueOf(cCharValue);
                        objArr8[5] = completedVar;
                        objArr8[4] = completedVar;
                        objArr8[c13] = Integer.valueOf(cCharValue);
                        objArr8[2] = Integer.valueOf(cCharValue);
                        objArr8[1] = completedVar;
                        objArr8[0] = completedVar;
                        Object method4 = map3.get(-248084636);
                        if (method4 == null) {
                            Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1720 - Process.getGidForName(""), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 48634), Process.getGidForName("") + 25);
                            byte b16 = (byte) 0;
                            Object[] objArr9 = new Object[1];
                            c((byte) 49, b16, b16, objArr9);
                            String str3 = (String) objArr9[0];
                            Class cls9 = Integer.TYPE;
                            method4 = cls8.getMethod(str3, Object.class, Object.class, cls9, cls9, Object.class, Object.class, cls9, cls9, Object.class, cls9, Object.class);
                            map3.put(-248084636, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i18 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i19 = completedVar.getSDKTransactionID;
                        cArr4[i19] = cArr[iIntValue2];
                        cArr4[i19 + 1] = cArr[i18];
                    } else {
                        int i21 = completedVar.getDeviceData;
                        int i22 = completedVar.AuthenticationRequestParameters;
                        if (i21 == i22) {
                            int i23 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i23;
                            int i24 = ((i17 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i24;
                            int i25 = (i22 * cCharValue) + i24;
                            int i26 = completedVar.getSDKTransactionID;
                            cArr4[i26] = cArr[(i21 * cCharValue) + i23];
                            cArr4[i26 + 1] = cArr[i25];
                        } else {
                            int i27 = (i21 * cCharValue) + i17;
                            int i28 = (i22 * cCharValue) + completedVar.getMessageVersion;
                            int i29 = completedVar.getSDKTransactionID;
                            cArr4[i29] = cArr[i27];
                            cArr4[i29 + 1] = cArr[i28];
                        }
                        completedVar.getSDKTransactionID += 2;
                    }
                }
                completedVar.getSDKTransactionID += 2;
            }
        }
        for (int i31 = 0; i31 < i11; i31++) {
            $11 = ($10 + 27) % 128;
            cArr4[i31] = (char) (cArr4[i31] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        Object charArray;
        int i12 = $11 + 29;
        $10 = i12 % 128;
        int i13 = 2;
        if (i12 % 2 != 0) {
            int i14 = 75 / 0;
            if (str != null) {
                charArray = str.toCharArray();
                $10 = ($11 + 83) % 128;
            } else {
                charArray = str;
            }
        } else if (str != null) {
            charArray = str.toCharArray();
            $10 = ($11 + 83) % 128;
        } else {
            charArray = str;
        }
        atd.az.getAdditionalDetails getadditionaldetails = new atd.az.getAdditionalDetails();
        char[] deviceData = atd.az.getAdditionalDetails.getDeviceData(getSDKTransactionID ^ 4326518537449951405L, (char[]) charArray, i11);
        getadditionaldetails.getDeviceData = 4;
        while (true) {
            int i15 = getadditionaldetails.getDeviceData;
            if (i15 >= deviceData.length) {
                objArr[0] = new String(deviceData, 4, deviceData.length - 4);
                return;
            }
            int i16 = i15 - 4;
            getadditionaldetails.getSDKTransactionID = i16;
            long j11 = deviceData[i15] ^ deviceData[i15 % 4];
            long j12 = i16;
            try {
                Object[] objArr2 = new Object[3];
                objArr2[i13] = Long.valueOf(getSDKTransactionID);
                objArr2[1] = Long.valueOf(j12);
                objArr2[0] = Long.valueOf(j11);
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(2749 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (54838 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 29 - View.MeasureSpec.getSize(0));
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[i13];
                objArr3[1] = getadditionaldetails;
                objArr3[0] = getadditionaldetails;
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1401 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((Process.myTid() >> 22) + 16690), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 22);
                    byte b11 = (byte) 0;
                    Object[] objArr4 = new Object[1];
                    c((byte) ($$b + 1), b11, b11, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-719904898, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                $11 = ($10 + 1) % 128;
                i13 = 2;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r6 = 122 - r6
            byte[] r1 = atd.d.getMessageVersion.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r6 = r7
            r3 = r1
            r4 = r2
            r1 = r8
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r1
            r1 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r1 + 1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.getMessageVersion.c(byte, short, int, java.lang.Object[]):void");
    }

    public static final atd.am.getSDKAppID<Boolean> getDeviceData(JsonObject jsonObject, atd.am.getDeviceData getdevicedata) throws Throwable {
        getDeviceData = (getSDKAppID + 59) % 128;
        s.k(jsonObject, "");
        s.k(getdevicedata, "");
        getAdditionalDetails<Boolean> deviceData = getDeviceData(jsonObject, getdevicedata.AuthenticationRequestParameters());
        if (deviceData instanceof getAdditionalDetails.getDeviceData) {
            getAdditionalDetails.getDeviceData getdevicedata2 = (getAdditionalDetails.getDeviceData) deviceData;
            return new atd.am.getSDKAppID.getDeviceData(getAdditionalDetails.getDeviceData.getSDKAppID(new Object[]{getdevicedata2}, -825152795, 825152795, System.identityHashCode(getdevicedata2)));
        }
        if (s.f(deviceData, getAdditionalDetails.getSDKReferenceNumber.getDeviceData)) {
            atd.am.ChallengeResultCancelled challengeResultCancelled = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_EMPTY;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a(23 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0010\u0005\u001e \u0019\u0012\t\u0010\u0007\r\u0007\u0015\u0000\u0001\u0017\u0014\u0003\u001d\u0007\u0003\u0001\u000e㗛", (byte) (33 - KeyEvent.keyCodeFromString("")), objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(getdevicedata.AuthenticationRequestParameters());
            return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled, new atd.z.AuthenticationRequestParameters(sb2.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_MISSING, challengeResultCancelled, getdevicedata), getdevicedata, null, 8);
        }
        if (!s.f(deviceData, getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters)) {
            if (!s.f(deviceData, getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID)) {
                throw new NoWhenBranchMatchedException();
            }
            atd.am.ChallengeResultCancelled challengeResultCancelled2 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_MISSING_REQUIRED;
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a(16 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), "\u001b!\u0007\u0003\u0001\u0014!\u001a㘊㘊\u001d\t\u000f\u000e㗛", (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 33), objArr2);
            sb3.append(((String) objArr2[0]).intern());
            sb3.append(getdevicedata.AuthenticationRequestParameters());
            return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled2, new atd.z.AuthenticationRequestParameters(sb3.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_MISSING, challengeResultCancelled2, getdevicedata), getdevicedata, null, 8);
        }
        atd.am.ChallengeResultCancelled challengeResultCancelled3 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_INVALID_FORMAT;
        StringBuilder sb4 = new StringBuilder();
        Object[] objArr3 = new Object[1];
        b("\ue83d◹\ue874軺ꏣ艤輞ᰣ\uf181藔ꠦ넯\udbff龂츝\udab3ꔨ\uf67c퓌ﳏ輛젢猪\ue69f楋∔ͧࠣ犹җ⤒", (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr3);
        sb4.append(((String) objArr3[0]).intern());
        sb4.append(getdevicedata.AuthenticationRequestParameters());
        atd.am.getSDKAppID.getSDKTransactionID getsdktransactionid = new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled3, new atd.z.AuthenticationRequestParameters(sb4.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, challengeResultCancelled3, getdevicedata), getdevicedata, null, 8);
        int i11 = getDeviceData + 55;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            return getsdktransactionid;
        }
        throw null;
    }

    public static final atd.am.getSDKAppID<String> getMessageVersion(JsonObject jsonObject, atd.am.getDeviceData getdevicedata) throws Throwable {
        int i11 = getSDKAppID + 105;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            s.k(jsonObject, "");
            s.k(getdevicedata, "");
            throw null;
        }
        s.k(jsonObject, "");
        s.k(getdevicedata, "");
        getAdditionalDetails getadditionaldetails = (getAdditionalDetails) getSDKAppID(new Object[]{jsonObject, getdevicedata.AuthenticationRequestParameters()}, 1994116073, -1994116071, (int) System.currentTimeMillis());
        if (getadditionaldetails instanceof getAdditionalDetails.getDeviceData) {
            getAdditionalDetails.getDeviceData getdevicedata2 = (getAdditionalDetails.getDeviceData) getadditionaldetails;
            return new atd.am.getSDKAppID.getDeviceData(getAdditionalDetails.getDeviceData.getSDKAppID(new Object[]{getdevicedata2}, -825152795, 825152795, System.identityHashCode(getdevicedata2)));
        }
        if (s.f(getadditionaldetails, getAdditionalDetails.getSDKReferenceNumber.getDeviceData)) {
            atd.am.ChallengeResultCancelled challengeResultCancelled = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_EMPTY;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            b("塅鿐堀纸ᧉ爠鷙\u0ef1䇬㾴塦ꎴ殀▨㹔젷ᔕ", TextUtils.getOffsetAfter("", 0), objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(getdevicedata);
            return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled, new atd.z.AuthenticationRequestParameters(sb2.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_MISSING, challengeResultCancelled, getdevicedata), getdevicedata, null, 8);
        }
        if (s.f(getadditionaldetails, getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID)) {
            atd.am.ChallengeResultCancelled challengeResultCancelled2 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_MISSING_REQUIRED;
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, "\u001b!\u0007\u0003\u0001\u0014!\u001a㘊㘊\u001d\t\u000f\u000e㗛", (byte) (34 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr2);
            sb3.append(((String) objArr2[0]).intern());
            sb3.append(getdevicedata);
            return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled2, new atd.z.AuthenticationRequestParameters(sb3.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_MISSING, challengeResultCancelled2, getdevicedata), getdevicedata, null, 8);
        }
        if (!s.f(getadditionaldetails, getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters)) {
            throw new NoWhenBranchMatchedException();
        }
        atd.am.ChallengeResultCancelled challengeResultCancelled3 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_INVALID_FORMAT;
        StringBuilder sb4 = new StringBuilder();
        Object[] objArr3 = new Object[1];
        b("⬌怔⭅韽\ue60e魣헁䛼㊰쀹넡\uebf0\u18f9\uda55휼聄晜뎖췊Ꙃ䱬跆\ue3bc밅ꩰ柴ᨿ劰", ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr3);
        sb4.append(((String) objArr3[0]).intern());
        sb4.append(getdevicedata.AuthenticationRequestParameters());
        atd.am.getSDKAppID.getSDKTransactionID getsdktransactionid = new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled3, new atd.z.AuthenticationRequestParameters(sb4.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, challengeResultCancelled3, getdevicedata), getdevicedata, null, 8);
        getSDKAppID = (getDeviceData + 23) % 128;
        return getsdktransactionid;
    }

    public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) throws Throwable {
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (i11 * (-103)) + (i12 * (-103)) + (((~(i14 | i15)) | (~(i15 | i13))) * 104) + ((~(i12 | (~i13) | i11)) * (-104)) + ((i11 | i13) * 104);
        byte b11 = 0;
        if (i16 == 1) {
            JsonObject jsonObject = (JsonObject) objArr[0];
            atd.am.getDeviceData getdevicedata = (atd.am.getDeviceData) objArr[1];
            getDeviceData = (getSDKAppID + 21) % 128;
            s.k(jsonObject, "");
            s.k(getdevicedata, "");
            getAdditionalDetails<String> sDKAppID = getSDKAppID(jsonObject, getdevicedata.AuthenticationRequestParameters());
            if (sDKAppID instanceof getAdditionalDetails.getDeviceData) {
                getAdditionalDetails.getDeviceData getdevicedata2 = (getAdditionalDetails.getDeviceData) sDKAppID;
                return new atd.am.getSDKAppID.getDeviceData(getAdditionalDetails.getDeviceData.getSDKAppID(new Object[]{getdevicedata2}, -825152795, 825152795, System.identityHashCode(getdevicedata2)));
            }
            if (s.f(sDKAppID, getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID)) {
                atd.am.getSDKAppID.getDeviceData getdevicedata3 = new atd.am.getSDKAppID.getDeviceData(null);
                getSDKAppID = (getDeviceData + 69) % 128;
                return getdevicedata3;
            }
            if (s.f(sDKAppID, getAdditionalDetails.getSDKReferenceNumber.getDeviceData)) {
                atd.am.ChallengeResultCancelled challengeResultCancelled = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_EMPTY;
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a(16 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u001b!\u0007\u0003\u0001\u0014\u001a\t\u0015\u0007\u0005\"\u001e\u0019\u0013\u0019", (byte) (83 - KeyEvent.keyCodeFromString("")), objArr2);
                sb2.append(((String) objArr2[0]).intern());
                sb2.append(getdevicedata);
                return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled, new atd.z.AuthenticationRequestParameters(sb2.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, challengeResultCancelled, getdevicedata), getdevicedata, null, 8);
            }
            if (!s.f(sDKAppID, getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters)) {
                throw new NoWhenBranchMatchedException();
            }
            atd.am.ChallengeResultCancelled challengeResultCancelled2 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_INVALID_FORMAT;
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr3 = new Object[1];
            b("뽪툡뼬뵔吼뇙\udf70䱀ꛞ牅鮂\ue103貾栕ﶵ諒\uf23aƳ\ue76d고\ud843㿱쥜뚺㸕헗チ塍◾\uf34f᪼", TextUtils.getTrimmedLength(""), objArr3);
            sb3.append(((String) objArr3[0]).intern());
            sb3.append(getdevicedata);
            return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled2, new atd.z.AuthenticationRequestParameters(sb3.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, challengeResultCancelled2, getdevicedata), getdevicedata, null, 8);
        }
        if (i16 == 2) {
            return getDeviceData(objArr);
        }
        if (i16 != 3) {
            return AuthenticationRequestParameters(objArr);
        }
        JsonObject jsonObject2 = (JsonObject) objArr[0];
        String str = (String) objArr[1];
        getDeviceData = (getSDKAppID + 39) % 128;
        s.k(jsonObject2, "");
        s.k(str, "");
        getAdditionalDetails<String> sDKAppID2 = getSDKAppID(jsonObject2, str);
        if (sDKAppID2 instanceof getAdditionalDetails.getDeviceData) {
            getAdditionalDetails.getDeviceData getdevicedata4 = (getAdditionalDetails.getDeviceData) sDKAppID2;
            atd.am.getSDKAppID.getDeviceData getdevicedata5 = new atd.am.getSDKAppID.getDeviceData(getAdditionalDetails.getDeviceData.getSDKAppID(new Object[]{getdevicedata4}, -825152795, 825152795, System.identityHashCode(getdevicedata4)));
            getSDKAppID = (getDeviceData + 101) % 128;
            return getdevicedata5;
        }
        if (s.f(sDKAppID2, getAdditionalDetails.getSDKReferenceNumber.getDeviceData)) {
            atd.am.ChallengeResultCancelled challengeResultCancelled3 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_EMPTY;
            StringBuilder sb4 = new StringBuilder();
            Object[] objArr4 = new Object[1];
            b("塅鿐堀纸ᧉ爠鷙\u0ef1䇬㾴塦ꎴ殀▨㹔젷ᔕ", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, objArr4);
            sb4.append(((String) objArr4[0]).intern());
            sb4.append(str);
            return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled3, new atd.z.AuthenticationRequestParameters(sb4.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_MISSING, challengeResultCancelled3, b11), null, null, 12);
        }
        if (s.f(sDKAppID2, getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID)) {
            atd.am.ChallengeResultCancelled challengeResultCancelled4 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_MISSING_REQUIRED;
            StringBuilder sb5 = new StringBuilder();
            Object[] objArr5 = new Object[1];
            a(15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u001b!\u0007\u0003\u0001\u0014!\u001a㘊㘊\u001d\t\u000f\u000e㗛", (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 33), objArr5);
            sb5.append(((String) objArr5[0]).intern());
            sb5.append(str);
            return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled4, new atd.z.AuthenticationRequestParameters(sb5.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_MISSING, challengeResultCancelled4, b11), null, null, 12);
        }
        if (!s.f(sDKAppID2, getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters)) {
            throw new NoWhenBranchMatchedException();
        }
        atd.am.ChallengeResultCancelled challengeResultCancelled5 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_INVALID_FORMAT;
        StringBuilder sb6 = new StringBuilder();
        Object[] objArr6 = new Object[1];
        a(TextUtils.indexOf("", "") + 26, "\u001d\u0007\t\u0010\u0003\u0019\u0001\u0014\u0000\u0001\u001c\n\r!\u0017\u0001\u0004\u0012\u0017\u0001!\u000f\u0002\u0003\u0013\u0019", (byte) (Color.rgb(0, 0, 0) + 16777283), objArr6);
        sb6.append(((String) objArr6[0]).intern());
        sb6.append(str);
        return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled5, new atd.z.AuthenticationRequestParameters(sb6.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, challengeResultCancelled5, b11), null, null, 12);
    }

    public static final atd.am.getSDKAppID<JsonArray> getSDKEphemeralPublicKey(JsonObject jsonObject, atd.am.getDeviceData getdevicedata) throws Throwable {
        getDeviceData = (getSDKAppID + 11) % 128;
        s.k(jsonObject, "");
        s.k(getdevicedata, "");
        getAdditionalDetails<JsonArray> getadditionaldetailsBuildConfig = BuildConfig(jsonObject, getdevicedata.AuthenticationRequestParameters());
        if (getadditionaldetailsBuildConfig instanceof getAdditionalDetails.getDeviceData) {
            getAdditionalDetails.getDeviceData getdevicedata2 = (getAdditionalDetails.getDeviceData) getadditionaldetailsBuildConfig;
            return new atd.am.getSDKAppID.getDeviceData(getAdditionalDetails.getDeviceData.getSDKAppID(new Object[]{getdevicedata2}, -825152795, 825152795, System.identityHashCode(getdevicedata2)));
        }
        if (s.f(getadditionaldetailsBuildConfig, getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID)) {
            return new atd.am.getSDKAppID.getDeviceData(null);
        }
        if (s.f(getadditionaldetailsBuildConfig, getAdditionalDetails.getSDKReferenceNumber.getDeviceData)) {
            atd.am.ChallengeResultCancelled challengeResultCancelled = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_EMPTY;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            b("\uece5圗\uecac\u2454턍⣊㰙꼤\uf559\uf73aʈȨ\udf0f\ued70撳榶ꇔ蒁繾侉诜몃倚嗗涇傳꧊묡癠瘯菸脢塵", View.MeasureSpec.getMode(0), objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(getdevicedata.AuthenticationRequestParameters());
            return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled, new atd.z.AuthenticationRequestParameters(sb2.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, challengeResultCancelled, getdevicedata), getdevicedata, null, 8);
        }
        if (!s.f(getadditionaldetailsBuildConfig, getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters)) {
            throw new NoWhenBranchMatchedException();
        }
        atd.am.ChallengeResultCancelled challengeResultCancelled2 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_INVALID_FORMAT;
        StringBuilder sb3 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        b("\uece5圗\uecac\u2454턍⣊㰙꼤\uf559\uf73aʈȨ\udf0f\ued70撳榶ꇔ蒁繾侉诜몃倚嗗涇傳꧊묡癠瘯菸脢塵", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
        sb3.append(((String) objArr2[0]).intern());
        sb3.append(getdevicedata.AuthenticationRequestParameters());
        atd.am.getSDKAppID.getSDKTransactionID getsdktransactionid = new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled2, new atd.z.AuthenticationRequestParameters(sb3.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, challengeResultCancelled2, getdevicedata), getdevicedata, null, 8);
        getDeviceData = (getSDKAppID + 87) % 128;
        return getsdktransactionid;
    }

    public static final atd.am.getSDKAppID<JsonObject> getSDKReferenceNumber(JsonElement jsonElement, atd.am.getDeviceData getdevicedata) throws Throwable {
        JsonObject jsonObject;
        atd.z.AuthenticationRequestParameters authenticationRequestParameters;
        s.k(jsonElement, "");
        s.k(getdevicedata, "");
        byte b11 = 0;
        if (jsonElement instanceof JsonObject) {
            int i11 = getSDKAppID + 77;
            getDeviceData = i11 % 128;
            if (i11 % 2 == 0) {
                jsonObject = (JsonObject) jsonElement;
                int i12 = 24 / 0;
            } else {
                jsonObject = (JsonObject) jsonElement;
            }
        } else {
            jsonObject = null;
        }
        if (jsonObject != null) {
            return new atd.am.getSDKAppID.getDeviceData(jsonObject);
        }
        getDeviceData = (getSDKAppID + 3) % 128;
        atd.am.ChallengeResultCancelled challengeResultCancelled = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_EMPTY;
        if (getdevicedata == atd.am.getDeviceData.NONE) {
            Object[] objArr = new Object[1];
            a(Color.argb(0, 0, 0, 0) + 19, "\u001d\u0007\t\u0010\u0003\u0019\u0001\u0014\n\u0003\u001e \u0019\u0012\u0003\u001d\u0007\u0003㘂", (byte) (TextUtils.lastIndexOf("", '0') + 5), objArr);
            authenticationRequestParameters = new atd.z.AuthenticationRequestParameters(((String) objArr[0]).intern(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, challengeResultCancelled, b11);
        } else {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a(21 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), "\u001d\u0007\t\u0010\u0003\u0019\u0001\u0014\n\u0003\u001e \u0019\u0012\u0003\u001d\u0007\u0003\u0001\u000e㗍", (byte) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 19), objArr2);
            sb2.append(((String) objArr2[0]).intern());
            sb2.append(getdevicedata.AuthenticationRequestParameters());
            authenticationRequestParameters = new atd.z.AuthenticationRequestParameters(sb2.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, challengeResultCancelled, getdevicedata);
        }
        return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled, authenticationRequestParameters, getdevicedata, null, 8);
    }

    public static final atd.am.getSDKAppID<JsonObject> getSDKTransactionID(JsonObject jsonObject, atd.am.getDeviceData getdevicedata) throws Throwable {
        int i11 = getDeviceData + 119;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            s.k(jsonObject, "");
            s.k(getdevicedata, "");
            getSDKReferenceNumber(jsonObject, getdevicedata.AuthenticationRequestParameters());
            throw null;
        }
        s.k(jsonObject, "");
        s.k(getdevicedata, "");
        getAdditionalDetails<JsonObject> sDKReferenceNumber = getSDKReferenceNumber(jsonObject, getdevicedata.AuthenticationRequestParameters());
        if (sDKReferenceNumber instanceof getAdditionalDetails.getDeviceData) {
            getAdditionalDetails.getDeviceData getdevicedata2 = (getAdditionalDetails.getDeviceData) sDKReferenceNumber;
            return new atd.am.getSDKAppID.getDeviceData(getAdditionalDetails.getDeviceData.getSDKAppID(new Object[]{getdevicedata2}, -825152795, 825152795, System.identityHashCode(getdevicedata2)));
        }
        if (s.f(sDKReferenceNumber, getAdditionalDetails.getSDKReferenceNumber.getDeviceData)) {
            atd.am.ChallengeResultCancelled challengeResultCancelled = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_EMPTY;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            b("訩￪詬朩秳殱\udceb促鎀徎䇛\ue2bc맆䖰⟮襝윳Ⱬ㴒꽻\ued49ሸ፮딭ଙ\uf808\ueab8寊Ⴅ\udeda샛懟", Color.alpha(0), objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(getdevicedata.AuthenticationRequestParameters());
            atd.am.getSDKAppID.getSDKTransactionID getsdktransactionid = new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled, new atd.z.AuthenticationRequestParameters(sb2.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_MISSING, challengeResultCancelled, getdevicedata), getdevicedata, null, 8);
            int i12 = getDeviceData + 35;
            getSDKAppID = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 17 / 0;
            }
            return getsdktransactionid;
        }
        if (s.f(sDKReferenceNumber, getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters)) {
            atd.am.ChallengeResultCancelled challengeResultCancelled2 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_INVALID_FORMAT;
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0', 0) + 31, "\u001d\u0007\t\u0010\u0003\u0019\u0001\u0014\u001a #\u0018\"\f\u0015\u0006\u0013#\u0017\u0001\u0004\u0012\u0017\u0001!\u000f\u0002\u0003\u0013\u0019", (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 75), objArr2);
            sb3.append(((String) objArr2[0]).intern());
            sb3.append(getdevicedata.AuthenticationRequestParameters());
            return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled2, new atd.z.AuthenticationRequestParameters(sb3.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, challengeResultCancelled2, getdevicedata), getdevicedata, null, 8);
        }
        if (!s.f(sDKReferenceNumber, getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID)) {
            throw new NoWhenBranchMatchedException();
        }
        atd.am.ChallengeResultCancelled challengeResultCancelled3 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_MISSING_REQUIRED;
        StringBuilder sb4 = new StringBuilder();
        Object[] objArr3 = new Object[1];
        a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, "\u001b!\u0007\u0003\u0001\u0014!\u001a㘊㘊\u001d\t\u000f\u000e㗛", (byte) (33 - TextUtils.getCapsMode("", 0, 0)), objArr3);
        sb4.append(((String) objArr3[0]).intern());
        sb4.append(getdevicedata.AuthenticationRequestParameters());
        return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled3, new atd.z.AuthenticationRequestParameters(sb4.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_MISSING, challengeResultCancelled3, getdevicedata), getdevicedata, null, 8);
    }

    static void init$0() {
        $$a = new byte[]{36, 7, 47, 54};
        $$b = 20;
    }

    public static final atd.am.getSDKAppID<Integer> getSDKReferenceNumber(JsonObject jsonObject, atd.am.getDeviceData getdevicedata) throws Throwable {
        int i11 = getSDKAppID + 51;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            s.k(jsonObject, "");
            s.k(getdevicedata, "");
            getAdditionalDetails<Integer> getadditionaldetailsAuthenticationRequestParameters = AuthenticationRequestParameters(jsonObject, getdevicedata.AuthenticationRequestParameters());
            if (getadditionaldetailsAuthenticationRequestParameters instanceof getAdditionalDetails.getDeviceData) {
                getAdditionalDetails.getDeviceData getdevicedata2 = (getAdditionalDetails.getDeviceData) getadditionaldetailsAuthenticationRequestParameters;
                atd.am.getSDKAppID.getDeviceData getdevicedata3 = new atd.am.getSDKAppID.getDeviceData(getAdditionalDetails.getDeviceData.getSDKAppID(new Object[]{getdevicedata2}, -825152795, 825152795, System.identityHashCode(getdevicedata2)));
                getSDKAppID = (getDeviceData + 39) % 128;
                return getdevicedata3;
            }
            if (s.f(getadditionaldetailsAuthenticationRequestParameters, getAdditionalDetails.getSDKReferenceNumber.getDeviceData)) {
                atd.am.ChallengeResultCancelled challengeResultCancelled = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_EMPTY;
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr = new Object[1];
                a(23 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), "\u0010\u0005\u001e \u0019\u0012\t\u0010\u0007\r\u0007\u0015\u0000\u0001\u0017\u0014\u0003\u001d\u0007\u0003\u0001\u000e㗛", (byte) (34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr);
                sb2.append(((String) objArr[0]).intern());
                sb2.append(getdevicedata.AuthenticationRequestParameters());
                return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled, new atd.z.AuthenticationRequestParameters(sb2.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_MISSING, challengeResultCancelled, getdevicedata), getdevicedata, null, 8);
            }
            if (s.f(getadditionaldetailsAuthenticationRequestParameters, getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters)) {
                atd.am.ChallengeResultCancelled challengeResultCancelled2 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_INVALID_FORMAT;
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr2 = new Object[1];
                b("쇏\u31eb솆㍵럱㿫澸ﲅ\ud873釆ᖩ冉\uf206讑玉㨜賘\ue26a楟ᱩꛩ\udc30䜯ع䂹㘆뻨\ue885孋ႅ钝", (-1) - MotionEvent.axisFromString(""), objArr2);
                sb3.append(((String) objArr2[0]).intern());
                sb3.append(getdevicedata.AuthenticationRequestParameters());
                return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled2, new atd.z.AuthenticationRequestParameters(sb3.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_INVALID_FORMAT, challengeResultCancelled2, getdevicedata), getdevicedata, null, 8);
            }
            if (s.f(getadditionaldetailsAuthenticationRequestParameters, getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID)) {
                atd.am.ChallengeResultCancelled challengeResultCancelled3 = atd.am.ChallengeResultCancelled.MESSAGE_FIELD_MISSING_REQUIRED;
                StringBuilder sb4 = new StringBuilder();
                Object[] objArr3 = new Object[1];
                a((ViewConfiguration.getFadingEdgeLength() >> 16) + 15, "\u001b!\u0007\u0003\u0001\u0014!\u001a㘊㘊\u001d\t\u000f\u000e㗛", (byte) (TextUtils.indexOf("", "", 0) + 33), objArr3);
                sb4.append(((String) objArr3[0]).intern());
                sb4.append(getdevicedata.AuthenticationRequestParameters());
                return new atd.am.getSDKAppID.getSDKTransactionID(challengeResultCancelled3, new atd.z.AuthenticationRequestParameters(sb4.toString(), atd.i.getSDKTransactionID.DATA_ELEMENT_MISSING, challengeResultCancelled3, getdevicedata), getdevicedata, null, 8);
            }
            throw new NoWhenBranchMatchedException();
        }
        s.k(jsonObject, "");
        s.k(getdevicedata, "");
        AuthenticationRequestParameters(jsonObject, getdevicedata.AuthenticationRequestParameters());
        throw null;
    }

    private static final getAdditionalDetails<JsonArray> BuildConfig(JsonObject jsonObject, String str) {
        if (!jsonObject.containsKey(str)) {
            int i11 = getDeviceData + 9;
            getSDKAppID = i11 % 128;
            if (i11 % 2 == 0) {
                return getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID;
            }
            getAdditionalDetails.AuthenticationRequestParameters authenticationRequestParameters = getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID;
            throw null;
        }
        JsonElement jsonElement = (JsonElement) v0.j(jsonObject, str);
        if (jsonElement instanceof JsonNull) {
            int i12 = getSDKAppID + 103;
            getDeviceData = i12 % 128;
            if (i12 % 2 != 0) {
                return getAdditionalDetails.getSDKReferenceNumber.getDeviceData;
            }
            getAdditionalDetails.getSDKReferenceNumber getsdkreferencenumber = getAdditionalDetails.getSDKReferenceNumber.getDeviceData;
            throw null;
        }
        if (jsonElement instanceof JsonArray) {
            return ((JsonArray) jsonElement).isEmpty() ? getAdditionalDetails.getSDKReferenceNumber.getDeviceData : new getAdditionalDetails.getDeviceData(jsonElement);
        }
        int i13 = getSDKAppID + 45;
        getDeviceData = i13 % 128;
        if (i13 % 2 != 0) {
            return getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters;
        }
        getAdditionalDetails.getSDKAppID getsdkappid = getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters;
        throw null;
    }

    private static final getAdditionalDetails<String> getSDKEphemeralPublicKey(JsonObject jsonObject, String str) {
        return (getAdditionalDetails) getSDKAppID(new Object[]{jsonObject, str}, 1994116073, -1994116071, (int) System.currentTimeMillis());
    }

    private static final getAdditionalDetails<Integer> AuthenticationRequestParameters(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        if (!jsonObject.containsKey(str)) {
            return getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID;
        }
        Object objJ = v0.j(jsonObject, str);
        if (objJ instanceof JsonPrimitive) {
            int i11 = getDeviceData + 69;
            getSDKAppID = i11 % 128;
            if (i11 % 2 != 0) {
                jsonPrimitive = (JsonPrimitive) objJ;
                int i12 = 14 / 0;
            } else {
                jsonPrimitive = (JsonPrimitive) objJ;
            }
        } else {
            jsonPrimitive = null;
        }
        if (jsonPrimitive == null) {
            getDeviceData = (getSDKAppID + 25) % 128;
            return getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters;
        }
        if (!(jsonPrimitive instanceof JsonNull) && (!jsonPrimitive.getIsString() || !((Boolean) getSDKAppID(new Object[]{jsonPrimitive.getContent()}, -276351768, 276351768, (int) System.currentTimeMillis())).booleanValue())) {
            try {
                getAdditionalDetails.getDeviceData getdevicedata = new getAdditionalDetails.getDeviceData(Integer.valueOf(j.l(jsonPrimitive)));
                int i13 = getSDKAppID + 81;
                getDeviceData = i13 % 128;
                if (i13 % 2 != 0) {
                    return getdevicedata;
                }
                throw null;
            } catch (NumberFormatException unused) {
                return getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters;
            }
        }
        return getAdditionalDetails.getSDKReferenceNumber.getDeviceData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (((java.lang.Boolean) getSDKAppID(new java.lang.Object[]{r5.b()}, -276351768, 276351768, (int) java.lang.System.currentTimeMillis())).booleanValue() != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final atd.d.getAdditionalDetails<java.lang.Boolean> getDeviceData(kotlinx.serialization.json.JsonObject r5, java.lang.String r6) {
        /*
            boolean r0 = r5.containsKey(r6)
            if (r0 != 0) goto L11
            atd.d.getAdditionalDetails$AuthenticationRequestParameters r5 = atd.d.getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID
            int r6 = atd.d.getMessageVersion.getDeviceData
            int r6 = r6 + 9
            int r6 = r6 % 128
            atd.d.getMessageVersion.getSDKAppID = r6
            return r5
        L11:
            java.lang.Object r5 = p013kotlin.collections.v0.j(r5, r6)
            boolean r6 = r5 instanceof kotlinx.serialization.json.JsonPrimitive
            r0 = 0
            if (r6 == 0) goto L1d
            kotlinx.serialization.json.JsonPrimitive r5 = (kotlinx.serialization.json.JsonPrimitive) r5
            goto L1e
        L1d:
            r5 = r0
        L1e:
            if (r5 != 0) goto L23
            atd.d.getAdditionalDetails$getSDKAppID r5 = atd.d.getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters
            return r5
        L23:
            boolean r6 = r5 instanceof kotlinx.serialization.json.JsonNull
            if (r6 != 0) goto L8f
            int r6 = atd.d.getMessageVersion.getSDKAppID
            int r6 = r6 + 13
            int r6 = r6 % 128
            atd.d.getMessageVersion.getDeviceData = r6
            boolean r6 = r5.getIsString()
            if (r6 == 0) goto L78
            int r6 = atd.d.getMessageVersion.getDeviceData
            int r6 = r6 + 25
            int r1 = r6 % 128
            atd.d.getMessageVersion.getSDKAppID = r1
            int r6 = r6 % 2
            r1 = 276351768(0x1078cb18, float:4.9065834E-29)
            r2 = -276351768(0xffffffffef8734e8, float:-8.368887E28)
            if (r6 != 0) goto L61
            java.lang.String r6 = r5.getContent()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            long r3 = java.lang.System.currentTimeMillis()
            int r0 = (int) r3
            java.lang.Object r6 = getSDKAppID(r6, r2, r1, r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L78
            goto L8f
        L61:
            java.lang.String r5 = r5.getContent()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            long r3 = java.lang.System.currentTimeMillis()
            int r6 = (int) r3
            java.lang.Object r5 = getSDKAppID(r5, r2, r1, r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            throw r0
        L78:
            java.lang.Boolean r6 = wo0.j.g(r5)
            if (r6 != 0) goto L81
            atd.d.getAdditionalDetails$getSDKAppID r5 = atd.d.getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters
            return r5
        L81:
            atd.d.getAdditionalDetails$getDeviceData r6 = new atd.d.getAdditionalDetails$getDeviceData
            boolean r5 = wo0.j.f(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6.<init>(r5)
            return r6
        L8f:
            atd.d.getAdditionalDetails$getSDKReferenceNumber r5 = atd.d.getAdditionalDetails.getSDKReferenceNumber.getDeviceData
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.getMessageVersion.getDeviceData(kotlinx.serialization.json.JsonObject, java.lang.String):atd.d.getAdditionalDetails");
    }

    public static final atd.am.getSDKAppID<String> getSDKTransactionID(JsonObject jsonObject, String str) {
        return (atd.am.getSDKAppID) getSDKAppID(new Object[]{jsonObject, str}, -1740739027, 1740739030, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        if (str != null) {
            int i11 = getSDKAppID + 53;
            getDeviceData = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (str.length() != 0) {
                getSDKAppID = (getDeviceData + 53) % 128;
                Object[] objArr2 = new Object[1];
                a(4 - (Process.myPid() >> 22), "\u0006\b㘣㘣", (byte) (45 - (ViewConfiguration.getTapTimeout() >> 16)), objArr2);
                if (!t.M(str, ((String) objArr2[0]).intern(), true)) {
                    return Boolean.FALSE;
                }
            }
        }
        return Boolean.TRUE;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getAdditionalDetails<String> sDKAppID = getSDKAppID((JsonObject) objArr[0], (String) objArr[1]);
        if (sDKAppID instanceof getAdditionalDetails.getDeviceData) {
            int i11 = getDeviceData + 3;
            getSDKAppID = i11 % 128;
            if (i11 % 2 == 0) {
                getAdditionalDetails.getDeviceData getdevicedata = (getAdditionalDetails.getDeviceData) sDKAppID;
                if (!getSDKAppID((String) getAdditionalDetails.getDeviceData.getSDKAppID(new Object[]{getdevicedata}, -825152795, 825152795, System.identityHashCode(getdevicedata)))) {
                    getSDKAppID = (getDeviceData + 21) % 128;
                    return getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters;
                }
            } else {
                getAdditionalDetails.getDeviceData getdevicedata2 = (getAdditionalDetails.getDeviceData) sDKAppID;
                getSDKAppID((String) getAdditionalDetails.getDeviceData.getSDKAppID(new Object[]{getdevicedata2}, -825152795, 825152795, System.identityHashCode(getdevicedata2)));
                throw null;
            }
        }
        getSDKAppID = (getDeviceData + 57) % 128;
        return sDKAppID;
    }

    private static final boolean AuthenticationRequestParameters(String str) {
        return ((Boolean) getSDKAppID(new Object[]{str}, -276351768, 276351768, (int) System.currentTimeMillis())).booleanValue();
    }

    private static final getAdditionalDetails<JsonObject> getSDKReferenceNumber(JsonObject jsonObject, String str) {
        int i11 = getDeviceData + 29;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            if (!jsonObject.containsKey(str)) {
                getAdditionalDetails.AuthenticationRequestParameters authenticationRequestParameters = getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID;
                int i12 = getDeviceData + 85;
                getSDKAppID = i12 % 128;
                if (i12 % 2 == 0) {
                    return authenticationRequestParameters;
                }
                throw null;
            }
            JsonElement jsonElement = (JsonElement) v0.j(jsonObject, str);
            if (jsonElement instanceof JsonNull) {
                return getAdditionalDetails.getSDKReferenceNumber.getDeviceData;
            }
            if (jsonElement instanceof JsonObject) {
                return ((JsonObject) jsonElement).isEmpty() ? getAdditionalDetails.getSDKReferenceNumber.getDeviceData : new getAdditionalDetails.getDeviceData(jsonElement);
            }
            getSDKAppID = (getDeviceData + 91) % 128;
            return getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters;
        }
        jsonObject.containsKey(str);
        throw null;
    }

    private static final getAdditionalDetails<String> getSDKAppID(JsonObject jsonObject, String str) {
        if (!jsonObject.containsKey(str)) {
            return getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID;
        }
        Object objJ = v0.j(jsonObject, str);
        JsonPrimitive jsonPrimitive = null;
        if (objJ instanceof JsonPrimitive) {
            int i11 = getDeviceData + 37;
            getSDKAppID = i11 % 128;
            if (i11 % 2 == 0) {
                jsonPrimitive = (JsonPrimitive) objJ;
            } else {
                throw null;
            }
        }
        if (jsonPrimitive == null) {
            getAdditionalDetails.getSDKAppID getsdkappid = getAdditionalDetails.getSDKAppID.AuthenticationRequestParameters;
            getDeviceData = (getSDKAppID + 81) % 128;
            return getsdkappid;
        }
        String strH = j.h(jsonPrimitive);
        if (strH != null) {
            if (!((Boolean) getSDKAppID(new Object[]{strH}, -276351768, 276351768, (int) System.currentTimeMillis())).booleanValue()) {
                return new getAdditionalDetails.getDeviceData(jsonPrimitive.getContent());
            }
            getSDKAppID = (getDeviceData + 85) % 128;
        }
        int i12 = getSDKAppID + 57;
        getDeviceData = i12 % 128;
        if (i12 % 2 != 0) {
            return getAdditionalDetails.getSDKReferenceNumber.getDeviceData;
        }
        int i13 = 17 / 0;
        return getAdditionalDetails.getSDKReferenceNumber.getDeviceData;
    }

    private static final boolean getSDKAppID(String str) {
        getDeviceData = (getSDKAppID + 75) % 128;
        boolean zM = false;
        try {
            zM = t.M(UUID.fromString(str).toString(), str, false);
        } catch (IllegalArgumentException unused) {
        }
        int i11 = getSDKAppID + 121;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            return zM;
        }
        throw null;
    }

    public static final atd.am.getSDKAppID<String> getSDKAppID(JsonObject jsonObject, atd.am.getDeviceData getdevicedata) {
        return (atd.am.getSDKAppID) getSDKAppID(new Object[]{jsonObject, getdevicedata}, -1351290859, 1351290860, (int) System.currentTimeMillis());
    }
}
