package xq;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import expo.modules.contacts.Columns;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public class m0 implements xq.d, yq.a, xq.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final nq.c f123977f = nq.c.b("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f123978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zq.a f123979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zq.a f123980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f123981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<String> f123982e;

    interface b<T, U> {
        U apply(T t11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f123983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f123984b;

        private c(String str, String str2) {
            this.f123983a = str;
            this.f123984b = str2;
        }
    }

    interface d<T> {
        T a();
    }

    m0(zq.a aVar, zq.a aVar2, e eVar, v0 v0Var, Provider<String> provider) {
        this.f123978a = v0Var;
        this.f123979b = aVar;
        this.f123980c = aVar2;
        this.f123981d = eVar;
        this.f123982e = provider;
    }

    public static /* synthetic */ List B(m0 m0Var, pq.p pVar, SQLiteDatabase sQLiteDatabase) {
        List<k> listW1 = m0Var.w1(sQLiteDatabase, pVar, m0Var.f123981d.d());
        for (nq.f fVar : nq.f.values()) {
            if (fVar != pVar.d()) {
                int iD = m0Var.f123981d.d() - listW1.size();
                if (iD <= 0) {
                    break;
                }
                listW1.addAll(m0Var.w1(sQLiteDatabase, pVar.f(fVar), iD));
            }
        }
        return m0Var.v1(listW1, m0Var.B1(sQLiteDatabase, listW1));
    }

    private Map<Long, Set<c>> B1(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(list.get(i11).c());
            if (i11 < list.size() - 1) {
                sb2.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        f2(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: xq.z
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.z0(map, (Cursor) obj);
            }
        });
        return map;
    }

    public static /* synthetic */ List C(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(pq.p.a().b(cursor.getString(1)).d(ar.a.b(cursor.getInt(2))).c(H1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Integer D0(final m0 m0Var, long j11, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        String[] strArr = {String.valueOf(j11)};
        f2(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: xq.s
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.J(this.f123998a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object G0(m0 m0Var, List list, pq.p pVar, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            long j11 = cursor.getLong(0);
            boolean z11 = cursor.getInt(7) != 0;
            pq.i.a aVarO = pq.i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z11) {
                aVarO.h(new pq.h(Y1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarO.h(new pq.h(Y1(cursor.getString(4)), m0Var.M1(j11)));
            }
            if (!cursor.isNull(6)) {
                aVarO.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                aVarO.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                aVarO.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                aVarO.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                aVarO.k(cursor.getBlob(11));
            }
            list.add(k.a(j11, pVar, aVarO.d()));
        }
        return null;
    }

    public static /* synthetic */ Object H(m0 m0Var, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            m0Var.p(cursor.getInt(0), sq.c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Object H0(m0 m0Var, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m0Var.f123979b.a()).execute();
        return null;
    }

    private static byte[] H1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ SQLiteDatabase I(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to open db.", th2);
    }

    public static /* synthetic */ Object J(m0 m0Var, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            m0Var.p(cursor.getInt(0), sq.c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ sq.a J0(final m0 m0Var, String str, final Map map, final sq.a.C2384a c2384a, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        return (sq.a) f2(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: xq.a0
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.n0(this.f123952a, map, c2384a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long K0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    private void K1(sq.a.C2384a c2384a, Map<String, List<sq.c>> map) {
        for (Map.Entry<String, List<sq.c>> entry : map.entrySet()) {
            c2384a.a(sq.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    private byte[] M1(long j11) {
        return (byte[]) f2(c1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j11)}, null, null, "sequence_num"), new b() { // from class: xq.b0
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.e0((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ sq.f O0(final long j11, SQLiteDatabase sQLiteDatabase) {
        return (sq.f) f2(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: xq.d0
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.t(j11, (Cursor) obj);
            }
        });
    }

    private <T> T O1(d<T> dVar, b<Throwable, T> bVar) {
        long jA = this.f123980c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e11) {
                if (this.f123980c.a() >= ((long) this.f123981d.b()) + jA) {
                    return bVar.apply(e11);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private sq.c.b P0(int i11) {
        sq.c.b bVar = sq.c.b.REASON_UNKNOWN;
        if (i11 == bVar.getNumber()) {
            return bVar;
        }
        sq.c.b bVar2 = sq.c.b.MESSAGE_TOO_OLD;
        if (i11 == bVar2.getNumber()) {
            return bVar2;
        }
        sq.c.b bVar3 = sq.c.b.CACHE_FULL;
        if (i11 == bVar3.getNumber()) {
            return bVar3;
        }
        sq.c.b bVar4 = sq.c.b.PAYLOAD_TOO_BIG;
        if (i11 == bVar4.getNumber()) {
            return bVar4;
        }
        sq.c.b bVar5 = sq.c.b.MAX_RETRIES_REACHED;
        if (i11 == bVar5.getNumber()) {
            return bVar5;
        }
        sq.c.b bVar6 = sq.c.b.INVALID_PAYLOD;
        if (i11 == bVar6.getNumber()) {
            return bVar6;
        }
        sq.c.b bVar7 = sq.c.b.SERVER_ERROR;
        if (i11 == bVar7.getNumber()) {
            return bVar7;
        }
        tq.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i11));
        return bVar;
    }

    public static /* synthetic */ Object T(final m0 m0Var, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        f2(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: xq.v
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.H(this.f124003a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    private void T0(final SQLiteDatabase sQLiteDatabase) {
        O1(new d() { // from class: xq.l
            @Override // xq.m0.d
            public final Object a() {
                return m0.t0(sQLiteDatabase);
            }
        }, new b() { // from class: xq.w
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.w0((Throwable) obj);
            }
        });
    }

    private long U0(SQLiteDatabase sQLiteDatabase, pq.p pVar) {
        Long lR1 = r1(sQLiteDatabase, pVar);
        if (lR1 != null) {
            return lR1.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(ar.a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private static nq.c Y1(String str) {
        return str == null ? f123977f : nq.c.b(str);
    }

    public static /* synthetic */ Boolean b0(m0 m0Var, pq.p pVar, SQLiteDatabase sQLiteDatabase) {
        Long lR1 = m0Var.r1(sQLiteDatabase, pVar);
        return lR1 == null ? Boolean.FALSE : (Boolean) f2(m0Var.c1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lR1.toString()}), new b() { // from class: xq.u
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ Object c0(long j11, pq.p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j11));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(ar.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(ar.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private sq.b d1() {
        return sq.b.b().b(sq.e.c().b(Y0()).c(e.f123960a.f()).a()).a();
    }

    private static String d2(Iterable<k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().c());
            if (it.hasNext()) {
                sb2.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    public static /* synthetic */ byte[] e0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            byte[] bArr2 = (byte[]) arrayList.get(i11);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    private long e1() {
        return c1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    static <T> T f2(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private long h1() {
        return c1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public static /* synthetic */ List k0(SQLiteDatabase sQLiteDatabase) {
        return (List) f2(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: xq.k0
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.C((Cursor) obj);
            }
        });
    }

    private sq.f k1() {
        final long jA = this.f123979b.a();
        return (sq.f) s1(new b() { // from class: xq.c0
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.O0(jA, (SQLiteDatabase) obj);
            }
        });
    }

    public static /* synthetic */ sq.a n0(m0 m0Var, Map map, sq.a.C2384a c2384a, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            sq.c.b bVarP0 = m0Var.P0(cursor.getInt(1));
            long j11 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(sq.c.c().c(bVarP0).b(j11).a());
        }
        m0Var.K1(c2384a, map);
        return c2384a.e(m0Var.k1()).d(m0Var.d1()).c(m0Var.f123982e.get()).b();
    }

    private Long r1(SQLiteDatabase sQLiteDatabase, pq.p pVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(ar.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) f2(sQLiteDatabase.query("transport_contexts", new String[]{Columns.ID}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: xq.n
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.u0((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long s0(m0 m0Var, pq.i iVar, pq.p pVar, SQLiteDatabase sQLiteDatabase) {
        if (m0Var.u1()) {
            m0Var.p(1L, sq.c.b.CACHE_FULL, iVar.n());
            return -1L;
        }
        long jU0 = m0Var.U0(sQLiteDatabase, pVar);
        int iE = m0Var.f123981d.e();
        byte[] bArrA = iVar.e().a();
        boolean z11 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jU0));
        contentValues.put("transport_name", iVar.n());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.o()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z11));
        contentValues.put(StatusResponse.PAYLOAD, z11 ? bArrA : new byte[0]);
        contentValues.put("product_id", iVar.l());
        contentValues.put("pseudonymous_id", iVar.m());
        contentValues.put("experiment_ids_clear_blob", iVar.g());
        contentValues.put("experiment_ids_encrypted_blob", iVar.h());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z11) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i11 = 1; i11 <= iCeil; i11++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i11 - 1) * iE, Math.min(i11 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i11));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    public static /* synthetic */ sq.f t(long j11, Cursor cursor) {
        cursor.moveToNext();
        return sq.f.c().c(cursor.getLong(0)).b(j11).a();
    }

    public static /* synthetic */ Object t0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Long u0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    private boolean u1() {
        return e1() * h1() >= this.f123981d.f();
    }

    private List<k> v1(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                pq.i.a aVarP = next.b().p();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    aVarP.c(cVar.f123983a, cVar.f123984b);
                }
                listIterator.set(k.a(next.c(), next.d(), aVarP.d()));
            }
        }
        return list;
    }

    public static /* synthetic */ Object w0(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th2);
    }

    private List<k> w1(SQLiteDatabase sQLiteDatabase, final pq.p pVar, int i11) {
        final ArrayList arrayList = new ArrayList();
        Long lR1 = r1(sQLiteDatabase, pVar);
        if (lR1 == null) {
            return arrayList;
        }
        f2(sQLiteDatabase.query("events", new String[]{Columns.ID, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", StatusResponse.PAYLOAD, "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lR1.toString()}, null, null, null, String.valueOf(i11)), new b() { // from class: xq.x
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.G0(this.f124019a, arrayList, pVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ Object y0(String str, sq.c.b bVar, long j11, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) f2(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: xq.y
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j11 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put(AnalyticsAttribute.Reason, Integer.valueOf(bVar.getNumber()));
        contentValues.put("events_dropped_count", Long.valueOf(j11));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public static /* synthetic */ Object z0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j11 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j11));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j11), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    @Override // xq.d
    public void C1(final pq.p pVar, final long j11) {
        s1(new b() { // from class: xq.p
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.c0(j11, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // xq.d
    public void C2(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + d2(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            s1(new b() { // from class: xq.l0
                @Override // xq.m0.b
                public final Object apply(Object obj) {
                    return m0.T(this.f123972a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // xq.d
    public Iterable<k> E1(final pq.p pVar) {
        return (Iterable) s1(new b() { // from class: xq.m
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.B(this.f123975a, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // xq.d
    public boolean H3(final pq.p pVar) {
        return ((Boolean) s1(new b() { // from class: xq.o
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.b0(this.f123990a, pVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // xq.d
    public void N1(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            c1().compileStatement("DELETE FROM events WHERE _id in " + d2(iterable)).execute();
        }
    }

    @Override // xq.d
    public Iterable<pq.p> X1() {
        return (Iterable) s1(new b() { // from class: xq.g0
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.k0((SQLiteDatabase) obj);
            }
        });
    }

    long Y0() {
        return e1() * h1();
    }

    @Override // xq.c
    public void c() {
        s1(new b() { // from class: xq.q
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.H0(this.f123994a, (SQLiteDatabase) obj);
            }
        });
    }

    SQLiteDatabase c1() {
        final v0 v0Var = this.f123978a;
        Objects.requireNonNull(v0Var);
        return (SQLiteDatabase) O1(new d() { // from class: xq.e0
            @Override // xq.m0.d
            public final Object a() {
                return v0Var.getWritableDatabase();
            }
        }, new b() { // from class: xq.f0
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.I((Throwable) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f123978a.close();
    }

    @Override // xq.d
    public k f1(final pq.p pVar, final pq.i iVar) {
        tq.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.n(), pVar.b());
        long jLongValue = ((Long) s1(new b() { // from class: xq.i0
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.s0(this.f123965a, iVar, pVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return k.a(jLongValue, pVar, iVar);
    }

    @Override // xq.c
    public sq.a n() {
        final sq.a.C2384a c2384aE = sq.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (sq.a) s1(new b() { // from class: xq.t
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.J0(this.f123999a, str, map, c2384aE, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // xq.d
    public long n1(pq.p pVar) {
        return ((Long) f2(c1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(ar.a.a(pVar.d()))}), new b() { // from class: xq.h0
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.K0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // yq.a
    public <T> T o(yq.a.InterfaceC2734a<T> interfaceC2734a) {
        SQLiteDatabase sQLiteDatabaseC1 = c1();
        T0(sQLiteDatabaseC1);
        try {
            T tExecute = interfaceC2734a.execute();
            sQLiteDatabaseC1.setTransactionSuccessful();
            return tExecute;
        } finally {
            sQLiteDatabaseC1.endTransaction();
        }
    }

    @Override // xq.c
    public void p(final long j11, final sq.c.b bVar, final String str) {
        s1(new b() { // from class: xq.r
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.y0(str, bVar, j11, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // xq.d
    public int r() {
        final long jA = this.f123979b.a() - this.f123981d.c();
        return ((Integer) s1(new b() { // from class: xq.j0
            @Override // xq.m0.b
            public final Object apply(Object obj) {
                return m0.D0(this.f123969a, jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    <T> T s1(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseC1 = c1();
        sQLiteDatabaseC1.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseC1);
            sQLiteDatabaseC1.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseC1.endTransaction();
        }
    }
}
