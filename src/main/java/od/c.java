package od;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lod/b;", "Lbe/d;", "a", "(Lod/b;)Lbe/d;", "await_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbe/d;", "Ljn0/h0;", "a", "(Lbe/d;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<be.d, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f97117c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.f97117c = bVar;
        }

        public final void a(be.d $receiver) {
            s.k($receiver, "$this$$receiver");
            $receiver.a(this.f97117c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(be.d dVar) {
            a(dVar);
            return h0.f84049a;
        }
    }

    public static final be.d a(b bVar) {
        s.k(bVar, "<this>");
        return new be.d(bVar.getCom.fourthline.analytics.internal.AnalyticsAttribute.Environment java.lang.String(), bVar.getClientKey(), bVar.getShopperLocale(), bVar.getAmount(), bVar.getAnalyticsConfiguration(), new a(bVar));
    }
}
