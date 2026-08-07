package expo.modules.contacts;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lexpo/modules/contacts/ContactPage;", "", "data", "", "Lexpo/modules/contacts/Contact;", "hasPreviousPage", "", "hasNextPage", "total", "", "<init>", "(Ljava/util/List;ZZI)V", "getData", "()Ljava/util/List;", "getHasPreviousPage", "()Z", "getHasNextPage", "getTotal", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "expo-contacts_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ContactPage {
    private final List<Contact> data;
    private final boolean hasNextPage;
    private final boolean hasPreviousPage;
    private final int total;

    public ContactPage(List<Contact> data, boolean z11, boolean z12, int i11) {
        s.k(data, "data");
        this.data = data;
        this.hasPreviousPage = z11;
        this.hasNextPage = z12;
        this.total = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactPage copy$default(ContactPage contactPage, List list, boolean z11, boolean z12, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = contactPage.data;
        }
        if ((i12 & 2) != 0) {
            z11 = contactPage.hasPreviousPage;
        }
        if ((i12 & 4) != 0) {
            z12 = contactPage.hasNextPage;
        }
        if ((i12 & 8) != 0) {
            i11 = contactPage.total;
        }
        return contactPage.copy(list, z11, z12, i11);
    }

    public final List<Contact> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasPreviousPage() {
        return this.hasPreviousPage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final ContactPage copy(List<Contact> data, boolean hasPreviousPage, boolean hasNextPage, int total) {
        s.k(data, "data");
        return new ContactPage(data, hasPreviousPage, hasNextPage, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactPage)) {
            return false;
        }
        ContactPage contactPage = (ContactPage) other;
        return s.f(this.data, contactPage.data) && this.hasPreviousPage == contactPage.hasPreviousPage && this.hasNextPage == contactPage.hasNextPage && this.total == contactPage.total;
    }

    public final List<Contact> getData() {
        return this.data;
    }

    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public final boolean getHasPreviousPage() {
        return this.hasPreviousPage;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (((((this.data.hashCode() * 31) + Boolean.hashCode(this.hasPreviousPage)) * 31) + Boolean.hashCode(this.hasNextPage)) * 31) + Integer.hashCode(this.total);
    }

    public String toString() {
        return "ContactPage(data=" + this.data + ", hasPreviousPage=" + this.hasPreviousPage + ", hasNextPage=" + this.hasNextPage + ", total=" + this.total + ")";
    }

    public /* synthetic */ ContactPage(List list, boolean z11, boolean z12, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? list.size() : i11);
    }
}
