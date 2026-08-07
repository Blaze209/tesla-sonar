package jg0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import ig0.y2;
import ig0.z2;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f83706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f83707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f83708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f83709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Guideline f83710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f83711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RecyclerView f83712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Guideline f83713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Button f83714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f83715j;

    private c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull TextView textView2, @NonNull Guideline guideline2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull Guideline guideline3, @NonNull Button button, @NonNull TextView textView3) {
        this.f83706a = coordinatorLayout;
        this.f83707b = textView;
        this.f83708c = guideline;
        this.f83709d = textView2;
        this.f83710e = guideline2;
        this.f83711f = pi2NavigationBar;
        this.f83712g = recyclerView;
        this.f83713h = guideline3;
        this.f83714i = button;
        this.f83715j = textView3;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i11 = y2.f78046c;
        TextView textView = (TextView) gb.b.a(view, i11);
        if (textView != null) {
            i11 = y2.f78047d;
            Guideline guideline = (Guideline) gb.b.a(view, i11);
            if (guideline != null) {
                i11 = y2.f78050g;
                TextView textView2 = (TextView) gb.b.a(view, i11);
                if (textView2 != null) {
                    i11 = y2.f78054k;
                    Guideline guideline2 = (Guideline) gb.b.a(view, i11);
                    if (guideline2 != null) {
                        i11 = y2.f78056m;
                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) gb.b.a(view, i11);
                        if (pi2NavigationBar != null) {
                            i11 = y2.f78059p;
                            RecyclerView recyclerView = (RecyclerView) gb.b.a(view, i11);
                            if (recyclerView != null) {
                                i11 = y2.f78060q;
                                Guideline guideline3 = (Guideline) gb.b.a(view, i11);
                                if (guideline3 != null) {
                                    i11 = y2.f78061r;
                                    Button button = (Button) gb.b.a(view, i11);
                                    if (button != null) {
                                        i11 = y2.f78062s;
                                        TextView textView3 = (TextView) gb.b.a(view, i11);
                                        if (textView3 != null) {
                                            return new c((CoordinatorLayout) view, textView, guideline, textView2, guideline2, pi2NavigationBar, recyclerView, guideline3, button, textView3);
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
    public static c c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(z2.f78070b, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f83706a;
    }
}
