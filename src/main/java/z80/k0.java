package z80;

import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import java.util.Set;
import kotlinx.coroutines.flow.StateFlow;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR \u0010\u0010\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0004\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u0001\u001c¨\u0006\u001d"}, d2 = {"Lz80/k0;", "Li90/v1;", "Li90/l1;", "<init>", "()V", "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;", "cardScanSheetResult", "Ljn0/h0;", "x", "(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V", "Le3/m;", "a", "Le3/m;", "k", "()Le3/m;", "getAutofillType$annotations", "autofillType", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/model/h;", "u", "()Lkotlinx/coroutines/flow/StateFlow;", "cardBrandFlow", "w", "selectedCardBrandFlow", "", "v", "()Z", "cardScanEnabled", "Lz80/s0;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class k0 implements p010i90.v1, p010i90.l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e3.m autofillType;

    public /* synthetic */ k0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // p010i90.v1
    public StateFlow<String> d() {
        return i90.v1.a.c(this);
    }

    @Override // p010i90.v1, p010i90.i1
    public void g(boolean z11, p010i90.j1 j1Var, androidx.compose.ui.d dVar, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12, p020r2.l lVar, int i13) {
        i90.v1.a.a(this, z11, j1Var, dVar, set, identifierSpec, i11, i12, lVar, i13);
    }

    @Override // p010i90.v1
    /* JADX INFO: renamed from: k, reason: from getter */
    public e3.m getAutofillType() {
        return this.autofillType;
    }

    @Override // p010i90.v1
    public boolean s() {
        return i90.v1.a.b(this);
    }

    public abstract StateFlow<com.stripe.android.model.h> u();

    public abstract boolean v();

    public abstract StateFlow<com.stripe.android.model.h> w();

    public final void x(CardScanSheetResult cardScanSheetResult) {
        p013kotlin.jvm.internal.s.k(cardScanSheetResult, "cardScanSheetResult");
        if (cardScanSheetResult instanceof CardScanSheetResult.Completed) {
            t(((CardScanSheetResult.Completed) cardScanSheetResult).getScannedCard().getPan());
        }
    }

    private k0() {
        this.autofillType = e3.m.CreditCardNumber;
    }
}
