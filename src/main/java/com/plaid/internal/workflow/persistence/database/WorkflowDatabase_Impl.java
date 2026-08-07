package com.plaid.internal.workflow.persistence.database;

import androidx.annotation.NonNull;
import androidx.room.b0;
import androidx.room.e;
import androidx.room.h0;
import androidx.room.p;
import ch.qos.logback.core.joran.action.Action;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.C4;
import com.plaid.internal.H4;
import com.plaid.internal.I3;
import com.plaid.internal.P3;
import com.plaid.internal.T7;
import com.plaid.internal.b8;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ua.b;
import wa.r;
import za.c;
import za.d;

/* JADX INFO: loaded from: classes6.dex */
public final class WorkflowDatabase_Impl extends WorkflowDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile H4 f48206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile P3 f48207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile b8 f48208c;

    @Override // androidx.room.b0
    public final void clearAllTables() {
        assertNotMainThread();
        c writableDatabase = getOpenHelper().getWritableDatabase();
        try {
            beginTransaction();
            writableDatabase.Q1("DELETE FROM `workflow_pane`");
            writableDatabase.Q1("DELETE FROM `workflow_local_key_values`");
            writableDatabase.Q1("DELETE FROM `workflow_analytics`");
            setTransactionSuccessful();
        } finally {
            endTransaction();
            writableDatabase.l3("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.y3()) {
                writableDatabase.Q1("VACUUM");
            }
        }
    }

    @Override // androidx.room.b0
    @NonNull
    public final p createInvalidationTracker() {
        return new p(this, new HashMap(0), new HashMap(0), "workflow_pane", "workflow_local_key_values", "workflow_analytics");
    }

    @Override // androidx.room.b0
    @NonNull
    public final d createOpenHelper(@NonNull e eVar) {
        return eVar.sqliteOpenHelperFactory.a(d.b.a(eVar.ch.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String).d(eVar.name).c(new h0(eVar, new a(), "bbbb42d6a8058409381c7dda80a54606", "b05e367cc67e6caaadf5a14d5c557670")).b());
    }

    @Override // androidx.room.b0
    @NonNull
    public final List<b> getAutoMigrations(@NonNull Map<Class<? extends ua.a>, ua.a> map) {
        return new ArrayList();
    }

    @Override // androidx.room.b0
    @NonNull
    public final Set<Class<? extends ua.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.b0
    @NonNull
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(C4.class, list);
        map.put(I3.class, list);
        map.put(T7.class, list);
        return map;
    }

    @Override // com.plaid.internal.workflow.persistence.database.WorkflowDatabase
    public final T7 c() {
        b8 b8Var;
        if (this.f48208c != null) {
            return this.f48208c;
        }
        synchronized (this) {
            try {
                if (this.f48208c == null) {
                    this.f48208c = new b8(this);
                }
                b8Var = this.f48208c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b8Var;
    }

    @Override // com.plaid.internal.workflow.persistence.database.WorkflowDatabase
    public final I3 a() {
        P3 p11;
        if (this.f48207b != null) {
            return this.f48207b;
        }
        synchronized (this) {
            try {
                if (this.f48207b == null) {
                    this.f48207b = new P3(this);
                }
                p11 = this.f48207b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p11;
    }

    @Override // com.plaid.internal.workflow.persistence.database.WorkflowDatabase
    public final C4 b() {
        H4 h11;
        if (this.f48206a != null) {
            return this.f48206a;
        }
        synchronized (this) {
            try {
                if (this.f48206a == null) {
                    this.f48206a = new H4(this);
                }
                h11 = this.f48206a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h11;
    }

    public class a extends h0.b {
        public a() {
            super(3);
        }

        @Override // androidx.room.h0.b
        public final void createAllTables(@NonNull c cVar) {
            cVar.Q1("CREATE TABLE IF NOT EXISTS `workflow_pane` (`workflow_id` TEXT NOT NULL, `id` TEXT NOT NULL, `model` BLOB NOT NULL, PRIMARY KEY(`workflow_id`, `id`))");
            cVar.Q1("CREATE TABLE IF NOT EXISTS `workflow_local_key_values` (`pane_id` TEXT NOT NULL, `key` TEXT NOT NULL, `string` TEXT, `byte_array` BLOB, PRIMARY KEY(`pane_id`, `key`))");
            cVar.Q1("CREATE TABLE IF NOT EXISTS `workflow_analytics` (`workflow_id` TEXT NOT NULL, `id` TEXT NOT NULL, `analytics_model` BLOB NOT NULL, PRIMARY KEY(`workflow_id`, `id`))");
            cVar.Q1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.Q1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bbbb42d6a8058409381c7dda80a54606')");
        }

        @Override // androidx.room.h0.b
        public final void dropAllTables(@NonNull c cVar) {
            cVar.Q1("DROP TABLE IF EXISTS `workflow_pane`");
            cVar.Q1("DROP TABLE IF EXISTS `workflow_local_key_values`");
            cVar.Q1("DROP TABLE IF EXISTS `workflow_analytics`");
            List list = ((b0) WorkflowDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((b0.b) it.next()).d(cVar);
                }
            }
        }

        @Override // androidx.room.h0.b
        public final void onCreate(@NonNull c cVar) {
            List list = ((b0) WorkflowDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((b0.b) it.next()).b(cVar);
                }
            }
        }

        @Override // androidx.room.h0.b
        public final void onOpen(@NonNull c cVar) {
            ((b0) WorkflowDatabase_Impl.this).mDatabase = cVar;
            WorkflowDatabase_Impl.this.internalInitInvalidationTracker(cVar);
            List list = ((b0) WorkflowDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((b0.b) it.next()).f(cVar);
                }
            }
        }

        @Override // androidx.room.h0.b
        public final void onPreMigrate(@NonNull c cVar) {
            wa.b.c(cVar);
        }

        @Override // androidx.room.h0.b
        @NonNull
        public final h0.c onValidateSchema(@NonNull c cVar) {
            HashMap map = new HashMap(3);
            map.put(AnalyticsAttribute.WorkflowId, new r.a(AnalyticsAttribute.WorkflowId, "TEXT", true, 1, null, 1));
            map.put("id", new r.a("id", "TEXT", true, 2, null, 1));
            map.put("model", new r.a("model", "BLOB", true, 0, null, 1));
            r rVar = new r("workflow_pane", map, new HashSet(0), new HashSet(0));
            r rVarA = r.a(cVar, "workflow_pane");
            if (!rVar.equals(rVarA)) {
                return new h0.c(false, "workflow_pane(com.plaid.internal.workflow.persistence.database.model.PaneEntity).\n Expected:\n" + rVar + "\n Found:\n" + rVarA);
            }
            HashMap map2 = new HashMap(4);
            map2.put("pane_id", new r.a("pane_id", "TEXT", true, 1, null, 1));
            map2.put(Action.KEY_ATTRIBUTE, new r.a(Action.KEY_ATTRIBUTE, "TEXT", true, 2, null, 1));
            map2.put(InquiryField.StringField.TYPE, new r.a(InquiryField.StringField.TYPE, "TEXT", false, 0, null, 1));
            map2.put("byte_array", new r.a("byte_array", "BLOB", false, 0, null, 1));
            r rVar2 = new r("workflow_local_key_values", map2, new HashSet(0), new HashSet(0));
            r rVarA2 = r.a(cVar, "workflow_local_key_values");
            if (!rVar2.equals(rVarA2)) {
                return new h0.c(false, "workflow_local_key_values(com.plaid.internal.workflow.persistence.database.model.LocalKeyValuesEntity).\n Expected:\n" + rVar2 + "\n Found:\n" + rVarA2);
            }
            HashMap map3 = new HashMap(3);
            map3.put(AnalyticsAttribute.WorkflowId, new r.a(AnalyticsAttribute.WorkflowId, "TEXT", true, 1, null, 1));
            map3.put("id", new r.a("id", "TEXT", true, 2, null, 1));
            map3.put("analytics_model", new r.a("analytics_model", "BLOB", true, 0, null, 1));
            r rVar3 = new r("workflow_analytics", map3, new HashSet(0), new HashSet(0));
            r rVarA3 = r.a(cVar, "workflow_analytics");
            if (rVar3.equals(rVarA3)) {
                return new h0.c(true, null);
            }
            return new h0.c(false, "workflow_analytics(com.plaid.internal.workflow.persistence.database.model.WorkflowAnalyticsEntity).\n Expected:\n" + rVar3 + "\n Found:\n" + rVarA3);
        }

        @Override // androidx.room.h0.b
        public final void onPostMigrate(@NonNull c cVar) {
        }
    }
}
