package sb;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0016"}, d2 = {"Lsb/k0;", "Lsb/g0;", "Landroidx/room/b0;", "__db", "<init>", "(Landroidx/room/b0;)V", "Lsb/f0;", ReactProgressBarViewManager.PROP_PROGRESS, "Ljn0/h0;", "c", "(Lsb/f0;)V", "", "workSpecId", "b", "(Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "()V", "a", "Landroidx/room/b0;", "Landroidx/room/i;", "Landroidx/room/i;", "__insertAdapterOfWorkProgress", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k0 implements g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.room.b0 __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final androidx.room.i<f0> __insertAdapterOfWorkProgress;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"sb/k0$a", "Landroidx/room/i;", "Lsb/f0;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lya/d;Lsb/f0;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends androidx.room.i<f0> {
        a() {
        }

        @Override // androidx.room.i
        protected String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, f0 entity) {
            p013kotlin.jvm.internal.s.k(statement, "statement");
            p013kotlin.jvm.internal.s.k(entity, "entity");
            statement.c2(1, entity.getWorkSpecId());
            statement.y(2, androidx.work.g.INSTANCE.e(entity.getCom.facebook.react.views.progressbar.ReactProgressBarViewManager.PROP_PROGRESS java.lang.String()));
        }
    }

    /* JADX INFO: renamed from: sb.k0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsb/k0$b;", "", "<init>", "()V", "", "Lco0/d;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public k0(androidx.room.b0 __db) {
        p013kotlin.jvm.internal.s.k(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfWorkProgress = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 g(String str, String str2, ya.b _connection) {
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
    public static final jn0.h0 h(String str, ya.b _connection) {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        ya.d dVarL1 = _connection.L1(str);
        try {
            dVarL1.I1();
            return jn0.h0.f84049a;
        } finally {
            dVarL1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 i(k0 k0Var, f0 f0Var, ya.b _connection) throws Exception {
        p013kotlin.jvm.internal.s.k(_connection, "_connection");
        k0Var.__insertAdapterOfWorkProgress.c(_connection, f0Var);
        return jn0.h0.f84049a;
    }

    @Override // sb.g0
    public void b(final String workSpecId) {
        p013kotlin.jvm.internal.s.k(workSpecId, "workSpecId");
        final String str = "DELETE from WorkProgress where work_spec_id=?";
        wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.j0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return k0.g(str, workSpecId, (ya.b) obj);
            }
        });
    }

    @Override // sb.g0
    public void c(final f0 progress) {
        p013kotlin.jvm.internal.s.k(progress, "progress");
        wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.i0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return k0.i(this.f110819a, progress, (ya.b) obj);
            }
        });
    }

    @Override // sb.g0
    public void d() {
        final String str = "DELETE FROM WorkProgress";
        wa.b.e(this.__db, false, true, new wn0.l() { // from class: sb.h0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return k0.h(str, (ya.b) obj);
            }
        });
    }
}
