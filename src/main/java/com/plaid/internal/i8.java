package com.plaid.internal;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.protobuf.Timestamp;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata;
import java.util.List;
import java.util.UUID;
import okhttp3.HttpUrl;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes6.dex */
public final class i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f47746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PackageManager f47747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f47748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4353b3 f47749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f47750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f47751j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Lazy f47752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f47753l;

    public i8(String str, String androidVersionName, String str2, String str3, String str4, String packageName, String linkRedirectUrl, PackageManager packageManager, String str5, C4353b3 workflowVersionOverride) {
        O4 deviceInfo = O4.f46551a;
        p013kotlin.jvm.internal.s.k(deviceInfo, "deviceInfo");
        p013kotlin.jvm.internal.s.k(androidVersionName, "androidVersionName");
        p013kotlin.jvm.internal.s.k(packageName, "packageName");
        p013kotlin.jvm.internal.s.k(linkRedirectUrl, "linkRedirectUrl");
        p013kotlin.jvm.internal.s.k(packageManager, "packageManager");
        p013kotlin.jvm.internal.s.k(workflowVersionOverride, "workflowVersionOverride");
        this.f47742a = androidVersionName;
        this.f47743b = str2;
        this.f47744c = str3;
        this.f47745d = str4;
        this.f47746e = packageName;
        this.f47747f = packageManager;
        this.f47748g = str5;
        this.f47749h = workflowVersionOverride;
        this.f47750i = jn0.m.b(e8.f47641a);
        this.f47751j = jn0.m.b(new g8(str));
        this.f47752k = jn0.m.b(new f8(this));
        this.f47753l = jn0.m.b(new h8(this));
    }

    public final Workflow$LinkWorkflowStartRequest a(N2.a linkState) {
        p013kotlin.jvm.internal.s.k(linkState, "linkState");
        M0 m11 = linkState.f46472b;
        p013kotlin.jvm.internal.s.k(m11, "<this>");
        Configuration$LinkTokenConfiguration.a aVarA = Configuration$LinkTokenConfiguration.newBuilder().e(m11.f46441a).c(m11.f46442b).d(m11.f46443c).b(m11.f46444d).f(m11.f46445e).a(m11.f46446f).a(m11.f46447g);
        L0 l11 = m11.f46448h;
        if (l11 != null) {
            p013kotlin.jvm.internal.s.k(l11, "<this>");
            Configuration$EmbeddedOpenLinkConfiguration.a aVarA2 = Configuration$EmbeddedOpenLinkConfiguration.newBuilder().a(l11.f46413a).a(l11.f46417e);
            if (l11.f46414b != null) {
                aVarA2.a(Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.newBuilder().build());
            } else if (l11.f46416d != null) {
                aVarA2.a(Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.newBuilder().build());
            } else if (l11.f46415c != null) {
                aVarA2.a(Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.newBuilder().a(l11.f46415c.f46379a).build());
            }
            Configuration$EmbeddedOpenLinkConfiguration configuration$EmbeddedOpenLinkConfigurationBuild = aVarA2.build();
            p013kotlin.jvm.internal.s.j(configuration$EmbeddedOpenLinkConfigurationBuild, "build(...)");
            aVarA.a(configuration$EmbeddedOpenLinkConfigurationBuild);
        }
        p013kotlin.jvm.internal.s.h(aVarA);
        Configuration$LinkTokenConfiguration configuration$LinkTokenConfigurationBuild = aVarA.a((Configuration$PlatformIdentifierConfiguration) this.f47751j.getValue()).build();
        p013kotlin.jvm.internal.s.h(configuration$LinkTokenConfigurationBuild);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = 1000;
        Timestamp timestampBuild = Timestamp.newBuilder().setSeconds(jCurrentTimeMillis / j11).setNanos((int) ((jCurrentTimeMillis % j11) * ((long) 1000000))).build();
        p013kotlin.jvm.internal.s.j(timestampBuild, "build(...)");
        PackageManager packageManager = this.f47747f;
        p013kotlin.jvm.internal.s.k(packageManager, "packageManager");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        p013kotlin.jvm.internal.s.j(listQueryIntentServices, "queryIntentServices(...)");
        Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestBuild = a().a(timestampBuild).a(configuration$LinkTokenConfigurationBuild).a(Configuration$ClientCapabilities.newBuilder().a(listQueryIntentServices.isEmpty()).build()).build();
        p013kotlin.jvm.internal.s.j(workflow$LinkWorkflowStartRequestBuild, "build(...)");
        return workflow$LinkWorkflowStartRequestBuild;
    }

    public final Workflow$LinkWorkflowStartRequest a(N2.b linkState, boolean z11) {
        p013kotlin.jvm.internal.s.k(linkState, "linkState");
        Configuration$LinkTokenConfiguration.a aVarE = Configuration$LinkTokenConfiguration.newBuilder().c(linkState.f46477b).e(linkState.f46478c.getToken());
        String str = this.f47745d;
        if (str == null) {
            str = "";
        }
        Configuration$LinkTokenConfiguration.a aVarA = aVarE.d(str).a((Configuration$PlatformIdentifierConfiguration) this.f47751j.getValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = 1000;
        Timestamp timestampBuild = Timestamp.newBuilder().setSeconds(jCurrentTimeMillis / j11).setNanos((int) ((jCurrentTimeMillis % j11) * ((long) 1000000))).build();
        p013kotlin.jvm.internal.s.j(timestampBuild, "build(...)");
        PackageManager packageManager = this.f47747f;
        p013kotlin.jvm.internal.s.k(packageManager, "packageManager");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        p013kotlin.jvm.internal.s.j(listQueryIntentServices, "queryIntentServices(...)");
        Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestBuild = a().a(timestampBuild).a(aVarA).a(Configuration$ClientCapabilities.newBuilder().a(listQueryIntentServices.isEmpty()).b(z11).build()).build();
        p013kotlin.jvm.internal.s.j(workflow$LinkWorkflowStartRequestBuild, "build(...)");
        return workflow$LinkWorkflowStartRequestBuild;
    }

    public final Workflow$LinkWorkflowStartRequest.a a() {
        Workflow$LinkWorkflowStartRequest.a aVarA = Workflow$LinkWorkflowStartRequest.newBuilder().a((Configuration$SDKMetadata) this.f47753l.getValue()).a((Configuration$DeviceMetadata) this.f47752k.getValue());
        this.f47749h.invoke();
        return aVarA.a("");
    }

    public final Workflow$LinkWorkflowStartRequest a(String linkToken) {
        p013kotlin.jvm.internal.s.k(linkToken, "linkToken");
        Configuration$EmbeddedLinkTokenConfiguration.a aVarC = Configuration$EmbeddedLinkTokenConfiguration.newBuilder().a(UUID.randomUUID().toString()).c(linkToken);
        String str = this.f47745d;
        if (str == null) {
            str = "";
        }
        Configuration$EmbeddedLinkTokenConfiguration.a aVarA = aVarC.b(str).a((Configuration$PlatformIdentifierConfiguration) this.f47751j.getValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = 1000;
        Timestamp timestampBuild = Timestamp.newBuilder().setSeconds(jCurrentTimeMillis / j11).setNanos((int) ((jCurrentTimeMillis % j11) * ((long) 1000000))).build();
        p013kotlin.jvm.internal.s.j(timestampBuild, "build(...)");
        PackageManager packageManager = this.f47747f;
        p013kotlin.jvm.internal.s.k(packageManager, "packageManager");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        p013kotlin.jvm.internal.s.j(listQueryIntentServices, "queryIntentServices(...)");
        Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestBuild = a().a(timestampBuild).a(aVarA).a(Configuration$ClientCapabilities.newBuilder().a(listQueryIntentServices.isEmpty()).build()).build();
        p013kotlin.jvm.internal.s.j(workflow$LinkWorkflowStartRequestBuild, "build(...)");
        return workflow$LinkWorkflowStartRequestBuild;
    }

    public final Workflow$LinkWorkflowStartRequest a(N2.k linkState, AbstractC4587y6.a result) {
        p013kotlin.jvm.internal.s.k(linkState, "linkState");
        p013kotlin.jvm.internal.s.k(result, "result");
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        String strQueryParameter = companion.get(linkState.f46516f).queryParameter("token");
        String strQueryParameter2 = companion.get(linkState.f46516f).queryParameter("oauthNonce");
        String queryParameter = null;
        if (strQueryParameter == null || !p013kotlin.text.t.b0(strQueryParameter, "link-", false, 2, null)) {
            strQueryParameter = "";
        }
        Workflow$LinkWorkflowStartRequest.a aVarA = a();
        Workflow$LinkWorkflowStartRequest.OAuthContinuation.a aVarA2 = Workflow$LinkWorkflowStartRequest.OAuthContinuation.newBuilder().b(result.f48245a).a(strQueryParameter);
        Workflow$LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a aVarNewBuilder = Workflow$LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.newBuilder();
        try {
            Uri uri = Uri.parse(result.f48245a);
            if (uri != null) {
                queryParameter = uri.getQueryParameter("oauth_state_id");
            }
        } catch (Exception unused) {
        }
        if (queryParameter == null) {
            queryParameter = "";
        }
        Workflow$LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a aVarB = aVarNewBuilder.b(queryParameter);
        if (strQueryParameter2 == null) {
            strQueryParameter2 = "";
        }
        Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestBuild = aVarA.a(aVarA2.a(aVarB.a(strQueryParameter2))).build();
        p013kotlin.jvm.internal.s.j(workflow$LinkWorkflowStartRequestBuild, "build(...)");
        return workflow$LinkWorkflowStartRequestBuild;
    }
}
