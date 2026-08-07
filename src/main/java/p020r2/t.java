package p020r2;

import androidx.collection.b0;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\u00020\u00072\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0011\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014\" \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lr2/f;", "applier", "Lr2/q;", "parent", "Lr2/p;", "a", "(Lr2/f;Lr2/q;)Lr2/p;", "Lr2/t2;", "b", "(Lr2/f;Lr2/q;)Lr2/t2;", "T", "", "", "Ljn0/h0;", "g", "(Ljava/util/List;II)V", "Landroidx/collection/b0;", "f", "(Landroidx/collection/b0;II)V", "", "Ljava/lang/Object;", "PendingApplyNoModifications", "Lr2/b0;", "Lr2/s;", "Lr2/b0;", "getCompositionImplServiceKey", "()Lr2/b0;", "CompositionImplServiceKey", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f106829a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b0<s> f106830b = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"r2/t$a", "Lr2/b0;", "Lr2/s;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements b0<s> {
        a() {
        }
    }

    public static final p a(f<?> fVar, q qVar) {
        return new s(qVar, fVar, null, 4, null);
    }

    public static final t2 b(f<?> fVar, q qVar) {
        return new s(qVar, fVar, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(b0 b0Var, int i11, int i12) {
        int iA = b0Var.a(i11);
        b0Var.m(i11, b0Var.a(i12));
        b0Var.m(i12, iA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void g(List<T> list, int i11, int i12) {
        T t11 = list.get(i11);
        list.set(i11, list.get(i12));
        list.set(i12, t11);
    }
}
