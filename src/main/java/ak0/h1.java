package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Xml;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes8.dex */
public class h1 extends g1<Xml> {
    public h1() {
        super(Xml.class, "XML");
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f63496g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Xml b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        try {
            return new Xml(gq.e.f(str));
        } catch (SAXException unused) {
            throw new CannotParseException(21, new Object[0]);
        }
    }
}
