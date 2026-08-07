package t60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.paymentsheet.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p010i90.SectionElement;
import p010i90.d0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import u60.k;
import z80.AddressSpec;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001e¨\u0006%"}, d2 = {"Lt60/b;", "", "Lu60/k$a;", "arguments", "<init>", "(Lu60/k$a;)V", "Lt60/a;", "type", "e", "(Lt60/a;)Lt60/b;", "Li90/d0;", "formElement", "b", "(Li90/d0;)Lt60/b;", "", "", "availableCountries", "c", "(Ljava/util/Set;)Lt60/b;", "", "a", "()Ljava/util/List;", "Lu60/k$a;", "", "Ljava/util/List;", "headerFormElements", "uiFormElements", DateTokenConverter.CONVERTER_KEY, "footerFormElements", "", "Ljava/util/Set;", "requiredContactInformationCollectionModes", "", "f", "Z", "requireBillingAddressCollection", "g", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.a arguments;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<d0> headerFormElements;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<d0> uiFormElements;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<d0> footerFormElements;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<a> requiredContactInformationCollectionModes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean requireBillingAddressCollection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Set<String> availableCountries;

    public b(k.a arguments) {
        s.k(arguments, "arguments");
        this.arguments = arguments;
        this.headerFormElements = new ArrayList();
        this.uiFormElements = new ArrayList();
        this.footerFormElements = new ArrayList();
        this.requiredContactInformationCollectionModes = new LinkedHashSet();
        this.availableCountries = t30.d.f112276a.h();
        for (a aVar : a.getEntries()) {
            if (aVar.isRequired(this.arguments.getBillingDetailsCollectionConfiguration())) {
                e(aVar);
            }
        }
        if (this.arguments.getBillingDetailsCollectionConfiguration().getAddress() == y.BillingDetailsCollectionConfiguration.a.Full) {
            d(this, null, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b d(b bVar, Set set, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            set = bVar.availableCountries;
        }
        return bVar.c(set);
    }

    public final List<d0> a() {
        SectionElement sectionElementH;
        List listC = v.c();
        listC.addAll(this.headerFormElements);
        Iterator<a> it = this.requiredContactInformationCollectionModes.iterator();
        while (it.hasNext()) {
            listC.add(it.next().formElement(this.arguments.d()));
        }
        listC.addAll(this.uiFormElements);
        if (this.requireBillingAddressCollection && (sectionElementH = new AddressSpec(null, this.availableCountries, null, false, null, false, 61, null).h(this.arguments.d(), this.arguments.j())) != null) {
            listC.add(sectionElementH);
        }
        listC.addAll(this.footerFormElements);
        return v.a(listC);
    }

    public final b b(d0 formElement) {
        s.k(formElement, "formElement");
        this.uiFormElements.add(formElement);
        return this;
    }

    public final b c(Set<String> availableCountries) {
        s.k(availableCountries, "availableCountries");
        if (this.arguments.getBillingDetailsCollectionConfiguration().getAddress() != y.BillingDetailsCollectionConfiguration.a.Never) {
            this.requireBillingAddressCollection = true;
            this.availableCountries = availableCountries;
        }
        return this;
    }

    public final b e(a type) {
        s.k(type, "type");
        if (type.isAllowed(this.arguments.getBillingDetailsCollectionConfiguration())) {
            this.requiredContactInformationCollectionModes.add(type);
        }
        return this;
    }
}
