package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.core.DocumentType;
import com.fourthline.nfc.NfcScannerError;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4125zn implements InterfaceC3354ho {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.zn$a */
    public interface a extends InterfaceC3354ho.a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.zn$a$a, reason: collision with other inner class name */
        public static final class C0629a {
            public static Map a(a aVar) {
                return InterfaceC3354ho.a.C0566a.a(aVar);
            }

            public static String b(a aVar) {
                return InterfaceC3354ho.a.C0566a.b(aVar);
            }

            public static String c(a aVar) {
                return InterfaceC3354ho.a.C0566a.c(aVar);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.zn$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final DocumentType f37308a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final G5 f37309b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final NfcScannerError f37310c;

            public b(DocumentType documentType, G5 selectedCountry, NfcScannerError error) {
                p013kotlin.jvm.internal.s.k(documentType, "documentType");
                p013kotlin.jvm.internal.s.k(selectedCountry, "selectedCountry");
                p013kotlin.jvm.internal.s.k(error, "error");
                this.f37308a = documentType;
                this.f37309b = selectedCountry;
                this.f37310c = error;
            }

            public final DocumentType a() {
                return this.f37308a;
            }

            public final NfcScannerError b() {
                return this.f37310c;
            }

            public final G5 c() {
                return this.f37309b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f37308a == bVar.f37308a && p013kotlin.jvm.internal.s.f(this.f37309b, bVar.f37309b) && this.f37310c == bVar.f37310c;
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public Map getAttributes() {
                return C0629a.a(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getEventName() {
                return C0629a.b(this);
            }

            @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
            public String getSchema() {
                return C0629a.c(this);
            }

            public int hashCode() {
                return (((this.f37308a.hashCode() * 31) + this.f37309b.hashCode()) * 31) + this.f37310c.hashCode();
            }

            public String toString() {
                return "OnFail(documentType=" + this.f37308a + ", selectedCountry=" + this.f37309b + ", error=" + this.f37310c + ")";
            }
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3354ho
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void track(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (!(event instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar = (a.b) event;
        a(bVar.a(), bVar.c(), bVar.b());
    }

    private final void a(DocumentType documentType, G5 g11, NfcScannerError nfcScannerError) {
        C3103bt.a(C3103bt.f30707a, "orca_nfc_results_error", null, p013kotlin.collections.v0.m(a(documentType), g11.d(), jn0.x.a("orca_error", AbstractC3989wg.a(nfcScannerError))), 2, null);
    }

    private final Pair a(DocumentType documentType) {
        return jn0.x.a(AnalyticsAttribute.DocumentType, AbstractC3989wg.a(documentType));
    }
}
