package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.plaid.internal.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4593z3 implements A3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T7 f48264a;

    public C4593z3(WorkflowDatabase database) {
        p013kotlin.jvm.internal.s.k(database, "database");
        this.f48264a = database.c();
    }

    @Override // com.plaid.internal.A3
    public final Object a(ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent, C4566w3.a aVar) {
        T7 t11 = this.f48264a;
        String workflowSessionId = clientEventOuterClass$ClientEvent.getWorkflowSessionId();
        p013kotlin.jvm.internal.s.j(workflowSessionId, "getWorkflowSessionId(...)");
        String strValueOf = String.valueOf(clientEventOuterClass$ClientEvent.hashCode());
        byte[] byteArray = clientEventOuterClass$ClientEvent.toByteArray();
        p013kotlin.jvm.internal.s.j(byteArray, "toByteArray(...)");
        Object objA = t11.a(workflowSessionId, strValueOf, byteArray, aVar);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.plaid.internal.A3
    public final Object a(ContinuationImpl continuationImpl) {
        C4584y3 c4584y3;
        if (continuationImpl instanceof C4584y3) {
            c4584y3 = (C4584y3) continuationImpl;
            int i11 = c4584y3.f48234c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4584y3.f48234c = i11 - Integer.MIN_VALUE;
            } else {
                c4584y3 = new C4584y3(this, continuationImpl);
            }
        } else {
            c4584y3 = new C4584y3(this, continuationImpl);
        }
        Object objA = c4584y3.f48232a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c4584y3.f48234c;
        if (i12 == 0) {
            jn0.t.b(objA);
            T7 t11 = this.f48264a;
            c4584y3.f48234c = 1;
            objA = t11.a(c4584y3);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(ClientEventOuterClass$ClientEvent.parseFrom(((c8) it.next()).f46913c));
        }
        return arrayList;
    }

    @Override // com.plaid.internal.A3
    public final Object a(List list, C4548u3 c4548u3) {
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent = (ClientEventOuterClass$ClientEvent) it.next();
            String workflowSessionId = clientEventOuterClass$ClientEvent.getWorkflowSessionId();
            p013kotlin.jvm.internal.s.j(workflowSessionId, "getWorkflowSessionId(...)");
            String strValueOf = String.valueOf(clientEventOuterClass$ClientEvent.hashCode());
            byte[] byteArray = clientEventOuterClass$ClientEvent.toByteArray();
            p013kotlin.jvm.internal.s.j(byteArray, "toByteArray(...)");
            arrayList.add(new c8(workflowSessionId, strValueOf, byteArray));
        }
        Object objA = this.f48264a.a(arrayList, c4548u3);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.h0.f84049a;
    }
}
