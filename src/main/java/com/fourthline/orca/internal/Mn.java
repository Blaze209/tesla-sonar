package com.fourthline.orca.internal;

import android.content.Context;
import android.net.Uri;
import com.fourthline.core.DocumentType;

/* JADX INFO: loaded from: classes4.dex */
public final class Mn implements Ln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4109zD f26960b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Mn(Context context, InterfaceC4109zD videoServiceLocator) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(videoServiceLocator, "videoServiceLocator");
        this.f26959a = context;
        this.f26960b = videoServiceLocator;
    }

    private final Uri b(Context context) {
        return this.f26960b.a(AbstractC3972w5.a(context) ? Un.IdCardDark : Un.IdCard);
    }

    private final Uri c(Context context) {
        return this.f26960b.a(AbstractC3972w5.a(context) ? Un.PassportDark : Un.Passport);
    }

    private final Uri d(Context context) {
        return this.f26960b.a(AbstractC3972w5.a(context) ? Un.ResidencePermitDark : Un.ResidencePermit);
    }

    @Override // com.fourthline.orca.internal.Ln, wn0.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public En.e.a.C0486a invoke(DocumentType documentType) {
        Uri uriC;
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        int i11 = a.$EnumSwitchMapping$0[documentType.ordinal()];
        if (i11 == 1) {
            uriC = c(this.f26959a);
        } else if (i11 == 2) {
            uriC = b(this.f26959a);
        } else if (i11 == 3 || i11 == 4) {
            uriC = a(this.f26959a);
        } else {
            if (i11 != 5) {
                throw new IllegalStateException("FL Developer error. NFC scanner was instantiated with unsupported document type");
            }
            uriC = d(this.f26959a);
        }
        return new En.e.a.C0486a(uriC);
    }

    private final Uri a(Context context) {
        return this.f26960b.a(AbstractC3972w5.a(context) ? Un.DriversLicenceDark : Un.DriversLicence);
    }
}
