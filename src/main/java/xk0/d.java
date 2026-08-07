package xk0;

import bl0.j;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jn0.h0;
import ll0.k;
import ll0.o;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "Lxk0/e;", "values", "", "Lcl0/c;", "b", "([Lxk0/e;)Ljava/util/List;", "Lkotlin/Function1;", "Lxk0/b;", "Ljn0/h0;", "block", "a", "(Lwn0/l;)Ljava/util/List;", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: xk0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lll0/o;", "b", "()Lll0/o;"}, k = 3, mv = {1, 8, 0})
    static final class C2678d extends u implements wn0.a<o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f123638c;

        /* JADX INFO: renamed from: xk0.d$d$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/nio/ByteBuffer;", "it", "Ljn0/h0;", "a", "(Ljava/nio/ByteBuffer;)V"}, k = 3, mv = {1, 8, 0})
        public static final class a extends u implements l<ByteBuffer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ byte[] f123639c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(byte[] bArr) {
                super(1);
                this.f123639c = bArr;
            }

            public final void a(ByteBuffer it) {
                s.k(it, "it");
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(ByteBuffer byteBuffer) {
                a(byteBuffer);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2678d(Object obj) {
            super(0);
            this.f123638c = obj;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            byte[] bArr = (byte[]) this.f123638c;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, bArr.length);
            s.j(byteBufferWrap, "wrap(array, offset, length)");
            return ll0.l.a(byteBufferWrap, new a(bArr));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lll0/o;", "b", "()Lll0/o;"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.a<o> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f123641c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Object obj) {
            super(0);
            this.f123641c = obj;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return ((k) this.f123641c).M1();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class g extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f123642c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Object obj) {
            super(0);
            this.f123642c = obj;
        }

        public final void b() {
            ((k) this.f123642c).close();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    public static final List<cl0.c> a(l<? super xk0.b, h0> block) {
        s.k(block, "block");
        xk0.b bVar = new xk0.b();
        block.invoke(bVar);
        FormPart[] formPartArr = (FormPart[]) bVar.b().toArray(new FormPart[0]);
        return b((FormPart[]) Arrays.copyOf(formPartArr, formPartArr.length));
    }

    public static final List<cl0.c> b(FormPart<?>... values) {
        cl0.c aVar;
        s.k(values, "values");
        ArrayList arrayList = new ArrayList();
        for (FormPart<?> formPart : values) {
            String key = formPart.getKey();
            Object objB = formPart.b();
            bl0.k headers = formPart.getHeaders();
            bl0.l lVar = new bl0.l(0, 1, null);
            bl0.o oVar = bl0.o.f17654a;
            lVar.f(oVar.f(), "form-data; name=" + j.b(key));
            lVar.e(headers);
            if (objB instanceof String) {
                aVar = new cl0.c.d((String) objB, a.f123635c, lVar.n());
            } else if (objB instanceof Number) {
                aVar = new cl0.c.d(objB.toString(), b.f123636c, lVar.n());
            } else if (objB instanceof Boolean) {
                aVar = new cl0.c.d(objB.toString(), c.f123637c, lVar.n());
            } else if (objB instanceof byte[]) {
                lVar.f(oVar.h(), String.valueOf(((byte[]) objB).length));
                aVar = new cl0.c.b(new C2678d(objB), e.f123640c, lVar.n());
            } else if (objB instanceof k) {
                lVar.f(oVar.h(), String.valueOf(((k) objB).J0()));
                aVar = new cl0.c.b(new f(objB), new g(objB), lVar.n());
            } else if (objB instanceof xk0.f) {
                xk0.f fVar = (xk0.f) objB;
                Long lB = fVar.b();
                if (lB != null) {
                    lVar.f(oVar.h(), lB.toString());
                }
                aVar = new cl0.c.b(fVar.a(), h.f123643c, lVar.n());
            } else {
                if (!(objB instanceof xk0.a)) {
                    if (!(objB instanceof o)) {
                        throw new IllegalStateException(("Unknown form content type: " + objB).toString());
                    }
                    throw new IllegalStateException(("Can't use [Input] as part of form: " + objB + ". Consider using [InputProvider] instead.").toString());
                }
                xk0.a aVar2 = (xk0.a) objB;
                Long lB2 = aVar2.b();
                if (lB2 != null) {
                    lVar.f(oVar.h(), lB2.toString());
                }
                aVar = new cl0.c.a(aVar2.a(), lVar.n());
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f123635c = new a();

        a() {
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f123636c = new b();

        b() {
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f123637c = new c();

        c() {
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f123640c = new e();

        e() {
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class h extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f123643c = new h();

        h() {
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
