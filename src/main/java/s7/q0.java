package s7;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Service;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.ParserException;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.plaid.internal.EnumC4419g;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlinx.coroutines.DebugKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f110454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final String f110455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final String f110456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final String f110457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f110458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f110459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long[] f110460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f110461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f110462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f110463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f110464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static HashMap<String, String> f110465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f110466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f110467n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f110468o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f110469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f110470q;

    private static class a {
        public static void a(Service service, int i11, Notification notification, int i12, String str) {
            try {
                service.startForeground(i11, notification, i12);
            } catch (RuntimeException e11) {
                t.d("Util", "The service must be declared with a foregroundServiceType that includes " + str);
                throw e11;
            }
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        f110454a = i11;
        String str = Build.DEVICE;
        f110455b = str;
        String str2 = Build.MANUFACTURER;
        f110456c = str2;
        String str3 = Build.MODEL;
        f110457d = str3;
        f110458e = str + ", " + str3 + ", " + str2 + ", " + i11;
        f110459f = new byte[0];
        f110460g = new long[0];
        f110461h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f110462i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f110463j = Pattern.compile("%([A-Fa-f0-9]{2})");
        f110464k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f110466m = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f110467n = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f110468o = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f110469p = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f110470q = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, EnumC4419g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ICON_PIN_VALUE, EnumC4419g.SDK_ASSET_ICON_INCOMPLETE_VALUE, 196, 195, EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE, 144, 151, 158, 153, 140, 139, EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 133, 168, 175, 166, 161, 180, 179, 186, 189, EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE, 192, EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 255, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, 193, EnumC4419g.SDK_ASSET_ICON_ARROW_UP_VALUE, EnumC4419g.SDK_ASSET_ICON_COMMENT_VALUE, 200, EnumC4419g.SDK_ASSET_ICON_SUBMIT_VALUE, EnumC4419g.SDK_ASSET_ICON_QUESTION_VALUE, 211, EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, EnumC4419g.SDK_ASSET_ICON_SUBTRACT_VALUE, EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, EnumC4419g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, 194, 197, EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE, EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE};
    }

    public static int A(byte[] bArr, int i11, int i12, int i13) {
        while (i11 < i12) {
            i13 = f110470q[i13 ^ (bArr[i11] & 255)];
            i11++;
        }
        return i13;
    }

    private static String[] A0(Configuration configuration) {
        return E1(configuration.getLocales().toLanguageTags(), ",");
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public static boolean A1(p7.j0 j0Var) {
        if (j0Var == null || !j0Var.c0(1)) {
            return false;
        }
        return (j0Var.c0(17) && j0Var.J().u()) ? false : true;
    }

    public static Handler B(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    private static String B0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e11) {
            t.e("Util", "Failed to read system property " + str, e11);
            return null;
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean B1(p7.j0 j0Var, boolean z11) {
        return j0Var == null || !j0Var.t() || j0Var.g() == 1 || j0Var.g() == 4 || !(!z11 || j0Var.I() == 0 || j0Var.I() == 4);
    }

    public static Handler C() {
        return D(null);
    }

    public static String C0(int i11) {
        switch (i11) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return MediaStreamTrack.AUDIO_TRACK_KIND;
            case 2:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return OrcaKeys.METADATA;
            case 6:
                return "camera motion";
            default:
                if (i11 < 10000) {
                    return CallerData.NA;
                }
                return "custom (" + i11 + ")";
        }
    }

    public static void C1(Throwable th2) throws Throwable {
        D1(th2);
    }

    public static Handler D(Handler.Callback callback) {
        return B((Looper) s7.a.j(Looper.myLooper()), callback);
    }

    public static String D0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = CallerData.NA;
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") AndroidXMedia3/1.8.0";
    }

    public static Handler E() {
        return F(null);
    }

    public static byte[] E0(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static String[] E1(String str, String str2) {
        return str.split(str2, -1);
    }

    public static Handler F(Handler.Callback callback) {
        return B(d0(), callback);
    }

    public static boolean F0(p7.j0 j0Var) {
        if (j0Var == null || !j0Var.c0(1)) {
            return false;
        }
        j0Var.d();
        return true;
    }

    public static String[] F1(String str, String str2) {
        return str.split(str2, 2);
    }

    private static HashMap<String, String> G() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f110466m.length);
        int i11 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f110466m;
            if (i11 >= strArr.length) {
                return map;
            }
            map.put(strArr[i11], strArr[i11 + 1]);
            i11 += 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e A[RETURN] */
    public static boolean G0(p7.j0 j0Var) {
        boolean z11 = false;
        if (j0Var == null) {
            return false;
        }
        int iG = j0Var.g();
        if (iG != 1 || !j0Var.c0(2)) {
            if (iG == 4 && j0Var.c0(4)) {
                j0Var.E();
            }
            if (j0Var.c0(1)) {
                return z11;
            }
            j0Var.f();
            return true;
        }
        j0Var.b();
        z11 = true;
        if (j0Var.c0(1)) {
            return z11;
        }
        j0Var.f();
        return true;
    }

    public static String[] G1(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : E1(str.trim(), "(\\s*,\\s*)");
    }

    public static long H(long j11, int i11) {
        return v1(j11, i11, 1000000L, RoundingMode.UP);
    }

    public static boolean H0(p7.j0 j0Var, boolean z11) {
        return B1(j0Var, z11) ? G0(j0Var) : F0(j0Var);
    }

    public static long H1(long j11, long j12, long j13) {
        long j14 = j11 - j12;
        return ((j11 ^ j14) & (j12 ^ j11)) < 0 ? j13 : j14;
    }

    public static Uri I(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f110464k.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static int I0(Uri uri) {
        int iK0;
        String scheme = uri.getScheme();
        if (scheme != null && (ou.c.a("rtsp", scheme) || ou.c.a("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iK0 = K0(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iK0;
        }
        Matcher matcher = f110464k.matcher((CharSequence) s7.a.f(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static boolean I1(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static String J(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    @Deprecated
    public static int J0(String str) {
        return I0(Uri.parse("file:///" + str));
    }

    public static String J1(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            sb2.append(Character.forDigit((bArr[i11] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i11] & 15, 16));
        }
        return sb2.toString();
    }

    public static String K(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int K0(String str) {
        String strE = ou.c.e(str);
        strE.getClass();
        switch (strE) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static long K1(int i11, int i12) {
        return L1(i12) | (L1(i11) << 32);
    }

    public static String L(byte[] bArr, int i11, int i12) {
        return new String(bArr, i11, i12, StandardCharsets.UTF_8);
    }

    public static int L0(Uri uri, String str) {
        if (str == null) {
            return I0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static long L1(int i11) {
        return ((long) i11) & 4294967295L;
    }

    public static int M(Context context) {
        return q7.f.c(context).generateAudioSessionId();
    }

    public static boolean M0(c0 c0Var, c0 c0Var2, Inflater inflater) {
        if (c0Var.a() == 0) {
            return false;
        }
        if (c0Var2.b() < c0Var.a()) {
            c0Var2.d(c0Var.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c0Var.f(), c0Var.g(), c0Var.a());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(c0Var2.f(), iInflate, c0Var2.b() - iInflate);
                if (inflater.finished()) {
                    c0Var2.a0(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == c0Var2.b()) {
                        c0Var2.d(c0Var2.b() * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th2) {
                inflater.reset();
                throw th2;
            }
        }
    }

    public static <T, U> com.google.common.util.concurrent.s<T> M1(final com.google.common.util.concurrent.s<U> sVar, final com.google.common.util.concurrent.f<U, T> fVar) {
        final com.google.common.util.concurrent.a0 a0VarQ = com.google.common.util.concurrent.a0.Q();
        a0VarQ.b(new Runnable() { // from class: s7.m0
            @Override // java.lang.Runnable
            public final void run() {
                q0.b(a0VarQ, sVar);
            }
        }, com.google.common.util.concurrent.w.b());
        sVar.b(new Runnable() { // from class: s7.n0
            @Override // java.lang.Runnable
            public final void run() {
                q0.c(sVar, a0VarQ, fVar);
            }
        }, com.google.common.util.concurrent.w.b());
        return a0VarQ;
    }

    public static int N(int i11) {
        if (i11 == 30) {
            return 34;
        }
        switch (i11) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i11) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i11) {
                            case 20:
                                return 30;
                            case 21:
                            case 22:
                                return 31;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
        }
    }

    public static String N0(int i11) {
        return Integer.toString(i11, 36);
    }

    public static String N1(String str) {
        int length = str.length();
        int iEnd = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (str.charAt(i12) == '%') {
                i11++;
            }
        }
        if (i11 == 0) {
            return str;
        }
        int i13 = length - (i11 * 2);
        StringBuilder sb2 = new StringBuilder(i13);
        Matcher matcher = f110463j.matcher(str);
        while (i11 > 0 && matcher.find()) {
            char c11 = (char) Integer.parseInt((String) s7.a.f(matcher.group(1)), 16);
            sb2.append((CharSequence) str, iEnd, matcher.start());
            sb2.append(c11);
            iEnd = matcher.end();
            i11--;
        }
        if (iEnd < length) {
            sb2.append((CharSequence) str, iEnd, length);
        }
        if (sb2.length() != i13) {
            return null;
        }
        return sb2.toString();
    }

    @Deprecated
    public static int O(int i11) {
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2 || i11 == 4 || i11 == 5 || i11 == 8) {
                return 4;
            }
            if (i11 != 10) {
                return 2;
            }
        }
        return 1;
    }

    public static boolean O0(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static long O1(long j11) {
        return (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? j11 : j11 / 1000;
    }

    public static AudioFormat P(int i11, int i12, int i13) {
        return new AudioFormat.Builder().setSampleRate(i11).setChannelMask(i12).setEncoding(i13).build();
    }

    public static boolean P0(String str) {
        str.getClass();
        switch (str) {
            case "image/avif":
                return Build.VERSION.SDK_INT >= 34;
            case "image/heic":
            case "image/heif":
                return Build.VERSION.SDK_INT >= 26;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int Q(int i11) {
        if (i11 == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i11 == 12) {
            return 743676;
        }
        if (i11 == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i11) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE;
            case 5:
                return EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
            case 6:
                return EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static boolean Q0(int i11) {
        return i11 == 21 || i11 == 1342177280 || i11 == 22 || i11 == 1610612736 || i11 == 4;
    }

    public static int R(int i11) {
        if (i11 == 0) {
            return 2;
        }
        if (i11 == 1) {
            return 13;
        }
        if (i11 == 2) {
            return 6;
        }
        int i12 = 4;
        if (i11 != 4) {
            i12 = 5;
            if (i11 != 5) {
                if (i11 != 8) {
                    return i11 != 10 ? 1 : 11;
                }
                return 3;
            }
        }
        return i12;
    }

    public static boolean R0(int i11) {
        return i11 == 3 || i11 == 2 || i11 == 268435456 || i11 == 21 || i11 == 1342177280 || i11 == 22 || i11 == 1610612736 || i11 == 4;
    }

    public static String S(int i11) {
        if (i11 == 0) {
            return "undefined";
        }
        if (i11 == 1) {
            return "original";
        }
        if (i11 == 2) {
            return "depth-linear";
        }
        if (i11 == 3) {
            return "depth-inverse";
        }
        if (i11 == 4) {
            return "depth metadata";
        }
        throw new IllegalStateException("Unsupported auxiliary track type");
    }

    public static boolean S0(Context context) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i11 == 30) {
            String str = Build.MODEL;
            if (ou.c.a(str, "moto g(20)") || ou.c.a(str, "rmx3231")) {
                return true;
            }
        }
        return i11 == 34 && ou.c.a(Build.MODEL, "sm-x200");
    }

    public static p7.j0.b T(p7.j0 j0Var, p7.j0.b bVar) {
        boolean zM = j0Var.m();
        boolean zN0 = j0Var.n0();
        boolean zP = j0Var.P();
        boolean zQ = j0Var.q();
        boolean zT0 = j0Var.t0();
        boolean zE0 = j0Var.E0();
        boolean zU = j0Var.J().u();
        boolean z11 = false;
        p7.j0.b.a aVarE = new p7.j0.b.a().b(bVar).e(4, !zM).e(5, zN0 && !zM).e(6, zP && !zM).e(7, !zU && (zP || !zT0 || zN0) && !zM).e(8, zQ && !zM).e(9, !zU && (zQ || (zT0 && zE0)) && !zM).e(10, !zM).e(11, zN0 && !zM);
        if (zN0 && !zM) {
            z11 = true;
        }
        return aVarE.e(12, z11).f();
    }

    public static boolean T0(int i11) {
        return i11 == 10 || i11 == 13;
    }

    public static int U(ByteBuffer byteBuffer, int i11) {
        int i12 = byteBuffer.getInt(i11);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i12 : Integer.reverseBytes(i12);
    }

    public static boolean U0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || Objects.equals(scheme, Action.FILE_ATTRIBUTE);
    }

    public static int V(int i11) {
        if (i11 != 2) {
            if (i11 == 3) {
                return 1;
            }
            if (i11 != 4) {
                if (i11 != 21) {
                    if (i11 != 22) {
                        if (i11 != 268435456) {
                            if (i11 != 1342177280) {
                                if (i11 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static boolean V0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static byte[] W(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) ((Character.digit(str.charAt(i12), 16) << 4) + Character.digit(str.charAt(i12 + 1), 16));
        }
        return bArr;
    }

    public static boolean W0(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static int X(String str, int i11) {
        int i12 = 0;
        for (String str2 : G1(str)) {
            if (i11 == p7.g0.m(str2)) {
                i12++;
            }
        }
        return i12;
    }

    public static int X0(int[] iArr, int i11) {
        for (int i12 = 0; i12 < iArr.length; i12++) {
            if (iArr[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    public static String Y(String str, int i11) {
        String[] strArrG1 = G1(str);
        if (strArrG1.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrG1) {
            if (i11 == p7.g0.m(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static boolean Y0(c0 c0Var, c0 c0Var2, Inflater inflater) {
        return c0Var.a() > 0 && c0Var.n() == 120 && M0(c0Var, c0Var2, inflater);
    }

    public static String Z(String str, int i11) {
        String[] strArrG1 = G1(str);
        if (strArrG1.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrG1) {
            if (i11 != p7.g0.m(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    private static String Z0(String str) {
        int i11 = 0;
        while (true) {
            String[] strArr = f110467n;
            if (i11 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i11])) {
                return strArr[i11 + 1] + str.substring(strArr[i11].length());
            }
            i11 += 2;
        }
    }

    public static /* synthetic */ void a(com.google.common.util.concurrent.a0 a0Var, Runnable runnable, Object obj) {
        try {
            if (a0Var.isCancelled()) {
                return;
            }
            runnable.run();
            a0Var.M(obj);
        } catch (Throwable th2) {
            a0Var.N(th2);
        }
    }

    public static String a0(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return ou.c.f(networkCountryIso);
            }
        }
        return ou.c.f(Locale.getDefault().getCountry());
    }

    public static <T> void a1(List<T> list, int i11, int i12, int i13) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i14 = (i12 - i11) - 1; i14 >= 0; i14--) {
            arrayDeque.addFirst(list.remove(i11 + i14));
        }
        list.addAll(Math.min(i13, list.size()), arrayDeque);
    }

    public static /* synthetic */ void b(com.google.common.util.concurrent.a0 a0Var, com.google.common.util.concurrent.s sVar) {
        if (a0Var.isCancelled()) {
            sVar.cancel(false);
        }
    }

    public static Point b0(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) s7.a.f((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return c0(context, display);
    }

    public static long b1(long j11) {
        return (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? j11 : j11 * 1000;
    }

    public static /* synthetic */ void c(com.google.common.util.concurrent.s sVar, com.google.common.util.concurrent.a0 a0Var, com.google.common.util.concurrent.f fVar) {
        try {
            try {
                a0Var.O(fVar.apply(com.google.common.util.concurrent.m.b(sVar)));
            } catch (Throwable th2) {
                a0Var.N(th2);
            }
        } catch (Error e11) {
            e = e11;
            a0Var.N(e);
        } catch (CancellationException unused) {
            a0Var.cancel(false);
        } catch (RuntimeException e12) {
            e = e12;
            a0Var.N(e);
        } catch (ExecutionException e13) {
            e = e13;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            a0Var.N(e);
        }
    }

    public static Point c0(Context context, Display display) {
        if (display.getDisplayId() == 0 && V0(context)) {
            String strB0 = Build.VERSION.SDK_INT < 28 ? B0("sys.display-size") : B0("vendor.display-size");
            if (!TextUtils.isEmpty(strB0)) {
                try {
                    String[] strArrE1 = E1(strB0.trim(), "x");
                    if (strArrE1.length == 2) {
                        int i11 = Integer.parseInt(strArrE1[0]);
                        int i12 = Integer.parseInt(strArrE1[1]);
                        if (i11 > 0 && i12 > 0) {
                            return new Point(i11, i12);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                t.d("Util", "Invalid display size: " + strB0);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        f0(display, point);
        return point;
    }

    public static ExecutorService c1(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: s7.l0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return q0.e(str, runnable);
            }
        });
    }

    public static /* synthetic */ Thread d(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static Looper d0() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static ScheduledExecutorService d1(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: s7.o0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return q0.d(str, runnable);
            }
        });
    }

    public static /* synthetic */ Thread e(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static Locale e0() {
        return Locale.getDefault(Locale.Category.DISPLAY);
    }

    public static String e1(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', CoreConstants.DASH_CHAR);
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strE = ou.c.e(str);
        String str2 = F1(strE, "-")[0];
        if (f110465l == null) {
            f110465l = G();
        }
        String str3 = f110465l.get(str2);
        if (str3 != null) {
            strE = str3 + strE.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || IntegerTokenConverter.CONVERTER_KEY.equals(str2) || "zh".equals(str2)) ? Z0(strE) : strE;
    }

    public static long f(long j11, long j12, long j13) {
        long j14 = j11 + j12;
        return ((j11 ^ j14) & (j12 ^ j14)) < 0 ? j13 : j14;
    }

    private static void f0(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static <T> T[] f1(T[] tArr, T t11) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t11;
        return (T[]) m(objArrCopyOf);
    }

    public static int g(long[] jArr, long j11, boolean z11, boolean z12) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(jArr, j11);
        if (iBinarySearch < 0) {
            i12 = ~iBinarySearch;
        } else {
            while (true) {
                i11 = iBinarySearch + 1;
                if (i11 >= jArr.length || jArr[i11] != j11) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z11 ? iBinarySearch : i11;
        }
        return z12 ? Math.min(jArr.length - 1, i12) : i12;
    }

    public static Drawable g0(Context context, Resources resources, int i11) {
        return resources.getDrawable(i11, context.getTheme());
    }

    public static <T> T[] g1(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static <T extends Comparable<? super T>> int h(List<? extends Comparable<? super T>> list, T t11, boolean z11, boolean z12) {
        int i11;
        int i12;
        int iBinarySearch = Collections.binarySearch(list, t11);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i11 = iBinarySearch - 1;
                if (i11 < 0 || list.get(i11).compareTo(t11) != 0) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z11 ? iBinarySearch : i11;
        }
        return z12 ? Math.max(0, i12) : i12;
    }

    public static UUID h0(String str) {
        String strE = ou.c.e(str);
        strE.getClass();
        switch (strE) {
            case "playready":
                return p7.h.f101352e;
            case "widevine":
                return p7.h.f101351d;
            case "clearkey":
                return p7.h.f101350c;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static <T> T[] h1(T[] tArr, int i11) {
        s7.a.a(i11 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i11);
    }

    public static int i(u uVar, long j11, boolean z11, boolean z12) {
        int i11;
        int iD = uVar.d() - 1;
        int i12 = 0;
        while (i12 <= iD) {
            int i13 = (i12 + iD) >>> 1;
            if (uVar.c(i13) < j11) {
                i12 = i13 + 1;
            } else {
                iD = i13 - 1;
            }
        }
        if (z11 && (i11 = iD + 1) < uVar.d() && uVar.c(i11) == j11) {
            return i11;
        }
        if (z12 && iD == -1) {
            return 0;
        }
        return iD;
    }

    public static int i0(int i11) {
        if (i11 == 2 || i11 == 4) {
            return 6005;
        }
        if (i11 == 10) {
            return 6004;
        }
        if (i11 == 7) {
            return 6005;
        }
        if (i11 == 8) {
            return 6003;
        }
        switch (i11) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i11) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static <T> T[] i1(T[] tArr, int i11, int i12) {
        s7.a.a(i11 >= 0);
        s7.a.a(i12 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i11, i12);
    }

    public static int j(int[] iArr, int i11, boolean z11, boolean z12) {
        int i12;
        int i13;
        int iBinarySearch = Arrays.binarySearch(iArr, i11);
        if (iBinarySearch < 0) {
            i13 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i12 = iBinarySearch - 1;
                if (i12 < 0 || iArr[i12] != i11) {
                    break;
                }
                iBinarySearch = i12;
            }
            i13 = z11 ? iBinarySearch : i12;
        }
        return z12 ? Math.max(0, i13) : i13;
    }

    public static int j0(String str) {
        String[] strArrE1;
        int length;
        int i11 = 0;
        if (str == null || (length = (strArrE1 = E1(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrE1[length - 1];
        boolean z11 = length >= 3 && "neg".equals(strArrE1[length - 2]);
        try {
            i11 = Integer.parseInt((String) s7.a.f(str2));
            if (z11) {
                return -i11;
            }
        } catch (NumberFormatException unused) {
        }
        return i11;
    }

    public static long j1(String str) throws ParserException {
        Matcher matcher = f110461h.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.a("Invalid date/time format: " + str, null);
        }
        int i11 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i11 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i11 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i11 != 0 ? timeInMillis - (((long) i11) * 60000) : timeInMillis;
    }

    public static int k(long[] jArr, long j11, boolean z11, boolean z12) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(jArr, j11);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i11 = iBinarySearch - 1;
                if (i11 < 0 || jArr[i11] != j11) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z11 ? iBinarySearch : i11;
        }
        return z12 ? Math.max(0, i12) : i12;
    }

    public static String k0(int i11) {
        if (i11 == 0) {
            return "NO";
        }
        if (i11 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i11 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i11 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i11 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static long k1(String str) {
        Matcher matcher = f110462i.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d11 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d12 = d11 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d13 = d12 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d14 = d13 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d15 = d14 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j11 = (long) ((d15 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j11 : j11;
    }

    public static int l0(ByteBuffer byteBuffer, int i11) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byte b11 = byteBuffer.get(byteOrderOrder == byteOrder ? i11 : i11 + 2);
        byte b12 = byteBuffer.get(i11 + 1);
        if (byteBuffer.order() == byteOrder) {
            i11 += 2;
        }
        return (((byteBuffer.get(i11) << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) | (((b11 << 24) & (-16777216)) | ((b12 << Tnaf.POW_2_WIDTH) & 16711680))) >> 8;
    }

    public static int l1(long j11, long j12) {
        long jD = qu.e.d(j11, 100L);
        return ru.f.e((jD == Long.MAX_VALUE || jD == Long.MIN_VALUE) ? j11 / (j12 / 100) : jD / j12);
    }

    public static String m0(Locale locale) {
        return locale.toLanguageTag();
    }

    public static boolean m1(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static int n(int i11, int i12) {
        return ((i11 + i12) - 1) / i12;
    }

    public static int n0(Context context) {
        return S0(context) ? 1 : 5;
    }

    public static <T> com.google.common.util.concurrent.s<T> n1(Handler handler, final Runnable runnable, final T t11) {
        final com.google.common.util.concurrent.a0 a0VarQ = com.google.common.util.concurrent.a0.Q();
        m1(handler, new Runnable() { // from class: s7.p0
            @Override // java.lang.Runnable
            public final void run() {
                q0.a(a0VarQ, runnable, t11);
            }
        });
        return a0VarQ;
    }

    public static long o(long j11, long j12) {
        return ((j11 + j12) - 1) / j12;
    }

    public static long o0(long j11, float f11) {
        return f11 == 1.0f ? j11 : Math.round(j11 * ((double) f11));
    }

    public static void o1(ByteBuffer byteBuffer, int i11) {
        s7.a.b(((-16777216) & i11) == 0 || (i11 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: " + Integer.toHexString(i11));
        s7.a.a(byteBuffer.remaining() >= 3);
        ByteOrder byteOrderOrder = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byteBuffer.put((byte) (byteOrderOrder == byteOrder ? (i11 & 16711680) >> 16 : i11 & 255)).put((byte) ((65280 & i11) >> 8)).put((byte) (byteBuffer.order() == byteOrder ? i11 & 255 : (i11 & 16711680) >> 16));
    }

    public static void p(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long p0(long j11) {
        return j11 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j11;
    }

    public static Intent p1(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return Build.VERSION.SDK_INT < 33 ? context.registerReceiver(broadcastReceiver, intentFilter) : context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    public static float q(float f11, float f12, float f13) {
        return Math.max(f12, Math.min(f11, f13));
    }

    public static int q0(int i11) {
        return r0(i11, ByteOrder.LITTLE_ENDIAN);
    }

    public static <T> void q1(List<T> list, int i11, int i12) {
        if (i11 < 0 || i12 > list.size() || i11 > i12) {
            throw new IllegalArgumentException();
        }
        if (i11 != i12) {
            list.subList(i11, i12).clear();
        }
    }

    public static int r(int i11, int i12, int i13) {
        return Math.max(i12, Math.min(i11, i13));
    }

    public static int r0(int i11, ByteOrder byteOrder) {
        if (i11 == 8) {
            return 3;
        }
        if (i11 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i11 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i11 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static long r1(long j11, int i11) {
        return v1(j11, 1000000L, i11, RoundingMode.DOWN);
    }

    public static long s(long j11, long j12, long j13) {
        return Math.max(j12, Math.min(j11, j13));
    }

    public static p7.u s0(int i11, int i12, int i13) {
        return new p7.u.b().y0("audio/raw").T(i12).z0(i13).s0(i11).P();
    }

    public static long s1(long j11, long j12, long j13) {
        return v1(j11, j12, j13, RoundingMode.DOWN);
    }

    public static <T> boolean t(SparseArray<T> sparseArray, int i11) {
        return sparseArray.indexOfKey(i11) >= 0;
    }

    public static int t0(int i11, int i12) {
        return V(i11) * i12;
    }

    public static long[] t1(List<Long> list, long j11, long j12) {
        return x1(list, j11, j12, RoundingMode.DOWN);
    }

    public static boolean u(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static long u0(long j11, float f11) {
        return f11 == 1.0f ? j11 : Math.round(j11 / ((double) f11));
    }

    public static void u1(long[] jArr, long j11, long j12) {
        y1(jArr, j11, j12, RoundingMode.DOWN);
    }

    public static <T> boolean v(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i11 = 0; i11 < size; i11++) {
            if (!Objects.equals(sparseArray.valueAt(i11), sparseArray2.get(sparseArray.keyAt(i11)))) {
                return false;
            }
        }
        return true;
    }

    public static List<String> v0(int i11) {
        ArrayList arrayList = new ArrayList();
        if ((i11 & 1) != 0) {
            arrayList.add("main");
        }
        if ((i11 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i11 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i11 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i11 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i11 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i11 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i11 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i11 & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i11 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i11 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i11 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i11 & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i11 & PKIFailureInfo.certRevoked) != 0) {
            arrayList.add("easy-read");
        }
        if ((i11 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        if ((i11 & 32768) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    public static long v1(long j11, long j12, long j13, RoundingMode roundingMode) {
        if (j11 == 0 || j12 == 0) {
            return 0L;
        }
        if (j13 >= j12 && j13 % j12 == 0) {
            return qu.e.b(j11, qu.e.b(j13, j12, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j13 < j12 && j12 % j13 == 0) {
            return qu.e.d(j11, qu.e.b(j12, j13, RoundingMode.UNNECESSARY));
        }
        if (j13 < j11 || j13 % j11 != 0) {
            return (j13 >= j11 || j11 % j13 != 0) ? w1(j11, j12, j13, roundingMode) : qu.e.d(j12, qu.e.b(j11, j13, RoundingMode.UNNECESSARY));
        }
        return qu.e.b(j12, qu.e.b(j13, j11, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static <T> int w(SparseArray<T> sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int iKeyAt = 17;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i11)) * 31) + Objects.hashCode(sparseArray.valueAt(i11));
        }
        return iKeyAt;
    }

    public static List<String> w0(int i11) {
        ArrayList arrayList = new ArrayList();
        if ((i11 & 4) != 0) {
            arrayList.add(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        }
        if ((i11 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i11 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    private static long w1(long j11, long j12, long j13, RoundingMode roundingMode) {
        long jD = qu.e.d(j11, j12);
        if (jD != Long.MAX_VALUE && jD != Long.MIN_VALUE) {
            return qu.e.b(jD, j13, roundingMode);
        }
        long jC = qu.e.c(Math.abs(j12), Math.abs(j13));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jB = qu.e.b(j12, jC, roundingMode2);
        long jB2 = qu.e.b(j13, jC, roundingMode2);
        long jC2 = qu.e.c(Math.abs(j11), Math.abs(jB2));
        long jB3 = qu.e.b(j11, jC2, roundingMode2);
        long jB4 = qu.e.b(jB2, jC2, roundingMode2);
        long jD2 = qu.e.d(jB3, jB);
        if (jD2 != Long.MAX_VALUE && jD2 != Long.MIN_VALUE) {
            return qu.e.b(jD2, jB4, roundingMode);
        }
        double d11 = jB3 * (jB / jB4);
        if (d11 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d11 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return qu.b.f(d11, roundingMode);
    }

    public static int x(byte[] bArr, int i11, int i12, int i13) {
        while (i11 < i12) {
            int iB = ru.i.b(bArr[i11]);
            i13 = y(iB & 15, y(iB >> 4, i13));
            i11++;
        }
        return i13;
    }

    public static String x0(StringBuilder sb2, Formatter formatter, long j11) {
        if (j11 == -9223372036854775807L) {
            j11 = 0;
        }
        String str = j11 < 0 ? "-" : "";
        long jAbs = (Math.abs(j11) + 500) / 1000;
        long j12 = jAbs % 60;
        long j13 = (jAbs / 60) % 60;
        long j14 = jAbs / 3600;
        sb2.setLength(0);
        return j14 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j14), Long.valueOf(j13), Long.valueOf(j12)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12)).toString();
    }

    public static long[] x1(List<Long> list, long j11, long j12, RoundingMode roundingMode) {
        long j13 = j11;
        long j14 = j12;
        RoundingMode roundingMode2 = roundingMode;
        int size = list.size();
        long[] jArr = new long[size];
        if (j13 != 0) {
            int i11 = 0;
            if (j14 >= j13 && j14 % j13 == 0) {
                long jB = qu.e.b(j14, j13, RoundingMode.UNNECESSARY);
                while (i11 < size) {
                    jArr[i11] = qu.e.b(list.get(i11).longValue(), jB, roundingMode2);
                    i11++;
                }
            } else if (j14 >= j13 || j13 % j14 != 0) {
                int i12 = 0;
                while (i12 < size) {
                    long jLongValue = list.get(i12).longValue();
                    if (jLongValue != 0) {
                        if (j14 >= jLongValue && j14 % jLongValue == 0) {
                            jArr[i12] = qu.e.b(j13, qu.e.b(j14, jLongValue, RoundingMode.UNNECESSARY), roundingMode2);
                        } else if (j14 >= jLongValue || jLongValue % j14 != 0) {
                            jArr[i12] = w1(jLongValue, j13, j14, roundingMode2);
                        } else {
                            jArr[i12] = qu.e.d(j13, qu.e.b(jLongValue, j14, RoundingMode.UNNECESSARY));
                        }
                    }
                    i12++;
                    j13 = j11;
                    j14 = j12;
                    roundingMode2 = roundingMode;
                }
            } else {
                long jB2 = qu.e.b(j13, j14, RoundingMode.UNNECESSARY);
                while (i11 < size) {
                    jArr[i11] = qu.e.d(list.get(i11).longValue(), jB2);
                    i11++;
                }
            }
        }
        return jArr;
    }

    private static int y(int i11, int i12) {
        return (f110469p[(i11 ^ ((i12 >> 12) & 255)) & 255] ^ ((i12 << 4) & 65535)) & 65535;
    }

    public static String[] y0() {
        String[] strArrZ0 = z0();
        for (int i11 = 0; i11 < strArrZ0.length; i11++) {
            strArrZ0[i11] = e1(strArrZ0[i11]);
        }
        return strArrZ0;
    }

    public static void y1(long[] jArr, long j11, long j12, RoundingMode roundingMode) {
        if (j11 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i11 = 0;
        if (j12 >= j11 && j12 % j11 == 0) {
            long jB = qu.e.b(j12, j11, RoundingMode.UNNECESSARY);
            while (i11 < jArr.length) {
                jArr[i11] = qu.e.b(jArr[i11], jB, roundingMode);
                i11++;
            }
            return;
        }
        if (j12 < j11 && j11 % j12 == 0) {
            long jB2 = qu.e.b(j11, j12, RoundingMode.UNNECESSARY);
            while (i11 < jArr.length) {
                jArr[i11] = qu.e.d(jArr[i11], jB2);
                i11++;
            }
            return;
        }
        for (int i12 = 0; i12 < jArr.length; i12++) {
            long j13 = jArr[i12];
            if (j13 != 0) {
                if (j12 >= j13 && j12 % j13 == 0) {
                    jArr[i12] = qu.e.b(j11, qu.e.b(j12, j13, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j12 >= j13 || j13 % j12 != 0) {
                    jArr[i12] = w1(j13, j11, j12, roundingMode);
                } else {
                    jArr[i12] = qu.e.d(j11, qu.e.b(j13, j12, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static int z(byte[] bArr, int i11, int i12, int i13) {
        while (i11 < i12) {
            i13 = f110468o[((i13 >>> 24) ^ (bArr[i11] & 255)) & 255] ^ (i13 << 8);
            i11++;
        }
        return i13;
    }

    private static String[] z0() {
        return A0(Resources.getSystem().getConfiguration());
    }

    public static void z1(Service service, int i11, Notification notification, int i12, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(service, i11, notification, i12, str);
        } else {
            service.startForeground(i11, notification);
        }
    }

    private static <T extends Throwable> void D1(Throwable th2) throws Throwable {
        throw th2;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T l(T t11) {
        return t11;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] m(T[] tArr) {
        return tArr;
    }
}
