package cl0;

import bl0.k;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.ktor.utils.io.g;
import jn0.h0;
import jn0.m;
import jn0.p;
import ll0.o;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\t\r\u0011\u0017B\u001f\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019\u0082\u0001\u0004\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcl0/c;", "", "Lkotlin/Function0;", "Ljn0/h0;", "dispose", "Lbl0/k;", "headers", "<init>", "(Lwn0/a;Lbl0/k;)V", "a", "Lwn0/a;", "getDispose", "()Lwn0/a;", "b", "Lbl0/k;", "()Lbl0/k;", "Lbl0/b;", "c", "Lkotlin/Lazy;", "getContentDisposition", "()Lbl0/b;", "contentDisposition", "Lbl0/c;", DateTokenConverter.CONVERTER_KEY, "getContentType", "()Lbl0/c;", CMSAttributeTableGenerator.CONTENT_TYPE, "Lcl0/c$a;", "Lcl0/c$b;", "Lcl0/c$c;", "Lcl0/c$d;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> dispose;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k headers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy contentDisposition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy contentType;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcl0/c$b;", "Lcl0/c;", "Lkotlin/Function0;", "Lll0/o;", "provider", "Ljn0/h0;", "dispose", "Lbl0/k;", "partHeaders", "<init>", "(Lwn0/a;Lwn0/a;Lbl0/k;)V", "e", "Lwn0/a;", "b", "()Lwn0/a;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<o> provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(wn0.a<? extends o> provider, wn0.a<h0> dispose, k partHeaders) {
            super(dispose, partHeaders, null);
            s.k(provider, "provider");
            s.k(dispose, "dispose");
            s.k(partHeaders, "partHeaders");
            this.provider = provider;
        }

        public final wn0.a<o> b() {
            return this.provider;
        }
    }

    /* JADX INFO: renamed from: cl0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcl0/c$c;", "Lcl0/c;", "Lkotlin/Function0;", "Lll0/o;", "e", "Lwn0/a;", "b", "()Lwn0/a;", "provider", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0402c extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<o> provider;

        public final wn0.a<o> b() {
            return this.provider;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcl0/c$d;", "Lcl0/c;", "", "value", "Lkotlin/Function0;", "Ljn0/h0;", "dispose", "Lbl0/k;", "partHeaders", "<init>", "(Ljava/lang/String;Lwn0/a;Lbl0/k;)V", "e", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String value, wn0.a<h0> dispose, k partHeaders) {
            super(dispose, partHeaders, null);
            s.k(value, "value");
            s.k(dispose, "dispose");
            s.k(partHeaders, "partHeaders");
            this.value = value;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbl0/b;", "b", "()Lbl0/b;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.a<bl0.b> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final bl0.b invoke() {
            String str = c.this.getHeaders().get(bl0.o.f17654a.f());
            if (str != null) {
                return bl0.b.INSTANCE.a(str);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbl0/c;", "b", "()Lbl0/c;"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.a<bl0.c> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final bl0.c invoke() {
            String str = c.this.getHeaders().get(bl0.o.f17654a.i());
            if (str != null) {
                return bl0.c.INSTANCE.b(str);
            }
            return null;
        }
    }

    public /* synthetic */ c(wn0.a aVar, k kVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, kVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final k getHeaders() {
        return this.headers;
    }

    private c(wn0.a<h0> aVar, k kVar) {
        this.dispose = aVar;
        this.headers = kVar;
        p pVar = p.NONE;
        this.contentDisposition = m.a(pVar, new e());
        this.contentType = m.a(pVar, new f());
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcl0/c$a;", "Lcl0/c;", "Lkotlin/Function0;", "Lio/ktor/utils/io/g;", "provider", "Lbl0/k;", "partHeaders", "<init>", "(Lwn0/a;Lbl0/k;)V", "e", "Lwn0/a;", "b", "()Lwn0/a;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<g> provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(wn0.a<? extends g> provider, k partHeaders) {
            super(C0401a.f19416c, partHeaders, null);
            s.k(provider, "provider");
            s.k(partHeaders, "partHeaders");
            this.provider = provider;
        }

        public final wn0.a<g> b() {
            return this.provider;
        }

        /* JADX INFO: renamed from: cl0.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class C0401a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0401a f19416c = new C0401a();

            C0401a() {
                super(0);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }

            public final void b() {
            }
        }
    }
}
