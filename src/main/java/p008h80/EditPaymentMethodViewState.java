package p008h80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.h;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.List;
import on0.a;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p010i90.s1;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import x30.c;
import x30.d;

/* JADX INFO: renamed from: h80.o, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001fB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001b\u0010.R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b\u001f\u0010(R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b&\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b,\u0010%¨\u0006/"}, d2 = {"Lh80/o;", "", "Lh80/o$b;", PermissionsResponse.STATUS_KEY, "", "last4", "Lx30/c;", "displayName", "", "canUpdate", "Lh80/o$a;", "selectedBrand", "", "availableBrands", "canRemove", "confirmRemoval", AnalyticsAttribute.Error, "<init>", "(Lh80/o$b;Ljava/lang/String;Lx30/c;ZLh80/o$a;Ljava/util/List;ZZLx30/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lh80/o$b;", IntegerTokenConverter.CONVERTER_KEY, "()Lh80/o$b;", "b", "Ljava/lang/String;", "g", "c", "Lx30/c;", "e", "()Lx30/c;", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "Lh80/o$a;", "h", "()Lh80/o$a;", "f", "Ljava/util/List;", "()Ljava/util/List;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EditPaymentMethodViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String last4;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final c displayName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canUpdate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardBrandChoice selectedBrand;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CardBrandChoice> availableBrands;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canRemove;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean confirmRemoval;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final c error;

    /* JADX INFO: renamed from: h80.o$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lh80/o$a;", "Li90/s1;", "Lcom/stripe/android/model/h;", "brand", "<init>", "(Lcom/stripe/android/model/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/model/h;", "()Lcom/stripe/android/model/h;", "getIcon", "()Ljava/lang/Integer;", "icon", "Lx30/c;", "getLabel", "()Lx30/c;", AnnotatedPrivateKey.LABEL, "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CardBrandChoice implements s1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h brand;

        public CardBrandChoice(h brand) {
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
            return (other instanceof CardBrandChoice) && this.brand == ((CardBrandChoice) other).brand;
        }

        @Override // p010i90.s1
        public Integer getIcon() {
            return Integer.valueOf(this.brand.getIcon());
        }

        @Override // p010i90.s1
        public c getLabel() {
            return d.b(this.brand.getDisplayName());
        }

        public int hashCode() {
            return this.brand.hashCode();
        }

        public String toString() {
            return "CardBrandChoice(brand=" + this.brand + ")";
        }
    }

    /* JADX INFO: renamed from: h80.o$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lh80/o$b;", "", "<init>", "(Ljava/lang/String;I)V", "Idle", "Updating", "Removing", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum b {
        Idle,
        Updating,
        Removing;

        private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    public EditPaymentMethodViewState(b status, String last4, c displayName, boolean z11, CardBrandChoice selectedBrand, List<CardBrandChoice> availableBrands, boolean z12, boolean z13, c cVar) {
        s.k(status, "status");
        s.k(last4, "last4");
        s.k(displayName, "displayName");
        s.k(selectedBrand, "selectedBrand");
        s.k(availableBrands, "availableBrands");
        this.status = status;
        this.last4 = last4;
        this.displayName = displayName;
        this.canUpdate = z11;
        this.selectedBrand = selectedBrand;
        this.availableBrands = availableBrands;
        this.canRemove = z12;
        this.confirmRemoval = z13;
        this.error = cVar;
    }

    public final List<CardBrandChoice> a() {
        return this.availableBrands;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCanRemove() {
        return this.canRemove;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCanUpdate() {
        return this.canUpdate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getConfirmRemoval() {
        return this.confirmRemoval;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getDisplayName() {
        return this.displayName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditPaymentMethodViewState)) {
            return false;
        }
        EditPaymentMethodViewState editPaymentMethodViewState = (EditPaymentMethodViewState) other;
        return this.status == editPaymentMethodViewState.status && s.f(this.last4, editPaymentMethodViewState.last4) && s.f(this.displayName, editPaymentMethodViewState.displayName) && this.canUpdate == editPaymentMethodViewState.canUpdate && s.f(this.selectedBrand, editPaymentMethodViewState.selectedBrand) && s.f(this.availableBrands, editPaymentMethodViewState.availableBrands) && this.canRemove == editPaymentMethodViewState.canRemove && this.confirmRemoval == editPaymentMethodViewState.confirmRemoval && s.f(this.error, editPaymentMethodViewState.error);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final c getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLast4() {
        return this.last4;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final CardBrandChoice getSelectedBrand() {
        return this.selectedBrand;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.status.hashCode() * 31) + this.last4.hashCode()) * 31) + this.displayName.hashCode()) * 31) + Boolean.hashCode(this.canUpdate)) * 31) + this.selectedBrand.hashCode()) * 31) + this.availableBrands.hashCode()) * 31) + Boolean.hashCode(this.canRemove)) * 31) + Boolean.hashCode(this.confirmRemoval)) * 31;
        c cVar = this.error;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final b getStatus() {
        return this.status;
    }

    public String toString() {
        return "EditPaymentMethodViewState(status=" + this.status + ", last4=" + this.last4 + ", displayName=" + this.displayName + ", canUpdate=" + this.canUpdate + ", selectedBrand=" + this.selectedBrand + ", availableBrands=" + this.availableBrands + ", canRemove=" + this.canRemove + ", confirmRemoval=" + this.confirmRemoval + ", error=" + this.error + ")";
    }

    public /* synthetic */ EditPaymentMethodViewState(b bVar, String str, c cVar, boolean z11, CardBrandChoice cardBrandChoice, List list, boolean z12, boolean z13, c cVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, str, cVar, z11, cardBrandChoice, list, z12, (i11 & 128) != 0 ? false : z13, (i11 & 256) != 0 ? null : cVar2);
    }
}
