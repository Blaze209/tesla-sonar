package ld0;

import java.util.List;
import kd0.e;
import kd0.g;
import nc0.l;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a!\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003¨\u0006\n"}, d2 = {"Lnc0/l;", "Ljn0/h0;", "b", "(Lnc0/l;)V", "", "Lkd0/a;", "attributes", "c", "(Lnc0/l;Ljava/util/List;)V", "a", "monitoring_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {
    public static final void a(l lVar) {
        s.k(lVar, "<this>");
        g.INSTANCE.a().e(lVar);
    }

    public static final void b(l lVar) {
        s.k(lVar, "<this>");
        e.b.b(g.INSTANCE.a(), lVar, null, 2, null);
    }

    public static final void c(l lVar, List<kd0.a> attributes) {
        s.k(lVar, "<this>");
        s.k(attributes, "attributes");
        e.b.d(g.INSTANCE.a(), lVar, attributes, null, 4, null);
    }

    public static /* synthetic */ void d(l lVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = v.m();
        }
        c(lVar, list);
    }
}
