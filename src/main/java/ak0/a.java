package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Address;

/* JADX INFO: loaded from: classes8.dex */
public class a extends g1<Address> {
    public a() {
        super(Address.class, "ADR");
    }

    private static Address j(gq.e.a aVar) {
        Address address = new Address();
        String strB = aVar.b();
        if (strB != null) {
            address.getPoBoxes().add(strB);
        }
        String strB2 = aVar.b();
        if (strB2 != null) {
            address.getExtendedAddresses().add(strB2);
        }
        String strB3 = aVar.b();
        if (strB3 != null) {
            address.getStreetAddresses().add(strB3);
        }
        String strB4 = aVar.b();
        if (strB4 != null) {
            address.getLocalities().add(strB4);
        }
        String strB5 = aVar.b();
        if (strB5 != null) {
            address.getRegions().add(strB5);
        }
        String strB6 = aVar.b();
        if (strB6 != null) {
            address.getPostalCodes().add(strB6);
        }
        String strB7 = aVar.b();
        if (strB7 != null) {
            address.getCountries().add(strB7);
        }
        return address;
    }

    private static Address k(gq.e.b bVar) {
        Address address = new Address();
        address.getPoBoxes().addAll(bVar.b());
        address.getExtendedAddresses().addAll(bVar.b());
        address.getStreetAddresses().addAll(bVar.b());
        address.getLocalities().addAll(bVar.b());
        address.getRegions().addAll(bVar.b());
        address.getPostalCodes().addAll(bVar.b());
        address.getCountries().addAll(bVar.b());
        return address;
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f63496g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Address b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        return aVar.d() == VCardVersion.V2_1 ? j(new gq.e.a(str)) : k(new gq.e.b(str));
    }
}
