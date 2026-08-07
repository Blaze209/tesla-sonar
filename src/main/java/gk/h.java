package gk;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f69057a = new d();

    @Override // gk.v0
    public final void a(String message) {
        p013kotlin.jvm.internal.s.k(message, "message");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026 A[PHI: r5
      0x0026: PHI (r5v6 java.lang.String) = (r5v2 java.lang.String), (r5v4 java.lang.String), (r5v8 java.lang.String) binds: [B:12:0x0023, B:16:0x002c, B:19:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gk.v0
    public final void a(q0 event) {
        String message;
        String message2;
        String message3 = "Unexpected error occurred";
        p013kotlin.jvm.internal.s.k(event, "event");
        try {
            wo0.b bVar = w0.f69151a;
            bVar.getSerializersModule();
            message2 = bVar.b(q0.f69110f.b(), event);
        } catch (SerializationException e11) {
            message = e11.getMessage();
            if (message != null) {
                message3 = message;
            }
            p013kotlin.jvm.internal.s.k(message3, "message");
            message2 = null;
        } catch (IllegalArgumentException e12) {
            message = e12.getMessage();
            if (message != null) {
                message3 = message;
            }
            p013kotlin.jvm.internal.s.k(message3, "message");
            message2 = null;
        } catch (Exception e13) {
            message = e13.getMessage();
            if (message != null) {
                message3 = message;
            }
            p013kotlin.jvm.internal.s.k(message3, "message");
            message2 = null;
        }
        if (message2 != null) {
            p013kotlin.jvm.internal.s.k(message2, "message");
        }
    }
}
