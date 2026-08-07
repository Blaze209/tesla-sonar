package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.plaid.internal.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4518r0 implements L4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4580y<String, Pane$PaneRendering> f48076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4 f48077b;

    public C4518r0(WorkflowDatabase database) {
        C4345a4 cache = new C4345a4();
        p013kotlin.jvm.internal.s.k(database, "database");
        p013kotlin.jvm.internal.s.k(cache, "cache");
        this.f48076a = cache;
        this.f48077b = database.b();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC4542t6
    public final Object a(m8 m8Var, ContinuationImpl continuationImpl) {
        C4510q0 c4510q0;
        Pane$PaneRendering from;
        C4518r0 c4518r0;
        byte[] bArr;
        if (continuationImpl instanceof C4510q0) {
            c4510q0 = (C4510q0) continuationImpl;
            int i11 = c4510q0.f48053e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4510q0.f48053e = i11 - Integer.MIN_VALUE;
            } else {
                c4510q0 = new C4510q0(this, continuationImpl);
            }
        } else {
            c4510q0 = new C4510q0(this, continuationImpl);
        }
        Object objA = c4510q0.f48051c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c4510q0.f48053e;
        if (i12 == 0) {
            jn0.t.b(objA);
            from = (Pane$PaneRendering) this.f48076a.a((String) m8Var.f47887d.getValue());
            if (from == null) {
                C4 c11 = this.f48077b;
                String str = m8Var.f47884a;
                String str2 = m8Var.f47885b;
                c4510q0.f48049a = this;
                c4510q0.f48050b = m8Var;
                c4510q0.f48053e = 1;
                objA = c11.a(str, str2, c4510q0);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c4518r0 = this;
            } else {
                c4518r0 = this;
            }
            if (from != null) {
                c4518r0.f48076a.a((String) m8Var.f47887d.getValue(), from);
            }
            return from;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        m8Var = c4510q0.f48050b;
        c4518r0 = c4510q0.f48049a;
        jn0.t.b(objA);
        I4 i13 = (I4) objA;
        from = (i13 == null || (bArr = i13.f46352c) == null) ? null : Pane$PaneRendering.parseFrom(bArr);
        if (from != null) {
            c4518r0.f48076a.a((String) m8Var.f47887d.getValue(), from);
        }
        return from;
    }

    @Override // com.plaid.internal.L4
    public final Object a(m8 m8Var, Pane$PaneRendering pane$PaneRendering, S2 s11) {
        this.f48076a.a((String) m8Var.f47887d.getValue(), pane$PaneRendering);
        C4 c11 = this.f48077b;
        String str = m8Var.f47884a;
        String str2 = m8Var.f47885b;
        byte[] byteArray = pane$PaneRendering.toByteArray();
        p013kotlin.jvm.internal.s.j(byteArray, "toByteArray(...)");
        Object objA = c11.a(str, str2, byteArray, s11);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }
}
