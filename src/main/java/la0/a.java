package la0;

import android.app.Application;
import com.google.firebase.c;
import com.tesla.domain.model.DataRestrictedCountry;
import com.tesla.logging.g;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"Lla0/a;", "", "<init>", "()V", "Landroid/app/Application;", Kind.APPLICATION, "Ljn0/h0;", "a", "(Landroid/app/Application;)V", "", "userId", "b", "(Ljava/lang/String;)V", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f89740a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("Analytics");

    private a() {
    }

    public final void a(Application application) {
        s.k(application, "application");
        if (DataRestrictedCountry.INSTANCE.c(application)) {
            logger.j("Data restricted country detected, not adding firebase analytics");
            vu.a.a(c.f43868a).b(false);
        } else {
            logger.j("Adding firebase analytics");
            b bVar = b.f89742a;
            bVar.c(vu.a.a(c.f43868a));
            pa0.c.c().c(bVar);
        }
        pa0.c.c().d();
    }

    public final void b(String userId) {
        s.k(userId, "userId");
    }
}
