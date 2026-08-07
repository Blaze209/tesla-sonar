package y20;

import ch.qos.logback.core.joran.action.Action;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \b*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\bJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly20/o;", "OutputT", "", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "otherWorker", "", "a", "(Ly20/o;)Z", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface o<OutputT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f124707a;

    /* JADX INFO: renamed from: y20.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0003¨\u0006\u0011"}, d2 = {"Ly20/o$a;", "", "<init>", "()V", "", "delayMs", "", Action.KEY_ATTRIBUTE, "Ly20/o;", "Ljn0/h0;", "a", "(JLjava/lang/String;)Ly20/o;", "Lco0/q;", "b", "Lco0/q;", "getTYPE_OF_NOTHING$annotations", "TYPE_OF_NOTHING", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f124707a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final co0.q TYPE_OF_NOTHING = o0.o(Void.class);

        private Companion() {
        }

        public static /* synthetic */ o b(Companion companion, long j11, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = "";
            }
            return companion.a(j11, str);
        }

        public final o<h0> a(long delayMs, String key) {
            p013kotlin.jvm.internal.s.k(key, "key");
            return new TimerWorker(delayMs, key);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class b {
        public static <OutputT> boolean a(o<? extends OutputT> oVar, o<?> otherWorker) {
            p013kotlin.jvm.internal.s.k(oVar, "this");
            p013kotlin.jvm.internal.s.k(otherWorker, "otherWorker");
            return p013kotlin.jvm.internal.s.f(o0.b(otherWorker.getClass()), o0.b(oVar.getClass()));
        }
    }

    boolean a(o<?> otherWorker);

    Flow<OutputT> run();
}
