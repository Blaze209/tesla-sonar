package th0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016\u0082\u0001\u0006\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lth0/z;", "", "", "Lth0/a1$b;", "g", "()Ljava/util/List;", "posesNeeded", IntegerTokenConverter.CONVERTER_KEY, "()Lth0/a1$b;", "currentPose", "b", "currentPoseOrNull", "Lth0/s0;", "h", "()Lth0/s0;", "poseConfigs", "Lth0/r0;", "j", "()Lth0/r0;", "currentPoseConfig", "", "a", "()Z", "autoCaptureSupported", "c", "isFlashEnabled", "Lth0/a0;", "Lth0/x1$c;", "Lth0/x1$k;", "Lth0/x1$m;", "Lth0/x1$o;", "Lth0/x1$p;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface z {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public static a1.b a(z zVar) {
            return (a1.b) p013kotlin.collections.v.o0(zVar.g());
        }

        public static PoseConfig b(z zVar) {
            a1.b bVarB = zVar.b();
            return bVarB == null ? PoseConfig.INSTANCE.a() : zVar.h().a(bVarB);
        }

        public static a1.b c(z zVar) {
            return (a1.b) p013kotlin.collections.v.q0(zVar.g());
        }
    }

    boolean a();

    a1.b b();

    boolean c();

    List<a1.b> g();

    PoseConfigs h();

    a1.b i();

    PoseConfig j();
}
