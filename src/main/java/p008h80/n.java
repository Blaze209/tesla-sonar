package p008h80;

import com.stripe.android.model.h;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lh80/n;", "", "Lh80/m;", "viewAction", "Ljn0/h0;", "b", "(Lh80/m;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lh80/o;", "a", "()Lkotlinx/coroutines/flow/StateFlow;", "viewState", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface n {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lh80/n$a;", "", "a", "b", "Lh80/n$a$a;", "Lh80/n$a$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: h80.n$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh80/n$a$a;", "Lh80/n$a;", "Lcom/stripe/android/model/h;", "brand", "<init>", "(Lcom/stripe/android/model/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/model/h;", "()Lcom/stripe/android/model/h;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class HideBrands implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final h brand;

            public HideBrands(h hVar) {
                this.brand = hVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final h getBrand() {
                return this.brand;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HideBrands) && this.brand == ((HideBrands) other).brand;
            }

            public int hashCode() {
                h hVar = this.brand;
                if (hVar == null) {
                    return 0;
                }
                return hVar.hashCode();
            }

            public String toString() {
                return "HideBrands(brand=" + this.brand + ")";
            }
        }

        /* JADX INFO: renamed from: h80.n$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh80/n$a$b;", "Lh80/n$a;", "Lcom/stripe/android/model/h;", "brand", "<init>", "(Lcom/stripe/android/model/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/model/h;", "()Lcom/stripe/android/model/h;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowBrands implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final h brand;

            public ShowBrands(h brand) {
                s.k(brand, "brand");
                this.brand = brand;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final h getBrand() {
                return this.brand;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowBrands) && this.brand == ((ShowBrands) other).brand;
            }

            public int hashCode() {
                return this.brand.hashCode();
            }

            public String toString() {
                return "ShowBrands(brand=" + this.brand + ")";
            }
        }
    }

    StateFlow<EditPaymentMethodViewState> a();

    void b(m viewAction);
}
