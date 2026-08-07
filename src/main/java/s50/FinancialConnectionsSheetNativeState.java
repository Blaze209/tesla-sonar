package s50;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import l50.FinancialConnectionsSheetNativeActivityArgs;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: s50.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0080\b\u0018\u0000 '2\u00020\u0001:\u0001\u001bBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0082\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b1\u0010,R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b+\u00104\u001a\u0004\b5\u00106R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b-\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b1\u00108\u001a\u0004\b7\u00109R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b3\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b=\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b5\u0010>\u001a\u0004\b2\u0010?¨\u0006@"}, d2 = {"Ls50/c;", "", "Ls50/j;", "webAuthFlow", "", "firstInit", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "reducedBranding", "testMode", "Ls50/d;", "viewEffect", "completed", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "initialPane", "Ly50/h;", "theme", "isLinkWithStripe", "Lcom/stripe/android/financialconnections/a$c;", "elementsSessionContext", "<init>", "(Ls50/j;ZLcom/stripe/android/financialconnections/a$b;ZZLs50/d;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ly50/h;ZLcom/stripe/android/financialconnections/a$c;)V", "Ll50/e;", "args", "Landroid/os/Bundle;", "savedState", "(Ll50/e;Landroid/os/Bundle;)V", "a", "(Ls50/j;ZLcom/stripe/android/financialconnections/a$b;ZZLs50/d;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ly50/h;ZLcom/stripe/android/financialconnections/a$c;)Ls50/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ls50/j;", "l", "()Ls50/j;", "b", "Z", "f", "()Z", "c", "Lcom/stripe/android/financialconnections/a$b;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/financialconnections/a$b;", "h", "e", IntegerTokenConverter.CONVERTER_KEY, "Ls50/d;", "k", "()Ls50/d;", "g", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "Ly50/h;", "j", "()Ly50/h;", "m", "Lcom/stripe/android/financialconnections/a$c;", "()Lcom/stripe/android/financialconnections/a$c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FinancialConnectionsSheetNativeState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final j webAuthFlow;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean firstInit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean reducedBranding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean testMode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final d viewEffect;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean completed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsSessionManifest.Pane initialPane;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final p026y50.h theme;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLinkWithStripe;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext;

    public FinancialConnectionsSheetNativeState(j webAuthFlow, boolean z11, com.stripe.android.financialconnections.a.Configuration configuration, boolean z12, boolean z13, d dVar, boolean z14, FinancialConnectionsSessionManifest.Pane initialPane, p026y50.h theme, boolean z15, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext) {
        s.k(webAuthFlow, "webAuthFlow");
        s.k(configuration, "configuration");
        s.k(initialPane, "initialPane");
        s.k(theme, "theme");
        this.webAuthFlow = webAuthFlow;
        this.firstInit = z11;
        this.configuration = configuration;
        this.reducedBranding = z12;
        this.testMode = z13;
        this.viewEffect = dVar;
        this.completed = z14;
        this.initialPane = initialPane;
        this.theme = theme;
        this.isLinkWithStripe = z15;
        this.elementsSessionContext = elementsSessionContext;
    }

    public static /* synthetic */ FinancialConnectionsSheetNativeState b(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, j jVar, boolean z11, com.stripe.android.financialconnections.a.Configuration configuration, boolean z12, boolean z13, d dVar, boolean z14, FinancialConnectionsSessionManifest.Pane pane, p026y50.h hVar, boolean z15, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jVar = financialConnectionsSheetNativeState.webAuthFlow;
        }
        if ((i11 & 2) != 0) {
            z11 = financialConnectionsSheetNativeState.firstInit;
        }
        if ((i11 & 4) != 0) {
            configuration = financialConnectionsSheetNativeState.configuration;
        }
        if ((i11 & 8) != 0) {
            z12 = financialConnectionsSheetNativeState.reducedBranding;
        }
        if ((i11 & 16) != 0) {
            z13 = financialConnectionsSheetNativeState.testMode;
        }
        if ((i11 & 32) != 0) {
            dVar = financialConnectionsSheetNativeState.viewEffect;
        }
        if ((i11 & 64) != 0) {
            z14 = financialConnectionsSheetNativeState.completed;
        }
        if ((i11 & 128) != 0) {
            pane = financialConnectionsSheetNativeState.initialPane;
        }
        if ((i11 & 256) != 0) {
            hVar = financialConnectionsSheetNativeState.theme;
        }
        if ((i11 & 512) != 0) {
            z15 = financialConnectionsSheetNativeState.isLinkWithStripe;
        }
        if ((i11 & 1024) != 0) {
            elementsSessionContext = financialConnectionsSheetNativeState.elementsSessionContext;
        }
        boolean z16 = z15;
        com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext2 = elementsSessionContext;
        FinancialConnectionsSessionManifest.Pane pane2 = pane;
        p026y50.h hVar2 = hVar;
        d dVar2 = dVar;
        boolean z17 = z14;
        boolean z18 = z13;
        com.stripe.android.financialconnections.a.Configuration configuration2 = configuration;
        return financialConnectionsSheetNativeState.a(jVar, z11, configuration2, z12, z18, dVar2, z17, pane2, hVar2, z16, elementsSessionContext2);
    }

    public final FinancialConnectionsSheetNativeState a(j webAuthFlow, boolean firstInit, com.stripe.android.financialconnections.a.Configuration configuration, boolean reducedBranding, boolean testMode, d viewEffect, boolean completed, FinancialConnectionsSessionManifest.Pane initialPane, p026y50.h theme, boolean isLinkWithStripe, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext) {
        s.k(webAuthFlow, "webAuthFlow");
        s.k(configuration, "configuration");
        s.k(initialPane, "initialPane");
        s.k(theme, "theme");
        return new FinancialConnectionsSheetNativeState(webAuthFlow, firstInit, configuration, reducedBranding, testMode, viewEffect, completed, initialPane, theme, isLinkWithStripe, elementsSessionContext);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCompleted() {
        return this.completed;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final com.stripe.android.financialconnections.a.Configuration getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final com.stripe.android.financialconnections.a.ElementsSessionContext getElementsSessionContext() {
        return this.elementsSessionContext;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsSheetNativeState)) {
            return false;
        }
        FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState = (FinancialConnectionsSheetNativeState) other;
        return s.f(this.webAuthFlow, financialConnectionsSheetNativeState.webAuthFlow) && this.firstInit == financialConnectionsSheetNativeState.firstInit && s.f(this.configuration, financialConnectionsSheetNativeState.configuration) && this.reducedBranding == financialConnectionsSheetNativeState.reducedBranding && this.testMode == financialConnectionsSheetNativeState.testMode && s.f(this.viewEffect, financialConnectionsSheetNativeState.viewEffect) && this.completed == financialConnectionsSheetNativeState.completed && this.initialPane == financialConnectionsSheetNativeState.initialPane && this.theme == financialConnectionsSheetNativeState.theme && this.isLinkWithStripe == financialConnectionsSheetNativeState.isLinkWithStripe && s.f(this.elementsSessionContext, financialConnectionsSheetNativeState.elementsSessionContext);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getFirstInit() {
        return this.firstInit;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getInitialPane() {
        return this.initialPane;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getReducedBranding() {
        return this.reducedBranding;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.webAuthFlow.hashCode() * 31) + Boolean.hashCode(this.firstInit)) * 31) + this.configuration.hashCode()) * 31) + Boolean.hashCode(this.reducedBranding)) * 31) + Boolean.hashCode(this.testMode)) * 31;
        d dVar = this.viewEffect;
        int iHashCode2 = (((((((((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + Boolean.hashCode(this.completed)) * 31) + this.initialPane.hashCode()) * 31) + this.theme.hashCode()) * 31) + Boolean.hashCode(this.isLinkWithStripe)) * 31;
        com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
        return iHashCode2 + (elementsSessionContext != null ? elementsSessionContext.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getTestMode() {
        return this.testMode;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final p026y50.h getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final d getViewEffect() {
        return this.viewEffect;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final j getWebAuthFlow() {
        return this.webAuthFlow;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsLinkWithStripe() {
        return this.isLinkWithStripe;
    }

    public String toString() {
        return "FinancialConnectionsSheetNativeState(webAuthFlow=" + this.webAuthFlow + ", firstInit=" + this.firstInit + ", configuration=" + this.configuration + ", reducedBranding=" + this.reducedBranding + ", testMode=" + this.testMode + ", viewEffect=" + this.viewEffect + ", completed=" + this.completed + ", initialPane=" + this.initialPane + ", theme=" + this.theme + ", isLinkWithStripe=" + this.isLinkWithStripe + ", elementsSessionContext=" + this.elementsSessionContext + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FinancialConnectionsSheetNativeState(FinancialConnectionsSheetNativeActivityArgs args, Bundle bundle) {
        p026y50.h hVarI;
        j jVar;
        s.k(args, "args");
        j jVar2 = (bundle == null || (jVar = (j) bundle.getParcelable("webAuthFlow")) == null) ? j.e.f110334a : jVar;
        boolean reducedBranding = args.getInitialSyncResponse().getVisual().getReducedBranding();
        boolean z11 = !args.getInitialSyncResponse().getManifest().getLivemode();
        boolean z12 = bundle != null ? bundle.getBoolean("firstInit", true) : true;
        FinancialConnectionsSessionManifest.Pane nextPane = args.getInitialSyncResponse().getManifest().getNextPane();
        com.stripe.android.financialconnections.a.Configuration configuration = args.getConfiguration();
        FinancialConnectionsSessionManifest.Theme theme = args.getInitialSyncResponse().getManifest().getTheme();
        p026y50.h hVarA = (theme == null || (hVarI = v50.b.i(theme)) == null) ? p026y50.h.INSTANCE.a() : hVarI;
        Boolean isLinkWithStripe = args.getInitialSyncResponse().getManifest().getIsLinkWithStripe();
        boolean zBooleanValue = isLinkWithStripe != null ? isLinkWithStripe.booleanValue() : false;
        com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext = args.getElementsSessionContext();
        s.h(jVar2);
        this(jVar2, z12, configuration, reducedBranding, z11, null, false, nextPane, hVarA, zBooleanValue, elementsSessionContext);
    }
}
