package xa;

import android.view.View;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Lxa/d;", "owner", "Ljn0/h0;", "b", "(Landroid/view/View;Lxa/d;)V", "a", "(Landroid/view/View;)Lxa/d;", "savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "view", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<View, View> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f123140c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            s.k(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lxa/d;", "a", "(Landroid/view/View;)Lxa/d;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<View, d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f123141c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(View view) {
            s.k(view, "view");
            Object tag = view.getTag(xa.a.f123134a);
            if (tag instanceof d) {
                return (d) tag;
            }
            return null;
        }
    }

    public static final d a(View view) {
        s.k(view, "<this>");
        return (d) ho0.l.M(ho0.l.V(ho0.l.q(view, a.f123140c), b.f123141c));
    }

    public static final void b(View view, d dVar) {
        s.k(view, "<this>");
        view.setTag(xa.a.f123134a, dVar);
    }
}
