package com.fourthline.vision.document.ocr;

import com.fourthline.core.CountryNetworkModel;
import com.fourthline.core.DocumentType;
import com.fourthline.core.internal.ExtensionsKt;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.w;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;
import wn0.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B\u001d\u0012\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u00020\u0004*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/fourthline/vision/document/ocr/OcrCountryAndTypeValidator;", "Lcom/fourthline/vision/document/ocr/OcrValidator;", "Ljn0/w;", "", "Lcom/fourthline/core/DocumentType;", "Lkotlin/Function0;", "", "Lcom/fourthline/core/CountryNetworkModel;", "supportedCountriesFactory", "<init>", "(Lwn0/a;)V", "value", "", "Lcom/fourthline/vision/document/ocr/OcrValidationError;", "validate", "(Ljn0/w;)Ljava/util/Set;", "Lwn0/a;", "getSupportedCountries", "()Ljava/util/List;", "supportedCountries", "getSimplified", "(Lcom/fourthline/core/DocumentType;)Lcom/fourthline/core/DocumentType;", "simplified", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OcrCountryAndTypeValidator implements OcrValidator<w<? extends String, ? extends DocumentType, ? extends String>> {
    public static final int $stable = 0;
    private final a<List<CountryNetworkModel>> supportedCountriesFactory;

    /* JADX WARN: Multi-variable type inference failed */
    public OcrCountryAndTypeValidator(a<? extends List<CountryNetworkModel>> supportedCountriesFactory) {
        s.k(supportedCountriesFactory, "supportedCountriesFactory");
        this.supportedCountriesFactory = supportedCountriesFactory;
    }

    private final DocumentType getSimplified(DocumentType documentType) {
        return documentType == DocumentType.FRENCH_ID_CARD ? DocumentType.ID_CARD : documentType;
    }

    private final List<CountryNetworkModel> getSupportedCountries() {
        return this.supportedCountriesFactory.invoke();
    }

    @Override // com.fourthline.vision.document.ocr.OcrValidator
    public /* bridge */ /* synthetic */ Set validate(w<? extends String, ? extends DocumentType, ? extends String> wVar) {
        return validate2((w<String, ? extends DocumentType, String>) wVar);
    }

    /* JADX INFO: renamed from: validate, reason: avoid collision after fix types in other method */
    public Set<OcrValidationError> validate2(w<String, ? extends DocumentType, String> value) {
        Object obj;
        Object next;
        CountryNetworkModel.Document document;
        List<String> nationalities;
        List<CountryNetworkModel.Document> idDocuments;
        Object next2;
        s.k(value, "value");
        List<CountryNetworkModel> supportedCountries = getSupportedCountries();
        if (supportedCountries == null) {
            return d1.d();
        }
        String strF = value.f();
        Iterator<T> it = supportedCountries.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.f(((CountryNetworkModel) next).getIssuingCountry(), ExtensionsKt.alpha3Code(value.d())));
        CountryNetworkModel countryNetworkModel = (CountryNetworkModel) next;
        if (countryNetworkModel == null || (idDocuments = countryNetworkModel.getIdDocuments()) == null) {
            document = null;
        } else {
            Iterator<T> it2 = idDocuments.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (getSimplified(((CountryNetworkModel.Document) next2).getType()) != getSimplified(value.e()));
            document = (CountryNetworkModel.Document) next2;
        }
        if (document != null && (nationalities = document.getNationalities()) != null) {
            for (Object obj2 : nationalities) {
                String str = (String) obj2;
                String strF2 = value.f();
                if (s.f(str, strF2 != null ? ExtensionsKt.alpha3Code(strF2) : null)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (String) obj;
        }
        if (countryNetworkModel == null) {
            return d1.c(OcrValidationError.ISSUING_COUNTRY_NOT_SUPPORTED);
        }
        if (document == null) {
            return d1.c(OcrValidationError.DOCUMENT_TYPE_NOT_SUPPORTED);
        }
        return (obj != null || strF == null) ? d1.d() : d1.c(OcrValidationError.NATIONALITY_NOT_SUPPORTED);
    }
}
