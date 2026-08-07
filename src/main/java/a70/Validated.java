package a70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.Source;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: a70.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001BG\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001c\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\u001d\u0010\u000f¨\u0006\""}, d2 = {"La70/d;", "", "", "clientSecret", "", "flowOutcome", "", "canCancelSource", "sourceId", "Lcom/stripe/android/model/Source;", "source", "stripeAccountId", "<init>", "(Ljava/lang/String;IZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "e", "Lcom/stripe/android/model/Source;", "getSource$payments_core_release", "()Lcom/stripe/android/model/Source;", "f", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Validated {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientSecret;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int flowOutcome;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canCancelSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sourceId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Source source;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String stripeAccountId;

    public Validated(String clientSecret, int i11, boolean z11, String str, Source source, String str2) {
        s.k(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        this.flowOutcome = i11;
        this.canCancelSource = z11;
        this.sourceId = str;
        this.source = source;
        this.stripeAccountId = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCanCancelSource() {
        return this.canCancelSource;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFlowOutcome() {
        return this.flowOutcome;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Validated)) {
            return false;
        }
        Validated validated = (Validated) other;
        return s.f(this.clientSecret, validated.clientSecret) && this.flowOutcome == validated.flowOutcome && this.canCancelSource == validated.canCancelSource && s.f(this.sourceId, validated.sourceId) && s.f(this.source, validated.source) && s.f(this.stripeAccountId, validated.stripeAccountId);
    }

    public int hashCode() {
        int iHashCode = ((((this.clientSecret.hashCode() * 31) + Integer.hashCode(this.flowOutcome)) * 31) + Boolean.hashCode(this.canCancelSource)) * 31;
        String str = this.sourceId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Source source = this.source;
        int iHashCode3 = (iHashCode2 + (source == null ? 0 : source.hashCode())) * 31;
        String str2 = this.stripeAccountId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Validated(clientSecret=" + this.clientSecret + ", flowOutcome=" + this.flowOutcome + ", canCancelSource=" + this.canCancelSource + ", sourceId=" + this.sourceId + ", source=" + this.source + ", stripeAccountId=" + this.stripeAccountId + ")";
    }
}
