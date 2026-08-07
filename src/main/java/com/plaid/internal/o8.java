package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.panes.WorkflowViewModel$next$1", f = "WorkflowViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
public final class o8 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f47996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4466l1 f47997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pane$PaneOutput.a f47998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f47999e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(List list, C4466l1 c4466l1, Pane$PaneOutput.a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f47996b = list;
        this.f47997c = c4466l1;
        this.f47998d = aVar;
        this.f47999e = str;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new o8(this.f47996b, this.f47997c, this.f47998d, this.f47999e, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return ((o8) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wn0.p<LinkEvent, I2, jn0.h0> linkEventListenerInternal$link_sdk_release;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f47995a;
        if (i11 == 0) {
            jn0.t.b(obj);
            List<Common$SDKEvent> list = this.f47996b;
            if (list != null) {
                this.f47997c.getClass();
                for (Common$SDKEvent common$SDKEvent : list) {
                    if (!p013kotlin.jvm.internal.s.f(common$SDKEvent, Common$SDKEvent.getDefaultInstance()) && (linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release()) != null) {
                        linkEventListenerInternal$link_sdk_release.invoke(N6.a(common$SDKEvent), I2.d.f46349a);
                    }
                }
            }
            InterfaceC4547u2 interfaceC4547u2 = this.f47997c.f48045c;
            if (interfaceC4547u2 == null) {
                p013kotlin.jvm.internal.s.B("linkController");
                interfaceC4547u2 = null;
            }
            Pane$PaneOutput pane$PaneOutputBuild = this.f47998d.b(this.f47997c.f48043a.f47885b).a(this.f47999e).build();
            p013kotlin.jvm.internal.s.j(pane$PaneOutputBuild, "build(...)");
            Pane$PaneOutput[] pane$PaneOutputArr = {pane$PaneOutputBuild};
            this.f47995a = 1;
            if (interfaceC4547u2.a(pane$PaneOutputArr, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        return jn0.h0.f84049a;
    }
}
