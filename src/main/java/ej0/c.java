package ej0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u000b\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ljava/lang/Class;", "c", "()Ljava/lang/Class;", "Lej0/a;", "b", "()Lej0/a;", "", "a", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "()Z", "webRtcWrapperExists", "webrtc_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f63019a = m.b(new wn0.a() { // from class: ej0.b
        @Override // wn0.a
        public final Object invoke() {
            return Boolean.valueOf(c.e());
        }
    });

    public static final a b() {
        Class<?> clsC = c();
        Object objNewInstance = clsC != null ? clsC.newInstance() : null;
        if (objNewInstance instanceof a) {
            return (a) objNewInstance;
        }
        return null;
    }

    private static final Class<?> c() {
        try {
            return Class.forName("com.withpersona.sdk2.inquiry.webrtc.impl.WebRtcManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final boolean d() {
        return ((Boolean) f63019a.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e() {
        return c() != null;
    }
}
