package li0;

import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import yh0.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "a", "(Landroid/content/Context;)V", "shared_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final void a(Context context) {
        s.k(context, "context");
        try {
            context.getResources().getLayout(n.f125550c);
        } catch (Resources.NotFoundException unused) {
            fu.a.b(context);
        }
    }
}
