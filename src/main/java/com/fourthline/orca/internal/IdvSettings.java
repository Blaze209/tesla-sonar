package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.annotation.Annotation;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.eh, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b'\b\u0081\b\u0018\u0000 Q2\u00020\u0001:\u0002#/B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u007f\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b4\u0010:R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b8\u0010DR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lcom/fourthline/orca/internal/eh;", "", "Lcom/fourthline/orca/internal/Ub;", "document", "Lcom/fourthline/orca/internal/Rn;", "nfc", "Lcom/fourthline/orca/internal/iC;", "tin", "Lcom/fourthline/orca/internal/gj;", "liveness", "Lcom/fourthline/orca/internal/ty;", "selfie", "Lcom/fourthline/orca/internal/Ag;", "geolocation", "Lcom/fourthline/orca/internal/Aq;", "person", "Lcom/fourthline/orca/internal/Le;", "emailAndPhone", "Lcom/fourthline/orca/internal/d0;", PlaceTypes.ADDRESS, "Lcom/fourthline/orca/internal/os;", "poa", "<init>", "(Lcom/fourthline/orca/internal/Ub;Lcom/fourthline/orca/internal/Rn;Lcom/fourthline/orca/internal/iC;Lcom/fourthline/orca/internal/gj;Lcom/fourthline/orca/internal/ty;Lcom/fourthline/orca/internal/Ag;Lcom/fourthline/orca/internal/Aq;Lcom/fourthline/orca/internal/Le;Lcom/fourthline/orca/internal/d0;Lcom/fourthline/orca/internal/os;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/Ub;Lcom/fourthline/orca/internal/Rn;Lcom/fourthline/orca/internal/iC;Lcom/fourthline/orca/internal/gj;Lcom/fourthline/orca/internal/ty;Lcom/fourthline/orca/internal/Ag;Lcom/fourthline/orca/internal/Aq;Lcom/fourthline/orca/internal/Le;Lcom/fourthline/orca/internal/d0;Lcom/fourthline/orca/internal/os;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/eh;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/Ub;", "b", "()Lcom/fourthline/orca/internal/Ub;", "Lcom/fourthline/orca/internal/Rn;", "getNfc", "()Lcom/fourthline/orca/internal/Rn;", "c", "Lcom/fourthline/orca/internal/iC;", "getTin", "()Lcom/fourthline/orca/internal/iC;", DateTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/internal/gj;", "()Lcom/fourthline/orca/internal/gj;", "e", "Lcom/fourthline/orca/internal/ty;", "()Lcom/fourthline/orca/internal/ty;", "f", "Lcom/fourthline/orca/internal/Ag;", "getGeolocation", "()Lcom/fourthline/orca/internal/Ag;", "g", "Lcom/fourthline/orca/internal/Aq;", "()Lcom/fourthline/orca/internal/Aq;", "h", "Lcom/fourthline/orca/internal/Le;", "getEmailAndPhone", "()Lcom/fourthline/orca/internal/Le;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/internal/d0;", "getAddress", "()Lcom/fourthline/orca/internal/d0;", "j", "Lcom/fourthline/orca/internal/os;", "getPoa", "()Lcom/fourthline/orca/internal/os;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class IdvSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f31424k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final ro0.d[] f31425l = {null, null, null, null, null, null, null, new vo0.e1("com.fourthline.orca.core.internal.backend.model.EmailAndPhoneSettings", C2901Le.INSTANCE, new Annotation[0]), new vo0.e1("com.fourthline.orca.core.internal.backend.model.AddressSettings", C3153d0.INSTANCE, new Annotation[0]), new vo0.e1("com.fourthline.orca.core.internal.backend.model.PoaSettings", C3657os.INSTANCE, new Annotation[0])};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentSettings document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final NfcSettings nfc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final TinSettings tin;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final LivenessSettings liveness;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final SelfieSettings selfie;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final GeolocationSettings geolocation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final PersonSettings person;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final C2901Le emailAndPhone;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final C3153d0 address;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final C3657os poa;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.eh$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f31437b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f31436a = aVar;
            f31437b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.IdvSettings", aVar, 10);
            m1Var.o("document", false);
            m1Var.o("nfc", true);
            m1Var.o("tin", false);
            m1Var.o("liveness", true);
            m1Var.o("selfie", false);
            m1Var.o("geolocation", false);
            m1Var.o("person", false);
            m1Var.o("emailAndPhone", false);
            m1Var.o(PlaceTypes.ADDRESS, false);
            m1Var.o("poa", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IdvSettings deserialize(uo0.e decoder) {
            int i11;
            C3153d0 c3153d0;
            C2901Le c2901Le;
            GeolocationSettings geolocationSettings;
            PersonSettings personSettings;
            SelfieSettings selfieSettings;
            C3657os c3657os;
            LivenessSettings livenessSettings;
            TinSettings c3379iC;
            DocumentSettings documentSettings;
            NfcSettings rn2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = IdvSettings.f31425l;
            int i12 = 9;
            int i13 = 8;
            DocumentSettings documentSettings2 = null;
            if (cVarB.i()) {
                DocumentSettings documentSettings3 = (DocumentSettings) cVarB.n(fVar, 0, DocumentSettings.a.f28769a, null);
                NfcSettings rn3 = (NfcSettings) cVarB.v(fVar, 1, NfcSettings.a.f27639a, null);
                TinSettings c3379iC2 = (TinSettings) cVarB.n(fVar, 2, TinSettings.a.f32460a, null);
                LivenessSettings livenessSettings2 = (LivenessSettings) cVarB.v(fVar, 3, LivenessSettings.a.f32031a, null);
                SelfieSettings selfieSettings2 = (SelfieSettings) cVarB.n(fVar, 4, SelfieSettings.a.f35769a, null);
                GeolocationSettings geolocationSettings2 = (GeolocationSettings) cVarB.n(fVar, 5, GeolocationSettings.a.f24947a, null);
                PersonSettings personSettings2 = (PersonSettings) cVarB.n(fVar, 6, PersonSettings.a.f25022a, null);
                C2901Le c2901Le2 = (C2901Le) cVarB.n(fVar, 7, dVarArr[7], null);
                C3153d0 c3153d1 = (C3153d0) cVarB.n(fVar, 8, dVarArr[8], null);
                c3657os = (C3657os) cVarB.n(fVar, 9, dVarArr[9], null);
                documentSettings = documentSettings3;
                personSettings = personSettings2;
                geolocationSettings = geolocationSettings2;
                livenessSettings = livenessSettings2;
                selfieSettings = selfieSettings2;
                c3379iC = c3379iC2;
                i11 = 1023;
                c2901Le = c2901Le2;
                c3153d0 = c3153d1;
                rn2 = rn3;
            } else {
                int i14 = 7;
                boolean z11 = true;
                int i15 = 0;
                C3153d0 c3153d2 = null;
                C2901Le c2901Le3 = null;
                GeolocationSettings geolocationSettings3 = null;
                PersonSettings personSettings3 = null;
                SelfieSettings selfieSettings3 = null;
                C3657os c3657os2 = null;
                LivenessSettings livenessSettings3 = null;
                TinSettings c3379iC3 = null;
                NfcSettings rn4 = null;
                while (z11) {
                    int i16 = i13;
                    int iA = cVarB.A(fVar);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            break;
                        case 0:
                            documentSettings2 = (DocumentSettings) cVarB.n(fVar, 0, DocumentSettings.a.f28769a, documentSettings2);
                            i15 |= 1;
                            break;
                        case 1:
                            rn4 = (NfcSettings) cVarB.v(fVar, 1, NfcSettings.a.f27639a, rn4);
                            i15 |= 2;
                            break;
                        case 2:
                            c3379iC3 = (TinSettings) cVarB.n(fVar, 2, TinSettings.a.f32460a, c3379iC3);
                            i15 |= 4;
                            break;
                        case 3:
                            livenessSettings3 = (LivenessSettings) cVarB.v(fVar, 3, LivenessSettings.a.f32031a, livenessSettings3);
                            i15 |= 8;
                            break;
                        case 4:
                            selfieSettings3 = (SelfieSettings) cVarB.n(fVar, 4, SelfieSettings.a.f35769a, selfieSettings3);
                            i15 |= 16;
                            break;
                        case 5:
                            geolocationSettings3 = (GeolocationSettings) cVarB.n(fVar, 5, GeolocationSettings.a.f24947a, geolocationSettings3);
                            i15 |= 32;
                            break;
                        case 6:
                            personSettings3 = (PersonSettings) cVarB.n(fVar, 6, PersonSettings.a.f25022a, personSettings3);
                            i15 |= 64;
                            break;
                        case 7:
                            c2901Le3 = (C2901Le) cVarB.n(fVar, i14, dVarArr[i14], c2901Le3);
                            i15 |= 128;
                            i12 = 9;
                            i13 = 8;
                            continue;
                        case 8:
                            c3153d2 = (C3153d0) cVarB.n(fVar, i16, dVarArr[i16], c3153d2);
                            i15 |= 256;
                            i13 = i16;
                            i12 = 9;
                            continue;
                        case 9:
                            c3657os2 = (C3657os) cVarB.n(fVar, i12, dVarArr[i12], c3657os2);
                            i15 |= 512;
                            i13 = i16;
                            continue;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                    i12 = 9;
                    i13 = 8;
                    i14 = 7;
                }
                i11 = i15;
                c3153d0 = c3153d2;
                c2901Le = c2901Le3;
                geolocationSettings = geolocationSettings3;
                personSettings = personSettings3;
                selfieSettings = selfieSettings3;
                c3657os = c3657os2;
                livenessSettings = livenessSettings3;
                c3379iC = c3379iC3;
                documentSettings = documentSettings2;
                rn2 = rn4;
            }
            cVarB.c(fVar);
            return new IdvSettings(i11, documentSettings, rn2, c3379iC, livenessSettings, selfieSettings, geolocationSettings, personSettings, c2901Le, c3153d0, c3657os, (vo0.v1) null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            ro0.d[] dVarArr = IdvSettings.f31425l;
            return new ro0.d[]{DocumentSettings.a.f28769a, so0.a.p(NfcSettings.a.f27639a), TinSettings.a.f32460a, so0.a.p(LivenessSettings.a.f32031a), SelfieSettings.a.f35769a, GeolocationSettings.a.f24947a, PersonSettings.a.f25022a, dVarArr[7], dVarArr[8], dVarArr[9]};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, IdvSettings value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            IdvSettings.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.eh$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<IdvSettings> serializer() {
            return a.f31436a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ IdvSettings(int i11, DocumentSettings documentSettings, NfcSettings rn2, TinSettings c3379iC, LivenessSettings livenessSettings, SelfieSettings selfieSettings, GeolocationSettings geolocationSettings, PersonSettings personSettings, C2901Le c2901Le, C3153d0 c3153d0, C3657os c3657os, vo0.v1 v1Var) {
        if (1013 != (i11 & 1013)) {
            vo0.h1.b(i11, 1013, a.f31436a.getDescriptor());
        }
        this.document = documentSettings;
        if ((i11 & 2) == 0) {
            this.nfc = null;
        } else {
            this.nfc = rn2;
        }
        this.tin = c3379iC;
        if ((i11 & 8) == 0) {
            this.liveness = null;
        } else {
            this.liveness = livenessSettings;
        }
        this.selfie = selfieSettings;
        this.geolocation = geolocationSettings;
        this.person = personSettings;
        this.emailAndPhone = c2901Le;
        this.address = c3153d0;
        this.poa = c3657os;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DocumentSettings getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LivenessSettings getLiveness() {
        return this.liveness;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final PersonSettings getPerson() {
        return this.person;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final SelfieSettings getSelfie() {
        return this.selfie;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdvSettings)) {
            return false;
        }
        IdvSettings idvSettings = (IdvSettings) other;
        return p013kotlin.jvm.internal.s.f(this.document, idvSettings.document) && p013kotlin.jvm.internal.s.f(this.nfc, idvSettings.nfc) && p013kotlin.jvm.internal.s.f(this.tin, idvSettings.tin) && p013kotlin.jvm.internal.s.f(this.liveness, idvSettings.liveness) && p013kotlin.jvm.internal.s.f(this.selfie, idvSettings.selfie) && p013kotlin.jvm.internal.s.f(this.geolocation, idvSettings.geolocation) && p013kotlin.jvm.internal.s.f(this.person, idvSettings.person) && p013kotlin.jvm.internal.s.f(this.emailAndPhone, idvSettings.emailAndPhone) && p013kotlin.jvm.internal.s.f(this.address, idvSettings.address) && p013kotlin.jvm.internal.s.f(this.poa, idvSettings.poa);
    }

    public int hashCode() {
        int iHashCode = this.document.hashCode() * 31;
        NfcSettings rn2 = this.nfc;
        int iHashCode2 = (((iHashCode + (rn2 == null ? 0 : rn2.hashCode())) * 31) + this.tin.hashCode()) * 31;
        LivenessSettings livenessSettings = this.liveness;
        return ((((((((((((iHashCode2 + (livenessSettings != null ? livenessSettings.hashCode() : 0)) * 31) + this.selfie.hashCode()) * 31) + this.geolocation.hashCode()) * 31) + this.person.hashCode()) * 31) + this.emailAndPhone.hashCode()) * 31) + this.address.hashCode()) * 31) + this.poa.hashCode();
    }

    public String toString() {
        return "IdvSettings(document=" + this.document + ", nfc=" + this.nfc + ", tin=" + this.tin + ", liveness=" + this.liveness + ", selfie=" + this.selfie + ", geolocation=" + this.geolocation + ", person=" + this.person + ", emailAndPhone=" + this.emailAndPhone + ", address=" + this.address + ", poa=" + this.poa + ")";
    }

    public IdvSettings(DocumentSettings document, NfcSettings rn2, TinSettings tin, LivenessSettings livenessSettings, SelfieSettings selfie, GeolocationSettings geolocation, PersonSettings person, C2901Le emailAndPhone, C3153d0 address, C3657os poa) {
        p013kotlin.jvm.internal.s.k(document, "document");
        p013kotlin.jvm.internal.s.k(tin, "tin");
        p013kotlin.jvm.internal.s.k(selfie, "selfie");
        p013kotlin.jvm.internal.s.k(geolocation, "geolocation");
        p013kotlin.jvm.internal.s.k(person, "person");
        p013kotlin.jvm.internal.s.k(emailAndPhone, "emailAndPhone");
        p013kotlin.jvm.internal.s.k(address, "address");
        p013kotlin.jvm.internal.s.k(poa, "poa");
        this.document = document;
        this.nfc = rn2;
        this.tin = tin;
        this.liveness = livenessSettings;
        this.selfie = selfie;
        this.geolocation = geolocation;
        this.person = person;
        this.emailAndPhone = emailAndPhone;
        this.address = address;
        this.poa = poa;
    }

    public static final /* synthetic */ void a(IdvSettings self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f31425l;
        output.D(serialDesc, 0, DocumentSettings.a.f28769a, self.document);
        if (output.G(serialDesc, 1) || self.nfc != null) {
            output.y(serialDesc, 1, NfcSettings.a.f27639a, self.nfc);
        }
        output.D(serialDesc, 2, TinSettings.a.f32460a, self.tin);
        if (output.G(serialDesc, 3) || self.liveness != null) {
            output.y(serialDesc, 3, LivenessSettings.a.f32031a, self.liveness);
        }
        output.D(serialDesc, 4, SelfieSettings.a.f35769a, self.selfie);
        output.D(serialDesc, 5, GeolocationSettings.a.f24947a, self.geolocation);
        output.D(serialDesc, 6, PersonSettings.a.f25022a, self.person);
        output.D(serialDesc, 7, dVarArr[7], self.emailAndPhone);
        output.D(serialDesc, 8, dVarArr[8], self.address);
        output.D(serialDesc, 9, dVarArr[9], self.poa);
    }

    public /* synthetic */ IdvSettings(DocumentSettings documentSettings, NfcSettings rn2, TinSettings c3379iC, LivenessSettings livenessSettings, SelfieSettings selfieSettings, GeolocationSettings geolocationSettings, PersonSettings personSettings, C2901Le c2901Le, C3153d0 c3153d0, C3657os c3657os, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(documentSettings, (i11 & 2) != 0 ? null : rn2, c3379iC, (i11 & 8) != 0 ? null : livenessSettings, selfieSettings, geolocationSettings, personSettings, c2901Le, c3153d0, c3657os);
    }
}
