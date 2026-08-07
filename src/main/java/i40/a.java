package i40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import j40.FinancialConnectionsEvent;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J/\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Li40/a;", "", "<init>", "()V", "Lj40/j;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lj40/j;)V", "a", "Lj40/i$c;", "name", "Lj40/i$b;", OrcaKeys.METADATA, "Ljn0/s;", "b", "(Lj40/i$c;Lj40/i$b;)Ljava/lang/Object;", "Lj40/j;", "eventListener", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static j40.j eventListener;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f75822a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f75824c = 8;

    private a() {
    }

    public static final synchronized void a() {
        eventListener = null;
    }

    public static /* synthetic */ Object c(a aVar, FinancialConnectionsEvent.c cVar, FinancialConnectionsEvent.Metadata metadata, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            metadata = new FinancialConnectionsEvent.Metadata(null, null, null, 7, null);
        }
        return aVar.b(cVar, metadata);
    }

    public static final synchronized void d(j40.j listener) {
        s.k(listener, "listener");
        eventListener = listener;
    }

    public final Object b(FinancialConnectionsEvent.c name, FinancialConnectionsEvent.Metadata metadata) {
        h0 h0Var;
        s.k(name, "name");
        s.k(metadata, "metadata");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            j40.j jVar = eventListener;
            if (jVar != null) {
                jVar.a(new FinancialConnectionsEvent(name, metadata));
                h0Var = h0.f84049a;
            } else {
                h0Var = null;
            }
            return jn0.s.b(h0Var);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            return jn0.s.b(t.a(th2));
        }
    }
}
