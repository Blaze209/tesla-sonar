package o50;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p011ja.k;
import p011ja.p;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import wn0.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\f\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u000e\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"", "", "params", "a", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "Lja/u;", "Lo50/b;", "destination", "", "Lja/p;", "deepLinks", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lja/u;Lo50/b;Ljava/util/List;)V", "b", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv1/i;", "Lja/k;", "it", "Ljn0/h0;", "a", "(Lv1/i;Lja/k;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements r<v1.i, k, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o50.b f96766c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o50.b bVar) {
            super(4);
            this.f96766c = bVar;
        }

        public final void a(v1.i bottomSheet, k it, l lVar, int i11) {
            s.k(bottomSheet, "$this$bottomSheet");
            s.k(it, "it");
            if (o.J()) {
                o.S(2065068697, i11, -1, "com.stripe.android.financialconnections.navigation.bottomSheet.<anonymous> (Destination.kt:285)");
            }
            this.f96766c.a(it, lVar, 72);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ h0 invoke(v1.i iVar, k kVar, l lVar, Integer num) {
            a(iVar, kVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo1/b;", "Lja/k;", "it", "Ljn0/h0;", "a", "(Lo1/b;Lja/k;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements r<p015o1.b, k, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o50.b f96767c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o50.b bVar) {
            super(4);
            this.f96767c = bVar;
        }

        public final void a(p015o1.b composable, k it, l lVar, int i11) {
            s.k(composable, "$this$composable");
            s.k(it, "it");
            if (o.J()) {
                o.S(640605875, i11, -1, "com.stripe.android.financialconnections.navigation.composable.<anonymous> (Destination.kt:273)");
            }
            this.f96767c.a(it, lVar, 72);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ h0 invoke(p015o1.b bVar, k kVar, l lVar, Integer num) {
            a(bVar, kVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final String a(String str, Map<String, String> params) {
        s.k(str, "<this>");
        s.k(params, "params");
        if (params.isEmpty()) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                builderBuildUpon.appendQueryParameter(key, value);
            }
        }
        String string = builderBuildUpon.build().toString();
        s.j(string, "toString(...)");
        return string;
    }

    public static final void b(p011ja.u uVar, o50.b destination, List<p> deepLinks) {
        s.k(uVar, "<this>");
        s.k(destination, "destination");
        s.k(deepLinks, "deepLinks");
        p50.e.a(uVar, destination.g(), destination.e(), deepLinks, z2.c.c(2065068697, true, new a(destination)));
    }

    public static /* synthetic */ void c(p011ja.u uVar, o50.b bVar, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = v.m();
        }
        b(uVar, bVar, list);
    }

    public static final void d(p011ja.u uVar, o50.b destination, List<p> deepLinks) {
        s.k(uVar, "<this>");
        s.k(destination, "destination");
        s.k(deepLinks, "deepLinks");
        ka.k.d(uVar, destination.g(), destination.e(), deepLinks, null, null, null, null, z2.c.c(640605875, true, new b(destination)), 120, null);
    }

    public static /* synthetic */ void e(p011ja.u uVar, o50.b bVar, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = v.m();
        }
        d(uVar, bVar, list);
    }
}
