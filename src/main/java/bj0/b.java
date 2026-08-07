package bj0;

import aj0.m1;
import aj0.n1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.steps.ui.view.SignatureView;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f17495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f17496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f17497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f17498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Flow f17499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f17500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f17501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final SignatureView f17502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f17503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f17504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f17505k;

    private b(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull Button button, @NonNull ImageView imageView, @NonNull Flow flow, @NonNull Button button2, @NonNull View view, @NonNull SignatureView signatureView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout) {
        this.f17495a = frameLayout;
        this.f17496b = frameLayout2;
        this.f17497c = button;
        this.f17498d = imageView;
        this.f17499e = flow;
        this.f17500f = button2;
        this.f17501g = view;
        this.f17502h = signatureView;
        this.f17503i = textView;
        this.f17504j = textView2;
        this.f17505k = constraintLayout;
    }

    @NonNull
    public static b a(@NonNull View view) {
        View viewA;
        int i11 = m1.f1477a;
        FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
        if (frameLayout != null) {
            i11 = m1.f1478b;
            Button button = (Button) gb.b.a(view, i11);
            if (button != null) {
                i11 = m1.f1479c;
                ImageView imageView = (ImageView) gb.b.a(view, i11);
                if (imageView != null) {
                    i11 = m1.f1481e;
                    Flow flow = (Flow) gb.b.a(view, i11);
                    if (flow != null) {
                        i11 = m1.f1492p;
                        Button button2 = (Button) gb.b.a(view, i11);
                        if (button2 != null && (viewA = gb.b.a(view, (i11 = m1.f1493q))) != null) {
                            i11 = m1.f1494r;
                            SignatureView signatureView = (SignatureView) gb.b.a(view, i11);
                            if (signatureView != null) {
                                i11 = m1.f1495s;
                                TextView textView = (TextView) gb.b.a(view, i11);
                                if (textView != null) {
                                    i11 = m1.f1496t;
                                    TextView textView2 = (TextView) gb.b.a(view, i11);
                                    if (textView2 != null) {
                                        i11 = m1.f1497u;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) gb.b.a(view, i11);
                                        if (constraintLayout != null) {
                                            return new b((FrameLayout) view, frameLayout, button, imageView, flow, button2, viewA, signatureView, textView, textView2, constraintLayout);
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
    public static b c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(n1.f1516b, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f17495a;
    }
}
