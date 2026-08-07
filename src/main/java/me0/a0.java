package me0;

import android.app.PendingIntent;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lme0/a0;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "appWidgetId", "Landroid/app/PendingIntent;", "getRefreshPendingIntent", "(Landroid/content/Context;Ljava/lang/Integer;)Landroid/app/PendingIntent;", "getLayoutRes", "()I", "layoutRes", "getDefaultLayoutRes", "defaultLayoutRes", "NORMAL", "SQUARE", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum a0 {
    NORMAL,
    SQUARE;

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91849a;

        static {
            int[] iArr = new int[a0.values().length];
            try {
                iArr[a0.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a0.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f91849a = iArr;
        }
    }

    public static EnumEntries<a0> getEntries() {
        return $ENTRIES;
    }

    public static /* synthetic */ PendingIntent getRefreshPendingIntent$default(a0 a0Var, Context context, Integer num, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRefreshPendingIntent");
        }
        if ((i11 & 2) != 0) {
            num = null;
        }
        return a0Var.getRefreshPendingIntent(context, num);
    }

    public final int getDefaultLayoutRes() {
        int i11 = a.f91849a[ordinal()];
        if (i11 == 1) {
            return j.f91955g;
        }
        if (i11 == 2) {
            return j.f91951c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getLayoutRes() {
        int i11 = a.f91849a[ordinal()];
        if (i11 == 1) {
            return j.f91953e;
        }
        if (i11 == 2) {
            return j.f91952d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final PendingIntent getRefreshPendingIntent(Context context, Integer appWidgetId) {
        p013kotlin.jvm.internal.s.k(context, "context");
        int i11 = a.f91849a[ordinal()];
        if (i11 == 1) {
            return x.p(x.g(context, appWidgetId, null, null, 12, null), context);
        }
        if (i11 == 2) {
            return x.p(x.e(context, appWidgetId, null, 4, null), context);
        }
        throw new NoWhenBranchMatchedException();
    }
}
