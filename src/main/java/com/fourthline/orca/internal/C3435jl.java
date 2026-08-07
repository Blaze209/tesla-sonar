package com.fourthline.orca.internal;

import com.fourthline.orca.workflow.WorkflowResults;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3435jl implements Vf, InterfaceC3500l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3137cl f32797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3414j6 f32798b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.jl$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f32799a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f32801c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32799a = obj;
            this.f32801c |= Integer.MIN_VALUE;
            return C3435jl.this.a((WorkflowResults.IDV) null, this);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.jl$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f32803b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f32805d;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32803b = obj;
            this.f32805d |= Integer.MIN_VALUE;
            Object objA = C3435jl.this.a((C3304gh) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.jl$c */
    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f32807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f32808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Map f32809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f32810e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f32811f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ C3435jl f32812g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, Map map, List list2, List list3, C3435jl c3435jl, Continuation continuation) {
            super(2, continuation);
            this.f32808c = list;
            this.f32809d = map;
            this.f32810e = list2;
            this.f32811f = list3;
            this.f32812g = c3435jl;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C3629o6 c3629o6, Continuation continuation) {
            return ((c) create(c3629o6, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.f32808c, this.f32809d, this.f32810e, this.f32811f, this.f32812g, continuation);
            cVar.f32807b = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x007d  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f32806a;
            boolean z11 = true;
            if (i11 == 0) {
                jn0.t.b(obj);
                C3629o6 c3629o6 = (C3629o6) this.f32807b;
                c3629o6.a();
                Objects.toString(c3629o6.b());
                InterfaceC3500l6.a aVarB = c3629o6.b();
                if (aVarB instanceof InterfaceC3500l6.a.d) {
                    this.f32808c.add(c3629o6.a());
                    WorkflowResults.IDV idv = (WorkflowResults.IDV) this.f32809d.get(c3629o6.a());
                    if (idv != null) {
                        C3435jl c3435jl = this.f32812g;
                        this.f32806a = 1;
                        if (c3435jl.a(idv, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (aVarB instanceof InterfaceC3500l6.a.b) {
                    this.f32811f.add(jn0.x.a(c3629o6.a(), ((InterfaceC3500l6.a.b) c3629o6.b()).a()));
                } else {
                    z11 = false;
                }
                return Boxing.boxBoolean(z11);
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            if (this.f32808c.size() != this.f32810e.size()) {
                z11 = false;
            }
            return Boxing.boxBoolean(z11);
        }
    }

    public C3435jl(C3137cl delegate, InterfaceC3414j6 dataListener) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        p013kotlin.jvm.internal.s.k(dataListener, "dataListener");
        this.f32797a = delegate;
        this.f32798b = dataListener;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3500l6
    public void a(InterfaceC3543m6 request) {
        p013kotlin.jvm.internal.s.k(request, "request");
        this.f32797a.a(request);
    }

    public InterfaceC3500l6.a b(String identifier) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        return this.f32797a.b(identifier);
    }

    public boolean c(String identifier) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        return this.f32797a.c(identifier);
    }

    private final boolean b(InterfaceC3543m6 interfaceC3543m6) {
        if (!c(interfaceC3543m6.b())) {
            return true;
        }
        InterfaceC3500l6.a aVarB = b(interfaceC3543m6.b());
        if ((aVarB instanceof InterfaceC3500l6.a.c) || (aVarB instanceof InterfaceC3500l6.a.C0576a) || (aVarB instanceof InterfaceC3500l6.a.d)) {
            return false;
        }
        if ((aVarB instanceof InterfaceC3500l6.a.b) || aVarB == null) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3500l6
    public Flow a(String identifier) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        return this.f32797a.a(identifier);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Vf
    public Object a(C3304gh c3304gh, Continuation continuation) {
        b bVar;
        List list;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f32805d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f32805d = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f32803b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f32805d;
        if (i12 == 0) {
            jn0.t.b(obj);
            List<C3347hh> listA = c3304gh.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(p013kotlin.collections.v0.e(p013kotlin.collections.v.y(listA, 10)), 16));
            for (C3347hh c3347hh : listA) {
                c3347hh.a();
                InterfaceC3543m6 interfaceC3543m6B = c3347hh.b();
                Pair pairA = jn0.x.a(interfaceC3543m6B.b(), c3347hh.c());
                linkedHashMap.put(pairA.e(), pairA.f());
            }
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listA, 10));
            for (C3347hh c3347hh2 : listA) {
                c3347hh2.a();
                InterfaceC3543m6 interfaceC3543m6B2 = c3347hh2.b();
                if (b(interfaceC3543m6B2)) {
                    a(interfaceC3543m6B2);
                }
                arrayList.add(a(interfaceC3543m6B2.b()));
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Flow[] flowArr = (Flow[]) arrayList.toArray(new Flow[0]);
            Flow flowMerge = FlowKt.merge((Flow[]) Arrays.copyOf(flowArr, flowArr.length));
            c cVar = new c(arrayList2, linkedHashMap, arrayList, arrayList3, this, null);
            bVar.f32802a = arrayList3;
            bVar.f32805d = 1;
            if (FlowKt.first(flowMerge, cVar, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList3;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) bVar.f32802a;
            jn0.t.b(obj);
        }
        if (!list.isEmpty()) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a((Throwable) ((Pair) p013kotlin.collections.v.o0(list)).f()));
        }
        jn0.s.Companion companion2 = jn0.s.INSTANCE;
        return jn0.s.b(jn0.h0.f84049a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(WorkflowResults.IDV idv, Continuation continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f32801c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f32801c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f32799a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f32801c;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                InterfaceC3414j6 interfaceC3414j6 = this.f32798b;
                aVar.f32801c = 1;
                if (interfaceC3414j6.a(idv, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
        } catch (Throwable th2) {
            th2.toString();
        }
        return jn0.h0.f84049a;
    }
}
