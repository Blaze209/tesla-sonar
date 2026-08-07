package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.MediaTypeParameter;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.BinaryProperty;

/* JADX INFO: loaded from: classes8.dex */
public abstract class d<T extends BinaryProperty<U>, U extends MediaTypeParameter> extends g1<T> {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1736a;

        static {
            int[] iArr = new int[VCardVersion.values().length];
            f1736a = iArr;
            try {
                iArr[VCardVersion.V2_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1736a[VCardVersion.V3_0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1736a[VCardVersion.V4_0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(Class<T> cls, String str) {
        super(cls, str);
    }

    protected static String p(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0 || iLastIndexOf == str.length() - 1 || str.lastIndexOf(47) > iLastIndexOf) {
            return null;
        }
        return str.substring(iLastIndexOf + 1);
    }

    private T q(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, VCardVersion vCardVersion) {
        MediaTypeParameter mediaTypeParameterR = r(str, vCardParameters, vCardVersion);
        int i11 = a.f1736a[vCardVersion.ordinal()];
        if (i11 == 1 || i11 == 2) {
            if (vCardDataType == VCardDataType.f63492c || vCardDataType == VCardDataType.f63495f) {
                return (T) l(str, mediaTypeParameterR);
            }
            ezvcard.parameter.a aVarO = vCardParameters.o();
            if (aVarO == ezvcard.parameter.a.f63617d || aVarO == ezvcard.parameter.a.f63620g) {
                return (T) m(ck0.a.p(str), mediaTypeParameterR);
            }
        } else if (i11 == 3) {
            try {
                ezvcard.util.d dVarC = ezvcard.util.d.c(str);
                mediaTypeParameterR = j(dVarC.a());
                return (T) m(dVarC.b(), mediaTypeParameterR);
            } catch (IllegalArgumentException unused) {
            }
        }
        return (T) o(str, vCardVersion, mediaTypeParameterR);
    }

    private U r(String str, VCardParameters vCardParameters, VCardVersion vCardVersion) {
        String strU;
        int i11 = a.f1736a[vCardVersion.ordinal()];
        if (i11 == 1 || i11 == 2) {
            String strZ = vCardParameters.z();
            if (strZ != null) {
                return (U) k(strZ);
            }
        } else if (i11 == 3 && (strU = vCardParameters.u()) != null) {
            return (U) j(strU);
        }
        String strP = p(str);
        if (strP == null) {
            return null;
        }
        return (U) i(strP);
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        if (a.f1736a[vCardVersion.ordinal()] != 3) {
            return null;
        }
        return VCardDataType.f63495f;
    }

    protected abstract U i(String str);

    protected abstract U j(String str);

    protected abstract U k(String str);

    protected abstract T l(String str, U u11);

    protected abstract T m(byte[] bArr, U u11);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        return (T) q(gq.e.f(str), vCardDataType, vCardParameters, aVar.d());
    }

    protected T o(String str, VCardVersion vCardVersion, U u11) {
        int i11 = a.f1736a[vCardVersion.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return str.startsWith("http") ? (T) l(str, u11) : (T) m(ck0.a.p(str), u11);
        }
        if (i11 != 3) {
            return null;
        }
        return (T) l(str, u11);
    }
}
