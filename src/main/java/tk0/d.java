package tk0;

import jn0.h0;
import org.slf4j.Logger;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lok0/b;", "Lkotlin/Function1;", "Ltk0/c$a;", "Ljn0/h0;", "block", "b", "(Lok0/b;Lwn0/l;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "a", "Lorg/slf4j/Logger;", "LOGGER", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f114673a = gl0.a.a("io.ktor.client.plugins.DefaultRequest");

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltk0/c$a;", "Ljn0/h0;", "a", "(Ltk0/c$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.l<c.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<c.a, h0> f114674c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.l<? super c.a, h0> lVar) {
            super(1);
            this.f114674c = lVar;
        }

        public final void a(c.a install) {
            p013kotlin.jvm.internal.s.k(install, "$this$install");
            this.f114674c.invoke(install);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(c.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public static final void b(ok0.b<?> bVar, wn0.l<? super c.a, h0> block) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        p013kotlin.jvm.internal.s.k(block, "block");
        bVar.h(c.f114664b, new a(block));
    }
}
