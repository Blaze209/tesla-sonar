package tg0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import pg0.n4;
import pg0.o4;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f113469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Barrier f113470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f113471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f113472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f113473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f113474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RecyclerView f113475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f113476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f113477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f113478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f113479k;

    private f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull Barrier barrier, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f113469a = coordinatorLayout;
        this.f113470b = barrier;
        this.f113471c = constraintLayout;
        this.f113472d = imageView;
        this.f113473e = view;
        this.f113474f = pi2NavigationBar;
        this.f113475g = recyclerView;
        this.f113476h = textView;
        this.f113477i = textView2;
        this.f113478j = textView3;
        this.f113479k = textView4;
    }

    @NonNull
    public static f a(@NonNull View view) {
        View viewA;
        int i11 = n4.G;
        Barrier barrier = (Barrier) gb.b.a(view, i11);
        if (barrier != null) {
            i11 = n4.H;
            ConstraintLayout constraintLayout = (ConstraintLayout) gb.b.a(view, i11);
            if (constraintLayout != null) {
                i11 = n4.T;
                ImageView imageView = (ImageView) gb.b.a(view, i11);
                if (imageView != null && (viewA = gb.b.a(view, (i11 = n4.W))) != null) {
                    i11 = n4.Y;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) gb.b.a(view, i11);
                    if (pi2NavigationBar != null) {
                        i11 = n4.f102745q0;
                        RecyclerView recyclerView = (RecyclerView) gb.b.a(view, i11);
                        if (recyclerView != null) {
                            i11 = n4.f102761y0;
                            TextView textView = (TextView) gb.b.a(view, i11);
                            if (textView != null) {
                                i11 = n4.f102763z0;
                                TextView textView2 = (TextView) gb.b.a(view, i11);
                                if (textView2 != null) {
                                    i11 = n4.A0;
                                    TextView textView3 = (TextView) gb.b.a(view, i11);
                                    if (textView3 != null) {
                                        i11 = n4.B0;
                                        TextView textView4 = (TextView) gb.b.a(view, i11);
                                        if (textView4 != null) {
                                            return new f((CoordinatorLayout) view, barrier, constraintLayout, imageView, viewA, pi2NavigationBar, recyclerView, textView, textView2, textView3, textView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static f c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(o4.f102824f, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f113469a;
    }
}
