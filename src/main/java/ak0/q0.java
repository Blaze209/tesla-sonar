package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Revision;
import java.util.Date;

/* JADX INFO: loaded from: classes8.dex */
public class q0 extends g1<Revision> {
    public q0() {
        super(Revision.class, "REV");
    }

    private Revision j(String str) {
        if (str == null || str.length() == 0) {
            return new Revision((Date) null);
        }
        try {
            return new Revision(g1.c(str));
        } catch (IllegalArgumentException unused) {
            throw new CannotParseException(5, new Object[0]);
        }
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f63501l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Revision b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        return j(str);
    }
}
