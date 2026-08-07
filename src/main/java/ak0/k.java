package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.ClientPidMap;

/* JADX INFO: loaded from: classes8.dex */
public class k extends g1<ClientPidMap> {
    public k() {
        super(ClientPidMap.class, "CLIENTPIDMAP");
    }

    private ClientPidMap j(String str, String str2) {
        try {
            return new ClientPidMap(Integer.valueOf(Integer.parseInt(str)), str2);
        } catch (NumberFormatException unused) {
            throw new CannotParseException(4, new Object[0]);
        }
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f63496g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ClientPidMap b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        gq.e.a aVar2 = new gq.e.a(str, 2);
        String strB = aVar2.b();
        String strB2 = aVar2.b();
        if (strB == null || strB2 == null) {
            throw new CannotParseException(3, new Object[0]);
        }
        return j(strB, strB2);
    }
}
