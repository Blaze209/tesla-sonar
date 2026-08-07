package lb;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Llb/c;", "Landroidx/room/b0$b;", "Landroidx/work/b;", "clock", "<init>", "(Landroidx/work/b;)V", "Lza/c;", "db", "Ljn0/h0;", "f", "(Lza/c;)V", "a", "Landroidx/work/b;", "getClock", "()Landroidx/work/b;", "", "h", "()Ljava/lang/String;", "pruneSQL", "", "g", "()J", "pruneDate", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends androidx.room.b0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.work.b clock;

    public c(androidx.work.b clock) {
        p013kotlin.jvm.internal.s.k(clock, "clock");
        this.clock = clock;
    }

    private final long g() {
        return this.clock.currentTimeMillis() - g0.f89796a;
    }

    private final String h() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + g() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @Override // androidx.room.b0.b
    public void f(za.c db2) {
        p013kotlin.jvm.internal.s.k(db2, "db");
        super.f(db2);
        db2.beginTransaction();
        try {
            db2.Q1(h());
            db2.g2();
        } finally {
            db2.n2();
        }
    }
}
