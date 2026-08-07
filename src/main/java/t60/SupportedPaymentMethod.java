package t60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.PaymentMethod;
import j80.DisplayablePaymentMethod;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import n70.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import s60.FormHeaderInformation;
import z80.SelectorIcon;
import z80.SharedDataSpec;

/* JADX INFO: renamed from: t60.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fBG\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u0015BS\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010!\u001a\u00020 2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b+\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\b1\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b2\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b3\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u00104\u001a\u0004\b5\u00106R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b7\u0010/¨\u00068"}, d2 = {"Lt60/g;", "", "", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "Lx30/c;", "displayName", "", "iconResource", "lightThemeIconUrl", "darkThemeIconUrl", "", "iconRequiresTinting", "subtitle", "<init>", "(Ljava/lang/String;Lx30/c;ILjava/lang/String;Ljava/lang/String;ZLx30/c;)V", "Lu60/c;", "paymentMethodDefinition", "Lz80/g2;", "sharedDataSpec", "displayNameResource", "(Lu60/c;Lz80/g2;IIZLx30/c;)V", "(Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Lx30/c;)V", "Ls60/a;", "c", "()Ls60/a;", "", "Lcom/stripe/android/model/v0;", "customerSavedPaymentMethods", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "Lj80/e;", "a", "(Ljava/util/List;Lwn0/a;)Lj80/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "Lx30/c;", "f", "()Lx30/c;", "I", "h", IntegerTokenConverter.CONVERTER_KEY, "e", "Z", "g", "()Z", "getSubtitle", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SupportedPaymentMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final x30.c displayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int iconResource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lightThemeIconUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String darkThemeIconUrl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean iconRequiresTinting;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final x30.c subtitle;

    public SupportedPaymentMethod(String code, x30.c displayName, int i11, String str, String str2, boolean z11, x30.c cVar) {
        s.k(code, "code");
        s.k(displayName, "displayName");
        this.code = code;
        this.displayName = displayName;
        this.iconResource = i11;
        this.lightThemeIconUrl = str;
        this.darkThemeIconUrl = str2;
        this.iconRequiresTinting = z11;
        this.subtitle = cVar;
    }

    private static final boolean b(List<PaymentMethod> list, SupportedPaymentMethod supportedPaymentMethod, PaymentMethod.p pVar) {
        List<PaymentMethod> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((PaymentMethod) it.next()).type == pVar) {
                return s.f(supportedPaymentMethod.code, pVar.code);
            }
        }
        return false;
    }

    public final DisplayablePaymentMethod a(List<PaymentMethod> customerSavedPaymentMethods, wn0.a<h0> onClick) {
        s.k(customerSavedPaymentMethods, "customerSavedPaymentMethods");
        s.k(onClick, "onClick");
        return new DisplayablePaymentMethod(this.code, b(customerSavedPaymentMethods, this, PaymentMethod.p.Card) ? x30.d.a(x.O) : this.displayName, this.iconResource, this.lightThemeIconUrl, this.darkThemeIconUrl, this.iconRequiresTinting, this.subtitle, onClick);
    }

    public final FormHeaderInformation c() {
        return new FormHeaderInformation(this.displayName, true, this.iconResource, this.lightThemeIconUrl, this.darkThemeIconUrl, this.iconRequiresTinting);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDarkThemeIconUrl() {
        return this.darkThemeIconUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportedPaymentMethod)) {
            return false;
        }
        SupportedPaymentMethod supportedPaymentMethod = (SupportedPaymentMethod) other;
        return s.f(this.code, supportedPaymentMethod.code) && s.f(this.displayName, supportedPaymentMethod.displayName) && this.iconResource == supportedPaymentMethod.iconResource && s.f(this.lightThemeIconUrl, supportedPaymentMethod.lightThemeIconUrl) && s.f(this.darkThemeIconUrl, supportedPaymentMethod.darkThemeIconUrl) && this.iconRequiresTinting == supportedPaymentMethod.iconRequiresTinting && s.f(this.subtitle, supportedPaymentMethod.subtitle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final x30.c getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIconRequiresTinting() {
        return this.iconRequiresTinting;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getIconResource() {
        return this.iconResource;
    }

    public int hashCode() {
        int iHashCode = ((((this.code.hashCode() * 31) + this.displayName.hashCode()) * 31) + Integer.hashCode(this.iconResource)) * 31;
        String str = this.lightThemeIconUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.darkThemeIconUrl;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.iconRequiresTinting)) * 31;
        x30.c cVar = this.subtitle;
        return iHashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLightThemeIconUrl() {
        return this.lightThemeIconUrl;
    }

    public String toString() {
        return "SupportedPaymentMethod(code=" + this.code + ", displayName=" + this.displayName + ", iconResource=" + this.iconResource + ", lightThemeIconUrl=" + this.lightThemeIconUrl + ", darkThemeIconUrl=" + this.darkThemeIconUrl + ", iconRequiresTinting=" + this.iconRequiresTinting + ", subtitle=" + this.subtitle + ")";
    }

    public /* synthetic */ SupportedPaymentMethod(String str, x30.c cVar, int i11, String str2, String str3, boolean z11, x30.c cVar2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, i11, str2, str3, z11, (i12 & 64) != 0 ? null : cVar2);
    }

    public /* synthetic */ SupportedPaymentMethod(u60.c cVar, SharedDataSpec sharedDataSpec, int i11, int i12, boolean z11, x30.c cVar2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i13 & 2) != 0 ? null : sharedDataSpec, i11, i12, (i13 & 16) != 0 ? false : z11, (i13 & 32) != 0 ? null : cVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SupportedPaymentMethod(u60.c paymentMethodDefinition, SharedDataSpec sharedDataSpec, int i11, int i12, boolean z11, x30.c cVar) {
        SelectorIcon selectorIcon;
        SelectorIcon selectorIcon2;
        s.k(paymentMethodDefinition, "paymentMethodDefinition");
        String str = paymentMethodDefinition.getType().code;
        x30.c cVarA = x30.d.a(i11);
        String strA = null;
        String strB = (sharedDataSpec == null || (selectorIcon2 = sharedDataSpec.getSelectorIcon()) == null) ? null : selectorIcon2.getLightThemePng();
        if (sharedDataSpec != null && (selectorIcon = sharedDataSpec.getSelectorIcon()) != null) {
            strA = selectorIcon.getDarkThemePng();
        }
        this(str, cVarA, i12, strB, strA, z11, cVar);
    }

    public /* synthetic */ SupportedPaymentMethod(String str, int i11, int i12, boolean z11, String str2, String str3, x30.c cVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, i12, (i13 & 8) != 0 ? false : z11, str2, str3, (i13 & 64) != 0 ? null : cVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SupportedPaymentMethod(String code, int i11, int i12, boolean z11, String str, String str2, x30.c cVar) {
        this(code, x30.d.a(i11), i12, str, str2, z11, cVar);
        s.k(code, "code");
    }
}
