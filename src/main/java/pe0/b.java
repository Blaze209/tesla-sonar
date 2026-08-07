package pe0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import me0.i;
import me0.j;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f102175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ContentLoadingProgressBar f102176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f102177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f102178d;

    private b(@NonNull ConstraintLayout constraintLayout, @NonNull ContentLoadingProgressBar contentLoadingProgressBar, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.f102175a = constraintLayout;
        this.f102176b = contentLoadingProgressBar;
        this.f102177c = recyclerView;
        this.f102178d = textView;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i11 = i.f91928g;
        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) gb.b.a(view, i11);
        if (contentLoadingProgressBar != null) {
            i11 = i.f91930h;
            RecyclerView recyclerView = (RecyclerView) gb.b.a(view, i11);
            if (recyclerView != null) {
                i11 = i.f91933k;
                TextView textView = (TextView) gb.b.a(view, i11);
                if (textView != null) {
                    return new b((ConstraintLayout) view, contentLoadingProgressBar, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(j.f91954f, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f102175a;
    }
}
