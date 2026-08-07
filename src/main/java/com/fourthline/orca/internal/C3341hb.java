package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3341hb implements InterfaceC3298gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3404ix f32267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DocumentType f32268b;

    public C3341hb(C3404ix secondaryDocuments, DocumentType secondaryDocumentType) {
        p013kotlin.jvm.internal.s.k(secondaryDocuments, "secondaryDocuments");
        p013kotlin.jvm.internal.s.k(secondaryDocumentType, "secondaryDocumentType");
        this.f32267a = secondaryDocuments;
        this.f32268b = secondaryDocumentType;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3298gb
    public void a(C2973Va result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        C3404ix c3404ix = this.f32267a;
        List listA = c3404ix.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (((C3363hx) obj).d() != this.f32268b) {
                arrayList.add(obj);
            }
        }
        C3363hx c3363hx = new C3363hx(null, null, null, null, 15, null);
        AbstractC2927Ra.a(c3363hx, result.a());
        jn0.h0 h0Var = jn0.h0.f84049a;
        c3404ix.a(p013kotlin.collections.v.Q0(arrayList, c3363hx));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3341hb)) {
            return false;
        }
        C3341hb c3341hb = (C3341hb) obj;
        return p013kotlin.jvm.internal.s.f(this.f32267a, c3341hb.f32267a) && this.f32268b == c3341hb.f32268b;
    }

    public int hashCode() {
        return (this.f32267a.hashCode() * 31) + this.f32268b.hashCode();
    }

    public String toString() {
        return "DocumentScannerResultRepositoryToKycSecondaryDocumentBundle(secondaryDocuments=" + this.f32267a + ", secondaryDocumentType=" + this.f32268b + ")";
    }
}
