package r60;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import i4.Placeholder;
import i4.x;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.h0;
import kotlin.q;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import w4.w;
import wn0.p;
import z2.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Lr60/b;", "", "<init>", "()V", "", "id", "Lw4/v;", Snapshot.WIDTH, Snapshot.HEIGHT, "Li4/x;", "align", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Ljava/lang/String;JJILwn0/p;)Lr60/b;", "c", "(Ljava/lang/String;JI)Lr60/b;", "", "Lb2/q;", "e", "()Ljava/util/Map;", "", "Ljava/util/Map;", "inlineContent", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, q> inlineContent = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.q<String, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f107057c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super l, ? super Integer, h0> pVar) {
            super(3);
            this.f107057c = pVar;
        }

        public final void a(String it, l lVar, int i11) {
            s.k(it, "it");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-254047745, i11, -1, "com.stripe.android.link.utils.InlineContentTemplateBuilder.add.<anonymous> (InlineContentTemplateBuilder.kt:30)");
            }
            this.f107057c.invoke(lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(String str, l lVar, Integer num) {
            a(str, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static /* synthetic */ b b(b bVar, String str, long j11, long j12, int i11, p pVar, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = x.INSTANCE.c();
        }
        return bVar.a(str, j11, j12, i11, pVar);
    }

    public static /* synthetic */ b d(b bVar, String str, long j11, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = x.INSTANCE.c();
        }
        return bVar.c(str, j11, i11);
    }

    public final b a(String id2, long width, long height, int align, p<? super l, ? super Integer, h0> content) {
        s.k(id2, "id");
        s.k(content, "content");
        this.inlineContent.put(id2, new q(new Placeholder(width, height, align, null), c.c(-254047745, true, new a(content))));
        return this;
    }

    public final b c(String id2, long width, int align) {
        s.k(id2, "id");
        a(id2, width, w.e(0), align, r60.a.f107053a.a());
        return this;
    }

    public final Map<String, q> e() {
        return this.inlineContent;
    }
}
