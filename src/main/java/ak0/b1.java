package ak0;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Timezone;
import ezvcard.util.UtcOffset;

/* JADX INFO: loaded from: classes8.dex */
public class b1 extends g1<Timezone> {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1735a;

        static {
            int[] iArr = new int[VCardVersion.values().length];
            f1735a = iArr;
            try {
                iArr[VCardVersion.V2_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1735a[VCardVersion.V3_0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1735a[VCardVersion.V4_0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b1() {
        super(Timezone.class, "TZ");
    }

    private Timezone j(String str, VCardDataType vCardDataType, yj0.a aVar) {
        if (str == null || str.length() == 0) {
            return new Timezone((String) null);
        }
        int i11 = a.f1735a[aVar.d().ordinal()];
        if (i11 == 1) {
            try {
                return new Timezone(UtcOffset.f(str));
            } catch (IllegalArgumentException unused) {
                throw new CannotParseException(19, new Object[0]);
            }
        }
        if (i11 != 2 && i11 != 3) {
            return new Timezone((String) null);
        }
        try {
            return new Timezone(UtcOffset.f(str));
        } catch (IllegalArgumentException unused2) {
            if (vCardDataType == VCardDataType.f63505p) {
                aVar.a(20, new Object[0]);
            }
            return new Timezone(str);
        }
    }

    @Override // ak0.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        int i11 = a.f1735a[vCardVersion.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return VCardDataType.f63505p;
        }
        if (i11 != 3) {
            return null;
        }
        return VCardDataType.f63496g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.g1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Timezone b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, yj0.a aVar) {
        return j(gq.e.f(str), vCardDataType, aVar);
    }
}
