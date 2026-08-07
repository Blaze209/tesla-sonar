package o80;

import android.view.View;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import com.stripe.android.stripe3ds2.views.BrandZoneView;
import com.stripe.android.stripe3ds2.views.ChallengeZoneView;
import com.stripe.android.stripe3ds2.views.InformationZoneView;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ScrollView f96848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final BrandZoneView f96849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ChallengeZoneView f96850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final InformationZoneView f96851d;

    private c(@NonNull ScrollView scrollView, @NonNull BrandZoneView brandZoneView, @NonNull ChallengeZoneView challengeZoneView, @NonNull InformationZoneView informationZoneView) {
        this.f96848a = scrollView;
        this.f96849b = brandZoneView;
        this.f96850c = challengeZoneView;
        this.f96851d = informationZoneView;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i11 = n80.d.f93633b;
        BrandZoneView brandZoneView = (BrandZoneView) gb.b.a(view, i11);
        if (brandZoneView != null) {
            i11 = n80.d.f93634c;
            ChallengeZoneView challengeZoneView = (ChallengeZoneView) gb.b.a(view, i11);
            if (challengeZoneView != null) {
                i11 = n80.d.f93635d;
                InformationZoneView informationZoneView = (InformationZoneView) gb.b.a(view, i11);
                if (informationZoneView != null) {
                    return new c((ScrollView) view, brandZoneView, challengeZoneView, informationZoneView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f96848a;
    }
}
