package w80;

import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lw80/f;", "Lw80/o;", "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;", "cardScanSheet", "<init>", "(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;)V", "Ljn0/h0;", "a", "()V", "b", "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheet;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CardScanSheet cardScanSheet;

    public f(CardScanSheet cardScanSheet) {
        s.k(cardScanSheet, "cardScanSheet");
        this.cardScanSheet = cardScanSheet;
    }

    @Override // w80.o
    public void a() {
        this.cardScanSheet.present();
    }
}
