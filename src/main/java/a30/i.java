package a30;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0004B\u008b\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012$\u0010\n\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\t0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012B\b\u0002\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012B\b\u0002\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0012\u0010\u0015J1\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R2\u0010\n\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$RN\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"La30/i;", "", "OuterT", "InnerT", "La30/c0;", "Lco0/d;", "type", "Lkotlin/Function2;", "La30/a0;", "Lkotlin/Pair;", "map", "La30/h0;", "viewStarter", "Lkotlin/Function4;", "Landroid/view/View;", "Ljn0/h0;", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "doShowRendering", "<init>", "(Lco0/d;Lwn0/p;La30/h0;Lwn0/r;)V", "Lkotlin/Function1;", "(Lco0/d;Lwn0/l;La30/h0;Lwn0/r;)V", "initialRendering", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "a", "(Ljava/lang/Object;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "b", "Lwn0/p;", "c", "La30/h0;", DateTokenConverter.CONVERTER_KEY, "Lwn0/r;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class i<OuterT, InnerT> implements c0<OuterT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co0.d<OuterT> type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<OuterT, ViewEnvironment, Pair<InnerT, ViewEnvironment>> map;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h0 viewStarter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.r<View, wn0.p<? super InnerT, ? super ViewEnvironment, jn0.h0>, OuterT, ViewEnvironment, jn0.h0> doShowRendering;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\f\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00028\u0001`\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "OuterT", "InnerT", "Landroid/view/View;", "<anonymous parameter 0>", "Lkotlin/Function2;", "La30/a0;", "Ljn0/h0;", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "innerShowRendering", "outerRendering", "viewEnvironment", "a", "(Landroid/view/View;Lwn0/p;Ljava/lang/Object;La30/a0;)V"}, k = 3, mv = {1, 6, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.r<View, wn0.p<? super InnerT, ? super ViewEnvironment, ? extends jn0.h0>, OuterT, ViewEnvironment, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<OuterT, InnerT> f145c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.l<? super OuterT, ? extends InnerT> lVar) {
            super(4);
            this.f145c = lVar;
        }

        public final void a(View noName_0, wn0.p<? super InnerT, ? super ViewEnvironment, jn0.h0> innerShowRendering, OuterT outerRendering, ViewEnvironment viewEnvironment) {
            p013kotlin.jvm.internal.s.k(noName_0, "$noName_0");
            p013kotlin.jvm.internal.s.k(innerShowRendering, "innerShowRendering");
            p013kotlin.jvm.internal.s.k(outerRendering, "outerRendering");
            p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
            innerShowRendering.invoke(this.f145c.invoke(outerRendering), viewEnvironment);
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ jn0.h0 invoke(View view, Object obj, Object obj2, ViewEnvironment viewEnvironment) {
            a(view, (wn0.p) obj, obj2, viewEnvironment);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "OuterT", "InnerT", "outer", "La30/a0;", "viewEnvironment", "Lkotlin/Pair;", "a", "(Ljava/lang/Object;La30/a0;)Lkotlin/Pair;"}, k = 3, mv = {1, 6, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<OuterT, ViewEnvironment, Pair<? extends InnerT, ? extends ViewEnvironment>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<OuterT, InnerT> f146c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(wn0.l<? super OuterT, ? extends InnerT> lVar) {
            super(2);
            this.f146c = lVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<InnerT, ViewEnvironment> invoke(OuterT outer, ViewEnvironment viewEnvironment) {
            p013kotlin.jvm.internal.s.k(outer, "outer");
            p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
            return new Pair<>(this.f146c.invoke(outer), viewEnvironment);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "OuterT", "InnerT", "rendering", "La30/a0;", "env", "Ljn0/h0;", "a", "(Ljava/lang/Object;La30/a0;)V"}, k = 3, mv = {1, 6, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.p<OuterT, ViewEnvironment, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i<OuterT, InnerT> f147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f148d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.p<InnerT, ViewEnvironment, jn0.h0> f149e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(i<OuterT, InnerT> iVar, View view, wn0.p<? super InnerT, ? super ViewEnvironment, jn0.h0> pVar) {
            super(2);
            this.f147c = iVar;
            this.f148d = view;
            this.f149e = pVar;
        }

        public final void a(OuterT rendering, ViewEnvironment env) {
            p013kotlin.jvm.internal.s.k(rendering, "rendering");
            p013kotlin.jvm.internal.s.k(env, "env");
            ((i) this.f147c).doShowRendering.invoke(this.f148d, this.f149e, rendering, env);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Object obj, ViewEnvironment viewEnvironment) {
            a(obj, viewEnvironment);
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(co0.d<OuterT> type, wn0.p<? super OuterT, ? super ViewEnvironment, ? extends Pair<? extends InnerT, ViewEnvironment>> map, h0 h0Var, wn0.r<? super View, ? super wn0.p<? super InnerT, ? super ViewEnvironment, jn0.h0>, ? super OuterT, ? super ViewEnvironment, jn0.h0> doShowRendering) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(map, "map");
        p013kotlin.jvm.internal.s.k(doShowRendering, "doShowRendering");
        this.type = type;
        this.map = map;
        this.viewStarter = h0Var;
        this.doShowRendering = doShowRendering;
    }

    @Override // a30.c0
    public View a(OuterT initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
        p013kotlin.jvm.internal.s.k(initialRendering, "initialRendering");
        p013kotlin.jvm.internal.s.k(initialViewEnvironment, "initialViewEnvironment");
        p013kotlin.jvm.internal.s.k(contextForNewView, "contextForNewView");
        Pair<InnerT, ViewEnvironment> pairInvoke = this.map.invoke(initialRendering, initialViewEnvironment);
        InnerT innertA = pairInvoke.a();
        ViewEnvironment viewEnvironmentB = pairInvoke.b();
        View viewC = f0.c((e0) viewEnvironmentB.a(e0.INSTANCE), innertA, viewEnvironmentB, contextForNewView, container, this.viewStarter);
        wn0.p pVarD = g0.d(viewC);
        p013kotlin.jvm.internal.s.h(pVarD);
        g0.a(viewC, initialRendering, viewEnvironmentB, new c(this, viewC, pVarD));
        return viewC;
    }

    @Override // a30.c0
    public co0.d<OuterT> getType() {
        return this.type;
    }

    public /* synthetic */ i(co0.d dVar, wn0.l lVar, h0 h0Var, wn0.r rVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, lVar, (i11 & 4) != 0 ? null : h0Var, (i11 & 8) != 0 ? new a(lVar) : rVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(co0.d<OuterT> type, wn0.l<? super OuterT, ? extends InnerT> map, h0 h0Var, wn0.r<? super View, ? super wn0.p<? super InnerT, ? super ViewEnvironment, jn0.h0>, ? super OuterT, ? super ViewEnvironment, jn0.h0> doShowRendering) {
        this(type, new b(map), h0Var, doShowRendering);
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(map, "map");
        p013kotlin.jvm.internal.s.k(doShowRendering, "doShowRendering");
    }
}
