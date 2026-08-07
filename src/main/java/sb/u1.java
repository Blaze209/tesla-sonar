package sb;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import tb.NetworkRequestCompat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001TB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\n0\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001a2\u0006\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u001dJ\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\u001dJ\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\u0006\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u001dJ\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\u0006\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010\u001dJ\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\u001aH\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110\u001aH\u0016¢\u0006\u0004\b1\u0010(J\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a2\u0006\u00102\u001a\u00020-H\u0016¢\u0006\u0004\b3\u00100J\u0015\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u001aH\u0016¢\u0006\u0004\b4\u0010(J\u0015\u00105\u001a\b\u0012\u0004\u0012\u00020\u00110\u001aH\u0016¢\u0006\u0004\b5\u0010(J\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020-H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u00020-2\u0006\u0010>\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\bC\u0010=J\u001f\u0010E\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bE\u0010FJ\u001f\u0010H\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010G\u001a\u000206H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\bJ\u0010BJ\u0017\u0010K\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\bK\u0010BJ\u001f\u0010M\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010L\u001a\u00020-H\u0016¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010O\u001a\u000206H\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020-H\u0016¢\u0006\u0004\bR\u0010;J\u001f\u0010T\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010S\u001a\u00020-H\u0016¢\u0006\u0004\bT\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010UR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00110V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010WR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00110Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010Z¨\u0006\\"}, d2 = {"Lsb/u1;", "Lsb/n0;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "Lya/b;", "_connection", "Landroidx/collection/a;", "", "", "_map", "Ljn0/h0;", "m0", "(Lya/b;Landroidx/collection/a;)V", "Landroidx/work/g;", "k0", "Lsb/m0;", "workSpec", IntegerTokenConverter.CONVERTER_KEY, "(Lsb/m0;)V", "v", "id", "t", "(Ljava/lang/String;)Lsb/m0;", "name", "", "Lsb/m0$b;", "x", "(Ljava/lang/String;)Ljava/util/List;", "Landroidx/work/r0$c;", "a", "(Ljava/lang/String;)Landroidx/work/r0$c;", "tag", "Lsb/m0$c;", "C", "g", "f", DateTokenConverter.CONVERTER_KEY, "l", "()Ljava/util/List;", "Lkotlinx/coroutines/flow/Flow;", "", "y", "()Lkotlinx/coroutines/flow/Flow;", "", "schedulerLimit", "z", "(I)Ljava/util/List;", "m", "maxLimit", "h", "s", "B", "", "startingAt", "r", "(J)Ljava/util/List;", "o", "()I", "b", "(Ljava/lang/String;)V", "state", "j", "(Landroidx/work/r0$c;Ljava/lang/String;)I", "e", "(Ljava/lang/String;)I", "q", "output", "A", "(Ljava/lang/String;Landroidx/work/g;)V", "enqueueTime", "k", "(Ljava/lang/String;J)V", "D", "n", "overrideGeneration", "p", "(Ljava/lang/String;I)V", "startTime", "w", "(Ljava/lang/String;J)I", "u", "stopReason", "c", "Landroidx/room/b0;", "Landroidx/room/i;", "Landroidx/room/i;", "__insertAdapterOfWorkSpec", "Landroidx/room/g;", "Landroidx/room/g;", "__updateAdapterOfWorkSpec", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u1 implements n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.room.b0 __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final androidx.room.i<m0> __insertAdapterOfWorkSpec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final androidx.room.g<m0> __updateAdapterOfWorkSpec;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"sb/u1$a", "Landroidx/room/i;", "Lsb/m0;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lya/d;Lsb/m0;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends androidx.room.i<m0> {
        a() {
        }

        @Override // androidx.room.i
        protected String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, m0 entity) {
            p013kotlin.jvm.internal.s.k(statement, "statement");
            p013kotlin.jvm.internal.s.k(entity, "entity");
            statement.c2(1, entity.id);
            statement.x(2, c2.k(entity.state));
            statement.c2(3, entity.workerClassName);
            statement.c2(4, entity.inputMergerClassName);
            androidx.work.g.Companion companion = androidx.work.g.INSTANCE;
            statement.y(5, companion.e(entity.input));
            statement.y(6, companion.e(entity.output));
            statement.x(7, entity.initialDelay);
            statement.x(8, entity.intervalDuration);
            statement.x(9, entity.flexDuration);
            statement.x(10, entity.runAttemptCount);
            statement.x(11, c2.a(entity.backoffPolicy));
            statement.x(12, entity.backoffDelayDuration);
            statement.x(13, entity.lastEnqueueTime);
            statement.x(14, entity.minimumRetentionDuration);
            statement.x(15, entity.scheduleRequestedAt);
            statement.x(16, entity.expedited ? 1L : 0L);
            statement.x(17, c2.i(entity.outOfQuotaPolicy));
            statement.x(18, entity.getPeriodCount());
            statement.x(19, entity.getGeneration());
            statement.x(20, entity.getNextScheduleTimeOverride());
            statement.x(21, entity.getNextScheduleTimeOverrideGeneration());
            statement.x(22, entity.getStopReason());
            String traceTag = entity.getTraceTag();
            if (traceTag == null) {
                statement.A(23);
            } else {
                statement.c2(23, traceTag);
            }
            Boolean backOffOnSystemInterruptions = entity.getBackOffOnSystemInterruptions();
            Integer numValueOf = backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null;
            if (numValueOf == null) {
                statement.A(24);
            } else {
                statement.x(24, numValueOf.intValue());
            }
            androidx.work.e eVar = entity.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String;
            statement.x(25, c2.h(eVar.getRequiredNetworkType()));
            statement.y(26, c2.c(eVar.getRequiredNetworkRequestCompat()));
            statement.x(27, eVar.getRequiresCharging() ? 1L : 0L);
            statement.x(28, eVar.getRequiresDeviceIdle() ? 1L : 0L);
            statement.x(29, eVar.getRequiresBatteryNotLow() ? 1L : 0L);
            statement.x(30, eVar.getRequiresStorageNotLow() ? 1L : 0L);
            statement.x(31, eVar.getContentTriggerUpdateDelayMillis());
            statement.x(32, eVar.getContentTriggerMaxDelayMillis());
            statement.y(33, c2.j(eVar.c()));
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"sb/u1$b", "Landroidx/room/g;", "Lsb/m0;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lya/d;Lsb/m0;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends androidx.room.g<m0> {
        b() {
        }

        @Override // androidx.room.g
        protected String b() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, m0 entity) {
            p013kotlin.jvm.internal.s.k(statement, "statement");
            p013kotlin.jvm.internal.s.k(entity, "entity");
            statement.c2(1, entity.id);
            statement.x(2, c2.k(entity.state));
            statement.c2(3, entity.workerClassName);
            statement.c2(4, entity.inputMergerClassName);
            androidx.work.g.Companion companion = androidx.work.g.INSTANCE;
            statement.y(5, companion.e(entity.input));
            statement.y(6, companion.e(entity.output));
            statement.x(7, entity.initialDelay);
            statement.x(8, entity.intervalDuration);
            statement.x(9, entity.flexDuration);
            statement.x(10, entity.runAttemptCount);
            statement.x(11, c2.a(entity.backoffPolicy));
            statement.x(12, entity.backoffDelayDuration);
            statement.x(13, entity.lastEnqueueTime);
            statement.x(14, entity.minimumRetentionDuration);
            statement.x(15, entity.scheduleRequestedAt);
            statement.x(16, entity.expedited ? 1L : 0L);
            statement.x(17, c2.i(entity.outOfQuotaPolicy));
            statement.x(18, entity.getPeriodCount());
            statement.x(19, entity.getGeneration());
            statement.x(20, entity.getNextScheduleTimeOverride());
            statement.x(21, entity.getNextScheduleTimeOverrideGeneration());
            statement.x(22, entity.getStopReason());
            String traceTag = entity.getTraceTag();
            if (traceTag == null) {
                statement.A(23);
            } else {
                statement.c2(23, traceTag);
            }
            Boolean backOffOnSystemInterruptions = entity.getBackOffOnSystemInterruptions();
            Integer numValueOf = backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null;
            if (numValueOf == null) {
                statement.A(24);
            } else {
                statement.x(24, numValueOf.intValue());
            }
            androidx.work.e eVar = entity.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String;
            statement.x(25, c2.h(eVar.getRequiredNetworkType()));
            statement.y(26, c2.c(eVar.getRequiredNetworkRequestCompat()));
            statement.x(27, eVar.getRequiresCharging() ? 1L : 0L);
            statement.x(28, eVar.getRequiresDeviceIdle() ? 1L : 0L);
            statement.x(29, eVar.getRequiresBatteryNotLow() ? 1L : 0L);
            statement.x(30, eVar.getRequiresStorageNotLow() ? 1L : 0L);
            statement.x(31, eVar.getContentTriggerUpdateDelayMillis());
            statement.x(32, eVar.getContentTriggerMaxDelayMillis());
            statement.y(33, c2.j(eVar.c()));
            statement.c2(34, entity.id);
        }
    }

    /* JADX INFO: renamed from: sb.u1$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsb/u1$c;", "", "<init>", "()V", "", "Lco0/d;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<co0.d<?>> a() {
            return p013kotlin.collections.v.m();
        }

        private Companion() {
        }
    }

    public u1(androidx.room.b0 __db) {
        p013kotlin.jvm.internal.s.k(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfWorkSpec = new a();
        this.__updateAdapterOfWorkSpec = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List A0(String str, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.c2(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dVarL1.I1()) {
                arrayList.add(dVarL1.q3(0));
            }
            dVarL1.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarL1.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 B0(String str, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.c2(1, str2);
            int iD = wa.m.d(dVarL1, "id");
            int iD2 = wa.m.d(dVarL1, "state");
            int iD3 = wa.m.d(dVarL1, "worker_class_name");
            int iD4 = wa.m.d(dVarL1, "input_merger_class_name");
            int iD5 = wa.m.d(dVarL1, "input");
            int iD6 = wa.m.d(dVarL1, "output");
            int iD7 = wa.m.d(dVarL1, "initial_delay");
            int iD8 = wa.m.d(dVarL1, "interval_duration");
            int iD9 = wa.m.d(dVarL1, "flex_duration");
            int iD10 = wa.m.d(dVarL1, "run_attempt_count");
            int iD11 = wa.m.d(dVarL1, "backoff_policy");
            int iD12 = wa.m.d(dVarL1, "backoff_delay_duration");
            int iD13 = wa.m.d(dVarL1, "last_enqueue_time");
            int iD14 = wa.m.d(dVarL1, "minimum_retention_duration");
            int iD15 = wa.m.d(dVarL1, "schedule_requested_at");
            int iD16 = wa.m.d(dVarL1, "run_in_foreground");
            int iD17 = wa.m.d(dVarL1, "out_of_quota_policy");
            int iD18 = wa.m.d(dVarL1, "period_count");
            int iD19 = wa.m.d(dVarL1, "generation");
            int iD20 = wa.m.d(dVarL1, "next_schedule_time_override");
            int iD21 = wa.m.d(dVarL1, "next_schedule_time_override_generation");
            int iD22 = wa.m.d(dVarL1, "stop_reason");
            int iD23 = wa.m.d(dVarL1, "trace_tag");
            int iD24 = wa.m.d(dVarL1, "backoff_on_system_interruptions");
            int iD25 = wa.m.d(dVarL1, "required_network_type");
            int iD26 = wa.m.d(dVarL1, "required_network_request");
            int iD27 = wa.m.d(dVarL1, "requires_charging");
            int iD28 = wa.m.d(dVarL1, "requires_device_idle");
            int iD29 = wa.m.d(dVarL1, "requires_battery_not_low");
            int iD30 = wa.m.d(dVarL1, "requires_storage_not_low");
            int iD31 = wa.m.d(dVarL1, "trigger_content_update_delay");
            int iD32 = wa.m.d(dVarL1, "trigger_max_content_delay");
            int iD33 = wa.m.d(dVarL1, "content_uri_triggers");
            m0 m0Var = null;
            Boolean boolValueOf = null;
            if (dVarL1.I1()) {
                String strQ3 = dVarL1.q3(iD);
                androidx.work.r0.c cVarG = c2.g((int) dVarL1.getLong(iD2));
                String strQ4 = dVarL1.q3(iD3);
                String strQ5 = dVarL1.q3(iD4);
                byte[] blob = dVarL1.getBlob(iD5);
                androidx.work.g.Companion companion = androidx.work.g.INSTANCE;
                androidx.work.g gVarA = companion.a(blob);
                androidx.work.g gVarA2 = companion.a(dVarL1.getBlob(iD6));
                long j11 = dVarL1.getLong(iD7);
                long j12 = dVarL1.getLong(iD8);
                long j13 = dVarL1.getLong(iD9);
                int i11 = (int) dVarL1.getLong(iD10);
                androidx.work.a aVarD = c2.d((int) dVarL1.getLong(iD11));
                long j14 = dVarL1.getLong(iD12);
                long j15 = dVarL1.getLong(iD13);
                long j16 = dVarL1.getLong(iD14);
                long j17 = dVarL1.getLong(iD15);
                boolean z11 = ((int) dVarL1.getLong(iD16)) != 0;
                androidx.work.i0 i0VarF = c2.f((int) dVarL1.getLong(iD17));
                int i12 = (int) dVarL1.getLong(iD18);
                int i13 = (int) dVarL1.getLong(iD19);
                long j18 = dVarL1.getLong(iD20);
                int i14 = (int) dVarL1.getLong(iD21);
                int i15 = (int) dVarL1.getLong(iD22);
                String strQ6 = dVarL1.isNull(iD23) ? null : dVarL1.q3(iD23);
                Integer numValueOf = dVarL1.isNull(iD24) ? null : Integer.valueOf((int) dVarL1.getLong(iD24));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                m0Var = new m0(strQ3, cVarG, strQ4, strQ5, gVarA, gVarA2, j11, j12, j13, new androidx.work.e(c2.l(dVarL1.getBlob(iD26)), c2.e((int) dVarL1.getLong(iD25)), ((int) dVarL1.getLong(iD27)) != 0, ((int) dVarL1.getLong(iD28)) != 0, ((int) dVarL1.getLong(iD29)) != 0, ((int) dVarL1.getLong(iD30)) != 0, dVarL1.getLong(iD31), dVarL1.getLong(iD32), c2.b(dVarL1.getBlob(iD33))), i11, aVarD, j14, j15, j16, j17, z11, i0VarF, i12, i13, j18, i14, i15, strQ6, boolValueOf);
            }
            return m0Var;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List C0(String str, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.c2(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dVarL1.I1()) {
                arrayList.add(new m0.IdAndState(dVarL1.q3(0), c2.g((int) dVarL1.getLong(1))));
            }
            dVarL1.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarL1.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List D0(String str, String str2, u1 u1Var, ya.b _connection) {
        int i11;
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        int i12 = 1;
        try {
            dVarL1.c2(1, str2);
            androidx.collection.a<String, List<String>> aVar = new androidx.collection.a<>();
            androidx.collection.a<String, List<androidx.work.g>> aVar2 = new androidx.collection.a<>();
            while (true) {
                i11 = 0;
                if (!dVarL1.I1()) {
                    break;
                }
                String strQ3 = dVarL1.q3(0);
                if (!aVar.containsKey(strQ3)) {
                    aVar.put(strQ3, new ArrayList());
                }
                String strQ4 = dVarL1.q3(0);
                if (!aVar2.containsKey(strQ4)) {
                    aVar2.put(strQ4, new ArrayList());
                }
            }
            dVarL1.reset();
            u1Var.m0(_connection, aVar);
            u1Var.k0(_connection, aVar2);
            ArrayList arrayList = new ArrayList();
            while (dVarL1.I1()) {
                String strQ5 = dVarL1.q3(i11);
                androidx.work.r0.c cVarG = c2.g((int) dVarL1.getLong(i12));
                androidx.work.g gVarA = androidx.work.g.INSTANCE.a(dVarL1.getBlob(2));
                int i13 = (int) dVarL1.getLong(3);
                int i14 = (int) dVarL1.getLong(4);
                long j11 = dVarL1.getLong(14);
                long j12 = dVarL1.getLong(15);
                long j13 = dVarL1.getLong(16);
                androidx.collection.a<String, List<String>> aVar3 = aVar;
                androidx.work.a aVarD = c2.d((int) dVarL1.getLong(17));
                long j14 = dVarL1.getLong(18);
                long j15 = dVarL1.getLong(19);
                int i15 = (int) dVarL1.getLong(20);
                long j16 = dVarL1.getLong(21);
                int i16 = (int) dVarL1.getLong(22);
                androidx.work.e eVar = new androidx.work.e(c2.l(dVarL1.getBlob(6)), c2.e((int) dVarL1.getLong(5)), ((int) dVarL1.getLong(7)) != 0, ((int) dVarL1.getLong(8)) != 0, ((int) dVarL1.getLong(9)) != 0, ((int) dVarL1.getLong(10)) != 0, dVarL1.getLong(11), dVarL1.getLong(12), c2.b(dVarL1.getBlob(13)));
                Object objJ = p013kotlin.collections.v0.j(aVar3, dVarL1.q3(0));
                p013kotlin.jvm.internal.s.j(objJ, "getValue(...)");
                Object objJ2 = p013kotlin.collections.v0.j(aVar2, dVarL1.q3(0));
                p013kotlin.jvm.internal.s.j(objJ2, "getValue(...)");
                arrayList.add(new m0.WorkInfoPojo(strQ5, cVarG, gVarA, j11, j12, j13, eVar, i13, aVarD, j14, j15, i15, i14, j16, i16, (List) objJ, (List) objJ2));
                aVar = aVar3;
                i11 = 0;
                i12 = 1;
            }
            return arrayList;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E0(String str, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            boolean z11 = false;
            if (dVarL1.I1() && ((int) dVarL1.getLong(0)) != 0) {
                z11 = true;
            }
            return z11;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 F0(String str, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.c2(1, str2);
            dVarL1.I1();
            return jn0.h0.f84049a;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int G0(String str, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.c2(1, str2);
            dVarL1.I1();
            return wa.l.a(_connection);
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 H0(u1 u1Var, m0 m0Var, ya.b _connection) throws Exception {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        u1Var.__insertAdapterOfWorkSpec.c(_connection, m0Var);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int I0(String str, long j11, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.x(1, j11);
            dVarL1.c2(2, str2);
            dVarL1.I1();
            return wa.l.a(_connection);
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int J0(String str, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.I1();
            return wa.l.a(_connection);
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 K0(String str, String str2, int i11, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.c2(1, str2);
            dVarL1.x(2, i11);
            dVarL1.I1();
            return jn0.h0.f84049a;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int L0(String str, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.c2(1, str2);
            dVarL1.I1();
            return wa.l.a(_connection);
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int M0(String str, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.c2(1, str2);
            dVarL1.I1();
            return wa.l.a(_connection);
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 N0(String str, long j11, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.x(1, j11);
            dVarL1.c2(2, str2);
            dVarL1.I1();
            return jn0.h0.f84049a;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 O0(String str, androidx.work.g gVar, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.y(1, androidx.work.g.INSTANCE.e(gVar));
            dVarL1.c2(2, str2);
            dVarL1.I1();
            return jn0.h0.f84049a;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int P0(String str, androidx.work.r0.c cVar, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.x(1, c2.k(cVar));
            dVarL1.c2(2, str2);
            dVarL1.I1();
            return wa.l.a(_connection);
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Q0(String str, int i11, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.x(1, i11);
            dVarL1.c2(2, str2);
            dVarL1.I1();
            return jn0.h0.f84049a;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 R0(u1 u1Var, m0 m0Var, ya.b _connection) throws Exception {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        u1Var.__updateAdapterOfWorkSpec.c(_connection, m0Var);
        return jn0.h0.f84049a;
    }

    private final void k0(final ya.b _connection, androidx.collection.a<String, List<androidx.work.g>> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            wa.j.a(_map, true, new wn0.l() { // from class: sb.c1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u1.l0(this.f110780a, _connection, (androidx.collection.a) obj);
                }
            });
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        wa.q.a(sb2, setKeySet.size());
        sb2.append(")");
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        ya.d dVarL1 = _connection.L1(string);
        Iterator<String> it = setKeySet.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            dVarL1.c2(i11, it.next());
            i11++;
        }
        try {
            int iC = wa.m.c(dVarL1, "work_spec_id");
            if (iC == -1) {
                dVarL1.close();
                return;
            }
            while (dVarL1.I1()) {
                List<androidx.work.g> list = _map.get(dVarL1.q3(iC));
                if (list != null) {
                    list.add(androidx.work.g.INSTANCE.a(dVarL1.getBlob(0)));
                }
            }
            dVarL1.close();
        } catch (Throwable th2) {
            dVarL1.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 l0(u1 u1Var, ya.b bVar, androidx.collection.a _tmpMap) {
        p013kotlin.jvm.internal.s.k(_tmpMap, "_tmpMap");
        u1Var.k0(bVar, _tmpMap);
        return jn0.h0.f84049a;
    }

    private final void m0(final ya.b _connection, androidx.collection.a<String, List<String>> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            wa.j.a(_map, true, new wn0.l() { // from class: sb.d1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u1.n0(this.f110791a, _connection, (androidx.collection.a) obj);
                }
            });
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        wa.q.a(sb2, setKeySet.size());
        sb2.append(")");
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        ya.d dVarL1 = _connection.L1(string);
        Iterator<String> it = setKeySet.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            dVarL1.c2(i11, it.next());
            i11++;
        }
        try {
            int iC = wa.m.c(dVarL1, "work_spec_id");
            if (iC == -1) {
                dVarL1.close();
                return;
            }
            while (dVarL1.I1()) {
                List<String> list = _map.get(dVarL1.q3(iC));
                if (list != null) {
                    list.add(dVarL1.q3(0));
                }
            }
            dVarL1.close();
        } catch (Throwable th2) {
            dVarL1.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 n0(u1 u1Var, ya.b bVar, androidx.collection.a _tmpMap) {
        p013kotlin.jvm.internal.s.k(_tmpMap, "_tmpMap");
        u1Var.m0(bVar, _tmpMap);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o0(String str, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            return dVarL1.I1() ? (int) dVarL1.getLong(0) : 0;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 p0(String str, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.c2(1, str2);
            dVarL1.I1();
            return jn0.h0.f84049a;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List q0(String str, int i11, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.x(1, i11);
            int iD = wa.m.d(dVarL1, "id");
            int iD2 = wa.m.d(dVarL1, "state");
            int iD3 = wa.m.d(dVarL1, "worker_class_name");
            int iD4 = wa.m.d(dVarL1, "input_merger_class_name");
            int iD5 = wa.m.d(dVarL1, "input");
            int iD6 = wa.m.d(dVarL1, "output");
            int iD7 = wa.m.d(dVarL1, "initial_delay");
            int iD8 = wa.m.d(dVarL1, "interval_duration");
            int iD9 = wa.m.d(dVarL1, "flex_duration");
            int iD10 = wa.m.d(dVarL1, "run_attempt_count");
            int iD11 = wa.m.d(dVarL1, "backoff_policy");
            int iD12 = wa.m.d(dVarL1, "backoff_delay_duration");
            int iD13 = wa.m.d(dVarL1, "last_enqueue_time");
            int iD14 = wa.m.d(dVarL1, "minimum_retention_duration");
            int iD15 = wa.m.d(dVarL1, "schedule_requested_at");
            int iD16 = wa.m.d(dVarL1, "run_in_foreground");
            int iD17 = wa.m.d(dVarL1, "out_of_quota_policy");
            int iD18 = wa.m.d(dVarL1, "period_count");
            int iD19 = wa.m.d(dVarL1, "generation");
            int iD20 = wa.m.d(dVarL1, "next_schedule_time_override");
            int iD21 = wa.m.d(dVarL1, "next_schedule_time_override_generation");
            int iD22 = wa.m.d(dVarL1, "stop_reason");
            int iD23 = wa.m.d(dVarL1, "trace_tag");
            int iD24 = wa.m.d(dVarL1, "backoff_on_system_interruptions");
            int iD25 = wa.m.d(dVarL1, "required_network_type");
            int iD26 = wa.m.d(dVarL1, "required_network_request");
            int iD27 = wa.m.d(dVarL1, "requires_charging");
            int iD28 = wa.m.d(dVarL1, "requires_device_idle");
            int iD29 = wa.m.d(dVarL1, "requires_battery_not_low");
            int iD30 = wa.m.d(dVarL1, "requires_storage_not_low");
            int iD31 = wa.m.d(dVarL1, "trigger_content_update_delay");
            int iD32 = wa.m.d(dVarL1, "trigger_max_content_delay");
            int iD33 = wa.m.d(dVarL1, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarL1.I1()) {
                String strQ3 = dVarL1.q3(iD);
                int i12 = iD13;
                int i13 = iD14;
                androidx.work.r0.c cVarG = c2.g((int) dVarL1.getLong(iD2));
                String strQ4 = dVarL1.q3(iD3);
                String strQ5 = dVarL1.q3(iD4);
                byte[] blob = dVarL1.getBlob(iD5);
                androidx.work.g.Companion companion = androidx.work.g.INSTANCE;
                androidx.work.g gVarA = companion.a(blob);
                androidx.work.g gVarA2 = companion.a(dVarL1.getBlob(iD6));
                long j11 = dVarL1.getLong(iD7);
                long j12 = dVarL1.getLong(iD8);
                long j13 = dVarL1.getLong(iD9);
                int i14 = (int) dVarL1.getLong(iD10);
                int i15 = iD;
                int i16 = iD2;
                androidx.work.a aVarD = c2.d((int) dVarL1.getLong(iD11));
                long j14 = dVarL1.getLong(iD12);
                long j15 = dVarL1.getLong(i12);
                long j16 = dVarL1.getLong(i13);
                int i17 = iD15;
                long j17 = dVarL1.getLong(i17);
                iD15 = i17;
                int i18 = iD16;
                int i19 = iD3;
                boolean z11 = ((int) dVarL1.getLong(i18)) != 0;
                int i21 = iD17;
                int i22 = iD4;
                androidx.work.i0 i0VarF = c2.f((int) dVarL1.getLong(i21));
                int i23 = iD18;
                int i24 = (int) dVarL1.getLong(i23);
                int i25 = iD19;
                int i26 = (int) dVarL1.getLong(i25);
                int i27 = iD20;
                long j18 = dVarL1.getLong(i27);
                int i28 = iD21;
                int i29 = (int) dVarL1.getLong(i28);
                iD21 = i28;
                iD22 = iD22;
                int i31 = (int) dVarL1.getLong(iD22);
                int i32 = iD23;
                Boolean boolValueOf = null;
                String strQ6 = dVarL1.isNull(i32) ? null : dVarL1.q3(i32);
                int i33 = iD24;
                Integer numValueOf = dVarL1.isNull(i33) ? null : Integer.valueOf((int) dVarL1.getLong(i33));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i34 = iD25;
                androidx.work.a0 a0VarE = c2.e((int) dVarL1.getLong(i34));
                int i35 = iD26;
                NetworkRequestCompat networkRequestCompatL = c2.l(dVarL1.getBlob(i35));
                int i36 = iD27;
                boolean z12 = ((int) dVarL1.getLong(i36)) != 0;
                int i37 = iD28;
                boolean z13 = ((int) dVarL1.getLong(i37)) != 0;
                int i38 = iD29;
                boolean z14 = ((int) dVarL1.getLong(i38)) != 0;
                iD29 = i38;
                int i39 = iD30;
                int i41 = iD31;
                int i42 = iD32;
                iD31 = i41;
                int i43 = iD33;
                arrayList.add(new m0(strQ3, cVarG, strQ4, strQ5, gVarA, gVarA2, j11, j12, j13, new androidx.work.e(networkRequestCompatL, a0VarE, z12, z13, z14, ((int) dVarL1.getLong(i39)) != 0, dVarL1.getLong(i41), dVarL1.getLong(i42), c2.b(dVarL1.getBlob(i43))), i14, aVarD, j14, j15, j16, j17, z11, i0VarF, i24, i26, j18, i29, i31, strQ6, bool));
                iD28 = i37;
                iD4 = i22;
                iD17 = i21;
                iD18 = i23;
                iD19 = i25;
                iD20 = i27;
                iD23 = i32;
                iD24 = i33;
                iD25 = i34;
                iD26 = i35;
                iD27 = i36;
                iD33 = i43;
                iD32 = i42;
                iD30 = i39;
                iD = i15;
                iD13 = i12;
                iD14 = i13;
                iD2 = i16;
                iD3 = i19;
                iD16 = i18;
            }
            return arrayList;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r0(String str, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (dVarL1.I1()) {
                arrayList.add(dVarL1.q3(0));
            }
            dVarL1.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarL1.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List s0(String str, int i11, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.x(1, i11);
            int iD = wa.m.d(dVarL1, "id");
            int iD2 = wa.m.d(dVarL1, "state");
            int iD3 = wa.m.d(dVarL1, "worker_class_name");
            int iD4 = wa.m.d(dVarL1, "input_merger_class_name");
            int iD5 = wa.m.d(dVarL1, "input");
            int iD6 = wa.m.d(dVarL1, "output");
            int iD7 = wa.m.d(dVarL1, "initial_delay");
            int iD8 = wa.m.d(dVarL1, "interval_duration");
            int iD9 = wa.m.d(dVarL1, "flex_duration");
            int iD10 = wa.m.d(dVarL1, "run_attempt_count");
            int iD11 = wa.m.d(dVarL1, "backoff_policy");
            int iD12 = wa.m.d(dVarL1, "backoff_delay_duration");
            int iD13 = wa.m.d(dVarL1, "last_enqueue_time");
            int iD14 = wa.m.d(dVarL1, "minimum_retention_duration");
            int iD15 = wa.m.d(dVarL1, "schedule_requested_at");
            int iD16 = wa.m.d(dVarL1, "run_in_foreground");
            int iD17 = wa.m.d(dVarL1, "out_of_quota_policy");
            int iD18 = wa.m.d(dVarL1, "period_count");
            int iD19 = wa.m.d(dVarL1, "generation");
            int iD20 = wa.m.d(dVarL1, "next_schedule_time_override");
            int iD21 = wa.m.d(dVarL1, "next_schedule_time_override_generation");
            int iD22 = wa.m.d(dVarL1, "stop_reason");
            int iD23 = wa.m.d(dVarL1, "trace_tag");
            int iD24 = wa.m.d(dVarL1, "backoff_on_system_interruptions");
            int iD25 = wa.m.d(dVarL1, "required_network_type");
            int iD26 = wa.m.d(dVarL1, "required_network_request");
            int iD27 = wa.m.d(dVarL1, "requires_charging");
            int iD28 = wa.m.d(dVarL1, "requires_device_idle");
            int iD29 = wa.m.d(dVarL1, "requires_battery_not_low");
            int iD30 = wa.m.d(dVarL1, "requires_storage_not_low");
            int iD31 = wa.m.d(dVarL1, "trigger_content_update_delay");
            int iD32 = wa.m.d(dVarL1, "trigger_max_content_delay");
            int iD33 = wa.m.d(dVarL1, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarL1.I1()) {
                String strQ3 = dVarL1.q3(iD);
                int i12 = iD13;
                int i13 = iD14;
                androidx.work.r0.c cVarG = c2.g((int) dVarL1.getLong(iD2));
                String strQ4 = dVarL1.q3(iD3);
                String strQ5 = dVarL1.q3(iD4);
                byte[] blob = dVarL1.getBlob(iD5);
                androidx.work.g.Companion companion = androidx.work.g.INSTANCE;
                androidx.work.g gVarA = companion.a(blob);
                androidx.work.g gVarA2 = companion.a(dVarL1.getBlob(iD6));
                long j11 = dVarL1.getLong(iD7);
                long j12 = dVarL1.getLong(iD8);
                long j13 = dVarL1.getLong(iD9);
                int i14 = (int) dVarL1.getLong(iD10);
                int i15 = iD;
                int i16 = iD2;
                androidx.work.a aVarD = c2.d((int) dVarL1.getLong(iD11));
                long j14 = dVarL1.getLong(iD12);
                long j15 = dVarL1.getLong(i12);
                long j16 = dVarL1.getLong(i13);
                int i17 = iD15;
                long j17 = dVarL1.getLong(i17);
                iD15 = i17;
                int i18 = iD16;
                int i19 = iD3;
                boolean z11 = ((int) dVarL1.getLong(i18)) != 0;
                int i21 = iD17;
                int i22 = iD4;
                androidx.work.i0 i0VarF = c2.f((int) dVarL1.getLong(i21));
                int i23 = iD18;
                int i24 = (int) dVarL1.getLong(i23);
                int i25 = iD19;
                int i26 = (int) dVarL1.getLong(i25);
                int i27 = iD20;
                long j18 = dVarL1.getLong(i27);
                int i28 = iD21;
                int i29 = (int) dVarL1.getLong(i28);
                iD21 = i28;
                iD22 = iD22;
                int i31 = (int) dVarL1.getLong(iD22);
                int i32 = iD23;
                Boolean boolValueOf = null;
                String strQ6 = dVarL1.isNull(i32) ? null : dVarL1.q3(i32);
                int i33 = iD24;
                Integer numValueOf = dVarL1.isNull(i33) ? null : Integer.valueOf((int) dVarL1.getLong(i33));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i34 = iD25;
                androidx.work.a0 a0VarE = c2.e((int) dVarL1.getLong(i34));
                int i35 = iD26;
                NetworkRequestCompat networkRequestCompatL = c2.l(dVarL1.getBlob(i35));
                int i36 = iD27;
                boolean z12 = ((int) dVarL1.getLong(i36)) != 0;
                int i37 = iD28;
                boolean z13 = ((int) dVarL1.getLong(i37)) != 0;
                int i38 = iD29;
                boolean z14 = ((int) dVarL1.getLong(i38)) != 0;
                iD29 = i38;
                int i39 = iD30;
                int i41 = iD31;
                int i42 = iD32;
                iD31 = i41;
                int i43 = iD33;
                arrayList.add(new m0(strQ3, cVarG, strQ4, strQ5, gVarA, gVarA2, j11, j12, j13, new androidx.work.e(networkRequestCompatL, a0VarE, z12, z13, z14, ((int) dVarL1.getLong(i39)) != 0, dVarL1.getLong(i41), dVarL1.getLong(i42), c2.b(dVarL1.getBlob(i43))), i14, aVarD, j14, j15, j16, j17, z11, i0VarF, i24, i26, j18, i29, i31, strQ6, bool));
                iD28 = i37;
                iD4 = i22;
                iD17 = i21;
                iD18 = i23;
                iD19 = i25;
                iD20 = i27;
                iD23 = i32;
                iD24 = i33;
                iD25 = i34;
                iD26 = i35;
                iD27 = i36;
                iD33 = i43;
                iD32 = i42;
                iD30 = i39;
                iD = i15;
                iD13 = i12;
                iD14 = i13;
                iD2 = i16;
                iD3 = i19;
                iD16 = i18;
            }
            return arrayList;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List t0(String str, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            int iD = wa.m.d(dVarL1, "id");
            int iD2 = wa.m.d(dVarL1, "state");
            int iD3 = wa.m.d(dVarL1, "worker_class_name");
            int iD4 = wa.m.d(dVarL1, "input_merger_class_name");
            int iD5 = wa.m.d(dVarL1, "input");
            int iD6 = wa.m.d(dVarL1, "output");
            int iD7 = wa.m.d(dVarL1, "initial_delay");
            int iD8 = wa.m.d(dVarL1, "interval_duration");
            int iD9 = wa.m.d(dVarL1, "flex_duration");
            int iD10 = wa.m.d(dVarL1, "run_attempt_count");
            int iD11 = wa.m.d(dVarL1, "backoff_policy");
            int iD12 = wa.m.d(dVarL1, "backoff_delay_duration");
            int iD13 = wa.m.d(dVarL1, "last_enqueue_time");
            int iD14 = wa.m.d(dVarL1, "minimum_retention_duration");
            int iD15 = wa.m.d(dVarL1, "schedule_requested_at");
            int iD16 = wa.m.d(dVarL1, "run_in_foreground");
            int iD17 = wa.m.d(dVarL1, "out_of_quota_policy");
            int iD18 = wa.m.d(dVarL1, "period_count");
            int iD19 = wa.m.d(dVarL1, "generation");
            int iD20 = wa.m.d(dVarL1, "next_schedule_time_override");
            int iD21 = wa.m.d(dVarL1, "next_schedule_time_override_generation");
            int iD22 = wa.m.d(dVarL1, "stop_reason");
            int iD23 = wa.m.d(dVarL1, "trace_tag");
            int iD24 = wa.m.d(dVarL1, "backoff_on_system_interruptions");
            int iD25 = wa.m.d(dVarL1, "required_network_type");
            int iD26 = wa.m.d(dVarL1, "required_network_request");
            int iD27 = wa.m.d(dVarL1, "requires_charging");
            int iD28 = wa.m.d(dVarL1, "requires_device_idle");
            int iD29 = wa.m.d(dVarL1, "requires_battery_not_low");
            int iD30 = wa.m.d(dVarL1, "requires_storage_not_low");
            int iD31 = wa.m.d(dVarL1, "trigger_content_update_delay");
            int iD32 = wa.m.d(dVarL1, "trigger_max_content_delay");
            int iD33 = wa.m.d(dVarL1, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarL1.I1()) {
                String strQ3 = dVarL1.q3(iD);
                int i11 = iD14;
                ArrayList arrayList2 = arrayList;
                androidx.work.r0.c cVarG = c2.g((int) dVarL1.getLong(iD2));
                String strQ4 = dVarL1.q3(iD3);
                String strQ5 = dVarL1.q3(iD4);
                byte[] blob = dVarL1.getBlob(iD5);
                androidx.work.g.Companion companion = androidx.work.g.INSTANCE;
                androidx.work.g gVarA = companion.a(blob);
                androidx.work.g gVarA2 = companion.a(dVarL1.getBlob(iD6));
                long j11 = dVarL1.getLong(iD7);
                long j12 = dVarL1.getLong(iD8);
                long j13 = dVarL1.getLong(iD9);
                int i12 = (int) dVarL1.getLong(iD10);
                int i13 = iD2;
                int i14 = iD3;
                androidx.work.a aVarD = c2.d((int) dVarL1.getLong(iD11));
                long j14 = dVarL1.getLong(iD12);
                long j15 = dVarL1.getLong(iD13);
                long j16 = dVarL1.getLong(i11);
                int i15 = iD15;
                long j17 = dVarL1.getLong(i15);
                int i16 = iD;
                int i17 = iD16;
                boolean z11 = ((int) dVarL1.getLong(i17)) != 0;
                int i18 = iD17;
                int i19 = iD4;
                androidx.work.i0 i0VarF = c2.f((int) dVarL1.getLong(i18));
                int i21 = iD18;
                int i22 = iD5;
                int i23 = (int) dVarL1.getLong(i21);
                int i24 = iD19;
                int i25 = (int) dVarL1.getLong(i24);
                int i26 = iD20;
                long j18 = dVarL1.getLong(i26);
                int i27 = iD21;
                int i28 = (int) dVarL1.getLong(i27);
                int i29 = iD22;
                int i31 = (int) dVarL1.getLong(i29);
                int i32 = iD23;
                Boolean boolValueOf = null;
                String strQ6 = dVarL1.isNull(i32) ? null : dVarL1.q3(i32);
                int i33 = iD24;
                Integer numValueOf = dVarL1.isNull(i33) ? null : Integer.valueOf((int) dVarL1.getLong(i33));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i34 = iD25;
                Boolean bool = boolValueOf;
                androidx.work.a0 a0VarE = c2.e((int) dVarL1.getLong(i34));
                int i35 = iD26;
                NetworkRequestCompat networkRequestCompatL = c2.l(dVarL1.getBlob(i35));
                iD25 = i34;
                iD26 = i35;
                int i36 = iD27;
                boolean z12 = ((int) dVarL1.getLong(i36)) != 0;
                iD27 = i36;
                int i37 = iD28;
                boolean z13 = ((int) dVarL1.getLong(i37)) != 0;
                int i38 = iD29;
                boolean z14 = ((int) dVarL1.getLong(i38)) != 0;
                iD29 = i38;
                int i39 = iD30;
                int i41 = iD31;
                int i42 = iD32;
                int i43 = iD33;
                iD33 = i43;
                arrayList2.add(new m0(strQ3, cVarG, strQ4, strQ5, gVarA, gVarA2, j11, j12, j13, new androidx.work.e(networkRequestCompatL, a0VarE, z12, z13, z14, ((int) dVarL1.getLong(i39)) != 0, dVarL1.getLong(i41), dVarL1.getLong(i42), c2.b(dVarL1.getBlob(i43))), i12, aVarD, j14, j15, j16, j17, z11, i0VarF, i23, i25, j18, i28, i31, strQ6, bool));
                iD30 = i39;
                iD4 = i19;
                iD17 = i18;
                iD19 = i24;
                iD22 = i29;
                iD24 = i33;
                iD31 = i41;
                iD32 = i42;
                iD2 = i13;
                iD14 = i11;
                iD3 = i14;
                arrayList = arrayList2;
                iD = i16;
                iD15 = i15;
                iD16 = i17;
                iD20 = i26;
                iD21 = i27;
                iD23 = i32;
                iD28 = i37;
                iD5 = i22;
                iD18 = i21;
            }
            return arrayList;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List u0(String str, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.c2(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dVarL1.I1()) {
                arrayList.add(androidx.work.g.INSTANCE.a(dVarL1.getBlob(0)));
            }
            dVarL1.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarL1.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List v0(String str, long j11, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.x(1, j11);
            int iD = wa.m.d(dVarL1, "id");
            int iD2 = wa.m.d(dVarL1, "state");
            int iD3 = wa.m.d(dVarL1, "worker_class_name");
            int iD4 = wa.m.d(dVarL1, "input_merger_class_name");
            int iD5 = wa.m.d(dVarL1, "input");
            int iD6 = wa.m.d(dVarL1, "output");
            int iD7 = wa.m.d(dVarL1, "initial_delay");
            int iD8 = wa.m.d(dVarL1, "interval_duration");
            int iD9 = wa.m.d(dVarL1, "flex_duration");
            int iD10 = wa.m.d(dVarL1, "run_attempt_count");
            int iD11 = wa.m.d(dVarL1, "backoff_policy");
            int iD12 = wa.m.d(dVarL1, "backoff_delay_duration");
            int iD13 = wa.m.d(dVarL1, "last_enqueue_time");
            int iD14 = wa.m.d(dVarL1, "minimum_retention_duration");
            int iD15 = wa.m.d(dVarL1, "schedule_requested_at");
            int iD16 = wa.m.d(dVarL1, "run_in_foreground");
            int iD17 = wa.m.d(dVarL1, "out_of_quota_policy");
            int iD18 = wa.m.d(dVarL1, "period_count");
            int iD19 = wa.m.d(dVarL1, "generation");
            int iD20 = wa.m.d(dVarL1, "next_schedule_time_override");
            int iD21 = wa.m.d(dVarL1, "next_schedule_time_override_generation");
            int iD22 = wa.m.d(dVarL1, "stop_reason");
            int iD23 = wa.m.d(dVarL1, "trace_tag");
            int iD24 = wa.m.d(dVarL1, "backoff_on_system_interruptions");
            int iD25 = wa.m.d(dVarL1, "required_network_type");
            int iD26 = wa.m.d(dVarL1, "required_network_request");
            int iD27 = wa.m.d(dVarL1, "requires_charging");
            int iD28 = wa.m.d(dVarL1, "requires_device_idle");
            int iD29 = wa.m.d(dVarL1, "requires_battery_not_low");
            int iD30 = wa.m.d(dVarL1, "requires_storage_not_low");
            int iD31 = wa.m.d(dVarL1, "trigger_content_update_delay");
            int iD32 = wa.m.d(dVarL1, "trigger_max_content_delay");
            int iD33 = wa.m.d(dVarL1, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarL1.I1()) {
                String strQ3 = dVarL1.q3(iD);
                int i11 = iD13;
                int i12 = iD14;
                androidx.work.r0.c cVarG = c2.g((int) dVarL1.getLong(iD2));
                String strQ4 = dVarL1.q3(iD3);
                String strQ5 = dVarL1.q3(iD4);
                byte[] blob = dVarL1.getBlob(iD5);
                androidx.work.g.Companion companion = androidx.work.g.INSTANCE;
                androidx.work.g gVarA = companion.a(blob);
                androidx.work.g gVarA2 = companion.a(dVarL1.getBlob(iD6));
                long j12 = dVarL1.getLong(iD7);
                long j13 = dVarL1.getLong(iD8);
                long j14 = dVarL1.getLong(iD9);
                int i13 = (int) dVarL1.getLong(iD10);
                int i14 = iD;
                int i15 = iD2;
                androidx.work.a aVarD = c2.d((int) dVarL1.getLong(iD11));
                long j15 = dVarL1.getLong(iD12);
                long j16 = dVarL1.getLong(i11);
                long j17 = dVarL1.getLong(i12);
                int i16 = iD15;
                long j18 = dVarL1.getLong(i16);
                iD15 = i16;
                int i17 = iD16;
                int i18 = iD3;
                boolean z11 = ((int) dVarL1.getLong(i17)) != 0;
                int i19 = iD17;
                int i21 = iD4;
                androidx.work.i0 i0VarF = c2.f((int) dVarL1.getLong(i19));
                int i22 = iD18;
                int i23 = (int) dVarL1.getLong(i22);
                int i24 = iD19;
                int i25 = (int) dVarL1.getLong(i24);
                int i26 = iD20;
                long j19 = dVarL1.getLong(i26);
                int i27 = iD21;
                int i28 = (int) dVarL1.getLong(i27);
                iD21 = i27;
                iD22 = iD22;
                int i29 = (int) dVarL1.getLong(iD22);
                int i31 = iD23;
                Boolean boolValueOf = null;
                String strQ6 = dVarL1.isNull(i31) ? null : dVarL1.q3(i31);
                int i32 = iD24;
                Integer numValueOf = dVarL1.isNull(i32) ? null : Integer.valueOf((int) dVarL1.getLong(i32));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i33 = iD25;
                androidx.work.a0 a0VarE = c2.e((int) dVarL1.getLong(i33));
                int i34 = iD26;
                NetworkRequestCompat networkRequestCompatL = c2.l(dVarL1.getBlob(i34));
                int i35 = iD27;
                boolean z12 = ((int) dVarL1.getLong(i35)) != 0;
                int i36 = iD28;
                boolean z13 = ((int) dVarL1.getLong(i36)) != 0;
                int i37 = iD29;
                boolean z14 = ((int) dVarL1.getLong(i37)) != 0;
                iD29 = i37;
                int i38 = iD30;
                int i39 = iD31;
                int i41 = iD32;
                iD31 = i39;
                int i42 = iD33;
                arrayList.add(new m0(strQ3, cVarG, strQ4, strQ5, gVarA, gVarA2, j12, j13, j14, new androidx.work.e(networkRequestCompatL, a0VarE, z12, z13, z14, ((int) dVarL1.getLong(i38)) != 0, dVarL1.getLong(i39), dVarL1.getLong(i41), c2.b(dVarL1.getBlob(i42))), i13, aVarD, j15, j16, j17, j18, z11, i0VarF, i23, i25, j19, i28, i29, strQ6, bool));
                iD4 = i21;
                iD17 = i19;
                iD18 = i22;
                iD19 = i24;
                iD20 = i26;
                iD23 = i31;
                iD24 = i32;
                iD25 = i33;
                iD26 = i34;
                iD27 = i35;
                iD28 = i36;
                iD33 = i42;
                iD32 = i41;
                iD30 = i38;
                iD = i14;
                iD13 = i11;
                iD14 = i12;
                iD2 = i15;
                iD3 = i18;
                iD16 = i17;
            }
            return arrayList;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List w0(String str, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            int iD = wa.m.d(dVarL1, "id");
            int iD2 = wa.m.d(dVarL1, "state");
            int iD3 = wa.m.d(dVarL1, "worker_class_name");
            int iD4 = wa.m.d(dVarL1, "input_merger_class_name");
            int iD5 = wa.m.d(dVarL1, "input");
            int iD6 = wa.m.d(dVarL1, "output");
            int iD7 = wa.m.d(dVarL1, "initial_delay");
            int iD8 = wa.m.d(dVarL1, "interval_duration");
            int iD9 = wa.m.d(dVarL1, "flex_duration");
            int iD10 = wa.m.d(dVarL1, "run_attempt_count");
            int iD11 = wa.m.d(dVarL1, "backoff_policy");
            int iD12 = wa.m.d(dVarL1, "backoff_delay_duration");
            int iD13 = wa.m.d(dVarL1, "last_enqueue_time");
            int iD14 = wa.m.d(dVarL1, "minimum_retention_duration");
            int iD15 = wa.m.d(dVarL1, "schedule_requested_at");
            int iD16 = wa.m.d(dVarL1, "run_in_foreground");
            int iD17 = wa.m.d(dVarL1, "out_of_quota_policy");
            int iD18 = wa.m.d(dVarL1, "period_count");
            int iD19 = wa.m.d(dVarL1, "generation");
            int iD20 = wa.m.d(dVarL1, "next_schedule_time_override");
            int iD21 = wa.m.d(dVarL1, "next_schedule_time_override_generation");
            int iD22 = wa.m.d(dVarL1, "stop_reason");
            int iD23 = wa.m.d(dVarL1, "trace_tag");
            int iD24 = wa.m.d(dVarL1, "backoff_on_system_interruptions");
            int iD25 = wa.m.d(dVarL1, "required_network_type");
            int iD26 = wa.m.d(dVarL1, "required_network_request");
            int iD27 = wa.m.d(dVarL1, "requires_charging");
            int iD28 = wa.m.d(dVarL1, "requires_device_idle");
            int iD29 = wa.m.d(dVarL1, "requires_battery_not_low");
            int iD30 = wa.m.d(dVarL1, "requires_storage_not_low");
            int iD31 = wa.m.d(dVarL1, "trigger_content_update_delay");
            int iD32 = wa.m.d(dVarL1, "trigger_max_content_delay");
            int iD33 = wa.m.d(dVarL1, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarL1.I1()) {
                String strQ3 = dVarL1.q3(iD);
                int i11 = iD14;
                ArrayList arrayList2 = arrayList;
                androidx.work.r0.c cVarG = c2.g((int) dVarL1.getLong(iD2));
                String strQ4 = dVarL1.q3(iD3);
                String strQ5 = dVarL1.q3(iD4);
                byte[] blob = dVarL1.getBlob(iD5);
                androidx.work.g.Companion companion = androidx.work.g.INSTANCE;
                androidx.work.g gVarA = companion.a(blob);
                androidx.work.g gVarA2 = companion.a(dVarL1.getBlob(iD6));
                long j11 = dVarL1.getLong(iD7);
                long j12 = dVarL1.getLong(iD8);
                long j13 = dVarL1.getLong(iD9);
                int i12 = (int) dVarL1.getLong(iD10);
                int i13 = iD2;
                int i14 = iD3;
                androidx.work.a aVarD = c2.d((int) dVarL1.getLong(iD11));
                long j14 = dVarL1.getLong(iD12);
                long j15 = dVarL1.getLong(iD13);
                long j16 = dVarL1.getLong(i11);
                int i15 = iD15;
                long j17 = dVarL1.getLong(i15);
                int i16 = iD;
                int i17 = iD16;
                boolean z11 = ((int) dVarL1.getLong(i17)) != 0;
                int i18 = iD17;
                int i19 = iD4;
                androidx.work.i0 i0VarF = c2.f((int) dVarL1.getLong(i18));
                int i21 = iD18;
                int i22 = iD5;
                int i23 = (int) dVarL1.getLong(i21);
                int i24 = iD19;
                int i25 = (int) dVarL1.getLong(i24);
                int i26 = iD20;
                long j18 = dVarL1.getLong(i26);
                int i27 = iD21;
                int i28 = (int) dVarL1.getLong(i27);
                int i29 = iD22;
                int i31 = (int) dVarL1.getLong(i29);
                int i32 = iD23;
                Boolean boolValueOf = null;
                String strQ6 = dVarL1.isNull(i32) ? null : dVarL1.q3(i32);
                int i33 = iD24;
                Integer numValueOf = dVarL1.isNull(i33) ? null : Integer.valueOf((int) dVarL1.getLong(i33));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i34 = iD25;
                Boolean bool = boolValueOf;
                androidx.work.a0 a0VarE = c2.e((int) dVarL1.getLong(i34));
                int i35 = iD26;
                NetworkRequestCompat networkRequestCompatL = c2.l(dVarL1.getBlob(i35));
                iD25 = i34;
                iD26 = i35;
                int i36 = iD27;
                boolean z12 = ((int) dVarL1.getLong(i36)) != 0;
                iD27 = i36;
                int i37 = iD28;
                boolean z13 = ((int) dVarL1.getLong(i37)) != 0;
                int i38 = iD29;
                boolean z14 = ((int) dVarL1.getLong(i38)) != 0;
                iD29 = i38;
                int i39 = iD30;
                int i41 = iD31;
                int i42 = iD32;
                int i43 = iD33;
                iD33 = i43;
                arrayList2.add(new m0(strQ3, cVarG, strQ4, strQ5, gVarA, gVarA2, j11, j12, j13, new androidx.work.e(networkRequestCompatL, a0VarE, z12, z13, z14, ((int) dVarL1.getLong(i39)) != 0, dVarL1.getLong(i41), dVarL1.getLong(i42), c2.b(dVarL1.getBlob(i43))), i12, aVarD, j14, j15, j16, j17, z11, i0VarF, i23, i25, j18, i28, i31, strQ6, bool));
                iD30 = i39;
                iD4 = i19;
                iD17 = i18;
                iD19 = i24;
                iD22 = i29;
                iD24 = i33;
                iD31 = i41;
                iD32 = i42;
                iD2 = i13;
                iD14 = i11;
                iD3 = i14;
                arrayList = arrayList2;
                iD = i16;
                iD15 = i15;
                iD16 = i17;
                iD20 = i26;
                iD21 = i27;
                iD23 = i32;
                iD28 = i37;
                iD5 = i22;
                iD18 = i21;
            }
            return arrayList;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List x0(String str, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            int iD = wa.m.d(dVarL1, "id");
            int iD2 = wa.m.d(dVarL1, "state");
            int iD3 = wa.m.d(dVarL1, "worker_class_name");
            int iD4 = wa.m.d(dVarL1, "input_merger_class_name");
            int iD5 = wa.m.d(dVarL1, "input");
            int iD6 = wa.m.d(dVarL1, "output");
            int iD7 = wa.m.d(dVarL1, "initial_delay");
            int iD8 = wa.m.d(dVarL1, "interval_duration");
            int iD9 = wa.m.d(dVarL1, "flex_duration");
            int iD10 = wa.m.d(dVarL1, "run_attempt_count");
            int iD11 = wa.m.d(dVarL1, "backoff_policy");
            int iD12 = wa.m.d(dVarL1, "backoff_delay_duration");
            int iD13 = wa.m.d(dVarL1, "last_enqueue_time");
            int iD14 = wa.m.d(dVarL1, "minimum_retention_duration");
            int iD15 = wa.m.d(dVarL1, "schedule_requested_at");
            int iD16 = wa.m.d(dVarL1, "run_in_foreground");
            int iD17 = wa.m.d(dVarL1, "out_of_quota_policy");
            int iD18 = wa.m.d(dVarL1, "period_count");
            int iD19 = wa.m.d(dVarL1, "generation");
            int iD20 = wa.m.d(dVarL1, "next_schedule_time_override");
            int iD21 = wa.m.d(dVarL1, "next_schedule_time_override_generation");
            int iD22 = wa.m.d(dVarL1, "stop_reason");
            int iD23 = wa.m.d(dVarL1, "trace_tag");
            int iD24 = wa.m.d(dVarL1, "backoff_on_system_interruptions");
            int iD25 = wa.m.d(dVarL1, "required_network_type");
            int iD26 = wa.m.d(dVarL1, "required_network_request");
            int iD27 = wa.m.d(dVarL1, "requires_charging");
            int iD28 = wa.m.d(dVarL1, "requires_device_idle");
            int iD29 = wa.m.d(dVarL1, "requires_battery_not_low");
            int iD30 = wa.m.d(dVarL1, "requires_storage_not_low");
            int iD31 = wa.m.d(dVarL1, "trigger_content_update_delay");
            int iD32 = wa.m.d(dVarL1, "trigger_max_content_delay");
            int iD33 = wa.m.d(dVarL1, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (dVarL1.I1()) {
                String strQ3 = dVarL1.q3(iD);
                int i11 = iD14;
                ArrayList arrayList2 = arrayList;
                androidx.work.r0.c cVarG = c2.g((int) dVarL1.getLong(iD2));
                String strQ4 = dVarL1.q3(iD3);
                String strQ5 = dVarL1.q3(iD4);
                byte[] blob = dVarL1.getBlob(iD5);
                androidx.work.g.Companion companion = androidx.work.g.INSTANCE;
                androidx.work.g gVarA = companion.a(blob);
                androidx.work.g gVarA2 = companion.a(dVarL1.getBlob(iD6));
                long j11 = dVarL1.getLong(iD7);
                long j12 = dVarL1.getLong(iD8);
                long j13 = dVarL1.getLong(iD9);
                int i12 = (int) dVarL1.getLong(iD10);
                int i13 = iD2;
                int i14 = iD3;
                androidx.work.a aVarD = c2.d((int) dVarL1.getLong(iD11));
                long j14 = dVarL1.getLong(iD12);
                long j15 = dVarL1.getLong(iD13);
                long j16 = dVarL1.getLong(i11);
                int i15 = iD15;
                long j17 = dVarL1.getLong(i15);
                int i16 = iD;
                int i17 = iD16;
                boolean z11 = ((int) dVarL1.getLong(i17)) != 0;
                int i18 = iD17;
                int i19 = iD4;
                androidx.work.i0 i0VarF = c2.f((int) dVarL1.getLong(i18));
                int i21 = iD18;
                int i22 = iD5;
                int i23 = (int) dVarL1.getLong(i21);
                int i24 = iD19;
                int i25 = (int) dVarL1.getLong(i24);
                int i26 = iD20;
                long j18 = dVarL1.getLong(i26);
                int i27 = iD21;
                int i28 = (int) dVarL1.getLong(i27);
                int i29 = iD22;
                int i31 = (int) dVarL1.getLong(i29);
                int i32 = iD23;
                Boolean boolValueOf = null;
                String strQ6 = dVarL1.isNull(i32) ? null : dVarL1.q3(i32);
                int i33 = iD24;
                Integer numValueOf = dVarL1.isNull(i33) ? null : Integer.valueOf((int) dVarL1.getLong(i33));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i34 = iD25;
                Boolean bool = boolValueOf;
                androidx.work.a0 a0VarE = c2.e((int) dVarL1.getLong(i34));
                int i35 = iD26;
                NetworkRequestCompat networkRequestCompatL = c2.l(dVarL1.getBlob(i35));
                iD25 = i34;
                iD26 = i35;
                int i36 = iD27;
                boolean z12 = ((int) dVarL1.getLong(i36)) != 0;
                iD27 = i36;
                int i37 = iD28;
                boolean z13 = ((int) dVarL1.getLong(i37)) != 0;
                int i38 = iD29;
                boolean z14 = ((int) dVarL1.getLong(i38)) != 0;
                iD29 = i38;
                int i39 = iD30;
                int i41 = iD31;
                int i42 = iD32;
                int i43 = iD33;
                iD33 = i43;
                arrayList2.add(new m0(strQ3, cVarG, strQ4, strQ5, gVarA, gVarA2, j11, j12, j13, new androidx.work.e(networkRequestCompatL, a0VarE, z12, z13, z14, ((int) dVarL1.getLong(i39)) != 0, dVarL1.getLong(i41), dVarL1.getLong(i42), c2.b(dVarL1.getBlob(i43))), i12, aVarD, j14, j15, j16, j17, z11, i0VarF, i23, i25, j18, i28, i31, strQ6, bool));
                iD30 = i39;
                iD4 = i19;
                iD17 = i18;
                iD19 = i24;
                iD22 = i29;
                iD24 = i33;
                iD31 = i41;
                iD32 = i42;
                iD2 = i13;
                iD14 = i11;
                iD3 = i14;
                arrayList = arrayList2;
                iD = i16;
                iD15 = i15;
                iD16 = i17;
                iD20 = i26;
                iD21 = i27;
                iD23 = i32;
                iD28 = i37;
                iD5 = i22;
                iD18 = i21;
            }
            return arrayList;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.work.r0.c y0(String str, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.c2(1, str2);
            androidx.work.r0.c cVarG = null;
            if (dVarL1.I1()) {
                Integer numValueOf = dVarL1.isNull(0) ? null : Integer.valueOf((int) dVarL1.getLong(0));
                if (numValueOf != null) {
                    cVarG = c2.g(numValueOf.intValue());
                }
            }
            return cVarG;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List z0(String str, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.c2(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dVarL1.I1()) {
                arrayList.add(dVarL1.q3(0));
            }
            dVarL1.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarL1.close();
            throw th2;
        }
    }

    @Override // sb.n0
    public void A(final String id2, final androidx.work.g output) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(output, "output");
        final String str = "UPDATE workspec SET output=? WHERE id=?";
        wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.e1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.O0(str, output, id2, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public List<m0> B() {
        final String str = "SELECT * FROM workspec WHERE state=1";
        return (List) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.u0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.w0(str, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public List<m0.WorkInfoPojo> C(final String tag) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        final String str = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return (List) wa.b.e(this.__db, true, true, new wn0.l() { // from class: sb.p0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.D0(str, tag, this, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public int D(final String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        return ((Number) wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.m1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(u1.G0(str, id2, (ya.b) obj));
            }
        })).intValue();
    }

    @Override // sb.n0
    public androidx.work.r0.c a(final String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "SELECT state FROM workspec WHERE id=?";
        return (androidx.work.r0.c) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.x0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.y0(str, id2, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public void b(final String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "DELETE FROM workspec WHERE id=?";
        wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.p1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.p0(str, id2, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public void c(final String id2, final int stopReason) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "UPDATE workspec SET stop_reason=? WHERE id=?";
        wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.n1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.Q0(str, stopReason, id2, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public List<String> d(final String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.y0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.z0(str, name, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public int e(final String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        return ((Number) wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.a1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(u1.M0(str, id2, (ya.b) obj));
            }
        })).intValue();
    }

    @Override // sb.n0
    public List<String> f(final String tag) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return (List) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.b1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.A0(str, tag, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public List<androidx.work.g> g(final String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";
        return (List) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.l1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.u0(str, id2, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public List<m0> h(final int maxLimit) {
        final String str = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?";
        return (List) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.r1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.q0(str, maxLimit, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public void i(final m0 workSpec) {
        p013kotlin.jvm.internal.s.k(workSpec, "workSpec");
        wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.z0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.H0(this.f110954a, workSpec, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public int j(final androidx.work.r0.c state, final String id2) {
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "UPDATE workspec SET state=? WHERE id=?";
        return ((Number) wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.v0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(u1.P0(str, state, id2, (ya.b) obj));
            }
        })).intValue();
    }

    @Override // sb.n0
    public void k(final String id2, final long enqueueTime) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.f1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.N0(str, enqueueTime, id2, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public List<String> l() {
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)";
        return (List) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.w0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.r0(str, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public List<m0> m() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";
        return (List) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.k1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.t0(str, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public int n(final String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        return ((Number) wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.i1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(u1.L0(str, id2, (ya.b) obj));
            }
        })).intValue();
    }

    @Override // sb.n0
    public int o() {
        final String str = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)";
        return ((Number) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.o1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(u1.o0(str, (ya.b) obj));
            }
        })).intValue();
    }

    @Override // sb.n0
    public void p(final String id2, final int overrideGeneration) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.g1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.K0(str, id2, overrideGeneration, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public void q(final String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.j1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.F0(str, id2, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public List<m0> r(final long startingAt) {
        final String str = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC";
        return (List) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.q0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.v0(str, startingAt, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public List<m0> s() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1";
        return (List) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.r0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.x0(str, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public m0 t(final String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "SELECT * FROM workspec WHERE id=?";
        return (m0) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.o0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.B0(str, id2, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public int u() {
        final String str = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        return ((Number) wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.s1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(u1.J0(str, (ya.b) obj));
            }
        })).intValue();
    }

    @Override // sb.n0
    public void v(final m0 workSpec) {
        p013kotlin.jvm.internal.s.k(workSpec, "workSpec");
        wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.h1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.R0(this.f110817a, workSpec, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public int w(final String id2, final long startTime) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        return ((Number) wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.t0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(u1.I0(str, startTime, id2, (ya.b) obj));
            }
        })).intValue();
    }

    @Override // sb.n0
    public List<m0.IdAndState> x(final String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        final String str = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.t1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.C0(str, name, (ya.b) obj);
            }
        });
    }

    @Override // sb.n0
    public Flow<Boolean> y() {
        final String str = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1";
        return sa.j.a(this.__db, false, new String[]{"workspec"}, new wn0.l() { // from class: sb.q1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(u1.E0(str, (ya.b) obj));
            }
        });
    }

    @Override // sb.n0
    public List<m0> z(final int schedulerLimit) {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";
        return (List) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.s0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u1.s0(str, schedulerLimit, (ya.b) obj);
            }
        });
    }
}
