package gs;

import com.google.android.exoplayer2.u0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f69523a = new a();

    class a implements k {
        a() {
        }

        @Override // gs.k
        public j a(u0 u0Var) {
            String str = u0Var.f40712l;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new is.a(u0Var.f40714n);
                    case "application/pgs":
                        return new js.a();
                    case "application/x-mp4-vtt":
                        return new ps.a();
                    case "text/vtt":
                        return new ps.h();
                    case "application/x-quicktime-tx3g":
                        return new os.a(u0Var.f40714n);
                    case "text/x-ssa":
                        return new ls.a(u0Var.f40714n);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new hs.a(str, u0Var.D, 16000L);
                    case "text/x-exoplayer-cues":
                        return new g();
                    case "application/cea-708":
                        return new hs.c(u0Var.D, u0Var.f40714n);
                    case "application/x-subrip":
                        return new ms.a();
                    case "application/ttml+xml":
                        return new ns.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        @Override // gs.k
        public boolean b(u0 u0Var) {
            String str = u0Var.f40712l;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }
    }

    j a(u0 u0Var);

    boolean b(u0 u0Var);
}
