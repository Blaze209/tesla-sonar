package com.stripe.android.financialconnections;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.io.Serializable;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;
import p026y50.h;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u0000 32\u00020\u0001:\u0002\u0012 B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011JF\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010*\u001a\u0004\b+\u0010,R\u0011\u0010.\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b-\u0010#R\u0011\u00102\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00104\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b3\u0010\u0016¨\u00065"}, d2 = {"Lcom/stripe/android/financialconnections/b;", "", "Lcom/stripe/android/financialconnections/launcher/a;", "initialArgs", "", "activityRecreated", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "manifest", "Lcom/stripe/android/financialconnections/b$a;", "webAuthFlowStatus", "Lcom/stripe/android/financialconnections/c;", "viewEffect", "<init>", "(Lcom/stripe/android/financialconnections/launcher/a;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/b$a;Lcom/stripe/android/financialconnections/c;)V", "args", "Landroid/os/Bundle;", "savedState", "(Lcom/stripe/android/financialconnections/launcher/a;Landroid/os/Bundle;)V", "a", "(Lcom/stripe/android/financialconnections/launcher/a;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/b$a;Lcom/stripe/android/financialconnections/c;)Lcom/stripe/android/financialconnections/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/financialconnections/launcher/a;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/financialconnections/launcher/a;", "b", "Z", "c", "()Z", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "e", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "Lcom/stripe/android/financialconnections/b$a;", IntegerTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/financialconnections/b$a;", "Lcom/stripe/android/financialconnections/c;", "h", "()Lcom/stripe/android/financialconnections/c;", "j", "isInstantDebits", "Ly50/h;", "g", "()Ly50/h;", "theme", "f", "sessionSecret", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FinancialConnectionsSheetState {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f50149g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final com.stripe.android.financialconnections.launcher.a initialArgs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean activityRecreated;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsSessionManifest manifest;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final a webAuthFlowStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final c viewEffect;

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.b$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "ON_EXTERNAL_ACTIVITY", "INTERMEDIATE_DEEPLINK", "NONE", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum a {
        ON_EXTERNAL_ACTIVITY,
        INTERMEDIATE_DEEPLINK,
        NONE;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    public FinancialConnectionsSheetState(com.stripe.android.financialconnections.launcher.a initialArgs, boolean z11, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, a webAuthFlowStatus, c cVar) {
        s.k(initialArgs, "initialArgs");
        s.k(webAuthFlowStatus, "webAuthFlowStatus");
        this.initialArgs = initialArgs;
        this.activityRecreated = z11;
        this.manifest = financialConnectionsSessionManifest;
        this.webAuthFlowStatus = webAuthFlowStatus;
        this.viewEffect = cVar;
    }

    public static /* synthetic */ FinancialConnectionsSheetState b(FinancialConnectionsSheetState financialConnectionsSheetState, com.stripe.android.financialconnections.launcher.a aVar, boolean z11, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, a aVar2, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = financialConnectionsSheetState.initialArgs;
        }
        if ((i11 & 2) != 0) {
            z11 = financialConnectionsSheetState.activityRecreated;
        }
        if ((i11 & 4) != 0) {
            financialConnectionsSessionManifest = financialConnectionsSheetState.manifest;
        }
        if ((i11 & 8) != 0) {
            aVar2 = financialConnectionsSheetState.webAuthFlowStatus;
        }
        if ((i11 & 16) != 0) {
            cVar = financialConnectionsSheetState.viewEffect;
        }
        c cVar2 = cVar;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = financialConnectionsSessionManifest;
        return financialConnectionsSheetState.a(aVar, z11, financialConnectionsSessionManifest2, aVar2, cVar2);
    }

    public final FinancialConnectionsSheetState a(com.stripe.android.financialconnections.launcher.a initialArgs, boolean activityRecreated, FinancialConnectionsSessionManifest manifest, a webAuthFlowStatus, c viewEffect) {
        s.k(initialArgs, "initialArgs");
        s.k(webAuthFlowStatus, "webAuthFlowStatus");
        return new FinancialConnectionsSheetState(initialArgs, activityRecreated, manifest, webAuthFlowStatus, viewEffect);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getActivityRecreated() {
        return this.activityRecreated;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.stripe.android.financialconnections.launcher.a getInitialArgs() {
        return this.initialArgs;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final FinancialConnectionsSessionManifest getManifest() {
        return this.manifest;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsSheetState)) {
            return false;
        }
        FinancialConnectionsSheetState financialConnectionsSheetState = (FinancialConnectionsSheetState) other;
        return s.f(this.initialArgs, financialConnectionsSheetState.initialArgs) && this.activityRecreated == financialConnectionsSheetState.activityRecreated && s.f(this.manifest, financialConnectionsSheetState.manifest) && this.webAuthFlowStatus == financialConnectionsSheetState.webAuthFlowStatus && s.f(this.viewEffect, financialConnectionsSheetState.viewEffect);
    }

    public final String f() {
        return this.initialArgs.getConfiguration().getFinancialConnectionsSessionClientSecret();
    }

    public final h g() {
        return j() ? h.LinkLight : h.DefaultLight;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final c getViewEffect() {
        return this.viewEffect;
    }

    public int hashCode() {
        int iHashCode = ((this.initialArgs.hashCode() * 31) + Boolean.hashCode(this.activityRecreated)) * 31;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = this.manifest;
        int iHashCode2 = (((iHashCode + (financialConnectionsSessionManifest == null ? 0 : financialConnectionsSessionManifest.hashCode())) * 31) + this.webAuthFlowStatus.hashCode()) * 31;
        c cVar = this.viewEffect;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final a getWebAuthFlowStatus() {
        return this.webAuthFlowStatus;
    }

    public final boolean j() {
        return this.initialArgs instanceof com.stripe.android.financialconnections.launcher.a.ForInstantDebits;
    }

    public String toString() {
        return "FinancialConnectionsSheetState(initialArgs=" + this.initialArgs + ", activityRecreated=" + this.activityRecreated + ", manifest=" + this.manifest + ", webAuthFlowStatus=" + this.webAuthFlowStatus + ", viewEffect=" + this.viewEffect + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FinancialConnectionsSheetState(com.stripe.android.financialconnections.launcher.a args, Bundle bundle) {
        s.k(args, "args");
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = bundle != null ? (FinancialConnectionsSessionManifest) bundle.getParcelable("financial_connections_sheet_manifest") : null;
        Serializable serializable = bundle != null ? bundle.getSerializable("financial_connections_sheet_web_auth_flow_status") : null;
        a aVar = serializable instanceof a ? (a) serializable : null;
        this(args, false, financialConnectionsSessionManifest, aVar == null ? a.NONE : aVar, null);
    }
}
