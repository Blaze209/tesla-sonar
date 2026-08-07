package tk0;

import bl0.URLProtocol;
import bl0.b0;
import bl0.d0;
import bl0.g0;
import bl0.j0;
import bl0.k0;
import bl0.y;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import dl0.a0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\b\nB\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ltk0/c;", "", "Lkotlin/Function1;", "Ltk0/c$a;", "Ljn0/h0;", "block", "<init>", "(Lwn0/l;)V", "a", "Lwn0/l;", "b", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dl0.a<c> f114665c = new dl0.a<>("DefaultRequest");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<a, h0> block;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\n\u0010\u0016¨\u0006\u0018"}, d2 = {"Ltk0/c$a;", "Lbl0/r;", "<init>", "()V", "", "urlString", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)V", "Lbl0/l;", "a", "Lbl0/l;", "b", "()Lbl0/l;", "headers", "Lbl0/d0;", "Lbl0/d0;", "c", "()Lbl0/d0;", ImagesContract.URL, "Ldl0/b;", "Ldl0/b;", "()Ldl0/b;", "attributes", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements bl0.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final bl0.l headers = new bl0.l(0, 1, null);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final d0 url = new d0(null, null, 0, null, null, null, null, null, false, 511, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final dl0.b attributes = dl0.d.a(true);

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dl0.b getAttributes() {
            return this.attributes;
        }

        @Override // bl0.r
        /* JADX INFO: renamed from: b, reason: from getter */
        public bl0.l getHeaders() {
            return this.headers;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final d0 getUrl() {
            return this.url;
        }

        public final void d(String urlString) {
            p013kotlin.jvm.internal.s.k(urlString, "urlString");
            g0.j(this.url, urlString);
        }
    }

    /* JADX INFO: renamed from: tk0.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Ltk0/c$b;", "Ltk0/i;", "Ltk0/c$a;", "Ltk0/c;", "<init>", "()V", "Lbl0/k0;", "baseUrl", "Lbl0/d0;", "requestUrl", "Ljn0/h0;", "f", "(Lbl0/k0;Lbl0/d0;)V", "", "", "parent", "child", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lkotlin/Function1;", "block", "g", "(Lwn0/l;)Ltk0/c;", "plugin", "Lok0/a;", "scope", "e", "(Ltk0/c;Lok0/a;)V", "Ldl0/a;", Action.KEY_ATTRIBUTE, "Ldl0/a;", "getKey", "()Ldl0/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements i<a, c> {

        /* JADX INFO: renamed from: tk0.c$b$a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhl0/e;", "", "Lwk0/c;", "it", "Ljn0/h0;", "<anonymous>", "(Lhl0/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.DefaultRequest$Plugin$install$1", f = "DefaultRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.q<hl0.e<Object, wk0.c>, Object, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f114670n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f114671o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ c f114672p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, Continuation<? super a> continuation) {
                super(3, continuation);
                this.f114672p = cVar;
            }

            @Override // wn0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(hl0.e<Object, wk0.c> eVar, Object obj, Continuation<? super h0> continuation) {
                a aVar = new a(this.f114672p, continuation);
                aVar.f114671o = eVar;
                return aVar.invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f114670n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                hl0.e eVar = (hl0.e) this.f114671o;
                String string = ((wk0.c) eVar.b()).getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String().toString();
                a aVar = new a();
                c cVar = this.f114672p;
                a0.c(aVar.getHeaders(), ((wk0.c) eVar.b()).getHeaders());
                cVar.block.invoke(aVar);
                c.INSTANCE.f(aVar.getUrl().b(), ((wk0.c) eVar.b()).getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String());
                for (dl0.a<?> aVar2 : aVar.getAttributes().d()) {
                    if (!((wk0.c) eVar.b()).getAttributes().f(aVar2)) {
                        dl0.b attributes = ((wk0.c) eVar.b()).getAttributes();
                        p013kotlin.jvm.internal.s.i(aVar2, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                        attributes.c(aVar2, aVar.getAttributes().e(aVar2));
                    }
                }
                ((wk0.c) eVar.b()).getHeaders().clear();
                ((wk0.c) eVar.b()).getHeaders().e(aVar.getHeaders().n());
                d.f114673a.trace("Applied DefaultRequest to " + string + ". New url: " + ((wk0.c) eVar.b()).getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String());
                return h0.f84049a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<String> d(List<String> parent, List<String> child) {
            if (child.isEmpty()) {
                return parent;
            }
            if (parent.isEmpty() || ((CharSequence) v.o0(child)).length() == 0) {
                return child;
            }
            List listD = v.d((parent.size() + child.size()) - 1);
            int size = parent.size() - 1;
            for (int i11 = 0; i11 < size; i11++) {
                listD.add(parent.get(i11));
            }
            listD.addAll(child);
            return v.a(listD);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(k0 baseUrl, d0 requestUrl) {
            if (p013kotlin.jvm.internal.s.f(requestUrl.getProtocol(), URLProtocol.INSTANCE.c())) {
                requestUrl.y(baseUrl.getProtocol());
            }
            if (requestUrl.getHost().length() > 0) {
                return;
            }
            d0 d0VarA = j0.a(baseUrl);
            d0VarA.y(requestUrl.getProtocol());
            if (requestUrl.getPort() != 0) {
                d0VarA.x(requestUrl.getPort());
            }
            d0VarA.u(c.INSTANCE.d(d0VarA.g(), requestUrl.g()));
            if (requestUrl.getEncodedFragment().length() > 0) {
                d0VarA.r(requestUrl.getEncodedFragment());
            }
            y yVarB = b0.b(0, 1, null);
            a0.c(yVarB, d0VarA.getEncodedParameters());
            d0VarA.s(requestUrl.getEncodedParameters());
            Iterator<T> it = yVarB.a().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (!d0VarA.getEncodedParameters().contains(str)) {
                    d0VarA.getEncodedParameters().d(str, list);
                }
            }
            j0.g(requestUrl, d0VarA);
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(c plugin, ok0.a scope) {
            p013kotlin.jvm.internal.s.k(plugin, "plugin");
            p013kotlin.jvm.internal.s.k(scope, "scope");
            scope.getRequestPipeline().l(wk0.f.INSTANCE.a(), new a(plugin, null));
        }

        @Override // tk0.i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public c a(wn0.l<? super a, h0> block) {
            p013kotlin.jvm.internal.s.k(block, "block");
            return new c(block, null);
        }

        @Override // tk0.i
        public dl0.a<c> getKey() {
            return c.f114665c;
        }

        private Companion() {
        }
    }

    public /* synthetic */ c(wn0.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(wn0.l<? super a, h0> lVar) {
        this.block = lVar;
    }
}
