package p80;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.core.os.LocaleListCompat;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lp80/f;", "Lp80/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lv80/d;", "Lp80/j;", "hardwareIdSupplier", "<init>", "(Landroid/content/Context;Lv80/d;)V", "", "", "", "create", "()Ljava/util/Map;", "a", "Lv80/d;", "Landroid/util/DisplayMetrics;", "b", "Landroid/util/DisplayMetrics;", "displayMetrics", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v80.d<HardwareId> hardwareIdSupplier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final DisplayMetrics displayMetrics;

    public f(Context context, v80.d<HardwareId> hardwareIdSupplier) {
        s.k(context, "context");
        s.k(hardwareIdSupplier, "hardwareIdSupplier");
        this.hardwareIdSupplier = hardwareIdSupplier;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        s.j(displayMetrics, "getDisplayMetrics(...)");
        this.displayMetrics = displayMetrics;
    }

    @Override // p80.e
    public Map<String, Object> create() {
        String value = this.hardwareIdSupplier.get().getValue();
        Pair pairA = x.a(g.PARAM_PLATFORM.getCode(), "Android");
        Pair pairA2 = x.a(g.PARAM_DEVICE_MODEL.getCode(), Build.MODEL);
        Pair pairA3 = x.a(g.PARAM_OS_NAME.getCode(), Build.VERSION.CODENAME);
        Pair pairA4 = x.a(g.PARAM_OS_VERSION.getCode(), Build.VERSION.RELEASE);
        Pair pairA5 = x.a(g.PARAM_LOCALE.getCode(), LocaleListCompat.a(Locale.getDefault()).i());
        Pair pairA6 = x.a(g.PARAM_TIME_ZONE.getCode(), TimeZone.getDefault().getDisplayName());
        String code = g.PARAM_SCREEN_RESOLUTION.getCode();
        t0 t0Var = t0.f86535a;
        String str = String.format(Locale.ROOT, "%sx%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.displayMetrics.heightPixels), Integer.valueOf(this.displayMetrics.widthPixels)}, 2));
        s.j(str, "format(locale, format, *args)");
        return v0.r(v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, x.a(code, str)), value.length() > 0 ? v0.f(x.a(g.PARAM_HARDWARE_ID.getCode(), value)) : v0.i());
    }
}
