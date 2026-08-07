package z20;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.selects.SelectBuilder;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import y20.WorkflowOutput;
import y20.q;
import y20.r;
import y20.t;
import y20.w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004Bo\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012&\u0010\u000e\u001a\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u008f\u0001\u0010!\u001a \u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020 \"\u0004\b\u0003\u0010\u0017\"\u0004\b\u0004\u0010\u0018\"\u0004\b\u0005\u0010\u00192\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001a2\u0006\u0010\u001c\u001a\u00028\u00032\u0006\u0010\u001e\u001a\u00020\u001d2$\u0010\u001f\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f0\u000bH\u0002¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%Jq\u0010'\u001a\u00028\u0005\"\u0004\b\u0003\u0010\u0017\"\u0004\b\u0004\u0010\u0018\"\u0004\b\u0005\u0010\u00192\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001a2\u0006\u0010&\u001a\u00028\u00032\u0006\u0010\u001e\u001a\u00020\u001d2$\u0010\u001f\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f0\u000bH\u0016¢\u0006\u0004\b'\u0010(J)\u0010-\u001a\u00020#\"\u0004\b\u0003\u0010)2\u0014\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0003\u0018\u00010+0*¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b/\u00100R$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R4\u0010\u000e\u001a\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00104R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00105R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00108R0\u0010;\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030 098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010:¨\u0006<"}, d2 = {"Lz20/h;", "PropsT", "StateT", "OutputT", "Lz20/f$a;", "", "Lz20/k;", "Ly20/m;", "snapshotCache", "Lkotlin/coroutines/CoroutineContext;", "contextForChildren", "Lkotlin/Function1;", "Ly20/r;", "", "emitActionToParent", "Ly20/t$c;", "workflowSession", "Ly20/t;", "interceptor", "Lz20/d;", "idCounter", "<init>", "(Ljava/util/Map;Lkotlin/coroutines/CoroutineContext;Lwn0/l;Ly20/t$c;Ly20/t;Lz20/d;)V", "ChildPropsT", "ChildOutputT", "ChildRenderingT", "Ly20/q;", "child", "initialProps", "", Action.KEY_ATTRIBUTE, "handler", "Lz20/i;", DateTokenConverter.CONVERTER_KEY, "(Ly20/q;Ljava/lang/Object;Ljava/lang/String;Lwn0/l;)Lz20/i;", "Ljn0/h0;", "c", "()V", "props", "a", "(Ly20/q;Ljava/lang/Object;Ljava/lang/String;Lwn0/l;)Ljava/lang/Object;", "T", "Lkotlinx/coroutines/selects/SelectBuilder;", "Ly20/v;", "selector", "g", "(Lkotlinx/coroutines/selects/SelectBuilder;)V", "f", "()Ljava/util/Map;", "Ljava/util/Map;", "b", "Lkotlin/coroutines/CoroutineContext;", "Lwn0/l;", "Ly20/t$c;", "e", "Ly20/t;", "Lz20/d;", "Lz20/a;", "Lz20/a;", "children", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class h<PropsT, StateT, OutputT> implements f.a<PropsT, StateT, OutputT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Map<WorkflowNodeId, y20.m> snapshotCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext contextForChildren;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<r<? super PropsT, StateT, ? extends OutputT>, Object> emitActionToParent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t.c workflowSession;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t interceptor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d idCounter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private z20.a<i<?, ?, ?, ?, ?>> children;

    /* JADX INFO: Add missing generic type declarations: [ChildOutputT] */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* synthetic */ class a<ChildOutputT> extends p implements wn0.l<ChildOutputT, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0<i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> f126602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h<PropsT, StateT, OutputT> f126603b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n0<i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> n0Var, h<PropsT, StateT, OutputT> hVar) {
            super(1, s.a.class, "acceptChildOutput", "createChildNode$acceptChildOutput(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/squareup/workflow1/internal/SubtreeManager;Ljava/lang/Object;)Ljava/lang/Object;", 0);
            this.f126602a = n0Var;
            this.f126603b = hVar;
        }

        @Override // wn0.l
        public final Object invoke(ChildOutputT childoutputt) {
            return h.e(this.f126602a, this.f126603b, childoutputt);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(Map<WorkflowNodeId, y20.m> map, CoroutineContext contextForChildren, wn0.l<? super r<? super PropsT, StateT, ? extends OutputT>, ? extends Object> emitActionToParent, t.c cVar, t interceptor, d dVar) {
        s.k(contextForChildren, "contextForChildren");
        s.k(emitActionToParent, "emitActionToParent");
        s.k(interceptor, "interceptor");
        this.snapshotCache = map;
        this.contextForChildren = contextForChildren;
        this.emitActionToParent = emitActionToParent;
        this.workflowSession = cVar;
        this.interceptor = interceptor;
        this.idCounter = dVar;
        this.children = new z20.a<>();
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [T, z20.i, z20.i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>] */
    private final <ChildPropsT, ChildOutputT, ChildRenderingT> i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> d(q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT initialProps, String key, wn0.l<? super ChildOutputT, ? extends r<? super PropsT, StateT, ? extends OutputT>> handler) {
        WorkflowNodeId workflowNodeIdA = l.a(child, key);
        n0 n0Var = new n0();
        Map<WorkflowNodeId, y20.m> map = this.snapshotCache;
        ?? r12 = (i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>) new i(child, handler, new j(workflowNodeIdA, child.a(), initialProps, map == null ? null : map.get(workflowNodeIdA), this.contextForChildren, new a(n0Var, this), this.workflowSession, this.interceptor, this.idCounter));
        n0Var.f86529a = r12;
        return r12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <ChildOutputT, PropsT, StateT, OutputT, ChildPropsT> Object e(n0<i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT>> n0Var, h<PropsT, StateT, OutputT> hVar, ChildOutputT childoutputt) {
        i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> iVar;
        i<ChildPropsT, ChildOutputT, PropsT, StateT, OutputT> iVar2 = n0Var.f86529a;
        if (iVar2 == null) {
            s.B("node");
            iVar = null;
        } else {
            iVar = iVar2;
        }
        return ((h) hVar).emitActionToParent.invoke(iVar.c(childoutputt));
    }

    @Override // z20.f.a
    public <ChildPropsT, ChildOutputT, ChildRenderingT> ChildRenderingT a(q<? super ChildPropsT, ? extends ChildOutputT, ? extends ChildRenderingT> child, ChildPropsT props, String key, wn0.l<? super ChildOutputT, ? extends r<? super PropsT, StateT, ? extends OutputT>> handler) {
        s.k(child, "child");
        s.k(key, "key");
        s.k(handler, "handler");
        for (e.a aVarB = ((z20.a) this.children).staging.b(); aVarB != null; aVarB = aVarB.getNextListNode()) {
            if (((i) aVarB).h(child, key)) {
                throw new IllegalArgumentException(("Expected keys to be unique for " + w.j(child) + ": key=\"" + key + CoreConstants.DOUBLE_QUOTE_CHAR).toString());
            }
        }
        z20.a<i<?, ?, ?, ?, ?>> aVar = this.children;
        e eVar = ((z20.a) aVar).active;
        e.a aVarD = null;
        e.a aVar2 = null;
        for (e.a aVarB2 = eVar.b(); aVarB2 != null; aVarB2 = aVarB2.getNextListNode()) {
            if (((i) aVarB2).h(child, key)) {
                if (aVar2 == null) {
                    eVar.e(aVarB2.getNextListNode());
                } else {
                    aVar2.a(aVarB2.getNextListNode());
                }
                if (s.f(eVar.c(), aVarB2)) {
                    eVar.f(aVar2);
                }
                aVarB2.a(null);
                aVarD = aVarB2;
                break;
            }
            aVar2 = aVarB2;
        }
        if (aVarD == null) {
            aVarD = d(child, props, key, handler);
        }
        ((z20.a) aVar).staging.d(aVarD);
        i iVar = (i) aVarD;
        iVar.j(handler);
        return (ChildRenderingT) iVar.i(child.a(), props);
    }

    public final void c() {
        z20.a<i<?, ?, ?, ?, ?>> aVar = this.children;
        for (e.a aVarB = ((z20.a) aVar).active.b(); aVarB != null; aVarB = aVarB.getNextListNode()) {
            j.e(((i) aVarB).g(), null, 1, null);
        }
        e eVar = ((z20.a) aVar).active;
        ((z20.a) aVar).active = ((z20.a) aVar).staging;
        ((z20.a) aVar).staging = eVar;
        ((z20.a) aVar).staging.a();
        this.snapshotCache = null;
    }

    public final Map<WorkflowNodeId, y20.m> f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (e.a aVarB = ((z20.a) this.children).active.b(); aVarB != null; aVarB = aVarB.getNextListNode()) {
            i iVar = (i) aVarB;
            linkedHashMap.put(iVar.d(), iVar.g().n(iVar.f().a()));
        }
        return linkedHashMap;
    }

    public final <T> void g(SelectBuilder<? super WorkflowOutput<? extends T>> selector) {
        s.k(selector, "selector");
        for (e.a aVarB = ((z20.a) this.children).active.b(); aVarB != null; aVarB = aVarB.getNextListNode()) {
            ((i) aVarB).g().o(selector);
        }
    }
}
