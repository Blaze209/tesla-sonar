package com.fourthline.orca.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.fourthline.core.DocumentType;
import com.fourthline.nfc.assets.R;

/* JADX INFO: loaded from: classes4.dex */
public final class Nn implements Ln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27067a;

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

    public Nn(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.f27067a = context;
    }

    private final int b(Context context) {
        return AbstractC3972w5.a(context) ? R.raw.nfc_video_id_card_dark : R.raw.nfc_video_id_card_light;
    }

    private final int c(Context context) {
        return AbstractC3972w5.a(context) ? R.raw.nfc_video_passport_dark : R.raw.nfc_video_passport_light;
    }

    private final int d(Context context) {
        return AbstractC3972w5.a(context) ? a(context, R.raw.nfc_video_residence_permit_dark, R.raw.nfc_video_id_card_dark) : a(context, R.raw.nfc_video_residence_permit_light, R.raw.nfc_video_id_card_light);
    }

    @Override // com.fourthline.orca.internal.Ln, wn0.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public En.e.a.b invoke(DocumentType documentType) {
        int iC;
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        int i11 = a.$EnumSwitchMapping$0[documentType.ordinal()];
        if (i11 == 1) {
            iC = c(this.f27067a);
        } else if (i11 == 2) {
            iC = b(this.f27067a);
        } else if (i11 == 3 || i11 == 4) {
            iC = a(this.f27067a);
        } else {
            if (i11 != 5) {
                throw new IllegalStateException("FL Developer error. NFC scanner was instantiated with unsupported document type");
            }
            iC = d(this.f27067a);
        }
        return new En.e.a.b(iC);
    }

    private final int a(Context context) {
        if (AbstractC3972w5.a(context)) {
            return a(context, R.raw.nfc_video_drivers_license_dark, R.raw.nfc_video_id_card_dark);
        }
        return a(context, R.raw.nfc_video_drivers_license_light, R.raw.nfc_video_id_card_light);
    }

    private final int a(Context context, int i11, int i12) {
        return a(context, i11) ? i11 : i12;
    }

    private final boolean a(Context context, int i11) {
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = context.getResources().openRawResourceFd(i11);
        try {
            boolean z11 = assetFileDescriptorOpenRawResourceFd.getLength() > 0;
            sn0.b.a(assetFileDescriptorOpenRawResourceFd, null);
            return z11;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(assetFileDescriptorOpenRawResourceFd, th2);
                throw th3;
            }
        }
    }
}
