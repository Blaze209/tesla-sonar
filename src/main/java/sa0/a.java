package sa0;

import android.app.PendingIntent;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import td0.e;
import td0.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lsa0/a;", "Ltd0/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ltd0/h;", "localNotification", "<init>", "(Landroid/content/Context;Ltd0/h;)V", "Ljn0/h0;", "a", "()V", "Landroid/content/Context;", "b", "Ltd0/h;", "c", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h localNotification;

    public a(Context context, h localNotification) {
        s.k(context, "context");
        s.k(localNotification, "localNotification");
        this.context = context;
        this.localNotification = localNotification;
    }

    @Override // td0.e
    public void a() {
        PendingIntent activity = PendingIntent.getActivity(this.context, 0, ie0.a.a(this.context), 201326592);
        s.j(activity, "getActivity(...)");
        h hVar = this.localNotification;
        Context context = this.context;
        String string = context.getString(bc0.a.R);
        s.j(string, "getString(...)");
        String string2 = this.context.getString(bc0.a.Q);
        s.j(string2, "getString(...)");
        hVar.a(context, string, string2, activity, 457);
    }
}
