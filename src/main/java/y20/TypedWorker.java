package y20;

import ch.qos.logback.core.CoreConstants;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: y20.n, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ly20/n;", "OutputT", "Ly20/o;", "Lco0/q;", "outputType", "Lkotlinx/coroutines/flow/Flow;", "work", "<init>", "(Lco0/q;Lkotlinx/coroutines/flow/Flow;)V", "run", "()Lkotlinx/coroutines/flow/Flow;", "", "toString", "()Ljava/lang/String;", "b", "Lco0/q;", "c", "Lkotlinx/coroutines/flow/Flow;", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TypedWorker<OutputT> implements o<OutputT> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final co0.q outputType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Flow<OutputT> work;

    /* JADX WARN: Multi-variable type inference failed */
    public TypedWorker(co0.q outputType, Flow<? extends OutputT> work) {
        p013kotlin.jvm.internal.s.k(outputType, "outputType");
        p013kotlin.jvm.internal.s.k(work, "work");
        this.outputType = outputType;
        this.work = work;
    }

    @Override // y20.o
    public boolean a(o<?> oVar) {
        return o.b.a(this, oVar);
    }

    @Override // y20.o
    public Flow<OutputT> run() {
        return this.work;
    }

    public String toString() {
        return "TypedWorker(" + this.outputType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
