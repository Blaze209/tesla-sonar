package sb;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u0018"}, d2 = {"Lsb/g;", "Lsb/b;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "Lsb/a;", "dependency", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lsb/a;)V", "", "id", "", "b", "(Ljava/lang/String;)Z", "", "a", "(Ljava/lang/String;)Ljava/util/List;", "c", "Landroidx/room/b0;", "Landroidx/room/i;", "Landroidx/room/i;", "__insertAdapterOfDependency", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.room.b0 __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final androidx.room.i<sb.a> __insertAdapterOfDependency;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"sb/g$a", "Landroidx/room/i;", "Lsb/a;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lya/d;Lsb/a;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends androidx.room.i<sb.a> {
        a() {
        }

        @Override // androidx.room.i
        protected String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, sb.a entity) {
            p013kotlin.jvm.internal.s.k(statement, "statement");
            p013kotlin.jvm.internal.s.k(entity, "entity");
            statement.c2(1, entity.getWorkSpecId());
            statement.c2(2, entity.getPrerequisiteId());
        }
    }

    /* JADX INFO: renamed from: sb.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsb/g$b;", "", "<init>", "()V", "", "Lco0/d;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public g(androidx.room.b0 __db) {
        p013kotlin.jvm.internal.s.k(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfDependency = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(String str, String str2, ya.b _connection) {
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
    public static final boolean j(String str, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.c2(1, str2);
            boolean z11 = false;
            if (dVarL1.I1()) {
                z11 = ((int) dVarL1.getLong(0)) != 0;
            }
            return z11;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(String str, String str2, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.c2(1, str2);
            boolean z11 = false;
            if (dVarL1.I1()) {
                z11 = ((int) dVarL1.getLong(0)) != 0;
            }
            return z11;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 l(g gVar, sb.a aVar, ya.b _connection) throws Exception {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        gVar.__insertAdapterOfDependency.c(_connection, aVar);
        return jn0.h0.f84049a;
    }

    @Override // sb.b
    public List<String> a(final String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?";
        return (List) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.e
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g.i(str, id2, (ya.b) obj);
            }
        });
    }

    @Override // sb.b
    public boolean b(final String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)";
        return ((Boolean) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.f
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(g.j(str, id2, (ya.b) obj));
            }
        })).booleanValue();
    }

    @Override // sb.b
    public boolean c(final String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?";
        return ((Boolean) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.d
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(g.k(str, id2, (ya.b) obj));
            }
        })).booleanValue();
    }

    @Override // sb.b
    public void d(final sb.a dependency) {
        p013kotlin.jvm.internal.s.k(dependency, "dependency");
        wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.c
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g.l(this.f110776a, dependency, (ya.b) obj);
            }
        });
    }
}
