package com.stripe.android.view;

import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.PaymentMethodCreateParams;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\nB'\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/view/h;", "Lcom/stripe/android/view/i;", "Landroidx/fragment/app/u;", "activity", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroidx/fragment/app/u;Landroid/util/AttributeSet;I)V", "a", "Ljava/lang/Integer;", "selectedPosition", "Lcom/stripe/android/view/g;", "b", "Lcom/stripe/android/view/g;", "netbankingAdapter", "Lcom/stripe/android/model/w0;", "getCreateParams", "()Lcom/stripe/android/model/w0;", "createParams", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f54912d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Integer selectedPosition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g netbankingAdapter;

    /* JADX INFO: renamed from: com.stripe.android.view.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/h$a;", "", "<init>", "()V", "Landroidx/fragment/app/u;", "activity", "Lcom/stripe/android/view/h;", "a", "(Landroidx/fragment/app/u;)Lcom/stripe/android/view/h;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ h a(androidx.fragment.app.u activity) {
            p013kotlin.jvm.internal.s.k(activity, "activity");
            return new h(activity, null, 0, 6, null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<Integer, jn0.h0> {
        b() {
            super(1);
        }

        public final void a(int i11) {
            h.this.selectedPosition = Integer.valueOf(i11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Integer num) {
            a(num.intValue());
            return jn0.h0.f84049a;
        }
    }

    public /* synthetic */ h(androidx.fragment.app.u uVar, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(uVar, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // com.stripe.android.view.i
    public PaymentMethodCreateParams getCreateParams() {
        Integer numValueOf = Integer.valueOf(this.netbankingAdapter.getSelectedPosition());
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return PaymentMethodCreateParams.Companion.m(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.Netbanking(s1.getEntries().get(this.netbankingAdapter.getSelectedPosition()).getCode()), null, null, null, 14, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.fragment.app.u activity, AttributeSet attributeSet, int i11) {
        super(activity, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(activity, "activity");
        g gVar = new g(new x2(activity), s1.getEntries(), new b());
        this.netbankingAdapter = gVar;
        h40.h hVarC = h40.h.c(activity.getLayoutInflater(), this, true);
        p013kotlin.jvm.internal.s.j(hVarC, "inflate(...)");
        setId(f30.z.f64284t0);
        RecyclerView recyclerView = hVarC.f70692b;
        recyclerView.setAdapter(gVar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new androidx.recyclerview.widget.g());
        Integer num = this.selectedPosition;
        if (num != null) {
            gVar.g(num.intValue());
        }
    }
}
