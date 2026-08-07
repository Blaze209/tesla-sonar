package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u000b\u0010\b¨\u0006\u001e"}, d2 = {"Landroidx/room/n0;", "", "Landroidx/room/b0;", "database", "<init>", "(Landroidx/room/b0;)V", "Lza/g;", "createNewStatement", "()Lza/g;", "", "canUseCached", "getStmt", "(Z)Lza/g;", "", "createQuery", "()Ljava/lang/String;", "Ljn0/h0;", "assertNotMainThread", "()V", "acquire", "statement", "release", "(Lza/g;)V", "Landroidx/room/b0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stmt$delegate", "Lkotlin/Lazy;", "stmt", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class n0 {
    private final b0 database;
    private final AtomicBoolean lock;

    /* JADX INFO: renamed from: stmt$delegate, reason: from kotlin metadata */
    private final Lazy stmt;

    public n0(b0 database) {
        p013kotlin.jvm.internal.s.k(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        this.stmt = jn0.m.b(new wn0.a() { // from class: androidx.room.m0
            @Override // wn0.a
            public final Object invoke() {
                return this.f13742a.createNewStatement();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final za.g createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    private final za.g getStmt() {
        return (za.g) this.stmt.getValue();
    }

    public za.g acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    protected void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    protected abstract String createQuery();

    public void release(za.g statement) {
        p013kotlin.jvm.internal.s.k(statement, "statement");
        if (statement == getStmt()) {
            this.lock.set(false);
        }
    }

    private final za.g getStmt(boolean canUseCached) {
        return canUseCached ? getStmt() : createNewStatement();
    }
}
