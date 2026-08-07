package x70;

import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: x70.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lx70/a;", "", "", "visible", "Lx70/a$a;", "buyButtonOverride", "<init>", "(ZLx70/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lx70/a$a;", "()Lx70/a$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BuyButtonState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean visible;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BuyButtonOverride buyButtonOverride;

    /* JADX INFO: renamed from: x70.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lx70/a$a;", "", "Lx30/c;", AnnotatedPrivateKey.LABEL, "", "lockEnabled", "<init>", "(Lx30/c;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lx30/c;", "()Lx30/c;", "b", "Z", "()Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuyButtonOverride {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean lockEnabled;

        public BuyButtonOverride(x30.c label, boolean z11) {
            s.k(label, "label");
            this.label = label;
            this.lockEnabled = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final x30.c getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getLockEnabled() {
            return this.lockEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BuyButtonOverride)) {
                return false;
            }
            BuyButtonOverride buyButtonOverride = (BuyButtonOverride) other;
            return s.f(this.label, buyButtonOverride.label) && this.lockEnabled == buyButtonOverride.lockEnabled;
        }

        public int hashCode() {
            return (this.label.hashCode() * 31) + Boolean.hashCode(this.lockEnabled);
        }

        public String toString() {
            return "BuyButtonOverride(label=" + this.label + ", lockEnabled=" + this.lockEnabled + ")";
        }
    }

    public BuyButtonState(boolean z11, BuyButtonOverride buyButtonOverride) {
        this.visible = z11;
        this.buyButtonOverride = buyButtonOverride;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BuyButtonOverride getBuyButtonOverride() {
        return this.buyButtonOverride;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyButtonState)) {
            return false;
        }
        BuyButtonState buyButtonState = (BuyButtonState) other;
        return this.visible == buyButtonState.visible && s.f(this.buyButtonOverride, buyButtonState.buyButtonOverride);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.visible) * 31;
        BuyButtonOverride buyButtonOverride = this.buyButtonOverride;
        return iHashCode + (buyButtonOverride == null ? 0 : buyButtonOverride.hashCode());
    }

    public String toString() {
        return "BuyButtonState(visible=" + this.visible + ", buyButtonOverride=" + this.buyButtonOverride + ")";
    }

    public /* synthetic */ BuyButtonState(boolean z11, BuyButtonOverride buyButtonOverride, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? null : buyButtonOverride);
    }
}
