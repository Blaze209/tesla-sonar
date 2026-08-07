package w1;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p024x1.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ]\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00042\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0004H\u0017¢\u0006\u0004\b\u0015\u0010\u0014R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lw1/j;", "Lx1/o;", "Lw1/i;", "Lw1/x;", "Lkotlin/Function1;", "Ljn0/h0;", "content", "<init>", "(Lwn0/l;)V", "", "count", "", Action.KEY_ATTRIBUTE, CMSAttributeTableGenerator.CONTENT_TYPE, "Lkotlin/Function2;", "Lw1/c;", "itemContent", DateTokenConverter.CONVERTER_KEY, "(ILwn0/l;Lwn0/l;Lwn0/r;)V", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lwn0/q;)V", "f", "Lx1/j0;", "a", "Lx1/j0;", "l", "()Lx1/j0;", "intervals", "", "Ljava/util/List;", "_headerIndexes", "", "k", "()Ljava/util/List;", "headerIndexes", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j extends p024x1.o<i> implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j0<i> intervals = new j0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<Integer> _headerIndexes;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Integer, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f120351c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj) {
            super(1);
            this.f120351c = obj;
        }

        public final Object a(int i11) {
            return this.f120351c;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<Integer, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f120352c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj) {
            super(1);
            this.f120352c = obj;
        }

        public final Object a(int i11) {
            return this.f120352c;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw1/c;", "", "it", "Ljn0/h0;", "a", "(Lw1/c;ILr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.r<w1.c, Integer, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.q<w1.c, p020r2.l, Integer, h0> f120353c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.q<? super w1.c, ? super p020r2.l, ? super Integer, h0> qVar) {
            super(4);
            this.f120353c = qVar;
        }

        public final void a(w1.c cVar, int i11, p020r2.l lVar, int i12) {
            if ((i12 & 6) == 0) {
                i12 |= lVar.n(cVar) ? 4 : 2;
            }
            if ((i12 & 131) == 130 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1010194746, i12, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)");
            }
            this.f120353c.invoke(cVar, lVar, Integer.valueOf(i12 & 14));
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ h0 invoke(w1.c cVar, Integer num, p020r2.l lVar, Integer num2) {
            a(cVar, num.intValue(), lVar, num2.intValue());
            return h0.f84049a;
        }
    }

    public j(wn0.l<? super x, h0> lVar) {
        lVar.invoke(this);
    }

    @Override // w1.x
    public void b(Object key, Object contentType, wn0.q<? super w1.c, ? super p020r2.l, ? super Integer, h0> content) {
        h().b(1, new i(key != null ? new a(key) : null, new b(contentType), z2.c.c(-1010194746, true, new c(content))));
    }

    @Override // w1.x
    public void d(int count, wn0.l<? super Integer, ? extends Object> key, wn0.l<? super Integer, ? extends Object> contentType, wn0.r<? super w1.c, ? super Integer, ? super p020r2.l, ? super Integer, h0> itemContent) {
        h().b(count, new i(key, contentType, itemContent));
    }

    @Override // w1.x
    public void f(Object key, Object contentType, wn0.q<? super w1.c, ? super p020r2.l, ? super Integer, h0> content) {
        List arrayList = this._headerIndexes;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this._headerIndexes = arrayList;
        }
        arrayList.add(Integer.valueOf(h().getSize()));
        b(key, contentType, content);
    }

    public final List<Integer> k() {
        List<Integer> list = this._headerIndexes;
        return list == null ? p013kotlin.collections.v.m() : list;
    }

    @Override // p024x1.o
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public j0<i> h() {
        return this.intervals;
    }
}
