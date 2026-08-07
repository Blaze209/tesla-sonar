package ta;

import androidx.room.s0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lta/b;", "Lsa/b;", "Lta/c;", "supportDriver", "<init>", "(Lta/c;)V", "R", "", "isReadOnly", "Lkotlin/Function2;", "Landroidx/room/s0;", "Lkotlin/coroutines/Continuation;", "", "block", "B3", "(ZLwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", "close", "()V", "a", "Lta/c;", "n", "()Lta/c;", "Lta/d;", "c", "()Lta/d;", "supportConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements sa.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c supportDriver;

    public b(c supportDriver) {
        s.k(supportDriver, "supportDriver");
        this.supportDriver = supportDriver;
    }

    private final d c() {
        String name = this.supportDriver.getOpenHelper().getName();
        if (name == null) {
            name = ":memory:";
        }
        return new d(this.supportDriver.a(name));
    }

    @Override // sa.b
    public <R> Object B3(boolean z11, p<? super s0, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) {
        return pVar.invoke(c(), continuation);
    }

    @Override // sa.b, java.lang.AutoCloseable
    public void close() {
        this.supportDriver.getOpenHelper().close();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final c getSupportDriver() {
        return this.supportDriver;
    }
}
