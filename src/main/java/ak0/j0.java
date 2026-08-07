package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Organization;

/* JADX INFO: loaded from: classes8.dex */
public class j0 extends g1<Organization> {
    public j0() {
        super(Organization.class, "ORG");
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f63496g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Organization b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        Organization organization = new Organization();
        organization.getValues().addAll(gq.e.b(str));
        return organization;
    }
}
