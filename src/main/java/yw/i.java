package yw;

import androidx.datastore.core.CorruptionException;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.text.t;
import u6.d0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lyw/i;", "Lu6/d0;", "Lyw/h;", "<init>", "()V", "Ljava/io/InputStream;", "input", "b", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lyw/h;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyw/h;", "c", "()Lyw/h;", "defaultValue", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i implements d0<SessionConfigs> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f125930a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final SessionConfigs defaultValue = new SessionConfigs(null, null, null, null, null);

    private i() {
    }

    @Override // u6.d0
    public Object b(InputStream inputStream, Continuation<? super SessionConfigs> continuation) throws CorruptionException {
        try {
            wo0.b.Companion companion = wo0.b.INSTANCE;
            String strG = t.G(sn0.a.c(inputStream));
            companion.getSerializersModule();
            return (SessionConfigs) companion.d(SessionConfigs.INSTANCE.serializer(), strG);
        } catch (Exception e11) {
            throw new CorruptionException("Cannot parse session configs", e11);
        }
    }

    @Override // u6.d0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SessionConfigs getDefaultValue() {
        return defaultValue;
    }

    @Override // u6.d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object a(SessionConfigs sessionConfigs, OutputStream outputStream, Continuation<? super h0> continuation) throws IOException {
        outputStream.write(t.J(wo0.b.INSTANCE.b(SessionConfigs.INSTANCE.serializer(), sessionConfigs)));
        return h0.f84049a;
    }
}
