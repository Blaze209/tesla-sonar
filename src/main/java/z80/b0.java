package z80;

import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lz80/b0;", "", "a", "b", "Lz80/b0$a;", "Lz80/b0$b;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b0 {

    /* JADX INFO: renamed from: z80.b0$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lz80/b0$a;", "Lz80/b0;", "", "Lcom/stripe/android/model/h;", "preferredBrands", "initialBrand", "<init>", "(Ljava/util/List;Lcom/stripe/android/model/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/stripe/android/model/h;", "()Lcom/stripe/android/model/h;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Eligible implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<com.stripe.android.model.h> preferredBrands;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.model.h initialBrand;

        /* JADX WARN: Multi-variable type inference failed */
        public Eligible(List<? extends com.stripe.android.model.h> preferredBrands, com.stripe.android.model.h hVar) {
            p013kotlin.jvm.internal.s.k(preferredBrands, "preferredBrands");
            this.preferredBrands = preferredBrands;
            this.initialBrand = hVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final com.stripe.android.model.h getInitialBrand() {
            return this.initialBrand;
        }

        public final List<com.stripe.android.model.h> b() {
            return this.preferredBrands;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Eligible)) {
                return false;
            }
            Eligible eligible = (Eligible) other;
            return p013kotlin.jvm.internal.s.f(this.preferredBrands, eligible.preferredBrands) && this.initialBrand == eligible.initialBrand;
        }

        public int hashCode() {
            int iHashCode = this.preferredBrands.hashCode() * 31;
            com.stripe.android.model.h hVar = this.initialBrand;
            return iHashCode + (hVar == null ? 0 : hVar.hashCode());
        }

        public String toString() {
            return "Eligible(preferredBrands=" + this.preferredBrands + ", initialBrand=" + this.initialBrand + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz80/b0$b;", "Lz80/b0;", "<init>", "()V", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f127364a = new b();

        private b() {
        }
    }
}
