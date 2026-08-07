package p025y1;

import a3.j;
import a3.l;
import bo0.n;
import ezvcard.property.Gender;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.p1;
import p020r2.s3;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Ly1/b;", "Ly1/c0;", "", "currentPage", "", "currentPageOffsetFraction", "Lkotlin/Function0;", "updatedPageCount", "<init>", "(IFLwn0/a;)V", "Lr2/p1;", "K", "Lr2/p1;", "n0", "()Lr2/p1;", "setPageCountState", "(Lr2/p1;)V", "pageCountState", Gender.FEMALE, "()I", "pageCount", "L", "c", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b extends c0 {

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final j<b, ?> M = a3.a.a(a.f124396c, C2686b.f124397c);

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private p1<wn0.a<Integer>> pageCountState;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La3/l;", "Ly1/b;", "it", "", "", "a", "(La3/l;Ly1/b;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<l, b, List<? extends Object>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f124396c = new a();

        a() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(l lVar, b bVar) {
            return v.p(Integer.valueOf(bVar.v()), Float.valueOf(n.m(bVar.w(), -0.5f, 0.5f)), Integer.valueOf(bVar.F()));
        }
    }

    /* JADX INFO: renamed from: y1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Ly1/b;", "a", "(Ljava/util/List;)Ly1/b;"}, k = 3, mv = {1, 8, 0})
    static final class C2686b extends u implements wn0.l<List, b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2686b f124397c = new C2686b();

        /* JADX INFO: renamed from: y1.b$b$a */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.a<Integer> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<Object> f124398c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List<? extends Object> list) {
                super(0);
                this.f124398c = list;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                Object obj = this.f124398c.get(2);
                s.i(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            }
        }

        C2686b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(List<? extends Object> list) {
            Object obj = list.get(0);
            s.i(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            s.i(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new b(iIntValue, ((Float) obj2).floatValue(), new a(list));
        }
    }

    /* JADX INFO: renamed from: y1.b$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly1/b$c;", "", "<init>", "()V", "La3/j;", "Ly1/b;", "Saver", "La3/j;", "a", "()La3/j;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j<b, ?> a() {
            return b.M;
        }

        private Companion() {
        }
    }

    public b(int i11, float f11, wn0.a<Integer> aVar) {
        super(i11, f11);
        this.pageCountState = s3.d(aVar, null, 2, null);
    }

    @Override // p025y1.c0
    public int F() {
        return this.pageCountState.getValue().invoke().intValue();
    }

    public final p1<wn0.a<Integer>> n0() {
        return this.pageCountState;
    }
}
