package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.DeviceMetadata;
import java.io.File;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3489kw {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kw$a */
    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.p {
        a(Object obj) {
            super(2, obj, Dt.class, "downloadDocumentToSign", "downloadDocumentToSign(Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/orca/qes/internal/di/Endpoint;", 0);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2911Ne invoke(String p11, String p12) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            p013kotlin.jvm.internal.s.k(p12, "p1");
            return ((Dt) this.receiver).a(p11, p12);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kw$b */
    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l {
        b(Object obj) {
            super(1, obj, Dt.class, "resendOtp", "resendOtp(Ljava/lang/String;)Lcom/fourthline/orca/qes/internal/di/Endpoint;", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2911Ne invoke(String p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            return ((Dt) this.receiver).e(p11);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kw$c */
    /* synthetic */ class c extends p013kotlin.jvm.internal.p implements wn0.l {
        c(Object obj) {
            super(1, obj, Dt.class, "getDetails", "getDetails(Ljava/lang/String;)Lcom/fourthline/orca/qes/internal/di/Endpoint;", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2911Ne invoke(String p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            return ((Dt) this.receiver).a(p11);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kw$d */
    /* synthetic */ class d extends p013kotlin.jvm.internal.p implements wn0.l {
        d(Object obj) {
            super(1, obj, Dt.class, "startSignature", "startSignature(Ljava/lang/String;)Lcom/fourthline/orca/qes/internal/di/Endpoint;", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2911Ne invoke(String p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            return ((Dt) this.receiver).f(p11);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kw$e */
    /* synthetic */ class e extends p013kotlin.jvm.internal.p implements wn0.l {
        e(Object obj) {
            super(1, obj, Dt.class, "uploadSelfie", "uploadSelfie(Ljava/lang/String;)Lcom/fourthline/orca/qes/internal/di/Endpoint;", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2911Ne invoke(String p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            return ((Dt) this.receiver).d(p11);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kw$f */
    /* synthetic */ class f extends p013kotlin.jvm.internal.p implements wn0.l {
        f(Object obj) {
            super(1, obj, Dt.class, "authorize", "authorize(Ljava/lang/String;)Lcom/fourthline/orca/qes/internal/di/Endpoint;", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2911Ne invoke(String p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            return ((Dt) this.receiver).b(p11);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kw$g */
    /* synthetic */ class g extends p013kotlin.jvm.internal.p implements wn0.l {
        g(Object obj) {
            super(1, obj, Dt.class, "confirm", "confirm(Ljava/lang/String;)Lcom/fourthline/orca/qes/internal/di/Endpoint;", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2911Ne invoke(String p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            return ((Dt) this.receiver).c(p11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceMetadata a(DeviceMetadata deviceMetadata) {
        return deviceMetadata;
    }

    public final InterfaceC3233ew c(Dt qesEndpoints, Gl networkService, InterfaceC3617nv confirmStatusWorker) {
        p013kotlin.jvm.internal.s.k(qesEndpoints, "qesEndpoints");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        p013kotlin.jvm.internal.s.k(confirmStatusWorker, "confirmStatusWorker");
        return new C3190dw(new Al(new g(qesEndpoints), networkService), confirmStatusWorker);
    }

    public final Dt a() {
        return new C3167dE();
    }

    public final InterfaceC3746qv b(Dt qesEndpoints, Gl networkService) {
        p013kotlin.jvm.internal.s.k(qesEndpoints, "qesEndpoints");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        return new C3864tl(new c(qesEndpoints), networkService);
    }

    public final Vu a(InterfaceC3852tF workflowStatusWorker) {
        p013kotlin.jvm.internal.s.k(workflowStatusWorker, "workflowStatusWorker");
        return new C3382iF(workflowStatusWorker);
    }

    public final InterfaceC3617nv a(Vu getSignatureStatusWorker) {
        p013kotlin.jvm.internal.s.k(getSignatureStatusWorker, "getSignatureStatusWorker");
        return new C3778rl(getSignatureStatusWorker, 0L, null, 6, null);
    }

    public final Tv a(Dt qesEndpoints, final DeviceMetadata deviceMetadata, Gl networkService) {
        p013kotlin.jvm.internal.s.k(qesEndpoints, "qesEndpoints");
        p013kotlin.jvm.internal.s.k(deviceMetadata, "deviceMetadata");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        return new C3951vl(new d(qesEndpoints), networkService, new wn0.a() { // from class: com.fourthline.orca.internal.j61
            @Override // wn0.a
            public final Object invoke() {
                return C3489kw.a(deviceMetadata);
            }
        });
    }

    public final InterfaceC3106bw b(Dt qesEndpoints, Gl networkService, InterfaceC3617nv pollStatusWorker) {
        p013kotlin.jvm.internal.s.k(qesEndpoints, "qesEndpoints");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        p013kotlin.jvm.internal.s.k(pollStatusWorker, "pollStatusWorker");
        return new C3063aw(new C4080yl(new f(qesEndpoints), networkService), pollStatusWorker);
    }

    public final Uv a(Tv startSignatureRequestWorker, InterfaceC3617nv pollStatusWorker) {
        p013kotlin.jvm.internal.s.k(startSignatureRequestWorker, "startSignatureRequestWorker");
        p013kotlin.jvm.internal.s.k(pollStatusWorker, "pollStatusWorker");
        return new C3601nf(startSignatureRequestWorker, pollStatusWorker);
    }

    public final InterfaceC3703pv a(Dt qesEndpoints, Gl networkService) {
        p013kotlin.jvm.internal.s.k(qesEndpoints, "qesEndpoints");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        return new C3821sl(new b(qesEndpoints), networkService);
    }

    public final InterfaceC3901uf b(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return new Ii(a(context));
    }

    public final At a(Gl networkService, InterfaceC3901uf fileWriter) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        p013kotlin.jvm.internal.s.k(fileWriter, "fileWriter");
        return new C3693pl(networkService, fileWriter);
    }

    public final Bt a(Dt qesEndpoints, Gl networkService, InterfaceC3901uf fileWriter) {
        p013kotlin.jvm.internal.s.k(qesEndpoints, "qesEndpoints");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        p013kotlin.jvm.internal.s.k(fileWriter, "fileWriter");
        return new C3736ql(new a(qesEndpoints), networkService, fileWriter);
    }

    public final InterfaceC3788rv a(InterfaceC3746qv qesRetrieveSigningDetailsRequestWorker, At qesDownloadLegalDocumentWorker, Bt qesDownloadSignDocumentWorker) {
        p013kotlin.jvm.internal.s.k(qesRetrieveSigningDetailsRequestWorker, "qesRetrieveSigningDetailsRequestWorker");
        p013kotlin.jvm.internal.s.k(qesDownloadLegalDocumentWorker, "qesDownloadLegalDocumentWorker");
        p013kotlin.jvm.internal.s.k(qesDownloadSignDocumentWorker, "qesDownloadSignDocumentWorker");
        return new C3558mf(qesRetrieveSigningDetailsRequestWorker, qesDownloadLegalDocumentWorker, qesDownloadSignDocumentWorker);
    }

    public final Zv a(Dt qesEndpoints, Gl networkService, InterfaceC3617nv pollStatusWorker) {
        p013kotlin.jvm.internal.s.k(qesEndpoints, "qesEndpoints");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        p013kotlin.jvm.internal.s.k(pollStatusWorker, "pollStatusWorker");
        return new C3276fw(new C4037xl(new e(qesEndpoints), networkService), pollStatusWorker);
    }

    public final File a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        File dir = context.getDir("fourthline_qes", 0);
        p013kotlin.jvm.internal.s.j(dir, "getDir(...)");
        return dir;
    }
}
