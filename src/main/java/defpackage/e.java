package defpackage;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\u00052\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0005\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Le;", "Ljp0/b;", "<init>", "()V", "", "Lf;", "c", "(Ljava/lang/String;)Lf;", "", "", "count", "mode", "a", "(Ljava/lang/Object;ILf;)Ljava/lang/Object;", "Lkotlin/Function0;", "first", "last", "b", "(Lf;Lwn0/a;Lwn0/a;)Ljava/lang/Object;", "expression", "data", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements jp0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f61251a = new e();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements wn0.a<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f61252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f61253d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, int i11) {
            super(0);
            this.f61252c = obj;
            this.f61253d = i11;
        }

        @Override // wn0.a
        public final Object invoke() {
            return t.M1((String) this.f61252c, this.f61253d);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements wn0.a<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f61254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f61255d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, int i11) {
            super(0);
            this.f61254c = obj;
            this.f61255d = i11;
        }

        @Override // wn0.a
        public final Object invoke() {
            return t.N1((String) this.f61254c, this.f61255d);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends u implements wn0.a<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f61256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f61257d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj, int i11) {
            super(0);
            this.f61256c = obj;
            this.f61257d = i11;
        }

        @Override // wn0.a
        public final Object invoke() {
            return v.i0((Iterable) this.f61256c, this.f61257d);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends u implements wn0.a<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f61258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f61259d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, int i11) {
            super(0);
            this.f61258c = obj;
            this.f61259d = i11;
        }

        @Override // wn0.a
        public final Object invoke() {
            return v.j0((List) this.f61258c, this.f61259d);
        }
    }

    private e() {
    }

    private final Object a(Object obj, int i11, f fVar) {
        if (obj instanceof String) {
            return b(fVar, new a(obj, i11), new b(obj, i11));
        }
        if (obj instanceof List) {
            return b(fVar, new c(obj, i11), new d(obj, i11));
        }
        return null;
    }

    private final Object b(f mode, wn0.a<? extends Object> first, wn0.a<? extends Object> last) {
        if (s.f(mode, f.a.f63690a)) {
            return first.invoke();
        }
        if (s.f(mode, f.b.f63691a)) {
            return last.invoke();
        }
        if (s.f(mode, f.c.f63692a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final f c(String str) {
        if (s.f(str, "first")) {
            return f.a.f63690a;
        }
        return s.f(str, "last") ? f.b.f63691a : f.c.f63692a;
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        List<Object> listC = yr0.a.c(expression);
        Object objQ0 = v.q0(listC);
        Object objB = yr0.c.b(listC);
        e eVar = f61251a;
        Object objC = yr0.c.c(listC);
        f fVarC = eVar.c(objC instanceof String ? (String) objC : null);
        Integer num = objB instanceof Integer ? (Integer) objB : null;
        if (num != null) {
            return eVar.a(objQ0, num.intValue(), fVarC);
        }
        return null;
    }
}
