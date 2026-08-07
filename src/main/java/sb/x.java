package sb;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lsb/x;", "Lsb/s;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "Lsb/r;", "systemIdInfo", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lsb/r;)V", "", "workSpecId", "", "generation", "a", "(Ljava/lang/String;I)Lsb/r;", "", "c", "()Ljava/util/List;", "e", "(Ljava/lang/String;)V", "Landroidx/room/b0;", "Landroidx/room/i;", "b", "Landroidx/room/i;", "__insertAdapterOfSystemIdInfo", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x implements s {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.room.b0 __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final androidx.room.i<SystemIdInfo> __insertAdapterOfSystemIdInfo;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"sb/x$a", "Landroidx/room/i;", "Lsb/r;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lya/d;Lsb/r;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends androidx.room.i<SystemIdInfo> {
        a() {
        }

        @Override // androidx.room.i
        protected String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, SystemIdInfo entity) {
            p013kotlin.jvm.internal.s.k(statement, "statement");
            p013kotlin.jvm.internal.s.k(entity, "entity");
            statement.c2(1, entity.workSpecId);
            statement.x(2, entity.getGeneration());
            statement.x(3, entity.systemId);
        }
    }

    /* JADX INFO: renamed from: sb.x$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsb/x$b;", "", "<init>", "()V", "", "Lco0/d;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public x(androidx.room.b0 __db) {
        p013kotlin.jvm.internal.s.k(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfSystemIdInfo = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SystemIdInfo j(String str, String str2, int i11, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.c2(1, str2);
            dVarL1.x(2, i11);
            return dVarL1.I1() ? new SystemIdInfo(dVarL1.q3(wa.m.d(dVarL1, "work_spec_id")), (int) dVarL1.getLong(wa.m.d(dVarL1, "generation")), (int) dVarL1.getLong(wa.m.d(dVarL1, "system_id"))) : null;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(String str, ya.b _connection) {
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
    public static final jn0.h0 l(x xVar, SystemIdInfo systemIdInfo, ya.b _connection) throws Exception {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        xVar.__insertAdapterOfSystemIdInfo.c(_connection, systemIdInfo);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 m(String str, String str2, ya.b _connection) {
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

    @Override // sb.s
    public SystemIdInfo a(final String workSpecId, final int generation) {
        p013kotlin.jvm.internal.s.k(workSpecId, "workSpecId");
        final String str = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?";
        return (SystemIdInfo) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.v
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return x.j(str, workSpecId, generation, (ya.b) obj);
            }
        });
    }

    @Override // sb.s
    public List<String> c() {
        final String str = "SELECT DISTINCT work_spec_id FROM SystemIdInfo";
        return (List) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.u
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return x.k(str, (ya.b) obj);
            }
        });
    }

    @Override // sb.s
    public void d(final SystemIdInfo systemIdInfo) {
        p013kotlin.jvm.internal.s.k(systemIdInfo, "systemIdInfo");
        wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.t
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return x.l(this.f110919a, systemIdInfo, (ya.b) obj);
            }
        });
    }

    @Override // sb.s
    public void e(final String workSpecId) {
        p013kotlin.jvm.internal.s.k(workSpecId, "workSpecId");
        final String str = "DELETE FROM SystemIdInfo where work_spec_id=?";
        wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.w
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return x.m(str, workSpecId, (ya.b) obj);
            }
        });
    }
}
