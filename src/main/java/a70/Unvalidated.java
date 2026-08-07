package a70;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.Source;
import java.io.Serializable;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: renamed from: a70.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 62\u00020\u0001:\u0001\u0016BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J`\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b,\u00101R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b2\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b6\u0010\u0019¨\u00067"}, d2 = {"La70/c;", "Landroid/os/Parcelable;", "", "clientSecret", "", "flowOutcome", "Lcom/stripe/android/core/exception/StripeException;", "exception", "", "canCancelSource", "sourceId", "Lcom/stripe/android/model/Source;", "source", "stripeAccountId", "<init>", "(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "Landroid/os/Bundle;", IntegerTokenConverter.CONVERTER_KEY, "()Landroid/os/Bundle;", "La70/d;", "j", "()La70/d;", "a", "(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;)La70/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "p", "b", "I", "e", "c", "Lcom/stripe/android/core/exception/StripeException;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/core/exception/StripeException;", "Z", "()Z", "g", "f", "Lcom/stripe/android/model/Source;", "()Lcom/stripe/android/model/Source;", "h", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Unvalidated implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientSecret;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int flowOutcome;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final StripeException exception;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canCancelSource;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sourceId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Source source;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String stripeAccountId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f494i = 8;
    public static final Parcelable.Creator<Unvalidated> CREATOR = new b();

    /* JADX INFO: renamed from: a70.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"La70/c$a;", "", "La70/c;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)La70/c;", "", "flags", "Ljn0/h0;", "c", "(La70/c;Landroid/os/Parcel;I)V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "b", "(Landroid/content/Intent;)La70/c;", "", "CLIENT_SECRET_INTENT_ERROR", "Ljava/lang/String;", "EXTRA", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Unvalidated a(Parcel parcel) {
            s.k(parcel, "parcel");
            String string = parcel.readString();
            int i11 = parcel.readInt();
            Serializable serializable = parcel.readSerializable();
            return new Unvalidated(string, i11, serializable instanceof StripeException ? (StripeException) serializable : null, parcel.readInt() == 1, parcel.readString(), (Source) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString());
        }

        public final /* synthetic */ Unvalidated b(Intent intent) {
            Unvalidated unvalidated = intent != null ? (Unvalidated) intent.getParcelableExtra("extra_args") : null;
            if (unvalidated == null) {
                return new Unvalidated(null, 0, null, false, null, null, null, 127, null);
            }
            return unvalidated;
        }

        public void c(Unvalidated unvalidated, Parcel parcel, int i11) {
            s.k(unvalidated, "<this>");
            s.k(parcel, "parcel");
            parcel.writeString(unvalidated.getClientSecret());
            parcel.writeInt(unvalidated.getFlowOutcome());
            parcel.writeSerializable(unvalidated.getException());
            Integer num = unvalidated.getCanCancelSource() ? 1 : null;
            parcel.writeInt(num != null ? num.intValue() : 0);
            parcel.writeString(unvalidated.getSourceId());
            parcel.writeParcelable(unvalidated.getSource(), i11);
            parcel.writeString(unvalidated.getStripeAccountId());
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a70.c$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Unvalidated> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Unvalidated createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return Unvalidated.INSTANCE.a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Unvalidated[] newArray(int i11) {
            return new Unvalidated[i11];
        }
    }

    public Unvalidated() {
        this(null, 0, null, false, null, null, null, 127, null);
    }

    public static /* synthetic */ Unvalidated b(Unvalidated unvalidated, String str, int i11, StripeException stripeException, boolean z11, String str2, Source source, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = unvalidated.clientSecret;
        }
        if ((i12 & 2) != 0) {
            i11 = unvalidated.flowOutcome;
        }
        if ((i12 & 4) != 0) {
            stripeException = unvalidated.exception;
        }
        if ((i12 & 8) != 0) {
            z11 = unvalidated.canCancelSource;
        }
        if ((i12 & 16) != 0) {
            str2 = unvalidated.sourceId;
        }
        if ((i12 & 32) != 0) {
            source = unvalidated.source;
        }
        if ((i12 & 64) != 0) {
            str3 = unvalidated.stripeAccountId;
        }
        Source source2 = source;
        String str4 = str3;
        String str5 = str2;
        StripeException stripeException2 = stripeException;
        return unvalidated.a(str, i11, stripeException2, z11, str5, source2, str4);
    }

    public final Unvalidated a(String clientSecret, int flowOutcome, StripeException exception, boolean canCancelSource, String sourceId, Source source, String stripeAccountId) {
        return new Unvalidated(clientSecret, flowOutcome, exception, canCancelSource, sourceId, source, stripeAccountId);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCanCancelSource() {
        return this.canCancelSource;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final StripeException getException() {
        return this.exception;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getFlowOutcome() {
        return this.flowOutcome;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Unvalidated)) {
            return false;
        }
        Unvalidated unvalidated = (Unvalidated) other;
        return s.f(this.clientSecret, unvalidated.clientSecret) && this.flowOutcome == unvalidated.flowOutcome && s.f(this.exception, unvalidated.exception) && this.canCancelSource == unvalidated.canCancelSource && s.f(this.sourceId, unvalidated.sourceId) && s.f(this.source, unvalidated.source) && s.f(this.stripeAccountId, unvalidated.stripeAccountId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }

    public int hashCode() {
        String str = this.clientSecret;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.flowOutcome)) * 31;
        StripeException stripeException = this.exception;
        int iHashCode2 = (((iHashCode + (stripeException == null ? 0 : stripeException.hashCode())) * 31) + Boolean.hashCode(this.canCancelSource)) * 31;
        String str2 = this.sourceId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Source source = this.source;
        int iHashCode4 = (iHashCode3 + (source == null ? 0 : source.hashCode())) * 31;
        String str3 = this.stripeAccountId;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final /* synthetic */ Bundle i() {
        return q5.d.b(x.a("extra_args", this));
    }

    public final Validated j() throws StripeException {
        if (this.exception != null) {
            throw this.exception;
        }
        String str = this.clientSecret;
        if (str == null || t.y0(str)) {
            throw new IllegalArgumentException("Invalid client_secret value in result Intent.");
        }
        return new Validated(this.clientSecret, this.flowOutcome, this.canCancelSource, this.sourceId, this.source, this.stripeAccountId);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    public String toString() {
        return "Unvalidated(clientSecret=" + this.clientSecret + ", flowOutcome=" + this.flowOutcome + ", exception=" + this.exception + ", canCancelSource=" + this.canCancelSource + ", sourceId=" + this.sourceId + ", source=" + this.source + ", stripeAccountId=" + this.stripeAccountId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        INSTANCE.c(this, parcel, flags);
    }

    public Unvalidated(String str, int i11, StripeException stripeException, boolean z11, String str2, Source source, String str3) {
        this.clientSecret = str;
        this.flowOutcome = i11;
        this.exception = stripeException;
        this.canCancelSource = z11;
        this.sourceId = str2;
        this.source = source;
        this.stripeAccountId = str3;
    }

    public /* synthetic */ Unvalidated(String str, int i11, StripeException stripeException, boolean z11, String str2, Source source, String str3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? null : stripeException, (i12 & 8) != 0 ? false : z11, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : source, (i12 & 64) != 0 ? null : str3);
    }
}
