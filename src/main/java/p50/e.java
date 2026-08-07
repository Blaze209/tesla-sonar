package p50;

import android.annotation.SuppressLint;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import p011ja.k;
import p011ja.p;
import p011ja.u;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p020r2.l;
import v1.i;
import wn0.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\r\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lja/u;", "", PlaceTypes.ROUTE, "", "Lja/e;", "arguments", "Lja/p;", "deepLinks", "Lkotlin/Function2;", "Lv1/i;", "Lja/k;", "Ljn0/h0;", "content", "a", "(Lja/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lwn0/r;)V", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class e {
    @SuppressLint({"NewApi"})
    public static final void a(u uVar, String route, List<p011ja.e> arguments, List<p> deepLinks, r<? super i, ? super k, ? super l, ? super Integer, h0> content) {
        s.k(uVar, "<this>");
        s.k(route, "route");
        s.k(arguments, "arguments");
        s.k(deepLinks, "deepLinks");
        s.k(content, "content");
        b.a aVar = new b.a((b) uVar.getProvider().d(b.class), content);
        aVar.y(route);
        for (p011ja.e eVar : arguments) {
            aVar.d(eVar.getName(), eVar.getArgument());
        }
        Iterator<T> it = deepLinks.iterator();
        while (it.hasNext()) {
            aVar.e((p) it.next());
        }
        uVar.f(aVar);
    }
}
