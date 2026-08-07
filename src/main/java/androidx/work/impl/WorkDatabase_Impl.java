package androidx.work.impl;

import androidx.room.f0;
import androidx.room.p;
import androidx.work.impl.WorkDatabase_Impl;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import co0.d;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.m;
import lb.j0;
import lb.l0;
import lb.m0;
import lb.o0;
import lb.p0;
import lb.q0;
import lb.r0;
import org.webrtc.WebrtcBuildVersion;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import sb.b0;
import sb.b2;
import sb.e0;
import sb.g;
import sb.g0;
import sb.i;
import sb.k0;
import sb.l;
import sb.n0;
import sb.q;
import sb.s;
import sb.u1;
import sb.x;
import sb.x1;
import wa.r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J)\u0010\u000f\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000e0\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r\u0012\u0004\u0012\u00020\u00120\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0019018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u001c018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u001f018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\"018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020%018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00102R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020(018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00102R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020+018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00102R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020.018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00102¨\u0006<"}, d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "Landroidx/room/f0;", "C", "()Landroidx/room/f0;", "Landroidx/room/p;", "createInvalidationTracker", "()Landroidx/room/p;", "Ljn0/h0;", "clearAllTables", "", "Lco0/d;", "", "getRequiredTypeConverterClasses", "()Ljava/util/Map;", "", "Lua/a;", "getRequiredAutoMigrationSpecClasses", "()Ljava/util/Set;", "autoMigrationSpecs", "Lua/b;", "createAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "Lsb/n0;", "j", "()Lsb/n0;", "Lsb/b;", DateTokenConverter.CONVERTER_KEY, "()Lsb/b;", "Lsb/x1;", "k", "()Lsb/x1;", "Lsb/s;", "g", "()Lsb/s;", "Lsb/b0;", "h", "()Lsb/b0;", "Lsb/g0;", IntegerTokenConverter.CONVERTER_KEY, "()Lsb/g0;", "Lsb/i;", "e", "()Lsb/i;", "Lsb/m;", "f", "()Lsb/m;", "Lkotlin/Lazy;", "Lkotlin/Lazy;", "_workSpecDao", "_dependencyDao", "_workTagDao", "_systemIdInfoDao", "_workNameDao", "_workProgressDao", "_preferenceDao", "l", "_rawWorkInfoDao", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy<n0> _workSpecDao = m.b(new wn0.a() { // from class: lb.s0
        @Override // wn0.a
        public final Object invoke() {
            return WorkDatabase_Impl.z(this.f89894a);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy<sb.b> _dependencyDao = m.b(new wn0.a() { // from class: lb.t0
        @Override // wn0.a
        public final Object invoke() {
            return WorkDatabase_Impl.t(this.f89896a);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy<x1> _workTagDao = m.b(new wn0.a() { // from class: lb.u0
        @Override // wn0.a
        public final Object invoke() {
            return WorkDatabase_Impl.A(this.f89897a);
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy<s> _systemIdInfoDao = m.b(new wn0.a() { // from class: lb.v0
        @Override // wn0.a
        public final Object invoke() {
            return WorkDatabase_Impl.w(this.f89902a);
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy<b0> _workNameDao = m.b(new wn0.a() { // from class: lb.w0
        @Override // wn0.a
        public final Object invoke() {
            return WorkDatabase_Impl.x(this.f89907a);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy<g0> _workProgressDao = m.b(new wn0.a() { // from class: lb.x0
        @Override // wn0.a
        public final Object invoke() {
            return WorkDatabase_Impl.y(this.f89909a);
        }
    });

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy<i> _preferenceDao = m.b(new wn0.a() { // from class: lb.y0
        @Override // wn0.a
        public final Object invoke() {
            return WorkDatabase_Impl.u(this.f89912a);
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy<sb.m> _rawWorkInfoDao = m.b(new wn0.a() { // from class: lb.z0
        @Override // wn0.a
        public final Object invoke() {
            return WorkDatabase_Impl.v(this.f89914a);
        }
    });

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/work/impl/WorkDatabase_Impl$a", "Landroidx/room/f0;", "Lya/b;", "connection", "Ljn0/h0;", "a", "(Lya/b;)V", "b", "f", "g", IntegerTokenConverter.CONVERTER_KEY, "h", "Landroidx/room/f0$a;", "j", "(Lya/b;)Landroidx/room/f0$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends f0 {
        a() {
            super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        }

        @Override // androidx.room.f0
        public void a(ya.b connection) throws Exception {
            p013kotlin.jvm.internal.s.k(connection, "connection");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            ya.a.a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
        }

        @Override // androidx.room.f0
        public void b(ya.b connection) throws Exception {
            p013kotlin.jvm.internal.s.k(connection, "connection");
            ya.a.a(connection, "DROP TABLE IF EXISTS `Dependency`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `WorkSpec`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `WorkTag`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `SystemIdInfo`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `WorkName`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `WorkProgress`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `Preference`");
        }

        @Override // androidx.room.f0
        public void f(ya.b connection) {
            p013kotlin.jvm.internal.s.k(connection, "connection");
        }

        @Override // androidx.room.f0
        public void g(ya.b connection) throws Exception {
            p013kotlin.jvm.internal.s.k(connection, "connection");
            ya.a.a(connection, "PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(connection);
        }

        @Override // androidx.room.f0
        public void h(ya.b connection) {
            p013kotlin.jvm.internal.s.k(connection, "connection");
        }

        @Override // androidx.room.f0
        public void i(ya.b connection) {
            p013kotlin.jvm.internal.s.k(connection, "connection");
            wa.b.b(connection);
        }

        @Override // androidx.room.f0
        public f0.a j(ya.b connection) {
            p013kotlin.jvm.internal.s.k(connection, "connection");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("work_spec_id", new r.a("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap.put("prerequisite_id", new r.a("prerequisite_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(new r.c("WorkSpec", "CASCADE", "CASCADE", v.e("work_spec_id"), v.e("id")));
            linkedHashSet.add(new r.c("WorkSpec", "CASCADE", "CASCADE", v.e("prerequisite_id"), v.e("id")));
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(new r.d("index_Dependency_work_spec_id", false, v.e("work_spec_id"), v.e("ASC")));
            linkedHashSet2.add(new r.d("index_Dependency_prerequisite_id", false, v.e("prerequisite_id"), v.e("ASC")));
            r rVar = new r("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
            r.Companion companion = r.INSTANCE;
            r rVarA = companion.a(connection, "Dependency");
            if (!rVar.equals(rVarA)) {
                return new f0.a(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + rVar + "\n Found:\n" + rVarA);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("id", new r.a("id", "TEXT", true, 1, null, 1));
            linkedHashMap2.put("state", new r.a("state", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("worker_class_name", new r.a("worker_class_name", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("input_merger_class_name", new r.a("input_merger_class_name", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("input", new r.a("input", "BLOB", true, 0, null, 1));
            linkedHashMap2.put("output", new r.a("output", "BLOB", true, 0, null, 1));
            linkedHashMap2.put("initial_delay", new r.a("initial_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("interval_duration", new r.a("interval_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("flex_duration", new r.a("flex_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("run_attempt_count", new r.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("backoff_policy", new r.a("backoff_policy", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("backoff_delay_duration", new r.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("last_enqueue_time", new r.a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            linkedHashMap2.put("minimum_retention_duration", new r.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("schedule_requested_at", new r.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("run_in_foreground", new r.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("out_of_quota_policy", new r.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("period_count", new r.a("period_count", "INTEGER", true, 0, WebrtcBuildVersion.maint_version, 1));
            linkedHashMap2.put("generation", new r.a("generation", "INTEGER", true, 0, WebrtcBuildVersion.maint_version, 1));
            linkedHashMap2.put("next_schedule_time_override", new r.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            linkedHashMap2.put("next_schedule_time_override_generation", new r.a("next_schedule_time_override_generation", "INTEGER", true, 0, WebrtcBuildVersion.maint_version, 1));
            linkedHashMap2.put("stop_reason", new r.a("stop_reason", "INTEGER", true, 0, "-256", 1));
            linkedHashMap2.put("trace_tag", new r.a("trace_tag", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("backoff_on_system_interruptions", new r.a("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
            linkedHashMap2.put("required_network_type", new r.a("required_network_type", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("required_network_request", new r.a("required_network_request", "BLOB", true, 0, "x''", 1));
            linkedHashMap2.put("requires_charging", new r.a("requires_charging", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_device_idle", new r.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_battery_not_low", new r.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_storage_not_low", new r.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("trigger_content_update_delay", new r.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("trigger_max_content_delay", new r.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("content_uri_triggers", new r.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            linkedHashSet4.add(new r.d("index_WorkSpec_schedule_requested_at", false, v.e("schedule_requested_at"), v.e("ASC")));
            linkedHashSet4.add(new r.d("index_WorkSpec_last_enqueue_time", false, v.e("last_enqueue_time"), v.e("ASC")));
            r rVar2 = new r("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
            r rVarA2 = companion.a(connection, "WorkSpec");
            if (!rVar2.equals(rVarA2)) {
                return new f0.a(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + rVar2 + "\n Found:\n" + rVarA2);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("tag", new r.a("tag", "TEXT", true, 1, null, 1));
            linkedHashMap3.put("work_spec_id", new r.a("work_spec_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            linkedHashSet5.add(new r.c("WorkSpec", "CASCADE", "CASCADE", v.e("work_spec_id"), v.e("id")));
            LinkedHashSet linkedHashSet6 = new LinkedHashSet();
            linkedHashSet6.add(new r.d("index_WorkTag_work_spec_id", false, v.e("work_spec_id"), v.e("ASC")));
            r rVar3 = new r("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
            r rVarA3 = companion.a(connection, "WorkTag");
            if (!rVar3.equals(rVarA3)) {
                return new f0.a(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + rVar3 + "\n Found:\n" + rVarA3);
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.put("work_spec_id", new r.a("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap4.put("generation", new r.a("generation", "INTEGER", true, 2, WebrtcBuildVersion.maint_version, 1));
            linkedHashMap4.put("system_id", new r.a("system_id", "INTEGER", true, 0, null, 1));
            LinkedHashSet linkedHashSet7 = new LinkedHashSet();
            linkedHashSet7.add(new r.c("WorkSpec", "CASCADE", "CASCADE", v.e("work_spec_id"), v.e("id")));
            r rVar4 = new r("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
            r rVarA4 = companion.a(connection, "SystemIdInfo");
            if (!rVar4.equals(rVarA4)) {
                return new f0.a(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + rVar4 + "\n Found:\n" + rVarA4);
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            linkedHashMap5.put("name", new r.a("name", "TEXT", true, 1, null, 1));
            linkedHashMap5.put("work_spec_id", new r.a("work_spec_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet8 = new LinkedHashSet();
            linkedHashSet8.add(new r.c("WorkSpec", "CASCADE", "CASCADE", v.e("work_spec_id"), v.e("id")));
            LinkedHashSet linkedHashSet9 = new LinkedHashSet();
            linkedHashSet9.add(new r.d("index_WorkName_work_spec_id", false, v.e("work_spec_id"), v.e("ASC")));
            r rVar5 = new r("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
            r rVarA5 = companion.a(connection, "WorkName");
            if (!rVar5.equals(rVarA5)) {
                return new f0.a(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + rVar5 + "\n Found:\n" + rVarA5);
            }
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            linkedHashMap6.put("work_spec_id", new r.a("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap6.put(ReactProgressBarViewManager.PROP_PROGRESS, new r.a(ReactProgressBarViewManager.PROP_PROGRESS, "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet10 = new LinkedHashSet();
            linkedHashSet10.add(new r.c("WorkSpec", "CASCADE", "CASCADE", v.e("work_spec_id"), v.e("id")));
            r rVar6 = new r("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
            r rVarA6 = companion.a(connection, "WorkProgress");
            if (!rVar6.equals(rVarA6)) {
                return new f0.a(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + rVar6 + "\n Found:\n" + rVarA6);
            }
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            linkedHashMap7.put(Action.KEY_ATTRIBUTE, new r.a(Action.KEY_ATTRIBUTE, "TEXT", true, 1, null, 1));
            linkedHashMap7.put("long_value", new r.a("long_value", "INTEGER", false, 0, null, 1));
            r rVar7 = new r("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
            r rVarA7 = companion.a(connection, "Preference");
            if (rVar7.equals(rVarA7)) {
                return new f0.a(true, null);
            }
            return new f0.a(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + rVar7 + "\n Found:\n" + rVarA7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b2 A(WorkDatabase_Impl workDatabase_Impl) {
        return new b2(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g t(WorkDatabase_Impl workDatabase_Impl) {
        return new g(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l u(WorkDatabase_Impl workDatabase_Impl) {
        return new l(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q v(WorkDatabase_Impl workDatabase_Impl) {
        return new q(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x w(WorkDatabase_Impl workDatabase_Impl) {
        return new x(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 x(WorkDatabase_Impl workDatabase_Impl) {
        return new e0(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k0 y(WorkDatabase_Impl workDatabase_Impl) {
        return new k0(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 z(WorkDatabase_Impl workDatabase_Impl) {
        return new u1(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.b0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public f0 createOpenDelegate() {
        return new a();
    }

    @Override // androidx.room.b0
    public void clearAllTables() {
        super.performClear(true, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.b0
    public List<ua.b> createAutoMigrations(Map<d<? extends ua.a>, ? extends ua.a> autoMigrationSpecs) {
        p013kotlin.jvm.internal.s.k(autoMigrationSpecs, "autoMigrationSpecs");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j0());
        arrayList.add(new lb.k0());
        arrayList.add(new l0());
        arrayList.add(new m0());
        arrayList.add(new lb.n0());
        arrayList.add(new o0());
        arrayList.add(new p0());
        arrayList.add(new q0());
        arrayList.add(new r0());
        return arrayList;
    }

    @Override // androidx.room.b0
    protected p createInvalidationTracker() {
        return new p(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public sb.b d() {
        return this._dependencyDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public i e() {
        return this._preferenceDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public sb.m f() {
        return this._rawWorkInfoDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public s g() {
        return this._systemIdInfoDao.getValue();
    }

    @Override // androidx.room.b0
    public Set<d<? extends ua.a>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.b0
    protected Map<d<?>, List<d<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(p013kotlin.jvm.internal.o0.b(n0.class), u1.INSTANCE.a());
        linkedHashMap.put(p013kotlin.jvm.internal.o0.b(sb.b.class), g.INSTANCE.a());
        linkedHashMap.put(p013kotlin.jvm.internal.o0.b(x1.class), b2.INSTANCE.a());
        linkedHashMap.put(p013kotlin.jvm.internal.o0.b(s.class), x.INSTANCE.a());
        linkedHashMap.put(p013kotlin.jvm.internal.o0.b(b0.class), e0.INSTANCE.a());
        linkedHashMap.put(p013kotlin.jvm.internal.o0.b(g0.class), k0.INSTANCE.a());
        linkedHashMap.put(p013kotlin.jvm.internal.o0.b(i.class), l.INSTANCE.a());
        linkedHashMap.put(p013kotlin.jvm.internal.o0.b(sb.m.class), q.INSTANCE.a());
        return linkedHashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public b0 h() {
        return this._workNameDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public g0 i() {
        return this._workProgressDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public n0 j() {
        return this._workSpecDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public x1 k() {
        return this._workTagDao.getValue();
    }
}
