package ts;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.v1;
import com.plaid.internal.EnumC4419g;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.math.ec.Tnaf;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f115040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f115041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f115042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f115043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f115044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f115045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f115046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f115047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f115048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f115049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static HashMap<String, String> f115050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f115051l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f115052m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f115053n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f115054o;

    private static final class a {
        public static Drawable a(Context context, Resources resources, int i11) {
            return resources.getDrawable(i11, context.getTheme());
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        f115040a = i11;
        String str = Build.DEVICE;
        f115041b = str;
        String str2 = Build.MANUFACTURER;
        f115042c = str2;
        String str3 = Build.MODEL;
        f115043d = str3;
        f115044e = str + ", " + str3 + ", " + str2 + ", " + i11;
        f115045f = new byte[0];
        f115046g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f115047h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f115048i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f115049j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f115051l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f115052m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f115053n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f115054o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, EnumC4419g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ICON_PIN_VALUE, EnumC4419g.SDK_ASSET_ICON_INCOMPLETE_VALUE, 196, 195, EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE, 144, 151, 158, 153, 140, 139, EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 133, 168, 175, 166, 161, 180, 179, 186, 189, EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE, 192, EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 255, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, 193, EnumC4419g.SDK_ASSET_ICON_ARROW_UP_VALUE, EnumC4419g.SDK_ASSET_ICON_COMMENT_VALUE, 200, EnumC4419g.SDK_ASSET_ICON_SUBMIT_VALUE, EnumC4419g.SDK_ASSET_ICON_QUESTION_VALUE, 211, EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, EnumC4419g.SDK_ASSET_ICON_SUBTRACT_VALUE, EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, EnumC4419g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, 194, 197, EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE, EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE};
    }

    public static long A(long j11, int i11) {
        return m(j11 * ((long) i11), 1000000L);
    }

    public static int A0(int[] iArr, int i11) {
        for (int i12 = 0; i12 < iArr.length; i12++) {
            if (iArr[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    public static String B(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    private static String B0(String str) {
        int i11 = 0;
        while (true) {
            String[] strArr = f115052m;
            if (i11 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i11])) {
                return strArr[i11 + 1] + str.substring(strArr[i11].length());
            }
            i11 += 2;
        }
    }

    public static String C(byte[] bArr) {
        return new String(bArr, ou.e.f100000c);
    }

    public static <T> void C0(List<T> list, int i11, int i12, int i13) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i14 = (i12 - i11) - 1; i14 >= 0; i14--) {
            arrayDeque.addFirst(list.remove(i11 + i14));
        }
        list.addAll(Math.min(i13, list.size()), arrayDeque);
    }

    public static String D(byte[] bArr, int i11, int i12) {
        return new String(bArr, i11, i12, ou.e.f100000c);
    }

    public static long D0(long j11) {
        return (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? j11 : j11 * 1000;
    }

    public static int E(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static ExecutorService E0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: ts.o0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return p0.a(str, runnable);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    @SuppressLint({"InlinedApi"})
    public static int F(int i11) {
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
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (f115040a >= 32) {
                    return 737532;
                }
                return 6396;
            case 12:
                return 743676;
        }
    }

    public static String F0(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', CoreConstants.DASH_CHAR);
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strE = ou.c.e(str);
        String str2 = Q0(strE, "-")[0];
        if (f115050k == null) {
            f115050k = z();
        }
        String str3 = f115050k.get(str2);
        if (str3 != null) {
            strE = str3 + strE.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || IntegerTokenConverter.CONVERTER_KEY.equals(str2) || "zh".equals(str2)) ? B0(strE) : strE;
    }

    public static v1.b G(v1 v1Var, v1.b bVar) {
        boolean zM = v1Var.m();
        boolean zN0 = v1Var.n0();
        boolean zP = v1Var.P();
        boolean zQ = v1Var.q();
        boolean zT0 = v1Var.t0();
        boolean zE0 = v1Var.E0();
        boolean zU = v1Var.J().u();
        boolean z11 = false;
        v1.b.a aVarD = new v1.b.a().b(bVar).d(4, !zM).d(5, zN0 && !zM).d(6, zP && !zM).d(7, !zU && (zP || !zT0 || zN0) && !zM).d(8, zQ && !zM).d(9, !zU && (zQ || (zT0 && zE0)) && !zM).d(10, !zM).d(11, zN0 && !zM);
        if (zN0 && !zM) {
            z11 = true;
        }
        return aVarD.d(12, z11).e();
    }

    public static <T> T[] G0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static int H(ByteBuffer byteBuffer, int i11) {
        int i12 = byteBuffer.getInt(i11);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i12 : Integer.reverseBytes(i12);
    }

    public static <T> T[] H0(T[] tArr, int i11) {
        ts.a.a(i11 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i11);
    }

    public static String I(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < objArr.length; i11++) {
            sb2.append(objArr[i11].getClass().getSimpleName());
            if (i11 < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public static <T> T[] I0(T[] tArr, int i11, int i12) {
        ts.a.a(i11 >= 0);
        ts.a.a(i12 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i11, i12);
    }

    public static String J(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return ou.c.f(networkCountryIso);
            }
        }
        return ou.c.f(Locale.getDefault().getCountry());
    }

    public static boolean J0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Point K(Context context) {
        DisplayManager displayManager;
        Display display = (f115040a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) ts.a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return L(context, display);
    }

    public static boolean K0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static Point L(Context context, Display display) {
        if (display.getDisplayId() == 0 && z0(context)) {
            String strJ0 = f115040a < 28 ? j0("sys.display-size") : j0("vendor.display-size");
            if (!TextUtils.isEmpty(strJ0)) {
                try {
                    String[] strArrP0 = P0(strJ0.trim(), "x");
                    if (strArrP0.length == 2) {
                        int i11 = Integer.parseInt(strArrP0[0]);
                        int i12 = Integer.parseInt(strArrP0[1]);
                        if (i11 > 0 && i12 > 0) {
                            return new Point(i11, i12);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                u.c("Util", "Invalid display size: " + strJ0);
            }
            if ("Sony".equals(f115042c) && f115043d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i13 = f115040a;
        if (i13 >= 23) {
            Q(display, point);
        } else if (i13 >= 17) {
            P(display, point);
        } else {
            O(display, point);
        }
        return point;
    }

    public static long L0(long j11, int i11) {
        return (j11 * 1000000) / ((long) i11);
    }

    public static Looper M() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static long M0(long j11, long j12, long j13) {
        if (j13 >= j12 && j13 % j12 == 0) {
            return j11 / (j13 / j12);
        }
        if (j13 < j12 && j12 % j13 == 0) {
            return j11 * (j12 / j13);
        }
        return (long) (j11 * (j12 / j13));
    }

    public static Locale N() {
        return f115040a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    public static void N0(long[] jArr, long j11, long j12) {
        int i11 = 0;
        if (j12 >= j11 && j12 % j11 == 0) {
            long j13 = j12 / j11;
            while (i11 < jArr.length) {
                jArr[i11] = jArr[i11] / j13;
                i11++;
            }
            return;
        }
        if (j12 >= j11 || j11 % j12 != 0) {
            double d11 = j11 / j12;
            while (i11 < jArr.length) {
                jArr[i11] = (long) (jArr[i11] * d11);
                i11++;
            }
            return;
        }
        long j14 = j11 / j12;
        while (i11 < jArr.length) {
            jArr[i11] = jArr[i11] * j14;
            i11++;
        }
    }

    private static void O(Display display, Point point) {
        display.getSize(point);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean O0(v1 v1Var) {
        return v1Var == null || !v1Var.t() || v1Var.g() == 1 || v1Var.g() == 4;
    }

    private static void P(Display display, Point point) {
        display.getRealSize(point);
    }

    public static String[] P0(String str, String str2) {
        return str.split(str2, -1);
    }

    private static void Q(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static String[] Q0(String str, String str2) {
        return str.split(str2, 2);
    }

    public static Drawable R(Context context, Resources resources, int i11) {
        return f115040a >= 21 ? a.a(context, resources, i11) : resources.getDrawable(i11);
    }

    public static String[] R0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : P0(str.trim(), "(\\s*,\\s*)");
    }

    public static int S(int i11) {
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

    public static long S0(long j11, long j12, long j13) {
        long j14 = j11 - j12;
        return ((j11 ^ j14) & (j12 ^ j11)) < 0 ? j13 : j14;
    }

    public static int T(String str) {
        String[] strArrP0;
        int length;
        int i11 = 0;
        if (str == null || (length = (strArrP0 = P0(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrP0[length - 1];
        boolean z11 = length >= 3 && "neg".equals(strArrP0[length - 2]);
        try {
            i11 = Integer.parseInt((String) ts.a.e(str2));
            if (z11) {
                return -i11;
            }
        } catch (NumberFormatException unused) {
        }
        return i11;
    }

    public static byte[] T0(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i11);
        }
    }

    public static String U(int i11) {
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

    public static float U0(byte[] bArr) {
        ts.a.a(bArr.length == 4);
        return Float.intBitsToFloat((bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8));
    }

    public static String V(Locale locale) {
        return f115040a >= 21 ? W(locale) : locale.toString();
    }

    public static String V0(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            sb2.append(Character.forDigit((bArr[i11] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i11] & 15, 16));
        }
        return sb2.toString();
    }

    private static String W(Locale locale) {
        return locale.toLanguageTag();
    }

    public static int W0(byte[] bArr) {
        ts.a.a(bArr.length == 4);
        return bArr[3] | (bArr[0] << 24) | (bArr[1] << Tnaf.POW_2_WIDTH) | (bArr[2] << 8);
    }

    public static int X(Context context, String str, boolean z11) {
        return (f115040a < 29 || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 29) ? 1 : 5;
    }

    public static long X0(int i11, int i12) {
        return Y0(i12) | (Y0(i11) << 32);
    }

    public static long Y(long j11, float f11) {
        return f11 == 1.0f ? j11 : Math.round(j11 * ((double) f11));
    }

    public static long Y0(int i11) {
        return ((long) i11) & 4294967295L;
    }

    public static long Z(long j11) {
        return j11 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j11;
    }

    public static long Z0(long j11) {
        return (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? j11 : j11 / 1000;
    }

    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static int a0(int i11) {
        if (i11 == 8) {
            return 3;
        }
        if (i11 == 16) {
            return 2;
        }
        if (i11 != 24) {
            return i11 != 32 ? 0 : 805306368;
        }
        return PKIFailureInfo.duplicateCertReq;
    }

    public static void a1(Parcel parcel, boolean z11) {
        parcel.writeInt(z11 ? 1 : 0);
    }

    public static long b(long j11, long j12, long j13) {
        long j14 = j11 + j12;
        return ((j11 ^ j14) & (j12 ^ j14)) < 0 ? j13 : j14;
    }

    public static u0 b0(int i11, int i12, int i13) {
        return new u0.b().g0("audio/raw").J(i12).h0(i13).a0(i11).G();
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int c0(int i11, int i12) {
        if (i11 != 2) {
            if (i11 == 3) {
                return i12;
            }
            if (i11 != 4) {
                if (i11 != 268435456) {
                    if (i11 == 536870912) {
                        return i12 * 3;
                    }
                    if (i11 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i12 * 4;
        }
        return i12 * 2;
    }

    public static <T extends Comparable<? super T>> int d(List<? extends Comparable<? super T>> list, T t11, boolean z11, boolean z12) {
        int i11;
        int i12;
        int iBinarySearch = Collections.binarySearch(list, t11);
        if (iBinarySearch < 0) {
            i12 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i11 = iBinarySearch + 1;
                if (i11 >= size || list.get(i11).compareTo(t11) != 0) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z11 ? iBinarySearch : i11;
        }
        return z12 ? Math.min(list.size() - 1, i12) : i12;
    }

    public static long d0(long j11, float f11) {
        return f11 == 1.0f ? j11 : Math.round(j11 / ((double) f11));
    }

    public static int e(long[] jArr, long j11, boolean z11, boolean z12) {
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

    public static int e0(int i11) {
        if (i11 == 13) {
            return 1;
        }
        switch (i11) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static <T extends Comparable<? super T>> int f(List<? extends Comparable<? super T>> list, T t11, boolean z11, boolean z12) {
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

    public static String f0(StringBuilder sb2, Formatter formatter, long j11) {
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

    public static int g(v vVar, long j11, boolean z11, boolean z12) {
        int i11;
        int iC = vVar.c() - 1;
        int i12 = 0;
        while (i12 <= iC) {
            int i13 = (i12 + iC) >>> 1;
            if (vVar.b(i13) < j11) {
                i12 = i13 + 1;
            } else {
                iC = i13 - 1;
            }
        }
        if (z11 && (i11 = iC + 1) < vVar.c() && vVar.b(i11) == j11) {
            return i11;
        }
        if (z12 && iC == -1) {
            return 0;
        }
        return iC;
    }

    public static String[] g0() {
        String[] strArrH0 = h0();
        for (int i11 = 0; i11 < strArrH0.length; i11++) {
            strArrH0[i11] = F0(strArrH0[i11]);
        }
        return strArrH0;
    }

    public static int h(int[] iArr, int i11, boolean z11, boolean z12) {
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

    private static String[] h0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f115040a >= 24 ? i0(configuration) : new String[]{V(configuration.locale)};
    }

    public static int i(long[] jArr, long j11, boolean z11, boolean z12) {
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

    private static String[] i0(Configuration configuration) {
        return P0(configuration.getLocales().toLanguageTags(), ",");
    }

    private static String j0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e11) {
            u.d("Util", "Failed to read system property " + str, e11);
            return null;
        }
    }

    public static String k0(int i11) {
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

    public static int l(int i11, int i12) {
        return ((i11 + i12) - 1) / i12;
    }

    public static byte[] l0(String str) {
        return str.getBytes(ou.e.f100000c);
    }

    public static long m(long j11, long j12) {
        return ((j11 + j12) - 1) / j12;
    }

    public static boolean m0(v1 v1Var) {
        if (v1Var == null || !v1Var.c0(1)) {
            return false;
        }
        v1Var.d();
        return true;
    }

    public static void n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e A[RETURN] */
    public static boolean n0(v1 v1Var) {
        boolean z11 = false;
        if (v1Var == null) {
            return false;
        }
        int iG = v1Var.g();
        if (iG != 1 || !v1Var.c0(2)) {
            if (iG == 4 && v1Var.c0(4)) {
                v1Var.E();
            }
            if (v1Var.c0(1)) {
                return z11;
            }
            v1Var.f();
            return true;
        }
        v1Var.b();
        z11 = true;
        if (v1Var.c0(1)) {
            return z11;
        }
        v1Var.f();
        return true;
    }

    public static int o(long j11, long j12) {
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    public static boolean o0(v1 v1Var) {
        return O0(v1Var) ? n0(v1Var) : m0(v1Var);
    }

    public static float p(float f11, float f12, float f13) {
        return Math.max(f12, Math.min(f11, f13));
    }

    public static int p0(Uri uri) {
        int iQ0;
        String scheme = uri.getScheme();
        if (scheme != null && ou.c.a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iQ0 = q0(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iQ0;
        }
        Matcher matcher = f115049j.matcher((CharSequence) ts.a.e(uri.getPath()));
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

    public static int q(int i11, int i12, int i13) {
        return Math.max(i12, Math.min(i11, i13));
    }

    public static int q0(String str) {
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

    public static long r(long j11, long j12, long j13) {
        return Math.max(j12, Math.min(j11, j13));
    }

    public static int r0(Uri uri, String str) {
        if (str == null) {
            return p0(uri);
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

    public static int s(byte[] bArr, int i11, int i12, int i13) {
        while (i11 < i12) {
            i13 = f115053n[((i13 >>> 24) ^ (bArr[i11] & 255)) & 255] ^ (i13 << 8);
            i11++;
        }
        return i13;
    }

    public static boolean s0(d0 d0Var, d0 d0Var2, Inflater inflater) {
        if (d0Var.a() <= 0) {
            return false;
        }
        if (d0Var2.b() < d0Var.a()) {
            d0Var2.c(d0Var.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(d0Var.e(), d0Var.f(), d0Var.a());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(d0Var2.e(), iInflate, d0Var2.b() - iInflate);
                if (inflater.finished()) {
                    d0Var2.T(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == d0Var2.b()) {
                        d0Var2.c(d0Var2.b() * 2);
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

    public static int t(byte[] bArr, int i11, int i12, int i13) {
        while (i11 < i12) {
            i13 = f115054o[i13 ^ (bArr[i11] & 255)];
            i11++;
        }
        return i13;
    }

    public static String t0(int i11) {
        return Integer.toString(i11, 36);
    }

    public static Handler u(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static boolean u0(Context context) {
        return f115040a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static Handler v() {
        return w(null);
    }

    public static boolean v0(int i11) {
        return i11 == 536870912 || i11 == 805306368 || i11 == 4;
    }

    public static Handler w(Handler.Callback callback) {
        return u((Looper) ts.a.i(Looper.myLooper()), callback);
    }

    public static boolean w0(int i11) {
        return i11 == 3 || i11 == 2 || i11 == 268435456 || i11 == 536870912 || i11 == 805306368 || i11 == 4;
    }

    public static Handler x() {
        return y(null);
    }

    public static boolean x0(int i11) {
        return i11 == 10 || i11 == 13;
    }

    public static Handler y(Handler.Callback callback) {
        return u(M(), callback);
    }

    public static boolean y0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || Action.FILE_ATTRIBUTE.equals(scheme);
    }

    private static HashMap<String, String> z() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f115051l.length);
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
            String[] strArr = f115051l;
            if (i11 >= strArr.length) {
                return map;
            }
            map.put(strArr[i11], strArr[i11 + 1]);
            i11 += 2;
        }
    }

    public static boolean z0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T j(T t11) {
        return t11;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] k(T[] tArr) {
        return tArr;
    }
}
