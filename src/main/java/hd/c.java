package hd;

import be.d;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbe/d;", "Lhd/b;", "a", "(Lbe/d;)Lhd/b;", "b", "(Lhd/b;)Lbe/d;", "3ds2_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbe/d;", "Ljn0/h0;", "a", "(Lbe/d;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<d, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f72560c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.f72560c = bVar;
        }

        public final void a(d $receiver) {
            s.k($receiver, "$this$$receiver");
            $receiver.a(this.f72560c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(d dVar) {
            a(dVar);
            return h0.f84049a;
        }
    }

    public static final b a(d dVar) {
        s.k(dVar, "<this>");
        return (b) dVar.c(b.class);
    }

    public static final d b(b bVar) {
        s.k(bVar, "<this>");
        return new d(bVar.getCom.fourthline.analytics.internal.AnalyticsAttribute.Environment java.lang.String(), bVar.getClientKey(), bVar.getShopperLocale(), bVar.getAmount(), bVar.getAnalyticsConfiguration(), new a(bVar));
    }
}
