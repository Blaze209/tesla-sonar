package a3;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.jvm.internal.u0;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aa\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00022\u001a\u0010\u0007\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Original", "Saveable", "Lkotlin/Function2;", "La3/l;", "", "save", "Lkotlin/Function1;", "restore", "La3/j;", "", "a", "(Lwn0/p;Lwn0/l;)La3/j;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: Add missing generic type declarations: [Original] */
    /* JADX INFO: renamed from: a3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Original", "Saveable", "La3/l;", "it", "", "a", "(La3/l;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class C0005a<Original> extends u implements p<l, Original, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Original, List<Saveable>> f56c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0005a(p<? super l, ? super Original, ? extends List<? extends Saveable>> pVar) {
            super(2);
            this.f56c = pVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l lVar, Original original) {
            List list = (List) this.f56c.invoke(lVar, original);
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = list.get(i11);
                if (obj != null && !lVar.a(obj)) {
                    throw new IllegalArgumentException("item can't be saved");
                }
            }
            List list2 = list;
            if (list2.isEmpty()) {
                return null;
            }
            return new ArrayList(list2);
        }
    }

    public static final <Original, Saveable> j<Original, Object> a(p<? super l, ? super Original, ? extends List<? extends Saveable>> pVar, wn0.l<? super List<? extends Saveable>, ? extends Original> lVar) {
        C0005a c0005a = new C0005a(pVar);
        s.i(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return k.a(c0005a, (wn0.l) u0.g(lVar, 1));
    }
}
