package uh0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import th0.w0;
import th0.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f116268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f116269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f116270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f116271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RecyclerView f116272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f116273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f116274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Button f116275h;

    private f(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull Button button, @NonNull TextView textView2, @NonNull Button button2) {
        this.f116268a = constraintLayout;
        this.f116269b = textView;
        this.f116270c = constraintLayout2;
        this.f116271d = pi2NavigationBar;
        this.f116272e = recyclerView;
        this.f116273f = button;
        this.f116274g = textView2;
        this.f116275h = button2;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i11 = w0.f114279e;
        TextView textView = (TextView) gb.b.a(view, i11);
        if (textView != null) {
            i11 = w0.f114291q;
            ConstraintLayout constraintLayout = (ConstraintLayout) gb.b.a(view, i11);
            if (constraintLayout != null) {
                i11 = w0.E;
                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) gb.b.a(view, i11);
                if (pi2NavigationBar != null) {
                    i11 = w0.O;
                    RecyclerView recyclerView = (RecyclerView) gb.b.a(view, i11);
                    if (recyclerView != null) {
                        i11 = w0.P;
                        Button button = (Button) gb.b.a(view, i11);
                        if (button != null) {
                            i11 = w0.Y;
                            TextView textView2 = (TextView) gb.b.a(view, i11);
                            if (textView2 != null) {
                                i11 = w0.f114276b0;
                                Button button2 = (Button) gb.b.a(view, i11);
                                if (button2 != null) {
                                    return new f((ConstraintLayout) view, textView, constraintLayout, pi2NavigationBar, recyclerView, button, textView2, button2);
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
        View viewInflate = layoutInflater.inflate(x0.f114318f, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f116268a;
    }
}
