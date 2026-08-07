package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModel;
import com.fourthline.core.DocumentType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.x9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4019x9 implements C3991wi.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f36686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DocumentFlowConfig f36687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4104z8 f36688c;

    public C4019x9(List countries, DocumentFlowConfig flowConfig, C4104z8 dataBundle) {
        p013kotlin.jvm.internal.s.k(countries, "countries");
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        this.f36686a = countries;
        this.f36687b = flowConfig;
        this.f36688c = dataBundle;
    }

    private final void b(C3991wi c3991wi) {
        c3991wi.d().a(c3991wi.a().b());
    }

    private final void c(C3991wi c3991wi) {
        Object obj;
        Object next;
        Iterator it = this.f36687b.getSupportedDocuments().iterator();
        loop0: while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List<CountryNetworkModel.Document> idDocuments = ((CountryNetworkModel) next).getIdDocuments();
            if (!(idDocuments instanceof Collection) || !idDocuments.isEmpty()) {
                Iterator<T> it2 = idDocuments.iterator();
                while (it2.hasNext()) {
                    if (((CountryNetworkModel.Document) it2.next()).getType() == DocumentType.ID_CARD) {
                        break loop0;
                    }
                }
            }
        }
        CountryNetworkModel countryNetworkModel = (CountryNetworkModel) next;
        if (countryNetworkModel == null) {
            b(c3991wi);
            return;
        }
        for (G5 g11 : this.f36686a) {
            if (p013kotlin.jvm.internal.s.f(g11.c(), countryNetworkModel.getIssuingCountry())) {
                this.f36688c.a(g11);
                C4104z8 c4104z8 = this.f36688c;
                for (Object obj2 : X7.f29693e.a(g11, this.f36687b.getSupportedDocuments())) {
                    if (((X7) obj2).c() == DocumentType.ID_CARD) {
                        obj = obj2;
                        break;
                    }
                }
                c4104z8.a((X7) obj);
                c3991wi.d().a(new C3733qi(new InterfaceC3726qb.c(new C3085bb(this.f36687b.getDocumentStrategy(), this.f36687b.getTiltedStepsEnabled(), this.f36687b.getConfirmation(), this.f36687b.getImageCapture(), this.f36687b.getVideo(), this.f36687b.getAnalysis(), this.f36687b.getNfc(), this.f36687b.getSupportedDocuments(), this.f36687b.getCameraX().getEnabled()))));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // com.fourthline.orca.internal.C3991wi.c
    public void a(C3991wi c3991wi) {
        p013kotlin.jvm.internal.s.k(c3991wi, "<this>");
        if (this.f36687b.getDocumentStrategy().a(C3632o9.f34099a.c())) {
            c(c3991wi);
        } else {
            b(c3991wi);
        }
    }
}
