package com.fourthline.orca.internal;

import android.os.Build;
import bl0.HttpMethod;
import com.fourthline.networking.NetworkEnvironment;
import il0.TypeInfo;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.OkHttpClient;
import p013kotlin.Lazy;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Li implements Gl, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NetworkEnvironment f26790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rk0.a f26792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f26793e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Cl.b.values().length];
            try {
                iArr[Cl.b.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Cl.b.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Cl.b.PUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26795b;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yk0.c cVar, Continuation continuation) {
            return ((b) create(cVar, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = Li.this.new b(continuation);
            bVar.f26795b = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f26794a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            yk0.c cVar = (yk0.c) this.f26795b;
            if (!Li.this.a(yk0.e.d(cVar))) {
                Objects.toString(cVar);
            }
            return jn0.h0.f84049a;
        }
    }

    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26798b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f26800d;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26798b = obj;
            this.f26800d |= Integer.MIN_VALUE;
            Object objA = Li.this.a((Cl.a) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    static final class d extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f26802b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Cl.a f26804d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Cl.a f26805e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Cl.a aVar, Cl.a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f26804d = aVar;
            this.f26805e = aVar2;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Li.this.new d(this.f26804d, this.f26805e, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00e6, code lost:
        
            if (r12 == r0) goto L26;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.Li.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(Cl.a aVar, bl0.l lVar) {
            for (Map.Entry entry : aVar.b().entrySet()) {
                lVar.f((String) entry.getKey(), (String) entry.getValue());
            }
            return jn0.h0.f84049a;
        }
    }

    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26807b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f26809d;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26807b = obj;
            this.f26809d |= Integer.MIN_VALUE;
            Object objA = Li.this.a((Cl.c) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    static final class f extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f26811b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Cl.c f26813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Cl.c f26814e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Cl.c cVar, Cl.c cVar2, Continuation continuation) {
            super(2, continuation);
            this.f26813d = cVar;
            this.f26814e = cVar2;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Li.this.new f(this.f26813d, this.f26814e, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
        
            if (r15 == r0) goto L19;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r14.f26811b
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L22
                if (r1 != r3) goto L1a
                jn0.t.b(r15)
                jn0.s r15 = (jn0.s) r15
                java.lang.Object r15 = r15.getValue()
                goto Lb0
            L1a:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L22:
                java.lang.Object r1 = r14.f26810a
                com.fourthline.orca.internal.Li r1 = (com.fourthline.orca.internal.Li) r1
                jn0.t.b(r15)
                goto La3
            L2b:
                jn0.t.b(r15)
                com.fourthline.orca.internal.Li r1 = com.fourthline.orca.internal.Li.this
                ok0.a r15 = com.fourthline.orca.internal.Li.a(r1)
                com.fourthline.orca.internal.Cl$c r5 = r14.f26813d
                java.lang.String r5 = r5.d()
                com.fourthline.orca.internal.Cl$c r6 = r14.f26813d
                com.fourthline.orca.internal.fi0 r7 = new com.fourthline.orca.internal.fi0
                r7.<init>()
                java.util.List r9 = xk0.d.a(r7)
                com.fourthline.orca.internal.Cl$c r6 = r14.f26814e
                wk0.c r7 = new wk0.c
                r7.<init>()
                bl0.t$a r8 = bl0.HttpMethod.INSTANCE
                bl0.t r8 = r8.c()
                r7.n(r8)
                xk0.g r8 = new xk0.g
                r12 = 6
                r13 = 0
                r10 = 0
                r11 = 0
                r8.<init>(r9, r10, r11, r12, r13)
                r7.j(r8)
                r7.k(r2)
                wk0.e.c(r7, r5)
                java.util.List r5 = r6.c()
                java.util.Iterator r5 = r5.iterator()
            L6f:
                boolean r8 = r5.hasNext()
                if (r8 == 0) goto L8b
                java.lang.Object r8 = r5.next()
                kotlin.Pair r8 = (p013kotlin.Pair) r8
                java.lang.Object r9 = r8.a()
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r8 = r8.b()
                java.lang.String r8 = (java.lang.String) r8
                wk0.j.b(r7, r9, r8)
                goto L6f
            L8b:
                com.fourthline.orca.internal.gi0 r5 = new com.fourthline.orca.internal.gi0
                r5.<init>()
                wk0.e.a(r7, r5)
                yk0.g r5 = new yk0.g
                r5.<init>(r7, r15)
                r14.f26810a = r1
                r14.f26811b = r4
                java.lang.Object r15 = r5.c(r14)
                if (r15 != r0) goto La3
                goto Laf
            La3:
                yk0.c r15 = (yk0.c) r15
                r14.f26810a = r2
                r14.f26811b = r3
                java.lang.Object r15 = com.fourthline.orca.internal.Li.a(r1, r15, r14)
                if (r15 != r0) goto Lb0
            Laf:
                return r0
            Lb0:
                jn0.s r15 = jn0.s.a(r15)
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.Li.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(Cl.c cVar, xk0.b bVar) {
            for (Cl.c.a aVar : cVar.a()) {
                String strB = aVar.b();
                byte[] bArrB = aVar.c().b();
                bl0.l lVar = new bl0.l(0, 1, null);
                for (Map.Entry entry : aVar.a().entrySet()) {
                    lVar.f((String) entry.getKey(), (String) entry.getValue());
                }
                jn0.h0 h0Var = jn0.h0.f84049a;
                bVar.a(strB, bArrB, lVar.n());
            }
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(Cl.c cVar, bl0.l lVar) {
            for (Map.Entry entry : cVar.b().entrySet()) {
                lVar.f((String) entry.getKey(), (String) entry.getValue());
            }
            return jn0.h0.f84049a;
        }
    }

    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f26816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f26817c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f26819e;

        g(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26817c = obj;
            this.f26819e |= Integer.MIN_VALUE;
            Object objA = Li.this.a((yk0.c) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Li(String baseUrl, NetworkEnvironment networkEnvironment) {
        p013kotlin.jvm.internal.s.k(baseUrl, "baseUrl");
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        this.f26789a = baseUrl;
        this.f26790b = networkEnvironment;
        this.f26791c = 60L;
        this.f26792d = sk0.a.f111333a.a(new wn0.l() { // from class: com.fourthline.orca.internal.ai0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Li.a(this.f30426a, (sk0.c) obj);
            }
        });
        this.f26793e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.bi0
            @Override // wn0.a
            public final Object invoke() {
                return Li.b(this.f30661a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ok0.a b(final Li li2) {
        return ok0.c.a(li2.f26792d, new wn0.l() { // from class: com.fourthline.orca.internal.zh0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Li.a(this.f37282a, (ok0.b) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        c().close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ok0.a c() {
        return (ok0.a) this.f26793e.getValue();
    }

    @Override // com.fourthline.orca.internal.Gl
    public NetworkEnvironment a() {
        return this.f26790b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(final Li li2, sk0.c create) {
        p013kotlin.jvm.internal.s.k(create, "$this$create");
        create.b(new wn0.l() { // from class: com.fourthline.orca.internal.yh0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Li.a(this.f37011a, (OkHttpClient.Builder) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Li li2, OkHttpClient.Builder config) {
        p013kotlin.jvm.internal.s.k(config, "$this$config");
        C3816sg c3816sg = new C3816sg(li2.f26789a);
        SSLSocketFactory socketFactory = c3816sg.a().getSocketFactory();
        p013kotlin.jvm.internal.s.j(socketFactory, "getSocketFactory(...)");
        config.sslSocketFactory(socketFactory, c3816sg.b());
        long j11 = li2.f26791c;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        config.connectTimeout(j11, timeUnit);
        config.readTimeout(li2.f26791c, timeUnit);
        config.writeTimeout(li2.f26791c, timeUnit);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(final Li li2, ok0.b HttpClient) {
        p013kotlin.jvm.internal.s.k(HttpClient, "$this$HttpClient");
        HttpClient.h(tk0.r.INSTANCE, new wn0.l() { // from class: com.fourthline.orca.internal.ci0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Li.a((tk0.r.a) obj);
            }
        });
        tk0.d.b(HttpClient, new wn0.l() { // from class: com.fourthline.orca.internal.di0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Li.a(this.f31191a, (tk0.c.a) obj);
            }
        });
        uk0.g.a(HttpClient, li2.new b(null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(tk0.r.a install) {
        p013kotlin.jvm.internal.s.k(install, "$this$install");
        install.b(Build.MANUFACTURER + " " + Build.MODEL);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Li li2, tk0.c.a defaultRequest) {
        p013kotlin.jvm.internal.s.k(defaultRequest, "$this$defaultRequest");
        defaultRequest.d(li2.f26789a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(wk0.b bVar) {
        return p013kotlin.text.t.L(bVar.getUrl().d(), "/newanalytics", false, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Gl
    public Object a(Cl.a aVar, Continuation continuation) {
        c cVar;
        Li li2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f26800d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f26800d = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objWithContext = cVar.f26798b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f26800d;
        if (i12 == 0) {
            jn0.t.b(objWithContext);
            try {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                d dVar = new d(aVar, aVar, null);
                cVar.f26797a = this;
                cVar.f26800d = 1;
                objWithContext = BuildersKt.withContext(io2, dVar, cVar);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e11) {
                e = e11;
                li2 = this;
                return li2.a(e);
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li2 = (Li) cVar.f26797a;
            try {
                jn0.t.b(objWithContext);
            } catch (Exception e12) {
                e = e12;
                return li2.a(e);
            }
        }
        return ((jn0.s) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Gl
    public Object a(Cl.c cVar, Continuation continuation) {
        e eVar;
        Li li2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f26809d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f26809d = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objWithContext = eVar.f26807b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f26809d;
        if (i12 == 0) {
            jn0.t.b(objWithContext);
            try {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                f fVar = new f(cVar, cVar, null);
                eVar.f26806a = this;
                eVar.f26809d = 1;
                objWithContext = BuildersKt.withContext(io2, fVar, eVar);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e11) {
                e = e11;
                li2 = this;
                return li2.a(e);
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li2 = (Li) eVar.f26806a;
            try {
                jn0.t.b(objWithContext);
            } catch (Exception e12) {
                e = e12;
                return li2.a(e);
            }
        }
        return ((jn0.s) objWithContext).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(yk0.c cVar, Continuation continuation) {
        g gVar;
        int i11;
        Map map;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i12 = gVar.f26819e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                gVar.f26819e = i12 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.f26817c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = gVar.f26819e;
        if (i13 == 0) {
            jn0.t.b(obj);
            jn0.s.Companion companion = jn0.s.INSTANCE;
            int value = cVar.getStatus().getValue();
            Set<Map.Entry<String, List<String>>> setA = cVar.getHeaders().a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = setA.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Iterator it2 = ((Iterable) entry.getValue()).iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = ((String) next) + ((String) it2.next());
                    }
                    linkedHashMap.put(str, (String) next);
                } else {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
            }
            pk0.a call = cVar.getCall();
            co0.q qVarO = p013kotlin.jvm.internal.o0.o(byte[].class);
            TypeInfo typeInfoB = il0.b.b(co0.x.f(qVarO), p013kotlin.jvm.internal.o0.b(byte[].class), qVarO);
            gVar.f26816b = linkedHashMap;
            gVar.f26815a = value;
            gVar.f26819e = 1;
            Object objA = call.a(typeInfoB, gVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objA;
            i11 = value;
            map = linkedHashMap;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = gVar.f26815a;
            map = (Map) gVar.f26816b;
            jn0.t.b(obj);
        }
        if (obj != null) {
            return jn0.s.b(new Dl(i11, map, new C3842t5((byte[]) obj)));
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
    }

    private final Object a(Exception exc) {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(jn0.t.a(new C3393il(exc)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpMethod a(Cl.b bVar) {
        int i11 = a.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i11 == 1) {
            return HttpMethod.INSTANCE.a();
        }
        if (i11 == 2) {
            return HttpMethod.INSTANCE.c();
        }
        if (i11 == 3) {
            return HttpMethod.INSTANCE.d();
        }
        throw new NoWhenBranchMatchedException();
    }
}
