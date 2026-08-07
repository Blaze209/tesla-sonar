package sb;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lsb/b2;", "Lsb/x1;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "Lsb/w1;", "workTag", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lsb/w1;)V", "", "id", "", "c", "(Ljava/lang/String;)Ljava/util/List;", "a", "(Ljava/lang/String;)V", "Landroidx/room/b0;", "Landroidx/room/i;", "b", "Landroidx/room/i;", "__insertAdapterOfWorkTag", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b2 implements x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.room.b0 __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final androidx.room.i<w1> __insertAdapterOfWorkTag;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"sb/b2$a", "Landroidx/room/i;", "Lsb/w1;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lya/d;Lsb/w1;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends androidx.room.i<w1> {
        a() {
        }

        @Override // androidx.room.i
        protected String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, w1 entity) {
            p013kotlin.jvm.internal.s.k(statement, "statement");
            p013kotlin.jvm.internal.s.k(entity, "entity");
            statement.c2(1, entity.getTag());
            statement.c2(2, entity.getWorkSpecId());
        }
    }

    /* JADX INFO: renamed from: sb.b2$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsb/b2$b;", "", "<init>", "()V", "", "Lco0/d;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public b2(androidx.room.b0 __db) {
        p013kotlin.jvm.internal.s.k(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfWorkTag = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h(String str, String str2, ya.b _connection) {
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
    public static final jn0.h0 j(b2 b2Var, w1 w1Var, ya.b _connection) throws Exception {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        b2Var.__insertAdapterOfWorkTag.c(_connection, w1Var);
        return jn0.h0.f84049a;
    }

    @Override // sb.x1
    public void a(final String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "DELETE FROM worktag WHERE work_spec_id=?";
        wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.a2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return b2.h(str, id2, (ya.b) obj);
            }
        });
    }

    @Override // sb.x1
    public List<String> c(final String id2) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        final String str = "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?";
        return (List) wa.b.e(this.__db, true, false, new wn0.l() { // from class: sb.y1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return b2.i(str, id2, (ya.b) obj);
            }
        });
    }

    @Override // sb.x1
    public void d(final w1 workTag) {
        p013kotlin.jvm.internal.s.k(workTag, "workTag");
        wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.z1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return b2.j(this.f110956a, workTag, (ya.b) obj);
            }
        });
    }
}
