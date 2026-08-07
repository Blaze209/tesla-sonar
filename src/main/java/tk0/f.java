package tk0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import il0.TypeInfo;
import java.io.IOException;
import java.io.InputStream;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Job;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.o0;
import yk0.HttpResponseContainer;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lok0/a;", "Ljn0/h0;", "b", "(Lok0/a;)V", "Lbl0/c;", CMSAttributeTableGenerator.CONTENT_TYPE, "Lwk0/c;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "body", "Lcl0/b;", "a", "(Lbl0/c;Lwk0/c;Ljava/lang/Object;)Lcl0/b;", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"tk0/f$a", "Lcl0/b$c;", "Lio/ktor/utils/io/g;", DateTokenConverter.CONVERTER_KEY, "()Lio/ktor/utils/io/g;", "", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "contentLength", "Lbl0/c;", "b", "Lbl0/c;", "()Lbl0/c;", CMSAttributeTableGenerator.CONTENT_TYPE, "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends cl0.b.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Long contentLength;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final bl0.c contentType;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f114697c;

        a(wk0.c cVar, bl0.c cVar2, Object obj) {
            this.f114697c = obj;
            String strH = cVar.getHeaders().h(bl0.o.f17654a.h());
            this.contentLength = strH != null ? Long.valueOf(Long.parseLong(strH)) : null;
            this.contentType = cVar2 == null ? bl0.c.a.f17547a.b() : cVar2;
        }

        @Override // cl0.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Long getContentLength() {
            return this.contentLength;
        }

        @Override // cl0.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public bl0.c getContentType() {
            return this.contentType;
        }

        @Override // cl0.b.c
        public io.ktor.utils.io.g d() {
            return io.ktor.utils.io.jvm.javaio.h.b((InputStream) this.f114697c, null, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhl0/e;", "Lyk0/d;", "Lpk0/a;", "<name for destructuring parameter 0>", "Ljn0/h0;", "<anonymous>", "(Lhl0/e;Lyk0/d;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", f = "DefaultTransformersJvm.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.q<hl0.e<HttpResponseContainer, pk0.a>, HttpResponseContainer, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f114698n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f114699o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f114700p;

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"tk0/f$b$a", "Ljava/io/InputStream;", "", "read", "()I", "", "b", DebugKt.DEBUG_PROPERTY_VALUE_OFF, "len", "([BII)I", "available", "Ljn0/h0;", "close", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends InputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InputStream f114701a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ hl0.e<HttpResponseContainer, pk0.a> f114702b;

            a(InputStream inputStream, hl0.e<HttpResponseContainer, pk0.a> eVar) {
                this.f114701a = inputStream;
                this.f114702b = eVar;
            }

            @Override // java.io.InputStream
            public int available() {
                return this.f114701a.available();
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                this.f114701a.close();
                yk0.e.c(this.f114702b.b().e());
            }

            @Override // java.io.InputStream
            public int read() {
                return this.f114701a.read();
            }

            @Override // java.io.InputStream
            public int read(byte[] b11, int off, int len) {
                p013kotlin.jvm.internal.s.k(b11, "b");
                return this.f114701a.read(b11, off, len);
            }
        }

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hl0.e<HttpResponseContainer, pk0.a> eVar, HttpResponseContainer httpResponseContainer, Continuation<? super h0> continuation) {
            b bVar = new b(continuation);
            bVar.f114699o = eVar;
            bVar.f114700p = httpResponseContainer;
            return bVar.invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f114698n;
            if (i11 == 0) {
                t.b(obj);
                hl0.e eVar = (hl0.e) this.f114699o;
                HttpResponseContainer httpResponseContainer = (HttpResponseContainer) this.f114700p;
                TypeInfo expectedType = httpResponseContainer.getExpectedType();
                Object response = httpResponseContainer.getResponse();
                if (!(response instanceof io.ktor.utils.io.g)) {
                    return h0.f84049a;
                }
                if (p013kotlin.jvm.internal.s.f(expectedType.a(), o0.b(InputStream.class))) {
                    HttpResponseContainer httpResponseContainer2 = new HttpResponseContainer(expectedType, new a(io.ktor.utils.io.jvm.javaio.b.c((io.ktor.utils.io.g) response, (Job) ((pk0.a) eVar.b()).getCoroutineContext().get(Job.INSTANCE)), eVar));
                    this.f114699o = null;
                    this.f114698n = 1;
                    if (eVar.d(httpResponseContainer2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }
    }

    public static final cl0.b a(bl0.c cVar, wk0.c context, Object body) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(body, "body");
        if (body instanceof InputStream) {
            return new a(context, cVar, body);
        }
        return null;
    }

    public static final void b(ok0.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        aVar.getResponsePipeline().l(yk0.f.INSTANCE.a(), new b(null));
    }
}
