package al0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.ktor.util.internal.d;
import jn0.g;
import jn0.h0;
import kotlinx.coroutines.DisposableHandle;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nR*\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u0012\u0004\b\u000e\u0010\u0003¨\u0006\u0010"}, d2 = {"Lal0/b;", "", "<init>", "()V", "T", "Lal0/a;", "definition", "value", "Ljn0/h0;", "a", "(Lal0/a;Ljava/lang/Object;)V", "Lel0/a;", "Lio/ktor/util/internal/b;", "Lel0/a;", "getHandlers$annotations", "handlers", "ktor-events"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final el0.a<al0.a<?>, io.ktor.util.internal.b> handlers = new el0.a<>();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R)\u0010\f\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u0006j\u0006\u0012\u0002\b\u0003`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lal0/b$a;", "Lio/ktor/util/internal/d;", "Lkotlinx/coroutines/DisposableHandle;", "Ljn0/h0;", "dispose", "()V", "Lkotlin/Function1;", "Lio/ktor/events/EventHandler;", DateTokenConverter.CONVERTER_KEY, "Lwn0/l;", "j", "()Lwn0/l;", "handler", "ktor-events"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends d implements DisposableHandle {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final l<?, h0> handler;

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            h();
        }

        public final l<?, h0> j() {
            return this.handler;
        }
    }

    public final <T> void a(al0.a<T> definition, T value) {
        h0 h0Var;
        s.k(definition, "definition");
        io.ktor.util.internal.b bVarA = this.handlers.a(definition);
        Throwable th2 = null;
        if (bVarA != null) {
            Object objD = bVarA.d();
            s.i(objD, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode{ io.ktor.util.internal.LockFreeLinkedListKt.Node }");
            Throwable th3 = null;
            for (d dVarE = (d) objD; !s.f(dVarE, bVarA); dVarE = dVarE.e()) {
                if (dVarE instanceof a) {
                    try {
                        l<?, h0> lVarJ = ((a) dVarE).j();
                        s.i(lVarJ, "null cannot be cast to non-null type kotlin.Function1<T of io.ktor.events.Events.raise$lambda$2, kotlin.Unit>{ io.ktor.events.EventsKt.EventHandler<T of io.ktor.events.Events.raise$lambda$2> }");
                        ((l) u0.g(lVarJ, 1)).invoke(value);
                    } catch (Throwable th4) {
                        if (th3 != null) {
                            g.a(th3, th4);
                            h0Var = h0.f84049a;
                        } else {
                            h0Var = null;
                        }
                        if (h0Var == null) {
                            th3 = th4;
                        }
                    }
                }
            }
            th2 = th3;
        }
        if (th2 != null) {
            throw th2;
        }
    }
}
