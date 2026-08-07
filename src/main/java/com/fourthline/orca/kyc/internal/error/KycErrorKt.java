package com.fourthline.orca.kyc.internal.error;

import com.fourthline.orca.internal.AbstractC3502l8;
import com.fourthline.orca.internal.AbstractC3641oc;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/fourthline/orca/internal/oc;", "Lcom/fourthline/orca/kyc/internal/error/KycError;", "postProcessingErrorToKycError", "(Lcom/fourthline/orca/internal/oc;)Lcom/fourthline/orca/kyc/internal/error/KycError;", "documentAnalysisErrorToKycError", "Lcom/fourthline/orca/internal/l8;", "getKycError", "(Lcom/fourthline/orca/internal/l8;)Lcom/fourthline/orca/kyc/internal/error/KycError;", "kycError", "fourthline-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KycErrorKt {
    public static final KycError documentAnalysisErrorToKycError(AbstractC3641oc abstractC3641oc) {
        s.k(abstractC3641oc, "<this>");
        if (s.f(abstractC3641oc, AbstractC3641oc.g.f34200a)) {
            return KycError.IssuingCountryNotSupported.INSTANCE;
        }
        if (s.f(abstractC3641oc, AbstractC3641oc.f.f34199a)) {
            return KycError.IssuingCountryNotSupported.INSTANCE;
        }
        if (s.f(abstractC3641oc, AbstractC3641oc.e.f34198a)) {
            return KycError.DocumentTypeNotSupported.INSTANCE;
        }
        if (s.f(abstractC3641oc, AbstractC3641oc.i.f34202a)) {
            return KycError.NationalityNotSupported.INSTANCE;
        }
        if (s.f(abstractC3641oc, AbstractC3641oc.a.f34194a)) {
            return KycError.DocumentExpired.INSTANCE;
        }
        if (s.f(abstractC3641oc, AbstractC3641oc.j.f34203a)) {
            return KycError.PersonNotAdult.INSTANCE;
        }
        if (s.f(abstractC3641oc, AbstractC3641oc.d.f34197a)) {
            return KycError.DocumentTypeInvalid.INSTANCE;
        }
        if (s.f(abstractC3641oc, AbstractC3641oc.c.f34196a)) {
            throw new IllegalStateException("FL developer error! This error is always recoverable!");
        }
        if (s.f(abstractC3641oc, AbstractC3641oc.b.f34195a)) {
            throw new IllegalStateException("FL developer error! This error is always recoverable!");
        }
        if (s.f(abstractC3641oc, AbstractC3641oc.h.f34201a)) {
            throw new IllegalStateException("FL developer error! This error is always recoverable!");
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final KycError getKycError(AbstractC3502l8 abstractC3502l8) {
        s.k(abstractC3502l8, "<this>");
        if (abstractC3502l8 instanceof AbstractC3502l8.b) {
            return KycError.Canceled.INSTANCE;
        }
        if (abstractC3502l8 instanceof AbstractC3502l8.d) {
            return postProcessingErrorToKycError(((AbstractC3502l8.d) abstractC3502l8).a());
        }
        if (abstractC3502l8 instanceof AbstractC3502l8.a) {
            return documentAnalysisErrorToKycError(((AbstractC3502l8.a) abstractC3502l8).a());
        }
        if (!(abstractC3502l8 instanceof AbstractC3502l8.c) && !(abstractC3502l8 instanceof AbstractC3502l8.e)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException((abstractC3502l8 + " error has to be handled by Document Scanner and cannot be mapped!").toString());
    }

    public static final KycError postProcessingErrorToKycError(AbstractC3641oc abstractC3641oc) {
        s.k(abstractC3641oc, "<this>");
        if (s.f(abstractC3641oc, AbstractC3641oc.a.f34194a)) {
            return KycError.DocumentExpired.INSTANCE;
        }
        if (s.f(abstractC3641oc, AbstractC3641oc.e.f34198a)) {
            return KycError.DocumentTypeNotSupported.INSTANCE;
        }
        if (s.f(abstractC3641oc, AbstractC3641oc.d.f34197a)) {
            return KycError.DocumentTypeInvalid.INSTANCE;
        }
        if (s.f(abstractC3641oc, AbstractC3641oc.g.f34200a)) {
            return KycError.IssuingCountryNotSupported.INSTANCE;
        }
        AbstractC3641oc.i iVar = AbstractC3641oc.i.f34202a;
        if (s.f(abstractC3641oc, iVar)) {
            return KycError.NationalityNotSupported.INSTANCE;
        }
        if (s.f(abstractC3641oc, AbstractC3641oc.j.f34203a)) {
            return KycError.PersonNotAdult.INSTANCE;
        }
        if (!s.f(abstractC3641oc, AbstractC3641oc.f.f34199a) && !s.f(abstractC3641oc, iVar) && !s.f(abstractC3641oc, AbstractC3641oc.c.f34196a) && !s.f(abstractC3641oc, AbstractC3641oc.b.f34195a) && !s.f(abstractC3641oc, AbstractC3641oc.h.f34201a)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Product doesn't support " + abstractC3641oc + " for PostProcessing use-cases at this moment.").toString());
    }
}
