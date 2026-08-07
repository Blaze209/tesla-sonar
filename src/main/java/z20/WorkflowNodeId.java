package z20;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import y20.q;
import y20.s;
import y20.w;

/* JADX INFO: renamed from: z20.k, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u001bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\u0012\u0010\t\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ)\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000b\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0014¨\u0006 "}, d2 = {"Lz20/k;", "", "Ly20/s;", "identifier", "", "name", "<init>", "(Ly20/s;Ljava/lang/String;)V", "Ly20/q;", AnalyticsContext.Workflow, "(Ly20/q;Ljava/lang/String;)V", "otherWorkflow", "otherName", "", "c", "(Ly20/q;Ljava/lang/String;)Z", "Lokio/k;", DateTokenConverter.CONVERTER_KEY, "()Lokio/k;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ly20/s;", "()Ly20/s;", "b", "Ljava/lang/String;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class WorkflowNodeId {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final s identifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: z20.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lz20/k$a;", "", "<init>", "()V", "Lokio/k;", "bytes", "Lz20/k;", "a", "(Lokio/k;)Lz20/k;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WorkflowNodeId a(okio.k bytes) {
            p013kotlin.jvm.internal.s.k(bytes, "bytes");
            okio.h hVar = new okio.h();
            hVar.A1(bytes);
            return new WorkflowNodeId(s.INSTANCE.a(y20.j.a(hVar)), y20.j.b(hVar));
        }

        private Companion() {
        }
    }

    public WorkflowNodeId(s identifier, String name) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        p013kotlin.jvm.internal.s.k(name, "name");
        this.identifier = identifier;
        this.name = name;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final s getIdentifier() {
        return this.identifier;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean c(q<?, ?, ?> otherWorkflow, String otherName) {
        p013kotlin.jvm.internal.s.k(otherWorkflow, "otherWorkflow");
        p013kotlin.jvm.internal.s.k(otherName, "otherName");
        return p013kotlin.jvm.internal.s.f(this.identifier, w.j(otherWorkflow)) && p013kotlin.jvm.internal.s.f(this.name, otherName);
    }

    public final okio.k d() {
        okio.k kVarE = this.identifier.e();
        if (kVarE == null) {
            return null;
        }
        okio.h hVar = new okio.h();
        y20.j.c(hVar, kVarE);
        y20.j.d(hVar, getName());
        return hVar.m1();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowNodeId)) {
            return false;
        }
        WorkflowNodeId workflowNodeId = (WorkflowNodeId) other;
        return p013kotlin.jvm.internal.s.f(this.identifier, workflowNodeId.identifier) && p013kotlin.jvm.internal.s.f(this.name, workflowNodeId.name);
    }

    public int hashCode() {
        return (this.identifier.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        return "WorkflowNodeId(identifier=" + this.identifier + ", name=" + this.name + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkflowNodeId(q<?, ?, ?> workflow, String name) {
        this(w.j(workflow), name);
        p013kotlin.jvm.internal.s.k(workflow, "workflow");
        p013kotlin.jvm.internal.s.k(name, "name");
    }
}
