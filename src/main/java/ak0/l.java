package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.DateOrTimeProperty;
import ezvcard.util.PartialDate;
import java.util.Date;

/* JADX INFO: loaded from: classes8.dex */
public abstract class l<T extends DateOrTimeProperty> extends g1<T> {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1740a;

        static {
            int[] iArr = new int[VCardVersion.values().length];
            f1740a = iArr;
            try {
                iArr[VCardVersion.V2_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1740a[VCardVersion.V3_0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1740a[VCardVersion.V4_0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(Class<T> cls, String str) {
        super(cls, str);
    }

    private T m(String str, yj0.a aVar) {
        try {
            return (T) l(g1.c(str), str.contains("T"));
        } catch (IllegalArgumentException unused) {
            if (aVar.d() == VCardVersion.V2_1 || aVar.d() == VCardVersion.V3_0) {
                throw new CannotParseException(5, new Object[0]);
            }
            try {
                return (T) j(PartialDate.o(str));
            } catch (IllegalArgumentException unused2) {
                aVar.a(6, new Object[0]);
                return (T) k(str);
            }
        }
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        if (a.f1740a[vCardVersion.ordinal()] != 3) {
            return null;
        }
        return VCardDataType.f63500k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        String strF = gq.e.f(str);
        return (aVar.d() == VCardVersion.V4_0 && vCardDataType == VCardDataType.f63496g) ? (T) k(strF) : (T) m(strF, aVar);
    }

    protected abstract T j(PartialDate partialDate);

    protected abstract T k(String str);

    protected abstract T l(Date date, boolean z11);
}
