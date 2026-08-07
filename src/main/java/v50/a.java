package v50;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.x2;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lv50/a;", "Landroidx/compose/ui/platform/x2;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lk40/a;", "browserManager", "<init>", "(Landroid/content/Context;Lk40/a;)V", "", "uri", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "Landroid/content/Context;", "b", "Lk40/a;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k40.a browserManager;

    public a(Context context, k40.a browserManager) {
        s.k(context, "context");
        s.k(browserManager, "browserManager");
        this.context = context;
        this.browserManager = browserManager;
    }

    @Override // androidx.compose.ui.platform.x2
    public void a(String uri) {
        s.k(uri, "uri");
        Context context = this.context;
        k40.a aVar = this.browserManager;
        Uri uri2 = Uri.parse(uri);
        s.j(uri2, "parse(...)");
        context.startActivity(aVar.b(uri2));
    }
}
