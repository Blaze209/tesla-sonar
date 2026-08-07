package h20;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import t20.Size;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001\u0013B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R.\u0010\u0018\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR.\u0010\u001f\u001a\u0004\u0018\u00010\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR.\u0010\"\u001a\u0004\u0018\u00010\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR.\u0010%\u001a\u0004\u0018\u00010\u00122\b\u0010%\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR.\u0010(\u001a\u0004\u0018\u00010\u00122\b\u0010(\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR.\u0010+\u001a\u0004\u0018\u00010\u00122\b\u0010+\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001a\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR.\u0010.\u001a\u0004\u0018\u00010\u00122\b\u0010.\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001c\"\u0004\b/\u0010\u001eR.\u00108\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R.\u0010;\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107R.\u0010B\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010<8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010>\u001a\u0004\b?\u0010@\"\u0004\b\u0019\u0010A¨\u0006C"}, d2 = {"Lh20/l;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lh20/m;", "config", "<init>", "(Landroid/content/Context;Lh20/m;)V", "Ljn0/h0;", "e", "()V", "c", "", "useContextResourcesScreenResolution", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Ljava/lang/Boolean;)V", "userAnonymisation", "", "", "a", "(Z)Ljava/util/Map;", "Ljava/util/HashMap;", "Ljava/util/HashMap;", "standardPairs", "userId", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "networkUserId", "getNetworkUserId", IntegerTokenConverter.CONVERTER_KEY, "domainUserId", "getDomainUserId", "f", "useragent", "getUseragent", "n", "ipAddress", "getIpAddress", "g", "timezone", "getTimezone", "l", "language", "h", "getLanguage", "Lt20/b;", "size", "Lt20/b;", "getScreenResolution", "()Lt20/b;", "j", "(Lt20/b;)V", "screenResolution", "getScreenViewPort", "k", "screenViewPort", "", "depth", "Ljava/lang/Integer;", "getColorDepth", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V", "colorDepth", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f70482m = l.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, String> standardPairs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String userId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String networkUserId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String domainUserId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String useragent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String ipAddress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String timezone;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String language;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Size screenResolution;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Size screenViewPort;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Integer colorDepth;

    public l(Context context, m mVar) {
        s.k(context, "context");
        this.standardPairs = new HashMap<>();
        e();
        c();
        d(context, mVar != null ? Boolean.valueOf(mVar.i()) : null);
        if (mVar != null) {
            String strN = mVar.n();
            if (strN != null) {
                m(strN);
            }
            String strP = mVar.p();
            if (strP != null) {
                i(strP);
            }
            String strJ = mVar.j();
            if (strJ != null) {
                f(strJ);
            }
            String strM = mVar.m();
            if (strM != null) {
                n(strM);
            }
            String strK = mVar.k();
            if (strK != null) {
                g(strK);
            }
            String strG = mVar.g();
            if (strG != null) {
                l(strG);
            }
            String strO = mVar.o();
            if (strO != null) {
                h(strO);
            }
            Size sizeL = mVar.l();
            if (sizeL != null) {
                j(sizeL);
            }
            Size sizeQ = mVar.q();
            if (sizeQ != null) {
                k(sizeQ);
            }
            Integer numH = mVar.h();
            if (numH != null) {
                b(Integer.valueOf(numH.intValue()));
            }
        }
        String TAG = f70482m;
        s.j(TAG, "TAG");
        g.j(TAG, "Subject created successfully.", new Object[0]);
    }

    private final void c() {
        h(Locale.getDefault().getDisplayLanguage());
    }

    private final void d(Context context, Boolean useContextResourcesScreenResolution) {
        DisplayMetrics displayMetrics;
        Size size;
        if (s.f(useContextResourcesScreenResolution, Boolean.TRUE)) {
            j(new Size(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels));
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
                s.j(currentWindowMetrics, "context.getSystemService…ava).currentWindowMetrics");
                size = new Size(currentWindowMetrics.getBounds().width(), currentWindowMetrics.getBounds().height());
            } else {
                Object systemService = context.getSystemService("window");
                WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
                Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
                if (defaultDisplay != null) {
                    displayMetrics = new DisplayMetrics();
                    defaultDisplay.getRealMetrics(displayMetrics);
                } else {
                    displayMetrics = Resources.getSystem().getDisplayMetrics();
                }
                size = new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            j(size);
        } catch (Throwable unused) {
            String TAG = f70482m;
            s.j(TAG, "TAG");
            g.b(TAG, "Failed to set default screen resolution.", new Object[0]);
        }
    }

    private final void e() {
        l(Calendar.getInstance().getTimeZone().getID());
    }

    public final Map<String, String> a(boolean userAnonymisation) {
        if (!userAnonymisation) {
            return this.standardPairs;
        }
        HashMap map = new HashMap(this.standardPairs);
        map.remove("uid");
        map.remove("duid");
        map.remove("tnuid");
        map.remove("ip");
        return map;
    }

    public final void b(Integer num) {
        if (num == null) {
            return;
        }
        this.colorDepth = num;
        this.standardPairs.put("cd", num.toString());
    }

    public final void f(String str) {
        if (str == null) {
            return;
        }
        this.domainUserId = str;
        this.standardPairs.put("duid", str);
    }

    public final void g(String str) {
        if (str == null) {
            return;
        }
        this.ipAddress = str;
        this.standardPairs.put("ip", str);
    }

    public final void h(String str) {
        if (str == null) {
            return;
        }
        this.language = str;
        this.standardPairs.put("lang", str);
    }

    public final void i(String str) {
        if (str == null) {
            return;
        }
        this.networkUserId = str;
        this.standardPairs.put("tnuid", str);
    }

    public final void j(Size size) {
        if (size == null) {
            return;
        }
        this.screenResolution = size;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(size.getWidth());
        sb2.append('x');
        sb2.append(size.getHeight());
        this.standardPairs.put("res", sb2.toString());
    }

    public final void k(Size size) {
        if (size == null) {
            return;
        }
        this.screenViewPort = size;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(size.getWidth());
        sb2.append('x');
        sb2.append(size.getHeight());
        this.standardPairs.put("vp", sb2.toString());
    }

    public final void l(String str) {
        if (str == null) {
            return;
        }
        this.timezone = str;
        this.standardPairs.put("tz", str);
    }

    public final void m(String str) {
        this.userId = str;
        this.standardPairs.put("uid", str);
    }

    public final void n(String str) {
        if (str == null) {
            return;
        }
        this.useragent = str;
        this.standardPairs.put("ua", str);
    }
}
