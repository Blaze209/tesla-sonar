package vw;

import androidx.datastore.core.CorruptionException;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lvw/f0;", "Lu6/d0;", "Lvw/e0;", "Lvw/n0;", "sessionGenerator", "<init>", "(Lvw/n0;)V", "Ljava/io/InputStream;", "input", "b", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lvw/e0;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lvw/n0;", "c", "()Lvw/e0;", "defaultValue", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f0 implements u6.d0<SessionData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n0 sessionGenerator;

    public f0(n0 sessionGenerator) {
        p013kotlin.jvm.internal.s.k(sessionGenerator, "sessionGenerator");
        this.sessionGenerator = sessionGenerator;
    }

    @Override // u6.d0
    public Object b(InputStream inputStream, Continuation<? super SessionData> continuation) throws CorruptionException {
        try {
            wo0.b.Companion companion = wo0.b.INSTANCE;
            String strG = p013kotlin.text.t.G(sn0.a.c(inputStream));
            companion.getSerializersModule();
            return (SessionData) companion.d(SessionData.INSTANCE.serializer(), strG);
        } catch (Exception e11) {
            throw new CorruptionException("Cannot parse session data", e11);
        }
    }

    @Override // u6.d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SessionData getDefaultValue() {
        return new SessionData(this.sessionGenerator.a(null), (Time) null, (Map) null, 6, (DefaultConstructorMarker) null);
    }

    @Override // u6.d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object a(SessionData sessionData, OutputStream outputStream, Continuation<? super jn0.h0> continuation) throws IOException {
        outputStream.write(p013kotlin.text.t.J(wo0.b.INSTANCE.b(SessionData.INSTANCE.serializer(), sessionData)));
        return jn0.h0.f84049a;
    }
}
