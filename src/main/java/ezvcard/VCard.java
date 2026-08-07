package ezvcard;

import ezvcard.property.Address;
import ezvcard.property.Email;
import ezvcard.property.FormattedName;
import ezvcard.property.Kind;
import ezvcard.property.Label;
import ezvcard.property.Organization;
import ezvcard.property.StructuredName;
import ezvcard.property.Telephone;
import ezvcard.property.VCardProperty;
import ezvcard.util.g;
import ezvcard.util.h;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xj0.d;
import xj0.e;

/* JADX INFO: loaded from: classes8.dex */
public class VCard implements Iterable<VCardProperty> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VCardVersion f63486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g<Class<? extends VCardProperty>, VCardProperty> f63487b;

    private class a<T extends VCardProperty> extends AbstractList<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Class<T> f63488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final List<VCardProperty> f63489b;

        public a(Class<T> cls) {
            this.f63488a = cls;
            this.f63489b = VCard.this.f63487b.e(cls);
        }

        private T b(VCardProperty vCardProperty) {
            return this.f63488a.cast(vCardProperty);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(int i11, T t11) {
            this.f63489b.add(i11, t11);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public T get(int i11) {
            return (T) b(this.f63489b.get(i11));
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public T remove(int i11) {
            return (T) b(this.f63489b.remove(i11));
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public T set(int i11, T t11) {
            return (T) b(this.f63489b.set(i11, t11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f63489b.size();
        }
    }

    public VCard() {
        this(VCardVersion.V3_0);
    }

    public void b(Label label) {
        d(label);
    }

    public void d(VCardProperty vCardProperty) {
        this.f63487b.f((Class<? extends VCardProperty>) vCardProperty.getClass(), vCardProperty);
    }

    public List<Address> e() {
        return k(Address.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VCard vCard = (VCard) obj;
        if (this.f63486a != vCard.f63486a || this.f63487b.size() != vCard.f63487b.size()) {
            return false;
        }
        for (Map.Entry<Class<? extends VCardProperty>, List<VCardProperty>> entry : this.f63487b) {
            Class<? extends VCardProperty> key = entry.getKey();
            List<VCardProperty> value = entry.getValue();
            List<VCardProperty> listE = vCard.f63487b.e(key);
            if (value.size() != listE.size()) {
                return false;
            }
            ArrayList arrayList = new ArrayList(listE);
            Iterator<VCardProperty> it = value.iterator();
            while (it.hasNext()) {
                if (!arrayList.remove(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public List<Email> f() {
        return k(Email.class);
    }

    public FormattedName g() {
        return (FormattedName) l(FormattedName.class);
    }

    public Kind h() {
        return (Kind) l(Kind.class);
    }

    public int hashCode() {
        VCardVersion vCardVersion = this.f63486a;
        int iHashCode = (vCardVersion == null ? 0 : vCardVersion.hashCode()) + 31;
        Iterator<VCardProperty> it = this.f63487b.k().iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            iHashCode2 += it.next().hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public Organization i() {
        return (Organization) l(Organization.class);
    }

    @Override // java.lang.Iterable
    public Iterator<VCardProperty> iterator() {
        return this.f63487b.k().iterator();
    }

    public Collection<VCardProperty> j() {
        return this.f63487b.k();
    }

    public <T extends VCardProperty> List<T> k(Class<T> cls) {
        return new a(cls);
    }

    public <T extends VCardProperty> T l(Class<T> cls) {
        return cls.cast(this.f63487b.d(cls));
    }

    public StructuredName m() {
        return (StructuredName) l(StructuredName.class);
    }

    public List<Telephone> n() {
        return k(Telephone.class);
    }

    public VCardVersion o() {
        return this.f63486a;
    }

    public void p(VCardVersion vCardVersion) {
        this.f63486a = vCardVersion;
    }

    public e q(VCardVersion vCardVersion) {
        e eVar = new e();
        if (m() == null && (vCardVersion == VCardVersion.V2_1 || vCardVersion == VCardVersion.V3_0)) {
            eVar.b(null, new d(0, new Object[0]));
        }
        if (g() == null && (vCardVersion == VCardVersion.V3_0 || vCardVersion == VCardVersion.V4_0)) {
            eVar.b(null, new d(1, new Object[0]));
        }
        for (VCardProperty vCardProperty : this) {
            List<d> listValidate = vCardProperty.validate(vCardVersion, this);
            if (!listValidate.isEmpty()) {
                eVar.a(vCardProperty, listValidate);
            }
        }
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("version=");
        sb2.append(this.f63486a);
        for (VCardProperty vCardProperty : this.f63487b.k()) {
            sb2.append(h.f63685a);
            sb2.append(vCardProperty);
        }
        return sb2.toString();
    }

    public VCard(VCardVersion vCardVersion) {
        this.f63487b = new g<>();
        this.f63486a = vCardVersion;
    }

    public VCard(VCard vCard) {
        this.f63487b = new g<>();
        this.f63486a = vCard.f63486a;
        Iterator<VCardProperty> it = vCard.j().iterator();
        while (it.hasNext()) {
            d(it.next().copy());
        }
    }
}
