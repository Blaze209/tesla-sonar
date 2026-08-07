package z20;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;
import y20.q;
import y20.r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u0004*\u0004\b\u0004\u0010\u00052\u001c\u0012\u0018\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00000\u0006B_\u0012\u0014\u0010\b\u001a\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\u0007\u0012$\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n0\t\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0010\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015JK\u0010\u001c\u001a\u00020\u001b\"\u0004\b\u0005\u0010\u0016\"\u0004\b\u0006\u0010\u0017\"\u0004\b\u0007\u0010\u0018\"\u0004\b\b\u0010\u00192$\u0010\u001a\u001a \u0012\u0004\u0012\u00028\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\n0\t¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010\"\u001a\u00028\u0005\"\u0004\b\u0005\u0010\u001e2\u0016\u0010\b\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001f2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J)\u0010%\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n2\b\u0010$\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b%\u0010&R%\u0010\b\u001a\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R4\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R+\u0010\r\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\f8\u0006¢\u0006\f\n\u0004\b%\u0010-\u001a\u0004\b.\u0010/R8\u00106\u001a\u0018\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0011\u00109\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b0\u00108¨\u0006:"}, d2 = {"Lz20/i;", "ChildPropsT", "ChildOutputT", "ParentPropsT", "ParentStateT", "ParentOutputT", "Lz20/e$a;", "Ly20/q;", AnalyticsContext.Workflow, "Lkotlin/Function1;", "Ly20/r;", "handler", "Lz20/j;", "workflowNode", "<init>", "(Ly20/q;Lwn0/l;Lz20/j;)V", "otherWorkflow", "", Action.KEY_ATTRIBUTE, "", "h", "(Ly20/q;Ljava/lang/String;)Z", "CO", "CP", "S", Gender.OTHER, "newHandler", "Ljn0/h0;", "j", "(Lwn0/l;)V", "R", "Ly20/k;", "", "props", IntegerTokenConverter.CONVERTER_KEY, "(Ly20/k;Ljava/lang/Object;)Ljava/lang/Object;", "output", "c", "(Ljava/lang/Object;)Ly20/r;", "a", "Ly20/q;", "f", "()Ly20/q;", "b", "Lwn0/l;", "Lz20/j;", "g", "()Lz20/j;", DateTokenConverter.CONVERTER_KEY, "Lz20/i;", "e", "()Lz20/i;", "k", "(Lz20/i;)V", "nextListNode", "Lz20/k;", "()Lz20/k;", "id", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class i<ChildPropsT, ChildOutputT, ParentPropsT, ParentStateT, ParentOutputT> implements e.a<i<?, ?, ?, ?, ?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q<?, ChildOutputT, ?> workflow;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super ChildOutputT, ? extends r<? super ParentPropsT, ParentStateT, ? extends ParentOutputT>> handler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j<ChildPropsT, ?, ChildOutputT, ?> workflowNode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private i<?, ?, ?, ?, ?> nextListNode;

    /* JADX WARN: Multi-variable type inference failed */
    public i(q<?, ? extends ChildOutputT, ?> workflow, wn0.l<? super ChildOutputT, ? extends r<? super ParentPropsT, ParentStateT, ? extends ParentOutputT>> handler, j<ChildPropsT, ?, ChildOutputT, ?> workflowNode) {
        s.k(workflow, "workflow");
        s.k(handler, "handler");
        s.k(workflowNode, "workflowNode");
        this.workflow = workflow;
        this.handler = handler;
        this.workflowNode = workflowNode;
    }

    public final r<ParentPropsT, ParentStateT, ParentOutputT> c(Object output) {
        return this.handler.invoke(output);
    }

    public final WorkflowNodeId d() {
        return this.workflowNode.getId();
    }

    @Override // z20.e.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public i<?, ?, ?, ?, ?> getNextListNode() {
        return this.nextListNode;
    }

    public final q<?, ChildOutputT, ?> f() {
        return this.workflow;
    }

    public final j<ChildPropsT, ?, ChildOutputT, ?> g() {
        return this.workflowNode;
    }

    public final boolean h(q<?, ?, ?> otherWorkflow, String key) {
        s.k(otherWorkflow, "otherWorkflow");
        s.k(key, "key");
        return d().c(otherWorkflow, key);
    }

    public final <R> R i(y20.k<?, ?, ?, ?> workflow, Object props) {
        s.k(workflow, "workflow");
        return (R) this.workflowNode.l(workflow, props);
    }

    public final <CO, CP, S, O> void j(wn0.l<? super CO, ? extends r<? super CP, S, ? extends O>> newHandler) {
        s.k(newHandler, "newHandler");
        this.handler = (wn0.l) u0.g(newHandler, 1);
    }

    @Override // z20.e.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void a(i<?, ?, ?, ?, ?> iVar) {
        this.nextListNode = iVar;
    }
}
