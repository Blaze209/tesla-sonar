package androidx.work;

import android.annotation.SuppressLint;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0010\b&\u0018\u0000 \u00102\u00020\u0001:\u0002\u000b\u000eB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068G¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/work/u0;", "", "Ljava/util/UUID;", "id", "Lsb/m0;", "workSpec", "", "", "tags", "<init>", "(Ljava/util/UUID;Lsb/m0;Ljava/util/Set;)V", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "b", "Lsb/m0;", DateTokenConverter.CONVERTER_KEY, "()Lsb/m0;", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "()Ljava/lang/String;", "stringId", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final UUID id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sb.m0 workSpec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<String> tags;

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\b\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00028\u00002\u0006\u0010&\u001a\u00020%H\u0017¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00028\u0001¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00028\u0001H ¢\u0006\u0004\b+\u0010*R\"\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b-\u0010.R\"\u00105\u001a\u00020/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010A\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R \u0010F\u001a\b\u0012\u0004\u0012\u00020\u001e0B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00028\u00008 X \u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Landroidx/work/u0$a;", "B", "Landroidx/work/u0;", "W", "", "Ljava/lang/Class;", "Landroidx/work/y;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Ljava/util/UUID;", "id", "l", "(Ljava/util/UUID;)Landroidx/work/u0$a;", "Landroidx/work/a;", "backoffPolicy", "", "backoffDelay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/work/a;JLjava/util/concurrent/TimeUnit;)Landroidx/work/u0$a;", "Landroidx/work/e;", CryptoServicesPermission.CONSTRAINTS, "j", "(Landroidx/work/e;)Landroidx/work/u0$a;", "Landroidx/work/g;", "inputData", "n", "(Landroidx/work/g;)Landroidx/work/u0$a;", "", "tag", "a", "(Ljava/lang/String;)Landroidx/work/u0$a;", "duration", "m", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/u0$a;", "Landroidx/work/i0;", "policy", "k", "(Landroidx/work/i0;)Landroidx/work/u0$a;", "b", "()Landroidx/work/u0;", "c", "Ljava/lang/Class;", "getWorkerClass$work_runtime_release", "()Ljava/lang/Class;", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "setBackoffCriteriaSet$work_runtime_release", "(Z)V", "backoffCriteriaSet", "Ljava/util/UUID;", "e", "()Ljava/util/UUID;", "setId$work_runtime_release", "(Ljava/util/UUID;)V", "Lsb/m0;", "Lsb/m0;", "h", "()Lsb/m0;", "setWorkSpec$work_runtime_release", "(Lsb/m0;)V", "workSpec", "", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "tags", "g", "()Landroidx/work/u0$a;", "thisObject", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a<B extends a<B, ?>, W extends u0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Class<? extends y> workerClass;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean backoffCriteriaSet;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private UUID id;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private sb.m0 workSpec;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Set<String> tags;

        public a(Class<? extends y> workerClass) {
            p013kotlin.jvm.internal.s.k(workerClass, "workerClass");
            this.workerClass = workerClass;
            UUID uuidRandomUUID = UUID.randomUUID();
            p013kotlin.jvm.internal.s.j(uuidRandomUUID, "randomUUID(...)");
            this.id = uuidRandomUUID;
            String string = this.id.toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            String name = workerClass.getName();
            p013kotlin.jvm.internal.s.j(name, "getName(...)");
            this.workSpec = new sb.m0(string, name);
            String name2 = workerClass.getName();
            p013kotlin.jvm.internal.s.j(name2, "getName(...)");
            this.tags = p013kotlin.collections.d1.g(name2);
        }

        public final B a(String tag) {
            p013kotlin.jvm.internal.s.k(tag, "tag");
            this.tags.add(tag);
            return (B) g();
        }

        public final W b() {
            W w11 = (W) c();
            e eVar = this.workSpec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String;
            boolean z11 = eVar.g() || eVar.getRequiresBatteryNotLow() || eVar.getRequiresCharging() || eVar.getRequiresDeviceIdle();
            sb.m0 m0Var = this.workSpec;
            if (m0Var.expedited) {
                if (z11) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (m0Var.initialDelay > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            String traceTag = m0Var.getTraceTag();
            if (traceTag == null) {
                sb.m0 m0Var2 = this.workSpec;
                m0Var2.u(u0.INSTANCE.b(m0Var2.workerClassName));
            } else if (traceTag.length() > 127) {
                this.workSpec.u(p013kotlin.text.t.T1(traceTag, 127));
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            p013kotlin.jvm.internal.s.j(uuidRandomUUID, "randomUUID(...)");
            l(uuidRandomUUID);
            return w11;
        }

        public abstract W c();

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getBackoffCriteriaSet() {
            return this.backoffCriteriaSet;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        public final Set<String> f() {
            return this.tags;
        }

        public abstract B g();

        /* JADX INFO: renamed from: h, reason: from getter */
        public final sb.m0 getWorkSpec() {
            return this.workSpec;
        }

        public final B i(androidx.work.a backoffPolicy, long backoffDelay, TimeUnit timeUnit) {
            p013kotlin.jvm.internal.s.k(backoffPolicy, "backoffPolicy");
            p013kotlin.jvm.internal.s.k(timeUnit, "timeUnit");
            this.backoffCriteriaSet = true;
            sb.m0 m0Var = this.workSpec;
            m0Var.backoffPolicy = backoffPolicy;
            m0Var.p(timeUnit.toMillis(backoffDelay));
            return (B) g();
        }

        public final B j(e constraints) {
            p013kotlin.jvm.internal.s.k(constraints, "constraints");
            this.workSpec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String = constraints;
            return (B) g();
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        public B k(i0 policy) {
            p013kotlin.jvm.internal.s.k(policy, "policy");
            sb.m0 m0Var = this.workSpec;
            m0Var.expedited = true;
            m0Var.outOfQuotaPolicy = policy;
            return (B) g();
        }

        public final B l(UUID id2) {
            p013kotlin.jvm.internal.s.k(id2, "id");
            this.id = id2;
            String string = id2.toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            this.workSpec = new sb.m0(string, this.workSpec);
            return (B) g();
        }

        public B m(long duration, TimeUnit timeUnit) {
            p013kotlin.jvm.internal.s.k(timeUnit, "timeUnit");
            this.workSpec.initialDelay = timeUnit.toMillis(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.initialDelay) {
                return (B) g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final B n(g inputData) {
            p013kotlin.jvm.internal.s.k(inputData, "inputData");
            this.workSpec.input = inputData;
            return (B) g();
        }
    }

    /* JADX INFO: renamed from: androidx.work.u0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/work/u0$b;", "", "<init>", "()V", "", "workerClassName", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "DEFAULT_BACKOFF_DELAY_MILLIS", "J", "MAX_BACKOFF_MILLIS", "MIN_BACKOFF_MILLIS", "", "MAX_TRACE_SPAN_LENGTH", "I", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String workerClassName) {
            List listF1 = p013kotlin.text.t.f1(workerClassName, new String[]{"."}, false, 0, 6, null);
            String str = listF1.size() == 1 ? (String) listF1.get(0) : (String) p013kotlin.collections.v.A0(listF1);
            return str.length() <= 127 ? str : p013kotlin.text.t.T1(str, 127);
        }

        private Companion() {
        }
    }

    public u0(UUID id2, sb.m0 workSpec, Set<String> tags) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(workSpec, "workSpec");
        p013kotlin.jvm.internal.s.k(tags, "tags");
        this.id = id2;
        this.workSpec = workSpec;
        this.tags = tags;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public UUID getId() {
        return this.id;
    }

    public final String b() {
        String string = getId().toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return string;
    }

    public final Set<String> c() {
        return this.tags;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final sb.m0 getWorkSpec() {
        return this.workSpec;
    }
}
