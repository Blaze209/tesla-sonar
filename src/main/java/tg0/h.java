package tg0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import pg0.n4;
import pg0.o4;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f113504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f113505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f113506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f113507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f113508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f113509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final CardView f113510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f113511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f113512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ButtonWithLoadingIndicator f113513j;

    private h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull Button button, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull CardView cardView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView3, @NonNull ButtonWithLoadingIndicator buttonWithLoadingIndicator) {
        this.f113504a = coordinatorLayout;
        this.f113505b = textView;
        this.f113506c = button;
        this.f113507d = imageView;
        this.f113508e = textView2;
        this.f113509f = imageView2;
        this.f113510g = cardView;
        this.f113511h = pi2NavigationBar;
        this.f113512i = textView3;
        this.f113513j = buttonWithLoadingIndicator;
    }

    @NonNull
    public static h a(@NonNull View view) {
        int i11 = n4.f102718d;
        TextView textView = (TextView) gb.b.a(view, i11);
        if (textView != null) {
            i11 = n4.f102746r;
            Button button = (Button) gb.b.a(view, i11);
            if (button != null) {
                i11 = n4.B;
                ImageView imageView = (ImageView) gb.b.a(view, i11);
                if (imageView != null) {
                    i11 = n4.C;
                    TextView textView2 = (TextView) gb.b.a(view, i11);
                    if (textView2 != null) {
                        i11 = n4.R;
                        ImageView imageView2 = (ImageView) gb.b.a(view, i11);
                        if (imageView2 != null) {
                            i11 = n4.S;
                            CardView cardView = (CardView) gb.b.a(view, i11);
                            if (cardView != null) {
                                i11 = n4.Y;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) gb.b.a(view, i11);
                                if (pi2NavigationBar != null) {
                                    i11 = n4.D0;
                                    TextView textView3 = (TextView) gb.b.a(view, i11);
                                    if (textView3 != null) {
                                        i11 = n4.G0;
                                        ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) gb.b.a(view, i11);
                                        if (buttonWithLoadingIndicator != null) {
                                            return new h((CoordinatorLayout) view, textView, button, imageView, textView2, imageView2, cardView, pi2NavigationBar, textView3, buttonWithLoadingIndicator);
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
    public static h c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(o4.f102827i, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f113504a;
    }
}
