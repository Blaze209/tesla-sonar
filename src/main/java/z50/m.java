package z50;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Iterator;
import java.util.List;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R2\u0010\u0010\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lz50/m;", "", "<init>", "()V", "", InquiryField.StringField.TYPE, "a", "(Ljava/lang/String;)Ljava/lang/String;", "", "Lkotlin/Pair;", "Lkotlin/text/q;", "Lkotlin/Function1;", "Lkotlin/text/m;", "", "b", "Ljava/util/List;", "markDownToHtmlRegex", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f127010a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<Pair<p013kotlin.text.q, wn0.l<p013kotlin.text.m, CharSequence>>> markDownToHtmlRegex = v.p(x.a(new p013kotlin.text.q("\\*\\*(.*?)\\*\\*"), a.f127013c), x.a(new p013kotlin.text.q("__([^_]+)__"), b.f127014c), x.a(new p013kotlin.text.q("\\[([^]]+)]\\(([^)]+)\\)"), c.f127015c));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f127012c = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/m;", "it", "", "a", "(Lkotlin/text/m;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.l<p013kotlin.text.m, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f127013c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(p013kotlin.text.m it) {
            s.k(it, "it");
            return "<b>" + ((Object) it.c().get(1)) + "</b>";
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/m;", "it", "", "a", "(Lkotlin/text/m;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.l<p013kotlin.text.m, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f127014c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(p013kotlin.text.m it) {
            s.k(it, "it");
            return "<b>" + ((Object) it.c().get(1)) + "</b>";
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/m;", "it", "", "a", "(Lkotlin/text/m;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.l<p013kotlin.text.m, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f127015c = new c();

        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(p013kotlin.text.m it) {
            s.k(it, "it");
            return "<a href=\"" + ((Object) it.c().get(2)) + "\">" + ((Object) it.c().get(1)) + "</a>";
        }
    }

    private m() {
    }

    public final String a(String string) {
        s.k(string, "string");
        Iterator<T> it = markDownToHtmlRegex.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            string = ((p013kotlin.text.q) pair.a()).k(string, (wn0.l) pair.b());
        }
        return string;
    }
}
