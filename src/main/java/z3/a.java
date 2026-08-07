package z3;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B#\b\u0004\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R,\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0082\u0001\u0001\u000b¨\u0006\f"}, d2 = {"Lz3/a;", "", "Lkotlin/Function2;", "", "merger", "<init>", "(Lwn0/p;)V", "a", "Lwn0/p;", "()Lwn0/p;", "b", "Lz3/p;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<Integer, Integer, Integer> merger;

    public /* synthetic */ a(wn0.p pVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar);
    }

    public final wn0.p<Integer, Integer, Integer> a() {
        return this.merger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(wn0.p<? super Integer, ? super Integer, Integer> pVar) {
        this.merger = pVar;
    }
}
