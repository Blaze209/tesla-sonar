package sb;

import com.google.android.gms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import tb.NetworkRequestCompat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\n0\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"Lsb/q;", "Lsb/m;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "Lya/b;", "_connection", "Landroidx/collection/a;", "", "", "_map", "Ljn0/h0;", "g", "(Lya/b;Landroidx/collection/a;)V", "Landroidx/work/g;", "e", "Lza/f;", SearchIntents.EXTRA_QUERY, "", "Lsb/m0$c;", "a", "(Lza/f;)Ljava/util/List;", "Landroidx/room/b0;", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.room.b0 __db;

    /* JADX INFO: renamed from: sb.q$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsb/q$a;", "", "<init>", "()V", "", "Lco0/d;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public q(androidx.room.b0 __db) {
        p013kotlin.jvm.internal.s.k(__db, "__db");
        this.__db = __db;
    }

    private final void e(final ya.b _connection, androidx.collection.a<String, List<androidx.work.g>> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            wa.j.a(_map, true, new wn0.l() { // from class: sb.o
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return q.f(this.f110893a, _connection, (androidx.collection.a) obj);
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
    public static final jn0.h0 f(q qVar, ya.b bVar, androidx.collection.a _tmpMap) {
        p013kotlin.jvm.internal.s.k(_tmpMap, "_tmpMap");
        qVar.e(bVar, _tmpMap);
        return jn0.h0.f84049a;
    }

    private final void g(final ya.b _connection, androidx.collection.a<String, List<String>> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            wa.j.a(_map, true, new wn0.l() { // from class: sb.p
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return q.h(this.f110898a, _connection, (androidx.collection.a) obj);
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
    public static final jn0.h0 h(q qVar, ya.b bVar, androidx.collection.a _tmpMap) {
        p013kotlin.jvm.internal.s.k(_tmpMap, "_tmpMap");
        qVar.g(bVar, _tmpMap);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(String str, androidx.room.j0 j0Var, q qVar, ya.b _connection) {
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            j0Var.c().invoke(dVarL1);
            int iC = wa.m.c(dVarL1, "id");
            int iC2 = wa.m.c(dVarL1, "state");
            int iC3 = wa.m.c(dVarL1, "output");
            int iC4 = wa.m.c(dVarL1, "initial_delay");
            int iC5 = wa.m.c(dVarL1, "interval_duration");
            int iC6 = wa.m.c(dVarL1, "flex_duration");
            int iC7 = wa.m.c(dVarL1, "run_attempt_count");
            int iC8 = wa.m.c(dVarL1, "backoff_policy");
            int iC9 = wa.m.c(dVarL1, "backoff_delay_duration");
            int iC10 = wa.m.c(dVarL1, "last_enqueue_time");
            int iC11 = wa.m.c(dVarL1, "period_count");
            int iC12 = wa.m.c(dVarL1, "generation");
            String str2 = "getValue(...)";
            int iC13 = wa.m.c(dVarL1, "next_schedule_time_override");
            int iC14 = wa.m.c(dVarL1, "stop_reason");
            int iC15 = wa.m.c(dVarL1, "required_network_type");
            int iC16 = wa.m.c(dVarL1, "required_network_request");
            int iC17 = wa.m.c(dVarL1, "requires_charging");
            int iC18 = wa.m.c(dVarL1, "requires_device_idle");
            int iC19 = wa.m.c(dVarL1, "requires_battery_not_low");
            int iC20 = wa.m.c(dVarL1, "requires_storage_not_low");
            int iC21 = wa.m.c(dVarL1, "trigger_content_update_delay");
            int iC22 = wa.m.c(dVarL1, "trigger_max_content_delay");
            int iC23 = wa.m.c(dVarL1, "content_uri_triggers");
            androidx.collection.a<String, List<String>> aVar = new androidx.collection.a<>();
            int i14 = iC12;
            androidx.collection.a<String, List<androidx.work.g>> aVar2 = new androidx.collection.a<>();
            while (dVarL1.I1()) {
                int i15 = iC11;
                String strQ3 = dVarL1.q3(iC);
                if (!aVar.containsKey(strQ3)) {
                    aVar.put(strQ3, new ArrayList());
                }
                String strQ4 = dVarL1.q3(iC);
                if (!aVar2.containsKey(strQ4)) {
                    aVar2.put(strQ4, new ArrayList());
                }
                iC11 = i15;
                iC10 = iC10;
            }
            int i16 = iC10;
            int i17 = iC11;
            dVarL1.reset();
            qVar.g(_connection, aVar);
            qVar.e(_connection, aVar2);
            ArrayList arrayList = new ArrayList();
            while (dVarL1.I1()) {
                if (iC == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                }
                String strQ5 = dVarL1.q3(iC);
                if (iC2 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                }
                androidx.work.r0.c cVarG = c2.g((int) dVarL1.getLong(iC2));
                if (iC3 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                }
                androidx.work.g gVarA = androidx.work.g.INSTANCE.a(dVarL1.getBlob(iC3));
                long j11 = iC4 == -1 ? 0L : dVarL1.getLong(iC4);
                long j12 = iC5 == -1 ? 0L : dVarL1.getLong(iC5);
                long j13 = iC6 == -1 ? 0L : dVarL1.getLong(iC6);
                boolean z14 = false;
                int i18 = iC7 == -1 ? 0 : (int) dVarL1.getLong(iC7);
                if (iC8 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                }
                androidx.work.a aVarD = c2.d((int) dVarL1.getLong(iC8));
                long j14 = iC9 == -1 ? 0L : dVarL1.getLong(iC9);
                int i19 = i16;
                long j15 = i19 == -1 ? 0L : dVarL1.getLong(i19);
                int i21 = i17;
                if (i21 == -1) {
                    i11 = 0;
                    i12 = -1;
                } else {
                    i11 = (int) dVarL1.getLong(i21);
                    i12 = -1;
                }
                int i22 = i14;
                int i23 = i22 == i12 ? 0 : (int) dVarL1.getLong(i22);
                int i24 = iC13;
                long j16 = i24 == i12 ? 0L : dVarL1.getLong(i24);
                int i25 = iC14;
                int i26 = i25 == i12 ? 0 : (int) dVarL1.getLong(i25);
                int i27 = iC15;
                if (i27 == i12) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                }
                androidx.work.a0 a0VarE = c2.e((int) dVarL1.getLong(i27));
                int i28 = iC16;
                if (i28 == i12) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                }
                NetworkRequestCompat networkRequestCompatL = c2.l(dVarL1.getBlob(i28));
                int i29 = iC17;
                if (i29 == i12) {
                    z11 = false;
                } else {
                    z11 = ((int) dVarL1.getLong(i29)) != 0;
                }
                int i31 = iC18;
                if (i31 == i12) {
                    z12 = false;
                } else {
                    z12 = ((int) dVarL1.getLong(i31)) != 0;
                }
                int i32 = iC19;
                if (i32 == i12) {
                    z13 = false;
                } else {
                    z13 = ((int) dVarL1.getLong(i32)) != 0;
                }
                int i33 = iC20;
                if (i33 == i12) {
                    i13 = i28;
                } else {
                    i13 = i28;
                    if (((int) dVarL1.getLong(i33)) != 0) {
                        z14 = true;
                    }
                }
                int i34 = iC21;
                boolean z15 = z14;
                long j17 = i34 == i12 ? 0L : dVarL1.getLong(i34);
                int i35 = iC22;
                long j18 = i35 == i12 ? 0L : dVarL1.getLong(i35);
                int i36 = iC23;
                if (i36 == i12) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                }
                androidx.work.e eVar = new androidx.work.e(networkRequestCompatL, a0VarE, z11, z12, z13, z15, j17, j18, c2.b(dVarL1.getBlob(i36)));
                iC23 = i36;
                androidx.collection.a<String, List<String>> aVar3 = aVar;
                Object objJ = p013kotlin.collections.v0.j(aVar3, dVarL1.q3(iC));
                String str3 = str2;
                p013kotlin.jvm.internal.s.j(objJ, str3);
                List list = (List) objJ;
                Object objJ2 = p013kotlin.collections.v0.j(aVar2, dVarL1.q3(iC));
                p013kotlin.jvm.internal.s.j(objJ2, str3);
                arrayList.add(new m0.WorkInfoPojo(strQ5, cVarG, gVarA, j11, j12, j13, eVar, i18, aVarD, j14, j15, i11, i23, j16, i26, list, (List) objJ2));
                str2 = str3;
                iC21 = i34;
                iC22 = i35;
                aVar = aVar3;
                iC4 = iC4;
                iC5 = iC5;
                i17 = i21;
                iC14 = i25;
                iC15 = i27;
                iC17 = i29;
                iC18 = i31;
                iC13 = i24;
                iC19 = i32;
                iC2 = iC2;
                i14 = i22;
                iC16 = i13;
                iC20 = i33;
                iC3 = iC3;
                i16 = i19;
            }
            dVarL1.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarL1.close();
            throw th2;
        }
    }

    @Override // sb.m
    public List<m0.WorkInfoPojo> a(za.f query) {
        p013kotlin.jvm.internal.s.k(query, "query");
        final androidx.room.j0 j0VarH = androidx.room.l0.INSTANCE.b(query).H();
        final String sql = j0VarH.getSql();
        return (List) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.n
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return q.i(sql, j0VarH, this, (ya.b) obj);
            }
        });
    }
}
