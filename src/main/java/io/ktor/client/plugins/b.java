package io.ktor.client.plugins;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import hl0.Phase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import tk0.h;
import tk0.i;
import tk0.j;
import wn0.l;
import wn0.p;
import wn0.q;
import yk0.HttpResponseContainer;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0017\u0019BL\b\u0000\u0012(\u0010\u0007\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R9\u0010\u0007\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lio/ktor/client/plugins/b;", "", "", "Lkotlin/Function2;", "Lyk0/c;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "responseValidators", "Ltk0/h;", "callExceptionHandlers", "", "expectSuccess", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "response", "f", "(Lyk0/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "Lwk0/b;", "request", "e", "(Ljava/lang/Throwable;Lwk0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/util/List;", "b", "c", "Z", DateTokenConverter.CONVERTER_KEY, "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dl0.a<b> f78411e = new dl0.a<>("HttpResponseValidator");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<p<yk0.c, Continuation<? super h0>, Object>> responseValidators;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<h> callExceptionHandlers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean expectSuccess;

    /* JADX INFO: renamed from: io.ktor.client.plugins.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/client/plugins/b$a;", "Ltk0/i;", "Lio/ktor/client/plugins/b$b;", "Lio/ktor/client/plugins/b;", "<init>", "()V", "Lkotlin/Function1;", "Ljn0/h0;", "block", DateTokenConverter.CONVERTER_KEY, "(Lwn0/l;)Lio/ktor/client/plugins/b;", "plugin", "Lok0/a;", "scope", "c", "(Lio/ktor/client/plugins/b;Lok0/a;)V", "Ldl0/a;", Action.KEY_ATTRIBUTE, "Ldl0/a;", "getKey", "()Ldl0/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements i<C1669b, b> {

        /* JADX INFO: renamed from: io.ktor.client.plugins.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhl0/e;", "", "Lwk0/c;", "it", "Ljn0/h0;", "<anonymous>", "(Lhl0/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$1", f = "HttpCallValidator.kt", i = {0, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 133}, m = "invokeSuspend", n = {"$this$intercept", "unwrappedCause"}, s = {"L$0", "L$0"})
        static final class C1666a extends SuspendLambda implements q<hl0.e<Object, wk0.c>, Object, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f78415n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f78416o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f78417p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ b f78418q;

            /* JADX INFO: renamed from: io.ktor.client.plugins.b$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            static final class C1667a extends u implements wn0.a<Boolean> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ b f78419c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1667a(b bVar) {
                    super(0);
                    this.f78419c = bVar;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f78419c.expectSuccess);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1666a(b bVar, Continuation<? super C1666a> continuation) {
                super(3, continuation);
                this.f78418q = bVar;
            }

            @Override // wn0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(hl0.e<Object, wk0.c> eVar, Object obj, Continuation<? super h0> continuation) {
                C1666a c1666a = new C1666a(this.f78418q, continuation);
                c1666a.f78416o = eVar;
                c1666a.f78417p = obj;
                return c1666a.invokeSuspend(h0.f84049a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
            
                if (r9 == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
            
                return r0;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [hl0.e] */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v8 */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
                /*
                    r8 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r8.f78415n
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L28
                    if (r1 == r3) goto L1e
                    if (r1 == r2) goto L16
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L16:
                    java.lang.Object r0 = r8.f78416o
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    jn0.t.b(r9)
                    goto L74
                L1e:
                    java.lang.Object r1 = r8.f78416o
                    hl0.e r1 = (hl0.e) r1
                    jn0.t.b(r9)     // Catch: java.lang.Throwable -> L26
                    goto L55
                L26:
                    r9 = move-exception
                    goto L58
                L28:
                    jn0.t.b(r9)
                    java.lang.Object r9 = r8.f78416o
                    r1 = r9
                    hl0.e r1 = (hl0.e) r1
                    java.lang.Object r9 = r8.f78417p
                    java.lang.Object r4 = r1.b()     // Catch: java.lang.Throwable -> L26
                    wk0.c r4 = (wk0.c) r4     // Catch: java.lang.Throwable -> L26
                    dl0.b r4 = r4.getAttributes()     // Catch: java.lang.Throwable -> L26
                    dl0.a r5 = io.ktor.client.plugins.c.e()     // Catch: java.lang.Throwable -> L26
                    io.ktor.client.plugins.b$a$a$a r6 = new io.ktor.client.plugins.b$a$a$a     // Catch: java.lang.Throwable -> L26
                    io.ktor.client.plugins.b r7 = r8.f78418q     // Catch: java.lang.Throwable -> L26
                    r6.<init>(r7)     // Catch: java.lang.Throwable -> L26
                    r4.g(r5, r6)     // Catch: java.lang.Throwable -> L26
                    r8.f78416o = r1     // Catch: java.lang.Throwable -> L26
                    r8.f78415n = r3     // Catch: java.lang.Throwable -> L26
                    java.lang.Object r9 = r1.d(r9, r8)     // Catch: java.lang.Throwable -> L26
                    if (r9 != r0) goto L55
                    goto L72
                L55:
                    jn0.h0 r9 = jn0.h0.f84049a
                    return r9
                L58:
                    java.lang.Throwable r9 = p028zk0.d.a(r9)
                    io.ktor.client.plugins.b r3 = r8.f78418q
                    java.lang.Object r1 = r1.b()
                    wk0.c r1 = (wk0.c) r1
                    io.ktor.client.plugins.c$a r1 = io.ktor.client.plugins.c.c(r1)
                    r8.f78416o = r9
                    r8.f78415n = r2
                    java.lang.Object r1 = io.ktor.client.plugins.b.c(r3, r9, r1, r8)
                    if (r1 != r0) goto L73
                L72:
                    return r0
                L73:
                    r0 = r9
                L74:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.b.Companion.C1666a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: io.ktor.client.plugins.b$a$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhl0/e;", "Lyk0/d;", "Lpk0/a;", "container", "Ljn0/h0;", "<anonymous>", "(Lhl0/e;Lyk0/d;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$2", f = "HttpCallValidator.kt", i = {0, 1}, l = {142, 145}, m = "invokeSuspend", n = {"$this$intercept", "unwrappedCause"}, s = {"L$0", "L$0"})
        static final class C1668b extends SuspendLambda implements q<hl0.e<HttpResponseContainer, pk0.a>, HttpResponseContainer, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f78420n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f78421o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f78422p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ b f78423q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1668b(b bVar, Continuation<? super C1668b> continuation) {
                super(3, continuation);
                this.f78423q = bVar;
            }

            @Override // wn0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(hl0.e<HttpResponseContainer, pk0.a> eVar, HttpResponseContainer httpResponseContainer, Continuation<? super h0> continuation) {
                C1668b c1668b = new C1668b(this.f78423q, continuation);
                c1668b.f78421o = eVar;
                c1668b.f78422p = httpResponseContainer;
                return c1668b.invokeSuspend(h0.f84049a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
            
                if (r5 == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
            
                return r0;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [hl0.e] */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v8 */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
                /*
                    r4 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r4.f78420n
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L28
                    if (r1 == r3) goto L1e
                    if (r1 == r2) goto L16
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L16:
                    java.lang.Object r0 = r4.f78421o
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    jn0.t.b(r5)
                    goto L5e
                L1e:
                    java.lang.Object r1 = r4.f78421o
                    hl0.e r1 = (hl0.e) r1
                    jn0.t.b(r5)     // Catch: java.lang.Throwable -> L26
                    goto L3f
                L26:
                    r5 = move-exception
                    goto L42
                L28:
                    jn0.t.b(r5)
                    java.lang.Object r5 = r4.f78421o
                    r1 = r5
                    hl0.e r1 = (hl0.e) r1
                    java.lang.Object r5 = r4.f78422p
                    yk0.d r5 = (yk0.HttpResponseContainer) r5
                    r4.f78421o = r1     // Catch: java.lang.Throwable -> L26
                    r4.f78420n = r3     // Catch: java.lang.Throwable -> L26
                    java.lang.Object r5 = r1.d(r5, r4)     // Catch: java.lang.Throwable -> L26
                    if (r5 != r0) goto L3f
                    goto L5c
                L3f:
                    jn0.h0 r5 = jn0.h0.f84049a
                    return r5
                L42:
                    java.lang.Throwable r5 = p028zk0.d.a(r5)
                    io.ktor.client.plugins.b r3 = r4.f78423q
                    java.lang.Object r1 = r1.b()
                    pk0.a r1 = (pk0.a) r1
                    wk0.b r1 = r1.d()
                    r4.f78421o = r5
                    r4.f78420n = r2
                    java.lang.Object r1 = io.ktor.client.plugins.b.c(r3, r5, r1, r4)
                    if (r1 != r0) goto L5d
                L5c:
                    return r0
                L5d:
                    r0 = r5
                L5e:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.b.Companion.C1668b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: io.ktor.client.plugins.b$a$c */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltk0/q;", "Lwk0/c;", "request", "Lpk0/a;", "<anonymous>", "(Ltk0/q;Lwk0/c;)Lpk0/a;"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$3", f = "HttpCallValidator.kt", i = {1}, l = {151, 152}, m = "invokeSuspend", n = {"call"}, s = {"L$0"})
        static final class c extends SuspendLambda implements q<tk0.q, wk0.c, Continuation<? super pk0.a>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f78424n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f78425o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f78426p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ b f78427q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b bVar, Continuation<? super c> continuation) {
                super(3, continuation);
                this.f78427q = bVar;
            }

            @Override // wn0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(tk0.q qVar, wk0.c cVar, Continuation<? super pk0.a> continuation) {
                c cVar2 = new c(this.f78427q, continuation);
                cVar2.f78425o = qVar;
                cVar2.f78426p = cVar;
                return cVar2.invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f78424n;
                if (i11 == 0) {
                    t.b(obj);
                    tk0.q qVar = (tk0.q) this.f78425o;
                    wk0.c cVar = (wk0.c) this.f78426p;
                    this.f78425o = null;
                    this.f78424n = 1;
                    obj = qVar.a(cVar, this);
                    if (obj != coroutine_suspended) {
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pk0.a aVar = (pk0.a) this.f78425o;
                    t.b(obj);
                    return aVar;
                }
                t.b(obj);
                pk0.a aVar2 = (pk0.a) obj;
                b bVar = this.f78427q;
                yk0.c cVarE = aVar2.e();
                this.f78425o = aVar2;
                this.f78424n = 2;
                return bVar.f(cVarE, this) == coroutine_suspended ? coroutine_suspended : aVar2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(b plugin, ok0.a scope) throws hl0.b {
            s.k(plugin, "plugin");
            s.k(scope, "scope");
            scope.getRequestPipeline().l(wk0.f.INSTANCE.a(), new C1666a(plugin, null));
            Phase phase = new Phase("BeforeReceive");
            scope.getResponsePipeline().k(yk0.f.INSTANCE.b(), phase);
            scope.getResponsePipeline().l(phase, new C1668b(plugin, null));
            ((e) j.b(scope, e.INSTANCE)).d(new c(plugin, null));
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a(l<? super C1669b, h0> block) {
            s.k(block, "block");
            C1669b c1669b = new C1669b();
            block.invoke(c1669b);
            return new b(v.R0(c1669b.c()), v.R0(c1669b.b()), c1669b.getExpectSuccess());
        }

        @Override // tk0.i
        public dl0.a<b> getKey() {
            return b.f78411e;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\t\u001a\u00020\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR?\u0010\u0010\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u000b8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0012\u0010\u000fR(\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010\u0015\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\f\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lio/ktor/client/plugins/b$b;", "", "<init>", "()V", "Lkotlin/Function2;", "Lyk0/c;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "block", "e", "(Lwn0/p;)V", "", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "responseValidators", "Ltk0/h;", "b", "responseExceptionHandlers", "", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "(Z)V", "getExpectSuccess$annotations", "expectSuccess", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C1669b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<p<yk0.c, Continuation<? super h0>, Object>> responseValidators = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<h> responseExceptionHandlers = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean expectSuccess = true;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getExpectSuccess() {
            return this.expectSuccess;
        }

        public final List<h> b() {
            return this.responseExceptionHandlers;
        }

        public final List<p<yk0.c, Continuation<? super h0>, Object>> c() {
            return this.responseValidators;
        }

        public final void d(boolean z11) {
            this.expectSuccess = z11;
        }

        public final void e(p<? super yk0.c, ? super Continuation<? super h0>, ? extends Object> block) {
            s.k(block, "block");
            this.responseValidators.add(block);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidator", f = "HttpCallValidator.kt", i = {0, 0, 1, 1}, l = {58, 59}, m = "processException", n = {"cause", "request", "cause", "request"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78431n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78432o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f78433p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f78434q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f78436s;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78434q = obj;
            this.f78436s |= Integer.MIN_VALUE;
            return b.this.e(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.plugins.HttpCallValidator", f = "HttpCallValidator.kt", i = {0}, l = {51}, m = "validateResponse", n = {"response"}, s = {"L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78437n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78438o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f78439p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f78441r;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78439p = obj;
            this.f78441r |= Integer.MIN_VALUE;
            return b.this.f(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends p<? super yk0.c, ? super Continuation<? super h0>, ? extends Object>> responseValidators, List<? extends h> callExceptionHandlers, boolean z11) {
        s.k(responseValidators, "responseValidators");
        s.k(callExceptionHandlers, "callExceptionHandlers");
        this.responseValidators = responseValidators;
        this.callExceptionHandlers = callExceptionHandlers;
        this.expectSuccess = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[LOOP:0: B:17:0x0074->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(java.lang.Throwable r8, wk0.b r9, p013kotlin.coroutines.Continuation<? super jn0.h0> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof io.ktor.client.plugins.b.c
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.plugins.b$c r0 = (io.ktor.client.plugins.b.c) r0
            int r1 = r0.f78436s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78436s = r1
            goto L18
        L13:
            io.ktor.client.plugins.b$c r0 = new io.ktor.client.plugins.b$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f78434q
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78436s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            java.lang.Object r8 = r0.f78433p
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f78432o
            wk0.b r9 = (wk0.b) r9
            java.lang.Object r2 = r0.f78431n
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            jn0.t.b(r10)
            goto L9b
        L41:
            jn0.t.b(r10)
            org.slf4j.Logger r10 = io.ktor.client.plugins.c.d()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Processing exception "
            r2.append(r5)
            r2.append(r8)
            java.lang.String r5 = " for request "
            r2.append(r5)
            bl0.k0 r5 = r9.getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r10.trace(r2)
            java.util.List<tk0.h> r10 = r7.callExceptionHandlers
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L74:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r8.next()
            tk0.h r2 = (tk0.h) r2
            boolean r5 = r2 instanceof tk0.g
            if (r5 == 0) goto L9e
            tk0.g r2 = (tk0.g) r2
            wn0.p r2 = r2.a()
            r0.f78431n = r9
            r0.f78432o = r10
            r0.f78433p = r8
            r0.f78436s = r4
            java.lang.Object r2 = r2.invoke(r9, r0)
            if (r2 != r1) goto L99
            goto Lb6
        L99:
            r2 = r9
            r9 = r10
        L9b:
            r10 = r9
            r9 = r2
            goto L74
        L9e:
            boolean r5 = r2 instanceof tk0.p
            if (r5 == 0) goto L74
            tk0.p r2 = (tk0.p) r2
            wn0.q r2 = r2.a()
            r0.f78431n = r9
            r0.f78432o = r10
            r0.f78433p = r8
            r0.f78436s = r3
            java.lang.Object r2 = r2.invoke(r9, r10, r0)
            if (r2 != r1) goto L99
        Lb6:
            return r1
        Lb7:
            jn0.h0 r8 = jn0.h0.f84049a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.b.e(java.lang.Throwable, wk0.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(yk0.c cVar, Continuation<? super h0> continuation) {
        d dVar;
        yk0.c cVar2;
        Iterator it;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f78441r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f78441r = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f78439p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f78441r;
        if (i12 == 0) {
            t.b(obj);
            io.ktor.client.plugins.c.f78442a.trace("Validating response for request " + cVar.getCall().d().getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String());
            cVar2 = cVar;
            it = this.responseValidators.iterator();
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) dVar.f78438o;
            yk0.c cVar3 = (yk0.c) dVar.f78437n;
            t.b(obj);
            cVar2 = cVar3;
        }
        while (it.hasNext()) {
            p pVar = (p) it.next();
            dVar.f78437n = cVar2;
            dVar.f78438o = it;
            dVar.f78441r = 1;
            if (pVar.invoke(cVar2, dVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return h0.f84049a;
    }
}
