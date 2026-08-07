package va0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import me0.d;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lva0/a;", "Lqe0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "a", "()Z", "Landroid/content/Intent;", "b", "(Landroid/content/Context;)Landroid/content/Intent;", "Lkotlin/Pair;", "", "location", "", "c", "(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements qe0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public a(Context context) {
        s.k(context, "context");
        this.context = context;
    }

    @Override // qe0.a
    public boolean a() {
        return !na0.a.INSTANCE.a().a(this.context);
    }

    @Override // qe0.a
    public Intent b(Context context) {
        s.k(context, "context");
        try {
            return new Intent(context, Class.forName("com.tesla.privacy.PrivacyPolicyActivity"));
        } catch (Exception unused) {
            return new Intent("android.intent.action.VIEW", Uri.parse("tesla://"));
        }
    }

    @Override // qe0.a
    public Object c(Pair<Double, Double> pair, Continuation<? super String> continuation) {
        return d.a(this.context, pair, continuation);
    }
}
