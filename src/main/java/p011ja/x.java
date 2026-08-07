package p011ja;

import android.content.Context;
import android.util.TypedValue;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \f2\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lja/x;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lja/e0;", "navigatorProvider", "<init>", "(Landroid/content/Context;Lja/e0;)V", "a", "Landroid/content/Context;", "b", "Lja/e0;", "c", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f83429d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e0 navigatorProvider;

    public x(Context context, e0 navigatorProvider) {
        s.k(context, "context");
        s.k(navigatorProvider, "navigatorProvider");
        this.context = context;
        this.navigatorProvider = navigatorProvider;
    }
}
