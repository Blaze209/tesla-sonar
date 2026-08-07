package nd0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnd0/b;", "", "Loc0/a;", "action", "Lnd0/a;", "notificationAction", "Ljn0/h0;", "a", "(Loc0/a;Lnd0/a;)V", "b", "(Loc0/a;)Lnd0/a;", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f93823a;

    /* JADX INFO: renamed from: nd0.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lnd0/b$a;", "", "<init>", "()V", "Lnd0/b;", "a", "()Lnd0/b;", "getINSTANCE$annotations", "INSTANCE", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f93823a = new Companion();

        private Companion() {
        }

        public final b a() {
            return qd0.a.f105350b;
        }
    }

    void a(oc0.a action, a notificationAction);

    a b(oc0.a action);
}
