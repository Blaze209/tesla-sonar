package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class Iy implements Z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3289g8 f26398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QA f26400c;

    public Iy(InterfaceC3289g8 repository) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        this.f26398a = repository;
        this.f26399b = repository.l() == null;
        this.f26400c = QA.a.a(QA.f27433a, R.string.step_document_details_label_number_esp_id, 0, 2, null);
    }

    @Override // com.fourthline.orca.internal.Z7
    public C3033a8 a() {
        if (!this.f26399b) {
            return null;
        }
        boolean z11 = false;
        QA.d dVarA = QA.a.a(QA.f27433a, R.string.step_document_details_checkbox_indefinite, 0, 2, null);
        Date dateL = this.f26398a.l();
        if (dateL != null && a(dateL)) {
            z11 = true;
        }
        return new C3033a8(dVarA, z11);
    }

    @Override // com.fourthline.orca.internal.Z7
    public Gh b() {
        Date dateL = this.f26398a.l();
        return (dateL == null || !a(dateL)) ? Gh.UNFOCUSED : Gh.DISABLED;
    }

    @Override // com.fourthline.orca.internal.Z7
    public QA c() {
        return this.f26400c;
    }

    private final boolean a(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(1) == 9999 && calendar.get(2) == 0 && calendar.get(5) == 1;
    }
}
