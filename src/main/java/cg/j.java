package cg;

import ch.qos.logback.core.CoreConstants;
import tf.y;

/* JADX INFO: loaded from: classes3.dex */
public class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f19267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19268c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a forId(int i11) {
            if (i11 == 1) {
                return MERGE;
            }
            if (i11 == 2) {
                return ADD;
            }
            if (i11 == 3) {
                return SUBTRACT;
            }
            if (i11 != 4) {
                return i11 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public j(String str, a aVar, boolean z11) {
        this.f19266a = str;
        this.f19267b = aVar;
        this.f19268c = z11;
    }

    @Override // cg.c
    public vf.c a(com.airbnb.lottie.p pVar, tf.i iVar, dg.b bVar) {
        if (pVar.l0(y.MergePathsApi19)) {
            return new vf.l(this);
        }
        hg.e.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.f19267b;
    }

    public String c() {
        return this.f19266a;
    }

    public boolean d() {
        return this.f19268c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f19267b + CoreConstants.CURLY_RIGHT;
    }
}
