package c40;

import a40.CustomerPermissions;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: c40.p, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJJ\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lc40/p;", "", "Lcom/stripe/android/model/h0;", "elementsSession", "", "Lcom/stripe/android/model/v0;", "paymentMethods", "Lw70/m;", "savedSelection", "Lu60/h;", "paymentMethodSaveConsentBehavior", "La40/b;", "permissions", "<init>", "(Lcom/stripe/android/model/h0;Ljava/util/List;Lw70/m;Lu60/h;La40/b;)V", "a", "(Lcom/stripe/android/model/h0;Ljava/util/List;Lw70/m;Lu60/h;La40/b;)Lc40/p;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/model/h0;", "c", "()Lcom/stripe/android/model/h0;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lw70/m;", "g", "()Lw70/m;", DateTokenConverter.CONVERTER_KEY, "Lu60/h;", "()Lu60/h;", "La40/b;", "f", "()La40/b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CustomerSheetSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ElementsSession elementsSession;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PaymentMethod> paymentMethods;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final w70.m savedSelection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final u60.h paymentMethodSaveConsentBehavior;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerPermissions permissions;

    public CustomerSheetSession(ElementsSession elementsSession, List<PaymentMethod> paymentMethods, w70.m mVar, u60.h paymentMethodSaveConsentBehavior, CustomerPermissions permissions) {
        s.k(elementsSession, "elementsSession");
        s.k(paymentMethods, "paymentMethods");
        s.k(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        s.k(permissions, "permissions");
        this.elementsSession = elementsSession;
        this.paymentMethods = paymentMethods;
        this.savedSelection = mVar;
        this.paymentMethodSaveConsentBehavior = paymentMethodSaveConsentBehavior;
        this.permissions = permissions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomerSheetSession b(CustomerSheetSession customerSheetSession, ElementsSession elementsSession, List list, w70.m mVar, u60.h hVar, CustomerPermissions customerPermissions, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            elementsSession = customerSheetSession.elementsSession;
        }
        if ((i11 & 2) != 0) {
            list = customerSheetSession.paymentMethods;
        }
        if ((i11 & 4) != 0) {
            mVar = customerSheetSession.savedSelection;
        }
        if ((i11 & 8) != 0) {
            hVar = customerSheetSession.paymentMethodSaveConsentBehavior;
        }
        if ((i11 & 16) != 0) {
            customerPermissions = customerSheetSession.permissions;
        }
        CustomerPermissions customerPermissions2 = customerPermissions;
        w70.m mVar2 = mVar;
        return customerSheetSession.a(elementsSession, list, mVar2, hVar, customerPermissions2);
    }

    public final CustomerSheetSession a(ElementsSession elementsSession, List<PaymentMethod> paymentMethods, w70.m savedSelection, u60.h paymentMethodSaveConsentBehavior, CustomerPermissions permissions) {
        s.k(elementsSession, "elementsSession");
        s.k(paymentMethods, "paymentMethods");
        s.k(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        s.k(permissions, "permissions");
        return new CustomerSheetSession(elementsSession, paymentMethods, savedSelection, paymentMethodSaveConsentBehavior, permissions);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ElementsSession getElementsSession() {
        return this.elementsSession;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final u60.h getPaymentMethodSaveConsentBehavior() {
        return this.paymentMethodSaveConsentBehavior;
    }

    public final List<PaymentMethod> e() {
        return this.paymentMethods;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerSheetSession)) {
            return false;
        }
        CustomerSheetSession customerSheetSession = (CustomerSheetSession) other;
        return s.f(this.elementsSession, customerSheetSession.elementsSession) && s.f(this.paymentMethods, customerSheetSession.paymentMethods) && s.f(this.savedSelection, customerSheetSession.savedSelection) && s.f(this.paymentMethodSaveConsentBehavior, customerSheetSession.paymentMethodSaveConsentBehavior) && s.f(this.permissions, customerSheetSession.permissions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final CustomerPermissions getPermissions() {
        return this.permissions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final w70.m getSavedSelection() {
        return this.savedSelection;
    }

    public int hashCode() {
        int iHashCode = ((this.elementsSession.hashCode() * 31) + this.paymentMethods.hashCode()) * 31;
        w70.m mVar = this.savedSelection;
        return ((((iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31) + this.paymentMethodSaveConsentBehavior.hashCode()) * 31) + this.permissions.hashCode();
    }

    public String toString() {
        return "CustomerSheetSession(elementsSession=" + this.elementsSession + ", paymentMethods=" + this.paymentMethods + ", savedSelection=" + this.savedSelection + ", paymentMethodSaveConsentBehavior=" + this.paymentMethodSaveConsentBehavior + ", permissions=" + this.permissions + ")";
    }
}
