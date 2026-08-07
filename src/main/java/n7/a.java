package n7;

import androidx.p003lifecycle.f1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.h2;
import p020r2.l;
import p020r2.o;
import p020r2.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ln7/a;", "", "<init>", "()V", "Landroidx/lifecycle/f1;", "viewModelStoreOwner", "Lr2/h2;", "b", "(Landroidx/lifecycle/f1;)Lr2/h2;", "Lr2/g2;", "Lr2/g2;", "LocalViewModelStoreOwner", "a", "(Lr2/l;I)Landroidx/lifecycle/f1;", "current", "lifecycle-viewmodel-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f93383a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g2<f1> LocalViewModelStoreOwner = w.d(null, C1993a.f93386c, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f93385c = 0;

    /* JADX INFO: renamed from: n7.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/f1;", "b", "()Landroidx/lifecycle/f1;"}, k = 3, mv = {1, 8, 0})
    static final class C1993a extends u implements wn0.a<f1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1993a f93386c = new C1993a();

        C1993a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f1 invoke() {
            return null;
        }
    }

    private a() {
    }

    public final f1 a(l lVar, int i11) {
        lVar.H(-584162872);
        if (o.J()) {
            o.S(-584162872, i11, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:38)");
        }
        f1 f1VarA = (f1) lVar.U(LocalViewModelStoreOwner);
        if (f1VarA == null) {
            f1VarA = b.a(lVar, 0);
        }
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return f1VarA;
    }

    public final h2<f1> b(f1 viewModelStoreOwner) {
        s.k(viewModelStoreOwner, "viewModelStoreOwner");
        return LocalViewModelStoreOwner.d(viewModelStoreOwner);
    }
}
