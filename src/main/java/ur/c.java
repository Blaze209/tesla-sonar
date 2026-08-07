package ur;

import com.google.android.exoplayer2.u0;
import zr.h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f116510a = new a();

    class a implements c {
        a() {
        }

        @Override // ur.c
        public b a(u0 u0Var) {
            String str = u0Var.f40712l;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new vr.b();
                    case "application/x-icy":
                        return new yr.a();
                    case "application/id3":
                        return new h();
                    case "application/x-emsg":
                        return new wr.b();
                    case "application/x-scte35":
                        return new bs.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        @Override // ur.c
        public boolean b(u0 u0Var) {
            String str = u0Var.f40712l;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }

    b a(u0 u0Var);

    boolean b(u0 u0Var);
}
