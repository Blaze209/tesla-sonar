package com.plaid.internal;

import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;

/* JADX INFO: renamed from: com.plaid.internal.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4590z0 {

    /* JADX INFO: renamed from: com.plaid.internal.z0$a */
    public static final class a extends AbstractC4590z0 {
    }

    /* JADX INFO: renamed from: com.plaid.internal.z0$b */
    public static final class b extends AbstractC4590z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f48252a;

        public b(boolean z11) {
            this.f48252a = z11;
        }

        public final boolean a() {
            return this.f48252a;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.z0$c */
    public static final class c extends AbstractC4590z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final N2.i f48253a;

        public c(N2.i error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f48253a = error;
        }

        public final N2.i a() {
            return this.f48253a;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.z0$d */
    public static final class d extends AbstractC4590z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkExit f48254a;

        public d(LinkExit exit) {
            p013kotlin.jvm.internal.s.k(exit, "exit");
            this.f48254a = exit;
        }

        public final LinkExit a() {
            return this.f48254a;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.z0$e */
    public static final class e extends AbstractC4590z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f48255a = new e();
    }

    /* JADX INFO: renamed from: com.plaid.internal.z0$f */
    public static final class f extends AbstractC4590z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48256a;

        public f(String url) {
            p013kotlin.jvm.internal.s.k(url, "url");
            this.f48256a = url;
        }

        public final String a() {
            return this.f48256a;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.z0$g */
    public static final class g extends AbstractC4590z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC4531s4 f48257a;

        public g(AbstractC4531s4 openMethod) {
            p013kotlin.jvm.internal.s.k(openMethod, "openMethod");
            this.f48257a = openMethod;
        }

        public final AbstractC4531s4 a() {
            return this.f48257a;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.z0$h */
    public static final class h extends AbstractC4590z0 {
        public h(String url, String webviewFallbackId, A channelInfo) {
            p013kotlin.jvm.internal.s.k(url, "url");
            p013kotlin.jvm.internal.s.k(webviewFallbackId, "webviewFallbackId");
            p013kotlin.jvm.internal.s.k(channelInfo, "channelInfo");
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.z0$i */
    public static abstract class i<F extends k8<?>> extends AbstractC4590z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.C0761a f48258a;

        /* JADX INFO: renamed from: com.plaid.internal.z0$i$a */
        public static final class a extends i<C4457k1> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final m8 f48259b;

            /* JADX INFO: renamed from: com.plaid.internal.z0$i$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0761a extends p013kotlin.jvm.internal.p implements wn0.l<m8, C4457k1> {
                public C0761a(l8 l8Var) {
                    super(1, l8Var, l8.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // wn0.l
                public final C4457k1 invoke(m8 m8Var) {
                    m8 paneId = m8Var;
                    p013kotlin.jvm.internal.s.k(paneId, "p0");
                    int i11 = k8.f47814d;
                    k8 k8Var = (k8) C4457k1.class.newInstance();
                    k8Var.getClass();
                    p013kotlin.jvm.internal.s.k(paneId, "paneId");
                    p013kotlin.jvm.internal.s.k(paneId, "paneId");
                    k8Var.setArguments(q5.d.b(jn0.x.a("workflow_pane_id", paneId)));
                    return (C4457k1) k8Var;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m8 pane) {
                super(new C0761a(l8.f47848a));
                p013kotlin.jvm.internal.s.k(pane, "pane");
                this.f48259b = pane;
            }

            @Override // com.plaid.internal.AbstractC4590z0.i
            public final m8 b() {
                return this.f48259b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f48259b, ((a) obj).f48259b);
            }

            public final int hashCode() {
                return this.f48259b.hashCode();
            }

            public final String toString() {
                return "HeadlessOAuth(pane=" + this.f48259b + ")";
            }
        }

        public i() {
            throw null;
        }

        public final wn0.l<m8, F> a() {
            return this.f48258a;
        }

        public abstract m8 b();

        public i(a.C0761a c0761a) {
            this.f48258a = c0761a;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.z0$j */
    public static final class j extends AbstractC4590z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkSuccess f48260a;

        public j(LinkSuccess success) {
            p013kotlin.jvm.internal.s.k(success, "success");
            this.f48260a = success;
        }

        public final LinkSuccess a() {
            return this.f48260a;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.z0$k */
    public static final class k extends AbstractC4590z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Y6 f48261a;

        public k(String url, String webviewFallbackId, Y6 smsAutofillType) {
            p013kotlin.jvm.internal.s.k(url, "url");
            p013kotlin.jvm.internal.s.k(webviewFallbackId, "webviewFallbackId");
            p013kotlin.jvm.internal.s.k(smsAutofillType, "smsAutofillType");
            this.f48261a = smsAutofillType;
        }

        public final Y6 a() {
            return this.f48261a;
        }
    }

    public AbstractC4590z0() {
        p013kotlin.jvm.internal.s.j(getClass().getSimpleName(), "getSimpleName(...)");
    }
}
