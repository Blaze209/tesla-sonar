package androidx.work.impl;

import ab.j;
import android.content.Context;
import androidx.room.b0;
import androidx.room.v;
import androidx.work.impl.WorkDatabase;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.concurrent.Executor;
import lb.c;
import lb.f;
import lb.f1;
import lb.g;
import lb.h;
import lb.i;
import lb.k;
import lb.l;
import lb.m;
import lb.n;
import lb.o;
import lb.t;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import sb.g0;
import sb.n0;
import sb.x1;
import za.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/b0;", "<init>", "()V", "Lsb/n0;", "j", "()Lsb/n0;", "Lsb/b;", DateTokenConverter.CONVERTER_KEY, "()Lsb/b;", "Lsb/x1;", "k", "()Lsb/x1;", "Lsb/s;", "g", "()Lsb/s;", "Lsb/b0;", "h", "()Lsb/b0;", "Lsb/g0;", IntegerTokenConverter.CONVERTER_KEY, "()Lsb/g0;", "Lsb/i;", "e", "()Lsb/i;", "Lsb/m;", "f", "()Lsb/m;", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class WorkDatabase extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/work/impl/WorkDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/util/concurrent/Executor;", "queryExecutor", "Landroidx/work/b;", "clock", "", "useTestDatabase", "Landroidx/work/impl/WorkDatabase;", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/work/b;Z)Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d c(Context context, d.b configuration) {
            s.k(configuration, "configuration");
            d.b.a aVarA = d.b.INSTANCE.a(context);
            aVarA.d(configuration.name).c(configuration.callback).e(true).a(true);
            return new j().a(aVarA.b());
        }

        public final WorkDatabase b(final Context context, Executor queryExecutor, androidx.work.b clock, boolean useTestDatabase) {
            s.k(context, "context");
            s.k(queryExecutor, "queryExecutor");
            s.k(clock, "clock");
            return (WorkDatabase) (useTestDatabase ? v.b(context, WorkDatabase.class).c() : v.a(context, WorkDatabase.class, "androidx.work.workdb").g(new d.c() { // from class: lb.f0
                @Override // za.d.c
                public final za.d a(za.d.b bVar) {
                    return WorkDatabase.Companion.c(context, bVar);
                }
            })).h(queryExecutor).a(new c(clock)).b(lb.j.f89808c).b(new t(context, 2, 3)).b(k.f89809c).b(l.f89818c).b(new t(context, 5, 6)).b(m.f89819c).b(n.f89821c).b(o.f89826c).b(new f1(context)).b(new t(context, 10, 11)).b(f.f89792c).b(g.f89795c).b(h.f89797c).b(i.f89802c).b(new t(context, 21, 22)).f(true).d();
        }

        private Companion() {
        }
    }

    public abstract sb.b d();

    public abstract sb.i e();

    public abstract sb.m f();

    public abstract sb.s g();

    public abstract sb.b0 h();

    public abstract g0 i();

    public abstract n0 j();

    public abstract x1 k();
}
