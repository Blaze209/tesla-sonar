package rk0;

import bl0.o;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import dl0.t;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p028zk0.Function1;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0003\u001a9\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\nH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\" \u0010\u0016\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lbl0/k;", "requestHeaders", "Lcl0/b;", "content", "Lkotlin/Function2;", "", "Ljn0/h0;", "block", "c", "(Lbl0/k;Lcl0/b;Lwn0/p;)V", "Lkotlin/coroutines/CoroutineContext;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", DateTokenConverter.CONVERTER_KEY, "()Z", "a", "Ljava/lang/String;", "getKTOR_DEFAULT_USER_AGENT", "()Ljava/lang/String;", "getKTOR_DEFAULT_USER_AGENT$annotations", "()V", "KTOR_DEFAULT_USER_AGENT", "", "Ljava/util/Set;", "DATE_HEADERS", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f108540a = "Ktor client";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f108541b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbl0/l;", "Ljn0/h0;", "a", "(Lbl0/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.l<bl0.l, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ bl0.k f108542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ cl0.b f108543d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(bl0.k kVar, cl0.b bVar) {
            super(1);
            this.f108542c = kVar;
            this.f108543d = bVar;
        }

        public final void a(bl0.l buildHeaders) {
            s.k(buildHeaders, "$this$buildHeaders");
            buildHeaders.e(this.f108542c);
            buildHeaders.e(this.f108543d.c());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(bl0.l lVar) {
            a(lVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", Action.KEY_ATTRIBUTE, "", "values", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements p<String, List<? extends String>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<String, String, h0> f108544c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super String, ? super String, h0> pVar) {
            super(2);
            this.f108544c = pVar;
        }

        public final void a(String key, List<String> values) {
            s.k(key, "key");
            s.k(values, "values");
            o oVar = o.f17654a;
            if (s.f(oVar.h(), key) || s.f(oVar.i(), key)) {
                return;
            }
            if (!l.f108541b.contains(key)) {
                this.f108544c.invoke(key, v.y0(values, s.f(oVar.j(), key) ? "; " : ",", null, null, 0, null, null, 62, null));
                return;
            }
            p<String, String, h0> pVar = this.f108544c;
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                pVar.invoke(key, (String) it.next());
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(String str, List<? extends String> list) {
            a(str, list);
            return h0.f84049a;
        }
    }

    static {
        o oVar = o.f17654a;
        f108541b = d1.i(oVar.k(), oVar.m(), oVar.p(), oVar.n(), oVar.o());
    }

    public static final Object b(Continuation<? super CoroutineContext> continuation) {
        CoroutineContext.Element element = continuation.getContext().get(i.INSTANCE);
        s.h(element);
        return ((i) element).getCallContext();
    }

    public static final void c(bl0.k requestHeaders, cl0.b content, p<? super String, ? super String, h0> block) {
        String string;
        String string2;
        s.k(requestHeaders, "requestHeaders");
        s.k(content, "content");
        s.k(block, "block");
        Function1.a(new a(requestHeaders, content)).d(new b(block));
        o oVar = o.f17654a;
        if (requestHeaders.get(oVar.s()) == null && content.c().get(oVar.s()) == null && d()) {
            block.invoke(oVar.s(), f108540a);
        }
        bl0.c contentType = content.getContentType();
        if ((contentType == null || (string = contentType.toString()) == null) && (string = content.c().get(oVar.i())) == null) {
            string = requestHeaders.get(oVar.i());
        }
        Long contentLength = content.getContentLength();
        if ((contentLength == null || (string2 = contentLength.toString()) == null) && (string2 = content.c().get(oVar.h())) == null) {
            string2 = requestHeaders.get(oVar.h());
        }
        if (string != null) {
            block.invoke(oVar.i(), string);
        }
        if (string2 != null) {
            block.invoke(oVar.h(), string2);
        }
    }

    private static final boolean d() {
        return !t.f60776a.a();
    }
}
