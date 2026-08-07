package t9;

import java.util.Objects;
import p7.u;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements q.a {
    @Override // t9.q.a
    public int a(u uVar) {
        String str = uVar.f101544o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // t9.q.a
    public boolean b(u uVar) {
        String str = uVar.f101544o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // t9.q.a
    public q c(u uVar) {
        String str = uVar.f101544o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new v9.a(uVar.f101547r);
                case "application/pgs":
                    return new w9.a();
                case "application/x-mp4-vtt":
                    return new ca.a();
                case "text/vtt":
                    return new ca.g();
                case "application/x-quicktime-tx3g":
                    return new aa.a(uVar.f101547r);
                case "text/x-ssa":
                    return new x9.b(uVar.f101547r);
                case "application/vobsub":
                    return new ba.a(uVar.f101547r);
                case "application/x-subrip":
                    return new y9.a();
                case "application/ttml+xml":
                    return new z9.d();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
