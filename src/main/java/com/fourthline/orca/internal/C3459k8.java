package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.internal.TimestampProvider;
import java.util.Date;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3459k8 implements InterfaceC3302gf, CoroutineScope {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f32911j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f32912k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Date f32913l = new Date(253370815637000L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f32914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Is f32915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ND f32916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3289g8 f32917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3375i8 f32918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3354ho f32919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimestampProvider f32920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ED f32921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC4044xs f32922i;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.k8$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3459k8(Is presenter, ND viewNavigator, InterfaceC3289g8 repository, InterfaceC3375i8 stateProvider, InterfaceC3354ho analytics, TimestampProvider timestampProvider, ED viewCompletionHandler, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f32914a = coroutineScope;
        this.f32915b = presenter;
        this.f32916c = viewNavigator;
        this.f32917d = repository;
        this.f32918e = stateProvider;
        this.f32919f = analytics;
        this.f32920g = timestampProvider;
        this.f32921h = viewCompletionHandler;
        this.f32922i = popupHandler;
        repository.a(repository.b());
    }

    private final void e() {
        this.f32915b.a(this.f32918e.c());
    }

    private final void f() {
        DocumentType documentTypeC = c();
        if (documentTypeC != null) {
            this.f32919f.track(new Y7.a.g(documentTypeC));
        }
        InterfaceC3289g8 interfaceC3289g8 = this.f32917d;
        a(new C3203e8(interfaceC3289g8.s(), interfaceC3289g8.l(), interfaceC3289g8.b()));
    }

    private final void g() {
        DocumentType documentTypeC = c();
        if (documentTypeC != null) {
            this.f32919f.track(new Y7.a.b(documentTypeC));
        }
        this.f32916c.a(InterfaceC3076b8.b.f30571a);
    }

    private final void h() {
        DocumentType documentTypeC = c();
        if (documentTypeC != null) {
            this.f32919f.track(new Y7.a.e(documentTypeC));
        }
        this.f32915b.a(new wn0.l() { // from class: com.fourthline.orca.internal.t51
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3459k8.a(this.f35553a, (C3246f8) obj);
            }
        });
        this.f32917d.a(true);
    }

    private final void i() {
        this.f32915b.a(this.f32918e.l());
    }

    private final void j() {
        this.f32915b.a(this.f32918e.p());
    }

    private final void k() {
        this.f32915b.a(this.f32918e.h());
    }

    private final void l() {
        this.f32915b.a(this.f32918e.m());
    }

    private final void m() {
        this.f32915b.a(this.f32918e.b());
    }

    private final void n() {
        this.f32915b.a(this.f32918e.d());
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f32914a.getCoroutineContext();
    }

    private final DocumentType c() {
        X7 x7E = this.f32917d.e();
        if (x7E != null) {
            return x7E.c();
        }
        return null;
    }

    public final Is d() {
        return this.f32915b;
    }

    private final void b(boolean z11) {
        this.f32915b.a(this.f32918e.b(z11));
    }

    private final void c(String str) {
        Date dateA = AbstractC3672p6.a(str, this.f32920g.getCurrentCalendar());
        if (dateA == null) {
            dateA = a(str);
        }
        this.f32917d.b(dateA);
        this.f32915b.a(this.f32918e.c(str));
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(InterfaceC3118c8 event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof InterfaceC3118c8.h) {
            f();
            return;
        }
        if (event instanceof InterfaceC3118c8.i) {
            g();
            return;
        }
        if (event instanceof InterfaceC3118c8.d) {
            a((InterfaceC3118c8.d) event);
            return;
        }
        if (event instanceof InterfaceC3118c8.f) {
            a((InterfaceC3118c8.f) event);
            return;
        }
        if (event instanceof InterfaceC3118c8.a) {
            a((InterfaceC3118c8.a) event);
            return;
        }
        if (event instanceof InterfaceC3118c8.e) {
            a((InterfaceC3118c8.e) event);
            return;
        }
        if (event instanceof InterfaceC3118c8.g) {
            c(((InterfaceC3118c8.g) event).a());
            return;
        }
        if (event instanceof InterfaceC3118c8.b) {
            b(((InterfaceC3118c8.b) event).a());
        } else if (event instanceof InterfaceC3118c8.c) {
            a(((InterfaceC3118c8.c) event).a());
        } else {
            if (!(event instanceof InterfaceC3118c8.j)) {
                throw new NoWhenBranchMatchedException();
            }
            h();
        }
    }

    private final void b(String str) {
        this.f32917d.a(AbstractC3672p6.a(str, this.f32920g.getCurrentCalendar()));
        this.f32915b.a(this.f32918e.b(str));
    }

    private final C3246f8 b() {
        return (C3246f8) this.f32915b.a();
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.k8$b */
    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32923a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3203e8 f32925c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3203e8 c3203e8, Continuation continuation) {
            super(2, continuation);
            this.f32925c = c3203e8;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3459k8.this.new b(this.f32925c, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (((kotlinx.coroutines.flow.Flow) r6).collect(r1, r5) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f32923a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r6)
                goto L46
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                jn0.t.b(r6)
                goto L32
            L1e:
                jn0.t.b(r6)
                com.fourthline.orca.internal.k8 r6 = com.fourthline.orca.internal.C3459k8.this
                com.fourthline.orca.internal.ED r6 = com.fourthline.orca.internal.C3459k8.c(r6)
                com.fourthline.orca.internal.e8 r1 = r5.f32925c
                r5.f32923a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L32
                goto L45
            L32:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.k8$b$a r1 = new com.fourthline.orca.internal.k8$b$a
                com.fourthline.orca.internal.k8 r3 = com.fourthline.orca.internal.C3459k8.this
                com.fourthline.orca.internal.e8 r4 = r5.f32925c
                r1.<init>(r3, r4)
                r5.f32923a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.C3459k8.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.k8$b$a */
        static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3459k8 f32926a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3203e8 f32927b;

            a(C3459k8 c3459k8, C3203e8 c3203e8) {
                this.f32926a = c3459k8;
                this.f32927b = c3203e8;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FD fd2, Continuation continuation) {
                if (!(fd2 instanceof FD.d)) {
                    if (fd2 instanceof FD.c) {
                        this.f32926a.d().a(this.f32926a.f32918e.d(true));
                    } else if (fd2 instanceof FD.a) {
                        this.f32926a.d().a(this.f32926a.f32918e.d(false));
                        this.f32926a.f32916c.a(new InterfaceC3076b8.a(((FD.a) fd2).a()));
                    } else {
                        if (!(fd2 instanceof FD.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f32926a.d().a(this.f32926a.f32918e.d(false));
                        Bo boA = ((FD.b) fd2).a();
                        final C3459k8 c3459k8 = this.f32926a;
                        final C3203e8 c3203e8 = this.f32927b;
                        this.f32926a.f32922i.a(new Ds.c(boA, null, new wn0.a() { // from class: com.fourthline.orca.internal.u51
                            @Override // wn0.a
                            public final Object invoke() {
                                return C3459k8.b.a.a(c3459k8, c3203e8);
                            }
                        }, 2, null));
                    }
                }
                return jn0.h0.f84049a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jn0.h0 a(C3459k8 c3459k8, C3203e8 c3203e8) {
                c3459k8.a(c3203e8);
                return jn0.h0.f84049a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C3203e8 c3203e8) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(c3203e8, null), 3, null);
    }

    private final void a(boolean z11) {
        if (z11) {
            this.f32917d.b(f32913l);
        } else if (p013kotlin.jvm.internal.s.f(this.f32917d.l(), f32913l)) {
            this.f32917d.b(null);
        }
        this.f32915b.a(this.f32918e.c(z11));
        b(this.f32918e.a());
    }

    private final void a(InterfaceC3118c8.d dVar) {
        if (dVar.a() && b().s().getState() != Gh.FOCUSED) {
            DocumentType documentTypeC = c();
            if (documentTypeC != null) {
                this.f32919f.track(new Y7.a.d(documentTypeC));
            }
            k();
            b(false);
            e();
            return;
        }
        if (dVar.a() || b().s().getState() != Gh.FOCUSED) {
            return;
        }
        l();
        b(this.f32918e.a());
    }

    private final void a(InterfaceC3118c8.f fVar) {
        if (fVar.a() && b().u().getState() != Gh.FOCUSED) {
            DocumentType documentTypeC = c();
            if (documentTypeC != null) {
                this.f32919f.track(new Y7.a.f(documentTypeC));
            }
            m();
            b(false);
            e();
            return;
        }
        if (fVar.a() || b().u().getState() != Gh.FOCUSED) {
            return;
        }
        n();
        b(this.f32918e.a());
    }

    private final void a(InterfaceC3118c8.a aVar) {
        if (aVar.a() && b().q().getState() != Gh.FOCUSED) {
            DocumentType documentTypeC = c();
            if (documentTypeC != null) {
                this.f32919f.track(new Y7.a.c(documentTypeC));
            }
            i();
            b(false);
            e();
            return;
        }
        if (aVar.a() || b().q().getState() != Gh.FOCUSED) {
            return;
        }
        j();
        b(this.f32918e.a());
    }

    private final void a(InterfaceC3118c8.e eVar) {
        this.f32917d.a(eVar.a());
        this.f32915b.a(this.f32918e.e(eVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3246f8 a(C3459k8 c3459k8, C3246f8 present) {
        p013kotlin.jvm.internal.s.k(present, "$this$present");
        return c3459k8.f32918e.getInitialState();
    }

    private final Date a(String str) {
        if (p013kotlin.jvm.internal.s.f(str, "99/99/9999")) {
            return f32913l;
        }
        return null;
    }
}
