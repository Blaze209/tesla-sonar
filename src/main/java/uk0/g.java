package uk0;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a<\u0010\u0007\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b*B\u0010\t\"\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lok0/b;", "Lkotlin/Function2;", "Lyk0/c;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "a", "(Lok0/b;Lwn0/p;)V", "ResponseHandler", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luk0/e$a;", "Ljn0/h0;", "a", "(Luk0/e$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<e.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<yk0.c, Continuation<? super h0>, Object> f116428c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super yk0.c, ? super Continuation<? super h0>, ? extends Object> pVar) {
            super(1);
            this.f116428c = pVar;
        }

        public final void a(e.a install) {
            s.k(install, "$this$install");
            install.c(this.f116428c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(e.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public static final void a(ok0.b<?> bVar, p<? super yk0.c, ? super Continuation<? super h0>, ? extends Object> block) {
        s.k(bVar, "<this>");
        s.k(block, "block");
        bVar.h(e.INSTANCE, new a(block));
    }
}
