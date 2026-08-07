package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane;
import com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.exception.LinkException;
import com.plaid.link.exception.LinkInvalidResultException;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountVerificationStatus;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkExitMetadataStatus;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkSuccess;
import com.plaid.link.result.LinkSuccessMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4542t6 f46194a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46196b;

        static {
            int[] iArr = new int[Pane$PaneRendering.b.values().length];
            try {
                iArr[Pane$PaneRendering.b.SINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pane$PaneRendering.b.HEADLESS_O_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46195a = iArr;
            int[] iArr2 = new int[SdkResult$SDKResult.b.values().length];
            try {
                iArr2[SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f46196b = iArr2;
        }
    }

    public A0(InterfaceC4542t6 paneStore) {
        p013kotlin.jvm.internal.s.k(paneStore, "paneStore");
        this.f46194a = paneStore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(N2 n11, ContinuationImpl continuationImpl) {
        B0 b11;
        m8 m8VarF;
        Object objA;
        A0 a11;
        if (continuationImpl instanceof B0) {
            b11 = (B0) continuationImpl;
            int i11 = b11.f46221f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b11.f46221f = i11 - Integer.MIN_VALUE;
            } else {
                b11 = new B0(this, continuationImpl);
            }
        } else {
            b11 = new B0(this, continuationImpl);
        }
        Object obj = b11.f46219d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = b11.f46221f;
        if (i12 == 0) {
            jn0.t.b(obj);
            if (n11 instanceof N2.e) {
                return new AbstractC4590z0.d(((N2.e) n11).i());
            }
            if (n11 instanceof N2.i) {
                return new AbstractC4590z0.c((N2.i) n11);
            }
            if (n11 instanceof N2.k) {
                N2.k kVar = (N2.k) n11;
                if (kVar.m()) {
                    return kVar.i() == null ? a(new D2("Can't open out of process webview without channel info"), n11.h()) : new AbstractC4590z0.h(kVar.k(), kVar.l(), kVar.i());
                }
                return new AbstractC4590z0.k(kVar.k(), kVar.l(), kVar.j());
            }
            if (n11 instanceof N2.d) {
                return new AbstractC4590z0.b(((N2.d) n11).i());
            }
            m8VarF = n11.f();
            InterfaceC4542t6 interfaceC4542t6 = this.f46194a;
            b11.f46216a = this;
            b11.f46217b = n11;
            b11.f46218c = m8VarF;
            b11.f46221f = 1;
            objA = interfaceC4542t6.a(m8VarF, b11);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            a11 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m8 m8Var = b11.f46218c;
            N2 n12 = b11.f46217b;
            A0 a12 = b11.f46216a;
            jn0.t.b(obj);
            m8VarF = m8Var;
            n11 = n12;
            a11 = a12;
            objA = obj;
        }
        Pane$PaneRendering pane$PaneRendering = (Pane$PaneRendering) objA;
        if (pane$PaneRendering == null) {
            C2 c11 = new C2("No pane in response");
            String strH = n11.h();
            a11.getClass();
            return a(c11, strH);
        }
        Pane$PaneRendering.b renderingCase = pane$PaneRendering.getRenderingCase();
        int i13 = renderingCase == null ? -1 : a.f46195a[renderingCase.ordinal()];
        if (i13 == -1) {
            D2 d11 = new D2("Can't render pane because rendering is null");
            String strH2 = n11.h();
            a11.getClass();
            return a(d11, strH2);
        }
        if (i13 == 1) {
            a11.getClass();
            return a(pane$PaneRendering, n11);
        }
        if (i13 == 2) {
            return new AbstractC4590z0.i.a(m8VarF);
        }
        String str = "Native panes are no longer supported: " + pane$PaneRendering.getRenderingCase();
        pane$PaneRendering.getId();
        pane$PaneRendering.getPaneNodeId();
        C2 c12 = new C2(str);
        String strH3 = n11.h();
        a11.getClass();
        return a(c12, strH3);
    }

    public static AbstractC4590z0 a(Pane$PaneRendering pane$PaneRendering, N2 n11) {
        List<Common$SDKEvent> onAppearList;
        if (pane$PaneRendering.hasSink()) {
            SinkPaneOuterClass$SinkPane.Rendering sink = pane$PaneRendering.getSink();
            if (sink.hasResult()) {
                SdkResult$SDKResult result = sink.getResult();
                SinkPaneOuterClass$SinkPane.Rendering.Events events = sink.getEvents();
                if (events != null && (onAppearList = events.getOnAppearList()) != null) {
                    for (Common$SDKEvent common$SDKEvent : onAppearList) {
                        wn0.p<LinkEvent, I2, jn0.h0> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
                        if (linkEventListenerInternal$link_sdk_release != null) {
                            p013kotlin.jvm.internal.s.h(common$SDKEvent);
                            linkEventListenerInternal$link_sdk_release.invoke(N6.a(common$SDKEvent), I2.d.f46349a);
                        }
                    }
                }
                try {
                    SdkResult$SDKResult.b callback = result.getCallback();
                    int i11 = callback == null ? -1 : a.f46196b[callback.ordinal()];
                    if (i11 == 1) {
                        p013kotlin.jvm.internal.s.h(result);
                        String metadataJson = sink.getMetadataJson();
                        p013kotlin.jvm.internal.s.j(metadataJson, "getMetadataJson(...)");
                        return new AbstractC4590z0.j(a(result, metadataJson));
                    }
                    if (i11 == 2) {
                        p013kotlin.jvm.internal.s.h(result);
                        String strA = O2.a(n11);
                        String errorJson = sink.getErrorJson();
                        p013kotlin.jvm.internal.s.j(errorJson, "getErrorJson(...)");
                        String metadataJson2 = sink.getMetadataJson();
                        p013kotlin.jvm.internal.s.j(metadataJson2, "getMetadataJson(...)");
                        return new AbstractC4590z0.d(a(result, strA, errorJson, metadataJson2));
                    }
                    throw new LinkInvalidResultException("Result type not supported by client: " + result.getCallback());
                } catch (Throwable th2) {
                    return a(th2, n11.h());
                }
            }
            pane$PaneRendering.getId();
            pane$PaneRendering.getPaneNodeId();
            return a(new C2("Tried to convert sink pane but result was null"), n11.h());
        }
        pane$PaneRendering.getId();
        pane$PaneRendering.getPaneNodeId();
        return a(new C2("Tried to get sink but didn't exist"), n11.h());
    }

    public static LinkExit a(SdkResult$SDKResult result, String storedRequestId, String errorJson, String metadataJson) {
        LinkExitMetadata metadata;
        p013kotlin.jvm.internal.s.k(result, "result");
        p013kotlin.jvm.internal.s.k(storedRequestId, "storedRequestId");
        p013kotlin.jvm.internal.s.k(errorJson, "errorJson");
        p013kotlin.jvm.internal.s.k(metadataJson, "metadataJson");
        if (result.hasError() && !p013kotlin.jvm.internal.s.f(result.getError().getRequestId(), "")) {
            storedRequestId = result.getError().getRequestId();
        }
        String str = storedRequestId;
        LinkError linkError = null;
        if (result.hasMetadata()) {
            SdkResult$SDKResult.Metadata.Institution institution = result.getMetadata().hasInstitution() ? result.getMetadata().getInstitution() : null;
            String linkSessionId = result.getMetadata().getLinkSessionId();
            String name = institution != null ? institution.getName() : null;
            String institutionId = institution != null ? institution.getInstitutionId() : null;
            String str2 = name;
            metadata = new LinkExitMetadata(LinkExitMetadataStatus.INSTANCE.fromString(result.getMetadata().getStatus()), (institutionId == null || institutionId.length() == 0 || str2 == null || str2.length() == 0) ? null : new LinkInstitution(institutionId, str2), linkSessionId, str, metadataJson);
        } else {
            metadata = L2.a(55, str);
        }
        SdkResult$SDKResult.Error error = result.hasError() ? result.getError() : null;
        if (error != null) {
            String errorCode = error.getErrorCode();
            p013kotlin.jvm.internal.s.j(errorCode, "getErrorCode(...)");
            String errorMessage = error.getErrorMessage();
            p013kotlin.jvm.internal.s.j(errorMessage, "getErrorMessage(...)");
            String displayMessage = error.getDisplayMessage();
            p013kotlin.jvm.internal.s.j(displayMessage, "getDisplayMessage(...)");
            p013kotlin.jvm.internal.s.k(errorCode, "errorCode");
            p013kotlin.jvm.internal.s.k(errorMessage, "errorMessage");
            p013kotlin.jvm.internal.s.k(displayMessage, "displayMessage");
            p013kotlin.jvm.internal.s.k(errorJson, "errorJson");
            linkError = new LinkError(LinkErrorCode.INSTANCE.convert(errorCode), errorMessage, displayMessage, errorJson);
        }
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        return new LinkExit(linkError, metadata);
    }

    public static LinkSuccess a(SdkResult$SDKResult result, String metadataJson) throws LinkException {
        String name;
        p013kotlin.jvm.internal.s.k(result, "result");
        p013kotlin.jvm.internal.s.k(metadataJson, "metadataJson");
        if (result.hasMetadata()) {
            SdkResult$SDKResult.Metadata metadata = result.getMetadata();
            p013kotlin.jvm.internal.s.h(metadata);
            List<SdkResult$SDKResult.Metadata.Account> accountsList = metadata.getAccountsList();
            p013kotlin.jvm.internal.s.j(accountsList, "getAccountsList(...)");
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(accountsList, 10));
            Iterator<T> it = accountsList.iterator();
            while (true) {
                name = null;
                if (!it.hasNext()) {
                    break;
                }
                SdkResult$SDKResult.Metadata.Account account = (SdkResult$SDKResult.Metadata.Account) it.next();
                String accountId = account.getId();
                p013kotlin.jvm.internal.s.j(accountId, "getId(...)");
                String name2 = account.getName();
                String mask = account.getMask();
                LinkAccountSubtype accountSubType = LinkAccountSubtype.INSTANCE.convert(account.getSubtype(), account.getType());
                String verificationStatus = account.getVerificationStatus();
                if (verificationStatus != null && verificationStatus.length() != 0) {
                    name = account.getVerificationStatus();
                }
                p013kotlin.jvm.internal.s.k(accountId, "accountId");
                p013kotlin.jvm.internal.s.k(accountSubType, "accountSubType");
                arrayList.add(new LinkAccount(accountId, name2, mask, accountSubType, LinkAccountVerificationStatus.INSTANCE.convert(name), null, 32, null));
            }
            SdkResult$SDKResult.Metadata.Institution institution = metadata.hasInstitution() ? metadata.getInstitution() : null;
            String institutionId = institution != null ? institution.getInstitutionId() : null;
            name = institution != null ? institution.getName() : null;
            String linkSessionId = metadata.getLinkSessionId();
            p013kotlin.jvm.internal.s.j(linkSessionId, "getLinkSessionId(...)");
            LinkSuccessMetadata linkSuccessMetadataA = L2.a(arrayList, institutionId, name, linkSessionId, metadataJson);
            String publicToken = result.getPublicToken();
            p013kotlin.jvm.internal.s.j(publicToken, "getPublicToken(...)");
            return L2.a(publicToken, linkSuccessMetadataA);
        }
        throw new LinkException("Was successful but returned no data: " + result);
    }

    public static AbstractC4590z0.d a(Throwable th2, String str) {
        X5.a.a(X5.f46812a, th2);
        return new AbstractC4590z0.d(L2.b(th2, str));
    }
}
