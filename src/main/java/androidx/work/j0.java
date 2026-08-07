package androidx.work;

import java.util.concurrent.TimeUnit;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/work/j0;", "Landroidx/work/u0;", "Landroidx/work/j0$a;", "builder", "<init>", "(Landroidx/work/j0$a;)V", "e", "a", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 extends u0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(a builder) {
        super(builder.getId(), builder.getWorkSpec(), builder.f());
        p013kotlin.jvm.internal.s.k(builder, "builder");
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B+\b\u0016\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB;\b\u0016\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/work/j0$a;", "Landroidx/work/u0$a;", "Landroidx/work/j0;", "Ljava/lang/Class;", "Landroidx/work/y;", "workerClass", "", "repeatInterval", "Ljava/util/concurrent/TimeUnit;", "repeatIntervalTimeUnit", "<init>", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V", "flexInterval", "flexIntervalTimeUnit", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V", "o", "()Landroidx/work/j0;", "p", "()Landroidx/work/j0$a;", "thisObject", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends u0.a<a, j0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends y> workerClass, long j11, TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            p013kotlin.jvm.internal.s.k(workerClass, "workerClass");
            p013kotlin.jvm.internal.s.k(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            getWorkSpec().s(repeatIntervalTimeUnit.toMillis(j11));
        }

        @Override // androidx.work.u0.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public j0 c() {
            if (getBackoffCriteriaSet() && getWorkSpec().org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String.getRequiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (getWorkSpec().expedited) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new j0(this);
        }

        @Override // androidx.work.u0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<? extends y> workerClass, long j11, TimeUnit repeatIntervalTimeUnit, long j12, TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            p013kotlin.jvm.internal.s.k(workerClass, "workerClass");
            p013kotlin.jvm.internal.s.k(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            p013kotlin.jvm.internal.s.k(flexIntervalTimeUnit, "flexIntervalTimeUnit");
            getWorkSpec().t(repeatIntervalTimeUnit.toMillis(j11), flexIntervalTimeUnit.toMillis(j12));
        }
    }
}
