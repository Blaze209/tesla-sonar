package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsContext;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.iE, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002\u0013 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u0013\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006$"}, d2 = {"Lcom/fourthline/orca/internal/iE;", "", "Lcom/fourthline/orca/internal/kE;", "tenant", "Lcom/fourthline/orca/internal/fE;", AnalyticsContext.Workflow, "<init>", "(Lcom/fourthline/orca/internal/kE;Lcom/fourthline/orca/internal/fE;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/kE;Lcom/fourthline/orca/internal/fE;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/iE;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/kE;", "()Lcom/fourthline/orca/internal/kE;", "b", "Lcom/fourthline/orca/internal/fE;", "()Lcom/fourthline/orca/internal/fE;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class WorkflowConfigurationResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f32462c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final WorkflowConfigurationTenantSettings tenant;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final WorkflowConfiguration workflow;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.iE$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f32466b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f32465a = aVar;
            f32466b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.WorkflowConfigurationResponse", aVar, 2);
            m1Var.o("tenant", false);
            m1Var.o(AnalyticsContext.Workflow, false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorkflowConfigurationResponse deserialize(uo0.e decoder) {
            WorkflowConfigurationTenantSettings c3465kE;
            WorkflowConfiguration c3252fE;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                c3465kE = (WorkflowConfigurationTenantSettings) cVarB.n(fVar, 0, WorkflowConfigurationTenantSettings.a.f32946a, null);
                c3252fE = (WorkflowConfiguration) cVarB.n(fVar, 1, WorkflowConfiguration.a.f31691a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                c3465kE = null;
                WorkflowConfiguration c3252fE2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        c3465kE = (WorkflowConfigurationTenantSettings) cVarB.n(fVar, 0, WorkflowConfigurationTenantSettings.a.f32946a, c3465kE);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        c3252fE2 = (WorkflowConfiguration) cVarB.n(fVar, 1, WorkflowConfiguration.a.f31691a, c3252fE2);
                        i12 |= 2;
                    }
                }
                c3252fE = c3252fE2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new WorkflowConfigurationResponse(i11, c3465kE, c3252fE, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{WorkflowConfigurationTenantSettings.a.f32946a, WorkflowConfiguration.a.f31691a};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, WorkflowConfigurationResponse value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            WorkflowConfigurationResponse.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.iE$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<WorkflowConfigurationResponse> serializer() {
            return a.f32465a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WorkflowConfigurationResponse(int i11, WorkflowConfigurationTenantSettings c3465kE, WorkflowConfiguration c3252fE, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f32465a.getDescriptor());
        }
        this.tenant = c3465kE;
        this.workflow = c3252fE;
    }

    public static final /* synthetic */ void a(WorkflowConfigurationResponse self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, WorkflowConfigurationTenantSettings.a.f32946a, self.tenant);
        output.D(serialDesc, 1, WorkflowConfiguration.a.f31691a, self.workflow);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final WorkflowConfiguration getWorkflow() {
        return this.workflow;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowConfigurationResponse)) {
            return false;
        }
        WorkflowConfigurationResponse workflowConfigurationResponse = (WorkflowConfigurationResponse) other;
        return p013kotlin.jvm.internal.s.f(this.tenant, workflowConfigurationResponse.tenant) && p013kotlin.jvm.internal.s.f(this.workflow, workflowConfigurationResponse.workflow);
    }

    public int hashCode() {
        return (this.tenant.hashCode() * 31) + this.workflow.hashCode();
    }

    public String toString() {
        return "WorkflowConfigurationResponse(tenant=" + this.tenant + ", workflow=" + this.workflow + ")";
    }

    public WorkflowConfigurationResponse(WorkflowConfigurationTenantSettings tenant, WorkflowConfiguration workflow) {
        p013kotlin.jvm.internal.s.k(tenant, "tenant");
        p013kotlin.jvm.internal.s.k(workflow, "workflow");
        this.tenant = tenant;
        this.workflow = workflow;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final WorkflowConfigurationTenantSettings getTenant() {
        return this.tenant;
    }
}
