package ii;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lii/m;", "Lii/r;", "<init>", "()V", "Lii/r$c;", "E", "Lii/r$d;", Action.KEY_ATTRIBUTE, "a", "(Lii/r$d;)Lii/r$c;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lwn0/p;)Ljava/lang/Object;", CoreConstants.CONTEXT_SCOPE_VALUE, "c", "(Lii/r;)Lii/r;", "b", "(Lii/r$d;)Lii/r;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class m implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f78152c = new m();

    private m() {
    }

    @Override // ii.r
    public <E extends r.c> E a(r.d<E> key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        return null;
    }

    @Override // ii.r
    public r b(r.d<?> key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        return this;
    }

    @Override // ii.r
    public r c(r context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return context;
    }

    @Override // ii.r
    public <R> R fold(R initial, wn0.p<? super R, ? super r.c, ? extends R> operation) {
        p013kotlin.jvm.internal.s.k(operation, "operation");
        return initial;
    }
}
