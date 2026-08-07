package k8;

import k9.h;
import p7.u;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f85317a = new C1811a();

    /* JADX INFO: renamed from: k8.a$a, reason: collision with other inner class name */
    class C1811a implements a {
        C1811a() {
        }

        @Override // k8.a
        public f9.a a(u uVar) {
            String str = uVar.f101544o;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new g9.b();
                    case "application/x-icy":
                        return new j9.a();
                    case "application/id3":
                        return new h();
                    case "application/x-emsg":
                        return new h9.b();
                    case "application/x-scte35":
                        return new m9.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        @Override // k8.a
        public boolean b(u uVar) {
            String str = uVar.f101544o;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }

    f9.a a(u uVar);

    boolean b(u uVar);
}
