package com.fourthline.kyc.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.core.Gender;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.internal.ExtensionsKt;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProviderKt;
import com.fourthline.kyc.Address;
import com.fourthline.kyc.Attachment;
import com.fourthline.kyc.Contacts;
import com.fourthline.kyc.CountryCodes;
import com.fourthline.kyc.Document;
import com.fourthline.kyc.EmploymentStatus;
import com.fourthline.kyc.Industry;
import com.fourthline.kyc.KycInfo;
import com.fourthline.kyc.Person;
import com.fourthline.kyc.Profession;
import com.fourthline.kyc.QesAttachment;
import com.fourthline.kyc.SecondaryDocument;
import com.fourthline.kyc.TaxInfo;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jn0.h0;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimestampProvider f24429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SimpleDateFormat f24431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SimpleDateFormat f24432d;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentType.PAPER_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DocumentFileSide.values().length];
            try {
                iArr2[DocumentFileSide.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DocumentFileSide.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DocumentFileSide.INSIDE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DocumentFileSide.INSIDE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EmploymentStatus.values().length];
            try {
                iArr3[EmploymentStatus.EMPLOYED.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[EmploymentStatus.UNEMPLOYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[EmploymentStatus.SELF_EMPLOYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public g(TimestampProvider timestampProvider, String str) {
        s.k(timestampProvider, "timestampProvider");
        this.f24429a = timestampProvider;
        this.f24430b = str;
        this.f24431c = b("yyyy-MM-dd");
        this.f24432d = b("yyyy-MM-dd'T'HH:mm:ss'Z'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(Person person, e invoke) {
        s.k(invoke, "$this$invoke");
        String lastName = person.getLastName();
        s.h(lastName);
        invoke.a(lastName);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d(final Attachment.Nfc nfc, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("File", new Pair[0], new wn0.l() { // from class: op.i3
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.e(nfc, (com.fourthline.kyc.internal.e) obj);
            }
        });
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 e(Attachment.Nfc nfc, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("FileLocation", new Pair[0], new wn0.l() { // from class: op.h2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.k((com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("FileType", new Pair[0], new wn0.l() { // from class: op.i2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.l((com.fourthline.kyc.internal.e) obj);
            }
        });
        final Coordinate location = nfc.getLocation();
        if (location != null) {
            invoke.a("Latitude", new Pair[0], new wn0.l() { // from class: op.j2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.i(location, (com.fourthline.kyc.internal.e) obj);
                }
            });
            invoke.a("Longitude", new Pair[0], new wn0.l() { // from class: op.k2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.j(location, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 f(Attachment.Selfie selfie, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("Documents/" + selfie.getVideoUUID$fourthline_kyc_release() + ".mp4");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 j(e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("Natural Person");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 k(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(CountryCodes.INSTANCE.mapToAlpha3IfNeeded$fourthline_kyc_release(str));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 l(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(CountryCodes.INSTANCE.mapToAlpha3IfNeeded$fourthline_kyc_release(str));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 m(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 n(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 o(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 p(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 q(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 r(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 s(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 t(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(CountryCodes.INSTANCE.mapToAlpha3IfNeeded$fourthline_kyc_release(str));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 u(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 v(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 w(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 x(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    @Override // com.fourthline.kyc.internal.k
    public String a(final KycInfo kyc) {
        s.k(kyc, "kyc");
        return f.a("SafenedKYC", new wn0.l() { // from class: op.r
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(kyc, this, (com.fourthline.kyc.internal.e) obj);
            }
        }).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(g gVar, KycInfo kycInfo, e invoke) {
        s.k(invoke, "$this$invoke");
        gVar.a(invoke, kycInfo.getDocument());
        gVar.b(invoke, kycInfo.getSecondaryDocuments());
        gVar.a(invoke, kycInfo.getSelfie());
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(Map.Entry entry, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(ExtensionsKt.toHex((byte[]) entry.getValue()));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 f(e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("MP4");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 g(e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("No");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 h(e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 i(Coordinate coordinate, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLatitude()));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 j(Coordinate coordinate, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLongitude()));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 k(e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("EmbeddedData/face.jpg");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 l(e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("JPG");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 m(e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("Document Video");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 n(e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("Front");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 o(e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("MP4");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(final KycInfo kycInfo, final g gVar, e xml) {
        s.k(xml, "$this$xml");
        xml.a("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
        String clientNumber = kycInfo.getProvider().getClientNumber();
        s.h(clientNumber);
        xml.a("ClientNumberProvider", clientNumber);
        String str = gVar.f24432d.format(gVar.f24429a.getCurrentTime());
        s.j(str, "format(...)");
        xml.a("ModifiedDateTime", str);
        String name = kycInfo.getProvider().getName();
        s.h(name);
        xml.a("Provider", name);
        xml.a("Identification", new Pair[0], new wn0.l() { // from class: op.s
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(this.f98287a, kycInfo, (com.fourthline.kyc.internal.e) obj);
            }
        });
        gVar.a(xml, kycInfo.getProfession());
        gVar.a(xml, kycInfo.getMetadata(), FourthlineAnalytics.INSTANCE.isInitialized() ? gVar.f24430b : null);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(final Attachment.Nfc nfc, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("Files", new Pair[0], new wn0.l() { // from class: op.h3
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.d(nfc, (com.fourthline.kyc.internal.e) obj);
            }
        });
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d(g gVar, long j11, e invoke) {
        s.k(invoke, "$this$invoke");
        String str = gVar.f24432d.format(new Date(j11));
        s.j(str, "format(...)");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 f(Coordinate coordinate, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLongitude()));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 g(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 h(Coordinate coordinate, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLongitude()));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 i(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 j(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 k(Coordinate coordinate, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLatitude()));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 l(Coordinate coordinate, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLongitude()));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d(SimpleDateFormat simpleDateFormat, Date date, e invoke) {
        s.k(invoke, "$this$invoke");
        String str = simpleDateFormat.format(date);
        s.j(str, "format(...)");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 f(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 g(Coordinate coordinate, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLatitude()));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 h(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 i(e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("PDF");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(g gVar, long j11, e invoke) {
        s.k(invoke, "$this$invoke");
        String str = gVar.f24432d.format(new Date(j11));
        s.j(str, "format(...)");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d(Coordinate coordinate, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLongitude()));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(Person person, e invoke) {
        s.k(invoke, "$this$invoke");
        String firstName = person.getFirstName();
        s.h(firstName);
        invoke.a(firstName);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(Document document, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("Documents/" + document.getVideoUUID$fourthline_kyc_release() + ".mp4");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d(e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("Selfie Video");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(SimpleDateFormat simpleDateFormat, Date date, e invoke) {
        s.k(invoke, "$this$invoke");
        String str = simpleDateFormat.format(date);
        s.j(str, "format(...)");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(SimpleDateFormat simpleDateFormat, Date date, e invoke) {
        s.k(invoke, "$this$invoke");
        String str = simpleDateFormat.format(date);
        s.j(str, "format(...)");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d(final Attachment.Selfie selfie, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("File", new Pair[0], new wn0.l() { // from class: op.q1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.e(selfie, (com.fourthline.kyc.internal.e) obj);
            }
        });
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 e(g gVar, long j11, e invoke) {
        s.k(invoke, "$this$invoke");
        String str = gVar.f24432d.format(new Date(j11));
        s.j(str, "format(...)");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(Attachment.Nfc nfc, e invoke) {
        s.k(invoke, "$this$invoke");
        String mrz = nfc.getMrz();
        s.h(mrz);
        invoke.a(t.V(mrz, "\n", "", false, 4, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(Attachment.Selfie selfie, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("Documents/" + selfie.getUuid() + ".jpg");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 e(final Attachment.Selfie selfie, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("FileLocation", new Pair[0], new wn0.l() { // from class: op.k
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.f(selfie, (com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("Side", new Pair[0], new wn0.l() { // from class: op.l
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.e((com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("FileType", new Pair[0], new wn0.l() { // from class: op.n
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.f((com.fourthline.kyc.internal.e) obj);
            }
        });
        final Coordinate location = selfie.getLocation();
        if (location != null) {
            invoke.a("Latitude", new Pair[0], new wn0.l() { // from class: op.o
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.e(location, (com.fourthline.kyc.internal.e) obj);
                }
            });
            invoke.a("Longitude", new Pair[0], new wn0.l() { // from class: op.p
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.f(location, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(Map.Entry entry, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(String.valueOf(((Number) entry.getKey()).intValue()));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("JPG");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(final Document document, e invoke) {
        final Coordinate location;
        s.k(invoke, "$this$invoke");
        invoke.a("FileLocation", new Pair[0], new wn0.l() { // from class: op.n2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.c(document, (com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("Side", new Pair[0], new wn0.l() { // from class: op.y2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.n((com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("FileType", new Pair[0], new wn0.l() { // from class: op.j3
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.o((com.fourthline.kyc.internal.e) obj);
            }
        });
        VideoRecording videoRecording = document.getVideoRecording();
        if (videoRecording != null && (location = videoRecording.getLocation()) != null) {
            invoke.a("Latitude", new Pair[0], new wn0.l() { // from class: op.m
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.k(location, (com.fourthline.kyc.internal.e) obj);
                }
            });
            invoke.a("Longitude", new Pair[0], new wn0.l() { // from class: op.q
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.l(location, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(Coordinate coordinate, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLatitude()));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(QesAttachment qesAttachment, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("DocumentsToSign/" + qesAttachment.getId() + ".pdf");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(final g gVar, final KycInfo kycInfo, e invoke) {
        s.k(invoke, "$this$invoke");
        gVar.a(invoke, kycInfo.getPerson());
        gVar.a(invoke, kycInfo.getAddress());
        gVar.a(invoke, kycInfo.getContacts());
        invoke.a("Documents", new Pair[0], new wn0.l() { // from class: op.w2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.b(this.f98315a, kycInfo, (com.fourthline.kyc.internal.e) obj);
            }
        });
        gVar.a(invoke, kycInfo.getDocumentsToSign());
        gVar.a(invoke, kycInfo.getTaxInfo());
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 e(e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("Front");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 e(Coordinate coordinate, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLatitude()));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(g gVar, SecondaryDocument secondaryDocument, e invoke) {
        s.k(invoke, "$this$invoke");
        DocumentType type = secondaryDocument.getType();
        s.h(type);
        invoke.a(gVar.a(type));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 e(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(Attachment.Document document, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(a(document));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(Coordinate coordinate, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLongitude()));
        return h0.f84049a;
    }

    private final e a(e eVar, final Person person) {
        return eVar.a("Person", new Pair[0], new wn0.l() { // from class: op.p1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(person, this, (com.fourthline.kyc.internal.e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(final Attachment.Selfie selfie, e invoke) {
        final Coordinate location;
        s.k(invoke, "$this$invoke");
        invoke.a("FileLocation", new Pair[0], new wn0.l() { // from class: op.y0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.c(selfie, (com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("Side", new Pair[0], new wn0.l() { // from class: op.z0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.b((com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("FileType", new Pair[0], new wn0.l() { // from class: op.a1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.c((com.fourthline.kyc.internal.e) obj);
            }
        });
        VideoRecording videoRecording = selfie.getVideoRecording();
        if (videoRecording != null && (location = videoRecording.getLocation()) != null) {
            invoke.a("Latitude", new Pair[0], new wn0.l() { // from class: op.b1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.c(location, (com.fourthline.kyc.internal.e) obj);
                }
            });
            invoke.a("Longitude", new Pair[0], new wn0.l() { // from class: op.c1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.d(location, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(final Person person, final g gVar, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("Type", new Pair[0], new wn0.l() { // from class: op.n0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.j((com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("Name", new Pair[0], new wn0.l() { // from class: op.o0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(person, (com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("FirstName", new Pair[0], new wn0.l() { // from class: op.p0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.b(person, (com.fourthline.kyc.internal.e) obj);
            }
        });
        final String middleName = person.getMiddleName();
        if (middleName != null) {
            invoke.a("MiddleName", new Pair[0], new wn0.l() { // from class: op.q0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.n(middleName, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        invoke.a("LastName", new Pair[0], new wn0.l() { // from class: op.r0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.c(person, (com.fourthline.kyc.internal.e) obj);
            }
        });
        final String nationalityCode = person.getNationalityCode();
        if (nationalityCode != null) {
            invoke.a("Nationality", new Pair[0], new wn0.l() { // from class: op.s0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.k(nationalityCode, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final Gender gender = person.getGender();
        if (gender != null) {
            invoke.a("Gender", new Pair[0], new wn0.l() { // from class: op.t0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(this.f98295a, gender, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final String birthCountryCode = person.getBirthCountryCode();
        if (birthCountryCode != null) {
            invoke.a("CountryOfBirth", new Pair[0], new wn0.l() { // from class: op.u0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.l(birthCountryCode, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final String birthPlace = person.getBirthPlace();
        if (birthPlace != null) {
            invoke.a("PlaceOfBirth", new Pair[0], new wn0.l() { // from class: op.w0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.m(birthPlace, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        invoke.a("BirthDate", new Pair[0], new wn0.l() { // from class: op.x0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(this.f98318a, person, (com.fourthline.kyc.internal.e) obj);
            }
        });
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("Front");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(final Attachment.Selfie selfie, final g gVar, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("DocumentType", new Pair[0], new wn0.l() { // from class: op.c
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.d((com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("Files", new Pair[0], new wn0.l() { // from class: op.d
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.d(selfie, (com.fourthline.kyc.internal.e) obj);
            }
        });
        Long timestamp = selfie.getTimestamp();
        if (timestamp != null) {
            final long jLongValue = timestamp.longValue();
            invoke.a("TimeStamp", new Pair[0], new wn0.l() { // from class: op.e
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.b(this.f98225a, jLongValue, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(Person person, e invoke) {
        s.k(invoke, "$this$invoke");
        String firstName = person.getFirstName();
        s.h(firstName);
        String str = " ";
        if (person.getMiddleName() != null) {
            str = " " + person.getMiddleName() + " ";
        }
        String lastName = person.getLastName();
        s.h(lastName);
        invoke.a(firstName + str + lastName);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(g gVar, Gender gender, e invoke) {
        s.k(invoke, "$this$invoke");
        String lowerCase = gender.name().toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        invoke.a(gVar.a(lowerCase));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(g gVar, long j11, e invoke) {
        s.k(invoke, "$this$invoke");
        String str = gVar.f24432d.format(new Date(j11));
        s.j(str, "format(...)");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(g gVar, Person person, e invoke) {
        s.k(invoke, "$this$invoke");
        SimpleDateFormat simpleDateFormat = gVar.f24431c;
        Date birthDate = person.getBirthDate();
        s.h(birthDate);
        String str = simpleDateFormat.format(birthDate);
        s.j(str, "format(...)");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(str);
        return h0.f84049a;
    }

    private final e a(e eVar, final Address address) {
        if (address != null) {
            return eVar.a("Address", new Pair[0], new wn0.l() { // from class: op.b
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(address, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(QesAttachment qesAttachment, e invoke) {
        s.k(invoke, "$this$invoke");
        String string = qesAttachment.getId().toString();
        s.j(string, "toString(...)");
        invoke.a(string);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(Address address, e invoke) {
        s.k(invoke, "$this$invoke");
        final String street = address.getStreet();
        if (street != null) {
            invoke.a("Street", new Pair[0], new wn0.l() { // from class: op.a3
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.o(street, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        Integer streetNumber = address.getStreetNumber();
        if (streetNumber != null) {
            final int iIntValue = streetNumber.intValue();
            invoke.a("StreetNumber", new Pair[0], new wn0.l() { // from class: op.b3
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(iIntValue, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final String streetNumberSuffix = address.getStreetNumberSuffix();
        if (streetNumberSuffix != null) {
            invoke.a("StreetNumberSuffix", new Pair[0], new wn0.l() { // from class: op.c3
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.p(streetNumberSuffix, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final String postalCode = address.getPostalCode();
        if (postalCode != null) {
            invoke.a("PostalCode", new Pair[0], new wn0.l() { // from class: op.d3
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.q(postalCode, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final String region = address.getRegion();
        if (region != null) {
            invoke.a("Region", new Pair[0], new wn0.l() { // from class: op.e3
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.r(region, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final String city = address.getCity();
        if (city != null) {
            invoke.a("City", new Pair[0], new wn0.l() { // from class: op.f3
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.s(city, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final String countryCode = address.getCountryCode();
        if (countryCode != null) {
            invoke.a("Country", new Pair[0], new wn0.l() { // from class: op.g3
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.t(countryCode, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }

    private final SimpleDateFormat b(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.ENGLISH);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    private final void b(e eVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final SecondaryDocument secondaryDocument = (SecondaryDocument) it.next();
            eVar.a("IdentificationDocument", new Pair[0], new wn0.l() { // from class: op.l0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(this.f98259a, secondaryDocument, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(int i11, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(String.valueOf(i11));
        return h0.f84049a;
    }

    private final e a(e eVar, final Contacts contacts) {
        if (contacts != null) {
            return eVar.a("EmailAndPhone", new Pair[0], new wn0.l() { // from class: op.v
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(contacts, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(Contacts contacts, e invoke) {
        s.k(invoke, "$this$invoke");
        final String email = contacts.getEmail();
        if (email != null) {
            invoke.a("Email", new Pair[0], new wn0.l() { // from class: op.e0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.u(email, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final String phone = contacts.getPhone();
        if (phone != null) {
            invoke.a("Phone", new Pair[0], new wn0.l() { // from class: op.f0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.v(phone, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final String mobile = contacts.getMobile();
        if (mobile != null) {
            invoke.a("Mobile", new Pair[0], new wn0.l() { // from class: op.g0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.w(mobile, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }

    private final e a(e eVar, final Document document) {
        if (document == null) {
            return null;
        }
        eVar.a("IdentificationDocument", new Pair[0], new wn0.l() { // from class: op.t
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(document, this, document, (com.fourthline.kyc.internal.e) obj);
            }
        });
        VideoRecording videoRecording = document.getVideoRecording();
        if (videoRecording == null || videoRecording.getUrl() == null) {
            return null;
        }
        return eVar.a("IdentificationDocument", new Pair[0], new wn0.l() { // from class: op.u
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(document, document, this, (com.fourthline.kyc.internal.e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(final Document document, final g gVar, Document document2, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("DocumentType", new Pair[0], new wn0.l() { // from class: op.z1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(this.f98329a, document, (com.fourthline.kyc.internal.e) obj);
            }
        });
        final String number = document.getNumber();
        if (number != null) {
            invoke.a("DocumentNumber", new Pair[0], new wn0.l() { // from class: op.a2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.x(number, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        invoke.a("Files", new Pair[0], new wn0.l() { // from class: op.b2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(document, gVar, (com.fourthline.kyc.internal.e) obj);
            }
        });
        final SimpleDateFormat simpleDateFormat = gVar.f24431c;
        final Date issueDate = document.getIssueDate();
        if (issueDate != null) {
            invoke.a("IssueDate", new Pair[0], new wn0.l() { // from class: op.d2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(simpleDateFormat, issueDate, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final Date expirationDate = document.getExpirationDate();
        if (expirationDate != null) {
            invoke.a("ExpirationDate", new Pair[0], new wn0.l() { // from class: op.e2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.b(simpleDateFormat, expirationDate, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final Attachment.Nfc nfc = document.getNfc();
        if (nfc != null) {
            invoke.a("EmbeddedData", new Pair[0], new wn0.l() { // from class: op.f2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(nfc, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        List<Attachment.Document> images = document2.getImages();
        s.h(images);
        Long timestamp = images.get(0).getTimestamp();
        if (timestamp != null) {
            final long jLongValue = timestamp.longValue();
            invoke.a("TimeStamp", new Pair[0], new wn0.l() { // from class: op.g2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.c(this.f98240a, jLongValue, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(g gVar, Document document, e invoke) {
        s.k(invoke, "$this$invoke");
        DocumentType type = document.getType();
        s.h(type);
        invoke.a(gVar.a(type));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(Document document, g gVar, e invoke) {
        s.k(invoke, "$this$invoke");
        List<Attachment.Document> images = document.getImages();
        if (images != null) {
            Iterator<T> it = images.iterator();
            while (it.hasNext()) {
                gVar.a(invoke, (Attachment.Document) it.next());
            }
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(SimpleDateFormat simpleDateFormat, Date date, e invoke) {
        s.k(invoke, "$this$invoke");
        String str = simpleDateFormat.format(date);
        s.j(str, "format(...)");
        invoke.a(str);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(final Attachment.Nfc nfc, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("MRZ", new Pair[0], new wn0.l() { // from class: op.h0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.b(nfc, (com.fourthline.kyc.internal.e) obj);
            }
        });
        final Map<Integer, byte[]> dataGroups = nfc.getDataGroups();
        if (dataGroups.isEmpty()) {
            dataGroups = null;
        }
        if (dataGroups != null) {
            invoke.a("NfcDataGroups", new Pair[0], new wn0.l() { // from class: op.i0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(dataGroups, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        if (nfc.getImage() != null) {
            invoke.a("EncodedFace", new Pair[0], new wn0.l() { // from class: op.j0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.c(nfc, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(final Map.Entry entry, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("NfcDataGroupNumber", new Pair[0], new wn0.l() { // from class: op.s1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.b(entry, (com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("NfcData", new Pair[0], new wn0.l() { // from class: op.t1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.c(entry, (com.fourthline.kyc.internal.e) obj);
            }
        });
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(Document document, final Document document2, final g gVar, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("DocumentType", new Pair[0], new wn0.l() { // from class: op.h
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.m((com.fourthline.kyc.internal.e) obj);
            }
        });
        List<Attachment.Document> images = document.getImages();
        s.h(images);
        Attachment.Document document3 = images.get(0);
        invoke.a("Files", new Pair[0], new wn0.l() { // from class: op.i
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(document2, (com.fourthline.kyc.internal.e) obj);
            }
        });
        Long timestamp = document3.getTimestamp();
        if (timestamp != null) {
            final long jLongValue = timestamp.longValue();
            invoke.a("TimeStamp", new Pair[0], new wn0.l() { // from class: op.j
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.d(this.f98248a, jLongValue, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(final Document document, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("File", new Pair[0], new wn0.l() { // from class: op.v0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.b(document, (com.fourthline.kyc.internal.e) obj);
            }
        });
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(final g gVar, final SecondaryDocument secondaryDocument, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("DocumentType", new Pair[0], new wn0.l() { // from class: op.u1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.b(this.f98303a, secondaryDocument, (com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("Files", new Pair[0], new wn0.l() { // from class: op.v1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(secondaryDocument, gVar, (com.fourthline.kyc.internal.e) obj);
            }
        });
        final SimpleDateFormat simpleDateFormat = gVar.f24431c;
        final Date issueDate = secondaryDocument.getIssueDate();
        if (issueDate != null) {
            invoke.a("IssueDate", new Pair[0], new wn0.l() { // from class: op.w1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.c(simpleDateFormat, issueDate, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final Date expirationDate = secondaryDocument.getExpirationDate();
        if (expirationDate != null) {
            invoke.a("ExpirationDate", new Pair[0], new wn0.l() { // from class: op.x1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.d(simpleDateFormat, expirationDate, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        List<Attachment.Document> images = secondaryDocument.getImages();
        s.h(images);
        Long timestamp = images.get(0).getTimestamp();
        if (timestamp != null) {
            final long jLongValue = timestamp.longValue();
            invoke.a("TimeStamp", new Pair[0], new wn0.l() { // from class: op.y1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.e(this.f98325a, jLongValue, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(SecondaryDocument secondaryDocument, g gVar, e invoke) {
        s.k(invoke, "$this$invoke");
        List<Attachment.Document> images = secondaryDocument.getImages();
        if (images != null) {
            Iterator<T> it = images.iterator();
            while (it.hasNext()) {
                gVar.a(invoke, (Attachment.Document) it.next());
            }
        }
        return h0.f84049a;
    }

    private static final String a(Attachment.Document document) {
        String upperCase = b.a(document).toUpperCase(Locale.ROOT);
        s.j(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    private final void a(e eVar, final Attachment.Document document) {
        eVar.a("File", new Pair[0], new wn0.l() { // from class: op.x2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(document, this, (com.fourthline.kyc.internal.e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(final Attachment.Document document, final g gVar, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("FileLocation", new Pair[0], new wn0.l() { // from class: op.j1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(document, (com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("Side", new Pair[0], new wn0.l() { // from class: op.k1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(this.f98256a, document, (com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("FileType", new Pair[0], new wn0.l() { // from class: op.l1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.b(document, (com.fourthline.kyc.internal.e) obj);
            }
        });
        final Coordinate location = document.getLocation();
        if (location != null) {
            invoke.a("Latitude", new Pair[0], new wn0.l() { // from class: op.m1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(location, (com.fourthline.kyc.internal.e) obj);
                }
            });
            invoke.a("Longitude", new Pair[0], new wn0.l() { // from class: op.n1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.b(location, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(Attachment.Document document, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("Documents/" + document.getUuid() + "." + b.a(document));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(g gVar, Attachment.Document document, e invoke) {
        s.k(invoke, "$this$invoke");
        DocumentFileSide fileSide = document.getFileSide();
        s.h(fileSide);
        invoke.a(gVar.a(fileSide));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(Coordinate coordinate, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLatitude()));
        return h0.f84049a;
    }

    private final e a(e eVar, final Attachment.Selfie selfie) {
        if (selfie == null) {
            return null;
        }
        eVar.a("IdentificationDocument", new Pair[0], new wn0.l() { // from class: op.z
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(selfie, this, (com.fourthline.kyc.internal.e) obj);
            }
        });
        VideoRecording videoRecording = selfie.getVideoRecording();
        if (videoRecording == null || videoRecording.getUrl() == null) {
            return null;
        }
        return eVar.a("IdentificationDocument", new Pair[0], new wn0.l() { // from class: op.k0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.b(selfie, this, (com.fourthline.kyc.internal.e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(final Attachment.Selfie selfie, final g gVar, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("DocumentType", new Pair[0], new wn0.l() { // from class: op.g1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a((com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("Files", new Pair[0], new wn0.l() { // from class: op.r1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(selfie, (com.fourthline.kyc.internal.e) obj);
            }
        });
        Long timestamp = selfie.getTimestamp();
        if (timestamp != null) {
            final long jLongValue = timestamp.longValue();
            invoke.a("TimeStamp", new Pair[0], new wn0.l() { // from class: op.c2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(this.f98215a, jLongValue, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("Selfie");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(final Attachment.Selfie selfie, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("File", new Pair[0], new wn0.l() { // from class: op.m0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.b(selfie, (com.fourthline.kyc.internal.e) obj);
            }
        });
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(g gVar, long j11, e invoke) {
        s.k(invoke, "$this$invoke");
        String str = gVar.f24432d.format(new Date(j11));
        s.j(str, "format(...)");
        invoke.a(str);
        return h0.f84049a;
    }

    private final e a(e eVar, final TaxInfo taxInfo) {
        if (taxInfo != null) {
            return eVar.a("Tax", new Pair[0], new wn0.l() { // from class: op.a0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(taxInfo, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(TaxInfo taxInfo, e invoke) {
        s.k(invoke, "$this$invoke");
        final String taxationCountryCode = taxInfo.getTaxationCountryCode();
        if (taxationCountryCode != null) {
            invoke.a("CountrySubjectToTaxation", new Pair[0], new wn0.l() { // from class: op.e1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(taxationCountryCode, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final String taxpayerIdentificationNumber = taxInfo.getTaxpayerIdentificationNumber();
        if (taxpayerIdentificationNumber != null) {
            invoke.a("TIN", new Pair[0], new wn0.l() { // from class: op.f1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.b(taxpayerIdentificationNumber, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        invoke.a("USPerson", new Pair[0], new wn0.l() { // from class: op.h1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.g((com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("USTIN", new Pair[0], new wn0.l() { // from class: op.i1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.h((com.fourthline.kyc.internal.e) obj);
            }
        });
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(String str, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(CountryCodes.INSTANCE.mapToAlpha3IfNeeded$fourthline_kyc_release(str));
        return h0.f84049a;
    }

    private final e a(e eVar, final Profession profession) {
        if (profession != null) {
            return eVar.a("Profession", new Pair[0], new wn0.l() { // from class: op.z2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(profession, profession, this, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(Profession profession, Profession profession2, final g gVar, e invoke) {
        s.k(invoke, "$this$invoke");
        final EmploymentStatus employment = profession.getEmployment();
        if (employment != null) {
            invoke.a("Employment", new Pair[0], new wn0.l() { // from class: op.b0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(this.f98207a, employment, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final String profession3 = profession2.getProfession();
        if (profession3 != null) {
            invoke.a("Profession", new Pair[0], new wn0.l() { // from class: op.c0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.c(profession3, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final Industry industry = profession.getIndustry();
        if (industry != null) {
            invoke.a("Industry", new Pair[0], new wn0.l() { // from class: op.d0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(this.f98219a, industry, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(g gVar, EmploymentStatus employmentStatus, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(gVar.a(employmentStatus));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(g gVar, Industry industry, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(gVar.a(industry));
        return h0.f84049a;
    }

    private final e a(e eVar, final DeviceMetadata deviceMetadata, final String str) {
        return eVar.a("DeviceMetaData", new Pair[0], new wn0.l() { // from class: op.f
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(deviceMetadata, str, (com.fourthline.kyc.internal.e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(final DeviceMetadata deviceMetadata, final String str, e invoke) {
        s.k(invoke, "$this$invoke");
        final String language = deviceMetadata.getLanguage();
        invoke.a("Language", new Pair[0], new wn0.l() { // from class: op.l2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.d(language, (com.fourthline.kyc.internal.e) obj);
            }
        });
        final String region = deviceMetadata.getRegion();
        invoke.a("Region", new Pair[0], new wn0.l() { // from class: op.m2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.e(region, (com.fourthline.kyc.internal.e) obj);
            }
        });
        final String model = deviceMetadata.getModel();
        invoke.a("Model", new Pair[0], new wn0.l() { // from class: op.o2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.f(model, (com.fourthline.kyc.internal.e) obj);
            }
        });
        final String ipAddress = deviceMetadata.getIpAddress();
        if (ipAddress != null) {
            invoke.a("IpAddress", new Pair[0], new wn0.l() { // from class: op.p2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.g(ipAddress, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final Coordinate location = deviceMetadata.getLocation();
        if (location != null && location != LocationProviderKt.getNotProvidedCoordinate()) {
            invoke.a("Latitude", new Pair[0], new wn0.l() { // from class: op.q2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.g(location, (com.fourthline.kyc.internal.e) obj);
                }
            });
            invoke.a("Longitude", new Pair[0], new wn0.l() { // from class: op.r2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.h(location, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        final String osVersion = deviceMetadata.getOsVersion();
        invoke.a("OsVersion", new Pair[0], new wn0.l() { // from class: op.s2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.h(osVersion, (com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("OsCompromised", new Pair[0], new wn0.l() { // from class: op.t2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(deviceMetadata, (com.fourthline.kyc.internal.e) obj);
            }
        });
        final String sdkVersion = deviceMetadata.getSdkVersion();
        invoke.a("SdkVersion", new Pair[0], new wn0.l() { // from class: op.u2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.i(sdkVersion, (com.fourthline.kyc.internal.e) obj);
            }
        });
        if (str != null) {
            invoke.a("AnalyticsID", new Pair[0], new wn0.l() { // from class: op.v2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.j(str, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(DeviceMetadata deviceMetadata, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a(deviceMetadata.getOsCompromised() ? "true" : "false");
        return h0.f84049a;
    }

    private final void a(e eVar, final List list) {
        if (list.isEmpty()) {
            return;
        }
        eVar.a("DocumentsToSign", new Pair[0], new wn0.l() { // from class: op.o1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.a(list, (com.fourthline.kyc.internal.e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(final QesAttachment qesAttachment, e invoke) {
        s.k(invoke, "$this$invoke");
        invoke.a("Id", new Pair[0], new wn0.l() { // from class: op.w
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.b(qesAttachment, (com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("FileLocation", new Pair[0], new wn0.l() { // from class: op.x
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.c(qesAttachment, (com.fourthline.kyc.internal.e) obj);
            }
        });
        invoke.a("FileType", new Pair[0], new wn0.l() { // from class: op.y
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.fourthline.kyc.internal.g.i((com.fourthline.kyc.internal.e) obj);
            }
        });
        return h0.f84049a;
    }

    private final String a(DocumentType documentType) {
        switch (a.$EnumSwitchMapping$0[documentType.ordinal()]) {
            case 1:
                return "Passport";
            case 2:
            case 3:
                return "National ID Card";
            case 4:
            case 5:
                return "Driving License";
            case 6:
                return "Residence Permit";
            case 7:
                return "Paper ID";
            case 8:
                return "Proof of Residence";
            case 9:
                return "TIN Reference Document";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String a(DocumentFileSide documentFileSide) {
        int i11 = a.$EnumSwitchMapping$1[documentFileSide.ordinal()];
        if (i11 == 1) {
            return "Front";
        }
        if (i11 == 2) {
            return "Back";
        }
        if (i11 == 3) {
            return "Inside Left";
        }
        if (i11 == 4) {
            return "Inside Right";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String a(EmploymentStatus employmentStatus) {
        int i11 = a.$EnumSwitchMapping$2[employmentStatus.ordinal()];
        if (i11 == 1) {
            return "Yes";
        }
        if (i11 == 2) {
            return "No";
        }
        if (i11 == 3) {
            return "Self Employed";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String a(Industry industry) {
        return industry.getCode();
    }

    private final String a(String str) {
        String strValueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            Locale ENGLISH = Locale.ENGLISH;
            s.j(ENGLISH, "ENGLISH");
            strValueOf = p013kotlin.text.a.d(cCharAt, ENGLISH);
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb2.append((Object) strValueOf);
        String strSubstring = str.substring(1);
        s.j(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(Map map, e invoke) {
        s.k(invoke, "$this$invoke");
        for (final Map.Entry entry : map.entrySet()) {
            invoke.a("NfcDataGroup", new Pair[0], new wn0.l() { // from class: op.g
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(entry, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(List list, e invoke) {
        s.k(invoke, "$this$invoke");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final QesAttachment qesAttachment = (QesAttachment) it.next();
            invoke.a("DocumentToSign", new Pair[0], new wn0.l() { // from class: op.d1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.fourthline.kyc.internal.g.a(qesAttachment, (com.fourthline.kyc.internal.e) obj);
                }
            });
        }
        return h0.f84049a;
    }
}
