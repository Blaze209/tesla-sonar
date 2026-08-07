package io.ktor.client.plugins;

import bl0.HttpMethod;
import bl0.k;
import bl0.k0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import jn0.h0;
import org.slf4j.Logger;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\n\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b\"\u0018\u0010\u000f\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\" \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014*B\u0010\u001a\"\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00162\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016*N\u0010\u001d\"$\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001b2$\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001b*B\u0010\u001f\"\u001e\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00162\u001e\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016¨\u0006 "}, d2 = {"Lwk0/c;", "builder", "io/ktor/client/plugins/c$a", "a", "(Lwk0/c;)Lio/ktor/client/plugins/c$a;", "Lok0/b;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/b$b;", "Ljn0/h0;", "block", "b", "(Lok0/b;Lwn0/l;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "Lorg/slf4j/Logger;", "LOGGER", "Ldl0/a;", "", "Ldl0/a;", "e", "()Ldl0/a;", "ExpectSuccessAttributeKey", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "CallExceptionHandler", "Lkotlin/Function3;", "Lwk0/b;", "CallRequestExceptionHandler", "Lyk0/c;", "ResponseValidator", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f78442a = gl0.a.a("io.ktor.client.plugins.HttpCallValidator");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dl0.a<Boolean> f78443b = new dl0.a<>("ExpectSuccessAttributeKey");

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\t\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"io/ktor/client/plugins/c$a", "Lwk0/b;", "Lbl0/t;", "a", "Lbl0/t;", "getMethod", "()Lbl0/t;", "method", "Lbl0/k0;", "b", "Lbl0/k0;", "getUrl", "()Lbl0/k0;", ImagesContract.URL, "Ldl0/b;", "c", "Ldl0/b;", "getAttributes", "()Ldl0/b;", "attributes", "Lbl0/k;", DateTokenConverter.CONVERTER_KEY, "Lbl0/k;", "()Lbl0/k;", "headers", "Lpk0/a;", "I", "()Lpk0/a;", "call", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements wk0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HttpMethod method;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final k0 url;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final dl0.b attributes;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final k headers;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wk0.c f78448e;

        a(wk0.c cVar) {
            this.f78448e = cVar;
            this.method = cVar.getMethod();
            this.url = cVar.getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String().b();
            this.attributes = cVar.getAttributes();
            this.headers = cVar.getHeaders().n();
        }

        @Override // wk0.b
        /* JADX INFO: renamed from: I */
        public pk0.a getCall() {
            throw new IllegalStateException("Call is not initialized");
        }

        @Override // bl0.q
        /* JADX INFO: renamed from: b, reason: from getter */
        public k getHeaders() {
            return this.headers;
        }

        @Override // wk0.b
        public dl0.b getAttributes() {
            return this.attributes;
        }

        @Override // wk0.b, kotlinx.coroutines.CoroutineScope
        public CoroutineContext getCoroutineContext() {
            return wk0.b.a.a(this);
        }

        @Override // wk0.b
        public HttpMethod getMethod() {
            return this.method;
        }

        @Override // wk0.b
        public k0 getUrl() {
            return this.url;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a a(wk0.c cVar) {
        return new a(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ok0.b<?> bVar, l<? super b.C1669b, h0> block) {
        s.k(bVar, "<this>");
        s.k(block, "block");
        bVar.h(b.INSTANCE, block);
    }

    public static final dl0.a<Boolean> e() {
        return f78443b;
    }
}
