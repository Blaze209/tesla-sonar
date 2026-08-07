package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC4419g;
import p013kotlin.Metadata;
import r80.Stripe3ds2ErrorReporterConfig;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeProgressFragment;", "Landroidx/fragment/app/Fragment;", "", "directoryServerName", "Lt80/q;", "sdkTransactionId", "", "accentColor", "<init>", "(Ljava/lang/String;Lt80/q;Ljava/lang/Integer;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Ljn0/h0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "m", "Ljava/lang/String;", "n", "Lt80/q;", "o", "Ljava/lang/Integer;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChallengeProgressFragment extends Fragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String directoryServerName;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final t80.q sdkTransactionId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Integer accentColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeProgressFragment(String directoryServerName, t80.q sdkTransactionId, Integer num) {
        super(n80.e.f93668k);
        p013kotlin.jvm.internal.s.k(directoryServerName, "directoryServerName");
        p013kotlin.jvm.internal.s.k(sdkTransactionId, "sdkTransactionId");
        this.directoryServerName = directoryServerName;
        this.sdkTransactionId = sdkTransactionId;
        this.accentColor = num;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        p013kotlin.jvm.internal.s.k(view, "view");
        super.onViewCreated(view, savedInstanceState);
        o80.k kVarA = o80.k.a(view);
        p013kotlin.jvm.internal.s.j(kVarA, "bind(...)");
        Context contextRequireContext = requireContext();
        p013kotlin.jvm.internal.s.j(contextRequireContext, "requireContext(...)");
        b bVarA = b.INSTANCE.a(this.directoryServerName, new r80.a(contextRequireContext, new Stripe3ds2ErrorReporterConfig(this.sdkTransactionId), null, null, null, null, null, 0, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        ImageView imageView = kVarA.f96885b;
        androidx.fragment.app.u activity = getActivity();
        imageView.setImageDrawable(activity != null ? androidx.core.content.b.getDrawable(activity, bVarA.getDrawableResId()) : null);
        Integer nameResId = bVarA.getNameResId();
        imageView.setContentDescription(nameResId != null ? getString(nameResId.intValue()) : null);
        if (bVarA.getShouldStretch()) {
            p013kotlin.jvm.internal.s.h(imageView);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = -2;
            layoutParams.height = -2;
            imageView.setLayoutParams(layoutParams);
        }
        p013kotlin.jvm.internal.s.h(imageView);
        imageView.setVisibility(0);
        Integer num = this.accentColor;
        if (num != null) {
            kVarA.f96886c.setIndicatorColor(num.intValue());
        }
    }
}
