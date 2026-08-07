package tb0;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import td0.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltb0/f;", "Ltb0/e;", "Ltd0/m;", "realmHelper", "<init>", "(Ltd0/m;)V", "", Action.KEY_ATTRIBUTE, "getString", "(Ljava/lang/String;)Ljava/lang/String;", "value", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "(Ljava/lang/String;)V", "Ltd0/m;", "datasource_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m realmHelper;

    /* JADX INFO: renamed from: tb0.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltb0/f$a;", "", "<init>", "()V", "Ltb0/e;", "a", "()Ltb0/e;", "datasource_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            m mVarJ = m.j();
            s.j(mVarJ, "getDB(...)");
            return new f(mVarJ, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ f(m mVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar);
    }

    @Override // tb0.e
    public void a(String key, String value) {
        s.k(key, "key");
        s.k(value, "value");
        this.realmHelper.u(key, value);
    }

    @Override // tb0.e
    public void b(String key) {
        s.k(key, "key");
        this.realmHelper.r(key);
    }

    @Override // tb0.e
    public String getString(String key) {
        s.k(key, "key");
        return this.realmHelper.h(key);
    }

    private f(m mVar) {
        this.realmHelper = mVar;
    }
}
