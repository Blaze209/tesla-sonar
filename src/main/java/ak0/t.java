package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Geo;
import ezvcard.util.GeoUri;

/* JADX INFO: loaded from: classes8.dex */
public class t extends g1<Geo> {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1747a;

        static {
            int[] iArr = new int[VCardVersion.values().length];
            f1747a = iArr;
            try {
                iArr[VCardVersion.V2_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1747a[VCardVersion.V3_0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1747a[VCardVersion.V4_0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public t() {
        super(Geo.class, "GEO");
    }

    private Geo j(String str) {
        try {
            return new Geo(GeoUri.n(str));
        } catch (IllegalArgumentException unused) {
            throw new CannotParseException(12, new Object[0]);
        }
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        if (a.f1747a[vCardVersion.ordinal()] != 3) {
            return null;
        }
        return VCardDataType.f63495f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Geo b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        if (str.length() == 0) {
            return new Geo((GeoUri) null);
        }
        int i11 = a.f1747a[aVar.d().ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return null;
            }
            return j(gq.e.f(str));
        }
        int iIndexOf = str.indexOf(59);
        if (iIndexOf < 0) {
            throw new CannotParseException(11, new Object[0]);
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        try {
            try {
                return new Geo(Double.valueOf(strSubstring), Double.valueOf(strSubstring2));
            } catch (NumberFormatException unused) {
                throw new CannotParseException(10, strSubstring2);
            }
        } catch (NumberFormatException unused2) {
            throw new CannotParseException(8, strSubstring);
        }
    }
}
