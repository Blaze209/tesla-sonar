package gk;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p0 f69161d = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f69162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f69163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f69164c;

    public y0(i0 i0Var) {
        a1 a1Var = new a1();
        this.f69162a = CoroutineScopeKt.CoroutineScope(a1.a());
        this.f69163b = i0Var.a();
        this.f69164c = new u(i0Var.a(), a1Var);
    }

    @Override // gk.v0
    public final void a(String message) {
        p013kotlin.jvm.internal.s.k(message, "message");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[PHI: r10
      0x0028: PHI (r10v7 java.lang.String) = (r10v2 java.lang.String), (r10v4 java.lang.String), (r10v9 java.lang.String) binds: [B:12:0x0025, B:16:0x002e, B:19:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gk.v0
    public final void a(q0 event) {
        String message;
        String strB;
        String message2 = "Unexpected error occurred";
        p013kotlin.jvm.internal.s.k(event, "event");
        try {
            wo0.b bVar = w0.f69151a;
            bVar.getSerializersModule();
            strB = bVar.b(q0.f69110f.b(), event);
        } catch (SerializationException e11) {
            message = e11.getMessage();
            if (message != null) {
                message2 = message;
            }
            p013kotlin.jvm.internal.s.k(message2, "message");
            strB = null;
        } catch (IllegalArgumentException e12) {
            message = e12.getMessage();
            if (message != null) {
                message2 = message;
            }
            p013kotlin.jvm.internal.s.k(message2, "message");
            strB = null;
        } catch (Exception e13) {
            message = e13.getMessage();
            if (message != null) {
                message2 = message;
            }
            p013kotlin.jvm.internal.s.k(message2, "message");
            strB = null;
        }
        BuildersKt__Builders_commonKt.launch$default(this.f69162a, null, null, new t0(this, strB, null), 3, null);
    }
}
