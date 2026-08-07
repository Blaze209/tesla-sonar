package q8;

import java.util.Objects;
import p7.u;
import t9.k;
import t9.q;

/* JADX INFO: loaded from: classes3.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f104895a = new a();

    class a implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t9.g f104896b = new t9.g();

        a() {
        }

        @Override // q8.g
        public k a(u uVar) {
            String str = uVar.f101544o;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new u9.a(str, uVar.L, 16000L);
                    case "application/cea-708":
                        return new u9.c(uVar.L, uVar.f101547r);
                }
            }
            if (!this.f104896b.b(uVar)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            q qVarC = this.f104896b.c(uVar);
            return new b(qVarC.getClass().getSimpleName() + "Decoder", qVarC);
        }

        @Override // q8.g
        public boolean b(u uVar) {
            String str = uVar.f101544o;
            return this.f104896b.b(uVar) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }
    }

    k a(u uVar);

    boolean b(u uVar);
}
